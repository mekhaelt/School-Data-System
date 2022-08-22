public enum Level
{
	C,
	M,
	U,
	O;
	
	private String getLvlName()
	{
		if(this==O)
			return "OPEN";
		if(this==M)
			return "MIXED";
		if(this==U)
			return "UNIVERSITY";
		if(this==C)
			return "COLLEGE";
		return "UNIVERSITY";
	}
}


