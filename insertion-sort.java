
class Main {
    public static void main(String[] args) {
        int a[]=new int[5];
    
        java.util.Scanner d=new java.util.Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
             String f=d.nextLine();
            a[i]=Integer.parseInt(f);
        }
    
        int b=0,temp=0,s=0,v=0;
        for(int i=0;i<a.length-1;i++)
        {
            b=i;
            for(int j=i+1;0<j;j--)
            {
               System.out.println(j+" "+b);
                if(a[j]<a[b])
                {
                    temp=a[j];
                    a[j]=a[b];
                    a[b]=temp;
                }
                b--;
               
                System.out.println(java.util.Arrays.toString(a));
            }
           
            System.out.println();
        }
    }
}
