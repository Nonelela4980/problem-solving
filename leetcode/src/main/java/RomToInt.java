import java.util.HashMap;
public class RomToInt {
    /** source: https://leetcode.com/problems/roman-to-integer/
     * IF a smaller number appears before larger number you subtract it.
     * If a bigger number appears before smaller one: add it.
     * */
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = getSymbols();
        int total = 0;
        for(int i=0;i<s.length();i++){
            Character currentVal  = s.charAt(i);
            if((i+1)<s.length() && isSmaller(currentVal,s.charAt(i+1),map)){
                total += -(map.get(currentVal));
            }else {
                total+=map.get(currentVal);
            }
        }
        return total;
    }
    public HashMap<Character,Integer> getSymbols(){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }
    public boolean isSmaller(Character a,Character b, HashMap<Character,Integer> map)
    {
        return map.get(a)<map.get(b);
    }
}
