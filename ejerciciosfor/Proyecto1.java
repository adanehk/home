
import java.util.Scanner;
import java.util.Random;

public class Proyecto1 {

    public static final String RESETCOLOR = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String CORAZON = "\u263A";
    public static final String SONREIR = " \uD83D\uDE0A";
    public static final String MUSLO = "\uD83C\uDF57";
    public static final String TIJERA = "\u2702";
    public static final String PAPEL = "\uD83D\uDCC4";
    public static final String PIEDRA = "\u270A";

    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int opcionquiz;
        int dinero = 0;
        int aciertos = 0;

        System.out.println(CYAN + "Escoge uno de los juegos:" + RESETCOLOR);
        System.out.println("1.Quiz");
        System.out.println("2.Piedra,papel o tijera");
       
        int opcionjuego;
        opcionjuego = entrada.nextInt();
        while (opcionjuego < 1 || opcionjuego > 3) {
            System.out.println("Ingresa una opción válida");
            opcionjuego = entrada.nextInt();
        }
        switch (opcionjuego) {
            case 1: {
                System.out.println(CYAN + "¡BIENVENIDO AL QUIZ DEL TAMAGOTCHI!");
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("¿SOBRE QUE TÓPICO QUIERES QUE SEA EL QUIZ?" + RESETCOLOR);
                System.out.println("1.Geografía");
                System.out.println("2.Matemática");
                System.out.println("3.Cultura General");
                opcionquiz = entrada.nextInt();
                switch (opcionquiz) {

                    case 1: {
                        System.out.print(CYAN + "¡Has elegido geografía!");

                        aciertos = 0;
                        while (opcionquiz < 1 || opcionquiz > 3) {
                            System.out.println("Ingresa una opción válida");

                        }
                        System.out.println("¿Qué país es famoso por tener forma de bota?" + RESETCOLOR);
                        System.out.println("1.Francia");
                        System.out.println("2.Italia");
                        System.out.println("3.Grecia");
                        System.out.println("4.Escocia");
                        int respuestaquizgeo;
                        respuestaquizgeo = entrada.nextInt();
                        while (respuestaquizgeo < 1 || respuestaquizgeo > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizgeo = entrada.nextInt();
                        }

                        if (respuestaquizgeo == 2) {
                            System.out.println(CYAN + "¡Has acertado!" + RESETCOLOR);
                            aciertos++;
                        } else {
                            System.out.println(CYAN + "¡Casi! La respuesta correcta era Italia" + RESETCOLOR);
                        }

                        System.out.println(CYAN + "¿Cual es el país con mas habitantes del mundo?" + RESETCOLOR);
                        System.out.println("1.China");
                        System.out.println("2.India");
                        System.out.println("3.Rusia");
                        System.out.println("4.Estados Unidos");
                        int respuestaquizgeo2;
                        respuestaquizgeo2 = entrada.nextInt();
                        while (respuestaquizgeo2 < 1 || respuestaquizgeo2 > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizgeo2 = entrada.nextInt();
                        }
                        if (respuestaquizgeo2 == 2) {
                            System.out.println(CYAN + "¡Has acertado!" + RESETCOLOR);
                            ++aciertos;
                        } else {
                            System.out.println(CYAN + "Has fallado, realmente parecia china" + RESETCOLOR);
                        }

                        System.out.println(CYAN + "¿Cual es el oceano mas grande del mundo?" + RESETCOLOR);
                        System.out.println("1.Pacífico");
                        System.out.println("2.Atlántico");
                        System.out.println("3.Índico");
                        System.out.println("4.Antártico");
                        System.out.println("5.Ártico");
                        int respuestaquizgeo3;
                        respuestaquizgeo3 = entrada.nextInt();
                        while (respuestaquizgeo3 < 1 || respuestaquizgeo3 > 5) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizgeo3 = entrada.nextInt();
                        }
                        if (respuestaquizgeo3 == 1) {
                            System.out.println(CYAN + "¡Has acertado!" + RESETCOLOR);
                            ++aciertos;
                        } else {
                            System.out.println(CYAN + "Era el Pacífico" + RESETCOLOR);
                        }
                        if (aciertos == 0) {
                            System.out.println(CYAN + "No has tenido ni un acierto, no te desanimes que hay mas juegos" + RESETCOLOR);

                        }
                        if (aciertos == 1) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "1$" + RESETCOLOR);
                            ++dinero;
                        }
                        if (aciertos == 2) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "2$" + RESETCOLOR);
                            dinero += 2;
                        }
                        if (aciertos == 3) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "3$" + RESETCOLOR);
                            dinero += 3;
                        }

                        break;
                    }

                    case 2: {

                        aciertos = 0;
                        System.out.println(ROJO + "La has cagao..." + RESETCOLOR);
                        Thread.sleep(2000);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println(ROJO + "¿Cuál es el valor de x en la ecuacicón 5x-3=2x+12?" + RESETCOLOR);
                        System.out.println("1. 3");
                        System.out.println("2. 6");
                        System.out.println("3. 2");
                        System.out.println("4. 5");
                        int respuestaquizmate1;
                        respuestaquizmate1 = entrada.nextInt();
                        while (respuestaquizmate1 < 1 || respuestaquizmate1 > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizmate1 = entrada.nextInt();
                        }
                        if (respuestaquizmate1 == 4) {
                            System.out.println(ROJO + "Has acertado de chiripa" + ROJO);
                            ++aciertos;
                        } else {
                            System.out.println(ROJO + " La respuesta correcta era la 4" + RESETCOLOR);
                        }
                        System.out.println(ROJO + "¿Cuánto es la raiz cuadrada de 49 + la raiz cuadrada de 45? " + RESETCOLOR);
                        System.out.println("1. 14");
                        System.out.println("2. 10");
                        System.out.println("3. 12");
                        System.out.println("4. 11");
                        int respuestaquizmate2;
                        respuestaquizmate2 = entrada.nextInt();
                        while (respuestaquizmate2 < 1 || respuestaquizmate2 > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizmate2 = entrada.nextInt();
                        }
                        if (respuestaquizmate2 == 3) {
                            System.out.println(ROJO + "No sabes ni tu como la has acertado " + RESETCOLOR);
                            ++aciertos;
                        } else {
                            System.out.println(ROJO + "Te dije que la habías cagao" + RESETCOLOR);
                        }
                        System.out.println(ROJO + "¿Cuál es el área de un triángulo con base de 12 cm y altura de 7 cm?" + RESETCOLOR);
                        System.out.println("1. 84 cm²");
                        System.out.println("2. 42 cm²");
                        System.out.println("3. 96 cm²");
                        System.out.println("4. 36 cm²");
                        int respuestaquizmate3;
                        respuestaquizmate3 = entrada.nextInt();
                        while (respuestaquizmate3 < 1 || respuestaquizmate3 > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizmate3 = entrada.nextInt();
                        }
                        if (respuestaquizmate3 == 2) {
                            System.out.println("¡Has acertado!");
                            aciertos++;
                        } else {
                            System.out.println("La respuesta correcta era la 2");
                        }
                        if (aciertos == 0) {
                            System.out.println(CYAN + "No has tenido ni un acierto, no te desanimes que hay mas juegos" + RESETCOLOR);

                        }
                        if (aciertos == 1) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "1$" + RESETCOLOR);
                            ++dinero;
                        }
                        if (aciertos == 2) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "2$" + RESETCOLOR);
                            dinero += 2;
                        }
                        if (aciertos == 3) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "3$" + RESETCOLOR);
                            dinero += 3;
                        }
                        break;
                    }
                    case 3: {

                        aciertos = 0;
                        int respuestaquizcultura;
                        System.out.println(CYAN + "Has elegido cultura general");
                        System.out.println("¿Qué científico formuló las leyes del movimiento y la gravedad?" + RESETCOLOR);
                        System.out.println("1.Galileo Galilei");
                        System.out.println("2.Albert Einstein");
                        System.out.println("3.Isaac Newton");
                        System.out.println("4.Johannes Kepler");
                        respuestaquizcultura = entrada.nextInt();
                        while (respuestaquizcultura < 1 || respuestaquizcultura > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizcultura = entrada.nextInt();
                        }
                        if (respuestaquizcultura == 3) {
                            System.out.println("¡Has acertado!");
                            ++aciertos;
                        } else {
                            System.out.println("Has fallao brother");
                        }
                        System.out.println(CYAN + "Me duele la rodilla" + RESETCOLOR);
                        System.out.println("1.SI");
                        System.out.println("2cls.NO");
                        int respuestaquizcultura2;
                        respuestaquizcultura2 = entrada.nextInt();
                        while (respuestaquizcultura2 < 1 || respuestaquizcultura2 > 2) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizcultura2 = entrada.nextInt();
                        }
                        if (respuestaquizcultura2 == 1) {
                            System.out.println(CYAN + "Si me duele" + RESETCOLOR);
                            ++aciertos;
                        } else {
                            System.out.println(CYAN + "Si me duele" + RESETCOLOR);
                        }
                        System.out.println(CYAN + "¿Qué parte del cuerpo humano contiene los huesos llamados falanges?" + RESETCOLOR);
                        System.out.println("1.Cráneo");
                        System.out.println("2.Columna vertebral");
                        System.out.println("3.Pie");
                        System.out.println("4.Mano");
                        int respuestaquizcultura3;
                        respuestaquizcultura3 = entrada.nextInt();
                        while (respuestaquizcultura3 < 1 || respuestaquizcultura3 > 4) {
                            System.out.println(CYAN + "Ingresa una opción válida" + RESETCOLOR);
                            respuestaquizcultura3 = entrada.nextInt();
                        }
                        if (respuestaquizcultura3 == 4) {
                            System.out.println(CYAN + "¡Has acertado!" + RESETCOLOR);
                            ++aciertos;
                        } else {
                            System.out.println(CYAN + "Das pena" + RESETCOLOR);
                        }
                        if (aciertos == 0) {
                            System.out.println(CYAN + "No has tenido ni un acierto, no te desanimes que hay mas juegos" + RESETCOLOR);

                        }
                        if (aciertos == 1) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "1$" + RESETCOLOR);
                            ++dinero;
                        }
                        if (aciertos == 2) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "2$" + RESETCOLOR);
                            dinero += 2;
                        }
                        if (aciertos == 3) {
                            System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "3$" + RESETCOLOR);
                            dinero += 3;
                        }

                        break;

                    }

                }

            }
            break;
            case 2: {
                aciertos = 0;
                int intentospiedrapapeltijera = 3;
                if (intentospiedrapapeltijera == 3) {
                    System.out.println(CYAN + "¡Bienvenido al piedra papel o tijera!");
                    System.out.println("¿Porque no mejor empiezas tu? TIENES 3 INTENTOS" + RESETCOLOR);
                    System.out.println("1." + PIEDRA);
                    System.out.println("2." + PAPEL);
                    System.out.println("3." + TIJERA);
                }

                int opcionpiedrapapeltijera;
                while (intentospiedrapapeltijera > 0 ) {
                    opcionpiedrapapeltijera = entrada.nextInt();
                    
                    int maquina = aleatorio.nextInt(4);

                    String haselegido = "Has elegido, " + opcionpiedrapapeltijera;
                    if (maquina == 1) {
                        System.out.println(CYAN + haselegido + " Tamagotchi ha elegido " + PIEDRA + RESETCOLOR);
                    }
                    if (maquina == 2) {
                        System.out.println(CYAN + haselegido + " Tamagotchi ha elegido " + PAPEL + RESETCOLOR);
                    }
                    if (maquina == 3) {
                        System.out.println(CYAN + haselegido + " Tamagotchi ha elegido " + TIJERA + RESETCOLOR);
                    }

                    while (opcionpiedrapapeltijera < 1 || opcionpiedrapapeltijera > 3) {
                        System.out.println("Ingresa una opción válida");
                        opcionpiedrapapeltijera = entrada.nextInt();
                    }
                    if (opcionpiedrapapeltijera == maquina) {
                        System.out.println(CYAN + "¡EMPATE!" + " TIENES " + intentospiedrapapeltijera + " INTENTOS" + RESETCOLOR);
                        intentospiedrapapeltijera--;

                    } else if (opcionpiedrapapeltijera == 1 && maquina == 3 || opcionpiedrapapeltijera == 2 && maquina == 1 || opcionpiedrapapeltijera == 3 && maquina == 2) {
                        System.out.println(CYAN + "¡HAS GANADO!" + " TIENES " + intentospiedrapapeltijera + " INTENTOS" + RESETCOLOR);
                        intentospiedrapapeltijera--;

                        ++aciertos;
                    } else {
                        System.out.println(CYAN + "¡HAS PERDIDO!" + " TIENES " + intentospiedrapapeltijera + " INTENTOS" + RESETCOLOR);
                        intentospiedrapapeltijera--;

                    }
                    System.out.println("1." + PIEDRA);
                    System.out.println("2." + PAPEL);
                    System.out.println("3." + TIJERA);

                   
                    if (intentospiedrapapeltijera == 0) {
                        System.out.println(CYAN + "TE HAS QUEDADO SIN INTENTOS" + RESETCOLOR);
                    }
                    if (aciertos < 0) {
                        System.out.println(CYAN + "No has tenido ni un acierto, no te desanimes que hay mas juegos" + RESETCOLOR);

                    }

                    if (aciertos == 1 && intentospiedrapapeltijera == 0) {
                        System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "1$" + RESETCOLOR);
                       
                        ++dinero;
                    }
                    if (aciertos == 2 && intentospiedrapapeltijera == 0) {
                        System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "2$" + RESETCOLOR);
                      
                        dinero += 2;
                    }
                    if (aciertos == 3 && intentospiedrapapeltijera == 0) {
                        System.out.println(CYAN + "Has tenido " + aciertos + " aciertos, por lo tanto tu recompensa es de " + RESETCOLOR + VERDE + "3$" + RESETCOLOR);
                        
                        dinero += 3;
                    }
                }

                break;
            }
            

                }

            }

        }
    
