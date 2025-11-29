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
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.combat.GameEnum2;
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
        if ((inventoryChanged.getChangeType() == inventoryChanged.getChangeType()2)) {
            SquireBlueDragonKiller var3;
            void var4;
            if ((inventoryChanged.getItemId() == inventoryChanged.getItemId()2)) {
                this.b(this.d() + 0);
            }
            if ((var4.getItemId() == var4.getItemId()2)) {
                var3.c(var3.e() + 0);
            }
            if ((var4.getItemId() == var4.getItemId()2)) {
                var3.d(var3.f() + 0);
            }
            if ((var4.getItemId() == var4.getItemId()2)) {
                var3.e(var3.g() + 0);
            }
        }
    }

    public void e(int n) {
        this.f = n;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 2;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 2;
        while (var13 < lllllllllllllllIlllIlIlIIIIIllII2) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 != 3) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private boolean a() {
        return Inventory.contains(item -> {
            String[] stringArray = new String[0];
            stringArray[2] = var1[3];
            return item.hasAction(stringArray);
        });
    }

    public void a(boolean bl) {
        this.k = bl;
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
        this.m = 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[2] = StartingTask.class;
        classArray[0] = WalkingToBlueDragonsTask.class;
        classArray[3] = AttackingBlueDragonTask.class;
        classArray[4] = LootingTask.class;
        classArray[5] = WalkingToBankTask.class;
        classArray[6] = BankingForItemsTask.class;
        classArray[7] = FlickingPrayerTask.class;
        classArray[8] = EatingTask.class;
        return classArray;
    }

    public Instant getStarted() {
        return this.l;
    }

    public int e() {
        return this.d;
    }

    private static int var15(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public boolean i() {
        return this.m;
    }

    public boolean b() {
        SquireBlueDragonKiller var16;
        if ((SquireBlueDragonKiller.var15(Combat.getHealthPercent( < 0), 30.0)) && (this.a( == 0) ? 1 : 0)) {
            this.a(0);
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0) && (Inventory.contains(item -> {
            String[] stringArray = new String[0];
            stringArray[2] = var1[0];
            return item.hasAction(stringArray == 0);
        }) ? 1 : 0)) {
            var16.a(0);
            return 0;
        }
        BankLoadout var17 = (BankLoadout)var16.j.loadout().selected(BankLoadout.class);
        if (((Object)var16.j.attackStyle() == (Object)var16.j.attackStyle()2)k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c.RANGE) && (var17.getEquipmentSetup().get(EquipmentInventorySlot.AMMO) != var17.getEquipmentSetup().get(EquipmentInventorySlot.AMMO)2)EquipmentInventorySlot.AMMO).getId())) {
            var16.a(0);
            return 0;
        }
        return 2;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
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
        this.c(2);
        this.b(2);
        this.l = Instant.now();
        this.i.add((Overlay)this.g);
        0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if ((configChanged.getGroup( == 0).equals(var1[2]) ? 1 : 0)) {
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
                void var24;
                void var25;
                SquireBlueDragonKiller var26;
                ItemComposition itemComposition = Static.getClient().getItemDefinition(n);
                if ((this.j.lootBones( != 0) ? 1 : 0) && !(n != 9) || (var26.j.lootHides( != 0) ? 1 : 0) && !((int)var25 != (int)lllllllllllllllIlllIlIlIIlIIIIIl2) || (var26.j.lootScales( != 0) ? 1 : 0) && !((int)var25 != (int)lllllllllllllllIlllIlIlIIlIIIIIl2) || (var26.j.lootEnsouled( != 0) ? 1 : 0) && !((int)var25 != (int)lllllllllllllllIlllIlIlIIlIIIIIl2)) break block2;
                if (!(var24.isStackable( != 0) ? 1 : 0)) break block3;
                int[] nArray = new int[0];
                nArray[2] = var25;
                if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0)) break block3;
            }
            bl = 0;
            0;
            if (-1 <= ((0x7F ^ 0x60) & ~(0xB8 ^ 0xA7))) return bl;
            return ((0x85 ^ 0xB7) & ~(0x56 ^ 0x64)) != 0;
        }
        bl = 2;
        return bl;
    }

    static {
        SquireBlueDragonKiller.var27();
        SquireBlueDragonKiller.var28();
        a = new HashMap<WorldPoint, List<Integer>>();
    }

    @Provides
    SquireBlueDragonKillerConfig a(ConfigManager configManager) {
        return (SquireBlueDragonKillerConfig)configManager.getConfig(SquireBlueDragonKillerConfig.class);
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
        void var29;
        SquireBlueDragonKiller var30;
        TileItem tileItem = itemSpawned.getItem();
        if ((tileItem.canPickup( == 0) ? 1 : 0)) {
            return;
        }
        if ((var30.a(var29.getId( == 0)) ? 1 : 0)) {
            return;
        }
        d d2 = new DHelper();
        d2.f(tileItem.getId());
        d2.a(tileItem.getWorldLocation());
        this.c().add(d2);
        0;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    protected void onStop() {
        this.c(2);
        this.b(2);
        this.i.remove((Overlay)this.g);
        0;
    }
}

