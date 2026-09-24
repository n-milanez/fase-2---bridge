package implementacao;

import java.util.List;

/** Implementador concreto: exporta o relatório no formato Excel (XLSX). */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[XLSX] Planilha criada | Celula A1: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        int linha = 2;
        for (String item : dados) {
            System.out.println("[XLSX] Celula A" + linha + ": " + item);
            linha++;
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[XLSX] Arquivo relatorio.xlsx finalizado.");
    }
}
