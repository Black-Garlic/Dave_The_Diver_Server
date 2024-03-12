package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;

    @PostMapping(path = Path.DATA_FISH, produces = "application/json")
    public Result generateDefaultFishData() {
        Result result = new Result();

        try {
            dataService.generateDefaultFishData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_REGION, produces = "application/json")
    public Result generateDefaultRegionData() {
        Result result = new Result();

        try {
            dataService.generateDefaultRegionData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_TIME, produces = "application/json")
    public Result generateDefaultTimeData() {
        Result result = new Result();

        try {
            dataService.generateDefaultTimeData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_PLANT, produces = "application/json")
    public Result generateDefaultPlantData() {
        Result result = new Result();

        try {
            dataService.generateDefaultPlantData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_PLANT_SOURCE, produces = "application/json")
    public Result generateDefaultPlantSourceData() {
        Result result = new Result();

        try {
            dataService.generateDefaultPlantSourceData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_SEASONING, produces = "application/json")
    public Result generateDefaultSeasoningData() {
        Result result = new Result();

        try {
            dataService.generateDefaultSeasoningData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @PostMapping(path = Path.DATA_SEASONING_SOURCE, produces = "application/json")
    public Result generateDefaultSeasoningSourceData() {
        Result result = new Result();

        try {
            dataService.generateDefaultSeasoningSourceData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

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

    @PostMapping(path = Path.DATA_RECIPE, produces = "application/json")
    public Result generateDefaultRecipeData() {
        Result result = new Result();

        try {
            dataService.generateDefaultRecipeData();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @DeleteMapping(path = Path.DATA_DISH, produces = "application/json")
    public Result deleteDefaultDishInfo() {
        Result result = new Result();

        try {
            dataService.deleteDefaultDishInfo();
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
