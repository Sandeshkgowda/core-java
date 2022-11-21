class Even{
	public static void main(String[] arg){
		int even[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=even.length;i++){
			if(even[i]%2 == 0){
				System.out.println(even[i] + "even");
			}
			else{
				System.out.println(even[i] + "odd");
			}
		}
	}

}