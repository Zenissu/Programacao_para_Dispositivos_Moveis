public class Autor {
    // 22 - Crie uma classe Autor que deve ter nome, cpf.
    String nome;
    int cpf;

    public Autor(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Autor: " + nome + ", Cpf: " + cpf);
    }
}
class Editora{
    //23 - Crie uma classe chamada Editora que deve ter nome, endereço e CNPJ.
    String nome;
    String endereco;
    int cnpj;

    public Editora(String nome, String endereco, int cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirDados() {
        System.out.println("Editora: " + nome + ", Endereço: " + endereco + ", CNPJ: " + cnpj);
    }
}
class Livro{
    // 24 - Crie uma classe chamada Livro que deve ter um nome, ano de publicação, autor (que deve ser representado pela classe Autor), editora (que deve ser representada pela classe Editora).
    String nome;
    int anoP;
    Autor autor;
    Editora editora;

    public Livro(String nome, int anoP, Autor autor, Editora editora) {
        this.nome = nome;
        this.anoP = anoP;
        this.autor = autor;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoP() {
        return anoP;
    }

    public void setAnoP(int anoP) {
        this.anoP = anoP;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void exibirDados() {
        System.out.println("\nLivro: " + nome);
        System.out.println("Ano de Publicação: " + anoP);
        autor.exibirDados();
        editora.exibirDados();
    }
}

