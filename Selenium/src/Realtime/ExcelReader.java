package Realtime;

public class ExcelReader {

	public static void main(String[] args) {
		ReadData rd=new ReadData("C:\\Users\\pc\\Desktop\\TestSheet.xlsx");
System.out.println(rd.getData(0, 0, 0));
System.out.println(rd.RowCount(0));
System.out.println(rd.cellCount(0));
	}
}
