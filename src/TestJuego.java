public class TestJuego {
    public static void main(String[] args) {

        Robot robotito = new Robot(); //Creo un robotito
        Hombre pedrito = new Hombre("pedrito"); //Creo un hombre

        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.JugarConRobot(robotito);

        // Segundo hombre
        Hombre josecito = new Hombre("josecito");
        System.out.println(josecito.getNombre()+" va a jugar con el robotito");
        josecito.JugarConRobot(robotito);


        System.out.println(pedrito.getNombre()+" va a jugar con el robotito");
        pedrito.jugarLibremente(robotito);
    }
}
