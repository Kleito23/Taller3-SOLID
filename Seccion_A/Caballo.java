public class Caballo implements Animal{
   //atributos 
    @Override
    public void maullar(){
        //logica
    }
    public void ladrar(){
        //logica
    }

    public void rugir(){
        //logica
    }

    //Correccion

}

public class Leon implements Rugible{
        @Override
        public void rugir(){
        //logica
        }
        
    }

public class Gato implements Maullable{
        @Override
        public void maullar(){
        //logica
        }
        
    }

public class Perro implements Ladrable{
        @Override
        public void ladrar(){
        //logica
        }
        
    }