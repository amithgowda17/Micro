package things;

import dto.FacebookDto;

public class FacebookThings {
	
	public void save(int id,String name) {
		FacebookDto dto = new FacebookDto();
		
		
		dto.setId(id);
		dto.setName(name);
		
		
		dto.getId();
		dto.getName();
	}

}
