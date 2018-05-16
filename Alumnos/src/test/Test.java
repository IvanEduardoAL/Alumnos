/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.Controlador;
import excepciones.AdiosEscuelaException;
import excepciones.AlumnoExistenteException;
import excepciones.MateriaNoEncontradaException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import objects.Alumno;
import objects.Carrera;
import objects.Fecha;
import objects.Materia;
import objects.Reticula;
import objects.Status;

/**
 *
 * @author aivan
 */
public class Test {

    public static void main(String[] args) {
        try {
            Reticula reticula = new Reticula();

            Materia m1 = new Materia("AA", "Programacion", 1, 10, "yomero", Status.CURSANDO);
            Materia m2 = new Materia("BB", "Matematicas", 1, 8, "mora", Status.CURSANDO);
            Materia m3 = new Materia("CC", "Analisis de circuitos", 1, 10, "Pedro", Status.CURSANDO);
            Materia m4 = new Materia("DD", "Circuitos Logicos", 1, 10, "Victor", Status.CURSANDO);

            Materia m5 = new Materia("DD", "Circuitos Logicos", 1, 10, "Victor", Status.REPROBADA);
            Materia m6 = new Materia("DD", "Circuitos Logicos", 1, 10, "Victor", Status.REPROBADA);

            reticula.agregarMateria(m1);
            reticula.agregarMateria(m2);
            reticula.agregarMateria(m3);
            reticula.agregarMateria(m4);
            reticula.agregarMateria(m5);
                        reticula.agregarMateria(m6);


            Materia m = reticula.buscarMateriaCursando("DD");
            m.setStatus(Status.REPROBADA);
            
            reticula.listar();
            
            
            Alumno aros = new Alumno("AROS", "Reynaldo Aros", Carrera.ELECTRONICA, new Fecha(28,5,1998));
            
            aros.setReticula(reticula);
            
            Alumno palma = new Alumno("PALMA", "Agabus Palma Olivet", Carrera.ELECTRONICA, new Fecha(28,5,1998));
            
            Controlador controlador = new Controlador();
            controlador.insertarAlumno(aros);
            
            controlador.insertarAlumno(palma);
            
            controlador.listarAlumnos();
            
            controlador.guardar();
            
        } catch (MateriaNoEncontradaException ex) {
            System.out.println("Materia no encontrada");
        } catch (AdiosEscuelaException ex) {
            System.out.println("No se puede ingresar la materia");
        } catch (AlumnoExistenteException ex) {
            System.out.println("Alumno repetido");
        } catch (IOException ex) {
            System.out.println("Guaradar");
            ex.printStackTrace();
        }
    
  }
   

    }


