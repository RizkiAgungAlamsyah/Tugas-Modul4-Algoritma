/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_modul4;

/**
 *
 * @author LENOVO
 */
public class shellsort {
    public static void shellSort(int []A){
        int n = A.length;
        int x,y;
        int jarak, i, j, kondisi;
        boolean sudah = true;
        
        int temp;
        x =0;
        y=0;
        jarak =n;
        
        while(jarak >=1 ){
            jarak = jarak/2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (j = 0; j<n - jarak; j++){
                    i = j+jarak;
                    x++;
                    if (A[j]>A[i]){
                        temp = A[i];
                        A[j] = A[i];
                        A[i] = temp;
                        sudah = true;
                    }
                }
            }
        }
                
    }
    public static void tampil(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        }
    
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        shellsort.tampil(A);
        shellsort.shellSort(A);
        shellsort.tampil(A); 
    }
}
