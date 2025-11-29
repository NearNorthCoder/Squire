/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AJHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class WHelper
implements W {
    public static  boolean bt;
    private static  WorldPoint cZ;
    private static  WorldPoint dc;
    public static  List<d> bv;
    
    private static  WorldPoint db;
    private static  int dd;
    static  String[] bR;
    static  boolean cX;
    static  int cl;
    private static  WorldPoint da;
    
    private static  WorldPoint bX;
    private static  WorldPoint cY;
    static  boolean cm;
    static  WorldArea cW;

    public static void aT() {
        if (w.lIIllIIIIIIl(Skills.getLevel((Skill)Skill.FISHING), lIllIlIII[0])) {
            aj.ef();
        }
        if (w.lIIllIIIIIlI(Skills.getLevel((Skill)Skill.FISHING), lIllIlIII[0])) {
            if (w.lIIllIIIIIll(bt ? 1 : 0)) {
                b.a(bv);
                if (w.lIIllIIIIIIl(bv.size(), lIllIlIII[1])) {
                    System.out.println(lIllIIlll[lIllIlIII[2]]);
                    bt = lIllIlIII[2];
                }
            }
            if (w.lIIllIIIIlII(bt ? 1 : 0)) {
                if (w.lIIllIIIIlII(w.ab() ? 1 : 0) && w.lIIllIIIIIIl(e.j(dd), lIllIlIII[1])) {
                    String[] stringArray = new String[lIllIlIII[1]];
                    stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[1]];
                    if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation llIllIIlllIlII = BankLocation.getNearest();
                        if (w.lIIllIIIIlIl(llIllIIlllIlII) && w.lIIllIIIIlII(llIllIIlllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[3]];
                            a.a(llIllIIlllIlII);
                        }
                        if (w.lIIllIIIIlIl(llIllIIlllIlII) && w.lIIllIIIIIll(llIllIIlllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (w.lIIllIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlIII[4]);

                            }
                            if (w.lIIllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[5]];
                                if (w.lIIllIIIIllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIllIlIII[6]);

                                }
                                if (w.lIIllIIIIllI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIllIlIII[3]);

                                }
                                int[] nArray = new int[lIllIlIII[7]];
                                nArray[w.lIllIlIII[2]] = lIllIlIII[8];
                                nArray[w.lIllIlIII[1]] = lIllIlIII[9];
                                nArray[w.lIllIlIII[3]] = lIllIlIII[10];
                                nArray[w.lIllIlIII[5]] = lIllIlIII[11];
                                nArray[w.lIllIlIII[6]] = lIllIlIII[12];
                                nArray[w.lIllIlIII[13]] = lIllIlIII[14];
                                nArray[w.lIllIlIII[15]] = lIllIlIII[16];
                                if (w.lIIllIIIIlII(e.b(nArray) ? 1 : 0)) {
                                    w.af();
                                    System.out.println(lIllIIlll[lIllIlIII[6]]);
                                    bt = lIllIlIII[1];
                                    return;
                                }
                                int[] nArray2 = new int[lIllIlIII[15]];
                                nArray2[w.lIllIlIII[2]] = lIllIlIII[8];
                                nArray2[w.lIllIlIII[1]] = lIllIlIII[9];
                                nArray2[w.lIllIlIII[3]] = lIllIlIII[10];
                                nArray2[w.lIllIlIII[5]] = lIllIlIII[11];
                                nArray2[w.lIllIlIII[6]] = lIllIlIII[12];
                                nArray2[w.lIllIlIII[13]] = lIllIlIII[14];
                                if (w.lIIllIIIIIll(e.b(nArray2) ? 1 : 0)) {
                                    a.a(lIllIlIII[8], lIllIlIII[0]);
                                    a.a(lIllIlIII[14], lIllIlIII[0]);
                                    a.a(lIllIlIII[9], lIllIlIII[1]);
                                    a.a(lIllIlIII[10], lIllIlIII[1]);
                                    a.a(lIllIlIII[11], lIllIlIII[0]);
                                    a.a(lIllIlIII[12], lIllIlIII[1]);
                                    a.a(lIllIlIII[16], lIllIlIII[5]);
                                    a.a(lIllIlIII[17], lIllIlIII[18]);
                                }
                            }
                        }
                    }
                }
                if (w.lIIllIIIIIll(Inventory.contains((int[])f.aV) ? 1 : 0) && w.lIIllIIIIIIl(Movement.getRunEnergy(), lIllIlIII[19])) {
                    Inventory.getFirst((int[])f.aV).interact(lIllIIlll[lIllIlIII[13]]);
                    Time.sleepTicks((int)lIllIlIII[1]);

                }
                if (w.lIIllIIIIIll(w.ab() ? 1 : 0) && w.lIIllIIIIIIl(e.j(dd), lIllIlIII[1])) {
                    int[] nArray = new int[lIllIlIII[1]];
                    nArray[w.lIllIlIII[2]] = lIllIlIII[20];
                    if (w.lIIllIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (w.lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[0])) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[15]];
                            if (w.lIIllIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)bX);

                            Time.sleepTicks((int)lIllIlIII[1]);

                        }
                        if (w.lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[21])) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[7]];
                            g.a(lIllIIlll[lIllIlIII[22]], bR);
                        }
                    }
                }
                if (w.lIIllIIIlIIl(e.j(dd), lIllIlIII[1])) {
                    int[] nArray = new int[lIllIlIII[1]];
                    nArray[w.lIllIlIII[2]] = lIllIlIII[20];
                    if (w.lIIllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIlIII[1]];
                        stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[23]];
                        if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            cl = lIllIlIII[2];
                            String[] stringArray2 = new String[lIllIlIII[1]];
                            stringArray2[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[0]];
                            if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (w.lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(cZ), lIllIlIII[6])) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[24]];
                                    Movement.walkTo((WorldPoint)cZ);

                                }
                                if (w.lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIllIlIII[6])) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[21]];
                                    String[] stringArray3 = new String[lIllIlIII[1]];
                                    stringArray3[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[25]];
                                    if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIllIlIII[1]];
                                        stringArray4[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[26]];
                                        if (w.lIIllIIIIlIl(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[lIllIlIII[1]];
                                            stringArray5[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(lIllIIlll[lIllIlIII[28]]);
                                            Time.sleepTicks((int)lIllIlIII[3]);

                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[lIllIlIII[1]];
                            stringArray6[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[29]];
                            if (w.lIIllIIIIIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (w.lIIllIIIIlII(cW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[30]];
                                    if (w.lIIllIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)dc);

                                        Time.sleepTicks((int)lIllIlIII[1]);

                                    }
                                    g.a(bR);
                                }
                                if (w.lIIllIIIIIll(cW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[lIllIlIII[1]];
                                    stringArray7[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[31]];
                                    if (w.lIIllIIIIIll(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[32]];
                                        String[] stringArray8 = new String[lIllIlIII[1]];
                                        stringArray8[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[33]];
                                        if (w.lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), lIllIlIII[3])) {
                                            String[] stringArray9 = new String[lIllIlIII[1]];
                                            stringArray9[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());

                                            Time.sleepTicks((int)lIllIlIII[6]);

                                        }
                                        if (w.lIIllIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[lIllIlIII[1]];
                                            stringArray10[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[35]];
                                            String[] stringArray11 = new String[lIllIlIII[1]];
                                            stringArray11[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)lIllIlIII[3]);

                                        }
                                        g.a(bR);
                                    }
                                    String[] stringArray12 = new String[lIllIlIII[1]];
                                    stringArray12[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[37]];
                                    if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray12) ? 1 : 0) && w.lIIllIIIIlII(cX ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[38]];
                                        g.a(lIllIIlll[lIllIlIII[20]], bR);
                                        if (w.lIIllIIIIIll(Dialog.getText().contains(lIllIIlll[lIllIlIII[39]]) ? 1 : 0)) {
                                            cX = lIllIlIII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (w.lIIllIIIlIIl(e.j(dd), lIllIlIII[5])) {
                    String[] stringArray = new String[lIllIlIII[1]];
                    stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[40]];
                    if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[lIllIlIII[1]];
                        stringArray13[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[41]];
                        if (w.lIIllIIIIlII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[42]];
                            int[] nArray = new int[lIllIlIII[1]];
                            nArray[w.lIllIlIII[2]] = lIllIlIII[43];
                            NPCs.getNearest((int[])nArray).interact(lIllIIlll[lIllIlIII[44]]);
                            Time.sleepTicks((int)lIllIlIII[13]);

                        }
                    }
                    String[] stringArray14 = new String[lIllIlIII[1]];
                    stringArray14[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[45]];
                    if (w.lIIllIIIIIll(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[46]];
                        g.a(lIllIIlll[lIllIlIII[47]], bR);
                    }
                }
                String[] stringArray = new String[lIllIlIII[1]];
                stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[48]];
                if (w.lIIllIIIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (w.lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[13])) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[49]];
                        Movement.walkTo((WorldPoint)bX);

                        Time.sleepTicks((int)lIllIlIII[1]);

                    }
                    if (w.lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[13])) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[50]];
                        if (w.lIIllIIIIIIl(cl, lIllIlIII[1])) {
                            an.mQ += lIllIlIII[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllIlIII[1];
                            an.mQ = lIllIlIII[2];
                            cm = lIllIlIII[2];
                        }
                        g.a(lIllIIlll[lIllIlIII[51]], bR);
                    }
                }
            }
        }
    }

        return String.valueOf(llIllIIllIIIIl);
    }

    private static boolean lIIllIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlllllIl() {
        lIllIIlll = new String[lIllIlIII[86]];
        w.lIllIIlll[w.lIllIlIII[2]] = "Finished buying items, switching back to quest";
        w.lIllIIlll[w.lIllIlIII[1]] = "Fishing pass";
        w.lIllIIlll[w.lIllIlIII[3]] = "Nav to bank";
        w.lIllIIlll[w.lIllIlIII[5]] = "Handling banking";
        w.lIllIIlll[w.lIllIlIII[6]] = "We are missing quest supplies, switching to BUYING";
        w.lIllIIlll[w.lIllIlIII[13]] = "Drink";
        w.lIllIIlll[w.lIllIlIII[15]] = "Nav to start";
        w.lIllIIlll[w.lIllIlIII[7]] = "Starting quest";
        w.lIllIIlll[w.lIllIlIII[22]] = "Vestri";
        w.lIllIIlll[w.lIllIlIII[23]] = "Fishing trophy";
        w.lIllIIlll[w.lIllIlIII[0]] = "Red vine worm";
        w.lIllIIlll[w.lIllIlIII[24]] = "Nav to vine";
        w.lIllIIlll[w.lIllIlIII[21]] = "Digging";
        w.lIllIIlll[w.lIllIlIII[25]] = "Red vine worm";
        w.lIllIIlll[w.lIllIlIII[26]] = "Vine";
        w.lIllIIlll[w.lIllIlIII[27]] = "Vine";
        w.lIllIIlll[w.lIllIlIII[28]] = "Check";
        w.lIllIIlll[w.lIllIlIII[29]] = "Red vine worm";
        w.lIllIIlll[w.lIllIlIII[30]] = "Nav to contest";
        w.lIllIIlll[w.lIllIlIII[31]] = "Garlic";
        w.lIllIIlll[w.lIllIlIII[32]] = "Using garlic";
        w.lIllIIlll[w.lIllIlIII[33]] = "Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[34]] = "Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[35]] = "Garlic";
        w.lIllIIlll[w.lIllIlIII[36]] = "Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[37]] = "Garlic";
        w.lIllIIlll[w.lIllIlIII[38]] = "Start contest";
        w.lIllIIlll[w.lIllIlIII[20]] = "Bonzo";
        w.lIllIIlll[w.lIllIlIII[39]] = "I might still be able to find a bigger fish";
        w.lIllIIlll[w.lIllIlIII[40]] = "Garlic";
        w.lIllIIlll[w.lIllIlIII[41]] = "Raw giant carp";
        w.lIllIIlll[w.lIllIlIII[42]] = "Fishing";
        w.lIllIIlll[w.lIllIlIII[44]] = "Bait";
        w.lIllIIlll[w.lIllIlIII[45]] = "Raw giant carp";
        w.lIllIIlll[w.lIllIlIII[46]] = "Handing in fish";
        w.lIllIIlll[w.lIllIlIII[47]] = "Bonzo";
        w.lIllIIlll[w.lIllIlIII[48]] = "Fishing trophy";
        w.lIllIIlll[w.lIllIlIII[49]] = "Nav to start";
        w.lIllIIlll[w.lIllIlIII[50]] = "Finishing quest";
        w.lIllIIlll[w.lIllIlIII[51]] = "Vestri";
        w.lIllIIlll[w.lIllIlIII[52]] = "Camelot teleport";
        w.lIllIIlll[w.lIllIlIII[53]] = "Garlic";
        w.lIllIIlll[w.lIllIlIII[54]] = "Spade";
        w.lIllIIlll[w.lIllIlIII[55]] = "Fishing rod";
        w.lIllIIlll[w.lIllIlIII[56]] = "Fishing bait";
        w.lIllIIlll[w.lIllIlIII[63]] = "Fishing contest";
        w.lIllIIlll[w.lIllIlIII[64]] = "ring of wealth (";
        w.lIllIIlll[w.lIllIlIII[67]] = "I was wondering what was down those stairs?";
        w.lIllIIlll[w.lIllIlIII[68]] = "Why not?";
        w.lIllIIlll[w.lIllIlIII[69]] = "If you were my friend I wouldn't mind it.";
        w.lIllIIlll[w.lIllIlIII[19]] = "Well, let's be friends!";
        w.lIllIIlll[w.lIllIlIII[70]] = "And how am I meant to do that?";
        w.lIllIIlll[w.lIllIlIII[71]] = "I'll enter the competition please.";
        w.lIllIIlll[w.lIllIlIII[72]] = "I have this big fish. Is it enough to win?";
        w.lIllIIlll[w.lIllIlIII[73]] = "Yes.";
    }

    private static boolean lIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static void af() {
        d llIllIIlllIIII;
        Object llIllIIlllIIIl;
        int[] nArray = new int[lIllIlIII[1]];
        nArray[w.lIllIlIII[2]] = lIllIlIII[12];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIllIlIII[12], lIllIlIII[1], lIllIlIII[57]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIllIlIII[1]];
        nArray2[w.lIllIlIII[2]] = lIllIlIII[10];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIllIIlllIIIl = new DHelper(lIllIlIII[10], lIllIlIII[1], lIllIlIII[4]);
            bv.add((DHelper) lIllIIlllIIIl);

        }
        int[] nArray3 = new int[lIllIlIII[1]];
        nArray3[w.lIllIlIII[2]] = lIllIlIII[9];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIllIIlllIIIl = new DHelper(lIllIlIII[9], lIllIlIII[1], lIllIlIII[4]);
            bv.add((DHelper) lIllIIlllIIIl);

        }
        int[] nArray4 = new int[lIllIlIII[1]];
        nArray4[w.lIllIlIII[2]] = lIllIlIII[14];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIllIIlllIIIl = new DHelper(lIllIlIII[14], lIllIlIII[24], lIllIlIII[4]);
            bv.add((DHelper) lIllIIlllIIIl);

        }
        int[] nArray5 = new int[lIllIlIII[1]];
        nArray5[w.lIllIlIII[2]] = lIllIlIII[16];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIllIIlllIIIl = new DHelper(lIllIlIII[16], lIllIlIII[24], i.bq);
            bv.add((DHelper) lIllIIlllIIIl);

        }
        int[] nArray6 = new int[lIllIlIII[1]];
        nArray6[w.lIllIlIII[2]] = lIllIlIII[11];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIllIIlllIIIl = new DHelper(lIllIlIII[11], lIllIlIII[0], lIllIlIII[58]);
            bv.add((DHelper) lIllIIlllIIIl);

        }
        if (w.lIIllIIIIlII(Bank.contains((Predicate)(llIllIIlllIIIl = item -> item.getName().toLowerCase().contains(lIllIIlll[lIllIlIII[64]]))) ? 1 : 0)) {
            llIllIIlllIIII = new DHelper(lIllIlIII[59], lIllIlIII[13], lIllIlIII[60]);
            bv.add(llIllIIlllIIII);

        }
        int[] nArray7 = new int[lIllIlIII[1]];
        nArray7[w.lIllIlIII[2]] = lIllIlIII[8];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llIllIIlllIIII = new DHelper(lIllIlIII[8], lIllIlIII[52], lIllIlIII[61]);
            bv.add(llIllIIlllIIII);

        }
    }

    private static boolean lIIllIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIllI(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            w.aT();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < ((0x38 ^ 0x36) & ~(0x2A ^ 0x24))) {
            return (0x43 ^ 0xA) & ~(0xFA ^ 0xB3);
        }
        return lIllIlIII[62];
    }

    @Override
    public boolean S() {
        return lIllIlIII[2];
    }

    private static boolean lIIllIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIllIlIII[1]];
        nArray[w.lIllIlIII[2]] = lIllIlIII[8];
        if (w.lIIllIIIIllI(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[lIllIlIII[1]];
            stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[52]];
            if (w.lIIllIIIIllI(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[lIllIlIII[1]];
                stringArray2[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[53]];
                if (w.lIIllIIIIllI(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[lIllIlIII[1]];
                    stringArray3[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[54]];
                    if (w.lIIllIIIIllI(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIllIlIII[1]];
                        stringArray4[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[55]];
                        if (w.lIIllIIIIllI(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[lIllIlIII[1]];
                            stringArray5[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[56]];
                            if (w.lIIllIIIIllI(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[lIllIlIII[1]];
                                nArray2[w.lIllIlIII[2]] = lIllIlIII[17];
                                if (w.lIIllIIIIllI(Inventory.getCount((int[])nArray2)) && w.lIIllIIIIIll(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                    n2 = lIllIlIII[1];

                                    if (null == null) return n2 != 0;
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIllIlIII[2];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIllIIlll[lIllIlIII[63]];
    }

    private static boolean lIIllIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        w.lIIllIIIIIII();
        w.lIIlIlllllIl();
        bv = new ArrayList<d>();
        cW = new WorldArea(lIllIlIII[65], lIllIlIII[66], lIllIlIII[24], lIllIlIII[25], lIllIlIII[2]);
        String[] stringArray = new String[lIllIlIII[22]];
        stringArray[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[67]];
        stringArray[w.lIllIlIII[1]] = lIllIIlll[lIllIlIII[68]];
        stringArray[w.lIllIlIII[3]] = lIllIIlll[lIllIlIII[69]];
        stringArray[w.lIllIlIII[5]] = lIllIIlll[lIllIlIII[19]];
        stringArray[w.lIllIlIII[6]] = lIllIIlll[lIllIlIII[70]];
        stringArray[w.lIllIlIII[13]] = lIllIIlll[lIllIlIII[71]];
        stringArray[w.lIllIlIII[15]] = lIllIIlll[lIllIlIII[72]];
        stringArray[w.lIllIlIII[7]] = lIllIIlll[lIllIlIII[73]];
        bR = stringArray;
        bX = new WorldPoint(lIllIlIII[74], lIllIlIII[75], lIllIlIII[2]);
        cY = new WorldPoint(lIllIlIII[76], lIllIlIII[77], lIllIlIII[2]);
        cZ = new WorldPoint(lIllIlIII[78], lIllIlIII[79], lIllIlIII[2]);
        da = new WorldPoint(lIllIlIII[80], lIllIlIII[81], lIllIlIII[2]);
        db = new WorldPoint(lIllIlIII[82], lIllIlIII[83], lIllIlIII[2]);
        dc = new WorldPoint(lIllIlIII[84], lIllIlIII[85], lIllIlIII[2]);
        dd = lIllIlIII[24];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (w.lIIllIIIIIlI(e.j(dd), lIllIlIII[13])) {
            bl = lIllIlIII[1];

            if (2 < -1) {
                return ((0xBD ^ 0x99 ^ (0xFA ^ 0xBF)) & (110 + 189 - 212 + 121 ^ 174 + 145 - 183 + 41 ^ -1)) != 0;
            }
        } else {
            bl = lIllIlIII[2];
        }
        return bl;
    }

}

