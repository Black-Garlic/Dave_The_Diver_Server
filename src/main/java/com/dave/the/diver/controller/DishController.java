package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DishController {

    private final DishService dishService;

    @GetMapping(path = Path.DISH, produces = "application/json")
    public Result getDishList() {
        Result result = new Result();

        try {
            result.setSuccessResult(dishService.getDishList());
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
