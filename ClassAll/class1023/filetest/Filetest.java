package ClassAll.class1023.filetest;

import java.io.File;
import java.io.IOException;

public class Filetest {
    public static void main(String[] args) {
        //java中windows路径的表示方法
        String path="C:/a.txt";
        /*
        * File表示一个文件：
        * */
        File file = new File(path);
        boolean b1 = file.canExecute();
        System.out.println(b1);
        //
        b1=file.canRead();
        System.out.println(b1);
        //
        try {
            b1=file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
        //
        b1=file.exists();
        System.out.println(b1);

        String ap=file.getAbsolutePath();
        System.out.println(ap);

        long freespace = file.getFreeSpace();
        System.out.println(freespace);
        String filename = file.getName();
        System.out.println(filename);
        String fileparent = file.getParent();
        System.out.println(fileparent);
        File fileparentfile = file.getParentFile();
        System.out.println(fileparentfile);
        String filepath = file.getPath();
        System.out.println(filepath);
        boolean isAbsolute = file.isAbsolute();
        System.out.println(isAbsolute);
        boolean isDirectory = file.isDirectory();
        System.out.println(isDirectory);
        long length = file.length();
        System.out.println(length);
        String[] strlist = file.list();
        System.out.println(strlist);
        File[] strlistfile = file.listFiles();
        System.out.println(strlistfile);
//        file.mkdir();
//        file.mkdirs();
        String str = file.separator;//获取当前OS的路径分隔符
        System.out.println(str);
    }
}
