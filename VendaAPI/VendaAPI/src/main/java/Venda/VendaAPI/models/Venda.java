package Venda.VendaAPI.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_venda")
    private Long idVenda;

    @Column(name = "id_pedido", nullable = false)
    private Long idPedido;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "vl_total", nullable = false)
    private Double vlTotal;

    @Column(name = "ds_pagamento")
    private String dsPagamento;

    @Column(name = "ds_status")
    private String dsStatus;

    @Column(name = "dt_hora")
    private LocalDateTime dtHora;

    // Getters e Setters
    public Long getIdVenda() { return idVenda; }
    public void setIdVenda(Long idVenda) { this.idVenda = idVenda; }

    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long idPedido) { this.idPedido = idPedido; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public Double getVlTotal() { return vlTotal; }
    public void setVlTotal(Double vlTotal) { this.vlTotal = vlTotal; }

    public String getDsPagamento() { return dsPagamento; }
    public void setDsPagamento(String dsPagamento) { this.dsPagamento = dsPagamento; }

    public String getDsStatus() { return dsStatus; }
    public void setDsStatus(String dsStatus) { this.dsStatus = dsStatus; }

    public LocalDateTime getDtHora() { return dtHora; }
    public void setDtHora(LocalDateTime dtHora) { this.dtHora = dtHora; }
}
