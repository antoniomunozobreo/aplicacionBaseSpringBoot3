package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Define la ruta base "/api" para todos los endpoints de este controlador
@RequestMapping("/api")
public class Controller {

    // Define un endpoint GET en la ruta "/api/endpoint1"
    @GetMapping("/endpoint1")
    public ResponseEntity<Object> getEndpoint1() {
        // Objeto JSON para el primer endpoint
        TestResponse response = new TestResponse("endpoint1", "Este es el primer endpoint!!!", 200);
        // Devuelve una respuesta HTTP 200 OK con el objeto response como cuerpo
        return ResponseEntity.ok(response);
    }

    @GetMapping("/endpoint2")
    public ResponseEntity<Object> getEndpoint2() {
        TestResponse response = new TestResponse("endpoint2", "Este el segundo endpoint!!!", 200);
        return ResponseEntity.ok(response);
    }

    // Clase record para estructurar las respuestas JSON, y los parámetros se convierten automáticamente los campos para la respuesta
    private record TestResponse(String endpoint, String message, int status) {}
}