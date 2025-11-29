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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Attacking skulls -> AttackingskullsTask */
@TaskDesc(name="Attacking skulls", priority=100, blocking=true, register=true)
public class AttackingSkullsTask
extends bM_Unknown {
    private /* synthetic */ boolean gt;
    private /* synthetic */ int gu;
    private final /* synthetic */ Set<NPC> gs;
    private /* synthetic */ NPC eE;
    private static final /* synthetic */ Point gq;
    private static /* synthetic */ int[] llIIIIIIIlI;
    private static /* synthetic */ String[] llIIIIIIIIl;
    private static final /* synthetic */ Point gp;
    private static final /* synthetic */ Point gr;

    @Inject
    protected bH(Client client, z z2, TOAConfig tOAConfig) {
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

    private static String lIIlllIIIIllll(String var3, String var4) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIIIIIIIlI[14]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIIIIIIIlI[13], var9);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
        WorldPoint var10 = var1.a(gp);
        NPC var2 = NPCs.getNearest((WorldPoint)var10, nPC -> {
            int n2;
            if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(this.gs.contains(nPC) ? 1 : 0) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIIIIIIlI[5];
                0;
                
                }
            } else {
                n2 = llIIIIIIIlI[2];
            }
            return n2 != 0;
        });
        if (bH.lIIlllIIIlIlIl(var1.cr() ? 1 : 0)) {
            if (bH.lIIlllIIIlIllI(var2)) {
                WorldPoint var7;
                if (bH.lIIlllIIIlIlII(var1.gt ? 1 : 0) && bH.lIIlllIIIlIlll((var7 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]))).distanceTo((Locatable)Players.getLocal()))) {
                    if (bH.lIIlllIIIlIlIl(var1.cs().contains(var7) ? 1 : 0)) {
                        return llIIIIIIIlI[5];
                    }
                    Movement.setDestination((WorldPoint)var7);
                }
                return llIIIIIIIlI[5];
            }
            WorldPoint var7 = var1.a(gq);
            if (bH.lIIlllIIIlIlII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                if (bH.lIIlllIIIlIlIl(var1.cs().contains(var7) ? 1 : 0)) {
                    return llIIIIIIIlI[5];
                }
                Movement.setDestination((WorldPoint)var7);
            }
            return llIIIIIIIlI[5];
        }
        if (bH.lIIlllIIIlIllI(var2)) {
            var2 = NPCs.getNearest(nPC -> {
                int n2;
                if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIIIIIIIlI[5];
                    0;
                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = llIIIIIIIlI[2];
                }
                return n2 != 0;
            });
            if (bH.lIIlllIIIlIllI(var2)) {
                int[] nArray = new int[llIIIIIIIlI[5]];
                nArray[bH.llIIIIIIIlI[2]] = llIIIIIIIlI[6];
                if (bH.lIIlllIIIlIllI(NPCs.getNearest((int[])nArray))) {
                    WorldPoint var7 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[7]));
                    if (bH.lIIlllIIIlIlll(var7.distanceTo((Locatable)Players.getLocal())) && bH.lIIlllIIIlIlIl(var1.cr() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var7);
                        return llIIIIIIIlI[5];
                    }
                    return llIIIIIIIlI[2];
                }
                WorldPoint var7 = var1.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]));
                if (bH.lIIlllIIIlIlll(var7.distanceTo((Locatable)Players.getLocal()))) {
                    Movement.setDestination((WorldPoint)var7);
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

    private static void lIIlllIIIlIIIl() {
        llIIIIIIIlI = new int[15];
        bH.llIIIIIIIlI[0] = -(0xFFFFC6E7 & 0x3B1D) & (0xFFFFEFFF & 0x3FF7);
        bH.llIIIIIIIlI[1] = -(0xFFFF92D5 & 0x7F2B) & (0xFFFFFFFF & 0x3FF4);
        bH.llIIIIIIIlI[2] = (0xA2 ^ 0x8E) & ~(0xEC ^ 0xC0);
        bH.llIIIIIIIlI[3] = 0x14 ^ 0x34;
        bH.llIIIIIIIlI[4] = 0xE5 ^ 0xAB ^ (0x5B ^ 0x30);
        bH.llIIIIIIIlI[5] = 1;
        bH.llIIIIIIIlI[6] = 0xFFFFBFFE & 0x6DFD;
        bH.llIIIIIIIlI[7] = 0x45 ^ 0x6C ^ (0x68 ^ 0x61) & ~(0x46 ^ 0x4F);
        bH.llIIIIIIIlI[8] = 0xA8 ^ 0xBF;
        bH.llIIIIIIIlI[9] = 0xA4 ^ 0x94;
        bH.llIIIIIIIlI[10] = 0x43 ^ 0x6D ^ (0xB2 ^ 0xBA);
        bH.llIIIIIIIlI[11] = 0x1E ^ 0x5F ^ (0xEF ^ 0x84);
        bH.llIIIIIIIlI[12] = 0xA2 ^ 0x80;
        bH.llIIIIIIIlI[13] = 2;
        bH.llIIIIIIIlI[14] = 0x2B ^ 0x4B ^ (4 ^ 0x6C);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(StatChanged statChanged) {
        void var8;
        if (bH.lIIlllIIIlIllI(this.eE)) {
            return;
        }
        if (bH.lIIlllIIIllIII(var8.getSkill(), Skill.HITPOINTS)) {
            return;
        }
        this.gs.add(this.eE);
        0;
    }

    private static void lIIlllIIIlIIII() {
        llIIIIIIIIl = new String[llIIIIIIIlI[13]];
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[2]] = bH."Attack";
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[5]] = bH."Energy siphon despawned";
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

