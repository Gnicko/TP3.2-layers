package libreria;

import modelo.Empleado;
import modelo.EnvioDeEmail;

public class MandarEmailTest implements EnvioDeEmail {
    private String email = "";

    @Override
    public void enviar(Empleado empleado) {
        email = email + empleado.obtenerCorreo() + "\n";
    }

    public boolean seEnvioElMensajeA(String mensaje) {
        return this.email.contains(mensaje);
    }
}
