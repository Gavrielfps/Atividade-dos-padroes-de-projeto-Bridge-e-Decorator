package Decorator;

import java.util.EnumSet;

class FogueteGuiado extends UpgradeArma {
    FogueteGuiado(Arma a) {
        super(a, "Foguete guiado", "Guiagem", EnumSet.of(TipoArma.BAZUCA));
    }
    @Override public int getPrecisao() { return limitar(arma.getPrecisao() + 35, 0, 100); }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga() + 0.5; }
}
