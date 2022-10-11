package br.com.calculadoradecortinas.calculadora.service;

import br.com.calculadoradecortinas.calculadora.dto.CortinaDto;
import br.com.calculadoradecortinas.calculadora.repository.CortinaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CortinaService {

    @Autowired
    private CortinaRepository repository;

    @Autowired
    private ModelMapper modelMapper;


    public Page<CortinaDto> findAll(Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(p -> modelMapper.map(p, CortinaDto.class));
    }


}

