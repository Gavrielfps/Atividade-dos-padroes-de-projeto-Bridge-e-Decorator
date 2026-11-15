package Decorator;
import java.util.List;

interface Arma {
    String getNome();
    TipoArma getTipo();
    int getDano();
    int getAlcance();          // metros
    int getPrecisao();         // 0-100
    int getCapacidade();       // munição no carregador
    double getTempoRecarga();  // segundos
    int getRuido();            // 0-100 (quanto maior, mais chama atenção)
    int getRecuo();            // 0-100
    boolean slotOcupado(String slot);
    List<String> getUpgrades();
}
