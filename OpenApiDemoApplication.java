package com.example.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
        title = "OpenAPI Demo API",
        version = "1.0",
        description = "Simple REST API with OpenAPI (Swagger UI) documentation"
    ),
    tags = {
        @Tag(name = "Demo Controller", description = "Endpoints for testing OpenAPI")
    }
)
@RestController
@RequestMapping("/api")
public class OpenApiDemoApplication {

    @GetMapping("/hello")
    @Operation(summary = "Say Hello", description = "Returns a simple greeting message")
    public String hello() {
        return "Hello from OpenAPI integrated Spring Boot!";
    }

    @PostMapping("/echo")
    @Operation(summary = "Echo message", description = "Returns the same message sent by the user")
    public String echo(@RequestBody String message) {
        return "You said: " + message;
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenApiDemoApplication.class, args);
    }
}
