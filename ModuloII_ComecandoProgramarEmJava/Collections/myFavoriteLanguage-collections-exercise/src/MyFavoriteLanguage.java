import java.util.Objects;

public class MyFavoriteLanguage implements Comparable<MyFavoriteLanguage>{

    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public MyFavoriteLanguage(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "MyFavoriteLanguage{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFavoriteLanguage that = (MyFavoriteLanguage) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(MyFavoriteLanguage myFavoriteLanguage) {
        return this.getNome().compareToIgnoreCase(myFavoriteLanguage.getNome());
    }

}
