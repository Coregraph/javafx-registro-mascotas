package model;

public class Mascota {
    private String nombre;
    private Integer edad;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Mascota(String nombre, Integer edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "---\n"+"Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nRaza:"+this.raza+"\n---\n";
    }
}
