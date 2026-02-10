package ex0206.array.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	
	//학생의 정보를 저장할 배열 선언
	Student stArr [] = new Student [10];//최대 10명
	public static int count;// 배열에 저장된 객체의 개수를  체크하는 필드
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	 public void init(String [][] data) {
		 for(int i=0; i < data.length ; i++) {
		  stArr[count++] = this.create( data[i] );
		 }
		 
		 System.out.println("**초기화 완료****");
		 /*for(int i=0; i < count ; i++) {
			 System.out.println( stArr[i] );
		 }*/
	 }
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	 private  Student create(String [] row ){//{"희정","20","서울"}
		 Student st = new Student();
		 st.setName(row[0]);
		 st.setAge(Integer.parseInt(row[1]));
		 st.setAddr(row[2]);
		 
		 return st;
	 }
	
	

	 /**
	   학생의 정보 등록하기 
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력.
	      이름이 중복되면 등록 안됨.
	      추가가 성공하면 "등록되었습니다" 메시지를 출력
	      
	      @return :  1이면 성공, 0 이면 중복, -1 이면 배열 경계벗어남
	  **/
	 public int insert(Student student){
		 //배열크기체크
		  if(stArr.length ==count) return -1;
		  
		  //중복체크
		   if( this.selectByName(student.getName()) != null)return 0;
		  
		 
		 stArr[count++] = student;
		  return 1;
	 }
	 
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	 public Student[]  selectAll(){
		 return stArr;
	 }
	 
	  
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 *     
	 *     @return : 찾은 학생의 정보(이름, 나이,주소) Student리턴
	 *               없으면 null 리턴 
	 * */
	 public Student selectByName(String name){
		 for(int i=0; i < count ; i++) {
			 Student searchedSt = stArr[i];
			 if(searchedSt.getName().equals(name)) {
				return  searchedSt; //찾은 객체 리턴한다.
			 }
		 }
		 
		 //못찾았다.
		 return null;
	 }
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   "수정되었습니다" 출력
	 *   @param : Student
	 *   @return : boolean
	 * */
	 
	 public boolean update(Student student){
		 //전달된 이름에 해당하는 학생의정보가 있는지 찾기
		Student findStudent = this.selectByName(student.getName());
		if(findStudent!=null) {
			
			//findStudent =student; x
			
			//찾았다. -> 변경하자
			findStudent.setAddr(student.getAddr());
			findStudent.setAge(student.getAge());
			
			return true;
			
		}
		
		 return false;
		 
	 }
	 

}










