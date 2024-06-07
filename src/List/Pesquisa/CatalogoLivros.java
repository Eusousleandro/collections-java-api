package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listLivros;

    public CatalogoLivros(){
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivros.isEmpty()) {
            for(Livro l : listLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosAno = new ArrayList<>();
        if(!listLivros.isEmpty()) {
            for(Livro l : listLivros) {
                 if(l.getAnoPublicaco() >= anoInicial && l.getAnoPublicaco() <= anoFinal) {
                        livrosPorIntervalosAno.add(l);
                    }
                }
            }
            return livrosPorIntervalosAno;
        }

        public Livro pesquisarPorTitulo(String titulo) {
            Livro livrosPorTitulo = null;
            if(!listLivros.isEmpty()) {
                for(Livro l : listLivros) {
                    if (l.getTitulo().equalsIgnoreCase(titulo)) {
                        livrosPorTitulo = l;
                    }
                }
            }
            return livrosPorTitulo;
        }

        public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();

            catalogoLivros.adicionarLivros("JAVA    Programation ", "Autor 1", 2021);
            catalogoLivros.adicionarLivros("JavaScript Programation", "Autor 2", 2022);
            catalogoLivros.adicionarLivros("JavaScript Programation", "Autor 2", 2022);
            catalogoLivros.adicionarLivros("PYTHON Programation","Autor 4", 2023);

            System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
            System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2021, 2023 ));
            System.out.println(catalogoLivros.pesquisarPorTitulo("JAVA Programation"));
        }

}
