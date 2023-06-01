package com.sdh.board.dto;

public class ListSettingDto {

    private int pageNum= 1;
    private int pageAmount = 5;
    private int pagefirstNum;

//    public String getQueryString(){
//        return String.format("page=%d&pageSize-%d",pageNum,pageAmount);
//    }

    public ListSettingDto() {

    }

    public ListSettingDto(int pageNum, int pageAmount, int pagefirstNum) {
        this.pageNum = pageNum;
        this.pageAmount = pageAmount;
        this.pagefirstNum = pagefirstNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public int getPagefirstNum() {
        return pagefirstNum;
    }

    public void setPagefirstNum(int pagefirstNum) {
        this.pagefirstNum = pagefirstNum;
    }


}
