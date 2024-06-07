package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Angela Maria", 12345678);
        agendaContato.adicionarContato("Angela", 12345677);
        agendaContato.adicionarContato("Leandro", 11345678);
        agendaContato.adicionarContato("José", 12355678);
        agendaContato.adicionarContato("Fernando", 12344678);

        //agendaContato.exibirContatos();

        //System.out.println(agendaContato.pesquisarPorNome("Angela"));
        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Angela Maria", 656567879));
    }
}
