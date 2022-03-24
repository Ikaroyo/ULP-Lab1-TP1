public class TestJuego {
    public static void main(String[] args) {

        Robot robotito = new Robot(); //Creo un robotito
        Hombre pedrito = new Hombre("pedrito"); //Creo un hombre

        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.JugarConRobot(robotito);

        // Segundo hombre
        Hombre josesito = new Hombre("josesito");
        System.out.println(josesito.getNombre()+" va a jugar con el robotito");
        josesito.JugarConRobot(robotito);


        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.jugarLibremente(robotito);

    }
}
