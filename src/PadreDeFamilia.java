/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */
public class PadreDeFamilia {
    String nombre;
    String apellido;
    int cedula;
    public PadreDeFamilia(){
        
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return  "Nombre del padre de familia encargado: " + nombre + ", Apellido: " 
       + apellido + ", cedula: " + cedula+".";
    }
    public void info1(){
        System.out.println(toString());
    }
    
}