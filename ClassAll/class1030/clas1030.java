package ClassAll.class1030;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class clas1030 {
    public static void main(String[] args) {
        List<String> list =null;
        try {
            Reader in =new FileReader("C:\\py\\bs.txt");
            BufferedReader br =new BufferedReader(in);
            String str=null;
            list=new ArrayList<String>();
            int temp=0;
            int flag=0;
            while(null!=(str=br.readLine())){
                if(flag==0){
                    str=str.substring(1);
                    flag=1;
                }
                if(str.length()>temp){
                    temp =str.length();
                }
                list.add(str);
            }

            for(String s:list){
                System.out.println(s);
            }
            int row=list.size();
            int col=temp;
            PrintWriter pw=new PrintWriter("C:\\py\\bs1.txt");

            for(int i=0;i<col;i++){
                for(int j=row-1;j>=0;j--){
                    String s = list.get(j);
                    if(i>=s.length()){
                        pw.print(" "+"\t");
                    }else {
                        char c = s.charAt(i);
                        pw.write(c + "\t");
                    }
                }
                pw.println();
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
