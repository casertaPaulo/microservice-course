package com.caserta.proposta_app.dto;

public record ProposalRequestDTO(
        String name,
        String lastName,
        String phone,
        String document,
        Double income,
        Double valueRequested,
        Integer paymentTerm
) {
}
