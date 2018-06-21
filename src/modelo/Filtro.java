/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MARIELOS
 */
public class Filtro {

    private int id;
    private String numAfiliacion;
    private String nombre;
    private String apellido;
    private String edad;
    private String profesion;
    private boolean estado;

    public Filtro() {
    }

    public Filtro(int id, String n_afp, String nombre, String apellido, String edad, String profesion, boolean estado) {
        this.id = id;
        this.numAfiliacion = n_afp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.estado = estado;
    }

    public Filtro(String n_afp, String nombre, String apellido, String edad, String profesion, boolean estado) {
        this.numAfiliacion = n_afp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.estado = estado;
    }

    public Filtro(String nombre, String apellido, String edad, String profesion, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN_afp() {
        return numAfiliacion;
    }

    public void setN_afp(String n_afp) {
        this.numAfiliacion = n_afp;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
