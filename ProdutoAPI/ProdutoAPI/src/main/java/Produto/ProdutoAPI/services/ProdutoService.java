package Produto.ProdutoAPI.services;

import Produto.ProdutoAPI.models.Produto;
import Produto.ProdutoAPI.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produto.setDescricao(produtoAtualizado.getDescricao());
            produto.setQtdEstoque(produtoAtualizado.getQtdEstoque());
            produto.setDsEstoque(produtoAtualizado.getDsEstoque());
            produto.setVlProduto(produtoAtualizado.getVlProduto());  // BigDecimal mantido aqui
            return produtoRepository.save(produto);
        }
        return null;
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
