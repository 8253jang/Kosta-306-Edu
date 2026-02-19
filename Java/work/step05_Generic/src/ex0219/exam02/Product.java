package ex0219.exam02;

public class Product<K , M> {
  //상품종류
	private K kind;// Tv or Vedio....
	
  //상품모델정보
	private M model;

	public K getKind() {
		return kind;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
	
}
