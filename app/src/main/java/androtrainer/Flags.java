package androtrainer;

public class Flags
{
	public static final int DOUBLE=0;
	public static final int DWORD=1;
	public static final int FLOAT=2;
	public static final int QWORD=3;
	public static final int UTF_8=4;
	public static final int WORD=5;
	public static final int BYTE=6;
	
	protected static final String[] formated=
	{
		"DOUBLE",
		"DWORD",
		"FLOAT",
		"UTF_8",
		"WORD",
		"BYTE",
	};
	public static String formatToString(int flag)
	{
		if ( flag < 0 || flag >= formated.length)
			return "UNKNOWN";
		return formated[flag];
	};
}
