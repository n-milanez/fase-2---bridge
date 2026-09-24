package abstracao;

import implementacao.FormatoExportacao;

public abstract class Relatorio {

    protected FormatoExportacao exportador;

    public Relatorio(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    public void setExportador(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    public abstract void gerarRelatorio();
}
