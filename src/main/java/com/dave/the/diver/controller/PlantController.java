package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PlantController {

    private final PlantService plantService;


    @GetMapping(path = Path.PLANT, produces = "application/json")
    public Result getPlantList() {
        Result result = new Result();

        try {
            result.setSuccessResult(plantService.getPlantList());
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @GetMapping(path = Path.PLANT_DETAIL, produces = "application/json")
    public Result getPlantDetail(
        @PathVariable(value = "id") String plantId
    ) {
        Result result = new Result();

        try {
            result.setSuccessResult(plantService.getPlantDetail(plantId));
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
