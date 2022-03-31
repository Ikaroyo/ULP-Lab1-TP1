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

            //Repetir avanzar y retroceder hasta que el robot sea enviado a dormir
            while (roboto.energiaActual() > 0 && !roboto.estaDormido()) {
                System.out.println("Ingrese avanzar(a), retroceder(r) o dormir(d)");
                respuesta = teclado.nextLine();
                int pasos;
                switch (respuesta) {
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
