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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.z;
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

public class l
implements W {
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    private static /* synthetic */ String[] lIIllIlll;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIlllIIl;
    public static /* synthetic */ boolean bu;
    static /* synthetic */ WorldPoint bx;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
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
                                                    if (!l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) break block19;
                                                    int[] nArray = new int[lIIlllIIl[1]];
                                                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllIIl[1]];
                                                    nArray2[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllIIl[1]];
                                                    nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllIIl[1]];
                                                    nArray4[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllIIl[1]];
                                                    nArray5[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                                    if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllIIl[1]];
                                                    nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllIIl[1]];
                                                    nArray7[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllIIl[1];
                                                0;
                                                if (-1 <= 1) return n5 != 0;
                                                return ((0xB7 ^ 0xA8) & ~(0xBA ^ 0xA5)) != 0;
                                            }
                                            n5 = lIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) || !l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) break block22;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllIIl[1]];
                                        nArray8[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllIIl[1]];
                                        nArray9[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllIIl[1]];
                                        nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (!l.lIIIIIlIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllIIl[1]];
                                        nArray11[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllIIl[1]];
                                        nArray12[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllIIl[1];
                                    0;
                                    if ((1 ^ (0xA4 ^ 0xA0)) != 0) return n4 != 0;
                                    return ((0x2E ^ 0x4F ^ (0x7C ^ 0x11)) & (0x15 ^ 0x20 ^ (0xAE ^ 0x97) ^ -1)) != 0;
                                }
                                n4 = lIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIlII(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllIIl[1]];
                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllIIl[1]];
                            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[35];
                            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllIIl[1];
                                0;
                                if (1 <= (0xD5 ^ 0xC0 ^ (0xA5 ^ 0xB4))) return n3 != 0;
                                return ((0xBD ^ 0xC3 ^ (0x6A ^ 0)) & (0xE0 ^ 0xBC ^ (0x27 ^ 0x6F) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIlllIIl[0];
                    return n3 != 0;
                }
                if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIIlI(bu ? 1 : 0)) return lIIlllIIl[0];
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIlll(Inventory.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[17])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllIIl[1]];
                            nArray19[l.lIIlllIIl[0]] = lIIlllIIl[35];
                            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllIIl[1];
                                0;
                                if (-1 <= 1) return n2 != 0;
                                return (1 & (1 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllIIl[0];
        return n2 != 0;
    }

    public static void ae() {
        if (l.lIIIIIlIIlIl(Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50]))) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[51]];
            Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50]).interact(lIIllIlll[lIIlllIIl[52]]);
            Time.sleepTicks((int)lIIlllIIl[5]);
            0;
        }
        if (l.lIIIIIlIlIll(Widgets.get((int)lIIlllIIl[49], (int)lIIlllIIl[50])) && l.lIIIIIlIIlII(Widgets.get((int)lIIlllIIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIlllIIl[1]);
            0;
            if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[1]).interact(lIIllIlll[lIIlllIIl[54]]);
            }
            if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[2]).interact(lIIllIlll[lIIlllIIl[55]]);
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
                Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[19]]);
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31])) {
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[50]]);
                }
            }
            if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlllIIl[53], (int)lIIlllIIl[1]).getChild(lIIlllIIl[5]).interact(lIIllIlll[lIIlllIIl[56]]);
                }
            }
            Time.sleepTicks((int)lIIlllIIl[1]);
            0;
        }
    }

    private static void lIIIIIlIIIII() {
        lIIllIlll = new String[lIIlllIIl[25]];
        l.lIIllIlll[l.lIIlllIIl[0]] = l."Buying items";
        l.lIIllIlll[l.lIIlllIIl[1]] = l."Finished buying items, switching back to magic training";
        l.lIIllIlll[l.lIIlllIIl[2]] = l."Navigating to bank";
        l.lIIllIlll[l.lIIlllIIl[3]] = l."Handling banking";
        l.lIIllIlll[l.lIIlllIIl[5]] = l."We are missing supplies, switching to BUYING";
        l.lIIllIlll[l.lIIlllIIl[17]] = l."Nav to cows";
        l.lIIllIlll[l.lIIlllIIl[24]] = l."Attacking cows";
        l.lIIllIlll[l.lIIlllIIl[26]] = l."Casting varrock tele";
        l.lIIllIlll[l.lIIlllIIl[29]] = l."Casting lumby tele";
        l.lIIllIlll[l.lIIlllIIl[31]] = l."Casting fally tele";
        l.lIIllIlll[l.lIIlllIIl[32]] = l."Casting cammy tele";
        l.lIIllIlll[l.lIIlllIIl[33]] = l."Alching";
        l.lIIllIlll[l.lIIlllIIl[34]] = l."Wield";
        l.lIIllIlll[l.lIIlllIIl[36]] = l."Move to alch spot";
        l.lIIllIlll[l.lIIlllIIl[40]] = l."Nav to cows";
        l.lIIllIlll[l.lIIlllIIl[41]] = l."Eat";
        l.lIIllIlll[l.lIIlllIIl[42]] = l."Cow";
        l.lIIllIlll[l.lIIlllIIl[43]] = l."cow";
        l.lIIllIlll[l.lIIlllIIl[45]] = l."Attacking cows";
        l.lIIllIlll[l.lIIlllIIl[46]] = l."Attack";
        l.lIIllIlll[l.lIIlllIIl[47]] = l."In combat";
        l.lIIllIlll[l.lIIlllIIl[51]] = l."Opening autocast";
        l.lIIllIlll[l.lIIlllIIl[52]] = l."Choose spell";
        l.lIIllIlll[l.lIIlllIIl[54]] = l."Wind Strike";
        l.lIIllIlll[l.lIIlllIIl[55]] = l."Water Strike";
        l.lIIllIlll[l.lIIlllIIl[19]] = l."Earth Strike";
        l.lIIllIlll[l.lIIlllIIl[50]] = l."Earth Strike";
        l.lIIllIlll[l.lIIlllIIl[56]] = l."Fire Strike";
        l.lIIllIlll[l.lIIlllIIl[72]] = l."Magic training";
        l.lIIllIlll[l.lIIlllIIl[74]] = l."ring of wealth (";
        l.lIIllIlll[l.lIIlllIIl[75]] = l."Cow";
    }

    private static boolean lIIIIIlIlIll(Object object) {
        return object == null;
    }

    private static String lIIIIIIllIll(String lIIIIIIIIIIIIII, String lIIIIIIIIIIIIIl) {
        try {
            SecretKeySpec lIIIIIIIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIl[29]), "DES");
            Cipher lIIIIIIIIIIIlII = Cipher.getInstance("DES");
            lIIIIIIIIIIIlII.init(lIIlllIIl[2], lIIIIIIIIIIIlIl);
            return new String(lIIIIIIIIIIIlII.doFinal(Base64.getDecoder().decode(lIIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIIIIIIIll) {
            lIIIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIllIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        l.lIIIIIlIIIIl();
        l.lIIIIIlIIIII();
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIlllIIl[76], lIIlllIIl[77], lIIlllIIl[47], lIIlllIIl[40], lIIlllIIl[0]);
        bx = new WorldPoint(lIIlllIIl[78], lIIlllIIl[79], lIIlllIIl[0]);
        by = new WorldPoint(lIIlllIIl[80] + e.c(lIIlllIIl[1], lIIlllIIl[5]), lIIlllIIl[81], lIIlllIIl[0]);
    }

    public static boolean ad() {
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[1]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[2]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[3]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
            return lIIlllIIl[1];
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[3]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[31])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        if (l.lIIIIIlIlIII(Vars.getBit((int)lIIlllIIl[48]), lIIlllIIl[5]) && l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[36])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        return lIIlllIIl[0];
    }

    private static boolean lIIIIIlIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlIlIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                    if (!l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) break block19;
                                                    int[] nArray = new int[lIIlllIIl[1]];
                                                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlllIIl[1]];
                                                    nArray2[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlllIIl[1]];
                                                    nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlllIIl[1]];
                                                    nArray4[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlllIIl[1]];
                                                    nArray5[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                                    if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlllIIl[1]];
                                                    nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlllIIl[1]];
                                                    nArray7[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                                    if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlllIIl[1];
                                                0;
                                                if (((2 ^ 0x50) & ~(0x1B ^ 0x49)) == ((0x3E ^ 0x2D) & ~(0x12 ^ 1))) return n5 != 0;
                                                return ((0x16 ^ 0x24) & ~(0x6C ^ 0x5E)) != 0;
                                            }
                                            n5 = lIIlllIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) || !l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) break block22;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlllIIl[1]];
                                        nArray8[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlllIIl[1]];
                                        nArray9[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlllIIl[1]];
                                        nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (!l.lIIIIIlIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlllIIl[1]];
                                        nArray11[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlllIIl[1]];
                                        nArray12[l.lIIlllIIl[0]] = lIIlllIIl[44];
                                        if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlllIIl[1];
                                    0;
                                    if (-1 < 3) return n4 != 0;
                                    return ((0x86 ^ 0xC4) & ~(0xF5 ^ 0xB7)) != 0;
                                }
                                n4 = lIIlllIIl[0];
                                return n4 != 0;
                            }
                            if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIlII(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlllIIl[1]];
                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlllIIl[1]];
                            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[23];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlllIIl[1];
                                0;
                                if ((3 ^ 6) != 0) return n3 != 0;
                                return ((0x3A ^ 0x70) & ~(0x6F ^ 0x25)) != 0;
                            }
                        }
                    }
                    n3 = lIIlllIIl[0];
                    return n3 != 0;
                }
                if (!l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) || !l.lIIIIIlIIIlI(bu ? 1 : 0)) return lIIlllIIl[0];
                int[] nArray = new int[lIIlllIIl[1]];
                nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (!l.lIIIIIlIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIlll(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[17])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[22];
                        if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlllIIl[1]];
                            nArray19[l.lIIlllIIl[0]] = lIIlllIIl[23];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlllIIl[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((0xE5 ^ 0x89 ^ (0x60 ^ 0x17)) & (6 + 13 - -10 + 154 ^ 7 + 74 - 53 + 144 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlllIIl[0];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIllIlll[lIIlllIIl[72]];
    }

    @Override
    public boolean S() {
        return lIIlllIIl[0];
    }

    private static int lIIIIIlIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIIIIIIlllII(String llllllllIlllIl, String llllllllIlllII) {
        try {
            SecretKeySpec lllllllllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllIlllll = Cipher.getInstance("Blowfish");
            llllllllIlllll.init(lIIlllIIl[2], lllllllllIIIII);
            return new String(llllllllIlllll.doFinal(Base64.getDecoder().decode(llllllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIllllI) {
            llllllllIllllI.printStackTrace();
            return null;
        }
    }

    private static void af() {
        d lIIIIIIIIIlIlII;
        Object lIIIIIIIIIlIlIl;
        if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIlllIIl[14], lIIlllIIl[57], lIIlllIIl[58]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lIIlllIIl[1]];
            nArray2[l.lIIlllIIl[0]] = lIIlllIIl[7];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[7], lIIlllIIl[59], lIIlllIIl[24]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray3 = new int[lIIlllIIl[1]];
            nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[9], lIIlllIIl[60], lIIlllIIl[24]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray4 = new int[lIIlllIIl[1]];
            nArray4[l.lIIlllIIl[0]] = lIIlllIIl[11];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[11], lIIlllIIl[61], lIIlllIIl[24]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray5 = new int[lIIlllIIl[1]];
            nArray5[l.lIIlllIIl[0]] = lIIlllIIl[12];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[12], lIIlllIIl[4], lIIlllIIl[24]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray6 = new int[lIIlllIIl[1]];
            nArray6[l.lIIlllIIl[0]] = lIIlllIIl[44];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[44], lIIlllIIl[1], e.c(lIIlllIIl[62], lIIlllIIl[63]));
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
        }
        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[22];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIlllIIl[1]];
                nArray7[l.lIIlllIIl[0]] = lIIlllIIl[22];
                if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIlllIIl[61])) {
                    int[] nArray8 = new int[lIIlllIIl[1]];
                    nArray8[l.lIIlllIIl[0]] = lIIlllIIl[22];
                    lIIIIIIIIIlIlIl = new d(lIIlllIIl[22], lIIlllIIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIlllIIl[64]);
                    bv.add((d)lIIIIIIIIIlIlIl);
                    0;
                }
            }
            int[] nArray9 = new int[lIIlllIIl[1]];
            nArray9[l.lIIlllIIl[0]] = lIIlllIIl[22];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[22], lIIlllIIl[61], lIIlllIIl[64]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray10 = new int[lIIlllIIl[1]];
            nArray10[l.lIIlllIIl[0]] = lIIlllIIl[23];
            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlllIIl[1]];
                nArray11[l.lIIlllIIl[0]] = lIIlllIIl[23];
                if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIlllIIl[61])) {
                    int[] nArray12 = new int[lIIlllIIl[1]];
                    nArray12[l.lIIlllIIl[0]] = lIIlllIIl[23];
                    lIIIIIIIIIlIlIl = new d(lIIlllIIl[23], lIIlllIIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIlllIIl[65]);
                    bv.add((d)lIIIIIIIIIlIlIl);
                    0;
                }
            }
            int[] nArray13 = new int[lIIlllIIl[1]];
            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[23];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIIIIIIIIlIlIl = new d(lIIlllIIl[23], lIIlllIIl[61], lIIlllIIl[65]);
                bv.add((d)lIIIIIIIIIlIlIl);
                0;
            }
            int[] nArray14 = new int[lIIlllIIl[1]];
            nArray14[l.lIIlllIIl[0]] = lIIlllIIl[20];
            if (l.lIIIIIlIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlllIIl[1]];
                nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new d(lIIlllIIl[20], lIIlllIIl[1], lIIlllIIl[66]);
                    bv.add((d)lIIIIIIIIIlIlIl);
                    0;
                }
            }
            if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIlllIIl[1]];
                nArray16[l.lIIlllIIl[0]] = lIIlllIIl[14];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[14];
                    if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray17).getQuantity(), lIIlllIIl[61])) {
                        int[] nArray18 = new int[lIIlllIIl[1]];
                        nArray18[l.lIIlllIIl[0]] = lIIlllIIl[14];
                        lIIIIIIIIIlIlIl = new d(lIIlllIIl[14], lIIlllIIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIlllIIl[58]);
                        bv.add((d)lIIIIIIIIIlIlIl);
                        0;
                    }
                }
                int[] nArray19 = new int[lIIlllIIl[1]];
                nArray19[l.lIIlllIIl[0]] = lIIlllIIl[14];
                if (l.lIIIIIlIIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new d(lIIlllIIl[14], lIIlllIIl[61], lIIlllIIl[58]);
                    bv.add((d)lIIIIIIIIIlIlIl);
                    0;
                }
                int[] nArray20 = new int[lIIlllIIl[1]];
                nArray20[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIlllIIl[1]];
                    nArray21[l.lIIlllIIl[0]] = lIIlllIIl[21];
                    if (l.lIIIIIlIIIll(Bank.getFirst((int[])nArray21).getQuantity(), lIIlllIIl[66])) {
                        int[] nArray22 = new int[lIIlllIIl[1]];
                        nArray22[l.lIIlllIIl[0]] = lIIlllIIl[21];
                        lIIIIIIIIIlIlIl = new d(lIIlllIIl[21], lIIlllIIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIlllIIl[24]);
                        bv.add((d)lIIIIIIIIIlIlIl);
                        0;
                    }
                }
                int[] nArray23 = new int[lIIlllIIl[1]];
                nArray23[l.lIIlllIIl[0]] = lIIlllIIl[21];
                if (l.lIIIIIlIIlII(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIIIIIIIIlIlIl = new d(lIIlllIIl[21], lIIlllIIl[66], lIIlllIIl[24]);
                    bv.add((d)lIIIIIIIIIlIlIl);
                    0;
                }
            }
        }
        int[] nArray = new int[lIIlllIIl[1]];
        nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIIIIIIlIlIl = new d(lIIlllIIl[18], lIIlllIIl[67], lIIlllIIl[37]);
            bv.add((d)lIIIIIIIIIlIlIl);
            0;
        }
        if (l.lIIIIIlIIlII(Bank.contains(lIIIIIIIIIlIlIl = item -> item.getName().toLowerCase().contains(lIIllIlll[lIIlllIIl[74]])) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new d(lIIlllIIl[68], lIIlllIIl[17], lIIlllIIl[69]);
            bv.add(lIIIIIIIIIlIlII);
            0;
        }
        int[] nArray24 = new int[lIIlllIIl[1]];
        nArray24[l.lIIlllIIl[0]] = lIIlllIIl[70];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new d(lIIlllIIl[70], lIIlllIIl[32], lIIlllIIl[71]);
            bv.add(lIIIIIIIIIlIlII);
            0;
        }
        int[] nArray25 = new int[lIIlllIIl[1]];
        nArray25[l.lIIlllIIl[0]] = lIIlllIIl[16];
        if (l.lIIIIIlIIlII(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIIIIIIIIlIlII = new d(lIIlllIIl[16], lIIlllIIl[32], lIIlllIIl[71]);
            bv.add(lIIIIIIIIIlIlII);
            0;
        }
    }

    private static boolean lIIIIIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Z() {
        if (l.lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (l.lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[40]];
            Movement.walkTo((WorldPoint)bx);
            0;
            Time.sleepTicks((int)lIIlllIIl[1]);
            0;
        }
        if (l.lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            l.aa();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[73])) {
            bl = lIIlllIIl[1];
            0;
            if (-2 >= 0) {
                return ((0x56 ^ 0xC) & ~(0x69 ^ 0x33)) != 0;
            }
        } else {
            bl = lIIlllIIl[0];
        }
        return bl;
    }

    private static String lIIIIIIllIlI(String llllllllllIIlI, String llllllllllIIIl) {
        llllllllllIIlI = new String(Base64.getDecoder().decode(llllllllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllIIII = new StringBuilder();
        char[] lllllllllIllll = llllllllllIIIl.toCharArray();
        int lllllllllIlllI = lIIlllIIl[0];
        char[] lllllllllIlIII = llllllllllIIlI.toCharArray();
        int lllllllllIIlll = lllllllllIlIII.length;
        int lllllllllIIllI = lIIlllIIl[0];
        while (l.lIIIIIlIIIll(lllllllllIIllI, lllllllllIIlll)) {
            char llllllllllIIll = lllllllllIlIII[lllllllllIIllI];
            llllllllllIIII.append((char)(llllllllllIIll ^ lllllllllIllll[lllllllllIlllI % lllllllllIllll.length]));
            0;
            ++lllllllllIlllI;
            ++lllllllllIIllI;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllIIII);
    }

    public static void Y() {
        if (l.lIIIIIlIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[0]];
            b.a(bv);
            if (l.lIIIIIlIIIll(bv.size(), lIIlllIIl[1])) {
                System.out.println(lIIllIlll[lIIlllIIl[1]]);
                bt = lIIlllIIl[0];
            }
        }
        if (l.lIIIIIlIIlII(bt ? 1 : 0)) {
            BankLocation lIIIIIIIIIllllI;
            if (l.lIIIIIlIIlII(l.ab() ? 1 : 0)) {
                lIIIIIIIIIllllI = BankLocation.getNearest();
                if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlII(lIIIIIIIIIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[2]];
                    a.a(lIIIIIIIIIllllI);
                }
                if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIIlI(lIIIIIIIIIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[3]];
                    if (l.lIIIIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlllIIl[4]);
                        0;
                    }
                    if (l.lIIIIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (l.lIIIIIlIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlllIIl[5]);
                            0;
                        }
                        while (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6]) && l.lIIIIIlIIlII(z.bi() ? 1 : 0)) {
                            z.bg();
                            Time.sleepTicks((int)lIIlllIIl[1]);
                            0;
                            0;
                            if (null == null) continue;
                            return;
                        }
                        if (l.lIIIIIlIIlII(l.ac() ? 1 : 0)) {
                            l.af();
                            System.out.println(lIIllIlll[lIIlllIIl[5]]);
                            bt = lIIlllIIl[1];
                            return;
                        }
                        if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlllIIl[1]];
                                nArray2[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray2), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[7], (int)lIIlllIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[7];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if (-1 >= 0) {
                                                return ((0xB6 ^ 0xC1 ^ (0x7C ^ 0x4C)) & (0xA2 ^ 0xC7 ^ (0xBB ^ 0x99) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIIlllIIl[1]];
                            nArray3[l.lIIlllIIl[0]] = lIIlllIIl[9];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlllIIl[1]];
                                nArray4[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray4), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[9], (int)lIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if ((0x17 ^ 0x12) <= 0) {
                                                return ((0x91 ^ 0xC3) & ~(0x21 ^ 0x73)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIIlllIIl[1]];
                            nArray5[l.lIIlllIIl[0]] = lIIlllIIl[11];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlllIIl[1]];
                                nArray6[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray6), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[11], (int)lIIlllIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if (1 > 1) {
                                                return ((0x38 ^ 0x70) & ~(0x46 ^ 0xE)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIIlllIIl[1]];
                            nArray7[l.lIIlllIIl[0]] = lIIlllIIl[12];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIlllIIl[1]];
                                nArray8[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray8), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[12], (int)lIIlllIIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if (-1 > 2) {
                                                return ((31 + 192 - -3 + 4 ^ 85 + 91 - 92 + 50) & (0xE7 ^ 0x9C ^ (0x4D ^ 0x56) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIIlllIIl[1]];
                            nArray9[l.lIIlllIIl[0]] = lIIlllIIl[14];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlllIIl[1]];
                                nArray10[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray10), lIIlllIIl[1])) {
                                    Bank.withdraw((int)lIIlllIIl[14], (int)lIIlllIIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if (-3 > 0) {
                                                return ((0x34 ^ 0x61 ^ (0x38 ^ 0x69)) & (9 + 27 - 23 + 150 ^ 69 + 121 - 66 + 43 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIIlllIIl[1]];
                            nArray11[l.lIIlllIIl[0]] = lIIlllIIl[15];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIlllIIl[1]];
                                nArray12[l.lIIlllIIl[0]] = lIIlllIIl[15];
                                if (l.lIIIIIlIIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIlllIIl[15], (int)lIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIIlllIIl[16], (int)lIIlllIIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIlllIIl[1]];
                            nArray13[l.lIIlllIIl[0]] = lIIlllIIl[18];
                            if (l.lIIIIIlIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIlllIIl[1]];
                                nArray14[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                if (l.lIIIIIlIIIll(Inventory.getCount((int[])nArray14), lIIlllIIl[1]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) {
                                    Bank.withdrawAll((int)lIIlllIIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlllIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlllIIl[1]];
                                        nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
                                        if (l.lIIIIIlIIllI(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlllIIl[1];
                                            0;
                                            if ((0x33 ^ 0x6C ^ (0xDE ^ 0x84)) <= 0) {
                                                return ((176 + 192 - 132 + 9 ^ 106 + 173 - 155 + 62) & (0 ^ 0x5B ^ (0x61 ^ 0x75) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlllIIl[4]);
                                    0;
                                }
                            }
                        }
                        if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                            int[] nArray = new int[lIIlllIIl[1]];
                            nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlllIIl[20], (int)lIIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);
                                0;
                            }
                            if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIlllIIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);
                                0;
                                Bank.withdrawAll((int)lIIlllIIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlllIIl[1]);
                                0;
                            }
                            Bank.withdrawAll((int)lIIlllIIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlllIIl[1]);
                            0;
                            Bank.withdrawAll((int)lIIlllIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIlllIIl[1]);
                            0;
                        }
                    }
                }
            }
            if (l.lIIIIIlIIIlI(l.ab() ? 1 : 0)) {
                if (l.lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19])) {
                    if (l.lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[17]];
                        Movement.walkTo((WorldPoint)bx);
                        0;
                        Time.sleepTicks((int)lIIlllIIl[1]);
                        0;
                    }
                    if (l.lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[24]];
                        l.aa();
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[19]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[25])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[26]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);
                        0;
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[25]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[28])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[29]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);
                        0;
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[28]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[30])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[31]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);
                        0;
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[30]) && l.lIIIIIlIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[32]];
                    if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIlllIIl[1]);
                        0;
                    }
                }
                if (l.lIIIIIlIIlll(Skills.getLevel((Skill)Skill.MAGIC), lIIlllIIl[6])) {
                    int lIIIIIIIIIlllII;
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[33]];
                    int[] nArray = new int[lIIlllIIl[1]];
                    nArray[l.lIIlllIIl[0]] = lIIlllIIl[20];
                    if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIlllIIl[1]];
                        nArray15[l.lIIlllIIl[0]] = lIIlllIIl[20];
                        if (l.lIIIIIlIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIlllIIl[1]];
                            nArray16[l.lIIlllIIl[0]] = lIIlllIIl[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIllIlll[lIIlllIIl[34]]);
                            Time.sleepTicks((int)lIIlllIIl[1]);
                            0;
                        }
                    }
                    if (l.lIIIIIlIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIlllIIl[1]];
                    nArray17[l.lIIlllIIl[0]] = lIIlllIIl[22];
                    lIIIIIIIIIllllI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIlllIIl[1]];
                    nArray18[l.lIIlllIIl[0]] = lIIlllIIl[35];
                    Item lIIIIIIIIIlllIl = Inventory.getFirst((int[])nArray18);
                    if (l.lIIIIIlIIlII(bu ? 1 : 0)) {
                        if (l.lIIIIIlIIlII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[36]];
                            Movement.walkTo((WorldPoint)by);
                            0;
                            Time.sleepTicks((int)lIIlllIIl[1]);
                            0;
                        }
                        if (l.lIIIIIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlIl(lIIIIIIIIIlllIl)) {
                            lIIIIIIIIIlllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIIIIIIIIlllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIIIIIlIllIl(Skills.getExperience((Skill)Skill.MAGIC), lIIIIIIIIIlllII)) {
                                    bl = lIIlllIIl[1];
                                    0;
                                    if (2 <= 0) {
                                        return ((0x20 ^ 0x72) & ~(0x79 ^ 0x2B)) != 0;
                                    }
                                } else {
                                    bl = lIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIlllIIl[8]);
                            0;
                            Time.sleep((long)e.c(lIIlllIIl[37], lIIlllIIl[38]));
                            0;
                        }
                    }
                    if (l.lIIIIIlIIIlI(bu ? 1 : 0)) {
                        if (l.lIIIIIlIIlIl(lIIIIIIIIIllllI) && l.lIIIIIlIIlIl(lIIIIIIIIIlllIl) && l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                            lIIIIIIIIIlllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIIIIIIIIlllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.lIIIIIlIllIl(Skills.getExperience((Skill)Skill.MAGIC), lIIIIIIIIIlllII)) {
                                    bl = lIIlllIIl[1];
                                    0;
                                    if (((0x73 ^ 0x54 ^ (0x3F ^ 0x78)) & (41 + 138 - -73 + 1 ^ 33 + 77 - -6 + 41 ^ -1)) != 0) {
                                        return ((85 + 67 - 33 + 24 ^ 92 + 68 - 61 + 63) & (0x76 ^ 0x62 ^ (0x9B ^ 0xA2) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlllIIl[0];
                                }
                                return bl;
                            }, (int)lIIlllIIl[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (l.lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                                bl = lIIlllIIl[1];
                                0;
                                if (-1 > 1) {
                                    return ((0x90 ^ 0x85) & ~(0x5A ^ 0x4F)) != 0;
                                }
                            } else {
                                bl = lIIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIIlllIIl[39]);
                        0;
                    }
                }
            }
        }
    }

    private static void aa() {
        if (l.lIIIIIlIlIlI(l.lIIIIIlIlIIl(e.u(), 30.0))) {
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[18];
            if (l.lIIIIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlllIIl[1]];
                nArray2[l.lIIlllIIl[0]] = lIIlllIIl[18];
                Inventory.getFirst((int[])nArray2).interact(lIIllIlll[lIIlllIIl[41]]);
                Time.sleepTicks((int)lIIlllIIl[1]);
                0;
            }
        }
        if (l.lIIIIIlIlIll(Players.getLocal().getInteracting())) {
            NPC lIIIIIIIIIllIIl = NPCs.getNearest(nPC -> {
                int n2;
                if (l.lIIIIIlIIIlI(nPC.getName().contains(lIIllIlll[lIIlllIIl[75]]) ? 1 : 0) && l.lIIIIIlIIlII(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIlllIIl[1];
                    0;
                    if (((0x69 ^ 0x6E ^ 1) & (0xF3 ^ 0x8B ^ (0x2A ^ 0x54) ^ -1)) != 0) {
                        return ((0xC4 ^ 0xBD ^ (0x60 ^ 0x2C)) & (0x59 ^ 0x72 ^ (0x48 ^ 0x56) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIlllIIl[2]];
            stringArray[l.lIIlllIIl[0]] = lIIllIlll[lIIlllIIl[42]];
            stringArray[l.lIIlllIIl[1]] = lIIllIlll[lIIlllIIl[43]];
            List lIIIIIIIIIllIII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (l.lIIIIIlIllII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIlllIIl[1];
                    0;
                    if (1 >= 2) {
                        return ((0x43 ^ 0x19) & ~(0x1B ^ 0x41)) != 0;
                    }
                } else {
                    bl = lIIlllIIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIlllIIl[1]];
            nArray[l.lIIlllIIl[0]] = lIIlllIIl[44];
            if (l.lIIIIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0) && l.lIIIIIlIIlII(l.ad() ? 1 : 0)) {
                l.ae();
            }
            if (l.lIIIIIlIIlIl(lIIIIIIIIIllIIl) && l.lIIIIIlIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[45]];
                lIIIIIIIIIllIIl.interact(lIIllIlll[lIIlllIIl[46]]);
                Time.sleepTicks((int)lIIlllIIl[3]);
                0;
            }
        }
        if (l.lIIIIIlIIlIl(Players.getLocal().getInteracting())) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[47]];
            Time.sleepTicks((int)lIIlllIIl[1]);
            0;
        }
    }

    private static boolean lIIIIIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIlIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlIIIIl() {
        lIIlllIIl = new int[82];
        l.lIIlllIIl[0] = (0x12 ^ 0x1B) & ~(0xCA ^ 0xC3);
        l.lIIlllIIl[1] = 1;
        l.lIIlllIIl[2] = 2;
        l.lIIlllIIl[3] = 3;
        l.lIIlllIIl[4] = -(0xFFFFE796 & 0x5C6F) & (0xFFFFDF8F & 0x77FD);
        l.lIIlllIIl[5] = 0xBB ^ 0xA6 ^ (0x36 ^ 0x2F);
        l.lIIlllIIl[6] = 0xA5 ^ 0x92;
        l.lIIlllIIl[7] = 0xFFFF9B6E & 0x66BF;
        l.lIIlllIIl[8] = -(0xFFFFB3D2 & 0x5C2F) & (0xFFFFD7FD & 0x3DDF);
        l.lIIlllIIl[9] = -(0xFFFFFEC5 & 0x51FF) & (0xFFFFD2FF & 0x7FEF);
        l.lIIlllIIl[10] = -(0xFFFFA3DF & 0x7E33) & (0xFFFFAFDE & 0x7BF7);
        l.lIIlllIIl[11] = 0xFFFFA73D & 0x5AEF;
        l.lIIlllIIl[12] = -(0xFFFFDF9F & 0x7866) & (0xFFFFDF6F & 0x7ABF);
        l.lIIlllIIl[13] = -(0xFFFFF4A1 & 0x6B7F) & (0xFFFFF3B7 & 0x7DFC);
        l.lIIlllIIl[14] = -(0xFFFFFDBF & 0x2EC5) & (0xFFFFAFB7 & 0x7EFF);
        l.lIIlllIIl[15] = 0xFFFFB575 & 0x7BDB;
        l.lIIlllIIl[16] = 0xFFFFFFDF & 0x1F69;
        l.lIIlllIIl[17] = 0x52 ^ 0x57;
        l.lIIlllIIl[18] = -(0xFFFFFDD1 & 0x76AF) & (0xFFFFFDFB & 0x77FF);
        l.lIIlllIIl[19] = 0x9C ^ 0x85;
        l.lIIlllIIl[20] = -(0xFFFFF85F & 0x6FB1) & (0xFFFFEF7F & 0x7DFB);
        l.lIIlllIIl[21] = 0xFFFFD7ED & 0x2A3E;
        l.lIIlllIIl[22] = -(0xFFFFE17B & 0x3FCF) & (0xFFFFB77B & 0x6BFF);
        l.lIIlllIIl[23] = 0xD8 ^ 0x94 ^ (1 ^ 0x73);
        l.lIIlllIIl[24] = 0x6D ^ 0x6B;
        l.lIIlllIIl[25] = 0x5B ^ 0x44;
        l.lIIlllIIl[26] = 3 ^ (0xA9 ^ 0xAD);
        l.lIIlllIIl[27] = -1;
        l.lIIlllIIl[28] = 147 + 78 - 0 + 4 ^ 51 + 78 - 1 + 64;
        l.lIIlllIIl[29] = 0xBF ^ 0xB7;
        l.lIIlllIIl[30] = 0x40 ^ 0x6D;
        l.lIIlllIIl[31] = 0x90 ^ 0xB9 ^ (0xE0 ^ 0xC0);
        l.lIIlllIIl[32] = 0x3B ^ 0x31;
        l.lIIlllIIl[33] = 0x4D ^ 0x70 ^ (0xB6 ^ 0x80);
        l.lIIlllIIl[34] = 104 + 28 - 88 + 113 ^ 23 + 1 - -60 + 61;
        l.lIIlllIIl[35] = 0x25 ^ 0x1A;
        l.lIIlllIIl[36] = 0x12 ^ 0x59 ^ (0xF3 ^ 0xB5);
        l.lIIlllIIl[37] = -(0xFFFF8FBF & 0x7CFE) & (0xFFFFADFF & 0x5FFD);
        l.lIIlllIIl[38] = 0xFFFF879B & 0x7A76;
        l.lIIlllIIl[39] = 0xFFFFCDAD & 0x3FFE;
        l.lIIlllIIl[40] = 17 + 2 - 10 + 137 ^ 127 + 75 - 165 + 119;
        l.lIIlllIIl[41] = 0x99 ^ 0x96;
        l.lIIlllIIl[42] = 0xF2 ^ 0xA8 ^ (0x1F ^ 0x55);
        l.lIIlllIIl[43] = 0xA6 ^ 0xB7;
        l.lIIlllIIl[44] = -(0xFFFFDEE9 & 0x3B17) & (0xFFFFDF6F & 0x3FF5);
        l.lIIlllIIl[45] = 0x9B ^ 0x94 ^ (0xBA ^ 0xA7);
        l.lIIlllIIl[46] = 0xCA ^ 0xC0 ^ (0x32 ^ 0x2B);
        l.lIIlllIIl[47] = 0xBF ^ 0xAB;
        l.lIIlllIIl[48] = 0xFFFFAD37 & 0x53DC;
        l.lIIlllIIl[49] = 0xFFFFCEF9 & 0x3357;
        l.lIIlllIIl[50] = 0xC ^ 0x64 ^ (0xC3 ^ 0xB1);
        l.lIIlllIIl[51] = 0x63 ^ 0x42 ^ (0x2D ^ 0x19);
        l.lIIlllIIl[52] = 0x5C ^ 0x4A;
        l.lIIlllIIl[53] = 81 + 96 - 174 + 198;
        l.lIIlllIIl[54] = 0x45 ^ 0x2E ^ (0x7F ^ 3);
        l.lIIlllIIl[55] = 0x98 ^ 0xB2 ^ (0xA4 ^ 0x96);
        l.lIIlllIIl[56] = 101 + 8 - 45 + 88 ^ 122 + 5 - 56 + 60;
        l.lIIlllIIl[57] = -(0xFFFFBD9E & 0x6675) & (0xFFFFEFFF & 0x37FB);
        l.lIIlllIIl[58] = 42 + 75 - -29 + 24;
        l.lIIlllIIl[59] = -(0xFFFFD66A & 0x79B5) & (0xFFFFFFFF & 0x5FBF);
        l.lIIlllIIl[60] = -(0xFFFFFEEB & 0x2136) & (0xFFFFAFF5 & 0x77FB);
        l.lIIlllIIl[61] = -(0xFFFFFD36 & 0x52CF) & (0xFFFFFFFD & 0x5BBF);
        l.lIIlllIIl[62] = 0xFFFFBBD7 & 0x74FC;
        l.lIIlllIIl[63] = -(0xFFFFEFD4 & 0x537F) & (0xFFFFFFFF & 0x7FDF);
        l.lIIlllIIl[64] = 0xF6 ^ 0xA5 ^ (0xAA ^ 0x81);
        l.lIIlllIIl[65] = 143 + 53 - 157 + 111;
        l.lIIlllIIl[66] = -(0xFFFF8675 & 0x7DAF) & (0xFFFFBFFC & 0x7EBF);
        l.lIIlllIIl[67] = 17 + 90 - 19 + 104 ^ 36 + 14 - -113 + 1;
        l.lIIlllIIl[68] = -(0xFFFFB7AF & 0x5953) & (0xFFFFBFCE & Short.MAX_VALUE);
        l.lIIlllIIl[69] = 0xFFFFF5EA & 0x6BBD;
        l.lIIlllIIl[70] = 0xFFFFDF6F & 0x3FD7;
        l.lIIlllIIl[71] = -(0xFFFFFC7E & 0x6BED) & (0xFFFFFFEF & 0x6BFF);
        l.lIIlllIIl[72] = 0x43 ^ 0x5F;
        l.lIIlllIIl[73] = 0x75 ^ 5 ^ (0x16 ^ 5);
        l.lIIlllIIl[74] = 0xBB ^ 0xA6;
        l.lIIlllIIl[75] = 1 ^ (0x35 ^ 0x2A);
        l.lIIlllIIl[76] = -(0xFFFFF6E2 & 0xD1F) & (0xFFFF9FFF & 0x6FCF);
        l.lIIlllIIl[77] = 0xFFFFBDF3 & 0x4EEF;
        l.lIIlllIIl[78] = 0xFFFFFBFF & 0xFD7;
        l.lIIlllIIl[79] = 0xFFFF8CFB & 0x7FED;
        l.lIIlllIIl[80] = -(0xFFFFF9D7 & 0x77AD) & (0xFFFFFFDF & 0x7DFE);
        l.lIIlllIIl[81] = -(0xFFFF9161 & 0x7E9F) & (0xFFFFDFFF & 0x3D9F);
    }

    private static boolean lIIIIIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int T() {
        try {
            l.Y();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xE7 ^ 0xBC ^ (0x68 ^ 0x1A)) & (125 + 185 - 284 + 163 ^ 12 + 61 - 71 + 146 ^ -1)) == 2) {
            return (0xE1 ^ 0xC4 ^ (0x6F ^ 0x66)) & (0xCE ^ 0xBB ^ (0xD7 ^ 0x8E) ^ -1);
        }
        return lIIlllIIl[67];
    }
}

