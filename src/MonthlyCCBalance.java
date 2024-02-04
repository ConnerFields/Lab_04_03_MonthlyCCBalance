//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
        int startBalance = 5000; //will be input by user later
        double balOneMonth; //calculated for one month
        double balTwoMonth; //calculated two month
        Double INTEREST = 1.17; //Static interest increase

        balOneMonth=startBalance * INTEREST;
        balTwoMonth=balOneMonth * INTEREST;

        System.out.println("Your current balance is $"+startBalance+". Without payment for one month it will be $"+balOneMonth+" and in two months it will be $"+balTwoMonth+".");

    }
}