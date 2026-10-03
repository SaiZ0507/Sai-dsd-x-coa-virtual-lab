package dsd.sequential.components;

public class JKFlipFlop {
 private int q = 0;

    public int getQ() {
        return q;
    }

    public int getQBar() {
        return q == 0 ? 1 : 0;
    }

    public void clockPulse(int j, int k){
        if(j == 0 && k == 0){
            //No change
        }else if(j == 0 && k == 1){
            q = 0;
        }else if(j == 1 && k == 0){
            q = 1;
        }else{
            q = q == 0 ? 1 : 0;
        }
    }
}