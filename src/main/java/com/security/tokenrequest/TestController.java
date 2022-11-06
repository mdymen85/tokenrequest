package com.security.tokenrequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final Client client;

    @RequestMapping(value = "/v1/test", method = RequestMethod.GET)
    public void requestToken() {

        log.info("Response {}", client.createUser(new Object()));
    }

}
