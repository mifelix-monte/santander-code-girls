import java.util.Comparator;

public class ComparatorIDE implements Comparator<MyFavoriteLanguage> {

    @Override
    public int compare(MyFavoriteLanguage ide1, MyFavoriteLanguage ide2) {
        return ide1.getIde().compareToIgnoreCase(ide2.getIde());

    }
}
