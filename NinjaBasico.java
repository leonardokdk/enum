package NinjaKonoha;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
    }
        @Override
    public void executarHabilidade() {

    }
}
