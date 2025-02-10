package Pedido.PedidoAPI.services;

import Pedido.PedidoAPI.models.Pedido;
import Pedido.PedidoAPI.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido criarPedido(Pedido pedido) {
        pedido.setDtHora(java.time.LocalDateTime.now());
        pedido.setDsStatus("PENDENTE"); // Define o status inicial
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizarStatus(Long id, String novoStatus) {
        Pedido pedido = buscarPedidoPorId(id);
        if (pedido != null) {
            pedido.setDsStatus(novoStatus);
            return pedidoRepository.save(pedido);
        }
        return null;
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
