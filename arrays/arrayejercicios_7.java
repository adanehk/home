
public class arrayejercicios_7{
    final static int cantidad = 5;
    public static void main(String[]args){
        int[]num1={3, 8, 4, 12, 21};
        int[]num2={6, 16, 8, 21,12};
        int[] sumas= new int[5];
        for(int i=0;i<cantidad;i++){
            sumas[i]=num1[i]+num2[i];
            System.out.println(sumas[i]);
        }
    }
}