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

				System.out.print("La tabla del 1 x es :");
				System.out.println(x);
			}break;

			case 2:

			int y = 0;
			for (int i = 0; i < 10; i++) {
				y = y +1;
				int x = 1 * y;

				System.out.print("La tabla del 1 x es :");
				System.out.println(x);
			}

			System.out.println("\n -----------------------------------------------\n");


			int a = 0;
			for (int i = 0; i < 10; i++) {
				a = a +1;
				int x = 2 * a;

				System.out.print("La tabla del 2 x es :");
				System.out.println(x);
			}
			
			System.out.println("\n -----------------------------------------------\n");

			int b = 0;
			for (int i = 0; i < 10; i++) {
				b = b +1;
				int x = 3 * b;

				System.out.print("La tabla del 3 x es :");
				System.out.println(x);
			}

			System.out.println("\n -----------------------------------------------\n");

			int c = 0;
			for (int i = 0; i < 10; i++) {
				c = c +1;
				int x = 4 * c;

				System.out.print("La tabla del 4 x es :");
				System.out.println(x);
			}
			
			
			break;


			





	}


}


}