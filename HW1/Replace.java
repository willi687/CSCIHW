package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// EX I MAKE BREAD, 2, T
//    I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
        //s.substring() lookup java substring java replace charecter in string at certain index
    public String charReplace(String s, int x, char z) {
     return s.substring(0, x) + z + s.substring(x+1);
        
    }
    
}
