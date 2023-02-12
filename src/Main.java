public class Main {
    public static void main(String[] args) {

        int array1[] = {9, 8, 3};
        int array2[] = {2, 7, 9};
        int z[] = unione(array1, array2);

        //Metto in ordine l'array
        for (int i = 1; i < z.length; i++) {
            for (int j = 0; j < z.length; j++) {

                if (z[j] > z[i]) {
                    int tmp = z[i];
                    z[i] = z[j];
                    z[j] = tmp;
                }
            }
        }


        int []Daje= new int[z.length];
        //Il primo numero essendo più piccolo l'impongo uguale anche per il nuovo array
        Daje[0]=z[0];
        //Quanti elementi ci sono
        int counter = 1;
        //Conto è metto solo i numeri diversi nel nuovo array
        for (int i = 0; i<z.length;i++){
            if(Daje[counter-1]!= z[i]){
                Daje[counter]=z[i];
                counter++;
            }
        }

        //Serve per pulire l'0utput
        int[] v = new int[counter];
        for (int i=0;i< v.length;i++){
            v[i]=Daje[i];
            System.out.println(v[i]);
        }
    }


    public static int[]unione(int array1[],int array2[]){

        int z[]=new int [array1.length+array2.length];
        for(int i=0;i<array1.length;i++)
            z[i]=array1[i];
        for(int i=0;i<array2.length;i++)
            z[array2.length+i]=array2[i];
        return z;
    }


}







/*
        int array[][] = new int[2][3];

        array[0] = new int[]{2, 3, 1};
        array[1] = new int[]{2, 8, 9};

        for(int i=0; i< array.length;i++){

            for (int j =0; j<array[i].length;j++){
                if((array[0][j]==array[1][j]))
                    //System.out.println("*");
                System.out.println(array[i][j]+" ");
            }
        }
*/
/*
        int []nuvo = new int[(uno.length+ due.length)];



        for(int i= 0,j=0; i<uno.length;i++,j++){

        }
        for(int i=0; i<due.length;i++){
            System.out.println("Numero"+due[i]);

        }
        */
