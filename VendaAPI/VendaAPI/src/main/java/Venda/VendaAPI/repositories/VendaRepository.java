package Venda.VendaAPI.repositories;

import Venda.VendaAPI.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}