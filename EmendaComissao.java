public class EmendaComissao extends Emenda {
    private String linkComissao;
    private String[] parlamentaresComissao;
    private int qtdParlamentares;
    private String relatorioAtividades;
    private String parlamentarSugeriu;

    public EmendaComissao(int id, String autor, int ano, String linkComissao, String relatorioAtividades) {
        super(id, autor, ano);
        this.linkComissao = linkComissao;
        this.relatorioAtividades = relatorioAtividades;
        this.parlamentaresComissao = new String[20];
        this.qtdParlamentares = 0;
    }

    public void adicionarParlamentar(String nome) {
        if (qtdParlamentares < parlamentaresComissao.length) {
            parlamentaresComissao[qtdParlamentares] = nome;
            qtdParlamentares++;
        }
    }
}
