public class snapCheckIntership {

    public static void main(String[] arg){
        String a = "if man was meant to stay on the ground god would have given us roots";
        String b = encrytion(a);
        System.out.println(b);
    }

    //encryption Method
    public static String encrytion(String input){
        //remove spaces
        String noSpaces = spaceRemover(input);
        //get grid size length from sqrt
        double sqrt = sqrt((double)noSpaces.length());
        int row = (int) Math.floor(sqrt);
        int column = (int) Math.ceil(sqrt);
        int stringCounter = 0;
        if (row * column < noSpaces.length()){
            row = column;
        }
        //create grid
        char [][] grid = new char[row][column];

        // convert the string and place into grid
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if(stringCounter < noSpaces.length()) {
                    grid[i][j] = noSpaces.charAt(stringCounter);
                }
                stringCounter++;
            }
        }

        //create new return string by going down the column first
        String encrypted = "";
        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                if (grid[j][i] == 0){
                    break;
                }
                encrypted = encrypted + grid[j][i];
            }
            //add a space per instructions
            encrypted = encrypted + " ";
        }
        return encrypted;
    }

    //returns the string without spaces
    public static String spaceRemover(String input){
        String output = input.replaceAll("\\s", "");
        return output;
    }

    //finds sqrt
    public static double sqrt(double num){
        return Math.sqrt(num);
    }

}
