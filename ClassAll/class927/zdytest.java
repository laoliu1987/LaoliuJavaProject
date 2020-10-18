package ClassAll.class927;

public class zdytest {
    public static void main(String[] args)  {
        int age = 20;
        if (age>80){
            try {
                throw new AgeTooOldException();
            } catch (AgeTooOldException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("age 正常");
        }

        String name="zhangsan";
        String password="123456";
        if("lisi".equals(name)&&"111".equals(password)){
            System.out.println("--login success--");
        }else{
            throw new LoginException();
        }
        System.out.println("！");
    }
}
