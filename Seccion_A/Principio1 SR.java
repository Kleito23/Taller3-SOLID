public class Restaurante{
    //atributos
    private String platoTipico;
    private String platoInternacional;
    private String platoRegional;

    public double calcularValor(String plato){
        if(plato == platoTipico) {
            //calculo
        }
        if(plato == platoInternacional){
            //calculo
        }
        if(plato == platoRegional){
            //calculo
        }

        return calculo;
    }

}

public interface Plato{
    int Precio;
    int iva;

    public double calcularValor();
}

public class PlatoTipico{
    //atributos

    public double calcularValor(){
        //operacion
    }
}
public class PlatoInternacional{
    //atributos

    public double calcularValor(){
        //operacion
    }
}

public class Restaurante{
    private Plato plato;

    public void imprimirValor(Plato plato){
        System.out.println("El valor es: " plato.calcularValor());
    }
}



