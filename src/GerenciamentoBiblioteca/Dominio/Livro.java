package GerenciamentoBiblioteca.Dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String ibsn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String ibsn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ibsn = ibsn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ibsn='" + ibsn + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
