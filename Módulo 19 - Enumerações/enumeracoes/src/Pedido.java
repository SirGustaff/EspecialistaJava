public class Pedido {

    private String nomeCliente;
    private double valor;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public StatusPedido cancelar() {
        if (status.podeMudarParaCancelado(valor)) {
            return status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("O pedido não pode ser cancelado");
        }
    }
}
