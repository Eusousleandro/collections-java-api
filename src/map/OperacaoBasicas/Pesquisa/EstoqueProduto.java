package map.OperacaoBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	private Map<Long, Produto> estoqueProdutomap;
	
	public EstoqueProduto() {
		this.estoqueProdutomap = new HashMap<>();
	}
	
	public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
		estoqueProdutomap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutomap);
	}
	
	public double calcularValorTotal() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutomap.isEmpty()) {
			for (Produto p : estoqueProdutomap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutomap.isEmpty()) {
			for (Produto p : estoqueProdutomap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();				}
			}
		}
		return produtoMaisCaro;
		
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutomap.isEmpty()) {
			for (Produto p : estoqueProdutomap.values()) {
				if(p.getPreco() < menorPreco) {
					produtoMaisBarato = p;
					menorPreco = p.getPreco();				}
			}
		}
		return produtoMaisBarato;
	}
}
