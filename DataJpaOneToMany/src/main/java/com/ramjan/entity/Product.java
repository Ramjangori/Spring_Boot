package com.ramjan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private int id;

    @Column
    private String name;

    @OneToMany
    @Column(name="m_id")
    private List<Model> model;
}
