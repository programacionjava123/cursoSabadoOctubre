package clase6;

public class Persona {

    private String nombre;
    private int dni;
    private int edad;

    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni = unDni;
    }

    public Persona(String unNombre, int unDni, int unaEdad){
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    private void setDni(int unDNI){
        this.dni = unDNI;
    }

    public int getDni(){
        return this.dni;
    }

    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }

    public int getEdad(){
        return this.edad;
    }

    public String toString(){
        String descripcion = this.nombre + " de DNI " + this.dni;
        if (edad > 0 ){
            descripcion += " tiene " + this.edad + " años.";
        }
        return descripcion ;
    }


}
