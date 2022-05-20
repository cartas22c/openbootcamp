public class Coche {

    int numPuertas;

    public Coche() {
        this.numPuertas = 0;
    }

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementaPuertas(int numPuertasExtra){
        this.numPuertas = this.numPuertas + numPuertasExtra;
     }

}
