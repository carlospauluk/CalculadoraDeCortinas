package br.com.calculadoradecortinas.calculadora.repository;

import br.com.calculadoradecortinas.calculadora.model.Cortina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CortinaRepository extends JpaRepository<Cortina, Long> {
}
