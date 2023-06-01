    package com.sdh.board.controller;

    import com.sdh.board.dao.MemberDao;
    import com.sdh.board.dto.MemberDto;
    import jakarta.servlet.ServletException;
    import jakarta.servlet.annotation.WebServlet;
    import jakarta.servlet.http.HttpServlet;
    import jakarta.servlet.http.HttpServletRequest;
    import jakarta.servlet.http.HttpServletResponse;

    import java.io.IOException;

    @WebServlet(value = "/joinOk")
    public class MemberJoinController extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            insertMember(req,resp);
        }

            private void insertMember(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                String memberId = req.getParameter("memberId");
                String memberPw = req.getParameter("memberPw");
                String memberName = req.getParameter("memberName");
                String memberPhone = req.getParameter("memberPhone");
                String memberEmail = req.getParameter("memberEmail");

                MemberDto memberDto = new MemberDto();
                memberDto.setMemberId(memberId);
                memberDto.setMemberPw(memberPw);
                memberDto.setMemberName(memberName);
                memberDto.setMemberPhone(memberPhone);
                memberDto.setMemberEmail(memberEmail);


                MemberDao memberDao = MemberDao.getInstance();
                int joinResult = memberDao.memberSearch(memberId);

                if (joinResult == MemberDao.MEMBER_EXISTENT){
                    req.setAttribute("message", "이미 존재하는 아이디 입니다.");
                    req.setAttribute("joinResult",joinResult);
                    req.getRequestDispatcher("/joinOk.jsp").forward(req,resp);
                }else {
                    joinResult = memberDao.memberInsert(memberDto);

                    if (joinResult == MemberDao.MEMBER_JOIN_SUCCESS) {
                        req.setAttribute("message", "회원가입에 성공하셨습니다.");
                        req.setAttribute("joinResult",joinResult);
                    } else {
                        req.setAttribute("message", "회원가입이 실패하셨습니다, 다시 시도해주세요.");
                        joinResult = MemberDao.MEMBER_JOIN_FAILED;
                        req.setAttribute("joinResult",joinResult);
                    }

                    req.getRequestDispatcher("/joinOk.jsp").forward(req, resp);
                }
            }

    }

