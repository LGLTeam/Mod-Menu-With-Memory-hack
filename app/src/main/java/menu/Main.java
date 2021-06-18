package menu;

import android.animation.*;
import android.content.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import androtrainer.*;
import menu.mainmenu.*;

import menu.mainmenu.Menu;
import android.app.AlertDialog;
import android.R;

public class Main
{
	protected static Context context;
	protected LinearLayout childOfScroll;
	public static void start(Context context)
	{

		new Main().MenuMain(context);

	}
	public static void MenuMain(final Context context)
	{

		Main.context = context;

		final MemoryScanner mem=new MemoryScanner();
		
		Menu menu=new Menu(context);
		menu.setWidth(menu.dpi(230));
		menu.setHeight(menu.dpi(250));
		menu.setIconImage("icon0.png","closeicon.png");
		menu.setTitle("    𝕷𝖚𝖈𝖎𝖋𝖊𝖗.𝕬");


		TextView BB = new TextView(context);
		BB.setText("RECOMMENDED HACK");
		BB.setGravity(Gravity.CENTER);
		BB.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(BB);
		
		
		
		
		
		
		menu.addSwitch("color", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.CODE_APP});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("-5.45618741e27", Flags.FLOAT);
						mem.refineNumber("-6.07516805e27",Flags.FLOAT,0x4);
						mem.editAll("300", Flags.FLOAT,0x0);
						mem.editAll("300", Flags.FLOAT,0x4);
						Toast.makeText(context,"TotalResults: "+mem.getResultsCount(),1).show();
						Toast.makeText(context, "ANTI BAN ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("300", Flags.FLOAT);
						mem.refineNumber("300",Flags.FLOAT,0x4);
						mem.editAll("-5.45618741e27", Flags.FLOAT,0x0);
						mem.editAll("-6.07516805e27", Flags.FLOAT,0x4);
						Toast.makeText(context, "ANTI BAN DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
		
		
		TextView tv = new TextView(context);
		tv.setText("PLAYER HACKS");
		tv.setGravity(Gravity.CENTER);
		tv.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(tv);


		menu.addSwitch(" JUMP HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("420", Flags.FLOAT);
						mem.refineNumber("44.76508331299",Flags.FLOAT,0x8);
						mem.editAll("2000", Flags.FLOAT,0x0);
						mem.editAll("2000", Flags.FLOAT,0x8);
						Toast.makeText(context,"TotalResults: "+mem.getResultsCount(),1).show();
						Toast.makeText(context, "HIGH JUMP HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("2000", Flags.FLOAT);
						mem.refineNumber("2000",Flags.FLOAT,0x8);
						mem.editAll("420", Flags.FLOAT,0x0);
						mem.editAll("44.76508331299", Flags.FLOAT,0x8);
						Toast.makeText(context, "HIGH JUMP HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});

		
		

		menu.addSwitch("UNDERGROUND HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("39.96543884277", Flags.FLOAT);
						Toast.makeText(context,"TotalResults: "+mem.getResultsCount(),1).show();
						Toast.makeText(context,"UNDERGROUND ACTIVATE(ON)",1).show();
						mem.editAll("-180", Flags.FLOAT, 0);
					}
					else
					{
						mem.searchNumber("-180", Flags.FLOAT);
						mem.editAll("39.96543884277", Flags.FLOAT, 0);
						Toast.makeText(context,"TotalResults: "+mem.getResultsCount(),1).show();
						Toast.makeText(context, "UNDERGROUND DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});


		menu.addSwitch("SIT EYE EAGLE HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("50", Flags.FLOAT);
						mem.refineNumber("360",Flags.FLOAT,0x14);
						mem.editAll("10000", Flags.FLOAT,0x0);
						mem.editAll("10000", Flags.FLOAT,0x14);
						Toast.makeText(context, "SIT EYE TEST ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("10000", Flags.FLOAT);
						mem.refineNumber("10000",Flags.FLOAT,0x14);
						mem.editAll("50", Flags.FLOAT,0x0);
						mem.editAll("360", Flags.FLOAT,0x14);
						Toast.makeText(context, "SIT EYE TEST DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});


		menu.addSwitch("AIMBOT HACK(TORSO)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("0.99849998951", Flags.FLOAT);
						mem.refineNumber("1036831949",Flags.DWORD,0x4);
						mem.editAll("-999999", Flags.FLOAT,0x0);
						mem.editAll("1148829696", Flags.DWORD,0x4);
						Toast.makeText(context, "AIMBOT HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("-999999", Flags.FLOAT);
						mem.refineNumber("1148829696",Flags.DWORD,0x4);
						mem.editAll("0.99849998951", Flags.FLOAT,0x0);
						mem.editAll("1036831949", Flags.DWORD,0x4);
						Toast.makeText(context, "AIMBOT HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});

           
			
		menu.addSwitch("ANTENA HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("-0.14025734365", Flags.FLOAT);
						mem.refineNumber("1.70537614822",Flags.FLOAT,0x4);
						mem.editAll("10000", Flags.FLOAT,0x0);
						mem.editAll("-7000", Flags.FLOAT,0x4);
						Toast.makeText(context, " ANTENA HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("10000", Flags.FLOAT);
						mem.refineNumber("-7000",Flags.FLOAT,0x4);
						mem.editAll("-0.14025734365", Flags.FLOAT,0x0);
						mem.editAll("1.70537614822", Flags.FLOAT,0x4);
						Toast.makeText(context, "ANTENA HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
		menu.addSwitch("INFINITY LIFE", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("100", Flags.DWORD);
						mem.refineNumber("1065353216",Flags.DWORD,0x8);
						mem.editAll("60000", Flags.DWORD,0x0);
						mem.editAll("60000", Flags.DWORD,0x8);
						Toast.makeText(context, " INFINITY LIFE ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("60000", Flags.DWORD);
						mem.refineNumber("60000",Flags.DWORD,0x8);
						mem.editAll("100", Flags.DWORD,0x0);
						mem.editAll("1065353216", Flags.DWORD,0x8);
						Toast.makeText(context, " INFINITY LIFE DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
		
			
			
			
			
			
			
			
			
			
		menu.addSwitch("AUTO MOVEMENT HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("45", Flags.FLOAT);
						mem.refineNumber("0.70999997854",Flags.FLOAT,0x10);
						mem.editAll("5000", Flags.FLOAT,0x0);
						mem.editAll("5000", Flags.FLOAT,0x10);
						Toast.makeText(context, " AUTO MOVEMENT ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("5000", Flags.FLOAT);
						mem.refineNumber("5000",Flags.FLOAT,0x10);
						mem.editAll("45", Flags.FLOAT,0x0);
						mem.editAll("0.70999997854", Flags.FLOAT,0x10);
						Toast.makeText(context, " AUTO MOVEMENT DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
			
		TextView VV = new TextView(context);
		VV.setText("BIG HEAD ACTIVATE ALL");
		VV.setGravity(Gravity.CENTER);
		VV.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(VV);
		
			
			
			
			
		menu.addSwitch("BIG HEAD  1", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1.11111116409", Flags.FLOAT);
						mem.refineNumber("1.70537614822",Flags.FLOAT,0x14);
						mem.editAll("25.11111068726", Flags.FLOAT,0x0);
						mem.editAll("25.11111068726", Flags.FLOAT,0x14);
						Toast.makeText(context, " BIG HEAD HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("25.11111068726", Flags.FLOAT);
						mem.refineNumber("25.11111068726",Flags.FLOAT,0x14);
						mem.editAll("1.11111116409", Flags.FLOAT,0x0);
						mem.editAll("1.70537614822", Flags.FLOAT,0x14);
						Toast.makeText(context, "BIG HEAD HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});



			
			
		menu.addSwitch("BIG HEAD 2", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1.11111116409", Flags.FLOAT);
						mem.refineNumber("0.04723213613",Flags.FLOAT,0x18);
						mem.editAll("25.11111068726", Flags.FLOAT,0x0);
						mem.editAll("25.11111068726", Flags.FLOAT,0x18);
						Toast.makeText(context, " BIG HEAD HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("25.11111068726", Flags.FLOAT);
						mem.refineNumber("25.11111068726",Flags.FLOAT,0x18);
						mem.editAll("1.11111116409", Flags.FLOAT,0x0);
						mem.editAll("0.04723213613", Flags.FLOAT,0x18);
						Toast.makeText(context, "BIG HEAD HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
			
		menu.addSwitch("BIG HEAD 3", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1.11111116409", Flags.FLOAT);
						mem.refineNumber("0.99999970198",Flags.FLOAT,0x24);
						mem.editAll("25.11111068726", Flags.FLOAT,0x0);
						mem.editAll("25.11111068726", Flags.FLOAT,0x24);
						Toast.makeText(context, " BIG HEAD HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("25.11111068726", Flags.FLOAT);
						mem.refineNumber("25.11111068726",Flags.FLOAT,0x24);
						mem.editAll("1.11111116409", Flags.FLOAT,0x0);
						mem.editAll("0.99999970198", Flags.FLOAT,0x24);
						Toast.makeText(context, "BIG HEAD HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
		
		

			
		
		
		TextView yi = new TextView(context);
		yi.setText("WEAPON HACK");
		yi.setGravity(Gravity.CENTER);
		yi.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(yi);
			
			
			
		menu.addSwitch("HACK PISTOL FIRE RATE PM", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("0.20000000298", Flags.FLOAT);
						mem.refineNumber("4",Flags.FLOAT,0x4);
						mem.editAll("0.00002", Flags.FLOAT,0x0);
						mem.editAll("0.00002", Flags.FLOAT,0x4);
						Toast.makeText(context, " PISTOL FIRE  ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("0.00002", Flags.FLOAT);
						mem.refineNumber("0.00002",Flags.FLOAT,0x4);
						mem.editAll("0.20000000298", Flags.FLOAT,0x0);
						mem.editAll("4", Flags.FLOAT,0x4);
						Toast.makeText(context, "PISTOL FIRE RATE DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});



		menu.addSwitch("HACK PISTOL AMMO PM(BETA)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("0.69999998808", Flags.FLOAT);
						mem.refineNumber("8",Flags.DWORD,0xAC);
						mem.editAll("999", Flags.FLOAT,0x0);
						mem.editAll("999", Flags.DWORD,0xAC);
						Toast.makeText(context, " PISTOL AMMO ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("999", Flags.FLOAT);
						mem.refineNumber("999",Flags.DWORD,0xAC);
						mem.editAll("0.69999998808", Flags.FLOAT,0x0);
						mem.editAll("8", Flags.DWORD,0xAC);
						Toast.makeText(context, "PISTOL AMMO DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
			
			
			
		menu.addSwitch("HACK SHOTGUN FIRE RATE DOUBLE BARREL(BETA)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("0.5", Flags.FLOAT);
						mem.refineNumber("10",Flags.FLOAT,0x4);
						mem.editAll("0.00001", Flags.FLOAT,0x0);
						mem.editAll("0.00001", Flags.FLOAT,0x4);
						Toast.makeText(context, "SHOTGUN HACK FIRE RATE ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("0.00001", Flags.FLOAT);
						mem.refineNumber("0.00001",Flags.FLOAT,0x4);
						mem.editAll("0.5", Flags.FLOAT,0x0);
						mem.editAll("10", Flags.FLOAT,0x4);
						Toast.makeText(context, "SHOTGUN HACK FIRE RATE DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
		menu.addSwitch("HACK SHOTGUN AMMO DOUBLE BARREL(BETA)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("2", Flags.DWORD);
						mem.refineNumber("24",Flags.DWORD,0x4);
						mem.editAll("9999", Flags.DWORD,0x0);
						mem.editAll("9999", Flags.DWORD,0x4);
						Toast.makeText(context, "SHOTGUN HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("9999", Flags.DWORD);
						mem.refineNumber("9999",Flags.DWORD,0x4);
						mem.editAll("2", Flags.DWORD,0x0);
						mem.editAll("24", Flags.DWORD,0x4);
						Toast.makeText(context, "SHOTGUN HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
		menu.addSwitch("HACK SNIPER FIRE RATE M24", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1.5", Flags.FLOAT);
						mem.refineNumber("1.40129846e-45",Flags.FLOAT,0x18);
						mem.editAll("0.00003", Flags.FLOAT,0x0);
						mem.editAll("0.00003", Flags.FLOAT,0x18);
						Toast.makeText(context, "SNIPER HACK FIRE RATE ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("0.00003", Flags.FLOAT);
						mem.refineNumber("0.00003",Flags.FLOAT,0x18);
						mem.editAll("1.5", Flags.FLOAT,0x0);
						mem.editAll("1.40129846e-45", Flags.FLOAT,0x18);
						Toast.makeText(context, "SNIPER HACK FIRE RATE DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});





		menu.addSwitch("HACK SNIPER AMMO M24(BETA)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("5", Flags.DWORD);
						mem.refineNumber("1176256512",Flags.DWORD,0x8);
						mem.editAll("99999", Flags.DWORD,0x0);
						mem.editAll("99999", Flags.DWORD,0x8);
						Toast.makeText(context, "SNIPER HACK AMMMO ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("99999", Flags.DWORD);
						mem.refineNumber("99999",Flags.DWORD,0x8);
						mem.editAll("5", Flags.DWORD,0x0);
						mem.editAll("1176256512", Flags.DWORD,0x8);
						Toast.makeText(context, "SNIPER HACK AMMO DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
		menu.addSwitch("FIRE RATE PISTOL EAGLE", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("0.30000001192", Flags.FLOAT);
						mem.refineNumber("0.69999998808",Flags.FLOAT,0x8);
						mem.editAll("0.000001", Flags.FLOAT,0x0);
						mem.editAll("0.000001", Flags.FLOAT,0x8);
						Toast.makeText(context, "FIRE RATE ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("0.000001", Flags.FLOAT);
						mem.refineNumber("0.000001",Flags.FLOAT,0x8);
						mem.editAll("0.30000001192", Flags.FLOAT,0x0);
						mem.editAll("0.69999998808F", Flags.FLOAT,0x8);
						Toast.makeText(context, "FIRE RATE DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
		menu.addSwitch("AMMO HACK PISTOL EAGLE", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("7", Flags.DWORD);
						mem.refineNumber("1176256512",Flags.DWORD,0x8);
						mem.editAll("99537", Flags.DWORD,0x0);
						mem.editAll("99537", Flags.DWORD,0x8);
						Toast.makeText(context, "AMMO HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("99537", Flags.DWORD);
						mem.refineNumber("99537",Flags.DWORD,0x8);
						mem.editAll("7", Flags.DWORD,0x0);
						mem.editAll("1176256512", Flags.DWORD,0x8);
						Toast.makeText(context, "AMMO HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
			
			


		
		TextView jj = new TextView(context);
		jj.setText("KNIFE HACK");
		jj.setGravity(Gravity.CENTER);
		jj.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(jj);
		
			
			



		menu.addSwitch("MODIFIED KARAMBIT", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1053609165", Flags.DWORD);
						mem.refineNumber("1120403456",Flags.DWORD,0x8);
						mem.editAll("999999", Flags.DWORD,0x0);
						mem.editAll("999999", Flags.DWORD,0x8);
						Toast.makeText(context, "KARAMBIT HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("999999", Flags.DWORD);
						mem.refineNumber("999999",Flags.DWORD,0x8);
						mem.editAll("1053609165", Flags.DWORD,0x0);
						mem.editAll("1120403456", Flags.DWORD,0x8);
						Toast.makeText(context, "KARAMBIT HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});




		menu.addSwitch("MODIFIED KATANA HACK", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1060320051", Flags.DWORD);
						mem.refineNumber("210",Flags.DWORD,0x198);
						mem.editAll("999999999", Flags.DWORD,0x0);
						mem.editAll("2139000000", Flags.DWORD,0x198);
						Toast.makeText(context, " KATANA HACK ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("999999999", Flags.DWORD);
						mem.refineNumber("2139000000",Flags.DWORD,0x198);
						mem.editAll("1060320051", Flags.DWORD,0x0);
						mem.editAll("210", Flags.DWORD,0x198);
						Toast.makeText(context, " KATANA HACK DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});

		
			
			
		TextView zz = new TextView(context);
		zz.setText("SRRVER HACK");
		zz.setGravity(Gravity.CENTER);
		zz.setBackgroundColor(Color.YELLOW);
		menu.getChildOfScroll().addView(zz);
		
			
			
			
		menu.addSwitch("KICK CHEATER/HACKER", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.CODE_APP});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("70", Flags.WORD);
						mem.refineNumber("114",Flags.WORD,0x2);
						mem.refineNumber("97",Flags.WORD,0x4);
						mem.refineNumber("103",Flags.WORD,0x6);
						mem.editAll("70", Flags.WORD,0x0);
						mem.editAll("117", Flags.WORD,0x2);
						mem.editAll("99", Flags.WORD,0x4);
						mem.editAll("107", Flags.WORD,0x6);
						Toast.makeText(context, " error boolean", 1).show();
					}
					else
					{
						mem.searchNumber("70", Flags.WORD);
						mem.refineNumber("117",Flags.WORD,0x2);
						mem.refineNumber("99",Flags.WORD,0x4);
						mem.refineNumber("107",Flags.WORD,0x6);
						mem.editAll("70", Flags.WORD,0x0);
						mem.editAll("114", Flags.WORD,0x2);
						mem.editAll("97", Flags.WORD,0x4);
						mem.editAll("103", Flags.WORD,0x6);
						Toast.makeText(context, " error no pointers found", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			
			
		menu.addSwitch("FAKE NAME ITEM HACK(BETA)", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.C_HEAP});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("7jejej0", Flags.WORD);
						mem.refineNumber("114",Flags.WORD,0x2);
						mem.refineNumber("97",Flags.WORD,0x4);
						mem.refineNumber("103",Flags.WORD,0x6);
						mem.editAll("70", Flags.WORD,0x0);
						mem.editAll("117", Flags.WORD,0x2);
						mem.editAll("99", Flags.WORD,0x4);
						mem.editAll("107", Flags.WORD,0x6);
						Toast.makeText(context, " FAKE NAME ITEM ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("jhhvh70", Flags.WORD);
						mem.refineNumber("117",Flags.WORD,0x2);
						mem.refineNumber("99",Flags.WORD,0x4);
						mem.refineNumber("107",Flags.WORD,0x6);
						mem.editAll("70", Flags.WORD,0x0);
						mem.editAll("114", Flags.WORD,0x2);
						mem.editAll("97", Flags.WORD,0x4);
						mem.editAll("103", Flags.WORD,0x6);
						Toast.makeText(context, " FAKE NAME ITEM DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});
			
			
			

             menu.addSwitch("GRAVITY", new Menu.SwitchMethod(){
				@Override
				public boolean run(boolean state)
				{
					mem.setRanges(new int[]{Ranges.ANONYMOUS});
					mem.clearResults();
					if (state==true)
					{
						mem.searchNumber("1065353216", Flags.DWORD);
						mem.refineNumber("1110704128",Flags.DWORD,0x4);
						mem.editAll("1042535934", Flags.DWORD,0x0);
						mem.editAll("1042535934", Flags.DWORD,0x4);
						Toast.makeText(context, " GRAVITY ACTIVATE(ON)", 1).show();
					}
					else
					{
						mem.searchNumber("1042535934", Flags.DWORD);
						mem.refineNumber("1042535934",Flags.DWORD,0x4);
						mem.editAll("1110704128", Flags.DWORD,0x0);
						mem.editAll("1110704128", Flags.DWORD,0x4);
						Toast.makeText(context, " GRAVITY DEACTIVATE(OFF)", 1).show();
					}
					mem.clearResults();
					return state;
				}
			});	
		
			
			

	}



}
