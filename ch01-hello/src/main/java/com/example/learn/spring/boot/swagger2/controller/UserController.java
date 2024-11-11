package com.example.learn.spring.boot.swagger2.controller;

import com.example.learn.spring.boot.swagger2.model.User;
import com.example.learn.spring.boot.swagger2.servcie.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * io.swagger.annotations.Api#value()
 * Implicitly sets a tag for the operations, legacy support (read description).
 *
 */
@RestController
@RequestMapping("/users")
@Api(tags = {"用户", "user"})
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    @ApiOperation(value = "查询所有用户", notes = "通过service层获取所有用户")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }
}
