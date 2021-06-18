package menu.mainmenu;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import java.io.*;


public class Menu
{

	protected int WIDTH,HEIGHT;





	protected Context context;
	protected boolean isIconVisible;
	protected boolean isMenuVisible;
	protected ImageView iconView,closeView;
	protected FrameLayout parentBox;
	protected LinearLayout menulayout;  
	protected ScrollView scrollItems;    

	protected TextView cred;

	protected WindowManager wmManager;
	protected WindowManager.LayoutParams wmParams;
	protected LinearLayout headerLayout;

	protected LinearLayout childOfScroll;
	protected LinearLayout infos;

	public abstract interface SwitchMethod
	{
		abstract boolean run(boolean state);
	}
	
	public void addSwitch(String p0, final Object run)
	{
		TextView tv = new TextView(context);

		final Drawable of=CustomDrawable.createRounded(0, Color.TRANSPARENT, Color.TRANSPARENT, 5),on=CustomDrawable.createRounded(0, Color.TRANSPARENT, Color.TRANSPARENT, 5);
		tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, dpi(20));
		tv.setText(p0);
		tv.setTextColor(Color.RED);
		tv.setGravity(Gravity.CENTER);
		tv.setPadding(dpi(1), dpi(1), dpi(1), dpi(1));
		getChildOfScroll().addView(tv);
		LinearLayout.LayoutParams lp=(LinearLayout.LayoutParams)tv.getLayoutParams();
		lp.setMargins(dpi(1), dpi(1), dpi(1), dpi(1));
		tv.setLayoutParams(lp);
		tv.setBackground(of);
		tv.setOnClickListener(new View.OnClickListener()
			{
				protected boolean state=false;
				@Override
				public void onClick(View p1)
				{

					TextView tv=(TextView)p1;

					ObjectAnimator y=new ObjectAnimator();
					float[] b ={0,(!state ?5: -5),(!state ?5: -5),0};
					




					state = !state;
					state=((SwitchMethod)run).run(state);
					if (state)
					{   			    
						tv.setBackground(on);
						tv.setTextColor(Color.GREEN);
					}
					else
					{
						tv.setBackground(of);
						tv.setTextColor(Color.RED);
					}
				}


			});
	}
	

	public LinearLayout getInfosLayout()
	{
		return infos;
	}


	public LinearLayout getChildOfScroll()
	{
		return childOfScroll;
	}

	public LinearLayout getHeaderLayout()
	{
		return headerLayout;
	}





	public LinearLayout getMenuLayout()
	{
		return menulayout;
	}



	public ScrollView getScrollView()
	{
		return scrollItems;
	}

	protected void init(Context context)
	{
		this.context = context;
		isIconVisible = false;
		isMenuVisible = false;
		iconView = new ImageView(context);
		closeView = new ImageView(context);
		cred = new TextView(context);

		parentBox = new FrameLayout(context);

		parentBox.setOnTouchListener(handleMotionTouch);
		wmManager = ((Activity)context).getWindowManager();
		int aditionalFlags=0;
		if (Build.VERSION.SDK_INT >= 11)
			aditionalFlags = WindowManager.LayoutParams.FLAG_SPLIT_TOUCH;
		if (Build.VERSION.SDK_INT >=  3)
			aditionalFlags = aditionalFlags | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM;
		wmParams = new WindowManager.LayoutParams(
			WindowManager.LayoutParams.WRAP_CONTENT,
			WindowManager.LayoutParams.WRAP_CONTENT,
			100,//initialX
			100,//initialy
			WindowManager.LayoutParams.TYPE_APPLICATION,
			WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE |
			WindowManager.LayoutParams.FLAG_LAYOUT_IN_OVERSCAN |
			WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN |
			aditionalFlags,
			PixelFormat.TRANSPARENT
		);
		wmParams.gravity = Gravity.TOP | Gravity.LEFT;
	}

	public void setIconImage(String assetPath, String closeButtonassetpath)
	{
		Bitmap bitmap = null,bitmap2 = null;
		AssetManager assetManager = context.getAssets();
		InputStream istr = null;
		try
		{
			istr = assetManager.open(assetPath);
			bitmap = BitmapFactory.decodeStream(istr);

			istr = assetManager.open(closeButtonassetpath);
			bitmap2 = BitmapFactory.decodeStream(istr);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			iconView.setImageBitmap(bitmap);
			iconView.setPadding(dpi(10), dpi(10), 0, 0);
		
		}
	}
	public void setWidth(int px)
	{
		FrameLayout.LayoutParams lp=(FrameLayout.LayoutParams)menulayout.getLayoutParams();
		lp.width = px;
		menulayout.setLayoutParams(lp);
		WIDTH=px;
	}
	
	public void setHeight(int px)
	{
		FrameLayout.LayoutParams lp=(FrameLayout.LayoutParams)menulayout.getLayoutParams();
		lp.height = px;
		menulayout.setLayoutParams(lp);
		HEIGHT=px;
	}
	public int getWidth(int px)
	{
		return WIDTH;
	}

	public int getHeight(int px)
	{
		return HEIGHT;
	}
	public void setTitle(String text)
	{
		cred.setText(text);
	}
	public TextView getTitleTextView()
	{
		return cred;
	}
	
	
	
	public void showIcon()
	{
		if (!isIconVisible)
		{
			isMenuVisible = false;
			parentBox.removeAllViews();
			parentBox.addView(iconView, dpi(70),dpi(70));
			parentBox.addView(closeView,dpi(30),dpi(30));
			isIconVisible = true;
		}
	}
	public void showMenu()
	{
		if (!isMenuVisible)
		{
			isIconVisible = false;
			parentBox.removeAllViews();
			parentBox.addView(menulayout, WIDTH, HEIGHT);
			isMenuVisible = true;
		}
	}
	public int dpi(float dp)
	{
		float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dp * scale + 0.5f);
	}
	public Menu(Context context)
	{
		init(context);

		WIDTH = dpi(180);
		HEIGHT = dpi(60);


		menulayout = new LinearLayout(context);
		menulayout.setOrientation(LinearLayout.VERTICAL);
		{//header
			headerLayout = new LinearLayout(context);

			menulayout.addView(headerLayout, -1, -2);
			///////////MENU BG COLOR
			menulayout.setBackgroundColor(Color.TRANSPARENT);
			{
				ImageView minimize=new ImageView(context);
				InputStream istr=null;
				Bitmap bitmap=null;
				AssetManager assetManager = context.getAssets();
				try
				{
					istr = assetManager.open("minimize.png");
					bitmap = BitmapFactory.decodeStream(istr);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
					minimize.setImageBitmap(bitmap);

				}
				cred.setTextColor(Color.WHITE);
				cred.setTextSize(25);
				cred.getPaint().setElegantTextHeight(true);
				cred.setGravity(Gravity.CENTER_HORIZONTAL);

				{
					infos = new LinearLayout(context);
					infos.setOrientation(LinearLayout.VERTICAL);
					infos.addView(cred, -1, -1);
					headerLayout.addView(infos, -1, -2);
					LinearLayout.LayoutParams mnp=(LinearLayout.LayoutParams)infos.getLayoutParams();
					mnp.weight = 5;
					mnp.gravity = Gravity.CENTER;
					infos.setLayoutParams(mnp);
				}
				headerLayout.addView(minimize, dpi(30),dpi(30));
				{
					LinearLayout.LayoutParams mnp=(LinearLayout.LayoutParams)minimize.getLayoutParams();
					mnp.weight = 0;
					mnp.gravity = Gravity.RIGHT;
					minimize.setLayoutParams(mnp);
					minimize.setPadding(0, dpi(4), dpi(4), dpi(4));
					minimize.setOnClickListener(new View.OnClickListener(){

							@Override
							public void onClick(View p1)
							{
								showIcon();
							}


						}); 

				}

				
				{

					closeView.setOnClickListener(new View.OnClickListener(){

							@Override
							public void onClick(View p1)
							{
							}


						}); 

				}

			}
		}
		scrollItems = new ScrollView(context);

		childOfScroll = new LinearLayout(context);


		scrollItems.addView(childOfScroll, -1, -1);
		childOfScroll.setOrientation(LinearLayout.VERTICAL);
		childOfScroll.setBackgroundColor(Color.TRANSPARENT);

		menulayout.addView(scrollItems, -1, -1);
		wmManager.addView(parentBox, wmParams);
		showMenu();
	}



	View.OnTouchListener handleMotionTouch = new View.OnTouchListener()
	{
		private float initX;          
		private float initY;
		private float touchX;
		private float touchY;

		double clock=0;
		@Override
		public boolean onTouch(View vw, MotionEvent ev)
		{

			switch (ev.getAction())
			{
				case MotionEvent.ACTION_DOWN:

					initX = wmParams.x;
					initY = wmParams.y;
					touchX = ev.getRawX();
					touchY = ev.getRawY();
					clock = System.currentTimeMillis();
					break;

				case MotionEvent.ACTION_MOVE:
					wmParams.x = (int)initX + (int)(ev.getRawX() - touchX);

					wmParams.y = (int)initY + (int)(ev.getRawY() - touchY);


					wmManager.updateViewLayout(vw, wmParams);
					break;

				case MotionEvent.ACTION_UP:
					if (isIconVisible && (System.currentTimeMillis() < (clock + 200)))
					{
						showMenu();
					}
					break;
			}
			return true;
		}
	};
}
