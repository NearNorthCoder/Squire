/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.j_Unknown;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class V_Unknown
implements S {
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ WorldArea ja;
    private static /* synthetic */ String[] lllllIlIIl;
    public static /* synthetic */ WorldArea jc;
    public static /* synthetic */ int[] iZ;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ WorldArea jb;
    public static /* synthetic */ WorldPoint je;
    public static /* synthetic */ WorldPoint jd;
    private static /* synthetic */ int[] lllllIlIlI;
    public static /* synthetic */ WorldPoint bw;

    private static String llIlIlIIIIIlI(String var8, String var20) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var23 = var20.toCharArray();
        int var12 = lllllIlIlI[0];
        char[] var9 = var8.toCharArray();
        int var4 = var9.length;
        int var15 = lllllIlIlI[0];
        while (V.llIlIlIIIIlll(var15, var4)) {
            char var19 = var9[var15];
            var14.append((char)(var19 ^ var23[var12 % var23.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static void Z() {
        if (V.llIlIlIIIlIII(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[21]];
            Movement.walkTo((WorldPoint)bw);
            0;
            Time.sleepTicks((int)lllllIlIlI[1]);
            0;
        }
        if (V.llIlIlIIIIllI(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[22]];
            if (V.llIlIlIIIllIl(Players.getLocal().getInteracting())) {
                NPC var6 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (V.llIlIlIIIIllI(nPC.getName().contains(lllllIlIIl[lllllIlIlI[60]]) ? 1 : 0) && V.llIlIlIIIllIl(nPC.getInteracting()) && V.llIlIlIIIlIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIlIlI[1];
                        0;
                        if (((0x33 ^ 0x64 ^ (0 ^ 0x4D)) & (217 + 21 - 209 + 189 ^ 59 + 8 - -48 + 77 ^ -1)) > 1) {
                            return ((13 + 86 - -84 + 2 ^ 66 + 21 - -24 + 18) & (0x87 ^ 0x88 ^ (0x86 ^ 0xB1) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllllIlIlI[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lllllIlIlI[4]];
                stringArray[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[23]];
                stringArray[V.lllllIlIlI[1]] = lllllIlIIl[lllllIlIlI[24]];
                List var24 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (V.llIlIlIIlIIII(nPC.getInteracting(), Players.getLocal())) {
                        bl = lllllIlIlI[1];
                        0;
                        if (2 < -1) {
                            return false;
                        }
                    } else {
                        bl = lllllIlIlI[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (V.llIlIlIIIlIII(var24.isEmpty() ? 1 : 0)) {
                    ((NPC)var24.get(lllllIlIlI[0])).interact(lllllIlIIl[lllllIlIlI[25]]);
                    Time.sleepTicks((int)lllllIlIlI[4]);
                    0;
                }
                if (V.llIlIlIIIlIlI(var6) && V.llIlIlIIIlIII(Players.getLocal().isMoving() ? 1 : 0) && V.llIlIlIIIIllI(var24.isEmpty() ? 1 : 0)) {
                    var6.interact(lllllIlIIl[lllllIlIlI[26]]);
                    Time.sleepTicks((int)lllllIlIlI[4]);
                    0;
                }
            }
            if (V.llIlIlIIIlIlI(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lllllIlIlI[7]);
                0;
            }
        }
    }

    private static boolean llIlIlIIIlIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlIIIllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIlIIIllIl(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            V.dz();
            0;
        }
        catch (Exception var11) {
            var11.printStackTrace();
        }
        if (-3 >= 0) {
            return (140 + 82 - 118 + 79 ^ 129 + 77 - 144 + 68) & (39 + 151 - 182 + 162 ^ 85 + 95 - 105 + 84 ^ -1);
        }
        return lllllIlIlI[0];
    }

    static {
        V.llIlIlIIIIlII();
        V.llIlIlIIIIIll();
        bu = new ArrayList<d>();
        int[] nArray = new int[lllllIlIlI[19]];
        nArray[V.lllllIlIlI[0]] = lllllIlIlI[17];
        nArray[V.lllllIlIlI[1]] = lllllIlIlI[18];
        nArray[V.lllllIlIlI[4]] = lllllIlIlI[44];
        nArray[V.lllllIlIlI[5]] = lllllIlIlI[45];
        nArray[V.lllllIlIlI[7]] = lllllIlIlI[42];
        nArray[V.lllllIlIlI[11]] = lllllIlIlI[47];
        nArray[V.lllllIlIlI[15]] = lllllIlIlI[49];
        nArray[V.lllllIlIlI[16]] = lllllIlIlI[51];
        iZ = nArray;
        ja = new WorldArea(lllllIlIlI[61], lllllIlIlI[62], lllllIlIlI[23], lllllIlIlI[23], lllllIlIlI[0]);
        jb = new WorldArea(lllllIlIlI[63], lllllIlIlI[64], lllllIlIlI[33], lllllIlIlI[27], lllllIlIlI[0]);
        jc = new WorldArea(lllllIlIlI[65], lllllIlIlI[66], lllllIlIlI[67], lllllIlIlI[2], lllllIlIlI[0]);
        jd = new WorldPoint(lllllIlIlI[68], lllllIlIlI[69], lllllIlIlI[0]);
        bw = new WorldPoint(lllllIlIlI[70], lllllIlIlI[62], lllllIlIlI[0]);
        je = new WorldPoint(lllllIlIlI[71], lllllIlIlI[72], lllllIlIlI[0]);
    }

    private static boolean llIlIlIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void dz() {
        block17: {
            block19: {
                block18: {
                    if (V.llIlIlIIIIllI(bs ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[0]];
                        b.a(bu);
                        if (V.llIlIlIIIIlll(bu.size(), lllllIlIlI[1])) {
                            System.out.println(lllllIlIIl[lllllIlIlI[1]]);
                            bs = lllllIlIlI[0];
                        }
                    }
                    if (!V.llIlIlIIIlIII(bs ? 1 : 0)) break block17;
                    if (V.llIlIlIIIlIII(V.bz() ? 1 : 0) && (!V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[2]) || !V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[3]) || V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[3]))) {
                        BankLocation var13 = BankLocation.getNearest();
                        if (V.llIlIlIIIlIlI(var13) && V.llIlIlIIIlIII(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[4]];
                            a.a(var13);
                        }
                        if (V.llIlIlIIIlIlI(var13) && V.llIlIlIIIIllI(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[5]];
                            if (V.llIlIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIlIlI[6]);
                                0;
                            }
                            if (V.llIlIlIIIIllI(Bank.isOpen() ? 1 : 0)) {
                                if (V.llIlIlIIIlIll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllllIlIlI[1]);
                                    0;
                                }
                                if (V.llIlIlIIIlIll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllllIlIlI[4]);
                                    0;
                                }
                                if (V.llIlIlIIIlIII(V.dB() ? 1 : 0)) {
                                    V.ae();
                                    System.out.println(lllllIlIIl[lllllIlIlI[7]]);
                                    bs = lllllIlIlI[1];
                                    return;
                                }
                                a.a(iZ, lllllIlIlI[1]);
                                a.a(lllllIlIlI[8], lllllIlIlI[9]);
                                a.b(f.aU, lllllIlIlI[1]);
                                a.a(lllllIlIlI[10], lllllIlIlI[11]);
                                a.a(lllllIlIlI[12], lllllIlIlI[13]);
                            }
                        }
                    }
                    if (!V.llIlIlIIIIllI(V.bz() ? 1 : 0)) break block17;
                    V.dA();
                    if (V.llIlIlIIIlIIl(Movement.getRunEnergy(), lllllIlIlI[14]) && V.llIlIlIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lllllIlIlI[1]];
                    stringArray[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[11]];
                    if (!V.llIlIlIIIlIII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lllllIlIlI[1]];
                    stringArray2[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[15]];
                    if (!V.llIlIlIIIlIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lllllIlIlI[1]];
                    stringArray3[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[16]];
                    if (!V.llIlIlIIIlIII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lllllIlIlI[1]];
                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[17];
                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lllllIlIlI[1]];
                    nArray2[V.lllllIlIlI[0]] = lllllIlIlI[18];
                    if (!V.llIlIlIIIIllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                V.dC();
            }
            if (V.llIlIlIIIllII(V.llIlIlIIIIlIl(e.u(), 45.0))) {
                int[] nArray = new int[lllllIlIlI[1]];
                nArray[V.lllllIlIlI[0]] = lllllIlIlI[12];
                if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllllIlIlI[1]];
                    nArray3[V.lllllIlIlI[0]] = lllllIlIlI[12];
                    Inventory.getFirst((int[])nArray3).interact(lllllIlIIl[lllllIlIlI[19]]);
                    Time.sleepTicks((int)lllllIlIlI[1]);
                    0;
                }
            }
            if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[20])) {
                j.Q();
            }
        }
    }

    private static boolean llIlIlIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIlIIIIIIl(String var3, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllllIlIlI[19]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllllIlIlI[4], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lllllIlIlI[0];
    }

    private static boolean llIlIlIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bz() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[39])) break block8;
                                                                            int[] nArray = new int[lllllIlIlI[1]];
                                                                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[18];
                                                                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lllllIlIlI[1]];
                                                                            nArray2[V.lllllIlIlI[0]] = lllllIlIlI[18];
                                                                            if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lllllIlIlI[1]];
                                                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                                                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lllllIlIlI[1]];
                                                                        nArray3[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                                                        if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lllllIlIlI[1]];
                                                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lllllIlIlI[1]];
                                                                    nArray4[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                                                    if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lllllIlIlI[1]];
                                                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                                                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lllllIlIlI[1]];
                                                                nArray5[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                                                if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lllllIlIlI[1]];
                                                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[47];
                                                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lllllIlIlI[1]];
                                                            nArray6[V.lllllIlIlI[0]] = lllllIlIlI[47];
                                                            if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lllllIlIlI[1]];
                                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[49];
                                                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lllllIlIlI[1]];
                                                        nArray7[V.lllllIlIlI[0]] = lllllIlIlI[49];
                                                        if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lllllIlIlI[1]];
                                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[51];
                                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lllllIlIlI[1]];
                                                    nArray8[V.lllllIlIlI[0]] = lllllIlIlI[51];
                                                    if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lllllIlIlI[1]];
                                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[12];
                                                if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lllllIlIlI[1];
                                                    0;
                                                    if (2 >= 0) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = lllllIlIlI[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lllllIlIlI[1]];
                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[17];
                                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lllllIlIlI[1]];
                                        nArray9[V.lllllIlIlI[0]] = lllllIlIlI[17];
                                        if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lllllIlIlI[1]];
                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lllllIlIlI[1]];
                                    nArray10[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                    if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lllllIlIlI[1]];
                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lllllIlIlI[1]];
                                nArray11[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lllllIlIlI[1]];
                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[42];
                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lllllIlIlI[1]];
                            nArray12[V.lllllIlIlI[0]] = lllllIlIlI[42];
                            if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lllllIlIlI[1]];
                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[47];
                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lllllIlIlI[1]];
                        nArray13[V.lllllIlIlI[0]] = lllllIlIlI[47];
                        if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lllllIlIlI[1]];
                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[49];
                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lllllIlIlI[1]];
                    nArray14[V.lllllIlIlI[0]] = lllllIlIlI[49];
                    if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lllllIlIlI[1]];
                nArray[V.lllllIlIlI[0]] = lllllIlIlI[51];
                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lllllIlIlI[1]];
                nArray15[V.lllllIlIlI[0]] = lllllIlIlI[51];
                if (!V.llIlIlIIIIllI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lllllIlIlI[1]];
            nArray[V.lllllIlIlI[0]] = lllllIlIlI[12];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllllIlIlI[1];
                0;
                if (-(0x4F ^ 0x31 ^ (0x38 ^ 0x43)) < 0) return n2 != 0;
                return ((0x3F ^ 0x3B ^ (0x5A ^ 0x52)) & (131 + 102 - 161 + 77 ^ 140 + 144 - 262 + 131 ^ -1)) != 0;
            }
        }
        n2 = lllllIlIlI[0];
        return n2 != 0;
    }

    private static String llIlIlIIIIIII(String var22, String var10) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lllllIlIlI[4], var18);
            return new String(var21.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIIIIIll() {
        lllllIlIIl = new String[lllllIlIlI[73]];
        V.lllllIlIIl[V.lllllIlIlI[0]] = V."Buying items";
        V.lllllIlIIl[V.lllllIlIlI[1]] = V."Finished buying items, switching back to melee training";
        V.lllllIlIIl[V.lllllIlIlI[4]] = V."Navigating to bank";
        V.lllllIlIIl[V.lllllIlIlI[5]] = V."Handling banking";
        V.lllllIlIIl[V.lllllIlIlI[7]] = V."We are missing supplies, switching to BUYING";
        V.lllllIlIIl[V.lllllIlIlI[11]] = V."Iron scimitar";
        V.lllllIlIIl[V.lllllIlIlI[15]] = V."Steel scimitar";
        V.lllllIlIIl[V.lllllIlIlI[16]] = V."Mithril scimitar";
        V.lllllIlIIl[V.lllllIlIlI[19]] = V."Eat";
        V.lllllIlIIl[V.lllllIlIlI[21]] = V."Walking to cow area";
        V.lllllIlIIl[V.lllllIlIlI[22]] = V."Killing cows";
        V.lllllIlIIl[V.lllllIlIlI[23]] = V."Cow";
        V.lllllIlIIl[V.lllllIlIlI[24]] = V."cow";
        V.lllllIlIIl[V.lllllIlIlI[25]] = V."Attack";
        V.lllllIlIIl[V.lllllIlIlI[26]] = V."Attack";
        V.lllllIlIIl[V.lllllIlIlI[14]] = V."Toggle auto retaliate";
        V.lllllIlIIl[V.lllllIlIlI[27]] = V."Auto retaliate";
        V.lllllIlIIl[V.lllllIlIlI[28]] = V."";
        V.lllllIlIIl[V.lllllIlIlI[31]] = V."Iron scimitar";
        V.lllllIlIIl[V.lllllIlIlI[32]] = V."Iron scimitar";
        V.lllllIlIIl[V.lllllIlIlI[20]] = V."Wield";
        V.lllllIlIIl[V.lllllIlIlI[33]] = V."Steel scimitar";
        V.lllllIlIIl[V.lllllIlIlI[34]] = V."Steel scimitar";
        V.lllllIlIIl[V.lllllIlIlI[35]] = V."Wield";
        V.lllllIlIIl[V.lllllIlIlI[36]] = V."Mithril scimitar";
        V.lllllIlIIl[V.lllllIlIlI[37]] = V."Mithril scimitar";
        V.lllllIlIIl[V.lllllIlIlI[38]] = V."Wield";
        V.lllllIlIIl[V.lllllIlIlI[40]] = V."Wield";
        V.lllllIlIIl[V.lllllIlIlI[41]] = V."Wield";
        V.lllllIlIIl[V.lllllIlIlI[43]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[2]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[46]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[48]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[50]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[52]] = V."Wear";
        V.lllllIlIIl[V.lllllIlIlI[59]] = V."40 Str";
        V.lllllIlIIl[V.lllllIlIlI[60]] = V."Cow";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[39])) {
            bl = lllllIlIlI[1];
            0;
            if ((7 ^ 3) <= 0) {
                return false;
            }
        } else {
            bl = lllllIlIlI[0];
        }
        return bl;
    }

    public static void dA() {
        if (V.llIlIlIIIlllI(Static.getClient().getVar(lllllIlIlI[23]), lllllIlIlI[1])) {
            AccBuilderTempleTrek.c = lllllIlIIl[lllllIlIlI[14]];
            Static.getClient().invokeMenuAction(lllllIlIIl[lllllIlIlI[27]], lllllIlIIl[lllllIlIlI[28]], lllllIlIlI[1], MenuAction.CC_OP.getId(), lllllIlIlI[29], lllllIlIlI[30]);
        }
        if (V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[11])) {
            String[] stringArray = new String[lllllIlIlI[1]];
            stringArray[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[31]];
            if (V.llIlIlIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllllIlIlI[1]];
                stringArray2[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[32]];
                Inventory.getFirst((String[])stringArray2).interact(lllllIlIIl[lllllIlIlI[20]]);
            }
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[11]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20])) {
            String[] stringArray = new String[lllllIlIlI[1]];
            stringArray[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[33]];
            if (V.llIlIlIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lllllIlIlI[1]];
                stringArray3[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[34]];
                Inventory.getFirst((String[])stringArray3).interact(lllllIlIIl[lllllIlIlI[35]]);
            }
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[2])) {
            String[] stringArray = new String[lllllIlIlI[1]];
            stringArray[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[36]];
            if (V.llIlIlIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lllllIlIlI[1]];
                stringArray4[V.lllllIlIlI[0]] = lllllIlIIl[lllllIlIlI[37]];
                Inventory.getFirst((String[])stringArray4).interact(lllllIlIIl[lllllIlIlI[38]]);
            }
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[2]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[39])) {
            int[] nArray = new int[lllllIlIlI[1]];
            nArray[V.lllllIlIlI[0]] = lllllIlIlI[17];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIlIlI[1]];
                nArray2[V.lllllIlIlI[0]] = lllllIlIlI[17];
                Inventory.getFirst((int[])nArray2).interact(lllllIlIIl[lllllIlIlI[40]]);
            }
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[39])) {
            int[] nArray = new int[lllllIlIlI[1]];
            nArray[V.lllllIlIlI[0]] = lllllIlIlI[18];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllllIlIlI[1]];
                nArray3[V.lllllIlIlI[0]] = lllllIlIlI[18];
                Inventory.getFirst((int[])nArray3).interact(lllllIlIIl[lllllIlIlI[41]]);
            }
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[2])) {
            int[] nArray = new int[lllllIlIlI[1]];
            nArray[V.lllllIlIlI[0]] = lllllIlIlI[42];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllllIlIlI[1]];
                nArray4[V.lllllIlIlI[0]] = lllllIlIlI[42];
                Inventory.getFirst((int[])nArray4).interact(lllllIlIIl[lllllIlIlI[43]]);
            }
            int[] nArray5 = new int[lllllIlIlI[1]];
            nArray5[V.lllllIlIlI[0]] = lllllIlIlI[44];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllllIlIlI[1]];
                nArray6[V.lllllIlIlI[0]] = lllllIlIlI[44];
                Inventory.getFirst((int[])nArray6).interact(lllllIlIIl[lllllIlIlI[2]]);
            }
            int[] nArray7 = new int[lllllIlIlI[1]];
            nArray7[V.lllllIlIlI[0]] = lllllIlIlI[45];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lllllIlIlI[1]];
                nArray8[V.lllllIlIlI[0]] = lllllIlIlI[45];
                Inventory.getFirst((int[])nArray8).interact(lllllIlIIl[lllllIlIlI[46]]);
            }
            int[] nArray9 = new int[lllllIlIlI[1]];
            nArray9[V.lllllIlIlI[0]] = lllllIlIlI[47];
            if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lllllIlIlI[1]];
                nArray10[V.lllllIlIlI[0]] = lllllIlIlI[47];
                Inventory.getFirst((int[])nArray10).interact(lllllIlIIl[lllllIlIlI[48]]);
            }
        }
        int[] nArray = new int[lllllIlIlI[1]];
        nArray[V.lllllIlIlI[0]] = lllllIlIlI[49];
        if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lllllIlIlI[1]];
            nArray11[V.lllllIlIlI[0]] = lllllIlIlI[49];
            Inventory.getFirst((int[])nArray11).interact(lllllIlIIl[lllllIlIlI[50]]);
        }
        int[] nArray12 = new int[lllllIlIlI[1]];
        nArray12[V.lllllIlIlI[0]] = lllllIlIlI[51];
        if (V.llIlIlIIIIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllllIlIlI[1]];
            nArray13[V.lllllIlIlI[0]] = lllllIlIlI[51];
            Inventory.getFirst((int[])nArray13).interact(lllllIlIIl[lllllIlIlI[52]]);
        }
    }

    private static int llIlIlIIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean dB() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[39])) break block4;
                                                                                    int[] nArray = new int[lllllIlIlI[1]];
                                                                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[18];
                                                                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lllllIlIlI[1]];
                                                                                    nArray2[V.lllllIlIlI[0]] = lllllIlIlI[18];
                                                                                    if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lllllIlIlI[1]];
                                                                                    nArray3[V.lllllIlIlI[0]] = lllllIlIlI[18];
                                                                                    if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lllllIlIlI[1]];
                                                                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                                                                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lllllIlIlI[1]];
                                                                                nArray4[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                                                                if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lllllIlIlI[1]];
                                                                                nArray5[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                                                                if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lllllIlIlI[1]];
                                                                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                                                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lllllIlIlI[1]];
                                                                            nArray6[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                                                            if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lllllIlIlI[1]];
                                                                            nArray7[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                                                            if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lllllIlIlI[1]];
                                                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                                                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lllllIlIlI[1]];
                                                                        nArray8[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                                                        if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lllllIlIlI[1]];
                                                                        nArray9[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                                                        if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lllllIlIlI[1]];
                                                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[47];
                                                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lllllIlIlI[1]];
                                                                    nArray10[V.lllllIlIlI[0]] = lllllIlIlI[47];
                                                                    if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lllllIlIlI[1]];
                                                                    nArray11[V.lllllIlIlI[0]] = lllllIlIlI[47];
                                                                    if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lllllIlIlI[1]];
                                                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[49];
                                                                if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lllllIlIlI[1]];
                                                                nArray12[V.lllllIlIlI[0]] = lllllIlIlI[49];
                                                                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lllllIlIlI[1]];
                                                                nArray13[V.lllllIlIlI[0]] = lllllIlIlI[49];
                                                                if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lllllIlIlI[1]];
                                                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[51];
                                                            if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lllllIlIlI[1]];
                                                            nArray14[V.lllllIlIlI[0]] = lllllIlIlI[51];
                                                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lllllIlIlI[1]];
                                                            nArray15[V.lllllIlIlI[0]] = lllllIlIlI[51];
                                                            if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lllllIlIlI[1]];
                                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[12];
                                                        if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lllllIlIlI[1]];
                                                        nArray16[V.lllllIlIlI[0]] = lllllIlIlI[12];
                                                        if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lllllIlIlI[1];
                                                    0;
                                                    if (null == null) return n3 != 0;
                                                    return ((0xB5 ^ 0xBB ^ (0x15 ^ 0x2E)) & (0xD4 ^ 0xB2 ^ (0x64 ^ 0x37) ^ -1)) != 0;
                                                }
                                                n3 = lllllIlIlI[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lllllIlIlI[1]];
                                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[17];
                                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lllllIlIlI[1]];
                                            nArray17[V.lllllIlIlI[0]] = lllllIlIlI[17];
                                            if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lllllIlIlI[1]];
                                            nArray18[V.lllllIlIlI[0]] = lllllIlIlI[17];
                                            if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lllllIlIlI[1]];
                                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lllllIlIlI[1]];
                                        nArray19[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                        if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lllllIlIlI[1]];
                                        nArray20[V.lllllIlIlI[0]] = lllllIlIlI[44];
                                        if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lllllIlIlI[1]];
                                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lllllIlIlI[1]];
                                    nArray21[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                    if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lllllIlIlI[1]];
                                    nArray22[V.lllllIlIlI[0]] = lllllIlIlI[45];
                                    if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lllllIlIlI[1]];
                                nArray[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lllllIlIlI[1]];
                                nArray23[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lllllIlIlI[1]];
                                nArray24[V.lllllIlIlI[0]] = lllllIlIlI[42];
                                if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lllllIlIlI[1]];
                            nArray[V.lllllIlIlI[0]] = lllllIlIlI[47];
                            if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lllllIlIlI[1]];
                            nArray25[V.lllllIlIlI[0]] = lllllIlIlI[47];
                            if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lllllIlIlI[1]];
                            nArray26[V.lllllIlIlI[0]] = lllllIlIlI[47];
                            if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lllllIlIlI[1]];
                        nArray[V.lllllIlIlI[0]] = lllllIlIlI[49];
                        if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lllllIlIlI[1]];
                        nArray27[V.lllllIlIlI[0]] = lllllIlIlI[49];
                        if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lllllIlIlI[1]];
                        nArray28[V.lllllIlIlI[0]] = lllllIlIlI[49];
                        if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lllllIlIlI[1]];
                    nArray[V.lllllIlIlI[0]] = lllllIlIlI[51];
                    if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lllllIlIlI[1]];
                    nArray29[V.lllllIlIlI[0]] = lllllIlIlI[51];
                    if (!V.llIlIlIIIlIII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lllllIlIlI[1]];
                    nArray30[V.lllllIlIlI[0]] = lllllIlIlI[51];
                    if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lllllIlIlI[1]];
                nArray[V.lllllIlIlI[0]] = lllllIlIlI[12];
                if (!V.llIlIlIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lllllIlIlI[1]];
                nArray31[V.lllllIlIlI[0]] = lllllIlIlI[12];
                if (!V.llIlIlIIIIllI(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lllllIlIlI[1];
            0;
            if (3 != 0) return n2 != 0;
            return ((0xA6 ^ 0xB0 ^ (0xDB ^ 0x8E)) & (7 + 30 - -5 + 171 ^ 145 + 14 - 55 + 46 ^ -1)) != 0;
        }
        n2 = lllllIlIlI[0];
        return n2 != 0;
    }

    private static void llIlIlIIIIlII() {
        lllllIlIlI = new int[74];
        V.lllllIlIlI[0] = (74 + 65 - 111 + 214 ^ 45 + 118 - 54 + 67) & (0xAE ^ 0x85 ^ (7 ^ 0x6E) ^ -1);
        V.lllllIlIlI[1] = 1;
        V.lllllIlIlI[2] = 75 + 81 - 120 + 105 ^ 113 + 78 - 137 + 93;
        V.lllllIlIlI[3] = 0x54 ^ 0x66;
        V.lllllIlIlI[4] = 2;
        V.lllllIlIlI[5] = 3;
        V.lllllIlIlI[6] = -(0xFFFFEFEE & 0x7037) & (0xFFFFFFED & 0x73BF);
        V.lllllIlIlI[7] = 5 ^ 0x48 ^ (0xE6 ^ 0xAF);
        V.lllllIlIlI[8] = -(0xFFFFEDFF & 0x7611) & (0xFFFFE7F3 & Short.MAX_VALUE);
        V.lllllIlIlI[9] = -(0xFFFFA92D & 0x7ED7) & (0xFFFFFBFE & 0x2FED);
        V.lllllIlIlI[10] = -(0xFFFFF2AB & 0x6D7D) & (0xFFFFFFFF & 0x7F6F);
        V.lllllIlIlI[11] = 0xAD ^ 0xA8;
        V.lllllIlIlI[12] = -(0xFFFFFE2B & 0x7BD5) & (0xFFFFFF7B & 0x7BFF);
        V.lllllIlIlI[13] = 113 + 60 - 47 + 104 ^ 39 + 52 - -11 + 28;
        V.lllllIlIlI[14] = 65 + 105 - 57 + 69 ^ 137 + 134 - 224 + 138;
        V.lllllIlIlI[15] = 0xAD ^ 0x8C ^ (9 ^ 0x2E);
        V.lllllIlIlI[16] = 74 + 87 - 133 + 99 ^ (0xEB ^ 0x93);
        V.lllllIlIlI[17] = 0xFFFFFF33 & 0x5FF;
        V.lllllIlIlI[18] = -(0xFFFFF2AF & 0x7D53) & (0xFFFFF7BF & 0x7D77);
        V.lllllIlIlI[19] = 0x7B ^ 0x73;
        V.lllllIlIlI[20] = 0x92 ^ 0x8E ^ (0x44 ^ 0x4C);
        V.lllllIlIlI[21] = 0x28 ^ 0x32 ^ (0xA2 ^ 0xB1);
        V.lllllIlIlI[22] = 0x99 ^ 0x93;
        V.lllllIlIlI[23] = 0x8F ^ 0x84;
        V.lllllIlIlI[24] = 86 + 126 - 49 + 0 ^ 126 + 129 - 175 + 95;
        V.lllllIlIlI[25] = 0x5F ^ 6 ^ (0x14 ^ 0x40);
        V.lllllIlIlI[26] = 118 + 15 - 96 + 107 ^ 45 + 114 - 71 + 70;
        V.lllllIlIlI[27] = 0x5B ^ 0x44 ^ (0x7E ^ 0x71);
        V.lllllIlIlI[28] = 0x7A ^ 0x6B;
        V.lllllIlIlI[29] = -1;
        V.lllllIlIlI[30] = -(0xFFFFEBBB & 0x7765) & (0xFFFFFF3E & 0x25163FF);
        V.lllllIlIlI[31] = 30 + 131 - 38 + 28 ^ 125 + 36 - 112 + 84;
        V.lllllIlIlI[32] = 0x2D ^ 0x5B ^ (0x73 ^ 0x16);
        V.lllllIlIlI[33] = 0x87 ^ 0x92;
        V.lllllIlIlI[34] = 4 ^ 0x12;
        V.lllllIlIlI[35] = 0x86 ^ 0x91;
        V.lllllIlIlI[36] = 0x25 ^ 0x37 ^ (0xBE ^ 0xB4);
        V.lllllIlIlI[37] = 0xA7 ^ 0xBE;
        V.lllllIlIlI[38] = 86 + 136 - 81 + 15 ^ 121 + 17 - 40 + 36;
        V.lllllIlIlI[39] = 49 + 17 - -2 + 64 ^ 144 + 154 - 222 + 96;
        V.lllllIlIlI[40] = 0x48 ^ 0x53;
        V.lllllIlIlI[41] = 31 + 134 - 18 + 8 ^ 82 + 76 - 78 + 55;
        V.lllllIlIlI[42] = 0xFFFFEDFB & 0x168D;
        V.lllllIlIlI[43] = (0x50 ^ 0x60) & ~(0x8B ^ 0xBB) ^ (0x19 ^ 4);
        V.lllllIlIlI[44] = -(0xFFFFF89B & 0x17E5) & (0xFFFFD5F7 & 0x3EEB);
        V.lllllIlIlI[45] = -(0xFFFFFFF5 & 0x18CF) & (0xFFFFDEFF & 0x3DF5);
        V.lllllIlIlI[46] = 5 ^ 0x1A;
        V.lllllIlIlI[47] = 0xFFFFBEFF & 0x45AF;
        V.lllllIlIlI[48] = 40 + 103 - -3 + 7 ^ 85 + 30 - 28 + 98;
        V.lllllIlIlI[49] = -(0xFFFFFDFC & 0x1A47) & (0xFFFF9FEB & 0x7EFF);
        V.lllllIlIlI[50] = 136 + 82 - 79 + 86 ^ 181 + 144 - 199 + 66;
        V.lllllIlIlI[51] = 0xFFFFFB77 & 0x2FFE;
        V.lllllIlIlI[52] = 116 + 64 - 35 + 15 ^ 65 + 55 - 100 + 110;
        V.lllllIlIlI[53] = -(0xFFFFFF7B & 0x6CBF) & (0xFFFFFFFE & 0x6FBF);
        V.lllllIlIlI[54] = -3 & (0xFFFFDF6A & 0x3FDF);
        V.lllllIlIlI[55] = -(0xFFFF97DE & 0x6B65) & (0xFFFF8FFF & 0xFBFB);
        V.lllllIlIlI[56] = 0xFFFFE1A9 & 0x7FFE;
        V.lllllIlIlI[57] = -(0xFFFFF241 & 0x1FBF) & (0xFFFFFFF5 & 0x13FE);
        V.lllllIlIlI[58] = 0xFFFFFA9F & 0x3FF8;
        V.lllllIlIlI[59] = 0x1B ^ 0x38;
        V.lllllIlIlI[60] = 95 + 72 - 156 + 121 ^ 110 + 152 - 193 + 91;
        V.lllllIlIlI[61] = 0xFFFFEEBF & 0x1DD9;
        V.lllllIlIlI[62] = 0xFFFFAEFA & 0x5DDF;
        V.lllllIlIlI[63] = 0xFFFF9CAF & 0x6FFC;
        V.lllllIlIlI[64] = 0xFFFFEDDB & 0x1EF4;
        V.lllllIlIlI[65] = 0xFFFFEFF7 & 0x1C79;
        V.lllllIlIlI[66] = 0xFFFFDE5F & 0x2DFF;
        V.lllllIlIlI[67] = 0x87 ^ 0xB7;
        V.lllllIlIlI[68] = 0xFFFFAC9D & 0x5FEF;
        V.lllllIlIlI[69] = -(0xFFFFF3F7 & 0x5F99) & (0xFFFFDFFF & 0x7FFD);
        V.lllllIlIlI[70] = 0xFFFFFCB6 & 0xFFF;
        V.lllllIlIlI[71] = -(0xFFFFAE4B & 0x73F5) & (0xFFFFAFDF & 0x7EFF);
        V.lllllIlIlI[72] = -(0xFFFFFBFF & 0x351B) & (0xFFFFBFFA & 0x7DFF);
        V.lllllIlIlI[73] = 0x53 ^ 0x76;
    }

    private static boolean llIlIlIIIllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static void dC() {
        if (V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[22]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[22]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[22]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[20]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[22]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[20]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[22])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[20]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[2]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[20]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[2]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[2]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[20])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[2]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[2]) && V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (V.llIlIlIIIIlll(Skills.getLevel((Skill)Skill.STRENGTH), lllllIlIlI[39]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[2]) && V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.DEFENCE), lllllIlIlI[2]) && V.llIlIlIIIllll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
    }

    public static void ae() {
        d var16;
        int[] nArray = new int[lllllIlIlI[1]];
        nArray[V.lllllIlIlI[0]] = lllllIlIlI[10];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllllIlIlI[10], lllllIlIlI[39], lllllIlIlI[53]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllllIlIlI[1]];
        nArray2[V.lllllIlIlI[0]] = lllllIlIlI[54];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[54], lllllIlIlI[11], lllllIlIlI[53]);
            bu.add(var16);
            0;
        }
        int[] nArray3 = new int[lllllIlIlI[1]];
        nArray3[V.lllllIlIlI[0]] = lllllIlIlI[51];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[51], lllllIlIlI[1], lllllIlIlI[55]);
            bu.add(var16);
            0;
        }
        int[] nArray4 = new int[lllllIlIlI[1]];
        nArray4[V.lllllIlIlI[0]] = lllllIlIlI[49];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[49], lllllIlIlI[1], lllllIlIlI[56]);
            bu.add(var16);
            0;
        }
        int[] nArray5 = new int[lllllIlIlI[1]];
        nArray5[V.lllllIlIlI[0]] = lllllIlIlI[12];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[12], lllllIlIlI[13], lllllIlIlI[57]);
            bu.add(var16);
            0;
        }
        int[] nArray6 = new int[lllllIlIlI[1]];
        nArray6[V.lllllIlIlI[0]] = lllllIlIlI[42];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[42], lllllIlIlI[1], lllllIlIlI[58]);
            bu.add(var16);
            0;
        }
        int[] nArray7 = new int[lllllIlIlI[1]];
        nArray7[V.lllllIlIlI[0]] = lllllIlIlI[45];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[45], lllllIlIlI[1], lllllIlIlI[58]);
            bu.add(var16);
            0;
        }
        int[] nArray8 = new int[lllllIlIlI[1]];
        nArray8[V.lllllIlIlI[0]] = lllllIlIlI[47];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[47], lllllIlIlI[1], lllllIlIlI[58]);
            bu.add(var16);
            0;
        }
        int[] nArray9 = new int[lllllIlIlI[1]];
        nArray9[V.lllllIlIlI[0]] = lllllIlIlI[44];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[44], lllllIlIlI[1], lllllIlIlI[58]);
            bu.add(var16);
            0;
        }
        if (V.llIlIlIIIlIIl(Skills.getLevel((Skill)Skill.ATTACK), lllllIlIlI[39])) {
            int[] nArray10 = new int[lllllIlIlI[1]];
            nArray10[V.lllllIlIlI[0]] = lllllIlIlI[18];
            if (V.llIlIlIIIlIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var16 = new d(lllllIlIlI[18], lllllIlIlI[1], lllllIlIlI[56]);
                bu.add(var16);
                0;
            }
        }
        int[] nArray11 = new int[lllllIlIlI[1]];
        nArray11[V.lllllIlIlI[0]] = lllllIlIlI[17];
        if (V.llIlIlIIIlIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var16 = new d(lllllIlIlI[17], lllllIlIlI[1], lllllIlIlI[58]);
            bu.add(var16);
            0;
        }
    }

    @Override
    public String U() {
        return lllllIlIIl[lllllIlIlI[59]];
    }

    private static boolean llIlIlIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIIlIlI(Object object) {
        return object != null;
    }
}

