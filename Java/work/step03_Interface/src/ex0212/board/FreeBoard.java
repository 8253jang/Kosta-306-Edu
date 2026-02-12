package ex0212.board;

/**
 * 자유게시판 속성관리
 * */
public class FreeBoard extends Board {
   public FreeBoard() {}

   public FreeBoard(int no, String subject, String writer, String content) {
	super(no, subject, writer, content);
	
   }
   
}
