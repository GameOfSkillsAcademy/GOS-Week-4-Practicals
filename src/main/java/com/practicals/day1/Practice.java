package com.practicals.day1;

public class Practice {

    public static void main(String[] args) {


        int[] array = {10, 45, 23, 69,66,68, 5, 12, 67};
//
//        int largest = array[0];
//        int smallest=array[0];
//
//        for (int i=1;i<array.length;i++){
//
//            if(array[i]>largest)largest=array[i];
//
//            if(array[i]<smallest)smallest=array[i];
//
//        }
//        System.out.println(largest);
//        System.out.println(smallest);
//    }


//        int secondlargest = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > largest) {
//                secondlargest = largest;
//                largest = array[i];
//            }
//            if (array[i] < largest && array[i] > secondlargest) secondlargest = array[i];
//        }
//        System.out.println(secondlargest);

        int[] zeroes={10,0,0,20,30,0,0};

        int i=0;
        for(int num:zeroes){
            if(num>0)zeroes[i++]=num;
        }
        for(int j=i;j<zeroes.length;j++){
            zeroes[j]=0;
        }
        for(int num:zeroes){
            System.out.println(num);
        }
    }
}
