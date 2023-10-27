package exception.Banco.exceptions;

public class contaNaoEncontradaException extends Exception {
    
    public contaNaoEncontradaException(){
        super("Conta Corrente não encontrada.");
    }
}
