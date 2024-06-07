package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntosConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadosPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }


    public static void main(String[] args) {
        ConjuntosConvidados conjuntosConvidados = new ConjuntosConvidados();
        System.out.println("Existem " + conjuntosConvidados.contarConvidados() + "convido(s) do Set de convidados");

        conjuntosConvidados.adicionarConvidados("Convidado 1", 1234);
        conjuntosConvidados.adicionarConvidados("Convidado 2", 1235);
        conjuntosConvidados.adicionarConvidados("Convidado 3", 1235);
        conjuntosConvidados.adicionarConvidados("Convidado 4", 12346);
        conjuntosConvidados.adicionarConvidados("Convidado 5", 12345);
        conjuntosConvidados.adicionarConvidados("Convidado 6", 123456);


        conjuntosConvidados.removerConvidadosPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntosConvidados.contarConvidados() + "convido(s) do Set de convidados");


        

    }
}
