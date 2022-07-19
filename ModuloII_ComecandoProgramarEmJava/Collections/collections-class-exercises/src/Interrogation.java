import java.util.*;
public class Interrogation {
    public static void main(String[] args) {
        Scanner scanAnswers = new Scanner(System.in);
        List<String> questionaryAnswers = new ArrayList<>();
        String answer;
        int count = 0;

        System.out.println("---Questionário---");
        System.out.println("1 - Telefonou para a vítima?");
        System.out.println("2 - Esteve no local do crime?");
        System.out.println("3 - Mora perto da vítima?");
        System.out.println("4 - Devia para a vítima?");
        System.out.println("5 - Já trabalhou para a vítima?");
        System.out.println("De acordo com o questionário, responda 'S' para SIM e 'N' para NÂO");
        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.println("Resposta da Pergunta " + i);
            answer = scanAnswers.next();
            answerValidator(answer);
            questionaryAnswers.add(answer);
        }
        System.out.println();
        System.out.println("---RESULTADO---");

        for (String answers: questionaryAnswers) {
            if (Objects.equals(answers, "S")){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Suspeita");
        } else if (count == 3 || count == 4){
            System.out.println("Cúmplice");
        } else if (count == 5){
            System.out.println("ATENÇÃO!! ESSA PESSOA É A ASSASSINA");
        }
    }

    public static void answerValidator(String answer){
        Scanner scanAnswers = new Scanner(System.in);
        while (!Objects.equals(answer, "S") && !Objects.equals(answer, "N")){
            System.out.println("Resposta incorreta, responda 'S' para SIM ou 'N' para NÂO");
            answer = scanAnswers.next();
        }
    }
}
