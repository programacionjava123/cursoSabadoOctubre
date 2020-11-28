package clase6;

public class Alumno extends Persona {
    //nombre
    //dni
    //edad
    private String grado;

    public Alumno(String unNombre, int unDni){
        super(unNombre, unDni);
        this.grado = "Primero";
    }

    public Alumno(String unNombre, int unDni, String unGrado){
        super(unNombre, unDni);
        this.grado = unGrado;
    }

    public void setGrado(String unGrado){
        this.grado = unGrado;
    }

    public String getGrado(){
        return this.grado;
    }

    public String toString(){
        return super.toString() + " El alumno se encuentra en " + this.grado + " grado";
    }

}
