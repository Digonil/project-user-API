package com.niles.userapi.domain;

import java.time.LocalDate;

public record SearchUserDTO(
        Long userId,
        String name,
        String cpf,
        String address,
        String email,
        String telephone,
        LocalDate registerDate
) {
    public SearchUserDTO(Users user) {
        this(user.getUserId(), user.getName(), user.getCpf(), user.getAddress(), user.getEmail(), user.getTelephone(), user.getRegisterDate());
    }
}
