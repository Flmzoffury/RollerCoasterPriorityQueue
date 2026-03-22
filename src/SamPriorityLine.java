public class SamPriorityLine<T extends Valuable>
{
    LinkedList<T>[] lines;

    public SamPriorityLine(int numLevels)
    {
        lines = (LinkedList<T>[]) new LinkedList[numLevels];
        for (int i = 0; i < numLevels; i++)
        {
            lines[i] = new LinkedList<T>();
        }
    }

    public void add(T inputData)
    {
        Valuable temp = (Valuable) inputData;
        for (int i = 0; i < lines.length; i++)
        {
            if (temp.getPriority() == i)
            {
                lines[i].add(inputData);
            }
        }
    }

    public T peek()
    {
        for (int i = 0; i < lines.length; i++)
        {
            if (lines[i].getSize() > 0)
            {
                return lines[i].getHead().getData();
            }
        }
        return null;
    }

    public T poll()
    {
        T temp = null;
        for (int i = 0; i < lines.length; i++)
        {
            if (lines[i].getSize() > 0)
            {
                temp = lines[i].getHead().getData();
                lines[i].removeHead();
                return temp;
            }
        }
        return temp;
    }

    public void print()
    {
        SamPriorityLine<T> temp = new SamPriorityLine(lines.length);
        while (this.peek() != null)
        {
            System.out.println("[" + this.peek() + "]");
            temp.add(this.poll());
        }
        while (temp.peek() != null)
        {
            this.add(temp.poll());
        }
    }
}
