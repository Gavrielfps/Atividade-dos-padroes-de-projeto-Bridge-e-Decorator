package Decorator;
import java.util.EnumSet;

class CanoLongo extends UpgradeArma {
    CanoLongo(Arma a) {
        super(a, "Cano longo", "Cano", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getAlcance() { return pct(arma.getAlcance(), 25); }
    @Override public int getPrecisao() { return limitar(arma.getPrecisao() + 8, 0, 100); }
}