package Decorator;
import java.util.EnumSet;

class MunicaoIncendiaria extends UpgradeArma {
    MunicaoIncendiaria(Arma a) {
        super(a, "Munição incendiária", "Munição", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getDano() { return pct(arma.getDano(), 15); }
}
