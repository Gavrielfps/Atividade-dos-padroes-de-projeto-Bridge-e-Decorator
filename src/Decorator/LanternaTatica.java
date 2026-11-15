package Decorator;
import java.util.EnumSet;

class LanternaTatica extends UpgradeArma {
    LanternaTatica(Arma a) {
        super(a, "Lanterna tática", "Acessório", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getPrecisao() { return limitar(arma.getPrecisao() + 5, 0, 100); }
}
