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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class LHelper {

    private static boolean lIllllllIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllllIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        l.lIllllllIIlll();
        l.lIllllllIIllI();
    }

    private static void lIllllllIIllI() {
        lllIIIlIIl = new String[lllIIIlIlI[30]];
        l.lllIIIlIIl[l.lllIIIlIlI[4]] = "Nav to hill giants";
        l.lllIIIlIIl[l.lllIIIlIlI[15]] = "Run to hop tile";
        l.lllIIIlIIl[l.lllIIIlIlI[17]] = "World hopping";
        l.lllIIIlIIl[l.lllIIIlIlI[19]] = "Eat";
        l.lllIIIlIIl[l.lllIIIlIlI[20]] = "In combat";
        l.lllIIIlIIl[l.lllIIIlIlI[22]] = "Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[16]] = "Attacking hill giant";
        l.lllIIIlIIl[l.lllIIIlIlI[23]] = "Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[24]] = "Attacking hill giant";
        l.lllIIIlIIl[l.lllIIIlIlI[25]] = "Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[26]] = "Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[27]] = "Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[28]] = "Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[29]] = "Hill";
    }

        return String.valueOf(var1);
    }

    private static  boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static boolean lIllllllIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void aj() {
        void var2;
        WorldPoint var3;
        WorldArea worldArea = new WorldArea(lllIIIlIlI[0], lllIIIlIlI[1], lllIIIlIlI[2], lllIIIlIlI[3], lllIIIlIlI[4]);
        WorldPoint worldPoint = new WorldPoint(lllIIIlIlI[5], lllIIIlIlI[6], lllIIIlIlI[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllIIIlIlI[7], lllIIIlIlI[8], lllIIIlIlI[4]);
        e.F();
        if (l.lIllllllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var4;
            WorldPoint worldPoint3 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[10], lllIIIlIlI[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[11], lllIIIlIlI[4]);
            if (!l.lIllllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || l.lIllllllIlIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                var3 = new WorldPoint(lllIIIlIlI[12], lllIIIlIlI[13], lllIIIlIlI[4]);
                e.c(var3);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)var3), (int)lllIIIlIlI[14]);

            }
            AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[4]];
            Movement.walkTo((WorldPoint)var4);

            Time.sleepTicks((int)lllIIIlIlI[15]);

        }
        List var5 = Players.getAll(arg_0 -> l.a((WorldArea)var2, arg_0));
        if (l.lIllllllIlIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIllllllIlIll(var5.size(), lllIIIlIlI[16])) {
            void var6;
            if (l.lIllllllIllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[15]];
                Movement.walkTo((WorldPoint)var6);

                Time.sleepTicks((int)lllIIIlIlI[15]);

            }
            if (l.lIllllllIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[17]];
                e.D();
            }
        }
        if (l.lIllllllIlIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIllllllIlllI(var5.size(), lllIIIlIlI[16])) {
            NPC var7;
            if (l.lIllllllIllll(l.lIllllllIlIII(e.w(), 55.0))) {
                int[] nArray = new int[lllIIIlIlI[15]];
                nArray[l.lllIIIlIlI[4]] = lllIIIlIlI[18];
                if (l.lIllllllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIIlIlI[15]];
                    nArray2[l.lllIIIlIlI[4]] = lllIIIlIlI[18];
                    Inventory.getFirst((int[])nArray2).interact(lllIIIlIIl[lllIIIlIlI[19]]);
                    Time.sleepTicks((int)lllIIIlIlI[15]);

                }
            }
            if (l.lIlllllllIIII(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[20]];
            }
            if (l.lIlllllllIIII(Players.getLocal().getInteracting()) && l.lIlllllllIIIl(Players.getLocal().getHealthRatio(), lllIIIlIlI[21])) {
                var7 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[29]]) ? 1 : 0) && l.lIlllllllIIll(nPC.getInteracting(), Players.getLocal()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];

                        if (((0x4D ^ 0x3D ^ (0x2F ^ 0xC)) & (0x13 ^ 0x45 ^ (4 ^ 1) ^ -1)) != 0) {
                            return ((0xF0 ^ 0x96 ^ (0x5E ^ 2)) & (0xF0 ^ 0xC6 ^ (0x63 ^ 0x6F) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(var7)) {
                    var7.interact(lllIIIlIIl[lllIIIlIlI[22]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);

                    return;
                }
                var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[28]]) ? 1 : 0) && l.lIlllllllIIlI(nPC.getInteracting()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];

                        if ((0xE ^ 0xA) < -1) {
                            return false;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(var3) && l.lIlllllllIIlI(var7)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[16]];
                    var3.interact(lllIIIlIIl[lllIIIlIlI[23]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);

                    return;
                }
            }
            if (l.lIlllllllIIlI(Players.getLocal().getInteracting())) {
                var7 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[27]]) ? 1 : 0) && l.lIlllllllIIlI(nPC.getInteracting()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];

                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                var3 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[26]]) ? 1 : 0) && l.lIlllllllIIll(nPC.getInteracting(), Players.getLocal()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];

                        if (((0x7E ^ 0x1B ^ (0x51 ^ 9)) & (85 + 118 - 63 + 12 ^ 75 + 51 - 33 + 72 ^ -1)) == 3) {
                            return false;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(var7) && l.lIlllllllIIlI(var3)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[24]];
                    var7.interact(lllIIIlIIl[lllIIIlIlI[25]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);

                }
            }
        }
    }

    private static boolean lIlllllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllllllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlllllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllllIllll(int n2) {
        return n2 < 0;
    }

    private static int lIllllllIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllllllIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllllIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllllllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllllIlllI(int n2, int n3) {
        return n2 < n3;
    }
}

