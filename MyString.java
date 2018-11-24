public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;

  public static void main(String[]args){
    MyString a = new MyString("hello");
    System.out.println(a);
    System.out.println(a.toString());
    System.out.println(a.length());
    System.out.println(a.charAt(4));
    System.out.println(a.subSequence(1,4));
    a = a.subSequence(1,4);
    System.out.println(a);
    System.out.println("testing compare to\n");
    //MyString ms1 = new MyString("hellabc");
    //MyString ms2 = new MyString("hell");
    //System.out.println(ms1.compareTo(ms2));
    String[][] comparables = {{"a", "c"}, {"hello", "hello"}, {"123", "123"}, {"12", "32"}, {"32", "12"}, {"hellabc", "hell"}, {"hell", "hellabc"}, {"90[]98*&^", "*(*^5{}|)"}};
    //for loop to test compare to with different values.
    //It tests myString compare to with string compare to to make sure they're the same
    for (int row = 0; row < comparables.length; row ++){
      String s1 = comparables[row][0];
      String s2 = comparables[row][1];
      MyString ms1 = new MyString(comparables[row][0]);
      MyString ms2 = new MyString(comparables[row][1]);
      System.out.println(s1.compareTo(s2) == ms1.compareTo(ms2));
    }


    System.out.println("a".compareTo("p"));
    System.out.println();
  }

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int idx = 0; idx < s.length(); idx ++){
      data[idx] = s.charAt(idx);
    }
  }

  public int length(){
    return data.length;
  }

  public char charAt(int idx){
    return data[idx];
  }

  public MyString subSequence(int start, int end){
    String output = new String("");
    for (int idx = start; idx < end; idx ++){
      output += this.charAt(idx);
    }
    return new MyString(output);
  }

  public String toString(){
    String output = "";
    for (int idx = 0; idx < data.length; idx ++){
      output += data[idx];
    }
    return output;
  }

  public int compareTo(CharSequence other){
    int limit;
    if (this.length() > other.length()) limit = other.length();
    else limit = this.length();
    for (int idx = 0; idx < limit; idx ++){
      char thisCurrentChar = this.charAt(idx);
      char otherCurrentChar = other.charAt(idx);
      int me = (int) thisCurrentChar;
      int you = (int) otherCurrentChar;
      if (me - you != 0) return me - you;
    }
    if (this.length() != other.length()) return this.length() - other.length();
    return 0;
  }

}
