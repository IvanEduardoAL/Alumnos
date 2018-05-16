/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import excepciones.AlumnoExistenteException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import objects.Alumno;
import objects.Materia;

/**
 *
 * @author aivan
 */
public class Controlador implements Serializable{
    
    private ArrayList<Alumno> alumnos;
    
    public Controlador(){
        alumnos = new ArrayList<>();
    }
    
    public void insertarAlumno(Alumno alumno) throws AlumnoExistenteException{
        if (buscarMatricula(alumno.getMatricula())){
            throw new AlumnoExistenteException();
        }
        alumnos.add(alumno);
    }
    
    public boolean buscarMatricula(String matricula){
        int i = 0;
        while ( i < alumnos.size() ){
            Alumno a = alumnos.get(i);
            if (a.getMatricula().compareTo(matricula) == 0){
                return true;
            }
            i++;
        }
        return false; 
    }
    
    public void listarAlumnos(){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    

    
    public void guardar() throws FileNotFoundException, IOException{
        File file = new File("alumnos.dat");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(output);
        
        writer.writeObject(this);
        
        writer.close();
        output.close();
        
    }
    
}
