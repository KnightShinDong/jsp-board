package com.sdh.board.controller;

import com.sdh.board.dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/loginOk")
public class MemberLoginController extends HttpServlet {
    public MemberLoginController() {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        memberLogin(req, resp);
    }

    private int memberLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String memberId = req.getParameter("memberId");
        String memberPw = req.getParameter("memberPw");

        MemberDao memberDao = MemberDao.getInstance();
        int loginResult = memberDao.memberLogin(memberId, memberPw);

        if (loginResult == MemberDao.MEMBER_LOGIN_SUCCESS) {
            session.setAttribute("memberId", memberId);
            session.setAttribute("memberPw", memberPw);
            req.setAttribute("message", "로그인에 성공하셨습니다.");


        } else if (loginResult == MemberDao.MEMBER_LOGIN_PW_NO_GOOD){
            req.setAttribute("message", "비밀번호가 틀립니다..");

        } else if (loginResult == MemberDao.MEMBER_LOGIN_IS_NOT){
            req.setAttribute("message" ,"아이디를 다시 확인해주세요.");

        }else {
            req.setAttribute("message" ,"죄송합니다. 현재는 접속 불가입니다.");

        }
        req.setAttribute("loginResult" , loginResult);
        req.getRequestDispatcher("/loginOk.jsp").forward(req, resp);
        return loginResult;
    }
}
