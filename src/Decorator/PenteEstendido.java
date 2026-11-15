package Decorator;
import java.util.EnumSet;

class PenteEstendido extends UpgradeArma {
    PenteEstendido(Arma a) {
        super(a, "Pente estendido", "Carregador", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getCapacidade() { return arma.getCapacidade() * 2; }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga() + 0.4; }
}
