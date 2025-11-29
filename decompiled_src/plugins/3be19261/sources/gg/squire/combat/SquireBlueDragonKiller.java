package gg.squire.combat;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
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
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.d;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.e;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.f;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.g;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.h;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.i;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.j;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.k;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.l;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@PluginDescriptor(name = "Squire Blue Dragon Killer", description = "Kills Blue Dragons", enabledByDefault = false)
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:gg/squire/combat/SquireBlueDragonKiller.class */
public class SquireBlueDragonKiller extends SquirePlugin {
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

    /* renamed from: k  reason: collision with root package name */
    private /* synthetic */ boolean f0k;
    /* synthetic */ int f;
    /* synthetic */ int e;
    /* synthetic */ List<d> b = new ArrayList();
    private /* synthetic */ boolean m = lIIllllIIIIl[0];

    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (llIlIIIllIIIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            if (llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[9])) {
                b(d() + lIIllllIIIIl[0]);
            }
            if (llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[10])) {
                c(e() + lIIllllIIIIl[0]);
            }
            if (llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[11])) {
                d(f() + lIIllllIIIIl[0]);
            }
            if (llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[12])) {
                e(g() + lIIllllIIIIl[0]);
            }
        }
    }

    public void e(int i) {
        this.f = i;
    }

    private static String llIlIIIlIllIll(String lllllllllllllllIlllIlIlIIIIllIII, String lllllllllllllllIlllIlIlIIIIlIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlIlIIIIlIlll.toCharArray();
        int lllllllllllllllIlllIlIlIIIIlIlII = lIIllllIIIIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllllIIIIl[2];
        while (llIlIIIllIIllI(i, length)) {
            char lllllllllllllllIlllIlIlIIIIllIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIlIlIIIIllIIl ^ charArray[lllllllllllllllIlllIlIlIIIIlIlII % charArray.length]));
            "".length();
            lllllllllllllllIlllIlIlIIIIlIlII++;
            i++;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIIllIIlIl(int i) {
        return i < 0;
    }

    private boolean a() {
        return Inventory.contains(item -> {
            String[] strArr = new String[lIIllllIIIIl[0]];
            strArr[lIIllllIIIIl[2]] = lIIllllIIIII[lIIllllIIIIl[3]];
            return item.hasAction(strArr);
        });
    }

    public void a(boolean z) {
        this.f0k = z;
    }

    private static boolean llIlIIIlIlllll(int i) {
        return i == 0;
    }

    public void d(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.c = i;
    }

    public int g() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllllIIIIl[1]];
        clsArr[lIIllllIIIIl[2]] = e.class;
        clsArr[lIIllllIIIIl[0]] = l.class;
        clsArr[lIIllllIIIIl[3]] = g.class;
        clsArr[lIIllllIIIIl[4]] = j.class;
        clsArr[lIIllllIIIIl[5]] = k.class;
        clsArr[lIIllllIIIIl[6]] = f.class;
        clsArr[lIIllllIIIIl[7]] = i.class;
        clsArr[lIIllllIIIIl[8]] = h.class;
        return clsArr;
    }

    public Instant getStarted() {
        return this.l;
    }

    private static void llIlIIIlIlllIl() {
        lIIllllIIIII = new String[lIIllllIIIIl[4]];
        lIIllllIIIII[lIIllllIIIIl[2]] = llIlIIIlIllIll("EiUhLjoENjAs", "aTTGH");
        lIIllllIIIII[lIIllllIIIIl[0]] = llIlIIIlIlllII("gVODiDglkNU=", "wILnw");
        lIIllllIIIII[lIIllllIIIIl[3]] = llIlIIIlIllIll("LgUw", "kdDnT");
    }

    public int e() {
        return this.d;
    }

    private static boolean llIlIIIllIIIll(int i, int i2) {
        return i == i2;
    }

    private static int llIlIIIllIIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public boolean i() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean b() {
        if (llIlIIIllIIlIl(llIlIIIllIIlII(Combat.getHealthPercent(), 30.0d)) && llIlIIIlIlllll(a() ? 1 : 0)) {
            a((boolean) lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        } else if (llIlIIIllIIIII(Inventory.isFull() ? 1 : 0) && llIlIIIlIlllll(Inventory.contains(item -> {
            String[] strArr = new String[lIIllllIIIIl[0]];
            strArr[lIIllllIIIIl[2]] = lIIllllIIIII[lIIllllIIIIl[0]];
            return item.hasAction(strArr);
        }) ? 1 : 0)) {
            a((boolean) lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        } else {
            BankLoadout bankLoadout = (BankLoadout) this.j.loadout().selected(BankLoadout.class);
            if (llIlIIIllIIIlI(this.j.attackStyle(), c.RANGE) && llIlIIIllIIIIl(bankLoadout.getEquipmentSetup().get(EquipmentInventorySlot.AMMO), Equipment.fromSlot(EquipmentInventorySlot.AMMO).getId())) {
                a((boolean) lIIllllIIIIl[0]);
                return lIIllllIIIIl[0];
            }
            return lIIllllIIIIl[2];
        }
    }

    private static String llIlIIIlIlllII(String lllllllllllllllIlllIlIlIIIlIlIII, String lllllllllllllllIlllIlIlIIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllIIIIl[3], lllllllllllllllIlllIlIlIIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIIIlIlIIl) {
            lllllllllllllllIlllIlIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIllIIIIl(int i, int i2) {
        return i != i2;
    }

    public int d() {
        return this.c;
    }

    public void c(int i) {
        this.d = i;
    }

    private static void llIlIIIlIllllI() {
        lIIllllIIIIl = new int[13];
        lIIllllIIIIl[0] = " ".length();
        lIIllllIIIIl[1] = 65 ^ 73;
        lIIllllIIIIl[2] = (179 ^ 148) & ((77 ^ 106) ^ (-1));
        lIIllllIIIIl[3] = "  ".length();
        lIIllllIIIIl[4] = "   ".length();
        lIIllllIIIIl[5] = 70 ^ 66;
        lIIllllIIIIl[6] = 69 ^ 64;
        lIIllllIIIIl[7] = 186 ^ 188;
        lIIllllIIIIl[8] = 196 ^ 195;
        lIIllllIIIIl[9] = (-31172) & 31707;
        lIIllllIIIIl[10] = (-((-24145) & 32377)) & (-18433) & 28415;
        lIIllllIIIIl[11] = (-4357) & 32253;
        lIIllllIIIIl[12] = (-18690) & 32199;
    }

    public void a(List<d> list) {
        this.b = list;
    }

    protected void onStart() {
        c(lIIllllIIIIl[2]);
        b(lIIllllIIIIl[2]);
        this.l = Instant.now();
        this.i.add(this.g);
        "".length();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (llIlIIIlIlllll(configChanged.getGroup().equals(lIIllllIIIII[lIIllllIIIIl[2]]) ? 1 : 0)) {
        }
    }

    public List<d> c() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        if (llIlIIIllIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i) {
        ItemComposition itemDefinition = Static.getClient().getItemDefinition(i);
        if ((!llIlIIIllIIIII(this.j.lootBones() ? 1 : 0) || llIlIIIllIIIIl(i, lIIllllIIIIl[9])) && ((!llIlIIIllIIIII(this.j.lootHides() ? 1 : 0) || llIlIIIllIIIIl(i, lIIllllIIIIl[10])) && ((!llIlIIIllIIIII(this.j.lootScales() ? 1 : 0) || llIlIIIllIIIIl(i, lIIllllIIIIl[11])) && (!llIlIIIllIIIII(this.j.lootEnsouled() ? 1 : 0) || llIlIIIllIIIIl(i, lIIllllIIIIl[12]))))) {
            if (llIlIIIllIIIII(itemDefinition.isStackable() ? 1 : 0)) {
                int[] iArr = new int[lIIllllIIIIl[0]];
                iArr[lIIllllIIIIl[2]] = i;
            }
            return lIIllllIIIIl[2];
        }
        ?? r0 = lIIllllIIIIl[0];
        "".length();
        return (-" ".length()) > ((127 ^ 96) & ((184 ^ 167) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    static {
        llIlIIIlIllllI();
        llIlIIIlIlllIl();
        a = new HashMap();
    }

    @Provides
    SquireBlueDragonKillerConfig a(ConfigManager configManager) {
        return (SquireBlueDragonKillerConfig) configManager.getConfig(SquireBlueDragonKillerConfig.class);
    }

    private static boolean llIlIIIllIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIIllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIIIllIIIII(int i) {
        return i != 0;
    }

    public int f() {
        return this.e;
    }

    public boolean h() {
        return this.f0k;
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        if (llIlIIIlIlllll(item.canPickup() ? 1 : 0) || llIlIIIlIlllll(a(item.getId()) ? 1 : 0)) {
            return;
        }
        d dVar = new d();
        dVar.f(item.getId());
        dVar.a(item.getWorldLocation());
        c().add(dVar);
        "".length();
    }

    public void b(boolean z) {
        this.m = z;
    }

    protected void onStop() {
        c(lIIllllIIIIl[2]);
        b(lIIllllIIIIl[2]);
        this.i.remove(this.g);
        "".length();
    }
}
