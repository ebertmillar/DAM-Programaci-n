/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc10 {

    public static void main(String[] args) {
        
        /*
        Diseña un programa Java, denominado PROG02_Ejerc10, 
        que realice las siguientes operaciones, en el orden que se muestran. 
        Se indica la variable y el tipo de dato que recibe el valor o 
        resultado de la operación indicada:
        */
        
        System.out.print("=======Conversiones entre enteros y coma flotante=======");
         
        //Producto de int por float: j= i*x = 9
        float x = 4.5f;
        int i = 2;
        int j;
        j = (int)(i *x);
        System.out.print("\nProducto de int por float: j = i * x = "+j);
       
        //Producto de float por double: dz=dx * y = 6.0
        float y = 3.0f;
        double dx=2.0;
        double dz;      
        dz = (double)(dx * y);
        System.out.print("\nProductode float por double: dz= dx * y = "+dz);

        System.out.print("\n\n=======Operaciones con byte=======");
        byte bx =5;
        byte by =2;
        byte bz;
        
        //byte: 5 - 2 = 3          
        bz = (byte)(bx - by);
        System.out.print("\nbyte: "+bx+" - "+by+" = "+bz); 
        
        //byte -128 - 1 = 127
        bx=-128;
        by =1;
        bz = (byte)(bx-by);
        System.out.print("\nbyte: "+bx+" - "+by+" = "+bz);
            
        //(int)(-128 - 1) = -129
        int bz2 = (bx-by);
        System.out.print("\n(int) ( "+bx+" - "+by+") = "+bz2);
        
        System.out.print("\n\n=======Operaciones con short=======");
        short sx =5;
        short sy=2;
        short sz;
        
        //short: 5 - 2 = 3
        sz=(short)(sx -sy);
        System.out.print("\nshort:  "+sx+" - "+sy+" = "+sz);
        
        //short 32767 + 1 = -32768
        sx = 32767;
        sy=1;
        sz = (short)(sx+sy);
        System.out.print("\nshort:  "+sx+" - "+sy+" = "+sz);
        
        System.out.print("\n\n=======Operaciones con Char=======");
        
        char CX = '\u000F';
        char CY = '\u0001';
        int Z = (char) (CX -CY);
        
        //char: - = 14       
        System.out.print("\nchart:  "+CX+" - "+CY+" = "+Z);
        
        //Z = ((int) CX) - 1;
        Z = ((int) CX) - 1;
        System.out.printf("\nchar(%X) - 1 = %d ",(int) CX,Z);
    
        //(int)( ) = 65535
        CX = '\uFFFF';
        Z = CX;
        System.out.print("\n(int) ()= "+Z);

        //(short)( ) = -1
        sx = (short) (CX); 
        System.out.print("\n(short)()= "+sx);
        
        //-32768 short-char-int = 32768
        sx = -32768;
        CX = (char)(sx); 
        sx = (short)(CX);
        Z = (int) (CX); 
        System.out.print("\n"+sx+" short-char-int = "+Z);

        
    }
}
