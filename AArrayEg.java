class AArrayEg {
	public static void main(String args[]){
		int sum=0;
		int[] sum_array=new int[10];
		for(int x=0;x<10;x++){
			sum=sum+x;
			sum_array[x]=sum;
		}
		for(int y=0;y<=10;y++){
			System.out.println(sum_array[y]);
			}
	}
}