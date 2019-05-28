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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fluxo_caixa")
public class FluxoCaixa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @Column(name = "tipo_movimento")
    private String tipoMovimento;
    @Column(name = "pedido_id")
    private String pedidoId;
    private Integer valor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_movimento")
    private String dataMovimento;
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta contas;
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedidos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(String dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Conta getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas = contas;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final FluxoCaixa other = (FluxoCaixa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
