public class MetodosOrdenamiento {


    public int[] sortBySelection(int[]array, boolean validar){
        int tamanio = array.length;

        //Recorrer el arreglo
        for (int i = 0; i < tamanio ; i++ ){

            int indiceMayor = i;
            for (int j = i+1 ; j< tamanio ; j++){
                /*if ( validar == true){
                    if (array[j] > array[indice]){
                        indice = j;
                    }
                }else if (validar == false){
                    if (array[j] < array[indice]){
                        indice = j;
    
                    }
                    

                }*/

                if (validar
                ? array[j] < array [indiceMayor] 
                : array[j] >array [indiceMayor]) {
                    indiceMayor = j;
                }
            }
            ///Intercambio del indice encontrado por el primero 
            int aux = array [indiceMayor];
            array [indiceMayor] = array[i];
            array[i]= aux;

        }

        return array;
    }

    public void printArray (int[] array){
        
        for (int element : array){
            System.out.print(" | "+element );
        }
        System.out.println("\n");

    }

}