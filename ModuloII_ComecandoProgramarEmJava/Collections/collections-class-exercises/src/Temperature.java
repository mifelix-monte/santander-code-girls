import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanTemperature = new Scanner(System.in);
        List<Double> monthsTemperature = new ArrayList<>();
        double inputTemperature;
        double temperatureAvarege;

        System.out.println("Informe a temperatura média de cada um dos 6 primeiros meses.");
        for (int i = 0; i < 6; i++) {
            inputTemperature = scanTemperature.nextDouble();
            monthsTemperature.add(inputTemperature);
        }
        System.out.println("Temperatura média de Janeiro a Junho: " + monthsTemperature);

        Iterator<Double> iterator = monthsTemperature.iterator();

        Double addiction = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            addiction += next;
        }

        temperatureAvarege = addiction / monthsTemperature.size();

        System.out.println();
        System.out.println("---Temperaturas que ficaram acima da média---");

        for (Double temperature : monthsTemperature) {
            if (temperature >= temperatureAvarege) {
                int index = monthsTemperature.indexOf(temperature);

                switch (index) {
                    case 0 -> System.out.println("1 - Janeiro: " + temperature + "°C");
                    case 1 -> System.out.println("2 - Fevereiro: " + temperature + "°C");
                    case 2 -> System.out.println("3 - Março: " + temperature + "°C");
                    case 3 -> System.out.println("4 - Abril: " + temperature + "°C");
                    case 4 -> System.out.println("5 - Maio: " + temperature + "°C");
                    case 5 -> System.out.println("6 - Junho: " + temperature + "°C");
                }
            }
        }
    }
}

