package com.stringapi.demo;

import com.stringapi.demo.dto.StringAPIRequest;
import com.stringapi.demo.dto.StringAPIResponse;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class StringAPIService {

    StringAPIResponse makeStatisticsOfString(StringAPIRequest stringAPIRequest) {
        var text = stringAPIRequest.getContent();

        return StringAPIResponse.builder()
                .content(text)
                .length((long) text.length())
                .numberOfLetters(countOccurrenceOfRegex("[a-zA-Z]", text))
                .numberOfCapitalLetters(countOccurrenceOfRegex("[A-Z]", text))
                .numberOfLowerCaseLetters(countOccurrenceOfRegex("[a-z]", text))
                .numberOfDigits(countOccurrenceOfRegex("[0-9]", text))
                .numberOfSpecialCharacters(countOccurrenceOfRegex("[^A-Za-z0-9]", text))
                .build();
    }

    private Long countOccurrenceOfRegex(String regex, String text) {
        var pattern = Pattern.compile(regex);
        var matcher = pattern.matcher(text);
        return matcher.results().count();
    }


}
