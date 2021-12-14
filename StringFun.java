public class StringFun
{
  public static void main( String[] args )
  {
    String woodchuck = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
    String bard = "A fool thinks himself to be wise, but a wise man knows himself to be a fool.";

    // Check if the first string contains "woodchuck"
    System.out.println( woodchuck.contains( "woodchuck" ) );

    // Check if the bard string contains "star"
    System.out.println (bard.contains ("star"));

    // Check if the woodchuck string ends with "chuck wood?"
    System.out.println(woodchuck.endsWith("chuck wood?"));

    // Check if the bard string ends with "fool."
    System.out.println(bard.endsWith("fool."));

    // In string woodchuck, replace all instances of "woodchuck" with "groundhog"
    System.out.println(woodchuck.replace("woodchuck","groundhog"));

    // Display string bard in all lower case
    System.out.println(bard.toLowerCase());
  }
}