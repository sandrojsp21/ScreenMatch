public class DemonSlayer {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();
        novoFilme.nome = "Demon Slayer - Mugen Train";
        novoFilme.anoDeLancamento = 2020;
        novoFilme.duracaoEmHoras = 2;
        novoFilme.classificacao = 14;
        novoFilme.genero = "Ação/Fantasia";
        novoFilme.incluidoNoPlano = true;

        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(10);
        novoFilme.avalia(8.2);
        novoFilme.avalia(8.5);

        System.out.println("Média de avaliações do filme: "+novoFilme.pegaMedia());

    }

}
