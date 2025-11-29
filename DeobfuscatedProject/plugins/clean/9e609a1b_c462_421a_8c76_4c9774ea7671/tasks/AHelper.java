/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
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
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.VHelper;
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class AHelper
implements M {
    
    public static  boolean by;
    static  int gt;
    static  int gu;
    static  WorldArea gw;
    static  boolean cp;
    static final  int gn;
    public static  WorldPoint gp;
    public static  List<d> bA;
    public static  WorldPoint gq;
    public static  WorldPoint go;
    public static  WorldPoint gr;
    static  int co;
    public static  WorldPoint ct;
    static  String[] bW;
    static  int gs;
    static  WorldPoint[] gv;

    private static boolean lIlIIlIIllllIlI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIlllII[0]];
        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[13];
        if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIlllIlllII[0]];
            nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[14];
            if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIlllIlllII[0]];
                nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (A.lIlIIlIlIIIIIIl(Inventory.getCount((int[])nArray3), lIIIlllIlllII[6])) {
                    int[] nArray4 = new int[lIIIlllIlllII[0]];
                    nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                    if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray4))) {
                        int[] nArray5 = new int[lIIIlllIlllII[0]];
                        nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[12];
                        if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray5))) {
                            int[] nArray6 = new int[lIIIlllIlllII[0]];
                            nArray6[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                            if (A.lIlIIlIIlllllII(Inventory.getCount((int[])nArray6)) && A.lIlIIlIIlllllII(Inventory.getCount((int[])f.ba))) {
                                n2 = lIIIlllIlllII[0];

                                if (((0x8D ^ 0x9F) & ~(0xF ^ 0x1D)) <= ((0x44 ^ 0x50) & ~(0xB8 ^ 0xAC))) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIlllII[1];
        return n2 != 0;
    }

    private static int lIlIIlIIlllIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int Y() {
        try {
            A.cc();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xC9 ^ 0x9C) & ~(0x6F ^ 0x3A)) < 0) {
            return (0xB0 ^ 0x9C) & ~(0x3D ^ 0x11);
        }
        return lIIIlllIlllII[3];
    }

    public static void cc() {
        if (A.lIlIIlIIlllIlll(by ? 1 : 0)) {
            b.a(bA);
            if (A.lIlIIlIIllllIII(bA.size(), lIIIlllIlllII[0])) {
                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[1]]);
                by = lIIIlllIlllII[1];
            }
        }
        if (A.lIlIIlIIllllIIl(by ? 1 : 0)) {
            BankLocation var2;
            if (A.lIlIIlIIllllIII(e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3])) {
                v.bl();
            }
            if (A.lIlIIlIIllllIIl(A.S() ? 1 : 0) && A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[2]), lIIIlllIlllII[3]) && A.lIlIIlIIllllIII(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                var2 = BankLocation.getNearest();
                if (A.lIlIIlIIllllIll(var2) && A.lIlIIlIIllllIIl(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[0]];
                    a.a(var2);
                }
                if (A.lIlIIlIIllllIll(var2) && A.lIlIIlIIlllIlll(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (A.lIlIIlIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlllII[5]);

                    }
                    if (A.lIlIIlIIlllIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[6]];
                        if (A.lIlIIlIIlllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlllIlllII[7]);

                        }
                        if (A.lIlIIlIIlllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlllIlllII[6]);

                        }
                        int[] nArray = new int[lIIIlllIlllII[0]];
                        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                        if (A.lIlIIlIIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIlllIlllII[0]];
                            nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                            if (A.lIlIIlIIllllIII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIlllII[6])) {
                                A.W();
                                System.out.println(lIIIlllIllIIl[lIIIlllIlllII[9]]);
                                by = lIIIlllIlllII[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIIlllIlllII[10]];
                        nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        nArray3[A.lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        nArray3[A.lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        nArray3[A.lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        nArray3[A.lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        nArray3[A.lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        nArray3[A.lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (A.lIlIIlIIllllIIl(e.b(nArray3) ? 1 : 0)) {
                            A.W();
                            System.out.println(lIIIlllIllIIl[lIIIlllIlllII[7]]);
                            by = lIIIlllIlllII[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIIlllIlllII[10]];
                        nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
                        nArray4[A.lIIIlllIlllII[0]] = lIIIlllIlllII[12];
                        nArray4[A.lIIIlllIlllII[6]] = lIIIlllIlllII[13];
                        nArray4[A.lIIIlllIlllII[9]] = lIIIlllIlllII[14];
                        nArray4[A.lIIIlllIlllII[7]] = lIIIlllIlllII[8];
                        nArray4[A.lIIIlllIlllII[15]] = lIIIlllIlllII[16];
                        nArray4[A.lIIIlllIlllII[17]] = lIIIlllIlllII[18];
                        if (A.lIlIIlIIlllIlll(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIIIlllIlllII[11], lIIIlllIlllII[19]);
                            a.a(lIIIlllIlllII[12], lIIIlllIlllII[19]);
                            a.a(lIIIlllIlllII[13], lIIIlllIlllII[0]);
                            a.a(lIIIlllIlllII[14], lIIIlllIlllII[0]);
                            a.a(lIIIlllIlllII[8], lIIIlllIlllII[6]);
                            a.a(lIIIlllIlllII[18], lIIIlllIlllII[7]);
                            a.a(lIIIlllIlllII[16], lIIIlllIlllII[19]);
                        }
                    }
                }
            }
            if (A.lIlIIlIIlllIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && A.lIlIIlIIllllIII(Movement.getRunEnergy(), lIIIlllIlllII[20])) {
                Inventory.getFirst((int[])f.ba).interact(lIIIlllIllIIl[lIIIlllIlllII[15]]);
                Time.sleepTicks((int)lIIIlllIlllII[0]);

            }
            if (A.lIlIIlIIlllllIl(A.lIlIIlIIlllIllI(e.v(), 50.0))) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                if (A.lIlIIlIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIlllIlllII[0]];
                    nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
                    Inventory.getFirst((int[])nArray5).interact(lIIIlllIllIIl[lIIIlllIlllII[17]]);
                    Time.sleepTicks((int)lIIIlllIlllII[6]);

                }
            }
            if (A.lIlIIlIIlllIlll(A.S() ? 1 : 0) && A.lIlIIlIIllllIIl(e.j(lIIIlllIlllII[4]))) {
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[10]];
                    if (A.lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)ct);

                    Time.sleepTicks((int)lIIIlllIlllII[0]);

                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[21]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[22]], bW);
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[0])) {
                co = lIIIlllIlllII[1];
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[19]];
                    Movement.walkTo((WorldPoint)go);

                    Time.sleepTicks((int)lIIIlllIlllII[0]);

                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(go), lIIIlllIlllII[15])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[23]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[24]], bW);
                }
            }
            if (!A.lIlIIlIlIIIIIII(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[6]) || A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[9])) {
                if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[25]];
                    if (A.lIlIIlIIllllIII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                        if (A.lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(gv), new HashMap());

                            Time.sleepTicks((int)lIIIlllIlllII[0]);

                        }
                        if (A.lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)gp);

                            Time.sleepTicks((int)lIIIlllIlllII[0]);

                        }
                    }
                    if (A.lIlIIlIlIIIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                        Movement.walkTo((WorldPoint)gp);

                        Time.sleepTicks((int)lIIIlllIlllII[0]);

                    }
                }
                if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                    AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[26]];
                    g.a(lIIIlllIllIIl[lIIIlllIlllII[27]], bW);
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = gt;
                if (A.lIlIIlIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[28]];
                        Movement.walkTo((WorldPoint)gq);

                        Time.sleepTicks((int)lIIIlllIlllII[0]);

                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gq), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[29]];
                        int[] nArray6 = new int[lIIIlllIlllII[0]];
                        nArray6[A.lIIIlllIlllII[1]] = gs;
                        if (A.lIlIIlIIllllIll(TileObjects.getNearest((int[])nArray6))) {
                            int[] nArray7 = new int[lIIIlllIlllII[0]];
                            nArray7[A.lIIIlllIlllII[1]] = gs;
                            TileObjects.getNearest((int[])nArray7).interact(lIIIlllIllIIl[lIIIlllIlllII[30]]);
                            Time.sleepTicks((int)lIIIlllIlllII[6]);

                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[7])) {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = gt;
                if (A.lIlIIlIIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[31]];
                        Movement.walkTo((WorldPoint)ct);

                        Time.sleepTicks((int)lIIIlllIlllII[0]);

                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[32]];
                        g.a(lIIIlllIllIIl[lIIIlllIlllII[33]], bW);
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[34]];
                if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllIlllII[0]];
                    stringArray2[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[35]];
                    if (A.lIlIIlIIllllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[36]];
                            Movement.walkTo((WorldPoint)gr);

                            Time.sleepTicks((int)lIIIlllIlllII[0]);

                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gr), lIIIlllIlllII[9])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[37]];
                            var2 = new WorldArea(lIIIlllIlllII[38], lIIIlllIlllII[39], lIIIlllIlllII[21], lIIIlllIlllII[7], lIIIlllIlllII[6]);
                            String[] stringArray3 = new String[lIIIlllIlllII[0]];
                            stringArray3[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[40]];
                            NPC var3 = NPCs.getNearest((String[])stringArray3);
                            if (A.lIlIIlIIllllIll(var3) && A.lIlIIlIIlllIlll(var2.contains(var3.getWorldLocation()) ? 1 : 0)) {
                                e.C();
                            }
                            int[] nArray = new int[lIIIlllIlllII[0]];
                            nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[41];
                            TileObject var4 = TileObjects.getNearest((int[])nArray);
                            if (A.lIlIIlIIllllIll(var4)) {
                                String[] stringArray4 = new String[lIIIlllIlllII[0]];
                                stringArray4[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[42]];
                                if (A.lIlIIlIIlllIlll(var4.hasAction(stringArray4) ? 1 : 0)) {
                                    var4.interact(lIIIlllIllIIl[lIIIlllIlllII[43]]);
                                    Time.sleepTicks((int)lIIIlllIlllII[6]);

                                }
                            }
                            int[] nArray8 = new int[lIIIlllIlllII[0]];
                            nArray8[A.lIIIlllIlllII[1]] = lIIIlllIlllII[44];
                            TileObject var5 = TileObjects.getNearest((int[])nArray8);
                            if (A.lIlIIlIIllllIll(var5)) {
                                String[] stringArray5 = new String[lIIIlllIlllII[0]];
                                stringArray5[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[45]];
                                if (A.lIlIIlIIlllIlll(var5.hasAction(stringArray5) ? 1 : 0)) {
                                    var5.interact(lIIIlllIllIIl[lIIIlllIlllII[46]]);
                                    Time.sleepTicks((int)lIIIlllIlllII[6]);

                                    if (A.lIlIIlIIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[15])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[2]];
                if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIlllIlllII[0]];
                    stringArray6[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[47]];
                    if (A.lIlIIlIIlllIlll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[48]];
                            if (A.lIlIIlIIllllIII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                                if (A.lIlIIlIIlllIlll(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(gv), new HashMap());

                                    Time.sleepTicks((int)lIIIlllIlllII[0]);

                                }
                                if (A.lIlIIlIIllllIIl(gw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gp);

                                    Time.sleepTicks((int)lIIIlllIlllII[0]);

                                }
                            }
                            if (A.lIlIIlIlIIIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIlllIlllII[15])) {
                                Movement.walkTo((WorldPoint)gp);

                                Time.sleepTicks((int)lIIIlllIlllII[0]);

                            }
                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[49]];
                            g.a(lIIIlllIllIIl[lIIIlllIlllII[50]], bW);
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[51]];
                if (A.lIlIIlIIlllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray7 = new String[lIIIlllIlllII[0]];
                    stringArray7[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[52]];
                    if (A.lIlIIlIIllllIII(Inventory.getCount((String[])stringArray7), lIIIlllIlllII[0])) {
                        if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[53]];
                            Movement.walkTo((WorldPoint)gp);

                            Time.sleepTicks((int)lIIIlllIlllII[0]);

                        }
                        if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(gp), lIIIlllIlllII[17])) {
                            AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[54]];
                            g.a(lIIIlllIllIIl[lIIIlllIlllII[55]], bW);
                        }
                    }
                }
            }
            if (A.lIlIIlIIllllIlI(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[17])) {
                String[] stringArray = new String[lIIIlllIlllII[0]];
                stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[56]];
                if (A.lIlIIlIIlllllII(Inventory.getCount((String[])stringArray))) {
                    if (A.lIlIIlIIllllllI(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[57]];
                        Movement.walkTo((WorldPoint)ct);

                        Time.sleepTicks((int)lIIIlllIlllII[0]);

                    }
                    if (A.lIlIIlIIlllllll(Players.getLocal().getWorldLocation().distanceTo(ct), lIIIlllIlllII[17])) {
                        AccBuilderRat.c = lIIIlllIllIIl[lIIIlllIlllII[58]];
                        if (A.lIlIIlIIllllIII(co, lIIIlllIlllII[0])) {
                            P.lv += lIIIlllIlllII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlllII[0];
                            P.lv = lIIIlllIlllII[1];
                            cp = lIIIlllIlllII[1];
                        }
                        g.a(lIIIlllIllIIl[lIIIlllIlllII[59]], bW);
                    }
                }
            }
            g.a(new String[lIIIlllIlllII[1]]);
        }
    }

    private static boolean lIlIIlIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static void lIlIIlIIlllIIIl() {
        lIIIlllIllIIl = new String[lIIIlllIlllII[117]];
        A.lIIIlllIllIIl[A.lIIIlllIlllII[1]] = "Finished buying items, switching back to quest";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[0]] = "Nav to bank";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[6]] = "Handling banking";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[9]] = "We are missing quest supplies, switching to BUYING";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[7]] = "We are missing quest supplies, switching to BUYING";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[15]] = "Drink";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[17]] = "Eat";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[10]] = "Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[21]] = "Starting quest";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[22]] = "Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[19]] = "Nav to library guy";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[23]] = "Talk to library guy";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[24]] = "Reldo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[25]] = "Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[26]] = "Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[27]] = "Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[28]] = "Nav to ore tile";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[29]] = "Mine rock";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[30]] = "Mine";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[31]] = "Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[32]] = "Talk squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[33]] = "Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[34]] = "Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[35]] = "Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[36]] = "Nav to picture";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[37]] = "Grabbing picture";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[40]] = "Sir Vyvin";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[42]] = "Open";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[43]] = "Open";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[45]] = "Search";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[46]] = "Search";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[2]] = "Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[47]] = "Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[48]] = "Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[49]] = "Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[50]] = "Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[51]] = "Blurite ore";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[52]] = "Portrait";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[53]] = "Nav to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[54]] = "Talk to DWARF";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[55]] = "Thurgo";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[56]] = "Blurite sword";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[57]] = "Nav to start";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[58]] = "Talk squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[59]] = "Squire";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[64]] = "A Knights Sword";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[65]] = "ring of wealth (";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[78]] = "And how is life as a squire?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[79]] = "I can make a new sword if you like...";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[80]] = "So would these dwarves make another one?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[20]] = "Ok, I'll give it a go.";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[81]] = "What do you know about the Imcando dwarves?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[82]] = "Something else.";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[83]] = "Would you like a redberry pie?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[84]] = "Can you make a special sword for me?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[85]] = "About that sword...";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[86]] = "Can you make that replacement sword now?";
        A.lIIIlllIllIIl[A.lIIIlllIlllII[87]] = "Yes.";
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (A.lIlIIlIlIIIIIIl(e.j(lIIIlllIlllII[4]), lIIIlllIlllII[10])) {
            bl = lIIIlllIlllII[0];

            if (1 <= ((0x77 ^ 0x65) & ~(0x5C ^ 0x4E))) {
                return false;
            }
        } else {
            bl = lIIIlllIlllII[1];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIlllIlllII[1];
    }

    private static void W() {
        d var6;
        Object var7;
        block11: {
            block10: {
                int[] nArray = new int[lIIIlllIlllII[0]];
                nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[18];
                if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIlllIlllII[18], lIIIlllIlllII[15], h.bv);
                    bA.add(d2);

                }
                int[] nArray2 = new int[lIIIlllIlllII[0]];
                nArray2[A.lIIIlllIlllII[1]] = lIIIlllIlllII[13];
                if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var7 = new DHelper(lIIIlllIlllII[13], lIIIlllIlllII[0], h.bv);
                    bA.add((DHelper) ar7);

                }
                int[] nArray3 = new int[lIIIlllIlllII[0]];
                nArray3[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIlllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block10;
                int[] nArray4 = new int[lIIIlllIlllII[0]];
                nArray4[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIlllIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block11;
                int[] nArray5 = new int[lIIIlllIlllII[0]];
                nArray5[A.lIIIlllIlllII[1]] = lIIIlllIlllII[8];
                if (!A.lIlIIlIIllllIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIlllII[6])) break block11;
            }
            var7 = new DHelper(lIIIlllIlllII[8], lIIIlllIlllII[6], h.bv);
            bA.add((DHelper) ar7);

        }
        int[] nArray = new int[lIIIlllIlllII[0]];
        nArray[A.lIIIlllIlllII[1]] = lIIIlllIlllII[14];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new DHelper(lIIIlllIlllII[14], lIIIlllIlllII[0], h.bv);
            bA.add((DHelper) ar7);

        }
        int[] nArray6 = new int[lIIIlllIlllII[0]];
        nArray6[A.lIIIlllIlllII[1]] = lIIIlllIlllII[16];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var7 = new DHelper(lIIIlllIlllII[16], lIIIlllIlllII[27], lIIIlllIlllII[60]);
            bA.add((DHelper) ar7);

        }
        int[] nArray7 = new int[lIIIlllIlllII[0]];
        nArray7[A.lIIIlllIlllII[1]] = lIIIlllIlllII[12];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var7 = new DHelper(lIIIlllIlllII[12], lIIIlllIlllII[19], lIIIlllIlllII[61]);
            bA.add((DHelper) ar7);

        }
        if (A.lIlIIlIIllllIIl(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIIIlllIllIIl[lIIIlllIlllII[65]]))) ? 1 : 0)) {
            var6 = new DHelper(lIIIlllIlllII[62], lIIIlllIlllII[15], lIIIlllIlllII[63]);
            bA.add(var6);

        }
        int[] nArray8 = new int[lIIIlllIlllII[0]];
        nArray8[A.lIIIlllIlllII[1]] = lIIIlllIlllII[11];
        if (A.lIlIIlIIllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var6 = new DHelper(lIIIlllIlllII[11], lIIIlllIlllII[55], lIIIlllIlllII[61]);
            bA.add(var6);

        }
    }

    private static boolean lIlIIlIIlllllIl(int n2) {
        return n2 < 0;
    }

    static {
        A.lIlIIlIIlllIlIl();
        A.lIlIIlIIlllIIIl();
        gn = lIIIlllIlllII[4];
        bA = new ArrayList<d>();
        ct = new WorldPoint(lIIIlllIlllII[66], lIIIlllIlllII[67], lIIIlllIlllII[1]);
        go = new WorldPoint(lIIIlllIlllII[68], lIIIlllIlllII[69], lIIIlllIlllII[1]);
        gp = new WorldPoint(lIIIlllIlllII[70], lIIIlllIlllII[71], lIIIlllIlllII[1]);
        gq = new WorldPoint(lIIIlllIlllII[72], lIIIlllIlllII[73], lIIIlllIlllII[1]);
        gr = new WorldPoint(lIIIlllIlllII[74], lIIIlllIlllII[75], lIIIlllIlllII[6]);
        gs = lIIIlllIlllII[76];
        gt = lIIIlllIlllII[77];
        gu = lIIIlllIlllII[41];
        String[] stringArray = new String[lIIIlllIlllII[23]];
        stringArray[A.lIIIlllIlllII[1]] = lIIIlllIllIIl[lIIIlllIlllII[78]];
        stringArray[A.lIIIlllIlllII[0]] = lIIIlllIllIIl[lIIIlllIlllII[79]];
        stringArray[A.lIIIlllIlllII[6]] = lIIIlllIllIIl[lIIIlllIlllII[80]];
        stringArray[A.lIIIlllIlllII[9]] = lIIIlllIllIIl[lIIIlllIlllII[20]];
        stringArray[A.lIIIlllIlllII[7]] = lIIIlllIllIIl[lIIIlllIlllII[81]];
        stringArray[A.lIIIlllIlllII[15]] = lIIIlllIllIIl[lIIIlllIlllII[82]];
        stringArray[A.lIIIlllIlllII[17]] = lIIIlllIllIIl[lIIIlllIlllII[83]];
        stringArray[A.lIIIlllIlllII[10]] = lIIIlllIllIIl[lIIIlllIlllII[84]];
        stringArray[A.lIIIlllIlllII[21]] = lIIIlllIllIIl[lIIIlllIlllII[85]];
        stringArray[A.lIIIlllIlllII[22]] = lIIIlllIllIIl[lIIIlllIlllII[86]];
        stringArray[A.lIIIlllIlllII[19]] = lIIIlllIllIIl[lIIIlllIlllII[87]];
        bW = stringArray;
        WorldPoint[] worldPointArray = new WorldPoint[lIIIlllIlllII[26]];
        worldPointArray[A.lIIIlllIlllII[1]] = new WorldPoint(lIIIlllIlllII[88], lIIIlllIlllII[89], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[0]] = new WorldPoint(lIIIlllIlllII[90], lIIIlllIlllII[91], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[6]] = new WorldPoint(lIIIlllIlllII[92], lIIIlllIlllII[93], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[9]] = new WorldPoint(lIIIlllIlllII[94], lIIIlllIlllII[95], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[7]] = new WorldPoint(lIIIlllIlllII[96], lIIIlllIlllII[97], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[15]] = new WorldPoint(lIIIlllIlllII[98], lIIIlllIlllII[99], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[17]] = new WorldPoint(lIIIlllIlllII[100], lIIIlllIlllII[101], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[10]] = new WorldPoint(lIIIlllIlllII[102], lIIIlllIlllII[103], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[21]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[105], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[22]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[107], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[19]] = new WorldPoint(lIIIlllIlllII[106], lIIIlllIlllII[108], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[23]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[109], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[24]] = new WorldPoint(lIIIlllIlllII[104], lIIIlllIlllII[110], lIIIlllIlllII[1]);
        worldPointArray[A.lIIIlllIlllII[25]] = new WorldPoint(lIIIlllIlllII[111], lIIIlllIlllII[112], lIIIlllIlllII[1]);
        gv = worldPointArray;
        gw = new WorldArea(lIIIlllIlllII[113], lIIIlllIlllII[114], lIIIlllIlllII[115], lIIIlllIlllII[116], lIIIlllIlllII[1]);
    }

    private static boolean lIlIIlIIlllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIlIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String Z() {
        return lIIIlllIllIIl[lIIIlllIlllII[64]];
    }
}

