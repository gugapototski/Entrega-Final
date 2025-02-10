package Produto.ProdutoAPI.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProdutoDTO {

    @NotBlank(message = "A descrição é obrigatória.")
    @Size(max = 255, message = "A descrição não pode ter mais de 255 caracteres.")
    private String descricao;

    @NotNull(message = "A quantidade em estoque é obrigatória.")
    @Min(value = 0, message = "A quantidade em estoque não pode ser negativa.")
    private Integer qtdEstoque;

    @NotBlank(message = "A descrição do estoque é obrigatória.")
    private String dsEstoque;

    @NotNull(message = "O valor do produto é obrigatório.")
    @Min(value = 0, message = "O valor do produto não pode ser negativo.")
    private BigDecimal vlProduto;

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getDsEstoque() {
        return dsEstoque;
    }

    public void setDsEstoque(String dsEstoque) {
        this.dsEstoque = dsEstoque;
    }

    public BigDecimal getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(BigDecimal vlProduto) {
        this.vlProduto = vlProduto;
    }
}
