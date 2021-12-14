import java.util.Random;

public class BinarySearchTree<Integer>
{
   private BinaryNode root;
   //static int[] array;
   
   public BinarySearchTree()
   {
      root = null;
   }
   
   public BinaryNode<Integer> getRoot()
   {
      return root;
   }
   
   public int height(BinaryNode n)
   {
   
      if (n == null) 
      {
        return -1;
      }

      int leftHeight = height(n.left);
      int rightHeight = height(n.right);

      if (leftHeight > rightHeight) 
      {
        return leftHeight + 1;
      } 
      
      else 
      {
        return rightHeight + 1;
      }
   }
     
   public BinaryNode<Integer> insert(int x, BinaryNode<Integer> t)
   {
      if(t == null)
      {
         return new BinaryNode<Integer>(x,0,null,null);
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
   } 
   
   public BinaryNode<Integer> remove(int x, BinaryNode<Integer> t)
   {
      //BinaryNode<Integer> localRoot = getRoot();
      
      if(t == null) 
      {
         return t;
      }   
      
      int compareResult = x - t.data;
      //{t.left);
      if (compareResult < 0)  
      {
         t.left = remove(x,t.left);
      }   
         
      else if(compareResult > 0)
      {
         t.right = remove(x,t.right);
      }
      
      else if (t.left != null && t.right != null) 
      {  
         t.data = findMin(t.right).data;  
         t.right = remove(t.data,t.right);
      }
      
      else if(t.left != null && t.right == null)
      {
         
         t.data = findMax(t.left).data;
         t.left = remove(t.data, t.left);
      }
      
      else
      {
         
         t = (t.left != null) ? t.left : t.right;
      }
      
      /*System.out.println("X: " + x);
      if(t != null)
      {
         System.out.println("t.right " + t.right);
         System.out.println("t.left: " + t.left);
      }*/   
         
      
      /*if(x == root.data)
      {
      
         root = t;
      }*/
      
      return t;
   }
   
    public BinaryNode<Integer> findMin(BinaryNode<Integer> t)
   {
      if (t == null)
      {  
         return null;
      }
      else if (t.left == null)
      {
         return t; //foundtheleftmostnode
      }
      else
      {
         return findMin(t.left);
      }
   }
   
   public BinaryNode<Integer> findMax(BinaryNode<Integer> t)
   {
      if(t != null)
      {
         while (t.right != null) 
         {  
            t =t.right;
         }
      }
      return t;
   }
   
   
   public static void main(String[] args)
   {
         System.out.println("Start here.");
         //const MAX_NODES = 32; random variable between 1 and 32 nodes
         int i = 0;
         
         
         BinarySearchTree tr = new BinarySearchTree();
         Random nodeGenerator = new Random();
         int low = 10;
         //int high = 100;
         int randomNumber = nodeGenerator.nextInt(90) + low;
  
         //int randomNumber = nodeGenerator.nextInt(99);
         BinaryNode node50 = new BinaryNode(randomNumber,0, null, null);
         tr.root = node50;
         
         
         TreePrinter tp = new TreePrinter(tr);
         
         for(i = 0; i < 1000; i++)//fill the tree
         {

            randomNumber = nodeGenerator.nextInt(90) + low;
            //array[i] = randomNumber;
            tr.insert(randomNumber, node50);
            
            //tp.print("My Tree");
            
         }
         
         for(i = 32; i > 1000; i--)
         {
            //x = tr.getRoot();
            System.out.println("Node 50 data: " + node50.data);
            //System.out.println("");
            tr.remove(node50.data, tr.getRoot());
            //tp.print("Remove Root");
         }
         
   
    }   
}
