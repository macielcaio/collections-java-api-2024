package list.OperacoesBasicas;

public class Compras {
    private final String itens;

    public Compras(String itens) {
        this.itens = itens;
    }

    public String getCompras() {
        return itens;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "compras='" + itens + '\'' +
                '}';
    }
}
