public class EmendaIndividual extends Emenda {
    private String tipoTransferencia; // "Definida" ou "PIX"

    public EmendaIndividual(int id, String autor, int ano, String tipoTransferencia) {
        super(id, autor, ano);
        this.tipoTransferencia = tipoTransferencia;
    }
}
