
class Pattern {
	public static void main(String args[]){
		char ch='A';
		int i,j,k,l;
		for(i=0;i<7;i++){
			ch='A';
			for(j=0;j<7-i;j++,ch++){
				System.out.print(ch);
			}
			l=0;
			ch--;
			if(i==0){
			ch--;
			l=1;
			}
			for(k=0;k<2*i-1;k++)
				System.out.print(" ");
			for(;l<7-i;l++){
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}
}

