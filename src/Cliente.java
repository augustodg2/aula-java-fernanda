public class Cliente {
    private Integer clienteId;
    private String nome;
    private String endereco;
    private String cpf;

    public Cliente(){
    }

    public Cliente(Integer clienteId, String nome, String endereco, String cpf){
        this.clienteId = clienteId;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId=" + clienteId +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void setClientId(Integer clienteId){
        this.clienteId = clienteId;
    }

    public Integer getClienteId(){
        return clienteId;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
