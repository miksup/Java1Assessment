
public class Paint {
	private String name;
	private double price;
	private int volume;
	private int coverPerM2;
	
	public Paint(String name, double d, int volume, int cover) {
		this.name = name;
		this.price = d;
		this.volume = volume;
		this.coverPerM2 = cover;
	}
	
	//////////////////////////////////////////NAME

	public String getName() {
		String name = this.name;
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//////////////////////////////////////////PRICE
	
	public double getPrice() {
		double price = this.price;
		
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	///////////////////////////////////////////VOLUME
	
	public int getVol() {
		int volume = this.volume;
		
		return volume;
	}
	
	public void setVol(int volume) {
		this.volume = volume;
	}
	
	///////////////////////////////////////////COVER
	
	public int getCover() {
		int cover = this.coverPerM2;
		
		return cover;
	}
	
	public int setCover(int cover) {
		this.coverPerM2 = cover;
		
		return cover;
	}
}
