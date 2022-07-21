import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Ordem de Inserção---");
        Set<MyFavoriteLanguage> favoritesLanguages = new LinkedHashSet<>(){{
            add(new MyFavoriteLanguage("Java", 1991, "Intellij"));
            add(new MyFavoriteLanguage("JavaScript", 1995, "VSCode"));
            add(new MyFavoriteLanguage("Python", 1990, "Pycharm"));
        }};
        for (MyFavoriteLanguage theFavorites: favoritesLanguages) System.out.println(theFavorites);

        System.out.println("---Ordem Natural (NOME)---");
        Set<MyFavoriteLanguage> orderLanguagesByName = new TreeSet<>(favoritesLanguages);
        for (MyFavoriteLanguage myFavoriteLanguage: orderLanguagesByName){
            System.out.println(myFavoriteLanguage.getNome() + " - "
                    + myFavoriteLanguage.getAnoDeCriacao() + " - "
                    + myFavoriteLanguage.getIde());
        }

        System.out.println("---Ordem IDE---");
        Set<MyFavoriteLanguage> orderLanguageByIDE = new TreeSet<>(new ComparatorIDE());
        orderLanguageByIDE.addAll(favoritesLanguages);
        for (MyFavoriteLanguage myFavoriteLanguage: orderLanguageByIDE){
            System.out.println(myFavoriteLanguage.getNome() + " - "
                    + myFavoriteLanguage.getAnoDeCriacao() + " - "
                    + myFavoriteLanguage.getIde());
        }

        System.out.println("---Ordem AnoCriacao e Nome---");
        Set<MyFavoriteLanguage> orderLanguageByAnoCriacaoNome = new TreeSet<>(new ComparatorAnoCriacaoNome());
        orderLanguageByAnoCriacaoNome.addAll(favoritesLanguages);
        for (MyFavoriteLanguage myFavoriteLanguage: orderLanguageByAnoCriacaoNome){
            System.out.println(myFavoriteLanguage.getNome() + " - "
                    + myFavoriteLanguage.getAnoDeCriacao() + " - "
                    + myFavoriteLanguage.getIde());
        }

        System.out.println("---Ordem Nome, AnoCriacao e IDE---");
        Set<MyFavoriteLanguage> orderLanguageByNomeAnoCriacaoIDE = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        orderLanguageByNomeAnoCriacaoIDE.addAll(favoritesLanguages);
        for (MyFavoriteLanguage myFavoriteLanguage: orderLanguageByNomeAnoCriacaoIDE){
            System.out.println(myFavoriteLanguage.getNome() + " - "
                    + myFavoriteLanguage.getAnoDeCriacao() + " - "
                    + myFavoriteLanguage.getIde());

        }

        System.out.println("---Minhas Linguagens Preferidas---");
        for (MyFavoriteLanguage justName: favoritesLanguages){
            System.out.println(justName.getNome());
        }
    }
}






