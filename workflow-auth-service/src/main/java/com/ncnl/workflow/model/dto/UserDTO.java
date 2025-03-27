package com.ncnl.workflow.model.dto;

import com.ncnl.workflow.model.types.Role;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String contact;
    private String address;
    private Role role;

    public UserDTO(String firstName, String lastName, String username, String email, String contact, String address, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.role = role;
    }
}
