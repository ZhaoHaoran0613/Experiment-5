import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //读取B.txt并处理文本
        FileReader in = null;
        StringBuffer s = new StringBuffer();
        try {
            in = new FileReader("B.txt");
            char[] chars = new char[7];
            for (int i = 1;in.read(chars) !=-1&&i<=34;i++){
                String str = new String(chars);
                if (i%2==1){
                    s.append(str+",");
                }else if (i%2==0){
                    s.append(str+"。"+"\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {                 //空指针异常。in为空导致
                    e.printStackTrace();
                }
            }
        }
        //向文件A.txt中写入处理好的文本
        FileWriter out = null;
        try {
            out = new FileWriter("A.txt");
           out.write(String.valueOf(s));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //统计古诗中某个字或词出现的次数
        System.out.println("输入要查询的字或词：");
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
