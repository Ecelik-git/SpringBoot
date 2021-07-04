package SBTryOut.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")

//This stops using “Singleton Design Pattern”, it means object will be created in every getBean() usage

public class Laptop {
	
	private Battery b;
	private int price;
	@Autowired
	//selects the objects by using data types as default
	@Qualifier("bS") //to use object names
	private BatteryS bS;
	
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public BatteryS getbS() {
		return bS;
	}
	public void setbS(BatteryS bS) {
		this.bS = bS;
	}
	public void turnOnLaptop() {
		bS.use();
		System.out.println("Laptop is turning on...");
	}
	
	Laptop(){
		System.out.println("laptop is created...");
	}
	
	

}
