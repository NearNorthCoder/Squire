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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.k_Unknown;
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

public class N_Unknown
implements K {
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    private static /* synthetic */ String[] lIlIIllIII;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cI;
    private static /* synthetic */ int[] lIlIIllIIl;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ WorldPoint cJ;

    @Override
    public boolean af() {
        boolean bl;
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
            bl = lIlIIllIIl[1];
            0;
            if (-(0x2D ^ 0x28) >= 0) {
                return false;
            }
        } else {
            bl = lIlIIllIIl[0];
        }
        return bl;
    }

    private static String lIIIllIlIIllI(String var23, String var14) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIllIIl[3], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        N.lIIIllIlIlIII();
        N.lIIIllIlIIlll();
        bp = new ArrayList<d>();
        int[] nArray = new int[lIlIIllIIl[18]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
        nArray[N.lIlIIllIIl[1]] = lIlIIllIIl[17];
        nArray[N.lIlIIllIIl[3]] = lIlIIllIIl[42];
        nArray[N.lIlIIllIIl[4]] = lIlIIllIIl[44];
        nArray[N.lIlIIllIIl[6]] = lIlIIllIIl[40];
        nArray[N.lIlIIllIIl[10]] = lIlIIllIIl[45];
        nArray[N.lIlIIllIIl[14]] = lIlIIllIIl[47];
        nArray[N.lIlIIllIIl[15]] = lIlIIllIIl[49];
        cE = nArray;
        cF = new WorldArea(lIlIIllIIl[59], lIlIIllIIl[60], lIlIIllIIl[22], lIlIIllIIl[22], lIlIIllIIl[0]);
        cG = new WorldArea(lIlIIllIIl[61], lIlIIllIIl[62], lIlIIllIIl[32], lIlIIllIIl[26], lIlIIllIIl[0]);
        cH = new WorldArea(lIlIIllIIl[63], lIlIIllIIl[64], lIlIIllIIl[65], lIlIIllIIl[34], lIlIIllIIl[0]);
        cI = new WorldPoint(lIlIIllIIl[66], lIlIIllIIl[67], lIlIIllIIl[0]);
        ce = new WorldPoint(lIlIIllIIl[68], lIlIIllIIl[60], lIlIIllIIl[0]);
        cJ = new WorldPoint(lIlIIllIIl[69], lIlIIllIIl[70], lIlIIllIIl[0]);
    }

    public static void aH() {
        block17: {
            block19: {
                block18: {
                    if (N.lIIIllIlIlIlI(bn ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[0]];
                        b.a(bp);
                        if (N.lIIIllIlIlIll(bp.size(), lIlIIllIIl[1])) {
                            System.out.println(lIlIIllIII[lIlIIllIIl[1]]);
                            bn = lIlIIllIIl[0];
                        }
                    }
                    if (!N.lIIIllIlIllII(bn ? 1 : 0)) break block17;
                    if (N.lIIIllIlIllII(N.aK() ? 1 : 0) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
                        BankLocation var9 = BankLocation.getNearest();
                        if (N.lIIIllIlIllIl(var9) && N.lIIIllIlIllII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[3]];
                            a.a(var9);
                        }
                        if (N.lIIIllIlIllIl(var9) && N.lIIIllIlIlIlI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[4]];
                            if (N.lIIIllIlIllII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllIIl[5]);
                                0;
                            }
                            if (N.lIIIllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                                if (N.lIIIllIlIlllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIIllIIl[1]);
                                    0;
                                }
                                if (N.lIIIllIlIlllI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIIllIIl[3]);
                                    0;
                                }
                                if (N.lIIIllIlIllII(N.aL() ? 1 : 0)) {
                                    N.O();
                                    System.out.println(lIlIIllIII[lIlIIllIIl[6]]);
                                    bn = lIlIIllIIl[1];
                                    return;
                                }
                                a.a(cE, lIlIIllIIl[1]);
                                a.a(lIlIIllIIl[7], lIlIIllIIl[8]);
                                a.b(f.aU, lIlIIllIIl[1]);
                                a.a(lIlIIllIIl[9], lIlIIllIIl[10]);
                                a.a(lIlIIllIIl[11], lIlIIllIIl[12]);
                            }
                        }
                    }
                    if (!N.lIIIllIlIlIlI(N.aK() ? 1 : 0)) break block17;
                    N.aJ();
                    if (N.lIIIllIlIllll(Movement.getRunEnergy(), lIlIIllIIl[13]) && N.lIIIllIlIllII(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lIlIIllIIl[1]];
                    stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[10]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lIlIIllIIl[1]];
                    stringArray2[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[14]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lIlIIllIIl[1]];
                    stringArray3[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[15]];
                    if (!N.lIIIllIlIllII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lIlIIllIIl[1]];
                    nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                    if (!N.lIIIllIlIlIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                N.aM();
            }
            if (N.lIIIllIllIIII(N.lIIIllIlIlIIl(e.u(), 45.0))) {
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIIllIIl[1]];
                    nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                    Inventory.getFirst((int[])nArray3).interact(lIlIIllIII[lIlIIllIIl[18]]);
                    Time.sleepTicks((int)lIlIIllIIl[1]);
                    0;
                }
            }
            if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19]) && N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIllIIl[19])) {
                k.aa();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK() {
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
                                                                            if (!N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) break block8;
                                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lIlIIllIIl[1]];
                                                                            nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lIlIIllIIl[1]];
                                                                        nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lIlIIllIIl[1]];
                                                                    nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lIlIIllIIl[1]];
                                                                nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lIlIIllIIl[1]];
                                                            nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lIlIIllIIl[1]];
                                                        nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lIlIIllIIl[1]];
                                                    nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lIlIIllIIl[1];
                                                    0;
                                                    if (null == null) return n3 != 0;
                                                    return ((92 + 151 - 71 + 1 ^ 116 + 7 - 83 + 112) & (0x23 ^ 0x4A ^ (0xC3 ^ 0x9F) ^ -1)) != 0;
                                                }
                                            }
                                            n3 = lIlIIllIIl[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lIlIIllIIl[1]];
                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lIlIIllIIl[1]];
                                        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lIlIIllIIl[1]];
                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lIlIIllIIl[1]];
                                    nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lIlIIllIIl[1]];
                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lIlIIllIIl[1]];
                                nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lIlIIllIIl[1]];
                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lIlIIllIIl[1]];
                            nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                            if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lIlIIllIIl[1]];
                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lIlIIllIIl[1]];
                        nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                        if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lIlIIllIIl[1]];
                    nArray14[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                    if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lIlIIllIIl[1]];
                nArray15[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                if (!N.lIIIllIlIlIlI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIIllIIl[1];
                0;
                if (1 != 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIIllIIl[0];
        return n2 != 0;
    }

    private static boolean lIIIllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIllIlIllII(int n2) {
        return n2 == 0;
    }

    private static String lIIIllIlIIlIl(String var22, String var24) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var16 = var24.toCharArray();
        int var12 = lIlIIllIIl[0];
        char[] var8 = var22.toCharArray();
        int var15 = var8.length;
        int var5 = lIlIIllIIl[0];
        while (N.lIIIllIlIlIll(var5, var15)) {
            char var2 = var8[var5];
            var11.append((char)(var2 ^ var16[var12 % var16.length]));
            0;
            ++var12;
            ++var5;
            0;
            if (-(0xB7 ^ 0xBA ^ (0x27 ^ 0x2E)) < 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static int lIIIllIlIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIllIllIIII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIllIlIlllI(int n2) {
        return n2 > 0;
    }

    private static void lIIIllIlIlIII() {
        lIlIIllIIl = new int[72];
        N.lIlIIllIIl[0] = (104 + 136 - 233 + 180 ^ 170 + 4 - 122 + 121) & (0xE9 ^ 0x86 ^ (0x70 ^ 9) ^ -1);
        N.lIlIIllIIl[1] = 1;
        N.lIlIIllIIl[2] = 0x42 ^ 0x6A;
        N.lIlIIllIIl[3] = 2;
        N.lIlIIllIIl[4] = 3;
        N.lIlIIllIIl[5] = 0xFFFFDF9D & 0x33EA;
        N.lIlIIllIIl[6] = 0x54 ^ 0x50;
        N.lIlIIllIIl[7] = -(0xFFFFAD1F & 0x76F5) & (0xFFFFB7FF & 0x6FF7);
        N.lIlIIllIIl[8] = -(0xFFFFDB8D & 0x7C77) & (0xFFFFFFFF & 0x5BEC);
        N.lIlIIllIIl[9] = -(0xFFFFFCD9 & 0x63BF) & (0xFFFFFFFF & 0x7FDF);
        N.lIlIIllIIl[10] = 75 + 86 - 146 + 135 ^ 81 + 18 - 4 + 52;
        N.lIlIIllIIl[11] = -(0xFFFFF685 & 0x4B7B) & (0xFFFFCFFB & 0x737F);
        N.lIlIIllIIl[12] = 0xCE ^ 0xA9 ^ 3;
        N.lIlIIllIIl[13] = 3 + 89 - -48 + 20 ^ 92 + 32 - 86 + 137;
        N.lIlIIllIIl[14] = 0x81 ^ 0x87;
        N.lIlIIllIIl[15] = 0x78 ^ 0x7F;
        N.lIlIIllIIl[16] = -(0xFFFFF547 & 0x5ABD) & (0xFFFFDDB7 & 0x777F);
        N.lIlIIllIIl[17] = 0xFFFF9FBF & 0x6575;
        N.lIlIIllIIl[18] = 0x2B ^ 0x23;
        N.lIlIIllIIl[19] = 0x26 ^ 0x32;
        N.lIlIIllIIl[20] = 0xA2 ^ 0xAC ^ (0x2E ^ 0x29);
        N.lIlIIllIIl[21] = 0xED ^ 0xC1 ^ (0x6E ^ 0x48);
        N.lIlIIllIIl[22] = 132 + 22 - 41 + 57 ^ 51 + 53 - 70 + 127;
        N.lIlIIllIIl[23] = 112 + 81 - 54 + 1 ^ 98 + 99 - 112 + 43;
        N.lIlIIllIIl[24] = 0x94 ^ 0x99;
        N.lIlIIllIIl[25] = 0x7A ^ 0x74;
        N.lIlIIllIIl[26] = 0x80 ^ 0x90;
        N.lIlIIllIIl[27] = -1;
        N.lIlIIllIIl[28] = 0xFFFFA29F & 0x2515D7E;
        N.lIlIIllIIl[29] = 0xBB ^ 0xBF ^ (0x6B ^ 0x7E);
        N.lIlIIllIIl[30] = 0x38 ^ 3 ^ (0x4B ^ 0x62);
        N.lIlIIllIIl[31] = 0x4F ^ 0x2D ^ (0x1B ^ 0x6A);
        N.lIlIIllIIl[32] = 0xD5 ^ 0xC0;
        N.lIlIIllIIl[33] = 0x6A ^ 0x4B ^ (0x79 ^ 0x4E);
        N.lIlIIllIIl[34] = 0x58 ^ 0x46;
        N.lIlIIllIIl[35] = 0x5F ^ 0x34 ^ (0xDF ^ 0xA3);
        N.lIlIIllIIl[36] = 0x59 ^ 0x76 ^ (0xF ^ 0x38);
        N.lIlIIllIIl[37] = 170 + 98 - 153 + 71 ^ 52 + 130 - 123 + 104;
        N.lIlIIllIIl[38] = 0x7C ^ 0x40 ^ (0xA6 ^ 0x80);
        N.lIlIIllIIl[39] = 0xB5 ^ 0xAE;
        N.lIlIIllIIl[40] = -(0xFFFFFB2F & 0x7FF1) & (0xFFFFFFED & 0x7FBB);
        N.lIlIIllIIl[41] = 136 + 5 - 104 + 146 ^ 101 + 131 - 91 + 30;
        N.lIlIIllIIl[42] = 0xFFFFC667 & 0x3DFB;
        N.lIlIIllIIl[43] = 0x2B ^ 0x36;
        N.lIlIIllIIl[44] = 0xFFFFAEB7 & 0x5579;
        N.lIlIIllIIl[45] = -(0xFFFFB769 & 0x6BD7) & (0xFFFFB7EF & 0x6FFF);
        N.lIlIIllIIl[46] = 0x4E ^ 0x6C ^ (0xA5 ^ 0x98);
        N.lIlIIllIIl[47] = 0xFFFFE6AB & 0x1FFC;
        N.lIlIIllIIl[48] = 0x3E ^ 7 ^ (0x29 ^ 0x30);
        N.lIlIIllIIl[49] = -(0xFFFFF897 & 0x576A) & (0xFFFFFFFF & 0x7B77);
        N.lIlIIllIIl[50] = 0x31 ^ 0x11 ^ 1;
        N.lIlIIllIIl[51] = -(0xFFFFFC79 & 0x7FF7) & (0xFFFFFFF6 & 0x7FFD);
        N.lIlIIllIIl[52] = -(0xFFFFBD96 & 0x62EF) & (0xFFFFBFDD & 0x7FEF);
        N.lIlIIllIIl[53] = -(0xFFFFF7DF & 0x5F64) & (0xFFFFFFFF & 0xDFFB);
        N.lIlIIllIIl[54] = -(0xFFFFFE5F & 0x13E7) & (0xFFFFF3FE & 0x7FEF);
        N.lIlIIllIIl[55] = -(0xFFFFF9DC & 0x6E2F) & (0xFFFFEBFF & 0x7DFF);
        N.lIlIIllIIl[56] = -(0xFFFFC94E & 0x76F9) & (0xFFFFFAFF & 0x7FDF);
        N.lIlIIllIIl[57] = 6 ^ 0x24;
        N.lIlIIllIIl[58] = 0xD1 ^ 0x8C ^ (0x4F ^ 0x31);
        N.lIlIIllIIl[59] = 0xFFFFFEFF & 0xD99;
        N.lIlIIllIIl[60] = -(0xFFFF9B37 & 0x74CE) & (0xFFFFDFDF & 0x3CFF);
        N.lIlIIllIIl[61] = -(0xFFFF961C & 0x79E7) & (0xFFFF9FFF & 0x7CAF);
        N.lIlIIllIIl[62] = 0xFFFFFEF1 & 0xDDE;
        N.lIlIIllIIl[63] = -(0xFFFFFB7B & 0x778D) & (0xFFFFFF79 & Short.MAX_VALUE);
        N.lIlIIllIIl[64] = -(0xFFFFD3FF & 0x3F01) & (0xFFFF9FDF & 0x7F7F);
        N.lIlIIllIIl[65] = 0x35 ^ 0x12 ^ (0x9B ^ 0x8C);
        N.lIlIIllIIl[66] = 0xFFFFFFDF & 0xCAD;
        N.lIlIIllIIl[67] = 0xFFFFDCEF & 0x2F7D;
        N.lIlIIllIIl[68] = -(0xFFFFBFFF & 0x7341) & (0xFFFFBFFF & 0x7FF6);
        N.lIlIIllIIl[69] = 0xFFFFBCDF & 0x4FBF;
        N.lIlIIllIIl[70] = -(0xFFFFFB37 & 0x25DE) & (0xFFFFFDF5 & 0x2FFF);
        N.lIlIIllIIl[71] = 0x82 ^ 0xAF ^ (0x76 ^ 0x7F);
    }

    private static boolean lIIIllIlIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aL() {
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
                                                                                    if (!N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) break block4;
                                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lIlIIllIIl[1]];
                                                                                    nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lIlIIllIIl[1]];
                                                                                    nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                                                                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lIlIIllIIl[1]];
                                                                                nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lIlIIllIIl[1]];
                                                                                nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                                                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lIlIIllIIl[1]];
                                                                            nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lIlIIllIIl[1]];
                                                                            nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lIlIIllIIl[1]];
                                                                        nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lIlIIllIIl[1]];
                                                                        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lIlIIllIIl[1]];
                                                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lIlIIllIIl[1]];
                                                                    nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lIlIIllIIl[1]];
                                                                    nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                                                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lIlIIllIIl[1]];
                                                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lIlIIllIIl[1]];
                                                                nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lIlIIllIIl[1]];
                                                                nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                                                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lIlIIllIIl[1]];
                                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lIlIIllIIl[1]];
                                                            nArray14[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lIlIIllIIl[1]];
                                                            nArray15[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lIlIIllIIl[1]];
                                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lIlIIllIIl[1]];
                                                        nArray16[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lIlIIllIIl[1];
                                                    0;
                                                    if (-1 <= 3) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = lIlIIllIIl[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lIlIIllIIl[1]];
                                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lIlIIllIIl[1]];
                                            nArray17[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lIlIIllIIl[1]];
                                            nArray18[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lIlIIllIIl[1]];
                                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lIlIIllIIl[1]];
                                        nArray19[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lIlIIllIIl[1]];
                                        nArray20[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lIlIIllIIl[1]];
                                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lIlIIllIIl[1]];
                                    nArray21[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lIlIIllIIl[1]];
                                    nArray22[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lIlIIllIIl[1]];
                                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lIlIIllIIl[1]];
                                nArray23[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lIlIIllIIl[1]];
                                nArray24[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lIlIIllIIl[1]];
                            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lIlIIllIIl[1]];
                            nArray25[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lIlIIllIIl[1]];
                            nArray26[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                            if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lIlIIllIIl[1]];
                        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lIlIIllIIl[1]];
                        nArray27[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lIlIIllIIl[1]];
                        nArray28[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
                        if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lIlIIllIIl[1]];
                    nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lIlIIllIIl[1]];
                    nArray29[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIllII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lIlIIllIIl[1]];
                    nArray30[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
                    if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lIlIIllIIl[1]];
                nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (!N.lIIIllIlIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lIlIIllIIl[1]];
                nArray31[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
                if (!N.lIIIllIlIlIlI(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lIlIIllIIl[1];
            0;
            if (((71 + 98 - 128 + 90 ^ 80 + 2 - 42 + 120) & (0xBC ^ 0xB6 ^ (0x63 ^ 0x4A) ^ -1)) == 0) return n2 != 0;
            return ((0x57 ^ 0x1F ^ (0xF ^ 0x49)) & (82 + 43 - -2 + 10 ^ 108 + 28 - 34 + 33 ^ -1)) != 0;
        }
        n2 = lIlIIllIIl[0];
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIlIIllIII[lIlIIllIIl[57]];
    }

    public static void ak() {
        if (N.lIIIllIlIllII(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[20]];
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)lIlIIllIIl[1]);
            0;
        }
        if (N.lIIIllIlIlIlI(cG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIII[lIlIIllIIl[21]];
            if (N.lIIIllIllIIIl(Players.getLocal().getInteracting())) {
                NPC var18 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (N.lIIIllIlIlIlI(nPC.getName().contains(lIlIIllIII[lIlIIllIIl[58]]) ? 1 : 0) && N.lIIIllIllIIIl(nPC.getInteracting()) && N.lIIIllIlIllII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIllIIl[1];
                        0;
                        if (((0xC7 ^ 0xA3 ^ (0xD8 ^ 0x9A)) & (172 + 44 - 78 + 44 ^ 7 + 29 - 32 + 140 ^ -1)) > 0) {
                            return ((101 + 62 - 62 + 53 ^ 31 + 23 - -89 + 48) & (0x83 ^ 0xAC ^ (0xCA ^ 0xC0) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIlIIllIIl[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lIlIIllIIl[3]];
                stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[22]];
                stringArray[N.lIlIIllIIl[1]] = lIlIIllIII[lIlIIllIIl[23]];
                List var6 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (N.lIIIllIllIIll(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIlIIllIIl[1];
                        0;
                        if (3 < 0) {
                            return (2 & (2 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIIllIIl[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (N.lIIIllIlIllII(var6.isEmpty() ? 1 : 0)) {
                    ((NPC)var6.get(lIlIIllIIl[0])).interact(lIlIIllIII[lIlIIllIIl[24]]);
                    Time.sleepTicks((int)lIlIIllIIl[3]);
                    0;
                }
                if (N.lIIIllIlIllIl(var18) && N.lIIIllIlIllII(Players.getLocal().isMoving() ? 1 : 0) && N.lIIIllIlIlIlI(var6.isEmpty() ? 1 : 0)) {
                    var18.interact(lIlIIllIII[lIlIIllIIl[25]]);
                    Time.sleepTicks((int)lIlIIllIIl[3]);
                    0;
                }
            }
            if (N.lIIIllIlIllIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lIlIIllIIl[6]);
                0;
            }
        }
    }

    private static boolean lIIIllIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIlIIlll() {
        lIlIIllIII = new String[lIlIIllIIl[71]];
        N.lIlIIllIII[N.lIlIIllIIl[0]] = N."Buying items";
        N.lIlIIllIII[N.lIlIIllIIl[1]] = N."Finished buying items, switching back to melee training";
        N.lIlIIllIII[N.lIlIIllIIl[3]] = N."Navigating to bank";
        N.lIlIIllIII[N.lIlIIllIIl[4]] = N."Handling banking";
        N.lIlIIllIII[N.lIlIIllIIl[6]] = N."We are missing supplies, switching to BUYING";
        N.lIlIIllIII[N.lIlIIllIIl[10]] = N."Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[14]] = N."Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[15]] = N."Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[18]] = N."Eat";
        N.lIlIIllIII[N.lIlIIllIIl[20]] = N."Walking to cow area";
        N.lIlIIllIII[N.lIlIIllIIl[21]] = N."Killing cows";
        N.lIlIIllIII[N.lIlIIllIIl[22]] = N."Cow";
        N.lIlIIllIII[N.lIlIIllIIl[23]] = N."cow";
        N.lIlIIllIII[N.lIlIIllIIl[24]] = N."Attack";
        N.lIlIIllIII[N.lIlIIllIIl[25]] = N."Attack";
        N.lIlIIllIII[N.lIlIIllIIl[13]] = N."Auto retaliate";
        N.lIlIIllIII[N.lIlIIllIIl[26]] = N."";
        N.lIlIIllIII[N.lIlIIllIIl[29]] = N."Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[30]] = N."Iron scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[31]] = N."Wield";
        N.lIlIIllIII[N.lIlIIllIIl[19]] = N."Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[32]] = N."Steel scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[33]] = N."Wield";
        N.lIlIIllIII[N.lIlIIllIIl[35]] = N."Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[36]] = N."Mithril scimitar";
        N.lIlIIllIII[N.lIlIIllIIl[37]] = N."Wield";
        N.lIlIIllIII[N.lIlIIllIIl[38]] = N."Wield";
        N.lIlIIllIII[N.lIlIIllIIl[39]] = N."Wield";
        N.lIlIIllIII[N.lIlIIllIIl[41]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[43]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[34]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[46]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[48]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[50]] = N."Wear";
        N.lIlIIllIII[N.lIlIIllIIl[57]] = N."40 Def";
        N.lIlIIllIII[N.lIlIIllIIl[58]] = N."Cow";
    }

    private static boolean lIIIllIlIllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIllIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIllIlIIlII(String var13, String var4) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIIllIIl[18]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIIllIIl[3], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static void aJ() {
        if (N.lIIIllIllIIlI(Static.getClient().getVar(lIlIIllIIl[22]), lIlIIllIIl[1])) {
            Static.getClient().invokeMenuAction(lIlIIllIII[lIlIIllIIl[13]], lIlIIllIII[lIlIIllIIl[26]], lIlIIllIIl[1], MenuAction.CC_OP.getId(), lIlIIllIIl[27], lIlIIllIIl[28]);
        }
        if (N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[10])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[29]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIlIIllIIl[1]];
                stringArray2[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[30]];
                Inventory.getFirst((String[])stringArray2).interact(lIlIIllIII[lIlIIllIIl[31]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[10]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[19]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIIllIIl[1]];
                stringArray3[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[32]];
                Inventory.getFirst((String[])stringArray3).interact(lIlIIllIII[lIlIIllIIl[33]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[19]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[34])) {
            String[] stringArray = new String[lIlIIllIIl[1]];
            stringArray[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[35]];
            if (N.lIIIllIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lIlIIllIIl[1]];
                stringArray4[N.lIlIIllIIl[0]] = lIlIIllIII[lIlIIllIIl[36]];
                Inventory.getFirst((String[])stringArray4).interact(lIlIIllIII[lIlIIllIIl[37]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[34]) && N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIIl[1]];
                nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
                Inventory.getFirst((int[])nArray2).interact(lIlIIllIII[lIlIIllIIl[38]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIIllIIl[1]];
                nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
                Inventory.getFirst((int[])nArray3).interact(lIlIIllIII[lIlIIllIIl[39]]);
            }
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[34])) {
            int[] nArray = new int[lIlIIllIIl[1]];
            nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lIlIIllIIl[1]];
                nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
                Inventory.getFirst((int[])nArray4).interact(lIlIIllIII[lIlIIllIIl[41]]);
            }
            int[] nArray5 = new int[lIlIIllIIl[1]];
            nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIlIIllIIl[1]];
                nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
                Inventory.getFirst((int[])nArray6).interact(lIlIIllIII[lIlIIllIIl[43]]);
            }
            int[] nArray7 = new int[lIlIIllIIl[1]];
            nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lIlIIllIIl[1]];
                nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
                Inventory.getFirst((int[])nArray8).interact(lIlIIllIII[lIlIIllIIl[34]]);
            }
            int[] nArray9 = new int[lIlIIllIIl[1]];
            nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
            if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIlIIllIIl[1]];
                nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
                Inventory.getFirst((int[])nArray10).interact(lIlIIllIII[lIlIIllIIl[46]]);
            }
        }
        int[] nArray = new int[lIlIIllIIl[1]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lIlIIllIIl[1]];
            nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
            Inventory.getFirst((int[])nArray11).interact(lIlIIllIII[lIlIIllIIl[48]]);
        }
        int[] nArray12 = new int[lIlIIllIIl[1]];
        nArray12[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (N.lIIIllIlIlIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIlIIllIIl[1]];
            nArray13[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
            Inventory.getFirst((int[])nArray13).interact(lIlIIllIII[lIlIIllIIl[50]]);
        }
    }

    @Override
    public int ad() {
        try {
            N.aH();
            0;
        }
        catch (Exception var20) {
            var20.printStackTrace();
        }
        if ((0x44 ^ 0x49 ^ (0x3A ^ 0x33)) <= 3) {
            return (0xB4 ^ 0x8B ^ (3 ^ 0x37)) & (0x68 ^ 0x7C ^ (0x4C ^ 0x53) ^ -1);
        }
        return lIlIIllIIl[0];
    }

    public static void aM() {
        if (N.lIIIllIlIlIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIllIIl[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    public static void O() {
        d var21;
        int[] nArray = new int[lIlIIllIIl[1]];
        nArray[N.lIlIIllIIl[0]] = lIlIIllIIl[9];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIllIIl[9], lIlIIllIIl[2], lIlIIllIIl[51]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIllIIl[1]];
        nArray2[N.lIlIIllIIl[0]] = lIlIIllIIl[52];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[52], lIlIIllIIl[10], lIlIIllIIl[51]);
            bp.add(var21);
            0;
        }
        int[] nArray3 = new int[lIlIIllIIl[1]];
        nArray3[N.lIlIIllIIl[0]] = lIlIIllIIl[49];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[49], lIlIIllIIl[1], lIlIIllIIl[53]);
            bp.add(var21);
            0;
        }
        int[] nArray4 = new int[lIlIIllIIl[1]];
        nArray4[N.lIlIIllIIl[0]] = lIlIIllIIl[47];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[47], lIlIIllIIl[1], lIlIIllIIl[54]);
            bp.add(var21);
            0;
        }
        int[] nArray5 = new int[lIlIIllIIl[1]];
        nArray5[N.lIlIIllIIl[0]] = lIlIIllIIl[11];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[11], lIlIIllIIl[12], lIlIIllIIl[55]);
            bp.add(var21);
            0;
        }
        int[] nArray6 = new int[lIlIIllIIl[1]];
        nArray6[N.lIlIIllIIl[0]] = lIlIIllIIl[40];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[40], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var21);
            0;
        }
        int[] nArray7 = new int[lIlIIllIIl[1]];
        nArray7[N.lIlIIllIIl[0]] = lIlIIllIIl[44];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[44], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var21);
            0;
        }
        int[] nArray8 = new int[lIlIIllIIl[1]];
        nArray8[N.lIlIIllIIl[0]] = lIlIIllIIl[45];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[45], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var21);
            0;
        }
        int[] nArray9 = new int[lIlIIllIIl[1]];
        nArray9[N.lIlIIllIIl[0]] = lIlIIllIIl[42];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[42], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var21);
            0;
        }
        if (N.lIIIllIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIllIIl[2])) {
            int[] nArray10 = new int[lIlIIllIIl[1]];
            nArray10[N.lIlIIllIIl[0]] = lIlIIllIIl[17];
            if (N.lIIIllIlIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var21 = new d(lIlIIllIIl[17], lIlIIllIIl[1], lIlIIllIIl[54]);
                bp.add(var21);
                0;
            }
        }
        int[] nArray11 = new int[lIlIIllIIl[1]];
        nArray11[N.lIlIIllIIl[0]] = lIlIIllIIl[16];
        if (N.lIIIllIlIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var21 = new d(lIlIIllIIl[16], lIlIIllIIl[1], lIlIIllIIl[56]);
            bp.add(var21);
            0;
        }
    }

    private static boolean lIIIllIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ac() {
        return lIlIIllIIl[0];
    }

    private static boolean lIIIllIllIIll(Object object, Object object2) {
        return object == object2;
    }
}

