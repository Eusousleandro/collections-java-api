package map.OperacaoBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatosmap;
	
	public AgendaContatos() {
		this.agendaContatosmap =  new HashMap<>();
	}
	
	public void adicionarContatos(String nome, int numero) {
		agendaContatosmap.put(nome, numero);
	}
	
	public void removerContatos(String nome, int numero) {
		if(agendaContatosmap.isEmpty()) {
			agendaContatosmap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatosmap);
	}
	
	public Integer pesquisarPOrNome(String nome) {
		Integer numeroPorNome = null;
		if(agendaContatosmap.isEmpty()) {
			numeroPorNome = agendaContatosmap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContatos("Camila", 23456789);
		agendaContatos.adicionarContatos("José", 56456789);
		agendaContatos.adicionarContatos("Joaquin", 445456789);
		agendaContatos.adicionarContatos("Luiz", 234560789);
		agendaContatos.adicionarContatos("Maria", 123456789);
		
		agendaContatos.removerContatos("Maria", 123456789);
		agendaContatos.exibirContatos();
		
		System.out.println("");
	}
}
