package com.Second.SpringBoot_2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/info")
public class Controller2 {

    
    @Operation(summary = "the name of the author", description = "gg")
    @ApiResponse(responseCode = "200", description = "the name of the author is returned successfully")
    @ApiResponse(responseCode = "400", description = "the name of the author is not found")
    @GetMapping("/name")
    public String getName() {

        return "Mahmoud";
    }

    @RequestMapping("*")
    public ResponseEntity<String> handleNotFound() {
        return ResponseEntity.notFound().build();
    }
}
