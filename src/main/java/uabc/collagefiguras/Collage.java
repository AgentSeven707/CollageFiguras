package uabc.collagefiguras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandra Anchondo Robles
 */
public class Collage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializar los vectores de cada figura
        Circle[] circulos;
        Triangle[] triangulos;
        Square[] cuadrados;
        Rectangulo[] rectangulos;
        Trapecio[] trapecios;
        Random rnd = new Random();
        circulos = new Circle[rnd.nextInt(30 - 1) + 1];
        triangulos = new Triangle[rnd.nextInt(30 - 1) + 1];
        cuadrados = new Square[rnd.nextInt(30 - 1) + 1];
        rectangulos = new Rectangulo[rnd.nextInt(30 - 1) + 1];
        trapecios = new Trapecio[rnd.nextInt(30 - 1) + 1];

        //Crear el primer collage 
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circle();
            String color = "";
            int num = rnd.nextInt(10 - 1) + 1;
            if (num == 1) {
                color = "black";
            } else if (num == 2) {
                color = "red";
            } else if (num == 3) {
                color = "blue";
            } else if (num == 4) {
                color = "yellow";
            } else if (num == 5) {
                color = "green";
            } else if (num == 6) {
                color = "magenta";
            } else if (num == 7) {
                color = "purple";
            } else if (num == 8) {
                color = "orange";
            } else if (num == 9) {
                color = "pink";
            }
            circulos[i].changeColor(color);
            circulos[i].changeSize(rnd.nextInt(150 - 75) + 75);
            circulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
            circulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
            circulos[i].makeVisible();
        }

        for (int i = 0; i < triangulos.length; i++) {
            triangulos[i] = new Triangle();
            String color = "";
            int num = rnd.nextInt(10 - 1) + 1;
            if (num == 1) {
                color = "black";
            } else if (num == 2) {
                color = "red";
            } else if (num == 3) {
                color = "blue";
            } else if (num == 4) {
                color = "yellow";
            } else if (num == 5) {
                color = "green";
            } else if (num == 6) {
                color = "magenta";
            } else if (num == 7) {
                color = "purple";
            } else if (num == 8) {
                color = "orange";
            } else if (num == 9) {
                color = "pink";
            }
            triangulos[i].changeColor(color);
            triangulos[i].changeSize(rnd.nextInt(150 - 75) + 75, rnd.nextInt(150 - 75) + 75);
            triangulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
            triangulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
            triangulos[i].makeVisible();
        }

        for (int i = 0; i < cuadrados.length; i++) {
            cuadrados[i] = new Square();
            String color = "";
            int num = rnd.nextInt(10 - 1) + 1;
            if (num == 1) {
                color = "black";
            } else if (num == 2) {
                color = "red";
            } else if (num == 3) {
                color = "blue";
            } else if (num == 4) {
                color = "yellow";
            } else if (num == 5) {
                color = "green";
            } else if (num == 6) {
                color = "magenta";
            } else if (num == 7) {
                color = "purple";
            } else if (num == 8) {
                color = "orange";
            } else if (num == 9) {
                color = "pink";
            }
            cuadrados[i].changeColor(color);
            cuadrados[i].changeSize(rnd.nextInt(150 - 75) + 75);
            cuadrados[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
            cuadrados[i].setYPosition(rnd.nextInt(800 - 1) + 1);
            cuadrados[i].makeVisible();
        }

        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i] = new Rectangulo();
            String color = "";
            int num = rnd.nextInt(10 - 1) + 1;
            if (num == 1) {
                color = "black";
            } else if (num == 2) {
                color = "red";
            } else if (num == 3) {
                color = "blue";
            } else if (num == 4) {
                color = "yellow";
            } else if (num == 5) {
                color = "green";
            } else if (num == 6) {
                color = "magenta";
            } else if (num == 7) {
                color = "purple";
            } else if (num == 8) {
                color = "orange";
            } else if (num == 9) {
                color = "pink";
            }
            rectangulos[i].changeColor(color);
            rectangulos[i].changeSize(rnd.nextInt(200 - 100) + 100, rnd.nextInt(75 - 40) + 40);
            rectangulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
            rectangulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
            rectangulos[i].makeVisible();
        }

        for (int i = 0; i < trapecios.length; i++) {
            trapecios[i] = new Trapecio();
            String color = "";
            int num = rnd.nextInt(10 - 1) + 1;
            if (num == 1) {
                color = "black";
            } else if (num == 2) {
                color = "red";
            } else if (num == 3) {
                color = "blue";
            } else if (num == 4) {
                color = "yellow";
            } else if (num == 5) {
                color = "green";
            } else if (num == 6) {
                color = "magenta";
            } else if (num == 7) {
                color = "purple";
            } else if (num == 8) {
                color = "orange";
            } else if (num == 9) {
                color = "pink";
            }
            trapecios[i].changeColor(color);
            trapecios[i].changeSize(rnd.nextInt(150 - 75) + 75, rnd.nextInt(150 - 75) + 75);
            trapecios[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
            trapecios[i].setYPosition(rnd.nextInt(800 - 1) + 1);
            trapecios[i].makeVisible();
        }

        // Mostrar un menú de opciones para saber que acción realizar después
        Scanner lectura = new Scanner(System.in);
        String op = "", r = "";
        int c = 0;

        do {
            System.out.println("\n");
            System.out.println("MENU DE OPCIONES\n");
            System.out.println("Opcion A: Mostrar el siguiente collage");
            System.out.println("Opcion R: Mostrar el collage anterior");
            System.out.println("Opcion M: Mostrar el collage actual en morado");
            System.out.println("Opcion N: Mostrar el collage actual en naranja");
            System.out.println("Opcion G: Mostrar un nuevo collage");
            System.out.println("Opcion F: Fin");
            System.out.println("\nElige una opción: ");
            op = lectura.nextLine();

            switch (op) {
                case "A":
                    c = c + 1;
                    for (int i = 0; i < circulos.length; i++) {
                        circulos[i].makeInvisible();
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        triangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        cuadrados[i].makeInvisible();
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        rectangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < trapecios.length; i++) {
                        trapecios[i].makeInvisible();
                    }

                    if (c == 1) {
                        for (int i = 0; i < circulos.length; i++) {
                            circulos[i].makeVisible();
                        }
                    }

                    if (c == 2) {
                        for (int i = 0; i < triangulos.length; i++) {
                            triangulos[i].makeVisible();
                        }
                    }

                    if (c == 3) {
                        for (int i = 0; i < cuadrados.length; i++) {
                            cuadrados[i].makeVisible();
                        }
                    }

                    if (c == 4) {
                        for (int i = 0; i < rectangulos.length; i++) {
                            rectangulos[i].makeVisible();
                        }
                    }

                    if (c == 5) {
                        for (int i = 0; i < trapecios.length; i++) {
                            trapecios[i].makeVisible();
                        }
                    }
                    break;

                case "R":
                    for (int i = 0; i < circulos.length; i++) {
                        circulos[i].makeInvisible();
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        triangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        cuadrados[i].makeInvisible();
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        rectangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < trapecios.length; i++) {
                        trapecios[i].makeInvisible();
                    }

                    if (c == 1) {
                        c = c - 1;
                        for (int i = 0; i < circulos.length; i++) {
                            circulos[i].makeVisible();
                        }

                        for (int i = 0; i < triangulos.length; i++) {
                            triangulos[i].makeVisible();
                        }

                        for (int i = 0; i < cuadrados.length; i++) {
                            cuadrados[i].makeVisible();
                        }

                        for (int i = 0; i < rectangulos.length; i++) {
                            rectangulos[i].makeVisible();
                        }

                    }

                    if (c == 2) {
                        c = c - 1;
                        for (int i = 0; i < circulos.length; i++) {
                            circulos[i].makeVisible();
                        }
                    }

                    if (c == 3) {
                        c = c - 1;
                        for (int i = 0; i < triangulos.length; i++) {
                            triangulos[i].makeVisible();
                        }
                    }

                    if (c == 4) {
                        c = c - 1;
                        for (int i = 0; i < cuadrados.length; i++) {
                            cuadrados[i].makeVisible();
                        }
                    }

                    if (c == 5) {
                        c = c - 1;
                        for (int i = 0; i < rectangulos.length; i++) {
                            rectangulos[i].makeVisible();
                        }
                    }

                    break;

                case "M":
                    for (int i = 0; i < circulos.length; i++) {
                        if (circulos[i].isIsVisible() == true) {
                            circulos[i].changeColor("purple");
                        }
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        if (triangulos[i].isIsVisible() == true) {
                            triangulos[i].changeColor("purple");
                        }
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        if (cuadrados[i].isIsVisible() == true) {
                            cuadrados[i].changeColor("purple");
                        }
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        if (rectangulos[i].isIsVisible() == true) {
                            rectangulos[i].changeColor("purple");
                        }
                    }

                    for (int i = 0; i < trapecios.length; i++) {
                        if (trapecios[i].isIsVisible() == true) {
                            trapecios[i].changeColor("purple");
                        }
                    }

                    break;

                case "N":
                    for (int i = 0; i < circulos.length; i++) {
                        if (circulos[i].isIsVisible() == true) {
                            circulos[i].changeColor("orange");
                        }
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        if (triangulos[i].isIsVisible() == true) {
                            triangulos[i].changeColor("orange");
                        }
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        if (cuadrados[i].isIsVisible() == true) {
                            cuadrados[i].changeColor("orange");
                        }
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        if (rectangulos[i].isIsVisible() == true) {
                            rectangulos[i].changeColor("orange");
                        }
                    }

                    for (int i = 0; i < trapecios.length; i++) {
                        if (trapecios[i].isIsVisible() == true) {
                            trapecios[i].changeColor("orange");
                        }
                    }

                    break;

                case "G":
                    for (int i = 0; i < circulos.length; i++) {
                        circulos[i].makeInvisible();
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        triangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        cuadrados[i].makeInvisible();
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        rectangulos[i].makeInvisible();
                    }

                    for (int i = 0; i < circulos.length; i++) {
                        circulos[i] = new Circle();
                        String color = "";
                        int num = rnd.nextInt(10 - 1) + 1;
                        if (num == 1) {
                            color = "black";
                        } else if (num == 2) {
                            color = "red";
                        } else if (num == 3) {
                            color = "blue";
                        } else if (num == 4) {
                            color = "yellow";
                        } else if (num == 5) {
                            color = "green";
                        } else if (num == 6) {
                            color = "magenta";
                        } else if (num == 7) {
                            color = "purple";
                        } else if (num == 8) {
                            color = "orange";
                        } else if (num == 9) {
                            color = "pink";
                        }
                        circulos[i].changeColor(color);
                        circulos[i].changeSize(rnd.nextInt(150 - 75) + 75);
                        circulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
                        circulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
                        circulos[i].makeVisible();
                    }

                    for (int i = 0; i < triangulos.length; i++) {
                        triangulos[i] = new Triangle();
                        String color = "";
                        int num = rnd.nextInt(10 - 1) + 1;
                        if (num == 1) {
                            color = "black";
                        } else if (num == 2) {
                            color = "red";
                        } else if (num == 3) {
                            color = "blue";
                        } else if (num == 4) {
                            color = "yellow";
                        } else if (num == 5) {
                            color = "green";
                        } else if (num == 6) {
                            color = "magenta";
                        } else if (num == 7) {
                            color = "purple";
                        } else if (num == 8) {
                            color = "orange";
                        } else if (num == 9) {
                            color = "pink";
                        }
                        triangulos[i].changeColor(color);
                        triangulos[i].changeSize(rnd.nextInt(150 - 75) + 75, rnd.nextInt(150 - 75) + 75);
                        triangulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
                        triangulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
                        triangulos[i].makeVisible();
                    }

                    for (int i = 0; i < cuadrados.length; i++) {
                        cuadrados[i] = new Square();
                        String color = "";
                        int num = rnd.nextInt(10 - 1) + 1;
                        if (num == 1) {
                            color = "black";
                        } else if (num == 2) {
                            color = "red";
                        } else if (num == 3) {
                            color = "blue";
                        } else if (num == 4) {
                            color = "yellow";
                        } else if (num == 5) {
                            color = "green";
                        } else if (num == 6) {
                            color = "magenta";
                        } else if (num == 7) {
                            color = "purple";
                        } else if (num == 8) {
                            color = "orange";
                        } else if (num == 9) {
                            color = "pink";
                        }
                        cuadrados[i].changeColor(color);
                        cuadrados[i].changeSize(rnd.nextInt(150 - 75) + 75);
                        cuadrados[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
                        cuadrados[i].setYPosition(rnd.nextInt(800 - 1) + 1);
                        cuadrados[i].makeVisible();
                    }

                    for (int i = 0; i < rectangulos.length; i++) {
                        rectangulos[i] = new Rectangulo();
                        String color = "";
                        int num = rnd.nextInt(10 - 1) + 1;
                        if (num == 1) {
                            color = "black";
                        } else if (num == 2) {
                            color = "red";
                        } else if (num == 3) {
                            color = "blue";
                        } else if (num == 4) {
                            color = "yellow";
                        } else if (num == 5) {
                            color = "green";
                        } else if (num == 6) {
                            color = "magenta";
                        } else if (num == 7) {
                            color = "purple";
                        } else if (num == 8) {
                            color = "orange";
                        } else if (num == 9) {
                            color = "pink";
                        }
                        rectangulos[i].changeColor(color);
                        rectangulos[i].changeSize(rnd.nextInt(200 - 100) + 100, rnd.nextInt(75 - 40) + 40);
                        rectangulos[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
                        rectangulos[i].setYPosition(rnd.nextInt(800 - 1) + 1);
                        rectangulos[i].makeVisible();
                    }

                    for (int i = 0; i < trapecios.length; i++) {
                        trapecios[i] = new Trapecio();
                        String color = "";
                        int num = rnd.nextInt(10 - 1) + 1;
                        if (num == 1) {
                            color = "black";
                        } else if (num == 2) {
                            color = "red";
                        } else if (num == 3) {
                            color = "blue";
                        } else if (num == 4) {
                            color = "yellow";
                        } else if (num == 5) {
                            color = "green";
                        } else if (num == 6) {
                            color = "magenta";
                        } else if (num == 7) {
                            color = "purple";
                        } else if (num == 8) {
                            color = "orange";
                        } else if (num == 9) {
                            color = "pink";
                        }
                        trapecios[i].changeColor(color);
                        trapecios[i].changeSize(rnd.nextInt(150 - 75) + 75, rnd.nextInt(150 - 75) + 75);
                        trapecios[i].setXPosition(rnd.nextInt(1300 - 1) + 1);
                        trapecios[i].setYPosition(rnd.nextInt(800 - 1) + 1);
                        trapecios[i].makeVisible();
                    }

                    break;

                case "F":
                    System.out.println("¿Seguro que desea abandonar el programa? (S/N)");
                    r = lectura.nextLine();

                    break;

            }

        } while (!r.equalsIgnoreCase("S"));

        System.out.println("Gracias por usar el programa!");
        System.exit(0);
    }
}
