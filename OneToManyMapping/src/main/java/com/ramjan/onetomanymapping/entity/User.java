package com.ramjan.onetomanymapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "u_id")
    private int id;

    @Column(name = "User_name")
    private  String name;



}
