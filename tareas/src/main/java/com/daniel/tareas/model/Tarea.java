package com.daniel.tareas.model;

public class Tarea {

    private Long id;
    private String titulo;
    private boolean completada;

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean isCompletada() { return completada; }

    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}