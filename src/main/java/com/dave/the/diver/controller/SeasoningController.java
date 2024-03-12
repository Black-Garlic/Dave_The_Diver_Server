package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.SeasoningService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SeasoningController {

    private final SeasoningService seasoningService;

    @GetMapping(path = Path.SEASONING, produces = "application/json")
    public Result getSeasoningList() {
        Result result = new Result();

        try {
            result.setSuccessResult(seasoningService.getSeasoningList());
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
