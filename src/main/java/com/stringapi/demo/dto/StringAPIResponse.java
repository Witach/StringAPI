package com.stringapi.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StringAPIResponse {
    String content;
    Long length;
    Long numberOfLetters;
    Long numberOfCapitalLetters;
    Long numberOfLowerCaseLetters;
    Long numberOfDigits;
    Long numberOfSpecialCharacters;
}
