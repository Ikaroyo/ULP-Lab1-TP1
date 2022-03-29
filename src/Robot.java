public class Robot {

    // Atributos

    private int bateria;
    private boolean estadoDormido;



    // Constructor

    Robot(){
        recargar();
        despertar();

        // Llamada a funcion de prueba
        // probarFuncionamiento();

    }

/*
Funcion de prueba de funcionamiento del robot

    private void probarFuncionamiento() {
        System.out.println("Probando funcionamiento");
        avanzar(10);
        System.out.printf("Bateria: %d\n", energiaActual());
        retroceder(10);
        System.out.printf("Bateria: %d\n", energiaActual());
        dormir();
        System.out.printf("Dormido: %b\n", estadoDormido);
        despertar();
        System.out.printf("Dormido: %b\n", estadoDormido);
        recargar();
        System.out.printf("Bateria: %d\n", energiaActual());
        System.out.println("Listo para jugar");
    }
*/


    // Metodos

    public void avanzar(int cantidadDePasos) {
        if (puedeAvanzar(cantidadDePasos)) {
            bateria = bateria - cantidadDePasos*10/100;
        } else  {
            System.out.println("No puede avanzar");
        }
    }

    public void retroceder(int cantidadDePasos) {
        if (puedeAvanzar(cantidadDePasos)) {
            bateria = bateria - cantidadDePasos*10/100;
        } else  {
            System.out.println("No puede avanzar");
        }
    }

    public void dormir() {
        estadoDormido=true;
    }

    public void despertar() {
        estadoDormido=false;
    }

    public void recargar() {
        this.bateria = 1000;
    }


    public boolean bateriaLLena() {
        return bateria==1000;
    }

    public boolean bateriaVacia() {
        return bateria==0;
    }

    public int energiaActual() {
        return bateria;
    }

    public boolean estaDormido() {
        return estadoDormido;
    }

    public boolean puedeAvanzar(int cantidadDePasos) {
        return ((energiaActual() >= cantidadDePasos * 10 / 100) && !estaDormido() && !bateriaVacia());
    }




}
