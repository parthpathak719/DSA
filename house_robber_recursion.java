import java.util.Scanner;
public class house_robber_recursion{
  public static int loot(int n, int[] arr){
    if(n<=0){
      return 0;
    }
    int choice1=arr[n-1]+loot(n-2,arr);
    int choice2=loot(n-1,arr);
    int ans=Math.max(choice1,choice2);
    return ans;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(loot(n,arr));
  }
}