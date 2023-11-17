package poo;

import poo.dao.PessoaDAO;
import poo.model.Pessoa;

public class Main {
    
    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAO();

        // Criando e salvando um usuário
       
        Pessoa pessoa = new Pessoa("Markin", "markin@email.com");
        pessoaDAO.salvarPessoa(pessoa);

        // Recuperando e atualizando o usuário
        Pessoa pessoaEncontrada = pessoaDAO.getPessoaById(pessoa.getId());
        System.out.println("Pessoa encontrada: " + pessoaEncontrada);

        pessoaEncontrada.setEmail("jota.2@email.com");
        pessoaDAO.atualizarPessoa(pessoaEncontrada);

        

        // Fechando a sessão do Hibernate
        pessoaDAO.close();
    }

}