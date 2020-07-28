package ali;

public class QuestionOne {

    public  static  int getnumber(int n)
    {
        int num;
        if (n == 10)
            return 1;
        else
        {
            num = (getnumber(n + 1) + 1) * 2;
            //每天剩余后一天加一的二倍
            System.out.println("猴子第" + n + "天剩余" + num + "个香蕉\n");
        }
        return num;
    }


    public static void main(String[] args)
    {
        int num = getnumber(1);
        System.out.println("猴子共偷了" + num + "个香蕉");
    }

}
