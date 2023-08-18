package começandozerojava;
import	começandozerojava.calculadora;
public class classeExecutavel {
    public static void main(String[] args) {

       calculadora calc = new calculadora();
        calculadora calc2 = new calculadora();

        calc.a=3;
        calc.b=5;

        calc.Operador("-");

        System.out.println(calc.operar());


    }

}
