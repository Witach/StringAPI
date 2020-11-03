package com.stringapi.demo;

import com.stringapi.demo.dto.StringAPIRequest;
import com.stringapi.demo.dto.StringAPIResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.regex.Pattern;

@Service
public class StringAPIService {

    StringAPIResponse makeStatisticsOfString(StringAPIRequest stringAPIRequest) {
        var stringApiResponse = new StringAPIResponse();

        var text = stringAPIRequest.getContent();

        stringApiResponse.setContent(text);
        stringApiResponse.setLength((long) text.length());
        stringApiResponse.setNumberOfCapitalLetters(countOccurrenceOfRegex("[A-Z]", text));
        stringApiResponse.setNumberOfLowerCaseLetters(countOccurrenceOfRegex("[a-z]", text));
        stringApiResponse.setNumberOfLetters(countOccurrenceOfRegex("[a-zA-Z]", text));
        stringApiResponse.setNumberOfDigits(countOccurrenceOfRegex("[0-9]", text));
        stringApiResponse.setNumberOfSpecialCharacters(countOccurrenceOfRegex("[^A-Za-z0-9]", text));

        return stringApiResponse;
    }

    private Long countOccurrenceOfRegex(String regex, String text) {
        var pattern = Pattern.compile(regex);
        var matcher = pattern.matcher(text);
        return matcher.results().count();
    }


}
