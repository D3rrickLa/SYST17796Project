package ca.sheridancollege.project;


public class playGame {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
            try{
                CasinoWars cw = new CasinoWars("CasnioWars");
                cw.play();
            
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
}
