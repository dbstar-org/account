package io.github.dbstarll.account.boot.controller;

import io.github.dbstarll.account.boot.model.request.LoginMiniProgram;
import io.github.dbstarll.account.boot.model.request.LoginMiniProgramPhone;
import io.github.dbstarll.account.boot.model.request.LoginMobileVerifyCode;
import io.github.dbstarll.account.boot.model.response.AccessTokenResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<AccessTokenResponse> miniProgram(@Valid @RequestBody final LoginMiniProgram request) {
        System.out.println(request);
        return ResponseEntity.ok(new AccessTokenResponse(UUID.randomUUID().toString()));
    }

    @PostMapping("/mpp")
    ResponseEntity<AccessTokenResponse> miniProgramPhone(@Valid @RequestBody final LoginMiniProgramPhone request) {
        System.out.println(request);
        return ResponseEntity.ok(new AccessTokenResponse(UUID.randomUUID().toString()));
    }

    @PostMapping("/mobile")
    ResponseEntity<AccessTokenResponse> mobileVerifyCode(@Valid @RequestBody final LoginMobileVerifyCode request) {
        System.out.println(request);
        return ResponseEntity.ok(new AccessTokenResponse(UUID.randomUUID().toString()));
    }
}
