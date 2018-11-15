import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomList
{

  public static void main(String[] args) throws FileNotFoundException
  {

    Scanner scn = new Scanner(new File("names.txt"));

    ArrayList<String> names = new ArrayList<String>();

    while (scn.hasNextLine())
    {

      String name = scn.nextLine();
      names.add(name);

    }

    scn.close();

    String[] matches = new String[names.size()];

    for (String s : names)
    {

      int i = (int) (Math.random() * (matches.length));
      while (matches[i] != null || names.get(i).equals(s))
      {

        i++;
        if (i > matches.length - 1)
        {

          i = (int) (Math.random() * (matches.length));

        }

      }

      matches[i] = s;

    }

    for (int i = 0; i < names.size(); i++)
    {

      if (names.get(i).length() < 8)
      {

        System.out.println(names.get(i) + "\t\t" + matches[i]);

      }
      else
      {
        
        System.out.println(names.get(i) + "\t" + matches[i]);
        
      }

    }

  }

}
