/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class NHelper
implements W {
    
    public static  WorldPoint jg;
    
    static  String[] bR;
    static  boolean cm;
    public static  WorldPoint bX;
    static  int cl;
    static  WorldArea jl;
    public static  WorldPoint ji;
    public static  List<d> bv;
    public static  WorldPoint jj;
    public static  WorldPoint jh;
    public static  boolean bt;
    static  int jk;

    public static void cn() {
        block134: {
            BankLocation lIIIIIlIIIlllIl;
            block135: {
                WorldArea lIIIIIlIIIllIll;
                TileItem lIIIIIlIIIlllII;
                block137: {
                    block136: {
                        if (N.llllllllllI(bt ? 1 : 0)) {
                            b.a(bv);
                            if (N.lllllllllll(bv.size(), lIIllIIlI[0])) {
                                System.out.println(lIIlIllll[lIIllIIlI[1]]);
                                bt = lIIllIIlI[1];
                            }
                        }
                        if (!N.lIIIIIIIIIII(bt ? 1 : 0)) break block134;
                        if (N.lIIIIIIIIIII(N.ab() ? 1 : 0) && N.lllllllllll(e.j(jk), lIIllIIlI[0])) {
                            lIIIIIlIIIlllIl = BankLocation.getNearest();
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl) && N.lIIIIIIIIIII(lIIIIIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[0]];
                                a.a(lIIIIIlIIIlllIl);
                            }
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl) && N.llllllllllI(lIIIIIlIIIlllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (N.lIIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIlI[2]);

                                }
                                if (N.llllllllllI(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[3]];
                                    if (N.lIIIIIIIIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIllIIlI[4]);

                                    }
                                    if (N.lIIIIIIIIIlI(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIllIIlI[3]);

                                    }
                                    int[] nArray = new int[lIIllIIlI[4]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
                                    nArray[N.lIIllIIlI[0]] = lIIllIIlI[6];
                                    nArray[N.lIIllIIlI[3]] = lIIllIIlI[7];
                                    nArray[N.lIIllIIlI[8]] = lIIllIIlI[9];
                                    if (N.lIIIIIIIIIII(e.b(nArray) ? 1 : 0)) {
                                        N.af();
                                        System.out.println(lIIlIllll[lIIllIIlI[8]]);
                                        bt = lIIllIIlI[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIllIIlI[4]];
                                    nArray2[N.lIIllIIlI[1]] = lIIllIIlI[5];
                                    nArray2[N.lIIllIIlI[0]] = lIIllIIlI[6];
                                    nArray2[N.lIIllIIlI[3]] = lIIllIIlI[7];
                                    nArray2[N.lIIllIIlI[8]] = lIIllIIlI[9];
                                    if (N.llllllllllI(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIllIIlI[5], lIIllIIlI[10]);
                                        a.a(lIIllIIlI[6], lIIllIIlI[10]);
                                        a.a(lIIllIIlI[7], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[11], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[9], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[12], lIIllIIlI[0]);
                                        a.a(lIIllIIlI[13], lIIllIIlI[14]);
                                    }
                                }
                            }
                        }
                        if (N.llllllllllI(Inventory.contains((int[])f.aV) ? 1 : 0) && N.lllllllllll(Movement.getRunEnergy(), lIIllIIlI[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIIlIllll[lIIllIIlI[4]]);
                            Time.sleepTicks((int)lIIllIIlI[0]);

                        }
                        int[] nArray = new int[lIIllIIlI[0]];
                        nArray[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (N.llllllllllI(Inventory.contains((int[])nArray) ? 1 : 0) && N.lIIIIIIIIIll(N.lllllllllIl(e.u(), 50.0))) {
                            int[] nArray3 = new int[lIIllIIlI[0]];
                            nArray3[N.lIIllIIlI[1]] = lIIllIIlI[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIllll[lIIllIIlI[14]]);
                            Time.sleepTicks((int)lIIllIIlI[3]);

                        }
                        if (N.llllllllllI(N.ab() ? 1 : 0) && N.lIIIIIIIIIII(e.j(jk))) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIlI[16])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[17]];
                                Movement.walkTo((WorldPoint)bX);

                                Time.sleepTicks((int)lIIllIIlI[0]);

                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIlI[16])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[18]];
                                if (N.llllllllllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlIllll[lIIllIIlI[16]], bR);
                            }
                        }
                        if (!N.lIIIIIIIIllI(e.j(jk), lIIllIIlI[0])) break block135;
                        cl = lIIllIIlI[1];
                        int[] nArray4 = new int[lIIllIIlI[0]];
                        nArray4[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllIIlI[0]];
                            nArray5[N.lIIllIIlI[1]] = lIIllIIlI[19];
                            if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIllIIlI[0]];
                                stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[20]];
                                if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    lIIIIIlIIIlllIl = new WorldPoint(lIIllIIlI[21], lIIllIIlI[22], lIIllIIlI[0]);
                                    int[] nArray6 = new int[lIIllIIlI[0]];
                                    nArray6[N.lIIllIIlI[1]] = lIIllIIlI[11];
                                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIlIIIlllIl), lIIllIIlI[14])) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[10]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlllIl);

                                            Time.sleepTicks((int)lIIllIIlI[0]);

                                        }
                                        if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIIIlIIIlllIl), lIIllIIlI[14])) {
                                            int[] nArray7 = new int[lIIllIIlI[0]];
                                            nArray7[N.lIIllIIlI[1]] = lIIllIIlI[11];
                                            lIIIIIlIIIlllII = TileItems.getNearest((int[])nArray7);
                                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllII)) {
                                                if (N.lIIIIIIIIIII(Reachable.isInteractable((Locatable)lIIIIIlIIIlllII) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[23]];
                                                    Movement.walkTo((WorldPoint)lIIIIIlIIIlllII.getWorldLocation());

                                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                                }
                                                if (N.llllllllllI(Reachable.isInteractable((Locatable)lIIIIIlIIIlllII) ? 1 : 0)) {
                                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[24]];
                                                    lIIIIIlIIIlllII.interact(lIIlIllll[lIIllIIlI[25]]);
                                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIllIIlI[0]];
                        nArray8[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (!N.lIIIIIIIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIllIIlI[0]];
                        nArray9[N.lIIllIIlI[1]] = lIIllIIlI[19];
                        if (!N.llllllllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIllIIlI[0]];
                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIllIIlI[0]];
                        nArray10[N.lIIllIIlI[1]] = lIIllIIlI[11];
                        if (N.llllllllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[26]];
                            int[] nArray11 = new int[lIIllIIlI[0]];
                            nArray11[N.lIIllIIlI[1]] = lIIllIIlI[11];
                            int[] nArray12 = new int[lIIllIIlI[0]];
                            nArray12[N.lIIllIIlI[1]] = lIIllIIlI[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIllIIlI[0]);

                        }
                    }
                    int[] nArray13 = new int[lIIllIIlI[0]];
                    nArray13[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.llllllllllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIlI[0]];
                        stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[27]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jg), lIIllIIlI[4])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[28]];
                                Movement.walkTo((WorldPoint)jg);

                                Time.sleepTicks((int)lIIllIIlI[0]);

                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jg), lIIllIIlI[4])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[29]];
                                String[] stringArray2 = new String[lIIllIIlI[0]];
                                stringArray2[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlIllll[lIIllIIlI[31]]);
                                Time.sleepTicks((int)lIIllIIlI[20]);

                            }
                        }
                        String[] stringArray3 = new String[lIIllIIlI[0]];
                        stringArray3[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[32]];
                        if (N.llllllllllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jh), lIIllIIlI[8])) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[33]];
                                Movement.walkTo((WorldPoint)jh);

                                Time.sleepTicks((int)lIIllIIlI[0]);

                            }
                            if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jh), lIIllIIlI[8])) {
                                int[] nArray14 = new int[lIIllIIlI[0]];
                                nArray14[N.lIIllIIlI[1]] = lIIllIIlI[19];
                                String[] stringArray4 = new String[lIIllIIlI[0]];
                                stringArray4[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIllIIlI[0]);

                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIllIIlI[0]];
                stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[35]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIllIIlI[0]];
                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[19];
                    if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIllIIlI[0]];
                        stringArray5[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[36]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[37]];
                            if (N.lIIIIIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIllIIlI[0]];
                                stringArray6[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlIllll[lIIllIIlI[39]]);
                                Time.sleepTicks((int)lIIllIIlI[4]);

                            }
                            g.a(bR);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIllIIlI[0]];
                stringArray7[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[40]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIllIIlI[0]];
                    stringArray8[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[41]];
                    if (N.llllllllllI(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIllIIlI[0]];
                        stringArray9[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[42]];
                        if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            lIIIIIlIIIlllIl = new WorldPoint(lIIllIIlI[43], lIIllIIlI[44], lIIllIIlI[1]);
                            lIIIIIlIIIlllII = new WorldPoint(lIIllIIlI[21], lIIllIIlI[44], lIIllIIlI[1]);
                            lIIIIIlIIIllIll = new WorldArea(lIIllIIlI[21], lIIllIIlI[45], lIIllIIlI[14], lIIllIIlI[8], lIIllIIlI[1]);
                            if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllIl) ? 1 : 0) && N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllII) ? 1 : 0) && N.lIIIIIIIIIII(lIIIIIlIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[46]];
                                Movement.walkTo((WorldPoint)lIIIIIlIIIlllIl);

                                Time.sleepTicks((int)lIIllIIlI[0]);

                            }
                            if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlllIl) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIllIIlI[0]];
                                stringArray10[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlIllll[lIIllIIlI[48]]);
                                Time.sleepTicks((int)lIIllIIlI[3]);

                            }
                            if (N.llllllllllI(lIIIIIlIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[49]];
                                String[] stringArray11 = new String[lIIllIIlI[0]];
                                stringArray11[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlIllll[lIIllIIlI[51]]);
                                Time.sleepTicks((int)lIIllIIlI[8]);

                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIllIIlI[0]];
                stringArray12[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[52]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllIIlI[0]];
                    stringArray13[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[53]];
                    if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        lIIIIIlIIIlllIl = new WorldArea(lIIllIIlI[21], lIIllIIlI[45], lIIllIIlI[14], lIIllIIlI[8], lIIllIIlI[1]);
                        lIIIIIlIIIlllII = new WorldArea(lIIllIIlI[54], lIIllIIlI[55], lIIllIIlI[18], lIIllIIlI[23], lIIllIIlI[1]);
                        if (N.llllllllllI(lIIIIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIllIIlI[0]];
                            stringArray14[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlIllll[lIIllIIlI[57]]);
                            Time.sleepTicks((int)lIIllIIlI[3]);

                        }
                        if (N.lIIIIIIIIIII(lIIIIIlIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(jl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[58]];
                            Movement.walkTo((WorldPoint)ji);

                            Time.sleepTicks((int)lIIllIIlI[0]);

                        }
                        if (N.llllllllllI(lIIIIIlIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIllIIlI[0]];
                            stringArray15[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlIllll[lIIllIIlI[60]]);
                            Time.sleepTicks((int)lIIllIIlI[4]);

                        }
                        if (N.llllllllllI(jl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint lIIIIIlIIIlIIII;
                            WorldPoint lIIIIIlIIIlIIIl;
                            WorldPoint lIIIIIlIIIlIIlI;
                            lIIIIIlIIIllIll = new WorldPoint(lIIllIIlI[21], lIIllIIlI[61], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIlI = new WorldPoint(lIIllIIlI[62], lIIllIIlI[63], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIIl = new WorldPoint(lIIllIIlI[64], lIIllIIlI[65], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIllIII = new WorldPoint(lIIllIIlI[43], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIlIlll = new WorldPoint(lIIllIIlI[67], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldPoint lIIIIIlIIIlIllI = new WorldPoint(lIIllIIlI[67], lIIllIIlI[66], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIlIl = new WorldArea(lIIllIIlI[68], lIIllIIlI[69], lIIllIIlI[20], lIIllIIlI[23], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIlII = new WorldArea(lIIllIIlI[70], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[17], lIIllIIlI[1]);
                            WorldArea lIIIIIlIIIlIIll = new WorldArea(lIIllIIlI[72], lIIllIIlI[73], lIIllIIlI[32], lIIllIIlI[25], lIIllIIlI[1]);
                            if (N.lIIIIIIIIlll(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[76]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIll);

                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[77]];
                                    String[] stringArray16 = new String[lIIllIIlI[0]];
                                    stringArray16[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlIllll[lIIllIIlI[79]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[81]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIlI);

                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[82]];
                                    String[] stringArray17 = new String[lIIllIIlI[0]];
                                    stringArray17[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlIllll[lIIllIIlI[83]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[80]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[75]))) {
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[21], lIIllIIlI[84], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[85]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIllIIlI[0]];
                                        stringArray18[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIllll[lIIllIIlI[87]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[88]];
                                    String[] stringArray19 = new String[lIIllIIlI[0]];
                                    stringArray19[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlIllll[lIIllIIlI[90]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[80]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0])) {
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[21], lIIllIIlI[91], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[92]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIllIIlI[0]];
                                        stringArray20[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlIllll[lIIllIIlI[94]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[95]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIllIlI);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIlI) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[96]];
                                        String[] stringArray21 = new String[lIIllIIlI[0]];
                                        stringArray21[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlIllll[lIIllIIlI[98]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                            }
                            if (N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[74]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0])) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[99]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIllIll);

                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIllIll) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[100]];
                                    String[] stringArray22 = new String[lIIllIIlI[0]];
                                    stringArray22[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlIllll[lIIllIIlI[102]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                if (N.lIIIIIIIIIII(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.llllllllllI(lIIIIIlIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIIIIIlIIIlIIlI = new WorldPoint(lIIllIIlI[104], lIIllIIlI[84], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[105]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIlI);

                                            Time.sleepTicks((int)lIIllIIlI[0]);

                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIlI) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIllIIlI[0]];
                                            stringArray23[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlIllll[lIIllIIlI[107]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);

                                        }
                                    }
                                    if (N.llllllllllI((lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                        lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[108], lIIllIIlI[109], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[110]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                            Time.sleepTicks((int)lIIllIIlI[0]);

                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIllIIlI[0]];
                                            stringArray24[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlIllll[lIIllIIlI[112]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);

                                        }
                                    }
                                    if (N.llllllllllI((lIIIIIlIIIlIIIl = new WorldArea(lIIllIIlI[70], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lIIIIIlIIIlIIII = new WorldPoint(lIIllIIlI[67], lIIllIIlI[113], lIIllIIlI[1]);
                                        if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIII) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[114]];
                                            Movement.walkTo((WorldPoint)lIIIIIlIIIlIIII);

                                            Time.sleepTicks((int)lIIllIIlI[0]);

                                        }
                                        if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIII) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIllIIlI[0]];
                                            stringArray25[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlIllll[lIIllIIlI[116]]);
                                            Time.sleepTicks((int)lIIllIIlI[8]);

                                        }
                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(N.co() ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[117]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIlll);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[118]];
                                        String[] stringArray26 = new String[lIIllIIlI[0]];
                                        stringArray26[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlIllll[lIIllIIlI[120]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[121]))) {
                                if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIllI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[122]];
                                    Movement.walkTo((WorldPoint)lIIIIIlIIIlIllI);

                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                }
                                if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIllI) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[123]];
                                    String[] stringArray27 = new String[lIIllIIlI[0]];
                                    stringArray27[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlIllll[lIIllIIlI[125]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[126]))) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[127], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[128]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIllIIlI[0]];
                                        stringArray28[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlIllll[lIIllIIlI[130]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[131], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[132]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIllIIlI[0]];
                                        stringArray29[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlIllll[lIIllIIlI[134]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[135]];
                                    String[] stringArray30 = new String[lIIllIIlI[0]];
                                    stringArray30[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlIllll[lIIllIIlI[137]]);
                                    Time.sleepTicks((int)lIIllIIlI[16]);

                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[103]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[138], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[139]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIllIIlI[0]];
                                        stringArray31[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlIllll[lIIllIIlI[141]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[108], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[142]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIllIIlI[0]];
                                        stringArray32[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIllll[lIIllIIlI[144]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[145]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIlll);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIlll) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[146]];
                                        String[] stringArray33 = new String[lIIllIIlI[0]];
                                        stringArray33[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlIllll[lIIllIIlI[148]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                            }
                            if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
                                lIIIIIlIIIlIIlI = new WorldArea(lIIllIIlI[72], lIIllIIlI[71], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1]);
                                if (N.llllllllllI(lIIIIIlIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[127], lIIllIIlI[66], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[149]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIllIIlI[0]];
                                        stringArray34[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlIllll[lIIllIIlI[151]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lIIIIIlIIIlIIIl = new WorldPoint(lIIllIIlI[104], lIIllIIlI[152], lIIllIIlI[1]);
                                    if (N.lIIIIIIIIIII(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[153]];
                                        Movement.walkTo((WorldPoint)lIIIIIlIIIlIIIl);

                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                    }
                                    if (N.llllllllllI(Players.getLocal().getWorldLocation().equals((Object)lIIIIIlIIIlIIIl) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIllIIlI[0]);

                                        String[] stringArray35 = new String[lIIllIIlI[0]];
                                        stringArray35[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlIllll[lIIllIIlI[155]]);
                                        Time.sleepTicks((int)lIIllIIlI[8]);

                                    }
                                }
                                if (N.llllllllllI((lIIIIIlIIIlIIIl = new WorldArea(lIIllIIlI[72], lIIllIIlI[69], lIIllIIlI[14], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.lIIIIIIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[156]];
                                    Time.sleepTicks((int)lIIllIIlI[0]);

                                    int[] nArray = new int[lIIllIIlI[0]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[158]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                                if (N.llllllllllI(lIIIIIlIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIllIIlI[0]];
                                    nArray[N.lIIllIIlI[1]] = lIIllIIlI[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[160]]);
                                    Time.sleepTicks((int)lIIllIIlI[8]);

                                }
                                if (N.llllllllllI((lIIIIIlIIIlIIII = new WorldArea(lIIllIIlI[161], lIIllIIlI[162], lIIllIIlI[23], lIIllIIlI[14], lIIllIIlI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIllIIlI[0]];
                                    stringArray36[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[163]];
                                    if (N.lIIIIIIIIIII(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIllIIlI[0]];
                                        stringArray37[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlIllll[lIIllIIlI[165]]);
                                        Time.sleepTicks((int)lIIllIIlI[14]);

                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIllIIlI[0]];
                stringArray38[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[166]];
                if (N.llllllllllI(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIllIIlI[0]];
                    stringArray39[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[167]];
                    if (N.llllllllllI(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        lIIIIIlIIIlllIl = new WorldArea(lIIllIIlI[161], lIIllIIlI[162], lIIllIIlI[23], lIIllIIlI[14], lIIllIIlI[1]);
                        if (N.llllllllllI(lIIIIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIllIIlI[0]];
                            nArray[N.lIIllIIlI[1]] = lIIllIIlI[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlIllll[lIIllIIlI[168]]);
                            Time.sleepTicks((int)lIIllIIlI[14]);

                        }
                        if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                            AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[169]];
                            Movement.walkTo((WorldPoint)jj);

                            Time.sleepTicks((int)lIIllIIlI[0]);

                        }
                        if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                            lIIIIIlIIIlllII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (N.llllllllllI(tileObject.getName().contains(lIIlIllll[lIIllIIlI[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIllIIlI[0]];
                                    stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[186]];
                                    if (N.llllllllllI(tileObject.hasAction(stringArray) ? 1 : 0) && N.lIIIIIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIIlI[21], lIIllIIlI[184], lIIllIIlI[3])), lIIllIIlI[3])) {
                                        n2 = lIIllIIlI[0];

                                        if (2 < (0xA4 ^ 0xA0)) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lIIllIIlI[1];
                                return n2 != 0;
                            });
                            if (N.lIIIIIIIIIIl(lIIIIIlIIIlllII)) {
                                lIIIIIlIIIlllII.interact(lIIlIllll[lIIllIIlI[170]]);
                                Time.sleepTicks((int)lIIllIIlI[8]);

                            }
                            if (N.lIIIIIIIlIII(lIIIIIlIIIlllII)) {
                                g.a(lIIlIllll[lIIllIIlI[171]], bR, lIIllIIlI[0]);
                            }
                        }
                    }
                }
            }
            if (N.lIIIIIIIIllI(e.j(jk), lIIllIIlI[3])) {
                if (N.lIIIIIIIIlII(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                    AccBuilderEasyClues.c = lIIlIllll[lIIllIIlI[172]];
                    Movement.walkTo((WorldPoint)jj);

                    Time.sleepTicks((int)lIIllIIlI[0]);

                }
                if (N.lIIIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(jj), lIIllIIlI[10])) {
                    lIIIIIlIIIlllIl = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (N.llllllllllI(tileObject.getName().contains(lIIlIllll[lIIllIIlI[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIIlI[0]];
                            stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[183]];
                            if (N.llllllllllI(tileObject.hasAction(stringArray) ? 1 : 0) && N.lIIIIIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIIlI[21], lIIllIIlI[184], lIIllIIlI[3])), lIIllIIlI[3])) {
                                n2 = lIIllIIlI[0];

                                if (((0xE7 ^ 0x8E ^ (0x9B ^ 0xA0)) & (34 + 21 - -144 + 4 ^ 102 + 1 - 12 + 62 ^ -1)) <= 0) return n2 != 0;
                                return ((0x8D ^ 0xBB ^ (0xD5 ^ 0x80)) & (0xB9 ^ 0x93 ^ (0xE ^ 0x47) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIllIIlI[1];
                        return n2 != 0;
                    });
                    if (N.lIIIIIIIIIIl(lIIIIIlIIIlllIl)) {
                        lIIIIIlIIIlllIl.interact(lIIlIllll[lIIllIIlI[173]]);
                        Time.sleepTicks((int)lIIllIIlI[8]);

                    }
                    if (N.lIIIIIIIlIII(lIIIIIlIIIlllIl)) {
                        if (N.lllllllllll(cl, lIIllIIlI[0])) {
                            an.pM += lIIllIIlI[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIllIIlI[0];
                            an.pM = lIIllIIlI[1];
                            cm = lIIllIIlI[1];
                        }
                        g.a(lIIlIllll[lIIllIIlI[174]], bR, lIIllIIlI[0]);
                    }
                }
            }
            g.a(bR);
        }
    }

    static boolean co() {
        int n2;
        if (N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[74])) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[80])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[75]), lIIllIIlI[0]) && N.lIIIIIIIIIII(Vars.getBit((int)lIIllIIlI[103])) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[121]), lIIllIIlI[0]) && N.lIIIIIIIIllI(Vars.getBit((int)lIIllIIlI[126]), lIIllIIlI[0])) {
            n2 = lIIllIIlI[0];

            if (1 == -1) {
                return ((0x38 ^ 0x6A ^ (0x5D ^ 0x59)) & (0x20 ^ 0xE ^ (0x44 ^ 0x3C) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIIlI[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (N.lIIIIIIIlIIl(e.j(lIIllIIlI[47]), lIIllIIlI[8])) {
            bl = lIIllIIlI[0];

            }
        } else {
            bl = lIIllIIlI[1];
        }
        return bl;
    }

    @Override
    public boolean S() {
        return lIIllIIlI[1];
    }

    private static boolean lIIIIIIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIlIII(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            N.cn();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIIllIIlI[144];
    }

    private static boolean llllllllllI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIlIllll[lIIllIIlI[180]];
    }

    private static void af() {
        block14: {
            d lIIIIIlIIIIlIII;
            block13: {
                block12: {
                    block11: {
                        Object lIIIIIlIIIIlIIl;
                        int[] nArray = new int[lIIllIIlI[0]];
                        nArray[N.lIIllIIlI[1]] = lIIllIIlI[6];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIllIIlI[6], lIIllIIlI[10], lIIllIIlI[175]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIllIIlI[0]];
                        nArray2[N.lIIllIIlI[1]] = lIIllIIlI[7];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIIIIIlIIIIlIIl = new DHelper(lIIllIIlI[7], lIIllIIlI[0], lIIllIIlI[175]);
                            bv.add((DHelper) IIIIIlIIIIlIIl);

                        }
                        int[] nArray3 = new int[lIIllIIlI[0]];
                        nArray3[N.lIIllIIlI[1]] = lIIllIIlI[9];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIIIIIlIIIIlIIl = new DHelper(lIIllIIlI[9], lIIllIIlI[0], lIIllIIlI[175]);
                            bv.add((DHelper) IIIIIlIIIIlIIl);

                        }
                        if (N.lIIIIIIIIIII(Bank.contains((Predicate)(lIIIIIlIIIIlIIl = item -> item.getName().toLowerCase().contains(lIIlIllll[lIIllIIlI[181]]))) ? 1 : 0)) {
                            lIIIIIlIIIIlIII = new DHelper(lIIllIIlI[176], lIIllIIlI[14], lIIllIIlI[177]);
                            bv.add(lIIIIIlIIIIlIII);

                        }
                        int[] nArray4 = new int[lIIllIIlI[0]];
                        nArray4[N.lIIllIIlI[1]] = lIIllIIlI[12];
                        if (N.lIIIIIIIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIIIIIlIIIIlIII = new DHelper(lIIllIIlI[12], lIIllIIlI[4], i.bq);
                            bv.add(lIIIIIlIIIIlIII);

                        }
                        int[] nArray5 = new int[lIIllIIlI[0]];
                        nArray5[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.llllllllllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIllIIlI[0]];
                        nArray6[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.llllllllllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIllIIlI[0]];
                        nArray7[N.lIIllIIlI[1]] = lIIllIIlI[13];
                        if (!N.lllllllllll(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIIlI[14])) break block12;
                    }
                    lIIIIIlIIIIlIII = new DHelper(lIIllIIlI[13], lIIllIIlI[10], lIIllIIlI[178]);
                    bv.add(lIIIIIlIIIIlIII);

                }
                int[] nArray = new int[lIIllIIlI[0]];
                nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.llllllllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIllIIlI[0]];
                nArray8[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.llllllllllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIllIIlI[0]];
                nArray9[N.lIIllIIlI[1]] = lIIllIIlI[5];
                if (!N.lllllllllll(Bank.getFirst((int[])nArray9).getQuantity(), lIIllIIlI[27])) break block14;
            }
            lIIIIIlIIIIlIII = new DHelper(lIIllIIlI[5], lIIllIIlI[57], lIIllIIlI[179]);
            bv.add(lIIIIIlIIIIlIII);

        }
    }

    static {
        N.lllllllllII();
        N.llllllIllII();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIllIIlI[64], lIIllIIlI[187], lIIllIIlI[1]);
        jg = new WorldPoint(lIIllIIlI[188], lIIllIIlI[189], lIIllIIlI[1]);
        jh = new WorldPoint(lIIllIIlI[161], lIIllIIlI[190], lIIllIIlI[1]);
        ji = new WorldPoint(lIIllIIlI[191], lIIllIIlI[192], lIIllIIlI[1]);
        jj = new WorldPoint(lIIllIIlI[64], lIIllIIlI[45], lIIllIIlI[3]);
        jk = lIIllIIlI[47];
        String[] stringArray = new String[lIIllIIlI[8]];
        stringArray[N.lIIllIIlI[1]] = lIIlIllll[lIIllIIlI[193]];
        stringArray[N.lIIllIIlI[0]] = lIIlIllll[lIIllIIlI[194]];
        stringArray[N.lIIllIIlI[3]] = lIIlIllll[lIIllIIlI[195]];
        bR = stringArray;
        jl = new WorldArea(lIIllIIlI[188], lIIllIIlI[196], lIIllIIlI[50], lIIllIIlI[40], lIIllIIlI[1]);
    }

    private static boolean lIIIIIIIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIIIlIIIIllIl;
        int[] nArray = new int[lIIllIIlI[4]];
        nArray[N.lIIllIIlI[1]] = lIIllIIlI[5];
        nArray[N.lIIllIIlI[0]] = lIIllIIlI[6];
        nArray[N.lIIllIIlI[3]] = lIIllIIlI[7];
        nArray[N.lIIllIIlI[8]] = lIIllIIlI[9];
        int[] nArray2 = nArray;
        int lIIIIIlIIIIllII = lIIllIIlI[1];
        while (N.lllllllllll(lIIIIIlIIIIllII, ((void)lIIIIIlIIIIllIl).length)) {
            int[] nArray3 = new int[lIIllIIlI[0]];
            nArray3[N.lIIllIIlI[1]] = lIIIIIlIIIIllIl[lIIIIIlIIIIllII];
            if (N.lIIIIIIIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIllIIlI[1];
            }
            ++lIIIIIlIIIIllII;

            return false;
        }
        return lIIllIIlI[0];
    }

    private static boolean lIIIIIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static int lllllllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llllllIllII() {
        lIIlIllll = new String[lIIllIIlI[197]];
        N.lIIlIllll[N.lIIllIIlI[1]] = "Finished buying items, switching back to quest";
        N.lIIlIllll[N.lIIllIIlI[0]] = "Nav to bank";
        N.lIIlIllll[N.lIIllIIlI[3]] = "Handling banking";
        N.lIIlIllll[N.lIIllIIlI[8]] = "We are missing quest supplies, switching to BUYING";
        N.lIIlIllll[N.lIIllIIlI[4]] = "Drink";
        N.lIIlIllll[N.lIIllIIlI[14]] = "Eat";
        N.lIIlIllll[N.lIIllIIlI[17]] = "Nav to start";
        N.lIIlIllll[N.lIIllIIlI[18]] = "Start quest";
        N.lIIlIllll[N.lIIllIIlI[16]] = "Veronica";
        N.lIIlIllll[N.lIIllIIlI[20]] = "Key";
        N.lIIlIllll[N.lIIllIIlI[10]] = "Nav to fish food";
        N.lIIlIllll[N.lIIllIIlI[23]] = "Can't reach, navigating";
        N.lIIlIllll[N.lIIllIIlI[24]] = "Taking food";
        N.lIIlIllll[N.lIIllIIlI[25]] = "Take";
        N.lIIlIllll[N.lIIllIIlI[26]] = "Making poison fish food";
        N.lIIlIllll[N.lIIllIIlI[27]] = "Key";
        N.lIIlIllll[N.lIIllIIlI[28]] = "Nav to compost";
        N.lIIlIllll[N.lIIllIIlI[29]] = "Digging";
        N.lIIlIllll[N.lIIllIIlI[30]] = "Compost heap";
        N.lIIlIllll[N.lIIllIIlI[31]] = "Search";
        N.lIIlIllll[N.lIIllIIlI[32]] = "Key";
        N.lIIlIllll[N.lIIllIIlI[33]] = "Nav to fountain";
        N.lIIlIllll[N.lIIllIIlI[34]] = "Fountain";
        N.lIIlIllll[N.lIIllIIlI[35]] = "Key";
        N.lIIlIllll[N.lIIllIIlI[36]] = "Pressure gauge";
        N.lIIlIllll[N.lIIllIIlI[37]] = "Getting guage";
        N.lIIlIllll[N.lIIllIIlI[38]] = "Fountain";
        N.lIIlIllll[N.lIIllIIlI[39]] = "Search";
        N.lIIlIllll[N.lIIllIIlI[40]] = "Key";
        N.lIIlIllll[N.lIIllIIlI[41]] = "Pressure gauge";
        N.lIIlIllll[N.lIIllIIlI[42]] = "Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[46]] = "Nav to door";
        N.lIIlIllll[N.lIIllIIlI[47]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[48]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[49]] = "Get tube";
        N.lIIlIllll[N.lIIllIIlI[50]] = "Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[51]] = "Take";
        N.lIIlIllll[N.lIIllIIlI[52]] = "Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[53]] = "Oil can";
        N.lIIlIllll[N.lIIllIIlI[56]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[57]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[58]] = "Nav to final room";
        N.lIIlIllll[N.lIIllIIlI[59]] = "Ladder";
        N.lIIlIllll[N.lIIllIIlI[60]] = "Climb-down";
        N.lIIlIllll[N.lIIllIIlI[76]] = "Nav to a";
        N.lIIlIllll[N.lIIllIIlI[77]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[78]] = "Lever A";
        N.lIIlIllll[N.lIIllIIlI[79]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[81]] = "Nav to b";
        N.lIIlIllll[N.lIIllIIlI[82]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[15]] = "Lever B";
        N.lIIlIllll[N.lIIllIIlI[83]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[85]] = "Nav to d";
        N.lIIlIllll[N.lIIllIIlI[86]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[87]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[88]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[89]] = "Lever D";
        N.lIIlIllll[N.lIIllIIlI[90]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[92]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[93]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[94]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[95]] = "Nav to b";
        N.lIIlIllll[N.lIIllIIlI[96]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[97]] = "Lever B";
        N.lIIlIllll[N.lIIllIIlI[98]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[99]] = "Nav to a";
        N.lIIlIllll[N.lIIllIIlI[100]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[101]] = "Lever A";
        N.lIIlIllll[N.lIIllIIlI[102]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[105]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[106]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[107]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[110]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[111]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[112]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[114]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[115]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[116]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[117]] = "Nav to e";
        N.lIIlIllll[N.lIIllIIlI[118]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[119]] = "Lever E";
        N.lIIlIllll[N.lIIllIIlI[120]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[122]] = "Nav to f";
        N.lIIlIllll[N.lIIllIIlI[123]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[124]] = "Lever F";
        N.lIIlIllll[N.lIIllIIlI[125]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[128]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[129]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[130]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[132]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[133]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[134]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[135]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[136]] = "Lever C";
        N.lIIlIllll[N.lIIllIIlI[137]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[139]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[140]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[141]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[142]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[143]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[144]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[145]] = "Nav to e";
        N.lIIlIllll[N.lIIllIIlI[146]] = "Pull lever";
        N.lIIlIllll[N.lIIllIIlI[147]] = "Lever E";
        N.lIIlIllll[N.lIIllIIlI[148]] = "Pull";
        N.lIIlIllll[N.lIIllIIlI[149]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[150]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[151]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[153]] = "Move to door";
        N.lIIlIllll[N.lIIllIIlI[154]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[155]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[156]] = "Opening 145";
        N.lIIlIllll[N.lIIllIIlI[158]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[160]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[163]] = "Oil can";
        N.lIIlIllll[N.lIIllIIlI[164]] = "Oil can";
        N.lIIlIllll[N.lIIllIIlI[165]] = "Take";
        N.lIIlIllll[N.lIIllIIlI[166]] = "Rubber tube";
        N.lIIlIllll[N.lIIllIIlI[167]] = "Oil can";
        N.lIIlIllll[N.lIIllIIlI[168]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[169]] = "Nav to professor";
        N.lIIlIllll[N.lIIllIIlI[170]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[171]] = "Professor Oddenstein";
        N.lIIlIllll[N.lIIllIIlI[172]] = "Nav to professor";
        N.lIIlIllll[N.lIIllIIlI[173]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[174]] = "Professor Oddenstein";
        N.lIIlIllll[N.lIIllIIlI[180]] = "Ernest the Chicken";
        N.lIIlIllll[N.lIIllIIlI[181]] = "ring of wealth (";
        N.lIIlIllll[N.lIIllIIlI[182]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[183]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[185]] = "Door";
        N.lIIlIllll[N.lIIllIIlI[186]] = "Open";
        N.lIIlIllll[N.lIIllIIlI[193]] = "Yes.";
        N.lIIlIllll[N.lIIllIIlI[194]] = "I'm looking for a guy called Ernest.";
        N.lIIlIllll[N.lIIllIIlI[195]] = "I'm glad Veronica didn't actually get engaged to a chicken.";
    }

        return String.valueOf(lIIIIIIlllIlIII);
    }
}

