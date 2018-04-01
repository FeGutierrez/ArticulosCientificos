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
public class Docente {
    private int id;
    private String nombre;
    private String apellido;
    private String password;
    private ArrayList<Articulo> articulosCalificadosPorElDocente = new ArrayList<>();
    private ArrayList<Evaluacion> evaluaciones = new ArrayList<>();
    

    public Docente(String nombre, String apellido, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Articulo> getArticulosCalificadosPorElDocente() {
        return articulosCalificadosPorElDocente;
    }

    public void setArticulosCalificadosPorElDocente(ArrayList<Articulo> articulosCalificadosPorElDocente) {
        this.articulosCalificadosPorElDocente = articulosCalificadosPorElDocente;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    
    
    
}
