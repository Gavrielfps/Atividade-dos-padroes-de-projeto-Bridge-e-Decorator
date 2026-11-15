package Decorator;
import java.util.EnumSet;

class Mira extends UpgradeArma {
    Mira(Arma a) {
        super(a, "Mira", "Óptica", EnumSet.allOf(TipoArma.class));
    }
    @Override public int getPrecisao() { return limitar(arma.getPrecisao() + 20, 0, 100); }
    @Override public int getAlcance() { return pct(arma.getAlcance(), 20); }
}