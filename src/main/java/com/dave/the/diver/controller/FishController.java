package com.dave.the.diver.controller;

import com.dave.the.diver.constant.Path;
import com.dave.the.diver.dto.Result;
import com.dave.the.diver.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FishController {

    private final FishService fishService;

    @GetMapping(path = Path.FISH, produces = "application/json")
    public Result getFishList() {
        Result result = new Result();

        try {
            result.setSuccessResult(fishService.getFishList());
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }

    @GetMapping(path = Path.FISH_DETAIL, produces = "application/json")
    public Result getFishDetail(
        @PathVariable(value = "id") String fishId
    ) {
        Result result = new Result();

        try {
            result.setSuccessResult(fishService.getFishDetail(fishId));
        } catch (Exception e) {
            result.setFailResult(e.getMessage());
        }

        return result;
    }
}
