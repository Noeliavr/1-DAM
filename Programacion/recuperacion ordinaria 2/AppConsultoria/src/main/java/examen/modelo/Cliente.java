package examen.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    private String CIF;
    private String Empresa;
    private String personaContacto;
    private String correo;
    private int telefono;
    public Cliente(String cIF, String empresa, String personaContacto, String correo, int telefono) {
        this.CIF = cIF;
        this.Empresa = empresa;
        this.personaContacto = personaContacto;
        this.correo = correo;
        this.telefono = telefono;
    }
    public String getCIF() {
        return CIF;
    }
    public void setCIF(String cIF) {
        CIF = cIF;
    }
    public String getEmpresa() {
        return Empresa;
    }
    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
    public String getPersonaContacto() {
        return personaContacto;
    }
    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Cliente [CIF=" + CIF + ", Empresa=" + Empresa + ", personaContacto=" + personaContacto + ", correo="
                + correo + ", telefono=" + telefono + "]";
    }
    
}
