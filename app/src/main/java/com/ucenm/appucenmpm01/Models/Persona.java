package com.ucenm.appucenmpm01.Models;

// Esta clase representa los datos de una persona para pasarlos entre la pantalla y el controlador.
public class Persona
{
    private int id;
    private String nombres;
    private String apellidos;
    private String fechanac;
    private String direccion;
    private String telefono;
    private String correo;

    // Crea una persona sin datos iniciales; está aquí para permitir completar el modelo después.
    public Persona() {
    }

    // Crea una persona con sus datos; está aquí porque el modelo reúne la información de una persona.
    public Persona(String nombres, String apellidos, String fechanac, String direccion, String telefono, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanac = fechanac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Devuelve el dato de identificador; está aquí porque Persona guarda esa información.
    public int getId() {
        return id;
    }

    // Actualiza el dato de identificador; está aquí para modificar la información del modelo.
    public void setId(int id) {
        this.id = id;
    }

    // Devuelve el dato de nombres; está aquí porque Persona guarda esa información.
    public String getNombres() {
        return nombres;
    }

    // Actualiza el dato de nombres; está aquí para modificar la información del modelo.
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    // Devuelve el dato de apellidos; está aquí porque Persona guarda esa información.
    public String getApellidos() {
        return apellidos;
    }

    // Actualiza el dato de apellidos; está aquí para modificar la información del modelo.
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Devuelve el dato de fecha de nacimiento; está aquí porque Persona guarda esa información.
    public String getFechanac() {
        return fechanac;
    }

    // Actualiza el dato de fecha de nacimiento; está aquí para modificar la información del modelo.
    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    // Devuelve el dato de dirección; está aquí porque Persona guarda esa información.
    public String getDireccion() {
        return direccion;
    }

    // Actualiza el dato de dirección; está aquí para modificar la información del modelo.
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Devuelve el dato de teléfono; está aquí porque Persona guarda esa información.
    public String getTelefono() {
        return telefono;
    }

    // Actualiza el dato de teléfono; está aquí para modificar la información del modelo.
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Devuelve el dato de correo; está aquí porque Persona guarda esa información.
    public String getCorreo() {
        return correo;
    }

    // Actualiza el dato de correo; está aquí para modificar la información del modelo.
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
