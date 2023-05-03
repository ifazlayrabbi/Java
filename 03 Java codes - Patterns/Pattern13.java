package packages;

public class Pattern13 {
  public static void main (String[] args) {
    
    int n = 5;

    // int track;
    // for (int i=1; i<=n; i++){
    //   if (i%2 == 0)
    //     track = 0;
    //   else 
    //     track = 1;
      
    //   for (int j=1; j<=i; j++){
    //     System.out.print(" " + track + " ");

    //     if (track == 1)
    //       track = 0;
    //     else
    //       track = 1;
    //   }
    //   System.out.println("");
    // }

    for (int i=0; i<n; i++){
      for (int j=0; j<=i; j++){
        
        int sum = i + j;
        if(sum % 2 == 0)
          System.out.print(" " + 1 + " ");
        else
          System.out.print(" " + 0 + " ");
      }
      System.out.println("");
    }

  }
}