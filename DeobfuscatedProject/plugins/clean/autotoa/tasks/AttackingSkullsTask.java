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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking skulls", priority=100, blocking=true, register=true)
public class AttackingSkullsTask
extends AutotoaTaskBase {
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

    private static boolean lIIlllIIIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (bH.lIIlllIIIlIIll(npcDespawned.getNpc().getId(), llIIIIIIIlI[6])) {
            Log.info((String)llIIIIIIIIl[llIIIIIIIlI[5]]);
            Movement.setDestination((WorldPoint)this.a(gr));
            this.gt = llIIIIIIIlI[5];
        }
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.skullsGear();
    }

    private static boolean lIIlllIIIlIIll(int n2, int n3) {
        return n2 == n3;
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
        bH var1;
        if (!bH.lIIlllIIIlIIlI(this.aX(), llIIIIIIIlI[0]) || bH.lIIlllIIIlIIll(this.aX(), llIIIIIIIlI[1])) {
            var1.bp();
        }
        if (bH.lIIlllIIIlIlII(var1.cr() ? 1 : 0)) {
            var1.gt = llIIIIIIIlI[2];
        }
        if (bH.lIIlllIIIlIlIl(var1.gt ? 1 : 0)) {
            if (bH.lIIlllIIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                var1.gt = llIIIIIIIlI[2];
            }
            return var1.gt;
        }
        WorldPoint var2 = var1.a(gp);
        NPC var3 = NPCs.getNearest((WorldPoint)var2, nPC -> {
            int n2;
            if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(this.gs.contains(nPC) ? 1 : 0) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIIIIIIlI[5];

                }
            } else {
                n2 = llIIIIIIIlI[2];
            }
            return n2 != 0;
        });
        if (bH.lIIlllIIIlIlIl(var1.cr() ? 1 : 0)) {
            if (bH.lIIlllIIIlIllI(var3)) {
                WorldPoint var4;
                if (bH.lIIlllIIIlIlII(var1.gt ? 1 : 0) && bH.lIIlllIIIlIlll((var4 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]))).distanceTo((Locatable)Players.getLocal()))) {
                    if (bH.lIIlllIIIlIlIl(var1.cs().contains(var4) ? 1 : 0)) {
                        return llIIIIIIIlI[5];
                    }
                    Movement.setDestination((WorldPoint)var4);
                }
                return llIIIIIIIlI[5];
            }
            WorldPoint var4 = var1.a(gq);
            if (bH.lIIlllIIIlIlII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                if (bH.lIIlllIIIlIlIl(var1.cs().contains(var4) ? 1 : 0)) {
                    return llIIIIIIIlI[5];
                }
                Movement.setDestination((WorldPoint)var4);
            }
            return llIIIIIIIlI[5];
        }
        if (bH.lIIlllIIIlIllI(var3)) {
            var3 = NPCs.getNearest(nPC -> {
                int n2;
                if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIIIIIIIlI[5];

                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = llIIIIIIIlI[2];
                }
                return n2 != 0;
            });
            if (bH.lIIlllIIIlIllI(var3)) {
                int[] nArray = new int[llIIIIIIIlI[5]];
                nArray[bH.llIIIIIIIlI[2]] = llIIIIIIIlI[6];
                if (bH.lIIlllIIIlIllI(NPCs.getNearest((int[])nArray))) {
                    WorldPoint var4 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[7]));
                    if (bH.lIIlllIIIlIlll(var4.distanceTo((Locatable)Players.getLocal())) && bH.lIIlllIIIlIlIl(var1.cr() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var4);
                        return llIIIIIIIlI[5];
                    }
                    return llIIIIIIIlI[2];
                }
                WorldPoint var4 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]));
                if (bH.lIIlllIIIlIlll(var4.distanceTo((Locatable)Players.getLocal()))) {
                    Movement.setDestination((WorldPoint)var4);
                    return llIIIIIIIlI[5];
                }
                return llIIIIIIIlI[2];
            }
            var1.gs.clear();
        }
        var2_2.interact(llIIIIIIIIl[llIIIIIIIlI[2]]);
        this.eE = var2_2;
        return llIIIIIIIlI[5];
    }

    private static boolean lIIlllIIIlIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(StatChanged statChanged) {
        void var5;
        if (bH.lIIlllIIIlIllI(this.eE)) {
            return;
        }
        if (bH.lIIlllIIIllIII(var5.getSkill(), Skill.HITPOINTS)) {
            return;
        }
        this.gs.add(this.eE);

    }

    private static void lIIlllIIIlIIII() {
        llIIIIIIIIl = new String[llIIIIIIIlI[13]];
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[2]] = "Attack";
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[5]] = "Energy siphon despawned";
    }

    static {
        bH.lIIlllIIIlIIIl();
        bH.lIIlllIIIlIIII();
        gp = new Point(llIIIIIIIlI[8], llIIIIIIIlI[9]);
        gq = new Point(llIIIIIIIlI[10], llIIIIIIIlI[11]);
        gr = new Point(llIIIIIIIlI[12], llIIIIIIIlI[11]);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (bH.lIIlllIIIlIIll(npcSpawned.getNpc().getId(), llIIIIIIIlI[6])) {
            this.gu = this.cu.getTickCount();
        }
    }

    private static boolean lIIlllIIIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlllIIIlIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIIIlIlII(int n2) {
        return n2 == 0;
    }
}

