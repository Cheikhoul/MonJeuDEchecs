package plateau;

public class GameHvsH {
	Board initial = new Board(new int[][]{
		{10, 11, 12, 13, 14, 15, 16, 17},
		{18, 18, 18, 18, 18, 18, 18, 18},
		{-1, -1, -1, -1, -1, -1, -1, -1},
		{-1, -1, -1, -1, -1, -1, -1, -1},
		{-1, -1, -1, -1, -1, -1, -1, -1},
		{-1, -1, -1, -1, -1, -1, -1, -1},
		{8, 8, 8, 8, 8, 8, 8, 8},
		{0, 1, 2, 3, 4, 5, 6, 7}});
	
	public Noeud racine = new Noeud(initial, null);
}
