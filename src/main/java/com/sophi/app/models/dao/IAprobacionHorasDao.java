package com.sophi.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.sophi.app.models.entity.AprobacionHoras;

public interface IAprobacionHorasDao extends CrudRepository<AprobacionHoras, Long> {

    @Query("FROM AprobacionHoras Ap WHERE Ap.codProyecto = ?1")
    List<AprobacionHoras> findAprobacionHorasBycodProyecto(Long codProyecto);
    
}
