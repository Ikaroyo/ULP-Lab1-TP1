import java.util.Scanner;

public class Hombre {
    
    //Atributos
    private final String nombre;

    //constructor
    Hombre(String name) {
        this.nombre = name;
    }

    //Metodos

    public void jugarConRobot(Robot roboto) {
        Scanner teclado = new Scanner(System.in);
        if (roboto.estaDormido()) {
            // Leer por teclado si o no y ejecutar roboto.despertar()
            System.out.println("El robot esta dormido, ¿Desea despertarlo? ingrese si para despertarlo");
            String respuesta = teclado.nextLine();
            if (respuesta.equals("si")) {
                roboto.despertar();
                jugar(roboto);
            } else {
                System.out.println("El robot sigue dormido");
            }
        } else {
            jugar(roboto);
        }
    }

    // Funcion jugar() hace los movimientos basicos solicitados por cada hombre en el enunciado
    private void jugar(Robot roboto) {
        roboto.avanzar(500);
        roboto.retroceder(20);
        System.out.println(roboto.energiaActual());
        roboto.dormir();
    }

    public void jugarLibremente(Robot roboto) {

        System.out.println("Desea jugar en modo libre con el robot? ingrese ok para jugar libremente");
        Scanner teclado = new Scanner(System.in);
        String respuesta = teclado.nextLine();

        if (respuesta.equals("ok")) {

            System.out.println("Despertando el robot");
            roboto.despertar();

            //Repetir avanzar, retroceder o cargar hasta que el robot sea enviado a dormir
            while (!roboto.estaDormido()) {


                System.out.println("Ingrese avanzar(a), retroceder(r), recargar(g) o dormir(d)");
                String accion = teclado.next();

                int pasos;
                switch (accion) {
                    case "a" -> {
                        System.out.println("Cuantos pasos desea avanzar?");
                        pasos = teclado.nextInt();
                        roboto.avanzar(pasos);
                    }
                    case "r" -> {
                        System.out.println("Cuantos pasos desea retroceder?");
                        pasos = teclado.nextInt();
                        roboto.retroceder(pasos);
                    }
                    case "g" -> {
                        roboto.recargar();
                        System.out.println("El robot se ha recargado");
                        System.out.println("Energia actual: " + roboto.energiaActual());
                    }
                    case "d" -> roboto.dormir();
                    default -> System.out.println("Ingrese una opcion valida");
                }
            }
        } else {
            roboto.dormir();
        }

    }

    public String getNombre(){
        return nombre;
    }


}
