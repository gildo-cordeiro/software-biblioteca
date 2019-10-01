
package Classes;

public class autor {
    private int id;
    private String nome;
    private String sobrenome;
    private String TituloLivro;
    private String devolucao;
    private String ISBN;
    private String DataEmp;

    public String getDataEmp() {
        return DataEmp;
    }

    public void setDataEmp(String DataEmp) {
        this.DataEmp = DataEmp;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public String getTituloLivro() {
        return TituloLivro;
    }

    public void setTituloLivro(String TituloLivro) {
        this.TituloLivro = TituloLivro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
}
