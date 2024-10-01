package com.caserta.proposta_app.repository;

import com.caserta.proposta_app.entity.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {
}
