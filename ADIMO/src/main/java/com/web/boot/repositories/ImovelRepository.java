package com.web.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web.boot.Model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{

}
