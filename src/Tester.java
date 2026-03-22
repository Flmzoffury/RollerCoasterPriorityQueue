public class Tester
{
    public static void main(String[] args)
    {
        SamPriorityLine<Person> coasterLine = new SamPriorityLine<Person>(2);

        for (int i = 0; i < 5; i++)
        {
            coasterLine.add(new Person("John"+i, 0));
            coasterLine.add(new Person("Bob"+i, 1));
        }
        /*
        for (int i = 0; i < 5; i++)
        {
            coasterLine.poll();
        }

        System.out.println(coasterLine.peek());
         */
        coasterLine.print();
    }
}
