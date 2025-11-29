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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.p;
import gg.squire.account.AccBuilderGWD;
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

public class ae
implements ab {
    public static /* synthetic */ WorldArea cP;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldArea cO;
    private static /* synthetic */ int[] lllIIlIll;
    public static /* synthetic */ int[] cM;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIIlIlI;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldPoint cR;

    private static String llIIIIlIlIIl(String lllIlllllIIII, String lllIllllIllll) {
        try {
            SecretKeySpec lllIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllllIIlI = Cipher.getInstance("Blowfish");
            lllIlllllIIlI.init(lllIIlIll[3], lllIlllllIIll);
            return new String(lllIlllllIIlI.doFinal(Base64.getDecoder().decode(lllIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllllIIIl) {
            lllIlllllIIIl.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
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
                                                                                    if (!ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) break block4;
                                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lllIIlIll[1]];
                                                                                    nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lllIIlIll[1]];
                                                                                    nArray3[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lllIIlIll[1]];
                                                                                nArray4[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lllIIlIll[1]];
                                                                                nArray5[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lllIIlIll[1]];
                                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lllIIlIll[1]];
                                                                            nArray6[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lllIIlIll[1]];
                                                                            nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lllIIlIll[1]];
                                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lllIIlIll[1]];
                                                                        nArray8[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lllIIlIll[1]];
                                                                        nArray9[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lllIIlIll[1]];
                                                                    nArray10[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lllIIlIll[1]];
                                                                    nArray11[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lllIIlIll[1]];
                                                                nArray12[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lllIIlIll[1]];
                                                                nArray13[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lllIIlIll[1]];
                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lllIIlIll[1]];
                                                            nArray14[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lllIIlIll[1]];
                                                            nArray15[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lllIIlIll[1]];
                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lllIIlIll[1]];
                                                        nArray16[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lllIIlIll[1];
                                                    "".length();
                                                    if (-" ".length() != (0x66 ^ 0x62)) return n3 != 0;
                                                    return ((0x9F ^ 0x99) & ~(0x29 ^ 0x2F)) != 0;
                                                }
                                                n3 = lllIIlIll[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lllIIlIll[1]];
                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lllIIlIll[1]];
                                            nArray17[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lllIIlIll[1]];
                                            nArray18[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lllIIlIll[1]];
                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lllIIlIll[1]];
                                        nArray19[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lllIIlIll[1]];
                                        nArray20[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lllIIlIll[1]];
                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lllIIlIll[1]];
                                    nArray21[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lllIIlIll[1]];
                                    nArray22[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lllIIlIll[1]];
                                nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lllIIlIll[1]];
                                nArray23[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lllIIlIll[1]];
                                nArray24[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lllIIlIll[1]];
                            nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lllIIlIll[1]];
                            nArray25[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lllIIlIll[1]];
                            nArray26[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lllIIlIll[1]];
                        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lllIIlIll[1]];
                        nArray27[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lllIIlIll[1]];
                        nArray28[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lllIIlIll[1]];
                    nArray29[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lllIIlIll[1]];
                    nArray30[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lllIIlIll[1]];
                nArray31[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lllIIlIll[1];
            "".length();
            if (null == null) return n2 != 0;
            return ((0xA2 ^ 0xB4) & ~(0xA6 ^ 0xB0)) != 0;
        }
        n2 = lllIIlIll[0];
        return n2 != 0;
    }

    private static void llIIIIlIlIll() {
        lllIIlIlI = new String[lllIIlIll[71]];
        ae.lllIIlIlI[ae.lllIIlIll[0]] = ae.llIIIIlIlIII("VMe1C+8csjWWizMxtg79Zw==", "VacIE");
        ae.lllIIlIlI[ae.lllIIlIll[1]] = ae.llIIIIlIlIII("+s/mkjjGczAGY8pAeN9wiT/ppK4VdaUdHW3gkmyDThRnF2sJh/tbnpm1ksJqyLxNLwjSid+smlc=", "mHbeQ");
        ae.lllIIlIlI[ae.lllIIlIll[3]] = ae.llIIIIlIlIII("ZX1IqN7yBwHGFyF04aJOiE3yB9/gx3r8", "tBwcw");
        ae.lllIIlIlI[ae.lllIIlIll[4]] = ae.llIIIIlIlIIl("H/aLtDW5pbAT1GEwgz+rfLISqofjrhXI", "XUPJJ");
        ae.lllIIlIlI[ae.lllIIlIll[6]] = ae.llIIIIlIlIlI("EwRQKTUhQR0hNDcIHi9nNxQAOCstBANkZzcWGTwkLAgeL2cwDlAKEh0oPg8=", "DapHG");
        ae.lllIIlIlI[ae.lllIIlIll[10]] = ae.llIIIIlIlIlI("Hgg9HUokGTseAyMbIA==", "WzRsj");
        ae.lllIIlIlI[ae.lllIIlIll[14]] = ae.llIIIIlIlIII("mRC3qWRtO9YvMiD5tzjXrg==", "AfnqM");
        ae.lllIIlIlI[ae.lllIIlIll[15]] = ae.llIIIIlIlIlI("NCQaIRsQIU46ChAgBz0ICw==", "yMnIi");
        ae.lllIIlIlI[ae.lllIIlIll[18]] = ae.llIIIIlIlIIl("rKsb+Uvfc6g=", "gkEgN");
        ae.lllIIlIlI[ae.lllIIlIll[20]] = ae.llIIIIlIlIII("0KABC0C+JxgFWwDJ6vVl8ZxR8u9xw0AO", "UiNTF");
        ae.lllIIlIlI[ae.lllIIlIll[21]] = ae.llIIIIlIlIIl("/BGdB7IZfyt+tNwis2otCA==", "qyJQv");
        ae.lllIIlIlI[ae.lllIIlIll[22]] = ae.llIIIIlIlIIl("nfanut7HkKQ=", "IEAOn");
        ae.lllIIlIlI[ae.lllIIlIll[23]] = ae.llIIIIlIlIII("3nUFlwWgn00=", "jBFLH");
        ae.lllIIlIlI[ae.lllIIlIll[24]] = ae.llIIIIlIlIIl("qKN39sQZBAk=", "PGSOE");
        ae.lllIIlIlI[ae.lllIIlIll[25]] = ae.llIIIIlIlIIl("xPapaauY45U=", "blzWY");
        ae.lllIIlIlI[ae.lllIIlIll[13]] = ae.llIIIIlIlIII("muV1n1i8IMuBzneKK3KKyQ==", "XSCwQ");
        ae.lllIIlIlI[ae.lllIIlIll[26]] = ae.llIIIIlIlIII("IwNXE05TZ4o=", "HNnks");
        ae.lllIIlIlI[ae.lllIIlIll[29]] = ae.llIIIIlIlIIl("jG4KeHI7hQKAIRt5vlLmcg==", "NoKAt");
        ae.lllIIlIlI[ae.lllIIlIll[30]] = ae.llIIIIlIlIlI("GREKFGEjAAwXKCQCFw==", "PcezA");
        ae.lllIIlIlI[ae.lllIIlIll[31]] = ae.llIIIIlIlIlI("ET0pDzM=", "FTLcW");
        ae.lllIIlIlI[ae.lllIIlIll[19]] = ae.llIIIIlIlIIl("xxke3oigSEQ5BWSbRigx0Q==", "JBYku");
        ae.lllIIlIlI[ae.lllIIlIll[32]] = ae.llIIIIlIlIlI("MDEpEQRDNi8dBQoxLQY=", "cELth");
        ae.lllIIlIlI[ae.lllIIlIll[33]] = ae.llIIIIlIlIIl("p1fDHPTK5M0=", "QDMDv");
        ae.lllIIlIlI[ae.lllIIlIll[35]] = ae.llIIIIlIlIIl("D5J/hitwPq/7T1HIdMHSZ2FBNg1mi/Kz", "LJEhS");
        ae.lllIIlIlI[ae.lllIIlIll[36]] = ae.llIIIIlIlIlI("Iy8WHhcHKkIFBgcrCwIEHA==", "nFbve");
        ae.lllIIlIlI[ae.lllIIlIll[37]] = ae.llIIIIlIlIII("BYBqMhBsdsQ=", "tPGzM");
        ae.lllIIlIlI[ae.lllIIlIll[38]] = ae.llIIIIlIlIII("TRUlk4eJuMs=", "RWajL");
        ae.lllIIlIlI[ae.lllIIlIll[39]] = ae.llIIIIlIlIII("8LPGFL5DYts=", "upjwe");
        ae.lllIIlIlI[ae.lllIIlIll[41]] = ae.llIIIIlIlIlI("HxwLCA==", "HyjzC");
        ae.lllIIlIlI[ae.lllIIlIll[43]] = ae.llIIIIlIlIIl("St/LvPMKpxM=", "LTzzO");
        ae.lllIIlIlI[ae.lllIIlIll[34]] = ae.llIIIIlIlIII("B4/hC38Kx3Q=", "zMHZt");
        ae.lllIIlIlI[ae.lllIIlIll[46]] = ae.llIIIIlIlIII("zFB51O7Pn58=", "tyuPG");
        ae.lllIIlIlI[ae.lllIIlIll[48]] = ae.llIIIIlIlIII("EGATN4TynKA=", "xYGkJ");
        ae.lllIIlIlI[ae.lllIIlIll[50]] = ae.llIIIIlIlIII("sutPIxincjM=", "qbwEr");
        ae.lllIIlIlI[ae.lllIIlIll[57]] = ae.llIIIIlIlIII("BvT0sFD5cXY=", "FKnNS");
        ae.lllIIlIlI[ae.lllIIlIll[58]] = ae.llIIIIlIlIII("X4cgB2jz0vo=", "EVdZp");
    }

    private static boolean llIIIIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
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
                                                                            if (!ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) break block8;
                                                                            int[] nArray = new int[lllIIlIll[1]];
                                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lllIIlIll[1]];
                                                                            nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lllIIlIll[1]];
                                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lllIIlIll[1]];
                                                                        nArray3[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lllIIlIll[1]];
                                                                    nArray4[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lllIIlIll[1]];
                                                                nArray5[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lllIIlIll[1]];
                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lllIIlIll[1]];
                                                            nArray6[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lllIIlIll[1]];
                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lllIIlIll[1]];
                                                        nArray7[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lllIIlIll[1]];
                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lllIIlIll[1]];
                                                    nArray8[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lllIIlIll[1]];
                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lllIIlIll[1];
                                                    "".length();
                                                    if (null == null) return n3 != 0;
                                                    return ((0xC8 ^ 0x91) & ~(0xCF ^ 0x96)) != 0;
                                                }
                                            }
                                            n3 = lllIIlIll[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lllIIlIll[1]];
                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lllIIlIll[1]];
                                        nArray9[ae.lllIIlIll[0]] = lllIIlIll[16];
                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lllIIlIll[1]];
                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lllIIlIll[1]];
                                    nArray10[ae.lllIIlIll[0]] = lllIIlIll[42];
                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lllIIlIll[1]];
                                nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lllIIlIll[1]];
                                nArray11[ae.lllIIlIll[0]] = lllIIlIll[44];
                                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lllIIlIll[1]];
                            nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lllIIlIll[1]];
                            nArray12[ae.lllIIlIll[0]] = lllIIlIll[40];
                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lllIIlIll[1]];
                        nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lllIIlIll[1]];
                        nArray13[ae.lllIIlIll[0]] = lllIIlIll[45];
                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lllIIlIll[1]];
                    nArray14[ae.lllIIlIll[0]] = lllIIlIll[47];
                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lllIIlIll[1]];
                nArray15[ae.lllIIlIll[0]] = lllIIlIll[49];
                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIIlIll[1];
                "".length();
                if (null == null) return n2 != 0;
                return ((0x1D ^ 0x38) & ~(0xB0 ^ 0x95)) != 0;
            }
        }
        n2 = lllIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIIIIllIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lllIIlIll[0];
    }

    public static void am() {
        if (ae.llIIIIllIIII(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[20]];
            Movement.walkTo((WorldPoint)cm);
            "".length();
            Time.sleepTicks((int)lllIIlIll[1]);
            "".length();
        }
        if (ae.llIIIIlIlllI(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[21]];
            if (ae.llIIIIllIlIl(Players.getLocal().getInteracting())) {
                NPC llllIIIIIIIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (ae.llIIIIlIlllI(nPC.getName().contains(lllIIlIlI[lllIIlIll[58]]) ? 1 : 0) && ae.llIIIIllIlIl(nPC.getInteracting()) && ae.llIIIIllIIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIlIll[1];
                        "".length();
                        if (-(0xBE ^ 0xBA) >= 0) {
                            return ((0xC ^ 0x2C) & ~(6 ^ 0x26)) != 0;
                        }
                    } else {
                        n2 = lllIIlIll[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lllIIlIll[3]];
                stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[22]];
                stringArray[ae.lllIIlIll[1]] = lllIIlIlI[lllIIlIll[23]];
                List llllIIIIIIIII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (ae.llIIIIllIlll(nPC.getInteracting(), Players.getLocal())) {
                        bl = lllIIlIll[1];
                        "".length();
                        if (((0x9C ^ 0xBA ^ (0x32 ^ 0x4F)) & (157 + 85 - 229 + 183 ^ 15 + 132 - 115 + 127 ^ -" ".length())) > ((0x32 ^ 0x5B ^ (0x50 ^ 0x19)) & (181 + 82 - 201 + 126 ^ 72 + 29 - -43 + 12 ^ -" ".length()))) {
                            return ((151 + 155 - 198 + 61 ^ 120 + 173 - 252 + 138) & (102 + 64 - 83 + 51 ^ 76 + 23 - -16 + 41 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lllIIlIll[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (ae.llIIIIllIIII(llllIIIIIIIII.isEmpty() ? 1 : 0)) {
                    ((NPC)llllIIIIIIIII.get(lllIIlIll[0])).interact(lllIIlIlI[lllIIlIll[24]]);
                    Time.sleepTicks((int)lllIIlIll[3]);
                    "".length();
                }
                if (ae.llIIIIllIIIl(llllIIIIIIIIl) && ae.llIIIIllIIII(Players.getLocal().isMoving() ? 1 : 0) && ae.llIIIIlIlllI(llllIIIIIIIII.isEmpty() ? 1 : 0)) {
                    llllIIIIIIIIl.interact(lllIIlIlI[lllIIlIll[25]]);
                    Time.sleepTicks((int)lllIIlIll[3]);
                    "".length();
                }
            }
            if (ae.llIIIIllIIIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lllIIlIll[6]);
                "".length();
            }
        }
    }

    private static int llIIIIlIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void aO() {
        if (ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    public static void aL() {
        if (ae.llIIIIllIllI(Static.getClient().getVar(lllIIlIll[22]), lllIIlIll[1])) {
            Static.getClient().invokeMenuAction(lllIIlIlI[lllIIlIll[13]], lllIIlIlI[lllIIlIll[26]], lllIIlIll[1], MenuAction.CC_OP.getId(), lllIIlIll[27], lllIIlIll[28]);
        }
        if (ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[10])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[29]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIll[1]];
                stringArray2[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[30]];
                Inventory.getFirst((String[])stringArray2).interact(lllIIlIlI[lllIIlIll[31]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[10]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[19]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIIlIll[1]];
                stringArray3[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[32]];
                Inventory.getFirst((String[])stringArray3).interact(lllIIlIlI[lllIIlIll[33]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[34])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[35]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lllIIlIll[1]];
                stringArray4[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[36]];
                Inventory.getFirst((String[])stringArray4).interact(lllIIlIlI[lllIIlIll[37]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[34]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIlIll[1]];
                nArray2[ae.lllIIlIll[0]] = lllIIlIll[16];
                Inventory.getFirst((int[])nArray2).interact(lllIIlIlI[lllIIlIll[38]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIIlIll[1]];
                nArray3[ae.lllIIlIll[0]] = lllIIlIll[17];
                Inventory.getFirst((int[])nArray3).interact(lllIIlIlI[lllIIlIll[39]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[34])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIIlIll[1]];
                nArray4[ae.lllIIlIll[0]] = lllIIlIll[40];
                Inventory.getFirst((int[])nArray4).interact(lllIIlIlI[lllIIlIll[41]]);
            }
            int[] nArray5 = new int[lllIIlIll[1]];
            nArray5[ae.lllIIlIll[0]] = lllIIlIll[42];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllIIlIll[1]];
                nArray6[ae.lllIIlIll[0]] = lllIIlIll[42];
                Inventory.getFirst((int[])nArray6).interact(lllIIlIlI[lllIIlIll[43]]);
            }
            int[] nArray7 = new int[lllIIlIll[1]];
            nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lllIIlIll[1]];
                nArray8[ae.lllIIlIll[0]] = lllIIlIll[44];
                Inventory.getFirst((int[])nArray8).interact(lllIIlIlI[lllIIlIll[34]]);
            }
            int[] nArray9 = new int[lllIIlIll[1]];
            nArray9[ae.lllIIlIll[0]] = lllIIlIll[45];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lllIIlIll[1]];
                nArray10[ae.lllIIlIll[0]] = lllIIlIll[45];
                Inventory.getFirst((int[])nArray10).interact(lllIIlIlI[lllIIlIll[46]]);
            }
        }
        int[] nArray = new int[lllIIlIll[1]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
        if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lllIIlIll[1]];
            nArray11[ae.lllIIlIll[0]] = lllIIlIll[47];
            Inventory.getFirst((int[])nArray11).interact(lllIIlIlI[lllIIlIll[48]]);
        }
        int[] nArray12 = new int[lllIIlIll[1]];
        nArray12[ae.lllIIlIll[0]] = lllIIlIll[49];
        if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIIlIll[1]];
            nArray13[ae.lllIIlIll[0]] = lllIIlIll[49];
            Inventory.getFirst((int[])nArray13).interact(lllIIlIlI[lllIIlIll[50]]);
        }
    }

    private static String llIIIIlIlIII(String lllIllllIIIIl, String lllIllllIIIlI) {
        try {
            SecretKeySpec lllIllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIll[18]), "DES");
            Cipher lllIllllIIlIl = Cipher.getInstance("DES");
            lllIllllIIlIl.init(lllIIlIll[3], lllIllllIIllI);
            return new String(lllIllllIIlIl.doFinal(Base64.getDecoder().decode(lllIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllllIIlII) {
            lllIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
            bl = lllIIlIll[1];
            "".length();
            if (-" ".length() > ((0x26 ^ 0x4D ^ (0x37 ^ 0x74)) & (0x39 ^ 0x32 ^ (0x75 ^ 0x56) ^ -" ".length()))) {
                return ((40 + 35 - -3 + 88 ^ 40 + 65 - -34 + 15) & (0x5A ^ 0x1C ^ (0xF9 ^ 0x83) ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIlIll[0];
        }
        return bl;
    }

    private static boolean llIIIIllIlII(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    static {
        ae.llIIIIlIllII();
        ae.llIIIIlIlIll();
        bx = new ArrayList<d>();
        int[] nArray = new int[lllIIlIll[18]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
        nArray[ae.lllIIlIll[1]] = lllIIlIll[17];
        nArray[ae.lllIIlIll[3]] = lllIIlIll[42];
        nArray[ae.lllIIlIll[4]] = lllIIlIll[44];
        nArray[ae.lllIIlIll[6]] = lllIIlIll[40];
        nArray[ae.lllIIlIll[10]] = lllIIlIll[45];
        nArray[ae.lllIIlIll[14]] = lllIIlIll[47];
        nArray[ae.lllIIlIll[15]] = lllIIlIll[49];
        cM = nArray;
        cN = new WorldArea(lllIIlIll[59], lllIIlIll[60], lllIIlIll[22], lllIIlIll[22], lllIIlIll[0]);
        cO = new WorldArea(lllIIlIll[61], lllIIlIll[62], lllIIlIll[32], lllIIlIll[26], lllIIlIll[0]);
        cP = new WorldArea(lllIIlIll[63], lllIIlIll[64], lllIIlIll[65], lllIIlIll[34], lllIIlIll[0]);
        cQ = new WorldPoint(lllIIlIll[66], lllIIlIll[67], lllIIlIll[0]);
        cm = new WorldPoint(lllIIlIll[68], lllIIlIll[60], lllIIlIll[0]);
        cR = new WorldPoint(lllIIlIll[69], lllIIlIll[70], lllIIlIll[0]);
    }

    private static boolean llIIIIlIlllI(int n2) {
        return n2 != 0;
    }

    private static void llIIIIlIllII() {
        lllIIlIll = new int[72];
        ae.lllIIlIll[0] = (0xFA ^ 0x9F ^ (0x35 ^ 7)) & (47 + 39 - -48 + 17 ^ 91 + 147 - 88 + 42 ^ -" ".length());
        ae.lllIIlIll[1] = " ".length();
        ae.lllIIlIll[2] = 0x71 ^ 0x59;
        ae.lllIIlIll[3] = "  ".length();
        ae.lllIIlIll[4] = "   ".length();
        ae.lllIIlIll[5] = -(0xFFFFEF74 & 0x74FF) & (0xFFFFFFFF & 0x77FB);
        ae.lllIIlIll[6] = 0xD3 ^ 0x90 ^ (0x32 ^ 0x75);
        ae.lllIIlIll[7] = 0xFFFFC3EB & 0x3FF7;
        ae.lllIIlIll[8] = 0xFFFF9FFE & 0x63E9;
        ae.lllIIlIll[9] = 0xFFFFFFEF & 0x1F57;
        ae.lllIIlIll[10] = 0x54 ^ 0x51;
        ae.lllIIlIll[11] = 0xFFFFE17B & 0x1FFF;
        ae.lllIIlIll[12] = 0xF7 ^ 0x93;
        ae.lllIIlIll[13] = 0x72 ^ 0x7D;
        ae.lllIIlIll[14] = 0x36 ^ 0x30;
        ae.lllIIlIll[15] = 0x19 ^ 0x1E;
        ae.lllIIlIll[16] = -(0xFFFFFB69 & 0x36D7) & (0xFFFFBFFB & 0x7777);
        ae.lllIIlIll[17] = -(0xFFFFF3AB & 0x3CD7) & (0xFFFFBDF7 & 0x77BF);
        ae.lllIIlIll[18] = 0x30 ^ 0x7E ^ (0x80 ^ 0xC6);
        ae.lllIIlIll[19] = 0x62 ^ 0x76;
        ae.lllIIlIll[20] = 0xCF ^ 0xC6;
        ae.lllIIlIll[21] = 0x76 ^ 0x7C;
        ae.lllIIlIll[22] = 0x51 ^ 0x5A;
        ae.lllIIlIll[23] = 0xA4 ^ 0x8F ^ (0x8F ^ 0xA8);
        ae.lllIIlIll[24] = 0x9C ^ 0x8B ^ (0x87 ^ 0x9D);
        ae.lllIIlIll[25] = 0xB ^ 5;
        ae.lllIIlIll[26] = 94 + 139 - 182 + 108 ^ 70 + 16 - 15 + 72;
        ae.lllIIlIll[27] = -" ".length();
        ae.lllIIlIll[28] = -(0xFFFFFDFE & 0x7F43) & (0xFFFFFF7F & 0x2517DDF);
        ae.lllIIlIll[29] = 114 + 134 - 139 + 56 ^ 87 + 19 - 83 + 157;
        ae.lllIIlIll[30] = 0x20 ^ 0x32;
        ae.lllIIlIll[31] = 0xE ^ 0x1D;
        ae.lllIIlIll[32] = 199 + 199 - 215 + 25 ^ 137 + 135 - 110 + 35;
        ae.lllIIlIll[33] = 0xED ^ 0xC2 ^ (0xB5 ^ 0x8C);
        ae.lllIIlIll[34] = 0x69 ^ 0x77 ^ (0x44 ^ 0x77) & ~(0x12 ^ 0x21);
        ae.lllIIlIll[35] = 0x2F ^ 0x38;
        ae.lllIIlIll[36] = 0x5A ^ 0x42;
        ae.lllIIlIll[37] = 0xBF ^ 0xA6;
        ae.lllIIlIll[38] = 0x6E ^ 0x74;
        ae.lllIIlIll[39] = 2 ^ 0x19;
        ae.lllIIlIll[40] = 0xFFFFBDA9 & 0x46DF;
        ae.lllIIlIll[41] = 0xD8 ^ 0xC4;
        ae.lllIIlIll[42] = 0xFFFFB773 & 0x4CEF;
        ae.lllIIlIll[43] = 0x98 ^ 0x85;
        ae.lllIIlIll[44] = 0xFFFF94F7 & 0x6F39;
        ae.lllIIlIll[45] = 0xFFFFD5EF & 0x2EBF;
        ae.lllIIlIll[46] = 0xEC ^ 0xA5 ^ (0x3B ^ 0x6D);
        ae.lllIIlIll[47] = 0xFFFFCFEB & 0x36BC;
        ae.lllIIlIll[48] = (0x19 ^ 0x12) & ~(0x60 ^ 0x6B) ^ (0xE4 ^ 0xC4);
        ae.lllIIlIll[49] = -(0xFFFFFEB3 & 0x51CD) & (0xFFFFFFF7 & 0x7BFE);
        ae.lllIIlIll[50] = 0x8C ^ 0xAD;
        ae.lllIIlIll[51] = 0xFFFFAFE4 & 0x539F;
        ae.lllIIlIll[52] = -(0xFFFFF7A5 & 0x685F) & (0xFFFFFFCC & 0x7F7F);
        ae.lllIIlIll[53] = -(0xFFFFF7D7 & 0x7C2F) & (0xFFFFFEBE & 0xFDFF);
        ae.lllIIlIll[54] = -(0xFFFFFEB7 & 0xF49) & (0xFFFFFFBC & 0x6FEB);
        ae.lllIIlIll[55] = 0xFFFFABF5 & 0x55FE;
        ae.lllIIlIll[56] = -(0xFFFFD5E7 & 0x6E3E) & (0xFFFFFEFD & 0x7FBF);
        ae.lllIIlIll[57] = 0xB2 ^ 0x90;
        ae.lllIIlIll[58] = 0x46 ^ 0x65;
        ae.lllIIlIll[59] = 0xFFFF9CDF & 0x6FB9;
        ae.lllIIlIll[60] = 0xFFFFCFFB & 0x3CDE;
        ae.lllIIlIll[61] = 0xFFFFCCED & 0x3FBE;
        ae.lllIIlIll[62] = 0xFFFFCCFE & 0x3FD1;
        ae.lllIIlIll[63] = -(0xFFFFD797 & 0x7BEF) & (0xFFFFDFF7 & Short.MAX_VALUE);
        ae.lllIIlIll[64] = -(0xFFFFB72B & 0x4BF5) & (0xFFFFAF7F & 0x5FFF);
        ae.lllIIlIll[65] = 0x36 ^ 6;
        ae.lllIIlIll[66] = 0xFFFFAC8D & 0x5FFF;
        ae.lllIIlIll[67] = 0xFFFFCC6D & 0x3FFF;
        ae.lllIIlIll[68] = -(0xFFFFAFCF & 0x727A) & (0xFFFFEFFF & 0x3EFF);
        ae.lllIIlIll[69] = -(0xFFFFC9E5 & 0x373B) & (0xFFFFBFBF & 0x4DFF);
        ae.lllIIlIll[70] = 0xFFFFEDEB & 0x1EF4;
        ae.lllIIlIll[71] = 0x7E ^ 0x5D ^ (0x92 ^ 0x95);
    }

    private static boolean llIIIIllIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Q() {
        d lllIllllllllI;
        int[] nArray = new int[lllIIlIll[1]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[9];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIlIll[9], lllIIlIll[2], lllIIlIll[51]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIIlIll[1]];
        nArray2[ae.lllIIlIll[0]] = lllIIlIll[52];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[52], lllIIlIll[10], lllIIlIll[51]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray3 = new int[lllIIlIll[1]];
        nArray3[ae.lllIIlIll[0]] = lllIIlIll[49];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[49], lllIIlIll[1], lllIIlIll[53]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray4 = new int[lllIIlIll[1]];
        nArray4[ae.lllIIlIll[0]] = lllIIlIll[47];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[47], lllIIlIll[1], lllIIlIll[54]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray5 = new int[lllIIlIll[1]];
        nArray5[ae.lllIIlIll[0]] = lllIIlIll[11];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[11], lllIIlIll[12], lllIIlIll[55]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray6 = new int[lllIIlIll[1]];
        nArray6[ae.lllIIlIll[0]] = lllIIlIll[40];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[40], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray7 = new int[lllIIlIll[1]];
        nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[44], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray8 = new int[lllIIlIll[1]];
        nArray8[ae.lllIIlIll[0]] = lllIIlIll[45];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[45], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);
            "".length();
        }
        int[] nArray9 = new int[lllIIlIll[1]];
        nArray9[ae.lllIIlIll[0]] = lllIIlIll[42];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[42], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);
            "".length();
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray10 = new int[lllIIlIll[1]];
            nArray10[ae.lllIIlIll[0]] = lllIIlIll[17];
            if (ae.llIIIIllIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lllIllllllllI = new d(lllIIlIll[17], lllIIlIll[1], lllIIlIll[54]);
                bx.add(lllIllllllllI);
                "".length();
            }
        }
        int[] nArray11 = new int[lllIIlIll[1]];
        nArray11[ae.lllIIlIll[0]] = lllIIlIll[16];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lllIllllllllI = new d(lllIIlIll[16], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);
            "".length();
        }
    }

    public static void aJ() {
        block17: {
            block19: {
                block18: {
                    if (ae.llIIIIlIlllI(bv ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIlIlI[lllIIlIll[0]];
                        b.a(bx);
                        if (ae.llIIIIlIllll(bx.size(), lllIIlIll[1])) {
                            System.out.println(lllIIlIlI[lllIIlIll[1]]);
                            bv = lllIIlIll[0];
                        }
                    }
                    if (!ae.llIIIIllIIII(bv ? 1 : 0)) break block17;
                    if (ae.llIIIIllIIII(ae.aM() ? 1 : 0) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
                        BankLocation llllIIIIIIlII = BankLocation.getNearest();
                        if (ae.llIIIIllIIIl(llllIIIIIIlII) && ae.llIIIIllIIII(llllIIIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[3]];
                            a.a(llllIIIIIIlII);
                        }
                        if (ae.llIIIIllIIIl(llllIIIIIIlII) && ae.llIIIIlIlllI(llllIIIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[4]];
                            if (ae.llIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIll[5]);
                                "".length();
                            }
                            if (ae.llIIIIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                if (ae.llIIIIllIIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIIlIll[1]);
                                    "".length();
                                }
                                if (ae.llIIIIllIIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIIlIll[3]);
                                    "".length();
                                }
                                if (ae.llIIIIllIIII(ae.aN() ? 1 : 0)) {
                                    ae.Q();
                                    System.out.println(lllIIlIlI[lllIIlIll[6]]);
                                    bv = lllIIlIll[1];
                                    return;
                                }
                                a.a(cM, lllIIlIll[1]);
                                a.a(lllIIlIll[7], lllIIlIll[8]);
                                a.b(f.bc, lllIIlIll[1]);
                                a.a(lllIIlIll[9], lllIIlIll[10]);
                                a.a(lllIIlIll[11], lllIIlIll[12]);
                            }
                        }
                    }
                    if (!ae.llIIIIlIlllI(ae.aM() ? 1 : 0)) break block17;
                    ae.aL();
                    if (ae.llIIIIllIIll(Movement.getRunEnergy(), lllIIlIll[13]) && ae.llIIIIllIIII(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lllIIlIll[1]];
                    stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[10]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lllIIlIll[1]];
                    stringArray2[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[14]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lllIIlIll[1]];
                    stringArray3[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[15]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lllIIlIll[1]];
                    nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                    if (!ae.llIIIIlIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                ae.aO();
            }
            if (ae.llIIIIllIlII(ae.llIIIIlIllIl(e.w(), 45.0))) {
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIIlIll[1]];
                    nArray3[ae.lllIIlIll[0]] = lllIIlIll[11];
                    Inventory.getFirst((int[])nArray3).interact(lllIIlIlI[lllIIlIll[18]]);
                    Time.sleepTicks((int)lllIIlIll[1]);
                    "".length();
                }
            }
            if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19]) && ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIlIll[19])) {
                p.al();
            }
        }
    }

    @Override
    public int af() {
        try {
            ae.aJ();
            "".length();
        }
        catch (Exception lllIlllllllII) {
            lllIlllllllII.printStackTrace();
        }
        if (((0xC4 ^ 0x84) & ~(0x75 ^ 0x35)) != 0) {
            return (0xD2 ^ 0xC2) & ~(0xAE ^ 0xBE);
        }
        return lllIIlIll[0];
    }

    private static String llIIIIlIlIlI(String lllIlllIlIIll, String lllIlllIIllIl) {
        lllIlllIlIIll = new String(Base64.getDecoder().decode(lllIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllIlIIIl = new StringBuilder();
        char[] lllIlllIlIIII = lllIlllIIllIl.toCharArray();
        int lllIlllIIllll = lllIIlIll[0];
        char[] lllIlllIIlIIl = lllIlllIlIIll.toCharArray();
        int lllIlllIIlIII = lllIlllIIlIIl.length;
        int lllIlllIIIlll = lllIIlIll[0];
        while (ae.llIIIIlIllll(lllIlllIIIlll, lllIlllIIlIII)) {
            char lllIlllIlIlII = lllIlllIIlIIl[lllIlllIIIlll];
            lllIlllIlIIIl.append((char)(lllIlllIlIlII ^ lllIlllIlIIII[lllIlllIIllll % lllIlllIlIIII.length]));
            "".length();
            ++lllIlllIIllll;
            ++lllIlllIIIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllIlllIlIIIl);
    }

    private static boolean llIIIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lllIIlIlI[lllIIlIll[57]];
    }
}

