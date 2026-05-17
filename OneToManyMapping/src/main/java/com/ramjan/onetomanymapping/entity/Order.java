package com.ramjan.onetomanymapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Entity
@Data
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @Column(name="o_id")
    private int id;
    @Column(name = "Product_name")
    private String name;
    @CurrentTimestamp
    private Date order_Date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_u_id")
    private User user;


}
