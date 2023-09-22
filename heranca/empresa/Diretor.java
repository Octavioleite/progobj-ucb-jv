package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Diretor extends Funcionario {
    private Integer quantidadeGerencias;


    public Diretor() {
    }

    public Diretor(String nome, Integer cpf, Integer telefone, Integer quantidadeGerencias) {
        super(nome, cpf, telefone);
        this.quantidadeGerencias = quantidadeGerencias;
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

    public Integer getQuantidadeGerencias() {
        return this.quantidadeGerencias;
    }

    public void setQuantidadeGerencias(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }
    public BigDecimal getsSalario(){
        return new BigDecimal(1000.00);
}

public BigDecimal getBonificacao (){
   return getsSalario().multiply(new BigDecimal(0.5));

}


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerencias='" + getQuantidadeGerencias() + "'" +
            ", salario='" + getsSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }

}
