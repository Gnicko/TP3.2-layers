package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String apellido;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String correo;

    public Empleado(String apellido, String nombre, String fechaDeNacimiento, String correo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        this.correo = correo;
    }

    public boolean esCumpleaños() {
        LocalDate fechaActual = LocalDate.now();
        return (fechaDeNacimiento.getMonth().equals(fechaActual.getMonth()) &&
                fechaDeNacimiento.getDayOfMonth() == fechaActual.getDayOfMonth());
    }

    public String obtenerCorreo() {
        return correo;
    }

    public String obtenerNombreCompleto() {
        return apellido + "" + nombre;
    }
}
