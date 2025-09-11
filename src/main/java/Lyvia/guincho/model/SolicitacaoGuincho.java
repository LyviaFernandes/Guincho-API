package Lyvia.guincho.model;

import jakarta.persistence.*;

@Entity
@Table(name = "solicitacao_guincho")
public class SolicitacaoGuincho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "placaVeiculo", nullable = false, length = 7)
    private String placaVeiculo;

    @Column(name = "nomeCliente", nullable = false, length = 100)
    private String nomeCliente;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Column(name = "endereco", nullable = false, length = 80)
    private String endereco;

    @Column(name = "cidade", nullable = false, length = 100)
    private String cidade;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
