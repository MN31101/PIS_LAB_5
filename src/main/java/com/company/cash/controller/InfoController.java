package com.company.cash.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/get-info/{loginName}")
    public ResponseEntity<?> getLogin(@PathVariable String loginName) {
        if ("is-34fiot-23-170".equals(loginName)) {
            Map<String, String> info = new HashMap<>();
            info.put("login", loginName);
            info.put("name", "Педько Микита");
            info.put("course", "2 курс");
            info.put("group", "ІС-34");
            return ResponseEntity.ok(info);
        } else {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Unknown login");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
        }
    }
}
