package ex0203.제어문;

public class SwitchExam01 {

	public static void main(String[] args) {
		// 1~ 12사이의 난수를 발생한다.
       double nansu = (Math.random()*12 + 1);
		System.out.println("난수 = "+ nansu);
		
		int month = (int)nansu;
		System.out.println("변환 = " + month);
	
		//그 난수는 월이라고 생각하고 월에 해당하는 마지막 일수를 출력한다.
		
		//if문
		 int endDay=31;
		 
//		 if(month == 2) endDay=28;
//		 else if(month==4 || month==6 || month==9 || month==10)endDay=30;
//		 //else endDay=31;
		
		//switch
		/* switch(month) {
		   case 2 : endDay=28;  break;
		   case 4 : case 6: case 9: case 11: endDay=30; break;
		   default : endDay=31;
		}*/
		 
		//version 14이후
		/*switch(month) {
		   case 2 :endDay=28;break;
		   case 4,6,9,11 : endDay=30; break;
		   default : endDay=31;
		}*/
		 
		 /*endDay = switch(month) {
		   case 2 -> 28;
		   case 4,6,9,11  ->30; 
		   default  -> 31;
		};*/
		 
		 endDay = switch(month) {
		   case 2 -> 28;
		   case 4,6,9,11  ->{
		     System.out.println("안녕");
		      yield 30;
		   }
		   default  -> 31;
		};
		
		System.out.println(month+"월은 " + endDay + "일까지 있습니다.");

	}

}














