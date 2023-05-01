package com.niles.userapi.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"userId"})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String cpf;
    private String address;
    private String email;
    private String telephone;
    private LocalDate registerDate;

    public Users(CreateUserDTO userDTO) {
        this.name = userDTO.name();
        this.cpf = userDTO.cpf();
        this.address = userDTO.address();
        this.email = userDTO.email();
        this.telephone = userDTO.telephone();
        this.registerDate = userDTO.registerDate();
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
