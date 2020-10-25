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

//        file.getFreeSpace();
//        file.getName();
//        file.getParent();
//        file.getParentFile();
//        file.getPath();
//        file.isAbsolute();
//        file.isDirectory();
//        file.length();
//        file.list();
//        file.listFiles();
//        file.mkdir();
//        file.mkdirs();
//        file.separator;//获取当前OS的路径分隔符
    }
}
