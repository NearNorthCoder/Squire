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
import gg.squire.combat.GameEnum5;
import gg.squire.combat.DHelper;
import gg.squire.combat.StartingTask;
import gg.squire.combat.BankingForItemsTask;
import gg.squire.combat.AttackingBlueDragonTask;
import gg.squire.combat.EatingTask;
import gg.squire.combat.FlickingPrayerTask;
import gg.squire.combat.LootingTask;
import gg.squire.combat.WalkingToBankTask;
import gg.squire.combat.WalkingToBlueDragonsTask;
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
     List<d> b;
    @Inject
    private  SquireBlueDragonKillerConfig j;
    @Inject
    private  InfoBox g;
    @Inject
    private  Client h;
    
    private  Instant l;
    @Inject
    private  OverlayManager i;
     int c;
    
    private static final  Map<WorldPoint, List<Integer>> a;
     int d;
    private  boolean k;
     int f;
     int e;
    private  boolean m;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (SquireBlueDragonKiller.llIlIIIllIIIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
            SquireBlueDragonKiller var1;
            void var2;
            if (SquireBlueDragonKiller.llIlIIIllIIIll(inventoryChanged.getItemId(), lIIllllIIIIl[9])) {
                this.b(this.d() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(var2.getItemId(), lIIllllIIIIl[10])) {
                var1.c(var1.e() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(var2.getItemId(), lIIllllIIIIl[11])) {
                var1.d(var1.f() + lIIllllIIIIl[0]);
            }
            if (SquireBlueDragonKiller.llIlIIIllIIIll(var2.getItemId(), lIIllllIIIIl[12])) {
                var1.e(var1.g() + lIIllllIIIIl[0]);
            }
        }
    }

    public void e(int n) {
        this.f = n;
    }

        return String.valueOf(var3);
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
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = StartingTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[0]] = WalkingToBlueDragonsTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[3]] = AttackingBlueDragonTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[4]] = LootingTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[5]] = WalkingToBankTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[6]] = BankingForItemsTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[7]] = FlickingPrayerTask.class;
        classArray[SquireBlueDragonKiller.lIIllllIIIIl[8]] = EatingTask.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.l;
    }

    private static void llIlIIIlIlllIl() {
        lIIllllIIIII = new String[lIIllllIIIIl[4]];
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[2]] = "squirebdk";
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[0]] = "Eat";
        SquireBlueDragonKiller.lIIllllIIIII[SquireBlueDragonKiller.lIIllllIIIIl[3]] = "Eat";
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
        SquireBlueDragonKiller var4;
        if (SquireBlueDragonKiller.llIlIIIllIIlIl(SquireBlueDragonKiller.llIlIIIllIIlII(Combat.getHealthPercent(), 30.0)) && SquireBlueDragonKiller.llIlIIIlIlllll(this.a() ? 1 : 0)) {
            this.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        if (SquireBlueDragonKiller.llIlIIIllIIIII(Inventory.isFull() ? 1 : 0) && SquireBlueDragonKiller.llIlIIIlIlllll(Inventory.contains(item -> {
            String[] stringArray = new String[lIIllllIIIIl[0]];
            stringArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = lIIllllIIIII[lIIllllIIIIl[0]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            var4.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        BankLoadout var5 = (BankLoadout)var4.j.loadout().selected(BankLoadout.class);
        if (SquireBlueDragonKiller.llIlIIIllIIIlI((Object)var4.j.attackStyle(), (Object)k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c.RANGE) && SquireBlueDragonKiller.llIlIIIllIIIIl(var5.getEquipmentSetup().get(EquipmentInventorySlot.AMMO), Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.AMMO).getId())) {
            var4.a(lIIllllIIIIl[0]);
            return lIIllllIIIIl[0];
        }
        return lIIllllIIIIl[2];
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

    public void a(List<d> list) {
        this.b = list;
    }

    protected void onStart() {
        this.c(lIIllllIIIIl[2]);
        this.b(lIIllllIIIIl[2]);
        this.l = Instant.now();
        this.i.add((Overlay)this.g);

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
                void var6;
                void var7;
                SquireBlueDragonKiller var8;
                ItemComposition itemComposition = Static.getClient().getItemDefinition(n);
                if (SquireBlueDragonKiller.llIlIIIllIIIII(this.j.lootBones() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl(n, lIIllllIIIIl[9]) || SquireBlueDragonKiller.llIlIIIllIIIII(var8.j.lootHides() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)var7, lIIllllIIIIl[10]) || SquireBlueDragonKiller.llIlIIIllIIIII(var8.j.lootScales() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)var7, lIIllllIIIIl[11]) || SquireBlueDragonKiller.llIlIIIllIIIII(var8.j.lootEnsouled() ? 1 : 0) && !SquireBlueDragonKiller.llIlIIIllIIIIl((int)var7, lIIllllIIIIl[12])) break block2;
                if (!SquireBlueDragonKiller.llIlIIIllIIIII(var6.isStackable() ? 1 : 0)) break block3;
                int[] nArray = new int[lIIllllIIIIl[0]];
                nArray[SquireBlueDragonKiller.lIIllllIIIIl[2]] = var7;
                if (!SquireBlueDragonKiller.llIlIIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
            }
            bl = lIIllllIIIIl[0];

            if (-1 <= ((0x7F ^ 0x60) & ~(0xB8 ^ 0xA7))) return bl;
            return false;
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
        void var9;
        SquireBlueDragonKiller var10;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireBlueDragonKiller.llIlIIIlIlllll(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        if (SquireBlueDragonKiller.llIlIIIlIlllll(var10.a(var9.getId()) ? 1 : 0)) {
            return;
        }
        d d2 = new DHelper();
        d2.f(tileItem.getId());
        d2.a(tileItem.getWorldLocation());
        this.c().add(d2);

    }

    public void b(boolean bl) {
        this.m = bl;
    }

    protected void onStop() {
        this.c(lIIllllIIIIl[2]);
        this.b(lIIllllIIIIl[2]);
        this.i.remove((Overlay)this.g);

    }
}

