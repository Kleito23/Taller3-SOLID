//Violacion
public class Electrodomestico{

	public void encender(){
		System.out.println(“ Electrodomestico está encendido”);
}
}

public class Refrigeradora extends Electrodomestico{
    //Enciende la refrigeradora

}

public class Lavadora extends Electrodomestico{


    public void encender(){
        if(!tieneAgua)
            return;
        //enciende la lavadora
    }

}


//Correccion
public class Lavadora extends Electrodomestico{


    public void encender(){
        if(!tieneAgua)
            llenarDeAgua();
        //enciende la lavadora
    }

}
