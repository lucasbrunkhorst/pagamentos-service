package com.lucasbrunkhorst.pagamentos.dto;

import com.lucasbrunkhorst.pagamentos.model.ItemDoPedido;
import com.lucasbrunkhorst.pagamentos.model.Status;

import java.math.BigDecimal;
import java.util.List;

public class PagamentoDTO {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;

    private List<ItemDoPedido> itens;

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemDoPedido> itens) {
        this.itens = itens;
    }

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

    public void setFormaDePagamentoId(Long formaDePagamentoId) {
        this.formaDePagamentoId = formaDePagamentoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }


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

    public Long getFormaDePagamentoId() {
        return formaDePagamentoId;
    }

    public Long getPedidoId() {
        return pedidoId;
    }


}
