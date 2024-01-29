public class ClosestToZero {
    //C# Code
    public static int ComputeClosestToZero(int[] ts)
    {
        if(ts.Length==0)
            return 0;
        int closest = int.MaxValue;
        for(int i=0;i<ts.Length;i++){
            int value = ts[i];
            if(value>0 && value!=Math.Abs(closest)){
                closest = Math.Min(value,Math.Abs(closest));
            }else if( value < 0){
                if(Math.Abs(value)==Math.Abs(closest)){
                    closest = Math.Max(value,closest);
                }else{
                    if(Math.Abs(value)<Math.Abs(closest)){
                        closest = value;
                    }
                }
            }
        }
        return closest;
    }
}
