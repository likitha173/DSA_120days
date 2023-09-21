public class ArraysByReference {
    public static void update(int marks[], int unchangable){
        unchangable = 10;

        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {95, 77, 92};
        int unchangable = 5;

        update(marks, unchangable);

        System.out.println(unchangable);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
