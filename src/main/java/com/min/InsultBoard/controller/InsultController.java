package com.min.InsultBoard.controller;

import com.min.InsultBoard.dto.CreateInsultRequest;
import com.min.InsultBoard.entity.Insult;
import com.min.InsultBoard.service.InsultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/insults")
@RequiredArgsConstructor
public class InsultController {
     private final InsultService insultService;

    @PostMapping
    public ResponseEntity<Insult> createInsult(@RequestBody CreateInsultRequest request) {
        Insult createdInsult = insultService.createInsult(request);
        return ResponseEntity.status(201).body(createdInsult);
    }
}
