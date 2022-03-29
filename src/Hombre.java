import java.util.Scanner;

public class Hombre {
    
    //Atributos
    private String nombre;

    //constructor
    Hombre(String name) {

        this.nombre = name;
    }

    //Metodos

    public void jugarConRobot(Robot roboto) {
        if (roboto.estaDormido()) {
            // Leer por teclado si o no y ejecutar roboto.despertar()
            System.out.println("El robot esta dormido, ¿Desea despertarlo? ingrese si para despertarlo");
            Scanner teclado = new Scanner(System.in);
            String respuesta = teclado.nextLine();
            if (respuesta.equals("si")) {
                roboto.despertar();
                jugar(roboto);
            } else {
                System.out.println("El robot Sigue dormido");
            }

        } else {

            jugar(roboto);
        }

    }

    private void jugar(Robot roboto) {
        roboto.avanzar(500);
        System.out.println("Avanzo 500 pasos y su energia es: " + roboto.energiaActual());
        roboto.retroceder(20);
        System.out.println("Retrocedio 20 pasos y su energia es: " + roboto.energiaActual());
        System.out.println(roboto.energiaActual());
        roboto.dormir();
        System.out.println("El robot se ha dormido");
    }

    public void jugarLibremente(Robot roboto) {

        System.out.println("Desea jugar en modo libre con el robot? ingrese ok para jugar libremente");
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoNumerico = new Scanner(System.in);
        String respuesta = teclado.nextLine();
        if (respuesta.equals("ok")) {

            System.out.println("Despertando el robot");
            roboto.despertar();
            System.out.println("El robot se ha despertado");

            while (roboto.energiaActual() > 0 && !roboto.estaDormido()) {
                System.out.println("Ingrese avanzar(a), retroceder(r) o dormir(d)");
                respuesta = teclado.nextLine();

                if (respuesta.equals("a")) {
                    System.out.println("Cuantos pasos desea avanzar?");
                    int pasos = tecladoNumerico.nextInt();
                    if (roboto.puedeAvanzar(pasos)) {
                        roboto.avanzar(pasos);
                        System.out.println("El robot avanzo " + pasos + " Su energia es " + roboto.energiaActual());
                    } else {
                        System.out.println("El robot no puede avanzar " + pasos + " pasos");
                    }

                } else if (respuesta.equals("r")) {
                    System.out.println("Cuantos pasos desea retroceder?");
                    int pasos = tecladoNumerico.nextInt();
                    if (roboto.puedeAvanzar(pasos)) {
                        roboto.retroceder(pasos);
                        System.out.println("El robot retrocedio " + pasos + " Su energia es " + roboto.energiaActual());
                    } else {
                        System.out.println("El robot no puede retroceder " + pasos + " pasos");
                    }

                } else if (respuesta.equals("d")) {
                    roboto.dormir();
                    System.out.println("El robot se ha dormido");
                } else {
                    System.out.println("Ingrese una opcion valida");
                }
            }
        } else {
            System.out.println("El robot se ha dormido");
        }

    }

    public String getNombre(){
        return nombre;
    }


}
