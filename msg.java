
public class msg {
    int a=97;
 char all[]=new char[26];
 
 msg()
 {
  for(int i=0;i <25;i++)
  { 
   all[i]=(char)a;
   a++; 
  }
 }
 
 int Ipos(char c)
 {
  int i=0;
  for(;i < 25;i++)
  {
   if(all[i]==c)
   {
    break;
   }
  }
  return i;
 }
  
 char Cpos(int c)
 {
  int i=0;
  for(;i < c;i++)
  {
    
  }
  return all[i];
 }
    
}
