//========== slip 4_3 ========//


import java.io.*;

class slip4_3

{

public static void main(String arg[])throws IOException

 {
 
File in1=new File("f1.txt");
 
File in2=new File("f2.txt");
 
File in3=new File("f3.txt");
 

FileReader fr1=new FileReader(in1);

 FileWriter fw1=new FileWriter(in2);
 
int ch;

 while((ch=fr1.read())!=-1)

 {
   
char c=(char)ch;
   
if(Character.isUpperCase(c))
    
{
     
c=Character.toLowerCase(c);

     fw1.write(c);

   }
   
else if(Character.isLowerCase(c))
   
{
     
c=Character.toUpperCase(c);
     
fw1.write(c);
   
}
  
else
 
 {
    
fw1.write(c);
  
}
 
}
 

fw1.close();
 

FileReader r1=new FileReader(in1);

 FileWriter w1=new FileWriter(in3);
 

while((ch=r1.read())!=-1)
 
{
  
char c=(char)ch;
  
w1.write(c);

 }
 
r1.close();



 FileReader r2=new FileReader(in2);


 while((ch=r2.read())!=-1)
 
{
   
char c=(char)ch;
   
w1.write(c);

 }
 
r2.close();

 w1.close();
 
}
 
}


/*================= Output===============


/*****************f1.txt*******************

asdsdf  sdjfsdf saduf sdfsdf;
s
df sdfsdf
 sdhfsd
f sadfsdfhs fisf sdf sdfsdsljfsad 
fpsdfoshdf 

DFG
DFGH
DH
  DHHJ 
 DFGN SHOH FG SDFH OSHDFC HSDHFSDHFH SDFSHDF


/*****************f2.txt********************

ASDSDF  SDJFSDF SADUF SDFSDF;
S
DF SDFSDF
 SDHFSD
F SADFSDFHS FISF SDF SDFSDSLJFSAD
 FPSDFOSHDF 

dfg
dfgh
dh
  dhhj 
 dfgn shoh fg sdfh oshdfc hsdhfsdhfh sdfshdf


/*****************f3.txt********************


asdsdf  sdjfsdf saduf sdfsdf;
s
df sdfsdf
 sdhfsd
f sadfsdfhs fisf sdf sdfsdsljfsad 
fpsdfoshdf 

DFG
DFGH
DH
  DHHJ 
 DFGN SHOH FG SDFH OSHDFC HSDHFSDHFH SDFSHDF

ASDSDF  SDJFSDF  SADUF SDFSDF;
S
DF SDFSDF
 SDHFSD
F SADFSDFHS FISF SDF SDFSDSLJFSAD FPSDFOSHDF
 

dfg
dfgh
dh
  dhhj 
 dfgn shoh fg sdfh oshdfc hsdhfsdhfh sdfshdf
*/
