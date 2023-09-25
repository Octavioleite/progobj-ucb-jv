package heranca;
//Arthur Alves de Sousa, Jéssica Laís da Mota Freira, Jorge Igor Barros Gomes, Marcus Vinícius Costa da Silva, Octávio Leite Neto
import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;

public class Executavel {
    public static void main(String[] args) {
        
        Engenheiro eng1= new Engenheiro("Octavio", 123, 123, "123", "marte");
        Gerente ger1 = new Gerente("octavio", 123, 123, 4);
        Diretor dir1 = new Diretor("octavio", 123, 123, 10);
        System.out.println(eng1);
        System.out.println(ger1);
        System.out.println(dir1);
    }
}
