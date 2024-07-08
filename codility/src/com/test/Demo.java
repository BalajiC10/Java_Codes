 package com.test;
 class Demo {
	 
	 int count=0;
	 
      for(int i=1; i<input2;i++){
         count +=countocc(i,count);
     }
     
     return count;


 public int countocc(int num,int digit){
     int count=0;
      while(num>0){
          if(num%10==digit){
              count++;
          }
          num/=10;
     }
     return count;
  }
  }
 }}
