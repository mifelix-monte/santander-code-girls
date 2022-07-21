import java.util.Comparator;

public class ComparatorNomeAnoCriacaoIDE implements Comparator<MyFavoriteLanguage> {
    @Override
    public int compare(MyFavoriteLanguage favorite1, MyFavoriteLanguage favorite2) {
        int name = favorite1.getNome().compareToIgnoreCase(favorite2.getNome());
        if (name != 0) return name;

        int anoCriacao = Integer.compare(favorite1.getAnoDeCriacao(), favorite2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return favorite1.getIde().compareToIgnoreCase(favorite2.getIde());
    }
}
