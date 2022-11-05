public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;


        spirit.showAttributes();
        spirit.checkStatus();
        System.out.println("--------------------------");

        System.out.println("zwiększanie prędkoszci do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("--------------------------");

        System.out.println("zmiana temeratury do -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("--------------------------");

        System.out.println("sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();
        spirit.checkStatus();

        System.out.println("--------------------------");
        System.out.println("oportunity");

        MarsRobot oportunity = new MarsRobot();
        oportunity.status = "Eksploracja";
        oportunity.speed = 3;
        oportunity.temperature = -50;

        oportunity.showAttributes();
        oportunity.checkStatus();

    }
}

