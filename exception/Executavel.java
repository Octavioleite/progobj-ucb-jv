package exception;
import exception.Banco.ContaCorrente;
import exception.Banco.Banco;

public class Executavel {
    public static void main(String[] args) throws Exception {
       
        Banco banco;
        ContaCorrente conta;
        banco = new Banco();

        banco.abrirConta("Jota", 123);
        conta = banco.pesquisarConta("Jota");

        System.out.println(conta);
        try {
            banco.depositar(124, 1.0);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            banco.depositar(123, 10.0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(conta);
       


    }
}
