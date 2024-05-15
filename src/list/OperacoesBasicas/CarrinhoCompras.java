package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoCompras {

    private final List<Compras> compraList;

    public CarrinhoCompras(){
        this.compraList = new ArrayList<>();
    }

    public void adcionaCompra(String itens){
        compraList.add(new Compras(itens));

    }

    public void removerCompras(String itens){
        List<Compras> itensParaRemover = new ArrayList<>();
        for(Compras i : compraList){
            if(i.getCompras().equalsIgnoreCase(itens.toLowerCase())){
                itensParaRemover.add(i);
            }
        }
        compraList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotalCompras() {
        return compraList.size();
    }

    public void obterItensComprados(){
        System.out.println(compraList);
    }

    public static void main(String[] args) {
        CarrinhoCompras compra = new CarrinhoCompras();

        System.out.println("Os itens no seu carrinho de compra são: ");
        compra.adcionaCompra("Shampoo");
        compra.adcionaCompra("Alface");
        compra.adcionaCompra("Arroz");

        compra.obterItensComprados();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o produto a ser cancelado: ");
        compra.obterItensComprados();
        System.out.println("Digite o nome do produto: ");
        String produto = scanner.next();
        compra.removerCompras(produto);
        System.out.println("A lista atualizada de produtos no carrinho de compras é: ");
        compra.obterItensComprados();

        scanner.close();
    }
}
