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

public class al
implements ac {
    static /* synthetic */ WorldPoint cl;
    static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ int[] lIllllllll;
    public static /* synthetic */ boolean ci;
    static /* synthetic */ WorldArea cj;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIlllllllI;

    public static void aq() {
        if (al.lIlIIIIlllIlI(Widgets.get((int)lIllllllll[51], (int)lIllllllll[52]))) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[53]];
            Widgets.get((int)lIllllllll[51], (int)lIllllllll[52]).interact(lIlllllllI[lIllllllll[54]]);
            Time.sleepTicks((int)lIllllllll[7]);
            0;
        }
        if (al.lIlIIIIlllllI(Widgets.get((int)lIllllllll[51], (int)lIllllllll[52])) && al.lIlIIIIlllIIl(Widgets.get((int)lIllllllll[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIllllllll[1]);
            0;
            if (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[19])) {
                Widgets.get((int)lIllllllll[55], (int)lIllllllll[1]).getChild(lIllllllll[1]).interact(lIlllllllI[lIllllllll[56]]);
            }
            if (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32]) && al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[19])) {
                Widgets.get((int)lIllllllll[55], (int)lIllllllll[1]).getChild(lIllllllll[3]).interact(lIlllllllI[lIllllllll[57]]);
            }
            if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[39])) {
                Widgets.get((int)lIllllllll[55], (int)lIllllllll[1]).getChild(lIllllllll[4]).interact(lIlllllllI[lIllllllll[58]]);
            }
            if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32])) {
                int[] nArray = new int[lIllllllll[1]];
                nArray[al.lIllllllll[0]] = lIllllllll[14];
                if (al.lIlIIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllllll[55], (int)lIllllllll[1]).getChild(lIllllllll[4]).interact(lIlllllllI[lIllllllll[21]]);
                }
            }
            if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[39])) {
                int[] nArray = new int[lIllllllll[1]];
                nArray[al.lIllllllll[0]] = lIllllllll[14];
                if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIllllllll[55], (int)lIllllllll[1]).getChild(lIllllllll[7]).interact(lIlllllllI[lIllllllll[52]]);
                }
            }
            Time.sleepTicks((int)lIllllllll[1]);
            0;
        }
    }

    private static String lIlIIIIllIIll(String var3, String var4) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllllllll[30]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllllllll[3], var21);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void am() {
        if (al.lIlIIIlIIIIII(al.lIlIIIIllllll(e.w(), 30.0))) {
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[20];
            if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllllllll[1]];
                nArray2[al.lIllllllll[0]] = lIllllllll[20];
                Inventory.getFirst((int[])nArray2).interact(lIlllllllI[lIllllllll[45]]);
                Time.sleepTicks((int)lIllllllll[1]);
                0;
            }
        }
        if (al.lIlIIIIlllllI(Players.getLocal().getInteracting())) {
            NPC var10 = NPCs.getNearest(nPC -> {
                int n2;
                if (al.lIlIIIIllIlll(nPC.getName().contains(lIlllllllI[lIllllllll[76]]) ? 1 : 0) && al.lIlIIIIlllIIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lIllllllll[1];
                    0;
                    if (1 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIllllllll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIllllllll[3]];
            stringArray[al.lIllllllll[0]] = lIlllllllI[lIllllllll[46]];
            stringArray[al.lIllllllll[1]] = lIlllllllI[lIllllllll[47]];
            List llllllllllllllllllIllIlllIllIIll = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (al.lIlIIIlIIIIIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIllllllll[1];
                    0;
                    if (3 < 3) {
                        return false;
                    }
                } else {
                    bl = lIllllllll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[48];
            if (al.lIlIIIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0) && al.lIlIIIIlllIIl(al.ap() ? 1 : 0)) {
                al.aq();
            }
            if (al.lIlIIIIlllIlI(var10) && al.lIlIIIIlllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                var10.interact(lIlllllllI[lIllllllll[49]]);
                Time.sleepTicks((int)lIllllllll[4]);
                0;
            }
        }
    }

    private static void lIlIIIIllIlIl() {
        lIlllllllI = new String[lIllllllll[81]];
        al.lIlllllllI[al.lIllllllll[0]] = al."Buying items";
        al.lIlllllllI[al.lIllllllll[1]] = al."Finished buying items, switching back to magic training";
        al.lIlllllllI[al.lIllllllll[3]] = al."Navigating to bank";
        al.lIlllllllI[al.lIllllllll[4]] = al."Handling banking";
        al.lIlllllllI[al.lIllllllll[7]] = al."We are missing supplies, switching to BUYING";
        al.lIlllllllI[al.lIllllllll[19]] = al."Nav to cows";
        al.lIlllllllI[al.lIllllllll[6]] = al."Attacking cows";
        al.lIlllllllI[al.lIllllllll[27]] = al."Casting varrock tele";
        al.lIlllllllI[al.lIllllllll[30]] = al."Casting lumby tele";
        al.lIlllllllI[al.lIllllllll[32]] = al."Casting fally tele";
        al.lIlllllllI[al.lIllllllll[33]] = al."Casting cammy tele";
        al.lIlllllllI[al.lIllllllll[34]] = al."Alching";
        al.lIlllllllI[al.lIllllllll[37]] = al."Wield";
        al.lIlllllllI[al.lIllllllll[39]] = al."Move to alch spot";
        al.lIlllllllI[al.lIllllllll[43]] = al."Nav to cows";
        al.lIlllllllI[al.lIllllllll[44]] = al."Attacking cows";
        al.lIlllllllI[al.lIllllllll[45]] = al."Eat";
        al.lIlllllllI[al.lIllllllll[46]] = al."Cow";
        al.lIlllllllI[al.lIllllllll[47]] = al."cow";
        al.lIlllllllI[al.lIllllllll[49]] = al."Attack";
        al.lIlllllllI[al.lIllllllll[53]] = al."Opening autocast";
        al.lIlllllllI[al.lIllllllll[54]] = al."Choose spell";
        al.lIlllllllI[al.lIllllllll[56]] = al."Wind Strike";
        al.lIlllllllI[al.lIllllllll[57]] = al."Water Strike";
        al.lIlllllllI[al.lIllllllll[58]] = al."Earth Strike";
        al.lIlllllllI[al.lIllllllll[21]] = al."Earth Strike";
        al.lIlllllllI[al.lIllllllll[52]] = al."Fire Strike";
        al.lIlllllllI[al.lIllllllll[74]] = al."Magic training";
        al.lIlllllllI[al.lIllllllll[75]] = al."ring of wealth (";
        al.lIlllllllI[al.lIllllllll[76]] = al."Cow";
    }

    private static boolean lIlIIIIlllIlI(Object object) {
        return object != null;
    }

    private static void Q() {
        d var11;
        Object var16;
        if (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[16];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIllllllll[16], lIllllllll[59], lIllllllll[60]);
                bv.add(d2);
                0;
            }
            int[] nArray2 = new int[lIllllllll[1]];
            nArray2[al.lIllllllll[0]] = lIllllllll[9];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var16 = new d(lIllllllll[9], lIllllllll[61], lIllllllll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray3 = new int[lIllllllll[1]];
            nArray3[al.lIllllllll[0]] = lIllllllll[11];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var16 = new d(lIllllllll[11], lIllllllll[62], lIllllllll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray4 = new int[lIllllllll[1]];
            nArray4[al.lIllllllll[0]] = lIllllllll[13];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var16 = new d(lIllllllll[13], lIllllllll[63], lIllllllll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray5 = new int[lIllllllll[1]];
            nArray5[al.lIllllllll[0]] = lIllllllll[14];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var16 = new d(lIllllllll[14], lIllllllll[5], lIllllllll[6]);
                bv.add((d)var16);
                0;
            }
            int[] nArray6 = new int[lIllllllll[1]];
            nArray6[al.lIllllllll[0]] = lIllllllll[48];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var16 = new d(lIllllllll[48], lIllllllll[1], e.c(lIllllllll[64], lIllllllll[65]));
                bv.add((d)var16);
                0;
            }
        }
        if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[24];
            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIllllllll[1]];
                nArray7[al.lIllllllll[0]] = lIllllllll[24];
                if (al.lIlIIIIlllIII(Bank.getFirst((int[])nArray7).getQuantity(), lIllllllll[63])) {
                    int[] nArray8 = new int[lIllllllll[1]];
                    nArray8[al.lIllllllll[0]] = lIllllllll[24];
                    var16 = new d(lIllllllll[24], lIllllllll[63] - Bank.getFirst((int[])nArray8).getQuantity(), lIllllllll[66]);
                    bv.add((d)var16);
                    0;
                }
            }
            int[] nArray9 = new int[lIllllllll[1]];
            nArray9[al.lIllllllll[0]] = lIllllllll[24];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var16 = new d(lIllllllll[24], lIllllllll[63], lIllllllll[66]);
                bv.add((d)var16);
                0;
            }
            int[] nArray10 = new int[lIllllllll[1]];
            nArray10[al.lIllllllll[0]] = lIllllllll[25];
            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIllllllll[1]];
                nArray11[al.lIllllllll[0]] = lIllllllll[25];
                if (al.lIlIIIIlllIII(Bank.getFirst((int[])nArray11).getQuantity(), lIllllllll[63])) {
                    int[] nArray12 = new int[lIllllllll[1]];
                    nArray12[al.lIllllllll[0]] = lIllllllll[25];
                    var16 = new d(lIllllllll[25], lIllllllll[63] - Bank.getFirst((int[])nArray12).getQuantity(), lIllllllll[67]);
                    bv.add((d)var16);
                    0;
                }
            }
            int[] nArray13 = new int[lIllllllll[1]];
            nArray13[al.lIllllllll[0]] = lIllllllll[25];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var16 = new d(lIllllllll[25], lIllllllll[63], lIllllllll[67]);
                bv.add((d)var16);
                0;
            }
            int[] nArray14 = new int[lIllllllll[1]];
            nArray14[al.lIllllllll[0]] = lIllllllll[22];
            if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIllllllll[1]];
                nArray15[al.lIllllllll[0]] = lIllllllll[22];
                if (al.lIlIIIIlllIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var16 = new d(lIllllllll[22], lIllllllll[1], lIllllllll[68]);
                    bv.add((d)var16);
                    0;
                }
            }
            if (al.lIlIIIIllIlll(ci ? 1 : 0)) {
                int[] nArray16 = new int[lIllllllll[1]];
                nArray16[al.lIllllllll[0]] = lIllllllll[16];
                if (al.lIlIIIIllIlll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllllll[1]];
                    nArray17[al.lIllllllll[0]] = lIllllllll[16];
                    if (al.lIlIIIIlllIII(Bank.getFirst((int[])nArray17).getQuantity(), lIllllllll[63])) {
                        int[] nArray18 = new int[lIllllllll[1]];
                        nArray18[al.lIllllllll[0]] = lIllllllll[16];
                        var16 = new d(lIllllllll[16], lIllllllll[63] - Bank.getFirst((int[])nArray18).getQuantity(), lIllllllll[60]);
                        bv.add((d)var16);
                        0;
                    }
                }
                int[] nArray19 = new int[lIllllllll[1]];
                nArray19[al.lIllllllll[0]] = lIllllllll[16];
                if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var16 = new d(lIllllllll[16], lIllllllll[63], lIllllllll[60]);
                    bv.add((d)var16);
                    0;
                }
                int[] nArray20 = new int[lIllllllll[1]];
                nArray20[al.lIllllllll[0]] = lIllllllll[23];
                if (al.lIlIIIIllIlll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIllllllll[1]];
                    nArray21[al.lIllllllll[0]] = lIllllllll[23];
                    if (al.lIlIIIIlllIII(Bank.getFirst((int[])nArray21).getQuantity(), lIllllllll[68])) {
                        int[] nArray22 = new int[lIllllllll[1]];
                        nArray22[al.lIllllllll[0]] = lIllllllll[23];
                        var16 = new d(lIllllllll[23], lIllllllll[68] - Bank.getFirst((int[])nArray22).getQuantity(), lIllllllll[6]);
                        bv.add((d)var16);
                        0;
                    }
                }
                int[] nArray23 = new int[lIllllllll[1]];
                nArray23[al.lIllllllll[0]] = lIllllllll[23];
                if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var16 = new d(lIllllllll[23], lIllllllll[68], lIllllllll[6]);
                    bv.add((d)var16);
                    0;
                }
            }
        }
        int[] nArray = new int[lIllllllll[1]];
        nArray[al.lIllllllll[0]] = lIllllllll[20];
        if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var16 = new d(lIllllllll[20], lIllllllll[69], lIllllllll[40]);
            bv.add((d)var16);
            0;
        }
        if (al.lIlIIIIlllIIl(Bank.contains(var16 = item -> item.getName().toLowerCase().contains(lIlllllllI[lIllllllll[75]])) ? 1 : 0)) {
            var11 = new d(lIllllllll[70], lIllllllll[19], lIllllllll[71]);
            bv.add(var11);
            0;
        }
        int[] nArray24 = new int[lIllllllll[1]];
        nArray24[al.lIllllllll[0]] = lIllllllll[72];
        if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var11 = new d(lIllllllll[72], lIllllllll[33], lIllllllll[73]);
            bv.add(var11);
            0;
        }
        int[] nArray25 = new int[lIllllllll[1]];
        nArray25[al.lIllllllll[0]] = lIllllllll[18];
        if (al.lIlIIIIlllIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var11 = new d(lIllllllll[18], lIllllllll[33], lIllllllll[73]);
            bv.add(var11);
            0;
        }
    }

    @Override
    public boolean ae() {
        return lIllllllll[0];
    }

    static {
        al.lIlIIIIllIllI();
        al.lIlIIIIllIlIl();
        ci = lIllllllll[0];
        bv = new ArrayList<d>();
        cj = new WorldArea(lIllllllll[77], lIllllllll[78], lIllllllll[53], lIllllllll[43], lIllllllll[0]);
        ck = new WorldPoint(lIllllllll[79], lIllllllll[80], lIllllllll[0]);
        cl = null;
    }

    private static boolean lIlIIIIllllII(int n2, int n3) {
        return n2 >= n3;
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
                                                    if (!al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21])) break block19;
                                                    int[] nArray = new int[lIllllllll[1]];
                                                    nArray[al.lIllllllll[0]] = lIllllllll[9];
                                                    if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllllll[1]];
                                                    nArray2[al.lIllllllll[0]] = lIllllllll[13];
                                                    if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllllll[1]];
                                                    nArray3[al.lIllllllll[0]] = lIllllllll[11];
                                                    if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllllll[1]];
                                                    nArray4[al.lIllllllll[0]] = lIllllllll[14];
                                                    if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllllll[1]];
                                                    nArray5[al.lIllllllll[0]] = lIllllllll[20];
                                                    if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllllll[1]];
                                                    nArray6[al.lIllllllll[0]] = lIllllllll[48];
                                                    if (!al.lIlIIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllllll[1]];
                                                    nArray7[al.lIllllllll[0]] = lIllllllll[48];
                                                    if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllllll[1];
                                                0;
                                                if (((0x58 ^ 0x4E ^ (4 ^ 0x1C)) & (0x5D ^ 0x1E ^ (0x40 ^ 0xD) ^ -1)) != -1) return n5 != 0;
                                                return ((0x44 ^ 0x24 ^ (0x49 ^ 0x77)) & (7 ^ 0x44 ^ (0xAA ^ 0xB7) ^ -1)) != 0;
                                            }
                                            n5 = lIllllllll[0];
                                            return n5 != 0;
                                        }
                                        if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21]) || !al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) break block22;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[13];
                                        if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllllll[1]];
                                        nArray8[al.lIllllllll[0]] = lIllllllll[11];
                                        if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllllll[1]];
                                        nArray9[al.lIllllllll[0]] = lIllllllll[14];
                                        if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllllll[1]];
                                        nArray10[al.lIllllllll[0]] = lIllllllll[16];
                                        if (!al.lIlIIIIllIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllllll[1]];
                                        nArray11[al.lIllllllll[0]] = lIllllllll[48];
                                        if (!al.lIlIIIIlllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllllll[1]];
                                        nArray12[al.lIllllllll[0]] = lIllllllll[48];
                                        if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllllll[1];
                                    0;
                                    if (3 != 2) return n4 != 0;
                                    return ((0x2C ^ 0x3F ^ (0x99 ^ 0xA7)) & (0x61 ^ 0xB ^ (0x5D ^ 0x1A) ^ -1)) != 0;
                                }
                                n4 = lIllllllll[0];
                                return n4 != 0;
                            }
                            if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8]) || !al.lIlIIIIlllIIl(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllllll[1]];
                            nArray[al.lIllllllll[0]] = lIllllllll[22];
                            if (!al.lIlIIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllllll[1]];
                            nArray13[al.lIllllllll[0]] = lIllllllll[22];
                            if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllllll[1]];
                        nArray[al.lIllllllll[0]] = lIllllllll[24];
                        if (al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllllll[1]];
                            nArray14[al.lIllllllll[0]] = lIllllllll[25];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllllll[1];
                                0;
                                if ((0x17 ^ 0x60 ^ (0x18 ^ 0x6B)) > 2) return n3 != 0;
                                return ((0x6A ^ 0x11 ^ (0x5D ^ 0x35)) & (128 + 65 - 138 + 74 ^ 45 + 78 - 12 + 35 ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIllllllll[0];
                    return n3 != 0;
                }
                if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8]) || !al.lIlIIIIllIlll(ci ? 1 : 0)) return lIllllllll[0];
                int[] nArray = new int[lIllllllll[1]];
                nArray[al.lIllllllll[0]] = lIllllllll[22];
                if (!al.lIlIIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllllll[1]];
                nArray15[al.lIllllllll[0]] = lIllllllll[22];
                if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[16];
            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllllll[1]];
                nArray16[al.lIllllllll[0]] = lIllllllll[23];
                if (al.lIlIIIIllIlll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllllll[1]];
                    nArray17[al.lIllllllll[0]] = lIllllllll[23];
                    if (al.lIlIIIIllllII(Bank.getFirst((int[])nArray17).getQuantity(), lIllllllll[19])) {
                        int[] nArray18 = new int[lIllllllll[1]];
                        nArray18[al.lIllllllll[0]] = lIllllllll[24];
                        if (al.lIlIIIIllIlll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllllll[1]];
                            nArray19[al.lIllllllll[0]] = lIllllllll[25];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllllll[1];
                                0;
                                if (1 == 1) return n2 != 0;
                                return (3 & ~3) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllllll[0];
        return n2 != 0;
    }

    public static void al() {
        if (al.lIlIIIIllIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (al.lIlIIIIlllIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[43]];
            Movement.walkTo((WorldPoint)ck);
            0;
            Time.sleepTicks((int)lIllllllll[1]);
            0;
        }
        if (al.lIlIIIIllIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[44]];
            al.am();
        }
    }

    private static boolean lIlIIIIllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlIIIIII(int n2) {
        return n2 < 0;
    }

    @Override
    public String ag() {
        return lIlllllllI[lIllllllll[74]];
    }

    private static void lIlIIIIllIllI() {
        lIllllllll = new int[82];
        al.lIllllllll[0] = (0xB1 ^ 0xA4 ^ (0x58 ^ 0xA)) & (0xD2 ^ 0xB1 ^ (0x7D ^ 0x59) ^ -1);
        al.lIllllllll[1] = 1;
        al.lIllllllll[2] = 0xE7 ^ 0xBA ^ (0x42 ^ 0x54);
        al.lIllllllll[3] = 2;
        al.lIllllllll[4] = 3;
        al.lIllllllll[5] = -(0xFFFFABFD & 0x7466) & (0xFFFFBFFB & 0x73EF);
        al.lIllllllll[6] = 98 + 14 - -11 + 29 ^ 31 + 28 - -34 + 65;
        al.lIllllllll[7] = 0x9F ^ 0xAA ^ (0x54 ^ 0x65);
        al.lIllllllll[8] = 2 ^ 0x21 ^ (0x41 ^ 0x55);
        al.lIllllllll[9] = 0xFFFFDA7E & 0x27AF;
        al.lIllllllll[10] = 0xFFFF8FDD & 0x75FE;
        al.lIllllllll[11] = -(0xFFFF84F5 & 0x7F5F) & (0xFFFFCE7F & 0x37FF);
        al.lIllllllll[12] = -(0xFFFFEEAB & 0x737F) & (0xFFFFFFEF & 0x6BFE);
        al.lIllllllll[13] = 0xFFFFCFEF & 0x323D;
        al.lIllllllll[14] = -(0xFFFFF947 & 0x5FBD) & (0xFFFFFF3E & 0x5BEF);
        al.lIllllllll[15] = -(0xFFFFEADB & 0x756F) & (0xFFFFFBFE & 0x75DF);
        al.lIllllllll[16] = -(0xFFFFBFFF & 0x7D45) & (0xFFFFBF7F & 0x7FF7);
        al.lIllllllll[17] = 0xFFFFFDD5 & 0x337B;
        al.lIllllllll[18] = -(0xFFFFBE3D & 0x61F7) & (0xFFFFBFFF & 0x7F7D);
        al.lIllllllll[19] = 0x56 ^ 0x53;
        al.lIllllllll[20] = 0xFFFFCF7F & 0x31FB;
        al.lIllllllll[21] = 0x1C ^ 5;
        al.lIllllllll[22] = 0xFFFF8FEF & 0x757B;
        al.lIllllllll[23] = 0xFFFF82FE & 0x7F2D;
        al.lIllllllll[24] = 0xFFFFB6F9 & 0x4B37;
        al.lIllllllll[25] = 37 + 104 - 24 + 44 ^ 15 + 29 - -6 + 109;
        al.lIllllllll[26] = 163 + 111 - 137 + 52 ^ 157 + 10 - 92 + 87;
        al.lIllllllll[27] = 0xA9 ^ 0xAE;
        al.lIllllllll[28] = -1;
        al.lIllllllll[29] = 0x5F ^ 0x7A;
        al.lIllllllll[30] = 0xCC ^ 0xC4;
        al.lIllllllll[31] = 0x16 ^ 0x25 ^ (0xE ^ 0x10);
        al.lIllllllll[32] = 0x9B ^ 0x92;
        al.lIllllllll[33] = 0xE ^ 4;
        al.lIllllllll[34] = 0x71 ^ 0x56 ^ (0x2D ^ 1);
        al.lIllllllll[35] = 0xFFFF9CFB & 0x6F5E;
        al.lIllllllll[36] = -(0xFFFFF1F7 & 0x3E49) & (0xFFFFBFDF & 0x7DFF);
        al.lIllllllll[37] = 0xC ^ 0;
        al.lIllllllll[38] = 0x64 ^ 0x5A ^ 1;
        al.lIllllllll[39] = 0x4B ^ 2 ^ (0x16 ^ 0x52);
        al.lIllllllll[40] = -(0xFFFFEFB7 & 0x58FF) & (0xFFFFDDF7 & 0x6BFE);
        al.lIllllllll[41] = 0xFFFFA232 & 0x5FDF;
        al.lIllllllll[42] = 0xFFFFCDFE & 0x3FAD;
        al.lIllllllll[43] = 0xAF ^ 0xA1;
        al.lIllllllll[44] = 0x52 ^ 0x14 ^ (0xD9 ^ 0x90);
        al.lIllllllll[45] = 0x49 ^ 0x31 ^ (0x2C ^ 0x44);
        al.lIllllllll[46] = 0xAF ^ 0xBE;
        al.lIllllllll[47] = 0x19 ^ 0xB;
        al.lIllllllll[48] = -(0xFFFFF2BF & 0x5FC1) & (0xFFFFFFED & 0x57F7);
        al.lIllllllll[49] = 6 ^ 0x15;
        al.lIllllllll[50] = -(0xFFFFDBE9 & 0x343F) & (0xFFFFBB7F & 0x55BC);
        al.lIllllllll[51] = 0xFFFFDF59 & 0x22F7;
        al.lIllllllll[52] = 0xFB ^ 0xB0 ^ (0xE4 ^ 0xB5);
        al.lIllllllll[53] = 0x35 ^ 0x21;
        al.lIllllllll[54] = 0 ^ 0x15;
        al.lIllllllll[55] = 97 + 24 - -33 + 47;
        al.lIllllllll[56] = 113 + 41 - 18 + 23 ^ 131 + 50 - 130 + 86;
        al.lIllllllll[57] = 0x76 ^ 0x61;
        al.lIllllllll[58] = 0x3F ^ 0x12 ^ (0x78 ^ 0x4D);
        al.lIllllllll[59] = 0xFFFFFBFE & 0x7E9;
        al.lIllllllll[60] = (0x24 ^ 0x3A) + (21 + 32 - -11 + 65) - (0x39 ^ 0x56) + (0x79 ^ 3);
        al.lIllllllll[61] = 0xFFFFCFB6 & 0x3FE9;
        al.lIllllllll[62] = 0xFFFFB7F0 & 0x4FDF;
        al.lIllllllll[63] = -(0xFFFFBD0D & 0x76F7) & (0xFFFFFFBF & 0x3FFC);
        al.lIllllllll[64] = 0xFFFFF3FD & 0x3CD6;
        al.lIllllllll[65] = -(0xFFFFDF3A & 0x60F7) & (0xFFFFFCFF & 0x7FBD);
        al.lIllllllll[66] = 0xBE ^ 0xC6;
        al.lIllllllll[67] = 135 + 105 - 191 + 101;
        al.lIllllllll[68] = 0xFFFFFABC & 0x3FDB;
        al.lIllllllll[69] = 0xEE ^ 0x8A;
        al.lIllllllll[70] = 0xFFFFEECD & 0x3FFE;
        al.lIllllllll[71] = -(0xFFFFD6D7 & 0x3F2D) & (0xFFFFF7AD & 0x7FFE);
        al.lIllllllll[72] = 0xFFFFBF77 & 0x5FCF;
        al.lIllllllll[73] = 0xFFFFA3BC & 0x5FC7;
        al.lIllllllll[74] = 0x8C ^ 0x97;
        al.lIllllllll[75] = 0x12 ^ 0x7A ^ (0xB2 ^ 0xC6);
        al.lIllllllll[76] = 98 + 46 - 78 + 108 ^ 28 + 63 - 35 + 123;
        al.lIllllllll[77] = 0xFFFFDFFF & 0x2BCE;
        al.lIllllllll[78] = -(0xFFFFA397 & 0x7C7D) & (0xFFFFADFF & 0x7EF7);
        al.lIllllllll[79] = 0xFFFFFBF7 & 0xFDF;
        al.lIllllllll[80] = 0xFFFFFDE9 & 0xEFF;
        al.lIllllllll[81] = 0xA1 ^ 0xBF;
    }

    private static boolean lIlIIIIlllIll(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIIllIIlI(String var5, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIllllllll[3], var8);
            return new String(var20.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIllIlII(String var19, String var12) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var1 = var12.toCharArray();
        int var6 = lIllllllll[0];
        char[] var17 = var19.toCharArray();
        int var2 = var17.length;
        int var7 = lIllllllll[0];
        while (al.lIlIIIIlllIII(var7, var2)) {
            char var9 = var17[var7];
            var18.append((char)(var9 ^ var1[var6 % var1.length]));
            0;
            ++var6;
            ++var7;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean lIlIIIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIlIIIIllllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
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
                                                    if (!al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21])) break block19;
                                                    int[] nArray = new int[lIllllllll[1]];
                                                    nArray[al.lIllllllll[0]] = lIllllllll[9];
                                                    if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIllllllll[1]];
                                                    nArray2[al.lIllllllll[0]] = lIllllllll[13];
                                                    if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIllllllll[1]];
                                                    nArray3[al.lIllllllll[0]] = lIllllllll[11];
                                                    if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIllllllll[1]];
                                                    nArray4[al.lIllllllll[0]] = lIllllllll[14];
                                                    if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIllllllll[1]];
                                                    nArray5[al.lIllllllll[0]] = lIllllllll[20];
                                                    if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIllllllll[1]];
                                                    nArray6[al.lIllllllll[0]] = lIllllllll[48];
                                                    if (!al.lIlIIIIlllIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIllllllll[1]];
                                                    nArray7[al.lIllllllll[0]] = lIllllllll[48];
                                                    if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIllllllll[1];
                                                0;
                                                if (null == null) return n5 != 0;
                                                return ((0xE1 ^ 0x9D ^ (0xC0 ^ 0xB6)) & (0x77 ^ 0x14 ^ (0x4E ^ 0x27) ^ -1)) != 0;
                                            }
                                            n5 = lIllllllll[0];
                                            return n5 != 0;
                                        }
                                        if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21]) || !al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) break block22;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[13];
                                        if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIllllllll[1]];
                                        nArray8[al.lIllllllll[0]] = lIllllllll[11];
                                        if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIllllllll[1]];
                                        nArray9[al.lIllllllll[0]] = lIllllllll[14];
                                        if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIllllllll[1]];
                                        nArray10[al.lIllllllll[0]] = lIllllllll[16];
                                        if (!al.lIlIIIIllIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIllllllll[1]];
                                        nArray11[al.lIllllllll[0]] = lIllllllll[48];
                                        if (!al.lIlIIIIlllIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIllllllll[1]];
                                        nArray12[al.lIllllllll[0]] = lIllllllll[48];
                                        if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIllllllll[1];
                                    0;
                                    if (1 < 3) return n4 != 0;
                                    return false;
                                }
                                n4 = lIllllllll[0];
                                return n4 != 0;
                            }
                            if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8]) || !al.lIlIIIIlllIIl(ci ? 1 : 0)) break block25;
                            int[] nArray = new int[lIllllllll[1]];
                            nArray[al.lIllllllll[0]] = lIllllllll[22];
                            if (!al.lIlIIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIllllllll[1]];
                            nArray13[al.lIllllllll[0]] = lIllllllll[22];
                            if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIllllllll[1]];
                        nArray[al.lIllllllll[0]] = lIllllllll[24];
                        if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIllllllll[1]];
                            nArray14[al.lIllllllll[0]] = lIllllllll[38];
                            if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIllllllll[1];
                                0;
                                if (-(7 ^ 2) < 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIllllllll[0];
                    return n3 != 0;
                }
                if (!al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8]) || !al.lIlIIIIllIlll(ci ? 1 : 0)) return lIllllllll[0];
                int[] nArray = new int[lIllllllll[1]];
                nArray[al.lIllllllll[0]] = lIllllllll[22];
                if (!al.lIlIIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIllllllll[1]];
                nArray15[al.lIllllllll[0]] = lIllllllll[22];
                if (!al.lIlIIIIllIlll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[16];
            if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIllllllll[1]];
                nArray16[al.lIllllllll[0]] = lIllllllll[23];
                if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIllllllll[1]];
                    nArray17[al.lIllllllll[0]] = lIllllllll[23];
                    if (al.lIlIIIIllllII(Inventory.getFirst((int[])nArray17).getQuantity(), lIllllllll[19])) {
                        int[] nArray18 = new int[lIllllllll[1]];
                        nArray18[al.lIllllllll[0]] = lIllllllll[24];
                        if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIllllllll[1]];
                            nArray19[al.lIllllllll[0]] = lIllllllll[38];
                            if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIllllllll[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((0x24 ^ 0x79 ^ (0xF3 ^ 0x81)) & (123 + 101 - 194 + 133 ^ 110 + 77 - 115 + 68 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllllllll[0];
        return n2 != 0;
    }

    private static boolean lIlIIIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public static boolean ap() {
        if (al.lIlIIIIllllIl(Vars.getBit((int)lIllllllll[50]), lIllllllll[1]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[19])) {
            return lIllllllll[1];
        }
        if (al.lIlIIIIllllIl(Vars.getBit((int)lIllllllll[50]), lIllllllll[3]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32]) && al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[19])) {
            return lIllllllll[1];
        }
        if (al.lIlIIIIllllIl(Vars.getBit((int)lIllllllll[50]), lIllllllll[4]) && al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[39])) {
            return lIllllllll[1];
        }
        if (al.lIlIIIIllllIl(Vars.getBit((int)lIllllllll[50]), lIllllllll[4]) && al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[32])) {
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[14];
            if (al.lIlIIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllllll[1];
            }
        }
        if (al.lIlIIIIllllIl(Vars.getBit((int)lIllllllll[50]), lIllllllll[7]) && al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[39])) {
            int[] nArray = new int[lIllllllll[1]];
            nArray[al.lIllllllll[0]] = lIllllllll[14];
            if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIllllllll[1];
            }
        }
        return lIllllllll[0];
    }

    @Override
    public int af() {
        try {
            al.ak();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 1) {
            return (0xF0 ^ 0xA7) & ~(0x6C ^ 0x3B);
        }
        return lIllllllll[69];
    }

    private static boolean lIlIIIIlllllI(Object object) {
        return object == null;
    }

    private static boolean lIlIIIIlllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIllllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[2])) {
            bl = lIllllllll[1];
            0;
            if (((0x2A ^ 0x65 ^ (0x2E ^ 0x67)) & (0x4A ^ 0x58 ^ (0x10 ^ 4) ^ -1)) > (111 + 14 - 65 + 94 ^ 79 + 50 - 80 + 109)) {
                return false;
            }
        } else {
            bl = lIllllllll[0];
        }
        return bl;
    }

    public static void ak() {
        if (al.lIlIIIIllIlll(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIlllllllI[lIllllllll[0]];
            b.a(bv);
            if (al.lIlIIIIlllIII(bv.size(), lIllllllll[1])) {
                System.out.println(lIlllllllI[lIllllllll[1]]);
                bt = lIllllllll[0];
            }
        }
        if (al.lIlIIIIlllIIl(bt ? 1 : 0) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[2])) {
            BankLocation var23;
            if (al.lIlIIIIlllIIl(al.an() ? 1 : 0)) {
                var23 = BankLocation.getNearest();
                if (al.lIlIIIIlllIlI(var23) && al.lIlIIIIlllIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[3]];
                    a.a(var23);
                }
                if (al.lIlIIIIlllIlI(var23) && al.lIlIIIIllIlll(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[4]];
                    if (al.lIlIIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllllllll[5]);
                        0;
                        Time.sleepTicks((int)lIllllllll[6]);
                        0;
                    }
                    if (al.lIlIIIIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (al.lIlIIIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllllllll[7]);
                            0;
                        }
                        while (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8]) && al.lIlIIIIlllIIl(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks((int)lIllllllll[1]);
                            0;
                            0;
                            if (2 > 0) continue;
                            return;
                        }
                        if (al.lIlIIIIlllIIl(al.ao() ? 1 : 0)) {
                            al.Q();
                            System.out.println(lIlllllllI[lIllllllll[7]]);
                            bt = lIllllllll[1];
                            return;
                        }
                        if (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
                            int[] nArray = new int[lIllllllll[1]];
                            nArray[al.lIllllllll[0]] = lIllllllll[9];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIllllllll[1]];
                                nArray2[al.lIllllllll[0]] = lIllllllll[9];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray2), lIllllllll[1])) {
                                    Bank.withdraw((int)lIllllllll[9], (int)lIllllllll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[9];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            if (((107 + 126 - 42 + 44 ^ 10 + 98 - 29 + 92) & (0x2E ^ 0x29 ^ (0x41 ^ 6) ^ -1)) <= -1) {
                                                return ((0x89 ^ 0xAC ^ (0x46 ^ 0x75)) & (0xA ^ 0x53 ^ (0x3F ^ 0x70) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIllllllll[1]];
                            nArray3[al.lIllllllll[0]] = lIllllllll[11];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIllllllll[1]];
                                nArray4[al.lIllllllll[0]] = lIllllllll[11];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray4), lIllllllll[1])) {
                                    Bank.withdraw((int)lIllllllll[11], (int)lIllllllll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[11];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            if ((2 & (2 ^ -1)) != 0) {
                                                return ((15 + 63 - -76 + 28 ^ 96 + 184 - 147 + 54) & (0x1F ^ 0xE ^ (0x73 ^ 0x6F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIllllllll[1]];
                            nArray5[al.lIllllllll[0]] = lIllllllll[13];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIllllllll[1]];
                                nArray6[al.lIllllllll[0]] = lIllllllll[13];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray6), lIllllllll[1])) {
                                    Bank.withdraw((int)lIllllllll[13], (int)lIllllllll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[13];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            if (-1 == (0x5B ^ 0x2F ^ (0x2D ^ 0x5D))) {
                                                return ((0x6C ^ 0x3D ^ (0xEB ^ 0xBC)) & (115 + 108 - 115 + 34 ^ 131 + 76 - 148 + 77 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIllllllll[1]];
                            nArray7[al.lIllllllll[0]] = lIllllllll[14];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIllllllll[1]];
                                nArray8[al.lIllllllll[0]] = lIllllllll[14];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray8), lIllllllll[1])) {
                                    Bank.withdraw((int)lIllllllll[14], (int)lIllllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[14];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIllllllll[1]];
                            nArray9[al.lIllllllll[0]] = lIllllllll[16];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIllllllll[1]];
                                nArray10[al.lIllllllll[0]] = lIllllllll[16];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray10), lIllllllll[1])) {
                                    Bank.withdraw((int)lIllllllll[16], (int)lIllllllll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[16];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            if (3 < -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIllllllll[1]];
                            nArray11[al.lIllllllll[0]] = lIllllllll[17];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIllllllll[1]];
                                nArray12[al.lIllllllll[0]] = lIllllllll[17];
                                if (al.lIlIIIIlllIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIllllllll[17], (int)lIllllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIllllllll[18], (int)lIllllllll[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIllllllll[1]];
                            nArray13[al.lIllllllll[0]] = lIllllllll[20];
                            if (al.lIlIIIIllIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIllllllll[1]];
                                nArray14[al.lIllllllll[0]] = lIllllllll[20];
                                if (al.lIlIIIIlllIII(Inventory.getCount((int[])nArray14), lIllllllll[1]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21])) {
                                    Bank.withdrawAll((int)lIllllllll[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIllllllll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIllllllll[1]];
                                        nArray[al.lIllllllll[0]] = lIllllllll[20];
                                        if (al.lIlIIIIlllIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIllllllll[1];
                                            0;
                                            if (((0xB7 ^ 0x82 ^ (0xEA ^ 0x92)) & (0x6F ^ 0x36 ^ (0x3E ^ 0x2A) ^ -1)) > 0) {
                                                return ((0xF4 ^ 0x90 ^ (0x1E ^ 0x5B)) & (128 + 40 - 137 + 126 ^ 105 + 111 - 43 + 15 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIllllllll[0];
                                        }
                                        return bl;
                                    }, (int)lIllllllll[5]);
                                    0;
                                }
                            }
                        }
                        if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
                            int[] nArray = new int[lIllllllll[1]];
                            nArray[al.lIllllllll[0]] = lIllllllll[22];
                            if (al.lIlIIIIlllIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIllllllll[22], (int)lIllllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllllll[1]);
                                0;
                            }
                            if (al.lIlIIIIllIlll(ci ? 1 : 0)) {
                                Bank.withdrawAll((int)lIllllllll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllllll[1]);
                                0;
                                Bank.withdrawAll((int)lIllllllll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIllllllll[1]);
                                0;
                            }
                            Time.sleepTicks((int)lIllllllll[4]);
                            0;
                            Bank.withdrawAll((int)lIllllllll[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIllllllll[1]);
                            0;
                            Bank.withdrawAll((int)lIllllllll[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIllllllll[1]);
                            0;
                        }
                    }
                }
            }
            if (al.lIlIIIIllIlll(al.an() ? 1 : 0)) {
                if (al.lIlIIIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21])) {
                    if (al.lIlIIIIlllIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllllI[lIllllllll[19]];
                        Movement.walkTo((WorldPoint)ck);
                        0;
                        Time.sleepTicks((int)lIllllllll[1]);
                        0;
                    }
                    if (al.lIlIIIIllIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIlllllllI[lIllllllll[6]];
                        al.am();
                    }
                }
                if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[21]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[26])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[27]];
                    if (al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIllllllll[1]);
                        0;
                    }
                }
                if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[26]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[29])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[30]];
                    if (al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIllllllll[1]);
                        0;
                    }
                }
                if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[29]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[31])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[32]];
                    if (al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIllllllll[1]);
                        0;
                    }
                }
                if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[31]) && al.lIlIIIIlllIII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[33]];
                    if (al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIllllllll[1]);
                        0;
                    }
                }
                if (al.lIlIIIIllllII(Skills.getLevel((Skill)Skill.MAGIC), lIllllllll[8])) {
                    int var15;
                    AccBuilderSotf.c = lIlllllllI[lIllllllll[34]];
                    if (al.lIlIIIIlllllI(cl)) {
                        cl = new WorldPoint(lIllllllll[35] + e.c(lIllllllll[1], lIllllllll[7]), lIllllllll[36], lIllllllll[0]);
                    }
                    int[] nArray = new int[lIllllllll[1]];
                    nArray[al.lIllllllll[0]] = lIllllllll[22];
                    if (al.lIlIIIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIllllllll[1]];
                        nArray15[al.lIllllllll[0]] = lIllllllll[22];
                        if (al.lIlIIIIlllIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIllllllll[1]];
                            nArray16[al.lIllllllll[0]] = lIllllllll[22];
                            Inventory.getFirst((int[])nArray16).interact(lIlllllllI[lIllllllll[37]]);
                            Time.sleepTicks((int)lIllllllll[1]);
                            0;
                        }
                    }
                    if (al.lIlIIIIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIllllllll[1]];
                    nArray17[al.lIllllllll[0]] = lIllllllll[24];
                    var23 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIllllllll[1]];
                    nArray18[al.lIllllllll[0]] = lIllllllll[38];
                    Item var24 = Inventory.getFirst((int[])nArray18);
                    if (al.lIlIIIIlllIIl(ci ? 1 : 0) && al.lIlIIIIlllIlI(cl)) {
                        if (al.lIlIIIIlllIIl(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllllllI[lIllllllll[39]];
                            Movement.walkTo((WorldPoint)cl);
                            0;
                            Time.sleepTicks((int)lIllllllll[1]);
                            0;
                        }
                        if (al.lIlIIIIllIlll(Players.getLocal().getWorldLocation().equals((Object)cl) ? 1 : 0) && al.lIlIIIIlllIlI(var23) && al.lIlIIIIlllIlI(var24)) {
                            var15 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var24);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (al.lIlIIIlIIIIlI(Skills.getExperience((Skill)Skill.MAGIC), var15)) {
                                    bl = lIllllllll[1];
                                    0;
                                    if (((91 + 69 - 2 + 32 ^ 52 + 46 - -15 + 23) & (90 + 79 - 136 + 142 ^ 24 + 82 - -12 + 35 ^ -1)) != 0) {
                                        return ((0x57 ^ 0x69 ^ (6 ^ 0x65)) & (0x50 ^ 0x6F ^ (0xC ^ 0x6E) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllllllll[0];
                                }
                                return bl;
                            }, (int)lIllllllll[10]);
                            0;
                            Time.sleep((long)e.c(lIllllllll[40], lIllllllll[41]));
                            0;
                        }
                    }
                    if (al.lIlIIIIllIlll(ci ? 1 : 0)) {
                        if (al.lIlIIIIlllIlI(var23) && al.lIlIIIIlllIlI(var24) && al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                            var15 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var24);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (al.lIlIIIlIIIIlI(Skills.getExperience((Skill)Skill.MAGIC), var15)) {
                                    bl = lIllllllll[1];
                                    0;
                                    if (3 == 0) {
                                        return ((0x14 ^ 0x37 ^ (0x8D ^ 0xB2)) & (0x61 ^ 0xD ^ (0x1A ^ 0x6A) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllllllll[0];
                                }
                                return bl;
                            }, (int)lIllllllll[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (al.lIlIIIIllllIl(Players.getLocal().getAnimation(), lIllllllll[28])) {
                                bl = lIllllllll[1];
                                0;
                                if ((0x91 ^ 0x95) <= -1) {
                                    return false;
                                }
                            } else {
                                bl = lIllllllll[0];
                            }
                            return bl;
                        }, (int)lIllllllll[42]);
                        0;
                    }
                }
            }
        }
    }
}

