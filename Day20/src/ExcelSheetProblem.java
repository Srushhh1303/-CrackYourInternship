public class ExcelSheetProblem {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust columnNumber to 0-based index
            int remainder = columnNumber % 26;
            char currentChar = (char) (remainder + 'A');
            columnTitle.append(currentChar);
            columnNumber /= 26;
        }

        return columnTitle.reverse().toString();
    }
    public static void main(String args[]){

    }
}
