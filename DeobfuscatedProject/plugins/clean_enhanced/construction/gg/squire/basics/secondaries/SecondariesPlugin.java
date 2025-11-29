/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.secondaries;

import com.google.inject.Provides;
import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.secondaries.BankingInventoryTask;
import gg.squire.basics.secondaries.RestoringFromPoolTask;
import gg.squire.basics.secondaries.CastBloomTask;
import gg.squire.basics.secondaries.GrabFungusTask;
import gg.squire.basics.secondaries.CollectingSnapeGrassTask;
import gg.squire.basics.secondaries.GrabbingSwampToadsTask;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Secondaries", description="QOL improvements for collecting secondaries", enabledByDefault=false)
public class SecondariesPlugin
extends SquirePlugin {
    private  WorldPoint gI;
    @Inject
    private  Client v;
    private static final  String gG;
    @Inject
    private  OverlayManager bq;
    @Inject
    private  bQ gH;
    private static  String[] lllllIIl;
    private  boolean gJ;
    private static  int[] lllllIlI;

    static {
        SecondariesPlugin.var1();
        SecondariesPlugin.var2();
        gG = lllllIIl[3];
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.gH);
        0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if ((this.v.getGameState() != this.v.getGameState()2)) {
            return;
        }
        this.gJ = Inventory.isFull();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        void var4_4;
        void var3_3;
        String string;
        int n2;
        SecondariesPlugin var3;
        if ((menuEntryAdded.getType() != MenuAction.WALK.getId())) {
            return;
        }
        Tile var4 = var3.v.getSelectedSceneTile();
        if var4 == null {
            return;
        }
        if (var3.gI == null) {
            n2 = 2;
            0;
            if null != null {
                return;
            }
        } else {
            n2 = 1;
        }
        int var5 = n2;
        WorldPoint var6 = var4.getWorldLocation();
        if ((var5 == 0) && (var6.equals((Object == 0)var3.gI) ? 1 : 0)) {
            return;
        }
        MenuEntry menuEntry = Static.getClient().createMenuEntry(7);
        if var5 {
            string = lllllIIl[1];
            0;
            if (2 < 0) {
                return;
            }
        } else {
            string = lllllIIl[2];
        }
        menuEntry.setOption("<col=ffcf40>" + string + " as fungus center").setTarget(menuEntryAdded.getTarget()).setType(MenuAction.RUNELITE).onClick(arg_0 -> this.a((boolean)var3_3, (WorldPoint)var4_4, arg_0));
        0;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 1;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 1;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((0x65 ^ 0x3B ^ (0xD9 ^ 0x83)) >= 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public WorldPoint cT() {
        return this.gI;
    }

    private  void a(boolean bl2, WorldPoint worldPoint, MenuEntry menuEntry) {
        WorldPoint worldPoint2;
        if (bl2 != 0) {
            worldPoint2 = worldPoint;
            0;
            if (-1 >= 0) {
                return;
            }
        } else {
            worldPoint2 = null;
        }
        this.m(worldPoint2);
    }

    public boolean cU() {
        return this.gJ;
    }

    protected void onStart() {
        this.bq.add((Overlay)this.gH);
        0;
    }

    @Provides
    SecondariesConfig w(ConfigManager configManager) {
        return (SecondariesConfig)configManager.getConfig(SecondariesConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = CastBloomTask.class;
        classArray[2] = GrabFungusTask.class;
        classArray[3] = CollectingSnapeGrassTask.class;
        classArray[4] = BankingInventoryTask.class;
        classArray[5] = RestoringFromPoolTask.class;
        classArray[6] = GrabbingSwampToadsTask.class;
        return classArray;
    }

    public void m(WorldPoint worldPoint) {
        this.gI = worldPoint;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

