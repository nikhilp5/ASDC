import java.util.LinkedHashMap;

public class DbMock implements DbDetails{

	public LinkedHashMap<String,String> retrieveDataFromDb(String resultType){
		//Retrieving result for monsters,weapons,etc from db 
		LinkedHashMap<String,String> result=new LinkedHashMap<String, String>();
		switch (resultType) {
		case "monster":
			result.put("10", "Goblin");
			result.put("20", "Cyclops");
			result.put("30", "Witch");
			result.put("40", "Centaur");
			result.put("50", "King Dragon");
			break;
		case "weapon":
			result.put("10","Wooden Sword");
			result.put("20","Iron Sword");
			result.put("30","Diamond sword");
			result.put("40","Possessed Gauntlet");
			result.put("50","Blades of Chaos");
			break;
		case "floor":
			result.put("1", "Floor 1");
			result.put("2", "Floor 2");
			result.put("3", "Floor 3");
			result.put("4", "Floor 4");
			result.put("5", "Floor 5");
			break;
		default:
			break;
		}
		return result;
	}
	
}
