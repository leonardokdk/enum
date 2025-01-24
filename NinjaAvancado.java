package NinjaKonoha;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
        System.out.println("especialidade = " + especialidade);

    }
    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + "e minha especialidade é " + especialidade);
    }
}
