public class Main {
    public static void main(String[] args) {
        int res = suma(1,2,3);
        System.out.println(res);
        Vehiculo mivehiculo = new Vehiculo();
        mivehiculo.AgregarPuerta();
        mivehiculo.AgregarPuerta();
        System.out.println(mivehiculo.numeropuertas);

    }
    public static int suma(int a, int b, int c){
        return  a + b + c;

}
}

class Vehiculo{
    public int numeropuertas = 0;

    public void AgregarPuerta(){
         this.numeropuertas++;
    }
}