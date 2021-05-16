import java.math.BigDecimal;
import java.util.Date;

public class Contrato {
    private Integer contratoId;
    private Date dataContrato;
    private BigDecimal precoDiario;
    private Veiculo veiculo;
    private Cliente cliente;
    private BigDecimal valorSeguro;

    public Contrato() {
    }

    public Contrato(Integer contratoId, Date dataContrato, BigDecimal precoDiario, Veiculo veiculo, Cliente cliente, BigDecimal valorSeguro) {
        this.contratoId = contratoId;
        this.dataContrato = dataContrato;
        this.precoDiario = precoDiario;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.valorSeguro = valorSeguro;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "contratoId=" + contratoId +
                ", dataContrato=" + dataContrato +
                ", precoDiario=" + precoDiario +
                ", veiculo=" + veiculo +
                ", cliente=" + cliente +
                ", valorSeguro=" + valorSeguro +
                '}';
    }

    public Integer getContratoId() {
        return contratoId;
    }

    public void setContratoId(Integer contratoId) {
        this.contratoId = contratoId;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public BigDecimal getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(BigDecimal precoDiario) {
        this.precoDiario = precoDiario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
}
