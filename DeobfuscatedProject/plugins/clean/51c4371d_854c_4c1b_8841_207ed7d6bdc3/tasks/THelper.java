/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class THelper
implements F {
    static  ArrayList<Integer> cY;
    public static final  WorldPoint cO;
    public static final  WorldPoint cU;
    public static  List<d> bB;
    public static final  WorldPoint cQ;
    public static  boolean bz;
    public static  int cX;
    public static final  WorldPoint cT;
    public static final  WorldPoint cP;
    public static  boolean cV;
    
    public static final  WorldPoint cS;
    
    public static final  WorldPoint cN;
    static  int ci;
    public static  int cW;
    public static final  WorldPoint cR;
    static  String[] bX;
    static  boolean cj;

    private static int llIIlIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String V() {
        return llllIIII[llllIlII[147]];
    }

    private static boolean llIIlIllIlI(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[llllIlII[0]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[141]];
        if (t.llIIlIlIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[7];
                if (t.llIIlIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIlII[0]];
                    nArray3[t.llllIlII[1]] = llllIlII[9];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlII[0];

                        if (-1 < 1) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llllIlII[1];
        return n2 != 0;
    }

    private static boolean llIIlIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void aL() {
        cY.add(llllIlII[120]);

        cY.add(llllIlII[121]);

        cY.add(llllIlII[122]);

        cY.add(llllIlII[123]);

        cY.add(llllIlII[124]);

        cY.add(llllIlII[125]);

        cY.add(llllIlII[126]);

        while (t.llIIlIlIIll(cY.isEmpty() ? 1 : 0) && t.llIIlIlIIll(cY.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llllIlII[0]];
            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[127]];
            if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {

                if ((0x1A ^ 0x3F ^ (0x1E ^ 0x3F)) != 0) break;
                return;
            }
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = cY.get(llllIlII[1]);
            TileObject lIIllIllIllllII = TileObjects.getNearest((int[])nArray);
            if (t.llIIlIlIlIl(lIIllIllIllllII)) {
                String[] stringArray2 = new String[llllIlII[0]];
                stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[128]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llllIlII[0]];
                    stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(lIIllIllIllllII);
                    Time.sleepTicks((int)llllIlII[3]);

                }
            }
            String[] stringArray4 = new String[llllIlII[0]];
            stringArray4[t.llllIlII[1]] = llllIIII[llllIlII[130]];
            if (t.llIIlIlIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                cY.remove(llllIlII[1]);

                Time.sleepTicks((int)llllIlII[5]);

            }

            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aN() {
        void lIIllIllIllIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.llIIlIlIlIl(bankLocation) && t.llIIlIlIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIII[llllIlII[136]];
            a.a(bankLocation);
        }
        if (t.llIIlIlIlIl(lIIllIllIllIlII) && t.llIIlIlIIIl(lIIllIllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);

            }
            if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = llllIIII[llllIlII[137]];
                if (t.llIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlII[6]);

                }
                a.a(llllIlII[7], llllIlII[13]);
                a.a(llllIlII[11], llllIlII[0]);
                a.a(llllIlII[9], llllIlII[41]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aM() {
        if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
            void lIIllIllIlllIII;
            AccBuilderBarrows.c = llllIIII[llllIlII[131]];
            WorldArea worldArea = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
            if (t.llIIlIlIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIIllIllIllIlll;
                WorldArea worldArea2 = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                if (t.llIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                    Time.sleepTicks((int)llllIlII[0]);

                }
                if (t.llIIlIlIIIl(lIIllIllIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[2]];
                        TileObject lIIllIllIllIllI = TileObjects.getNearest((String[])stringArray);
                        if (t.llIIlIlIlIl(lIIllIllIllIllI)) {
                            String[] stringArray2 = new String[llllIlII[0]];
                            stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[132]];
                            if (t.llIIlIlIIIl(lIIllIllIllIllI.hasAction(stringArray2) ? 1 : 0)) {
                                lIIllIllIllIllI.interact(llllIIII[llllIlII[133]]);
                                Time.sleepTicks((int)llllIlII[10]);

                            }
                            String[] stringArray3 = new String[llllIlII[0]];
                            stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[134]];
                            if (t.llIIlIlIIIl(lIIllIllIllIllI.hasAction(stringArray3) ? 1 : 0)) {
                                lIIllIllIllIllI.interact(llllIIII[llllIlII[135]]);
                                Time.sleepTicks((int)llllIlII[10]);

                            }
                        }
                    }
                }
            }
            if (t.llIIlIlIIIl(lIIllIllIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)cU);

                Time.sleepTicks((int)llllIlII[0]);

            }
        }
    }

    private static boolean llIIlIlIllI(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aP() {
        int n2;
        String[] stringArray = new String[llllIlII[0]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[140]];
        if (t.llIIlIlIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[11];
                if (t.llIIlIlIllI(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[llllIlII[0]];
                    nArray3[t.llllIlII[1]] = llllIlII[7];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlII[0];

                        if (1 < (0x27 ^ 0x23)) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llllIlII[1];
        return n2 != 0;
    }

        return String.valueOf(lIIllIllIIlllll);
    }

    @Override
    public int U() {
        try {
            t.aK();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 0) {
            return (0xAF ^ 0xA0 ^ (0xFF ^ 0xA6)) & (138 + 140 - 85 + 38 ^ 21 + 156 - 131 + 131 ^ -1);
        }
        return llllIlII[117];
    }

    private static boolean llIIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    public static void aK() {
        if (t.llIIlIlIIIl(bz ? 1 : 0)) {
            b.a(bB);
            if (t.llIIlIlIIlI(bB.size(), llllIlII[0])) {
                System.out.println(llllIIII[llllIlII[1]]);
                bz = llllIlII[1];
            }
        }
        if (t.llIIlIlIIll(bz ? 1 : 0)) {
            TileObject lIIllIllIlllllI;
            TileObject lIIllIllIllllll;
            BankLocation lIIllIlllIIIIII;
            if (t.llIIlIlIIlI(e.j(llllIlII[2]), llllIlII[3])) {
                D.ci();
            }
            if (t.llIIlIlIIll(t.aP() ? 1 : 0) && t.llIIlIlIIlI(e.j(cW), llllIlII[0]) && t.llIIlIlIlII(e.j(llllIlII[2]), llllIlII[3])) {
                lIIllIlllIIIIII = BankLocation.getNearest();
                if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIll(lIIllIlllIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[0]];
                    a.a(lIIllIlllIIIIII);
                }
                if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIIl(lIIllIlllIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);

                    }
                    if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[5]];
                        if (t.llIIlIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIlII[6]);

                        }
                        if (t.llIIlIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIlII[5]);

                        }
                        int[] nArray = new int[llllIlII[3]];
                        nArray[t.llllIlII[1]] = llllIlII[7];
                        nArray[t.llllIlII[0]] = llllIlII[8];
                        nArray[t.llllIlII[5]] = llllIlII[9];
                        nArray[t.llllIlII[10]] = llllIlII[11];
                        nArray[t.llllIlII[6]] = llllIlII[12];
                        if (t.llIIlIlIIll(e.b(nArray) ? 1 : 0)) {
                            t.ag();
                            System.out.println(llllIIII[llllIlII[10]]);
                            bz = llllIlII[0];
                            return;
                        }
                        int[] nArray2 = new int[llllIlII[3]];
                        nArray2[t.llllIlII[1]] = llllIlII[7];
                        nArray2[t.llllIlII[0]] = llllIlII[8];
                        nArray2[t.llllIlII[5]] = llllIlII[9];
                        nArray2[t.llllIlII[10]] = llllIlII[11];
                        nArray2[t.llllIlII[6]] = llllIlII[12];
                        if (t.llIIlIlIIIl(e.b(nArray2) ? 1 : 0)) {
                            a.a(llllIlII[7], llllIlII[13]);
                            a.a(llllIlII[14], llllIlII[0]);
                            a.a(llllIlII[8], llllIlII[0]);
                            a.a(llllIlII[11], llllIlII[6]);
                            a.a(llllIlII[12], llllIlII[13]);
                        }
                    }
                }
            }
            if (t.llIIlIlIIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && t.llIIlIlIIlI(Movement.getRunEnergy(), llllIlII[15])) {
                Inventory.getFirst((int[])f.bb).interact(llllIIII[llllIlII[6]]);
                Time.sleepTicks((int)llllIlII[0]);

            }
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && t.llIIlIlIlll(t.llIIlIlIIII(e.v(), 60.0))) {
                int[] nArray3 = new int[llllIlII[0]];
                nArray3[t.llllIlII[1]] = llllIlII[12];
                Inventory.getFirst((int[])nArray3).interact(llllIIII[llllIlII[3]]);
                Time.sleepTicks((int)llllIlII[0]);

            }
            if (t.llIIlIlIIlI(e.j(cW), llllIlII[0]) && t.llIIlIlIIIl(t.aP() ? 1 : 0)) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[16]];
                    if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cN);

                    Time.sleepTicks((int)llllIlII[0]);

                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[17]];
                    g.a(llllIIII[llllIlII[18]], bX);
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[0])) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[19]];
                    Movement.walkTo((WorldPoint)cO);

                    Time.sleepTicks((int)llllIlII[0]);

                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[13]];
                    if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[20]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[21]]);
                    }
                    g.a(bX);
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[5])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[22]];
                if (t.llIIlIllIlI(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[23]];
                    String[] stringArray2 = new String[llllIlII[0]];
                    stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[24]];
                    lIIllIlllIIIIII = TileObjects.getNearest((String[])stringArray2);
                    if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo((Locatable)lIIllIlllIIIIII), llllIlII[6]) && t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bX);
                    }
                    if (!t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0) || t.llIIlIllIII(Players.getLocal().distanceTo(new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1])), llllIlII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1]));

                        Time.sleepTicks((int)llllIlII[10]);

                    }
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1])), llllIlII[3])) {
                    String[] stringArray3 = new String[llllIlII[0]];
                    stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[27]];
                    if (t.llIIlIllIlI(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[llllIlII[0]];
                        stringArray4[t.llllIlII[1]] = llllIIII[llllIlII[28]];
                        lIIllIlllIIIIII = TileObjects.getNearest((String[])stringArray4);
                        if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[llllIlII[0]];
                            stringArray5[t.llllIlII[1]] = llllIIII[llllIlII[29]];
                            if (t.llIIlIlIIIl(lIIllIlllIIIIII.hasAction(stringArray5) ? 1 : 0)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[30]]);
                                Time.sleepTicks((int)llllIlII[5]);

                            }
                            String[] stringArray6 = new String[llllIlII[0]];
                            stringArray6[t.llllIlII[1]] = llllIIII[llllIlII[31]];
                            if (t.llIIlIlIIIl(lIIllIlllIIIIII.hasAction(stringArray6) ? 1 : 0)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[32]]);
                                Time.sleepTicks((int)llllIlII[5]);

                            }
                        }
                        g.a(bX);
                    }
                }
                String[] stringArray7 = new String[llllIlII[0]];
                stringArray7[t.llllIlII[1]] = llllIIII[llllIlII[33]];
                if (t.llIIlIlIlIl(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[llllIlII[0]];
                    nArray4[t.llllIlII[1]] = llllIlII[14];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIlII[0]];
                        nArray5[t.llllIlII[1]] = llllIlII[14];
                        if (t.llIIlIlIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llllIlII[0]];
                            nArray6[t.llllIlII[1]] = llllIlII[14];
                            Inventory.getFirst((int[])nArray6).interact(llllIIII[llllIlII[34]]);
                        }
                    }
                    if (t.llIIlIllIlI(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[llllIlII[0]];
                        stringArray8[t.llllIlII[1]] = llllIIII[llllIlII[35]];
                        NPCs.getNearest((String[])stringArray8).interact(llllIIII[llllIlII[36]]);
                        Time.sleepTicks((int)llllIlII[5]);

                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[10])) {
                if (t.llIIlIlIIll(cV ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[37]];
                        if (t.llIIlIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[llllIlII[0]];
                            nArray7[t.llllIlII[1]] = llllIlII[7];
                            if (t.llIIlIlIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIlII[0]];
                                nArray8[t.llllIlII[1]] = llllIlII[7];
                                Inventory.getFirst((int[])nArray8).interact(llllIIII[llllIlII[38]]);
                                Time.sleepTicks((int)llllIlII[3]);

                            }
                        }
                        AccBuilderBarrows.c = llllIIII[llllIlII[39]];
                        Movement.walkTo((WorldPoint)cO);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[40]];
                        if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlII[0]];
                            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[41]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[42]]);
                        }
                        g.a(bX);
                        if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && t.llIIlIlIIIl(Dialog.getText().contains(llllIIII[llllIlII[43]]) ? 1 : 0)) {
                            cV = llllIlII[0];
                        }
                    }
                }
                if (t.llIIlIlIIIl(cV ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[44]];
                        Movement.walkTo((WorldPoint)cN);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[45]];
                        g.a(llllIIII[llllIlII[46]], bX);
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[6])) {
                ci = llllIlII[1];
                if (t.llIIlIlIIll(t.ac() ? 1 : 0)) {
                    t.aO();
                }
                if (t.llIIlIlIIIl(t.ac() ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[47]];
                        if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cR);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[48]];
                        if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlII[0]];
                            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[49]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[50]]);
                        }
                        g.a(bX);
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[3])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[51]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llllIlII[0]];
                    stringArray9[t.llllIlII[1]] = llllIIII[llllIlII[52]];
                    if (t.llIIlIlIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cS), llllIlII[17]) || t.llIIlIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[53]];
                            Movement.walkTo((WorldPoint)cS);

                            Time.sleepTicks((int)llllIlII[0]);

                        }
                        if (!t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cS), llllIlII[17]) || t.llIIlIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (t.llIIlIllIlI(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[llllIlII[0]];
                                nArray9[t.llllIlII[1]] = llllIlII[54];
                                NPCs.getNearest((int[])nArray9).interact(llllIIII[llllIlII[55]]);
                                Time.sleepTicks((int)llllIlII[5]);

                            }
                            String[] stringArray10 = new String[llllIlII[0]];
                            stringArray10[t.llllIlII[1]] = llllIIII[llllIlII[56]];
                            lIIllIlllIIIIII = TileItems.getNearest((String[])stringArray10);
                            if (t.llIIlIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[llllIlII[0]];
                                nArray10[t.llllIlII[1]] = llllIlII[12];
                                Inventory.getFirst((int[])nArray10).interact(llllIIII[llllIlII[57]]);
                                Time.sleepTicks((int)llllIlII[0]);

                            }
                            if (t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[58]]);
                                Time.sleepTicks((int)llllIlII[5]);

                            }
                        }
                    }
                }
                String[] stringArray11 = new String[llllIlII[0]];
                stringArray11[t.llllIlII[1]] = llllIIII[llllIlII[59]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cT), llllIlII[13])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[60]];
                        Movement.walkTo((WorldPoint)cT);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cT), llllIlII[13])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[61]];
                        t.aL();
                    }
                }
                String[] stringArray12 = new String[llllIlII[0]];
                stringArray12[t.llllIlII[1]] = llllIIII[llllIlII[15]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llllIlII[0]];
                    stringArray13[t.llllIlII[1]] = llllIIII[llllIlII[62]];
                    if (t.llIIlIlIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[63]];
                        String[] stringArray14 = new String[llllIlII[0]];
                        stringArray14[t.llllIlII[1]] = llllIIII[llllIlII[64]];
                        int[] nArray11 = new int[llllIlII[0]];
                        nArray11[t.llllIlII[1]] = llllIlII[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)llllIlII[6]);

                    }
                }
                String[] stringArray15 = new String[llllIlII[0]];
                stringArray15[t.llllIlII[1]] = llllIIII[llllIlII[66]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[llllIlII[0]];
                    stringArray16[t.llllIlII[1]] = llllIIII[llllIlII[67]];
                    if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[68]];
                            if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cR);

                            Time.sleepTicks((int)llllIlII[0]);

                        }
                        if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[69]];
                            String[] stringArray17 = new String[llllIlII[0]];
                            stringArray17[t.llllIlII[1]] = llllIIII[llllIlII[70]];
                            String[] stringArray18 = new String[llllIlII[0]];
                            stringArray18[t.llllIlII[1]] = llllIIII[llllIlII[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)llllIlII[10]);

                        }
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[16])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[72]];
                lIIllIlllIIIIII = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[llllIlII[0]];
                stringArray19[t.llllIlII[1]] = llllIIII[llllIlII[73]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray19) ? 1 : 0) && t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                    if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[74]];
                        g.a(llllIIII[llllIlII[75]], bX);
                    }
                    if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[76]];
                        String[] stringArray20 = new String[llllIlII[0]];
                        stringArray20[t.llllIlII[1]] = llllIIII[llllIlII[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(llllIIII[llllIlII[78]]);
                        Time.sleepTicks((int)llllIlII[5]);

                    }
                }
                String[] stringArray21 = new String[llllIlII[0]];
                stringArray21[t.llllIlII[1]] = llllIIII[llllIlII[79]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[llllIlII[0]];
                    stringArray22[t.llllIlII[1]] = llllIIII[llllIlII[80]];
                    lIIllIllIllllll = TileObjects.getNearest((String[])stringArray22);
                    if (t.llIIlIlIlIl(lIIllIllIllllll)) {
                        if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIllIllllll) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[81]];
                            String[] stringArray23 = new String[llllIlII[0]];
                            stringArray23[t.llllIlII[1]] = llllIIII[llllIlII[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(lIIllIllIllllll);
                            Time.sleepTicks((int)llllIlII[5]);

                        }
                        if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIllIllllll) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[83]];
                            String[] stringArray24 = new String[llllIlII[0]];
                            stringArray24[t.llllIlII[1]] = llllIIII[llllIlII[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(llllIIII[llllIlII[85]]);
                            Time.sleepTicks((int)llllIlII[5]);

                        }
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[17])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[86]];
                lIIllIlllIIIIII = NPCs.getNearest((String[])stringArray);
                if (t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                    if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[87]];
                        g.a(llllIIII[llllIlII[88]], bX);
                    }
                    if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[89]];
                        String[] stringArray25 = new String[llllIlII[0]];
                        stringArray25[t.llllIlII[1]] = llllIIII[llllIlII[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(llllIIII[llllIlII[91]]);
                        Time.sleepTicks((int)llllIlII[5]);

                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[18])) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[92]];
                    lIIllIlllIIIIII = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
                    if (t.llIIlIlIIll(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIIllIllIllllll = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                        if (t.llIIlIlIIll(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                            Time.sleepTicks((int)llllIlII[0]);

                        }
                        if (t.llIIlIlIIIl(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                                Time.sleepTicks((int)llllIlII[0]);

                            }
                            if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                String[] stringArray = new String[llllIlII[0]];
                                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[98]];
                                lIIllIllIlllllI = TileObjects.getNearest((String[])stringArray);
                                if (t.llIIlIlIlIl(lIIllIllIlllllI)) {
                                    String[] stringArray26 = new String[llllIlII[0]];
                                    stringArray26[t.llllIlII[1]] = llllIIII[llllIlII[99]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray26) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[100]]);
                                        Time.sleepTicks((int)llllIlII[10]);

                                    }
                                    String[] stringArray27 = new String[llllIlII[0]];
                                    stringArray27[t.llllIlII[1]] = llllIIII[llllIlII[101]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray27) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[102]]);
                                        Time.sleepTicks((int)llllIlII[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (t.llIIlIlIIIl(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cU);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[103]];
                    g.a(llllIIII[llllIlII[104]], bX);
                }
            }
            if (t.llIIlIllIll(e.j(cW), llllIlII[13]) && t.llIIlIlIIlI(e.j(cW), llllIlII[72])) {
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    String[] stringArray = new String[llllIlII[0]];
                    stringArray[t.llllIlII[1]] = llllIIII[llllIlII[105]];
                    if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[106]];
                        if (t.llIIlIlIIlI(ci, llllIlII[0])) {
                            Q.kc += llllIlII[0];
                            Q.o(AccBuilderBarrows.m);
                            ci += llllIlII[0];
                            Q.kc = llllIlII[1];
                            cj = llllIlII[1];
                        }
                        g.a(llllIIII[llllIlII[107]], bX);
                    }
                }
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[108]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && t.llIIlIlIIlI(e.j(cW), llllIlII[72])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[109]];
                    t.aN();
                }
                String[] stringArray28 = new String[llllIlII[0]];
                stringArray28[t.llllIlII[1]] = llllIIII[llllIlII[110]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray28) ? 1 : 0) && t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3]) && t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[111]];
                    lIIllIlllIIIIII = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
                    if (t.llIIlIlIIll(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIIllIllIllllll = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                        if (t.llIIlIlIIll(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                            Time.sleepTicks((int)llllIlII[0]);

                        }
                        if (t.llIIlIlIIIl(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));

                                Time.sleepTicks((int)llllIlII[0]);

                            }
                            if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                String[] stringArray29 = new String[llllIlII[0]];
                                stringArray29[t.llllIlII[1]] = llllIIII[llllIlII[112]];
                                lIIllIllIlllllI = TileObjects.getNearest((String[])stringArray29);
                                if (t.llIIlIlIlIl(lIIllIllIlllllI)) {
                                    String[] stringArray30 = new String[llllIlII[0]];
                                    stringArray30[t.llllIlII[1]] = llllIIII[llllIlII[113]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray30) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[114]]);
                                        Time.sleepTicks((int)llllIlII[10]);

                                    }
                                    String[] stringArray31 = new String[llllIlII[0]];
                                    stringArray31[t.llllIlII[1]] = llllIIII[llllIlII[115]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray31) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[116]]);
                                        Time.sleepTicks((int)llllIlII[10]);

                                    }
                                }
                            }
                        }
                    }
                    if (t.llIIlIlIIIl(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cU);

                        Time.sleepTicks((int)llllIlII[0]);

                    }
                }
            }
            if (t.llIIlIllIll(e.j(cW), llllIlII[72]) && t.llIIlIlIIlI(e.j(cX), llllIlII[3])) {
                AccBuilderBarrows.c = llllIIII[llllIlII[117]];
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    t.aM();
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    if (t.llIIlIlIlIl(Widgets.get((int)llllIlII[118], (int)llllIlII[27]))) {
                        Mouse.click((int)Widgets.get((int)llllIlII[118], (int)llllIlII[27]).getClickPoint().getX(), (int)Widgets.get((int)llllIlII[118], (int)llllIlII[27]).getClickPoint().getY(), (boolean)llllIlII[0]);
                        Time.sleepTicks((int)llllIlII[10]);

                    }
                    g.a(llllIIII[llllIlII[119]], bX);
                    g.a(bX);
                }
            }
            g.a(bX);
        }
    }

    private static boolean llIIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return llllIlII[1];
    }

    @Override
    public boolean W() {
        int n2;
        if (t.llIIlIllIll(e.j(cW), llllIlII[72]) && t.llIIlIllIll(e.j(cX), llllIlII[3])) {
            n2 = llllIlII[0];

            if (-(0x8B ^ 0x8E) >= 0) {
                return false;
            }
        } else {
            n2 = llllIlII[1];
        }
        return n2 != 0;
    }

    private static boolean llIIlIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        t.llIIlIIllll();
        t.llIIlIIlllI();
        cN = new WorldPoint(llllIlII[149], llllIlII[150], llllIlII[1]);
        cO = new WorldPoint(llllIlII[151], llllIlII[152], llllIlII[1]);
        cP = new WorldPoint(llllIlII[25], llllIlII[153], llllIlII[1]);
        cQ = new WorldPoint(llllIlII[154], llllIlII[155], llllIlII[1]);
        cR = new WorldPoint(llllIlII[156], llllIlII[152], llllIlII[5]);
        cS = new WorldPoint(llllIlII[157], llllIlII[158], llllIlII[1]);
        cT = new WorldPoint(llllIlII[159], llllIlII[160], llllIlII[1]);
        cU = new WorldPoint(llllIlII[161], llllIlII[162], llllIlII[1]);
        bB = new ArrayList<d>();
        cW = llllIlII[163];
        cX = llllIlII[164];
        String[] stringArray = new String[llllIlII[31]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[165]];
        stringArray[t.llllIlII[0]] = llllIIII[llllIlII[166]];
        stringArray[t.llllIlII[5]] = llllIIII[llllIlII[167]];
        stringArray[t.llllIlII[10]] = llllIIII[llllIlII[168]];
        stringArray[t.llllIlII[6]] = llllIIII[llllIlII[169]];
        stringArray[t.llllIlII[3]] = llllIIII[llllIlII[170]];
        stringArray[t.llllIlII[16]] = llllIIII[llllIlII[171]];
        stringArray[t.llllIlII[17]] = llllIIII[llllIlII[172]];
        stringArray[t.llllIlII[18]] = llllIIII[llllIlII[173]];
        stringArray[t.llllIlII[19]] = llllIIII[llllIlII[174]];
        stringArray[t.llllIlII[13]] = llllIIII[llllIlII[175]];
        stringArray[t.llllIlII[20]] = llllIIII[llllIlII[176]];
        stringArray[t.llllIlII[21]] = llllIIII[llllIlII[177]];
        stringArray[t.llllIlII[22]] = llllIIII[llllIlII[178]];
        stringArray[t.llllIlII[23]] = llllIIII[llllIlII[179]];
        stringArray[t.llllIlII[24]] = llllIIII[llllIlII[180]];
        stringArray[t.llllIlII[27]] = llllIIII[llllIlII[181]];
        stringArray[t.llllIlII[28]] = llllIIII[llllIlII[182]];
        stringArray[t.llllIlII[29]] = llllIIII[llllIlII[183]];
        stringArray[t.llllIlII[30]] = llllIIII[llllIlII[184]];
        bX = stringArray;
        cY = new ArrayList();
    }

    private static void ag() {
        d lIIllIllIlIlllI;
        Object lIIllIllIlIllll;
        block10: {
            block9: {
                int[] nArray = new int[llllIlII[0]];
                nArray[t.llllIlII[1]] = llllIlII[14];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llllIlII[14], llllIlII[0], llllIlII[142]);
                    bB.add(d2);

                }
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[8];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIllIllIlIllll = new DHelper(llllIlII[8], llllIlII[0], llllIlII[142]);
                    bB.add((DHelper) IIllIllIlIllll);

                }
                int[] nArray3 = new int[llllIlII[0]];
                nArray3[t.llllIlII[1]] = llllIlII[11];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIllIllIlIllll = new DHelper(llllIlII[11], llllIlII[3], i.bw);
                    bB.add((DHelper) IIllIllIlIllll);

                }
                int[] nArray4 = new int[llllIlII[0]];
                nArray4[t.llllIlII[1]] = llllIlII[12];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIllIllIlIllll = new DHelper(llllIlII[12], llllIlII[41], llllIlII[143]);
                    bB.add((DHelper) IIllIllIlIllll);

                }
                int[] nArray5 = new int[llllIlII[0]];
                nArray5[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llllIlII[0]];
                nArray6[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llllIlII[0]];
                nArray7[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllIlII[15])) break block10;
            }
            lIIllIllIlIllll = new DHelper(llllIlII[9], llllIlII[15], llllIlII[107]);
            bB.add((DHelper) IIllIllIlIllll);

        }
        if (t.llIIlIlIIll(Bank.contains((Predicate)(lIIllIllIlIllll = item -> item.getName().toLowerCase().contains(llllIIII[llllIlII[148]]))) ? 1 : 0)) {
            lIIllIllIlIlllI = new DHelper(llllIlII[144], llllIlII[3], llllIlII[145]);
            bB.add(lIIllIllIlIlllI);

        }
        int[] nArray = new int[llllIlII[0]];
        nArray[t.llllIlII[1]] = llllIlII[7];
        if (t.llIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIllIllIlIlllI = new DHelper(llllIlII[7], llllIlII[51], llllIlII[146]);
            bB.add(lIIllIllIlIlllI);

        }
    }

    private static boolean llIIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean llIIlIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean llIIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aO() {
        void lIIllIllIllIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.llIIlIlIlIl(bankLocation) && t.llIIlIlIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIII[llllIlII[138]];
            a.a(bankLocation);
        }
        if (t.llIIlIlIlIl(lIIllIllIllIIlI) && t.llIIlIlIIIl(lIIllIllIllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);

            }
            if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = llllIIII[llllIlII[139]];
                if (t.llIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlII[6]);

                }
                a.a(llllIlII[7], llllIlII[13]);
                a.a(llllIlII[8], llllIlII[0]);
                a.a(llllIlII[11], llllIlII[0]);
                a.a(llllIlII[12], llllIlII[3]);
                a.a(llllIlII[9], llllIlII[41]);
            }
        }
    }

    private static void llIIlIIlllI() {
        llllIIII = new String[llllIlII[185]];
        t.llllIIII[t.llllIlII[1]] = "Finished buying items, switching back to quest";
        t.llllIIII[t.llllIlII[0]] = "Nav to bank";
        t.llllIIII[t.llllIlII[5]] = "Handling banking";
        t.llllIIII[t.llllIlII[10]] = "We are missing quest supplies, switching to BUYING";
        t.llllIIII[t.llllIlII[6]] = "Drink";
        t.llllIIII[t.llllIlII[3]] = "Eat";
        t.llllIIII[t.llllIlII[16]] = "Nav to start";
        t.llllIIII[t.llllIlII[17]] = "Starting quest";
        t.llllIIII[t.llllIlII[18]] = "King Roald";
        t.llllIIII[t.llllIlII[19]] = "Nav to temple door";
        t.llllIIII[t.llllIlII[13]] = "Interesting door";
        t.llllIIII[t.llllIlII[20]] = "Large door";
        t.llllIIII[t.llllIlII[21]] = "Open";
        t.llllIIII[t.llllIlII[22]] = "Temple Guardian";
        t.llllIIII[t.llllIlII[23]] = "Nav to doggo";
        t.llllIIII[t.llllIlII[24]] = "Trapdoor";
        t.llllIIII[t.llllIlII[27]] = "Temple Guardian";
        t.llllIIII[t.llllIlII[28]] = "Trapdoor";
        t.llllIIII[t.llllIlII[29]] = "Open";
        t.llllIIII[t.llllIlII[30]] = "Open";
        t.llllIIII[t.llllIlII[31]] = "Climb-down";
        t.llllIIII[t.llllIlII[32]] = "Climb-down";
        t.llllIIII[t.llllIlII[33]] = "Temple Guardian";
        t.llllIIII[t.llllIlII[34]] = "Wield";
        t.llllIIII[t.llllIlII[35]] = "Temple Guardian";
        t.llllIIII[t.llllIlII[36]] = "Attack";
        t.llllIIII[t.llllIlII[37]] = "Monument";
        t.llllIIII[t.llllIlII[38]] = "Break";
        t.llllIIII[t.llllIlII[39]] = "Nav to temple door";
        t.llllIIII[t.llllIlII[40]] = "Interacting door";
        t.llllIIII[t.llllIlII[41]] = "Large door";
        t.llllIIII[t.llllIlII[42]] = "Open";
        t.llllIIII[t.llllIlII[43]] = "tell the king";
        t.llllIIII[t.llllIlII[44]] = "Nav to king";
        t.llllIIII[t.llllIlII[45]] = "talk king";
        t.llllIIII[t.llllIlII[46]] = "King Roald";
        t.llllIIII[t.llllIlII[47]] = "Nav to jail";
        t.llllIIII[t.llllIlII[48]] = "Interesting door";
        t.llllIIII[t.llllIlII[49]] = "Cell door";
        t.llllIIII[t.llllIlII[50]] = "Open";
        t.llllIIII[t.llllIlII[51]] = "Golden key";
        t.llllIIII[t.llllIlII[52]] = "Iron key";
        t.llllIIII[t.llllIlII[53]] = "Nav to gold key tile";
        t.llllIIII[t.llllIlII[55]] = "Attack";
        t.llllIIII[t.llllIlII[56]] = "Golden key";
        t.llllIIII[t.llllIlII[57]] = "Eat";
        t.llllIIII[t.llllIlII[58]] = "Take";
        t.llllIIII[t.llllIlII[59]] = "Golden key";
        t.llllIIII[t.llllIlII[60]] = "Nav to statues";
        t.llllIIII[t.llllIlII[61]] = "Finding key";
        t.llllIIII[t.llllIlII[15]] = "Iron key";
        t.llllIIII[t.llllIlII[62]] = "Murky water";
        t.llllIIII[t.llllIlII[63]] = "Getting water";
        t.llllIIII[t.llllIlII[64]] = "Bucket";
        t.llllIIII[t.llllIlII[66]] = "Iron key";
        t.llllIIII[t.llllIlII[67]] = "Murky water";
        t.llllIIII[t.llllIlII[68]] = "Nav to jail";
        t.llllIIII[t.llllIlII[69]] = "Interesting door";
        t.llllIIII[t.llllIlII[70]] = "Iron key";
        t.llllIIII[t.llllIlII[71]] = "Cell door";
        t.llllIIII[t.llllIlII[72]] = "Drezel";
        t.llllIIII[t.llllIlII[73]] = "Blessed water";
        t.llllIIII[t.llllIlII[74]] = "Handling chat";
        t.llllIIII[t.llllIlII[75]] = "Drezel";
        t.llllIIII[t.llllIlII[76]] = "Entering cell";
        t.llllIIII[t.llllIlII[77]] = "Cell door";
        t.llllIIII[t.llllIlII[78]] = "Open";
        t.llllIIII[t.llllIlII[79]] = "Blessed water";
        t.llllIIII[t.llllIlII[80]] = "Coffin";
        t.llllIIII[t.llllIlII[81]] = "Using water on coffin";
        t.llllIIII[t.llllIlII[82]] = "Blessed water";
        t.llllIIII[t.llllIlII[83]] = "Exiting cell";
        t.llllIIII[t.llllIlII[84]] = "Cell door";
        t.llllIIII[t.llllIlII[85]] = "Open";
        t.llllIIII[t.llllIlII[86]] = "Drezel";
        t.llllIIII[t.llllIlII[87]] = "Handling chat";
        t.llllIIII[t.llllIlII[88]] = "Drezel";
        t.llllIIII[t.llllIlII[89]] = "Entering cell";
        t.llllIIII[t.llllIlII[90]] = "Cell door";
        t.llllIIII[t.llllIlII[91]] = "Open";
        t.llllIIII[t.llllIlII[92]] = "Nav to final tile";
        t.llllIIII[t.llllIlII[98]] = "Trapdoor";
        t.llllIIII[t.llllIlII[99]] = "Open";
        t.llllIIII[t.llllIlII[100]] = "Open";
        t.llllIIII[t.llllIlII[101]] = "Climb-down";
        t.llllIIII[t.llllIlII[102]] = "Climb-down";
        t.llllIIII[t.llllIlII[103]] = "Handling chat";
        t.llllIIII[t.llllIlII[104]] = "Drezel";
        t.llllIIII[t.llllIlII[105]] = "Pure essence";
        t.llllIIII[t.llllIlII[106]] = "Turning in ess";
        t.llllIIII[t.llllIlII[107]] = "Drezel";
        t.llllIIII[t.llllIlII[108]] = "Pure essence";
        t.llllIIII[t.llllIlII[109]] = "Grabbing more ess";
        t.llllIIII[t.llllIlII[110]] = "Pure essence";
        t.llllIIII[t.llllIlII[111]] = "Nav to final tile";
        t.llllIIII[t.llllIlII[112]] = "Trapdoor";
        t.llllIIII[t.llllIlII[113]] = "Open";
        t.llllIIII[t.llllIlII[114]] = "Open";
        t.llllIIII[t.llllIlII[115]] = "Climb-down";
        t.llllIIII[t.llllIlII[116]] = "Climb-down";
        t.llllIIII[t.llllIlII[117]] = "Finish & Unlock morty/start nature";
        t.llllIIII[t.llllIlII[119]] = "Drezel";
        t.llllIIII[t.llllIlII[127]] = "Iron key";
        t.llllIIII[t.llllIlII[128]] = "Golden key";
        t.llllIIII[t.llllIlII[129]] = "Golden key";
        t.llllIIII[t.llllIlII[130]] = "Iron key";
        t.llllIIII[t.llllIlII[131]] = "Nav to final tile";
        t.llllIIII[t.llllIlII[2]] = "Trapdoor";
        t.llllIIII[t.llllIlII[132]] = "Open";
        t.llllIIII[t.llllIlII[133]] = "Open";
        t.llllIIII[t.llllIlII[134]] = "Climb-down";
        t.llllIIII[t.llllIlII[135]] = "Climb-down";
        t.llllIIII[t.llllIlII[136]] = "Nav to bank";
        t.llllIIII[t.llllIlII[137]] = "Handling banking";
        t.llllIIII[t.llllIlII[138]] = "Nav to bank";
        t.llllIIII[t.llllIlII[139]] = "Handling banking";
        t.llllIIII[t.llllIlII[140]] = "Bucket";
        t.llllIIII[t.llllIlII[141]] = "Bucket";
        t.llllIIII[t.llllIlII[147]] = "Priest In Peril";
        t.llllIIII[t.llllIlII[148]] = "ring of wealth (";
        t.llllIIII[t.llllIlII[165]] = "I'm looking for a quest!";
        t.llllIIII[t.llllIlII[166]] = "Yes.";
        t.llllIIII[t.llllIlII[167]] = "Ok, let me help then.";
        t.llllIIII[t.llllIlII[168]] = "Yep, now tell me what the problem is.";
        t.llllIIII[t.llllIlII[169]] = "Sure.";
        t.llllIIII[t.llllIlII[170]] = "You're right, we don't.";
        t.llllIIII[t.llllIlII[171]] = "Is there anything else interesting to do around here?";
        t.llllIIII[t.llllIlII[172]] = "Well, what is it, I may be able to help?";
        t.llllIIII[t.llllIlII[173]] = "Yes, I'll go and look for him.";
        t.llllIIII[t.llllIlII[174]] = "Yes, I'm sure.";
        t.llllIIII[t.llllIlII[175]] = "I'll get going.";
        t.llllIIII[t.llllIlII[176]] = "Ok, thanks.";
        t.llllIIII[t.llllIlII[177]] = "I think I've solved the puzzle!";
        t.llllIIII[t.llllIlII[178]] = "How can I help?";
        t.llllIIII[t.llllIlII[179]] = "Roald sent me to check on Drezel.";
        t.llllIIII[t.llllIlII[180]] = "Why is the river such a good defence?";
        t.llllIIII[t.llllIlII[181]] = "You're right, we don't.";
        t.llllIIII[t.llllIlII[182]] = "Yes, of course.";
        t.llllIIII[t.llllIlII[183]] = "Do you know of anything I can do in Morytania?";
        t.llllIIII[t.llllIlII[184]] = "Well, what is it, I may be able to help?";
    }
}

