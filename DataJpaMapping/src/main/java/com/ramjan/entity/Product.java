package com.ramjan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Long pid;
    private String name;

    @ManyToMany
    private List<Catogries> catogriesList = new ArrayList<>();
}
