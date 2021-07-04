package SBTryOut.spring_boot01;

import org.springframework.stereotype.Component;

@Component
public class BatteryA implements BatteryI{
	
	public int price;
	
	BatteryA(){
		System.out.println("BatteryA is created...");
	}

	@Override
	public void use() {
		System.out.println("BatteryA is used...");
	}
}
