package Decorator;
import java.util.EnumSet;

class CompensadorRecuo extends UpgradeArma {
    CompensadorRecuo(Arma a) {
        super(a, "Compensador de recuo", "Boca do cano", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getRecuo() { return limitar(arma.getRecuo() - 20, 0, 100); }
    @Override public int getRuido() { return limitar(arma.getRuido() + 10, 0, 100); }
}

