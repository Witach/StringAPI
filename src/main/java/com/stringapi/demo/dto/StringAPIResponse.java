package com.stringapi.demo.dto;

import lombok.Data;

@Data
public class StringAPIResponse {
    String content;
    Long length;
    Long numberOfLetters;
    Long numberOfCapitalLetters;
    Long numberOfLowerCaseLetters;
    Long numberOfDigits;
    Long numberOfSpecialCharacters;
    Long occurrenceOfCombination;
}
