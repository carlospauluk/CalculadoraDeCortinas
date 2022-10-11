package br.com.calculadoradecortinas.calculadora.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CortinaDto {

    private Long id;

    private BigDecimal valor;


}
