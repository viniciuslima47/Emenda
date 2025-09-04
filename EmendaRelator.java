public class EmendaRelator extends Emenda {
    public EmendaRelator(int ano, String autor, String numero, boolean possuiApoiador,
                         String localidade, String funcao, String subfuncao,
                         String programaOrcamentario, String acaoOrcamentaria,
                         String planoOrcamentario, String codigo) {
        super(ano, "Relator", autor, numero, possuiApoiador,
              localidade, funcao, subfuncao, programaOrcamentario, acaoOrcamentaria,
              planoOrcamentario, codigo);
    }
}