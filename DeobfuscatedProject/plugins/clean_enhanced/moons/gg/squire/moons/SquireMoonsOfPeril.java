/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.moons;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import gg.squire.moons.overlay.MoonsInfoBox;
import java.util.LinkedHashSet;
import java.util.Set;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import gg.squire.moons.MoonsManager;
import gg.squire.moons.BloodMoonTask;
import gg.squire.moons.BlueMoonTask;
import gg.squire.moons.ClaimChestTask;
import gg.squire.moons.DepositAndExitTask;
import gg.squire.moons.PrayflickTask;
import gg.squire.moons.EclipseMoonTask;
import gg.squire.moons.CaveNavTask;
import gg.squire.moons.WaitingRoomsTask;
import gg.squire.moons.PrayflickTask;
import gg.squire.moons.PrepSuppliesTask;

@PluginDescriptor(name="Squire Moons of Peril", enabledByDefault=false)
public class SquireMoonsOfPeril
extends SquirePlugin {
    @Inject
    private  EventBus b;
    @Inject
    private  SquireMoonsOfPerilConfig c;
    public static  long i;
    @Inject
    private  a e;
    public static  Set<WorldPoint> j;
    @Inject
    private  OverlayManager a;
    
    public static  String g;
    public static  int h;
    public static  String f;
    @Inject
    private  MoonsInfoBox d;

    private static void var3() {
        var2 = new String[var1[5]];
        SquireMoonsOfPeril.var2[SquireMoonsOfPeril.var1[1]] = "squiremoonsofperil";
        SquireMoonsOfPeril.var2[SquireMoonsOfPeril.var1[2]] = "pause";
        SquireMoonsOfPeril.var2[SquireMoonsOfPeril.var1[3]] = "Lunar Chest count";
        SquireMoonsOfPeril.var2[SquireMoonsOfPeril.var1[4]] = "1.11";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC var10;
        void var11;
        if (SquireMoonsOfPeril.var12(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(var1[11], var1[12], var1[1])) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.var13(var11.getNpc())) {
            System.out.println("name: " + var11.getNpc().getName());
            System.out.println("ID: " + var11.getNpc().getId());
            System.out.println("NPC: " + String.valueOf(var11.getNpc()));
        }
        if (SquireMoonsOfPeril.var13(var10 = var11.getNpc())) {
            j.add(var10.getWorldLocation());
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void var14;
        if (SquireMoonsOfPeril.var12(configButtonClicked.getGroup().equals(var2[var1[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.var15(var14.getKey().equals(var2[var1[2]]) ? 1 : 0)) {
            boolean bl;
            SquireMoonsOfPeril var16;
            if (SquireMoonsOfPeril.var12(var16.isPaused() ? 1 : 0)) {
                bl = var1[2];
                0;
                
            } else {
                bl = var1[1];
            }
            var16.setPaused(bl);
        }
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);
        0;
        this.a.remove((Overlay)this.d);
        0;
    }

    private static boolean var17(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);
        0;
        this.a.add((Overlay)this.d);
        0;
        i = System.currentTimeMillis();
        h = var1[1];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[1];
        while (SquireMoonsOfPeril.var17(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    static {
        SquireMoonsOfPeril.var34();
        SquireMoonsOfPeril.var3();
        f = var2[var1[4]];
        i = System.currentTimeMillis();
        j = new LinkedHashSet<WorldPoint>();
    }

    @Provides
    SquireMoonsOfPerilConfig a(ConfigManager configManager) {
        return (SquireMoonsOfPerilConfig)configManager.getConfig(SquireMoonsOfPerilConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireMoonsOfPeril.var1[1]] = EclipseMoonTask.class;
        classArray[SquireMoonsOfPeril.var1[2]] = BlueMoonTask.class;
        classArray[SquireMoonsOfPeril.var1[3]] = BloodMoonTask.class;
        classArray[SquireMoonsOfPeril.var1[4]] = ClaimChestTask.class;
        classArray[SquireMoonsOfPeril.var1[5]] = DepositAndExitTask.class;
        classArray[SquireMoonsOfPeril.var1[6]] = WaitingRoomsTask.class;
        classArray[SquireMoonsOfPeril.var1[7]] = CaveNavTask.class;
        classArray[SquireMoonsOfPeril.var1[8]] = PrepSuppliesTask.class;
        classArray[SquireMoonsOfPeril.var1[9]] = PrayflickTask.class;
        classArray[SquireMoonsOfPeril.var1[10]] = PrayflickTask.class;
        return classArray;
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    private static boolean var15(int n) {
        return n != 0;
    }

    private static void var34() {
        var1 = new int[13];
        SquireMoonsOfPeril.var1[0] = 0x35 ^ 0x3F;
        SquireMoonsOfPeril.var1[1] = (59 + 180 - 67 + 48 ^ 58 + 123 - 168 + 128) & (0x40 ^ 0x1C ^ (0x1E ^ 0x13) ^ -1);
        SquireMoonsOfPeril.var1[2] = 1;
        SquireMoonsOfPeril.var1[3] = 2;
        SquireMoonsOfPeril.var1[4] = 3;
        SquireMoonsOfPeril.var1[5] = 0x75 ^ 0x71;
        SquireMoonsOfPeril.var1[6] = 70 + 172 - 144 + 81 ^ 11 + 174 - 138 + 135;
        SquireMoonsOfPeril.var1[7] = 0x6D ^ 0x44 ^ (0x8C ^ 0xA3);
        SquireMoonsOfPeril.var1[8] = 0x90 ^ 0xA6 ^ (0x9F ^ 0xAE);
        SquireMoonsOfPeril.var1[9] = 0x7F ^ 0x77;
        SquireMoonsOfPeril.var1[10] = 0xA4 ^ 0x91 ^ (0xAB ^ 0x97);
        SquireMoonsOfPeril.var1[11] = -(0xFFFFFBE9 & 0x7C3F) & (0xFFFFFDFE & 0x7FF9);
        SquireMoonsOfPeril.var1[12] = -(0xFFFFFBD7 & 0x466D) & (0xFFFFEFEC & 0x77F7);
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireMoonsOfPeril.var15(chatMessage.getMessage().contains(var2[var1[3]]) ? 1 : 0)) {
            h += var1[2];
        }
    }
}

