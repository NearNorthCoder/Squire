/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

public class LHelper {

    private static boolean llIlIIlllIll(int n2) {
        return n2 != 0;
    }

    private static  boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static boolean llIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIIII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIlIIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIlIIIIll(Object object) {
        return object == null;
    }

    static {
        l.llIlIIlllIII();
        l.llIlIIllIlll();
    }

    private static boolean llIlIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(lIllIlIIlIIII);
    }

    private static boolean llIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aj() {
        void lIllIlIllIlll;
        WorldPoint lIllIlIllIIlI;
        WorldArea worldArea = new WorldArea(lllllIIll[0], lllllIIll[1], lllllIIll[2], lllllIIll[3], lllllIIll[4]);
        WorldPoint worldPoint = new WorldPoint(lllllIIll[5], lllllIIll[6], lllllIIll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllllIIll[7], lllllIIll[8], lllllIIll[4]);
        e.F();
        if (l.llIlIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIllIlIllIllI;
            WorldPoint worldPoint3 = new WorldPoint(lllllIIll[9], lllllIIll[10], lllllIIll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllllIIll[9], lllllIIll[11], lllllIIll[4]);
            if (!l.llIlIIlllIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || l.llIlIIlllIll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lIllIlIllIIlI = new WorldPoint(lllllIIll[12], lllllIIll[13], lllllIIll[4]);
                e.c(lIllIlIllIIlI);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)lIllIlIllIIlI), (int)lllllIIll[14]);

            }
            AccBuilderGWD.c = lllllIIlI[lllllIIll[4]];
            Movement.walkTo((WorldPoint)lIllIlIllIllI);

            Time.sleepTicks((int)lllllIIll[15]);

        }
        List lIllIlIllIlII = Players.getAll(arg_0 -> l.a((WorldArea)lIllIlIllIlll, arg_0));
        if (l.llIlIIlllIll(lIllIlIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIlIIllllII(lIllIlIllIlII.size(), lllllIIll[16])) {
            void lIllIlIllIlIl;
            if (l.llIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIlIllIlIl), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[15]];
                Movement.walkTo((WorldPoint)lIllIlIllIlIl);

                Time.sleepTicks((int)lllllIIll[15]);

            }
            if (l.llIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIlIllIlIl), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[17]];
                e.D();
            }
        }
        if (l.llIlIIlllIll(lIllIlIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIlIIllllll(lIllIlIllIlII.size(), lllllIIll[16])) {
            NPC lIllIlIllIIll;
            if (l.llIlIlIIIIII(l.llIlIIlllIIl(e.w(), 55.0))) {
                int[] nArray = new int[lllllIIll[15]];
                nArray[l.lllllIIll[4]] = lllllIIll[18];
                if (l.llIlIIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIIll[15]];
                    nArray2[l.lllllIIll[4]] = lllllIIll[18];
                    Inventory.getFirst((int[])nArray2).interact(lllllIIlI[lllllIIll[19]]);
                    Time.sleepTicks((int)lllllIIll[15]);

                }
            }
            if (l.llIlIlIIIIIl(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[20]];
            }
            if (l.llIlIlIIIIIl(Players.getLocal().getInteracting()) && l.llIlIlIIIIlI(Players.getLocal().getHealthRatio(), lllllIIll[21])) {
                lIllIlIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[29]]) ? 1 : 0) && l.llIlIlIIIlII(nPC.getInteracting(), Players.getLocal()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];

                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIll)) {
                    lIllIlIllIIll.interact(lllllIIlI[lllllIIll[22]]);
                    Time.sleepTicks((int)lllllIIll[17]);

                    return;
                }
                lIllIlIllIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[28]]) ? 1 : 0) && l.llIlIlIIIIll(nPC.getInteracting()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];

                        if (((0xB0 ^ 0x8C) & ~(2 ^ 0x3E)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIlI) && l.llIlIlIIIIll(lIllIlIllIIll)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[16]];
                    lIllIlIllIIlI.interact(lllllIIlI[lllllIIll[23]]);
                    Time.sleepTicks((int)lllllIIll[17]);

                    return;
                }
            }
            if (l.llIlIlIIIIll(Players.getLocal().getInteracting())) {
                lIllIlIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[27]]) ? 1 : 0) && l.llIlIlIIIIll(nPC.getInteracting()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];

                        if (-1 > -1) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                lIllIlIllIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[26]]) ? 1 : 0) && l.llIlIlIIIlII(nPC.getInteracting(), Players.getLocal()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];

                        if ((0x32 ^ 0x36) == 1) {
                            return false;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIll) && l.llIlIlIIIIll(lIllIlIllIIlI)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[24]];
                    lIllIlIllIIll.interact(lllllIIlI[lllllIIll[25]]);
                    Time.sleepTicks((int)lllllIIll[17]);

                }
            }
        }
    }

    private static boolean llIlIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIlIIllIlll() {
        lllllIIlI = new String[lllllIIll[30]];
        l.lllllIIlI[l.lllllIIll[4]] = "Nav to hill giants";
        l.lllllIIlI[l.lllllIIll[15]] = "Run to hop tile";
        l.lllllIIlI[l.lllllIIll[17]] = "World hopping";
        l.lllllIIlI[l.lllllIIll[19]] = "Eat";
        l.lllllIIlI[l.lllllIIll[20]] = "In combat";
        l.lllllIIlI[l.lllllIIll[22]] = "Attack";
        l.lllllIIlI[l.lllllIIll[16]] = "Attacking hill giant";
        l.lllllIIlI[l.lllllIIll[23]] = "Attack";
        l.lllllIIlI[l.lllllIIll[24]] = "Attacking hill giant";
        l.lllllIIlI[l.lllllIIll[25]] = "Attack";
        l.lllllIIlI[l.lllllIIll[26]] = "Hill";
        l.lllllIIlI[l.lllllIIll[27]] = "Hill";
        l.lllllIIlI[l.lllllIIll[28]] = "Hill";
        l.lllllIIlI[l.lllllIIll[29]] = "Hill";
    }

    private static int llIlIIlllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

