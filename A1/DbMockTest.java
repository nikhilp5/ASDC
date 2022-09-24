import java.util.HashMap;

public class DbMockTest {
	
	DbDetails dbMockTest=new DbMock();
	
	public void retrieveDataFromDbTest(){
		HashMap<String,String> emptyData=dbMockTest.retrieveDataFromDb("");
		if(emptyData.size()==0) {
			emptyData=dbMockTest.retrieveDataFromDb("monster");
			if(emptyData.size()!=0) {
				emptyData=dbMockTest.retrieveDataFromDb("weapon");{
					if(emptyData.size()!=0) {
						System.out.println("retrieveDataFromDbTest-PASS");
					}
					else {
						System.out.println("retrieveDataFromDbTest-FAIL");
					}
				}
			}
			else {
				System.out.println("retrieveDataFromDbTest-FAIL");
			}
		}
		else {
			System.out.println("retrieveDataFromDbTest-FAIL");
		}
	}
	
}
