package BD;


import Classes.aluno;
import Classes.livro;
import Classes.autor;
import Classes.funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Consulta extends ConexaoBD {
    public static String log;
    public static int puni;
    
    public ArrayList<livro> idEditora(String nome){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT idEditora FROM editora WHERE nome=\""+nome+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setIdEditora(result.getInt("idEditora"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar Editora");
        }
        return List;
    }
    
    public ArrayList<livro> idGenero(String nome){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT idGenero FROM genero WHERE nome=\""+nome+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setIdGenero(result.getInt("idGenero"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar Genero");
        }
        return List;
    }
    public ArrayList<livro> ConsultarGenero(){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT *FROM genero";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setIdGenero(result.getInt("idGenero"));
                at.setGenero(result.getString("nome"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar Editora");
        }
        return List;
    }
    public ArrayList<autor> ConsultarAutorNome(){
        ArrayList<autor> List = new ArrayList<>();
        String sql = "SELECT *FROM autor";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                autor at = new autor();
                at.setId(result.getInt("idAutor"));
                at.setNome(result.getString("nome"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar Editora");
        }
        return List;
    }
        
    public ArrayList<livro> ConsultarEditora(){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT *FROM editora";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setIdEditora(result.getInt("idEditora"));
                at.setEditora(result.getString("nome"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar Editora");
        }
        return List;
    }
    
    public ArrayList<funcionario> ConsultarFuncionario(){
        ArrayList<funcionario> List = new ArrayList<>();
         
        String sql = "SELECT mat FROM funcionario ORDER BY mat DESC LIMIT 1";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                funcionario at = new funcionario();
                at.setMat(result.getString("mat"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar");
        }
        return List;
    }
    public ArrayList<autor> ConsultarAutor(){
        ArrayList<autor> List = new ArrayList<>();
         
        String sql = "SELECT idAutor FROM autor ORDER BY idAutor DESC LIMIT 1";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                autor at = new autor();
                at.setId(result.getInt("idAutor"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar");
        }
        return List;
    }
    
    public ArrayList<autor> idAutor(String nome){
        ArrayList<autor> List = new ArrayList<>();
         
        String sql = "SELECT idAutor FROM autor WHERE nome=\""+nome+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                autor at = new autor();
                at.setId(result.getInt("idAutor"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar");
        }
        return List;
    }
    
    public ArrayList<livro> EmprestimoID(String data){
        ArrayList<livro> List = new ArrayList<>();
        //passando paramentros de mat e senha
        PreparedStatement estado = null; 
        String sql = "SELECT idEmprestimos FROM emprestimos ORDER BY idEmprestimos DESC LIMIT 1;";
        //passando os paramentros dentro das aspas para efetuar a consulta 
        ConexaoDriver();
        try {
            //efetuando consulta
            estado = conectar.prepareStatement(sql);
            ResultSet rs = estado.executeQuery(sql); 
            //se existir aql dado no bd ele retorna true senao false
            if(rs.next()){
                livro at = new livro();
                at.setId(rs.getInt("idEmprestimos"));
                List.add(at);
            }
            // passando as respostas se der errado(false) tratando a exceção
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão", "Advertencia",JOptionPane.WARNING_MESSAGE);;
            }
        }
        return List;
    }
    
    public boolean EntraLogin(String mat, String senha){
    //passando paramentros de mat e senha
        PreparedStatement estado = null; 
        String sql = "select mat from funcionario where mat = \""+mat+"\" and senha = \""+senha+"\";";;
        //passando os paramentros dentro das aspas para efetuar a consulta 
        ConexaoDriver();
        try {
            //efetuando consulta
            estado = conectar.prepareStatement(sql);
            ResultSet rs = estado.executeQuery(sql); 
            //se existir aql dado no bd ele retorna true senao false
            if(rs.next()){
                log = rs.getString("mat");
                return true;
            }else{
                return false;
            }
            // passando as respostas se der errado(false) tratando a exceção
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar", "Advertencia",JOptionPane.WARNING_MESSAGE);
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão", "Advertencia",JOptionPane.WARNING_MESSAGE);;
                return false;
            }
        }
    }
    
    
    public int SubtraiDatas(){
    //passando paramentros de mat e senha
        PreparedStatement estado = null; 
        String sql = "SELECT punicao FROM alunos";
        //passando os paramentros dentro das aspas para efetuar a consulta 
        ConexaoDriver();
        try {
            //efetuando consulta
            estado = conectar.prepareStatement(sql);
            ResultSet rs = estado.executeQuery(sql); 
            //se existir aql dado no bd ele retorna true senao false
            while (rs.next()){
                return rs.getInt("punicao");
            }
            // passando as respostas se der errado(false) tratando a exceção
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar", "Advertencia",JOptionPane.WARNING_MESSAGE);
            return 0;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
        }
        return 0;
    }
    public ArrayList<livro> ConsultarLivro(){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT l.titulo AS `titulo`, GROUP_CONCAT(g.nome) AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a,"
                + "editora e, autorlivro atl, livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro AND atl.Id_Autor=a.idAutor AND "
                + "lg.id_Genero=g.idGenero AND lg.ISBN_Livro=l.ISBN GROUP BY l.titulo;";
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro gen = new livro();
                gen.setNome(result.getString("titulo"));
                gen.setGenero(result.getString("genero"));
                gen.setEditora(result.getString("editora"));
                gen.setAutor(result.getString("autor"));
                List.add(gen);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        return List;
    }
    
    public ArrayList<livro> ConsultarLivro(String nome, String editora, String genero, String autor, int indice){
        ArrayList<livro> List = new ArrayList<>();
        String sql;
        switch (indice) {
            case 0:
                sql = "SELECT l.titulo AS `titulo`, g.nome AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a, editora e, "
                        + "autorlivro atl, livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro "
                        + "AND atl.Id_Autor=a.idAutor AND lg.id_Genero=g.idGenero AND lg.ISBN_Livro=l.ISBN "
                        + "AND l.titulo LIKE \""+nome+"%\";";
                break;
            case 1:
                sql = "SELECT l.titulo AS `titulo`, g.nome AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a, editora e, autorlivro atl, "
                        + "livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro AND "
                        + "atl.Id_Autor=a.idAutor AND lg.id_Genero=g.idGenero AND lg.ISBN_Livro=l.ISBN "
                        + "AND e.nome LIKE \""+editora+"%\";";
                break;
            case 2:
                sql = "SELECT l.titulo AS `titulo`, g.nome AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a, editora e, autorlivro atl, "
                        + "livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro "
                        + "AND atl.Id_Autor=a.idAutor AND lg.id_Genero=g.idGenero AND "
                        + "lg.ISBN_Livro=l.ISBN AND g.nome LIKE \""+genero+"%\";";
                break;
            case 3:
                sql = "SELECT l.titulo AS `titulo`, g.nome AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a, editora e, autorlivro atl, "
                        + "livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro "
                        + "AND atl.Id_Autor=a.idAutor AND lg.id_Genero=g.idGenero AND "
                        + "lg.ISBN_Livro=l.ISBN AND a.nome LIKE \""+autor+"%\";";
                break;
            default:
                sql = "SELECT l.titulo AS `titulo`, GROUP_CONCAT(g.nome) AS `genero`, a.nome AS `autor`, e.nome AS `editora`FROM livros l, genero g, autor a, "
                        + "editora e, autorlivro atl, livrogen lg WHERE e.idEditora=l.editora AND l.ISBN=atl.ISBN_Livro AND atl.Id_Autor=a.idAutor AND "
                        + "lg.id_Genero=g.idGenero AND lg.ISBN_Livro=l.ISBN GROUP BY l.titulo";
                break;
        }
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro gen = new livro();
                gen.setNome(result.getString("titulo"));
                gen.setGenero(result.getString("genero"));
                gen.setEditora(result.getString("editora"));
                gen.setAutor(result.getString("autor"));
                List.add(gen);
            }
        } catch (SQLException ex) {
        }
        return List;
    }
    
    public ArrayList<livro> ConsultarLivro(String nome){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "SELECT ISBN FROM livros WHERE titulo=\""+nome+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setISBN(result.getString("ISBN"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }
        return List;
    }
    public ArrayList<autor> ConsultarLivroAutor(String id){
        ArrayList<autor> List = new ArrayList<>();
        String sql = "select livros.titulo, autor.nome from AutorLivro,autor,livros where AutorLivro.Id_Autor=autor.idAutor and autorlivro.ISBN_Livro=livros.ISBN AND livros.ISBN=\""+id+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {                
                autor at = new autor();
                at.setNome(result.getString("autor.nome"));
                at.setTituloLivro(result.getString("livros.titulo"));
                List.add(at);
            }else{
                JOptionPane.showMessageDialog(null, "ISBN incorreto");
            }
        } catch (SQLException ex) {
        }
        return List;
    }
    public ArrayList<autor> ConsultarLivroEmprestado(String mat){
        ArrayList<autor> List = new ArrayList<>();
        String sql = "select emprestimos.data_emprestimos,emprestimos.idEmprestimos,livrosemprestimos.id_ISBN,emprestimos.data_devolucao,livros.titulo, autor.nome "
                + "from emprestimos,livros,livrosemprestimos,autor,AutorLivro where "
                + "AutorLivro.Id_Autor=autor.idAutor and AutorLivro.ISBN_Livro=livros.ISBN and "
                + "livrosemprestimos.id_ISBN=livros.ISBN and emprestimos.idEmprestimos=livrosemprestimos.id_Emp "
                + "and emprestimos.id_alunos=\""+mat+"\";";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                autor at = new autor();
                at.setDataEmp(result.getString("emprestimos.data_emprestimos"));
                at.setId(result.getInt("emprestimos.idEmprestimos"));
                at.setISBN(result.getString("livrosemprestimos.id_ISBN"));
                at.setNome(result.getString("autor.nome"));
                at.setTituloLivro(result.getString("livros.titulo"));
                at.setDevolucao(result.getString("emprestimos.data_devolucao"));
                List.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Matricula incorreta");
        }
        return List;
    }
    
    public ArrayList<livro> ConsultarGenero(String id){
        ArrayList<livro> List = new ArrayList<>();
        String sql = "select id from genero where ";
               
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                livro at = new livro();
                at.setNome(result.getString(""));
                List.add(at);
            }
        } catch (SQLException ex) {
        }
        return List;
    }
    
    public ArrayList<aluno> ConsultarAluno(String mat, String senha){
        ArrayList<aluno> List = new ArrayList<>();
        String sql = "select *from alunos where matricula=\""+mat+"\" and senha=\""+senha+"\";";
        
        PreparedStatement estado;
        ConexaoDriver();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {                
                aluno al = new aluno();
                al.setMat(result.getString("matricula"));
                al.setNome(result.getString("nome"));
                al.setTurma(result.getString("turma"));
                al.setSenha(result.getString("senha"));
                al.setEmail(result.getString("email"));
                al.setPunicao(result.getString("punicao"));
                al.setQuant_livros(result.getInt("quant_livros"));
                al.setQuant_punicao(result.getInt("quant_punicao"));
                List.add(al);
            }else{
             JOptionPane.showMessageDialog(null, "Matricula ou senha incorretos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado");
        }
        return List;

    }
}
