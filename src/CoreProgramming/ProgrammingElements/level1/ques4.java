package CoreProgramming.ProgrammingElements.level1;

class ques4{
    public static void main(String[]  args){
        int profit;
        int cost = 129;
        int selling = 191;
        profit = selling - cost;
        float profit_percentage = (profit * 100f)/cost;
        System.out.println("The cost Price is INR"+cost+" and selling price is INR"+selling);
        System.out.println("The profit is INR"+profit+" and the profit percentage is"+profit_percentage);
    }
}