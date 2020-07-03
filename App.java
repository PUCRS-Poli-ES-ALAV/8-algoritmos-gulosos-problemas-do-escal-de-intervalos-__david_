public class App {
	public static void main (String [] args) {
		int[] s = {3, 1, 10, 6, 12, 2, 8, 9, 11, 4, 13};
    int[] f = {4, 2, 6, 7, 4, 9, 20, 11, 12, 13, 14};
			
		int [] resultSDM = gulosoSDM(s,f, 11);

		for (int i=0; i< resultSDM.length; i++) {
			System.out.println(resultSDM[i]);
		}
	}

	public static int[] gulosoSDM(int[]s, int []f, int n) {
		f[0] = -1;
		int [] x = new int [n];
		int i = 0;
		for (int k = 1; k < n; k++) {
			if (s[k] > f[i]) {
				x[k]=k;
				i=k;
			} else {
				x[k]=0;
			}
		}
		return x;
	}
}
