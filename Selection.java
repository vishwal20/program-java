

class Main {
    public static void main(String[] args) {
       
          int a[]={5,6,7,2,1};
          int b=0,n=0,temp=0;
          for(int i=0;i<a.length-1;i++)
          {
               b=i;
               n=a[i];
              for(int j=a.length-i;j>0;j--)
              {
                  if(n>a[b])
                  {
                      n=a[b];
                      temp=a[b];
                      a[b]=a[i];
                      a[i]=temp;
                  }
                  b++;
              }
              
            }
          
          System.out.println(java.util.Arrays.toString(a));
    }
}
