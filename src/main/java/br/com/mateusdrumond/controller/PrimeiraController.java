package br.com.mateusdrumond.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametro recebido foi: " + id;
    }

    @GetMapping("/parametrosQueryParams")
    public String parametrosQueryParams(@RequestParam String id) {
        return "O parametro com QueryParams recebido foi: " + id;
    }

    @GetMapping("/parametrosQueryParams2")
    public String parametrosQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O parametro com QueryParams2 recebido foi: " + allParams.entrySet();
    }

    @PostMapping("/parametroBodyParams")
    public String parametroBodyParams(@RequestBody String id) {
        return "O parametro com BodyParams: " + id;
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity() {
        return ResponseEntity.status(400).body("Ocorreu um erro");
    }
}
