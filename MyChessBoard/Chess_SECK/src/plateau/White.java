package plateau;

import java.util.ArrayList;

public class White implements Joueur {

	public Iterable<Board> white_knight_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<b.N; i++) {
			for(int j = 0; j<b.N; j++) {
				if(b.table[i][j] == 1 || b.table[i][j] == 6) {
    				if((((i+2) < 8) && (j+1 < 8)) && !((b.table[i+2][j+1] >= 0) && b.table[i+2][j+1]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j+1] = 1;
	    					l.add(e);
    				}
    				if((((i+2) < 8) && (j-1 >= 0)) && !((b.table[i+2][j-1] >= 0) && b.table[i+2][j-1]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j-1] = 1;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j+1 < 8)) && !((b.table[i-2][j+1] >= 0) && b.table[i-2][j+1]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j+1] = 1;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j-1 >= 0)) && !((b.table[i-2][j-1] >= 0) && b.table[i-2][j-1]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j-1] = 1;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j+2 < 8)) && !((b.table[i-1][j+2] >= 0) && b.table[i-1][j+2]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j+2] = 1;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j-2 >= 0)) && !((b.table[i-1][j-2] >= 0) && b.table[i-1][j-2]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j-2] = 1;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && ((j-2 >= 0))) && !((b.table[i+1][j-2] >= 0) && b.table[i+1][j-2]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j-2] = 1;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && (j+2 < 8)) && !((b.table[i+1][j+2] >= 0) && b.table[i+1][j+2]<=8))  {
	    					Board e = new Board(b.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j+2] = 1;
	    					l.add(e);
    				}
				}
			}
		}
		return l;
 	}
	
	public Iterable<Board> white_king_next_moves(Board b){
		ArrayList<Board> l = new ArrayList <Board>();
		for(int i = 0; i<b.N; i++) {
			for(int j = 0; j<b.N; j++) {
				if(b.table[i][j] == 4) {
					int k = i;
    				if((k != 7) && !((b.table[k+1][j] >= 0) && b.table[k+1][j]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 4;
    					l.add(e);
    				}
    				k = i;
    				if((k != 0) && !((b.table[k-1][j] >= 0) && b.table[k-1][j]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 4;
    					l.add(f);
    				}
    				k = j;
    				if((k != 0) && !((b.table[i][k-1] >= 0) && b.table[i][k-1]<=8))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 4;
    					l.add(g);
    				}
    				k = j;
    				if((k != 7) && !((b.table[i][k+1] >= 0) && b.table[i][k+1]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 4;
    					l.add(f);
    				}
    				k = i;
    				int m = j;
    				if((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 0) && b.table[k+1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 0) && b.table[k+1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 0) && b.table[k-1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 0) && b.table[k-1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 4;
    					l.add(e);
    				}
				}
			}
		} 
		return l; 
	}

	public Iterable<Board> white_queen_next_moves(Board b){
		ArrayList <Board> l = new ArrayList <Board>();
		for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if(b.table[i][j] == 3) {
    				int k = i;
    				while((k != 7) && !((b.table[k+1][j] >= 0) && b.table[k+1][j]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 3;
    					l.add(e);
    					if((b.table[k+1][j] >= 10) && (b.table[k+1][j] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((b.table[k-1][j] >= 0) && b.table[k-1][j]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 3;
    					l.add(f);
    					if((b.table[k-1][j] >= 10) && (b.table[k-1][j] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((b.table[i][k-1] >= 0) && b.table[i][k-1]<=8))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 3;
    					l.add(g);
    					if((b.table[i][k-1] >= 10) && (b.table[i][k-1] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((b.table[i][k+1] >= 0) && b.table[i][k+1]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 3;
    					l.add(f);
    					if((b.table[i][k+1] >= 10) && (b.table[i][k+1] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 0) && b.table[k+1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 3;
    					l.add(e);
    					if((b.table[k+1][m-1] >= 10) && (b.table[k+1][m-1] <= 18)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 0) && b.table[k+1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 3;
    					l.add(e);
    					if((b.table[k+1][m+1] >= 10) && (b.table[k+1][m+1] <= 18)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 0) && b.table[k-1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 3;
    					l.add(e);
    					if((b.table[k-1][m-1] >= 10) && (b.table[k-1][m-1] <= 18)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 0) && b.table[k-1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 3;
    					l.add(e);
    					if((b.table[k-1][m+1] >= 10) && (b.table[k-1][m+1] <= 18)) {
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
	
	public Iterable<Board> white_bishop_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if((b.table[i][j] == 2) || (b.table[i][j] == 5)) {
    				int k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((b.table[k+1][m-1] >= 0) && b.table[k+1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 2;
    					l.add(e);
    					if((b.table[k+1][m-1] >= 10) && (b.table[k+1][m-1] <= 18)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((b.table[k+1][m+1] >= 0) && b.table[k+1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 2;
    					l.add(e);
    					if((b.table[k+1][m+1] >= 10) && (b.table[k+1][m+1] <= 18)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((b.table[k-1][m-1] >= 0) && b.table[k-1][m-1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 2;
    					l.add(e);
    					if((b.table[k-1][m-1] >= 10) && (b.table[k-1][m-1] <= 18)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((b.table[k-1][m+1] >= 0) && b.table[k-1][m+1]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 2;
    					l.add(e);
    					if((b.table[k-1][m+1] >= 10) && (b.table[k-1][m+1] <= 18)) {
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
	
	public Iterable<Board> white_rook_next_moves(Board b){
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<b.N; i++) {
    		for(int j = 0; j<b.N; j++) {
    			if((b.table[i][j] == 0) || (b.table[i][j] == 7)) {
    				int k = i;
    				while((k != 7) && !((b.table[k+1][j] >= 0) && b.table[k+1][j]<=8))  {
    					Board e = new Board(b.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 0;
    					l.add(e);
    					if((b.table[k+1][j] >= 10) && (b.table[k+1][j] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((b.table[k-1][j] >= 0) && b.table[k-1][j]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 0;
    					l.add(f);
    					if((b.table[k-1][j] >= 10) && (b.table[k-1][j] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((b.table[i][k-1] >= 0) && b.table[i][k-1]<=8))  {
    					Board g = new Board(b.table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 0;
    					l.add(g);
    					if((b.table[i][k-1] >= 10) && (b.table[i][k-1] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((b.table[i][k+1] >= 0) && b.table[i][k+1]<=8))  {
    					Board f = new Board(b.table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 0;
    					l.add(f);
    					if((b.table[i][k+1] >= 10) && (b.table[i][k+1] <= 18)) {
    						break;
    					}
    					k++;
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> white_pawn_next_moves(Board z) {
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<z.N; i++) {
    		for(int j = 0; j<z.N; j++) {
    			if(z.table[i][j] == 8) {
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
					if((i == 6) && (z.table[i+1][j] == -1)) {
						a.table[i+1][j] = 0;
						l.add(a);
						b.table[i+1][j] = 1;
						l.add(b);
						c.table[i+1][j] = 2;
						l.add(c);
						d.table[i+1][j] = 3;
						l.add(d);
    				}
					else if(z.table[i+1][j] == -1) {
    					a.table[i+1][j] = 8;
    					l.add(a);
    					if((i == 1) && (z.table[i+1][j] == -1) && (z.table[i+2][j] == -1)) {
    						b.table[i+2][j] = 8;
        					l.add(b);
    					}
    				}
					
					if(((i == 6) && (j != 7)) && 
    						((z.table[i+1][j+1] >= 10) && (z.table[i+1][j+1] <= 18))) {
						e.table[i+1][j+1] = 0;
						l.add(e);
						f.table[i+1][j+1] = 1;
						l.add(f);
						g.table[i+1][j+1] = 2;
						l.add(g);
						h.table[i+1][j+1] = 3;
						l.add(h);
					}
					else if(((i > 0) && (j < 7)) && 
    						((z.table[i+1][j+1] >= 10) && (z.table[i+1][j+1] <= 18))){ 
    					e.table[i+1][j+1] = 8;
    					l.add(e);
    				}
					if(((i == 6) && (j > 0)) && 
    						((z.table[i+1][j-1] >= 10) && (z.table[i+1][j-1] <= 18))) {
						w.table[i+1][j-1] = 0;
						l.add(w);
						x.table[i+1][j-1] = 1;
						l.add(x);
						y.table[i+1][j-1] = 2;
						l.add(y);
						z0.table[i+1][j-1] = 3;
						l.add(z0);
					}
					else if(((i != 6) && (j != 0)) && 
    						((z.table[i+1][j-1] >= 10) && (z.table[i+1][j-1] <= 18))) {
    					w.table[i+1][j-1] = 8;
    					l.add(w);
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> nextmoves (Board b){
		ArrayList<Board> l = new ArrayList<Board>();
		l.addAll((ArrayList<Board>)this.white_pawn_next_moves(b));
		l.addAll((ArrayList<Board>)this.white_rook_next_moves(b));
		l.addAll((ArrayList<Board>)this.white_knight_next_moves(b));
		l.addAll((ArrayList<Board>)this.white_bishop_next_moves(b));
		l.addAll((ArrayList<Board>)this.white_queen_next_moves(b));
		l.addAll((ArrayList<Board>)this.white_king_next_moves(b));
		return l;
		}
}
