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
public class Main {
    
    public static void main(String[] args) {
        
        Vista v = new Vista();
        
        Academia academia = new Academia("Universidad de prueba");
        
        System.out.println(academia.getNombre());
        
        academia.crearDocente("Fabian", "Giraldo", "qwerty");
        academia.crearDocente("Andres", "Gonzales", "asdfg");
        academia.crearDocente("Anthony", "Delgado", "zxcvb");
        academia.crearDocente("Oswaldo", "García", "zx84c");
        
//        for (int i = 0; i < academia.getDocentes().size(); i++) {
//            System.out.println(academia.getDocentes().get(i).getId() + "\t " + academia.getDocentes().get(i).getNombre());
//        }
//        System.out.println("\n");
        v.listarDocentesxAcademia(academia);
        
        
        
        academia.crearArticulo("Biologia básica", "Articulos biologicos", "La celula y sus componentes");
        academia.crearArticulo("Ciencias y Computación", "Estructuras lógicas", "Decisiones y anidación");
        academia.crearArticulo("Economía y política", "Inferencia de los recursos naturales en la declaración de guerras", "Revisión historica de eventos en América del Sur");
        academia.crearArticulo("Seguridad informática", "Algoritmos de cifrado", "Conceptos referentes a 'ROT13' y 'BASE64' ");
        
//        for (int i = 0; i < academia.getArticulos().size(); i++) {
//            System.out.println("Id: "+academia.getArticulos().get(i).getCodigo()+ "\t Titulo:" + academia.getArticulos().get(i).getTitulo() 
//                    + "\t Resumen: " + academia.getArticulos().get(i).getResumen() + "\t Contenidos:" + academia.getArticulos().get(i).getContenido());
//        }
//        System.out.println("\n");
        v.listarArticulosxAcademia(academia);
        
        academia.crearEvaluacion(academia.getDocentes().get(0), academia.getArticulos().get(1), 4, "Explica los conceptos referentes a las estructuras lógicas. ", 
                "Es información acertada pero no se profundiza los suficiente", "qwerty");
        
        academia.crearEvaluacion(academia.getDocentes().get(0), academia.getArticulos().get(0), 5, "La ceula y sus componentes. ", 
                "Es información acertada y se profundiza lo suficiente", "qwerty");
        
        academia.crearEvaluacion(academia.getDocentes().get(2), academia.getArticulos().get(2), 4, "Economia y politica en este articulo. ", 
                "Es información acertada pero no se profundiza los suficiente", "zxcvb");
        
        academia.crearEvaluacion(academia.getDocentes().get(2), academia.getArticulos().get(3), 5, "conceptos de cifrado ROT13 y BASE64. ", 
                "Es información acertada pero no se profundiza los suficiente", "zxcvb");
        
        System.out.println("EVALUACIONES X ID");
        v.escribirDetallesEvaluacionxID(academia,0);
        v.escribirDetallesEvaluacionxID(academia,1);
        v.escribirDetallesEvaluacionxID(academia,2);
        v.escribirDetallesEvaluacionxID(academia,3);
        System.out.println("\n");

        System.out.println("EVALUACIONES X ACADEMIA");
        v.listarEvaluacionesxAcademia(academia);
        
        v.promedioArticulo(academia, 0);
        v.promedioDocente(academia, 0);
        
        
        System.out.println("docente por id");
        v.listarDocentesxId(academia, 0);
        
        
        
    }
}
