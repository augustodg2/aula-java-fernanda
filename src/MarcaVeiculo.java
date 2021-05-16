public class MarcaVeiculo {
    private Integer marcaId;
    private String nome;

    public MarcaVeiculo(){
    }

    public  MarcaVeiculo(Integer marcaId, String nome){
        this.marcaId =  marcaId;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "MarcaVeiculo{" +
                "marcaId=" + marcaId +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Integer getMarcaId(){
        return marcaId;
    }

    public void setMarcaId(Integer marcaId){
        this.marcaId = marcaId;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
}
