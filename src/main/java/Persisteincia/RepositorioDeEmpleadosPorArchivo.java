package Persisteincia;

import modelo.Empleado;
import modelo.RepositorioDeEmpleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeEmpleadosPorArchivo implements RepositorioDeEmpleados {
    private File file;

    public RepositorioDeEmpleadosPorArchivo(File file) {
        this.file = file;
    }

    @Override
    public List<Empleado> leerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String empleado : reader.lines().collect(Collectors.toList())) {
                String[] partesEmpleados = empleado.split(", ");
                Empleado e = new Empleado(partesEmpleados[0], partesEmpleados[1], partesEmpleados[2], partesEmpleados[3]);
                empleados.add(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return empleados;
    }
}

