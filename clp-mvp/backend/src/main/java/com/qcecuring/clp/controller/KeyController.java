package com.qcecuring.clp.controller;

import com.qcecuring.clp.domain.Key;
import com.qcecuring.clp.repository.KeyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/keys")
@RequiredArgsConstructor
public class KeyController {
    private final KeyRepository repo;

    @PostMapping
    public Key create(@RequestBody Key k) {
        k.setCreatedAt(new java.util.Date());
        return repo.save(k);
    }

    @GetMapping
    public List<Key> list() {
        return repo.findAll();
    }
}
