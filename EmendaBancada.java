public class EmendaBancada extends Emenda {
    private String[] parlamentaresAssinantes;
    private int qtdParlamentares;
    private String ataReuniao;
    private String parlamentarSugeriu;

    public EmendaBancada(int id, String autor, int ano, String ataReuniao) {
        super(id, autor, ano);
        this.ataReuniao = ataReuniao;
        this.parlamentaresAssinantes = new String[20]; // até 20 parlamentares
        this.qtdParlamentares = 0;
    }

    public void adicionarParlamentar(String nome) {
        if (qtdParlamentares < parlamentaresAssinantes.length) {
            parlamentaresAssinantes[qtdParlamentares] = nome;
            qtdParlamentares++;
        }
    }
}
