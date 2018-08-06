package project;

public class Verify_Excel {

	public static void main(String[] args) {
		Act_Excelsheet.readExeel("C:\\Users\\pc\\Desktop\\TestSheet.xlsx");
		System.out.println(Act_Excelsheet.getData(1, 0, 1));
		System.out.println(Act_Excelsheet.getData(1, 1, 0));
		System.out.println(Act_Excelsheet.getRow(1));
		System.out.println(Act_Excelsheet.getColumn(1));
	}

}
