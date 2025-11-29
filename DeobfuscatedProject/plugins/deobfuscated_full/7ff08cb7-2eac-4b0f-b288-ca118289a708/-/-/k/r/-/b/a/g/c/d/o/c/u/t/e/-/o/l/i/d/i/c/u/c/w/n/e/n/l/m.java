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

public class m
implements ab {
    private static /* synthetic */ int[] lIIIIlllIl;
    public static /* synthetic */ boolean ck;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ WorldPoint cn;
    private static /* synthetic */ String[] lIIIIllIll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldArea cl;

    private static int lllIIlIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[73])) {
            bl = lIIIIlllIl[1];
            0;
            if (1 <= 0) {
                return false;
            }
        } else {
            bl = lIIIIlllIl[0];
        }
        return bl;
    }

    private static boolean lllIIlIlIIll(int n2) {
        return n2 > 0;
    }

    private static String lllIIlIIIlIl(String llIlllIIlIIl, String llIlllIIllIl) {
        llIlllIIlIIl = new String(Base64.getDecoder().decode(llIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIIllII = new StringBuilder();
        char[] llIlllIIlIll = llIlllIIllIl.toCharArray();
        int llIlllIIlIlI = lIIIIlllIl[0];
        char[] llIlllIIIlII = llIlllIIlIIl.toCharArray();
        int llIlllIIIIll = llIlllIIIlII.length;
        int llIlllIIIIlI = lIIIIlllIl[0];
        while (m.lllIIlIlIIII(llIlllIIIIlI, llIlllIIIIll)) {
            char llIlllIIllll = llIlllIIIlII[llIlllIIIIlI];
            llIlllIIllII.append((char)(llIlllIIllll ^ llIlllIIlIll[llIlllIIlIlI % llIlllIIlIll.length]));
            0;
            ++llIlllIIlIlI;
            ++llIlllIIIIlI;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(llIlllIIllII);
    }

    private static String lllIIlIIIlll(String llIllIlllIIl, String llIllIllIllI) {
        try {
            SecretKeySpec llIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIllIllI.getBytes(StandardCharsets.UTF_8)), lIIIIlllIl[29]), "DES");
            Cipher llIllIlllIll = Cipher.getInstance("DES");
            llIllIlllIll.init(lIIIIlllIl[2], llIllIllllII);
            return new String(llIllIlllIll.doFinal(Base64.getDecoder().decode(llIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlllIlI) {
            llIllIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        d llIlllllIIII;
        Object llIlllllIIIl;
        if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIIIlllIl[14], lIIIIlllIl[57], lIIIIlllIl[58]);
                bx.add(d2);
                0;
            }
            int[] nArray2 = new int[lIIIIlllIl[1]];
            nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[7], lIIIIlllIl[59], lIIIIlllIl[24]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray3 = new int[lIIIIlllIl[1]];
            nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[9], lIIIIlllIl[60], lIIIIlllIl[24]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray4 = new int[lIIIIlllIl[1]];
            nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[11], lIIIIlllIl[61], lIIIIlllIl[24]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray5 = new int[lIIIIlllIl[1]];
            nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[12], lIIIIlllIl[4], lIIIIlllIl[24]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray6 = new int[lIIIIlllIl[1]];
            nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[44], lIIIIlllIl[1], e.c(lIIIIlllIl[62], lIIIIlllIl[63]));
                bx.add((d)llIlllllIIIl);
                0;
            }
        }
        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIIlllIl[1]];
                nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllIl[61])) {
                    int[] nArray8 = new int[lIIIIlllIl[1]];
                    nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                    llIlllllIIIl = new d(lIIIIlllIl[22], lIIIIlllIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlllIl[64]);
                    bx.add((d)llIlllllIIIl);
                    0;
                }
            }
            int[] nArray9 = new int[lIIIIlllIl[1]];
            nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[22], lIIIIlllIl[61], lIIIIlllIl[64]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray10 = new int[lIIIIlllIl[1]];
            nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIlllIl[1]];
                nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIlllIl[61])) {
                    int[] nArray12 = new int[lIIIIlllIl[1]];
                    nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                    llIlllllIIIl = new d(lIIIIlllIl[23], lIIIIlllIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlllIl[65]);
                    bx.add((d)llIlllllIIIl);
                    0;
                }
            }
            int[] nArray13 = new int[lIIIIlllIl[1]];
            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llIlllllIIIl = new d(lIIIIlllIl[23], lIIIIlllIl[61], lIIIIlllIl[65]);
                bx.add((d)llIlllllIIIl);
                0;
            }
            int[] nArray14 = new int[lIIIIlllIl[1]];
            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llIlllllIIIl = new d(lIIIIlllIl[20], lIIIIlllIl[1], lIIIIlllIl[66]);
                    bx.add((d)llIlllllIIIl);
                    0;
                }
            }
            if (m.lllIIlIIllll(ck ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                    if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[61])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                        llIlllllIIIl = new d(lIIIIlllIl[14], lIIIIlllIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlllIl[58]);
                        bx.add((d)llIlllllIIIl);
                        0;
                    }
                }
                int[] nArray19 = new int[lIIIIlllIl[1]];
                nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (m.lllIIlIlIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llIlllllIIIl = new d(lIIIIlllIl[14], lIIIIlllIl[61], lIIIIlllIl[58]);
                    bx.add((d)llIlllllIIIl);
                    0;
                }
                int[] nArray20 = new int[lIIIIlllIl[1]];
                nArray20[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIIlllIl[1]];
                    nArray21[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlllIl[66])) {
                        int[] nArray22 = new int[lIIIIlllIl[1]];
                        nArray22[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                        llIlllllIIIl = new d(lIIIIlllIl[21], lIIIIlllIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIIlllIl[24]);
                        bx.add((d)llIlllllIIIl);
                        0;
                    }
                }
                int[] nArray23 = new int[lIIIIlllIl[1]];
                nArray23[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llIlllllIIIl = new d(lIIIIlllIl[21], lIIIIlllIl[66], lIIIIlllIl[24]);
                    bx.add((d)llIlllllIIIl);
                    0;
                }
            }
        }
        int[] nArray = new int[lIIIIlllIl[1]];
        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIlllllIIIl = new d(lIIIIlllIl[18], lIIIIlllIl[67], lIIIIlllIl[37]);
            bx.add((d)llIlllllIIIl);
            0;
        }
        if (m.lllIIlIlIIIl(Bank.contains(llIlllllIIIl = item -> item.getName().toLowerCase().contains(lIIIIllIll[lIIIIlllIl[74]])) ? 1 : 0)) {
            llIlllllIIII = new d(lIIIIlllIl[68], lIIIIlllIl[17], lIIIIlllIl[69]);
            bx.add(llIlllllIIII);
            0;
        }
        int[] nArray24 = new int[lIIIIlllIl[1]];
        nArray24[m.lIIIIlllIl[0]] = lIIIIlllIl[70];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llIlllllIIII = new d(lIIIIlllIl[70], lIIIIlllIl[32], lIIIIlllIl[71]);
            bx.add(llIlllllIIII);
            0;
        }
        int[] nArray25 = new int[lIIIIlllIl[1]];
        nArray25[m.lIIIIlllIl[0]] = lIIIIlllIl[16];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llIlllllIIII = new d(lIIIIlllIl[16], lIIIIlllIl[32], lIIIIlllIl[71]);
            bx.add(llIlllllIIII);
            0;
        }
    }

    private static boolean lllIIlIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lllIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean ap() {
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[1]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[2]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[3]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[3]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[5]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        return lIIIIlllIl[0];
    }

    private static String lllIIlIIIllI(String llIlllIlllII, String llIlllIllIll) {
        try {
            SecretKeySpec llIllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIIII = Cipher.getInstance("Blowfish");
            llIllllIIIII.init(lIIIIlllIl[2], llIllllIIIIl);
            return new String(llIllllIIIII.doFinal(Base64.getDecoder().decode(llIlllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIlllll) {
            llIlllIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        m.lllIIlIIlllI();
        m.lllIIlIIllIl();
        bx = new ArrayList<d>();
        cl = new WorldArea(lIIIIlllIl[76], lIIIIlllIl[77], lIIIIlllIl[47], lIIIIlllIl[40], lIIIIlllIl[0]);
        cm = new WorldPoint(lIIIIlllIl[78], lIIIIlllIl[79], lIIIIlllIl[0]);
        cn = new WorldPoint(lIIIIlllIl[80] + e.c(lIIIIlllIl[1], lIIIIlllIl[5]), lIIIIlllIl[81], lIIIIlllIl[0]);
    }

    private static boolean lllIIlIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIlIllIII(Object object) {
        return object == null;
    }

    public static void al() {
        if (m.lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (m.lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[40]];
            Movement.walkTo((WorldPoint)cm);
            0;
            Time.sleepTicks((int)lIIIIlllIl[1]);
            0;
        }
        if (m.lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            m.am();
        }
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
        
        }
        return lIIIIlllIl[67];
    }

    private static boolean lllIIlIlIIlI(Object object) {
        return object != null;
    }

    public static void aq() {
        if (m.lllIIlIlIIlI(Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50]))) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[51]];
            Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50]).interact(lIIIIllIll[lIIIIlllIl[52]]);
            Time.sleepTicks((int)lIIIIlllIl[5]);
            0;
        }
        if (m.lllIIlIllIII(Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50])) && m.lllIIlIlIIIl(Widgets.get((int)lIIIIlllIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIIlllIl[1]);
            0;
            if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[1]).interact(lIIIIllIll[lIIIIlllIl[54]]);
            }
            if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[2]).interact(lIIIIllIll[lIIIIlllIl[55]]);
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[19]]);
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31])) {
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[50]]);
                }
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[5]).interact(lIIIIllIll[lIIIIlllIl[56]]);
                }
            }
            Time.sleepTicks((int)lIIIIlllIl[1]);
            0;
        }
    }

    @Override
    public boolean ae() {
        return lIIIIlllIl[0];
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
                                                    if (!m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) break block19;
                                                    int[] nArray = new int[lIIIIlllIl[1]];
                                                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlllIl[1]];
                                                    nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlllIl[1]];
                                                    nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlllIl[1]];
                                                    nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlllIl[1]];
                                                    nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlllIl[1]];
                                                    nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlllIl[1]];
                                                    nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlllIl[1];
                                                0;
                                                if (((0xF1 ^ 0xBC ^ (0xF1 ^ 0xB0)) & (0xBC ^ 0x94 ^ (0x17 ^ 0x33) ^ -1)) == 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIIIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) || !m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) break block22;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlllIl[1]];
                                        nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlllIl[1]];
                                        nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlllIl[1]];
                                        nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlllIl[1]];
                                        nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlllIl[1]];
                                        nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlllIl[1];
                                    0;
                                    if (1 != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIlIIIl(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlllIl[1]];
                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlllIl[1]];
                            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                            if (m.lllIIlIIllll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlllIl[1];
                                0;
                                if (2 == 2) return n3 != 0;
                                return ((165 + 17 - 86 + 127 ^ 15 + 56 - 54 + 116) & (0x39 ^ 0x16 ^ (0x54 ^ 0x21) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlllIl[0];
                    return n3 != 0;
                }
                if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIIllll(ck ? 1 : 0)) return lIIIIlllIl[0];
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIlII(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[17])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlllIl[1]];
                            nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                            if (m.lllIIlIIllll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlllIl[1];
                                0;
                                if ((0xF5 ^ 0xBC ^ (0x51 ^ 0x1C)) >= (51 + 20 - -43 + 67 ^ 8 + 48 - -39 + 82)) return n2 != 0;
                                return ((0xDC ^ 0xAB ^ (0x62 ^ 0xB)) & (33 + 165 - 191 + 167 ^ 132 + 5 - 104 + 143 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllIl[0];
        return n2 != 0;
    }

    private static void lllIIlIIlllI() {
        lIIIIlllIl = new int[82];
        m.lIIIIlllIl[0] = (0x72 ^ 0x61) & ~(0x70 ^ 0x63);
        m.lIIIIlllIl[1] = 1;
        m.lIIIIlllIl[2] = 2;
        m.lIIIIlllIl[3] = 3;
        m.lIIIIlllIl[4] = 0xFFFF97AF & 0x7BD8;
        m.lIIIIlllIl[5] = 0xAA ^ 0xAE;
        m.lIIIIlllIl[6] = 0x8A ^ 0xBD;
        m.lIIIIlllIl[7] = 0xFFFFB3AE & 0x4E7F;
        m.lIIIIlllIl[8] = 0xFFFFEDDE & 0x17FD;
        m.lIIIIlllIl[9] = -(0xFFFF8767 & 0x79DD) & (0xFFFFC76F & 0x3BFF);
        m.lIIIIlllIl[10] = 0xFFFFDBCC & 0x2DF7;
        m.lIIIIlllIl[11] = 0xFFFFF72D & 0xAFF;
        m.lIIIIlllIl[12] = -(0xFFFFFFF7 & 0x511D) & (0xFFFFF33E & 0x5FFF);
        m.lIIIIlllIl[13] = -(0xFFFFEFFF & 0x5E61) & (0xFFFFFFFE & 0x5FF5);
        m.lIIIIlllIl[14] = 0xFFFFB27F & 0x4FB3;
        m.lIIIIlllIl[15] = -(0xFFFFF7ED & 0x4EBF) & (0xFFFFFFFD & 0x77FF);
        m.lIIIIlllIl[16] = -(0xFFFFF1DF & 0x6EA3) & (0xFFFFFFCF & 0x7FFB);
        m.lIIIIlllIl[17] = 0x7C ^ 0x79;
        m.lIIIIlllIl[18] = -(0xFFFFFECF & 0x7DB5) & (0xFFFFFDFF & Short.MAX_VALUE);
        m.lIIIIlllIl[19] = 0x57 ^ 0xC ^ (0x65 ^ 0x27);
        m.lIIIIlllIl[20] = 0xFFFFAFEB & 0x557F;
        m.lIIIIlllIl[21] = 0xFFFFCABF & 0x376C;
        m.lIIIIlllIl[22] = -(0xFFFFEDF9 & 0x33CF) & (0xFFFFB7FD & 0x6BFB);
        m.lIIIIlllIl[23] = 0x24 ^ 0x59 ^ (0xE7 ^ 0xA4);
        m.lIIIIlllIl[24] = 0x13 ^ 0x35 ^ (0x3A ^ 0x1A);
        m.lIIIIlllIl[25] = 2 ^ (0x6E ^ 0x73);
        m.lIIIIlllIl[26] = 0xA1 ^ 0x9B ^ (0x55 ^ 0x68);
        m.lIIIIlllIl[27] = -1;
        m.lIIIIlllIl[28] = 0x4E ^ 0x6B;
        m.lIIIIlllIl[29] = 0x53 ^ 0x71 ^ (0x39 ^ 0x13);
        m.lIIIIlllIl[30] = 33 + 44 - 67 + 136 ^ 143 + 183 - 205 + 70;
        m.lIIIIlllIl[31] = 0x97 ^ 0x98 ^ (0x63 ^ 0x65);
        m.lIIIIlllIl[32] = 0x41 ^ 0x7F ^ (0x7A ^ 0x4E);
        m.lIIIIlllIl[33] = 5 ^ 0x54 ^ (0x9B ^ 0xC1);
        m.lIIIIlllIl[34] = 124 + 86 - 157 + 93 ^ 123 + 68 - 124 + 91;
        m.lIIIIlllIl[35] = 84 + 78 - 118 + 125 ^ 106 + 58 - 114 + 100;
        m.lIIIIlllIl[36] = 0x6F ^ 0x62;
        m.lIIIIlllIl[37] = 0xFFFFF1DD & 0xF62;
        m.lIIIIlllIl[38] = -(0xFFFFB66F & 0x7DFD) & (0xFFFFB67E & Short.MAX_VALUE);
        m.lIIIIlllIl[39] = -(0xFFFFB837 & 0x67D9) & (0xFFFFBDBD & 0x6FFE);
        m.lIIIIlllIl[40] = 0x4A ^ 0x44;
        m.lIIIIlllIl[41] = 0x49 ^ 0x60 ^ (0xA7 ^ 0x81);
        m.lIIIIlllIl[42] = 94 + 110 - 147 + 77 ^ 101 + 129 - 218 + 138;
        m.lIIIIlllIl[43] = 0x30 ^ 0x21;
        m.lIIIIlllIl[44] = -(0xFFFFB78F & 0x7879) & (0xFFFFFFED & 0x357F);
        m.lIIIIlllIl[45] = 61 + 6 - 57 + 168 ^ 78 + 40 - 84 + 126;
        m.lIIIIlllIl[46] = 0x67 ^ 0x74;
        m.lIIIIlllIl[47] = 0x96 ^ 0x82;
        m.lIIIIlllIl[48] = 0xFFFFDD54 & 0x23BF;
        m.lIIIIlllIl[49] = -(0xFFFFFFEF & 0x5C1F) & (0xFFFFFE5F & 0x5FFF);
        m.lIIIIlllIl[50] = 71 + 70 - -4 + 40 ^ 136 + 131 - 168 + 64;
        m.lIIIIlllIl[51] = 0xD0 ^ 0xC5;
        m.lIIIIlllIl[52] = 42 + 55 - 29 + 93 ^ 64 + 96 - 119 + 142;
        m.lIIIIlllIl[53] = (0x55 ^ 0x3D) + (65 + 86 - 112 + 89) - (0x30 ^ 0x73) + (0x2F ^ 0xB);
        m.lIIIIlllIl[54] = 0x35 ^ 0x22;
        m.lIIIIlllIl[55] = 192 + 159 - 306 + 177 ^ 65 + 28 - -73 + 32;
        m.lIIIIlllIl[56] = 0x3D ^ 0x26;
        m.lIIIIlllIl[57] = -(0xFFFF9477 & 0x6F8F) & (0xFFFFBFEE & 0x47FF);
        m.lIIIIlllIl[58] = 55 + 125 - 47 + 37;
        m.lIIIIlllIl[59] = 0xFFFFEFE0 & 0x1FBF;
        m.lIIIIlllIl[60] = -(0xFFFFD437 & 0x7BCC) & (0xFFFFF7D7 & 0x5FFB);
        m.lIIIIlllIl[61] = -(0xFFFFF4CB & 0x6B76) & (0xFFFFEBF9 & Short.MAX_VALUE);
        m.lIIIIlllIl[62] = -(0xFFFFFBED & 0xF1E) & (0xFFFFFFFF & 0x3BDF);
        m.lIIIIlllIl[63] = -(0xFFFFD75B & 0x6BF7) & (0xFFFFFFDF & 0x7FFE);
        m.lIIIIlllIl[64] = 0xA ^ 0x72;
        m.lIIIIlllIl[65] = (0x2B ^ 0x40) + (0xD5 ^ 0xA4) - (127 + 28 - 112 + 143) + (0x3C ^ 0x48);
        m.lIIIIlllIl[66] = -(0xD3 ^ 0xB2) & (0xFFFFFAFA & 0x3FFD);
        m.lIIIIlllIl[67] = 0xFD ^ 0x9D ^ (0x9B ^ 0x9F);
        m.lIIIIlllIl[68] = 0xFFFFBFFF & 0x6ECC;
        m.lIIIIlllIl[69] = 0xFFFFF3AD & 0x6DFA;
        m.lIIIIlllIl[70] = -(0xFFFFE67F & 0x3991) & (0xFFFFBFD7 & 0x7F7F);
        m.lIIIIlllIl[71] = 0xFFFFCB94 & 0x37EF;
        m.lIIIIlllIl[72] = 0x6C ^ 0x22 ^ (0x49 ^ 0x1B);
        m.lIIIIlllIl[73] = 0xE9 ^ 0x8A;
        m.lIIIIlllIl[74] = 0x76 ^ 0x11 ^ (0x45 ^ 0x3F);
        m.lIIIIlllIl[75] = 0x30 ^ 0x2E;
        m.lIIIIlllIl[76] = -(0xFFFFB4B7 & 0x7B6A) & (0xFFFFFBFF & 0x3FEF);
        m.lIIIIlllIl[77] = -(0xFFFFD7B7 & 0x6B5D) & (0xFFFFEFF7 & 0x5FFF);
        m.lIIIIlllIl[78] = 0xFFFFFFD7 & 0xBFF;
        m.lIIIIlllIl[79] = -(0xFFFFFBBF & 0x4747) & (0xFFFFCFEF & Short.MAX_VALUE);
        m.lIIIIlllIl[80] = -(0xFFFFD1D9 & 0x6FA7) & (0xFFFFFFFE & 0x4DDB);
        m.lIIIIlllIl[81] = 0xFFFFFFDF & 0xDBF;
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
                                                    if (!m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) break block19;
                                                    int[] nArray = new int[lIIIIlllIl[1]];
                                                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlllIl[1]];
                                                    nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlllIl[1]];
                                                    nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlllIl[1]];
                                                    nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlllIl[1]];
                                                    nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlllIl[1]];
                                                    nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlllIl[1]];
                                                    nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlllIl[1];
                                                0;
                                                if (3 != -1) return n5 != 0;
                                                return ((0xC7 ^ 0x9F ^ (0xE ^ 0x77)) & (54 + 157 - 49 + 3 ^ 46 + 0 - -12 + 74 ^ -1)) != 0;
                                            }
                                            n5 = lIIIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) || !m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) break block22;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlllIl[1]];
                                        nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlllIl[1]];
                                        nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlllIl[1]];
                                        nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlllIl[1]];
                                        nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlllIl[1]];
                                        nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlllIl[1];
                                    0;
                                    if (2 != -1) return n4 != 0;
                                    return ((2 ^ (0x81 ^ 0xA9)) & (0x69 ^ 0x55 ^ (3 ^ 0x15) ^ -1)) != 0;
                                }
                                n4 = lIIIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIlIIIl(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlllIl[1]];
                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlllIl[1]];
                            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlllIl[1];
                                0;
                                if (((0x3B ^ 6) & ~(0x74 ^ 0x49)) <= 1) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIIIIlllIl[0];
                    return n3 != 0;
                }
                if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIIllll(ck ? 1 : 0)) return lIIIIlllIl[0];
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIlII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[17])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlllIl[1]];
                            nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlllIl[1];
                                0;
                                if (2 >= -1) return n2 != 0;
                                return ((4 ^ 0x6B ^ (0x58 ^ 0x7B)) & (0x12 ^ 0x67 ^ (0x5C ^ 0x65) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllIl[0];
        return n2 != 0;
    }

    private static boolean lllIIlIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIIlIIllIl() {
        lIIIIllIll = new String[lIIIIlllIl[25]];
        m.lIIIIllIll[m.lIIIIlllIl[0]] = m."Buying items";
        m.lIIIIllIll[m.lIIIIlllIl[1]] = m."Finished buying items, switching back to magic training";
        m.lIIIIllIll[m.lIIIIlllIl[2]] = m."Navigating to bank";
        m.lIIIIllIll[m.lIIIIlllIl[3]] = m."Handling banking";
        m.lIIIIllIll[m.lIIIIlllIl[5]] = m."We are missing supplies, switching to BUYING";
        m.lIIIIllIll[m.lIIIIlllIl[17]] = m."Nav to cows";
        m.lIIIIllIll[m.lIIIIlllIl[24]] = m."Attacking cows";
        m.lIIIIllIll[m.lIIIIlllIl[26]] = m."Casting varrock tele";
        m.lIIIIllIll[m.lIIIIlllIl[29]] = m."Casting lumby tele";
        m.lIIIIllIll[m.lIIIIlllIl[31]] = m."Casting fally tele";
        m.lIIIIllIll[m.lIIIIlllIl[32]] = m."Casting cammy tele";
        m.lIIIIllIll[m.lIIIIlllIl[33]] = m."Alching";
        m.lIIIIllIll[m.lIIIIlllIl[34]] = m."Wield";
        m.lIIIIllIll[m.lIIIIlllIl[36]] = m."Move to alch spot";
        m.lIIIIllIll[m.lIIIIlllIl[40]] = m."Nav to cows";
        m.lIIIIllIll[m.lIIIIlllIl[41]] = m."Eat";
        m.lIIIIllIll[m.lIIIIlllIl[42]] = m."Cow";
        m.lIIIIllIll[m.lIIIIlllIl[43]] = m."cow";
        m.lIIIIllIll[m.lIIIIlllIl[45]] = m."Attacking cows";
        m.lIIIIllIll[m.lIIIIlllIl[46]] = m."Attack";
        m.lIIIIllIll[m.lIIIIlllIl[47]] = m."In combat";
        m.lIIIIllIll[m.lIIIIlllIl[51]] = m."Opening autocast";
        m.lIIIIllIll[m.lIIIIlllIl[52]] = m."Choose spell";
        m.lIIIIllIll[m.lIIIIlllIl[54]] = m."Wind Strike";
        m.lIIIIllIll[m.lIIIIlllIl[55]] = m."Water Strike";
        m.lIIIIllIll[m.lIIIIlllIl[19]] = m."Earth Strike";
        m.lIIIIllIll[m.lIIIIlllIl[50]] = m."Earth Strike";
        m.lIIIIllIll[m.lIIIIlllIl[56]] = m."Fire Strike";
        m.lIIIIllIll[m.lIIIIlllIl[72]] = m."Magic training";
        m.lIIIIllIll[m.lIIIIlllIl[74]] = m."ring of wealth (";
        m.lIIIIllIll[m.lIIIIlllIl[75]] = m."Cow";
    }

    private static void am() {
        if (m.lllIIlIlIlll(m.lllIIlIlIllI(e.w(), 30.0))) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlllIl[1]];
                nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                Inventory.getFirst((int[])nArray2).interact(lIIIIllIll[lIIIIlllIl[41]]);
                Time.sleepTicks((int)lIIIIlllIl[1]);
                0;
            }
        }
        if (m.lllIIlIllIII(Players.getLocal().getInteracting())) {
            NPC llIlllllIlIl = NPCs.getNearest(nPC -> {
                int n2;
                if (m.lllIIlIIllll(nPC.getName().contains(lIIIIllIll[lIIIIlllIl[75]]) ? 1 : 0) && m.lllIIlIlIIIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIIlllIl[1];
                    0;
                    if (-1 >= 1) {
                        return ((123 + 65 - 110 + 155 ^ 19 + 141 - 122 + 141) & (0xAF ^ 0x9C ^ (0xF2 ^ 0x9B) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIlllIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIIlllIl[2]];
            stringArray[m.lIIIIlllIl[0]] = lIIIIllIll[lIIIIlllIl[42]];
            stringArray[m.lIIIIlllIl[1]] = lIIIIllIll[lIIIIlllIl[43]];
            List llIlllllIlII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (m.lllIIlIllIIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIIlllIl[1];
                    0;
                    if (3 == 0) {
                        return ((7 + 70 - -16 + 92 ^ 115 + 124 - 173 + 66) & (0x33 ^ 0x36 ^ (0xBC ^ 0x84) ^ -1)) != 0;
                    }
                } else {
                    bl = lIIIIlllIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (m.lllIIlIIllll(Equipment.contains((int[])nArray) ? 1 : 0) && m.lllIIlIlIIIl(m.ap() ? 1 : 0)) {
                m.aq();
            }
            if (m.lllIIlIlIIlI(llIlllllIlIl) && m.lllIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[45]];
                llIlllllIlIl.interact(lIIIIllIll[lIIIIlllIl[46]]);
                Time.sleepTicks((int)lIIIIlllIl[3]);
                0;
            }
        }
        if (m.lllIIlIlIIlI(Players.getLocal().getInteracting())) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[47]];
            Time.sleepTicks((int)lIIIIlllIl[1]);
            0;
        }
    }

    private static boolean lllIIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lIIIIllIll[lIIIIlllIl[72]];
    }

    public static void ak() {
        if (m.lllIIlIIllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[0]];
            b.a(bx);
            if (m.lllIIlIlIIII(bx.size(), lIIIIlllIl[1])) {
                System.out.println(lIIIIllIll[lIIIIlllIl[1]]);
                bv = lIIIIlllIl[0];
            }
        }
        if (m.lllIIlIlIIIl(bv ? 1 : 0)) {
            BankLocation llIllllllIlI;
            if (m.lllIIlIlIIIl(m.an() ? 1 : 0)) {
                llIllllllIlI = BankLocation.getNearest();
                if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIIl(llIllllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[2]];
                    a.a(llIllllllIlI);
                }
                if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIIllll(llIllllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[3]];
                    if (m.lllIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllIl[4]);
                        0;
                    }
                    if (m.lllIIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (m.lllIIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIlllIl[5]);
                            0;
                        }
                        while (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) && m.lllIIlIlIIIl(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)lIIIIlllIl[1]);
                            0;
                            0;
                            if ((0x7C ^ 0x79) > 0) continue;
                            return;
                        }
                        if (m.lllIIlIlIIIl(m.ao() ? 1 : 0)) {
                            m.Q();
                            System.out.println(lIIIIllIll[lIIIIlllIl[5]]);
                            bv = lIIIIlllIl[1];
                            return;
                        }
                        if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIIlllIl[1]];
                                nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray2), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[7], (int)lIIIIlllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIIIIlllIl[1]];
                            nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIlllIl[1]];
                                nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray4), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[9], (int)lIIIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            if (((0xE0 ^ 0xAC) & ~(0x3A ^ 0x76)) > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIIIIlllIl[1]];
                            nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIlllIl[1]];
                                nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray6), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[11], (int)lIIIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            if (2 < 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIIIIlllIl[1]];
                            nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIlllIl[1]];
                                nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray8), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[12], (int)lIIIIlllIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIIIIlllIl[1]];
                            nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIlllIl[1]];
                                nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray10), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[14], (int)lIIIIlllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            if (2 == 0) {
                                                return ((0x4C ^ 7 ^ (0xC2 ^ 0xAB)) & (0xBC ^ 0x9B ^ (0x28 ^ 0x2D) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIIIIlllIl[1]];
                            nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlllIl[1]];
                                nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                                if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIIlllIl[15], (int)lIIIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIIIIlllIl[16], (int)lIIIIlllIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIIlllIl[1]];
                                nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray14), lIIIIlllIl[1]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) {
                                    Bank.withdrawAll((int)lIIIIlllIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];
                                            0;
                                            if ((0x26 ^ 0x22) == -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);
                                    0;
                                }
                            }
                        }
                        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIIlllIl[20], (int)lIIIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);
                                0;
                            }
                            if (m.lllIIlIIllll(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIIlllIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);
                                0;
                                Bank.withdrawAll((int)lIIIIlllIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);
                                0;
                            }
                            Bank.withdrawAll((int)lIIIIlllIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIlllIl[1]);
                            0;
                            Bank.withdrawAll((int)lIIIIlllIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIIlllIl[1]);
                            0;
                        }
                    }
                }
            }
            if (m.lllIIlIIllll(m.an() ? 1 : 0)) {
                if (m.lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) {
                    if (m.lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[17]];
                        Movement.walkTo((WorldPoint)cm);
                        0;
                        Time.sleepTicks((int)lIIIIlllIl[1]);
                        0;
                    }
                    if (m.lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[24]];
                        m.am();
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[25])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[26]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);
                        0;
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[25]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[28])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[29]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);
                        0;
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[28]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[30])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[31]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);
                        0;
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[30]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[32]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);
                        0;
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                    int llIllllllIII;
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[33]];
                    int[] nArray = new int[lIIIIlllIl[1]];
                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                    if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIIlllIl[1]];
                        nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                        if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIIlllIl[1]];
                            nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIIIllIll[lIIIIlllIl[34]]);
                            Time.sleepTicks((int)lIIIIlllIl[1]);
                            0;
                        }
                    }
                    if (m.lllIIlIIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                    llIllllllIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIIlllIl[1]];
                    nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                    Item llIllllllIIl = Inventory.getFirst((int[])nArray18);
                    if (m.lllIIlIlIIIl(ck ? 1 : 0)) {
                        if (m.lllIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[36]];
                            Movement.walkTo((WorldPoint)cn);
                            0;
                            Time.sleepTicks((int)lIIIIlllIl[1]);
                            0;
                        }
                        if (m.lllIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIlI(llIllllllIIl)) {
                            llIllllllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIllllllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lllIIlIllIlI(Skills.getExperience((Skill)Skill.MAGIC), llIllllllIII)) {
                                    bl = lIIIIlllIl[1];
                                    0;
                                    if (-(184 + 55 - 113 + 72 ^ 132 + 174 - 290 + 178) >= 0) {
                                        return ((0x1F ^ 0xD ^ (0x2A ^ 0x1A)) & (101 + 93 - 84 + 24 ^ 128 + 43 - 30 + 23 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlllIl[0];
                                }
                                return bl;
                            }, (int)lIIIIlllIl[8]);
                            0;
                            Time.sleep((long)e.c(lIIIIlllIl[37], lIIIIlllIl[38]));
                            0;
                        }
                    }
                    if (m.lllIIlIIllll(ck ? 1 : 0)) {
                        if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIlI(llIllllllIIl) && m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                            llIllllllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIllllllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lllIIlIllIlI(Skills.getExperience((Skill)Skill.MAGIC), llIllllllIII)) {
                                    bl = lIIIIlllIl[1];
                                    0;
                                    if (-1 > 3) {
                                        return ((0x78 ^ 0x75 ^ (0x65 ^ 0x4E)) & (0x39 ^ 0x75 ^ (0x48 ^ 0x22) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlllIl[0];
                                }
                                return bl;
                            }, (int)lIIIIlllIl[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                                bl = lIIIIlllIl[1];
                                0;
                                if (2 == 0) {
                                    return ((2 ^ 0x6C ^ (0xFF ^ 0x9F)) & (0xF7 ^ 0x80 ^ (0x4F ^ 0x36) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIlllIl[0];
                            }
                            return bl;
                        }, (int)lIIIIlllIl[39]);
                        0;
                    }
                }
            }
        }
    }
}

