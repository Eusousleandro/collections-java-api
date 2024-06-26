package Set.Ordenacao;


import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade ) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;        
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int quantidade() {
        return quantidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return   "Item{" +
        "nome='" + nome + '\'' +
        ", codigo=" + codigo +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }
}


class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}