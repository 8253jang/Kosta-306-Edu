package ex0223.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutExam {
    public FileInputOutExam() {//IO는 반드시 사용후 close()해야한다!!
    	FileInputStream fis = null;
    	FileOutputStream fos = null;
    	try {
	    	// byte단위 파일 읽기(InputStream --> FileInputStream)
    		fis = new FileInputStream("src/ex0223/test.txt");
    		/*while(true) {
	    		int i = fis.read();//1byte씩 읽기
	    		if(i==-1)break;
	    	    System.out.println(i +" = "+ (char)i);
    		}*/
    		int i=0;
    		while((i = fis.read() )!= -1) {
    			
    		}
    		
    		//////byte배열의 크기만큼 읽기 ///////////////
    		/// 
    		int len = fis.available();//읽을수 있는 byte 수 반환 
    		System.out.println("len = "+  len);
    		
    		//byte b [] = new byte [len];
    		
    		byte b [] = new byte [100];
    		int re=0;
    		while( ( re = fis.read(b) ) != -1) {
	    		System.out.println("re = "+ re);
	    		//System.out.println("b = "+ b);
	    		
	    		//byte배열을 -> String으로 변환!!!
	    		String data = new String(b);
		    	System.out.println("data = "  + data);
    		}
    		
    		///////////////////////////////////////////
    		//파일에 저장=출력
    		//fos = new FileOutputStream("src/ex0223/write.txt");//없으면만들고,있으면 덮어쓰기
    		fos = new FileOutputStream("src/ex0223/write.txt" , true);//없으면만들고,있으면 이어쓰기
    		fos.write(65);
    		fos.write(66);
    		
    		fos.write(13);
    		fos.write(10);
    		
    		fos.write(75);
    		
    		String str="배고프다 뭐먹지?";
    		
    		//String --> byte배열로 변환!!!
    		fos.write(str.getBytes());
	    	
    	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//닫기 
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
    	
    }
	public static void main(String[] args) {
		new FileInputOutExam();

	}

}
