package com.github.sxpersxnic.tbz.m320.controller;

import com.github.sxpersxnic.tbz.m320.lib.seed.Seed;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sxpersxnic
 */
@RestController
@RequestMapping("/seed")
public class SeedController {
    private final Seed seed;

    public SeedController(Seed seed) {
        this.seed = seed;
    }

    @GetMapping
    public ResponseEntity<String> seed() {
        seed.seed();
        return ResponseEntity.ok().body("Seeded");
    }
}
