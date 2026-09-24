package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;

/**
 * CLIENTE / Script de validação.
 * É o único lugar que conhece as classes concretas e faz a injeção
 * das dependências nas abstrações.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("1) Relatorio de Vendas em PDF");
        Relatorio vendas = new RelatorioVendas(new ExportadorPDF());
        vendas.gerarRelatorio();

        System.out.println();
        System.out.println("2) Mesmo Relatorio de Vendas alterado em runtime para Excel ");
        vendas.setExportador(new ExportadorExcel());
        vendas.gerarRelatorio();

        System.out.println();
        System.out.println("3) Relatorio de RH em HTML ");
        Relatorio rh = new RelatorioRH(new ExportadorHTML());
        rh.gerarRelatorio();
    }
}
