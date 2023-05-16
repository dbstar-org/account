package io.github.dbstarll.account.boot.controller;

import io.github.dbstarll.account.boot.model.request.LoginMiniProgram;
import io.github.dbstarll.account.boot.model.request.LoginMiniProgramWithPhone;
import io.github.dbstarll.account.boot.model.request.LoginMobileWithVerifyCode;
import io.github.dbstarll.account.boot.model.response.AccessTokenResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(path = "/login",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
class LoginController {
    @PostMapping("/mp")
    AccessTokenResponse miniProgram(@Valid @RequestBody final LoginMiniProgram request) {
        System.out.println(request);
        return new AccessTokenResponse(UUID.randomUUID().toString());
    }

    @PostMapping("/mpp")
    AccessTokenResponse miniProgramWithPhone(@Valid @RequestBody final LoginMiniProgramWithPhone request) {
        System.out.println(request);
        return new AccessTokenResponse(UUID.randomUUID().toString());
    }

    @PostMapping("/mobile")
    AccessTokenResponse mobileWithVerifyCode(@Valid @RequestBody final LoginMobileWithVerifyCode request) {
        System.out.println(request);
        return new AccessTokenResponse(UUID.randomUUID().toString());
    }
}
