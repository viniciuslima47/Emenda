
public class Principal {

    public static void main(String[] args) {

        // Emendas Individuais
        Emenda e1 = new EmendaIndividual(2020, "3931 - CARLOS VERAS", "0009", false,
                "ÁGUAS BELAS - PE", "Educação", "Educação básica",
                "5011 - EDUCACAO BASICA DE QUALIDADE",
                "0509 - APOIO AO DESENVOLVIMENTO DA EDUCACAO BASICA",
                "APOIO AO DESENVOLVIMENTO DA EDUCACAO BASICA - DESPESAS DIVERSAS",
                "202039310009");
        e1.adicionarDocumento("Doc1", new Documento("05/06/2020", "Empenho", 534941.68));
        e1.adicionarDocumento("Doc2", new Documento("15/10/2020", "Empenho", 271984.18));
        e1.adicionarDocumento("Doc3", new Documento("29/12/2020", "Empenho", 42003.47));
        e1.adicionarDocumento("Doc4", new Documento("30/12/2020", "Empenho", 151054.49));
        e1.adicionarDocumento("Doc5", new Documento("31/12/2020", "Liquidação", 0));
        e1.mostrarDados();

        Emenda e2 = new EmendaIndividual(2025, "4328 - CORONEL MEIRA", "0012", false,
                "SERTÂNIA - PE", "Saúde", "Atenção básica",
                "5119 - ATENCAO PRIMARIA A SAUDE",
                "2E89 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS",
                "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS",
                "202543280012");
        e2.adicionarDocumento("Doc3", new Documento("11/07/2025", "Empenho", 1000000));
        e2.adicionarDocumento("Doc3", new Documento("15/08/2025", "Liquidação", 0));
        e2.adicionarDocumento("Doc4", new Documento("18/08/2025", "Pagamento", 1000000));
        e2.mostrarDados();

        Emenda e3 = new EmendaIndividual(2025, "3813 - FERNANDO MONTEIRO", "0012", false,
                "SERRA TALHADA - PE", "Assistência social", "SERVICOS SOCIOASSISTENCIAIS",
                "5131 - PROTECAO SOCIAL PELO SISTEMA UNICO DE ASSISTENCIA SOCIAL (SUAS)",
                "219G - ESTRUTURACAO DA REDE DE SERVICOS E FORTALECIMENTO DA GESTAO DO SISTEMA UNICO DE ASSISTENCIA SOCIAL (SUAS)",
                "ESTRUTURACAO DA REDE DE SERVICOS E FORTALECIMENTO DA GESTAO DO SISTEMA UNICO DE ASSISTENCIA SOCIAL (SUAS)",
                "202538130012");
        e3.adicionarDocumento("Doc5", new Documento("01/04/2025", "Empenho", 300000.00));
        e3.mostrarDados();

        // Emendas Bancada 
        Emenda b1 = new EmendaBancada(2021,
                "7118 - BANCADA DE PERNAMBUCO",
                "0012",
                false,
                "SERRA TALHADA - PE",
                "Urbanismo",
                "Assistência comunitária",
                "2217 - DESENVOLVIMENTO REGIONAL, TERRITORIAL E URBANO",
                "7K66 - APOIO A PROJETOS DE DESENVOLVIMENTO SUSTENTAVEL LOCAL INTEGRADO",
                "APOIO A PROJETOS DE DESENVOLVIMENTO SUSTENTAVEL LOCAL INTEGRADO - DESPESAS DIVERSAS",
                "202171180012");
        b1.adicionarDocumento("Empenho", new Documento("01/01/2021", "Empenho", 9227203));
        b1.adicionarDocumento("Pagamento", new Documento("01/02/2021", "Pagamento", 8831612));
        b1.mostrarDados();

        Emenda b2 = new EmendaBancada(2023,
                "7118 - BANCADA DE PERNAMBUCO",
                "0010",
                false,
                "RECIFE - PE",
                "Saúde",
                "Assistência hospitalar e ambulatorial",
                "5018 - ATENCAO ESPECIALIZADA A SAUDE",
                "8535 - ESTRUTURACAO DE UNIDADES DE ATENCAO ESPECIALIZADA EM SAUDE",
                "ESTRUTURACAO DE UNIDADES DE ATENCAO ESPECIALIZADA EM SAUDE - DESPESAS DIVERSAS",
                "202371180010");
        b2.adicionarDocumento("Doc7", new Documento("02/04/2025", "Pagamento", 250000));
        b2.mostrarDados();

        Emenda b3 = new EmendaBancada(
                2021,
                "7118 - BANCADA DE PERNAMBUCO",
                "0008",
                false,
                "LIMOEIRO - PE",
                "Comércio e serviços",
                "Turismo",
                "2223 - A HORA DO TURISMO",
                "10V0 - APOIO A PROJETOS DE INFRAESTRUTURA TURISTICA",
                "APOIO A PROJETOS DE INFRAESTRUTURA TURISTICA - DESPESAS DIVERSAS",
                "202171180008"
        );
        b3.adicionarDocumento("Empenho", new Documento("01/01/2021", "Empenho", 9231683));
        b3.adicionarDocumento("Liquidação", new Documento("01/02/2021", "Liquidação", 3500));
        b3.adicionarDocumento("Pagamento", new Documento("01/03/2021", "Pagamento", 2867418.62));
        b3.mostrarDados();

        // Emendas Comissão
        Emenda c1 = new EmendaComissao(
                2020,
                "5024 - COMISSAO DE VIACAO E TRANSPORTES - CVT",
                "0003",
                false,
                "RIO GRANDE DO SUL (UF)",
                "Transporte",
                "Transporte rodoviário",
                "3006 - TRANSPORTE TERRESTRE E TRANSITO",
                "7L04 - ADEQUACAO DE TRECHO RODOVIARIO - PORTO ALEGRE - PELOTAS - NA BR-116/RS",
                "Múltiplo",
                "202050240003"
        );
        c1.adicionarDocumento("Empenho", new Documento("01/01/2020", "Empenho", 20000000));
        c1.adicionarDocumento("Liquidação", new Documento("01/02/2020", "Liquidação", 18914521.46));
        c1.adicionarDocumento("Pagamento", new Documento("01/03/2020", "Pagamento", 955661.05));
        c1.mostrarDados();

        Emenda c2 = new EmendaComissao(
                2016,
                "-99 - RELATOR GERAL",
                "S/I",
                false,
                "IPOJUCA - PE",
                "Educação",
                "Educação básica",
                "2080 - EDUCACAO DE QUALIDADE PARA TODOS",
                "20RP - APOIO A INFRAESTRUTURA PARA A EDUCACAO BASICA",
                "EMENDA DE COMISSAO",
                "REL. GERAL"
        );
        c2.adicionarDocumento("Empenho", new Documento("01/01/2016", "Empenho", 249740));
        c2.mostrarDados();

        Emenda c3 = new EmendaComissao(
                2016,
                "-99 - RELATOR GERAL",
                "S/I",
                false,
                "JABOATÃO DOS GUARARAPES - PE",
                "Educação",
                "Educação básica",
                "2080 - EDUCACAO DE QUALIDADE PARA TODOS",
                "20RP - APOIO A INFRAESTRUTURA PARA A EDUCACAO BASICA",
                "EMENDA DE COMISSAO",
                "REL. GERAL"
        );
        c3.adicionarDocumento("Empenho", new Documento("01/01/2016", "Empenho", 690630));
        c3.adicionarDocumento("Liquidação", new Documento("01/02/2016", "Liquidação", 690630));
        c3.adicionarDocumento("Pagamento", new Documento("01/03/2016", "Pagamento", 0));
        c3.mostrarDados();

        // Emendas Relator
        Emenda r1 = new EmendaRelator(
                2017,
                "S/I - Sem informação",
                "S/I",
                false,
                "CARUARU - PE",
                "Saúde",
                "Administração geral",
                "2015 - FORTALECIMENTO DO SISTEMA UNICO DE SAUDE (SUS)",
                "4525 - APOIO A MANUTENCAO DE UNIDADES DE SAUDE",
                "EMENDA DE RELATOR",
                "S/I"
        );
        r1.adicionarDocumento("Empenho", new Documento("01/01/2017", "Empenho", 200000));
        r1.mostrarDados();

        Emenda r2 = new EmendaRelator(
                2017,
                "S/I - Sem informação",
                "S/I",
                false,
                "PETROLINA - PE",
                "Agricultura",
                "Promoção da produção agropecuária",
                "2077 - AGROPECUARIA SUSTENTAVEL",
                "20ZV - FOMENTO AO SETOR AGROPECUARIO",
                "EMENDA DE RELATOR",
                "S/I"
        );
        r2.adicionarDocumento("Empenho", new Documento("01/01/2017", "Empenho", 2142952.50));
        r2.adicionarDocumento("Liquidação", new Documento("01/02/2017", "Liquidação", 975000));
        r2.adicionarDocumento("Pagamento", new Documento("01/03/2017", "Pagamento", 1167952.50));
        r2.mostrarDados();

        Emenda r3 = new EmendaRelator(
                2017,
                "S/I - Sem informação",
                "S/I",
                false,
                "PETROLINA - PE",
                "Comércio e serviços",
                "Turismo",
                "2076 - DESENVOLVIMENTO E PROMOCAO DO TURISMO",
                "10V0 - APOIO A PROJETOS DE INFRAESTRUTURA TURISTICA",
                "EMENDA DE RELATOR",
                "S/I"
        );
        r3.adicionarDocumento("Empenho", new Documento("01/01/2017", "Empenho", 487500));
        r3.mostrarDados();

    }
}
