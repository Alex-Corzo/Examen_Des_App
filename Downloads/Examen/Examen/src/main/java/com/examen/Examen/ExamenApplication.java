package com.examen.Examen;

import java.util.Scanner;
import javax.annotation.processing.SupportedOptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);

		System.out.println("Buenos días ingrese una opción para realizar");
		System.out.println("1.- Mostrar una tabla, 2.- Mostrar todas las tablas, 3.- Salir");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();

		switch (opcion){
			case 1: 
			int multi =0;
				for (int i = 0; i < 10; i++) {
					multi=multi+1;

					int x= 1 * multi;

				System.out.print("La tabla del 1 es :");
				System.out.println(x);
			



			}

			
			break;








	}


}


}