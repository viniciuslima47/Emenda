public abstract class Emenda {
    protected int id;
    protected String autor;
    protected int ano;
    protected DocumentoRelacionado[] documentos;
    protected int qtdDocs;

    public Emenda(int id, String autor, int ano) {
        this.id = id;
        this.autor = autor;
        this.ano = ano;
        this.documentos = new DocumentoRelacionado[10]; // até 10 docs
        this.qtdDocs = 0;
    }

    public void adicionarDocumento(DocumentoRelacionado doc) {
        if (qtdDocs < documentos.length) {
            documentos[qtdDocs] = doc;
            qtdDocs++;
        }
    }

    public double calcularTotalPorFase(String fase) {
        double total = 0;
        for (int i = 0; i < qtdDocs; i++) {
            if (documentos[i].getFase().equalsIgnoreCase(fase)) {
                total += documentos[i].getValor();
            }
        }
        return total;
    }

    public void imprimirDocumentos() {
        for (int i = 0; i < qtdDocs; i++) {
            System.out.println(documentos[i].toString());
        }
    }
}
