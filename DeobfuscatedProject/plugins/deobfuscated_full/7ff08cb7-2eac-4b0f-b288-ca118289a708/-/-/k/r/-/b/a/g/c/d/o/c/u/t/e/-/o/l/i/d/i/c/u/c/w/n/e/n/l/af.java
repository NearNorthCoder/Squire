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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
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

public class af
implements ab {
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] llIIlllII;
    private static /* synthetic */ int[] llIIlllIl;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean ck;

    private static void Q() {
        d lIlIIIIIIllIII;
        Object lIlIIIIIIllIIl;
        if (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[16];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llIIlllIl[16], llIIlllIl[57], llIIlllIl[58]);
                bx.add(d2);
                0;
            }
            int[] nArray2 = new int[llIIlllIl[1]];
            nArray2[af.llIIlllIl[0]] = llIIlllIl[9];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[9], llIIlllIl[59], llIIlllIl[6]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray3 = new int[llIIlllIl[1]];
            nArray3[af.llIIlllIl[0]] = llIIlllIl[11];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[11], llIIlllIl[60], llIIlllIl[6]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray4 = new int[llIIlllIl[1]];
            nArray4[af.llIIlllIl[0]] = llIIlllIl[13];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[13], llIIlllIl[61], llIIlllIl[6]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray5 = new int[llIIlllIl[1]];
            nArray5[af.llIIlllIl[0]] = llIIlllIl[14];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[14], llIIlllIl[5], llIIlllIl[6]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray6 = new int[llIIlllIl[1]];
            nArray6[af.llIIlllIl[0]] = llIIlllIl[46];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[46], llIIlllIl[1], e.c(llIIlllIl[62], llIIlllIl[63]));
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
        }
        if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[24];
            if (af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llIIlllIl[1]];
                nArray7[af.llIIlllIl[0]] = llIIlllIl[24];
                if (af.lIlIlllIIIIl(Bank.getFirst((int[])nArray7).getQuantity(), llIIlllIl[61])) {
                    int[] nArray8 = new int[llIIlllIl[1]];
                    nArray8[af.llIIlllIl[0]] = llIIlllIl[24];
                    lIlIIIIIIllIIl = new d(llIIlllIl[24], llIIlllIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), llIIlllIl[64]);
                    bx.add((d)lIlIIIIIIllIIl);
                    0;
                }
            }
            int[] nArray9 = new int[llIIlllIl[1]];
            nArray9[af.llIIlllIl[0]] = llIIlllIl[24];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[24], llIIlllIl[61], llIIlllIl[64]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray10 = new int[llIIlllIl[1]];
            nArray10[af.llIIlllIl[0]] = llIIlllIl[25];
            if (af.lIlIlllIIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llIIlllIl[1]];
                nArray11[af.llIIlllIl[0]] = llIIlllIl[25];
                if (af.lIlIlllIIIIl(Bank.getFirst((int[])nArray11).getQuantity(), llIIlllIl[61])) {
                    int[] nArray12 = new int[llIIlllIl[1]];
                    nArray12[af.llIIlllIl[0]] = llIIlllIl[25];
                    lIlIIIIIIllIIl = new d(llIIlllIl[25], llIIlllIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), llIIlllIl[65]);
                    bx.add((d)lIlIIIIIIllIIl);
                    0;
                }
            }
            int[] nArray13 = new int[llIIlllIl[1]];
            nArray13[af.llIIlllIl[0]] = llIIlllIl[25];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIlIIIIIIllIIl = new d(llIIlllIl[25], llIIlllIl[61], llIIlllIl[65]);
                bx.add((d)lIlIIIIIIllIIl);
                0;
            }
            int[] nArray14 = new int[llIIlllIl[1]];
            nArray14[af.llIIlllIl[0]] = llIIlllIl[22];
            if (af.lIlIlllIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIIlllIl[1]];
                nArray15[af.llIIlllIl[0]] = llIIlllIl[22];
                if (af.lIlIlllIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIlIIIIIIllIIl = new d(llIIlllIl[22], llIIlllIl[1], llIIlllIl[66]);
                    bx.add((d)lIlIIIIIIllIIl);
                    0;
                }
            }
            if (af.lIlIlllIIIII(ck ? 1 : 0)) {
                int[] nArray16 = new int[llIIlllIl[1]];
                nArray16[af.llIIlllIl[0]] = llIIlllIl[16];
                if (af.lIlIlllIIIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIIlllIl[1]];
                    nArray17[af.llIIlllIl[0]] = llIIlllIl[16];
                    if (af.lIlIlllIIIIl(Bank.getFirst((int[])nArray17).getQuantity(), llIIlllIl[61])) {
                        int[] nArray18 = new int[llIIlllIl[1]];
                        nArray18[af.llIIlllIl[0]] = llIIlllIl[16];
                        lIlIIIIIIllIIl = new d(llIIlllIl[16], llIIlllIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), llIIlllIl[58]);
                        bx.add((d)lIlIIIIIIllIIl);
                        0;
                    }
                }
                int[] nArray19 = new int[llIIlllIl[1]];
                nArray19[af.llIIlllIl[0]] = llIIlllIl[16];
                if (af.lIlIlllIIIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIlIIIIIIllIIl = new d(llIIlllIl[16], llIIlllIl[61], llIIlllIl[58]);
                    bx.add((d)lIlIIIIIIllIIl);
                    0;
                }
                int[] nArray20 = new int[llIIlllIl[1]];
                nArray20[af.llIIlllIl[0]] = llIIlllIl[23];
                if (af.lIlIlllIIIII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llIIlllIl[1]];
                    nArray21[af.llIIlllIl[0]] = llIIlllIl[23];
                    if (af.lIlIlllIIIIl(Bank.getFirst((int[])nArray21).getQuantity(), llIIlllIl[66])) {
                        int[] nArray22 = new int[llIIlllIl[1]];
                        nArray22[af.llIIlllIl[0]] = llIIlllIl[23];
                        lIlIIIIIIllIIl = new d(llIIlllIl[23], llIIlllIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), llIIlllIl[6]);
                        bx.add((d)lIlIIIIIIllIIl);
                        0;
                    }
                }
                int[] nArray23 = new int[llIIlllIl[1]];
                nArray23[af.llIIlllIl[0]] = llIIlllIl[23];
                if (af.lIlIlllIIIlI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIlIIIIIIllIIl = new d(llIIlllIl[23], llIIlllIl[66], llIIlllIl[6]);
                    bx.add((d)lIlIIIIIIllIIl);
                    0;
                }
            }
        }
        int[] nArray = new int[llIIlllIl[1]];
        nArray[af.llIIlllIl[0]] = llIIlllIl[20];
        if (af.lIlIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIIIIIIllIIl = new d(llIIlllIl[20], llIIlllIl[67], llIIlllIl[68]);
            bx.add((d)lIlIIIIIIllIIl);
            0;
        }
        if (af.lIlIlllIIIlI(Bank.contains(lIlIIIIIIllIIl = item -> item.getName().toLowerCase().contains(llIIlllII[llIIlllIl[74]])) ? 1 : 0)) {
            lIlIIIIIIllIII = new d(llIIlllIl[69], llIIlllIl[19], llIIlllIl[70]);
            bx.add(lIlIIIIIIllIII);
            0;
        }
        int[] nArray24 = new int[llIIlllIl[1]];
        nArray24[af.llIIlllIl[0]] = llIIlllIl[71];
        if (af.lIlIlllIIIlI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIlIIIIIIllIII = new d(llIIlllIl[71], llIIlllIl[33], llIIlllIl[72]);
            bx.add(lIlIIIIIIllIII);
            0;
        }
        int[] nArray25 = new int[llIIlllIl[1]];
        nArray25[af.llIIlllIl[0]] = llIIlllIl[18];
        if (af.lIlIlllIIIlI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIlIIIIIIllIII = new d(llIIlllIl[18], llIIlllIl[33], llIIlllIl[72]);
            bx.add(lIlIIIIIIllIII);
            0;
        }
    }

    private static boolean lIlIlllIIIII(int n2) {
        return n2 != 0;
    }

    public static void aq() {
        if (af.lIlIlllIIIll(Widgets.get((int)llIIlllIl[49], (int)llIIlllIl[50]))) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[51]];
            Widgets.get((int)llIIlllIl[49], (int)llIIlllIl[50]).interact(llIIlllII[llIIlllIl[52]]);
            Time.sleepTicks((int)llIIlllIl[7]);
            0;
        }
        if (af.lIlIlllIIlll(Widgets.get((int)llIIlllIl[49], (int)llIIlllIl[50])) && af.lIlIlllIIIlI(Widgets.get((int)llIIlllIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llIIlllIl[1]);
            0;
            if (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[19])) {
                Widgets.get((int)llIIlllIl[53], (int)llIIlllIl[1]).getChild(llIIlllIl[1]).interact(llIIlllII[llIIlllIl[54]]);
            }
            if (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32]) && af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[19])) {
                Widgets.get((int)llIIlllIl[53], (int)llIIlllIl[1]).getChild(llIIlllIl[3]).interact(llIIlllII[llIIlllIl[55]]);
            }
            if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[39])) {
                Widgets.get((int)llIIlllIl[53], (int)llIIlllIl[1]).getChild(llIIlllIl[4]).interact(llIIlllII[llIIlllIl[56]]);
            }
            if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32])) {
                int[] nArray = new int[llIIlllIl[1]];
                nArray[af.llIIlllIl[0]] = llIIlllIl[14];
                if (af.lIlIlllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIIlllIl[53], (int)llIIlllIl[1]).getChild(llIIlllIl[4]).interact(llIIlllII[llIIlllIl[21]]);
                }
            }
            if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[39])) {
                int[] nArray = new int[llIIlllIl[1]];
                nArray[af.llIIlllIl[0]] = llIIlllIl[14];
                if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llIIlllIl[53], (int)llIIlllIl[1]).getChild(llIIlllIl[7]).interact(llIIlllII[llIIlllIl[50]]);
                }
            }
            Time.sleepTicks((int)llIIlllIl[1]);
            0;
        }
    }

    private static boolean lIlIlllIIlII(int n2) {
        return n2 > 0;
    }

    private static String lIlIllIlllII(String lIIlllllllIlll, String lIIlllllllIllI) {
        try {
            SecretKeySpec lIIlllllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllllllIllI.getBytes(StandardCharsets.UTF_8)), llIIlllIl[30]), "DES");
            Cipher lIIllllllllIll = Cipher.getInstance("DES");
            lIIllllllllIll.init(llIIlllIl[3], lIIlllllllllII);
            return new String(lIIllllllllIll.doFinal(Base64.getDecoder().decode(lIIlllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllllllIlI) {
            lIIllllllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIlllIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIllIlllIl(String lIlIIIIIIIIllI, String lIlIIIIIIIIIll) {
        try {
            SecretKeySpec lIlIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIIIIlIII = Cipher.getInstance("Blowfish");
            lIlIIIIIIIlIII.init(llIIlllIl[3], lIlIIIIIIIlIIl);
            return new String(lIlIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lIlIIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIIIIlll) {
            lIlIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIlIIl(int n2) {
        return n2 < 0;
    }

    private static void am() {
        if (af.lIlIlllIlIIl(af.lIlIlllIlIII(e.w(), 30.0))) {
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[20];
            if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlllIl[1]];
                nArray2[af.llIIlllIl[0]] = llIIlllIl[20];
                Inventory.getFirst((int[])nArray2).interact(llIIlllII[llIIlllIl[43]]);
                Time.sleepTicks((int)llIIlllIl[1]);
                0;
            }
        }
        if (af.lIlIlllIIlll(Players.getLocal().getInteracting())) {
            NPC lIlIIIIIIlllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (af.lIlIlllIIIII(nPC.getName().contains(llIIlllII[llIIlllIl[75]]) ? 1 : 0) && af.lIlIlllIIIlI(nPC.isDead() ? 1 : 0)) {
                    n2 = llIIlllIl[1];
                    0;
                    if (((0x6E ^ 0x17 ^ (0x7F ^ 0x3B)) & (2 ^ 0x17 ^ (0xE9 ^ 0xC1) ^ -1)) != 0) {
                        return (((0x77 ^ 0x34) & ~(0x48 ^ 0xB) ^ (0x52 ^ 0x42)) & (0xCB ^ 0xBC ^ (0x77 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llIIlllIl[3]];
            stringArray[af.llIIlllIl[0]] = llIIlllII[llIIlllIl[44]];
            stringArray[af.llIIlllIl[1]] = llIIlllII[llIIlllIl[45]];
            List lIlIIIIIIlllII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (af.lIlIlllIlIlI(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIIlllIl[1];
                    0;
                    if (2 == 0) {
                        return false;
                    }
                } else {
                    bl = llIIlllIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[46];
            if (af.lIlIlllIIIII(Equipment.contains((int[])nArray) ? 1 : 0) && af.lIlIlllIIIlI(af.ap() ? 1 : 0)) {
                af.aq();
            }
            if (af.lIlIlllIIIll(lIlIIIIIIlllIl) && af.lIlIlllIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                lIlIIIIIIlllIl.interact(llIIlllII[llIIlllIl[47]]);
                Time.sleepTicks((int)llIIlllIl[4]);
                0;
            }
        }
    }

    public static void al() {
        if (af.lIlIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (af.lIlIlllIIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[41]];
            Movement.walkTo((WorldPoint)cm);
            0;
            Time.sleepTicks((int)llIIlllIl[1]);
            0;
        }
        if (af.lIlIlllIIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[42]];
            af.am();
        }
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
                                                    if (!af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21])) break block19;
                                                    int[] nArray = new int[llIIlllIl[1]];
                                                    nArray[af.llIIlllIl[0]] = llIIlllIl[9];
                                                    if (!af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIIlllIl[1]];
                                                    nArray2[af.llIIlllIl[0]] = llIIlllIl[13];
                                                    if (!af.lIlIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIIlllIl[1]];
                                                    nArray3[af.llIIlllIl[0]] = llIIlllIl[11];
                                                    if (!af.lIlIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIIlllIl[1]];
                                                    nArray4[af.llIIlllIl[0]] = llIIlllIl[14];
                                                    if (!af.lIlIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIIlllIl[1]];
                                                    nArray5[af.llIIlllIl[0]] = llIIlllIl[20];
                                                    if (!af.lIlIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIIlllIl[1]];
                                                    nArray6[af.llIIlllIl[0]] = llIIlllIl[46];
                                                    if (!af.lIlIlllIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIIlllIl[1]];
                                                    nArray7[af.llIIlllIl[0]] = llIIlllIl[46];
                                                    if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIIlllIl[1];
                                                0;
                                                if (((0x20 ^ 8) & ~(0x28 ^ 0)) < (0x7C ^ 0x78)) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21]) || !af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) break block22;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[13];
                                        if (!af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIIlllIl[1]];
                                        nArray8[af.llIIlllIl[0]] = llIIlllIl[11];
                                        if (!af.lIlIlllIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIIlllIl[1]];
                                        nArray9[af.llIIlllIl[0]] = llIIlllIl[14];
                                        if (!af.lIlIlllIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIIlllIl[1]];
                                        nArray10[af.llIIlllIl[0]] = llIIlllIl[16];
                                        if (!af.lIlIlllIIIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIIlllIl[1]];
                                        nArray11[af.llIIlllIl[0]] = llIIlllIl[46];
                                        if (!af.lIlIlllIIIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIIlllIl[1]];
                                        nArray12[af.llIIlllIl[0]] = llIIlllIl[46];
                                        if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIIlllIl[1];
                                    0;
                                    if (3 != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = llIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8]) || !af.lIlIlllIIIlI(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llIIlllIl[1]];
                            nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                            if (!af.lIlIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIIlllIl[1]];
                            nArray13[af.llIIlllIl[0]] = llIIlllIl[22];
                            if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIIlllIl[1]];
                        nArray[af.llIIlllIl[0]] = llIIlllIl[24];
                        if (af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIIlllIl[1]];
                            nArray14[af.llIIlllIl[0]] = llIIlllIl[25];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIIlllIl[1];
                                0;
                                if (-2 <= 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = llIIlllIl[0];
                    return n3 != 0;
                }
                if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8]) || !af.lIlIlllIIIII(ck ? 1 : 0)) return llIIlllIl[0];
                int[] nArray = new int[llIIlllIl[1]];
                nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                if (!af.lIlIlllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIIlllIl[1]];
                nArray15[af.llIIlllIl[0]] = llIIlllIl[22];
                if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[16];
            if (af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIIlllIl[1]];
                nArray16[af.llIIlllIl[0]] = llIIlllIl[23];
                if (af.lIlIlllIIIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIIlllIl[1]];
                    nArray17[af.llIIlllIl[0]] = llIIlllIl[23];
                    if (af.lIlIlllIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), llIIlllIl[19])) {
                        int[] nArray18 = new int[llIIlllIl[1]];
                        nArray18[af.llIIlllIl[0]] = llIIlllIl[24];
                        if (af.lIlIlllIIIII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIIlllIl[1]];
                            nArray19[af.llIIlllIl[0]] = llIIlllIl[25];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIIlllIl[1];
                                0;
                                if (-1 == -1) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIIlllIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlllIIlll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[2])) {
            bl = llIIlllIl[1];
            0;
            if (1 < -1) {
                return ((0x7F ^ 0x6A ^ (0x9E ^ 0xBB)) & (0x17 ^ 0x45 ^ (0xD2 ^ 0xB0) ^ -1)) != 0;
            }
        } else {
            bl = llIIlllIl[0];
        }
        return bl;
    }

    private static boolean lIlIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlllIIIll(Object object) {
        return object != null;
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
                                                    if (!af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21])) break block19;
                                                    int[] nArray = new int[llIIlllIl[1]];
                                                    nArray[af.llIIlllIl[0]] = llIIlllIl[9];
                                                    if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llIIlllIl[1]];
                                                    nArray2[af.llIIlllIl[0]] = llIIlllIl[13];
                                                    if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llIIlllIl[1]];
                                                    nArray3[af.llIIlllIl[0]] = llIIlllIl[11];
                                                    if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llIIlllIl[1]];
                                                    nArray4[af.llIIlllIl[0]] = llIIlllIl[14];
                                                    if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llIIlllIl[1]];
                                                    nArray5[af.llIIlllIl[0]] = llIIlllIl[20];
                                                    if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llIIlllIl[1]];
                                                    nArray6[af.llIIlllIl[0]] = llIIlllIl[46];
                                                    if (!af.lIlIlllIIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llIIlllIl[1]];
                                                    nArray7[af.llIIlllIl[0]] = llIIlllIl[46];
                                                    if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llIIlllIl[1];
                                                0;
                                                if (1 != 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = llIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21]) || !af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) break block22;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[13];
                                        if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llIIlllIl[1]];
                                        nArray8[af.llIIlllIl[0]] = llIIlllIl[11];
                                        if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llIIlllIl[1]];
                                        nArray9[af.llIIlllIl[0]] = llIIlllIl[14];
                                        if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llIIlllIl[1]];
                                        nArray10[af.llIIlllIl[0]] = llIIlllIl[16];
                                        if (!af.lIlIlllIIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llIIlllIl[1]];
                                        nArray11[af.llIIlllIl[0]] = llIIlllIl[46];
                                        if (!af.lIlIlllIIIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llIIlllIl[1]];
                                        nArray12[af.llIIlllIl[0]] = llIIlllIl[46];
                                        if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llIIlllIl[1];
                                    0;
                                    if (2 >= 0) return n4 != 0;
                                    return ((122 + 140 - 236 + 219 ^ 160 + 21 - 132 + 134) & (0x48 ^ 0x1B ^ (7 ^ 0x16) ^ -1)) != 0;
                                }
                                n4 = llIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8]) || !af.lIlIlllIIIlI(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llIIlllIl[1]];
                            nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                            if (!af.lIlIlllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llIIlllIl[1]];
                            nArray13[af.llIIlllIl[0]] = llIIlllIl[22];
                            if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIIlllIl[1]];
                        nArray[af.llIIlllIl[0]] = llIIlllIl[24];
                        if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llIIlllIl[1]];
                            nArray14[af.llIIlllIl[0]] = llIIlllIl[38];
                            if (af.lIlIlllIIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llIIlllIl[1];
                                0;
                                if ((0x5E ^ 0x45 ^ (0x11 ^ 0xE)) > -1) return n3 != 0;
                                return ((0x6B ^ 0x6D ^ (0x2E ^ 0x3A)) & (90 + 128 - 155 + 87 ^ 129 + 87 - 209 + 125 ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = llIIlllIl[0];
                    return n3 != 0;
                }
                if (!af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8]) || !af.lIlIlllIIIII(ck ? 1 : 0)) return llIIlllIl[0];
                int[] nArray = new int[llIIlllIl[1]];
                nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                if (!af.lIlIlllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llIIlllIl[1]];
                nArray15[af.llIIlllIl[0]] = llIIlllIl[22];
                if (!af.lIlIlllIIIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[16];
            if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIIlllIl[1]];
                nArray16[af.llIIlllIl[0]] = llIIlllIl[23];
                if (af.lIlIlllIIIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llIIlllIl[1]];
                    nArray17[af.llIIlllIl[0]] = llIIlllIl[23];
                    if (af.lIlIlllIIlIl(Inventory.getFirst((int[])nArray17).getQuantity(), llIIlllIl[19])) {
                        int[] nArray18 = new int[llIIlllIl[1]];
                        nArray18[af.llIIlllIl[0]] = llIIlllIl[24];
                        if (af.lIlIlllIIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llIIlllIl[1]];
                            nArray19[af.llIIlllIl[0]] = llIIlllIl[38];
                            if (af.lIlIlllIIIII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llIIlllIl[1];
                                0;
                                if (3 > 0) return n2 != 0;
                                return ((0x42 ^ 0x3A ^ (0x2B ^ 0x73)) & (65 + 56 - 110 + 117 ^ 74 + 113 - 119 + 92 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llIIlllIl[0];
        return n2 != 0;
    }

    private static int lIlIlllIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ae() {
        return llIIlllIl[0];
    }

    private static void lIlIllIlllll() {
        llIIlllIl = new int[81];
        af.llIIlllIl[0] = (171 + 21 - 34 + 15 ^ 27 + 44 - -78 + 1) & (93 + 49 - 134 + 169 ^ 18 + 28 - -40 + 52 ^ -1);
        af.llIIlllIl[1] = 1;
        af.llIIlllIl[2] = 5 + 33 - -39 + 59 ^ 184 + 105 - 219 + 116;
        af.llIIlllIl[3] = 2;
        af.llIIlllIl[4] = 3;
        af.llIIlllIl[5] = -(0xFFFFDD9F & 0x6E74) & (0xFFFFFFDB & 0x5FBF);
        af.llIIlllIl[6] = 0x3E ^ 0x38;
        af.llIIlllIl[7] = 66 + 44 - 107 + 144 ^ 150 + 126 - 261 + 136;
        af.llIIlllIl[8] = 0x2A ^ 0 ^ (0x4A ^ 0x57);
        af.llIIlllIl[9] = -(0xFFFFF5EF & 0x7F51) & (0xFFFFFFEF & 0x777E);
        af.llIIlllIl[10] = -(0xFFFFEEF7 & 0x5B0A) & (0xFFFFFFDD & 0x4FFF);
        af.llIIlllIl[11] = -(0xFFFFDAD5 & 0x7D7F) & (0xFFFFFB7F & 0x5EFF);
        af.llIIlllIl[12] = 0xFFFFCDF6 & 0x3BCD;
        af.llIIlllIl[13] = 0xFFFFB76F & 0x4ABD;
        af.llIIlllIl[14] = -(0xFFFFFDE6 & 0x5B9F) & (0xFFFFFFBF & 0x5BEF);
        af.llIIlllIl[15] = 0xFFFFDDD7 & 0x33BC;
        af.llIIlllIl[16] = 0xFFFFD633 & 0x2BFF;
        af.llIIlllIl[17] = -(0xFFFFCA39 & 0x7FE7) & (0xFFFFFFF3 & 0x7B7D);
        af.llIIlllIl[18] = -(0xFFFFE8BF & 0x77F1) & (0xFFFFFFF9 & Short.MAX_VALUE);
        af.llIIlllIl[19] = 0x55 ^ 0x50;
        af.llIIlllIl[20] = -(0xFFFFEA8F & 0x1FF5) & (0xFFFFDBFF & 0x2FFF);
        af.llIIlllIl[21] = 202 + 173 - 166 + 14 ^ 118 + 112 - 79 + 47;
        af.llIIlllIl[22] = 0xFFFFFF7B & 0x5EF;
        af.llIIlllIl[23] = -(0xFFFFDB0F & 0x3DF3) & (0xFFFFBF3E & 0x5BEF);
        af.llIIlllIl[24] = -(0xFFFFF0CB & 0x7FF5) & (0xFFFFFFF5 & 0x72FB);
        af.llIIlllIl[25] = 0x5B ^ 0x10 ^ (0x4D ^ 0x38);
        af.llIIlllIl[26] = 39 + 195 - 33 + 18 ^ 53 + 97 - 58 + 104;
        af.llIIlllIl[27] = 94 + 3 - 25 + 64 ^ 13 + 102 - 109 + 137;
        af.llIIlllIl[28] = -1;
        af.llIIlllIl[29] = 0x85 ^ 0xA0;
        af.llIIlllIl[30] = 0x8C ^ 0x84;
        af.llIIlllIl[31] = 0x6F ^ 0x42;
        af.llIIlllIl[32] = 9 ^ 0x74 ^ (0xB7 ^ 0xC3);
        af.llIIlllIl[33] = 0x79 ^ 0x1A ^ (0x20 ^ 0x49);
        af.llIIlllIl[34] = 75 + 69 - -58 + 1 ^ 158 + 1 - 86 + 119;
        af.llIIlllIl[35] = -(0xFFFFF9E5 & 0x56BF) & (0xFFFFDCFF & 0x7FFE);
        af.llIIlllIl[36] = -(0xFFFFEC61 & 0x73BF) & (0xFFFFEDBF & Short.MAX_VALUE);
        af.llIIlllIl[37] = 0x94 ^ 0xB0 ^ (0x1B ^ 0x33);
        af.llIIlllIl[38] = 0x81 ^ 0xBE;
        af.llIIlllIl[39] = 0xB1 ^ 0xBC;
        af.llIIlllIl[40] = -(0xFFFFD2C1 & 0x7F7F) & (0xFFFFDFEF & 0x7FFC);
        af.llIIlllIl[41] = 37 + 47 - 61 + 117 ^ 5 + 119 - 72 + 78;
        af.llIIlllIl[42] = 0xB ^ 0x77 ^ (0xED ^ 0x9E);
        af.llIIlllIl[43] = 0x8B ^ 0xB6 ^ (0xB1 ^ 0x9C);
        af.llIIlllIl[44] = 0xA ^ 0x1B;
        af.llIIlllIl[45] = 0x12 ^ 0;
        af.llIIlllIl[46] = 0xFFFFCFFF & 0x3565;
        af.llIIlllIl[47] = 2 ^ 0x11;
        af.llIIlllIl[48] = -(0xFFFFFE79 & 0x75C7) & (0xFFFFFFDD & 0x7576);
        af.llIIlllIl[49] = 0xFFFFCA75 & 0x37DB;
        af.llIIlllIl[50] = 0x7E ^ 0x64;
        af.llIIlllIl[51] = 0x36 ^ 0x22;
        af.llIIlllIl[52] = 0x94 ^ 0x81;
        af.llIIlllIl[53] = (0xCD ^ 0xAF) + (0x63 ^ 0x3F) - (0x13 ^ 0x64) + (115 + 114 - 209 + 110);
        af.llIIlllIl[54] = 0x10 ^ 6;
        af.llIIlllIl[55] = 98 + 108 - 148 + 69 ^ (0x14 ^ 0x7C);
        af.llIIlllIl[56] = 0xB0 ^ 0xC6 ^ (0x16 ^ 0x78);
        af.llIIlllIl[57] = -(0xFFFFF3FF & 0x3C17) & (0xFFFFFBFF & 0x37FE);
        af.llIIlllIl[58] = (0x82 ^ 0x84) + (22 + 121 - 47 + 33) - -(0x79 ^ 0x6E) + (0x29 ^ 0x25);
        af.llIIlllIl[59] = -(0x40 ^ 0x1C) & (0xFFFFFFFF & 0xFFB);
        af.llIIlllIl[60] = -(0xFFFFF96F & 0x1E9B) & (0xFFFFFFDB & 0x1FFE);
        af.llIIlllIl[61] = -(0xFFFFB5FB & 0x7E05) & (0xFFFFBFB9 & 0x7FFE);
        af.llIIlllIl[62] = 0xFFFFB8D5 & 0x77FE;
        af.llIIlllIl[63] = -(0xFFFFC3A6 & 0x7F5B) & (0xFFFFFFAF & 0x7FDD);
        af.llIIlllIl[64] = 0xC7 ^ 0xBF;
        af.llIIlllIl[65] = 26 + 0 - -109 + 15;
        af.llIIlllIl[66] = 0xFFFFBED9 & 0x7BBE;
        af.llIIlllIl[67] = 191 + 213 - 190 + 0 ^ 2 + 143 - 123 + 156;
        af.llIIlllIl[68] = -(0xFFFFD4B7 & 0x3FF9) & (0xFFFFD5FA & 0x3FF5);
        af.llIIlllIl[69] = -(0xFFFFD0BF & 0x7F74) & (0xFFFFFFFF & 0x7EFF);
        af.llIIlllIl[70] = -(0xFFFF8E59 & 0x75AE) & (0xFFFFEFEF & 0x75BF);
        af.llIIlllIl[71] = -(0xFFFFEFAF & 0x70F9) & (0xFFFFFFFF & 0x7FEF);
        af.llIIlllIl[72] = -(0xFFFFBD6F & 0x56DB) & (0xFFFFFFFE & 0x17CF);
        af.llIIlllIl[73] = 0x40 ^ 0x5B;
        af.llIIlllIl[74] = 0x4A ^ 0x56;
        af.llIIlllIl[75] = 0x5B ^ 0x46;
        af.llIIlllIl[76] = -(0xFFFF9CE1 & 0x733F) & (0xFFFFBBFE & 0x5FEF);
        af.llIIlllIl[77] = 0xFFFFFFEF & 0xCF3;
        af.llIIlllIl[78] = 0xFFFF9BD7 & 0x6FFF;
        af.llIIlllIl[79] = 0xFFFFFDFD & 0xEEB;
        af.llIIlllIl[80] = 0x96 ^ 0x88;
    }

    @Override
    public int af() {
        try {
            af.ak();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0x21 ^ 1) & ~(0x4B ^ 0x6B);
        }
        return llIIlllIl[67];
    }

    private static boolean lIlIlllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return llIIlllII[llIIlllIl[73]];
    }

    private static boolean lIlIlllIlIll(int n2, int n3) {
        return n2 > n3;
    }

    public static void ak() {
        if (af.lIlIlllIIIII(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIlllII[llIIlllIl[0]];
            b.a(bx);
            if (af.lIlIlllIIIIl(bx.size(), llIIlllIl[1])) {
                System.out.println(llIIlllII[llIIlllIl[1]]);
                bv = llIIlllIl[0];
            }
        }
        if (af.lIlIlllIIIlI(bv ? 1 : 0) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[2])) {
            BankLocation lIlIIIIIlIIIlI;
            if (af.lIlIlllIIIlI(af.an() ? 1 : 0)) {
                lIlIIIIIlIIIlI = BankLocation.getNearest();
                if (af.lIlIlllIIIll(lIlIIIIIlIIIlI) && af.lIlIlllIIIlI(lIlIIIIIlIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[3]];
                    a.a(lIlIIIIIlIIIlI);
                }
                if (af.lIlIlllIIIll(lIlIIIIIlIIIlI) && af.lIlIlllIIIII(lIlIIIIIlIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[4]];
                    if (af.lIlIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllIl[5]);
                        0;
                        Time.sleepTicks((int)llIIlllIl[6]);
                        0;
                    }
                    if (af.lIlIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (af.lIlIlllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIlllIl[7]);
                            0;
                        }
                        while (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8]) && af.lIlIlllIIIlI(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)llIIlllIl[1]);
                            0;
                            0;
                            if (3 >= 1) continue;
                            return;
                        }
                        if (af.lIlIlllIIIlI(af.ao() ? 1 : 0)) {
                            af.Q();
                            System.out.println(llIIlllII[llIIlllIl[7]]);
                            bv = llIIlllIl[1];
                            return;
                        }
                        if (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
                            int[] nArray = new int[llIIlllIl[1]];
                            nArray[af.llIIlllIl[0]] = llIIlllIl[9];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llIIlllIl[1]];
                                nArray2[af.llIIlllIl[0]] = llIIlllIl[9];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray2), llIIlllIl[1])) {
                                    Bank.withdraw((int)llIIlllIl[9], (int)llIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[9];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            if (-2 > 0) {
                                                return ((3 ^ (0x21 ^ 0x72)) & (0x7D ^ 0x52 ^ 3 + 86 - -30 + 8 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[llIIlllIl[1]];
                            nArray3[af.llIIlllIl[0]] = llIIlllIl[11];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIIlllIl[1]];
                                nArray4[af.llIIlllIl[0]] = llIIlllIl[11];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray4), llIIlllIl[1])) {
                                    Bank.withdraw((int)llIIlllIl[11], (int)llIIlllIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[11];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[llIIlllIl[1]];
                            nArray5[af.llIIlllIl[0]] = llIIlllIl[13];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llIIlllIl[1]];
                                nArray6[af.llIIlllIl[0]] = llIIlllIl[13];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray6), llIIlllIl[1])) {
                                    Bank.withdraw((int)llIIlllIl[13], (int)llIIlllIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[13];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            if ((73 + 149 - 77 + 11 ^ 85 + 123 - 68 + 12) == -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[llIIlllIl[1]];
                            nArray7[af.llIIlllIl[0]] = llIIlllIl[14];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIIlllIl[1]];
                                nArray8[af.llIIlllIl[0]] = llIIlllIl[14];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray8), llIIlllIl[1])) {
                                    Bank.withdraw((int)llIIlllIl[14], (int)llIIlllIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[14];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            if (((0x1E ^ 0xB) & ~(0x3A ^ 0x2F)) > 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[llIIlllIl[1]];
                            nArray9[af.llIIlllIl[0]] = llIIlllIl[16];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIIlllIl[1]];
                                nArray10[af.llIIlllIl[0]] = llIIlllIl[16];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray10), llIIlllIl[1])) {
                                    Bank.withdraw((int)llIIlllIl[16], (int)llIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[16];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            if (-1 > 3) {
                                                return ((0xEF ^ 0xA3 ^ 2) & (0x68 ^ 0x2A ^ (0x6A ^ 0x66) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[llIIlllIl[1]];
                            nArray11[af.llIIlllIl[0]] = llIIlllIl[17];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llIIlllIl[1]];
                                nArray12[af.llIIlllIl[0]] = llIIlllIl[17];
                                if (af.lIlIlllIIIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llIIlllIl[17], (int)llIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)llIIlllIl[18], (int)llIIlllIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llIIlllIl[1]];
                            nArray13[af.llIIlllIl[0]] = llIIlllIl[20];
                            if (af.lIlIlllIIIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llIIlllIl[1]];
                                nArray14[af.llIIlllIl[0]] = llIIlllIl[20];
                                if (af.lIlIlllIIIIl(Inventory.getCount((int[])nArray14), llIIlllIl[1]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21])) {
                                    Bank.withdrawAll((int)llIIlllIl[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llIIlllIl[1]];
                                        nArray[af.llIIlllIl[0]] = llIIlllIl[20];
                                        if (af.lIlIlllIIlII(Inventory.getCount((int[])nArray))) {
                                            bl = llIIlllIl[1];
                                            0;
                                            if (-1 >= ((0xAF ^ 0x91 ^ (0x13 ^ 0x3E)) & (165 + 67 - 204 + 140 ^ 113 + 128 - 61 + 7 ^ -1))) {
                                                return ((9 + 84 - 13 + 87 ^ 41 + 38 - 18 + 87) & (0xF9 ^ 0x99 ^ (0xE7 ^ 0xB4) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = llIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)llIIlllIl[5]);
                                    0;
                                }
                            }
                        }
                        if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
                            int[] nArray = new int[llIIlllIl[1]];
                            nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                            if (af.lIlIlllIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llIIlllIl[22], (int)llIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIIlllIl[1]);
                                0;
                            }
                            if (af.lIlIlllIIIII(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)llIIlllIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIIlllIl[1]);
                                0;
                                Bank.withdrawAll((int)llIIlllIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llIIlllIl[1]);
                                0;
                            }
                            Time.sleepTicks((int)llIIlllIl[4]);
                            0;
                            Bank.withdrawAll((int)llIIlllIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIIlllIl[1]);
                            0;
                            Bank.withdrawAll((int)llIIlllIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llIIlllIl[1]);
                            0;
                        }
                    }
                }
            }
            if (af.lIlIlllIIIII(af.an() ? 1 : 0)) {
                if (af.lIlIlllIIIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21])) {
                    if (af.lIlIlllIIIlI(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlllII[llIIlllIl[19]];
                        Movement.walkTo((WorldPoint)cm);
                        0;
                        Time.sleepTicks((int)llIIlllIl[1]);
                        0;
                    }
                    if (af.lIlIlllIIIII(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlllII[llIIlllIl[6]];
                        af.am();
                    }
                }
                if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[21]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[26])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[27]];
                    if (af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llIIlllIl[1]);
                        0;
                    }
                }
                if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[26]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[29])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[30]];
                    if (af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llIIlllIl[1]);
                        0;
                    }
                }
                if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[29]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[31])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[32]];
                    if (af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llIIlllIl[1]);
                        0;
                    }
                }
                if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[31]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[33]];
                    if (af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llIIlllIl[1]);
                        0;
                    }
                }
                if (af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[8])) {
                    int lIlIIIIIlIIIII;
                    AccBuilderGWD.c = llIIlllII[llIIlllIl[34]];
                    if (af.lIlIlllIIlll(cn)) {
                        cn = new WorldPoint(llIIlllIl[35] + e.c(llIIlllIl[1], llIIlllIl[7]), llIIlllIl[36], llIIlllIl[0]);
                    }
                    int[] nArray = new int[llIIlllIl[1]];
                    nArray[af.llIIlllIl[0]] = llIIlllIl[22];
                    if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llIIlllIl[1]];
                        nArray15[af.llIIlllIl[0]] = llIIlllIl[22];
                        if (af.lIlIlllIIIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llIIlllIl[1]];
                            nArray16[af.llIIlllIl[0]] = llIIlllIl[22];
                            Inventory.getFirst((int[])nArray16).interact(llIIlllII[llIIlllIl[37]]);
                            Time.sleepTicks((int)llIIlllIl[1]);
                            0;
                        }
                    }
                    if (af.lIlIlllIIIII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llIIlllIl[1]];
                    nArray17[af.llIIlllIl[0]] = llIIlllIl[24];
                    lIlIIIIIlIIIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llIIlllIl[1]];
                    nArray18[af.llIIlllIl[0]] = llIIlllIl[38];
                    Item lIlIIIIIlIIIIl = Inventory.getFirst((int[])nArray18);
                    if (af.lIlIlllIIIlI(ck ? 1 : 0) && af.lIlIlllIIIll(cn)) {
                        if (af.lIlIlllIIIlI(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlllII[llIIlllIl[39]];
                            Movement.walkTo((WorldPoint)cn);
                            0;
                            Time.sleepTicks((int)llIIlllIl[1]);
                            0;
                        }
                        if (af.lIlIlllIIIII(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && af.lIlIlllIIIll(lIlIIIIIlIIIlI) && af.lIlIlllIIIll(lIlIIIIIlIIIIl) && af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                            lIlIIIIIlIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIIIIlIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (af.lIlIlllIlIll(Skills.getExperience((Skill)Skill.MAGIC), lIlIIIIIlIIIII)) {
                                    bl = llIIlllIl[1];
                                    0;
                                    if (3 <= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIlllIl[0];
                                }
                                return bl;
                            }, (int)llIIlllIl[10]);
                            0;
                        }
                    }
                    if (af.lIlIlllIIIII(ck ? 1 : 0)) {
                        if (af.lIlIlllIIIll(lIlIIIIIlIIIlI) && af.lIlIlllIIIll(lIlIIIIIlIIIIl) && af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                            lIlIIIIIlIIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIIIIlIIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (af.lIlIlllIlIll(Skills.getExperience((Skill)Skill.MAGIC), lIlIIIIIlIIIII)) {
                                    bl = llIIlllIl[1];
                                    0;
                                    if (((0x22 ^ 0x6F ^ (0xDB ^ 0x8B)) & (0xB ^ 0x3C ^ (0x2E ^ 4) ^ -1)) >= (0xB9 ^ 0xB6 ^ (0x45 ^ 0x4E))) {
                                        return ((48 + 149 - 152 + 130 ^ 96 + 139 - 147 + 83) & (0x6E ^ 0x64 ^ (0x4E ^ 0x40) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIlllIl[0];
                                }
                                return bl;
                            }, (int)llIIlllIl[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (af.lIlIlllIIllI(Players.getLocal().getAnimation(), llIIlllIl[28])) {
                                bl = llIIlllIl[1];
                                0;
                                if (-1 > -1) {
                                    return false;
                                }
                            } else {
                                bl = llIIlllIl[0];
                            }
                            return bl;
                        }, (int)llIIlllIl[40]);
                        0;
                    }
                }
            }
        }
    }

    static {
        af.lIlIllIlllll();
        af.lIlIllIllllI();
        ck = llIIlllIl[0];
        bx = new ArrayList<d>();
        cl = new WorldArea(llIIlllIl[76], llIIlllIl[77], llIIlllIl[51], llIIlllIl[41], llIIlllIl[0]);
        cm = new WorldPoint(llIIlllIl[78], llIIlllIl[79], llIIlllIl[0]);
        cn = null;
    }

    public static boolean ap() {
        if (af.lIlIlllIIllI(Vars.getBit((int)llIIlllIl[48]), llIIlllIl[1]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[19])) {
            return llIIlllIl[1];
        }
        if (af.lIlIlllIIllI(Vars.getBit((int)llIIlllIl[48]), llIIlllIl[3]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32]) && af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[19])) {
            return llIIlllIl[1];
        }
        if (af.lIlIlllIIllI(Vars.getBit((int)llIIlllIl[48]), llIIlllIl[4]) && af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32]) && af.lIlIlllIIIIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[39])) {
            return llIIlllIl[1];
        }
        if (af.lIlIlllIIllI(Vars.getBit((int)llIIlllIl[48]), llIIlllIl[4]) && af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[32])) {
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[14];
            if (af.lIlIlllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIIlllIl[1];
            }
        }
        if (af.lIlIlllIIllI(Vars.getBit((int)llIIlllIl[48]), llIIlllIl[7]) && af.lIlIlllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), llIIlllIl[39])) {
            int[] nArray = new int[llIIlllIl[1]];
            nArray[af.llIIlllIl[0]] = llIIlllIl[14];
            if (af.lIlIlllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llIIlllIl[1];
            }
        }
        return llIIlllIl[0];
    }

    private static String lIlIllIllIll(String lIIllllllIlIIl, String lIIllllllIIIll) {
        lIIllllllIlIIl = new String(Base64.getDecoder().decode(lIIllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllllIIlll = new StringBuilder();
        char[] lIIllllllIIllI = lIIllllllIIIll.toCharArray();
        int lIIllllllIIlIl = llIIlllIl[0];
        char[] lIIlllllIlllll = lIIllllllIlIIl.toCharArray();
        int lIIlllllIllllI = lIIlllllIlllll.length;
        int lIIlllllIlllIl = llIIlllIl[0];
        while (af.lIlIlllIIIIl(lIIlllllIlllIl, lIIlllllIllllI)) {
            char lIIllllllIlIlI = lIIlllllIlllll[lIIlllllIlllIl];
            lIIllllllIIlll.append((char)(lIIllllllIlIlI ^ lIIllllllIIllI[lIIllllllIIlIl % lIIllllllIIllI.length]));
            0;
            ++lIIllllllIIlIl;
            ++lIIlllllIlllIl;
            0;
            if ((0xCF ^ 0x81 ^ (0xEC ^ 0xA6)) == (28 + 130 - 23 + 16 ^ 119 + 100 - 201 + 129)) continue;
            return null;
        }
        return String.valueOf(lIIllllllIIlll);
    }

    private static void lIlIllIllllI() {
        llIIlllII = new String[llIIlllIl[80]];
        af.llIIlllII[af.llIIlllIl[0]] = af."Buying items";
        af.llIIlllII[af.llIIlllIl[1]] = af."Finished buying items, switching back to magic training";
        af.llIIlllII[af.llIIlllIl[3]] = af."Navigating to bank";
        af.llIIlllII[af.llIIlllIl[4]] = af."Handling banking";
        af.llIIlllII[af.llIIlllIl[7]] = af."We are missing supplies, switching to BUYING";
        af.llIIlllII[af.llIIlllIl[19]] = af."Nav to cows";
        af.llIIlllII[af.llIIlllIl[6]] = af."Attacking cows";
        af.llIIlllII[af.llIIlllIl[27]] = af."Casting varrock tele";
        af.llIIlllII[af.llIIlllIl[30]] = af."Casting lumby tele";
        af.llIIlllII[af.llIIlllIl[32]] = af."Casting fally tele";
        af.llIIlllII[af.llIIlllIl[33]] = af."Casting cammy tele";
        af.llIIlllII[af.llIIlllIl[34]] = af."Alching";
        af.llIIlllII[af.llIIlllIl[37]] = af."Wield";
        af.llIIlllII[af.llIIlllIl[39]] = af."Move to alch spot";
        af.llIIlllII[af.llIIlllIl[41]] = af."Nav to cows";
        af.llIIlllII[af.llIIlllIl[42]] = af."Attacking cows";
        af.llIIlllII[af.llIIlllIl[43]] = af."Eat";
        af.llIIlllII[af.llIIlllIl[44]] = af."Cow";
        af.llIIlllII[af.llIIlllIl[45]] = af."cow";
        af.llIIlllII[af.llIIlllIl[47]] = af."Attack";
        af.llIIlllII[af.llIIlllIl[51]] = af."Opening autocast";
        af.llIIlllII[af.llIIlllIl[52]] = af."Choose spell";
        af.llIIlllII[af.llIIlllIl[54]] = af."Wind Strike";
        af.llIIlllII[af.llIIlllIl[55]] = af."Water Strike";
        af.llIIlllII[af.llIIlllIl[56]] = af."Earth Strike";
        af.llIIlllII[af.llIIlllIl[21]] = af."Earth Strike";
        af.llIIlllII[af.llIIlllIl[50]] = af."Fire Strike";
        af.llIIlllII[af.llIIlllIl[73]] = af."Magic training";
        af.llIIlllII[af.llIIlllIl[74]] = af."ring of wealth (";
        af.llIIlllII[af.llIIlllIl[75]] = af."Cow";
    }
}

