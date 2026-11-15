package Decorator;
import java.util.EnumSet;

class EmpunhaduraVertical extends UpgradeArma {
    EmpunhaduraVertical(Arma a) {
        super(a, "Empunhadura vertical", "Empunhadura", EnumSet.of(TipoArma.METRALHADORA));
    }
    @Override public int getRecuo() { return limitar(arma.getRecuo() - 25, 0, 100); }
    @Override public int getPrecisao() { return limitar(arma.getPrecisao() + 5, 0, 100); }
}

