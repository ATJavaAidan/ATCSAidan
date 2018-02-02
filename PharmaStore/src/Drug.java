
public class Drug {
	private int barCode;
	private double price;
	private int stock;
	private String name;
	private double ldfifty;
	private boolean legal;
	public Drug(int Code, double PPU, int Stock, String Name, double Ldfifty, boolean Legal) {
		barCode=Code;
		price=PPU;
		stock=Stock;
		name=Name;
		ldfifty=Ldfifty;
		legal=Legal;
	}
	
	public int getBarCode(){
		return barCode;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getStock(){
		return stock;
	}
	
	public String getName(){
		return name;
	}
	
	public double getLdfifty(){
		return ldfifty;
	}
	
	public boolean getLegality(){
		return legal;
	}
	
	public void updateQuantity(int x) {
		stock=stock+x;
	}
	
	public void updatePrice(double newPrice) {
		price=newPrice;
	}
	
	public String print() {
		return "This drug, "+name+ ", costs "+price+" and has an LD50 of "+ldfifty+".";
	}
	

	
}

