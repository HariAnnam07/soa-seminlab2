package com.example.tourist;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TouristController {
 @Value("${local.server.port}") private int port;
 @GetMapping("/tourists")
 public String getTourists() { return "Tourist Service is running on port " + port; }
}
