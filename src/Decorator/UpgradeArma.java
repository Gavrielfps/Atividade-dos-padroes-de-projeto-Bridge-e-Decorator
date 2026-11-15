package Decorator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

abstract class UpgradeArma implements Arma {
    protected final Arma arma;
    private final String nomeUpgrade;
    private final String slot;

    protected UpgradeArma(Arma arma, String nomeUpgrade, String slot, Set<TipoArma> compativeis) {
        if (!compativeis.contains(arma.getTipo())) {
            throw new UpgradeInvalidoException("Não é possível instalar " + nomeUpgrade + " em "
                    + arma.getTipo().getNome() + ": upgrade incompatível com esse tipo de arma.");
        }
        if (arma.slotOcupado(slot)) {
            throw new UpgradeInvalidoException("Não é possível instalar " + nomeUpgrade
                    + ": o slot '" + slot + "' já está ocupado.");
        }
        this.arma = arma;
        this.nomeUpgrade = nomeUpgrade;
        this.slot = slot;
    }

    protected static int pct(int valor, int percentual) {
        return (int) Math.round(valor * (100 + percentual) / 100.0);
    }

    protected static int limitar(int valor, int min, int max) {
        return Math.max(min, Math.min(max, valor));
    }

    @Override public String getNome() { return arma.getNome(); }
    @Override public TipoArma getTipo() { return arma.getTipo(); }
    @Override public int getDano() { return arma.getDano(); }
    @Override public int getAlcance() { return arma.getAlcance(); }
    @Override public int getPrecisao() { return arma.getPrecisao(); }
    @Override public int getCapacidade() { return arma.getCapacidade(); }
    @Override public double getTempoRecarga() { return arma.getTempoRecarga(); }
    @Override public int getRuido() { return arma.getRuido(); }
    @Override public int getRecuo() { return arma.getRecuo(); }

    @Override
    public boolean slotOcupado(String slotConsultado) {
        return slot.equals(slotConsultado) || arma.slotOcupado(slotConsultado);
    }

    @Override
    public List<String> getUpgrades() {
        List<String> lista = new ArrayList<>(arma.getUpgrades());
        lista.add(nomeUpgrade);
        return lista;
    }
}
