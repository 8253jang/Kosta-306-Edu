package ex0210.ch06;

public class Member {
    String name;     // 이름 (문자열)
    String id;       // 아이디 (문자열)
    String password; // 패스워드 (문자열)
    int age;         // 나이 (정수)
    
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}