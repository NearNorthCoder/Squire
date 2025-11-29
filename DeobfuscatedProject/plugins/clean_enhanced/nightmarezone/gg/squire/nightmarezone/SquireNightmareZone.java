/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmarezone;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import gg.squire.nightmarezone.overlay.NMZInfoBox;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmarezone.NightmarezoneManager;
import gg.squire.nightmarezone.AttackNpcTask;
import gg.squire.nightmarezone.DrinkAbsorptionTask;
import gg.squire.nightmarezone.DrinkOverloadTask;
import gg.squire.nightmarezone.FlickRapidHealTask;
import gg.squire.nightmarezone.LowerHpTask;
import gg.squire.nightmarezone.PickPowerUpTask;
import gg.squire.nightmarezone.PrayerFlickingTask;
import gg.squire.nightmarezone.SwappingGearTask;
import gg.squire.nightmarezone.SwitchingStyleTask;
import gg.squire.nightmarezone.UsingSpecialAttackTask;
import gg.squire.nightmarezone.BuyHerbBoxesTask;
import gg.squire.nightmarezone.StartDreamTask;
import gg.squire.nightmarezone.EnterDreamTask;
import gg.squire.nightmarezone.GetAbsorptionTask;
import gg.squire.nightmarezone.GetAbsorptionTask;
import gg.squire.nightmarezone.RestockPotionsTask;
import gg.squire.nightmarezone.WaitingForPinTask;

@PluginDescriptor(name="Squire Nightmare Zone", enabledByDefault=false)
public class SquireNightmareZone
extends SquirePlugin {
    @Inject
    private  NMZInfoBox d;
    private  boolean f;
    @Inject
    private  EventBus h;
    @Inject
    private  OverlayManager b;
    
    private final  HashSet<Prayer> a;
    @Inject
    private  SquireNightmareZoneConfig c;
    private  int[] g;
    
    @Inject
    private  a i;
    private  InventorySetup e;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public SquireNightmareZoneConfig e() {
        return this.c;
    }

    /*
     * WARNING - void declaration
     */
    public int[] c() {
        void var4;
        int[] nArray = EquipmentSetup.get().getIds();
        int n2 = var1[0];
        int var5 = var1[0];
        while (SquireNightmareZone.var3(var5, ((void)var4).length)) {
            if (SquireNightmareZone.var6((int)var4[var5])) {
                var4[++var7] = var4[var5];
            }
            ++var5;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return Arrays.copyOf(nArray, n2);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[1]];
        classArray[SquireNightmareZone.var1[0]] = PrayerFlickingTask.class;
        classArray[SquireNightmareZone.var1[2]] = SwappingGearTask.class;
        classArray[SquireNightmareZone.var1[3]] = UsingSpecialAttackTask.class;
        classArray[SquireNightmareZone.var1[4]] = PickPowerUpTask.class;
        classArray[SquireNightmareZone.var1[5]] = DrinkAbsorptionTask.class;
        classArray[SquireNightmareZone.var1[6]] = DrinkOverloadTask.class;
        classArray[SquireNightmareZone.var1[7]] = LowerHpTask.class;
        classArray[SquireNightmareZone.var1[8]] = AttackNpcTask.class;
        classArray[SquireNightmareZone.var1[9]] = FlickRapidHealTask.class;
        classArray[SquireNightmareZone.var1[10]] = RestockPotionsTask.class;
        classArray[SquireNightmareZone.var1[11]] = BuyHerbBoxesTask.class;
        classArray[SquireNightmareZone.var1[12]] = GetAbsorptionTask.class;
        classArray[SquireNightmareZone.var1[13]] = GetAbsorptionTask.class;
        classArray[SquireNightmareZone.var1[14]] = StartDreamTask.class;
        classArray[SquireNightmareZone.var1[15]] = EnterDreamTask.class;
        classArray[SquireNightmareZone.var1[16]] = WaitingForPinTask.class;
        classArray[SquireNightmareZone.var1[17]] = SwitchingStyleTask.class;
        return classArray;
    }

    protected void onStart() {
        this.f = var1[0];
        this.b.add((Overlay)this.d);
        0;
        this.a(new InventorySetup());
        this.h.register((Object)this.i);
        this.g = this.c();
        System.out.println("AfkGear: " + Arrays.toString(this.g));
    }

    @Provides
    SquireNightmareZoneConfig a(ConfigManager configManager) {
        return (SquireNightmareZoneConfig)configManager.getConfig(SquireNightmareZoneConfig.class);
    }

    public int b() {
        List list = Inventory.getAll(item -> item.getName().contains(var2[var1[8]]));
        int n2 = var1[0];
        Iterator var14 = list.iterator();
        while (SquireNightmareZone.var15(var14.hasNext() ? 1 : 0)) {
            Item var16 = (Item)var14.next();
            String var17 = var16.getName();
            int var18 = Integer.parseInt(var17.replaceAll(var2[var1[3]], var2[var1[4]]));
            var19 += var18;
            0;
            if ((0x4E ^ 0x4B) > 0) continue;
            return (0x21 ^ 0x16) & ~(0x2F ^ 0x18);
        }
        return n2;
    }

    public boolean g() {
        return this.f;
    }

    public SquireNightmareZone() {
        this.a = new HashSet();
        this.f = var1[0];
        this.g = new int[var1[0]];
    }

    private static void var20() {
        var1 = new int[18];
        SquireNightmareZone.var1[0] = (0x91 ^ 0xC2) & ~(0x2A ^ 0x79);
        SquireNightmareZone.var1[1] = 0x6E ^ 0x7F;
        SquireNightmareZone.var1[2] = 1;
        SquireNightmareZone.var1[3] = 2;
        SquireNightmareZone.var1[4] = 3;
        SquireNightmareZone.var1[5] = 37 + 47 - 24 + 104 ^ 79 + 69 - 4 + 16;
        SquireNightmareZone.var1[6] = 0xC ^ 9;
        SquireNightmareZone.var1[7] = 0x9D ^ 0x9B;
        SquireNightmareZone.var1[8] = 0x24 ^ 0x60 ^ (0x11 ^ 0x52);
        SquireNightmareZone.var1[9] = 0xAD ^ 0xA5;
        SquireNightmareZone.var1[10] = 0x98 ^ 0x91;
        SquireNightmareZone.var1[11] = 0x20 ^ 0x2A;
        SquireNightmareZone.var1[12] = 22 + 157 - 61 + 64 ^ 156 + 71 - 185 + 147;
        SquireNightmareZone.var1[13] = 0x71 ^ 0x7D;
        SquireNightmareZone.var1[14] = 0x2D ^ 0x20;
        SquireNightmareZone.var1[15] = 0x1B ^ 0x15;
        SquireNightmareZone.var1[16] = 0x54 ^ 0x5B;
        SquireNightmareZone.var1[17] = 0x6F ^ 0x21 ^ (0xDC ^ 0x82);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a.clear();
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.d);
        0;
        this.h.unregister((Object)this.i);
    }

    static {
        SquireNightmareZone.var20();
        SquireNightmareZone.var22();
    }

    public int a() {
        List list = Inventory.getAll(item -> item.getName().contains(var2[var1[9]]));
        int n2 = var1[0];
        Iterator var23 = list.iterator();
        while (SquireNightmareZone.var15(var23.hasNext() ? 1 : 0)) {
            Item var24 = (Item)var23.next();
            String var25 = var24.getName();
            int var26 = Integer.parseInt(var25.replaceAll(var2[var1[0]], var2[var1[2]]));
            var27 += var26;
            0;
            if (3 != 0) continue;
            return (0x42 ^ 0x1C) & ~(0xF ^ 0x51);
        }
        return n2;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var1[0];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var1[0];
        while (SquireNightmareZone.var3(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private static boolean var6(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var38;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (SquireNightmareZone.var39(chatMessageType, ChatMessageType.GAMEMESSAGE) && SquireNightmareZone.var39(chatMessageType, ChatMessageType.SPAM) && SquireNightmareZone.var39(chatMessageType, ChatMessageType.WELCOME)) {
            return;
        }
        if (SquireNightmareZone.var15(var38.contains(var2[var1[5]]) ? 1 : 0)) {
            SquireNightmareZone var40;
            var40.f = var1[2];
            var40.g = var40.c();
        }
        if (!SquireNightmareZone.var21(var38.contains(var2[var1[6]]) ? 1 : 0) || SquireNightmareZone.var15(var38.contains(var2[var1[7]]) ? 1 : 0)) {
            var40.f = var1[0];
        }
    }

    private static boolean var39(Object object, Object object2) {
        return object != object2;
    }

    public HashSet<Prayer> d() {
        return this.a;
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    public InventorySetup f() {
        return this.e;
    }

    public int[] h() {
        return this.g;
    }

    private static void var22() {
        var2 = new String[var1[10]];
        SquireNightmareZone.var2[SquireNightmareZone.var1[0]] = "[^0-9]";
        SquireNightmareZone.var2[SquireNightmareZone.var1[2]] = SquireNightmareZone.var8("HdTEYsr3y5w=", "glmYK");
        SquireNightmareZone.var2[SquireNightmareZone.var1[3]] = "[^0-9]";
        SquireNightmareZone.var2[SquireNightmareZone.var1[4]] = SquireNightmareZone.var8("f2jtYtKuMv8=", "HUQUw");
        SquireNightmareZone.var2[SquireNightmareZone.var1[5]] = "You feel a surge of special";
        SquireNightmareZone.var2[SquireNightmareZone.var1[6]] = "Your surge of special";
        SquireNightmareZone.var2[SquireNightmareZone.var1[7]] = "Welcome to Old School RuneScape";
        SquireNightmareZone.var2[SquireNightmareZone.var1[8]] = "Absorption (";
        SquireNightmareZone.var2[SquireNightmareZone.var1[9]] = "Overload (";
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }
}

