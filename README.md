# Mod Menu With Memory Hack

Mod Menu with memory hack written in Java, which those functions would be called to lib. GameGuardian values can be used for it. @Lucifer.A requested me to upload his project so I did for him

Unfortunately, he have no source code to c++. But it still works, use it for educational purposes, maybe you can find better sources on Github :))

Running app will cause crash, just build the APK and install APK manually for it to work

To use GameGuardian values, we need to write this code in /java/menu/Main.java as well

```java
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
```

# Implementing to APK

If you are familar with LGL mod menu, you can do pretty much same steps to implement to APK

The invoke like to call Menu from game's OnCreate method

`invoke-static {p0}, Lmenu/Main;->start(Landroid/content/Context;)V`

# Screenshot

![](https://i.imgur.com/KgcXU9j.png)
