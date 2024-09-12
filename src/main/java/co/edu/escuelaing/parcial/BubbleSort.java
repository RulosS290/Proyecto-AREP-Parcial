package co.edu.escuelaing.parcial;


public class BubbleSort {
    int[] bubble = {};
    public BubbleSort(int[] bubble){
        this.bubble = bubble;
        sort();
    }
    public int[] sort(){
        int[] newBubble = {};
        boolean band = false;
        while(!band){
            int cont = 0;
            for(int x = 0; x <= bubble.length -2; x++){
                if(bubble[x] < bubble[x+1]){
                    newBubble[x] = bubble[x];
                    cont += 1;
                }else{
                    int varTemp = bubble[x];
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
