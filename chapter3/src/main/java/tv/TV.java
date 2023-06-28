package tv;

public class TV {
	private int channel; // 1~255 rotate
	private int volume; // 1~100 rotate
	private boolean power;
	
	public void power(boolean on) {
	}

	public void volume(int volume) {
		
		this.volume = volume;
		
	}
	
	public void volume(boolean up) {
		this.volume = 1;
		if(up) {
			this.volume += 1;
				if(volume == 101) {
					this.volume = 1;
				}
			
		} else {
			this.volume -= 1;
				if(volume == 0) {
					this.volume = 100;
				}
			
		}
	}
	
	public void channel(int channel) {
		
	}	
	
	public void channel(boolean up) {
		this.channel = 1;
		if(up) {
			this.channel += 1;
				if(channel == 255) {
					this.channel = 1;
				}
			
		} else {
			this.channel -= 1;
				if(channel == 0) {
					this.channel = 255;
				}
			
		}
		
	}	
	
	
	
	
	public void status() {
		System.out.println("TV[power =" +  (power ? "on" : "off") + ", channel = " + channel + ", volume = " + volume);
	}
	
	//power ? on : off 는 power가 true면 on. false라면 off. 삼항연산자
	
	
	

}
