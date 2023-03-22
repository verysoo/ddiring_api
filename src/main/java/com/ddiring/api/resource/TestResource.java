package com.ddiring.api.resource;

import com.ddiring.api.service.common.CommonResult;
import com.ddiring.api.service.common.ResponseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/v1/test"})
@Slf4j
@RequiredArgsConstructor
public class TestResource {

    private final ResponseService responseService;

    @GetMapping
    public CommonResult testApi(){
        return responseService.getSingleResult(true);
    }
}
