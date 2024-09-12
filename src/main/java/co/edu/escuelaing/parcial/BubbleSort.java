package co.edu.escuelaing.parcial;


public class BubbleSort {
    double[] bubble = {};
    public BubbleSort(double[] bubble){
        this.bubble = bubble;
        sort();
    }
    public double[] sort(){
        double[] newBubble = {};
        boolean band = false;
        while(!band){
            int cont = 0;
            for(int x = 0; x <= bubble.length -2; x++){
                if(bubble[x] < bubble[x+1]){
                    newBubble[x] = bubble[x];
                    cont += 1;
                }else{
                    double varTemp = bubble[x];
                    newBubble[x]= bubble[x+1];
                    bubble[x+1] = varTemp; 
                    cont += 1;
                }
            }
            if(cont >= 0){
                band =true;
            }
        }
        return newBubble;
        
    }
}
