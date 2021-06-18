package menu.mainmenu;

import android.content.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.util.*;
import android.view.*;
import android.widget.*;

public class CustomDrawable
{
	public static Drawable createRounded(float border,int insideColor,int strokeColor,int strokeSize)
	{
		GradientDrawable shape = new GradientDrawable();
		shape.setShape(GradientDrawable.RECTANGLE);
		shape.setCornerRadii(new float[] { border, border, border, border, border, border, border, border });
		shape.setColor(insideColor);
		shape.setStroke(strokeSize, strokeColor);
		shape.setDither(true);
		return shape;
	}
}
