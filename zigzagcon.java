class Solution {
    public String convert(String s, int numRows) {
       String lines[] = new String[numRows];
       if (s.length() == 0 || s.length()==1 || numRows == 1) 
           return s;
        
       boolean down = true; 
       int line = 0; 
       for (int i = 0; i < s.length(); i++) {
           String ch = Character.toString(s.charAt(i));
           lines[line] += ch;
           
           if (line == numRows-1) 
               down = false;
           else if (line == 0)
               down = true;
           
           
           if (down) 
              line++;
           else 
               line--;
       }
       
       String zig_zag = "";
       for (int i = 0; i < numRows; ++i) 
            zig_zag += lines[i];
       
       zig_zag = zig_zag.replaceAll("null", "");
       return zig_zag;
    
}
}
