public class Menu {
    public static void main(String[] args) {
        String Estacion = "fall";

        switch (Estacion) {
        case "spring":
        System.out.println("Estamos en spring");
        break;
        case "summer":
        System.out.println("Estamos en summer");
        break;
        case "fall":
        System.out.println("Estamos en fall");
        break;
        case "winter":
        System.out.println("Estamos en winter");
        break;
        default:
        System.out.println("No existe esta estacion");
        }
    }
}