/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class P
implements K {
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ int[] lIlIlIlIII;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ String[] lIlIlIIlll;
    static /* synthetic */ WorldPoint cf;
    public static /* synthetic */ boolean cc;
    static /* synthetic */ WorldArea cd;

    static {
        P.lIIlIIIIIlIll();
        P.lIIlIIIIIlIlI();
        cc = lIlIlIlIII[0];
        bp = new ArrayList<d>();
        cd = new WorldArea(lIlIlIlIII[76], lIlIlIlIII[77], lIlIlIlIII[51], lIlIlIlIII[41], lIlIlIlIII[0]);
        ce = new WorldPoint(lIlIlIlIII[78], lIlIlIlIII[79], lIlIlIlIII[0]);
        cf = null;
    }

    private static int lIIlIIIIlIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void ak() {
        if (P.lIIlIIIIlIlIl(P.lIIlIIIIlIlII(e.u(), 30.0))) {
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
            if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIlIlIII[1]];
                nArray2[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                Inventory.getFirst((int[])nArray2).interact(lIlIlIIlll[lIlIlIlIII[43]]);
                Time.sleepTicks((int)lIlIlIlIII[1]);
                "".length();
            }
        }
        if (P.lIIlIIIIlIIll(Players.getLocal().getInteracting())) {
            NPC lllllllllllllllllllIlllIllIIIIII = NPCs.getNearest(nPC -> {
                int n2;
                if (P.lIIlIIIIIllII(nPC.getName().contains(lIlIlIIlll[lIlIlIlIII[75]]) ? 1 : 0) && P.lIIlIIIIIlllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlIlIlIII[1];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x83 ^ 0xAA) & ~(0xEE ^ 0xC7)) != 0;
                    }
                } else {
                    n2 = lIlIlIlIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIlIlIlIII[3]];
            stringArray[P.lIlIlIlIII[0]] = lIlIlIIlll[lIlIlIlIII[44]];
            stringArray[P.lIlIlIlIII[1]] = lIlIlIIlll[lIlIlIlIII[45]];
            List lllllllllllllllllllIlllIlIllllll = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (P.lIIlIIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlIlIlIII[1];
                    "".length();
                    if (-" ".length() >= ((81 + 122 - 90 + 16 ^ 119 + 74 - 102 + 66) & (0x1F ^ 0x73 ^ (0x2D ^ 0x5D) ^ -" ".length()))) {
                        return ((0x60 ^ 0x3A ^ (0x4A ^ 0x18)) & (0xC4 ^ 0x9D ^ (0x17 ^ 0x46) ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lIlIlIlIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
            if (P.lIIlIIIIIllII(Equipment.contains((int[])nArray) ? 1 : 0) && P.lIIlIIIIIlllI(P.an() ? 1 : 0)) {
                P.ao();
            }
            if (P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIIII) && P.lIIlIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                lllllllllllllllllllIlllIllIIIIII.interact(lIlIlIIlll[lIlIlIlIII[47]]);
                Time.sleepTicks((int)lIlIlIlIII[4]);
                "".length();
            }
        }
    }

    private static boolean lIIlIIIIlIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIllll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIlIlIl(int n2) {
        return n2 < 0;
    }

    private static void O() {
        d lllllllllllllllllllIlllIlIlllIll;
        Object lllllllllllllllllllIlllIlIllllII;
        if (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIlIlIlIII[16], lIlIlIlIII[57], lIlIlIlIII[58]);
                bp.add(d2);
                "".length();
            }
            int[] nArray2 = new int[lIlIlIlIII[1]];
            nArray2[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[9], lIlIlIlIII[59], lIlIlIlIII[6]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray3 = new int[lIlIlIlIII[1]];
            nArray3[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[11], lIlIlIlIII[60], lIlIlIlIII[6]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray4 = new int[lIlIlIlIII[1]];
            nArray4[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[13], lIlIlIlIII[61], lIlIlIlIII[6]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray5 = new int[lIlIlIlIII[1]];
            nArray5[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[14], lIlIlIlIII[5], lIlIlIlIII[6]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray6 = new int[lIlIlIlIII[1]];
            nArray6[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[46], lIlIlIlIII[1], e.c(lIlIlIlIII[62], lIlIlIlIII[63]));
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
        }
        if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIlIlIlIII[1]];
                nArray7[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                if (P.lIIlIIIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlIlIII[61])) {
                    int[] nArray8 = new int[lIlIlIlIII[1]];
                    nArray8[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                    lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[24], lIlIlIlIII[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIlIlIlIII[64]);
                    bp.add((d)lllllllllllllllllllIlllIlIllllII);
                    "".length();
                }
            }
            int[] nArray9 = new int[lIlIlIlIII[1]];
            nArray9[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[24], lIlIlIlIII[61], lIlIlIlIII[64]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray10 = new int[lIlIlIlIII[1]];
            nArray10[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIlIlIlIII[1]];
                nArray11[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
                if (P.lIIlIIIIIllIl(Bank.getFirst((int[])nArray11).getQuantity(), lIlIlIlIII[61])) {
                    int[] nArray12 = new int[lIlIlIlIII[1]];
                    nArray12[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
                    lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[25], lIlIlIlIII[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIlIlIlIII[65]);
                    bp.add((d)lllllllllllllllllllIlllIlIllllII);
                    "".length();
                }
            }
            int[] nArray13 = new int[lIlIlIlIII[1]];
            nArray13[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[25], lIlIlIlIII[61], lIlIlIlIII[65]);
                bp.add((d)lllllllllllllllllllIlllIlIllllII);
                "".length();
            }
            int[] nArray14 = new int[lIlIlIlIII[1]];
            nArray14[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
            if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlIlIlIII[1]];
                nArray15[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (P.lIIlIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[22], lIlIlIlIII[1], lIlIlIlIII[66]);
                    bp.add((d)lllllllllllllllllllIlllIlIllllII);
                    "".length();
                }
            }
            if (P.lIIlIIIIIllII(cc ? 1 : 0)) {
                int[] nArray16 = new int[lIlIlIlIII[1]];
                nArray16[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                if (P.lIIlIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlIlIII[1]];
                    nArray17[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                    if (P.lIIlIIIIIllIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlIlIlIII[61])) {
                        int[] nArray18 = new int[lIlIlIlIII[1]];
                        nArray18[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                        lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[16], lIlIlIlIII[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIlIlIlIII[58]);
                        bp.add((d)lllllllllllllllllllIlllIlIllllII);
                        "".length();
                    }
                }
                int[] nArray19 = new int[lIlIlIlIII[1]];
                nArray19[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[16], lIlIlIlIII[61], lIlIlIlIII[58]);
                    bp.add((d)lllllllllllllllllllIlllIlIllllII);
                    "".length();
                }
                int[] nArray20 = new int[lIlIlIlIII[1]];
                nArray20[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (P.lIIlIIIIIllII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlIlIlIII[1]];
                    nArray21[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (P.lIIlIIIIIllIl(Bank.getFirst((int[])nArray21).getQuantity(), lIlIlIlIII[66])) {
                        int[] nArray22 = new int[lIlIlIlIII[1]];
                        nArray22[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                        lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[23], lIlIlIlIII[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIlIlIlIII[6]);
                        bp.add((d)lllllllllllllllllllIlllIlIllllII);
                        "".length();
                    }
                }
                int[] nArray23 = new int[lIlIlIlIII[1]];
                nArray23[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[23], lIlIlIlIII[66], lIlIlIlIII[6]);
                    bp.add((d)lllllllllllllllllllIlllIlIllllII);
                    "".length();
                }
            }
        }
        int[] nArray = new int[lIlIlIlIII[1]];
        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
        if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIlllIlIllllII = new d(lIlIlIlIII[20], lIlIlIlIII[67], lIlIlIlIII[68]);
            bp.add((d)lllllllllllllllllllIlllIlIllllII);
            "".length();
        }
        if (P.lIIlIIIIIlllI(Bank.contains(lllllllllllllllllllIlllIlIllllII = item -> item.getName().toLowerCase().contains(lIlIlIIlll[lIlIlIlIII[74]])) ? 1 : 0)) {
            lllllllllllllllllllIlllIlIlllIll = new d(lIlIlIlIII[69], lIlIlIlIII[19], lIlIlIlIII[70]);
            bp.add(lllllllllllllllllllIlllIlIlllIll);
            "".length();
        }
        int[] nArray24 = new int[lIlIlIlIII[1]];
        nArray24[P.lIlIlIlIII[0]] = lIlIlIlIII[71];
        if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lllllllllllllllllllIlllIlIlllIll = new d(lIlIlIlIII[71], lIlIlIlIII[33], lIlIlIlIII[72]);
            bp.add(lllllllllllllllllllIlllIlIlllIll);
            "".length();
        }
        int[] nArray25 = new int[lIlIlIlIII[1]];
        nArray25[P.lIlIlIlIII[0]] = lIlIlIlIII[18];
        if (P.lIIlIIIIIlllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lllllllllllllllllllIlllIlIlllIll = new d(lIlIlIlIII[18], lIlIlIlIII[33], lIlIlIlIII[72]);
            bp.add(lllllllllllllllllllIlllIlIlllIll);
            "".length();
        }
    }

    private static boolean lIIlIIIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIlllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[2])) {
            bl = lIlIlIlIII[1];
            "".length();
            if (((0x33 ^ 0x3B ^ (0xD0 ^ 0x9B)) & (0xCC ^ 0xA2 ^ (0x1D ^ 0x30) ^ -" ".length())) > "   ".length()) {
                return ((0x2D ^ 0x48 ^ (0x5D ^ 0x5B)) & (3 ^ 0x68 ^ (0x73 ^ 0x7B) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIlIlIII[0];
        }
        return bl;
    }

    @Override
    public int ad() {
        try {
            P.ai();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xE2 ^ 0xBC) & ~(0x21 ^ 0x7F)) != 0) {
            return (0x7B ^ 0x4A) & ~(0x4B ^ 0x7A);
        }
        return lIlIlIlIII[67];
    }

    @Override
    public String ae() {
        return lIlIlIIlll[lIlIlIlIII[73]];
    }

    private static boolean lIIlIIIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean am() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21])) break block19;
                                                    int[] nArray = new int[lIlIlIlIII[1]];
                                                    nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
                                                    if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIlIlIII[1]];
                                                    nArray2[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                                    if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIlIlIII[1]];
                                                    nArray3[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                                    if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIlIlIII[1]];
                                                    nArray4[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                                    if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIlIlIII[1]];
                                                    nArray5[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                                                    if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIlIlIII[1]];
                                                    nArray6[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                                    if (!P.lIIlIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIlIlIII[1]];
                                                    nArray7[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                                    if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIlIlIII[1];
                                                "".length();
                                                if (null == null) return n5 != 0;
                                                return ((0xF6 ^ 0x81 ^ (0x67 ^ 0x20)) & (82 + 112 - 172 + 162 ^ 73 + 61 - 103 + 105 ^ -" ".length())) != 0;
                                            }
                                            n5 = lIlIlIlIII[0];
                                            return n5 != 0;
                                        }
                                        if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21]) || !P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) break block22;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                        if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIlIlIII[1]];
                                        nArray8[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                        if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIlIlIII[1]];
                                        nArray9[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                        if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIlIlIII[1]];
                                        nArray10[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                                        if (!P.lIIlIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIlIlIII[1]];
                                        nArray11[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                        if (!P.lIIlIIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIlIlIII[1]];
                                        nArray12[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                        if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIlIlIII[1];
                                    "".length();
                                    if (null == null) return n4 != 0;
                                    return ((0xE ^ 0x66 ^ (0x72 ^ 0x40)) & (0x3E ^ 0xC ^ (0xDD ^ 0xB5) ^ -" ".length())) != 0;
                                }
                                n4 = lIlIlIlIII[0];
                                return n4 != 0;
                            }
                            if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8]) || !P.lIIlIIIIIlllI(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIlIlIII[1]];
                            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (!P.lIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIlIlIII[1]];
                            nArray13[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIlIlIII[1]];
                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIlIlIII[1]];
                            nArray14[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIlIlIII[1];
                                "".length();
                                if (-"  ".length() < 0) return n3 != 0;
                                return ((0xD3 ^ 0xC0) & ~(0x1E ^ 0xD)) != 0;
                            }
                        }
                    }
                    n3 = lIlIlIlIII[0];
                    return n3 != 0;
                }
                if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8]) || !P.lIIlIIIIIllII(cc ? 1 : 0)) return lIlIlIlIII[0];
                int[] nArray = new int[lIlIlIlIII[1]];
                nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (!P.lIIlIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIlIlIII[1]];
                nArray15[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIlIlIII[1]];
                nArray16[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (P.lIIlIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlIlIII[1]];
                    nArray17[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (P.lIIlIIIIlIIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlIlIlIII[19])) {
                        int[] nArray18 = new int[lIlIlIlIII[1]];
                        nArray18[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (P.lIIlIIIIIllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIlIlIII[1]];
                            nArray19[P.lIlIlIlIII[0]] = lIlIlIlIII[25];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIlIlIII[1];
                                "".length();
                                if ((12 + 62 - -3 + 73 ^ 86 + 114 - 127 + 73) >= ((0x58 ^ 0x18 ^ (0x7E ^ 0x36)) & (0x43 ^ 0x21 ^ (0xC8 ^ 0xA2) ^ -" ".length()))) return n2 != 0;
                                return ((0xE5 ^ 0xA2 ^ (0xE8 ^ 0x89)) & (6 ^ 0x20 ^ (0x9D ^ 0xAD) & ~(0xF5 ^ 0xC5) ^ -" ".length())) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIlIlIII[0];
        return n2 != 0;
    }

    private static boolean lIIlIIIIIllII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21])) break block19;
                                                    int[] nArray = new int[lIlIlIlIII[1]];
                                                    nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
                                                    if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIlIlIII[1]];
                                                    nArray2[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                                    if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIlIlIII[1]];
                                                    nArray3[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                                    if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIlIlIII[1]];
                                                    nArray4[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                                    if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIlIlIII[1]];
                                                    nArray5[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                                                    if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIlIlIII[1]];
                                                    nArray6[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                                    if (!P.lIIlIIIIIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIlIlIII[1]];
                                                    nArray7[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                                    if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIlIlIII[1];
                                                "".length();
                                                if (null == null) return n5 != 0;
                                                return ((0xB7 ^ 0x82) & ~(0x3F ^ 0xA)) != 0;
                                            }
                                            n5 = lIlIlIlIII[0];
                                            return n5 != 0;
                                        }
                                        if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21]) || !P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) break block22;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                        if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIlIlIII[1]];
                                        nArray8[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                        if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIlIlIII[1]];
                                        nArray9[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                        if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIlIlIII[1]];
                                        nArray10[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                                        if (!P.lIIlIIIIIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIlIlIII[1]];
                                        nArray11[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                        if (!P.lIIlIIIIIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIlIlIII[1]];
                                        nArray12[P.lIlIlIlIII[0]] = lIlIlIlIII[46];
                                        if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIlIlIII[1];
                                    "".length();
                                    if (" ".length() != 0) return n4 != 0;
                                    return ((16 + 9 - -34 + 71 ^ 122 + 42 - 75 + 51) & (0x3E ^ 0x2C ^ (0x85 ^ 0x99) ^ -" ".length())) != 0;
                                }
                                n4 = lIlIlIlIII[0];
                                return n4 != 0;
                            }
                            if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8]) || !P.lIIlIIIIIlllI(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIlIlIII[1]];
                            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (!P.lIIlIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIlIlIII[1]];
                            nArray13[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIlIlIII[1]];
                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIlIlIII[1]];
                            nArray14[P.lIlIlIlIII[0]] = lIlIlIlIII[38];
                            if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIlIlIII[1];
                                "".length();
                                if ("  ".length() == "  ".length()) return n3 != 0;
                                return ((0x25 ^ 0x63) & ~(0x67 ^ 0x21)) != 0;
                            }
                        }
                    }
                    n3 = lIlIlIlIII[0];
                    return n3 != 0;
                }
                if (!P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8]) || !P.lIIlIIIIIllII(cc ? 1 : 0)) return lIlIlIlIII[0];
                int[] nArray = new int[lIlIlIlIII[1]];
                nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (!P.lIIlIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIlIlIII[1]];
                nArray15[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                if (!P.lIIlIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
            if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIlIlIII[1]];
                nArray16[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlIlIII[1]];
                    nArray17[P.lIlIlIlIII[0]] = lIlIlIlIII[23];
                    if (P.lIIlIIIIlIIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIlIlIlIII[19])) {
                        int[] nArray18 = new int[lIlIlIlIII[1]];
                        nArray18[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                        if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIlIlIII[1]];
                            nArray19[P.lIlIlIlIII[0]] = lIlIlIlIII[38];
                            if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIlIlIII[1];
                                "".length();
                                if (((0x6D ^ 0x65) & ~(0x1E ^ 0x16)) <= "   ".length()) return n2 != 0;
                                return ((0x40 ^ 0x55) & ~(0x89 ^ 0x9C)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIlIlIII[0];
        return n2 != 0;
    }

    private static String lIIlIIIIIlIIl(String lllllllllllllllllllIlllIlIIIIlll, String lllllllllllllllllllIlllIlIIIIllI) {
        lllllllllllllllllllIlllIlIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllIlIIIlIlI = new StringBuilder();
        char[] lllllllllllllllllllIlllIlIIIlIIl = lllllllllllllllllllIlllIlIIIIllI.toCharArray();
        int lllllllllllllllllllIlllIlIIIlIII = lIlIlIlIII[0];
        char[] lllllllllllllllllllIlllIlIIIIIlI = lllllllllllllllllllIlllIlIIIIlll.toCharArray();
        int lllllllllllllllllllIlllIlIIIIIIl = lllllllllllllllllllIlllIlIIIIIlI.length;
        int lllllllllllllllllllIlllIlIIIIIII = lIlIlIlIII[0];
        while (P.lIIlIIIIIllIl(lllllllllllllllllllIlllIlIIIIIII, lllllllllllllllllllIlllIlIIIIIIl)) {
            char lllllllllllllllllllIlllIlIIIllIl = lllllllllllllllllllIlllIlIIIIIlI[lllllllllllllllllllIlllIlIIIIIII];
            lllllllllllllllllllIlllIlIIIlIlI.append((char)(lllllllllllllllllllIlllIlIIIllIl ^ lllllllllllllllllllIlllIlIIIlIIl[lllllllllllllllllllIlllIlIIIlIII % lllllllllllllllllllIlllIlIIIlIIl.length]));
            "".length();
            ++lllllllllllllllllllIlllIlIIIlIII;
            ++lllllllllllllllllllIlllIlIIIIIII;
            "".length();
            if (((197 + 95 - 267 + 177 ^ 112 + 95 - 132 + 56) & (0x55 ^ 2 ^ (0xA2 ^ 0xBC) ^ -" ".length())) <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlllIlIIIlIlI);
    }

    private static boolean lIIlIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIIIIlIlI() {
        lIlIlIIlll = new String[lIlIlIlIII[80]];
        P.lIlIlIIlll[P.lIlIlIlIII[0]] = P.lIIlIIIIIIlll("6RrcbDWmgF6yTYdY1ofrIw==", "BtRSr");
        P.lIlIlIIlll[P.lIlIlIlIII[1]] = P.lIIlIIIIIlIII("lmcDanQoM+fDZ0JGHt7228Q53DnipyXqh1WjGzIpgAuFSRTGWVmOGh9SIjhxsFJAjRh2zlkHEYw=", "UBAdo");
        P.lIlIlIIlll[P.lIlIlIlIII[3]] = P.lIIlIIIIIlIIl("FwIgJj84Fz8hP3kXOW86OA09", "YcVOX");
        P.lIlIlIIlll[P.lIlIlIlIII[4]] = P.lIIlIIIIIIlll("V8H8UwmLlUlvPD2GhInZYDRfYuKuLlEi", "ECTeV");
        P.lIlIlIIlll[P.lIlIlIlIII[7]] = P.lIIlIIIIIlIIl("ByhjCwQ1bS4DBSMkLQ1WIzgzGho5KDBGViM6Kh4VOCQtDVYkImMoIwkEDS0=", "PMCjv");
        P.lIlIlIIlll[P.lIlIlIlIII[19]] = P.lIIlIIIIIIlll("0gEY9hrGMkYeQ2oloL1UMw==", "DSNOW");
        P.lIlIlIIlll[P.lIlIlIlIII[6]] = P.lIIlIIIIIIlll("yHQ3I4mLkXWurvRYhu5s/Q==", "QbMHZ");
        P.lIlIlIIlll[P.lIlIlIlIII[27]] = P.lIIlIIIIIlIII("EKToHl/LKEiCoDh7cHiwmlGMYfnkc0Xv", "qyoEO");
        P.lIlIlIIlll[P.lIlIlIlIII[30]] = P.lIIlIIIIIlIIl("FCApESE5JnoJPTojI0U8Mi0/", "WAZeH");
        P.lIlIlIIlll[P.lIlIlIlIII[32]] = P.lIIlIIIIIlIII("TjoEDLxk6V5IVF1TrlZqdrUBOXAvmJjE", "MEMKA");
        P.lIlIlIIlll[P.lIlIlIlIII[33]] = P.lIIlIIIIIlIIl("JiULESwLI1gGJAgpAUUxACgd", "eDxeE");
        P.lIlIlIIlll[P.lIlIlIlIII[34]] = P.lIIlIIIIIIlll("CpRNyk/M/3g=", "PuqUs");
        P.lIlIlIIlll[P.lIlIlIlIII[37]] = P.lIIlIIIIIIlll("6b5jX7EGpiw=", "FLiIG");
        P.lIlIlIIlll[P.lIlIlIlIII[39]] = P.lIIlIIIIIlIIl("NCgUAVANKEIFHBovQhcAFjM=", "yGbdp");
        P.lIlIlIIlll[P.lIlIlIlIII[41]] = P.lIIlIIIIIlIII("Nu1VoJ1UUtMo+m+uWaVwkg==", "npIfH");
        P.lIlIlIIlll[P.lIlIlIlIII[42]] = P.lIIlIIIIIIlll("ghMP98XTqVmlnpUJ+9YJmQ==", "TrPcK");
        P.lIlIlIIlll[P.lIlIlIlIII[43]] = P.lIIlIIIIIlIII("TttCyj4nvdw=", "TONdp");
        P.lIlIlIIlll[P.lIlIlIlIII[44]] = P.lIIlIIIIIIlll("wkUh1hal7n0=", "qNxgG");
        P.lIlIlIIlll[P.lIlIlIlIII[45]] = P.lIIlIIIIIIlll("J/pyTi80GDI=", "UYioH");
        P.lIlIlIIlll[P.lIlIlIlIII[47]] = P.lIIlIIIIIlIIl("EB4GOTQ6", "QjrXW");
        P.lIlIlIIlll[P.lIlIlIlIII[51]] = P.lIIlIIIIIlIII("cLK8FdSgXJJvbbChh/taa2BStq1R+2CW", "fNjcu");
        P.lIlIlIIlll[P.lIlIlIlIII[52]] = P.lIIlIIIIIIlll("NUpdpIVOU2IIJ7d5UykVPg==", "UzzDO");
        P.lIlIlIIlll[P.lIlIlIlIII[54]] = P.lIIlIIIIIIlll("FAF6/TfWz6HC7KW9Mp119A==", "dFOLe");
        P.lIlIlIIlll[P.lIlIlIlIII[55]] = P.lIIlIIIIIlIII("ktxHaVPv4GL5NCsKbhA8yQ==", "unVmi");
        P.lIlIlIIlll[P.lIlIlIlIII[56]] = P.lIIlIIIIIlIII("np2IDcRg//6GroJ+qJqVcQ==", "TCRVK");
        P.lIlIlIIlll[P.lIlIlIlIII[21]] = P.lIIlIIIIIlIII("8lW6VY6siW15QjoLHCf3tA==", "sJvYR");
        P.lIlIlIIlll[P.lIlIlIlIII[50]] = P.lIIlIIIIIlIII("SgATpcPXzUekKZiivTvC6A==", "lTqGR");
        P.lIlIlIIlll[P.lIlIlIlIII[73]] = P.lIIlIIIIIlIIl("IzAUKwtOJQEjAQA4HSU=", "nQsBh");
        P.lIlIlIIlll[P.lIlIlIlIII[74]] = P.lIIlIIIIIIlll("LGfaTfVjlsxWDTKt5q7RkOuhqJwAES6R", "kHgqG");
        P.lIlIlIIlll[P.lIlIlIlIII[75]] = P.lIIlIIIIIlIII("1EwbBV/Fbok=", "kVYLV");
    }

    public static void ai() {
        if (P.lIIlIIIIIllII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[0]];
            b.a(bp);
            if (P.lIIlIIIIIllIl(bp.size(), lIlIlIlIII[1])) {
                System.out.println(lIlIlIIlll[lIlIlIlIII[1]]);
                bn = lIlIlIlIII[0];
            }
        }
        if (P.lIIlIIIIIlllI(bn ? 1 : 0) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[2])) {
            BankLocation lllllllllllllllllllIlllIllIIIlIl;
            if (P.lIIlIIIIIlllI(P.al() ? 1 : 0)) {
                lllllllllllllllllllIlllIllIIIlIl = BankLocation.getNearest();
                if (P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlIl) && P.lIIlIIIIIlllI(lllllllllllllllllllIlllIllIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[3]];
                    a.a(lllllllllllllllllllIlllIllIIIlIl);
                }
                if (P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlIl) && P.lIIlIIIIIllII(lllllllllllllllllllIlllIllIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[4]];
                    if (P.lIIlIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIlIII[5]);
                        "".length();
                        Time.sleepTicks((int)lIlIlIlIII[6]);
                        "".length();
                    }
                    if (P.lIIlIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (P.lIIlIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIlIlIII[7]);
                            "".length();
                        }
                        while (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8]) && P.lIIlIIIIIlllI(y.bv() ? 1 : 0)) {
                            y.bt();
                            Time.sleepTicks((int)lIlIlIlIII[1]);
                            "".length();
                            "".length();
                            if (((0xB7 ^ 0xB0) & ~(0x9D ^ 0x9A)) == 0) continue;
                            return;
                        }
                        if (P.lIIlIIIIIlllI(P.am() ? 1 : 0)) {
                            P.O();
                            System.out.println(lIlIlIIlll[lIlIlIlIII[7]]);
                            bn = lIlIlIlIII[1];
                            return;
                        }
                        if (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
                            int[] nArray = new int[lIlIlIlIII[1]];
                            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlIlIlIII[1]];
                                nArray2[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray2), lIlIlIlIII[1])) {
                                    Bank.withdraw((int)lIlIlIlIII[9], (int)lIlIlIlIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[9];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if (((0x31 ^ 0x2D) & ~(0x97 ^ 0x8B)) != 0) {
                                                return ((0x9C ^ 0x80) & ~(0xB2 ^ 0xAE)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray3 = new int[lIlIlIlIII[1]];
                            nArray3[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIlIlIII[1]];
                                nArray4[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray4), lIlIlIlIII[1])) {
                                    Bank.withdraw((int)lIlIlIlIII[11], (int)lIlIlIlIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[11];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0x1D ^ 0x4A ^ (0x6B ^ 0x3B)) & (107 + 44 - 81 + 71 ^ 56 + 18 - 53 + 117 ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray5 = new int[lIlIlIlIII[1]];
                            nArray5[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlIlIlIII[1]];
                                nArray6[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray6), lIlIlIlIII[1])) {
                                    Bank.withdraw((int)lIlIlIlIII[13], (int)lIlIlIlIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[13];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0x1F ^ 0x2D) & ~(0x1F ^ 0x2D)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray7 = new int[lIlIlIlIII[1]];
                            nArray7[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlIlIlIII[1]];
                                nArray8[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray8), lIlIlIlIII[1])) {
                                    Bank.withdraw((int)lIlIlIlIII[14], (int)lIlIlIlIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if ("   ".length() <= 0) {
                                                return ((204 + 108 - 228 + 147 ^ 79 + 41 - 93 + 107) & (0xAF ^ 0x90 ^ (0x5D ^ 3) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray9 = new int[lIlIlIlIII[1]];
                            nArray9[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIlIlIII[1]];
                                nArray10[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray10), lIlIlIlIII[1])) {
                                    Bank.withdraw((int)lIlIlIlIII[16], (int)lIlIlIlIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[16];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if (" ".length() >= (2 + 52 - 43 + 134 ^ 106 + 118 - 157 + 82)) {
                                                return ((0x2F ^ 0x21 ^ (0xE6 ^ 0x88)) & (0x67 ^ 0x3B ^ (0x33 ^ 0xF) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray11 = new int[lIlIlIlIII[1]];
                            nArray11[P.lIlIlIlIII[0]] = lIlIlIlIII[17];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIlIlIlIII[1]];
                                nArray12[P.lIlIlIlIII[0]] = lIlIlIlIII[17];
                                if (P.lIIlIIIIIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlIlIlIII[17], (int)lIlIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw((int)lIlIlIlIII[18], (int)lIlIlIlIII[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIlIlIlIII[1]];
                            nArray13[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                            if (P.lIIlIIIIIllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIlIlIlIII[1]];
                                nArray14[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                                if (P.lIIlIIIIIllIl(Inventory.getCount((int[])nArray14), lIlIlIlIII[1]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21])) {
                                    Bank.withdrawAll((int)lIlIlIlIII[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIlIlIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIlIlIII[1]];
                                        nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[20];
                                        if (P.lIIlIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIlIlIII[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0x68 ^ 0x60) & ~(0x64 ^ 0x6C)) != 0;
                                            }
                                        } else {
                                            bl = lIlIlIlIII[0];
                                        }
                                        return bl;
                                    }, (int)lIlIlIlIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
                            int[] nArray = new int[lIlIlIlIII[1]];
                            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            if (P.lIIlIIIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIlIlIII[22], (int)lIlIlIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIlIlIII[1]);
                                "".length();
                            }
                            if (P.lIIlIIIIIllII(cc ? 1 : 0)) {
                                Bank.withdrawAll((int)lIlIlIlIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIlIlIII[1]);
                                "".length();
                                Bank.withdrawAll((int)lIlIlIlIII[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIlIlIII[1]);
                                "".length();
                            }
                            Time.sleepTicks((int)lIlIlIlIII[4]);
                            "".length();
                            Bank.withdrawAll((int)lIlIlIlIII[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlIlIlIII[1]);
                            "".length();
                            Bank.withdrawAll((int)lIlIlIlIII[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIlIlIlIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (P.lIIlIIIIIllII(P.al() ? 1 : 0)) {
                if (P.lIIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21])) {
                    if (P.lIIlIIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[19]];
                        Movement.walkTo((WorldPoint)ce);
                        "".length();
                        Time.sleepTicks((int)lIlIlIlIII[1]);
                        "".length();
                    }
                    if (P.lIIlIIIIIllII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[6]];
                        P.ak();
                    }
                }
                if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[21]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[26])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[27]];
                    if (P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[26]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[29])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[30]];
                    if (P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[29]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[31])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[32]];
                    if (P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[31]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[33]];
                    if (P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIlIlIlIII[1]);
                        "".length();
                    }
                }
                if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[8])) {
                    int lllllllllllllllllllIlllIllIIIIll;
                    AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[34]];
                    if (P.lIIlIIIIlIIll(cf)) {
                        cf = new WorldPoint(lIlIlIlIII[35] + e.c(lIlIlIlIII[1], lIlIlIlIII[7]), lIlIlIlIII[36], lIlIlIlIII[0]);
                    }
                    int[] nArray = new int[lIlIlIlIII[1]];
                    nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                    if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIlIlIlIII[1]];
                        nArray15[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                        if (P.lIIlIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIlIlIlIII[1]];
                            nArray16[P.lIlIlIlIII[0]] = lIlIlIlIII[22];
                            Inventory.getFirst((int[])nArray16).interact(lIlIlIIlll[lIlIlIlIII[37]]);
                            Time.sleepTicks((int)lIlIlIlIII[1]);
                            "".length();
                        }
                    }
                    if (P.lIIlIIIIIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIlIlIlIII[1]];
                    nArray17[P.lIlIlIlIII[0]] = lIlIlIlIII[24];
                    lllllllllllllllllllIlllIllIIIlIl = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIlIlIlIII[1]];
                    nArray18[P.lIlIlIlIII[0]] = lIlIlIlIII[38];
                    Item lllllllllllllllllllIlllIllIIIlII = Inventory.getFirst((int[])nArray18);
                    if (P.lIIlIIIIIlllI(cc ? 1 : 0) && P.lIIlIIIIIllll(cf)) {
                        if (P.lIIlIIIIIlllI(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[39]];
                            Movement.walkTo((WorldPoint)cf);
                            "".length();
                            Time.sleepTicks((int)lIlIlIlIII[1]);
                            "".length();
                        }
                        if (P.lIIlIIIIIllII(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0) && P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlIl) && P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlII) && P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                            lllllllllllllllllllIlllIllIIIIll = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllllllllllllllllllIlllIllIIIlII);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (P.lIIlIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), lllllllllllllllllllIlllIllIIIIll)) {
                                    bl = lIlIlIlIII[1];
                                    "".length();
                                    if (" ".length() <= 0) {
                                        return ((0x51 ^ 0x1A) & ~(0x51 ^ 0x1A)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIlIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIlIII[10]);
                            "".length();
                        }
                    }
                    if (P.lIIlIIIIIllII(cc ? 1 : 0)) {
                        if (P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlIl) && P.lIIlIIIIIllll(lllllllllllllllllllIlllIllIIIlII) && P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                            lllllllllllllllllllIlllIllIIIIll = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllllllllllllllllllIlllIllIIIlII);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (P.lIIlIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), lllllllllllllllllllIlllIllIIIIll)) {
                                    bl = lIlIlIlIII[1];
                                    "".length();
                                    if ("  ".length() == 0) {
                                        return ((0x51 ^ 0x1F) & ~(0xCE ^ 0x80)) != 0;
                                    }
                                } else {
                                    bl = lIlIlIlIII[0];
                                }
                                return bl;
                            }, (int)lIlIlIlIII[10]);
                            "".length();
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (P.lIIlIIIIlIIlI(Players.getLocal().getAnimation(), lIlIlIlIII[28])) {
                                bl = lIlIlIlIII[1];
                                "".length();
                                if ((0x92 ^ 0x96) == "  ".length()) {
                                    return ((0xCC ^ 0x83) & ~(0x35 ^ 0x7A)) != 0;
                                }
                            } else {
                                bl = lIlIlIlIII[0];
                            }
                            return bl;
                        }, (int)lIlIlIlIII[40]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIIlIIIIIIlll(String lllllllllllllllllllIlllIlIlIlIIl, String lllllllllllllllllllIlllIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllllllIlllIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIII[30]), "DES");
            Cipher lllllllllllllllllllIlllIlIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllllllIlllIlIlIlIll.init(lIlIlIlIII[3], lllllllllllllllllllIlllIlIlIllII);
            return new String(lllllllllllllllllllIlllIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlllIlIlIlIlI) {
            lllllllllllllllllllIlllIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    public static boolean an() {
        if (P.lIIlIIIIlIIlI(Vars.getBit((int)lIlIlIlIII[48]), lIlIlIlIII[1]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[19])) {
            return lIlIlIlIII[1];
        }
        if (P.lIIlIIIIlIIlI(Vars.getBit((int)lIlIlIlIII[48]), lIlIlIlIII[3]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32]) && P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[19])) {
            return lIlIlIlIII[1];
        }
        if (P.lIIlIIIIlIIlI(Vars.getBit((int)lIlIlIlIII[48]), lIlIlIlIII[4]) && P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[39])) {
            return lIlIlIlIII[1];
        }
        if (P.lIIlIIIIlIIlI(Vars.getBit((int)lIlIlIlIII[48]), lIlIlIlIII[4]) && P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32])) {
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (P.lIIlIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIlIlIII[1];
            }
        }
        if (P.lIIlIIIIlIIlI(Vars.getBit((int)lIlIlIlIII[48]), lIlIlIlIII[7]) && P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[39])) {
            int[] nArray = new int[lIlIlIlIII[1]];
            nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
            if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIlIlIII[1];
            }
        }
        return lIlIlIlIII[0];
    }

    public static void aj() {
        if (P.lIIlIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (P.lIIlIIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[41]];
            Movement.walkTo((WorldPoint)ce);
            "".length();
            Time.sleepTicks((int)lIlIlIlIII[1]);
            "".length();
        }
        if (P.lIIlIIIIIllII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[42]];
            P.ak();
        }
    }

    private static boolean lIIlIIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static String lIIlIIIIIlIII(String lllllllllllllllllllIlllIlIIllIlI, String lllllllllllllllllllIlllIlIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIlllIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlllIlIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlllIlIIllllI.init(lIlIlIlIII[3], lllllllllllllllllllIlllIlIIlllll);
            return new String(lllllllllllllllllllIlllIlIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlllIlIIlllIl) {
            lllllllllllllllllllIlllIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public static void ao() {
        if (P.lIIlIIIIIllll(Widgets.get((int)lIlIlIlIII[49], (int)lIlIlIlIII[50]))) {
            AccBuilderShamans.c = lIlIlIIlll[lIlIlIlIII[51]];
            Widgets.get((int)lIlIlIlIII[49], (int)lIlIlIlIII[50]).interact(lIlIlIIlll[lIlIlIlIII[52]]);
            Time.sleepTicks((int)lIlIlIlIII[7]);
            "".length();
        }
        if (P.lIIlIIIIlIIll(Widgets.get((int)lIlIlIlIII[49], (int)lIlIlIlIII[50])) && P.lIIlIIIIIlllI(Widgets.get((int)lIlIlIlIII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIlIlIlIII[1]);
            "".length();
            if (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[19])) {
                Widgets.get((int)lIlIlIlIII[53], (int)lIlIlIlIII[1]).getChild(lIlIlIlIII[1]).interact(lIlIlIIlll[lIlIlIlIII[54]]);
            }
            if (P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32]) && P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[19])) {
                Widgets.get((int)lIlIlIlIII[53], (int)lIlIlIlIII[1]).getChild(lIlIlIlIII[3]).interact(lIlIlIIlll[lIlIlIlIII[55]]);
            }
            if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32]) && P.lIIlIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[39])) {
                Widgets.get((int)lIlIlIlIII[53], (int)lIlIlIlIII[1]).getChild(lIlIlIlIII[4]).interact(lIlIlIIlll[lIlIlIlIII[56]]);
            }
            if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[32])) {
                int[] nArray = new int[lIlIlIlIII[1]];
                nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                if (P.lIIlIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIlIlIII[53], (int)lIlIlIlIII[1]).getChild(lIlIlIlIII[4]).interact(lIlIlIIlll[lIlIlIlIII[21]]);
                }
            }
            if (P.lIIlIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlIlIlIII[39])) {
                int[] nArray = new int[lIlIlIlIII[1]];
                nArray[P.lIlIlIlIII[0]] = lIlIlIlIII[14];
                if (P.lIIlIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIlIlIII[53], (int)lIlIlIlIII[1]).getChild(lIlIlIlIII[7]).interact(lIlIlIIlll[lIlIlIlIII[50]]);
                }
            }
            Time.sleepTicks((int)lIlIlIlIII[1]);
            "".length();
        }
    }

    @Override
    public boolean ac() {
        return lIlIlIlIII[0];
    }

    private static void lIIlIIIIIlIll() {
        lIlIlIlIII = new int[81];
        P.lIlIlIlIII[0] = (0x3E ^ 0xC) & ~(0xB8 ^ 0x8A);
        P.lIlIlIlIII[1] = " ".length();
        P.lIlIlIlIII[2] = 0x35 ^ 0x21 ^ (0xAC ^ 0x8A);
        P.lIlIlIlIII[3] = "  ".length();
        P.lIlIlIlIII[4] = "   ".length();
        P.lIlIlIlIII[5] = -(0xFFFF8C7F & 0x77F4) & (0xFFFFD7FB & 0x3FFF);
        P.lIlIlIlIII[6] = 0xE ^ 8;
        P.lIlIlIlIII[7] = 0x31 ^ 0x35;
        P.lIlIlIlIII[8] = 0x4F ^ 0x78;
        P.lIlIlIlIII[9] = 0xFFFFA23F & 0x5FEE;
        P.lIlIlIlIII[10] = -(0xFFFFBB0A & 0x7EF7) & (0xFFFFBFDF & 0x7FFD);
        P.lIlIlIlIII[11] = 0xFFFFAE6B & 0x53BF;
        P.lIlIlIlIII[12] = 0xFFFF9BE4 & 0x6DDF;
        P.lIlIlIlIII[13] = 0xFFFFEFFD & 0x122F;
        P.lIlIlIlIII[14] = -(0xFFFFB5FF & 0x5FD6) & (0xFFFFD7FF & 0x3FFF);
        P.lIlIlIlIII[15] = 0xFFFFBFD7 & 0x51BC;
        P.lIlIlIlIII[16] = 0xFFFFFF7B & 0x2B7;
        P.lIlIlIlIII[17] = 0xFFFFFDDF & 0x3371;
        P.lIlIlIlIII[18] = -(0xFFFFE327 & 0x7CFF) & (0xFFFFFF6F & Short.MAX_VALUE);
        P.lIlIlIlIII[19] = 0xC0 ^ 0xC5;
        P.lIlIlIlIII[20] = -(0xFFFFFC07 & 0x57F9) & (0xFFFFD57F & 0x7FFB);
        P.lIlIlIlIII[21] = 0x14 ^ 0x1F ^ (0x4A ^ 0x58);
        P.lIlIlIlIII[22] = 0xFFFF95FB & 0x6F6F;
        P.lIlIlIlIII[23] = -(0xFFFFF7F6 & 0x795B) & (0xFFFFF77F & 0x7BFD);
        P.lIlIlIlIII[24] = 0xFFFFBA3B & 0x47F5;
        P.lIlIlIlIII[25] = 0x58 ^ 0x66;
        P.lIlIlIlIII[26] = 0x76 ^ 0x69;
        P.lIlIlIlIII[27] = 0xAD ^ 0xAA;
        P.lIlIlIlIII[28] = -" ".length();
        P.lIlIlIlIII[29] = 0x1C ^ 0x57 ^ (0xA ^ 0x64);
        P.lIlIlIlIII[30] = 0x81 ^ 0x89;
        P.lIlIlIlIII[31] = 0x40 ^ 0x6D;
        P.lIlIlIlIII[32] = 0x9B ^ 0xB7 ^ (0x75 ^ 0x50);
        P.lIlIlIlIII[33] = 0x48 ^ 0x65 ^ (0x2D ^ 0xA);
        P.lIlIlIlIII[34] = 0xAC ^ 0xA7;
        P.lIlIlIlIII[35] = 0xFFFF8DDE & 0x7E7B;
        P.lIlIlIlIII[36] = 0xFFFF8DBF & 0x7FDF;
        P.lIlIlIlIII[37] = 0x32 ^ 0x3E;
        P.lIlIlIlIII[38] = 77 + 89 - 20 + 14 ^ 110 + 141 - 234 + 142;
        P.lIlIlIlIII[39] = 0x4D ^ 0x40;
        P.lIlIlIlIII[40] = -(0xFFFFFB87 & 0x567A) & (0xFFFFFFBF & 0x5FED);
        P.lIlIlIlIII[41] = 0x3D ^ 0x33;
        P.lIlIlIlIII[42] = 0x7E ^ 0x71;
        P.lIlIlIlIII[43] = 0x35 ^ 0x25;
        P.lIlIlIlIII[44] = 0x27 ^ 0x48 ^ (0x14 ^ 0x6A);
        P.lIlIlIlIII[45] = 0xC1 ^ 0xA8 ^ (0x10 ^ 0x6B);
        P.lIlIlIlIII[46] = 0xFFFF87F5 & 0x7D6F;
        P.lIlIlIlIII[47] = 0x98 ^ 0x8B;
        P.lIlIlIlIII[48] = -(0xFFFFFC6C & 0x73BF) & (0xFFFFF3BF & 0x7D7F);
        P.lIlIlIlIII[49] = 0xFFFFE2F1 & 0x1F5F;
        P.lIlIlIlIII[50] = 139 + 16 - 126 + 120 ^ 77 + 84 - 71 + 53;
        P.lIlIlIlIII[51] = 53 + 136 - 116 + 96 ^ 114 + 5 - 92 + 162;
        P.lIlIlIlIII[52] = 0x1D ^ 0x5C ^ (0x63 ^ 0x37);
        P.lIlIlIlIII[53] = 116 + 42 - -35 + 4 + (0x2D ^ 0x4D) - (16 + 112 - -87 + 37) + (10 + 68 - 14 + 96);
        P.lIlIlIlIII[54] = 0x51 ^ 0x47;
        P.lIlIlIlIII[55] = 0x9F ^ 0xA6 ^ (0xB5 ^ 0x9B);
        P.lIlIlIlIII[56] = 0xAA ^ 0x9A ^ (0x83 ^ 0xAB);
        P.lIlIlIlIII[57] = -(0xFFFFE65F & 0x79A7) & (0xFFFFF3FF & 0x6FEE);
        P.lIlIlIlIII[58] = (0x8E ^ 0xA2) + (104 + 73 - 51 + 3) - (0xD0 ^ 0x86) + (0xF6 ^ 0xA5);
        P.lIlIlIlIII[59] = 0xFFFF8FB4 & 0x7FEB;
        P.lIlIlIlIII[60] = -(0xFFFFAC6E & 0x739B) & (0xFFFFFFDB & 0x27FD);
        P.lIlIlIlIII[61] = -(0xFFFFB5DD & 0x5E63) & (0xFFFF9FF8 & Short.MAX_VALUE);
        P.lIlIlIlIII[62] = 0xFFFFFEF4 & 0x31DF;
        P.lIlIlIlIII[63] = -(0xFFFFFF19 & 0x43F7) & (0xFFFFFF9C & Short.MAX_VALUE);
        P.lIlIlIlIII[64] = 13 + 81 - -70 + 76 ^ 83 + 85 - 122 + 90;
        P.lIlIlIlIII[65] = (0x3A ^ 0x13) + (0x3E ^ 0x70) - (0xC ^ 0x6F) + (19 + 54 - -57 + 0);
        P.lIlIlIlIII[66] = 0xFFFFFA9B & 0x3FFC;
        P.lIlIlIlIII[67] = 0x6A ^ 0xE;
        P.lIlIlIlIII[68] = -(0xFFFFF797 & 0xEFE) & (0xFFFFA7DF & 0x5FF5);
        P.lIlIlIlIII[69] = 0xFFFFBFFD & 0x6ECE;
        P.lIlIlIlIII[70] = 0xFFFFEDEB & 0x73BC;
        P.lIlIlIlIII[71] = -(0xFFFFD0FF & 0x6FA1) & (0xFFFFDFF7 & 0x7FEF);
        P.lIlIlIlIII[72] = 0xFFFF93E5 & 0x6F9E;
        P.lIlIlIlIII[73] = 3 + 95 - 83 + 135 ^ 59 + 13 - 67 + 136;
        P.lIlIlIlIII[74] = 0x41 ^ 0x4A ^ (0x88 ^ 0x9F);
        P.lIlIlIlIII[75] = 0x53 ^ 0x4E;
        P.lIlIlIlIII[76] = -(0xFFFFFF0E & 0x74F3) & (0xFFFFFFDF & 0x7FEF);
        P.lIlIlIlIII[77] = 0xFFFFFCF3 & 0xFEF;
        P.lIlIlIlIII[78] = 0xFFFFCBF7 & 0x3FDF;
        P.lIlIlIlIII[79] = -(0xFFFFE39F & 0x1F63) & (0xFFFFDFEF & 0x2FFB);
        P.lIlIlIlIII[80] = 0x46 ^ 0x58;
    }
}

