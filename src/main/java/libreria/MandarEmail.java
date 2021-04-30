package libreria;

import modelo.Empleado;
import modelo.EnvioDeEmail;

public class MandarEmail implements EnvioDeEmail {
    public MandarEmail() {
    }

    ;

    @Override
    public void enviar(Empleado empleado) {
        try {
            new Email(empleado.obtenerCorreo(),
                    "Cumpleaños",
                    "Feliz cumpleaños " +
                            empleado.obtenerNombreCompleto()).enviar();
        } catch (SmtpException e) {
            throw new RuntimeException("No se pudo enviar el mensaje.", e);
        }
    }
}
