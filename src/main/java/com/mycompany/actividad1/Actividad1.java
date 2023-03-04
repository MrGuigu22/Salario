/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1;

/**
 *
 * @author santi
 */
public class Actividad1 {

    public static void main(String[] args) {
        int horasTrabajadas = 48;
        int valorHora = 5000;
        double porcentajeRetencion = 0.125;
        int salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * porcentajeRetencion;
        double salarioNeto = salarioBruto - retencionFuente;
        System.out.println("el salario bruto del trabajador es: " + salarioBruto);
        System.out.println("el salario neto del trabajador es: " + salarioNeto);
        System.out.println("la retencion en la fuente del trabajador es: "+retencionFuente);
    }
}
    

