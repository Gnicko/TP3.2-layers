import Persisteincia.RepositorioDeEmpleadosEnMemoriaParaTest;
import libreria.MandarEmailTest;
import modelo.Empleado;
import modelo.SaludoCumpleaños;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SaludoCumpleañosTest {
    @Test
    public void VerificarCumpleañosTest() {
        //SetUp
        SaludoCumpleaños saludoCumpleaños;
        MandarEmailTest mandarEmailTest = new MandarEmailTest();
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Gomez", "Nicolas", FechaActual(), "CorreoDelCumplañero@gmail.com"));
        empleados.add(new Empleado("Lopez", "Gonzalo", "2000/04/29", "n1@gmail.com"));
        empleados.add(new Empleado("Perez", "Pedro", "1990/05/15", "n2@gmail.com"));
        empleados.add(new Empleado("Diaz", "Sara", "1996/02/13", "n3@gmail.com"));
        saludoCumpleaños = new SaludoCumpleaños(new RepositorioDeEmpleadosEnMemoriaParaTest(empleados), mandarEmailTest);
        //ejercitacion
        saludoCumpleaños.VerificarFechaCumpleaños();
        //verificacion
        assertTrue(mandarEmailTest.seEnvioElMensajeA("CorreoDelCumplañero@gmail.com"));
    }

    public String FechaActual() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
