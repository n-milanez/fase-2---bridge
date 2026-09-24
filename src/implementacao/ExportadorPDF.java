package implementacao;

import java.util.List;

/** Implementador concreto: exporta o relatório no formato PDF. */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Cabecalho: " + titulo.toUpperCase());

    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String linha : dados) {
            System.out.println("[PDF] Pagina 1 | " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo relatorio.pdf finalizado.");
    }
}
