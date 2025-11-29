/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.StatChanged;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking skulls", priority=100, blocking=true, register=true)
public class AttackingSkullsTask
extends AutotoaManager {
    private  boolean gt;
    private  int gu;
    private final  Set<NPC> gs;
    private  NPC eE;
    private static final  Point gq;

    private static final  Point gp;
    private static final  Point gr;

    @Inject
    protected AttackingSkullsTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.gs = new HashSet<NPC>();
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (bH.var4(npcDespawned.getNpc().getId(), var1[6])) {
            Log.info((String)var2[var1[5]]);
            Movement.setDestination((WorldPoint)this.a(gr));
            this.gt = var1[5];
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.skullsGear();
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    @Override
    public void r() {
        super.r();
        this.gs.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        bH var11;
        if (!bH.var3(this.aX(), var1[0]) || bH.var4(this.aX(), var1[1])) {
            var11.bp();
        }
        if (bH.var12(var11.cr() ? 1 : 0)) {
            var11.gt = var1[2];
        }
        if (bH.var13(var11.gt)) {
            if (bH.var12(Players.getLocal().isMoving() ? 1 : 0)) {
                var11.gt = var1[2];
            }
            return var11.gt;
        }
        WorldPoint var14 = var11.a(gp);
        NPC var15 = NPCs.getNearest((WorldPoint)var14, nPC -> {
            int n2;
            if (bH.var4(nPC.getId(), var1[6]) && bH.var12(this.gs.contains(nPC) ? 1 : 0) && bH.var12(nPC.isDead() ? 1 : 0)) {
                n2 = var1[5];
                0;
                if null != null {
                    return ((0x48 ^ 0xB ^ (0x47 ^ 0x54)) & (64 + 228 - 91 + 39 ^ 85 + 1 - 28 + 102 ^ -1)) != 0;
                }
            } else {
                n2 = var1[2];
            }
            return n2 != 0;
        });
        if (bH.var13(var11.cr() ? 1 : 0)) {
            if (bH.var16(var15)) {
                WorldPoint var17;
                if (bH.var12(var11.gt) && bH.var18((var17 = var11.a(new Point(var1[3], var1[4]))).distanceTo((Locatable)Players.getLocal()))) {
                    if (bH.var13(var11.cs().contains(var17) ? 1 : 0)) {
                        return var1[5];
                    }
                    Movement.setDestination((WorldPoint)var17);
                }
                return var1[5];
            }
            WorldPoint var17 = var11.a(gq);
            if (bH.var12(Players.getLocal().getWorldLocation().equals((Object)var17) ? 1 : 0)) {
                if (bH.var13(var11.cs().contains(var17) ? 1 : 0)) {
                    return var1[5];
                }
                Movement.setDestination((WorldPoint)var17);
            }
            return var1[5];
        }
        if (bH.var16(var15)) {
            var15 = NPCs.getNearest(nPC -> {
                int n2;
                if (bH.var4(nPC.getId(), var1[6]) && bH.var12(nPC.isDead() ? 1 : 0)) {
                    n2 = var1[5];
                    0;
                    if (2 >= 3) {
                        return ((107 + 116 - 187 + 99 ^ 20 + 69 - -52 + 3) & (34 + 158 - 175 + 150 ^ 168 + 108 - 209 + 109 ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[2];
                }
                return n2 != 0;
            });
            if (bH.var16(var15)) {
                int[] nArray = new int[var1[5]];
                nArray[bH.var1[2]] = var1[6];
                if (bH.var16(NPCs.getNearest((int[])nArray))) {
                    WorldPoint var17 = var11.a(new Point(var1[3], var1[7]));
                    if (bH.var18(var17.distanceTo((Locatable)Players.getLocal())) && bH.var13(var11.cr() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var17);
                        return var1[5];
                    }
                    return var1[2];
                }
                WorldPoint var17 = var11.a(new Point(var1[3], var1[4]));
                if (bH.var18(var17.distanceTo((Locatable)Players.getLocal()))) {
                    Movement.setDestination((WorldPoint)var17);
                    return var1[5];
                }
                return var1[2];
            }
            var11.gs.clear();
        }
        var2_2.interact(var2[var1[2]]);
        this.eE = var2_2;
        return var1[5];
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var19() {
        var1 = new int[15];
        bH.var1[0] = -(0xFFFFC6E7 & 0x3B1D) & (0xFFFFEFFF & 0x3FF7);
        bH.var1[1] = -(0xFFFF92D5 & 0x7F2B) & (0xFFFFFFFF & 0x3FF4);
        bH.var1[2] = (0xA2 ^ 0x8E) & ~(0xEC ^ 0xC0);
        bH.var1[3] = 0x14 ^ 0x34;
        bH.var1[4] = 0xE5 ^ 0xAB ^ (0x5B ^ 0x30);
        bH.var1[5] = 1;
        bH.var1[6] = 0xFFFFBFFE & 0x6DFD;
        bH.var1[7] = 0x45 ^ 0x6C ^ (0x68 ^ 0x61) & ~(0x46 ^ 0x4F);
        bH.var1[8] = 0xA8 ^ 0xBF;
        bH.var1[9] = 0xA4 ^ 0x94;
        bH.var1[10] = 0x43 ^ 0x6D ^ (0xB2 ^ 0xBA);
        bH.var1[11] = 0x1E ^ 0x5F ^ (0xEF ^ 0x84);
        bH.var1[12] = 0xA2 ^ 0x80;
        bH.var1[13] = 2;
        bH.var1[14] = 0x2B ^ 0x4B ^ (4 ^ 0x6C);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(StatChanged statChanged) {
        void var20;
        if (bH.var16(this.eE)) {
            return;
        }
        if (bH.var21(var20.getSkill(), Skill.HITPOINTS)) {
            return;
        }
        this.gs.add(this.eE);
        0;
    }

    private static void var22() {
        var2 = new String[var1[13]];
        bH.var2[bH.var1[2]] = "Attack";
        bH.var2[bH.var1[5]] = "Energy siphon despawned";
    }

    static {
        bH.var19();
        bH.var22();
        gp = new Point(var1[8], var1[9]);
        gq = new Point(var1[10], var1[11]);
        gr = new Point(var1[12], var1[11]);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (bH.var4(npcSpawned.getNpc().getId(), var1[6])) {
            this.gu = this.cu.getTickCount();
        }
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var18(int n2) {
        return n2 > 0;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }
}

