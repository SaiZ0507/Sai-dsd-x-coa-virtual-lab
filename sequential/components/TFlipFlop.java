package dsd.sequential.components;

public class TFlipFlop {
    private int q = 0;
    
    public int get(){
        return q;
    }

    public int getQ(){
        return q;
    }
    public int getQBar(){
        return q == 0 ? 1 : 0;
    }
    
    public void clockPulse(int t){
        if(t ==0){
            //No Change
        }else if(t == 1){
            q = q == 0 ? 1:0;
        }else{
            System.out.println("Invalid T input");
        }
    }
}
