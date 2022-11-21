public class Auto {

    int numPuerta = 0;
    int agregarPuerta = 0;


    public void mostrarNumPuertas(){

        System.out.println(" El número de puertas es:" + incrementarPuertas(numPuerta, agregarPuerta));
    }

    public int incrementarPuertas(int numPuerta, int agregarPuerta){

        return  numPuerta + agregarPuerta;
    }

}
