package abstracao;

import implementacao.FormatoExportacao;
import java.util.Arrays;
import java.util.List;

/** Abstração refinada: Relatório de Vendas. */
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = Arrays.asList(
                "Produto A - 120 unidades - R$ 12.000,00",
                "Produto B - 80 unidades - R$ 9.600,00",
                "Total do mes: R$ 21.600,00");

        // Delega toda a formatação ao exportador injetado
        exportador.desenharCabecalho("Relatorio de Vendas");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
