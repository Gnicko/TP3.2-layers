import Persisteincia.RepositorioDeEmpleadosPorArchivo;
import libreria.MandarEmail;
import modelo.SaludoCumpleaños;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        SaludoCumpleaños saludoCumpleaños = new SaludoCumpleaños(
                new RepositorioDeEmpleadosPorArchivo(new File("ArchivoEmpleados")),
                new MandarEmail());
        saludoCumpleaños.VerificarFechaCumpleaños();
    }
}
