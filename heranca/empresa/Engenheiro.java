package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engenheiro extends Funcionario {
    
    
    private String crea;
    private String projeto;


    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto) {
        super(nome, telefone, cpf);
        this.crea = crea;
        this.projeto = projeto;
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

    public void setCpf(String string) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    public BigDecimal getsSalario(){
            return new BigDecimal(10000.00);
    }

    public BigDecimal getBonificacao (){
       return getsSalario().multiply(new BigDecimal(0.15));

    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getsSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }

}
