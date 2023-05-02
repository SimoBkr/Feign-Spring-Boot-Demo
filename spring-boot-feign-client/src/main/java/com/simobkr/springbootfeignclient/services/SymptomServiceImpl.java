package com.simobkr.springbootfeignclient.services;

import com.simobkr.springbootfeignclient.client.SymptomClient;
import com.simobkr.springbootfeignclient.dtos.SymptomFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SymptomServiceImpl implements SymptomService {

    private final SymptomClient symptomClient;

    @Override
    public ResponseEntity<String> symptomFilter(SymptomFilter filter) {
        System.out.println("HELLO");
        return symptomClient.getSymptomData(filter)
                .map(result -> ResponseEntity.ok().body(result))
                .orElse(ResponseEntity.badRequest().build());
    }
}
