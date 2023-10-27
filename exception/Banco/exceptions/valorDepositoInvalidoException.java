package exception.Banco.exceptions;

public class valorDepositoInvalidoException extends Exception {
    public valorDepositoInvalidoException(){
        super("valor do depósito invlálido.");
    }
}
