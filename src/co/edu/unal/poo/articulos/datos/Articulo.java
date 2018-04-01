package co.edu.unal.poo.articulos.datos;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Articulo {
    private int codigo;
    private String titulo;
    private String resumen;
    private String contenido;
    private ArrayList<Docente> docentesQueHanCalificado = new ArrayList<>();

    public Articulo(String titulo, String resumen, String contenido) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Docente> getDocentesQueHanCalificado() {
        return docentesQueHanCalificado;
    }

    public void setDocentesQueHanCalificado(ArrayList<Docente> docentesQueHanCalificado) {
        this.docentesQueHanCalificado = docentesQueHanCalificado;
    }
    
    
    
    
    
}
