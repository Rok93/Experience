import java.lang.String;

public class frogExam {

    public static void main(String[] args) {
        String words = "aA가간,bB나냐,Z카캭";
        System.out.println(solution(words));
    }

//solution 메소드
    public static String solution(String input) {
        StringBuffer sb = new StringBuffer();
        char[] chr = new char[30];
        chr = input.toCharArray();
        String result = "";
        //System.out.println(chr);  그대로 옮겨짐 !
        for (int i = 0; i < chr.length; i++) {
            // if('a' < chr[i] < 'z')
            if(chr[i]>='a' && chr[i]<='z')
                chr[i] = (char) ('z' - chr[i]+'a');
            else if(chr[i]>= 'A' && chr[i]<= 'Z')
                chr[i] = (char) ('Z' - chr[i]+'A');
            else
                chr[i]= chr[i];
            result = sb.append(chr[i]).toString();
        }

        return result;
    }
}




