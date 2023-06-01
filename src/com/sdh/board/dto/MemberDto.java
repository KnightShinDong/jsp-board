package com.sdh.board.dto;

import java.sql.Timestamp;

public class MemberDto {
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberPhone;
    private String memberEmail;
    private Timestamp memberCreate;

    public MemberDto(String memberId, String memberPw, String memberName, String memberPhone, String memberEmail, Timestamp memberCreate) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberEmail = memberEmail;
        this.memberCreate = memberCreate;
    }

    public MemberDto() {
        
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public Timestamp getMemberCreate() {
        return memberCreate;
    }

    public void setMemberCreate(Timestamp memberCreate) {
        this.memberCreate = memberCreate;
    }
}
