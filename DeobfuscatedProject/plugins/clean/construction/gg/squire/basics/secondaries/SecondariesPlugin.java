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
import i.i.b.s.c.q.r.s.s.-.u.a.e.bQ;
import gg.squire.basics.secondaries.GrabFungusTask;
import gg.squire.basics.secondaries.CollectingSnapeGrassTask;
import gg.squire.basics.secondaries.GrabbingSwampToadsTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private  boolean gJ;

    static {
        SecondariesPlugin.llIllIlIlI();
        SecondariesPlugin.llIllIlIIl();
        gG = lllllIIl[lllllIlI[3]];
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.gH);

    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (SecondariesPlugin.llIllIlIll(this.v.getGameState(), GameState.LOGGED_IN)) {
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
        SecondariesPlugin llIlIIIIlIlIIII;
        if (SecondariesPlugin.llIllIllII(menuEntryAdded.getType(), MenuAction.WALK.getId())) {
            return;
        }
        Tile llIlIIIIlIIlllI = llIlIIIIlIlIIII.v.getSelectedSceneTile();
        if (SecondariesPlugin.llIllIllIl(llIlIIIIlIIlllI)) {
            return;
        }
        if (SecondariesPlugin.llIllIllIl(llIlIIIIlIlIIII.gI)) {
            n2 = lllllIlI[2];

            }
        } else {
            n2 = lllllIlI[1];
        }
        int llIlIIIIlIIllIl = n2;
        WorldPoint llIlIIIIlIIllII = llIlIIIIlIIlllI.getWorldLocation();
        if (SecondariesPlugin.llIllIlllI(llIlIIIIlIIllIl) && SecondariesPlugin.llIllIlllI(llIlIIIIlIIllII.equals((Object)llIlIIIIlIlIIII.gI) ? 1 : 0)) {
            return;
        }
        MenuEntry menuEntry = Static.getClient().createMenuEntry(lllllIlI[7]);
        if (SecondariesPlugin.llIllIllll(llIlIIIIlIIllIl)) {
            string = lllllIIl[lllllIlI[1]];

            if (2 < 0) {
                return;
            }
        } else {
            string = lllllIIl[lllllIlI[2]];
        }
        menuEntry.setOption("<col=ffcf40>" + string + " as fungus center").setTarget(menuEntryAdded.getTarget()).setType(MenuAction.RUNELITE).onClick(arg_0 -> this.a((boolean)var3_3, (WorldPoint)var4_4, arg_0));

    }

    private static boolean llIllIlIll(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(llIlIIIIIlllIIl);
    }

    public WorldPoint cT() {
        return this.gI;
    }

    private  void a(boolean bl2, WorldPoint worldPoint, MenuEntry menuEntry) {
        WorldPoint worldPoint2;
        if (SecondariesPlugin.llIllIllll(bl2 ? 1 : 0)) {
            worldPoint2 = worldPoint;

        } else {
            worldPoint2 = null;
        }
        this.m(worldPoint2);
    }

    private static void llIllIlIIl() {
        lllllIIl = new String[lllllIlI[4]];
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[1]] = "Mark";
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[2]] = "Unmark";
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[3]] = "<col=ffcf40>";
    }

    private static boolean llIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIlllI(int n2) {
        return n2 == 0;
    }

    public boolean cU() {
        return this.gJ;
    }

    protected void onStart() {
        this.bq.add((Overlay)this.gH);

    }

    private static boolean llIllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Provides
    SecondariesConfig w(ConfigManager configManager) {
        return (SecondariesConfig)configManager.getConfig(SecondariesConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllllIlI[0]];
        classArray[SecondariesPlugin.lllllIlI[1]] = CastBloomTask.class;
        classArray[SecondariesPlugin.lllllIlI[2]] = GrabFungusTask.class;
        classArray[SecondariesPlugin.lllllIlI[3]] = CollectingSnapeGrassTask.class;
        classArray[SecondariesPlugin.lllllIlI[4]] = BankingInventoryTask.class;
        classArray[SecondariesPlugin.lllllIlI[5]] = RestoringFromPoolTask.class;
        classArray[SecondariesPlugin.lllllIlI[6]] = GrabbingSwampToadsTask.class;
        return classArray;
    }

    public void m(WorldPoint worldPoint) {
        this.gI = worldPoint;
    }

    private static boolean llIllIllIl(Object object) {
        return object == null;
    }

}

