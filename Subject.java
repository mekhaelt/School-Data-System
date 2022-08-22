public enum Subject
{
	TECHNOLOGY,
	BUSINESS,
	MUSIC,
	MATH,
	COMPUTER_STUDIES;
	
	public String getLvlName()
	{
		if(this==MATH)
			return "MATH";
		if(this==BUSINESS)
			return "BUSINESS";
		if(this==MUSIC)
			return "MUSIC";
		if(this==COMPUTER_STUDIES)
			return "COMPUTER_STUDIES";
		if(this==TECHNOLOGY)
			return "TECHNOLOGY";		
		return "MATH";
	}
	
	public String getPrefix()
	{
		if(this==MATH)
			return "MAT";
		if(this==BUSINESS)
			return "BUS";
		if(this==MUSIC)
			return "MUS";
		if(this==COMPUTER_STUDIES)
			return "SOM";
		if(this==TECHNOLOGY)
			return "TEC";		
		return "MAT";
	}
}
