package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size1,size2,gop;
        int i;
        Scanner scanner = new Scanner(System.in);
        int[] array1, array2,arraySum;
        do{
            System.out.print("nhap vao so phan tu cua mang 1:");
            size1 = scanner.nextInt();
            System.out.print("nhap vao so phan tu cua mang 2:");
            size2 = scanner.nextInt();
            if(size1 >20 || size2 >20)
                System.out.print("so phan tu cua mang khong vuot qua 20! moi nhap lai");
        }while(size1>20 || size2 > 20);
        gop = size1 + size2;
        array1 = new int[size1];
        array2 = new int[size2];
        arraySum = new int[gop];
        //nhap vao cac phan tu:
        System.out.print("nhap vao cac phan tu cua mang 1:");
        for(i=0;i<size1;i++){
            array1[i]= scanner.nextInt();
        }
        System.out.print("nhap vao cac phan tu cua mang 2:");
        for(i=0;i<size2;i++){
            array2[i]=scanner.nextInt();
        }
        //in ra danh sach gop
        System.out.print("Danh sach cac phan tu cua mang 1 va mang 2 gop lai:");
        for(i=0; i< size1; i++)
        {
            arraySum[i]=array1[i];
            System.out.print("\t"+arraySum[i]);
        }
        for(i=size1;i<gop;i++)
        {
            arraySum[i]=array2[i-size1];
            System.out.print("\t"+arraySum[i]);
        }
    }

}
