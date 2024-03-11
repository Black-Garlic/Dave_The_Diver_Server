package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.entity.Party;
import com.dave.the.diver.service.DishService;
import com.dave.the.diver.vm.DishVM;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DishController {

    private final DishService dishService;

    @GetMapping(path = Path.DISH_LEVEL, produces = "application/json")
    public Result getDishLevelListByProfileId(
        DishVM.DishLevelList dishVM
    ) {
        Result result = new Result();

        try {
            result.setSuccessResult(dishService.getDishLevelListByProfileId(dishVM));
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
