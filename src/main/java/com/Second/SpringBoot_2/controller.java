package com.Second.SpringBoot_2;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/home")
public class controller {
    Model model = new Model();

    @Operation(summary = "end point to get all products",
    description = "this end point will return all the products in the list")
    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<String> getAllProducts() {
        return model.getProdects();
    }

    @Operation(summary = "end point to get a single product",
        description = "use this end point if you want to get a single product"
    )
    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        return model.getProdect(id);
    }

}
