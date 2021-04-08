package com.sophi.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sophi.app.models.entity.Herramienta;

public interface IHerramientaDao extends CrudRepository<Herramienta, Long>{

	Herramienta findByCodRecurso(Long codRecurso);
}
