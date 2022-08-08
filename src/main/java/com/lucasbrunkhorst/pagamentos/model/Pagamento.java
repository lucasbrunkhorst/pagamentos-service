package com.lucasbrunkhorst.pagamentos.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    private BigDecimal valor;


    @Size(max = 100)
    private String nome;


    @Size(max = 19)
    private String numero;


    @Size(max = 7)
    private String expiracao;


    @Size(min = 3, max = 3)
    private String codigo;

    public Long getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getExpiracao() {
        return expiracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public Status getStatus() {
        return status;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public Long getFormaDePagamentoId() {
        return formaDePagamentoId;
    }

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    private Long pedidoId;
    @NotNull
    private Long formaDePagamentoId;

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setExpiracao(String expiracao) {
        this.expiracao = expiracao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setFormaDePagamentoId(Long formaDePagamentoId) {
        this.formaDePagamentoId = formaDePagamentoId;
    }


}
