package nrcm;

public class day3_5 {

	public static void main(String[] args) {
		/*int min=a[0];
		for (int x:a) {
			System.out.println(x);
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			System.out.println(min);
		}*/
		int a[]= {12,13,12,14,15,13};
		int a1[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				a1[index++]=a[i];
			}
			}
		System.out.println("No repeated: ");
		for(int i=0;i<index;i++) {
			System.out.print(a1[i] +" ");
		}
	}
	}
