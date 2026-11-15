package Decorator;
import java.util.EnumSet;

class MunicaoPerfurante extends UpgradeArma {
    MunicaoPerfurante(Arma a) {
        super(a, "Munição perfurante", "Munição", EnumSet.of(TipoArma.PISTOLA, TipoArma.METRALHADORA));
    }
    @Override public int getDano() { return pct(arma.getDano(), 20); }
}
