public class StartsWithProblem {

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

    // Search in trie
    public static boolean startsWith(String prefix){  //O(L)
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        
        String prefix = "app";
        String prefix2 = "moon";

        System.out.println(startsWith(prefix));
        System.out.println(startsWith(prefix2));
    }    
}
