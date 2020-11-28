package clase6;

public class Profesor extends Persona {

    private int salario;

    public Profesor(String unNombre, int unDNI){
        super(unNombre, unDNI);
        this.salario = 20000;
    }

    public Profesor(String unNombre, int unDNI, int unSalario){
        super(unNombre, unDNI);
        this.salario = unSalario;
    }

    public void setSalario(int unSalario){
        this.salario = unSalario;
    }
    public int getSalario(){
        return this.salario;
    }

    public String toString(){
        return "Profesor: " + super.toString() + ". El salario del profesor es " + this.salario;
    }


}
