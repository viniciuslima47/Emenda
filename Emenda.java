import java.util.HashMap;

public class Emenda {
    private int ano;
    private String tipoEmenda;
    private String autor;
    private String numero;
    private boolean possuiApoiador;
    private String localidade;
    private String funcao;
    private String subfuncao;
    private String programaOrcamentario;
    private String acaoOrcamentaria;
    private String planoOrcamentario;
    private String codigo;
    private HashMap<String, Documento> documentos;

    public Emenda(int ano, String tipoEmenda, String autor, String numero, boolean possuiApoiador,
                  String localidade, String funcao, String subfuncao, String programaOrcamentario,
                  String acaoOrcamentaria, String planoOrcamentario, String codigo) {
        this.ano = ano;
        this.tipoEmenda = tipoEmenda;
        this.autor = autor;
        this.numero = numero;
        this.possuiApoiador = possuiApoiador;
        this.localidade = localidade;
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programaOrcamentario = programaOrcamentario;
        this.acaoOrcamentaria = acaoOrcamentaria;
        this.planoOrcamentario = planoOrcamentario;
        this.codigo = codigo;
        this.documentos = new HashMap<>();
    }

    // Getters e Setters completos
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getTipoEmenda() { return tipoEmenda; }
    public void setTipoEmenda(String tipoEmenda) { this.tipoEmenda = tipoEmenda; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public boolean isPossuiApoiador() { return possuiApoiador; }
    public void setPossuiApoiador(boolean possuiApoiador) { this.possuiApoiador = possuiApoiador; }

    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }

    public String getSubfuncao() { return subfuncao; }
    public void setSubfuncao(String subfuncao) { this.subfuncao = subfuncao; }

    public String getProgramaOrcamentario() { return programaOrcamentario; }
    public void setProgramaOrcamentario(String programaOrcamentario) { this.programaOrcamentario = programaOrcamentario; }

    public String getAcaoOrcamentaria() { return acaoOrcamentaria; }
    public void setAcaoOrcamentaria(String acaoOrcamentaria) { this.acaoOrcamentaria = acaoOrcamentaria; }

    public String getPlanoOrcamentario() { return planoOrcamentario; }
    public void setPlanoOrcamentario(String planoOrcamentario) { this.planoOrcamentario = planoOrcamentario; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public HashMap<String, Documento> getDocumentos() { return documentos; }
    public void setDocumentos(HashMap<String, Documento> documentos) { this.documentos = documentos; }

    // Métodos existentes
    public void adicionarDocumento(String nome, Documento doc) {
        documentos.put(nome, doc);
    }

    public double calcularTotalPorFase(String fase) {
        double total = 0;
        for (Documento doc : documentos.values()) {
            if (doc.getFase().equalsIgnoreCase(fase)) {
                total += doc.getValor();
            }
        }
        return total;
    }

    public void mostrarDados() {
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de Emenda: " + tipoEmenda);
        System.out.println("Autor: " + autor);
        System.out.println("Número: " + numero);
        System.out.println("Possui Apoiador: " + (possuiApoiador ? "Sim" : "Não"));
        System.out.println("Localidade: " + localidade);
        System.out.println("Função: " + funcao);
        System.out.println("Subfunção: " + subfuncao);
        System.out.println("Programa Orçamentário: " + programaOrcamentario);
        System.out.println("Ação Orçamentária: " + acaoOrcamentaria);
        System.out.println("Plano Orçamentário: " + planoOrcamentario);
        System.out.println("Código: " + codigo);
        System.out.println("Documentos Relacionados:");
        for (Documento doc : documentos.values()) {
            doc.mostrarDocumento();
        }
        System.out.println("Totais por Fase:");
        System.out.println("  Empenho: " + calcularTotalPorFase("Empenho"));
        System.out.println("  Liquidação: " + calcularTotalPorFase("Liquidação"));
        System.out.println("  Pagamento: " + calcularTotalPorFase("Pagamento"));
        System.out.println("------------------------------------------");
    }
}
