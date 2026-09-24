# Roteiro do vídeo de defesa técnica (3 a 5 minutos)

**Antes de gravar:** abra lado a lado (ou em abas) o diagrama de classes, o diagrama de sequência, a IDE com o projeto e um terminal na raiz do projeto. Compartilhe a tela inteira.

## 0:00 – 0:30 | Abertura
"Olá, somos [nomes da dupla], e vamos apresentar a aplicação do Padrão Bridge no módulo de relatórios da TechFatec. Mostraremos os diagramas, a estrutura do código, a injeção de dependência e a execução do projeto."

## 0:30 – 1:15 | Problema
- Legado: só Relatório de Vendas em PDF.
- Novo requisito: Relatório de RH + PDF, Excel e HTML para todos.
- Sem Bridge: 2 × 3 = 6 subclasses, crescendo a cada novo relatório ou formato (explosão de subclasses).

## 1:15 – 2:15 | Diagrama de classes (mostrar `classesdiagr.png`)
- Lado da abstração: `Relatorio` (abstrata, atributo protegido `exportador`, método `gerarRelatorio()`), `RelatorioVendas` e `RelatorioRH`.
- Lado da implementação: interface `FormatoExportacao` (`desenharCabecalho`, `desenharCorpo`, `finalizarArquivo`) e `ExportadorPDF`, `ExportadorExcel`, `ExportadorHTML`.
- Apontar o losango da **agregação** entre `Relatorio` e `FormatoExportacao`: é a "ponte".
- Mencionar o `setExportador`, que permite a troca em tempo de execução.
- Aberto/Fechado: novo relatório ou formato = nova classe, sem alterar as existentes.

## 2:15 – 2:50 | Diagrama de sequência (mostrar `Diagrama_Sequencia_Bridge.png`)
- `Main` cria o relatório passando o exportador, chama `gerarRelatorio()`.
- O relatório delega ao exportador: cabeçalho, corpo, finalização.
- Ler a nota do diagrama: o relatório delega toda a formatação ao exportador injetado.

## 2:50 – 3:40 | Código e estrutura de diretórios (mostrar a IDE)
- Mostrar as pastas `src/abstracao`, `src/implementacao` e `src/cliente`.
- Abrir `Relatorio.java`: o exportador chega **pelo construtor**; não existe `new` de exportador concreto nas classes de relatório.
- Abrir `Main.java`: só o cliente conhece as classes concretas e injeta as dependências.

## 3:40 – 4:40 | Execução (terminal)
Rodar:
```
javac -encoding UTF-8 -d out src/abstracao/*.java src/implementacao/*.java src/cliente/*.java
java -cp out cliente.Main
```
Comentar cada bloco da saída: (1) Vendas em PDF, (2) o **mesmo** objeto de vendas agora em Excel, (3) RH em HTML.

## 4:40 – 5:00 | Encerramento
"O Bridge nos deu 5 classes no lugar de 6, extensão sem modificação e troca de formato em runtime. Obrigado!"

## Checklist de entrega
- [ ] Vídeo entre 3 e 5 minutos, com tela compartilhada mostrando algoritmo e os dois diagramas
- [ ] Vídeo publicado em local público
- [ ] Link testado em aba anônima
- [ ] Link enviado na atividade até 27/09
