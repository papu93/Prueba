package Model;

import java.util.Date;

public class Tutor extends Persona{
    private String lugarDeTrabajo;
    private String parentesco;

    public Tutor(String lugarDeTrabajo, String parentesco, Integer id, String nombre, String apellido, Date fechaDeNacimiento, String direccion, Integer telefono, String cargo, Integer dni) {
        super(nombre, apellido, fechaDeNacimiento, direccion, telefono, cargo, dni);
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.parentesco = parentesco;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    
}
