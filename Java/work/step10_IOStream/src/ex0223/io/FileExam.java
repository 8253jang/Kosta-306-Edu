package ex0223.io;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane; //GUI

public class FileExam {
    public FileExam() throws IOException{
    	String path = JOptionPane.showInputDialog("파일경로는?");
    	
    	System.out.println(path);
    	
    	File file = new File(path);
    	
    	if(file.exists()) {//존재한다면 
    		System.out.println(path+"는 있습니다.^^");
    		if(file.isDirectory()) {//폴더니?
    			System.out.println("폴더안에 정보를 확인 해볼게요!!");
    			
    			String fileNames [] = file.list();
    			for(String fname : fileNames) {
    				System.out.println(fname);
    			}
    			
    		}else {//파일인경우
    			System.out.println("**파일의 정보를 확인해볼께요!!***");
    			System.out.println("file.canRead() = " + file.canRead());
    			System.out.println("file.canWrite() = " + file.canWrite());
    			System.out.println("file.length() = " + file.length());
    			System.out.println("file.getName() = " + file.getName());
    			System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    			System.out.println("file.lastModified() = " + file.lastModified());
    			
    		}
    		
    	}else {
    		System.out.println(path+"가 없으니 생성할께요.");
    		//파일생성
    		file.createNewFile();
    		
    		//폴더 생성
    		//file.mkdir();
    	}
    	
    	
    }
	public static void main(String[] args) throws IOException{
		new FileExam();

	}

}
