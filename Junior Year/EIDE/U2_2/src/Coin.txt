
public class Coin {

	private static final int HEADS = 0; //Number value of heads.
	private static final int TAILS = 1; //Number value of tails.
	
	private int face; //Number value currently.
	
	Coin (){
		flip();
	}
	
	public void flip() {
		face = (int) (Math.random() * 2); 
	}
	
	public boolean isHeads() {
		if (face == TAILS){
			return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		String returnStatement = "The current face of the coin is: ";
		
		if (this.isHeads()){
			returnStatement += "Heads";
		} else {
			returnStatement += "Tails";
		}
		
		return returnStatement;
	}
}
