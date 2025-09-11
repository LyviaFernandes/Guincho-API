package Lyvia.guincho.repository;

import Lyvia.guincho.model.SolicitacaoGuincho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoGuinchoRepository extends JpaRepository<SolicitacaoGuincho, Integer>{
}