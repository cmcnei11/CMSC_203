package labs;

public class Television {
	//fields
		private boolean powerOn = false;
		private int channel  = 0;
		private int volume = 0;
		 final String MANUFACTURER ;
		 final int SCREEN_SIZE;
		
		//constructor
		public Television(String manufacturer, int screenSize){
			SCREEN_SIZE = screenSize;
			MANUFACTURER =manufacturer;
			powerOn = false;
			volume = 20;
			channel = 2;
			
			
		}
		 
	
		
		//getter & setters
	public void setChannel(int channel){
	
		this.channel = channel;
	}
	public int getChannel(){
	
		return channel;
	}
	public int getVolume(){
		return volume;
	}
	public int getScreenSize(){
		return SCREEN_SIZE;
	}
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//methods
	
	public void power() {
	powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		this.volume++;
	}
	public void decreaseVolume() {
		this.volume--;
	}


	
	
}
