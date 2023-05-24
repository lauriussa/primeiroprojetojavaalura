public class ConversaoTemperatura {
    public static void main(String[] args) {
        double tempCelsius = 30;
        double tempFarenheit = (tempCelsius * 1.8) + 32;

        System.out.println("Temperatura Celsius: " + tempCelsius + "º");
        System.out.println("Temperatura Farenheit: " + tempFarenheit + "º");

        int farenheit = (int) tempFarenheit;
        System.out.println(farenheit);
    }
}
