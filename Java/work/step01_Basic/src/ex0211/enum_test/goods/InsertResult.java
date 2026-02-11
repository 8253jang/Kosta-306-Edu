package ex0211.enum_test.goods;

public enum InsertResult {
   /**
    * 상품코드 중복되었을 때
    * */
	INSERT_DUPLICATE,
	
	/**
	 * 배열의 길이를 벗어 났을 때
	 * */
	INSERT_OUTINDEX,
	
	/**
	 * 등록이 성공했을 때 
	 * */
	INSERT_SUCCESS;
}

