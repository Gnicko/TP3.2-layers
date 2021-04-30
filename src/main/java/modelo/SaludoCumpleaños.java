package modelo;

import java.util.List;

public class SaludoCumpleaños {
    private RepositorioDeEmpleados repositorio;
    private EnvioDeEmail envioDeEmail;

    public SaludoCumpleaños(RepositorioDeEmpleados repositorio, EnvioDeEmail envioDeEmail) {
        this.repositorio = repositorio;
        this.envioDeEmail = envioDeEmail;
    }

    public void VerificarFechaCumpleaños() {
        List<Empleado> empleados = repositorio.leerEmpleados();
        for (Empleado empleado : empleados) {
            if (empleado.esCumpleaños()) {
                envioDeEmail.enviar(empleado);
            }
        }
    }
}
