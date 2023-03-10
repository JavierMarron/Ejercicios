// Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template


package com.politecnicomalaga.x3;

import java.util.Scanner;

/**
 *
 * @author javiermarrondellanoramirez
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Tmenu;
        String f1= "1",f2= "2",f3= "3", f4= "4", f5= "5", f6= "6", f7= "7", f8= "8", f9= "9";
        int contjuego = 0;
        String Tjuego = "";
        boolean falloFicha = false;
        
                
        
        System.out.println("******************************** \na. Iniciar juego \nb. Salir \n********************************");
        Tmenu = sc.nextLine();
        sc.reset();
        
        if(Tmenu.equals("a")){ //Iniciar juego
            while(contjuego<9){
            System.out.println("+-----+-----+-----+\n|  "+f1+"  |  "+f2+"  |  "+f3+"  |\n+-----+-----+-----+\n|  "+f4+"  |  "+f5+"  |  "+f6+"  |"); //Tablero prueba
            System.out.println("+-----+-----+-----+\n|  "+f7+"  |  "+f8+"  |  "+f9+"  |\n+-----+-----+-----+");
            
            do{
            
            if(contjuego%2==0){
                System.out.println("********************************\nJugador 1 te toca:\n********************************");
                Tjuego = sc.next();
                sc.reset();
            } else 
                if(contjuego%2==1){
                    System.out.println("********************************\nJugador 2 te toca:\n********************************");
                    Tjuego = sc.next();
                    sc.reset();
                }
            /*if(Tjuego.equals("1") && Tjuego.equals("2") && Tjuego.equals("3") && Tjuego.equals("4") && Tjuego.equals("5") && Tjuego.equals("6") && Tjuego.equals("7") && Tjuego.equals("8") && Tjuego.equals("9")){
                
            }else{
                System.out.println("!!No se puede colocar la ficha!!");
                falloFicha = true;
            }*/
            
            if(Tjuego.equals("1")){
                if(f1.equals("X") || f1.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }
            }else
                if(Tjuego.equals("2")){
                    if(f2.equals("X") || f2.equals("Y")){
                        System.out.println("¡¡No se puede colocar la ficha aquí!!");
                        falloFicha = true;
                    }
            }else
                if(Tjuego.equals("3")){
                if(f3.equals("X") || f3.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                } 
            }else
                if(Tjuego.equals("4")){
                if(f4.equals("X") || f4.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }  
            }else
                 if(Tjuego.equals("5")){
                if(f5.equals("X") || f5.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }  
            }else
                if(Tjuego.equals("6")){
                if(f6.equals("X") || f6.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }  
            }else
                if(Tjuego.equals("7")){
                if(f7.equals("X") || f7.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }  
            }else
                if(Tjuego.equals("8")){
                if(f8.equals("X") || f8.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                }
            }else
                if(Tjuego.equals("9")){
                if(f9.equals("X") || f9.equals("Y")){
                    System.out.println("¡¡No se puede colocar la ficha aquí!!");
                    falloFicha = true;
                } 
            }
            }while(falloFicha); //Para que el jugador no pueda poner la ficha donde ya hay una 
            
            if(Tjuego.equals("1")){ //Ficha N1
                if(contjuego%2==0){
                    f1= "X";
                } else
                    if(contjuego%2==1){
                        f1= "Y";
                    }
            } else
                if(Tjuego.equals("2")){ //Ficha N2
                    if(contjuego%2==0){
                        f2= "X";
                    }else
                        if(contjuego%2==1){
                            f2="Y";
                        }
                }else
                    if(Tjuego.equals("3")){ //Ficha N3
                       if(contjuego%2==0){
                           f3="X";
                       }else
                           if(contjuego%2==1){
                               f3="Y";
                           }
                    }else
                        if(Tjuego.equals("4")){ //Ficha N4
                            if(contjuego%2==0){
                                f4="X";
                            }else
                                if(contjuego%2==1){
                                    f4="Y";
                                }
                        }else
                            if(Tjuego.equals("5")){ //Ficha N5
                                if(contjuego%2==0){
                                    f5="X";
                                }else
                                    if(contjuego%2==1){
                                        f5="Y";
                                    }
                            }else
                                if(Tjuego.equals("6")){ //Ficha N6
                                   if(contjuego%2==0){
                                       f6="X";
                                   }else
                                       if(contjuego%2==1){
                                           f6="Y";
                                       }
                                }else
                                    if(Tjuego.equals("7")){ //Ficha N7
                                        if(contjuego%2==0){
                                            f7="X";
                                        }else
                                            if(contjuego%2==1){
                                                f7="Y";
                                            }
                                    }else
                                        if(Tjuego.equals("8")){ //Ficha N8
                                            if(contjuego%2==0){
                                                f8="X";
                                            }else
                                                if(contjuego%2==1){
                                                    f8="Y";
                                                }
                                        }else
                                            if(Tjuego.equals("9")){ //Ficha N9
                                               if(contjuego%2==0){
                                                   f9="X";
                                               }else
                                                   if(contjuego%2==1){
                                                       f9="Y";
                                                   }
                                            }
            Tjuego = " ";
            contjuego++; //para q solo se pueda poner 9 fichas
            
            if(contjuego>4 && contjuego<10){  //para comprovar quien gana 
                
               if(f1.equals(f2) && f2.equals(f3)){  //Comprueba 1 , 2 , 3
                   if(f1.equals("X")){
                       System.out.println("Jugador 1 Gana!");
                       contjuego =9;
                   }else
                       if(f1.equals("Y")){
                           System.out.println("Jugador 2 Gana!");
                           contjuego=9;
                       }
               }else
                   if(f4.equals(f5) && f5.equals(f6)){  //Comprueba 4 , 5 , 6
                       if(f4.equals("X")){
                          System.out.println("Jugador 1 Gana!");
                          contjuego =9;
                       }else
                          if(f4.equals("Y")){
                              System.out.println("Jugador 2 Gana!");
                              contjuego=9;
                           }
               }else
                   if(f7.equals(f8) && f8.equals(f9)){  //Comprueba 7 , 8 , 9
                       if(f7.equals("X")){
                           System.out.println("Jugador 1 Gana!");
                           contjuego =9;
                       }else
                           if(f7.equals("Y")){
                               System.out.println("Jugador 2 Gana!");
                               contjuego=9;
                           }
               }else
                   if(f1.equals(f4) && f4.equals(f7)){  //Comprueba 1 , 4 , 7
                       if(f1.equals("X")){
                          System.out.println("Jugador 1 Gana!");
                          contjuego =9;
                      }else
                          if(f1.equals("Y")){
                              System.out.println("Jugador 2 Gana!");
                              contjuego=9;
                           }
               }else
                    if(f2.equals(f5) && f5.equals(f8)){  //Comprueba 2 , 5 , 8
                        if(f2.equals("X")){
                            System.out.println("Jugador 1 Gana!");
                            contjuego =9;
                        }else
                            if(f2.equals("Y")){
                               System.out.println("Jugador 2 Gana!");
                               contjuego=9;
                            }
               }else
                    if(f3.equals(f6) && f6.equals(f9)){  //Comprueba 3 , 6 , 9
                   if(f3.equals("X")){
                       System.out.println("Jugador 1 Gana!");
                       contjuego =9;
                   }else
                       if(f3.equals("Y")){
                           System.out.println("Jugador 2 Gana!");
                           contjuego=9;
                       }
               }else
                    if(f1.equals(f5) && f5.equals(f9)){  //Comprueba 1 , 5 , 9
                        if(f1.equals("X")){
                           System.out.println("Jugador 1 Gana!");
                            contjuego =9;
                        }else
                            if(f1.equals("Y")){
                                System.out.println("Jugador 2 Gana!");
                                contjuego=9;
                            }
               }else
                    if(f3.equals(f5) && f5.equals(f7)){  //Comprueba 3 , 5 , 7
                   if(f3.equals("X")){
                       System.out.println("Jugador 1 Gana!");
                       contjuego =9;
                   }else
                       if(f3.equals("Y")){
                           System.out.println("Jugador 2 Gana!");
                           contjuego=9;
                       }
               } 
            }
          }
        }else
            if(Tmenu.equals("b")){ //Salir
                System.out.println("Saliendo...");
            }
       
    }
}
