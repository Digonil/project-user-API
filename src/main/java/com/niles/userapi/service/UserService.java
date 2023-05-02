package com.niles.userapi.service;

import com.niles.userapi.domain.CreateUserDTO;
import com.niles.userapi.domain.SearchUserDTO;
import com.niles.userapi.domain.Users;
import com.niles.userapi.repository.UsersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UsersRepository usersRepository;


    public Users createUser(CreateUserDTO userDTO) {
        var user = new Users(userDTO);
        return usersRepository.save(user);
    }

    public List<SearchUserDTO> getAll() {
        List<Users> usersList = usersRepository.findAll();
        return usersList.stream().map(SearchUserDTO::new).collect(Collectors.toList());
    }

    public SearchUserDTO findByCpf(String cpf) {
        Users usersList = usersRepository.findByCpf(cpf);
        if (usersList != null) {
            return new SearchUserDTO(usersList);
        }
        return null;
    }

    public SearchUserDTO findById(Long userId) {
        Optional<Users> usersList = usersRepository.findById(userId);
        if (usersList != null) {
            return new SearchUserDTO(usersList.get());
        }
        return null;
    }
    public List<SearchUserDTO> queryByName(String name) {
        List<Users> usersList = usersRepository.findQueryByName(name);
        return usersList.stream().map(SearchUserDTO::new).collect(Collectors.toList());
    }

    public void deleteUser(Long userId) {
        Optional<Users> user = usersRepository.findById(userId);

        if (user.isPresent()) {
            usersRepository.delete(user.get());
        }
    }


}
