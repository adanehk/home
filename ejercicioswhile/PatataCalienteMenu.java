import java.util.Scanner;
import java.util.Random;

public class PatataCalienteMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Bienvenido al juego de la patata caliente, ¿Como te llamas?" + " ");
        String nombre;
        nombre = entrada.nextLine();

        System.out.println("1. Elegir dificultad");
        System.out.println("2. Elegir rango propio");
        int opcion;
        opcion = entrada.nextInt();
	    while (opcion < 1 || opcion > 2) {
                    System.out.println("Ingrese una opción válida");
                    opcion = entrada.nextInt();
                }

        switch (opcion) {
            case 1: {
                System.out.println("Estate listo" + " " + nombre + " " + "que se te viene duro, Escoge una dificultad del 1 al 3");
                System.out.println("1. Fácil");
                System.out.println("2. Intermedio");
                System.out.println("3. Dificil");
                int dificultad;
                dificultad = entrada.nextInt();

                while (dificultad < 1 || dificultad > 3) {
                    System.out.println("Ingrese una dificultad válida");
                    dificultad = entrada.nextInt();
                }

                switch (dificultad) {
                    case 1: {
                        System.out.println("Entiendo que no eres muy listo" + " " + nombre + "." + " " + "Has escogido Fácil, ahora ingresa un número [0-10] TIENES 5 INTENTOS");
                        int numUsuF = entrada.nextInt();
                        Random aleatorio = new Random();
                        int intentosF = 5;
                        int solucionF = aleatorio.nextInt(0, 10);

                        while (numUsuF < 1 || numUsuF > 10) {
                            System.out.println("Ingrese un número válido");
                            numUsuF = entrada.nextInt();
                        }

                        while (numUsuF != solucionF) {
                            System.out.print("¡NO LO HAS ADIVINADO! " + ("TIENES " + (--intentosF) + " INTENTOS"));
                            if (intentosF > 0) {
                                if (numUsuF > solucionF) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es menor ");
                                } else if (numUsuF < solucionF) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es mayor ");
                                }
                            }
                            if (intentosF == 0) {
                                System.out.print(" TE HAS QUEDADO SIN INTENTOS, BUENA SUERTE PA LA PRÓXIMA");
                            } else if (intentosF < 0) {
                                System.out.print("¡TE HE DICHO Q HAS PERDIDO! ");
                            }
                            numUsuF = entrada.nextInt();
                        }
                        System.out.print("¡LO HAS ADIVINADO!");
                        break;
                    }

                    case 2: {
                        System.out.println("Por lo que sea aun tienes alguna neurona viva" + " " + nombre + "." + " " + "Has escogido Intermedio, ahora ingresa un número [0-20] TIENES 4 INTENTOS");
                        int numUsuI = entrada.nextInt();
                        Random aleatorio = new Random();
                        int solucionI = aleatorio.nextInt(0, 20);
                        int intentosI = 4;

                        while (numUsuI < 1 || numUsuI > 20) {
                            System.out.println("Ingrese un número válido");
                            numUsuI = entrada.nextInt();
                        }

                        while (numUsuI != solucionI) {
                            System.out.print("¡NO LO HAS ADIVINADO! " + ("TIENES " + (--intentosI) + " INTENTOS"));
                            if (intentosI > 0) {
                                if (numUsuI > solucionI) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es menor ");
                                } else if (numUsuI < solucionI) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es mayor ");
                                }
                            }
                            if (intentosI == 0) {
                                System.out.print(" TE HAS QUEDADO SIN INTENTOS, BUENA SUERTE PA LA PRÓXIMA");
                            } else if (intentosI < 0) {
                                System.out.print("¡TE HE DICHO Q HAS PERDIDO! ");
                            }
                            numUsuI = entrada.nextInt();
                        }
                        System.out.print("¡LO HAS ADIVINADO!");
                        break;
                    }

                    case 3: {
                        System.out.println("Pareces listo" + " " + nombre + "." + " " + "Has escogido Dificil, ahora ingresa un número [0-50] TIENES 5 INTENTOS");
                        int numUsuD = entrada.nextInt();
                        Random aleatorio = new Random();
                        int solucionD = aleatorio.nextInt(0, 50);
                        int intentosD = 5;

                        while (numUsuD < 1 || numUsuD > 50) {
                            System.out.println("Ingrese un número válido");
                            numUsuD = entrada.nextInt();
                        }

                        while (numUsuD != solucionD) {
                            System.out.print("¡NO LO HAS ADIVINADO! " + ("TIENES " + (--intentosD) + " INTENTOS"));
                            if (intentosD > 0) {
                                if (numUsuD > solucionD) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es menor ");
                                } else if (numUsuD < solucionD) {
                                    System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es mayor ");
                                }
                            }
                            if (intentosD == 0) {
                                System.out.print(" TE HAS QUEDADO SIN INTENTOS, BUENA SUERTE PA LA PRÓXIMA");
                            } else if (intentosD < 0) {
                                System.out.print("¡TE HE DICHO Q HAS PERDIDO! ");
                            }
                            numUsuD = entrada.nextInt();
                        }
                        System.out.print("¡LO HAS ADIVINADO!");
                        break;
                    }
                }
                break;
            }

            case 2: {
                Random aleatorio = new Random();
                System.out.println("¿De que número quieres empezar a adivinar?");
                int rango1 = entrada.nextInt();
                System.out.println("¿Hasta que número quieres adivinar?");
                int rango2 = entrada.nextInt();
                int solucionZ = aleatorio.nextInt(rango1, rango2);
                int intentosZ = 5;
		

                System.out.println("Tu mismo, si pierdes no te quejes. TIENES 5 INTENTOS");
                int sl = entrada.nextInt();

                while (sl < rango1 || sl > rango2) {
                    System.out.println("Ingrese un número válido");
                    sl = entrada.nextInt();
                }

                while (sl != solucionZ) {
                    System.out.print("¡NO LO HAS ADIVINADO! " + ("TIENES " + (--intentosZ) + " INTENTOS"));
                    if (intentosZ > 0) {
                        if (sl > solucionZ) {
                            System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es menor ");
                        } else if (sl < solucionZ) {
                            System.out.print(" Te voy a dar una pista," + " " + nombre + " " + "el número es mayor ");
                        }
                    }
                    if (intentosZ == 0) {
                        System.out.print(" TE HAS QUEDADO SIN INTENTOS, BUENA SUERTE PA LA PRÓXIMA");
                    } else if (intentosZ < 0) {
                        System.out.print("¡TE HE DICHO Q HAS PERDIDO! ");
                    }
                    sl = entrada.nextInt();
                }
                System.out.print("¡LO HAS ADIVINADO!");
                break;
            }
        }
    }
}

