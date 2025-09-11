package Lyvia.guincho.controller;

import Lyvia.guincho.model.SolicitacaoGuincho;
import Lyvia.guincho.service.SolicitacaoGuinchoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/guincho")
public class SolicitacaoGuinchoController {

    private final SolicitacaoGuinchoService service;

    public SolicitacaoGuinchoController(SolicitacaoGuinchoService service) {
        this.service = service;
    }

    // Listar todos
    @GetMapping
    public List<SolicitacaoGuincho> listartodos() {
        return service.listartodos();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<SolicitacaoGuincho> buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar nova solicitação
    @PostMapping
    public ResponseEntity<SolicitacaoGuincho> criar(@RequestBody SolicitacaoGuincho solicitacao) {
        SolicitacaoGuincho salvo = service.salvar(solicitacao);
        return ResponseEntity.created(URI.create("/guincho/" + salvo.getId())).body(salvo);
    }

    // Atualizar solicitação
    @PutMapping("/{id}")
    public ResponseEntity<SolicitacaoGuincho> atualizar(@PathVariable Integer id,
                                                        @RequestBody SolicitacaoGuincho solicitacao) {
        return service.buscarPorId(id).map(existing -> {
            solicitacao.setId(existing.getId());
            return ResponseEntity.ok(service.salvar(solicitacao));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Deletar solicitação
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        return service.buscarPorId(id).map(existing -> {
            service.deletar(id);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
