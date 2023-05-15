package io.github.dbstarll.account.boot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
class LogoutController {
    @PostMapping()
    Object logout() {
        return new HashMap<String, String>();
    }
}
