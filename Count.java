package Tamil;

public class Count {

	public static void main(String[] args) {
		//String s="தமிழ்உயிழுத்துக்கள்";
		String s ="காமாட்சி";
		char a[]=s.toCharArray();
		int uyir=0,mei=0,uyirmei=0;
		for(int i=0;i<a.length;i++)
		{
			int j=i+1;
			if(a[i]>=2947&&a[i]<=2963)
			{System.out.print("Uyir Eluthu-------->");
				
				if(a[i]==2962)
				{
					if(a[j]==2995)
					{
						System.out.println(a[i]+""+a[j]);
						i=i+1;
						uyir++;
					}
					else
					{
						System.out.println(a[i]);
						uyir++;
					}
					}
			
					else
					{
						System.out.println(a[i]);
						uyir++;
					}
			}
			if(a[j]==3021)
			{
				System.out.print("Mei eluthu--------->");
				System.out.println(a[i]+""+a[j]);
				i=i+1;
				mei++;
			}
			if((char)a[j]==(char)3006||(char)a[j]==(char)3007||(char)a[j]==(char)3008||
					(char)a[j]==(char)3009||(char)a[j]==(char)3010||(char)a[j]==(char)3014||(char)a[j]==(char)3015||
					(char)a[j]==(char)3016||(char)a[j]==(char)3018||(char)a[j]==(char)3019||(char)a[j]==(char)3020 )
			{
				System.out.print("Uyirmei eluthu----->");
				System.out.println(a[i]+""+a[j]);
				i=i+1;
				uyirmei++;
			}
				if(a[i]>=2965&&a[i]<=2997)
				{
				System.out.print("Uyirmei eluthu----->");
				System.out.println(a[i]);
				uyirmei++;
				}
			
			}
		System.out.println("Count of uyir="+uyir+"|"+
			"mei="+mei+"|"+
			"uyirmei="+uyirmei);
		}

	}


