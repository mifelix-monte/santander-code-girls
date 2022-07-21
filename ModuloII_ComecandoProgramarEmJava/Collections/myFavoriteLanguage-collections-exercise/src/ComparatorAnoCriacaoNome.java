import java.util.Comparator;

public class ComparatorAnoCriacaoNome implements Comparator<MyFavoriteLanguage> {

    @Override
    public int compare(MyFavoriteLanguage favorite1, MyFavoriteLanguage favorite2) {
        int anoCriacao = Integer.compare(favorite1.getAnoDeCriacao(), favorite2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return favorite1.getNome().compareToIgnoreCase(favorite2.getNome());
    }
}
