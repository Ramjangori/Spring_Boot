package com.ramjan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    @Id
    private int mid;
    @Column(name = "mcode")
    private String modelcode;

    @Column(name = "model_data")
    private String modelData;
}
