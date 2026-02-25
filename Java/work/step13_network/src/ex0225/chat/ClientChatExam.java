package ex0225.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import ex0225.net.SendThread;

/**
 * 서버와 1 : 1 채팅을 위한 클라이언트 
 * */
public class ClientChatExam {
    public ClientChatExam() {
    	try {
    		Socket sk = new Socket("127.0.0.1" , 8001);
    		
    		//보내는 스레드(전송=출력)
            new SendThread(sk, "[CLIENT]").start();
    		
    		//받는 스레드 (읽기)
            new Thread(()->{
            	try {
            		 BufferedReader br = 
     						new BufferedReader(new InputStreamReader(sk.getInputStream()));
     				 
     				  while(true) {
     					  String readData = br.readLine();
     					  
     					  if(readData.equals("exit"))break;
     					  
     					  System.out.println(readData);
     				  }
            		
     				  System.out.println("Client 받는 스레드 종료합니다.");
            		
            	}catch (Exception e) {
					e.printStackTrace();
					System.out.println("Client의 받는 스레드 예외 발생했어요.");
				}finally {
					System.out.println("--모든 프로그램을 종료합니다 ---");
					System.exit(0);
				}
            }).start();
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		new ClientChatExam();

	}

}
