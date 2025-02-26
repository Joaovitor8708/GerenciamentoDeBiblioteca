package GerenciamentoBiblioteca.Test;

import GerenciamentoBiblioteca.Dominio.Biblioteca;
import GerenciamentoBiblioteca.Dominio.Livro;
import GerenciamentoBiblioteca.Dominio.Usuario;

public class TestandoBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Neymar", "João", "1234");
        Livro livro2 = new Livro("Java", "Jonos", "5232");


        Usuario usuario = new Usuario("Jota", 1);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.registrarUsuario(usuario);


        System.out.println(livro);
        System.out.println(biblioteca.emprestarLivros("1234", 1));
        System.out.println(livro);
        System.out.println("----------------------------------");
        System.out.println(livro);
        System.out.println(biblioteca.devolverLivro("1234", 1));
        System.out.println(livro);

    }
}