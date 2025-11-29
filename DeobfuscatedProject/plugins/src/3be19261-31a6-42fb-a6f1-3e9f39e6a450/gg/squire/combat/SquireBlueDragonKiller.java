/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.combat;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import gg.squire.combat.overlays.InfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.d;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.e;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.f;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.g;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.h;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.i;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.j;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.k;
import k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.l;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.ItemComposition;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Blue Dragon Killer", description="Kills Blue Dragons", enabledByDefault=false)
public class SquireBlueDragonKiller
extends SquirePlugin {
    /* synthetic */ List<d> b;
    @Inject
    private /* synthetic */ SquireBlueDragonKillerConfig j;
    @Inject
    private /* synthetic */ InfoBox g;
    @Inject
    private /* synthetic */ Client h;
    private static /* synthetic */ String[] lIIllllIIIII;
    private /* synthetic */ Instant l;
    @Inject
    private /* synthetic */ OverlayManager i;
    /* synthetic */ int c;
    private static /* synthetic */ int[] lIIllllIIIIl;
    private static final /* synthetic */ Map<WorldPoint, List<Integer>> a;
    /* synthetic */ int d;
    private /* synthetic */ boolean k;
    /* synthetic */ int f;
    /* synthetic */ int e;
    private /* synthetic */ boolean m;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (SquireBlueDragonKiller.llIlIIIllIIIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            SquireBlueDragonKiller lllllllllllllllIlllIlIlIIIllIlIl;
            void lllllllllllllllIlllIlIlIIIllIlII;
            if (SquireBlueDragonKiller.llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[9])) {
                this.b(this.d() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(lllllllllllllllIlllIlIlIIIllIlII.getItemId(), lIIllllIIIIl[10])) {
                lllllllllllllllIlllIlIlIIIllIlIl.c(lllllllllllllllIlllIlIlIIIllIlIl.e() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(lllllllllllllllIlllIlIlIIIllIlII.getItemId(), lIIllllIIIIl[11])) {
                lllllllllllllllIlllIlIlIIIllIlIl.d(lllllllllllllllIlllIlIlIIIllIlIl.f() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(lllllllllllllllIlllIlIlIIIllIlII.getItemId(), lIIllllIIIIl[12])) {
                lllllllllllllllIlllIlIlIIIllIlIl.e(lllllllllllllllIlllIlIlIIIllIlIl.g() + lIIllllIIIIl[0]);
            }
        }
    }

    public void e(int n) {
        this.f = n;
    }

    private static String llIlIIIlIllIll(String lllllllllllllllIlllIlIlIIIIllIII, String lllllllllllllllIlllIlIlIIIIlIlll) {
        lllllllllllllllIlllIlIlIIIIllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIlIIIIlIllI = new StringBuilder();
        char[] lllllllllllllllIlllIlIlIIIIlIlIl = lllllllllllllllIlllIlIlIIIIlIlll.toCharArray();
        int lllllllllllllllIlllIlIlIIIIlIlII = lIIllllIIIIl[2];
        char[] lllllllllllllllIlllIlIlIIIIIlllI = lllllllllllllllIlllIlIlIIIIllIII.toCharArray();
        int lllllllllllllllIlllIlIlIIIIIllIl = lllllllllllllllIlllIlIlIIIIIlllI.length;
        int lllllllllllllllIlllIlIlIIIIIllII = lIIllllIIIIl[2];
        while (SquireBlueDragonKiller.llIlIIIllIIllI(lllllllllllllllIlllIlIlIIIIIllII, lllllllllllllllIlllIlIlIIIIIllIl)) {
            char lllllllllllllllIlllIlIlIIIIllIIl = lllllllllllllllIlllIlIlIIIIIlllI[lllllllllllllllIlllIlIlIIIIIllII];
            lllllllllllllllIlllIlIlIIIIlIllI.append((char)(lllllllllllllllIlllIlIlIIIIllIIl ^ lllllllllllllllIlllIlIlIIIIlIlIl[lllllllllllllllIlllIlIlIIIIlIlII % lllllllllllllllIlllIlIlIIIIlIlIl.length]));
            "".length();
            ++lllllllllllllllIlllIlIlIIIIlIlII;
            ++lllllllllllllllIlllIlIlIIIIIllII;
            "".length();
            if ("  ".length() != "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIlIIIIlIllI);
    }

    private static boolean llIlIIIllIIlIl(int n) {
        return n < 0;
    }

    private boolean a() {
        return Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIIIIl[0]];
            stringArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = lIIllllIIIII[lIIllllIIIIl[3]];
            return item.hasAction(stringArray);
        });
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    private static boolean llIlIIIlIlllll(int n) {
        return n == 0;
    }

    public void d(int n) {
        this.e = n;
    }

    public void b(int n) {
        this.c = n;
    }

    public int g() {
        return this.f;
    }

    public SquireBlueDragonKiller() {
        this.b = new ArrayList<d>();
        this.m = lIIllllIIIIl[0];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllllIIIIl[1]];
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = e.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[0]] = l.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[3]] = g.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[4]] = j.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[5]] = k.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[6]] = f.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[7]] = i.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[8]] = h.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.l;
    }

    private static void llIlIIIlIlllIl() {
        lIIllllIIIII = new String[lIIllllIIIIl[4]];
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[2]] = SquireBlueDragonKiller.llIlIIIlIllIll("EiUhLjoENjAs", "aTTGH");
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[0]] = SquireBlueDragonKiller.llIlIIIlIlllII("gVODiDglkNU=", "wILnw");
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[3]] = SquireBlueDragonKiller.llIlIIIlIllIll("LgUw", "kdDnT");
    }

    public int e() {
        return this.d;
    }

    private static boolean llIlIIIllIIIll(int n, int n2) {
        return n == n2;
    }

    private static int llIlIIIllIIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public boolean i() {
        return this.m;
    }

    public boolean b() {
        SquireBlueDragonKiller lllllllllllllllIlllIlIlIIIllIIIl;
        if (SquireBlueDragonKiller.llIlIIIllIIlIl(SquireBlueDragonKiller.llIlIIIllIIlII(Combat.getHealthPercent(), 30.0)) && SquireBlueDragonKiller.llIlIIIlIlllll(this.a() ? 1 : 0)) {
            this.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        if (SquireBlueDragonKiller.llIlIIIllIIIII(Inventory.isFull() ? 1 : 0) && SquireBlueDragonKiller.llIlIIIlIlllll(Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIIIIl[0]];
            stringArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = lIIllllIIIII[lIIllllIIIIl[0]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            lllllllllllllllIlllIlIlIIIllIIIl.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        BankLoadout lllllllllllllllIlllIlIlIIIllIIII = (BankLoadout)lllllllllllllllIlllIlIlIIIllIIIl.j.loadout().selected(BankLoadout.class);
        if (SquireBlueDragonKiller.llIlIIIllIIIlI((Object)lllllllllllllllIlllIlIlIIIllIIIl.j.attackStyle(), (Object)k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c.RANGE) && SquireBlueDragonKiller.llIlIIIllIIIIl(lllllllllllllllIlllIlIlIIIllIIII.getEquipmentSetup().get(EquipmentInventorySlot.AMMO), Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.AMMO).getId())) {
            lllllllllllllllIlllIlIlIIIllIIIl.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        return lIIllllIIIIl[2];
    }

    private static String llIlIIIlIlllII(String lllllllllllllllIlllIlIlIIIlIIllI, String lllllllllllllllIlllIlIlIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIIIlIlIlI.init(lIIllllIIIIl[3], lllllllllllllllIlllIlIlIIIlIlIll);
            return new String(lllllllllllllllIlllIlIlIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIIIlIlIIl) {
            lllllllllllllllIlllIlIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIllIIIIl(int n, int n2) {
        return n != n2;
    }

    public int d() {
        return this.c;
    }

    public void c(int n) {
        this.d = n;
    }

    private static void llIlIIIlIllllI() {
        lIIllllIIIIl = new int[13];
        SquireBlueDragonKiller.lIIllllIIIIl[0] = " ".length();
        SquireBlueDragonKiller.lIIllllIIIIl[1] = 0x41 ^ 0x49;
        SquireBlueDragonKiller.lIIllllIIIIl[2] = (0xB3 ^ 0x94) & ~(0x4D ^ 0x6A);
        SquireBlueDragonKiller.lIIllllIIIIl[3] = "  ".length();
        SquireBlueDragonKiller.lIIllllIIIIl[4] = "   ".length();
        SquireBlueDragonKiller.lIIllllIIIIl[5] = 0x46 ^ 0x42;
        SquireBlueDragonKiller.lIIllllIIIIl[6] = 0x45 ^ 0x40;
        SquireBlueDragonKiller.lIIllllIIIIl[7] = 0xBA ^ 0xBC;
        SquireBlueDragonKiller.lIIllllIIIIl[8] = 0xC4 ^ 0xC3;
        SquireBlueDragonKiller.lIIllllIIIIl[9] = 0xFFFF863C & 0x7BDB;
        SquireBlueDragonKiller.lIIllllIIIIl[10] = -(0xFFFFA1AF & 0x7E79) & (0xFFFFB7FF & 0x6EFF);
        SquireBlueDragonKiller.lIIllllIIIIl[11] = 0xFFFFEEFB & 0x7DFD;
        SquireBlueDragonKiller.lIIllllIIIIl[12] = 0xFFFFB6FE & 0x7DC7;
    }

    public void a(List<d> list) {
        this.b = list;
    }

    protected void onStart() {
        this.c(lIIllllIIIIl[2]);
        this.b(lIIllllIIIIl[2]);
        this.l = Instant.now();
        this.i.add((Overlay)this.g);
        "".length();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (SquireBlueDragonKiller.llIlIIIlIlllll(configChanged.getGroup().equals(lIIllllIIIII[lIIllllIIIIl[2]]) ? 1 : 0)) {
            // empty if block
        }
    }

    public List<d> c() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n) {
        boolean bl;
        block3: {
            block2: {
                void lllllllllllllllIlllIlIlIIlIIIIII;
                void lllllllllllllllIlllIlIlIIlIIIIIl;
                SquireBlueDragonKiller lllllllllllllllIlllIlIlIIlIIIIlI;
                ItemComposition itemComposition = Static.getClient().getItemDefinition(n);
                if (SquireBlueDragonKiller.llIlIIIllIIIII(this.j.lootBones() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl(n, lIIllllIIIIl[9]) || SquireBlueDragonKiller.llIlIIIllIIIII(lllllllllllllllIlllIlIlIIlIIIIlI.j.lootHides() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)lllllllllllllllIlllIlIlIIlIIIIIl, lIIllllIIIIl[10]) || SquireBlueDragonKiller.llIlIIIllIIIII(lllllllllllllllIlllIlIlIIlIIIIlI.j.lootScales() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)lllllllllllllllIlllIlIlIIlIIIIIl, lIIllllIIIIl[11]) || SquireBlueDragonKiller.llIlIIIllIIIII(lllllllllllllllIlllIlIlIIlIIIIlI.j.lootEnsouled() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)lllllllllllllllIlllIlIlIIlIIIIIl, lIIllllIIIIl[12])) break block2;
                if (!SquireBlueDragonKiller.llIlIIIllIIIII(lllllllllllllllIlllIlIlIIlIIIIII.isStackable() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIllllIIIIl[0]];
                nArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = lllllllllllllllIlllIlIlIIlIIIIIl;
                if (!SquireBlueDragonKiller.llIlIIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            bl = lIIllllIIIIl[0];
            "".length();
            if (-" ".length() <= ((0x7F ^ 0x60) & ~(0xB8 ^ 0xA7))) return bl;
            return ((0x85 ^ 0xB7) & ~(0x56 ^ 0x64)) != 0;
        }
        bl = lIIllllIIIIl[2];
        return bl;
    }

    static {
        SquireBlueDragonKiller.llIlIIIlIllllI();
        SquireBlueDragonKiller.llIlIIIlIlllIl();
        a = new HashMap<WorldPoint, List<Integer>>();
    }

    @Provides
    SquireBlueDragonKillerConfig a(ConfigManager configManager) {
        return (SquireBlueDragonKillerConfig)configManager.getConfig(SquireBlueDragonKillerConfig.class);
    }

    private static boolean llIlIIIllIIllI(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIIllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIllIIIII(int n) {
        return n != 0;
    }

    public int f() {
        return this.e;
    }

    public boolean h() {
        return this.k;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        void lllllllllllllllIlllIlIlIIIlllIIl;
        SquireBlueDragonKiller lllllllllllllllIlllIlIlIIIlllIll;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireBlueDragonKiller.llIlIIIlIlllll(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        if (SquireBlueDragonKiller.llIlIIIlIlllll(lllllllllllllllIlllIlIlIIIlllIll.a(lllllllllllllllIlllIlIlIIIlllIIl.getId()) ? 1 : 0)) {
            return;
        }
        d d2 = new d();
        d2.f(tileItem.getId());
        d2.a(tileItem.getWorldLocation());
        this.c().add(d2);
        "".length();
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    protected void onStop() {
        this.c(lIIllllIIIIl[2]);
        this.b(lIIllllIIIIl[2]);
        this.i.remove((Overlay)this.g);
        "".length();
    }
}

