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

public class U_Unknown
implements S {
    public static /* synthetic */ WorldPoint je;
    public static /* synthetic */ WorldPoint bw;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ WorldArea jc;
    public static /* synthetic */ WorldPoint jd;
    private static /* synthetic */ String[] lllIllIIIl;
    public static /* synthetic */ int[] iZ;
    public static /* synthetic */ WorldArea jb;
    private static /* synthetic */ int[] lllIllIIlI;
    public static /* synthetic */ WorldArea ja;

    private static boolean llIIlIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIlllllIll(String var12, String var14) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lllIllIIlI[3], var22);
            return new String(var20.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIIIll(int n2) {
        return n2 == 0;
    }

    public static void dC() {
        if (U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIIlI[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean llIIlIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void dz() {
        block17: {
            block19: {
                block18: {
                    if (U.llIIlIIIIIIIl(bs ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[0]];
                        b.a(bu);
                        if (U.llIIlIIIIIIlI(bu.size(), lllIllIIlI[1])) {
                            System.out.println(lllIllIIIl[lllIllIIlI[1]]);
                            bs = lllIllIIlI[0];
                        }
                    }
                    if (!U.llIIlIIIIIIll(bs ? 1 : 0)) break block17;
                    if (U.llIIlIIIIIIll(U.bz() ? 1 : 0) && U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIIlI[2])) {
                        BankLocation var2 = BankLocation.getNearest();
                        if (U.llIIlIIIIIlII(var2) && U.llIIlIIIIIIll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[3]];
                            a.a(var2);
                        }
                        if (U.llIIlIIIIIlII(var2) && U.llIIlIIIIIIIl(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[4]];
                            if (U.llIIlIIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIIlI[5]);
                                0;
                            }
                            if (U.llIIlIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                if (U.llIIlIIIIIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIllIIlI[1]);
                                    0;
                                }
                                if (U.llIIlIIIIIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIllIIlI[3]);
                                    0;
                                }
                                if (U.llIIlIIIIIIll(U.dB() ? 1 : 0)) {
                                    U.ae();
                                    System.out.println(lllIllIIIl[lllIllIIlI[6]]);
                                    bs = lllIllIIlI[1];
                                    return;
                                }
                                a.a(iZ, lllIllIIlI[1]);
                                a.a(lllIllIIlI[7], lllIllIIlI[8]);
                                a.b(f.aU, lllIllIIlI[1]);
                                a.a(lllIllIIlI[9], lllIllIIlI[10]);
                                a.a(lllIllIIlI[11], lllIllIIlI[12]);
                            }
                        }
                    }
                    if (!U.llIIlIIIIIIIl(U.bz() ? 1 : 0)) break block17;
                    U.dA();
                    if (U.llIIlIIIIIllI(Movement.getRunEnergy(), lllIllIIlI[13]) && U.llIIlIIIIIIll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lllIllIIlI[1]];
                    stringArray[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[10]];
                    if (!U.llIIlIIIIIIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lllIllIIlI[1]];
                    stringArray2[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[14]];
                    if (!U.llIIlIIIIIIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lllIllIIlI[1]];
                    stringArray3[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[15]];
                    if (!U.llIIlIIIIIIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lllIllIIlI[1]];
                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[16];
                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lllIllIIlI[1]];
                    nArray2[U.lllIllIIlI[0]] = lllIllIIlI[17];
                    if (!U.llIIlIIIIIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                U.dC();
            }
            if (U.llIIlIIIIIlll(U.llIIlIIIIIIII(e.u(), 45.0))) {
                int[] nArray = new int[lllIllIIlI[1]];
                nArray[U.lllIllIIlI[0]] = lllIllIIlI[11];
                if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIllIIlI[1]];
                    nArray3[U.lllIllIIlI[0]] = lllIllIIlI[11];
                    Inventory.getFirst((int[])nArray3).interact(lllIllIIIl[lllIllIIlI[18]]);
                    Time.sleepTicks((int)lllIllIIlI[1]);
                    0;
                }
            }
            if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[19]) && U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIIlI[19])) {
                j.Q();
            }
        }
    }

    public static void ae() {
        d var23;
        int[] nArray = new int[lllIllIIlI[1]];
        nArray[U.lllIllIIlI[0]] = lllIllIIlI[9];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIllIIlI[9], lllIllIIlI[2], lllIllIIlI[51]);
            bu.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIllIIlI[1]];
        nArray2[U.lllIllIIlI[0]] = lllIllIIlI[52];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[52], lllIllIIlI[10], lllIllIIlI[51]);
            bu.add(var23);
            0;
        }
        int[] nArray3 = new int[lllIllIIlI[1]];
        nArray3[U.lllIllIIlI[0]] = lllIllIIlI[49];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[49], lllIllIIlI[1], lllIllIIlI[53]);
            bu.add(var23);
            0;
        }
        int[] nArray4 = new int[lllIllIIlI[1]];
        nArray4[U.lllIllIIlI[0]] = lllIllIIlI[47];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[47], lllIllIIlI[1], lllIllIIlI[54]);
            bu.add(var23);
            0;
        }
        int[] nArray5 = new int[lllIllIIlI[1]];
        nArray5[U.lllIllIIlI[0]] = lllIllIIlI[11];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[11], lllIllIIlI[12], lllIllIIlI[55]);
            bu.add(var23);
            0;
        }
        int[] nArray6 = new int[lllIllIIlI[1]];
        nArray6[U.lllIllIIlI[0]] = lllIllIIlI[40];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[40], lllIllIIlI[1], lllIllIIlI[56]);
            bu.add(var23);
            0;
        }
        int[] nArray7 = new int[lllIllIIlI[1]];
        nArray7[U.lllIllIIlI[0]] = lllIllIIlI[44];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[44], lllIllIIlI[1], lllIllIIlI[56]);
            bu.add(var23);
            0;
        }
        int[] nArray8 = new int[lllIllIIlI[1]];
        nArray8[U.lllIllIIlI[0]] = lllIllIIlI[45];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[45], lllIllIIlI[1], lllIllIIlI[56]);
            bu.add(var23);
            0;
        }
        int[] nArray9 = new int[lllIllIIlI[1]];
        nArray9[U.lllIllIIlI[0]] = lllIllIIlI[42];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[42], lllIllIIlI[1], lllIllIIlI[56]);
            bu.add(var23);
            0;
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[2])) {
            int[] nArray10 = new int[lllIllIIlI[1]];
            nArray10[U.lllIllIIlI[0]] = lllIllIIlI[17];
            if (U.llIIlIIIIIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var23 = new d(lllIllIIlI[17], lllIllIIlI[1], lllIllIIlI[54]);
                bu.add(var23);
                0;
            }
        }
        int[] nArray11 = new int[lllIllIIlI[1]];
        nArray11[U.lllIllIIlI[0]] = lllIllIIlI[16];
        if (U.llIIlIIIIIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var23 = new d(lllIllIIlI[16], lllIllIIlI[1], lllIllIIlI[56]);
            bu.add(var23);
            0;
        }
    }

    private static String llIIIllllllIl(String var15, String var3) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIllIIlI[18]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lllIllIIlI[3], var5);
            return new String(var24.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            U.dz();
            0;
        }
        catch (Exception var21) {
            var21.printStackTrace();
        }
        if (1 <= ((0x84 ^ 0x90) & ~(0x42 ^ 0x56))) {
            return (0x1D ^ 0x35) & ~(0x37 ^ 0x1F);
        }
        return lllIllIIlI[0];
    }

    private static int llIIlIIIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        U.llIIIllllllll();
        U.llIIIlllllllI();
        bu = new ArrayList<d>();
        int[] nArray = new int[lllIllIIlI[18]];
        nArray[U.lllIllIIlI[0]] = lllIllIIlI[16];
        nArray[U.lllIllIIlI[1]] = lllIllIIlI[17];
        nArray[U.lllIllIIlI[3]] = lllIllIIlI[42];
        nArray[U.lllIllIIlI[4]] = lllIllIIlI[44];
        nArray[U.lllIllIIlI[6]] = lllIllIIlI[40];
        nArray[U.lllIllIIlI[10]] = lllIllIIlI[45];
        nArray[U.lllIllIIlI[14]] = lllIllIIlI[47];
        nArray[U.lllIllIIlI[15]] = lllIllIIlI[49];
        iZ = nArray;
        ja = new WorldArea(lllIllIIlI[59], lllIllIIlI[60], lllIllIIlI[22], lllIllIIlI[22], lllIllIIlI[0]);
        jb = new WorldArea(lllIllIIlI[61], lllIllIIlI[62], lllIllIIlI[32], lllIllIIlI[26], lllIllIIlI[0]);
        jc = new WorldArea(lllIllIIlI[63], lllIllIIlI[64], lllIllIIlI[65], lllIllIIlI[34], lllIllIIlI[0]);
        jd = new WorldPoint(lllIllIIlI[66], lllIllIIlI[67], lllIllIIlI[0]);
        bw = new WorldPoint(lllIllIIlI[68], lllIllIIlI[60], lllIllIIlI[0]);
        je = new WorldPoint(lllIllIIlI[69], lllIllIIlI[70], lllIllIIlI[0]);
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
                                                                            if (!U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[2])) break block8;
                                                                            int[] nArray = new int[lllIllIIlI[1]];
                                                                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[17];
                                                                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lllIllIIlI[1]];
                                                                            nArray2[U.lllIllIIlI[0]] = lllIllIIlI[17];
                                                                            if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lllIllIIlI[1]];
                                                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                                                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lllIllIIlI[1]];
                                                                        nArray3[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                                                        if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lllIllIIlI[1]];
                                                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lllIllIIlI[1]];
                                                                    nArray4[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                                                    if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lllIllIIlI[1]];
                                                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                                                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lllIllIIlI[1]];
                                                                nArray5[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                                                if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lllIllIIlI[1]];
                                                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[45];
                                                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lllIllIIlI[1]];
                                                            nArray6[U.lllIllIIlI[0]] = lllIllIIlI[45];
                                                            if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lllIllIIlI[1]];
                                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[47];
                                                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lllIllIIlI[1]];
                                                        nArray7[U.lllIllIIlI[0]] = lllIllIIlI[47];
                                                        if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lllIllIIlI[1]];
                                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[49];
                                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lllIllIIlI[1]];
                                                    nArray8[U.lllIllIIlI[0]] = lllIllIIlI[49];
                                                    if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lllIllIIlI[1]];
                                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[11];
                                                if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lllIllIIlI[1];
                                                    0;
                                                    if (((0x60 ^ 0x6E) & ~(0x20 ^ 0x2E)) == ((0xD ^ 5) & ~(0xA9 ^ 0xA1))) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = lllIllIIlI[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lllIllIIlI[1]];
                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[16];
                                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lllIllIIlI[1]];
                                        nArray9[U.lllIllIIlI[0]] = lllIllIIlI[16];
                                        if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lllIllIIlI[1]];
                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lllIllIIlI[1]];
                                    nArray10[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                    if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lllIllIIlI[1]];
                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lllIllIIlI[1]];
                                nArray11[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lllIllIIlI[1]];
                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[40];
                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lllIllIIlI[1]];
                            nArray12[U.lllIllIIlI[0]] = lllIllIIlI[40];
                            if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lllIllIIlI[1]];
                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[45];
                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lllIllIIlI[1]];
                        nArray13[U.lllIllIIlI[0]] = lllIllIIlI[45];
                        if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lllIllIIlI[1]];
                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[47];
                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lllIllIIlI[1]];
                    nArray14[U.lllIllIIlI[0]] = lllIllIIlI[47];
                    if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lllIllIIlI[1]];
                nArray[U.lllIllIIlI[0]] = lllIllIIlI[49];
                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lllIllIIlI[1]];
                nArray15[U.lllIllIIlI[0]] = lllIllIIlI[49];
                if (!U.llIIlIIIIIIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lllIllIIlI[1]];
            nArray[U.lllIllIIlI[0]] = lllIllIIlI[11];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIllIIlI[1];
                0;
                if (null == null) return n2 != 0;
                return ((0xE5 ^ 0x8D ^ (0xE ^ 0x63)) & (0x76 ^ 0x7B ^ (9 ^ 1) ^ -1)) != 0;
            }
        }
        n2 = lllIllIIlI[0];
        return n2 != 0;
    }

    private static boolean llIIlIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lllIllIIlI[0];
    }

    private static void llIIIllllllll() {
        lllIllIIlI = new int[72];
        U.lllIllIIlI[0] = (135 + 0 - 29 + 41 ^ 81 + 116 - 114 + 80) & (71 + 108 - 109 + 62 ^ 162 + 60 - 158 + 116 ^ -1);
        U.lllIllIIlI[1] = 1;
        U.lllIllIIlI[2] = 0xEC ^ 0x88 ^ (0x23 ^ 0x6F);
        U.lllIllIIlI[3] = 2;
        U.lllIllIIlI[4] = 3;
        U.lllIllIIlI[5] = -(0xFFFFFAF6 & 0x6D3F) & (0xFFFFFFBF & 0x7BFD);
        U.lllIllIIlI[6] = 0x22 ^ 0x35 ^ (8 ^ 0x1B);
        U.lllIllIIlI[7] = -(0xFFFFCDEB & 0x7615) & (0xFFFFE7F3 & 0x5FEF);
        U.lllIllIIlI[8] = 0xFFFFBBE8 & 0x47FF;
        U.lllIllIIlI[9] = -(0xFFFFED7F & 0x72A1) & (0xFFFFFF7F & 0x7FE7);
        U.lllIllIIlI[10] = 127 + 76 - 62 + 17 ^ 59 + 26 - 23 + 93;
        U.lllIllIIlI[11] = -(0xFFFFDE9F & 0x7B65) & (0xFFFFDFFF & 0x7B7F);
        U.lllIllIIlI[12] = 0xA2 ^ 0x8C ^ (0xEF ^ 0xA5);
        U.lllIllIIlI[13] = 0x70 ^ 0x7F;
        U.lllIllIIlI[14] = 0x59 ^ 0x17 ^ (0x51 ^ 0x19);
        U.lllIllIIlI[15] = 0x4F ^ 0x48;
        U.lllIllIIlI[16] = -(0xFFFFD2FF & 0x6FC5) & (0xFFFFEFFF & 0x57F7);
        U.lllIllIIlI[17] = 0xFFFFC7B5 & 0x3D7F;
        U.lllIllIIlI[18] = 0x1D ^ 0x3E ^ (0x2A ^ 1);
        U.lllIllIIlI[19] = 0x1D ^ 0x5D ^ (0x72 ^ 0x26);
        U.lllIllIIlI[20] = 0x32 ^ 0x40 ^ (0xDD ^ 0xA6);
        U.lllIllIIlI[21] = 0xF0 ^ 0xC4 ^ (0x7E ^ 0x40);
        U.lllIllIIlI[22] = 0x63 ^ 0xD ^ (0 ^ 0x65);
        U.lllIllIIlI[23] = 28 + 116 - 36 + 72 ^ 170 + 132 - 259 + 141;
        U.lllIllIIlI[24] = 0xE ^ 3;
        U.lllIllIIlI[25] = 137 + 91 - 117 + 40 ^ 103 + 111 - 157 + 96;
        U.lllIllIIlI[26] = 0xB1 ^ 0xA1;
        U.lllIllIIlI[27] = -1;
        U.lllIllIIlI[28] = 0xFFFFF4BE & 0x2510B5F;
        U.lllIllIIlI[29] = 0x2D ^ 0x45 ^ (0x1A ^ 0x63);
        U.lllIllIIlI[30] = 0x9E ^ 0x8C;
        U.lllIllIIlI[31] = 0x66 ^ 0x75;
        U.lllIllIIlI[32] = 100 + 139 - 94 + 65 ^ 140 + 132 - 195 + 122;
        U.lllIllIIlI[33] = 0x7C ^ 0x6A;
        U.lllIllIIlI[34] = 0x73 ^ 0x15 ^ (0xD0 ^ 0xA8);
        U.lllIllIIlI[35] = 0x74 ^ 0x63;
        U.lllIllIIlI[36] = 0x95 ^ 0xA5 ^ (0x1D ^ 0x35);
        U.lllIllIIlI[37] = 111 + 166 - 107 + 0 ^ 54 + 159 - 72 + 38;
        U.lllIllIIlI[38] = 0x83 ^ 0x99;
        U.lllIllIIlI[39] = 0x4C ^ 0x57;
        U.lllIllIIlI[40] = -(0xFFFFFFF9 & 0x2B77) & (0xFFFFFFFB & 0x2FFD);
        U.lllIllIIlI[41] = 4 ^ 0x18;
        U.lllIllIIlI[42] = 0xFFFFADEB & 0x5677;
        U.lllIllIIlI[43] = 0xF3 ^ 0xB9 ^ (0xFE ^ 0xA9);
        U.lllIllIIlI[44] = 0xFFFFF73B & 0xCF5;
        U.lllIllIIlI[45] = 0xFFFFCDAF & 0x36FF;
        U.lllIllIIlI[46] = 0x3D ^ 0x22;
        U.lllIllIIlI[47] = -(0xFFFFDB57 & 0x7CA9) & (0xFFFFFFEC & 0x5EBB);
        U.lllIllIIlI[48] = 0x6D ^ 0x4D;
        U.lllIllIIlI[49] = -(0xFFFFDB56 & 0x34AB) & (0xFFFFBFF7 & 0x7B7F);
        U.lllIllIIlI[50] = 0x61 ^ 1 ^ (7 ^ 0x46);
        U.lllIllIIlI[51] = 0xFFFFD7A6 & 0x2BDD;
        U.lllIllIIlI[52] = -(0xEC ^ 0xC4) & (0xFFFF9F7F & 0x7FEF);
        U.lllIllIIlI[53] = 0xFFFFA9BC & 0xDEFB;
        U.lllIllIIlI[54] = -(0xFFFFBBDD & 0x4676) & (0xFFFFF7FB & 0x6BFF);
        U.lllIllIIlI[55] = 0xFFFFDDF6 & 0x23FD;
        U.lllIllIIlI[56] = -(0xFFFF96F3 & 0x6D6F) & (0xFFFFBEFE & 0x7FFB);
        U.lllIllIIlI[57] = 0xAC ^ 0x8E;
        U.lllIllIIlI[58] = 0x7A ^ 0x10 ^ (0x72 ^ 0x3B);
        U.lllIllIIlI[59] = -(0xFFFFBFCF & 0x4333) & (0xFFFFBFDB & 0x4FBF);
        U.lllIllIIlI[60] = 0xFFFFBCDE & 0x4FFB;
        U.lllIllIIlI[61] = 0xFFFFEDEC & 0x1EBF;
        U.lllIllIIlI[62] = 0xFFFFFCDD & 0xFF2;
        U.lllIllIIlI[63] = 0xFFFFCF73 & 0x3CFD;
        U.lllIllIIlI[64] = -(0xFFFFC5BB & 0x7BE5) & (0xFFFFDFFF & 0x6DFF);
        U.lllIllIIlI[65] = 0x22 ^ 0x12;
        U.lllIllIIlI[66] = 0xFFFFAFAF & 0x5CDD;
        U.lllIllIIlI[67] = 0xFFFFDC6F & 0x2FFD;
        U.lllIllIIlI[68] = 0xFFFFFDF7 & 0xEBE;
        U.lllIllIIlI[69] = 0xFFFF9CDF & 0x6FBF;
        U.lllIllIIlI[70] = -(0xFFFFCB37 & 0x77DD) & (0xFFFFFFFC & 0x4FF7);
        U.lllIllIIlI[71] = 96 + 99 - 126 + 65 ^ 117 + 72 - 143 + 116;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIIlI[2])) {
            bl = lllIllIIlI[1];
            0;
            if ((0x91 ^ 0x95) != (0x6F ^ 0x6B)) {
                return false;
            }
        } else {
            bl = lllIllIIlI[0];
        }
        return bl;
    }

    @Override
    public String U() {
        return lllIllIIIl[lllIllIIlI[57]];
    }

    private static boolean llIIlIIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIIIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIIIIlIII(Object object) {
        return object == null;
    }

    public static void dA() {
        if (U.llIIlIIIIlIIl(Static.getClient().getVar(lllIllIIlI[22]), lllIllIIlI[1])) {
            Static.getClient().invokeMenuAction(lllIllIIIl[lllIllIIlI[13]], lllIllIIIl[lllIllIIlI[26]], lllIllIIlI[1], MenuAction.CC_OP.getId(), lllIllIIlI[27], lllIllIIlI[28]);
        }
        if (U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[10])) {
            String[] stringArray = new String[lllIllIIlI[1]];
            stringArray[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[29]];
            if (U.llIIlIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIllIIlI[1]];
                stringArray2[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[30]];
                Inventory.getFirst((String[])stringArray2).interact(lllIllIIIl[lllIllIIlI[31]]);
            }
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[10]) && U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[19])) {
            String[] stringArray = new String[lllIllIIlI[1]];
            stringArray[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[19]];
            if (U.llIIlIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIllIIlI[1]];
                stringArray3[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[32]];
                Inventory.getFirst((String[])stringArray3).interact(lllIllIIIl[lllIllIIlI[33]]);
            }
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[19]) && U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[34])) {
            String[] stringArray = new String[lllIllIIlI[1]];
            stringArray[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[35]];
            if (U.llIIlIIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lllIllIIlI[1]];
                stringArray4[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[36]];
                Inventory.getFirst((String[])stringArray4).interact(lllIllIIIl[lllIllIIlI[37]]);
            }
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[34]) && U.llIIlIIIIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[2])) {
            int[] nArray = new int[lllIllIIlI[1]];
            nArray[U.lllIllIIlI[0]] = lllIllIIlI[16];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIllIIlI[1]];
                nArray2[U.lllIllIIlI[0]] = lllIllIIlI[16];
                Inventory.getFirst((int[])nArray2).interact(lllIllIIIl[lllIllIIlI[38]]);
            }
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[2])) {
            int[] nArray = new int[lllIllIIlI[1]];
            nArray[U.lllIllIIlI[0]] = lllIllIIlI[17];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIIlI[1]];
                nArray3[U.lllIllIIlI[0]] = lllIllIIlI[17];
                Inventory.getFirst((int[])nArray3).interact(lllIllIIIl[lllIllIIlI[39]]);
            }
        }
        if (U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIIlI[34])) {
            int[] nArray = new int[lllIllIIlI[1]];
            nArray[U.lllIllIIlI[0]] = lllIllIIlI[40];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIllIIlI[1]];
                nArray4[U.lllIllIIlI[0]] = lllIllIIlI[40];
                Inventory.getFirst((int[])nArray4).interact(lllIllIIIl[lllIllIIlI[41]]);
            }
            int[] nArray5 = new int[lllIllIIlI[1]];
            nArray5[U.lllIllIIlI[0]] = lllIllIIlI[42];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllIllIIlI[1]];
                nArray6[U.lllIllIIlI[0]] = lllIllIIlI[42];
                Inventory.getFirst((int[])nArray6).interact(lllIllIIIl[lllIllIIlI[43]]);
            }
            int[] nArray7 = new int[lllIllIIlI[1]];
            nArray7[U.lllIllIIlI[0]] = lllIllIIlI[44];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lllIllIIlI[1]];
                nArray8[U.lllIllIIlI[0]] = lllIllIIlI[44];
                Inventory.getFirst((int[])nArray8).interact(lllIllIIIl[lllIllIIlI[34]]);
            }
            int[] nArray9 = new int[lllIllIIlI[1]];
            nArray9[U.lllIllIIlI[0]] = lllIllIIlI[45];
            if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lllIllIIlI[1]];
                nArray10[U.lllIllIIlI[0]] = lllIllIIlI[45];
                Inventory.getFirst((int[])nArray10).interact(lllIllIIIl[lllIllIIlI[46]]);
            }
        }
        int[] nArray = new int[lllIllIIlI[1]];
        nArray[U.lllIllIIlI[0]] = lllIllIIlI[47];
        if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lllIllIIlI[1]];
            nArray11[U.lllIllIIlI[0]] = lllIllIIlI[47];
            Inventory.getFirst((int[])nArray11).interact(lllIllIIIl[lllIllIIlI[48]]);
        }
        int[] nArray12 = new int[lllIllIIlI[1]];
        nArray12[U.lllIllIIlI[0]] = lllIllIIlI[49];
        if (U.llIIlIIIIIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIllIIlI[1]];
            nArray13[U.lllIllIIlI[0]] = lllIllIIlI[49];
            Inventory.getFirst((int[])nArray13).interact(lllIllIIIl[lllIllIIlI[50]]);
        }
    }

    private static boolean llIIlIIIIIlII(Object object) {
        return object != null;
    }

    private static boolean llIIlIIIIIlll(int n2) {
        return n2 < 0;
    }

    private static void llIIIlllllllI() {
        lllIllIIIl = new String[lllIllIIlI[71]];
        U.lllIllIIIl[U.lllIllIIlI[0]] = U."Buying items";
        U.lllIllIIIl[U.lllIllIIlI[1]] = U."Finished buying items, switching back to melee training";
        U.lllIllIIIl[U.lllIllIIlI[3]] = U."Navigating to bank";
        U.lllIllIIIl[U.lllIllIIlI[4]] = U."Handling banking";
        U.lllIllIIIl[U.lllIllIIlI[6]] = U."We are missing supplies, switching to BUYING";
        U.lllIllIIIl[U.lllIllIIlI[10]] = U."Iron scimitar";
        U.lllIllIIIl[U.lllIllIIlI[14]] = U."Steel scimitar";
        U.lllIllIIIl[U.lllIllIIlI[15]] = U."Mithril scimitar";
        U.lllIllIIIl[U.lllIllIIlI[18]] = U."Eat";
        U.lllIllIIIl[U.lllIllIIlI[20]] = U."Walking to cow area";
        U.lllIllIIIl[U.lllIllIIlI[21]] = U."Killing cows";
        U.lllIllIIIl[U.lllIllIIlI[22]] = U."Cow";
        U.lllIllIIIl[U.lllIllIIlI[23]] = U."cow";
        U.lllIllIIIl[U.lllIllIIlI[24]] = U."Attack";
        U.lllIllIIIl[U.lllIllIIlI[25]] = U."Attack";
        U.lllIllIIIl[U.lllIllIIlI[13]] = U."Auto retaliate";
        U.lllIllIIIl[U.lllIllIIlI[26]] = U."";
        U.lllIllIIIl[U.lllIllIIlI[29]] = U."Iron scimitar";
        U.lllIllIIIl[U.lllIllIIlI[30]] = U."Iron scimitar";
        U.lllIllIIIl[U.lllIllIIlI[31]] = U."Wield";
        U.lllIllIIIl[U.lllIllIIlI[19]] = U."Steel scimitar";
        U.lllIllIIIl[U.lllIllIIlI[32]] = U."Steel scimitar";
        U.lllIllIIIl[U.lllIllIIlI[33]] = U."Wield";
        U.lllIllIIIl[U.lllIllIIlI[35]] = U."Mithril scimitar";
        U.lllIllIIIl[U.lllIllIIlI[36]] = U."Mithril scimitar";
        U.lllIllIIIl[U.lllIllIIlI[37]] = U."Wield";
        U.lllIllIIIl[U.lllIllIIlI[38]] = U."Wield";
        U.lllIllIIIl[U.lllIllIIlI[39]] = U."Wield";
        U.lllIllIIIl[U.lllIllIIlI[41]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[43]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[34]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[46]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[48]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[50]] = U."Wear";
        U.lllIllIIIl[U.lllIllIIlI[57]] = U."40 Def";
        U.lllIllIIIl[U.lllIllIIlI[58]] = U."Cow";
    }

    public static void Z() {
        if (U.llIIlIIIIIIll(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[20]];
            Movement.walkTo((WorldPoint)bw);
            0;
            Time.sleepTicks((int)lllIllIIlI[1]);
            0;
        }
        if (U.llIIlIIIIIIIl(jb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllIIIl[lllIllIIlI[21]];
            if (U.llIIlIIIIlIII(Players.getLocal().getInteracting())) {
                NPC var17 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (U.llIIlIIIIIIIl(nPC.getName().contains(lllIllIIIl[lllIllIIlI[58]]) ? 1 : 0) && U.llIIlIIIIlIII(nPC.getInteracting()) && U.llIIlIIIIIIll(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIllIIlI[1];
                        0;
                        if (1 <= ((0xF3 ^ 0xB2 ^ (0x43 ^ 0x16)) & (0xEC ^ 0xB8 ^ (0x1A ^ 0x5A) ^ -1))) {
                            return ((0x77 ^ 0x3A ^ (0xA5 ^ 0xC5)) & (0xAE ^ 0x85 ^ (6 ^ 0) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIllIIlI[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lllIllIIlI[3]];
                stringArray[U.lllIllIIlI[0]] = lllIllIIIl[lllIllIIlI[22]];
                stringArray[U.lllIllIIlI[1]] = lllIllIIIl[lllIllIIlI[23]];
                List var9 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (U.llIIlIIIIlIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = lllIllIIlI[1];
                        0;
                        if (((0x47 ^ 0x78) & ~(0x9C ^ 0xA3)) != ((0x8E ^ 0x89) & ~(0x88 ^ 0x8F))) {
                            return false;
                        }
                    } else {
                        bl = lllIllIIlI[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (U.llIIlIIIIIIll(var9.isEmpty() ? 1 : 0)) {
                    ((NPC)var9.get(lllIllIIlI[0])).interact(lllIllIIIl[lllIllIIlI[24]]);
                    Time.sleepTicks((int)lllIllIIlI[3]);
                    0;
                }
                if (U.llIIlIIIIIlII(var17) && U.llIIlIIIIIIll(Players.getLocal().isMoving() ? 1 : 0) && U.llIIlIIIIIIIl(var9.isEmpty() ? 1 : 0)) {
                    var17.interact(lllIllIIIl[lllIllIIlI[25]]);
                    Time.sleepTicks((int)lllIllIIlI[3]);
                    0;
                }
            }
            if (U.llIIlIIIIIlII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lllIllIIlI[6]);
                0;
            }
        }
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
                                                                                    if (!U.llIIlIIIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIIlI[2])) break block4;
                                                                                    int[] nArray = new int[lllIllIIlI[1]];
                                                                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[17];
                                                                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lllIllIIlI[1]];
                                                                                    nArray2[U.lllIllIIlI[0]] = lllIllIIlI[17];
                                                                                    if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lllIllIIlI[1]];
                                                                                    nArray3[U.lllIllIIlI[0]] = lllIllIIlI[17];
                                                                                    if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lllIllIIlI[1]];
                                                                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                                                                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lllIllIIlI[1]];
                                                                                nArray4[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                                                                if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lllIllIIlI[1]];
                                                                                nArray5[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                                                                if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lllIllIIlI[1]];
                                                                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                                                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lllIllIIlI[1]];
                                                                            nArray6[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                                                            if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lllIllIIlI[1]];
                                                                            nArray7[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                                                            if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lllIllIIlI[1]];
                                                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                                                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lllIllIIlI[1]];
                                                                        nArray8[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                                                        if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lllIllIIlI[1]];
                                                                        nArray9[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                                                        if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lllIllIIlI[1]];
                                                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[45];
                                                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lllIllIIlI[1]];
                                                                    nArray10[U.lllIllIIlI[0]] = lllIllIIlI[45];
                                                                    if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lllIllIIlI[1]];
                                                                    nArray11[U.lllIllIIlI[0]] = lllIllIIlI[45];
                                                                    if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lllIllIIlI[1]];
                                                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[47];
                                                                if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lllIllIIlI[1]];
                                                                nArray12[U.lllIllIIlI[0]] = lllIllIIlI[47];
                                                                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lllIllIIlI[1]];
                                                                nArray13[U.lllIllIIlI[0]] = lllIllIIlI[47];
                                                                if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lllIllIIlI[1]];
                                                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[49];
                                                            if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lllIllIIlI[1]];
                                                            nArray14[U.lllIllIIlI[0]] = lllIllIIlI[49];
                                                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lllIllIIlI[1]];
                                                            nArray15[U.lllIllIIlI[0]] = lllIllIIlI[49];
                                                            if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lllIllIIlI[1]];
                                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[11];
                                                        if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lllIllIIlI[1]];
                                                        nArray16[U.lllIllIIlI[0]] = lllIllIIlI[11];
                                                        if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lllIllIIlI[1];
                                                    0;
                                                    if (3 > 0) return n3 != 0;
                                                    return ((136 + 9 - -4 + 17 ^ 91 + 58 - 36 + 25) & (0x24 ^ 0x35 ^ (0x7D ^ 0x40) ^ -1)) != 0;
                                                }
                                                n3 = lllIllIIlI[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lllIllIIlI[1]];
                                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[16];
                                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lllIllIIlI[1]];
                                            nArray17[U.lllIllIIlI[0]] = lllIllIIlI[16];
                                            if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lllIllIIlI[1]];
                                            nArray18[U.lllIllIIlI[0]] = lllIllIIlI[16];
                                            if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lllIllIIlI[1]];
                                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lllIllIIlI[1]];
                                        nArray19[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                        if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lllIllIIlI[1]];
                                        nArray20[U.lllIllIIlI[0]] = lllIllIIlI[42];
                                        if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lllIllIIlI[1]];
                                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lllIllIIlI[1]];
                                    nArray21[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                    if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lllIllIIlI[1]];
                                    nArray22[U.lllIllIIlI[0]] = lllIllIIlI[44];
                                    if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lllIllIIlI[1]];
                                nArray[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lllIllIIlI[1]];
                                nArray23[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lllIllIIlI[1]];
                                nArray24[U.lllIllIIlI[0]] = lllIllIIlI[40];
                                if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lllIllIIlI[1]];
                            nArray[U.lllIllIIlI[0]] = lllIllIIlI[45];
                            if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lllIllIIlI[1]];
                            nArray25[U.lllIllIIlI[0]] = lllIllIIlI[45];
                            if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lllIllIIlI[1]];
                            nArray26[U.lllIllIIlI[0]] = lllIllIIlI[45];
                            if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lllIllIIlI[1]];
                        nArray[U.lllIllIIlI[0]] = lllIllIIlI[47];
                        if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lllIllIIlI[1]];
                        nArray27[U.lllIllIIlI[0]] = lllIllIIlI[47];
                        if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lllIllIIlI[1]];
                        nArray28[U.lllIllIIlI[0]] = lllIllIIlI[47];
                        if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lllIllIIlI[1]];
                    nArray[U.lllIllIIlI[0]] = lllIllIIlI[49];
                    if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lllIllIIlI[1]];
                    nArray29[U.lllIllIIlI[0]] = lllIllIIlI[49];
                    if (!U.llIIlIIIIIIll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lllIllIIlI[1]];
                    nArray30[U.lllIllIIlI[0]] = lllIllIIlI[49];
                    if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lllIllIIlI[1]];
                nArray[U.lllIllIIlI[0]] = lllIllIIlI[11];
                if (!U.llIIlIIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lllIllIIlI[1]];
                nArray31[U.lllIllIIlI[0]] = lllIllIIlI[11];
                if (!U.llIIlIIIIIIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lllIllIIlI[1];
            0;
            if (-2 < 0) return n2 != 0;
            return false;
        }
        n2 = lllIllIIlI[0];
        return n2 != 0;
    }

    private static String llIIIllllllII(String var10, String var13) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var4 = var13.toCharArray();
        int var18 = lllIllIIlI[0];
        char[] var1 = var10.toCharArray();
        int var7 = var1.length;
        int var8 = lllIllIIlI[0];
        while (U.llIIlIIIIIIlI(var8, var7)) {
            char var16 = var1[var8];
            var19.append((char)(var16 ^ var4[var18 % var4.length]));
            0;
            ++var18;
            ++var8;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean llIIlIIIIlIlI(Object object, Object object2) {
        return object == object2;
    }
}

