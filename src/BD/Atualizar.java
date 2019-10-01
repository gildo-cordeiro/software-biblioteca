/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static BD.Consulta.log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Estevam
 */
public class Atualizar extends ConexaoBD{
    public static String senha;
    
    public void AtualizaPunicao(String punicao,int quant_punicao, String mat){
        PreparedStatement estado = null; 
        String sql = "update alunos set punicao=?,quant_punicao=? where matricula=\""+mat+"\";";
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, punicao);
            estado.setInt(2, quant_punicao);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Punição alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
     public boolean VerificarSenha(String mat, String senha,int num){
        //passando paramentros de mat e senha
        PreparedStatement estado = null; 
        
        String sql = null;
         if (num == 1) {
            sql = "select senha from alunos where matricula = \""+mat+"\" and senha = \""+senha+"\";";
         }else if(num == 2){
            sql = "select senha from funcionario where mat = \""+mat+"\" and senha = \""+senha+"\";";
         }
        //passando os paramentros dentro das aspas para efetuar a consulta 
        ConexaoDriver();
        try {
            //efetuando consulta
            estado = conectar.prepareStatement(sql);
            ResultSet rs = estado.executeQuery(sql); 
            //se existir aql dado no bd ele retorna true senao false
            if(rs.next()){
                Atualizar.senha = rs.getString("senha");
                return true;
            }else{
                return false;
            }
            // passando as respostas se der errado(false) tratando a exceção
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar", "Advertencia",JOptionPane.WARNING_MESSAGE);
            return false;
        }
     }
    
     public void AlterarSenha(String mat, String senha,int num){
        String sql = null;
        
         if (num == 1) {
            sql = "UPDATE `alunos` SET `senha`=? WHERE `matricula`=\""+mat+"\";";
         }else if(num == 2){
            sql = "UPDATE `funcionario` SET `senha`=? WHERE `mat`=\""+mat+"\";";
         }
        
        PreparedStatement estado = null;
        
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, senha);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
