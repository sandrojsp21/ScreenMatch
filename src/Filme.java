public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmHoras;
    int duracaoEmMinutos;
    int classificacao;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    double totalDeAvalicoes;
    String genero;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração:  " + duracaoEmHoras + "h " +duracaoEmMinutos+ "m" );
        System.out.println("Classificação: " + classificacao+ " anos");
        System.out.println("Gênero: " + genero);
        //System.out.println("Incluido no plano: " + incluidoNoPlano);

    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }
    double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvalicoes;
    }
}
