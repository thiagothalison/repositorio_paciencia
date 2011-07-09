package paciencia;

import br.ufsc.inf.leobr.cliente.*;

/**
 * Esta classe e utilizada quando o jogador efetuar um movimento que lhe garante a vitoria.
 */
public class MovimentoVencedor extends Movimento implements Jogada {

    private String vencedor;

    /**
     * 
     * @param origem
     * @param destino
     * @param vencedor
     * @return 
     */
    public MovimentoVencedor(int origem, int destino, String vencedor) {
        super(origem, destino);
        this.vencedor = vencedor;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
    
    

}