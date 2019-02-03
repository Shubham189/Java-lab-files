class rational
{

		private static int num,den;
		rational(int x, int y)
		{
			num=x;
			den=y;
		}

		private static int gcd()
		{
			int gcd=1,p,i;
			if(num<den)
				p=den;
			else
				p=num;
			{
				for(i=2;i<=p;i++)
					if(num%i==0 && den%i==0)
						gcd=i;
			}
			return gcd;
		}

		private static void reduce()
		{
			int a=gcd();
			System.out.print(num+"/"+den+"=");
			num/=a; den/=a;
			System.out.print(num+"/"+den+"\n");
		}
		public static void main(String []arg)
		{
				rational a=new rational(10,80);
				a.reduce();
		}
}
