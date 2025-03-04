package com.ejemplo.tareas.repositories;

import com.ejemplo.tareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {}
