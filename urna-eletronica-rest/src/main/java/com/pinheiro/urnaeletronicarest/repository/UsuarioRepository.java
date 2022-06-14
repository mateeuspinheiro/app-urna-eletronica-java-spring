package com.pinheiro.urnaeletronicarest.repository;

import com.pinheiro.urnaeletronicarest.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
