package com.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Course10 {
    @Id
    int cid;
    String cname;
    int fees;

    @OneToOne(mappedBy = "a")
    Student10 s;


    public Course10() {
    }

    public Course10(int cid, String cname, int fees) {
        this.cid = cid;
        this.cname = cname;
        this.fees = fees;
    }



    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }



    /*@Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", fees=" + fees +
                ", s=" + s +
                '}';*/
    }

