package Entities;



public class Game {
	
	int id;
	String name;
	int price;
	String developer;
	String engine;
	int releaseDate;
	String platform;
	
	
	public Game() {
		
	}
	
	public Game(int id,String name,int price,String developer,String engine,int releaseDate,String platform) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.developer = developer;
		this.engine = engine;
		this.releaseDate = releaseDate;
		this.platform = platform;
		
	}
	
	
	@Override
	public String toString() {
	        return
	                "   OYUN B�LG�LER� "+ '\n' +
	                "Oyun Ismi= " + getName() + '\n' +
	                "Oyun Fiyat�= " + getPrice() + '\n' +
	                "Oyun Yap�mc�s�= " + getDeveloper() + '\n' +
	                "Oyun Moturu= " + getEngine()  + '\n' +  
	                "Oyun ��k�� Y�l�= " + getReleaseDate() + '\n'+
	                "Oyun ��k�� Platformu= " + getPlatform() + '\n' ;
	    }
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	

}
