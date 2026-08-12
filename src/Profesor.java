/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Profesor {
    int cedula;
    String Nombre;
    String direccion;
    String correo;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Profesor(int cedula, String Nombre, String direccion) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.direccion = direccion;
        this.correo = correo;
    }
      public Profesor() {
        this.cedula = 0;
        this.Nombre = "";
        this.direccion = "";
        this.correo = "";
    }
}
