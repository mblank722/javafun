public class StringManipulator {
  public static String trimAndConcat(String string1, String string2) {
    String string3 = string1.trim().concat(string2.trim());
    return string3;
  }

  public static Integer getIndexOrNull(String string1,char char1) {
    String string2 = Character.toString(char1);
    Integer index1 = string1.indexOf(string2 );
    if (index1 < 0) {
      index1 = null;
    }
    return index1;
  }
}
