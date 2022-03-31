public class Robot {

    // Atributos

    private int bateria;
    private boolean estadoDormido;

    // Constructor

    Robot(){
        recargar();
        despertar();
    }

    // Metodos

    public void avanzar(int cantidadDePasos) {
        if (puedeAvanzar(cantidadDePasos)) {
            bateria = bateria - cantidadDePasos*10/100;
            System.out.println("El robot avanzo " + cantidadDePasos + " Su energia es " + this.energiaActual());
        } else  {
            System.out.println("No puede moverse");
        }
    }

    public void retroceder(int cantidadDePasos) {
        if (puedeAvanzar(cantidadDePasos)) {
            bateria = bateria - cantidadDePasos*10/100;
            System.out.println("El robot retrocedio " + cantidadDePasos + " Su energia es " + this.energiaActual());
        } else  {
            System.out.println("No puede moverse");
        }
    }

    public void dormir() {
        estadoDormido=true;
        System.out.println("El robot se ha dormido");
    }

    public void despertar() {
        estadoDormido=false;
        System.out.println("El robot se ha despertado");
    }

    public void recargar() {
        this.bateria = 1000;
    }


    public boolean bateriaLlena() {
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
