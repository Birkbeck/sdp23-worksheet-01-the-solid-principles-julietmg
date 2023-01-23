import java.util.List;

public class BoardDisplay {

    public static String formattedRow(List<String> row) {
        return row.get(0) + " | " + row.get(1) + " | " + row.get(2);
    }

    public static void display(Board board) {
        
        String formattedFirstRow = formattedRow(board.firstRow());
        String formattedSecondRow = formattedRow(board.secondRow());
        String formattedThirdRow = formattedRow(board.thirdRow());
        
        System.out.print(formattedFirstRow + "\n" + formattedSecondRow + "\n" + formattedThirdRow);
    }
    
}
