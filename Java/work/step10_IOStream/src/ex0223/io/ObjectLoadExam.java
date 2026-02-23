package ex0223.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
    public ObjectLoadExam() {
    	//객체가 저장된 파일을 복원한다.
    	try(ObjectInputStream ois = 
    			new ObjectInputStream(new FileInputStream("src/ex0223/objSave.txt"))){
    		
    		/*Student st1 = (Student)ois.readObject();
    		Student st2 = (Student)ois.readObject();
    		
    		System.out.println("st1 = " + st1);
    		System.out.println("st2 = " + st2);*/
    		
    		List<Student> list = (List<Student>)ois.readObject();
    		System.out.println(list);
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		 new ObjectLoadExam();

	}

}
