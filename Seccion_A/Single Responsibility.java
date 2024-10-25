public class Reporte {
    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getContenido(){
        return contenido;
    }
    
    public void imprimirReporte(){
        //Logica para imprimir el reporte
        System.out.println("Imprimiendo reporte: " + titulo + " " + contenido);
    }

    public void enviarReporteEmail(String email){
        System.out.println("Enviando email a " + email)
    }


}

public class Reporte {
    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getContenido(){
        return contenido;
    }
}

public class ImpresorReporte{
    public void imprimirReporte(Reporte reporte){
        //Logica para imprimir el reporte
        System.out.println("Imprimiendo reporte: " + reporte.getTitulo() + " " + reporte.getContenido());
    }
}

    public void enviarReporteEmail(String email, Reporte reporte){
        System.out.println("Enviando email a " + email ": " + reporte.getTitulo())
    }





