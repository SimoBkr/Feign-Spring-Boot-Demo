package com.simobkr.springbootfeignclient.controller;


import com.simobkr.springbootfeignclient.dtos.SymptomFilter;
import com.simobkr.springbootfeignclient.services.SymptomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/symptomChecker")
@RequiredArgsConstructor
public class SymptomController {

    private final SymptomService symptomService;

    @PostMapping(value = "/filter")
    public ResponseEntity<ResponseEntity<String>> getDashFilteredData(@RequestBody SymptomFilter filter) {
        return ResponseEntity.ok(symptomService.symptomFilter(filter));
    }
}
