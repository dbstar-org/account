package io.github.dbstarll.account.boot.controller;

import io.github.dbstarll.account.boot.model.request.LoginMiniProgram;
import io.github.dbstarll.account.boot.model.request.LoginMiniProgramPhone;
import io.github.dbstarll.account.boot.model.request.LoginMobileVerifyCode;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
@RequestMapping(path = "/bind",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
class BindController {
    @PostMapping("/mp")
    Object miniProgram(@Valid @RequestBody final LoginMiniProgram request) {
        System.out.println(request);
        return new HashMap<String, String>();
    }

    @PostMapping("/mpp")
    Object miniProgramPhone(@Valid @RequestBody final LoginMiniProgramPhone request) {
        System.out.println(request);
        return new HashMap<String, String>();
    }

    @PostMapping("/mobile")
    Object mobileVerifyCode(@Valid @RequestBody final LoginMobileVerifyCode request) {
        System.out.println(request);
        return new HashMap<String, String>();
    }
}
