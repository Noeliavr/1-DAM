package com.example.controller;
public class Cliente {
    private String cif;
    private String nombre;
    private String direccion;
    private String telefono;
    private Persona personaContacto;

    

    public Cliente() {
    }

    public Cliente(String cif, String nombre, String direccion, String telefono, Persona personaContacto) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
    }

    public String getCif() {
      return cif;
    }

    public void setCif(String cif) {
      this.cif = cif;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getDireccion() {
      return direccion;
    }

    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }

    public String getTelefono() {
      return telefono;
    }

    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }

    public Persona getPersonaContacto() {
      return personaContacto;
    }

    public void setPersonaContacto(Persona personaContacto) {
      this.personaContacto = personaContacto;
    }

    @Override
    public String toString() {
      return "Cliente [cif=" + cif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
          + ", personaContacto=" + personaContacto + "]";
    }
  }