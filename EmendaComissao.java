public class EmendaComissao extends Emenda {
    public EmendaComissao(int ano, String autor, String numero, boolean possuiApoiador,
                          String localidade, String funcao, String subfuncao,
                          String programaOrcamentario, String acaoOrcamentaria,
                          String planoOrcamentario, String codigo) {
        super(ano, "Comissão", autor, numero, possuiApoiador,
              localidade, funcao, subfuncao, programaOrcamentario, acaoOrcamentaria,
              planoOrcamentario, codigo);
    }
}