package PedraPapelTesoura;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Choices variables
		int userChoice;
		int javaChoice;
		
		//some objects stuffs
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		//Initialization text in portuguese, if u want translate the text^-^
		System.out.println("Olá usuario, seja bem-vindo ao pedra, papel e tesoura!");
		System.out.println("Escolha com base neste números, oque deseja jogar!");
		System.out.println("=====================");
		System.out.println("0 - Pedra");
		System.out.println("1 - Papel");
		System.out.println("2 - Tesoura");
		System.out.println("=====================");
		
		//Choices variables "boot"
		userChoice = in.nextInt();
		javaChoice = r.nextInt(3);
		
		
		//User choice switch
		switch(userChoice) {
		
		//rock
		case 0:
			//JavaChoice ifs to show he choice
			if(javaChoice == 0){
				System.out.println("O java jogou pedra!");
			}
			else if(javaChoice == 1) {
				System.out.println("O java jogou papel!");	
			}
			else if(javaChoice == 2){
				System.out.println("O java jogou tesoura!");
			}
			
			//Win, loose, and tie
		System.out.println("Você jogou pedra e... ");
			if(javaChoice == 0) {
				System.out.print("Empatou!");
			}
			else if(javaChoice == 1) {
				System.out.print("Perdeu!");
			}
			else if(javaChoice == 2) {
				System.out.print("Ganhou!");
			}
			
			break;
		
		//paper
		case 1:
			
			//JavaChoice ifs to show he choice
			if(javaChoice == 0){
				System.out.println("O java jogou pedra!");
			}
			else if(javaChoice == 1) {
				System.out.println("O java jogou papel!");	
			}
			else if(javaChoice == 2){
				System.out.println("O java jogou tesoura!");
			}
			//Win, loose, and tie
		System.out.println("Você jogou papel e... ");
			if(javaChoice == 0) {
				System.out.print("Ganhou!");
			}
			else if(javaChoice == 1) {
				System.out.println("Empatou!");
			}
			else if(javaChoice == 2) {
				System.out.println("Perdeu!");
			}
			
			break;
			
		//scissors
		case 2:
			
			//JavaChoice ifs to show he choice
			if(javaChoice == 0){
				System.out.println("O java jogou pedra!");
			}
			else if(javaChoice == 1) {
				System.out.println("O java jogou papel!");	
			}
			else if(javaChoice == 2){
				System.out.println("O java jogou tesoura!");
			}
			
			//Win, loose, and tie
		System.out.println("Você jogou tesoura e... ");
			System.out.println();
			if(javaChoice == 0) {
				System.out.print("Perdeu!");
			}
			else if(javaChoice == 1) {
				System.out.print("Ganhou!");
			}
			else if(javaChoice == 2) {
				System.out.print("Empatou!");
			}
			
			break;
			//default, if the player put a number > 2
			default:
			System.out.println("Você não colocou nenhum número permitido!");
			break;
		}
		
	}

}
