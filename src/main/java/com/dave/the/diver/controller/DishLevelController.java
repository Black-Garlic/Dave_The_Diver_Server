package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.DishLevelService;
import com.dave.the.diver.vm.DishVM;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class DishLevelController {

    private final DishLevelService dishLevelService;

    /***********************************
     ** GET
     ***********************************/
    @GetMapping(path = Path.DISH_LEVEL, produces = "application/json")
    public Result getDishLevelListByProfileId(
        DishVM.DishLevelList dishVM
    ) {
        Result result = new Result();

        try {
            result.setSuccessResult(dishLevelService.getDishLevelListByProfileId(dishVM));
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    /***********************************
     ** POST
     ***********************************/
    @PostMapping(path = Path.DISH_LEVEL, produces = "application/json")
    public Result updateDishLevel(
        @RequestBody DishVM.Update dishVM
    ) {
        Result result = new Result();

        try {
            dishLevelService.updateDishLevel(dishVM);
            result.setSuccessResult(null);
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
