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

/* TASK: Guardians -> GuardiansTask */
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

    private static String llIlIlIlIIIIlI(String var16, String var32) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIIlI[11]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIlIIIlIIIlI[3], var14);
            return new String(var8.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_3;
        void var4;
        aA var10;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[15]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (((0xC3 ^ 0x81) & ~(0x83 ^ 0xC1)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return this.cS();
        }
        if (aA.llIlIlIllIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.THIRD) && aA.llIlIlIllIIIlI(var10.cj().isFullyEquipped() ? 1 : 0)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            return lIlIIIlIIIlI[2];
        }
        int var19 = var10.cq.getTickCount();
        WorldPoint var17 = var10.cQ();
        if (aA.llIlIlIllIIIll(var10.bS.distanceTo(var17), lIlIIIlIIIlI[2])) {
            var10.dA += lIlIIIlIIIlI[2];
            if (aA.llIlIlIllIIlII(var10.dA, lIlIIIlIIIlI[3])) {
                List var5 = var10.bS.getWorldLocation().createWorldArea(lIlIIIlIIIlI[2]).toWorldPointList();
                WorldPoint var1 = var5.stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).min(Comparator.comparingDouble(arg_0 -> aA.a((NPC)var4, arg_0)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(this.bS.getWorldLocation()))).orElse(null);
                Movement.setDestination((WorldPoint)var1);
                return lIlIIIlIIIlI[2];
            }
            if (aA.llIlIlIllIIlIl(var10.dA, lIlIIIlIIIlI[3]) && aA.llIlIlIllIIlIl(var19 - var10.dB, lIlIIIlIIIlI[4])) {
                var10.dB = var19;
                var4.interact(lIlIIIIllIlI[lIlIIIlIIIlI[1]]);
                return lIlIIIlIIIlI[2];
            }
            return lIlIIIlIIIlI[2];
        }
        var10.dA = lIlIIIlIIIlI[1];
        if (aA.llIlIlIllIIIlI(var4.getWorldArea().isInMeleeDistance(var10.bS.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var17);
            return lIlIIIlIIIlI[2];
        }
        if (aA.llIlIlIllIIIlI(var10.bS.getWorldLocation().equals((Object)var17) ? 1 : 0)) {
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

    private static String llIlIlIlIIIlII(String var15, String var7) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIlIIIlIIIlI[3], var31);
            return new String(var25.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
        void var21;
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
        if (aA.llIlIlIllIIlII(var21.size(), lIlIIIlIIIlI[3])) {
            WorldPoint var22 = ((NPC)var21.get(lIlIIIlIIIlI[1])).getWorldLocation();
            WorldPoint var29 = ((NPC)var21.get(lIlIIIlIIIlI[2])).getWorldLocation();
            System.out.println(lIlIIIIllIlI[lIlIIIlIIIlI[2]]);
            if (!aA.llIlIlIllIIlll(var22.getWorldX(), var29.getWorldX()) || aA.llIlIlIllIlIII(var22.getWorldY(), var29.getWorldY())) {
                return new WorldArea(var22.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), var29.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
            }
            return new WorldArea(var29.dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), var22.dx(lIlIIIlIIIlI[6]).dy(lIlIIIlIIIlI[6]));
        }
        return new WorldArea(((NPC)list.get(lIlIIIlIIIlI[1])).getWorldLocation().dx(lIlIIIlIIIlI[5]).dy(lIlIIIlIIIlI[5]), lIlIIIlIIIlI[7], lIlIIIlIIIlI[7]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aA var20;
        void var11;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aA.llIlIlIllIIIlI(nPC.getName().contains(lIlIIIIllIlI[lIlIIIlIIIlI[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIlI[2]];
                stringArray[aA.lIlIIIlIIIlI[1]] = lIlIIIIllIlI[lIlIIIlIIIlI[7]];
                if (aA.llIlIlIllIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIlI[2];
                    0;
                    if (-1 <= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIlI[1];
            return n2 != 0;
        });
        if (aA.llIlIlIllIIIII(nPC2)) {
            return null;
        }
        if (aA.llIlIlIllIIlIl(var11.getWorldLocation().distanceTo((Locatable)var20.bS), lIlIIIlIIIlI[8])) {
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
        aA var18;
        if (aA.llIlIlIllIIIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aA.llIlIlIllIlIlI(Movement.getDestination()) && aA.llIlIlIllIIIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIlIIIlI[1];
            }
            Movement.setDestination((WorldPoint)var18.al.bs);
            return lIlIIIlIIIlI[2];
        }
        TileObject var9 = var18.cR();
        if (aA.llIlIlIllIIIII(var9)) {
            Movement.setDestination((WorldPoint)var18.ak.bq.dx(lIlIIIlIIIlI[9]).dy(lIlIIIlIIIlI[9]));
            return lIlIIIlIIIlI[2];
        }
        if (!aA.llIlIlIllIIllI(var18.bS.isMoving() ? 1 : 0) || aA.llIlIlIllIIIlI(var18.bS.isAnimating() ? 1 : 0)) {
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
                    return false;
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
                    return false;
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

    private static String llIlIlIlIIIIll(String var23, String var13) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var13.toCharArray();
        int var2 = lIlIIIlIIIlI[1];
        char[] var24 = var23.toCharArray();
        int var28 = var24.length;
        int var3 = lIlIIIlIIIlI[1];
        while (aA.llIlIlIllIlIII(var3, var28)) {
            char var12 = var24[var3];
            var26.append((char)(var12 ^ var27[var2 % var27.length]));
            0;
            ++var2;
            ++var3;
            0;
            if (((131 + 87 - 167 + 151 ^ 91 + 18 - 14 + 47) & (185 + 60 - 107 + 71 ^ 86 + 129 - 185 + 119 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static boolean llIlIlIllIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIllIIllI(int n2) {
        return n2 == 0;
    }
}

