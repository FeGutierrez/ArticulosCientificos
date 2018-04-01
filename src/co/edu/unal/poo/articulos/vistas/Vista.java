package co.edu.unal.poo.articulos.vistas;


import co.edu.unal.poo.articulos.datos.Academia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
public class Vista {

    public Vista() {
    }
    
    public void listarDocentesxAcademia(Academia academia){
        System.out.println("DOCENTES DE LA ACADEMIA");
        for (int i = 0; i < academia.getDocentes().size(); i++) {
            System.out.println("Id: "+ academia.getDocentes().get(i).getId() + "\tNombre: " +academia.getDocentes().get(i).getNombre() + 
                    "\t Apellido: " +academia.getDocentes().get(i).getApellido());
        }
        System.out.println("\n");
        
    }
    
    public void listarDocentesxId(Academia academia, int id){
            System.out.println("Id: "+ academia.getDocentes().get(id).getId() + "\tNombre: " +academia.getDocentes().get(id).getNombre() + 
                    "\t Apellido: " +academia.getDocentes().get(id).getApellido());
        System.out.println("\n");
        
    }
    
    public void listarArticulosxAcademia(Academia academia){
        System.out.println("ARTICULOS DE LA ACADEMIA");
        for (int i = 0; i < academia.getArticulos().size(); i++) {
            System.out.println("Id: " + academia.getArticulos().get(i).getCodigo() + "\t Titulo: " +  academia.getArticulos().get(i).getTitulo()+ 
                    "\nResumen: "+ academia.getArticulos().get(i).getResumen() + "\nContenidos: " + academia.getArticulos().get(i).getResumen()+"\n");
        }
        
        System.out.println("\n");
        
    }
    
    public void listarEvaluacionesxAcademia(Academia academia){
        for (int i = 0; i < academia.getEvaluaciones().size(); i++) {
            System.out.println("Id: " +  academia.getEvaluaciones().get(i).getId() + " \t"+ academia.getEvaluaciones().get(i).getArticulo().getTitulo() +" DOCENTE QUE EVALUA: \n"+ "ID: " + academia.getEvaluaciones().get(i).getDocente().getId()+ 
                    "\tNombre: " + academia.getEvaluaciones().get(i).getDocente().getNombre()
            + "\tApellido: " + academia.getEvaluaciones().get(i).getDocente().getApellido() + "\nCalificacion: " + academia.getEvaluaciones().get(i).getCalificacion() +
                    "\tResumen: " + academia.getEvaluaciones().get(i).getResumen()+"\n");
        }
        System.out.println("\n");
        
    }
    

    public void escribirDetallesEvaluacionxID(Academia academia, int id){
        System.out.println("Id: " +  academia.getEvaluaciones().get(id).getId() + " \t"+ academia.getEvaluaciones().get(id).getArticulo().getTitulo() + " DOCENTE QUE EVALUA: \n" + "ID: " + academia.getEvaluaciones().get(id).getDocente().getId()+ 
                "\tNombre: " + academia.getEvaluaciones().get(id).getDocente().getNombre()
            + "\tApellido: " + academia.getEvaluaciones().get(id).getDocente().getApellido() + "\nCalificacion: " + academia.getEvaluaciones().get(id).getCalificacion() +
                    "\tResumen: " + academia.getEvaluaciones().get(id).getResumen()+"\n");
    }
    
    public void promedioDocente(Academia academia, int id){
        System.out.println("Promedio del docente: " + academia.getDocentes().get(id).getNombre() +" "+ academia.getDocentes().get(id).getApellido());
        System.out.println(academia.promedioNotasAsignadasporDocente(id)+"\n");
        
        
    }
    
    public void promedioArticulo(Academia academia, int id){
        System.out.println("Promedio del articulo: " + academia.getArticulos().get(id).getTitulo());
        System.out.println(academia.promedioNotasAsignadasalArticulo(id)+"\n");
    }
    
    public void promedioTodoslosArticulos(Academia academia){
        System.out.println("Promedio de todos los articulos");
        System.out.println(academia.promedioNotasdeTodoslosArticulos(academia)+"\n");
    }
    
}
