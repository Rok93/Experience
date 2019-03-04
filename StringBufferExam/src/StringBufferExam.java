import java.sql.SQLOutput;

public class StringBufferExam {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world!");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello"); /*sb2가 가지고 있는 append 메소드를 통해서 "hello"를 추가했고,
                    이때 이 append 메소드는 자기자신 this 가 반환되고 이 반환한 것을 sb3 변수로 받아낸 것
                    따라서 sb2와 sb3는 같은것이다.*/
        if(sb2 == sb3)
            System.out.println("sb2 == sb3");

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
            /*StringBuffer가 가진 메소드를 호출할 수 있는데, StringBuffer는 메소드 체이닝 함으로, 계속 String Buffer의
        메소드를 호출할 수 있다.  꼬리에 꼬리에 꼬리물기 ....같은 느낌*/
        System.out.println(str2); //여러줄에 걸쳐서 작성했던 것을, 한줄로 만들 수 있다!
    }
}
