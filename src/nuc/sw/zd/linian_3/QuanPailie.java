package nuc.sw.zd.linian_3;

public class QuanPailie {
	public static int arr[]=new int[]{1,2,3};
	
	public static void main(String[] args) {
		perm(arr,0,arr.length-1);
	}

	private static void perm(int[] arr, int begin, int end) {
		if(end==begin){//一到递归出口就输出数组  此数组为全排列
			for(int i=0;i<=end;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		else{
			for(int j=begin;j<=end;j++){
				swap(begin,j);//for循环将begin-end中的每一个数放到begin位置
				perm(arr,begin+1,end);//假设begin位置确定，那么对begin+1-end中对数进行递归
				swap(begin,j);//换过去后还原
			}
		}
	}

	private static void swap(int from, int to) {
		int tmp=arr[to];
		arr[to]=arr[from];
		arr[from]=tmp;
	}
	

}
