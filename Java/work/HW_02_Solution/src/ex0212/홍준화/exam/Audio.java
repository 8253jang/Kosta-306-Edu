package ex0212.홍준화.exam;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() {}

	public Audio(int volumn) {
		super();
		this.volumn = volumn;
	}

	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;

	}
	
	@Override
	public void start() {
		//A01제품 TV를 12을 본다
		System.out.println(super.getCode()+"제품 Audio " + volumn);
	}
	
	@Override
	public void stop() {
		
	}
	
	@Override
	public void display() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("의 Audio를 ");
		builder.append(volumn);
		builder.append("으로 듣는다.");
		return builder.toString();
	}
	
}
