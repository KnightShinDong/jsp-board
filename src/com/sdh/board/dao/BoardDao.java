package com.sdh.board.dao;

import com.sdh.board.*;
import com.sdh.board.connection.ConnectionManager;
import com.sdh.board.dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
    private ConnectionManager connectionManager;

    public BoardDao(){
        connectionManager = new ConnectionManager();
    }

//    public ArrayList<MemberDto> boardList(){
//        ArrayList<MemberDto> bListDto = new ArrayList<MemberDto>();
//        try (Connection conn = connectionManager.getConnection();
//             PreparedStatement pstmt = conn.prepareStatement(query)){
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void boardWrite(bname, btitle, bcontent,buserid){

    }
}
