/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadClase3;

/**
 *
 * @author canod
 */
public class Persona {
    
    public String Nombre;
    public String Sexo;
    public int Edad;
    public String Curp;
    public String Direccion;
    public int Telefono;
    
    public Persona(){
        Nombre = "";
        Sexo = "";
        Edad = 0;
        Curp = "";
        Direccion = "";
        Telefono = 0;
    }
    
    public Persona(String Nombre, String Sexo, int Edad, String Curp, String Direccion, int Telefono){
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Curp = Curp;
        this. Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    public void setNombre(String nom1) {
        this.Nombre = nom1;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setSexo(String sex) {
        this.Sexo = sex;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setEdad(int ed) {
        this.Edad = ed;
    }

    public int getEdad() {
        return Edad;
    }

    public void setCurp(String cr) {
        this.Curp = cr;
    }

    public String getCurp() {
        return Curp;
    }

    public void setDireccion(String dir) {
        this.Direccion = dir;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setTelefono(int tel) {
        this.Telefono = tel;
    }

    public int getTelefono() {
        return Telefono;
    }
    
    public String toString (){
        return "\n Nombre: "+Nombre+"\n De Sexo: "+Sexo+"\n con: "+Edad+" años"+"\n Con CURP: "+Curp+
               "\n con Direccion en: "+Direccion+"\n Y Con Numero de telefono: "+Telefono;
    }


}
