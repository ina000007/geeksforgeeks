package geeksForgeeks;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		String s1 = "AGGTA";
		String s2 = "GXTXAY";
		LCS(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
	}
	public static void LCS(char[] s1,char[] s2,int m,int n){
		int[][] tab = new int[m+1][n+1];
		int i,j;
		
		for(i=0;i<=m;i++){
			for(j=0;j<=n;j++){
				if(i==0 || j==0)
					tab[i][j]=0;
				else if(s1[i-1]==s2[j-1])
					tab[i][j]=tab[i-1][j-1]+1;
				else
					tab[i][j]=Math.max(tab[i-1][j],tab[i][j-1]);
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}
	System.out.println(tab[m][n]);	
	}
}
