package ex0212.elec2;

public class Audio extends Elec implements ElecFunction {
     private int volume;
     
     
     
	public Audio() {
		
	}
    public Audio(int volume) {
		this.volume=volume;
	}

	 public Audio(String code, int cost, int volume) {
		super(code, cost);
		this.volume=volume;
	 }

	 
	@Override
	public void start() {
		// A04의 Audio를 200으로 듣는다.
		System.out.println(getCode()+"의 " + 
		  getClass().getSimpleName() +" 를 " + volume +"듣는다.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Audio [");
		
		builder.append( super.toString() );
		
		builder.append(", volume=");
		builder.append(volume);
		
		builder.append("]");
		return builder.toString();
	}
	
	
	

}










