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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.aj_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class w_Unknown
implements W {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint cZ;
    private static /* synthetic */ WorldPoint dc;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIllIlIII;
    private static /* synthetic */ WorldPoint db;
    private static /* synthetic */ int dd;
    static /* synthetic */ String[] bR;
    static /* synthetic */ boolean cX;
    static /* synthetic */ int cl;
    private static /* synthetic */ WorldPoint da;
    private static /* synthetic */ String[] lIllIIlll;
    private static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ WorldPoint cY;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea cW;

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
                                0;
                            }
                            if (w.lIIllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[5]];
                                if (w.lIIllIIIIllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIllIlIII[6]);
                                    0;
                                }
                                if (w.lIIllIIIIllI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIllIlIII[3]);
                                    0;
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
                    0;
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
                            0;
                            Time.sleepTicks((int)lIllIlIII[1]);
                            0;
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
                                    0;
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
                                            0;
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
                                        0;
                                        Time.sleepTicks((int)lIllIlIII[1]);
                                        0;
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
                                            0;
                                            Time.sleepTicks((int)lIllIlIII[6]);
                                            0;
                                        }
                                        if (w.lIIllIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[lIllIlIII[1]];
                                            stringArray10[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[35]];
                                            String[] stringArray11 = new String[lIllIlIII[1]];
                                            stringArray11[w.lIllIlIII[2]] = lIllIIlll[lIllIlIII[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)lIllIlIII[3]);
                                            0;
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
                            0;
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
                        0;
                        Time.sleepTicks((int)lIllIlIII[1]);
                        0;
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

    private static String lIIlIllllIll(String llIllIIllIIIll, String llIllIIllIIIlI) {
        llIllIIllIIIll = new String(Base64.getDecoder().decode(llIllIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIIllIIIIl = new StringBuilder();
        char[] llIllIIllIIIII = llIllIIllIIIlI.toCharArray();
        int llIllIIlIlllll = lIllIlIII[2];
        char[] llIllIIlIllIIl = llIllIIllIIIll.toCharArray();
        int llIllIIlIllIII = llIllIIlIllIIl.length;
        int llIllIIlIlIlll = lIllIlIII[2];
        while (w.lIIllIIIIIIl(llIllIIlIlIlll, llIllIIlIllIII)) {
            char llIllIIllIIlII = llIllIIlIllIIl[llIllIIlIlIlll];
            llIllIIllIIIIl.append((char)(llIllIIllIIlII ^ llIllIIllIIIII[llIllIIlIlllll % llIllIIllIIIII.length]));
            0;
            ++llIllIIlIlllll;
            ++llIllIIlIlIlll;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(llIllIIllIIIIl);
    }

    private static boolean lIIllIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlllllIl() {
        lIllIIlll = new String[lIllIlIII[86]];
        w.lIllIIlll[w.lIllIlIII[2]] = w."Finished buying items, switching back to quest";
        w.lIllIIlll[w.lIllIlIII[1]] = w."Fishing pass";
        w.lIllIIlll[w.lIllIlIII[3]] = w."Nav to bank";
        w.lIllIIlll[w.lIllIlIII[5]] = w."Handling banking";
        w.lIllIIlll[w.lIllIlIII[6]] = w."We are missing quest supplies, switching to BUYING";
        w.lIllIIlll[w.lIllIlIII[13]] = w."Drink";
        w.lIllIIlll[w.lIllIlIII[15]] = w."Nav to start";
        w.lIllIIlll[w.lIllIlIII[7]] = w."Starting quest";
        w.lIllIIlll[w.lIllIlIII[22]] = w."Vestri";
        w.lIllIIlll[w.lIllIlIII[23]] = w."Fishing trophy";
        w.lIllIIlll[w.lIllIlIII[0]] = w."Red vine worm";
        w.lIllIIlll[w.lIllIlIII[24]] = w."Nav to vine";
        w.lIllIIlll[w.lIllIlIII[21]] = w."Digging";
        w.lIllIIlll[w.lIllIlIII[25]] = w."Red vine worm";
        w.lIllIIlll[w.lIllIlIII[26]] = w."Vine";
        w.lIllIIlll[w.lIllIlIII[27]] = w."Vine";
        w.lIllIIlll[w.lIllIlIII[28]] = w."Check";
        w.lIllIIlll[w.lIllIlIII[29]] = w."Red vine worm";
        w.lIllIIlll[w.lIllIlIII[30]] = w."Nav to contest";
        w.lIllIIlll[w.lIllIlIII[31]] = w."Garlic";
        w.lIllIIlll[w.lIllIlIII[32]] = w."Using garlic";
        w.lIllIIlll[w.lIllIlIII[33]] = w."Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[34]] = w."Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[35]] = w."Garlic";
        w.lIllIIlll[w.lIllIlIII[36]] = w."Wall Pipe";
        w.lIllIIlll[w.lIllIlIII[37]] = w."Garlic";
        w.lIllIIlll[w.lIllIlIII[38]] = w."Start contest";
        w.lIllIIlll[w.lIllIlIII[20]] = w."Bonzo";
        w.lIllIIlll[w.lIllIlIII[39]] = w."I might still be able to find a bigger fish";
        w.lIllIIlll[w.lIllIlIII[40]] = w."Garlic";
        w.lIllIIlll[w.lIllIlIII[41]] = w."Raw giant carp";
        w.lIllIIlll[w.lIllIlIII[42]] = w."Fishing";
        w.lIllIIlll[w.lIllIlIII[44]] = w."Bait";
        w.lIllIIlll[w.lIllIlIII[45]] = w."Raw giant carp";
        w.lIllIIlll[w.lIllIlIII[46]] = w."Handing in fish";
        w.lIllIIlll[w.lIllIlIII[47]] = w."Bonzo";
        w.lIllIIlll[w.lIllIlIII[48]] = w."Fishing trophy";
        w.lIllIIlll[w.lIllIlIII[49]] = w."Nav to start";
        w.lIllIIlll[w.lIllIlIII[50]] = w."Finishing quest";
        w.lIllIIlll[w.lIllIlIII[51]] = w."Vestri";
        w.lIllIIlll[w.lIllIlIII[52]] = w."Camelot teleport";
        w.lIllIIlll[w.lIllIlIII[53]] = w."Garlic";
        w.lIllIIlll[w.lIllIlIII[54]] = w."Spade";
        w.lIllIIlll[w.lIllIlIII[55]] = w."Fishing rod";
        w.lIllIIlll[w.lIllIlIII[56]] = w."Fishing bait";
        w.lIllIIlll[w.lIllIlIII[63]] = w."Fishing contest";
        w.lIllIIlll[w.lIllIlIII[64]] = w."ring of wealth (";
        w.lIllIIlll[w.lIllIlIII[67]] = w."I was wondering what was down those stairs?";
        w.lIllIIlll[w.lIllIlIII[68]] = w."Why not?";
        w.lIllIIlll[w.lIllIlIII[69]] = w."If you were my friend I wouldn't mind it.";
        w.lIllIIlll[w.lIllIlIII[19]] = w."Well, let's be friends!";
        w.lIllIIlll[w.lIllIlIII[70]] = w."And how am I meant to do that?";
        w.lIllIIlll[w.lIllIlIII[71]] = w."I'll enter the competition please.";
        w.lIllIIlll[w.lIllIlIII[72]] = w."I have this big fish. Is it enough to win?";
        w.lIllIIlll[w.lIllIlIII[73]] = w."Yes.";
    }

    private static boolean lIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static void lIIllIIIIIII() {
        lIllIlIII = new int[87];
        w.lIllIlIII[0] = 66 + 25 - -46 + 35 ^ 51 + 68 - 66 + 113;
        w.lIllIlIII[1] = 1;
        w.lIllIlIII[2] = (0x76 ^ 0x31) & ~(0x31 ^ 0x76);
        w.lIllIlIII[3] = 2;
        w.lIllIlIII[4] = -(0xFFFFF7CE & 0x6877) & (0xFFFFF3FF & 0x7FCD);
        w.lIllIlIII[5] = 3;
        w.lIllIlIII[6] = 0x99 ^ 0x9D;
        w.lIllIlIII[7] = 0x2A ^ 0x2D;
        w.lIllIlIII[8] = 0xFFFFBF67 & 0x5FDF;
        w.lIllIlIII[9] = -(0xFFFFFD75 & 0x6ACF) & (0xFFFFFFFC & 0x6BFF);
        w.lIllIlIII[10] = -(0xFFFFEBD9 & 0x36E7) & (0xFFFFE7F3 & 0x3BFF);
        w.lIllIlIII[11] = 0xFFFFD779 & 0x29BF;
        w.lIllIlIII[12] = -(0xFFFFF9E6 & 0x7F7B) & (0xFFFFFF6F & Short.MAX_VALUE);
        w.lIllIlIII[13] = 0x33 ^ 0x51 ^ (0xEF ^ 0x88);
        w.lIllIlIII[14] = 0xFFFFDFFA & 0x3F4F;
        w.lIllIlIII[15] = 0xB7 ^ 0xB1;
        w.lIllIlIII[16] = 0xFFFFBB73 & 0x75DD;
        w.lIllIlIII[17] = 0xFFFFE3EB & 0x1FF7;
        w.lIllIlIII[18] = 0xFFFFD7EA & 0x2BFD;
        w.lIllIlIII[19] = 0x29 ^ 0x2F ^ (0xB7 ^ 0x83);
        w.lIllIlIII[20] = 0xA8 ^ 0xA7 ^ (0x39 ^ 0x2D);
        w.lIllIlIII[21] = 0x1B ^ 0x14 ^ 3;
        w.lIllIlIII[22] = 1 ^ 9;
        w.lIllIlIII[23] = 0x2F ^ 0x20 ^ (0xA8 ^ 0xAE);
        w.lIllIlIII[24] = 0xAB ^ 0xA0;
        w.lIllIlIII[25] = 57 + 117 - 124 + 79 ^ 35 + 132 - 75 + 48;
        w.lIllIlIII[26] = 83 + 123 - 99 + 58 ^ 138 + 7 - 17 + 43;
        w.lIllIlIII[27] = 0xA3 ^ 0xAC;
        w.lIllIlIII[28] = 64 + 83 - 99 + 137 ^ 115 + 68 - 179 + 165;
        w.lIllIlIII[29] = 0x92 ^ 0x83;
        w.lIllIlIII[30] = 0x66 ^ 0x74;
        w.lIllIlIII[31] = 0x33 ^ 0x20;
        w.lIllIlIII[32] = 0x1A ^ 0xE;
        w.lIllIlIII[33] = 0xA2 ^ 0xB1 ^ (0x90 ^ 0x96);
        w.lIllIlIII[34] = 9 + 112 - 1 + 10 ^ 18 + 120 - 63 + 73;
        w.lIllIlIII[35] = 0x24 ^ 0x33;
        w.lIllIlIII[36] = 0x4A ^ 0x52;
        w.lIllIlIII[37] = 0x21 ^ 0x38;
        w.lIllIlIII[38] = 0x78 ^ 0x62;
        w.lIllIlIII[39] = 0x8E ^ 0x92;
        w.lIllIlIII[40] = 0x39 ^ 0x63 ^ (0x84 ^ 0xC3);
        w.lIllIlIII[41] = 74 + 41 - 19 + 44 ^ 130 + 37 - 43 + 22;
        w.lIllIlIII[42] = 0x49 ^ 0x2D ^ (0x68 ^ 0x13);
        w.lIllIlIII[43] = 0xFFFFEFFB & 0x1FF4;
        w.lIllIlIII[44] = 0x78 ^ 0x7F ^ (0x44 ^ 0x63);
        w.lIllIlIII[45] = 11 + 132 - -34 + 4 ^ 45 + 17 - -16 + 70;
        w.lIllIlIII[46] = 0x15 ^ 0x44 ^ (0xF7 ^ 0x84);
        w.lIllIlIII[47] = 0x1A ^ 0x39;
        w.lIllIlIII[48] = 0x52 ^ 0x76;
        w.lIllIlIII[49] = 0x8A ^ 0xAF;
        w.lIllIlIII[50] = 8 ^ 0x24 ^ (0xCF ^ 0xC5);
        w.lIllIlIII[51] = 0x1C ^ 0x61 ^ (0x16 ^ 0x4C);
        w.lIllIlIII[52] = 0xA9 ^ 0x8B ^ (0x2F ^ 0x25);
        w.lIllIlIII[53] = 0x68 ^ 0x41;
        w.lIllIlIII[54] = 7 ^ 0x2D;
        w.lIllIlIII[55] = 0x51 ^ 0x7A;
        w.lIllIlIII[56] = 0x14 ^ 0x38;
        w.lIllIlIII[57] = 0xFFFFA738 & 0x7BEF;
        w.lIllIlIII[58] = -(0xFFFFFD7B & 0x368D) & (0xFFFFBFFE & 0x75FD);
        w.lIllIlIII[59] = -(0xFFFFFF57 & 0x41BA) & (0xFFFFFFFF & 0x6FDD);
        w.lIllIlIII[60] = -(0xFFFFBE7C & 0x5DD7) & (0xFFFFFDFB & Short.MAX_VALUE);
        w.lIllIlIII[61] = 0xFFFF93E5 & 0x6F9E;
        w.lIllIlIII[62] = 0x4C ^ 0x28;
        w.lIllIlIII[63] = 0x18 ^ 0x16 ^ (0x6A ^ 0x49);
        w.lIllIlIII[64] = 0xA1 ^ 0x8F;
        w.lIllIlIII[65] = 0xFFFFFFFC & 0xA4B;
        w.lIllIlIII[66] = -(0xFFFFFC55 & 0x73AF) & (0xFFFFFF7F & 0x7DEE);
        w.lIllIlIII[67] = 0x66 ^ 0x49;
        w.lIllIlIII[68] = 0x86 ^ 0xB6;
        w.lIllIlIII[69] = 0xD8 ^ 0x9E ^ (0x1A ^ 0x6D);
        w.lIllIlIII[70] = 73 + 101 - 128 + 90 ^ 3 + 155 - 66 + 95;
        w.lIllIlIII[71] = 0xB5 ^ 0xBD ^ (0x6B ^ 0x57);
        w.lIllIlIII[72] = 0x80 ^ 0xB5;
        w.lIllIlIII[73] = 0x32 ^ 4;
        w.lIllIlIII[74] = 0xFFFFDFCF & 0x2B33;
        w.lIllIlIII[75] = -(0xFFFFF27F & 0x7FC4) & (0xFFFFFFF7 & 0x7FEB);
        w.lIllIlIII[76] = -(0xFFFFE983 & 0x777D) & (0xFFFFFBE3 & 0x6F7F);
        w.lIllIlIII[77] = 0xFFFFAFEF & 0x5DBC;
        w.lIllIlIII[78] = -(0xFFFFA5E9 & 0x7F9F) & (0xFFFFAFDF & 0x7FEF);
        w.lIllIlIII[79] = 0xFFFF9FF6 & 0x6DAF;
        w.lIllIlIII[80] = -(0xFFFFFFED & 0x1536) & (0xFFFFBFFF & 0x5F77);
        w.lIllIlIII[81] = 0xFFFFEF7E & 0x1DF3;
        w.lIllIlIII[82] = -(0xFFFFEE53 & 0x71BD) & (0xFFFFEB7F & 0x7EDE);
        w.lIllIlIII[83] = 0xFFFFFF77 & 0xDFD;
        w.lIllIlIII[84] = 0xFFFF9FFD & 0x6A53;
        w.lIllIlIII[85] = -(0xFFFFBEF9 & 0x7397) & (0xFFFFBFFF & Short.MAX_VALUE);
        w.lIllIlIII[86] = 0x7D ^ 0x11 ^ (0xE8 ^ 0xB3);
    }

    private static void af() {
        d llIllIIlllIIII;
        Object llIllIIlllIIIl;
        int[] nArray = new int[lIllIlIII[1]];
        nArray[w.lIllIlIII[2]] = lIllIlIII[12];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIllIlIII[12], lIllIlIII[1], lIllIlIII[57]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIllIlIII[1]];
        nArray2[w.lIllIlIII[2]] = lIllIlIII[10];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIllIIlllIIIl = new d(lIllIlIII[10], lIllIlIII[1], lIllIlIII[4]);
            bv.add((d)llIllIIlllIIIl);
            0;
        }
        int[] nArray3 = new int[lIllIlIII[1]];
        nArray3[w.lIllIlIII[2]] = lIllIlIII[9];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIllIIlllIIIl = new d(lIllIlIII[9], lIllIlIII[1], lIllIlIII[4]);
            bv.add((d)llIllIIlllIIIl);
            0;
        }
        int[] nArray4 = new int[lIllIlIII[1]];
        nArray4[w.lIllIlIII[2]] = lIllIlIII[14];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIllIIlllIIIl = new d(lIllIlIII[14], lIllIlIII[24], lIllIlIII[4]);
            bv.add((d)llIllIIlllIIIl);
            0;
        }
        int[] nArray5 = new int[lIllIlIII[1]];
        nArray5[w.lIllIlIII[2]] = lIllIlIII[16];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIllIIlllIIIl = new d(lIllIlIII[16], lIllIlIII[24], i.bq);
            bv.add((d)llIllIIlllIIIl);
            0;
        }
        int[] nArray6 = new int[lIllIlIII[1]];
        nArray6[w.lIllIlIII[2]] = lIllIlIII[11];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIllIIlllIIIl = new d(lIllIlIII[11], lIllIlIII[0], lIllIlIII[58]);
            bv.add((d)llIllIIlllIIIl);
            0;
        }
        if (w.lIIllIIIIlII(Bank.contains((Predicate)(llIllIIlllIIIl = item -> item.getName().toLowerCase().contains(lIllIIlll[lIllIlIII[64]]))) ? 1 : 0)) {
            llIllIIlllIIII = new d(lIllIlIII[59], lIllIlIII[13], lIllIlIII[60]);
            bv.add(llIllIIlllIIII);
            0;
        }
        int[] nArray7 = new int[lIllIlIII[1]];
        nArray7[w.lIllIlIII[2]] = lIllIlIII[8];
        if (w.lIIllIIIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llIllIIlllIIII = new d(lIllIlIII[8], lIllIlIII[52], lIllIlIII[61]);
            bv.add(llIllIIlllIIII);
            0;
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 < ((0x38 ^ 0x36) & ~(0x2A ^ 0x24))) {
            return (0x43 ^ 0xA) & ~(0xFA ^ 0xB3);
        }
        return lIllIlIII[62];
    }

    private static String lIIlIllllIlI(String llIllIIlIIlllI, String llIllIIlIIlIll) {
        try {
            SecretKeySpec llIllIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIIlIlIIII = Cipher.getInstance("Blowfish");
            llIllIIlIlIIII.init(lIllIlIII[3], llIllIIlIlIIIl);
            return new String(llIllIIlIlIIII.doFinal(Base64.getDecoder().decode(llIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIlIIllll) {
            llIllIIlIIllll.printStackTrace();
            return null;
        }
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
                                    0;
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
            0;
            if (2 < -1) {
                return ((0xBD ^ 0x99 ^ (0xFA ^ 0xBF)) & (110 + 189 - 212 + 121 ^ 174 + 145 - 183 + 41 ^ -1)) != 0;
            }
        } else {
            bl = lIllIlIII[2];
        }
        return bl;
    }

    private static String lIIlIllllIIl(String llIllIIlIIIIIl, String llIllIIIlllllI) {
        try {
            SecretKeySpec llIllIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), lIllIlIII[22]), "DES");
            Cipher llIllIIlIIIIll = Cipher.getInstance("DES");
            llIllIIlIIIIll.init(lIllIlIII[3], llIllIIlIIIlII);
            return new String(llIllIIlIIIIll.doFinal(Base64.getDecoder().decode(llIllIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIIlIIIIlI) {
            llIllIIlIIIIlI.printStackTrace();
            return null;
        }
    }
}

