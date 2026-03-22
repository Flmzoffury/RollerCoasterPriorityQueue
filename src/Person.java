public class Person implements Valuable
{
    private String name;
    private int priorityLevel;

    public Person(String inputName, int inputPriority)
    {
        name = inputName;
        priorityLevel = inputPriority;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name;
    }

    public int getPriority()
    {
        return priorityLevel;
    }

}
