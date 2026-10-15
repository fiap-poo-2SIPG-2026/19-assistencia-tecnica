package br.fiap.assistenciatecnica.repository;

import br.fiap.assistenciatecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
