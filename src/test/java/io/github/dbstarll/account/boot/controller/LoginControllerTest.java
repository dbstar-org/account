package io.github.dbstarll.account.boot.controller;

import io.github.dbstarll.account.boot.model.request.LoginMiniProgram;
import io.github.dbstarll.account.boot.model.request.LoginMiniProgramPhone;
import io.github.dbstarll.account.boot.model.request.LoginMobileVerifyCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class LoginControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void miniProgram() {
        final LoginMiniProgram params = new LoginMiniProgram();
        params.setAppId("appId");
        params.setCode("code");
        final ResponseEntity<Object> res = restTemplate.postForEntity("/login/mp", params, Object.class);
        assertEquals(200, res.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, res.getHeaders().getContentType());
        assertNotNull(res.getBody());
        System.out.println(res.getBody());
    }

    @Test
    void miniProgramAppIdNotSet() {
        final LoginMiniProgram params = new LoginMiniProgram();
        params.setCode("code");
        final ResponseEntity<Object> res = restTemplate.postForEntity("/login/mp", params, Object.class);
        assertEquals(400, res.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, res.getHeaders().getContentType());
        assertNotNull(res.getBody());
        System.out.println(res.getBody());
    }

    @Test
    void miniProgramPhone() {
        final LoginMiniProgramPhone params = new LoginMiniProgramPhone();
        params.setAppId("appId");
        params.setCode("code");
        params.setPhoneCode("phoneCode");
        final ResponseEntity<Object> res = restTemplate.postForEntity("/login/mpp", params, Object.class);
        assertEquals(200, res.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, res.getHeaders().getContentType());
        assertNotNull(res.getBody());
        System.out.println(res.getBody());
    }

    @Test
    void mobileVerifyCode() {
        final LoginMobileVerifyCode params = new LoginMobileVerifyCode();
        params.setMobile("mobile");
        params.setVerifyCode("verifyCode");
        final ResponseEntity<Object> res = restTemplate.postForEntity("/login/mobile", params, Object.class);
        assertEquals(200, res.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, res.getHeaders().getContentType());
        assertNotNull(res.getBody());
        System.out.println(res.getBody());
    }
}