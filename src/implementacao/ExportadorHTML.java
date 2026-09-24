package implementacao;

import java.util.List;

/** Implementador concreto: exporta o relatório no formato HTML. */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <html><body><h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <ul>");
        for (String item : dados) {
            System.out.println("[HTML]   <li>" + item + "</li>");
        }
        System.out.println("[HTML] </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html> | Arquivo relatorio.html finalizado.");
    }
}
