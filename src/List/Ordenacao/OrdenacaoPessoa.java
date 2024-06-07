package List.Ordenacao;

import java.util.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa(){
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, ComparatorPorAltura());
        return pessoasPorAltura;
    }

    private Comparator ComparatorPorAltura() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ComparatorPorAltura'");
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
        ordenacaoPessoas.adicionarPessoas("Nome 1", 20, 1.60);
        ordenacaoPessoas.adicionarPessoas("Nome 2", 21, 1.70);
        ordenacaoPessoas.adicionarPessoas("Nome 3", 22, 1.80);
        ordenacaoPessoas.adicionarPessoas("Nome 4", 23, 1.40);
        ordenacaoPessoas.adicionarPessoas("Nome 5", 24, 1.56);
        ordenacaoPessoas.adicionarPessoas("Nome 6", 25, 1.74);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
