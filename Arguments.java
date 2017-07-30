public class Arguments
{
    public boolean onEnter(String cmd, String[] args)
    {
        try
        {
            if(cmd.isEmpty())
            {
                throw new IllegalArgumentException();
            }
            else if(cmd.equalsIgnoreCase("!help"))
            {
                System.out.println(); // commands go here
                System.out.close();
            }
        } catch(IllegalArgumentException e)
        {
            e.getCause();
        }
    }
}

