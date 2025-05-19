package unit4;
public class Unit4 {
 public static void main(String[] args) {
 Tree intTree = new Tree();
 intTree.insert(25);
 intTree.insert(20);
 intTree.insert(15);
 intTree.insert(27);
 intTree.insert(30);
 intTree.insert(29);
 intTree.insert(26);
 intTree.insert(22);
 intTree.insert(32);
 intTree.insert(17);
 intTree.traverseInOrder();
 System.out.println();
 System.out.println(intTree.get(27));
 System.out.println(intTree.get(17));
 System.out.println(intTree.get(8888));
 System.out.println(intTree.min());
 System.out.println(intTree.max());
 }
}

 public int min() {
 if (leftChild == null) {
 return data;
 }
 else {
 return leftChild.min();
 }
 }
 public int max() {
 if (rightChild == null) {
 return data;
 }
 else {
 return rightChild.max();
 }
 }
 public void traverseInOrder() {
 if (leftChild != null) {
 leftChild.traverseInOrder();
 }
 System.out.print(data + ", ");
 if (rightChild != null) {
 rightChild.traverseInOrder();
 }
 }
 public int getData() {
 return data;
 }
 public void setData(int data) {
 this.data = data;
 }
 public TreeNode getLeftChild() {
 return leftChild;
 }
 public void setLeftChild(TreeNode leftChild) {
 this.leftChild = leftChild;
 }
 public TreeNode getRightChild() {
 return rightChild;
 }
 public void setRightChild(TreeNode rightChild) {
 this.rightChild = rightChild;
 }
 
public String toString() {
 return "Data = " + data;
 }
}

