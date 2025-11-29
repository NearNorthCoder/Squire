/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.CHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class XHelper
implements S {
    static  String[] bQ;
    public static  WorldPoint gh;
     WorldArea gn;
    public static  WorldArea ge;
    public static  WorldPoint gi;
    public static  WorldPoint gg;
    
     WorldArea go;
    static  boolean cl;
    public static  WorldPoint gj;
    public static  List<d> bu;
    public static  boolean bs;
    public static  WorldPoint gk;
    
    static  int ck;
    public static  WorldPoint gf;
    public static  WorldPoint gl;
     WorldArea gm;

    private static boolean llIIllIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIllIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var1;
        int[] nArray = new int[llllIIlIlI[13]];
        nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
        nArray[x.llllIIlIlI[5]] = llllIIlIlI[15];
        nArray[x.llllIIlIlI[6]] = llllIIlIlI[16];
        nArray[x.llllIIlIlI[11]] = llllIIlIlI[17];
        nArray[x.llllIIlIlI[12]] = llllIIlIlI[18];
        nArray[x.llllIIlIlI[19]] = llllIIlIlI[20];
        nArray[x.llllIIlIlI[21]] = llllIIlIlI[22];
        nArray[x.llllIIlIlI[23]] = llllIIlIlI[24];
        int[] nArray2 = nArray;
        int var2 = llllIIlIlI[4];
        while (x.llIIllIlIlIII(var2, ((void)var1).length)) {
            int[] nArray3 = new int[llllIIlIlI[5]];
            nArray3[x.llllIIlIlI[4]] = var1[var2];
            if (x.llIIllIlIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llllIIlIlI[4];
            }
            ++var2;

            if (-2 <= 0) continue;
            return false;
        }
        return llllIIlIlI[5];
    }

    private static boolean llIIllIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIlIllII(Object object) {
        return object != null;
    }

    private static boolean llIIllIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIlIIlll(int n2) {
        return n2 != 0;
    }

    public XHelper() {
        this.gm = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[4]);
        this.gn = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[5]);
        this.go = new WorldArea(llllIIlIlI[0], llllIIlIlI[1], llllIIlIlI[2], llllIIlIlI[3], llllIIlIlI[6]);
    }

    public static void bQ() {
        if (x.llIIllIlIIlll(bs ? 1 : 0)) {
            b.a(bu);
            if (x.llIIllIlIlIII(bu.size(), llllIIlIlI[5])) {
                System.out.println(llllIIlIIl[llllIIlIlI[4]]);
                bs = llllIIlIlI[4];
            }
        }
        if (x.llIIllIlIlIIl(bs ? 1 : 0)) {
            WorldArea var3;
            if (x.llIIllIlIlIII(e.j(llllIIlIlI[7]), llllIIlIlI[8])) {
                C.cb();
            }
            if (x.llIIllIlIlIlI(e.j(llllIIlIlI[7]), llllIIlIlI[8]) && x.llIIllIlIlIII(e.H(), llllIIlIlI[9])) {
                System.out.println(llllIIlIIl[llllIIlIlI[5]]);
                AccBuilderTempleTrek.d = llllIIlIlI[5];
                return;
            }
            if (x.llIIllIlIlIIl(x.aa() ? 1 : 0) && x.llIIllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && x.llIIllIlIlIlI(e.j(llllIIlIlI[7]), llllIIlIlI[8]) && x.llIIllIlIlIll(e.H(), llllIIlIlI[9])) {
                var3 = BankLocation.getNearest();
                if (x.llIIllIlIllII(var3) && x.llIIllIlIlIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[6]];
                    a.a((BankLocation)var3);
                }
                if (x.llIIllIlIllII(var3) && x.llIIllIlIIlll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.llIIllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIlIlI[10]);

                    }
                    if (x.llIIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[11]];
                        if (x.llIIllIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIIlIlI[12]);

                        }
                        if (x.llIIllIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIIlIlI[6]);

                        }
                        int[] nArray = new int[llllIIlIlI[13]];
                        nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
                        nArray[x.llllIIlIlI[5]] = llllIIlIlI[15];
                        nArray[x.llllIIlIlI[6]] = llllIIlIlI[16];
                        nArray[x.llllIIlIlI[11]] = llllIIlIlI[17];
                        nArray[x.llllIIlIlI[12]] = llllIIlIlI[18];
                        nArray[x.llllIIlIlI[19]] = llllIIlIlI[20];
                        nArray[x.llllIIlIlI[21]] = llllIIlIlI[22];
                        nArray[x.llllIIlIlI[23]] = llllIIlIlI[24];
                        if (x.llIIllIlIlIIl(e.b(nArray) ? 1 : 0)) {
                            x.ae();
                            System.out.println(llllIIlIIl[llllIIlIlI[12]]);
                            bs = llllIIlIlI[5];
                            return;
                        }
                        int[] nArray2 = new int[llllIIlIlI[13]];
                        nArray2[x.llllIIlIlI[4]] = llllIIlIlI[14];
                        nArray2[x.llllIIlIlI[5]] = llllIIlIlI[15];
                        nArray2[x.llllIIlIlI[6]] = llllIIlIlI[16];
                        nArray2[x.llllIIlIlI[11]] = llllIIlIlI[17];
                        nArray2[x.llllIIlIlI[12]] = llllIIlIlI[18];
                        nArray2[x.llllIIlIlI[19]] = llllIIlIlI[20];
                        nArray2[x.llllIIlIlI[21]] = llllIIlIlI[22];
                        nArray2[x.llllIIlIlI[23]] = llllIIlIlI[24];
                        if (x.llIIllIlIIlll(e.b(nArray2) ? 1 : 0)) {
                            a.a(llllIIlIlI[14], llllIIlIlI[25]);
                            a.a(llllIIlIlI[22], llllIIlIlI[25]);
                            a.a(llllIIlIlI[15], llllIIlIlI[6]);
                            a.a(llllIIlIlI[16], llllIIlIlI[5]);
                            a.a(llllIIlIlI[17], llllIIlIlI[5]);
                            a.a(llllIIlIlI[18], llllIIlIlI[5]);
                            a.a(llllIIlIlI[24], llllIIlIlI[5]);
                            a.a(llllIIlIlI[20], llllIIlIlI[5]);
                            a.a(llllIIlIlI[26], llllIIlIlI[6]);
                            a.a(llllIIlIlI[27], llllIIlIlI[5]);
                            a.a(llllIIlIlI[28], llllIIlIlI[19]);
                            int[] nArray3 = new int[llllIIlIlI[5]];
                            nArray3[x.llllIIlIlI[4]] = llllIIlIlI[15];
                            if (x.llIIllIlIlIlI(Inventory.getAll((int[])nArray3).size(), llllIIlIlI[5])) {
                                a.a(llllIIlIlI[29], llllIIlIlI[6]);
                            }
                        }
                    }
                }
            }
            if (x.llIIllIlIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && x.llIIllIlIlIII(Movement.getRunEnergy(), llllIIlIlI[30])) {
                Inventory.getFirst((int[])f.aU).interact(llllIIlIIl[llllIIlIlI[19]]);
                Time.sleepTicks((int)llllIIlIlI[5]);

            }
            if (x.llIIllIlIlIII(Prayers.getPoints(), llllIIlIlI[31]) && x.llIIllIlIIlll(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aR).interact(llllIIlIIl[llllIIlIlI[21]]);
                Time.sleepTicks((int)llllIIlIlI[6]);

            }
            if (x.llIIllIlIIlll(x.aa() ? 1 : 0) && x.llIIllIlIlIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[23]];
                    if (x.llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)gf);

                    Time.sleepTicks((int)llllIIlIlI[5]);

                }
                if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gf), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[13]];
                    g.a(llllIIlIIl[llllIIlIlI[32]], bQ);
                }
            }
            if (!x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[19]) || x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[23])) {
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[25])) {
                if (!x.llIIllIlIlIll(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19]) || x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[34])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gg), llllIIlIlI[5])) {
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] stringArray = new String[llllIIlIlI[5]];
                            stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[25]];
                            String[] stringArray2 = new String[llllIIlIlI[5]];
                            stringArray2[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[35]];
                            if (x.llIIllIlIIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                String[] stringArray3 = new String[llllIIlIlI[5]];
                                stringArray3[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[36]];
                                TileObjects.getNearest((String[])stringArray3).interact(llllIIlIIl[llllIIlIlI[37]]);
                                Time.sleepTicks((int)llllIIlIlI[6]);

                            }
                            String[] stringArray4 = new String[llllIIlIlI[5]];
                            stringArray4[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[38]];
                            String[] stringArray5 = new String[llllIIlIlI[5]];
                            stringArray5[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[34]];
                            if (x.llIIllIlIlIIl(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                                WorldArea worldArea = new WorldPoint[llllIIlIlI[19]];
                                worldArea[x.llllIIlIlI[4]] = new WorldPoint(llllIIlIlI[39], llllIIlIlI[40], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[5]] = new WorldPoint(llllIIlIlI[41], llllIIlIlI[42], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[6]] = new WorldPoint(llllIIlIlI[43], llllIIlIlI[44], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[11]] = new WorldPoint(llllIIlIlI[45], llllIIlIlI[46], llllIIlIlI[4]);
                                worldArea[x.llllIIlIlI[12]] = new WorldPoint(llllIIlIlI[47], llllIIlIlI[48], llllIIlIlI[4]);
                                var3 = worldArea;
                                Walker.walkAlong(Arrays.asList(var3), new HashMap());

                                Time.sleepTicks((int)llllIIlIlI[5]);

                            }
                        }
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[9]];
                            Movement.walkTo((WorldPoint)gg);

                            Time.sleepTicks((int)llllIIlIlI[5]);

                        }
                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gg), llllIIlIlI[5])) {
                        if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[34]) && x.llIIllIlIllII(Widgets.get((int)llllIIlIlI[49], (int)llllIIlIlI[6])) && x.llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)llllIIlIlI[49], (int)llllIIlIlI[6]).getChild(llllIIlIlI[50]).interact(llllIIlIIl[llllIIlIlI[51]]);
                            Time.sleepTicks((int)llllIIlIlI[6]);

                        }
                        if (x.llIIllIlIlIII(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[52]];
                            g.a(llllIIlIIl[llllIIlIlI[53]], bQ);
                        }
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[19])) {
                    var3 = new WorldArea(llllIIlIlI[54], llllIIlIlI[40], llllIIlIlI[32], llllIIlIlI[25], llllIIlIlI[4]);
                    if (x.llIIllIlIlIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[55]];
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIIlIlI[41], llllIIlIlI[56], llllIIlIlI[4]));

                            Time.sleepTicks((int)llllIIlIlI[5]);

                        }
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gh), llllIIlIlI[21])) {
                            String[] stringArray = new String[llllIIlIlI[5]];
                            stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[57]];
                            String[] stringArray6 = new String[llllIIlIlI[5]];
                            stringArray6[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[58]];
                            if (x.llIIllIlIIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[llllIIlIlI[5]];
                                stringArray7[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[31]];
                                TileObjects.getNearest((String[])stringArray7).interact(llllIIlIIl[llllIIlIlI[59]]);
                                Time.sleepTicks((int)llllIIlIlI[6]);

                            }
                            String[] stringArray8 = new String[llllIIlIlI[5]];
                            stringArray8[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[60]];
                            String[] stringArray9 = new String[llllIIlIlI[5]];
                            stringArray9[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[61]];
                            if (x.llIIllIlIlIIl(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                g.a(llllIIlIIl[llllIIlIlI[62]], bQ);
                            }
                        }
                    }
                    if (x.llIIllIlIIlll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[63]];
                        g.a(llllIIlIIl[llllIIlIlI[64]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[33]), llllIIlIlI[25])) {
                    g.a(bQ);
                }
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[34])) {
                ck = llllIIlIlI[4];
                if (x.llIIllIlIlIIl(Vars.getBit((int)llllIIlIlI[65]))) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[66]];
                        Movement.walkTo((WorldPoint)gi);

                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[7]];
                        g.a(llllIIlIIl[llllIIlIlI[67]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[19])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[68]];
                        Movement.walkTo((WorldPoint)gj);

                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gj), llllIIlIlI[21])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[69]];
                        g.a(llllIIlIIl[llllIIlIlI[70]], bQ);
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[25])) {
                    String[] stringArray = new String[llllIIlIlI[5]];
                    stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[71]];
                    if (x.llIIllIlIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray10 = new String[llllIIlIlI[5]];
                        stringArray10[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[72]];
                        String[] stringArray11 = new String[llllIIlIlI[5]];
                        stringArray11[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[73]];
                        Inventory.getFirst((String[])stringArray10).useOn(Inventory.getFirst((String[])stringArray11));
                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                    String[] stringArray12 = new String[llllIIlIlI[5]];
                    stringArray12[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[74]];
                    if (x.llIIllIlIIlll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[50]];
                            Movement.walkTo((WorldPoint)gi);

                            Time.sleepTicks((int)llllIIlIlI[5]);

                        }
                        if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gi), llllIIlIlI[19])) {
                            AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[75]];
                            g.a(llllIIlIIl[llllIIlIlI[76]], bQ);
                        }
                    }
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[70])) {
                    g.a(bQ);
                }
                if (x.llIIllIlIlIlI(Vars.getBit((int)llllIIlIlI[65]), llllIIlIlI[50])) {
                    if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[77]];
                        Movement.walkTo((WorldPoint)gk);

                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                    if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gk), llllIIlIlI[13])) {
                        g.a(llllIIlIIl[llllIIlIlI[78]], bQ);
                    }
                }
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[55])) {
                if (x.llIIllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[79]];
                    if (x.llIIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)gl);

                    Time.sleepTicks((int)llllIIlIlI[5]);

                }
                if (x.llIIllIlIllll(Players.getLocal().getWorldLocation().distanceTo(gl), llllIIlIlI[19])) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[80]];
                    g.a(llllIIlIIl[llllIIlIlI[81]], bQ);
                }
            }
            if (!x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[60]) || !x.llIIllIllIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[66]) || x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[50])) {
                g.a(bQ);
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[70])) {
                g.a(bQ);
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[27];
                if (x.llIIllIlIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llllIIlIlI[5]];
                    nArray4[x.llllIIlIlI[4]] = llllIIlIlI[27];
                    if (x.llIIllIlIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIIlIlI[5]];
                        nArray5[x.llllIIlIlI[4]] = llllIIlIlI[27];
                        Inventory.getFirst((int[])nArray5).interact(llllIIlIIl[llllIIlIlI[82]]);
                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                }
                if (x.llIIllIlIlIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && x.llIIllIlIlIll(Skills.getLevel((Skill)Skill.PRAYER), llllIIlIlI[77]) && x.llIIllIlIllIl(Prayers.getPoints())) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (x.llIIllIlIllII(var3 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (x.llIIllIlIIlll(tileObject.getName().contains(llllIIlIIl[llllIIlIlI[96]]) ? 1 : 0)) {
                        String[] stringArray = new String[llllIIlIlI[5]];
                        stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[97]];
                        if (x.llIIllIlIIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llllIIlIlI[5];

                            if (2 <= 2) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llllIIlIlI[4];
                    return n2 != 0;
                }))) {
                    AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[83]];
                    var3.interact(llllIIlIIl[llllIIlIlI[30]]);
                    Time.sleepTicks((int)llllIIlIlI[12]);

                }
                if (x.llIIllIllIIIl(x.llIIllIlIIllI(e.u(), 50.0))) {
                    int[] nArray6 = new int[llllIIlIlI[5]];
                    nArray6[x.llllIIlIlI[4]] = llllIIlIlI[28];
                    if (x.llIIllIlIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[llllIIlIlI[5]];
                        nArray7[x.llllIIlIlI[4]] = llllIIlIlI[28];
                        Inventory.getFirst((int[])nArray7).interact(llllIIlIIl[llllIIlIlI[84]]);
                        Time.sleepTicks((int)llllIIlIlI[5]);

                    }
                }
            }
            if (x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) && x.llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIlIIl[llllIIlIlI[86]];
                if (x.llIIllIlIlIII(ck, llllIIlIlI[5])) {
                    ac.nd += llllIIlIlI[5];
                    ac.d(AccBuilderTempleTrek.m);
                    ck += llllIIlIlI[5];
                    ac.nd = llllIIlIlI[4];
                    cl = llllIIlIlI[4];
                }
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (x.llIIllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0) && x.llIIllIlIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] nArray8 = new int[llllIIlIlI[5]];
                    nArray8[x.llllIIlIlI[4]] = llllIIlIlI[14];
                    Inventory.getFirst((int[])nArray8).interact(llllIIlIIl[llllIIlIlI[87]]);
                    Time.sleepTicks((int)llllIIlIlI[12]);

                }
            }
            g.a(new String[llllIIlIlI[4]]);
        }
    }

    static {
        x.llIIllIlIIlIl();
        x.llIIllIlIIIll();
        ge = new WorldArea(llllIIlIlI[98], llllIIlIlI[99], llllIIlIlI[100], llllIIlIlI[101], llllIIlIlI[4]);
        bu = new ArrayList<d>();
        gf = new WorldPoint(llllIIlIlI[102], llllIIlIlI[56], llllIIlIlI[4]);
        gg = new WorldPoint(llllIIlIlI[103], llllIIlIlI[104], llllIIlIlI[4]);
        gh = new WorldPoint(llllIIlIlI[105], llllIIlIlI[106], llllIIlIlI[4]);
        gi = new WorldPoint(llllIIlIlI[107], llllIIlIlI[108], llllIIlIlI[4]);
        gj = new WorldPoint(llllIIlIlI[109], llllIIlIlI[110], llllIIlIlI[4]);
        gk = new WorldPoint(llllIIlIlI[111], llllIIlIlI[112], llllIIlIlI[4]);
        gl = new WorldPoint(llllIIlIlI[113], llllIIlIlI[114], llllIIlIlI[4]);
        String[] stringArray = new String[llllIIlIlI[11]];
        stringArray[x.llllIIlIlI[4]] = llllIIlIIl[llllIIlIlI[115]];
        stringArray[x.llllIIlIlI[5]] = llllIIlIIl[llllIIlIlI[116]];
        stringArray[x.llllIIlIlI[6]] = llllIIlIIl[llllIIlIlI[117]];
        bQ = stringArray;
    }

    private static boolean llIIllIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean S() {
        return llllIIlIlI[4];
    }

    private static boolean llIIllIlIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllIlIllIl(int n2) {
        return n2 > 0;
    }

    private static int llIIllIlIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void llIIllIlIIIll() {
        llllIIlIIl = new String[llllIIlIlI[118]];
        x.llllIIlIIl[x.llllIIlIlI[4]] = "Finished buying items, switching back to quest";
        x.llllIIlIIl[x.llllIIlIlI[5]] = "Need 16 QP";
        x.llllIIlIIl[x.llllIIlIlI[6]] = "Nav to bank";
        x.llllIIlIIl[x.llllIIlIlI[11]] = "Handling banking";
        x.llllIIlIIl[x.llllIIlIlI[12]] = "We are missing quest supplies, switching to BUYING";
        x.llllIIlIIl[x.llllIIlIlI[19]] = "Drink";
        x.llllIIlIIl[x.llllIIlIlI[21]] = "Drink";
        x.llllIIlIIl[x.llllIIlIlI[23]] = "Nav to start";
        x.llllIIlIIl[x.llllIIlIlI[13]] = "Starting quest";
        x.llllIIlIIl[x.llllIIlIlI[32]] = "Willow";
        x.llllIIlIIl[x.llllIIlIlI[25]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[35]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[36]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[37]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[38]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[34]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[9]] = "Nav to checkal";
        x.llllIIlIIl[x.llllIIlIlI[51]] = "Perform";
        x.llllIIlIIl[x.llllIIlIlI[52]] = "talk";
        x.llllIIlIIl[x.llllIIlIlI[53]] = "Checkal";
        x.llllIIlIIl[x.llllIIlIlI[55]] = "Nav to atlas";
        x.llllIIlIIl[x.llllIIlIlI[57]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[58]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[31]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[59]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[60]] = "Longhall door";
        x.llllIIlIIl[x.llllIIlIlI[61]] = "Open";
        x.llllIIlIIl[x.llllIIlIlI[62]] = "Atlas";
        x.llllIIlIIl[x.llllIIlIlI[63]] = "talk";
        x.llllIIlIIl[x.llllIIlIlI[64]] = "Atlas";
        x.llllIIlIIl[x.llllIIlIlI[66]] = "Nav to marley";
        x.llllIIlIIl[x.llllIIlIlI[7]] = "Talk";
        x.llllIIlIIl[x.llllIIlIlI[67]] = "Marley";
        x.llllIIlIIl[x.llllIIlIlI[68]] = "Nav to cook";
        x.llllIIlIIl[x.llllIIlIlI[69]] = "talk";
        x.llllIIlIIl[x.llllIIlIlI[70]] = "Cook";
        x.llllIIlIIl[x.llllIIlIlI[71]] = "Steak sandwich";
        x.llllIIlIIl[x.llllIIlIlI[72]] = "Knife";
        x.llllIIlIIl[x.llllIIlIlI[73]] = "Bread";
        x.llllIIlIIl[x.llllIIlIlI[74]] = "Steak sandwich";
        x.llllIIlIIl[x.llllIIlIlI[50]] = "Nav to marley";
        x.llllIIlIIl[x.llllIIlIlI[75]] = "Talk";
        x.llllIIlIIl[x.llllIIlIlI[76]] = "Marley";
        x.llllIIlIIl[x.llllIIlIlI[77]] = "Nav to burntof";
        x.llllIIlIIl[x.llllIIlIlI[78]] = "Burntof";
        x.llllIIlIIl[x.llllIIlIlI[79]] = "Nav to dungeon";
        x.llllIIlIIl[x.llllIIlIlI[80]] = "Starting quest";
        x.llllIIlIIl[x.llllIIlIlI[81]] = "Willow";
        x.llllIIlIIl[x.llllIIlIlI[82]] = "Wield";
        x.llllIIlIIl[x.llllIIlIlI[83]] = "Mining pillars";
        x.llllIIlIIl[x.llllIIlIlI[30]] = "Mine";
        x.llllIIlIIl[x.llllIIlIlI[84]] = "Eat";
        x.llllIIlIIl[x.llllIIlIlI[86]] = "Tele to varrock";
        x.llllIIlIIl[x.llllIIlIlI[87]] = "Break";
        x.llllIIlIIl[x.llllIIlIlI[94]] = "Below Ice Mountain";
        x.llllIIlIIl[x.llllIIlIlI[95]] = "ring of wealth (";
        x.llllIIlIIl[x.llllIIlIlI[96]] = "pillar";
        x.llllIIlIIl[x.llllIIlIlI[97]] = "Mine";
        x.llllIIlIIl[x.llllIIlIlI[115]] = "Yes.";
        x.llllIIlIIl[x.llllIIlIlI[116]] = "I was wondering if you'd be able to make me a Steak sandwich?";
        x.llllIIlIIl[x.llllIIlIlI[117]] = "Rock.";
    }

    private static boolean llIIllIllIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (!(!x.llIIllIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), llllIIlIlI[85]) || x.llIIllIlIlIIl(ge.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.llIIllIlIlIIl(this.gm.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.llIIllIlIlIIl(this.gn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !x.llIIllIlIIlll(this.go.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            n2 = llllIIlIlI[5];

            if (((0x16 ^ 0x58) & ~(0x45 ^ 0xB)) >= 1) {
                return false;
            }
        } else {
            n2 = llllIIlIlI[4];
        }
        return n2 != 0;
    }

    @Override
    public String U() {
        return llllIIlIIl[llllIIlIlI[94]];
    }

    @Override
    public int T() {
        try {
            x.bQ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x3E ^ 0x3A) <= 2) {
            return (0xAB ^ 0xB1) & ~(0x4F ^ 0x55);
        }
        return llllIIlIlI[8];
    }

    private static void ae() {
        block12: {
            d var4;
            block11: {
                Object var5;
                int[] nArray = new int[llllIIlIlI[5]];
                nArray[x.llllIIlIlI[4]] = llllIIlIlI[18];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llllIIlIlI[18], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add(d2);

                }
                int[] nArray2 = new int[llllIIlIlI[5]];
                nArray2[x.llllIIlIlI[4]] = llllIIlIlI[24];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var5 = new DHelper(llllIIlIlI[24], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add((DHelper) ar5);

                }
                int[] nArray3 = new int[llllIIlIlI[5]];
                nArray3[x.llllIIlIlI[4]] = llllIIlIlI[16];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var5 = new DHelper(llllIIlIlI[16], llllIIlIlI[5], llllIIlIlI[88]);
                    bu.add((DHelper) ar5);

                }
                int[] nArray4 = new int[llllIIlIlI[5]];
                nArray4[x.llllIIlIlI[4]] = llllIIlIlI[20];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var5 = new DHelper(llllIIlIlI[20], llllIIlIlI[5], llllIIlIlI[89]);
                    bu.add((DHelper) ar5);

                }
                int[] nArray5 = new int[llllIIlIlI[5]];
                nArray5[x.llllIIlIlI[4]] = llllIIlIlI[17];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    var5 = new DHelper(llllIIlIlI[17], llllIIlIlI[5], llllIIlIlI[89]);
                    bu.add((DHelper) ar5);

                }
                int[] nArray6 = new int[llllIIlIlI[5]];
                nArray6[x.llllIIlIlI[4]] = llllIIlIlI[22];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    var5 = new DHelper(llllIIlIlI[22], llllIIlIlI[25], llllIIlIlI[90]);
                    bu.add((DHelper) ar5);

                }
                if (x.llIIllIlIlIIl(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(llllIIlIIl[llllIIlIlI[95]]))) ? 1 : 0)) {
                    var4 = new DHelper(llllIIlIlI[91], llllIIlIlI[19], llllIIlIlI[92]);
                    bu.add(var4);

                }
                int[] nArray7 = new int[llllIIlIlI[5]];
                nArray7[x.llllIIlIlI[4]] = llllIIlIlI[15];
                if (x.llIIllIlIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    var4 = new DHelper(llllIIlIlI[15], llllIIlIlI[12], i.bp);
                    bu.add(var4);

                }
                int[] nArray8 = new int[llllIIlIlI[5]];
                nArray8[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[llllIIlIlI[5]];
                nArray9[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[llllIIlIlI[5]];
                nArray10[x.llllIIlIlI[4]] = llllIIlIlI[14];
                if (!x.llIIllIlIlIII(Bank.getFirst((int[])nArray10).getQuantity(), llllIIlIlI[34])) break block12;
            }
            var4 = new DHelper(llllIIlIlI[14], llllIIlIlI[50], llllIIlIlI[93]);
            bu.add(var4);

        }
    }

        return String.valueOf(var6);
    }

    private static boolean llIIllIlIlIIl(int n2) {
        return n2 == 0;
    }
}

