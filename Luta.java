
package projeto.integrador;
import java.util.Scanner;
import java.util.Random;

public class Luta {
    static int ataqueusuariokobesh(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Escolha seu ataque: ");
        System.out.println("1 - Corte");
        System.out.println("2 - Especial - Corte Fatal");
        return tc.nextInt();
    }
    static int ataqueusuariocajado(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Escolha seu ataque: ");
        System.out.println("1 - Bola de Fogo");
        System.out.println("2 - Especial - Lança de Fogo");
        return tc.nextInt();
    }
    static int ataquebot(){
        Random bot = new Random();
        return bot.nextInt(2)+1;
    }
    static void imprimehp(int hpusuario,int hpbot,int especial){
        System.out.println("---------------------");
        System.out.println("HP - Rael: "+ hpusuario);
        System.out.println("HP - Mumia: "+ hpbot);
        System.out.println("Especiais: "+ especial);
        System.out.println("---------------------");
    }
    static void batalhakobesh(int i){
        int hpusuario = 100;
        int hpbot;
        int especial = 3;
        int escolha;
        
        
            hpbot = 7+i;
        while (hpusuario > 0 && hpbot > 0){
            imprimehp(hpusuario, hpbot , especial);
            escolha = ataqueusuariokobesh();
            switch(escolha){
                case 1:
                    System.out.println("Rael Cortou o inimigo");
                    hpbot -= 7;
                    break;
                case 2:
                    System.out.println("Rael deu um Corte Fatal no inimigo");
                    hpbot -=10;
                    especial--;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            if(hpbot > 0){
                escolha = ataquebot();
                switch(escolha){
                    case 1:
                        System.out.println("A mumia arranhou Rael");
                        hpusuario -=0 + i;
                        break;
                    case 2:
                        System.out.println("A mumia mordeu Rael");
                        hpusuario -=3 + i;
                        break;
                }
            }
            else{
                System.out.println("Mumia derrotada.");
            }
        }
        if (hpusuario > 0){
            hpusuario+=0 +i;
           if(hpusuario > 100){
               hpusuario = 100;
           }
           if (i %10==0 ){
               especial++;
               if(especial > 3){
                   especial = 3;
               }
           }
        }
        i+=5;
    }
    static void batalhacajado(int i){
        int hpusuario = 100;
        int hpbot;
        int especial = 3;
        int escolha;
        
        
            hpbot = 7+i;
        while (hpusuario > 0 && hpbot > 0){
            imprimehp(hpusuario, hpbot , especial);
            escolha = ataqueusuariocajado();
            switch(escolha){
                case 1:
                    System.out.println("Rael lançou uma bola de fogo o inimigo");
                    hpbot -= 7;
                    break;
                case 2:
                    System.out.println("Rael usou a lança de fogo no inimigo");
                    hpbot -=10;
                    especial--;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            if(hpbot > 0){
                escolha = ataquebot();
                switch(escolha){
                    case 1:
                        System.out.println("A mumia arranhou Rael");
                        hpusuario -=0 + i;
                        break;
                    case 2:
                        System.out.println("A mumia mordeu Rael");
                        hpusuario -=3 + i;
                        break;
                }
            }
            else{
                System.out.println("Mumia derrotada.");
            }
        }
        if (hpusuario > 0){
            hpusuario+=0 +i;
           if(hpusuario > 100){
               hpusuario = 100;
           }
           if (i %10==0 ){
               especial++;
               if(especial > 3){
                   especial = 3;
               }
           }
        }
        i+=5;
    }
        
    
    public static void main(String[] args){
        batalhacajado(1);
        batalhakobesh(1);
    }
}