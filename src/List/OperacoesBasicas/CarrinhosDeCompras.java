package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhosDeCompras {
    private List<Item> itemList;

    public CarrinhosDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, double preco, int quantidade) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item t : itemList) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(t);
            }
        }

        itemList.removeAll(itemParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        System.out.println("Itens no Carrinhos" + itemList);
    }


    public static void main(String[] args) {
        CarrinhosDeCompras item = new CarrinhosDeCompras();

        //System.out.println("Valor Total: " + item.calcularValorTotal());
    
        item.adicionarItem("Uva", 7.99, 3);
    }
}


