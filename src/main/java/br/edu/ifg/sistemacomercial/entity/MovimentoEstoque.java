package br.edu.ifg.sistemacomercial.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movimento_estoque")
public class MovimentoEstoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produtos;

    @ManyToOne
    @JoinColumn(name = "fornecedore_id")
    private Fornecedor fornecedores;

    @Column(name = "tipo_movimento")
    private String tipoMovimento;

    @Column(name = "quantidade_recebida")
    private Integer quantidadeRecebida;
    
    @Column(name = "proco_custo")
    private Integer procoCusto;

    private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Fornecedor getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedor fornecedores) {
        this.fornecedores = fornecedores;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Integer getQuantidadeRecebida() {
        return quantidadeRecebida;
    }

    public void setQuantidadeRecebida(Integer quantidadeRecebida) {
        this.quantidadeRecebida = quantidadeRecebida;
    }

    public Integer getProcoCusto() {
        return procoCusto;
    }

    public void setProcoCusto(Integer procoCusto) {
        this.procoCusto = procoCusto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MovimentoEstoque other = (MovimentoEstoque) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
}
