public abstract class Operaciones {

    int valor1, valor2;
    private int resultado;
    
    public void SetValor(int a, int b){
        valor1 = a; valor2 = b;
        resultado=a+b;
    }
    
    public int GetValor(int a, int b){
        return resultado;
    }
    public abstract void Operaciones(); 
    
    public void MostrarResultado(){
        System.out.print("El Resulltado de la Suma Es: ");
        System.out.print(resultado);
    }
}