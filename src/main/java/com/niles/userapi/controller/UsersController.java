package com.niles.userapi.controller;

import com.niles.userapi.domain.CreateUserDTO;
import com.niles.userapi.domain.Users;
import com.niles.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity createUser(CreateUserDTO userDTO) {
        var user = userService.createUser(userDTO);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity getAll() {
        var user = userService.getAll();
        return ResponseEntity.ok(user);
    }

    public ResponseEntity findById(@PathVariable Long userId) {
        var user = userService.findById(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping("{/cpf}")
    public ResponseEntity findByCpf(@PathVariable String cpf) {
        var user = userService.findByCpf(cpf);
        return ResponseEntity.ok(user);
    }

    @GetMapping("{/name}")
    public ResponseEntity findQueryByName(@PathVariable String name) {
        var user = userService.findByCpf(name);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("{/userId}")
    public ResponseEntity deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }


}
