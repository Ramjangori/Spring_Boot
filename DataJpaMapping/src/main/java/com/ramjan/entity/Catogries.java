package com.ramjan.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Catogries {

    @Id
    private Long cid;

    private String name;

    @ManyToMany(mappedBy = "catogriesList", cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList<>();
}