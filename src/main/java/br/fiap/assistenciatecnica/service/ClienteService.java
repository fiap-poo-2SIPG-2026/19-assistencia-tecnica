package br.fiap.assistenciatecnica.service;

import br.fiap.assistenciatecnica.domain.Cliente;
import br.fiap.assistenciatecnica.mapper.ClienteMapper;
import br.fiap.assistenciatecnica.repository.ClienteRepository;
import br.fiap.assistenciatecnica.web.dto.ClienteRequest;
import br.fiap.assistenciatecnica.web.dto.ClienteResponse;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository repo;
    private final ClienteMapper mapper;

    public ClienteService(ClienteRepository repo, ClienteMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public ClienteResponse salvar(ClienteRequest dto) {
        Cliente cliente = mapper.paraEntidade(dto);
        Cliente aux = repo.save(cliente);
        return mapper.paraResposta(cliente);
    }

}
