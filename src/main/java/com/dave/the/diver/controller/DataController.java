package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;

    @PostMapping(path = Path.DATA_DISH, produces = "application/json")
    public Result generateDefaultDish() {
        Result result = new Result();

        try {
            dataService.generateDefaultDishData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_PARTY, produces = "application/json")
    public Result generateDefaultPartyData() {
        Result result = new Result();

        try {
            dataService.generateDefaultPartyData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_UNLOCK, produces = "application/json")
    public Result generateDefaultUnlockData() {
        Result result = new Result();

        try {
            dataService.generateDefaultUnlockData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
