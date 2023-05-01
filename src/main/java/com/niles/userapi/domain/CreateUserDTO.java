package com.niles.userapi.domain;

import java.time.LocalDate;

public record CreateUserDTO(
        String name,
        String cpf,
        String address,
        String email,
        String telephone,
        LocalDate registerDate) {
    public CreateUserDTO(Users user) {
        this(user.getName(), user.getCpf(), user.getAddress(), user.getEmail(), user.getTelephone(), user.getRegisterDate());
    }
}
