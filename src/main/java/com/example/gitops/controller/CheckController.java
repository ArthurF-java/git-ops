package com.example.gitops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/check")
public class CheckController {

    @GetMapping
    public ResponseEntity<HttpStatus> check() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
