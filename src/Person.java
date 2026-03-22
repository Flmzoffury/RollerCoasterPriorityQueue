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

    public boolean equals(Object compareObj)
    {
        if (compareObj instanceof Person)
        {
            Person temp = (Person) compareObj;
            if (temp.getName().equals(name) && temp.getPriority() == priorityLevel)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
