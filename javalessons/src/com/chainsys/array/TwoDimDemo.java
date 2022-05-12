package com.chainsys.array;

public class TwoDimDemo {
public static void  creatingTwoDintArray()
{
      int twod[][]=new int[4][5];//4 rows 5 col
      int rowIndex,colIndex=0;
      int data=0;
  for(rowIndex=0;rowIndex<4;rowIndex++) 
  {
     for(colIndex=0;colIndex<5;colIndex++)
     {
       twod[rowIndex][colIndex]=data;
       data++;
     }

   }
   for(rowIndex=0;rowIndex<4;rowIndex++) 
   {
      for(colIndex=0;colIndex<5;colIndex++)
      {
        System.out.print(twod[rowIndex][colIndex]+"\t");
      }
        System.out.println();
    }
 }


public static void calculateTotalandAverage()
{
     int marks[][]=new int[][]
{
{82,38,45,77,55,0,0},
{95,99,92,90,85,0,0},
{85,100,91,92,93,0,0},
{75,55,92,74,66,0,0},
{85,75,58,62,75,0,0}};//5 row 7
    int rowIndex,colIndex,sum=0;
       for(rowIndex=0;rowIndex<5;rowIndex++) 
       {
         for(colIndex=0;colIndex<5;colIndex++)
         {
           sum+=marks[rowIndex][colIndex];
         }
          marks[rowIndex][5]=sum;
          marks[rowIndex][6]=sum/5;
          sum=0;
       }
//Display the marks,Total,Average
     int subjectNo=1;
     for(subjectNo=1;subjectNo<=5;subjectNo++)
     {
        System.out.print("Sub"+(subjectNo)+"\t");
     }
        System.out.print("Total\t");
        System.out.println("Avg");
        System.out.println("-----------------------------------------------------------");
//
      for(rowIndex=0;rowIndex<5;rowIndex++)
      {
          for(colIndex=0;colIndex<7;colIndex++)
          {
            System.out.print(marks[rowIndex][colIndex]+"\t");
          }
            System.out.println();
      }
    }


public static void fewOtherWaysOfCreatingTwoDintArray() {
// int[]a[]=new int[4][4];//col for all the row are equal
// int a1[][]=new int[4][4];
//int a2[][]=new int[][4];//wrong
//uneven 2D array-the col for all the rows are NOT equal
// int[]a3[]=new int[4][];
// int[][] a4=new int[4][4];//col for all the rows are equal
// int[][]a5=new int[4][4];//col for all the rows are equal
// int[]i[]= {{1,2},{3,4},{5,6}};//col for all the rows are equal
//int j[]=new int[2]{1,2};//wrong
// int k[][]=new int[][] {{1,2,3},{4,5,6}};//col for all the rows are equal
}

public static void unevenTwoDArray() 
 {
     int uneventwod[][]=new int[4][];
     uneventwod[0]=new int[1];
     uneventwod[1]=new int[4];
     uneventwod[2]=new int[3];
     uneventwod[3]=new int[2];
        int rowIndex,colIndex,rowlength=0,data=100;
          for(rowIndex=0;rowIndex<4;rowIndex++)
          {
            rowlength=uneventwod[rowIndex].length;
               for(colIndex=0;colIndex<rowlength;colIndex++)
               {
                  uneventwod[rowIndex][colIndex]=data;
                  data++;
               }
           }
            for(rowIndex=0;rowIndex<4;rowIndex++)
            {
              rowlength=uneventwod[rowIndex].length;
                for(colIndex=0;colIndex<rowlength;colIndex++) 
                {
                  System.out.print(uneventwod[rowIndex][colIndex]+" ");
                }
          System.out.println();

             }
        }

//HW
public static void samplearray() {
int uneventwod[][]=new int[3][];
uneventwod[0]=new int[1];
uneventwod[1]=new int[1];
uneventwod[2]=new int[1];
int rowIndex,colIndex,rowlength=0;
String data[]= {"hai","i am Abi","oracle java developer"};
for(rowIndex=0;rowIndex<3;rowIndex++) {
rowlength=uneventwod[rowIndex].length;
for(colIndex=0;colIndex<rowlength;colIndex++) {
System.out.print(data[rowIndex]+" ");
}
System.out.println();
}
}

//shanthini
public static void unevenTwodArray1() {
int uneventwod [][]=new int [3][];
uneventwod[0]=new int[1];
uneventwod[1]=new int[2];
uneventwod[2]=new int[3];
int rowIndex,colIndex,rowlength=0;

String data[]= {"hi","i am Abi","oracle java developer"};
int dataIndex=0;
for (rowIndex = 0; rowIndex <3 ; rowIndex++) {
rowlength=uneventwod[rowIndex].length;
for (colIndex = 0; colIndex < rowlength; colIndex++) {
if(colIndex==dataIndex) {
System.out.print(data[colIndex]);
dataIndex++;
}

}
System.out.println();
}
}

public static void calculate() {
int marks[][]=new int[][]
{
{82,38,45,77,55,0,0},
{95,99,92,90,85,0,0},
{85,100,91,92,93,0,0},
{75,55,92,74,66,0,0},
{85,75,58,62,75,0,0}};//5 row 7
int rowIndex,colIndex,sum=0;
for(rowIndex=0;rowIndex<5;rowIndex++) {
for(colIndex=0;colIndex<5;colIndex++) {
sum+=marks[rowIndex][colIndex];
}
marks[rowIndex][5]=sum;
marks[rowIndex][6]=sum/5;
sum=0;
}
//Display the marks,Total,Average
int subjectNo=1;
for(subjectNo=1;subjectNo<=5;subjectNo++) {
System.out.print("Sub"+(subjectNo)+"\t");
}
System.out.print("Total\t");
System.out.println("Avg");
System.out.println("------------------------------------------------------");
//
String output=" ";
for(rowIndex=0;rowIndex<5;rowIndex++) {
	//System.out.print("\t");
for(colIndex=0;colIndex<7;colIndex++) {
	int mark=marks[rowIndex][colIndex];
	if(mark<100)
	{
		output=String.format("0%d -   ",mark);
	}
	else
		output=String.format("%d -   ",mark);
System.out.print(output);
}
System.out.println();
}
}

}
