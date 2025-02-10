package Produto.ProdutoAPI.repositories;

import Produto.ProdutoAPI.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}