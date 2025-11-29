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
import i.i.b.s.c.q.r.s.s.-.u.a.e.bM;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bN;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bP;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bQ;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bR;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bS;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bT;
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
    private /* synthetic */ WorldPoint gI;
    @Inject
    private /* synthetic */ Client v;
    private static final /* synthetic */ String gG;
    @Inject
    private /* synthetic */ OverlayManager bq;
    @Inject
    private /* synthetic */ bQ gH;
    private static /* synthetic */ String[] lllllIIl;
    private /* synthetic */ boolean gJ;
    private static /* synthetic */ int[] lllllIlI;

    static {
        SecondariesPlugin.llIllIlIlI();
        SecondariesPlugin.llIllIlIIl();
        gG = lllllIIl[lllllIlI[3]];
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.gH);
        0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (SecondariesPlugin.llIllIlIll(this.v.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        this.gJ = Inventory.isFull();
    }

    private static void llIllIlIlI() {
        lllllIlI = new int[8];
        SecondariesPlugin.lllllIlI[0] = 0xAA ^ 0xAC;
        SecondariesPlugin.lllllIlI[1] = (0xB ^ 0x2D ^ (0x39 ^ 0x51)) & (0x10 ^ 0x14 ^ (0xB ^ 0x41) ^ -1);
        SecondariesPlugin.lllllIlI[2] = 1;
        SecondariesPlugin.lllllIlI[3] = 2;
        SecondariesPlugin.lllllIlI[4] = 3;
        SecondariesPlugin.lllllIlI[5] = 0x3C ^ 0x38;
        SecondariesPlugin.lllllIlI[6] = 0x95 ^ 0x90;
        SecondariesPlugin.lllllIlI[7] = -2;
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
            0;
            if (null != null) {
                return;
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
            0;
            if (2 < 0) {
                return;
            }
        } else {
            string = lllllIIl[lllllIlI[2]];
        }
        menuEntry.setOption("<col=ffcf40>" + string + " as fungus center").setTarget(menuEntryAdded.getTarget()).setType(MenuAction.RUNELITE).onClick(arg_0 -> this.a((boolean)var3_3, (WorldPoint)var4_4, arg_0));
        0;
    }

    private static boolean llIllIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static String llIllIIlll(String llIlIIIIIlllIll, String llIlIIIIIlllIlI) {
        llIlIIIIIlllIll = new String(Base64.getDecoder().decode(llIlIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIIIIlllIIl = new StringBuilder();
        char[] llIlIIIIIlllIII = llIlIIIIIlllIlI.toCharArray();
        int llIlIIIIIllIlll = lllllIlI[1];
        char[] llIlIIIIIllIIIl = llIlIIIIIlllIll.toCharArray();
        int llIlIIIIIllIIII = llIlIIIIIllIIIl.length;
        int llIlIIIIIlIllll = lllllIlI[1];
        while (SecondariesPlugin.llIlllIIII(llIlIIIIIlIllll, llIlIIIIIllIIII)) {
            char llIlIIIIIllllII = llIlIIIIIllIIIl[llIlIIIIIlIllll];
            llIlIIIIIlllIIl.append((char)(llIlIIIIIllllII ^ llIlIIIIIlllIII[llIlIIIIIllIlll % llIlIIIIIlllIII.length]));
            0;
            ++llIlIIIIIllIlll;
            ++llIlIIIIIlIllll;
            0;
            if ((0x65 ^ 0x3B ^ (0xD9 ^ 0x83)) >= 2) continue;
            return null;
        }
        return String.valueOf(llIlIIIIIlllIIl);
    }

    public WorldPoint cT() {
        return this.gI;
    }

    private /* synthetic */ void a(boolean bl2, WorldPoint worldPoint, MenuEntry menuEntry) {
        WorldPoint worldPoint2;
        if (SecondariesPlugin.llIllIllll(bl2 ? 1 : 0)) {
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

    private static void llIllIlIIl() {
        lllllIIl = new String[lllllIlI[4]];
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[1]] = SecondariesPlugin."Mark";
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[2]] = SecondariesPlugin."Unmark";
        SecondariesPlugin.lllllIIl[SecondariesPlugin.lllllIlI[3]] = SecondariesPlugin."<col=ffcf40>";
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
        0;
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
        classArray[SecondariesPlugin.lllllIlI[1]] = bP.class;
        classArray[SecondariesPlugin.lllllIlI[2]] = bR.class;
        classArray[SecondariesPlugin.lllllIlI[3]] = bS.class;
        classArray[SecondariesPlugin.lllllIlI[4]] = bM.class;
        classArray[SecondariesPlugin.lllllIlI[5]] = bN.class;
        classArray[SecondariesPlugin.lllllIlI[6]] = bT.class;
        return classArray;
    }

    public void m(WorldPoint worldPoint) {
        this.gI = worldPoint;
    }

    private static boolean llIllIllIl(Object object) {
        return object == null;
    }

    private static String llIllIlIII(String llIlIIIIIlIIlII, String llIlIIIIIlIIlIl) {
        try {
            SecretKeySpec llIlIIIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIlIlIII = Cipher.getInstance("Blowfish");
            llIlIIIIIlIlIII.init(lllllIlI[3], llIlIIIIIlIlIIl);
            return new String(llIlIIIIIlIlIII.doFinal(Base64.getDecoder().decode(llIlIIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIIlIIlll) {
            llIlIIIIIlIIlll.printStackTrace();
            return null;
        }
    }
}

