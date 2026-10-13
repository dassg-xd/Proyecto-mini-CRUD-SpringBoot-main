package com.daniel.tareas.services;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.daniel.tareas.model.Tarea;

@Service
public class TareaService {
    private List<Tarea> tareas = new ArrayList<>();
    private Long nextId = 1L;

    public List<Tarea> getAllTareas(){
        return tareas;
    }

    public Tarea crearTarea(Tarea tarea){
        tarea.setId(nextId++);
        tareas.add(tarea);
        return tarea;
    }
    public Tarea actualizarTarea(Tarea tareaActualizada){
        for(int i=0; i < tareas.size(); i++){
            if(tareas.get(i).getId().equals(tareaActualizada.getId())){
                tareas.set(i, tareaActualizada);
                return tareaActualizada;
            }
        }
        return null;
    }

    public Tarea eliminarTarea(Long id){
        tareas.removeIf(tarea -> tarea.getId().equals(id));
        return null;
    }
}
