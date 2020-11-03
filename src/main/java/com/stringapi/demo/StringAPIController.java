package com.stringapi.demo;

import com.stringapi.demo.dto.StringAPIRequest;
import com.stringapi.demo.dto.StringAPIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringAPIController {
    @GetMapping
    ResponseEntity<StringAPIResponse> stringStatistics(StringAPIRequest stringAPIRequest) {
        return null;
    }
}
