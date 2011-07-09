package paciencia;

import br.ufsc.inf.leobr.cliente.*;
import java.util.ArrayList;
import paciencia.Regras.*;

public class EstadoInicial implements Jogada {

    public ArrayList<Pilha> pilhas;
    public ArrayList<Bagaco> bagacos;
    public ArrayList<Restrito> restritos;
    public ArrayList<Sequencia> sequencias;
    public ArrayList<Baralho> baralhos;
    public int jogadorInicial;

}