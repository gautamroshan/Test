
public class Flush {
	public static void main(String[]args){
	String [][] deck = {{"SA","14"},{"SK","13"},{"SQ","12"},{"SJ","11"},{"S2","2"},{"S3","3"},{"S4","4"},{"S5","5"},{"S6","6"},{"S7","7"},{"S8","8"},{"S9","9"},{"S10","10"},{"DA","14"},{"DK","13"},{"DQ","12"},{"DJ","11"},{"D2","2"},{"D3","3"},{"D4","4"},{"D5","5"},{"D6","6"},{"D7","7"},{"D8","8"},{"D9","9"},{"D10","10"},{"HA","14"},{"HK","13"},{"HQ","12"},{"HJ","11"},{"H2","2"},{"H3","3"},{"H4","4"},{"H5","5"},{"H6","6"},{"H7","7"},{"H8","8"},{"H9","9"},{"H10","10"},{"CA","14"},{"CK","13"},{"CQ","12"},{"CJ","11"},{"C2","2"},{"C3","3"},{"C4","4"},{"C5","5"},{"C6","6"},{"C7","7"},{"C8","8"},{"C9","9"},{"C10","10"}};
	String [][] player1 = new String[3][2];
	String [][] player2 = new String[3][2];
	do{
		for(int i = 0; i<3; i++){
				int ran1 = (int)(Math.random()*52);
				player1[i][0] = deck[ran1][0];
				player1[i][1] = deck[ran1][1];
				int ran2 = (int)(Math.random()*52);
				player2[i][0] = deck[ran2][0];
				player2[i][1] = deck[ran2][1];
		}
		System.out.println(PCheck(player1,player2));
	}while(!PCheck(player1,player2));	
	
	
	
	
	
	
		System.out.println("Player1");
		for (int i=0; i<3; i++){
			for (int j=0;j<2;j++){
				System.out.print(player1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Player2");
		for (int i=0; i<3; i++){
			for (int j=0;j<2;j++){
				System.out.print(player2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sorting...");
		SortCard(player1);
		SortCard(player2);
		System.out.println("Player1");
		for (int i=0; i<3; i++){
			for (int j=0;j<2;j++){
				System.out.print(player1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Player2");
		for (int i=0; i<3; i++){
			for (int j=0;j<2;j++){
				System.out.print(player2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Player 1 double  = "+ doubleCheck(player1));
		System.out.println("Player 2 double  = "+ doubleCheck(player2));
		System.out.println("Player 1 color  = "+ colorCheck(player1));
		System.out.println("Player 2 color  = "+ colorCheck(player2));
	}
	public static boolean PCheck(String P1[][], String P2[][]){
		String [] cards = new String[6];
		int c = 0;
		int count = 0;
		String card = "";
		for (int i=0; i<3; i++){
			cards[i]= P1[i][0];
		}
		for (int i=3; i<6; i++){
			cards[i]= P2[c][0];
			c++;
		}
		for (int i=0; i<6; i++){
			card = cards[i];
			for (int j=0; j<6; j++){
				if ((i!=j) && (card.equals(cards[j]))){
					count++;
				}
			}
		}
		if (count>0) return false;
		else return true;
		
	}
	public static String[][] SortCard(String p[][]){
		String tempr = "";
		String tempc = "";
		if(Integer.parseInt(p[0][1])<Integer.parseInt(p[1][1])){
			tempr = p[0][0];
			tempc = p[0][1];
			p[0][0]=p[1][0];
			p[0][1]=p[1][1];
			p[1][0]=tempr;
			p[1][1]=tempc;
			
		}
		if(Integer.parseInt(p[1][1])<Integer.parseInt(p[2][1])){
			tempr = p[1][0];
			tempc = p[1][1];
			p[1][0]=p[2][0];
			p[1][1]=p[2][1];
			p[2][0]=tempr;
			p[2][1]=tempc;
			
		}
		if(Integer.parseInt(p[0][1])<Integer.parseInt(p[1][1])){
			tempr = p[0][0];
			tempc = p[0][1];
			p[0][0]=p[1][0];
			p[0][1]=p[1][1];
			p[1][0]=tempr;
			p[1][1]=tempc;
			
		}
		
		return p;
	}
	public static boolean doubleCheck(String p[][]){
		String temp="";
		int count = 0;
		boolean value=false;
		for(int i=0;i<3;i++) {
			temp = p[i][1];
			for(int j=0;j<3;j++) {
				if((i!=j)&&(p[j][1].equals(temp))) {
					count++;
				}
				if (count==2) value = true;
			}
		}
		return value;
		
	}
	public static boolean colorCheck(String p[][]) {
		String temp="";
		int count = 0;
		boolean value=false;
		for(int i=0;i<3;i++) {
			temp = p[i][0].charAt(0)+"";
			for(int j=0;j<3;j++) {
				if((i!=j)&&((p[j][0].charAt(0)+"").equals(temp))) {
					count++;
				}
				if (count==3) value = true;
			}
		}
		return value;
	}
	public static boolean runCheck(String p[][]) {
		return true;
	}
	public static boolean doublyCheck(String p[][]) {
		return true;
	}
	public static boolean tripleCheck(String p[][]) {
		String temp="";
		int count = 0;
		boolean value=false;
		for(int i=0;i<3;i++) {
			temp = p[i][1];
			for(int j=0;j<3;j++) {
				if((i!=j)&&(p[j][1].equals(temp))) {
					count++;
				}
				if (count==3) value = true;
			}
		}
		return value;
		
	}
	public static boolean DTop(String p[][]) {
		return true;
	}
	}
	/*
 outline for the program
 1. Create two double dimensional arrays for a deck of cards with its corresponding values.
 2. Create two double dimensional arrays for players cards.
 2. Create a method to create random cards and assign them to two players cards.
 3. Create a method to sort the cards.
 4. Create separate methods to check double, color, run, doubly, and triple and assign players with
 different values of the type of card such as Top as 1, double as 2, color as 3... 
 5. Compare the values and determine the winner.
 6. Check to see if they have same type if they do check the top and determine the winner.
 The main step here seems to be to determine the Top. First arrange the items in descending order 
 for each player and then check with other player to see who has bigger top.
 
*/