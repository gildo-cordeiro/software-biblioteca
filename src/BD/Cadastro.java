/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Estevam
 */
public class Cadastro extends ConexaoBD{
    
    public boolean CadastrarLivroGenero(String ISBN, int genero){
        String sql = "INSERT INTO livrogen(ISBN_Livro,id_Genero) VALUES (?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setString(1, ISBN);
            estado.setInt(2, genero);
            estado.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    
    public void CadastrarAutorLivro(int autor,String ISBN){
        String sql = "INSERT INTO autorlivro(Id_Autor,ISBN_Livro) VALUES (?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setInt(1, autor);
            estado.setString(2, ISBN);
            estado.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir autor", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    public boolean CadastrarAutor(String nome){
        String sql = "INSERT INTO autor(nome) VALUES (?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setString(1, nome);
            estado.execute();
            return true ;
        } catch (SQLException ex) {
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
     public boolean CadastrarLivro(String ISBN, String titulo, int editora){
        String sql = "INSERT INTO livros(ISBN, titulo, editora) VALUES (?,?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, ISBN);
            estado.setString(2, titulo);
            estado.setInt(3, editora);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
            return true;
        } catch (SQLException ex) {
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    
    
    public void CadastrarEditora(String nome){
        
        String sql = "INSERT INTO editora (nome) VALUES (?)";
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1,nome);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Nova Editora cadastrada no sistema");
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar Editora", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão67ui9huywd3fu;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void CadastrarGenero(String tipo){
        
        String sql = "INSERT INTO genero (nome) VALUES (?)";
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1,tipo);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Novo genero adicionado ao acervo");
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar genero", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão67ui9huywd3fu;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    //passa como parametro os dados que devem ser cadastrados
    public void CadastrarFuncionario(String mat, String nome,String senha){
        String sql = "insert into funcionario(mat,nome,senha) values (?,?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setString(1, mat);
            estado.setString(2, nome);
            estado.setString(3, senha);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar;", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    
    public void CadastrarLivros(String nome,String editora){
        
        String sql = "insert into livros values(?,?)";
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1,nome);
            estado.setString(2, editora);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado.");
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar Livro", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão67ui9huywd3fu;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    /*public boolean CadastrarGenero(String nome){
        
        String sql = "insert into genero values(?)";
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1,nome);
            estado.execute();
            return true;
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar Livro", null, JOptionPane.WARNING_MESSAGE);
           return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão67ui9huywd3fu;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }*/
    public void CadastrarEmprestimo(String devolucao,String emprestimo,String MatAlun,String MatFun){
        String sql = "INSERT INTO emprestimos(data_devolucao, data_emprestimos, id_alunos, matFun) VALUES (?,?,?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setString(1, devolucao);
            estado.setString(2, emprestimo);
            estado.setString(3, MatAlun);
            estado.setString(4, MatFun);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Emprestimo realizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar emprestimo", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    
    public void CadastrarEmprestimoLivros(String ISBN,int id){
        String sql = "INSERT INTO livrosemprestimos(id_ISBN, id_Emp) VALUES (?,?)";

        PreparedStatement estado = null;

        ConexaoDriver();

        try {
        estado = conectar.prepareStatement(sql);
            estado.setString(1, ISBN);
            estado.setInt(2, id);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Dados do emrpestimo armazendos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }      
    }
    
    public void CadastrarAluno(String matricula,String nome,String turma,String senha,String email,String punicao,int quant_livros, int quant_punicao){
        
        String sql = "INSERT INTO `alunos`(`matricula`, `nome`, `turma`, `senha`, `email`, `punicao`, `quant_livros`, `quant_punicao`) VALUES (?,?,?,?,?,?,?,?)";
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1,matricula);
            estado.setString(2, nome);
            estado.setString(3, turma);
            estado.setString(4, senha);
            estado.setString(5, email);
            estado.setString(6, punicao);
            estado.setInt(7, quant_livros);
            estado.setInt(8, quant_punicao);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado.");
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuario", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão67ui9huywd3fu;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
