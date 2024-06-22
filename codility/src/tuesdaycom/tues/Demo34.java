// package tuesdaycom.tues;

// public class Demo34 {
// 	String part1 ="";
//     String part2 =""; 
//     String part3 ="";
//     int i1 = input1.indexOf("@");
//     int i2= input1.indexOf(".");
//     //int i3= input1.indexOf("str")
    
//      part1 = input1.substring(0,i1);
//      System.out.println(part1);
//      part2 = input1.substring(i1,i2);
//      System.out.println(part2);
//      part3 = input1.substring(i2,input1.length());
//      System.out.println(part3);
     
     
//     boolean valid1 =false;
//     boolean valid2 =false;
//     boolean valid3 =false;

//     for(int i=0; i<part1.length(); i++){
//         char ch = part1.charAt(i);
//         if(Character.isAlphabetic(ch) || Character.isDigit(ch) && Character.isLowerCase(ch) && part1.length()<15){
//             valid1=true;
//         }
//     }

//     if(part2.equals("@wipro") || part2.equals("@gmail") ||part2.equals("@yahoo")){
//         valid2=true;
//     }       
//      for(int i=0; i<part2.length(); i++){
//         char ch = part2.charAt(i);
//         if(Character.isLowerCase(ch)){
//             valid2=true;
//         }
//     }
//     if(part3.contains(".com")){
//         valid3=true;
//     }
//     for(int i=0; i<part3.length(); i++){
//         char ch = part3.charAt(i);
//         if(Character.isLowerCase(ch)){
//             valid3=true;
//         }
//     }
//     String res="";
//     if(valid1==true && valid2==true && valid3==true ){
//         res=part1+":"+part3+":"+"valid";
//     }
//     else{
//         res=part1+":"+part2+":"+"invalid";
//     }
//     return res;
// }	
// }
