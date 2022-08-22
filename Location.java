public enum Location
{
	RM01,
	RM02;

	private String getLocationName()
	{
		if(this==RM01)
			return "ROOM 01";
		if(this==RM02)
			return "ROOM 02";
		return "ROOM 1";
	}
}
