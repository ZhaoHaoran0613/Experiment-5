import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

import java.util.Scanner;
import java.util.StringTokenizer;

public class English {
        public static  void main(String args[]){
            String s="Please send this message to those people who mean something to you,to those who have touched your life in one way or another,to those who make you smile when you really need it,to those that make you see the brighter side of things when you are really down,to those who you want to let them know that you appreciate their friendship.And if you don’t, don’t worry,nothing bad will happen to you,you will just miss out on the opportunity to brighten someone’s day with this message." ;
            StringTokenizer st=new StringTokenizer(s," ,");
            int number=st.countTokens();
            while (st.hasMoreTokens()){
                String str= st.nextToken();
                System.out.println(str);
            }

            System.out.println("共有单词"+number+"个");
            System.out.println("请输入要查询的单词");
            int i = 0;
            int count = 0;
            Scanner sc=new Scanner(System.in);
            String word=sc.next();
            while(s.indexOf(word,i)>=0){
                count++;
                i=s.indexOf(word,i)+word.length();
            }
            System.out.println(word+"出现次数为"+count+"次。");
        }
}
