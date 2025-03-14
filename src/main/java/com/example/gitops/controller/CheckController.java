package com.example.gitops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class CheckController {

    @GetMapping
    public ResponseEntity<String> check() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
