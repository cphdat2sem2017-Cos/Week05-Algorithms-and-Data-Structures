public class BinarySearchTree
{

    protected BinaryTreeNode root;

    //== Constructors ====================================

    public BinarySearchTree()
    {
        root = null;
    }

    public BinarySearchTree(Comparable element)
    {
        root = new BinaryTreeNode(element);
    }

    //== General methods ==================================

    public void removeAllElements()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return (root == null);
    }

    public Comparable getRootElement()
    {
        return (Comparable) root.element;
    }
 
    //====== Traverse =====================================

    public String inorderTraversal()
    {
        String s = new String();
        s = inorderTraverse(root, s);
        return s;
    }

    private String inorderTraverse(BinaryTreeNode n, String s)
    {
        if (n != null)
        {
            
            s = inorderTraverse(n.left, s);
            s += n.element + " ";
            s = inorderTraverse(n.right, s);
        }
        return s;
    }
  
    //====== AddElement - iterative solution ===========================

    public void addElement(Comparable element)
    {
        if (root == null)      
            root = new BinaryTreeNode(element);
        else
        {
            BinaryTreeNode n = root;
            boolean stillSearching = true;
            while (stillSearching)
            {
                if (element.compareTo(n.element) < 0)               
                    if (n.left == null)
                    {
                        n.left = new BinaryTreeNode(element);
                        stillSearching = false;
                    } else
                        n = n.left;
                else
                    if (n.right == null)
                    {
                        n.right = new BinaryTreeNode(element);
                        stillSearching = false;
                    } else                   
                        n = n.right;                                 
            }
        }
    }

//==  Node class ================================================

    private class BinaryTreeNode
    {

        protected Comparable element;
        protected BinaryTreeNode left, right;

        BinaryTreeNode(Comparable obj)
        {
            element = obj;
            left = null;
            right = null;
        }
    }
}
