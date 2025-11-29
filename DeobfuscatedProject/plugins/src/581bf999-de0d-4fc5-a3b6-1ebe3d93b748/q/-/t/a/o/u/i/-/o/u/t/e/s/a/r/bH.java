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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking skulls", priority=100, blocking=true, register=true)
public class bH
extends bM {
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

    private static String lIIlllIIIIllll(String llllllllllllllllIlIIIllllllllllI, String llllllllllllllllIlIIIllllllllIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllllllllIll.getBytes(StandardCharsets.UTF_8)), llIIIIIIIlI[14]), "DES");
            Cipher llllllllllllllllIlIIlIIIIIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIIIIIIIIIII.init(llIIIIIIIlI[13], llllllllllllllllIlIIlIIIIIIIIIIl);
            return new String(llllllllllllllllIlIIlIIIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlllllllllll) {
            llllllllllllllllIlIIIlllllllllll.printStackTrace();
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
        bH llllllllllllllllIlIIlIIIIIIllIll;
        if (!bH.lIIlllIIIlIIlI(this.aX(), llIIIIIIIlI[0]) || bH.lIIlllIIIlIIll(this.aX(), llIIIIIIIlI[1])) {
            llllllllllllllllIlIIlIIIIIIllIll.bp();
        }
        if (bH.lIIlllIIIlIlII(llllllllllllllllIlIIlIIIIIIllIll.cr() ? 1 : 0)) {
            llllllllllllllllIlIIlIIIIIIllIll.gt = llIIIIIIIlI[2];
        }
        if (bH.lIIlllIIIlIlIl(llllllllllllllllIlIIlIIIIIIllIll.gt ? 1 : 0)) {
            if (bH.lIIlllIIIlIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                llllllllllllllllIlIIlIIIIIIllIll.gt = llIIIIIIIlI[2];
            }
            return llllllllllllllllIlIIlIIIIIIllIll.gt;
        }
        WorldPoint llllllllllllllllIlIIlIIIIIIllIlI = llllllllllllllllIlIIlIIIIIIllIll.a(gp);
        NPC llllllllllllllllIlIIlIIIIIIllIIl = NPCs.getNearest((WorldPoint)llllllllllllllllIlIIlIIIIIIllIlI, nPC -> {
            int n2;
            if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(this.gs.contains(nPC) ? 1 : 0) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llIIIIIIIlI[5];
                "".length();
                if (null != null) {
                    return ((0x48 ^ 0xB ^ (0x47 ^ 0x54)) & (64 + 228 - 91 + 39 ^ 85 + 1 - 28 + 102 ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIIIIIIlI[2];
            }
            return n2 != 0;
        });
        if (bH.lIIlllIIIlIlIl(llllllllllllllllIlIIlIIIIIIllIll.cr() ? 1 : 0)) {
            if (bH.lIIlllIIIlIllI(llllllllllllllllIlIIlIIIIIIllIIl)) {
                WorldPoint llllllllllllllllIlIIlIIIIIIllIII;
                if (bH.lIIlllIIIlIlII(llllllllllllllllIlIIlIIIIIIllIll.gt ? 1 : 0) && bH.lIIlllIIIlIlll((llllllllllllllllIlIIlIIIIIIllIII = llllllllllllllllIlIIlIIIIIIllIll.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]))).distanceTo((Locatable)Players.getLocal()))) {
                    if (bH.lIIlllIIIlIlIl(llllllllllllllllIlIIlIIIIIIllIll.cs().contains(llllllllllllllllIlIIlIIIIIIllIII) ? 1 : 0)) {
                        return llIIIIIIIlI[5];
                    }
                    Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIIIIIllIII);
                }
                return llIIIIIIIlI[5];
            }
            WorldPoint llllllllllllllllIlIIlIIIIIIllIII = llllllllllllllllIlIIlIIIIIIllIll.a(gq);
            if (bH.lIIlllIIIlIlII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllIlIIlIIIIIIllIII) ? 1 : 0)) {
                if (bH.lIIlllIIIlIlIl(llllllllllllllllIlIIlIIIIIIllIll.cs().contains(llllllllllllllllIlIIlIIIIIIllIII) ? 1 : 0)) {
                    return llIIIIIIIlI[5];
                }
                Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIIIIIllIII);
            }
            return llIIIIIIIlI[5];
        }
        if (bH.lIIlllIIIlIllI(llllllllllllllllIlIIlIIIIIIllIIl)) {
            llllllllllllllllIlIIlIIIIIIllIIl = NPCs.getNearest(nPC -> {
                int n2;
                if (bH.lIIlllIIIlIIll(nPC.getId(), llIIIIIIIlI[6]) && bH.lIIlllIIIlIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = llIIIIIIIlI[5];
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return ((107 + 116 - 187 + 99 ^ 20 + 69 - -52 + 3) & (34 + 158 - 175 + 150 ^ 168 + 108 - 209 + 109 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIIIIIIlI[2];
                }
                return n2 != 0;
            });
            if (bH.lIIlllIIIlIllI(llllllllllllllllIlIIlIIIIIIllIIl)) {
                int[] nArray = new int[llIIIIIIIlI[5]];
                nArray[bH.llIIIIIIIlI[2]] = llIIIIIIIlI[6];
                if (bH.lIIlllIIIlIllI(NPCs.getNearest((int[])nArray))) {
                    WorldPoint llllllllllllllllIlIIlIIIIIIllIII = llllllllllllllllIlIIlIIIIIIllIll.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[7]));
                    if (bH.lIIlllIIIlIlll(llllllllllllllllIlIIlIIIIIIllIII.distanceTo((Locatable)Players.getLocal())) && bH.lIIlllIIIlIlIl(llllllllllllllllIlIIlIIIIIIllIll.cr() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIIIIIllIII);
                        return llIIIIIIIlI[5];
                    }
                    return llIIIIIIIlI[2];
                }
                WorldPoint llllllllllllllllIlIIlIIIIIIllIII = llllllllllllllllIlIIlIIIIIIllIll.a(new Point(llIIIIIIIlI[3], llIIIIIIIlI[4]));
                if (bH.lIIlllIIIlIlll(llllllllllllllllIlIIlIIIIIIllIII.distanceTo((Locatable)Players.getLocal()))) {
                    Movement.setDestination((WorldPoint)llllllllllllllllIlIIlIIIIIIllIII);
                    return llIIIIIIIlI[5];
                }
                return llIIIIIIIlI[2];
            }
            llllllllllllllllIlIIlIIIIIIllIll.gs.clear();
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
        bH.llIIIIIIIlI[5] = " ".length();
        bH.llIIIIIIIlI[6] = 0xFFFFBFFE & 0x6DFD;
        bH.llIIIIIIIlI[7] = 0x45 ^ 0x6C ^ (0x68 ^ 0x61) & ~(0x46 ^ 0x4F);
        bH.llIIIIIIIlI[8] = 0xA8 ^ 0xBF;
        bH.llIIIIIIIlI[9] = 0xA4 ^ 0x94;
        bH.llIIIIIIIlI[10] = 0x43 ^ 0x6D ^ (0xB2 ^ 0xBA);
        bH.llIIIIIIIlI[11] = 0x1E ^ 0x5F ^ (0xEF ^ 0x84);
        bH.llIIIIIIIlI[12] = 0xA2 ^ 0x80;
        bH.llIIIIIIIlI[13] = "  ".length();
        bH.llIIIIIIIlI[14] = 0x2B ^ 0x4B ^ (4 ^ 0x6C);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void c(StatChanged statChanged) {
        void llllllllllllllllIlIIlIIIIIIlIlII;
        if (bH.lIIlllIIIlIllI(this.eE)) {
            return;
        }
        if (bH.lIIlllIIIllIII(llllllllllllllllIlIIlIIIIIIlIlII.getSkill(), Skill.HITPOINTS)) {
            return;
        }
        this.gs.add(this.eE);
        "".length();
    }

    private static void lIIlllIIIlIIII() {
        llIIIIIIIIl = new String[llIIIIIIIlI[13]];
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[2]] = bH.lIIlllIIIIllll("Y9Vh8bGVcTY=", "EzKsk");
        bH.llIIIIIIIIl[bH.llIIIIIIIlI[5]] = bH.lIIlllIIIIllll("M/eb6bGH3AXC7ePOMdZLcXYcS0UZH7de", "spEty");
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

