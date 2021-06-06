package com.web.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web.boot.Model.Locacao;


public interface LocacaoRepository extends JpaRepository<Locacao, Long>{

}
