public class MyString implements CharSequence{
  private char[] data;

  public static void main(String[]args){
    MyString a = new MyString("hello");
    System.out.println(a);
    System.out.println(a.toString());
    System.out.println(a.length());
    System.out.println(a.charAt(3));
    System.out.println(a.subSequence(0,3));
    a = new MyString(a.subSequence(0,3));
    System.out.println(a);

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

  public CharSequence subSequence(int start, int end){
    String output = new String("");
    for (int idx = start; idx < end; idx ++){
      output += this.charAt(idx);
    }
    return output;
  }

  public String toString(){
    String output = "";
    for (int idx = 0; idx < data.length; idx ++){
      output += data[idx];
    }
    return output;
  }

}
