package Pedido.PedidoAPI.repositories;

import Pedido.PedidoAPI.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}