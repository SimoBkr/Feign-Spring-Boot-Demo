package com.simobkr.springbootfeignclient.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
public class SymptomFilter {

    private String age;

    private String chron;

    private String gender;

    private String hopi;

    private String listtest;

    private String mainsymp;

    private String meds;

    private String soci;
}
