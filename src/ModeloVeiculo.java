public class ModeloVeiculo {
    private Integer modeloId;
    private MarcaVeiculo marca;
    private String nome;
    private String descricao;

    public ModeloVeiculo() {
    }

    public ModeloVeiculo(Integer modeloId, MarcaVeiculo marca, String nome, String descricao) {
        this.modeloId = modeloId;
        this.marca = marca;
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ModeloVeiculo{" +
                "modeloId=" + modeloId +
                ", marca=" + marca +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Integer getModeloId(){
        return modeloId;
    }
    public void setModeloId (Integer modeloId){
        this.modeloId = modeloId;
    }
    public MarcaVeiculo getMarca(){
        return marca;
    }
    public void setMarca (MarcaVeiculo marca){
        this.marca = marca;
    }
    public String getNome(){
        return nome;
     }
     public void setNome (String nome){
        this.nome = nome;
     }
     public String getDescricao(){
        return descricao;
     }
     public void setDescricao (String descricao){
        this.descricao = descricao;
     }
}
