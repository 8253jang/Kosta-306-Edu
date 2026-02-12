package ex0212.board;

/**
 * 자료실 게시판의 속성 관리 객체
 * */
public class UploadBoard extends Board {
	private String fileName;

	public UploadBoard() {}

	public UploadBoard(int no, String subject, String writer, String content,String fileName) {
		super(no, subject, writer, content);
		this.fileName=fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
