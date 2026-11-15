package Decorator;
import java.util.EnumSet;

class Silenciador extends UpgradeArma {
    Silenciador(Arma a) {
        super(a, "Silenciador", "Boca do cano", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getRuido() { return limitar(arma.getRuido() - 50, 0, 100); }
    @Override public int getDano() { return pct(arma.getDano(), -5); }
    @Override public int getAlcance() { return pct(arma.getAlcance(), -10); }
}
