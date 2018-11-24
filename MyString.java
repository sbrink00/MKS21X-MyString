public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;

  public static void main(String[]args){
    MyString a = new MyString("hello");
    //System.out.println(a.subSequence(1,3));
    //a = a.subSequence(1,3);
    //System.out.println(a);
    //System.out.println(a);
    //System.out.println(a.toString());
    //System.out.println(a.length());
    //System.out.println(a.charAt(3));
    //System.out.println(a.subSequence(0,3));
    //a = new MyString(a.subSequence(0,3));
    //System.out.println(testNum);
    MyString s1 = new MyString("bbbbbb");
    MyString s2 = new MyString("a");
    System.out.println(s1.compareTo(s2));
    System.out.println("bbbbbb".compareTo("a"));
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
    for (int idx = 0; idx < this.length(); idx ++){
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
