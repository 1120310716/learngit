

public class test1 {
public static void main(String[] args)
     {
	 String filename="SERVICE.txt";
	 try{
	      scanner=new Scanner(new File(filename));
	    }catch(FileNotFoundException e)
	      {
		  e.printStackTrace();
		   System.out.println("Error openning the file"+filename);
		  }
	 while(scanner.hasNextLine()){
		   String line=scanner.nextLine();
		   for(j=0;j<5;j++)
		   {
			   if(str!=null && str.length()!=0)
			   {
			    StringBuffer bf = new StringBuffer();
			    
			    char[] chars = str.toCharArray();
			    int jilu=0;
			    for(int i=jilu+1;i<chars.length;i++)
			    {
			     char c = chars[i];   
			     if(c>='0' && c<='9')
			     {
			      bf.append(c);
			     }
			     else if(c=='.')
			     {
			      if(bf.length()==0)
			      {
			       continue;
			      }
			      else if(bf.indexOf(".")!=-1)
			      {
			       break;
			      }
			      else
			      {
			       bf.append(c);
			      }
			     }    
			     else
			     {
			      if(bf.length()!=0)
			      {
			       break;
			       
			      }
			     }
			    
			    }
			    jilu=i;
			    try
			    {
			     d = Double.parseDouble(bf.toString());
			    }
			    catch(Exception e)
			    {}
			   if(j=2)
				   shuzu1[j]=d;
			   if(j=4)
				   shuzu2[j]=d;
			   }
		   }
		   }
		   
		   
		  }scanner.close();
	 }
private static double getDoubleValue(String str)
{
for(i=0;i<6;i++)
{
	double d = 0;  
 
 if(str!=null && str.length()!=0)
 {
  StringBuffer bf = new StringBuffer();
  
  char[] chars = str.toCharArray();
  for(int i=0;i<chars.length;i++)
  {
   char c = chars[i];   
   if(c>='0' && c<='9')
   {
    bf.append(c);
   }
   else if(c=='.')
   {
    if(bf.length()==0)
    {
     continue;
    }
    else if(bf.indexOf(".")!=-1)
    {
     break;
    }
    else
    {
     bf.append(c);
    }
   }    
   else
   {
    if(bf.length()!=0)
    {
     break;
    }
   }
  }
  try
  {
   d = Double.parseDouble(bf.toString());
  }
  catch(Exception e)
  {}
 }
}
 return d;
} 
}


