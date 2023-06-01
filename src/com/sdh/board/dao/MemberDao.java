package com.sdh.board.dao;

import com.sdh.board.connection.ConnectionManager;
import com.sdh.board.dto.MemberDto;

import java.sql.*;

public class MemberDao {
    private static MemberDao memberDao;
    private ConnectionManager connectionManager;

    public static final int MEMBER_NONEXISTENT = 1;
    public static final int MEMBER_EXISTENT = 0;
    public static final int MEMBER_JOIN_FAILED =0;
    public static final int MEMBER_JOIN_SUCCESS =1;
    public static final int MEMBER_LOGIN_PW_NO_GOOD=0;
    public static final int MEMBER_LOGIN_SUCCESS =1;
    public static final int MEMBER_LOGIN_IS_NOT = -1;
    public static final int MEMBER_DATABASE_ERROR = 2;

    private MemberDao () {
        connectionManager = new ConnectionManager();
    }

    public static MemberDao getInstance() {
        if (memberDao == null) {
            return new MemberDao();
        }

        return memberDao;
    }

    public int memberInsert(MemberDto memberDto) {
        String query = "INSERT INTO members VALUE(?,?,?,?,?,?)";

        try (Connection conn = connectionManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, memberDto.getMemberId());
            pstmt.setString(2, memberDto.getMemberPw());
            pstmt.setString(3, memberDto.getMemberName());
            pstmt.setString(4, memberDto.getMemberPhone());
            pstmt.setString(5, memberDto.getMemberEmail());
            pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return MEMBER_JOIN_SUCCESS;
    }

    public int memberSearch(String memberId){
        int joinResult = 0;
        String query = "SELECT  memberid FROM members WHERE memberid = ?";

        try (Connection conn = connectionManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1,memberId);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                joinResult = MemberDao.MEMBER_EXISTENT;
            } else {
                joinResult = MemberDao.MEMBER_NONEXISTENT;
            }

            rs.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return joinResult;
    }

    public MemberDto memberLogin(String memberId, String memberPw){
        String query = "SELECT memberpw, membername FROM members WHERE memberid = ?";
        String dbPw;
        try (Connection conn = connectionManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);){
             pstmt.setString(1,memberId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    dbPw = rs.getString("memberpw");
                    MemberDto memberDto = new MemberDto();
                    memberDto.setMemberName(rs.getString("membername"));
                    return memberDto;
                    return dbPw.equals(memberPw) ? MEMBER_LOGIN_SUCCESS : MEMBER_LOGIN_PW_NO_GOOD;
                }

                return MEMBER_LOGIN_IS_NOT;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
