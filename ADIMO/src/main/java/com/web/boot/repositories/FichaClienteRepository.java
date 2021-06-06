package com.web.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web.boot.Model.FichaCliente;


public interface FichaClienteRepository extends JpaRepository<FichaCliente, Long>{

}
