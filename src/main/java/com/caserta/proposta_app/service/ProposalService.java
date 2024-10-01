package com.caserta.proposta_app.service;

import com.caserta.proposta_app.dto.ProposalRequestDTO;
import com.caserta.proposta_app.dto.ProposalResponseDTO;
import com.caserta.proposta_app.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProposalService {

    @Autowired
    private ProposalRepository proposalRepository;

    public ProposalResponseDTO createProposal(ProposalRequestDTO proposalRequestDTO) {
        return null;
    }
}
