package SBTryOut.spring_boot01;

public interface BatteryI {
	
	public void use();
	
	public default void use(BatteryA bA) {
		System.out.println("BatteryA is used");
	}
	
	public default void use(BatteryB bB) {
		System.out.println("BatteryB is used");
	}

}
