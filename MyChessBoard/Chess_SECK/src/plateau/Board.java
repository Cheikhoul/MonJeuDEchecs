package plateau;

//import java.util.ArrayList;

public class Board {

	public final int N = 8;
	public int[][] table ; 
	
	public Board (int[][] table) {
		
		this.table = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				this.table[i][j] = table[i][j];
			}
		}
	}
			
	public String toString() {
		        
		StringBuilder s = new StringBuilder();
		s.append("\n");
		s.append("------------------------------------------------------------------------\n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				switch(this.table[i][j]) {
					case -1 :  s.append(String.format("        |" ));
					break;
					case 0 : s.append(String.format("   W-R  |" ));
					break;
					case 1 : s.append(String.format("   W-K  |" ));
					break;
					case 2 : s.append(String.format("   W-B  |" ));
					break; 
					case 3 : s.append(String.format("   W-Q  |" ));
					break; 
					case 4 : s.append(String.format("   W-K  |" ));
					break; 
					case 5 : s.append(String.format("   W-B  |" ));
					break; 
					case 6 : s.append(String.format("   W-K  |" ));
					break; 
					case 7 : s.append(String.format("   W-R  |" ));
					break; 
					case 8 : s.append(String.format("   W-P  |" ));
					break;
					case 10 : s.append(String.format("   B-R  |" ));
					break;
					case 11 : s.append(String.format("   B-K  |" ));
					break;
					case 12 : s.append(String.format("   B-B  |" ));
					break; 
					case 13 : s.append(String.format("   B-Q  |" ));
					break; 
					case 14 : s.append(String.format("   B-K  |" ));
					break; 
					case 15 : s.append(String.format("   B-B  |" ));
					break; 
					case 16 : s.append(String.format("   B-K  |" ));
					break; 
					case 17 : s.append(String.format("   B-R  |" ));
					break; 
					case 18 : s.append(String.format("   B-P  |" ));
					break;
				}
			}
		s.append("\n");
		s.append("------------------------------------------------------------------------\n");
		}
		s.append("\n");
		return s.toString();
	}
	
	/*public Iterable<Board> black_pawn_next_moves() {
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if(this.table[i][j] == 18) {
    				Board e = new Board(table);
    				Board f = new Board(table);
    				Board g = new Board(table);
    				Board h = new Board(table);
    				Board a = new Board(table);
    				Board b = new Board(table);
    				Board c = new Board(table);
    				Board d = new Board(table);
    				Board w = new Board(table);
    				Board x = new Board(table);
    				Board y = new Board(table);
    				Board z = new Board(table);
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
    				z.table[i][j] = -1;
					if((i == 1) && (table[i-1][j] == -1)) {
						a.table[i-1][j] = 10;
						l.add(a);
						b.table[i-1][j] = 11;
						l.add(b);
						c.table[i-1][j] = 12;
						l.add(c);
						d.table[i-1][j] = 13;
						l.add(d);
    				}
					else if(table[i-1][j] == -1) {
    					a.table[i-1][j] = 18;
    					l.add(a);
    					if((i == 6) && (table[i-1][j] == -1) && (table[i-2][j] == -1)) {
    						b.table[i-2][j] = 18;
        					l.add(b);
    					}
    				}
					
					if(((i == 1) && (j != 7)) && 
    						((table[i-1][j+1] >= 0) && (table[i-1][j+1] <= 8))) {
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
    						((table[i-1][j+1] >= 0) && (table[i-1][j+1] <= 8))){ 
    					e.table[i-1][j+1] = 18;
    					l.add(e);
    				}
					if(((i == 1) && (j > 0)) && 
    						((table[i-1][j-1] >= 0) && (table[i-1][j-1] <= 8))) {
						w.table[i-1][j-1] = 10;
						l.add(w);
						x.table[i-1][j-1] = 11;
						l.add(x);
						y.table[i-1][j-1] = 12;
						l.add(y);
						z.table[i-1][j-1] = 13;
						l.add(z);
					}
					else if(((i != 1) && (j != 0)) && 
    						((table[i-1][j-1] >= 0) && (table[i-1][j-1] <= 8))) {
    					w.table[i-1][j-1] = 18;
    					l.add(w);
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> white_pawn_next_moves() {
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if(this.table[i][j] == 8) {
    				Board e = new Board(table);
    				Board f = new Board(table);
    				Board g = new Board(table);
    				Board h = new Board(table);
    				Board a = new Board(table);
    				Board b = new Board(table);
    				Board c = new Board(table);
    				Board d = new Board(table);
    				Board w = new Board(table);
    				Board x = new Board(table);
    				Board y = new Board(table);
    				Board z = new Board(table);
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
    				z.table[i][j] = -1;
					if((i == 6) && (table[i+1][j] == -1)) {
						a.table[i+1][j] = 0;
						l.add(a);
						b.table[i+1][j] = 1;
						l.add(b);
						c.table[i+1][j] = 2;
						l.add(c);
						d.table[i+1][j] = 3;
						l.add(d);
    				}
					else if(table[i+1][j] == -1) {
    					a.table[i+1][j] = 8;
    					l.add(a);
    					if((i == 1) && (table[i+1][j] == -1) && (table[i+2][j] == -1)) {
    						b.table[i+2][j] = 8;
        					l.add(b);
    					}
    				}
					
					if(((i == 6) && (j != 7)) && 
    						((table[i+1][j+1] >= 10) && (table[i+1][j+1] <= 18))) {
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
    						((table[i+1][j+1] >= 10) && (table[i+1][j+1] <= 18))){ 
    					e.table[i+1][j+1] = 8;
    					l.add(e);
    				}
					if(((i == 6) && (j > 0)) && 
    						((table[i+1][j-1] >= 10) && (table[i+1][j-1] <= 18))) {
						w.table[i+1][j-1] = 0;
						l.add(w);
						x.table[i+1][j-1] = 1;
						l.add(x);
						y.table[i+1][j-1] = 2;
						l.add(y);
						z.table[i+1][j-1] = 3;
						l.add(z);
					}
					else if(((i != 6) && (j != 0)) && 
    						((table[i+1][j-1] >= 10) && (table[i+1][j-1] <= 18))) {
    					w.table[i+1][j-1] = 8;
    					l.add(w);
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> black_rook_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if((this.table[i][j] == 10) || (this.table[i][j] == 17)) {
    				int k = i;
    				while((k != 7) && !((table[k+1][j] >= 10) && table[k+1][j]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 10;
    					l.add(e);
    					if((table[k+1][j] >= 0) && (table[k+1][j] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((table[k-1][j] >= 10) && table[k-1][j]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 10;
    					l.add(f);
    					if((table[k-1][j] >= 0) && (table[k-1][j] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((table[i][k-1] >= 10) && table[i][k-1]<=18))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 10;
    					l.add(g);
    					if((table[i][k-1] >= 0) && (table[i][k-1] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((table[i][k+1] >= 10) && table[i][k+1]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 10;
    					l.add(f);
    					if((table[i][k+1] >= 0) && (table[i][k+1] <= 8)) {
    						break;
    					}
    					k++;
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> white_rook_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
    	for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if((this.table[i][j] == 0) || (this.table[i][j] == 7)) {
    				int k = i;
    				while((k != 7) && !((table[k+1][j] >= 0) && table[k+1][j]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 0;
    					l.add(e);
    					if((table[k+1][j] >= 10) && (table[k+1][j] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((table[k-1][j] >= 0) && table[k-1][j]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 0;
    					l.add(f);
    					if((table[k-1][j] >= 10) && (table[k-1][j] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((table[i][k-1] >= 0) && table[i][k-1]<=8))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 0;
    					l.add(g);
    					if((table[i][k-1] >= 10) && (table[i][k-1] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((table[i][k+1] >= 0) && table[i][k+1]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 0;
    					l.add(f);
    					if((table[i][k+1] >= 10) && (table[i][k+1] <= 18)) {
    						break;
    					}
    					k++;
    				}
    			}
    		}
    	}
    	return l;
	}
	
	public Iterable<Board> black_bishop_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if((this.table[i][j] == 12) || (this.table[i][j] == 15)) {
    				int k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((table[k+1][m-1] >= 10) && table[k+1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 12;
    					l.add(e);
    					if((table[k+1][m-1] >= 0) && (table[k+1][m-1] <= 8)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((table[k+1][m+1] >= 10) && table[k+1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 12;
    					l.add(e);
    					if((table[k+1][m+1] >= 0) && (table[k+1][m+1] <= 8)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((table[k-1][m-1] >= 10) && table[k-1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 12;
    					l.add(e);
    					if((table[k-1][m-1] >= 0) && (table[k-1][m-1] <= 8)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((table[k-1][m+1] >= 10) && table[k-1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 12;
    					l.add(e);
    					if((table[k-1][m+1] >= 0) && (table[k-1][m+1] <= 8)) {
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
	
	public Iterable<Board> white_bishop_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if((this.table[i][j] == 2) || (this.table[i][j] == 5)) {
    				int k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((table[k+1][m-1] >= 0) && table[k+1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 2;
    					l.add(e);
    					if((table[k+1][m-1] >= 10) && (table[k+1][m-1] <= 18)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((table[k+1][m+1] >= 0) && table[k+1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 2;
    					l.add(e);
    					if((table[k+1][m+1] >= 10) && (table[k+1][m+1] <= 18)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((table[k-1][m-1] >= 0) && table[k-1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 2;
    					l.add(e);
    					if((table[k-1][m-1] >= 10) && (table[k-1][m-1] <= 18)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((table[k-1][m+1] >= 0) && table[k-1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 2;
    					l.add(e);
    					if((table[k-1][m+1] >= 10) && (table[k-1][m+1] <= 18)) {
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
	
	public Iterable<Board> black_queen_next_moves(){
		ArrayList <Board> l = new ArrayList <Board>();
		for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if(this.table[i][j] == 13) {
    				int k = i;
    				while((k != 7) && !((table[k+1][j] >= 10) && table[k+1][j]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 13;
    					l.add(e);
    					if((table[k+1][j] >= 0) && (table[k+1][j] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((table[k-1][j] >= 10) && table[k-1][j]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 13;
    					l.add(f);
    					if((table[k-1][j] >= 0) && (table[k-1][j] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((table[i][k-1] >= 10) && table[i][k-1]<=18))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 13;
    					l.add(g);
    					if((table[i][k-1] >= 0) && (table[i][k-1] <= 8)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((table[i][k+1] >= 10) && table[i][k+1]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 13;
    					l.add(f);
    					if((table[i][k+1] >= 0) && (table[i][k+1] <= 8)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((table[k+1][m-1] >= 10) && table[k+1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 13;
    					l.add(e);
    					if((table[k+1][m-1] >= 0) && (table[k+1][m-1] <= 8)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((table[k+1][m+1] >= 10) && table[k+1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 13;
    					l.add(e);
    					if((table[k+1][m+1] >= 0) && (table[k+1][m+1] <= 8)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((table[k-1][m-1] >= 10) && table[k-1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 13;
    					l.add(e);
    					if((table[k-1][m-1] >= 0) && (table[k-1][m-1] <= 8)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((table[k-1][m+1] >= 10) && table[k-1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 13;
    					l.add(e);
    					if((table[k-1][m+1] >= 0) && (table[k-1][m+1] <= 8)) {
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
	
	public Iterable<Board> white_queen_next_moves(){
		ArrayList <Board> l = new ArrayList <Board>();
		for(int i = 0; i<N; i++) {
    		for(int j = 0; j<N; j++) {
    			if(this.table[i][j] == 3) {
    				int k = i;
    				while((k != 7) && !((table[k+1][j] >= 0) && table[k+1][j]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 3;
    					l.add(e);
    					if((table[k+1][j] >= 10) && (table[k+1][j] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				while((k != 0) && !((table[k-1][j] >= 0) && table[k-1][j]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 3;
    					l.add(f);
    					if((table[k-1][j] >= 10) && (table[k-1][j] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 0) && !((table[i][k-1] >= 0) && table[i][k-1]<=8))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 3;
    					l.add(g);
    					if((table[i][k-1] >= 10) && (table[i][k-1] <= 18)) {
    						break;
    					}
    					k--;
    				}
    				k = j;
    				while((k != 7) && !((table[i][k+1] >= 0) && table[i][k+1]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 3;
    					l.add(f);
    					if((table[i][k+1] >= 10) && (table[i][k+1] <= 18)) {
    						break;
    					}
    					k++;
    				}
    				k = i;
    				int m = j;
    				while((k != 7 && m != 0) && !((table[k+1][m-1] >= 0) && table[k+1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 3;
    					l.add(e);
    					if((table[k+1][m-1] >= 10) && (table[k+1][m-1] <= 18)) {
    						break;
    					}
    					k++;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 7 && m != 7) && !((table[k+1][m+1] >= 0) && table[k+1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 3;
    					l.add(e);
    					if((table[k+1][m+1] >= 10) && (table[k+1][m+1] <= 18)) {
    						break;
    					}
    					k++;
    					m++;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 0) && !((table[k-1][m-1] >= 0) && table[k-1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 3;
    					l.add(e);
    					if((table[k-1][m-1] >= 10) && (table[k-1][m-1] <= 18)) {
    						break;
    					}
    					k--;
    					m--;
    				}
    				k = i;
    				m = j;
    				while((k != 0 && m != 7) && !((table[k-1][m+1] >= 0) && table[k-1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 3;
    					l.add(e);
    					if((table[k-1][m+1] >= 10) && (table[k-1][m+1] <= 18)) {
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
	
	public Iterable<Board> black_king_next_moves(){
		ArrayList<Board> l = new ArrayList <Board>();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(this.table[i][j] == 14) {
					//Enlever les k et les m ils servent à rien
					int k = i;
    				if((k != 7) && !((table[k+1][j] >= 10) && table[k+1][j]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 14;
    					l.add(e);
    				}
    				k = i;
    				if((k != 0) && !((table[k-1][j] >= 10) && table[k-1][j]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 14;
    					l.add(f);
    				}
    				k = j;
    				if((k != 0) && !((table[i][k-1] >= 10) && table[i][k-1]<=18))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 14;
    					l.add(g);
    				}
    				k = j;
    				if((k != 7) && !((table[i][k+1] >= 10) && table[i][k+1]<=18))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 14;
    					l.add(f);
    				}
    				k = i;
    				int m = j;
    				if((k != 7 && m != 0) && !((table[k+1][m-1] >= 10) && table[k+1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 7 && m != 7) && !((table[k+1][m+1] >= 10) && table[k+1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 0) && !((table[k-1][m-1] >= 10) && table[k-1][m-1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 14;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 7) && !((table[k-1][m+1] >= 10) && table[k-1][m+1]<=18))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 14;
    					l.add(e);
    				}
				}
			}
		} 
		return l; 
	}
	
	public Iterable<Board> white_king_next_moves(){
		ArrayList<Board> l = new ArrayList <Board>();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(this.table[i][j] == 4) {
					int k = i;
    				if((k != 7) && !((table[k+1][j] >= 0) && table[k+1][j]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][j] = 4;
    					l.add(e);
    				}
    				k = i;
    				if((k != 0) && !((table[k-1][j] >= 0) && table[k-1][j]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[k-1][j] = 4;
    					l.add(f);
    				}
    				k = j;
    				if((k != 0) && !((table[i][k-1] >= 0) && table[i][k-1]<=8))  {
    					Board g = new Board(table);
    					g.table[i][j] = -1;
    					g.table[i][k-1] = 4;
    					l.add(g);
    				}
    				k = j;
    				if((k != 7) && !((table[i][k+1] >= 0) && table[i][k+1]<=8))  {
    					Board f = new Board(table);
    					f.table[i][j] = -1;
    					f.table[i][k+1] = 4;
    					l.add(f);
    				}
    				k = i;
    				int m = j;
    				if((k != 7 && m != 0) && !((table[k+1][m-1] >= 0) && table[k+1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m-1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 7 && m != 7) && !((table[k+1][m+1] >= 0) && table[k+1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k+1][m+1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 0) && !((table[k-1][m-1] >= 0) && table[k-1][m-1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m-1] = 4;
    					l.add(e);
    				}
    				k = i;
    				m = j;
    				if((k != 0 && m != 7) && !((table[k-1][m+1] >= 0) && table[k-1][m+1]<=8))  {
    					Board e = new Board(this.table);
    					e.table[i][j] = -1;
    					e.table[k-1][m+1] = 4;
    					l.add(e);
    				}
				}
			}
		} 
		return l; 
	}
	
	public Iterable<Board> black_knight_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(this.table[i][j] == 11 || this.table[i][j] == 16) {
    				if((((i+2) < 8) && (j+1 < 8)) && !((table[i+2][j+1] >= 10) && table[i+2][j+1]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j+1] = 11;
	    					l.add(e);
    				}
    				if((((i+2) < 8) && (j-1 >= 0)) && !((table[i+2][j-1] >= 10) && table[i+2][j-1]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j-1] = 11;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j+1 < 8)) && !((table[i-2][j+1] >= 10) && table[i-2][j+1]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j+1] = 11;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j-1 >= 0)) && !((table[i-2][j-1] >= 10) && table[i-2][j-1]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j-1] = 11;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j+2 < 8)) && !((table[i-1][j+2] >= 10) && table[i-1][j+2]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j+2] = 11;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j-2 >= 0)) && !((table[i-1][j-2] >= 10) && table[i-1][j-2]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j-2] = 11;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && ((j-2 >= 0))) && !((table[i+1][j-2] >= 10) && table[i+1][j-2]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j-2] = 11;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && (j+2 < 8)) && !((table[i+1][j+2] >= 10) && table[i+1][j+2]<=18))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j+2] = 11;
	    					l.add(e);
    				}
				}
			}
		}
		return l;
 	}
	
	public Iterable<Board> white_knight_next_moves(){
		ArrayList<Board> l = new ArrayList<Board>();
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(this.table[i][j] == 1 || this.table[i][j] == 6) {
    				if((((i+2) < 8) && (j+1 < 8)) && !((table[i+2][j+1] >= 0) && table[i+2][j+1]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j+1] = 1;
	    					l.add(e);
    				}
    				if((((i+2) < 8) && (j-1 >= 0)) && !((table[i+2][j-1] >= 0) && table[i+2][j-1]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+2][j-1] = 1;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j+1 < 8)) && !((table[i-2][j+1] >= 0) && table[i-2][j+1]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j+1] = 1;
	    					l.add(e);
    				}
    				if((((i-2) >= 0) && (j-1 >= 0)) && !((table[i-2][j-1] >= 0) && table[i-2][j-1]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-2][j-1] = 1;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j+2 < 8)) && !((table[i-1][j+2] >= 0) && table[i-1][j+2]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j+2] = 1;
	    					l.add(e);
    				}
    				if((((i-1) >= 0) && (j-2 >= 0)) && !((table[i-1][j-2] >= 0) && table[i-1][j-2]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i-1][j-2] = 1;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && ((j-2 >= 0))) && !((table[i+1][j-2] >= 0) && table[i+1][j-2]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j-2] = 1;
	    					l.add(e);
    				}
    				if((((i+1) < 8) && (j+2 < 8)) && !((table[i+1][j+2] >= 0) && table[i+1][j+2]<=8))  {
	    					Board e = new Board(this.table);
	    					e.table[i][j] = -1;
	    					e.table[i+1][j+2] = 1;
	    					l.add(e);
    				}
				}
			}
		}
		return l;
 	}*/
	
	public static void main(String[] args) {
		
		White Cheikhoul = new White();
		//Black Khadim = new Black();
		
		Board initial = new Board(new int[][]{
			{-1, -1, -1, -1, -1, -1, -1, -1},
			{-1, -1, -1, -1, -1, -1, -1, -1},
			{-1, -1, 18, -1, 18, -1, -1, -1},
			{-1, 8, -1, -1, -1, 8, -1, -1},
			{-1, -1, -1, 1, -1, -1, -1, -1},
			{-1, 18, -1, -1, -1, 18, -1, -1},
			{-1, -1, 8, -1, 8, -1, -1, -1},
			{-1, -1, -1, -1, -1, -1, -1, -1}});
		
		System.out.println(initial.toString());
		for(Board a : Cheikhoul.white_knight_next_moves(initial)) {
			System.out.println(a.toString());
		}
	}
}