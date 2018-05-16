/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.Serializable;

/**
 *
 * @author aivan
 */
public class Materia implements Serializable{
    
    private String clave;
    private String nombre;
    private Integer semestre;
    private Integer creditos;
    private String profesor;
    private Status status;

    public Materia(String clave, String nombre, Integer semestre, Integer creditos, String profesor, Status status) {
        this.clave = clave;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.status = status;
    }
    
    public String toString(){
        return this.getNombre()+ " " + this.getStatus();
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
}
