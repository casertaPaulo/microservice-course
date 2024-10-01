package com.caserta.proposta_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String document;
    private String phone;
    private Double income;

    @OneToOne(mappedBy = "user")
    private Proposal proposal;

}
