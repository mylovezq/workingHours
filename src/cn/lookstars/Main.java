package cn.lookstars;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //输入ex退出
        //输入工作时长
        //例:8小时30分钟   0830
        //   7小时3分钟    0703
        //最大24小时       2400  最小0000
        String exit = "ex";
        Integer allHours = 0;
        Integer allMinute = 0;
        int count =0;
        System.out.println("请输入工作日需要的工作时长");
        Scanner scanner = new Scanner(System.in);
        Integer duration = Integer.parseInt(scanner.nextLine());
        System.out.println("请输工作时长");
        while (true){
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(exit))
            {
                //计算展示的小时分钟
                Integer exHour = allMinute/60;

                Double fractionHour = Double.parseDouble(allMinute.toString())/60;
                Double decimalMinute = fractionHour-exHour;

                Integer realAllHours = allHours+exHour;

                System.out.println("共工作" + realAllHours + "小时" + decimalMinute*60 + "分钟");

                System.out.println("需要的小时：" + count*duration);
                return;
            }
            if (!s.matches("[0-2][0-9][0-5][0-9]") || Integer.parseInt(s) >2400){
                System.out.println("请输入4位合法时间数字");
                continue;
            }
            count++;
            Integer hour = Integer.parseInt(s.substring(0, 2));
            Integer minute= Integer.parseInt(s.substring(2));
            allHours = allHours + hour;
            allMinute = allMinute + minute;

        }
    }
}
