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

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.E;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.G;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.K;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.L;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.M;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.N;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.O;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.P;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.Q;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.R;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.S;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.U;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
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
    private static /* synthetic */ int[] lIIllIIlIIlI;
    @Inject
    private /* synthetic */ E k;
    @Inject
    private /* synthetic */ P p;
    @Inject
    private /* synthetic */ Client g;
    @Inject
    private /* synthetic */ D t;
    @Inject
    private /* synthetic */ O r;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static final /* synthetic */ Pattern f;
    @Inject
    private /* synthetic */ N q;
    public static final /* synthetic */ int c;
    @Inject
    private /* synthetic */ StatisticsOverlay m;
    @Inject
    private /* synthetic */ OverlayManager h;
    @Inject
    private /* synthetic */ L s;
    public static final /* synthetic */ int a;
    @Inject
    private /* synthetic */ InstructionOverlay l;
    public static final /* synthetic */ WorldPoint d;
    private static final /* synthetic */ Pattern e;
    public static final /* synthetic */ int b;
    @Inject
    private /* synthetic */ G u;
    private static /* synthetic */ String[] lIIllIIlIIIl;
    @Inject
    private /* synthetic */ K o;
    @Inject
    private /* synthetic */ o j;
    @Inject
    private /* synthetic */ M n;

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

    private static String llIIlllIIlIlll(String lllllllllllllllIlllIllllIlIlIIIl, String lllllllllllllllIlllIllllIlIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIllllIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIllllIlIlIIll.init(lIIllIIlIIlI[3], lllllllllllllllIlllIllllIlIlIlII);
            return new String(lllllllllllllllIlllIllllIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIllllIlIlIIlI) {
            lllllllllllllllIlllIllllIlIlIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverlayMenuClicked overlayMenuClicked) {
        SquireBlastFurnace lllllllllllllllIlllIllllIlIllIlI;
        void lllllllllllllllIlllIllllIlIllIIl;
        if (SquireBlastFurnace.llIIlllIIlllll(overlayMenuClicked.getOverlay(), (Object)this.l) && SquireBlastFurnace.llIIlllIIlllIl(overlayMenuClicked.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[3]]) ? 1 : 0)) {
            this.t.T();
        }
        if (SquireBlastFurnace.llIIlllIIlllll(lllllllllllllllIlllIllllIlIllIIl.getOverlay(), (Object)lllllllllllllllIlllIllllIlIllIlI.m) && SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIlIllIIl.getEntry().getOption().equals(lIIllIIlIIIl[lIIllIIlIIlI[4]]) ? 1 : 0)) {
            lllllllllllllllIlllIllllIlIllIlI.u.T();
        }
    }

    private static boolean llIIlllIIllIll(Object object, Object object2) {
        return object != object2;
    }

    private static String llIIlllIIlIllI(String lllllllllllllllIlllIllllIIlIllII, String lllllllllllllllIlllIllllIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlI[12]), "DES");
            Cipher lllllllllllllllIlllIllllIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIllllIIlIlllI.init(lIIllIIlIIlI[3], lllllllllllllllIlllIllllIIlIllll);
            return new String(lllllllllllllllIlllIllllIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIllllIIlIllIl) {
            lllllllllllllllIlllIllllIIlIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        SquireBlastFurnace lllllllllllllllIlllIllllIlIllllI;
        void lllllllllllllllIlllIllllIlIlllIl;
        if (SquireBlastFurnace.llIIlllIIlllIl(menuOptionClicked.getMenuOption().equals(I.bA) ? 1 : 0)) {
            this.j.k().u();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIlIlllIl.getMenuOption().equals(I.bB) ? 1 : 0)) {
            lllllllllllllllIlllIllllIlIllllI.j.k().t();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIlIlllIl.getMenuOption().equals(I.bC) ? 1 : 0)) {
            lllllllllllllllIlllIllllIlIllllI.u.Z();
        }
        this.t.S();
        0;
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
                void lllllllllllllllIlllIllllIllllIll;
                SquireBlastFurnace lllllllllllllllIlllIllllIlllllIl;
                lllllllllllllllIlllIllllIlllllIl.k.a((GameObject)lllllllllllllllIlllIllllIllllIll);
                0;
                if (-(0x8F ^ 0x8B) < 0) break;
                return;
            }
            case 9092: 
            case 9100: {
                void lllllllllllllllIlllIllllIllllIll;
                SquireBlastFurnace lllllllllllllllIlllIllllIlllllIl;
                lllllllllllllllIlllIllllIlllllIl.k.a((GameObject)lllllllllllllllIlllIllllIllllIll);
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
        0;
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
                SquireBlastFurnace lllllllllllllllIlllIllllIlllIlll;
                lllllllllllllllIlllIllllIlllIlll.t.T();
                lllllllllllllllIlllIllllIlllIlll.u.T();
            }
        }
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.u.af();
        this.j.i();
        this.t.S();
        0;
    }

    private static boolean llIIlllIIlllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIlllIIllIIl() {
        lIIllIIlIIlI = new int[13];
        SquireBlastFurnace.lIIllIIlIIlI[0] = (0x12 ^ 0x15) & ~(0x45 ^ 0x42);
        SquireBlastFurnace.lIIllIIlIIlI[1] = 0x1B ^ 0x1F;
        SquireBlastFurnace.lIIllIIlIIlI[2] = 1;
        SquireBlastFurnace.lIIllIIlIIlI[3] = 2;
        SquireBlastFurnace.lIIllIIlIIlI[4] = 3;
        SquireBlastFurnace.lIIllIIlIIlI[5] = 0x20 ^ 0x3B;
        SquireBlastFurnace.lIIllIIlIIlI[6] = -(0xFFFFFEF3 & 0x4F0D) & (0xFFFFFFE5 & 0x4FDF);
        SquireBlastFurnace.lIIllIIlIIlI[7] = -(0xFFFF9D93 & 0x67ED) & (0xFFFFEFDF & 0x7DF3);
        SquireBlastFurnace.lIIllIIlIIlI[8] = 0xFFFFB3DC & 0x6FA7;
        SquireBlastFurnace.lIIllIIlIIlI[9] = -(0xFFFFFDFF & 0x5E73) & (0xFFFFFFFF & 0x7FFE);
        SquireBlastFurnace.lIIllIIlIIlI[10] = 0xFFFFA797 & 0x5FFC;
        SquireBlastFurnace.lIIllIIlIIlI[11] = -(0xFFFFFD7E & 0x6E8F) & (0xFFFFFF7F & 0x7FEF);
        SquireBlastFurnace.lIIllIIlIIlI[12] = 0x63 ^ 2 ^ (0xAF ^ 0xC6);
    }

    protected void onStop() {
        this.u.T();
        this.t.T();
        this.a().j();
        this.h.remove((Overlay)this.m);
        0;
    }

    private static String llIIlllIIlIlIl(String lllllllllllllllIlllIllllIlIIIIIl, String lllllllllllllllIlllIllllIIlllIll) {
        lllllllllllllllIlllIllllIlIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIllllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIllllIIllllll = new StringBuilder();
        char[] lllllllllllllllIlllIllllIIlllllI = lllllllllllllllIlllIllllIIlllIll.toCharArray();
        int lllllllllllllllIlllIllllIIllllIl = lIIllIIlIIlI[0];
        char[] lllllllllllllllIlllIllllIIllIlll = lllllllllllllllIlllIllllIlIIIIIl.toCharArray();
        int lllllllllllllllIlllIllllIIllIllI = lllllllllllllllIlllIllllIIllIlll.length;
        int lllllllllllllllIlllIllllIIllIlIl = lIIllIIlIIlI[0];
        while (SquireBlastFurnace.llIIlllIlIIIII(lllllllllllllllIlllIllllIIllIlIl, lllllllllllllllIlllIllllIIllIllI)) {
            char lllllllllllllllIlllIllllIlIIIIlI = lllllllllllllllIlllIllllIIllIlll[lllllllllllllllIlllIllllIIllIlIl];
            lllllllllllllllIlllIllllIIllllll.append((char)(lllllllllllllllIlllIllllIlIIIIlI ^ lllllllllllllllIlllIllllIIlllllI[lllllllllllllllIlllIllllIIllllIl % lllllllllllllllIlllIllllIIlllllI.length]));
            0;
            ++lllllllllllllllIlllIllllIIllllIl;
            ++lllllllllllllllIlllIllllIIllIlIl;
            0;
            if (-(128 + 153 - 213 + 95 ^ 107 + 0 - 43 + 102) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIllllIIllllll);
    }

    protected void onStart() {
        this.h.add((Overlay)this.m);
        0;
    }

    private static void llIIlllIIllIII() {
        lIIllIIlIIIl = new String[lIIllIIlIIlI[1]];
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[0]] = SquireBlastFurnace."squirebf";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[2]] = SquireBlastFurnace."All your ore goes onto the conveyor belt.";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[3]] = SquireBlastFurnace."Reset";
        SquireBlastFurnace.lIIllIIlIIIl[SquireBlastFurnace.lIIllIIlIIlI[4]] = SquireBlastFurnace."Clear";
    }

    private static boolean llIIlllIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIIlIIlI[1]];
        classArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = Q.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[2]] = S.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[3]] = R.class;
        classArray[SquireBlastFurnace.lIIllIIlIIlI[4]] = U.class;
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
        SquireBlastFurnace lllllllllllllllIlllIllllIllIIllI;
        void lllllllllllllllIlllIllllIllIIlIl;
        if (SquireBlastFurnace.llIIlllIIllIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireBlastFurnace.llIIlllIIllIll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String lllllllllllllllIlllIllllIllIIlII = lllllllllllllllIlllIllllIllIIlIl.getMessage();
        if (SquireBlastFurnace.llIIlllIIlllII(lllllllllllllllIlllIllllIllIIllI.j.k().w(), lIIllIIlIIlI[5])) {
            n2 = lIIllIIlIIlI[3];
            0;
            if (-1 >= 3) {
                return;
            }
        } else {
            n2 = lIIllIIlIIlI[4];
        }
        int lllllllllllllllIlllIllllIllIIIll = n2;
        Matcher lllllllllllllllIlllIllllIllIIIlI = f.matcher(lllllllllllllllIlllIllllIllIIlII);
        Matcher lllllllllllllllIlllIllllIllIIIIl = e.matcher(lllllllllllllllIlllIllllIllIIlII);
        if (SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIllIIIlI.matches() ? 1 : 0)) {
            lllllllllllllllIlllIllllIllIIllI.j.k().t();
            0;
            if (3 < 0) {
                return;
            }
        } else if (SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIllIIIIl.matches() ? 1 : 0)) {
            lllllllllllllllIlllIllllIllIIllI.j.k().u();
        }
        if (SquireBlastFurnace.llIIlllIIlllIl(lllllllllllllllIlllIllllIllIIlII.equals(lIIllIIlIIIl[lIIllIIlIIlI[2]]) ? 1 : 0)) {
            int[] nArray = new int[lIIllIIlIIlI[2]];
            nArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[6];
            if (SquireBlastFurnace.llIIlllIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                lllllllllllllllIlllIllllIllIIllI.j.k().c(new int[lIIllIIlIIlI[0]]);
                0;
                if (-1 != -1) {
                    return;
                }
            } else {
                int[] nArray2 = new int[lIIllIIlIIlI[2]];
                nArray2[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[2];
                lllllllllllllllIlllIllllIllIIllI.j.k().c(nArray2);
            }
        }
        if (SquireBlastFurnace.llIIlllIIlllII(lllllllllllllllIlllIllllIllIIIll, lllllllllllllllIlllIllllIllIIllI.j.k().x())) {
            int[] nArray = new int[lIIllIIlIIlI[2]];
            nArray[SquireBlastFurnace.lIIllIIlIIlI[0]] = lIIllIIlIIlI[0];
            lllllllllllllllIlllIllllIllIIllI.j.k().c(nArray);
            if (SquireBlastFurnace.llIIlllIIllllI(lllllllllllllllIlllIllllIllIIllI.j.k().v(), lIIllIIlIIlI[2])) {
                lllllllllllllllIlllIllllIllIIllI.j.k().b(lIIllIIlIIlI[0]);
            }
        }
        this.t.S();
        0;
    }

    private static boolean llIIlllIIlllII(int n2, int n3) {
        return n2 == n3;
    }
}

