public class Documento {
    private String data;
    private String fase;
    private double valor;

    public Documento(String data, String fase, double valor) {
        this.data = data;
        this.fase = fase;
        this.valor = valor;
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getFase() { return fase; }
    public void setFase(String fase) { this.fase = fase; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public void mostrarDocumento() {
        System.out.println("Data: " + data + " | Fase: " + fase + " | Valor: " + valor);
    }
}
