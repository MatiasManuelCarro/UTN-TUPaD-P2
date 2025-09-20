/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp5_ej9;

/**
 *
 * @author Matias
 */
public class Main {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Matias", "Osde");
        Profesional profesional1 = new Profesional("Dr. Gutierrez", "Dermatologia");
        CitaMedica citamedica1 = new CitaMedica("20/09/2025", "10:00");

        //creamos las asociaciones unidireccionales
        citamedica1.setPaciente(paciente1);
        citamedica1.setProfesional(profesional1);

        //probamos las asociaciones
        System.out.println(citamedica1.getPaciente());
        System.out.println(citamedica1.getProfesional());

        System.out.println("\nDatos completos:");
        System.out.println(citamedica1);

    }

}
