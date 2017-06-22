package nuc.sw.zd.a9;

//线性：数组  vector  stack 
//树形
//图

//递归定义法
class BiTree{
	private int v;
	private BiTree left;
	private BiTree right;
	
	public BiTree(int x){
		v=x;
	}
	public void add(BiTree the){
		if(the.v<this.v){
			if(left==null)
				left=the;
			else
				left.add(the);
		}
		else{
			if(right==null)
				right=the;
			else
				right.add(the);
		}
	}
	
	//中序遍历
	public void mid_trav(){
		if(left!=null){
		    left.mid_trav();
		}
		System.out.println(v);
		if(right!=null){
			right.mid_trav();
		}
	}
	
}
public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二叉树  左子树 右子树
		BiTree root=new BiTree(100);
		root.add(new BiTree(50));
		root.add(new BiTree(80));
		root.add(new BiTree(40));
		root.mid_trav();
	}

}
