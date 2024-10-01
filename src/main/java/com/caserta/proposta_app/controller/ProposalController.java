package com.caserta.proposta_app.controller;

import com.caserta.proposta_app.dto.ProposalRequestDTO;
import com.caserta.proposta_app.dto.ProposalResponseDTO;
import com.caserta.proposta_app.service.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proposal")
public class ProposalController {

    @Autowired
    private ProposalService proposalService;

    @PostMapping
    public ResponseEntity createProposal(@RequestBody ProposalRequestDTO proposalRequestDTO) {

        return ResponseEntity.ok(proposalService.createProposal(proposalRequestDTO));
    }
}
