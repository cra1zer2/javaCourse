public class Main {
    public static void main(String[] args) {
//        String[] fruits = {"apple", "banana", "peach"};
//        String[] colors = {"red", "green", "blue"};
//        String[] vegetables = {"cucumber", "potato"};
//
//        String[][] groceries = {fruits, colors, vegetables};
//        // or the same:
//        String[][] groceries2 = {
//                {"apple", "banana", "peach"},
//                {"red", "green", "blue"},
//                {"cucumber", "potato"}
//
//        };
//        // to change value:
//        //by id - row 1, column 0
//        groceries2[2][0] = "coconut";
//
//
//        for(String[] foods : groceries2){
//            for(String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
