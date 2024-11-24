package com.example.webpractice.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class stu {
    @JsonProperty
   private Integer Sage;

    @Override
    public String toString() {
        return "stu{" +
                "Sage=" + Sage +
                ", Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public int getSage() {
        return Sage;
    }
    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @JsonProperty private String Sno,Sname,Ssex,Sdept;}
