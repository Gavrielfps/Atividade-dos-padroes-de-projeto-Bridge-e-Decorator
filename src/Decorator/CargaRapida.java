package Decorator;
import java.util.EnumSet;

class CargaRapida extends UpgradeArma {
    CargaRapida(Arma a) {
        super(a, "Carga rápida", "Recarga", EnumSet.allOf(TipoArma.class));
    }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga() * 0.6; }
}
