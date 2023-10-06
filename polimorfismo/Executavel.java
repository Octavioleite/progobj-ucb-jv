package polimorfismo;

import polimorfismo.mercado.CarrinhoDeCompras;
import polimorfismo.mercado.produtos.Alho;
import polimorfismo.mercado.produtos.Melancia;

public class Executavel {
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Alho a1 = new Alho("Alho comum", 1.99, 0.5);
        Melancia m1 = new Melancia("Melancia comum", 12.99, 2);
        Alho a2 = new Alho("Alho premium", 20.80, 20.0);
        Melancia m2 = new Melancia("Melância Chinesa", 50.50, 5);
        carrinho.adicionarProduto(a1);
        carrinho.adicionarProduto(m1);
        carrinho.adicionarProduto(a2);
        carrinho.adicionarProduto(m2);
        System.out.println(carrinho.finalizarCompra());
    }

}
