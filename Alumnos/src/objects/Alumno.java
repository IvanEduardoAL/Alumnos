/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import excepciones.AdiosEscuelaException;
import java.io.Serializable;

/**
 *
 * @author aivan
 */
public class Alumno implements Serializable{
    
    private String matricula;
    private String nombre;
    private Carrera carrera;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    private Reticula reticula;
    
    public Alumno(String matricula, String nombre, Carrera carrera, Fecha fechaNacimiento){
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaNacimiento = fechaNacimiento;
        //this.fechaIngreso = fecha actual;
        this.reticula = new Reticula();
    }

    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString(){
        return getMatricula()+" "+getNombre();
    }
    
    public void asignarMateria(Materia materia) throws AdiosEscuelaException{
        reticula.agregarMateria(materia);
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Reticula getReticula() {
        return reticula;
    }

    public void setReticula(Reticula reticula) {
        this.reticula = reticula;
    }
    
    
}
