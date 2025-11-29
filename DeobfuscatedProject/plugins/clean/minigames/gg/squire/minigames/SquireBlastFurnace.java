/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.events.OverlayMenuClicked
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames;

import gg.squire.minigames.DHelper;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.GHelper;
import gg.squire.minigames.IHelper;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.O;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.BankFillingCoalBagTask;
import gg.squire.minigames.DefaultStepTask;
import gg.squire.minigames.EquippingGauntletsTask;
import gg.squire.minigames.TurningRunOnTask;
import gg.squire.minigames.OHelper;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import gg.squire.minigames.overlays.InstructionOverlay;
import gg.squire.minigames.overlays.StatisticsOverlay;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Blast Furnace", description="Automatically does blast furnace", enabledByDefault=false)
public class SquireBlastFurnace
extends SquirePlugin {
    
    @Inject
    private  E k;
    @Inject
    private  P p;
    @Inject
    private  Client g;
    @Inject
    private  D t;
    @Inject
    private  O r;
    @Inject
    private  SquireBlastFurnaceConfig i;
    private static final  Pattern f;
    @Inject
    private  N q;
    public static final  int c;
    @Inject
    private  StatisticsOverlay m;
    @Inject
    private  OverlayManager h;
    @Inject
    private  L s;
    public static final  int a;
    @Inject
    private  InstructionOverlay l;
    public static final  WorldPoint d;
    private static final  Pattern e;
    public static final  int b;
    @Inject
    private  G u;
    
    @Inject
    private  K o;
    @Inject
    private  o j;
    @Inject
    private  M n;

    static {
        SquireBlastFurnace.llIIlllIIllIIl();
        SquireBlastFurnace.llIIlllIIllIII();
        c = lIIllIIlIIlI[7];
        b = lIIllIIlIIlI[8];
        a = lIIllIIlIIlI[9];
        d = new WorldPoint(lIIllIIlIIlI[10], lIIllIIlIIlI[11], lIIllIIlIIlI[0]);
        e = Pattern.compile(I.by);
        f = Pattern.compile(I.bz);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverlayMenuClicked overlayMenuClicked) {
        SquireBlastFurnace var1;
        void var2;
        if (SquireBlastFurnace.llIIlllIIlllll(overlayMenuClicked.getOverlay(), (Object)this.l) && SquireBlastFurnace.llIIlllIIlllIl(overlayMenuClicked.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[3]]) ? 1 : 0)) {
            this.t.T();
        }
        if (SquireBlastFurnace.llIIlllIIlllll(var2.getOverlay(), (Object)var1.m) && SquireBlastFurnace.llIIlllIIlllIl(var2.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[4]]) ? 1 : 0)) {
            var1.u.T();
        }
    }

    private static boolean llIIlllIIllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        SquireBlastFurnace var3;
        void var4;
        if (SquireBlastFurnace.llIIlllIIlllIl(menuOptionClicked.getMenuOption().equals(I.bA) ? 1 : 0)) {
            this.j.k().u();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(var4.getMenuOption().equals(I.bB) ? 1 : 0)) {
            var3.j.k().t();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(var4.getMenuOption().equals(I.bC) ? 1 : 0)) {
            var3.u.Z();
        }
        this.t.S();

    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (SquireBlastFurnace.llIIlllIIllIll(this.g.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        this.a().i();
    }

    private static boolean llIIlllIIlllll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        switch (gameObject.getId()) {
            case 26707: {
                void var5;
                SquireBlastFurnace var6;
                var6.k.a((GameObject)var5);

                if (-(0x8F ^ 0x8B) < 0) break;
                return;
            }
            case 9092: 
            case 9100: {
                void var5;
                SquireBlastFurnace var6;
                var6.k.a((GameObject)var5);
            }
        }
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if (SquireBlastFurnace.llIIlllIIlllII(itemContainerChanged.getContainerId(), InventoryID.INVENTORY.getId())) {
            this.t.V();
            this.j.i();
        }
        this.t.S();

    }

    public o a() {
        return this.j;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (SquireBlastFurnace.llIIlllIIllIlI(configChanged.getGroup().equals(lIIllIIlIIIl[lIIllIIlIIlI[0]]) ? 1 : 0)) {
            return;
        }
        this.t.T();
        this.a().j();
        this.t.V();
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        GameObject gameObject = gameObjectDespawned.getGameObject();
        switch (gameObject.getId()) {
            case 9092: 
            case 9100: {
                SquireBlastFurnace var7;
                var7.t.T();
                var7.u.T();
            }
        }
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.u.af();
        this.j.i();
        this.t.S();

    }

    private static boolean llIIlllIIlllIl(int n2) {
        return n2 != 0;
    }

    protected void onStop() {
        this.u.T();
        this.t.T();
        this.a().j();
        this.h.remove((Overlay)this.m);

    }

        return String.valueOf(var8);
    }

    protected void onStart() {
        this.h.add((Overlay)this.m);

    }

    private static void llIIlllIIllIII() {
        lIIllIIlIIIl = new String[lIIllIIlIIlI[1]];
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[0]] = "squirebf";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[2]] = "All your ore goes onto the conveyor belt.";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[3]] = "Reset";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[4]] = "Clear";
    }

    private static boolean llIIlllIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIIlIIlI[1]];
        classArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = BankFillingCoalBagTask.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[2]] = EquippingGauntletsTask.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[3]] = DefaultStepTask.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[4]] = TurningRunOnTask.class;
        return classArray;
    }

    public D b() {
        return this.t;
    }

    private static boolean llIIlllIIllllI(int n2, int n3) {
        return n2 > n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (SquireBlastFurnace.llIIlllIIllIll(gameStateChanged.getGameState(), GameState.LOGGED_IN)) {
            this.t.T();
            this.u.T();
        }
    }

    @Provides
    SquireBlastFurnaceConfig a(ConfigManager configManager) {
        return (SquireBlastFurnaceConfig)configManager.getConfig(SquireBlastFurnaceConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        int n2;
        SquireBlastFurnace var9;
        void var10;
        if (SquireBlastFurnace.llIIlllIIllIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireBlastFurnace.llIIlllIIllIll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var11 = var10.getMessage();
        if (SquireBlastFurnace.llIIlllIIlllII(var9.j.k().w(), lIIllIIlIIlI[5])) {
            n2 = lIIllIIlIIlI[3];

            if (-1 >= 3) {
                return;
            }
        } else {
            n2 = lIIllIIlIIlI[4];
        }
        int var12 = n2;
        Matcher var13 = f.matcher(var11);
        Matcher var14 = e.matcher(var11);
        if (SquireBlastFurnace.llIIlllIIlllIl(var13.matches() ? 1 : 0)) {
            var9.j.k().t();

            if (3 < 0) {
                return;
            }
        } else if (SquireBlastFurnace.llIIlllIIlllIl(var14.matches() ? 1 : 0)) {
            var9.j.k().u();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(var11.equals(lIIllIIlIIIl[lIIllIIlIIlI[2]]) ? 1 : 0)) {
            int[] nArray = new int[lIIllIIlIIlI[2]];
            nArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[6];
            if (SquireBlastFurnace.llIIlllIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var9.j.k().c(new int[lIIllIIlIIlI[0]]);

                if (-1 != -1) {
                    return;
                }
            } else {
                int[] nArray2 = new int[lIIllIIlIIlI[2]];
                nArray2[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[2];
                var9.j.k().c(nArray2);
            }
        }
        if (SquireBlastFurnace.llIIlllIIlllII(var12, var9.j.k().x())) {
            int[] nArray = new int[lIIllIIlIIlI[2]];
            nArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[0];
            var9.j.k().c(nArray);
            if (SquireBlastFurnace.llIIlllIIllllI(var9.j.k().v(), lIIllIIlIIlI[2])) {
                var9.j.k().b(lIIllIIlIIlI[0]);
            }
        }
        this.t.S();

    }

    private static boolean llIIlllIIlllII(int n2, int n3) {
        return n2 == n3;
    }
}

