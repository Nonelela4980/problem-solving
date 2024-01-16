public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys=0;
        int level=0;
        int index=0;
        while(index<path.length()){
            if (path.charAt(index)=='U'){
                level++;
                if (level==0){
                    valleys++;
                }
            }else {
                level--;
            }
            index++;
        }
        return valleys;
    }
    public static void main(String[] args) {
        System.out.println( countingValleys(12,"DDUUDDUDUUUD"));
    }
}
