package Persisteincia;

import modelo.Empleado;
import modelo.RepositorioDeEmpleados;

import java.util.List;

public class RepositorioDeEmpleadosEnMemoriaParaTest implements RepositorioDeEmpleados {
   private List<Empleado> empleados;
   public RepositorioDeEmpleadosEnMemoriaParaTest(List<Empleado> empleados){
       this.empleados = empleados;
   }
    @Override
    public List<Empleado> leerEmpleados() {
        return empleados;
    }
}
