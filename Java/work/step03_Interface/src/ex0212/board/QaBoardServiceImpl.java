package ex0212.board;
/**
 * QA게시판 비지니스 로직 담당클래스
 * */
public class QaBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("qa = "+ board);
		System.out.println("QaBoardServiceImpl의 insert call.");
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("qa = "+ board);
		System.out.println("QaBoardServiceImpl의 update call.");
		return true;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println("QaBoardServiceImpl의 selectByNo call.");
		return new QaBoard(10, "연습중", "희정", "재미있다.", false);
	}

}






