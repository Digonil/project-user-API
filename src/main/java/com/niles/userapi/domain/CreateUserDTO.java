package com.niles.userapi.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CreateUserDTO(
        @NotNull
        String name,
        @NotNull
        String cpf,
        @NotNull
        String address,
        @NotNull
        @Email
        String email,
        @NotNull
        String telephone,
        @NotNull
        LocalDate registerDate) {

}
