package data;

public enum Locators {
	
	COMPOSE_NEW_MAIL("T-I-KE"),
	SEND_EMAIL("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"),
	EMAIL("//span[@email='zekov.roman78@gmail.com']"),
	BODY("//span[@class='y2']"),
	RECEIVER_INPUT("//textarea[@aria-label='Кому']"),
	SUBJECT_INPUT("aoT"),
	BODY_INPUT("//div[@aria-label='Тело письма']");
	
	
	
	private final String value;
	
	Locators (String value) {
        
		this.value = value;
        
    }
	
	public String getValue() { return value; }


}
