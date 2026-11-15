package Decorator;
import java.util.*;


public class Main {

    static void exibir(Arma a) {
        System.out.println("=== " + a.getNome() + " ===");
        System.out.println("Upgrades : " + (a.getUpgrades().isEmpty() ? "nenhum" : String.join(", ", a.getUpgrades())));
        System.out.printf(Locale.US,
                "Dano: %d | Alcance: %dm | Precisão: %d | Pente: %d | Recarga: %.2fs | Ruído: %d | Recuo: %d%n%n",
                a.getDano(), a.getAlcance(), a.getPrecisao(), a.getCapacidade(),
                a.getTempoRecarga(), a.getRuido(), a.getRecuo());
    }

    static void tentar(String descricao, java.util.function.Supplier<Arma> montagem) {
        try {
            montagem.get();
            System.out.println("✅ " + descricao);
        } catch (UpgradeInvalidoException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Arma pistola = new CargaRapida(new PenteEstendido(new Mira(new Silenciador(new Pistola()))));
        exibir(pistola);

        Arma bazuca = new CargaRapida(new FogueteGuiado(new OgivaFragmentacao(new Mira(new Bazuca()))));
        exibir(bazuca);

        Arma metralhadora = new PenteEstendido(new MunicaoPerfurante(new CanoLongo(
                new CompensadorRecuo(new EmpunhaduraVertical(new Metralhadora())))));
        exibir(metralhadora);

        System.out.println("--- Tentativas inválidas ---");
        tentar("Silenciador na Bazuca", () -> new Silenciador(new Bazuca()));
        tentar("Pente estendido na Bazuca", () -> new PenteEstendido(new Bazuca()));
        tentar("Ogiva de fragmentação na Pistola", () -> new OgivaFragmentacao(new Pistola()));
        tentar("Empunhadura vertical na Pistola", () -> new EmpunhaduraVertical(new Pistola()));
        tentar("Munição incendiária + perfurante",
                () -> new MunicaoIncendiaria(new MunicaoPerfurante(new Pistola())));
        tentar("Silenciador + compensador de recuo",
                () -> new Silenciador(new CompensadorRecuo(new Pistola())));
        tentar("Duas miras", () -> new Mira(new Mira(new Metralhadora())));
    }
}