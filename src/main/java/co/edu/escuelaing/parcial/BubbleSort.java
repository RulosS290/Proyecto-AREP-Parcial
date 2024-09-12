package co.edu.escuelaing.parcial;


public class BubbleSort {
    double[] bubble = {};
    public BubbleSort(double[] bubble){
        this.bubble = bubble;
        sort();
    }
    public double[] sort(){
        boolean band = false;
        while(!band){
            int cont = 0;
            double[] newBubble = {};
            for(int x = 0; x <= bubble.length -2; x++){
                if(bubble[x] < bubble[x+1]){
                    newBubble[x] = bubble[x];
                    cont += 1;
                }else{
                    double varTemp = bubble[x];
                    newBubble[x]= bubble[x+1];
                    newBubble[x+1] = varTemp; 
                    cont += 1;
                }
            }
            if(cont == 0){
                band = true;
            }
            bubble = newBubble;
        }
        return bubble;
        
    }
}
