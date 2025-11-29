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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.I;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class m
implements ac {
    public static /* synthetic */ boolean ci;
    private static /* synthetic */ int[] lIllllIlll;
    static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ String[] lIllllIllI;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldArea cj;
    static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ boolean bt;

    private static boolean lIlIIIIIlIlII(int n2) {
        return n2 < 0;
    }

    public static boolean ap() {
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[1]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[2]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[3]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
            return lIllllIlll[1];
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[3]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        if (m.lIlIIIIIlIIlI(Vars.getBit((int)lIllllIlll[48]), lIllllIlll[5]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        return lIllllIlll[0];
    }

    public static void aq() {
        if (m.lIlIIIIIIllll(Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50]))) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[51]];
            Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50]).interact(lIllllIllI[lIllllIlll[52]]);
            Time.sleepTicks((int)lIllllIlll[5]);
            0;
        }
        if (m.lIlIIIIIlIlIl(Widgets.get((int)lIllllIlll[49], (int)lIllllIlll[50])) && m.lIlIIIIIIlllI(Widgets.get((int)lIllllIlll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIllllIlll[1]);
            0;
            if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[1]).interact(lIllllIllI[lIllllIlll[54]]);
            }
            if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[2]).interact(lIllllIllI[lIllllIlll[55]]);
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
                Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[19]]);
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[31])) {
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[50]]);
                }
            }
            if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[36])) {
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllIlll[53], (int)lIllllIlll[1]).getChild(lIllllIlll[5]).interact(lIllllIllI[lIllllIlll[56]]);
                }
            }
            Time.sleepTicks((int)lIllllIlll[1]);
            0;
        }
    }

    private static String lIlIIIIIIlIII(String var19, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllllIlll[2], var7);
            return new String(var6.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIIIIlIlI() {
        lIllllIllI = new String[lIllllIlll[25]];
        m.lIllllIllI[m.lIllllIlll[0]] = m."Buying items";
        m.lIllllIllI[m.lIllllIlll[1]] = m."Finished buying items, switching back to magic training";
        m.lIllllIllI[m.lIllllIlll[2]] = m."Navigating to bank";
        m.lIllllIllI[m.lIllllIlll[3]] = m."Handling banking";
        m.lIllllIllI[m.lIllllIlll[5]] = m."We are missing supplies, switching to BUYING";
        m.lIllllIllI[m.lIllllIlll[17]] = m."Nav to cows";
        m.lIllllIllI[m.lIllllIlll[24]] = m."Attacking cows";
        m.lIllllIllI[m.lIllllIlll[26]] = m."Casting varrock tele";
        m.lIllllIllI[m.lIllllIlll[29]] = m."Casting lumby tele";
        m.lIllllIllI[m.lIllllIlll[31]] = m."Casting fally tele";
        m.lIllllIllI[m.lIllllIlll[32]] = m."Casting cammy tele";
        m.lIllllIllI[m.lIllllIlll[33]] = m."Alching";
        m.lIllllIllI[m.lIllllIlll[34]] = m."Wield";
        m.lIllllIllI[m.lIllllIlll[36]] = m."Move to alch spot";
        m.lIllllIllI[m.lIllllIlll[40]] = m."Nav to cows";
        m.lIllllIllI[m.lIllllIlll[41]] = m."Eat";
        m.lIllllIllI[m.lIllllIlll[42]] = m."Cow";
        m.lIllllIllI[m.lIllllIlll[43]] = m."cow";
        m.lIllllIllI[m.lIllllIlll[45]] = m."Attacking cows";
        m.lIllllIllI[m.lIllllIlll[46]] = m."Attack";
        m.lIllllIllI[m.lIllllIlll[47]] = m."In combat";
        m.lIllllIllI[m.lIllllIlll[51]] = m."Opening autocast";
        m.lIllllIllI[m.lIllllIlll[52]] = m."Choose spell";
        m.lIllllIllI[m.lIllllIlll[54]] = m."Wind Strike";
        m.lIllllIllI[m.lIllllIlll[55]] = m."Water Strike";
        m.lIllllIllI[m.lIllllIlll[19]] = m."Earth Strike";
        m.lIllllIllI[m.lIllllIlll[50]] = m."Earth Strike";
        m.lIllllIllI[m.lIllllIlll[56]] = m."Fire Strike";
        m.lIllllIllI[m.lIllllIlll[72]] = m."Magic training";
        m.lIllllIllI[m.lIllllIlll[74]] = m."ring of wealth (";
        m.lIllllIllI[m.lIllllIlll[75]] = m."Cow";
    }

    private static void Q() {
        d var4;
        Object var1;
        if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIllllIlll[14], lIllllIlll[57], lIllllIlll[58]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lIllllIlll[1]];
            nArray2[m.lIllllIlll[0]] = lIllllIlll[7];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var1 = new d(lIllllIlll[7], lIllllIlll[59], lIllllIlll[24]);
                bv.add((d)var1);
                0;
            }
            int[] nArray3 = new int[lIllllIlll[1]];
            nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var1 = new d(lIllllIlll[9], lIllllIlll[60], lIllllIlll[24]);
                bv.add((d)var1);
                0;
            }
            int[] nArray4 = new int[lIllllIlll[1]];
            nArray4[m.lIllllIlll[0]] = lIllllIlll[11];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var1 = new d(lIllllIlll[11], lIllllIlll[61], lIllllIlll[24]);
                bv.add((d)var1);
                0;
            }
            int[] nArray5 = new int[lIllllIlll[1]];
            nArray5[m.lIllllIlll[0]] = lIllllIlll[12];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var1 = new d(lIllllIlll[12], lIllllIlll[4], lIllllIlll[24]);
                bv.add((d)var1);
                0;
            }
            int[] nArray6 = new int[lIllllIlll[1]];
            nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var1 = new d(lIllllIlll[44], lIllllIlll[1], e.c(lIllllIlll[62], lIllllIlll[63]));
                bv.add((d)var1);
                0;
            }
        }
        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[22];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIllllIlll[1]];
                nArray7[m.lIllllIlll[0]] = lIllllIlll[22];
                if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIllllIlll[61])) {
                    int[] nArray8 = new int[lIllllIlll[1]];
                    nArray8[m.lIllllIlll[0]] = lIllllIlll[22];
                    var1 = new d(lIllllIlll[22], lIllllIlll[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIllllIlll[64]);
                    bv.add((d)var1);
                    0;
                }
            }
            int[] nArray9 = new int[lIllllIlll[1]];
            nArray9[m.lIllllIlll[0]] = lIllllIlll[22];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var1 = new d(lIllllIlll[22], lIllllIlll[61], lIllllIlll[64]);
                bv.add((d)var1);
                0;
            }
            int[] nArray10 = new int[lIllllIlll[1]];
            nArray10[m.lIllllIlll[0]] = lIllllIlll[23];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIllllIlll[1]];
                nArray11[m.lIllllIlll[0]] = lIllllIlll[23];
                if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray11).getQuantity(), lIllllIlll[61])) {
                    int[] nArray12 = new int[lIllllIlll[1]];
                    nArray12[m.lIllllIlll[0]] = lIllllIlll[23];
                    var1 = new d(lIllllIlll[23], lIllllIlll[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIllllIlll[65]);
                    bv.add((d)var1);
                    0;
                }
            }
            int[] nArray13 = new int[lIllllIlll[1]];
            nArray13[m.lIllllIlll[0]] = lIllllIlll[23];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var1 = new d(lIllllIlll[23], lIllllIlll[61], lIllllIlll[65]);
                bv.add((d)var1);
                0;
            }
            int[] nArray14 = new int[lIllllIlll[1]];
            nArray14[m.lIllllIlll[0]] = lIllllIlll[20];
            if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var1 = new d(lIllllIlll[20], lIllllIlll[1], lIllllIlll[66]);
                    bv.add((d)var1);
                    0;
                }
            }
            if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[14];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[14];
                    if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray17).getQuantity(), lIllllIlll[61])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[14];
                        var1 = new d(lIllllIlll[14], lIllllIlll[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIllllIlll[58]);
                        bv.add((d)var1);
                        0;
                    }
                }
                int[] nArray19 = new int[lIllllIlll[1]];
                nArray19[m.lIllllIlll[0]] = lIllllIlll[14];
                if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var1 = new d(lIllllIlll[14], lIllllIlll[61], lIllllIlll[58]);
                    bv.add((d)var1);
                    0;
                }
                int[] nArray20 = new int[lIllllIlll[1]];
                nArray20[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIllllIlll[1]];
                    nArray21[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIIllIl(Bank.getFirst((int[])nArray21).getQuantity(), lIllllIlll[66])) {
                        int[] nArray22 = new int[lIllllIlll[1]];
                        nArray22[m.lIllllIlll[0]] = lIllllIlll[21];
                        var1 = new d(lIllllIlll[21], lIllllIlll[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIllllIlll[24]);
                        bv.add((d)var1);
                        0;
                    }
                }
                int[] nArray23 = new int[lIllllIlll[1]];
                nArray23[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var1 = new d(lIllllIlll[21], lIllllIlll[66], lIllllIlll[24]);
                    bv.add((d)var1);
                    0;
                }
            }
        }
        int[] nArray = new int[lIllllIlll[1]];
        nArray[m.lIllllIlll[0]] = lIllllIlll[18];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new d(lIllllIlll[18], lIllllIlll[67], lIllllIlll[37]);
            bv.add((d)var1);
            0;
        }
        if (m.lIlIIIIIIlllI(Bank.contains(var1 = item -> item.getName().toLowerCase().contains(lIllllIllI[lIllllIlll[74]])) ? 1 : 0)) {
            var4 = new d(lIllllIlll[68], lIllllIlll[17], lIllllIlll[69]);
            bv.add(var4);
            0;
        }
        int[] nArray24 = new int[lIllllIlll[1]];
        nArray24[m.lIllllIlll[0]] = lIllllIlll[70];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var4 = new d(lIllllIlll[70], lIllllIlll[32], lIllllIlll[71]);
            bv.add(var4);
            0;
        }
        int[] nArray25 = new int[lIllllIlll[1]];
        nArray25[m.lIllllIlll[0]] = lIllllIlll[16];
        if (m.lIlIIIIIIlllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var4 = new d(lIllllIlll[16], lIllllIlll[32], lIllllIlll[71]);
            bv.add(var4);
            0;
        }
    }

    private static boolean lIlIIIIIIllII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
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
                                                    if (!m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) break block19;
                                                    int[] nArray = new int[lIllllIlll[1]];
                                                    nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllIlll[1]];
                                                    nArray2[m.lIllllIlll[0]] = lIllllIlll[11];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllIlll[1]];
                                                    nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllIlll[1]];
                                                    nArray4[m.lIllllIlll[0]] = lIllllIlll[12];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllIlll[1]];
                                                    nArray5[m.lIllllIlll[0]] = lIllllIlll[18];
                                                    if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllIlll[1]];
                                                    nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllIlll[1]];
                                                    nArray7[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllIlll[1];
                                                0;
                                                if (1 <= 3) return n5 != 0;
                                                return (3 & (3 ^ -1)) != 0;
                                            }
                                            n5 = lIllllIlll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) || !m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) break block22;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllIlll[1]];
                                        nArray8[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllIlll[1]];
                                        nArray9[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllIlll[1]];
                                        nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (!m.lIlIIIIIIllII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllIlll[1]];
                                        nArray11[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllIlll[1]];
                                        nArray12[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllIlll[1];
                                    0;
                                    if (1 != 0) return n4 != 0;
                                    return ((0x6B ^ 0x52 ^ (0x1C ^ 0x31)) & (99 + 111 - 121 + 45 ^ 64 + 53 - 78 + 107 ^ -1)) != 0;
                                }
                                n4 = lIllllIlll[0];
                                return n4 != 0;
                            }
                            if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIlllI(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllIlll[1]];
                        nArray[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllIlll[1]];
                            nArray14[m.lIllllIlll[0]] = lIllllIlll[23];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllIlll[1];
                                0;
                                if (((0x79 ^ 0x5C) & ~(0x2D ^ 8)) >= ((0xC9 ^ 0xC3) & ~(0x78 ^ 0x72))) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIllllIlll[0];
                    return n3 != 0;
                }
                if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIllII(ci ? 1 : 0)) return lIllllIlll[0];
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIlIIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIllllIlll[17])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllIlll[1]];
                            nArray19[m.lIllllIlll[0]] = lIllllIlll[23];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllIlll[1];
                                0;
                                if (-3 <= 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllIlll[0];
        return n2 != 0;
    }

    private static String lIlIIIIIIIlll(String var3, String var15) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllllIlll[29]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIllllIlll[2], var20);
            return new String(var17.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
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
                                                    if (!m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) break block19;
                                                    int[] nArray = new int[lIllllIlll[1]];
                                                    nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllIlll[1]];
                                                    nArray2[m.lIllllIlll[0]] = lIllllIlll[11];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllIlll[1]];
                                                    nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllIlll[1]];
                                                    nArray4[m.lIllllIlll[0]] = lIllllIlll[12];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllIlll[1]];
                                                    nArray5[m.lIllllIlll[0]] = lIllllIlll[18];
                                                    if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllIlll[1]];
                                                    nArray6[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllIlll[1]];
                                                    nArray7[m.lIllllIlll[0]] = lIllllIlll[44];
                                                    if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllIlll[1];
                                                0;
                                                if (((0x11 ^ 0x42 ^ (0xC ^ 0x6A)) & (122 + 53 - 125 + 94 ^ 63 + 148 - 200 + 154 ^ -1)) == 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIllllIlll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) || !m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) break block22;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllIlll[1]];
                                        nArray8[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllIlll[1]];
                                        nArray9[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllIlll[1]];
                                        nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (!m.lIlIIIIIIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllIlll[1]];
                                        nArray11[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllIlll[1]];
                                        nArray12[m.lIllllIlll[0]] = lIllllIlll[44];
                                        if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllIlll[1];
                                    0;
                                    if (3 == 3) return n4 != 0;
                                    return ((77 + 129 - 120 + 58 ^ 69 + 136 - 95 + 69) & (0xC2 ^ 0x95 ^ (0xEB ^ 0x9F) ^ -1)) != 0;
                                }
                                n4 = lIllllIlll[0];
                                return n4 != 0;
                            }
                            if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIlllI(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllIlll[1]];
                        nArray[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllIlll[1]];
                            nArray14[m.lIllllIlll[0]] = lIllllIlll[35];
                            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllIlll[1];
                                0;
                                if (2 > 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIllllIlll[0];
                    return n3 != 0;
                }
                if (!m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) || !m.lIlIIIIIIllII(ci ? 1 : 0)) return lIllllIlll[0];
                int[] nArray = new int[lIllllIlll[1]];
                nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllIlll[1]];
                nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                if (!m.lIlIIIIIIllII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[14];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllIlll[1]];
                nArray16[m.lIllllIlll[0]] = lIllllIlll[21];
                if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[21];
                    if (m.lIlIIIIIlIIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIllllIlll[17])) {
                        int[] nArray18 = new int[lIllllIlll[1]];
                        nArray18[m.lIllllIlll[0]] = lIllllIlll[22];
                        if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllIlll[1]];
                            nArray19[m.lIllllIlll[0]] = lIllllIlll[35];
                            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllIlll[1];
                                0;
                                if (2 >= 0) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllIlll[0];
        return n2 != 0;
    }

    private static boolean lIlIIIIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            m.ak();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 != 3) {
            return (0xFB ^ 0x98) & ~(0x19 ^ 0x7A);
        }
        return lIllllIlll[67];
    }

    @Override
    public String ag() {
        return lIllllIllI[lIllllIlll[72]];
    }

    private static boolean lIlIIIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static int lIlIIIIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIlIIIIIIlIIl(String var21, String var14) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var13 = var14.toCharArray();
        int var2 = lIllllIlll[0];
        char[] var24 = var21.toCharArray();
        int var22 = var24.length;
        int var16 = lIllllIlll[0];
        while (m.lIlIIIIIIllIl(var16, var22)) {
            char var11 = var24[var16];
            var10.append((char)(var11 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var16;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lIlIIIIIIllll(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return lIllllIlll[0];
    }

    public static void ak() {
        if (m.lIlIIIIIIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[0]];
            b.a(bv);
            if (m.lIlIIIIIIllIl(bv.size(), lIllllIlll[1])) {
                System.out.println(lIllllIllI[lIllllIlll[1]]);
                bt = lIllllIlll[0];
            }
        }
        if (m.lIlIIIIIIlllI(bt ? 1 : 0)) {
            BankLocation var12;
            if (m.lIlIIIIIIlllI(m.an() ? 1 : 0)) {
                var12 = BankLocation.getNearest();
                if (m.lIlIIIIIIllll(var12) && m.lIlIIIIIIlllI(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[2]];
                    a.a(var12);
                }
                if (m.lIlIIIIIIllll(var12) && m.lIlIIIIIIllII(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[3]];
                    if (m.lIlIIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllIlll[4]);
                        0;
                    }
                    if (m.lIlIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (m.lIlIIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllIlll[5]);
                            0;
                        }
                        while (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6]) && m.lIlIIIIIIlllI(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks((int)lIllllIlll[1]);
                            0;
                            0;
                            if (((0x1B ^ 7) & ~(0xA3 ^ 0xBF)) == 0) continue;
                            return;
                        }
                        if (m.lIlIIIIIIlllI(m.ao() ? 1 : 0)) {
                            m.Q();
                            System.out.println(lIllllIllI[lIllllIlll[5]]);
                            bt = lIllllIlll[1];
                            return;
                        }
                        if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllllIlll[1]];
                                nArray2[m.lIllllIlll[0]] = lIllllIlll[7];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray2), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[7], (int)lIllllIlll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[7];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            if (-(0x8D ^ 0x9B ^ (0xA0 ^ 0xB2)) >= 0) {
                                                return ((0x35 ^ 0x58 ^ (0x37 ^ 0x1D)) & (45 + 76 - 85 + 162 ^ 21 + 76 - 70 + 102 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIllllIlll[1]];
                            nArray3[m.lIllllIlll[0]] = lIllllIlll[9];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIllllIlll[1]];
                                nArray4[m.lIllllIlll[0]] = lIllllIlll[9];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray4), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[9], (int)lIllllIlll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[9];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            if (((0x65 ^ 0x7C) & ~(0x69 ^ 0x70)) > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIllllIlll[1]];
                            nArray5[m.lIllllIlll[0]] = lIllllIlll[11];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIllllIlll[1]];
                                nArray6[m.lIllllIlll[0]] = lIllllIlll[11];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray6), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[11], (int)lIllllIlll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[11];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            if (3 < ((0xC ^ 0x51) & ~(0xE9 ^ 0xB4))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIllllIlll[1]];
                            nArray7[m.lIllllIlll[0]] = lIllllIlll[12];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIllllIlll[1]];
                                nArray8[m.lIllllIlll[0]] = lIllllIlll[12];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray8), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[12], (int)lIllllIlll[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[12];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            if (3 >= (0xA5 ^ 0xA1)) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIllllIlll[1]];
                            nArray9[m.lIllllIlll[0]] = lIllllIlll[14];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIllllIlll[1]];
                                nArray10[m.lIllllIlll[0]] = lIllllIlll[14];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray10), lIllllIlll[1])) {
                                    Bank.withdraw((int)lIllllIlll[14], (int)lIllllIlll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[14];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            if ((0xA5 ^ 0xA1) == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIllllIlll[1]];
                            nArray11[m.lIllllIlll[0]] = lIllllIlll[15];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIllllIlll[1]];
                                nArray12[m.lIllllIlll[0]] = lIllllIlll[15];
                                if (m.lIlIIIIIIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIllllIlll[15], (int)lIllllIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIllllIlll[16], (int)lIllllIlll[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIllllIlll[1]];
                            nArray13[m.lIllllIlll[0]] = lIllllIlll[18];
                            if (m.lIlIIIIIIllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIllllIlll[1]];
                                nArray14[m.lIllllIlll[0]] = lIllllIlll[18];
                                if (m.lIlIIIIIIllIl(Inventory.getCount((int[])nArray14), lIllllIlll[1]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) {
                                    Bank.withdrawAll((int)lIllllIlll[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllIlll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllIlll[1]];
                                        nArray[m.lIllllIlll[0]] = lIllllIlll[18];
                                        if (m.lIlIIIIIlIIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllIlll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIllllIlll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllIlll[4]);
                                    0;
                                }
                            }
                        }
                        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                            int[] nArray = new int[lIllllIlll[1]];
                            nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                            if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIllllIlll[20], (int)lIllllIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);
                                0;
                            }
                            if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                                Bank.withdrawAll((int)lIllllIlll[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);
                                0;
                                Bank.withdrawAll((int)lIllllIlll[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllIlll[1]);
                                0;
                            }
                            Bank.withdrawAll((int)lIllllIlll[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIllllIlll[1]);
                            0;
                            Bank.withdrawAll((int)lIllllIlll[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIllllIlll[1]);
                            0;
                        }
                    }
                }
            }
            if (m.lIlIIIIIIllII(m.an() ? 1 : 0)) {
                if (m.lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19])) {
                    if (m.lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[17]];
                        Movement.walkTo((WorldPoint)ck);
                        0;
                        Time.sleepTicks((int)lIllllIlll[1]);
                        0;
                    }
                    if (m.lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[24]];
                        m.am();
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[19]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[25])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[26]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);
                        0;
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[25]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[28])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[29]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);
                        0;
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[28]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[30])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[31]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);
                        0;
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[30]) && m.lIlIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[32]];
                    if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIllllIlll[1]);
                        0;
                    }
                }
                if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[6])) {
                    int var8;
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[33]];
                    int[] nArray = new int[lIllllIlll[1]];
                    nArray[m.lIllllIlll[0]] = lIllllIlll[20];
                    if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIllllIlll[1]];
                        nArray15[m.lIllllIlll[0]] = lIllllIlll[20];
                        if (m.lIlIIIIIIlllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIllllIlll[1]];
                            nArray16[m.lIllllIlll[0]] = lIllllIlll[20];
                            Inventory.getFirst((int[])nArray16).interact(lIllllIllI[lIllllIlll[34]]);
                            Time.sleepTicks((int)lIllllIlll[1]);
                            0;
                        }
                    }
                    if (m.lIlIIIIIIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIllllIlll[1]];
                    nArray17[m.lIllllIlll[0]] = lIllllIlll[22];
                    var12 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIllllIlll[1]];
                    nArray18[m.lIllllIlll[0]] = lIllllIlll[35];
                    Item var5 = Inventory.getFirst((int[])nArray18);
                    if (m.lIlIIIIIIlllI(ci ? 1 : 0)) {
                        if (m.lIlIIIIIIlllI(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIllI[lIllllIlll[36]];
                            Movement.walkTo((WorldPoint)cl);
                            0;
                            Time.sleepTicks((int)lIllllIlll[1]);
                            0;
                        }
                        if (m.lIlIIIIIIllII(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0) && m.lIlIIIIIIllll(var12) && m.lIlIIIIIIllll(var5)) {
                            var8 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var5);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIlIIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), var8)) {
                                    bl = lIllllIlll[1];
                                    0;
                                    if ((8 + 125 - 128 + 173 ^ 172 + 52 - 96 + 54) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIllllIlll[0];
                                }
                                return bl;
                            }, (int)lIllllIlll[8]);
                            0;
                            Time.sleep((long)e.c(lIllllIlll[37], lIllllIlll[38]));
                            0;
                        }
                    }
                    if (m.lIlIIIIIIllII(ci ? 1 : 0)) {
                        if (m.lIlIIIIIIllll(var12) && m.lIlIIIIIIllll(var5) && m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                            var8 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var5);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIlIIIIIlIlll(Skills.getExperience((Skill)Skill.MAGIC), var8)) {
                                    bl = lIllllIlll[1];
                                    0;
                                    if (-1 >= ((141 + 121 - 217 + 101 ^ 54 + 169 - 104 + 67) & (0xAA ^ 0xC4 ^ (0xCA ^ 0x8C) ^ -1))) {
                                        return ((2 ^ (0x1A ^ 0)) & (138 + 173 - 233 + 110 ^ 69 + 108 - 168 + 155 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllllIlll[0];
                                }
                                return bl;
                            }, (int)lIllllIlll[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (m.lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                                bl = lIllllIlll[1];
                                0;
                                if (-1 > 0) {
                                    return false;
                                }
                            } else {
                                bl = lIllllIlll[0];
                            }
                            return bl;
                        }, (int)lIllllIlll[39]);
                        0;
                    }
                }
            }
        }
    }

    private static boolean lIlIIIIIlIlIl(Object object) {
        return object == null;
    }

    public static void al() {
        if (m.lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (m.lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[40]];
            Movement.walkTo((WorldPoint)ck);
            0;
            Time.sleepTicks((int)lIllllIlll[1]);
            0;
        }
        if (m.lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            m.am();
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (m.lIlIIIIIlIIIl(Skills.getLevel((Skill)Skill.MAGIC), lIllllIlll[73])) {
            bl = lIllllIlll[1];
            0;
            if (-(0x73 ^ 0x42 ^ (0xA4 ^ 0x91)) >= 0) {
                return ((0x1F ^ 0x14 ^ (0x26 ^ 0x6D)) & (0x3E ^ 0x49 ^ (0x83 ^ 0xB4) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIlll[0];
        }
        return bl;
    }

    static {
        m.lIlIIIIIIlIll();
        m.lIlIIIIIIlIlI();
        bv = new ArrayList<d>();
        cj = new WorldArea(lIllllIlll[76], lIllllIlll[77], lIllllIlll[47], lIllllIlll[40], lIllllIlll[0]);
        ck = new WorldPoint(lIllllIlll[78], lIllllIlll[79], lIllllIlll[0]);
        cl = new WorldPoint(lIllllIlll[80] + e.c(lIllllIlll[1], lIllllIlll[5]), lIllllIlll[81], lIllllIlll[0]);
    }

    private static void lIlIIIIIIlIll() {
        lIllllIlll = new int[82];
        m.lIllllIlll[0] = (152 + 141 - 141 + 27 ^ 71 + 110 - 157 + 149) & (0x4A ^ 0x5B ^ (0xBE ^ 0xB1) ^ -1);
        m.lIllllIlll[1] = 1;
        m.lIllllIlll[2] = 2;
        m.lIllllIlll[3] = 3;
        m.lIllllIlll[4] = 0xFFFF93FD & 0x7F8A;
        m.lIllllIlll[5] = 0x25 ^ 0x21;
        m.lIllllIlll[6] = 130 + 38 - 103 + 103 ^ 76 + 140 - 113 + 56;
        m.lIllllIlll[7] = -(0xFFFFBB71 & 0x749F) & (0xFFFFF67E & 0x3BBF);
        m.lIllllIlll[8] = 0xFFFFC7FF & 0x3DDC;
        m.lIllllIlll[9] = -(0xFFFFDD51 & 0x2FFF) & (0xFFFF8FFF & 0x7F7B);
        m.lIllllIlll[10] = 0xFFFFDBDC & 0x2DE7;
        m.lIllllIlll[11] = 0xFFFF962F & 0x6BFD;
        m.lIllllIlll[12] = 0xFFFFAA3F & 0x57EA;
        m.lIllllIlll[13] = -(0xFFFFAE7C & 0x55EF) & (0xFFFFDDFF & 0x37FF);
        m.lIllllIlll[14] = 0xFFFFB2FF & 0x4F33;
        m.lIllllIlll[15] = 0xFFFFFDD7 & 0x3379;
        m.lIllllIlll[16] = 0xFFFFBFDF & 0x5F69;
        m.lIllllIlll[17] = 0x39 ^ 0x3C;
        m.lIllllIlll[18] = 0xFFFF937B & 0x6DFF;
        m.lIllllIlll[19] = (0x32 ^ 0x34) & ~(0x54 ^ 0x52) ^ (0x6B ^ 0x72);
        m.lIllllIlll[20] = -(0xFFFF955D & 0x7AB7) & (0xFFFFFD7F & 0x17FF);
        m.lIllllIlll[21] = 0xFFFFC22C & 0x3FFF;
        m.lIllllIlll[22] = 0xFFFFB373 & 0x4EBD;
        m.lIllllIlll[23] = 0x2A ^ 0x7E ^ (0xF7 ^ 0x9D);
        m.lIllllIlll[24] = 0xDD ^ 0x93 ^ (0x52 ^ 0x1A);
        m.lIllllIlll[25] = 0x92 ^ 0x8D;
        m.lIllllIlll[26] = 0x46 ^ 0x5C ^ (0x21 ^ 0x3C);
        m.lIllllIlll[27] = -1;
        m.lIllllIlll[28] = 0x88 ^ 0xAD;
        m.lIllllIlll[29] = 0x87 ^ 0x8F;
        m.lIllllIlll[30] = 166 + 116 - 48 + 1 ^ 15 + 44 - -138 + 1;
        m.lIllllIlll[31] = 0xCB ^ 0xC2;
        m.lIllllIlll[32] = 0x21 ^ 0x2B;
        m.lIllllIlll[33] = 0xBA ^ 0xB1;
        m.lIllllIlll[34] = 0xA ^ 0x5E ^ (0x46 ^ 0x1E);
        m.lIllllIlll[35] = 0xA4 ^ 0x9B;
        m.lIllllIlll[36] = 0xA8 ^ 0xA5;
        m.lIllllIlll[37] = 0xFFFFC351 & 0x3DEE;
        m.lIllllIlll[38] = 0xFFFFA7DB & 0x5A36;
        m.lIllllIlll[39] = -(0xFFFFD6B7 & 0x7B4C) & (0xFFFFDFBF & 0x7FEF);
        m.lIllllIlll[40] = 5 ^ 0xB;
        m.lIllllIlll[41] = 0x7B ^ 0x74;
        m.lIllllIlll[42] = 0x68 ^ 0x78;
        m.lIllllIlll[43] = 0xD7 ^ 0xC6;
        m.lIllllIlll[44] = -(0xFFFFFCDD & 0x3BBB) & (0xFFFFFFFD & 0x3DFF);
        m.lIllllIlll[45] = 0x9D ^ 0x8F;
        m.lIllllIlll[46] = 0x15 ^ 6;
        m.lIllllIlll[47] = 0x4F ^ 0x5B;
        m.lIllllIlll[48] = -(0xFFFFB2AE & 0x6FFB) & (0xFFFFA3BD & Short.MAX_VALUE);
        m.lIllllIlll[49] = -(0xFFFFFC99 & 0x2FE7) & (0xFFFFFEDF & 0x2FF1);
        m.lIllllIlll[50] = 0x28 ^ 0x1E ^ (0x3F ^ 0x13);
        m.lIllllIlll[51] = 0x50 ^ 0x45;
        m.lIllllIlll[52] = 79 + 135 - 171 + 137 ^ 121 + 71 - 54 + 24;
        m.lIllllIlll[53] = 80 + 34 - -64 + 23;
        m.lIllllIlll[54] = 0x7E ^ 0x69;
        m.lIllllIlll[55] = 0x30 ^ 0x7D ^ (0x96 ^ 0xC3);
        m.lIllllIlll[56] = 0xB1 ^ 0xAA;
        m.lIllllIlll[57] = -(0xFFFFE9D3 & 0x362D) & (0xFFFFB7EF & 0x6BF8);
        m.lIllllIlll[58] = 30 + 150 - 168 + 158;
        m.lIllllIlll[59] = -(0xFFFFF0EE & 0x7F5B) & (0xFFFFFFF9 & 0x7FEF);
        m.lIllllIlll[60] = -(0xFFFFFE76 & 0x79AD) & (0xFFFFFFF7 & 0x7FFB);
        m.lIllllIlll[61] = -(0xFFFFF5EF & 0x4A17) & (0xFFFFDBFF & 0x6FBE);
        m.lIllllIlll[62] = -(0xFFFFFFBF & 0x769) & (0xFFFFB7FC & Short.MAX_VALUE);
        m.lIllllIlll[63] = -(0xFFFFF5CB & 0xB75) & (0xFFFFBFFC & 0x7DCF);
        m.lIllllIlll[64] = 0x11 ^ 0x5A ^ (0xAF ^ 0x9C);
        m.lIllllIlll[65] = 79 + 121 - 172 + 122;
        m.lIllllIlll[66] = 0xFFFFBFFF & 0x7A98;
        m.lIllllIlll[67] = 0x1C ^ 0xC ^ (6 ^ 0x72);
        m.lIllllIlll[68] = -(0xFFFFF19F & 0xF74) & (0xFFFFAFFF & 0x7FDF);
        m.lIllllIlll[69] = -(0xFFFFDE11 & 0x3FFF) & (0xFFFFFFFF & 0x7FB8);
        m.lIllllIlll[70] = -(0xFFFFEF6F & 0x30B9) & (0xFFFFBF7F & 0x7FEF);
        m.lIllllIlll[71] = -2 & (0xFFFF8FA5 & 0x73DF);
        m.lIllllIlll[72] = 0xFA ^ 0x94 ^ (0x4E ^ 0x3C);
        m.lIllllIlll[73] = 0x87 ^ 0x8A ^ (0x38 ^ 0x56);
        m.lIllllIlll[74] = 0x65 ^ 0x78;
        m.lIllllIlll[75] = 126 + 164 - 115 + 47 ^ 107 + 160 - 81 + 6;
        m.lIllllIlll[76] = -(0xFFFFDEFB & 0x7535) & (0xFFFFFFFF & 0x5FFE);
        m.lIllllIlll[77] = 0xFFFFAFFB & 0x5CE7;
        m.lIllllIlll[78] = 0xFFFF9BF7 & 0x6FDF;
        m.lIllllIlll[79] = -(0xFFFFF311 & 0x7CEF) & (0xFFFFFFFF & 0x7CE9);
        m.lIllllIlll[80] = 0xFFFF8F7B & 0x7CDE;
        m.lIllllIlll[81] = 0xFFFFFFFF & 0xD9F;
    }

    private static void am() {
        if (m.lIlIIIIIlIlII(m.lIlIIIIIlIIll(e.w(), 30.0))) {
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[18];
            if (m.lIlIIIIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllllIlll[1]];
                nArray2[m.lIllllIlll[0]] = lIllllIlll[18];
                Inventory.getFirst((int[])nArray2).interact(lIllllIllI[lIllllIlll[41]]);
                Time.sleepTicks((int)lIllllIlll[1]);
                0;
            }
        }
        if (m.lIlIIIIIlIlIl(Players.getLocal().getInteracting())) {
            NPC var25 = NPCs.getNearest(nPC -> {
                int n2;
                if (m.lIlIIIIIIllII(nPC.getName().contains(lIllllIllI[lIllllIlll[75]]) ? 1 : 0) && m.lIlIIIIIIlllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIllllIlll[1];
                    0;
                    if (((0x26 ^ 0x5D ^ (0x22 ^ 0x1D)) & (0x17 ^ 0xE ^ (0x27 ^ 0x7A) ^ -1)) >= 1) {
                        return false;
                    }
                } else {
                    n2 = lIllllIlll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIllllIlll[2]];
            stringArray[m.lIllllIlll[0]] = lIllllIllI[lIllllIlll[42]];
            stringArray[m.lIllllIlll[1]] = lIllllIllI[lIllllIlll[43]];
            List llllllllllllllllllIlllIIlIllllll = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (m.lIlIIIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIllllIlll[1];
                    0;
                    if (((0xA9 ^ 0xA3 ^ (0xD0 ^ 0x9A)) & (0x36 ^ 0x59 ^ (0x89 ^ 0xA6) ^ -1)) != 0) {
                        return ((0x3C ^ 0x7E ^ (0x2D ^ 0x27)) & (0x45 ^ 0x5C ^ (0x11 ^ 0x40) ^ -1)) != 0;
                    }
                } else {
                    bl = lIllllIlll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIllllIlll[1]];
            nArray[m.lIllllIlll[0]] = lIllllIlll[44];
            if (m.lIlIIIIIIllII(Equipment.contains((int[])nArray) ? 1 : 0) && m.lIlIIIIIIlllI(m.ap() ? 1 : 0)) {
                m.aq();
            }
            if (m.lIlIIIIIIllll(var25) && m.lIlIIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderSotf.c = lIllllIllI[lIllllIlll[45]];
                var25.interact(lIllllIllI[lIllllIlll[46]]);
                Time.sleepTicks((int)lIllllIlll[3]);
                0;
            }
        }
        if (m.lIlIIIIIIllll(Players.getLocal().getInteracting())) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[47]];
            Time.sleepTicks((int)lIllllIlll[1]);
            0;
        }
    }
}

