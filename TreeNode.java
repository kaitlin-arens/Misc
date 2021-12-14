public class TreeNode
{
   int data; // holds the key
	TreeNode left; // pointer to left child
	TreeNode right; // pointer to right child
   
   public TreeNode(int data) 
   {
		this.data = data;
		this.left = null;
		this.right = null;
	}
   
   /*public void sampleTree()
   {
      TreeNode node50 = new TreeNode(50);
      TreeNode node30 = new TreeNode(30);
      TreeNode node70 = new TreeNode(70);
   
      node50.left = node30;
		node50.right = node70;
   }*/
   
   public static Integer last_printed = null;
   
   public static boolean checkBST(TreeNode n)
   {
      if(n == null)
      {
         return true;
      }
      
      else if(!checkBST(n.left))
      {
         return false;
      }
      
      else if((last_printed != null) && (n.data <= last_printed))
      {
         return false;
      }
      
      else if(!checkBST(n.right))
      {
         return false;
      }
      
      else
      {
         return true;
      }
   
   }
   
   public static void main(String[] args)
   {
      TreeNode node50 = new TreeNode(50);
      TreeNode node30 = new TreeNode(30);
      TreeNode node70 = new TreeNode(70);
      
      node50.left = node30;
		node50.right = node70;
      
      checkBST(node50);
   }
      
}
