package implementacao;

import java.util.List;

/**
 * LADO DA IMPLEMENTAÇÃO (Bridge).
 * Interface que define as operações de baixo nível de exportação.
 * A abstração (Relatorio) só conhece este contrato, nunca uma classe concreta.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
