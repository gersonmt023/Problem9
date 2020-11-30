/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author famil
 */
import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        SistemaDeNotas sistema = new SistemaDeNotas();
        Scanner s = new Scanner(System.in);
        Alumno n = new Alumno();
        PadreDeFamilia p = new PadreDeFamilia();
        while (true) {
            System.out.println("Menú de opciones.");
            System.out.println("Para ingresar la informacion del alumno en "
                    + "primer lugar y seguidamente sus notas digite1");
            System.out.println("Para ingresar primeramente ls notas y luego la "
                    + "infomorcaión personal digite 2");
            System.out.println("Para cerrar el programa digite 3");
            int h = s.nextInt();
            if (h == 1) {
                System.out.println("Digite el nombre del alumno:");
                String x = s.next();
                n.setNombre(x);
                System.out.println("Digite el apellido del alumno:");
                String y = s.next();
                n.setApellido(y);
                System.out.println("Digite el carne:");
                int z = s.nextInt();
                n.setCarne(z);
                Alumno alum = new Alumno(x, y, z);

                System.out.println("Digite la nota obtenida:");
                int nota = s.nextInt();
                System.out.println("Digite puntos totales:");
                int puntosTotales = s.nextInt();
                System.out.println("Digite puntos obtenidos:");
                int puntosObtenidos = s.nextInt();
                System.out.println("Digite el nombre del padre de familia encargado:");
                String v = s.next();
                p.setNombre(v);
                System.out.println("Digite el apellido del padre de familia encargado:");
                String b = s.next();
                p.setApellido(b);
                System.out.println("Digite la cedula del padre de familia encargado:");
                int c = s.nextInt();
                p.setCedula(c);

                Examen e = new Examen(alum, nota, puntosTotales, puntosObtenidos, null);
                System.out.println(n.toString());
                System.out.println(p.toString());
                sistema.agregarEx(e);

                sistema.mostrarExamenes();
                System.out.println("Para agregar otro estudiante ingrese 1, para cerrar el progrma digite 0:");
                int ah = s.nextInt();
                if (ah == 0) {
                    System.exit(0);
                }
            }
            if (h == 2) {
                System.out.println("Digite la nota obtenida:");
                int nota = s.nextInt();
                System.out.println("Digite puntos totales:");
                int puntosTotales = s.nextInt();
                System.out.println("Digite puntos obtenidos:");
                int puntosObtenidos = s.nextInt();
                System.out.println("Digite el nombre del alumno:");
                String x = s.next();
                n.setNombre(x);
                System.out.println("Digite el apellido del alumno:");
                String y = s.next();
                n.setApellido(y);
                System.out.println("Digite el carne:");
                int z = s.nextInt();
                n.setCarne(z);

                System.out.println("Digite el nombre del padre de familia encargado:");
                String v = s.next();
                p.setNombre(v);
                System.out.println("Digite el apellido del padre de familia encargado:");
                String b = s.next();
                p.setApellido(b);
                System.out.println("Digite la cedula del padre de familia encargado:");
                int c = s.nextInt();
                p.setCedula(c);

                Alumno alum = new Alumno(x, y, z);
                Examen e = new Examen(alum, nota, puntosTotales, puntosObtenidos, null);
                System.out.println(n.toString());
                System.out.println(p.toString());
                sistema.agregarEx(e);

                sistema.mostrarExamenes();
                System.out.println("Para agregar otro estudiante ingrese 1, para cerrar el progrma digite 0:");
                int ah = s.nextInt();
                if (ah == 0) {
                    System.exit(0);
                }
            }
        }
    }
}
