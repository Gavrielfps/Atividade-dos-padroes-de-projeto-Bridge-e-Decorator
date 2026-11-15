package Decorator;
import java.util.ArrayList;
import java.util.List;

abstract class ArmaBase implements Arma {
    private final TipoArma tipo;
    private final String nome;
    private final int dano, alcance, precisao, capacidade, ruido, recuo;
    private final double tempoRecarga;

    protected ArmaBase(TipoArma tipo, String nome, int dano, int alcance, int precisao,
                       int capacidade, double tempoRecarga, int ruido, int recuo) {
        this.tipo = tipo;
        this.nome = nome;
        this.dano = dano;
        this.alcance = alcance;
        this.precisao = precisao;
        this.capacidade = capacidade;
        this.tempoRecarga = tempoRecarga;
        this.ruido = ruido;
        this.recuo = recuo;
    }

    @Override public String getNome() { return nome; }
    @Override public TipoArma getTipo() { return tipo; }
    @Override public int getDano() { return dano; }
    @Override public int getAlcance() { return alcance; }
    @Override public int getPrecisao() { return precisao; }
    @Override public int getCapacidade() { return capacidade; }
    @Override public double getTempoRecarga() { return tempoRecarga; }
    @Override public int getRuido() { return ruido; }
    @Override public int getRecuo() { return recuo; }
    @Override public boolean slotOcupado(String slot) { return false; }
    @Override public List<String> getUpgrades() { return new ArrayList<>(); }
}
