package io.github.dbstarll.account.boot.controller;

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
class LogoutControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void logout() {
        final ResponseEntity<Object> res = restTemplate.postForEntity("/logout", null, Object.class);
        assertEquals(200, res.getStatusCodeValue());
        assertEquals(MediaType.APPLICATION_JSON, res.getHeaders().getContentType());
        assertNotNull(res.getBody());
        System.out.println(res.getBody());
    }
}