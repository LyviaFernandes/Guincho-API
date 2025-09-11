package Lyvia.guincho.service;

import Lyvia.guincho.model.SolicitacaoGuincho;
import Lyvia.guincho.repository.SolicitacaoGuinchoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoGuinchoService {
    private final SolicitacaoGuinchoRepository repository;

    public SolicitacaoGuinchoService(SolicitacaoGuinchoRepository repository){
        this.repository = repository;
    }

    public List<SolicitacaoGuincho> listartodos(){
        return repository.findAll();
    }

    public Optional<SolicitacaoGuincho> buscarPorId(Integer id){
        return repository.findById(id);
    }

    public SolicitacaoGuincho salvar(SolicitacaoGuincho solicitacao){
        return repository.save(solicitacao);
    }

    public void deletar(Integer id){
        repository.deleteById(id);
    }
}