package com.niles.userapi.repository;

import com.niles.userapi.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByCpf(String cpf);

    List<Users> findQueryByName(String name);
}
