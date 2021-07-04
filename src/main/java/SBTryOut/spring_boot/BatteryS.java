package SBTryOut.spring_boot;

import org.springframework.stereotype.Component;

@Component
public class BatteryS {
	
	private String name;
	private int duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	BatteryS(){
		System.out.println("BateryS is created...");
	}
	
	public void use() {
		System.out.println("BatteryS is used...");
	}

}
