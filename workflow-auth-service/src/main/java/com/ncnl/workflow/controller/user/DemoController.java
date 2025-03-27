package com.ncnl.workflow.controller.user;

import com.ncnl.workflow.model.dto.UserDTO;
import com.ncnl.workflow.service.person.UserDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api")
@RestController
public class DemoController {

    @Autowired
    public UserDetailsServiceImp userService;

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("Hello from admin only url");
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> allUsers(){
        return ResponseEntity.ok(userService.loadAllUsers());
    }
}
