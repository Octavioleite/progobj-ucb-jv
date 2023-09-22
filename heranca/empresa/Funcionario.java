package heranca.empresa;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Funcionario {
    protected String nome;
    protected Integer cpf;
    protected Integer telefone;


    public Funcionario() {
    }


    public Funcionario(String nome, Integer cpf, Integer telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    public BigDecimal getsSalario(){
        return new BigDecimal(20000.00);
}

public BigDecimal getBonificacao (){
   return getsSalario().multiply(new BigDecimal(0.35));

}

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            "}";
    }


}
