package plateau;

import java.util.ArrayList;

public class Black implements Joueur {

	public Iterable<Board> black_knight_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<b.N; i++) {
			for(int j = 0; j<b.N; j++) {
				if(b.table[i][j] == 11 || b.table[i][j] == 16) {
    				if((((i+2) < 8) && (j+1 < 8)) && !((b.table[i+2][j+1] >= 10) && b.table[i+2][j+1]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j+1] = 11;
	    					l.add(e);
    				}
    				if((((i+2) < 8) && (j-1 >= 0)) && !((b.table[i+2][j-1] >= 10) && b.table[i+2][j-1]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j-1] = 11;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j+1 < 8)) && !((b.table[i-2][j+1] >= 10) && b.table[i-2][j+1]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j+1] = 11;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j-1 >= 0)) && !((b.table[i-2][j-1] >= 10) && b.table[i-2][j-1]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j-1] = 11;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j+2 < 8)) && !((b.table[i-1][j+2] >= 10) && b.table[i-1][j+2]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j+2] = 11;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j-2 >= 0)) && !((b.table[i-1][j-2] >= 10) && b.table[i-1][j-2]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j-2] = 11;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && ((j-2 >= 0))) && !((b.table[i+1][j-2] >= 10) && b.table[i+1][j-2]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j-2] = 11;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && (j+2 < 8)) && !((b.table[i+1][j+2] >= 10) && b.table[i+1][j+2]<=18))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j+2] = 11;
	    					l.add(e);
    				}
				}
			}
		}
		return l;
 	}
	
	public Iterable<Board> black_king_next_moves(Board b){
		ArrayList<Board> l = new ArrayList <Board>();
		for(int i = 0; i<b.N; i++) {
			for(int j = 0; j<b.N; j++) {
				if(b.table[i][j] == 14) {
					//Enlever les k et les m ils servent à rien
					int k = i;
    				if((k != 7) && !((b.table[k+1][j] >= 10) && b.table[k+1][j]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 14;
    					l.add(e);
    				}
    				k = i;
    				if((k != 0) && !((b.table[k-1][j] >= 10) && b.table[k-1][j]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 14;
    					l.add(f);
    				}
    				k = j;
    				if((k != 0) && !((b.table[i][k-1] >= 10) && b.table[i][k-1]<=18))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 14;
    					l.add(g);
    				}
    				k = j;
    				if((k != 7) && !((b.table[i][k+1] >= 10) && b.table[i][k+1]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 14;
    					l.add(f);
    				}
    				k = i;
    				int m = j;
    				if((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 10) && b.table[k+1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 10) && b.table[k+1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 10) && b.table[k-1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 10) && b.table[k-1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 14;
    					l.add(e);
    				}
				}
			}
		} 
		return l; 
	}
	
	public Iterable<Board> black_queen_next_moves(Board b){
		ArrayList <Board> l = new ArrayList <Board>();
		for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if(b.table[i][j] == 13) {
    				int k = i;
    				while((k != 7) && !((b.table[k+1][j] >= 10) && b.table[k+1][j]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 13;
    					l.add(e);
    					if((b.table[k+1][j] >= 0) && (b.table[k+1][j] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((b.table[k-1][j] >= 10) && b.table[k-1][j]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 13;
    					l.add(f);
    					if((b.table[k-1][j] >= 0) && (b.table[k-1][j] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((b.table[i][k-1] >= 10) && b.table[i][k-1]<=18))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 13;
    					l.add(g);
    					if((b.table[i][k-1] >= 0) && (b.table[i][k-1] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((b.table[i][k+1] >= 10) && b.table[i][k+1]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 13;
    					l.add(f);
    					if((b.table[i][k+1] >= 0) && (b.table[i][k+1] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 10) && b.table[k+1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 13;
    					l.add(e);
    					if((b.table[k+1][m-1] >= 0) && (b.table[k+1][m-1] <= 8)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 10) && b.table[k+1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 13;
    					l.add(e);
    					if((b.table[k+1][m+1] >= 0) && (b.table[k+1][m+1] <= 8)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 10) && b.table[k-1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 13;
    					l.add(e);
    					if((b.table[k-1][m-1] >= 0) && (b.table[k-1][m-1] <= 8)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 10) && b.table[k-1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 13;
    					l.add(e);
    					if((b.table[k-1][m+1] >= 0) && (b.table[k-1][m+1] <= 8)) {
    						break;
    					}
    					k--;
    					m++;
    				}
    			}
    		}
    	}
		
		return l;
	}
	
	public Iterable<Board> black_bishop_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if((b.table[i][j] == 12) || (b.table[i][j] == 15)) {
    				int k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 10) && b.table[k+1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 12;
    					l.add(e);
    					if((b.table[k+1][m-1] >= 0) && (b.table[k+1][m-1] <= 8)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 10) && b.table[k+1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 12;
    					l.add(e);
    					if((b.table[k+1][m+1] >= 0) && (b.table[k+1][m+1] <= 8)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 10) && b.table[k-1][m-1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 12;
    					l.add(e);
    					if((b.table[k-1][m-1] >= 0) && (b.table[k-1][m-1] <= 8)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 10) && b.table[k-1][m+1]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 12;
    					l.add(e);
    					if((b.table[k-1][m+1] >= 0) && (b.table[k-1][m+1] <= 8)) {
    						break;
    					}
    					k--;
    					m++;
    				}
    			}
    		}
		}
		return l; 
	}
	
	public Iterable<Board> black_rook_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if((b.table[i][j] == 10) || (b.table[i][j] == 17)) {
    				int k = i;
    				while((k != 7) && !((b.table[k+1][j] >= 10) && b.table[k+1][j]<=18))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 10;
    					l.add(e);
    					if((b.table[k+1][j] >= 0) && (b.table[k+1][j] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((b.table[k-1][j] >= 10) && b.table[k-1][j]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 10;
    					l.add(f);
    					if((b.table[k-1][j] >= 0) && (b.table[k-1][j] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((b.table[i][k-1] >= 10) && b.table[i][k-1]<=18))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 10;
    					l.add(g);
    					if((b.table[i][k-1] >= 0) && (b.table[i][k-1] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((b.table[i][k+1] >= 10) && b.table[i][k+1]<=18))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 10;
    					l.add(f);
    					if((b.table[i][k+1] >= 0) && (b.table[i][k+1] <= 8)) {
    						break;
    					}
    					k++;
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> black_pawn_next_moves(Board z) {
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<z.N; i++) {
    		for(int j = 0; j<z.N; j++) {
    			if(z.table[i][j] == 18) {
    				Board e = new Board(z.table);
    				Board f = new Board(z.table);
    				Board g = new Board(z.table);
    				Board h = new Board(z.table);
    				Board a = new Board(z.table);
    				Board b = new Board(z.table);
    				Board c = new Board(z.table);
    				Board d = new Board(z.table);
    				Board w = new Board(z.table);
    				Board x = new Board(z.table);
    				Board y = new Board(z.table);
    				Board z0 = new Board(z.table);
    				e.table[i][j] = -1;
    				f.table[i][j] = -1;
    				g.table[i][j] = -1;
    				h.table[i][j] = -1;
    				a.table[i][j] = -1;
    				b.table[i][j] = -1;
    				c.table[i][j] = -1;
    				d.table[i][j] = -1;
    				w.table[i][j] = -1;
    				x.table[i][j] = -1;
    				y.table[i][j] = -1;
    				z0.table[i][j] = -1;
					if((i == 1) && (z.table[i-1][j] == -1)) {
						a.table[i-1][j] = 10;
						l.add(a);
						b.table[i-1][j] = 11;
						l.add(b);
						c.table[i-1][j] = 12;
						l.add(c);
						d.table[i-1][j] = 13;
						l.add(d);
    				}
					else if(z.table[i-1][j] == -1) {
    					a.table[i-1][j] = 18;
    					l.add(a);
    					if((i == 6) && (z.table[i-1][j] == -1) && (z.table[i-2][j] == -1)) {
    						b.table[i-2][j] = 18;
        					l.add(b);
    					}
    				}
					
					if(((i == 1) && (j != 7)) && 
    						((z.table[i-1][j+1] >= 0) && (z.table[i-1][j+1] <= 8))) {
						e.table[i-1][j+1] = 10;
						l.add(e);
						f.table[i-1][j+1] = 11;
						l.add(f);
						g.table[i-1][j+1] = 12;
						l.add(g);
						h.table[i-1][j+1] = 13;
						l.add(h);
					}
					else if(((i > 0) && (j < 7)) && 
    						((z.table[i-1][j+1] >= 0) && (z.table[i-1][j+1] <= 8))){ 
    					e.table[i-1][j+1] = 18;
    					l.add(e);
    				}
					if(((i == 1) && (j > 0)) && 
    						((z.table[i-1][j-1] >= 0) && (z.table[i-1][j-1] <= 8))) {
						w.table[i-1][j-1] = 10;
						l.add(w);
						x.table[i-1][j-1] = 11;
						l.add(x);
						y.table[i-1][j-1] = 12;
						l.add(y);
						z0.table[i-1][j-1] = 13;
						l.add(z0);
					}
					else if(((i != 1) && (j != 0)) && 
    						((z.table[i-1][j-1] >= 0) && (z.table[i-1][j-1] <= 8))) {
    					w.table[i-1][j-1] = 18;
    					l.add(w);
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> nextmoves (Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		l.addAll((ArrayList<Board>)this.black_pawn_next_moves(b));
		l.addAll((ArrayList<Board>)this.black_rook_next_moves(b));
		l.addAll((ArrayList<Board>)this.black_knight_next_moves(b));
		l.addAll((ArrayList<Board>)this.black_bishop_next_moves(b));
		l.addAll((ArrayList<Board>)this.black_queen_next_moves(b));
		l.addAll((ArrayList<Board>)this.black_king_next_moves(b));
		return l;
	}
}
