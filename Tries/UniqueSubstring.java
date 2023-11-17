public class UniqueSubstring {

    //Creating Trie
    public static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    //Insertion Node in Trie
    public static void insert(String word){ // O(L), L = length of word
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } 
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        //suffix
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println("Total unique substring of a string: " + countNodes(root));
    }    
}