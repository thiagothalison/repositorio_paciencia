package paciencia;

import br.ufsc.inf.leobr.cliente.*;

public class Mensagem implements Jogada {

    public String mensagem;

    /**
     * 
     * @return 
     */
    public String getMensagem() {
        return this.mensagem;
    }

    /**
     * 
     * @param mensagem
     * @return 
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * 
     * @param mensagem
     * @return 
     */
    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}