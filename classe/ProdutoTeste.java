package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4325.50);

        var p2 = new Produto();
        p2.nome = "Caneta2";
        p2.preco = 12.50;

        Produto.desconto = 0.5;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("Preço final 1: " + precoFinal1 );
        System.out.println("Preço final 2: " + precoFinal2);
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }
}
