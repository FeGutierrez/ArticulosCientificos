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
public class Academia {
    
    private String nombre;
    private ArrayList<Docente> docentes = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private ArrayList<Evaluacion> evaluaciones = new ArrayList<>();

    public Academia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    
    public boolean crearDocente(String nombre, String apellido, String password){
        Docente docente = new Docente(nombre, apellido, password);
        docente.setId(this.docentes.size());
        this.docentes.add(docente);
        
        return true;
    }
    
    public boolean crearArticulo(String titulo, String resumen, String contenido){
        Articulo articulo = new Articulo(titulo, resumen, contenido);
        articulo.setCodigo(this.articulos.size());
        this.articulos.add(articulo);
        
        return true;
    }
    
    public boolean crearEvaluacion(Docente docente, Articulo articulo, int calificacion, String resumen, String comentarios, String password){
        if(docente.getPassword().equals(password)){
            Evaluacion evaluacion = new Evaluacion(docente, articulo, calificacion, resumen, comentarios);
            evaluacion.setId(this.evaluaciones.size());
            docente.getArticulosCalificadosPorElDocente().add(articulo);
            articulo.getDocentesQueHanCalificado().add(docente);
            this.evaluaciones.add(evaluacion);
            return true;
        }
        return false;       
    }
    
    public double promedioNotasAsignadasporDocente(int id){
        double suma  = 0;
        int j=0;
        for (int i = 0; i < this.evaluaciones.size(); i++) {
            if (this.evaluaciones.get(i).getDocente().getId()==id) {
                suma += this.evaluaciones.get(i).getCalificacion();
                j+=1;
            }
        }
        return suma/j;
    }
    
    
    public double promedioNotasAsignadasalArticulo(int id){
        double suma = 0;
        int j=0;
        for (int i = 0; i < this.evaluaciones.size(); i++) {
            if (this.evaluaciones.get(i).getArticulo().getCodigo()==id) {
                suma += this.evaluaciones.get(i).getCalificacion();
                j+=1;
            }
        }
        return suma/j;        
    }
    
    public double promedioNotasdeTodoslosArticulos(Academia academia){
        double suma=0;
        int j=0;
        for (int i = 0; i < this.evaluaciones.size(); i++) {
            suma += this.evaluaciones.get(i).getCalificacion();
            j+=1;
        }
        return suma/j;
    }
}
