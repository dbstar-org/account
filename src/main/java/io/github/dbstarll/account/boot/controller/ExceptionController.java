package io.github.dbstarll.account.boot.controller;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@ControllerAdvice
class ExceptionController {
    @ExceptionHandler(BindException.class)
    List<FieldError> bindExceptionHandler(final BindException e, final HttpServletResponse resp) {
        resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return e.getBindingResult().getFieldErrors();
    }
}
