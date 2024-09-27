public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos de Ordenamiento");

        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        int[] arreglo= {1,5,4,22,234,7,68,4};
        int []arregloOrdenado=mO.sortBySelection(arreglo,true);
        int []arregloOrdenado2=mO.sortBySelection(arreglo,false);


        mO.printArray(arregloOrdenado);
        mO.printArray(arregloOrdenado2);


        







    }
}
