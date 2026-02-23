package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutBufferedExam {
    public FileInputOutBufferedExam() {//IO는 반드시 사용후 close()해야한다!!
    	FileInputStream fis = null;
    	FileOutputStream fos = null;
    	
    	BufferedInputStream bis=null;
    	BufferedOutputStream bos=null;
    	try {
	    	// byte단위 파일 읽기(InputStream --> FileInputStream -->  BufferedInputStream
    		fis = new FileInputStream("src/ex0223/test.txt");
    		bis = new BufferedInputStream(fis);
    		
    		//////byte배열의 크기만큼 읽기 ///////////////
    		/// 
    		int len = bis.available();//읽을수 있는 byte 수 반환 
    		System.out.println("len = "+  len);
    		
    		//byte b [] = new byte [len];
    		
    		byte b [] = new byte [100];
    		int re=0;
    		while( ( re = bis.read(b) ) != -1) {
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
    		bos = new BufferedOutputStream(fos);
    		
    		bos.write(65);
    		bos.write(66);
    		
    		bos.write(13);
    		bos.write(10);
    		
    		bos.write(75);
    		
    		String str="배고프다 뭐먹지?";
    		
    		//String --> byte배열로 변환!!!
    		bos.write(str.getBytes());
	    	
    	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//닫기 
				if(bos!=null)bos.close();
				if(bis!=null)bis.close();
				
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
    	
    }
	public static void main(String[] args) {
		new FileInputOutBufferedExam();

	}

}
