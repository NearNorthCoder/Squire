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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ZHelper;
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

public class ADHelper
implements W {
    
    static  WorldPoint bx;
    
    public static  List<d> bv;
    public static  boolean bt;
    public static  boolean bu;
    static  WorldArea bw;
    static  WorldPoint by;

    private static void lIIllIllIllI() {
        lIlllIIll = new String[lIlllIlII[81]];
        ad.lIlllIIll[ad.lIlllIlII[0]] = "Buying items";
        ad.lIlllIIll[ad.lIlllIlII[1]] = "Finished buying items, switching back to magic training";
        ad.lIlllIIll[ad.lIlllIlII[2]] = "Navigating to bank";
        ad.lIlllIIll[ad.lIlllIlII[3]] = "Handling banking";
        ad.lIlllIIll[ad.lIlllIlII[6]] = "We are missing supplies, switching to BUYING";
        ad.lIlllIIll[ad.lIlllIlII[18]] = "Nav to cows";
        ad.lIlllIIll[ad.lIlllIlII[5]] = "Attacking cows";
        ad.lIlllIIll[ad.lIlllIlII[26]] = "Casting varrock tele";
        ad.lIlllIIll[ad.lIlllIlII[29]] = "Casting lumby tele";
        ad.lIlllIIll[ad.lIlllIlII[31]] = "Casting fally tele";
        ad.lIlllIIll[ad.lIlllIlII[32]] = "Casting cammy tele";
        ad.lIlllIIll[ad.lIlllIlII[33]] = "Alching";
        ad.lIlllIIll[ad.lIlllIlII[36]] = "Wield";
        ad.lIlllIIll[ad.lIlllIlII[38]] = "Move to alch spot";
        ad.lIlllIIll[ad.lIlllIlII[42]] = "Nav to cows";
        ad.lIlllIIll[ad.lIlllIlII[43]] = "Attacking cows";
        ad.lIlllIIll[ad.lIlllIlII[44]] = "Eat";
        ad.lIlllIIll[ad.lIlllIlII[45]] = "Cow";
        ad.lIlllIIll[ad.lIlllIlII[46]] = "cow";
        ad.lIlllIIll[ad.lIlllIlII[48]] = "Attack";
        ad.lIlllIIll[ad.lIlllIlII[52]] = "Opening autocast";
        ad.lIlllIIll[ad.lIlllIlII[53]] = "Choose spell";
        ad.lIlllIIll[ad.lIlllIlII[55]] = "Wind Strike";
        ad.lIlllIIll[ad.lIlllIlII[56]] = "Water Strike";
        ad.lIlllIIll[ad.lIlllIlII[57]] = "Earth Strike";
        ad.lIlllIIll[ad.lIlllIlII[20]] = "Earth Strike";
        ad.lIlllIIll[ad.lIlllIlII[51]] = "Fire Strike";
        ad.lIlllIIll[ad.lIlllIlII[73]] = "Magic training";
        ad.lIlllIIll[ad.lIlllIlII[75]] = "ring of wealth (";
        ad.lIlllIIll[ad.lIlllIlII[76]] = "Cow";
    }

    private static void aa() {
        if (ad.lIIlllIIIIIl(ad.lIIlllIIIIII(e.u(), 30.0))) {
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[19];
            if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlllIlII[1]];
                nArray2[ad.lIlllIlII[0]] = lIlllIlII[19];
                Inventory.getFirst((int[])nArray2).interact(lIlllIIll[lIlllIlII[44]]);
                Time.sleepTicks((int)lIlllIlII[1]);

            }
        }
        if (ad.lIIllIllllll(Players.getLocal().getInteracting())) {
            NPC llIIlIIlIIllIl = NPCs.getNearest(nPC -> {
                int n2;
                if (ad.lIIllIlllIII(nPC.getName().contains(lIlllIIll[lIlllIlII[76]]) ? 1 : 0) && ad.lIIllIlllIlI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlllIlII[1];

                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n2 = lIlllIlII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIlllIlII[2]];
            stringArray[ad.lIlllIlII[0]] = lIlllIIll[lIlllIlII[45]];
            stringArray[ad.lIlllIlII[1]] = lIlllIIll[lIlllIlII[46]];
            List llIIlIIlIIllII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ad.lIIlllIIIIlI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlllIlII[1];

                    }
                } else {
                    bl = lIlllIlII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[47];
            if (ad.lIIllIlllIII(Equipment.contains((int[])nArray) ? 1 : 0) && ad.lIIllIlllIlI(ad.ADHelper() ? 1 : 0)) {
                ad.ae();
            }
            if (ad.lIIllIlllIll(llIIlIIlIIllIl) && ad.lIIllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                llIIlIIlIIllIl.interact(lIlllIIll[lIlllIlII[48]]);
                Time.sleepTicks((int)lIlllIlII[3]);

            }
        }
    }

    private static boolean lIIllIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlllIll(Object object) {
        return object != null;
    }

    private static boolean lIIlllIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIllIlllIlI(int n2) {
        return n2 == 0;
    }

    public static boolean ADHelper() {
        if (ad.lIIllIlllllI(Vars.getBit((int)lIlllIlII[49]), lIlllIlII[1]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[18])) {
            return lIlllIlII[1];
        }
        if (ad.lIIllIlllllI(Vars.getBit((int)lIlllIlII[49]), lIlllIlII[2]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31]) && ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[18])) {
            return lIlllIlII[1];
        }
        if (ad.lIIllIlllllI(Vars.getBit((int)lIlllIlII[49]), lIlllIlII[3]) && ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[38])) {
            return lIlllIlII[1];
        }
        if (ad.lIIllIlllllI(Vars.getBit((int)lIlllIlII[49]), lIlllIlII[3]) && ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31])) {
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[13];
            if (ad.lIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlllIlII[1];
            }
        }
        if (ad.lIIllIlllllI(Vars.getBit((int)lIlllIlII[49]), lIlllIlII[6]) && ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[38])) {
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[13];
            if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlllIlII[1];
            }
        }
        return lIlllIlII[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[74])) {
            bl = lIlllIlII[1];

            if (-(0x13 ^ 0x58 ^ (0x24 ^ 0x6B)) > 0) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIlII[0];
        }
        return bl;
    }

    static {
        ad.lIIllIllIlll();
        ad.lIIllIllIllI();
        bu = lIlllIlII[0];
        bv = new ArrayList<d>();
        bw = new WorldArea(lIlllIlII[77], lIlllIlII[78], lIlllIlII[52], lIlllIlII[42], lIlllIlII[0]);
        bx = new WorldPoint(lIlllIlII[79], lIlllIlII[80], lIlllIlII[0]);
        by = null;
    }

    public static void ae() {
        if (ad.lIIllIlllIll(Widgets.get((int)lIlllIlII[50], (int)lIlllIlII[51]))) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[52]];
            Widgets.get((int)lIlllIlII[50], (int)lIlllIlII[51]).interact(lIlllIIll[lIlllIlII[53]]);
            Time.sleepTicks((int)lIlllIlII[6]);

        }
        if (ad.lIIllIllllll(Widgets.get((int)lIlllIlII[50], (int)lIlllIlII[51])) && ad.lIIllIlllIlI(Widgets.get((int)lIlllIlII[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIlllIlII[1]);

            if (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[18])) {
                Widgets.get((int)lIlllIlII[54], (int)lIlllIlII[1]).getChild(lIlllIlII[1]).interact(lIlllIIll[lIlllIlII[55]]);
            }
            if (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31]) && ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[18])) {
                Widgets.get((int)lIlllIlII[54], (int)lIlllIlII[1]).getChild(lIlllIlII[2]).interact(lIlllIIll[lIlllIlII[56]]);
            }
            if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[38])) {
                Widgets.get((int)lIlllIlII[54], (int)lIlllIlII[1]).getChild(lIlllIlII[3]).interact(lIlllIIll[lIlllIlII[57]]);
            }
            if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[31])) {
                int[] nArray = new int[lIlllIlII[1]];
                nArray[ad.lIlllIlII[0]] = lIlllIlII[13];
                if (ad.lIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlllIlII[54], (int)lIlllIlII[1]).getChild(lIlllIlII[3]).interact(lIlllIIll[lIlllIlII[20]]);
                }
            }
            if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[38])) {
                int[] nArray = new int[lIlllIlII[1]];
                nArray[ad.lIlllIlII[0]] = lIlllIlII[13];
                if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlllIlII[54], (int)lIlllIlII[1]).getChild(lIlllIlII[6]).interact(lIlllIIll[lIlllIlII[51]]);
                }
            }
            Time.sleepTicks((int)lIlllIlII[1]);

        }
    }

    private static void af() {
        d llIIlIIlIIlIII;
        Object llIIlIIlIIlIIl;
        if (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[15];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIlllIlII[15], lIlllIlII[58], lIlllIlII[59]);
                bv.add(d2);

            }
            int[] nArray2 = new int[lIlllIlII[1]];
            nArray2[ad.lIlllIlII[0]] = lIlllIlII[8];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[8], lIlllIlII[60], lIlllIlII[5]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray3 = new int[lIlllIlII[1]];
            nArray3[ad.lIlllIlII[0]] = lIlllIlII[10];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[10], lIlllIlII[61], lIlllIlII[5]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray4 = new int[lIlllIlII[1]];
            nArray4[ad.lIlllIlII[0]] = lIlllIlII[12];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[12], lIlllIlII[62], lIlllIlII[5]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray5 = new int[lIlllIlII[1]];
            nArray5[ad.lIlllIlII[0]] = lIlllIlII[13];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[13], lIlllIlII[4], lIlllIlII[5]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray6 = new int[lIlllIlII[1]];
            nArray6[ad.lIlllIlII[0]] = lIlllIlII[47];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[47], lIlllIlII[1], e.c(lIlllIlII[63], lIlllIlII[64]));
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
        }
        if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[23];
            if (ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIlllIlII[1]];
                nArray7[ad.lIlllIlII[0]] = lIlllIlII[23];
                if (ad.lIIllIlllIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlllIlII[62])) {
                    int[] nArray8 = new int[lIlllIlII[1]];
                    nArray8[ad.lIlllIlII[0]] = lIlllIlII[23];
                    llIIlIIlIIlIIl = new DHelper(lIlllIlII[23], lIlllIlII[62] - Bank.getFirst((int[])nArray8).getQuantity(), lIlllIlII[65]);
                    bv.add((DHelper) lIIlIIlIIlIIl);

                }
            }
            int[] nArray9 = new int[lIlllIlII[1]];
            nArray9[ad.lIlllIlII[0]] = lIlllIlII[23];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[23], lIlllIlII[62], lIlllIlII[65]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray10 = new int[lIlllIlII[1]];
            nArray10[ad.lIlllIlII[0]] = lIlllIlII[24];
            if (ad.lIIllIlllIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIlllIlII[1]];
                nArray11[ad.lIlllIlII[0]] = lIlllIlII[24];
                if (ad.lIIllIlllIIl(Bank.getFirst((int[])nArray11).getQuantity(), lIlllIlII[62])) {
                    int[] nArray12 = new int[lIlllIlII[1]];
                    nArray12[ad.lIlllIlII[0]] = lIlllIlII[24];
                    llIIlIIlIIlIIl = new DHelper(lIlllIlII[24], lIlllIlII[62] - Bank.getFirst((int[])nArray12).getQuantity(), lIlllIlII[66]);
                    bv.add((DHelper) lIIlIIlIIlIIl);

                }
            }
            int[] nArray13 = new int[lIlllIlII[1]];
            nArray13[ad.lIlllIlII[0]] = lIlllIlII[24];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llIIlIIlIIlIIl = new DHelper(lIlllIlII[24], lIlllIlII[62], lIlllIlII[66]);
                bv.add((DHelper) lIIlIIlIIlIIl);

            }
            int[] nArray14 = new int[lIlllIlII[1]];
            nArray14[ad.lIlllIlII[0]] = lIlllIlII[21];
            if (ad.lIIllIlllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlllIlII[1]];
                nArray15[ad.lIlllIlII[0]] = lIlllIlII[21];
                if (ad.lIIllIlllIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llIIlIIlIIlIIl = new DHelper(lIlllIlII[21], lIlllIlII[1], lIlllIlII[67]);
                    bv.add((DHelper) lIIlIIlIIlIIl);

                }
            }
            if (ad.lIIllIlllIII(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlII[1]];
                nArray16[ad.lIlllIlII[0]] = lIlllIlII[15];
                if (ad.lIIllIlllIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlII[1]];
                    nArray17[ad.lIlllIlII[0]] = lIlllIlII[15];
                    if (ad.lIIllIlllIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIlII[62])) {
                        int[] nArray18 = new int[lIlllIlII[1]];
                        nArray18[ad.lIlllIlII[0]] = lIlllIlII[15];
                        llIIlIIlIIlIIl = new DHelper(lIlllIlII[15], lIlllIlII[62] - Bank.getFirst((int[])nArray18).getQuantity(), lIlllIlII[59]);
                        bv.add((DHelper) lIIlIIlIIlIIl);

                    }
                }
                int[] nArray19 = new int[lIlllIlII[1]];
                nArray19[ad.lIlllIlII[0]] = lIlllIlII[15];
                if (ad.lIIllIlllIlI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llIIlIIlIIlIIl = new DHelper(lIlllIlII[15], lIlllIlII[62], lIlllIlII[59]);
                    bv.add((DHelper) lIIlIIlIIlIIl);

                }
                int[] nArray20 = new int[lIlllIlII[1]];
                nArray20[ad.lIlllIlII[0]] = lIlllIlII[22];
                if (ad.lIIllIlllIII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlllIlII[1]];
                    nArray21[ad.lIlllIlII[0]] = lIlllIlII[22];
                    if (ad.lIIllIlllIIl(Bank.getFirst((int[])nArray21).getQuantity(), lIlllIlII[67])) {
                        int[] nArray22 = new int[lIlllIlII[1]];
                        nArray22[ad.lIlllIlII[0]] = lIlllIlII[22];
                        llIIlIIlIIlIIl = new DHelper(lIlllIlII[22], lIlllIlII[67] - Bank.getFirst((int[])nArray22).getQuantity(), lIlllIlII[5]);
                        bv.add((DHelper) lIIlIIlIIlIIl);

                    }
                }
                int[] nArray23 = new int[lIlllIlII[1]];
                nArray23[ad.lIlllIlII[0]] = lIlllIlII[22];
                if (ad.lIIllIlllIlI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llIIlIIlIIlIIl = new DHelper(lIlllIlII[22], lIlllIlII[67], lIlllIlII[5]);
                    bv.add((DHelper) lIIlIIlIIlIIl);

                }
            }
        }
        int[] nArray = new int[lIlllIlII[1]];
        nArray[ad.lIlllIlII[0]] = lIlllIlII[19];
        if (ad.lIIllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIIlIIlIIlIIl = new DHelper(lIlllIlII[19], lIlllIlII[68], lIlllIlII[39]);
            bv.add((DHelper) lIIlIIlIIlIIl);

        }
        if (ad.lIIllIlllIlI(Bank.contains(llIIlIIlIIlIIl = item -> item.getName().toLowerCase().contains(lIlllIIll[lIlllIlII[75]])) ? 1 : 0)) {
            llIIlIIlIIlIII = new DHelper(lIlllIlII[69], lIlllIlII[18], lIlllIlII[70]);
            bv.add(llIIlIIlIIlIII);

        }
        int[] nArray24 = new int[lIlllIlII[1]];
        nArray24[ad.lIlllIlII[0]] = lIlllIlII[71];
        if (ad.lIIllIlllIlI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llIIlIIlIIlIII = new DHelper(lIlllIlII[71], lIlllIlII[32], lIlllIlII[72]);
            bv.add(llIIlIIlIIlIII);

        }
        int[] nArray25 = new int[lIlllIlII[1]];
        nArray25[ad.lIlllIlII[0]] = lIlllIlII[17];
        if (ad.lIIllIlllIlI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llIIlIIlIIlIII = new DHelper(lIlllIlII[17], lIlllIlII[32], lIlllIlII[72]);
            bv.add(llIIlIIlIIlIII);

        }
    }

    @Override
    public String U() {
        return lIlllIIll[lIlllIlII[73]];
    }

        return String.valueOf(llIIlIIIlIIlII);
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
                                                    if (!ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20])) break block19;
                                                    int[] nArray = new int[lIlllIlII[1]];
                                                    nArray[ad.lIlllIlII[0]] = lIlllIlII[8];
                                                    if (!ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlllIlII[1]];
                                                    nArray2[ad.lIlllIlII[0]] = lIlllIlII[12];
                                                    if (!ad.lIIllIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlllIlII[1]];
                                                    nArray3[ad.lIlllIlII[0]] = lIlllIlII[10];
                                                    if (!ad.lIIllIlllIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlllIlII[1]];
                                                    nArray4[ad.lIlllIlII[0]] = lIlllIlII[13];
                                                    if (!ad.lIIllIlllIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlllIlII[1]];
                                                    nArray5[ad.lIlllIlII[0]] = lIlllIlII[19];
                                                    if (!ad.lIIllIlllIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlllIlII[1]];
                                                    nArray6[ad.lIlllIlII[0]] = lIlllIlII[47];
                                                    if (!ad.lIIllIlllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlllIlII[1]];
                                                    nArray7[ad.lIlllIlII[0]] = lIlllIlII[47];
                                                    if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlllIlII[1];

                                                if (2 <= 2) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIlllIlII[0];
                                            return n5 != 0;
                                        }
                                        if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20]) || !ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) break block22;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[12];
                                        if (!ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlllIlII[1]];
                                        nArray8[ad.lIlllIlII[0]] = lIlllIlII[10];
                                        if (!ad.lIIllIlllIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlllIlII[1]];
                                        nArray9[ad.lIlllIlII[0]] = lIlllIlII[13];
                                        if (!ad.lIIllIlllIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlllIlII[1]];
                                        nArray10[ad.lIlllIlII[0]] = lIlllIlII[15];
                                        if (!ad.lIIllIlllIII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlllIlII[1]];
                                        nArray11[ad.lIlllIlII[0]] = lIlllIlII[47];
                                        if (!ad.lIIllIlllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlllIlII[1]];
                                        nArray12[ad.lIlllIlII[0]] = lIlllIlII[47];
                                        if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlllIlII[1];

                                    if ((0xAF ^ 0xBE ^ (0xAD ^ 0xB8)) >= 0) return n4 != 0;
                                    return ((0x11 ^ 0x4F ^ (0x47 ^ 0x26)) & (2 + 94 - 2 + 39 ^ 22 + 92 - 37 + 109 ^ -1)) != 0;
                                }
                                n4 = lIlllIlII[0];
                                return n4 != 0;
                            }
                            if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7]) || !ad.lIIllIlllIlI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlllIlII[1]];
                            nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                            if (!ad.lIIllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlllIlII[1]];
                            nArray13[ad.lIlllIlII[0]] = lIlllIlII[21];
                            if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlllIlII[1]];
                        nArray[ad.lIlllIlII[0]] = lIlllIlII[23];
                        if (ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlllIlII[1]];
                            nArray14[ad.lIlllIlII[0]] = lIlllIlII[24];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlllIlII[1];

                                if (null == null) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlllIlII[0];
                    return n3 != 0;
                }
                if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7]) || !ad.lIIllIlllIII(bu ? 1 : 0)) return lIlllIlII[0];
                int[] nArray = new int[lIlllIlII[1]];
                nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                if (!ad.lIIllIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlllIlII[1]];
                nArray15[ad.lIlllIlII[0]] = lIlllIlII[21];
                if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[15];
            if (ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlII[1]];
                nArray16[ad.lIlllIlII[0]] = lIlllIlII[22];
                if (ad.lIIllIlllIII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlII[1]];
                    nArray17[ad.lIlllIlII[0]] = lIlllIlII[22];
                    if (ad.lIIllIllllIl(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIlII[18])) {
                        int[] nArray18 = new int[lIlllIlII[1]];
                        nArray18[ad.lIlllIlII[0]] = lIlllIlII[23];
                        if (ad.lIIllIlllIII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlllIlII[1]];
                            nArray19[ad.lIlllIlII[0]] = lIlllIlII[24];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlllIlII[1];

                                if (1 <= 3) return n2 != 0;
                                return ((0x71 ^ 0x1B ^ (0x6D ^ 0x27)) & (91 + 88 - 120 + 89 ^ 154 + 170 - 237 + 93 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlllIlII[0];
        return n2 != 0;
    }

    private static boolean lIIlllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIllIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        try {
            ad.Y();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIlllIlII[68];
    }

    public static void Y() {
        if (ad.lIIllIlllIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[0]];
            b.a(bv);
            if (ad.lIIllIlllIIl(bv.size(), lIlllIlII[1])) {
                System.out.println(lIlllIIll[lIlllIlII[1]]);
                bt = lIlllIlII[0];
            }
        }
        if (ad.lIIllIlllIlI(bt ? 1 : 0)) {
            BankLocation llIIlIIlIlIIlI;
            if (ad.lIIllIlllIlI(ad.ab() ? 1 : 0)) {
                llIIlIIlIlIIlI = BankLocation.getNearest();
                if (ad.lIIllIlllIll(llIIlIIlIlIIlI) && ad.lIIllIlllIlI(llIIlIIlIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[2]];
                    a.a(llIIlIIlIlIIlI);
                }
                if (ad.lIIllIlllIll(llIIlIIlIlIIlI) && ad.lIIllIlllIII(llIIlIIlIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[3]];
                    if (ad.lIIllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlII[4]);

                        Time.sleepTicks((int)lIlllIlII[5]);

                    }
                    if (ad.lIIllIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (ad.lIIllIllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIlII[6]);

                        }
                        while (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7]) && ad.lIIllIlllIlI(z.bi() ? 1 : 0)) {
                            z.bg();
                            Time.sleepTicks((int)lIlllIlII[1]);

                            if (1 == 1) continue;
                            return;
                        }
                        if (ad.lIIllIlllIlI(ad.ac() ? 1 : 0)) {
                            ad.af();
                            System.out.println(lIlllIIll[lIlllIlII[6]]);
                            bt = lIlllIlII[1];
                            return;
                        }
                        if (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
                            int[] nArray = new int[lIlllIlII[1]];
                            nArray[ad.lIlllIlII[0]] = lIlllIlII[8];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlllIlII[1]];
                                nArray2[ad.lIlllIlII[0]] = lIlllIlII[8];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray2), lIlllIlII[1])) {
                                    Bank.withdraw((int)lIlllIlII[8], (int)lIlllIlII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[8];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            if ((0x68 ^ 0x7E ^ (0x51 ^ 0x43)) < 2) {
                                                return ((163 + 56 - 187 + 137 ^ 103 + 129 - 108 + 25) & (0x99 ^ 0x88 ^ (0x9A ^ 0xB7) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            int[] nArray3 = new int[lIlllIlII[1]];
                            nArray3[ad.lIlllIlII[0]] = lIlllIlII[10];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlllIlII[1]];
                                nArray4[ad.lIlllIlII[0]] = lIlllIlII[10];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray4), lIlllIlII[1])) {
                                    Bank.withdraw((int)lIlllIlII[10], (int)lIlllIlII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[10];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            if ((0x67 ^ 0x63) < 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            int[] nArray5 = new int[lIlllIlII[1]];
                            nArray5[ad.lIlllIlII[0]] = lIlllIlII[12];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlllIlII[1]];
                                nArray6[ad.lIlllIlII[0]] = lIlllIlII[12];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray6), lIlllIlII[1])) {
                                    Bank.withdraw((int)lIlllIlII[12], (int)lIlllIlII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[12];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            if (1 >= (0x78 ^ 0x7C)) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            int[] nArray7 = new int[lIlllIlII[1]];
                            nArray7[ad.lIlllIlII[0]] = lIlllIlII[13];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlllIlII[1]];
                                nArray8[ad.lIlllIlII[0]] = lIlllIlII[13];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray8), lIlllIlII[1])) {
                                    Bank.withdraw((int)lIlllIlII[13], (int)lIlllIlII[14], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[13];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            if (2 <= -1) {
                                                return ((51 + 2 - -113 + 16 ^ 65 + 74 - 104 + 101) & (7 ^ 0x79 ^ (0x52 ^ 0x12) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            int[] nArray9 = new int[lIlllIlII[1]];
                            nArray9[ad.lIlllIlII[0]] = lIlllIlII[15];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlllIlII[1]];
                                nArray10[ad.lIlllIlII[0]] = lIlllIlII[15];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray10), lIlllIlII[1])) {
                                    Bank.withdraw((int)lIlllIlII[15], (int)lIlllIlII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[15];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            if (3 <= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            int[] nArray11 = new int[lIlllIlII[1]];
                            nArray11[ad.lIlllIlII[0]] = lIlllIlII[16];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIlllIlII[1]];
                                nArray12[ad.lIlllIlII[0]] = lIlllIlII[16];
                                if (ad.lIIllIlllIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlllIlII[16], (int)lIlllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[16];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                            Bank.withdraw((int)lIlllIlII[17], (int)lIlllIlII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIlllIlII[1]];
                            nArray13[ad.lIlllIlII[0]] = lIlllIlII[19];
                            if (ad.lIIllIlllIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIlllIlII[1]];
                                nArray14[ad.lIlllIlII[0]] = lIlllIlII[19];
                                if (ad.lIIllIlllIIl(Inventory.getCount((int[])nArray14), lIlllIlII[1]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20])) {
                                    Bank.withdrawAll((int)lIlllIlII[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIlII[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[19];
                                        if (ad.lIIllIllllII(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIlII[1];

                                            }
                                        } else {
                                            bl = lIlllIlII[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIlII[4]);

                                }
                            }
                        }
                        if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
                            int[] nArray = new int[lIlllIlII[1]];
                            nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                            if (ad.lIIllIlllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIlllIlII[21], (int)lIlllIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlII[1]);

                            }
                            if (ad.lIIllIlllIII(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIlllIlII[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlII[1]);

                                Bank.withdrawAll((int)lIlllIlII[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlllIlII[1]);

                            }
                            Time.sleepTicks((int)lIlllIlII[3]);

                            Bank.withdrawAll((int)lIlllIlII[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlllIlII[1]);

                            Bank.withdrawAll((int)lIlllIlII[24], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIlllIlII[1]);

                        }
                    }
                }
            }
            if (ad.lIIllIlllIII(ad.ab() ? 1 : 0)) {
                if (ad.lIIllIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20])) {
                    if (ad.lIIllIlllIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[18]];
                        Movement.walkTo((WorldPoint)bx);

                        Time.sleepTicks((int)lIlllIlII[1]);

                    }
                    if (ad.lIIllIlllIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[5]];
                        ad.aa();
                    }
                }
                if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[25])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[26]];
                    if (ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIlllIlII[1]);

                    }
                }
                if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[25]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[28])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[29]];
                    if (ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIlllIlII[1]);

                    }
                }
                if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[28]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[30])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[31]];
                    if (ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIlllIlII[1]);

                    }
                }
                if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[30]) && ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[32]];
                    if (ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIlllIlII[1]);

                    }
                }
                if (ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) {
                    int llIIlIIlIlIIII;
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[33]];
                    if (ad.lIIllIllllll(by)) {
                        by = new WorldPoint(lIlllIlII[34] + e.c(lIlllIlII[1], lIlllIlII[6]), lIlllIlII[35], lIlllIlII[0]);
                    }
                    int[] nArray = new int[lIlllIlII[1]];
                    nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                    if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIlllIlII[1]];
                        nArray15[ad.lIlllIlII[0]] = lIlllIlII[21];
                        if (ad.lIIllIlllIlI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIlllIlII[1]];
                            nArray16[ad.lIlllIlII[0]] = lIlllIlII[21];
                            Inventory.getFirst((int[])nArray16).interact(lIlllIIll[lIlllIlII[36]]);
                            Time.sleepTicks((int)lIlllIlII[1]);

                        }
                    }
                    if (ad.lIIllIlllIII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIlllIlII[1]];
                    nArray17[ad.lIlllIlII[0]] = lIlllIlII[23];
                    llIIlIIlIlIIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIlllIlII[1]];
                    nArray18[ad.lIlllIlII[0]] = lIlllIlII[37];
                    Item llIIlIIlIlIIIl = Inventory.getFirst((int[])nArray18);
                    if (ad.lIIllIlllIlI(bu ? 1 : 0) && ad.lIIllIlllIll(by)) {
                        if (ad.lIIllIlllIlI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[38]];
                            Movement.walkTo((WorldPoint)by);

                            Time.sleepTicks((int)lIlllIlII[1]);

                        }
                        if (ad.lIIllIlllIII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && ad.lIIllIlllIll(llIIlIIlIlIIlI) && ad.lIIllIlllIll(llIIlIIlIlIIIl)) {
                            llIIlIIlIlIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIIlIIlIlIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ad.lIIlllIIIIll(Skills.getExperience((Skill)Skill.MAGIC), llIIlIIlIlIIII)) {
                                    bl = lIlllIlII[1];

                                    if (3 < 3) {
                                        return ((0x33 ^ 0x43 ^ (0xEF ^ 0x97)) & (132 + 14 - 45 + 64 ^ 116 + 71 - 36 + 22 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlllIlII[0];
                                }
                                return bl;
                            }, (int)lIlllIlII[9]);

                            Time.sleep((long)e.c(lIlllIlII[39], lIlllIlII[40]));

                        }
                    }
                    if (ad.lIIllIlllIII(bu ? 1 : 0)) {
                        if (ad.lIIllIlllIll(llIIlIIlIlIIlI) && ad.lIIllIlllIll(llIIlIIlIlIIIl) && ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                            llIIlIIlIlIIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIIlIIlIlIIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ad.lIIlllIIIIll(Skills.getExperience((Skill)Skill.MAGIC), llIIlIIlIlIIII)) {
                                    bl = lIlllIlII[1];

                                    if (-1 == (0x3E ^ 0x3A)) {
                                        return (1 & ~1) != 0;
                                    }
                                } else {
                                    bl = lIlllIlII[0];
                                }
                                return bl;
                            }, (int)lIlllIlII[9]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ad.lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                                bl = lIlllIlII[1];

                                }
                            } else {
                                bl = lIlllIlII[0];
                            }
                            return bl;
                        }, (int)lIlllIlII[41]);

                    }
                }
            }
        }
    }

    public static void Z() {
        if (ad.lIIllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ad.lIIllIlllIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[42]];
            Movement.walkTo((WorldPoint)bx);

            Time.sleepTicks((int)lIlllIlII[1]);

        }
        if (ad.lIIllIlllIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[43]];
            ad.aa();
        }
    }

    private static boolean lIIllIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

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
                                                    if (!ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20])) break block19;
                                                    int[] nArray = new int[lIlllIlII[1]];
                                                    nArray[ad.lIlllIlII[0]] = lIlllIlII[8];
                                                    if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlllIlII[1]];
                                                    nArray2[ad.lIlllIlII[0]] = lIlllIlII[12];
                                                    if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlllIlII[1]];
                                                    nArray3[ad.lIlllIlII[0]] = lIlllIlII[10];
                                                    if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlllIlII[1]];
                                                    nArray4[ad.lIlllIlII[0]] = lIlllIlII[13];
                                                    if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlllIlII[1]];
                                                    nArray5[ad.lIlllIlII[0]] = lIlllIlII[19];
                                                    if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlllIlII[1]];
                                                    nArray6[ad.lIlllIlII[0]] = lIlllIlII[47];
                                                    if (!ad.lIIllIlllIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlllIlII[1]];
                                                    nArray7[ad.lIlllIlII[0]] = lIlllIlII[47];
                                                    if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlllIlII[1];

                                                if (null == null) return n5 != 0;
                                                return ((0xB0 ^ 0xA4 ^ (0x90 ^ 0xA1)) & (161 + 123 - 117 + 23 ^ 25 + 19 - -11 + 100 ^ -1)) != 0;
                                            }
                                            n5 = lIlllIlII[0];
                                            return n5 != 0;
                                        }
                                        if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[20]) || !ad.lIIllIlllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7])) break block22;
                                        int[] nArray = new int[lIlllIlII[1]];
                                        nArray[ad.lIlllIlII[0]] = lIlllIlII[12];
                                        if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlllIlII[1]];
                                        nArray8[ad.lIlllIlII[0]] = lIlllIlII[10];
                                        if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlllIlII[1]];
                                        nArray9[ad.lIlllIlII[0]] = lIlllIlII[13];
                                        if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlllIlII[1]];
                                        nArray10[ad.lIlllIlII[0]] = lIlllIlII[15];
                                        if (!ad.lIIllIlllIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlllIlII[1]];
                                        nArray11[ad.lIlllIlII[0]] = lIlllIlII[47];
                                        if (!ad.lIIllIlllIlI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlllIlII[1]];
                                        nArray12[ad.lIlllIlII[0]] = lIlllIlII[47];
                                        if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlllIlII[1];

                                    if (-1 != 1) return n4 != 0;
                                    return ((64 + 67 - 76 + 110 ^ 90 + 2 - 55 + 140) & (0x79 ^ 9 ^ (0xC ^ 0x68) ^ -1)) != 0;
                                }
                                n4 = lIlllIlII[0];
                                return n4 != 0;
                            }
                            if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7]) || !ad.lIIllIlllIlI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlllIlII[1]];
                            nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                            if (!ad.lIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlllIlII[1]];
                            nArray13[ad.lIlllIlII[0]] = lIlllIlII[21];
                            if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlllIlII[1]];
                        nArray[ad.lIlllIlII[0]] = lIlllIlII[23];
                        if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlllIlII[1]];
                            nArray14[ad.lIlllIlII[0]] = lIlllIlII[37];
                            if (ad.lIIllIlllIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlllIlII[1];

                                if (-1 != 2) return n3 != 0;
                                return ((0x57 ^ 0x14 ^ (0x70 ^ 0x1C)) & (0x62 ^ 0x45 ^ (0x55 ^ 0x5D) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIlllIlII[0];
                    return n3 != 0;
                }
                if (!ad.lIIllIllllIl(Skills.getLevel((Skill)Skill.MAGIC), lIlllIlII[7]) || !ad.lIIllIlllIII(bu ? 1 : 0)) return lIlllIlII[0];
                int[] nArray = new int[lIlllIlII[1]];
                nArray[ad.lIlllIlII[0]] = lIlllIlII[21];
                if (!ad.lIIllIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlllIlII[1]];
                nArray15[ad.lIlllIlII[0]] = lIlllIlII[21];
                if (!ad.lIIllIlllIII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlllIlII[1]];
            nArray[ad.lIlllIlII[0]] = lIlllIlII[15];
            if (ad.lIIllIlllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlII[1]];
                nArray16[ad.lIlllIlII[0]] = lIlllIlII[22];
                if (ad.lIIllIlllIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIlII[1]];
                    nArray17[ad.lIlllIlII[0]] = lIlllIlII[22];
                    if (ad.lIIllIllllIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIlllIlII[18])) {
                        int[] nArray18 = new int[lIlllIlII[1]];
                        nArray18[ad.lIlllIlII[0]] = lIlllIlII[23];
                        if (ad.lIIllIlllIII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlllIlII[1]];
                            nArray19[ad.lIlllIlII[0]] = lIlllIlII[37];
                            if (ad.lIIllIlllIII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlllIlII[1];

                                if (((0x24 ^ 0xA ^ (0x1D ^ 0x2B)) & (143 + 187 - 267 + 154 ^ 90 + 78 - 28 + 53 ^ -1)) == 0) return n2 != 0;
                                return ((118 + 22 - 88 + 94 ^ 118 + 129 - 228 + 131) & (0x4A ^ 3 ^ (0x2D ^ 0x60) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlllIlII[0];
        return n2 != 0;
    }

    private static int lIIlllIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIlllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIllllll(Object object) {
        return object == null;
    }

    private static boolean lIIllIllllII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlllIlII[0];
    }
}

