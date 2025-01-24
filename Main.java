package NinjaKonoha;

public class Main {
    public static void main(String[] args) {
        NinjaBasico konohamaru = new NinjaBasico("Konohamaru", 12, TipoHabilidade.NINJUTSU);
        NinjaAvancado shikaku = new NinjaAvancado("Shikaku Nara", 41, TipoHabilidade.NINJUTSU, "Estrategista");

        konohamaru.mostrarInformacoes();
        konohamaru.executarHabilidade();

        shikaku.mostrarInformacoes();
        shikaku.executarHabilidade();
    }
}
