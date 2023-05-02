package com.entity;

import jakarta.persistence.*;


@Table
@Entity
public class Student10 {
    @Id
    int id;
    String name;
    String city;
    String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cid")
    Course10 a;



    public Student10() {
    }

    public Student10(int id, String name, String city, String email, Course10 a) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
        this.a = a;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course10 getA() {
        return a;
    }

    public void setA(Course10 a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", a=" + a +
                '}';
    }
}
