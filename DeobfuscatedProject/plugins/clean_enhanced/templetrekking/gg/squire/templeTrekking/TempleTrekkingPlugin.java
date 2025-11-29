/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.templeTrekking;

import com.google.inject.Provides;
import gg.squire.templeTrekking.TempletrekkingManager;
import gg.squire.templeTrekking.BankingTask;
import gg.squire.templeTrekking.LoggingOutTask;
import gg.squire.templeTrekking.RewardhandlertaskTask;
import gg.squire.templeTrekking.StaminaHandlerTask;
import gg.squire.templeTrekking.StartingRouteTask;
import gg.squire.templeTrekking.StartTrekTask;
import gg.squire.templeTrekking.BankingTask;
import gg.squire.templeTrekking.HandlingBogTask;
import gg.squire.templeTrekking.HandlingBridgeTask;
import gg.squire.templeTrekking.HandlingEvadeTask;
import gg.squire.templeTrekking.HandlingRopeSwingTask;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.overlay.TempleTrekkingInfoBox;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Temple Trekking", description="Zooming through temple trekking for rewards", enabledByDefault=false, tags={"temple", "trekking", "tt"})
public class TempleTrekkingPlugin
extends SquirePlugin {
    private  boolean m;
    public  int a;
    public  boolean d;
    
    @Inject
    private  TempleTrekkingConfig g;
    @Inject
    private  EventBus n;
    @Inject
    private  OverlayManager h;
    public  WorldArea f;
    @Inject
    private  b i;
    private  InventorySetup k;
    @Inject
    private  TempleTrekkingInfoBox j;
    public  int b;
    public  boolean c;
    private  int l;
    public  WorldArea e;

    public TempleTrekkingPlugin() {
        this.d = var1[0];
        this.e = new WorldArea(new WorldPoint(var1[1], var1[2], var1[3]), new WorldPoint(var1[4], var1[5], var1[3]));
        this.f = new WorldArea(new WorldPoint(var1[6], var1[7], var1[3]), new WorldPoint(var1[8], var1[9], var1[3]));
    }

    public void a(int n2) {
        this.a = n2;
    }

    public int j() {
        return this.l;
    }

    public void b(int n2) {
        this.b = n2;
    }

    protected void onStart() {
        TempleTrekkingPlugin var3;
        block4: {
            block5: {
                if (!TempleTrekkingPlugin.var4(this.g.claimBankTomes() ? 1 : 0)) break block4;
                if (!TempleTrekkingPlugin.var5(Equipment.contains(item -> item.getName().contains(var2[var1[18]])) ? 1 : 0)) break block5;
                String[] stringArray = new String[var1[0]];
                stringArray[TempleTrekkingPlugin.var1[3]] = var2[var1[3]];
                if (!TempleTrekkingPlugin.var4(Inventory.contains((String[])stringArray) ? 1 : 0)) break block4;
            }
            var3.forceStop();
            Log.error((String)var2[var1[0]]);
            return;
        }
        System.out.println(var2[var1[11]]);
        var3.c = var1[0];
        var3.a(new InventorySetup());
        if (TempleTrekkingPlugin.var6(Players.getLocal())) {
            var3.a();
        }
        this.d = var1[3];
        this.l = var1[3];
        this.h.add((Overlay)this.j);
        0;
        this.i.l();
        this.n.register((Object)this.i);
    }

    private static void var7() {
        var2 = new String[var1[19]];
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[3]] = "Knife";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[0]] = "Stopping because we are missing equipped axe or knife in inventory!";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[11]] = "i";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[12]] = "Welcome to Old School RuneScape";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[13]] = "Sucessfully relogged";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[14]] = "You will be logged out";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[15]] = "Mandatory relog coming up!";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[16]] = "slow route through";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[17]] = "You reach your destination.";
        TempleTrekkingPlugin.var2[TempleTrekkingPlugin.var1[18]] = "axe";
    }

    static {
        TempleTrekkingPlugin.var8();
        TempleTrekkingPlugin.var7();
    }

    public void a(InventorySetup inventorySetup) {
        this.k = inventorySetup;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private void a() {
        this.i().add(var1[20], this.g.stamina());
        0;
        this.i().add(var1[21], var1[0]);
        0;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void c(boolean bl) {
        this.m = bl;
    }

    public boolean d() {
        return this.c;
    }

    public void a(WorldArea worldArea) {
        this.e = worldArea;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[3];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[3];
        while (TempleTrekkingPlugin.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (3 < (0xED ^ 0x8E ^ (0x4C ^ 0x2B))) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    public TempleTrekkingConfig h() {
        return this.g;
    }

    public WorldArea g() {
        return this.f;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    public void b(WorldArea worldArea) {
        this.f = worldArea;
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    public boolean e() {
        return this.d;
    }

    protected void onStop() {
        this.h.remove((Overlay)this.j);
        0;
        this.n.unregister((Object)this.i);
    }

    public void c(int n2) {
        this.l = n2;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public int c() {
        return this.b;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    @Provides
    TempleTrekkingConfig a(ConfigManager configManager) {
        return (TempleTrekkingConfig)configManager.getConfig(TempleTrekkingConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        TempleTrekkingPlugin var32;
        void var33;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (TempleTrekkingPlugin.var34(chatMessageType, ChatMessageType.GAMEMESSAGE) && TempleTrekkingPlugin.var34(chatMessageType, ChatMessageType.WELCOME) && TempleTrekkingPlugin.var34(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        if (TempleTrekkingPlugin.var5(var33.contains(var2[var1[12]]) ? 1 : 0)) {
            System.out.println(var2[var1[13]]);
            var32.m = var1[3];
        }
        if (TempleTrekkingPlugin.var5(var33.contains(var2[var1[14]]) ? 1 : 0)) {
            System.out.println(var2[var1[15]]);
            var32.m = var1[0];
        }
        if (TempleTrekkingPlugin.var5(var33.contains(var2[var1[16]]) ? 1 : 0)) {
            var32.a(var1[3]);
        }
        if (TempleTrekkingPlugin.var5(var33.contains(var2[var1[17]]) ? 1 : 0)) {
            var32.l += var1[0];
            var32.a(var1[0]);
        }
    }

    private static void var8() {
        var1 = new int[22];
        TempleTrekkingPlugin.var1[0] = 1;
        TempleTrekkingPlugin.var1[1] = -(0xFFFF976F & 0x7ADF) & (0xFFFFFFFF & 0x1FDE);
        TempleTrekkingPlugin.var1[2] = 0xFFFF8CB9 & 0x7FE6;
        TempleTrekkingPlugin.var1[3] = (0xEE ^ 0x89 ^ (0x6F ^ 0x4B)) & (8 + 54 - 57 + 213 ^ 42 + 27 - 12 + 96 ^ -1);
        TempleTrekkingPlugin.var1[4] = -(0xFFFFFB6E & 0x649B) & (0xFFFFEFAD & 0x7DFB);
        TempleTrekkingPlugin.var1[5] = -(0xFFFFBDD7 & 0x7379) & (0xFFFFBDFF & 0x7FFD);
        TempleTrekkingPlugin.var1[6] = 0xFFFFBF6F & 0x4DF7;
        TempleTrekkingPlugin.var1[7] = 0xFFFFAD9F & 0x5FF6;
        TempleTrekkingPlugin.var1[8] = -(0xFFFF8B1B & 0x76ED) & (0xFFFF9F7B & 0x6FFE);
        TempleTrekkingPlugin.var1[9] = 0xFFFF8FFE & 0x7DA3;
        TempleTrekkingPlugin.var1[10] = 22 + 134 - 45 + 33 ^ 22 + 37 - 8 + 104;
        TempleTrekkingPlugin.var1[11] = 2;
        TempleTrekkingPlugin.var1[12] = 3;
        TempleTrekkingPlugin.var1[13] = 0xA1 ^ 0xA5;
        TempleTrekkingPlugin.var1[14] = 0x54 ^ 0x27 ^ (0x1C ^ 0x6A);
        TempleTrekkingPlugin.var1[15] = 0x4F ^ 0x5B ^ (0x97 ^ 0x85);
        TempleTrekkingPlugin.var1[16] = 0xBF ^ 0xAD ^ (0x8A ^ 0x9F);
        TempleTrekkingPlugin.var1[17] = 50 + 39 - 71 + 132 ^ 76 + 70 - 45 + 57;
        TempleTrekkingPlugin.var1[18] = 0x8D ^ 0x84;
        TempleTrekkingPlugin.var1[19] = 87 + 37 - 6 + 22 ^ 121 + 82 - 161 + 92;
        TempleTrekkingPlugin.var1[20] = 0xFFFFB5D7 & 0x7B79;
        TempleTrekkingPlugin.var1[21] = -(0xFFFFDE4E & 0x39BF) & (0xFFFFFFBF & 0x1BFF);
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    public boolean k() {
        return this.m;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[10]];
        classArray[TempleTrekkingPlugin.var1[3]] = BankingTask.class;
        classArray[TempleTrekkingPlugin.var1[0]] = LoggingOutTask.class;
        classArray[TempleTrekkingPlugin.var1[11]] = HandlingBogTask.class;
        classArray[TempleTrekkingPlugin.var1[12]] = HandlingBridgeTask.class;
        classArray[TempleTrekkingPlugin.var1[13]] = HandlingEvadeTask.class;
        classArray[TempleTrekkingPlugin.var1[14]] = HandlingRopeSwingTask.class;
        classArray[TempleTrekkingPlugin.var1[15]] = StartingRouteTask.class;
        classArray[TempleTrekkingPlugin.var1[16]] = StartTrekTask.class;
        classArray[TempleTrekkingPlugin.var1[17]] = RewardhandlertaskTask.class;
        classArray[TempleTrekkingPlugin.var1[18]] = BankingTask.class;
        classArray[TempleTrekkingPlugin.var1[19]] = StaminaHandlerTask.class;
        return classArray;
    }

    public int b() {
        return this.a;
    }

    public WorldArea f() {
        return this.e;
    }

    public InventorySetup i() {
        return this.k;
    }

    private static boolean var34(Object object, Object object2) {
        return object != object2;
    }
}

