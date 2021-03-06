package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.Question.LCA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
       //root level 0
       Node A = Node.createNode(100);
       //Level 1
       Node B = Node.createNode(50);
       Node C = Node.createNode(150);
       //Level 2
       Node D = Node.createNode(25);
       Node E = Node.createNode(75);
       Node F = Node.createNode(125);
       Node G = Node.createNode(175);
       //Level 3
       Node H = Node.createNode(120);
       Node I = Node.createNode(140);
       Node J = Node.createNode(160);
       Node K = Node.createNode(190);
             
       //connect Level 0 and 1
       A.left = B;
       A.right = C;
       //connect level 1 and level 2
       B.left = D;
       B.right = E;
       C.left = F;
       C.right = G;
       //Connect level 2 and level 3
       F.left = H;
       F.right = I;
       G.left = J;
       G.right = K;
         
       Node ancestor = LCA.lca(A, J, K);
       System.out.printf("Ancestor of %d and %d is %d\n",J.data,K.data,ancestor.data);
       
       ancestor = LCA.lca(A, J, G);
       System.out.printf("Ancestor of %d and %d is %d\n",J.data,G.data,ancestor.data);
       
       ancestor = LCA.lca(A, E, G);
       System.out.printf("Ancestor of %d and %d is %d\n",E.data,G.data,ancestor.data);
    }
}

