/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Attacking swarms -> AttackingswarmsTask */
@TaskDesc(name="Attacking swarms", priority=15, blocking=true, register=true)
@Singleton
public class bd
extends bh {
    private static /* synthetic */ String[] llIIllIIlIl;
    private final /* synthetic */ Set<NPC> eF;
    private static /* synthetic */ int[] llIIllIIllI;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.kephriSwarm();
    }

    @Inject
    protected bd(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.SWARM);
        this.eF = new HashSet<NPC>();
    }

    private static boolean lIlIIIlIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIIllIlI(Object object) {
        return object != null;
    }

    private static void lIlIIIlIIlIllI() {
        llIIllIIlIl = new String[llIIllIIllI[4]];
        bd.llIIllIIlIl[bd.llIIllIIllI[0]] = bd."Attack";
        bd.llIIllIIlIl[bd.llIIllIIllI[2]] = bd."Scarab Swarm";
        bd.llIIllIIlIl[bd.llIIllIIllI[3]] = bd."Scarab Swarm";
    }

    private static void lIlIIIlIIlIlll() {
        llIIllIIllI = new int[6];
        bd.llIIllIIllI[0] = (0x83 ^ 0x8E) & ~(0x36 ^ 0x3B);
        bd.llIIllIIllI[1] = 0x55 ^ 0x50;
        bd.llIIllIIllI[2] = 1;
        bd.llIIllIIllI[3] = 2;
        bd.llIIllIIllI[4] = 3;
        bd.llIIllIIllI[5] = 0x2F ^ 0x67 ^ (0xE1 ^ 0xA1);
    }

    private static boolean lIlIIIlIIllIll(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        this.eF.remove(npcDespawned.getNpc());
        0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var11;
        NPC nPC3 = this.bO();
        NPC nPC4 = NPCs.getAll(nPC2 -> {
            int n2;
            if (bd.lIlIIIlIIllIll(nPC2.getName().equals(llIIllIIlIl[llIIllIIllI[3]]) ? 1 : 0) && bd.lIlIIIlIIlllII(this.eF.contains(nPC2) ? 1 : 0) && bd.lIlIIIlIIlllII(nPC2.isDead() ? 1 : 0) && bd.lIlIIIlIIllIIl(nPC2.distanceTo((Locatable)nPC3), llIIllIIllI[4])) {
                n2 = llIIllIIllI[2];
                0;
                if ((0x53 ^ 0x56) <= 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIllI[0];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bd.lIlIIIlIIlllII(nPC3.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = llIIllIIllI[2];
                0;
                if (1 == 0) {
                    return ((0x88 ^ 0xA2 ^ (0xC6 ^ 0x8D)) & (111 + 23 - 133 + 162 ^ 132 + 189 - 231 + 104 ^ -1)) != 0;
                }
            } else {
                bl2 = llIIllIIllI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bd.lIlIIIlIIllIII(nPC4)) {
            return llIIllIIllI[0];
        }
        if (bd.lIlIIIlIIllIIl(var11.distanceTo((Locatable)Players.getLocal()), llIIllIIllI[1])) {
            Movement.setDestination((WorldPoint)var11.getWorldLocation());
            return llIIllIIllI[2];
        }
        this.bp();
        nPC4.interact(llIIllIIlIl[llIIllIIllI[0]]);
        return llIIllIIllI[0];
    }

    private static String lIlIIIlIIlIIll(String var7, String var3) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), llIIllIIllI[5]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIIllIIllI[3], var19);
            return new String(var9.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    static {
        bd.lIlIIIlIIlIlll();
        bd.lIlIIIlIIlIllI();
    }

    private static boolean lIlIIIlIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIlIIlIlIl(String var1, String var15) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIIllIIllI[3], var14);
            return new String(var4.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (bd.lIlIIIlIIllIlI(actor) && bd.lIlIIIlIIllIll(actor.getName().equals(llIIllIIlIl[llIIllIIllI[2]]) ? 1 : 0)) {
            this.eF.add((NPC)actor);
            0;
        }
    }

    private static boolean lIlIIIlIIlllII(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlIIlIlII(String var17, String var8) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var18 = var8.toCharArray();
        int var5 = llIIllIIllI[0];
        char[] var2 = var17.toCharArray();
        int var12 = var2.length;
        int var10 = llIIllIIllI[0];
        while (bd.lIlIIIlIIlllIl(var10, var12)) {
            char var20 = var2[var10];
            var16.append((char)(var20 ^ var18[var5 % var18.length]));
            0;
            ++var5;
            ++var10;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean lIlIIIlIIllIII(Object object) {
        return object == null;
    }
}

