package com.stringapi.demo;

import com.stringapi.demo.dto.StringAPIRequest;
import com.stringapi.demo.dto.StringAPIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StringAPIController {

    @Autowired
    StringAPIService stringAPIService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    StringAPIResponse stringStatistics(@RequestBody StringAPIRequest stringAPIRequest) {
        return stringAPIService.makeStatisticsOfString(stringAPIRequest);
    }
}
