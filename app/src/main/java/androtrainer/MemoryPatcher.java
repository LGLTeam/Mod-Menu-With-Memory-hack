package androtrainer;

public class MemoryPatcher
{
	
	static{
		Natives.load();
	}
	
	protected static native boolean libPatchC(String libName, String hex, long offset);

	public static boolean nativePatch(String libname, String hex, long offset)
	{
		return libPatchC(libname,hex,offset);
	}
}
