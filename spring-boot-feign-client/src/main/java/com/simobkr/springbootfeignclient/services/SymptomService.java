package com.simobkr.springbootfeignclient.services;

import com.simobkr.springbootfeignclient.dtos.SymptomFilter;
import org.springframework.http.ResponseEntity;

public interface SymptomService {

    ResponseEntity<String> symptomFilter(SymptomFilter filter);

    //String symptomFilter();

}
