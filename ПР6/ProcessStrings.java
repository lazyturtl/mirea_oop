public class ProcessStrings implements StringProcessor {
    public int countChars(String s){return s==null?0:s.length();}
    public String oddPositions(String s){StringBuilder sb=new StringBuilder();for(int i=0;i<s.length();i+=2)sb.append(s.charAt(i));return sb.toString();}
    public String invert(String s){return new StringBuilder(s).reverse().toString();}
    public static void main(String[]a){ProcessStrings ps=new ProcessStrings();System.out.println(ps.invert("abcdef"));}
}