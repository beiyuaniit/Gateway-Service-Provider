package com.beiyuan.gateway.entity;

/**
 * @author: beiyuan
 * @date: 2023/5/16  21:10
 */

public class Medicine {


    private int mid;

    private String mname;


    public int getCount(){
        return 101;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                '}';
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }


}
