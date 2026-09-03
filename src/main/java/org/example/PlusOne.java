package org.example;

public class PlusOne {

  public static void main(String args[]){
      int[] value = {9,9};

      int lastIndexValue = 0;

      int arrLength = value.length;
      System.out.println("\n Array Length: "+ arrLength);

      for(int i=0;i< value.length;i++){
          System.out.println("\n Before Array Value: "+ value[i]);
      }

      for(int v=value.length -1 ; v>=0;v--){
          value[v]++;
          value[v] = value[v] % 10;

          if(value[v] !=0){
              System.out.println("\n Return Direct value: "+ value[v]);
          }
      }

      int[] result = new int[arrLength+1];
      result[0] = 1;
      for(int i=0;i< value.length;i++) {
          System.out.println("\n Results : " + result[i]);
      }


//      for(int i=0;i< value.length;i++){
//          if(arrLength-1 == i){
//              lastIndexValue = value[i]++;
//          }
//          System.out.println("\n After Array Value: "+ value[i]);
//
//          if(value[arrLength-1] > lastIndexValue){
//
//              String s = String.valueOf(value[arrLength-1]);
//
//              char[] ch = s.toCharArray(); //['1','0']
//
//              int[] digit = new int[ch.length];
//
//              for(int c=0;c<digit.length;c++){
//                  digit[c] = ch[c] - '0';
//              }
//
//              System.out.println("\n Value greater than 9: " + Arrays.toString(digit));
//
//             int[] result = new int[value.length-1 + digit.length];
//
//              for (int v = 0; v < value.length-1; v++) {
//                  result[v] = value[v];
//              }
//
//              // 2) digits values ஐ பின்னால் copy
//              for (int d = 0; d < digit.length; d++) {
//                  result[value.length-1 + d] = digit[d];
//              }
//
//              System.out.println("\n Array Merge: " + Arrays.toString(result)); // [1, 2, 4, 1, 0]
//
//        } else{
//
//              for(int v=value.length; v>=0;v--){
//                  value[v]++;
//                  value[v] = value[v] % 10;
//
//                  if(value[v] !=0){
//                      System.out.println("\n Return Direct value: "+ value[v]);
//                  }
//              }
//
//              int[] result = new int[arrLength+1];
//              result[0] = 1;
//
//              System.out.println("\n Results : "+ result);
//          }


      //}




  }



}
