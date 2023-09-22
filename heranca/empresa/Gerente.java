package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario {
    private Integer quantidadeGerenciados;


    

    public Gerente() {
    }


    public Gerente(String nome, Integer cpf, Integer telefone, Integer quantidadeGerenciados) {
        super(nome, cpf, telefone);
        this.quantidadeGerenciados = quantidadeGerenciados;
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

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
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
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", salario='" + getsSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }



}
