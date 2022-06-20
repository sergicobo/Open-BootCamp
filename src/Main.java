public class Main
{
    public static void main (String[] args)
    {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Numero de Puertas: " + miCoche.puertas);

        int resultado = suma(13,17,24);
        System.out.println("Resultado de la suma: " + resultado);
    }

    public static int suma (int a, int b, int c)
    {
        return a + b + c;
    }
}

class Coche
{
    public int puertas = 0;

    public void AgregarPuerta()
    {
        this.puertas++;
    }
}