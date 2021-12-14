import java.lang.Object;
//import Random

public class AVLTree extends BinarySearchTree
{     
   private BinaryNode root;
   public BinaryNode k1;
   public BinaryNode k2;
 
   public AVLTree()
   {
      root = null;
      
   }
   
   public BinaryNode<Integer> getRoot()
   {
      return root;
   }
    
   /*public int height(BinaryNode n)
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
   }*/
   
    public int height( BinaryNode t )
    {
        return t == null ? -1 : t.h;
    }
   
   /*public int height(BinaryNode N) { 
        if (N == null) 
            return 0; 
  
        return N.height; 
    }*/
   
   public BinaryNode insert(int data, BinaryNode node)
   {
      return balance(super.insert(data, node));
   }
   
      public BinaryNode remove(int data, BinaryNode node)
   {
      return balance(super.remove(data, node));
   }
   
   /*public int height(BinaryNode t) 
   {
      return t == null ? -1 : 1 + Math.max(height(t.left), height(t.right));
   }*/
   
   /*public int height(BinaryNode N) 
   { 
        if (N == null) 
            return 0; 
  
        return 1;//N.height; 
    } */
   
   
  
   /*public  BinaryNode balance(BinaryNode node)
   {
      //if(node.left != null && node.right != null && node.left.left != null && node.left.right != null)
      //{
         if(height(node.left) - height(node.right) < 1 && (node.left != null) && (node.right != null))//
         {  
            if(height(node.left.left) >= height(node.left.right)) //&& node.left.left != null && node.left.right != null) 
            {  
               node = singleRightRotation(node);
            }
            
            else
            {
               node = doubleLeftRightRotation(node);
            }
         }
           
         else if((height(node.right) - height(node.left)) > 1 && (node.left != null) && (node.right != null))
         {   
            if(height(node.right.right) >= height(node.right.left)) 
            {  
               node = singleLeftRotation(node);
            }
            
            else
            {
               node = doubleRightLeftRotation(node);
            }
         }
         
      
      //}
      //else
      //{
      
      //}
      return node;
   }*/
   
    //private static final int ALLOWED_IMBALANCE = 1;
    
    // Assume t is either balanced or within one of being balanced
    
    public BinaryNode balance( BinaryNode t )
    {
      //System.out.println("Entered balance");
        if( t == null )
            return t;
            
        if( height( t.left ) - height( t.right ) > 1 )
            if( height( t.left.left ) >= height( t.left.right ) )
            {
                t = singleRightRotation( t );
                //System.out.println();
            }    
            else
                t = doubleLeftRightRotation( t );
        
        else 
        if( height( t.right ) - height( t.left ) > 1 )
            if( height( t.right.right ) >= height( t.right.left ) )
                t = singleLeftRotation( t );
            else
                t = doubleRightLeftRotation( t );//double with left child

        t.h = Math.max( height( t.left ), height( t.right ) ) + 1;
        //System.out.println("Height: " + t.h);
        //System.out.println("Node: " + t.data);
        return t;
    }
   
   
   public BinaryNode singleRightRotation(BinaryNode k2)
   {
      BinaryNode  k1 = k2.left; 
            /*System.out.println("Single left" );
      System.out.println("K2" + k2.data);
      System.out.println("K1.right " + k1.right);
      System.out.println("k2.left "+ k2.left);
      System.out.println("K1 " + k1);
      System.out.println("K2" + k2);
      System.out.println("K1.right " + k1.right);
      System.out.println("k2.left "+ k2.left);*/
      k2.left = k1.right;  
       
      k1.right = k2;
      k2.h = (Math.max(height(k2.left), height(k2.right)) + 1); 
      k1.h = (Math.max(height(k1.left), k2.h) + 1);
      //height(k2) = (Math.max(height(k2.left),  height(k2.right)) + 1);  
      //k1.setHeight(Math.max(height(k1.left),  k2.getHeight()) +1);
      System.out.println("Case 1: Single right rotation " + k1.data);
      return k1;
   }
   
   
   public BinaryNode singleLeftRotation(BinaryNode k1)
   {
      BinaryNode  k2 = k1.right;
      /*System.out.println("single right");
      System.out.println("K2" + k2);
      System.out.println("K1.right " + k1.right);
      System.out.println("k2.left "+ k2.left);
      System.out.println("K1 " + k1);
      System.out.println("K2" + k2);
      System.out.println("K1.right " + k1.right);
      System.out.println("k2.left "+ k2.left); */
        
      k1.right = k2.left;   
      k2.left = k1;
      k1.h = Math.max(height(k1.left), height(k1.right)) + 1;
      k2.h = Math.max(height(k2.right),  k1.h) +1;
      System.out.println("Case 4: Single left rotation " + k2.data);
      return k2;
   }
  
   public BinaryNode doubleLeftRightRotation(BinaryNode k3)//double with left child
   {
      k3.left = singleLeftRotation(k3.left);
      System.out.println("Case 2: Double left right rotation " + k3.data);
      return singleRightRotation(k3);
   }  
   
   private BinaryNode doubleRightLeftRotation(BinaryNode k1)
   {
      k1.right = singleRightRotation(k1.right);
      System.out.println("Case 3: Double right left rotation " + k1.data);
      return singleLeftRotation(k1);
   }
   
   public static void main(String[] args)
   {
         System.out.println("Start here.");
         //const MAX_NODES = 32; random variable between 1 and 32 nodes
         int i = 0;
         
         
         AVLTree tr = new AVLTree();
         Random nodeGenerator = new Random();
         int low = 10;
         //int high = 100;
         int randomNumber = nodeGenerator.nextInt(90) + low;
 
         BinaryNode node1 = new BinaryNode(randomNumber,0, null, null);
         tr.root = node1;
         
         TreePrinter tp = new TreePrinter(tr);
         
         for(i = 0; i < 35; i++)//fill the tree
         {

            randomNumber = nodeGenerator.nextInt(90) + low;
            //BinaryNode node = new BinaryNode (randomNumber, h.node(), null, null);
            tr.insert(randomNumber, node1);
            if(i > 3)
            {
               tr.balance(node1);
            }   
            tp.print("My Tree");

         }
         
         for(i = 0; i < 35; i++)
         {
            tr.remove(node1.data, tr.getRoot());
            tr.balance(tr.getRoot());
            tp.print("Remove Root");
         }

    }    
    
    
} 