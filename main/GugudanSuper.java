package gugudan.main;

public class GugudanSuper {
    public void printDan(int dan){
        for (int i = 1; i <= 9; i++)
            System.out.print(dan + "*" + i + "=" + i*dan +" ");
        System.out.print("\n");

    }
    public void printAll(){
        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(i + "*" + j  + "=" + i*j + " ");
            }
            System.out.print("\n");
        }
    }
    public void printRow(int start, int end){
        for (int i = 2; i <= 9; i++){
            for(int j = start; j <= end; j++){
                System.out.printf("%-1d * %-1d = %d \t",j,i,i*j);
            }
            System.out.println();
        }
    }
}
