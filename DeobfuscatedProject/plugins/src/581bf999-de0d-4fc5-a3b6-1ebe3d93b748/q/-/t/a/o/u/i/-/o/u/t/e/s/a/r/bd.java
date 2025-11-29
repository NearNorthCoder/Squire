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
        bd.llIIllIIlIl[bd.llIIllIIllI[0]] = bd.lIlIIIlIIlIIll("PejjrqN1Qx8=", "JEWiR");
        bd.llIIllIIlIl[bd.llIIllIIllI[2]] = bd.lIlIIIlIIlIlII("KTkqIw0YehgmDQg3", "zZKQl");
        bd.llIIllIIlIl[bd.llIIllIIllI[3]] = bd.lIlIIIlIIlIlIl("vfcMkNEMsMQ/xe1SX8FRjA==", "FRCES");
    }

    private static void lIlIIIlIIlIlll() {
        llIIllIIllI = new int[6];
        bd.llIIllIIllI[0] = (0x83 ^ 0x8E) & ~(0x36 ^ 0x3B);
        bd.llIIllIIllI[1] = 0x55 ^ 0x50;
        bd.llIIllIIllI[2] = " ".length();
        bd.llIIllIIllI[3] = "  ".length();
        bd.llIIllIIllI[4] = "   ".length();
        bd.llIIllIIllI[5] = 0x2F ^ 0x67 ^ (0xE1 ^ 0xA1);
    }

    private static boolean lIlIIIlIIllIll(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        this.eF.remove(npcDespawned.getNpc());
        "".length();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void llllllllllllllllIIllllIIllllIllI;
        NPC nPC3 = this.bO();
        NPC nPC4 = NPCs.getAll(nPC2 -> {
            int n2;
            if (bd.lIlIIIlIIllIll(nPC2.getName().equals(llIIllIIlIl[llIIllIIllI[3]]) ? 1 : 0) && bd.lIlIIIlIIlllII(this.eF.contains(nPC2) ? 1 : 0) && bd.lIlIIIlIIlllII(nPC2.isDead() ? 1 : 0) && bd.lIlIIIlIIllIIl(nPC2.distanceTo((Locatable)nPC3), llIIllIIllI[4])) {
                n2 = llIIllIIllI[2];
                "".length();
                if ((0x53 ^ 0x56) <= 0) {
                    return ((0x7A ^ 0x76) & ~(0x2B ^ 0x27)) != 0;
                }
            } else {
                n2 = llIIllIIllI[0];
            }
            return n2 != 0;
        }).stream().filter(nPC2 -> {
            boolean bl2;
            if (bd.lIlIIIlIIlllII(nPC3.getWorldArea().isInMeleeDistance(nPC2.getWorldLocation()) ? 1 : 0)) {
                bl2 = llIIllIIllI[2];
                "".length();
                if (" ".length() == 0) {
                    return ((0x88 ^ 0xA2 ^ (0xC6 ^ 0x8D)) & (111 + 23 - 133 + 162 ^ 132 + 189 - 231 + 104 ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIllIIllI[0];
            }
            return bl2;
        }).min(Comparator.comparingInt(nPC -> nPC.getWorldLocation().distanceToPath(this.cu, Players.getLocal().getWorldLocation()))).orElse(null);
        if (bd.lIlIIIlIIllIII(nPC4)) {
            return llIIllIIllI[0];
        }
        if (bd.lIlIIIlIIllIIl(llllllllllllllllIIllllIIllllIllI.distanceTo((Locatable)Players.getLocal()), llIIllIIllI[1])) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIllllIIllllIllI.getWorldLocation());
            return llIIllIIllI[2];
        }
        this.bp();
        nPC4.interact(llIIllIIlIl[llIIllIIllI[0]]);
        return llIIllIIllI[0];
    }

    private static String lIlIIIlIIlIIll(String llllllllllllllllIIllllIIllIllIlI, String llllllllllllllllIIllllIIllIllIll) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIllIllIll.getBytes(StandardCharsets.UTF_8)), llIIllIIllI[5]), "DES");
            Cipher llllllllllllllllIIllllIIllIllllI = Cipher.getInstance("DES");
            llllllllllllllllIIllllIIllIllllI.init(llIIllIIllI[3], llllllllllllllllIIllllIIllIlllll);
            return new String(llllllllllllllllIIllllIIllIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllIIllIlllIl) {
            llllllllllllllllIIllllIIllIlllIl.printStackTrace();
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

    private static String lIlIIIlIIlIlIl(String llllllllllllllllIIllllIIlIllIlIl, String llllllllllllllllIIllllIIlIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIllllIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllIIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllIIlIlllIIl.init(llIIllIIllI[3], llllllllllllllllIIllllIIlIlllIlI);
            return new String(llllllllllllllllIIllllIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllIIlIlllIII) {
            llllllllllllllllIIllllIIlIlllIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        Actor actor = projectile.getInteracting();
        if (bd.lIlIIIlIIllIlI(actor) && bd.lIlIIIlIIllIll(actor.getName().equals(llIIllIIlIl[llIIllIIllI[2]]) ? 1 : 0)) {
            this.eF.add((NPC)actor);
            "".length();
        }
    }

    private static boolean lIlIIIlIIlllII(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlIIlIlII(String llllllllllllllllIIllllIIllIIllII, String llllllllllllllllIIllllIIllIIIllI) {
        llllllllllllllllIIllllIIllIIllII = new String(Base64.getDecoder().decode(llllllllllllllllIIllllIIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllIIllIIlIlI = new StringBuilder();
        char[] llllllllllllllllIIllllIIllIIlIIl = llllllllllllllllIIllllIIllIIIllI.toCharArray();
        int llllllllllllllllIIllllIIllIIlIII = llIIllIIllI[0];
        char[] llllllllllllllllIIllllIIllIIIIlI = llllllllllllllllIIllllIIllIIllII.toCharArray();
        int llllllllllllllllIIllllIIllIIIIIl = llllllllllllllllIIllllIIllIIIIlI.length;
        int llllllllllllllllIIllllIIllIIIIII = llIIllIIllI[0];
        while (bd.lIlIIIlIIlllIl(llllllllllllllllIIllllIIllIIIIII, llllllllllllllllIIllllIIllIIIIIl)) {
            char llllllllllllllllIIllllIIllIIllIl = llllllllllllllllIIllllIIllIIIIlI[llllllllllllllllIIllllIIllIIIIII];
            llllllllllllllllIIllllIIllIIlIlI.append((char)(llllllllllllllllIIllllIIllIIllIl ^ llllllllllllllllIIllllIIllIIlIIl[llllllllllllllllIIllllIIllIIlIII % llllllllllllllllIIllllIIllIIlIIl.length]));
            "".length();
            ++llllllllllllllllIIllllIIllIIlIII;
            ++llllllllllllllllIIllllIIllIIIIII;
            "".length();
            if ("   ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllllIIllIIlIlI);
    }

    private static boolean lIlIIIlIIllIII(Object object) {
        return object == null;
    }
}

