public class TestJuego {
    public static void main(String[] args) {

        Robot robotito = new Robot(); //Creo un robotito
        Hombre pedrito = new Hombre("Pedrito"); //Creo al primer hombre

        // Primer hombre en jugar
        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.jugarConRobot(robotito);

        // Segundo hombre en jugar
        Hombre josecito = new Hombre("Josecito"); //Creo al segundo hombre
        System.out.println(josecito.getNombre()+" va a jugar con el robotito");
        josecito.jugarConRobot(robotito);

        // vuelve a jugar el primer hombre usando los comandos de movimiento libre
        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.jugarLibremente(robotito);
    }
}
