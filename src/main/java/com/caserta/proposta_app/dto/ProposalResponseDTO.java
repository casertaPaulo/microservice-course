package com.caserta.proposta_app.dto;

public record ProposalResponseDTO(
        Long id,
        String name,
        String lastName,
        String phone,
        String document,
        Double income,
        Double valueRequested,
        Integer paymentTerm,
        Boolean approved,
        String obs
) {
}
