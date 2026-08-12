/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fguev
 */
public class Matricula {
   private String Nombre; 
   private int Cedula;
   private String carrera; 

    public Matricula() {
    }

    public Matricula(String Nombre, int Cedula, String carrera) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
   
}
