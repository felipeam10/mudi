package br.com.felipe.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felipe.mvc.mudi.model.Pedido;
import br.com.felipe.mvc.mudi.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido aguardando);
}
