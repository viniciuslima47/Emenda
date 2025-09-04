public class DocumentoRelacionado {
    private String data;
    private String fase; // Empenho, Liquidação ou Pagamento
    private double valor;

    public DocumentoRelacionado(String data, String fase, double valor) {
        this.data = data;
        this.fase = fase;
        this.valor = valor;
    }

    public String getFase() {
        return fase;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Data: " + data + " | Fase: " + fase + " | Valor: R$ " + valor;
    }
}
