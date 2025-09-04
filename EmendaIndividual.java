public class EmendaIndividual extends Emenda {
    public EmendaIndividual(int ano, String autor, String numero, boolean possuiApoiador,
                            String localidade, String funcao, String subfuncao,
                            String programaOrcamentario, String acaoOrcamentaria,
                            String planoOrcamentario, String codigo) {
        super(ano, "Individual", autor, numero, possuiApoiador,
              localidade, funcao, subfuncao, programaOrcamentario, acaoOrcamentaria,
              planoOrcamentario, codigo);
    }
}