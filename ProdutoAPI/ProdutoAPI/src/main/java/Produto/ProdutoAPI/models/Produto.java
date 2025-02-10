package Produto.ProdutoAPI.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "qtd_estoque", nullable = false)
    private Integer qtdEstoque;

    @Column(name = "ds_estoque")
    private String dsEstoque;

    @Column(name = "vl_produto", nullable = false)
    private BigDecimal vlProduto;

    // Getters e Setters
    public Long getIdProduto() { return idProduto; }
    public void setIdProduto(Long idProduto) { this.idProduto = idProduto; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Integer getQtdEstoque() { return qtdEstoque; }
    public void setQtdEstoque(Integer qtdEstoque) { this.qtdEstoque = qtdEstoque; }

    public String getDsEstoque() { return dsEstoque; }
    public void setDsEstoque(String dsEstoque) { this.dsEstoque = dsEstoque; }

    public BigDecimal getVlProduto() { return vlProduto; }
    public void setVlProduto(BigDecimal vlProduto) { this.vlProduto = vlProduto; }
}