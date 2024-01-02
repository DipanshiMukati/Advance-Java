package in.com.Interface;

public class Market implements shopkeeper,Costumer {

	@Override
	public void buygoods() {
	System.out.println(" buy chips packet");
		
	}

	@Override
	public void lossmoney() {
		System.out.println("loss 10 rupee");
		
	}

	@Override
	public void sellgoods() {
		System.out.println("sell chips packet");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earn 10 ruppe");
		
	}
	public static void main(String[] args) {
      shopkeeper s=new Market();
			
      s.earnmoney();
      s.sellgoods();
      
     Costumer c=new Market();
     c.buygoods();
     c.lossmoney();
     
}
}
