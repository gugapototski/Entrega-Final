package Pedido.PedidoAPI.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "id_produto", nullable = false)
    private Long idProduto;

    @Column(name = "qtd_produto", nullable = false)
    private Integer qtdProduto;

    @Column(name = "vl_produto", nullable = false)
    private Double vlProduto;

    @Column(name = "ds_status")
    private String dsStatus;

    @Column(name = "dt_hora")
    private LocalDateTime dtHora;

    // Getters e Setters
    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long idPedido) { this.idPedido = idPedido; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public Long getIdProduto() { return idProduto; }
    public void setIdProduto(Long idProduto) { this.idProduto = idProduto; }

    public Integer getQtdProduto() { return qtdProduto; }
    public void setQtdProduto(Integer qtdProduto) { this.qtdProduto = qtdProduto; }

    public Double getVlProduto() { return vlProduto; }
    public void setVlProduto(Double vlProduto) { this.vlProduto = vlProduto; }

    public String getDsStatus() { return dsStatus; }
    public void setDsStatus(String dsStatus) { this.dsStatus = dsStatus; }

    public LocalDateTime getDtHora() { return dtHora; }
    public void setDtHora(LocalDateTime dtHora) { this.dtHora = dtHora; }
}