import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> rainbowColors = new HashSet<>(Arrays.asList
                ("vermelho", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));

        //Exiba todas as cores uma abaixo da outra
        System.out.println("---As cores do arco-íris---");
        for(String colors: rainbowColors) System.out.println(colors);

        //A quantidade de cores que o arco-íris tem
        System.out.println("---Quantidade de cores do arco-íris---");
        System.out.println("O arco-íris tem " + rainbowColors.size() + " cores.");

        //Exiba as cores em ordem alfabética
        System.out.println("---Cores em ordem alfabética---");
        Set<String> rainbowColorsOrder = new TreeSet<>(rainbowColors);
        for (String colors: rainbowColorsOrder) System.out.println(colors);

        //Exiba as cores na ordem inversa da que foi informada
        System.out.println("---Cores em ordem inversa de inserção---");
        Set<String> rainbowColorInverse = new LinkedHashSet<>(rainbowColors);
        List<String> rainbowColorInverseOrder = new ArrayList<>(rainbowColorInverse);
        Collections.reverse(rainbowColorInverseOrder);
        System.out.println(rainbowColorInverseOrder);

        //Exiba todas as cores que começam com a letra ”v”
        System.out.println("---Cores que começam com 'v'---");
        for (String color: rainbowColors){
            if (color.startsWith("v")) System.out.println(color);
        }

        //Remova todas as cores que não começam com a letra “v”
        System.out.println("---Remova da lista todas as cores que não começam com 'v'---");
        Iterator<String> iterator = rainbowColors.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(rainbowColors);

        //Limpe o conjunto
        System.out.println("---Limpe o conjunto---");
        rainbowColors.clear();

        //Confira se o conjunto está vazio
        System.out.println("Confira se o conjunto está vazio: " + rainbowColors.isEmpty());

    }
}