package com.ramjan.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private long salary;
    private String Address;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
}
