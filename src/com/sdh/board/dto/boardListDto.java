package com.sdh.board.dto;

import java.sql.Timestamp;

public class boardListDto {
    private int bnum;
    private String bName;
    private String bTitle;
    private String bContent;
    private Integer bHit;
    private String bUserId;
    private Integer bReplycount;
    private Timestamp bDate;
    private Integer bfilecount;

    public boardListDto() {

    }

    public boardListDto(int bnum, String bName, String bTitle, String bContent, Integer bHit, String bUserId, Integer bReplycount, Timestamp bDate, Integer bfilecount) {
        this.bnum = bnum;
        this.bName = bName;
        this.bTitle = bTitle;
        this.bContent = bContent;
        this.bHit = bHit;
        this.bUserId = bUserId;
        this.bReplycount = bReplycount;
        this.bDate = bDate;
        this.bfilecount = bfilecount;
    }

    public int getBnum() {
        return bnum;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbTitle() {
        return bTitle;
    }

    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }

    public String getbContent() {
        return bContent;
    }

    public void setbContent(String bContent) {
        this.bContent = bContent;
    }

    public Integer getbHit() {
        return bHit;
    }

    public void setbHit(Integer bHit) {
        this.bHit = bHit;
    }

    public String getbUserId() {
        return bUserId;
    }

    public void setbUserId(String bUserId) {
        this.bUserId = bUserId;
    }

    public Integer getbReplycount() {
        return bReplycount;
    }

    public void setbReplycount(Integer bReplycount) {
        this.bReplycount = bReplycount;
    }

    public Timestamp getbDate() {
        return bDate;
    }

    public void setbDate(Timestamp bDate) {
        this.bDate = bDate;
    }

    public Integer getBfilecount() {
        return bfilecount;
    }

    public void setBfilecount(Integer bfilecount) {
        this.bfilecount = bfilecount;
    }
}
