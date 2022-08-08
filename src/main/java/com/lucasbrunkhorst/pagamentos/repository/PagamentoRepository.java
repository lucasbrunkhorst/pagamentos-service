package com.lucasbrunkhorst.pagamentos.repository;

import com.lucasbrunkhorst.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
