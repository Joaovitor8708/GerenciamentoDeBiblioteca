package GerenciamentoBiblioteca.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Livro> listaLivros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
    }

    public void removerLivro(String isbn){
        listaLivros.remove(isbn);
    }

    public void listarLivros(){
        for(Livro livros : listaLivros){
            System.out.println(livros);
        }
    }

    public void registrarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public String emprestarLivros(String isbn, int userId){
        for(Livro livro : listaLivros){
            if(livro.getIbsn().equals(isbn) && livro.isDisponivel()){
                for (Usuario usuario : listaUsuarios){
                    if(usuario.getId() == userId){
                        livro.setDisponivel(false);
                        usuario.getLivrosEmprestados().add(livro);
                        return "Livro " + livro.getTitulo() + " emprestado para: " + usuario.getNome();
                    }
                }
            }
        }
        return "Livro ou usuario não encontrado";
    }

    public String devolverLivro(String isbn, int userId){
        for(Livro livro : listaLivros){
            if (livro.getIbsn().equals(isbn) && !livro.isDisponivel()){
                for(Usuario usuario : listaUsuarios){
                    if (usuario.getId() == userId){
                        livro.setDisponivel(true);
                        usuario.getLivrosEmprestados().remove(livro);
                        return "Livro " + livro.getTitulo() + " foi devolvido por: " + usuario.getNome();
                    }
                }
            }
        }
        return  "Livro ou usuario não encontrado";
    }

}

