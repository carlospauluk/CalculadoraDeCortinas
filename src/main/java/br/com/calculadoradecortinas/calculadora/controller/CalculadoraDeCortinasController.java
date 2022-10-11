package br.com.calculadoradecortinas.calculadora.controller;

import br.com.calculadoradecortinas.calculadora.dto.CortinaDto;
import br.com.calculadoradecortinas.calculadora.service.CortinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;

@RestController
@RequestMapping("/calculadoraDeCortinas")
public class CalculadoraDeCortinasController {

    @Autowired
    private CortinaService service;

    @GetMapping
    public Page<CortinaDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
        return service.findAll(paginacao);
    }


}
