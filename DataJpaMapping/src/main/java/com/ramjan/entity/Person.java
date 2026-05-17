//package com.ramjan.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Person {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    private String name;
//    private String email;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="laptop_id")
//    private Laptop laptop;
//}
