package Decorator;
import java.util.EnumSet;

class OgivaFragmentacao extends UpgradeArma {
    OgivaFragmentacao(Arma a) {
        super(a, "Ogiva de fragmentação", "Ogiva", EnumSet.of(TipoArma.BAZUCA));
    }
    @Override public int getDano() { return pct(arma.getDano(), 40); }
    @Override public int getRecuo() { return limitar(arma.getRecuo() + 10, 0, 100); }
}
