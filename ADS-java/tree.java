package unit4;
public class tree {
    private TreeNode root;
 public void insert(int value) {
 if (root == null) {
 root = new TreeNode(value);
 }
 else {
 root.insert(value);
 }
 }
 public TreeNode get(int value) {
 if (root != null) {
 return root.get(value);
 }
 return null;
 }
 public int min() {
 if (root == null) {
 return Integer.MIN_VALUE;
 }
 else {
 return root.min();
 }
 }
 public int max() {
 if (root == null) {
 return Integer.MAX_VALUE;
 }
 else {
 return root.max();
 }
 }
 public void traverseInOrder() {
 if (root != null) {
 root.traverseInOrder();
 }
 }
}
