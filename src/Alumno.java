/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */
public class Alumno {
     String nombre;
    String apellido;
    int carne;
    
    
    public Alumno(){
    }

    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }
    
    
    public void mostrardatos(){
        System.out.println(nombre+" "+apellido+" "+ carne);
    }
    
    //metodos gets y sets

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

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    @Override
    public String toString( ) {
        return "Nombre del alumno: " + getNombre() + ", Apellido: " + getApellido() + ", Carne: " + getCarne();
    }
    
}

