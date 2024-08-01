public class OnePiece {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();
        novoFilme.nome = "One Piece: Stampede";
        novoFilme.anoDeLancamento = 2019;
        novoFilme.duracaoEmHoras = 1;
        novoFilme.duracaoEmMinutos = 41;
        novoFilme.classificacao = 12;
        novoFilme.genero = "Ação/Aventura";
        novoFilme.incluidoNoPlano = false;

        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(7.5);
        novoFilme.avalia(8);
        novoFilme.avalia(7.9);

        System.out.println("Média de avaliações do filme: " +novoFilme.pegaMedia());
    };

}
