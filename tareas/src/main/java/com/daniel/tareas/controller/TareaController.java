package com.daniel.tareas.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.daniel.tareas.model.Tarea;
import com.daniel.tareas.services.TareaService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@CrossOrigin
public class TareaController{
    private final TareaService tareaService;


public TareaController(TareaService tareaService){this.tareaService = tareaService;}

    @GetMapping("/tareas")
    public List<Tarea> getTarea(){
        return tareaService.getAllTareas();
    }

    @PostMapping("/tareas")
    public Tarea newTarea(@RequestBody Tarea tarea){
        return tareaService.crearTarea(tarea);
    }

    @PutMapping("/tareas")
    public Tarea actualizarTarea(@RequestBody  Tarea tarea){
        return tareaService.actualizarTarea(tarea);
    }

    @DeleteMapping("/tareas/{id}")
    public void eliminarTarea(@PathVariable Long id){
        tareaService.eliminarTarea(id);
}
}