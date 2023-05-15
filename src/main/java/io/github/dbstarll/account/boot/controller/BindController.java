package io.github.dbstarll.account.boot.controller;

import io.github.dbstarll.account.boot.model.request.LoginMiniProgram;
import io.github.dbstarll.account.boot.model.request.LoginMiniProgramWithPhone;
import io.github.dbstarll.account.boot.model.request.LoginMobileWithVerifyCode;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/bind",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
class BindController {
    @PostMapping("/mp")
    Object miniProgram(@RequestBody final LoginMiniProgram loginMiniProgram) {
        System.out.println(loginMiniProgram);
        return new HashMap<String, String>();
    }

    @PostMapping("/mpp")
    Object miniProgramWithPhone(@RequestBody final LoginMiniProgramWithPhone loginMiniProgramWithPhone) {
        System.out.println(loginMiniProgramWithPhone);
        return new HashMap<String, String>();
    }

    @PostMapping("/mobile")
    Object mobileWithVerifyCode(@RequestBody final LoginMobileWithVerifyCode loginMobileWithVerifyCode) {
        System.out.println(loginMobileWithVerifyCode);
        return new HashMap<String, String>();
    }
}
