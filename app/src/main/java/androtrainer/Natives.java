package androtrainer;

public class Natives
{
	protected static boolean loaded=false;
	public static void load()
	{ // load shared library
		if (!loaded)
		{
			try
			{
				System.loadLibrary("fuegoteam");
			}
			catch (Exception ex)
			{
				android.util.Log.e("Cannot load shared library for your trainer", ex.toString());
				System.exit(0);
			}
			loaded = true;
		}
	}
}



