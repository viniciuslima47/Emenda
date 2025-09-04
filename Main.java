public class Main {
    public static void main(String[] args) {
        // Emendas Individuais
        EmendaIndividual ind1 = new EmendaIndividual(1, "Dep. João Silva", 2023, "PIX");
        ind1.adicionarDocumento(new DocumentoRelacionado("2023-05-10", "Empenho", 50000));
        ind1.adicionarDocumento(new DocumentoRelacionado("2023-05-20", "Pagamento", 30000));

        EmendaIndividual ind2 = new EmendaIndividual(2, "Sen. Maria Oliveira", 2024, "Definida");
        ind2.adicionarDocumento(new DocumentoRelacionado("2024-03-01", "Empenho", 120000));

        EmendaIndividual ind3 = new EmendaIndividual(3, "Dep. José Souza", 2025, "PIX");
        ind3.adicionarDocumento(new DocumentoRelacionado("2025-01-15", "Liquidação", 75000));

        // Emenda de Bancada
        EmendaBancada b1 = new EmendaBancada(10, "Bancada PE", 2023, "ata01.pdf");
        b1.adicionarParlamentar("Dep. João Silva");

        EmendaBancada b2 = new EmendaBancada(11, "Bancada PE", 2024, "ata02.pdf");
        b2.adicionarParlamentar("Sen. Maria Oliveira");

        EmendaBancada b3 = new EmendaBancada(12, "Bancada PE", 2025, "ata03.pdf");
        b3.adicionarParlamentar("Dep. José Souza");

        // Emenda de Comissão
        EmendaComissao c1 = new EmendaComissao(20, "Comissão Educação", 2023, "linkEdu", "relatorio2023.pdf");
        c1.adicionarParlamentar("Dep. Ana Lima");

        EmendaComissao c2 = new EmendaComissao(21, "Comissão Saúde", 2024, "linkSaude", "relatorio2024.pdf");
        c2.adicionarParlamentar("Sen. Carlos Silva");

        EmendaComissao c3 = new EmendaComissao(22, "Comissão Infraestrutura", 2025, "linkInfra", "relatorio2025.pdf");
        c3.adicionarParlamentar("Dep. João Souza");

        // Emenda de Relator
        EmendaRelator r1 = new EmendaRelator(30, "Relator João Silva", 2023, "João Silva", "Maria Oliveira", "Hospital Recife");
        EmendaRelator r2 = new EmendaRelator(31, "Relator Carlos Souza", 2024, "Carlos Souza", "Ana Lima", "Escola PE");
        EmendaRelator r3 = new EmendaRelator(32, "Relator Pedro Lima", 2025, "Pedro Lima", "José Souza", "Estrada Sertão");

        // Teste de método
        System.out.println("Documentos da Emenda Individual 1:");
        ind1.imprimirDocumentos();
        System.out.println("Total de Pagamentos: R$ " + ind1.calcularTotalPorFase("Pagamento"));

        for (int i = 0; i < 3; i++) {
            
        }
    }
}
