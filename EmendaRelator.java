public class EmendaRelator extends Emenda {
    private String relator;
    private String autorOriginal;
    private String beneficiarioFinal;

    public EmendaRelator(int id, String autor, int ano, String relator, String autorOriginal, String beneficiarioFinal) {
        super(id, autor, ano);
        this.relator = relator;
        this.autorOriginal = autorOriginal;
        this.beneficiarioFinal = beneficiarioFinal;
    }
}
