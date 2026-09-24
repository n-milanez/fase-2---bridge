package abstracao;

import implementacao.FormatoExportacao;
import java.util.Arrays;
import java.util.List;

/** Abstração refinada: Relatório de Desempenho de RH. */
public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = Arrays.asList(
                "Equipe Desenvolvimento - Meta atingida: 95%",
                "Equipe Suporte - Meta atingida: 88%",
                "Turnover trimestral: 3,2%");

        // Delega toda a formatação ao exportador injetado
        exportador.desenharCabecalho("Relatorio de Desempenho de RH");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
