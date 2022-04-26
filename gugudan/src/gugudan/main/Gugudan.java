package gugudan.main;

public class Gugudan extends GugudanSuper{

    public void printAll(int rows){
        int start = 2;
        int temp;
        int end;
        if (rows == 3 ||rows == 5 || rows == 6 || rows == 7){
            System.out.println("Error");
            return;
        }
        temp = 9 / rows + ((rows+1)%2) ;
        end = temp;
        do{
            super.printRow(start,end);
            end += temp;
            start += temp;
            end--;
            start--;
        }while(--rows > 0);
    }
}
