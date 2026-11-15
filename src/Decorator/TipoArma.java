package Decorator;

enum TipoArma {
    PISTOLA("Pistola"), BAZUCA("Bazuca"), METRALHADORA("Metralhadora");

    private final String nome;
    TipoArma(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
}
