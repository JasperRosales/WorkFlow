package com.ncnl.workflow.service.person;

import com.ncnl.workflow.model.dto.UserDTO;
import com.ncnl.workflow.repository.person.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private final UserRepository repository;

    public UserDetailsServiceImp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }


    public List<UserDTO> loadAllUsers(){
        return repository.findAll().stream()
                .map(user -> new UserDTO(
                        user.getFirstName(),
                        user.getLastName(),
                        user.getUsername(),
                        user.getEmail(),
                        user.getContact(),
                        user.getAddress(),
                        user.getRole())
                ).collect(Collectors.toList());
    }

}
