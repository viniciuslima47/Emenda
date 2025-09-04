public class EmendaBancada extends Emenda {
    public EmendaBancada(int ano, String autor, String numero, boolean possuiApoiador,
                         String localidade, String funcao, String subfuncao,
                         String programaOrcamentario, String acaoOrcamentaria,
                         String planoOrcamentario, String codigo) {
        super(ano, "Bancada", autor, numero, possuiApoiador,
              localidade, funcao, subfuncao, programaOrcamentario, acaoOrcamentaria,
              planoOrcamentario, codigo);
    }
}