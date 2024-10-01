package com.caserta.proposta_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_proposals")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double valueRequested;

    private int paymentTerm;

    private Boolean approved;

    private boolean integrated;

    private String obs;
}
