package clase6;

public class Tester {

    private boolean esManual;
    private boolean esAuto;

    public Tester(){
        this.esManual = true;
        this.esAuto = false;
    }

    public void setEsManual(boolean esTesterManual){
        if (this.esAuto == true){
            this.esManual = true;
        } else {
            this.esManual = esTesterManual;
        }
    }

    public boolean getEsManual(){
        return this.esManual;
    }

    public void setEsAuto(boolean esTesterAuto){
        this.esAuto = esTesterAuto;
        if (esAuto == true) {
            this.esManual = true;
        }
    }

    public boolean getEsAuto(){
        return this.esAuto;
    }

    public String toString(){
        String descripcion = "";

        if(this.esManual == true){
            descripcion += " Es tester manual";
        } else {
            descripcion += " No Es tester manual";
        }

        if(this.esAuto == true){
            descripcion += " Es tester automatizador";
        } else {
            descripcion += " No Es tester automatizador";
        }
        return  descripcion;
    }
}
