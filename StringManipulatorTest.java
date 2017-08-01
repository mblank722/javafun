public class StringManipulatorTest {
  public static void main (String[] args){

    StringManipulator manipulator = new StringManipulator();
    String str = manipulator.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld

    Integer index = manipulator.getIndexOrNull(" Hello",'l');
    System.out.println(Integer.toString(index));

    Integer nullIndex = manipulator.getIndexOrNull(" Hello",'l');
    System.out.println("Null: " + nullIndex);


  }
}
