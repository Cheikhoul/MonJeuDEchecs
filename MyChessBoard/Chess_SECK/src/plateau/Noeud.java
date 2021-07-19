package plateau;

import java.util.ArrayList;

public class Noeud {

	protected Noeud pere;
    protected ArrayList<Noeud> fils ;
    protected int nbFils;
    protected Board board;
    protected double value;

    public Noeud(Board b, Noeud p) {
        this.board = b;
        this.pere = p;
        this.fils = new ArrayList<Noeud>();
    }
    
}
