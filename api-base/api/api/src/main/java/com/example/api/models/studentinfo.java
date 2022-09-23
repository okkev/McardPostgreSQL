package com.example.api.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@RequiredArgsConstructor
@Table(name="student", schema="ap")


public class studentinfo {
    @Id
    @Column(name="fullname")
    private String fullName;
    @Column(name="phonenum")
    private String phoneNum;
    @Column(name="emailadd")
    private String emailAdd;
    @Column(name="birthday")
    private String birthDay;
    @Column(name="homeaddress")
    private String homeAddress;






}