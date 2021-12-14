public class BinaryNode<Integer> //extends java.lang.Object
{
   int data; // holds the key
   int h;
	//BinaryNode parent; // pointer to the parent
	BinaryNode left; // pointer to left child
	BinaryNode right; // pointer to right child
   
   public BinaryNode(int data, int h, BinaryNode l, BinaryNode r) 
   {
		this.data = data;
      this.h = h;
		//this.parent = null;
		this.left = l;
		this.right = r;
	}
   
   /*public BinaryNode<Integer> insert(int x, BinaryNode<Integer> t)
   {
      if(t == null)
      {
         return new BinaryNode<Integer>(x,null,null);
      }
      
      int compareResult = x - t.data;
      // Find the insertionpoint.
      if (compareResult <0)  
      {
         t.left =insert(x,t.left);
      }
         
      else if(compareResult> 0)
      {
         t.right = insert(x,t.right);
      }
      
      else
      {
         // Duplicate: donothing.
      }
      
      return t;
   } */
   
   //public void setHeight(int hright, int hleft) 
   //{
      //return t == null ? -1 : 1 + Math.max(height(t.left), height(t.right));
   //}
}