public class Method {

	public static void main(String[] args) {
		int [][]S = {{1, 0, 0, 0}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
		float []weight = {0, 1, 1}; 
		
		for(int k = 0 ; k < 4 ; k++) {
			float out_put = 0;
			out_put = active_func(out_sum(S[k], weight));
			
			for(int l = 0 ; l < 3 ; l++) {
				weight[l] = weight[l] + (float)0.2 * (S[k][3] - out_put) * S[k][l];
			}
			System.out.println("result : "+ (int)out_put);
		}
		
		System.out.println();
		for(int o = 0 ; o < weight.length ; o++) {
			System.out.println("weight "+o+" : "+(int) weight[o]);
		}
	}
	
	public static float out_sum(int []values, float[] weight) {
		float result = 0;
		for(int i = 0 ; i < 3 ; i ++) {
			result += values[i] * weight[i];
		}
		return result;
	}
	
	public static float active_func(float result) {
		if(result > 0) return 1;
		else return 0;
	}	
}

	