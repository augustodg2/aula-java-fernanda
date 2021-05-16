public class Veiculo {
    private Integer veiculoId;
    private MarcaVeiculo marca;
    private ModeloVeiculo modelo;
    private String descricao;
    private String cor;
    private String placa;

    public Integer getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Integer veiculoId) {
        this.veiculoId = veiculoId;
    }

    public MarcaVeiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculo marca) {
        this.marca = marca;
    }

    public ModeloVeiculo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public Veiculo(Integer veiculoId, MarcaVeiculo marca, ModeloVeiculo modelo, String descricao, String cor, String placa) {
        this.veiculoId = veiculoId;
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
        this.cor = cor;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "veiculoId=" + veiculoId +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", descricao='" + descricao + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public Veiculo() {
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
