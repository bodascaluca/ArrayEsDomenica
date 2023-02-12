public class Main1 {
    public static void main(String[] args) {
        /*
### *1) Unione Array*

*Requisiti:* In questo esercizio non è possibile utilizzare nessuna classe, proprietaria di Java, che richieda di essere istanziata (es. no ArrayList, ecc).

*Consegna:*
Scrivere un metodo che in input riceva 2 array e restituisca l'unione dei 2 array.
I valori all' interno dell'array unito non devono essere ripetuti.


Es:
A = (3, 2, 4, 7, 4, 5)
B = (3, 1, 9)
Risultato:
(3, 2, 4, 7, 5,1,9)

        * */

        int array[][] = new int[2][3];

        array[0] = new int[]{2, 3, 1};
        array[1] = new int[]{2, 8, 9};

        for(int i=0; i< array.length;i++){

            for (int j =0; j<array[i].length;j++){
                if(array[i][j]==array[1][j])
                    System.out.println("*");
                //System.out.println(array[i][j]+" ");
            }
        }

/*
        int []nuvo = new int[(uno.length+ due.length)];



        for(int i= 0,j=0; i<uno.length;i++,j++){

        }
        for(int i=0; i<due.length;i++){
            System.out.println("Numero"+due[i]);

        }
        */
    }
}