/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Guardians", priority=10000, blocking=true)
public class aA
extends U {
    private /* synthetic */ n al;
    /* synthetic */ int dA;
    private /* synthetic */ int am;
    /* synthetic */ int dB;
    private static /* synthetic */ int[] lIlIIIlIIIlI;
    private static /* synthetic */ String[] lIlIIIIllIlI;
    private /* synthetic */ n ak;

    private static String llIlIlIlIIIIlI(String lllllllllllllllIlllIIIIllllIIlll, String lllllllllllllllIlllIIIIllllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIllllIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIlI[11]), "DES");
            Cipher lllllllllllllllIlllIIIIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIllllIlIIl.init(lIlIIIlIIIlI[3], lllllllllllllllIlllIIIIllllIlIlI);
            return new String(lllllllllllllllIlllIIIIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIIllllIlIII) {
            lllllllllllllllIlllIIIIllllIlIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        void lllllllllllllllIlllIIIlIIIIIllll;
        aA lllllllllllllllIlllIIIlIIIIlIIII;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[15]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (((0xC3 ^ 0x81) & ~(0x83 ^ 0xC1)) == 0) return n2 != 0;
                    return ((0xDF ^ 0x94) & ~(0x2D ^ 0x66)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return this.cS();
        }
        if (aA.llIlIlIllIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.THIRD) && aA.llIlIlIllIIIlI(lllllllllllllllIlllIIIlIIIIlIIII.cj().isFullyEquipped() ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            return lIlIIIlIIIlI[2];
        }
        int lllllllllllllllIlllIIIlIIIIIlllI = lllllllllllllllIlllIIIlIIIIlIIII.cq.getTickCount();
        WorldPoint lllllllllllllllIlllIIIlIIIIIllIl = lllllllllllllllIlllIIIlIIIIlIIII.cQ();
        if (aA.llIlIlIllIIIll(lllllllllllllllIlllIIIlIIIIlIIII.bS.distanceTo(lllllllllllllllIlllIIIlIIIIIllIl), lIlIIIlIIIlI[2])) {
            lllllllllllllllIlllIIIlIIIIlIIII.dA += lIlIIIlIIIlI[2];
            if (aA.llIlIlIllIIlII(lllllllllllllllIlllIIIlIIIIlIIII.dA, lIlIIIlIIIlI[3])) {
                List lllllllllllllllIlllIIIlIIIIIllII = lllllllllllllllIlllIIIlIIIIlIIII.bS.getWorldLocation().createWorldArea(lIlIIIlIIIlI[2]).toWorldPointList();
                WorldPoint lllllllllllllllIlllIIIlIIIIIlIll = lllllllllllllllIlllIIIlIIIIIllII.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(arg_0 -> aA.a((NPC)lllllllllllllllIlllIIIlIIIIIllll, arg_0)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
                Movement.setDestination((WorldPoint)lllllllllllllllIlllIIIlIIIIIlIll);
                return lIlIIIlIIIlI[2];
            }
            if (aA.llIlIlIllIIlIl(lllllllllllllllIlllIIIlIIIIlIIII.dA, lIlIIIlIIIlI[3]) && aA.llIlIlIllIIlIl(lllllllllllllllIlllIIIlIIIIIlllI - lllllllllllllllIlllIIIlIIIIlIIII.dB, lIlIIIlIIIlI[4])) {
                lllllllllllllllIlllIIIlIIIIlIIII.dB = lllllllllllllllIlllIIIlIIIIIlllI;
                lllllllllllllllIlllIIIlIIIIIllll.interact(lIlIIIIllIlI[lIlIIIlIIIlI[1]]);
                return lIlIIIlIIIlI[2];
            }
            return lIlIIIlIIIlI[2];
        }
        lllllllllllllllIlllIIIlIIIIlIIII.dA = lIlIIIlIIIlI[1];
        if (aA.llIlIlIllIIIlI(lllllllllllllllIlllIIIlIIIIIllll.getWorldArea().isInMeleeDistance(lllllllllllllllIlllIIIlIIIIlIIII.bS.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIIlIIIIIllIl);
            return lIlIIIlIIIlI[2];
        }
        if (aA.llIlIlIllIIIlI(lllllllllllllllIlllIIIlIIIIlIIII.bS.getWorldLocation().equals((Object)lllllllllllllllIlllIIIlIIIIIllIl) ? 1 : 0)) {
            return lIlIIIlIIIlI[2];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return lIlIIIlIIIlI[2];
    }

    private static boolean llIlIlIllIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIlIllIlIlI(Object object) {
        return object != null;
    }

    private static void llIlIlIlIlllll() {
        lIlIIIlIIIlI = new int[17];
        aA.lIlIIIlIIIlI[0] = -1;
        aA.lIlIIIlIIIlI[1] = (0x31 ^ 0xE) & ~(0x30 ^ 0xF);
        aA.lIlIIIlIIIlI[2] = 1;
        aA.lIlIIIlIIIlI[3] = 2;
        aA.lIlIIIlIIIlI[4] = 0x36 ^ 0x32;
        aA.lIlIIIlIIIlI[5] = -2;
        aA.lIlIIIlIIIlI[6] = 3;
        aA.lIlIIIlIIIlI[7] = 0x54 ^ 0x52;
        aA.lIlIIIlIIIlI[8] = 0xC4 ^ 0xC1;
        aA.lIlIIIlIIIlI[9] = 28 + 153 - 80 + 74 ^ 59 + 124 - 122 + 130;
        aA.lIlIIIlIIIlI[10] = 0x6A ^ 0x6D;
        aA.lIlIIIlIIIlI[11] = 0xA2 ^ 0xAA;
        aA.lIlIIIlIIIlI[12] = 0x71 ^ 0x25 ^ (0xED ^ 0xB0);
        aA.lIlIIIlIIIlI[13] = 0xB3 ^ 0xB9;
        aA.lIlIIIlIIIlI[14] = 0 + 17 - -57 + 88 ^ 33 + 100 - 113 + 149;
        aA.lIlIIIlIIIlI[15] = 142 + 44 - 149 + 114 ^ 52 + 59 - 21 + 65;
        aA.lIlIIIlIIIlI[16] = 0x4F ^ 0x42;
    }

    private static boolean llIlIlIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aA.llIlIlIlIlllll();
        aA.llIlIlIlIIIlIl();
    }

    private static /* synthetic */ double a(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    private static boolean llIlIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIlIllIIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected aA(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIlIIIlI[0];
        this.dA = lIlIIIlIIIlI[1];
        this.dB = lIlIIIlIIIlI[1];
    }

    private static void llIlIlIlIIIlIl() {
        lIlIIIIllIlI = new String[lIlIIIlIIIlI[16]];
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[1]] = aA."Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[2]] = aA."size is 2";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[3]] = aA."Enter";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[6]] = aA."Passage";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[4]] = aA."Enter";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[8]] = aA."Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[7]] = aA."Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[10]] = aA."Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[11]] = aA."Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[12]] = aA."Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[13]] = aA."Attack";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[14]] = aA."Guardian";
        aA.lIlIIIIllIlI[aA.lIlIIIlIIIlI[15]] = aA."Attack";
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aA.llIlIlIllIlIIl((Object)this.ak.bw, (Object)N.GUARDIANS)) {
            bl2 = lIlIIIlIIIlI[2];
            0;
            if ((0xF4 ^ 0xBA ^ (0x39 ^ 0x73)) <= 0) {
                return ((0xFC ^ 0xC3 ^ (0x88 ^ 0xA3)) & (0x1C ^ 0x2C ^ (0xE5 ^ 0xC1) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.GUARDIANS));
    }

    private static String llIlIlIlIIIlII(String lllllllllllllllIlllIIIIlllIIIIII, String lllllllllllllllIlllIIIIllIllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIlllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIlllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIlllIIIlII.init(lIlIIIlIIIlI[3], lllllllllllllllIlllIIIIlllIIIlIl);
            return new String(lllllllllllllllIlllIIIIlllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIIlllIIIIll) {
            lllllllllllllllIlllIIIIlllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea cP() {
        void lllllllllllllllIlllIIIlIIIIIIlll;
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[13]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (((0xC7 ^ 0xC1 ^ (0xBA ^ 0x9B)) & (0xDF ^ 0x86 ^ (0x5D ^ 0x23) ^ -1)) == 0) return n2 != 0;
                    return ((0xEA ^ 0x82 ^ (0xA1 ^ 0x83)) & (0xE1 ^ 0xB1 ^ (0x93 ^ 0x89) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIllI(list.size())) {
            return null;
        }
        if (aA.llIlIlIllIIlII(lllllllllllllllIlllIIIlIIIIIIlll.size(), lIlIIIlIIIlI[3])) {
            WorldPoint lllllllllllllllIlllIIIlIIIIIIllI = ((NPC)lllllllllllllllIlllIIIlIIIIIIlll.get(lIlIIIlIIIlI[1])).getWorldLocation();
            WorldPoint lllllllllllllllIlllIIIlIIIIIIlIl = ((NPC)lllllllllllllllIlllIIIlIIIIIIlll.get(lIlIIIlIIIlI[2])).getWorldLocation();
            System.out.println(lIlIIIIllIlI[lIlIIIlIIIlI[2]]);
            if (!aA.llIlIlIllIIlll(lllllllllllllllIlllIIIlIIIIIIllI.getWorldX(), lllllllllllllllIlllIIIlIIIIIIlIl.getWorldX()) || aA.llIlIlIllIlIII(lllllllllllllllIlllIIIlIIIIIIllI.getWorldY(), lllllllllllllllIlllIIIlIIIIIIlIl.getWorldY())) {
                return new WorldArea(lllllllllllllllIlllIIIlIIIIIIllI.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lllllllllllllllIlllIIIlIIIIIIlIl.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
            }
            return new WorldArea(lllllllllllllllIlllIIIlIIIIIIlIl.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lllllllllllllllIlllIIIlIIIIIIllI.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
        }
        return new WorldArea(((NPC)list.get(lIlIIIlIIIlI[1])).getWorldLocation().dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lIlIIIlIIIlI[7], lIlIIIlIIIlI[7]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aA lllllllllllllllIlllIIIlIIIIIIIII;
        void lllllllllllllllIlllIIIIlllllllll;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[7]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (-1 <= 2) return n2 != 0;
                    return ((37 + 82 - 67 + 104 ^ 160 + 75 - 194 + 140) & (109 + 89 - 63 + 0 ^ 165 + 128 - 164 + 45 ^ -1)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return null;
        }
        if (aA.llIlIlIllIIlIl(lllllllllllllllIlllIIIIlllllllll.getWorldLocation().distanceTo((Locatable)lllllllllllllllIlllIIIlIIIIIIIII.bS), lIlIIIlIIIlI[8])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static boolean llIlIlIllIlIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aA lllllllllllllllIlllIIIIlllllllII;
        if (aA.llIlIlIllIIIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aA.llIlIlIllIlIlI(Movement.getDestination()) && aA.llIlIlIllIIIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIlIIIlI[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIIIlllllllII.al.bs);
            return lIlIIIlIIIlI[2];
        }
        TileObject lllllllllllllllIlllIIIIllllllIll = lllllllllllllllIlllIIIIlllllllII.cR();
        if (aA.llIlIlIllIIIII(lllllllllllllllIlllIIIIllllllIll)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIIIlllllllII.ak.bq.dx(lIlIIIlIIIlI[9]).dy(lIlIIIlIIIlI[9]));
            return lIlIIIlIIIlI[2];
        }
        if (!aA.llIlIlIllIIllI(lllllllllllllllIlllIIIIlllllllII.bS.isMoving() ? 1 : 0) || aA.llIlIlIllIIIlI(lllllllllllllllIlllIIIIlllllllII.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIlIIIlI[1];
        }
        var1_1.interact(lIlIIIIllIlI[lIlIIIlIIIlI[3]]);
        return lIlIIIlIIIlI[2];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.llIlIlIllIIIlI(tileObject.getName().equals(lIlIIIIllIlI[lIlIIIlIIIlI[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[4]];
                if (aA.llIlIlIllIIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && aA.llIlIlIllIIIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x55 ^ 0x37) & ~(0xC1 ^ 0xA3)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
    }

    private WorldPoint cQ() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[11]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (-1 < 0) return n2 != 0;
                    return ((0x89 ^ 0xBD) & ~(0x34 ^ 0)) != 0;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        WorldArea worldArea = this.cP();
        List list = worldArea.getMeleeTiles(this.cq);
        WorldPoint worldPoint2 = list.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(worldPoint -> worldPoint.distanceToHypotenuse(nPC2.getWorldLocation()))).orElse(null);
        return worldPoint2;
    }

    private static String llIlIlIlIIIIll(String lllllllllllllllIlllIIIIlllIlIIlI, String lllllllllllllllIlllIIIIlllIlIIIl) {
        lllllllllllllllIlllIIIIlllIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIlllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIIIIlllIlIlII = lllllllllllllllIlllIIIIlllIlIIIl.toCharArray();
        int lllllllllllllllIlllIIIIlllIlIIll = lIlIIIlIIIlI[1];
        char[] lllllllllllllllIlllIIIIlllIIllIl = lllllllllllllllIlllIIIIlllIlIIlI.toCharArray();
        int lllllllllllllllIlllIIIIlllIIllII = lllllllllllllllIlllIIIIlllIIllIl.length;
        int lllllllllllllllIlllIIIIlllIIlIll = lIlIIIlIIIlI[1];
        while (aA.llIlIlIllIlIII(lllllllllllllllIlllIIIIlllIIlIll, lllllllllllllllIlllIIIIlllIIllII)) {
            char lllllllllllllllIlllIIIIlllIllIII = lllllllllllllllIlllIIIIlllIIllIl[lllllllllllllllIlllIIIIlllIIlIll];
            lllllllllllllllIlllIIIIlllIlIlIl.append((char)(lllllllllllllllIlllIIIIlllIllIII ^ lllllllllllllllIlllIIIIlllIlIlII[lllllllllllllllIlllIIIIlllIlIIll % lllllllllllllllIlllIIIIlllIlIlII.length]));
            0;
            ++lllllllllllllllIlllIIIIlllIlIIll;
            ++lllllllllllllllIlllIIIIlllIIlIll;
            0;
            if (((131 + 87 - 167 + 151 ^ 91 + 18 - 14 + 47) & (185 + 60 - 107 + 71 ^ 86 + 129 - 185 + 119 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIIIlllIlIlIl);
    }

    private static boolean llIlIlIllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIllIIllI(int n2) {
        return n2 == 0;
    }
}

