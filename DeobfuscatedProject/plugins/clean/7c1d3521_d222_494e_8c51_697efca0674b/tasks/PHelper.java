/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.HHelper;

public class PHelper
implements ac {
    public static  WorldArea cN;
    public static  boolean bt;
    public static  WorldPoint cQ;
    public static  WorldPoint ck;
    
    public static  WorldArea cj;
    
    public static  boolean cJ;
    public static  WorldArea cM;
    public static  WorldArea cL;
    public static  List<d> bv;
    public static  int[] cK;
    public static  WorldPoint cP;
    public static  WorldPoint cO;

    private static boolean llIIIlIIIllIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIlIIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIlIIlIIII(Object object) {
        return object == null;
    }

    static {
        p.llIIIlIIIIlIl();
        p.llIIIlIIIIlII();
        bv = new ArrayList<d>();
        int[] nArray = new int[lllIlIIlIl[9]];
        nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
        nArray[p.lllIlIIlIl[1]] = lllIlIIlIl[15];
        nArray[p.lllIlIIlIl[5]] = lllIlIIlIl[17];
        nArray[p.lllIlIIlIl[6]] = lllIlIIlIl[16];
        nArray[p.lllIlIIlIl[8]] = lllIlIIlIl[18];
        cK = nArray;
        cL = new WorldArea(lllIlIIlIl[74], lllIlIIlIl[75], lllIlIIlIl[40], lllIlIIlIl[40], lllIlIIlIl[0]);
        cM = new WorldArea(lllIlIIlIl[76], lllIlIIlIl[77], lllIlIIlIl[48], lllIlIIlIl[44], lllIlIIlIl[0]);
        cN = new WorldArea(lllIlIIlIl[78], lllIlIIlIl[79], lllIlIIlIl[80], lllIlIIlIl[21], lllIlIIlIl[0]);
        cO = new WorldPoint(lllIlIIlIl[81], lllIlIIlIl[82], lllIlIIlIl[0]);
        ck = new WorldPoint(lllIlIIlIl[83], lllIlIIlIl[75], lllIlIIlIl[0]);
        cP = new WorldPoint(lllIlIIlIl[84], lllIlIIlIl[85], lllIlIIlIl[0]);
        cj = new WorldArea(lllIlIIlIl[86], lllIlIIlIl[87], lllIlIIlIl[67], lllIlIIlIl[53], lllIlIIlIl[0]);
        cQ = new WorldPoint(lllIlIIlIl[88], lllIlIIlIl[43], lllIlIIlIl[0]);
    }

    public static void aL() {
        e.F();
        if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[9])) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIIlIl[1]];
                nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                Inventory.getFirst((int[])nArray2).interact(lllIlIIIll[lllIlIIlIl[47]]);
            }
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[9]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[20])) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIlIIlIl[1]];
                nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                Inventory.getFirst((int[])nArray3).interact(lllIlIIIll[lllIlIIlIl[20]]);
            }
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[20]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[21])) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIlIIlIl[1]];
                nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                Inventory.getFirst((int[])nArray4).interact(lllIlIIIll[lllIlIIlIl[48]]);
            }
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[21]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[49])) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lllIlIIlIl[1]];
                nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                Inventory.getFirst((int[])nArray5).interact(lllIlIIIll[lllIlIIlIl[50]]);
            }
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[49])) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray6 = new int[lllIlIIlIl[1]];
                nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                Inventory.getFirst((int[])nArray6).interact(lllIlIIIll[lllIlIIlIl[51]]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aj() {
        void var1;
        NPC var2;
        WorldArea worldArea = new WorldArea(lllIlIIlIl[22], lllIlIIlIl[23], lllIlIIlIl[24], lllIlIIlIl[25], lllIlIIlIl[0]);
        WorldPoint worldPoint = new WorldPoint(lllIlIIlIl[26], lllIlIIlIl[27], lllIlIIlIl[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIlIl[28], lllIlIIlIl[29], lllIlIIlIl[0]);
        e.F();
        if (p.llIIIlIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var3;
            WorldPoint worldPoint3 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[31], lllIlIIlIl[0]);
            WorldPoint worldPoint4 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[32], lllIlIIlIl[0]);
            if (!p.llIIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || p.llIIIlIIIIlll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                var2 = new WorldPoint(lllIlIIlIl[33], lllIlIIlIl[34], lllIlIIlIl[0]);
                e.c((WorldPoint)var2);
                Time.sleepUntil(() -> p.e((WorldPoint)var2), (int)lllIlIIlIl[35]);

            }
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[36]];
            Movement.walkTo((WorldPoint)var3);

            Time.sleepTicks((int)lllIlIIlIl[1]);

        }
        List var4 = Players.getAll(arg_0 -> p.b((WorldArea)var1, arg_0));
        if (p.llIIIlIIIIlll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIIlIIIlIlI(var4.size(), lllIlIIlIl[19])) {
            void var5;
            if (p.llIIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[37]];
                Movement.walkTo((WorldPoint)var5);

                Time.sleepTicks((int)lllIlIIlIl[1]);

            }
            if (p.llIIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[38]];
                p.D();
            }
        }
        if (p.llIIIlIIIIlll(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIIlIIIlIII(var4.size(), lllIlIIlIl[19])) {
            if (p.llIIIlIIIlIll(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[39]];
            }
            if (p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                NPC var6 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[73]]) ? 1 : 0) && p.llIIIlIIlIIII(nPC.getInteracting()) && p.llIIIlIIIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];

                        if ((0x8B ^ 0x8F) <= 0) {
                            return false;
                        }
                    } else {
                        n2 = lllIlIIlIl[0];
                    }
                    return n2 != 0;
                });
                var2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[72]]) ? 1 : 0) && p.llIIIlIIlIlII(nPC.getInteracting(), Players.getLocal()) && p.llIIIlIIIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];

                        if (2 < 0) {
                            return ((142 + 147 - 274 + 144 ^ 126 + 74 - 170 + 133) & (0x37 ^ 0x23 ^ (0xAF ^ 0x87) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIlIIlIl[0];
                    }
                    return n2 != 0;
                });
                if (p.llIIIlIIIlIll(var6) && p.llIIIlIIlIIII(var2)) {
                    AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[40]];
                    var6.interact(lllIlIIIll[lllIlIIlIl[2]]);
                    Time.sleepTicks((int)lllIlIIlIl[5]);

                }
            }
        }
    }

    private static boolean llIIIlIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void am() {
        if (p.llIIIlIIIllIl(p.llIIIlIIlIIIl(e.w(), 30.0))) {
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIIlIl[1]];
                nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
                Inventory.getFirst((int[])nArray2).interact(lllIlIIIll[lllIlIIlIl[4]]);
                Time.sleepTicks((int)lllIlIIlIl[1]);

            }
        }
        e.F();
        if (p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
            NPC var7 = NPCs.getNearest(nPC -> {
                int n2;
                if (!p.llIIIlIIIlIIl(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[25]]) ? 1 : 0) || p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[49]]) ? 1 : 0)) {
                    NPC var8;
                    String[] stringArray = new String[lllIlIIlIl[1]];
                    stringArray[p.lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[71]];
                    if (p.llIIIlIIIIlll(var8.hasAction(stringArray) ? 1 : 0) && p.llIIIlIIlIIII(var8.getInteracting()) && p.llIIIlIIIlIIl(var8.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];

                        if (-1 < ((48 + 113 - 33 + 78 ^ 73 + 1 - 10 + 66) & (140 + 79 - 215 + 236 ^ 148 + 55 - 202 + 187 ^ -1))) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllIlIIlIl[0];
                return n2 != 0;
            });
            String[] stringArray = new String[lllIlIIlIl[1]];
            stringArray[p.lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[44]];
            List var9 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (p.llIIIlIIlIlII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIlIIlIl[1];

                    if ((0xAB ^ 0xAF) == 0) {
                        return false;
                    }
                } else {
                    bl = lllIlIIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.llIIIlIIIlIll(var7) && p.llIIIlIIIIlll(var9.isEmpty() ? 1 : 0) && p.llIIIlIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                var7.interact(lllIlIIIll[lllIlIIlIl[45]]);
                Time.sleepTicks((int)lllIlIIlIl[6]);

            }
            if (p.llIIIlIIIlIIl(var9.isEmpty() ? 1 : 0) && p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                ((NPC)var9.get(lllIlIIlIl[0])).interact(lllIlIIIll[lllIlIIlIl[46]]);
                Time.sleepTicks((int)lllIlIIlIl[6]);

            }
        }
    }

    private static  boolean e(WorldPoint worldPoint) {
        return Players.getLocal().getWorldLocation().equals((Object)worldPoint);
    }

    public static void Q() {
        d var10;
        int[] nArray = new int[lllIlIIlIl[1]];
        nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIlIIlIl[12], lllIlIIlIl[13], lllIlIIlIl[54]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lllIlIIlIl[1]];
        nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var10 = new DHelper(lllIlIIlIl[18], lllIlIIlIl[1], lllIlIIlIl[55]);
            bv.add(var10);

        }
        int[] nArray3 = new int[lllIlIIlIl[1]];
        nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var10 = new DHelper(lllIlIIlIl[14], lllIlIIlIl[1], lllIlIIlIl[7]);
            bv.add(var10);

        }
        int[] nArray4 = new int[lllIlIIlIl[1]];
        nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var10 = new DHelper(lllIlIIlIl[15], lllIlIIlIl[1], lllIlIIlIl[7]);
            bv.add(var10);

        }
        int[] nArray5 = new int[lllIlIIlIl[1]];
        nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var10 = new DHelper(lllIlIIlIl[16], lllIlIIlIl[1], lllIlIIlIl[56]);
            bv.add(var10);

        }
        int[] nArray6 = new int[lllIlIIlIl[1]];
        nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var10 = new DHelper(lllIlIIlIl[17], lllIlIIlIl[1], lllIlIIlIl[56]);
            bv.add(var10);

        }
    }

    private static int llIIIlIIIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ae() {
        return lllIlIIlIl[0];
    }

    public static void al() {
        if (p.llIIIlIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.llIIIlIIIlIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[52]];
            Movement.walkTo((WorldPoint)cQ);

            Time.sleepTicks((int)lllIlIIlIl[1]);

        }
        if (p.llIIIlIIIIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[53]];
            p.am();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
        int n2;
        block5: {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                int[] nArray = new int[lllIlIIlIl[1]];
                                nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                                if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray2 = new int[lllIlIIlIl[1]];
                                nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                                if (!p.llIIIlIIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                            }
                            int[] nArray = new int[lllIlIIlIl[1]];
                            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                            if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                            int[] nArray3 = new int[lllIlIIlIl[1]];
                            nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                            if (!p.llIIIlIIIIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block5;
                        }
                        int[] nArray = new int[lllIlIIlIl[1]];
                        nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                        if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                        int[] nArray4 = new int[lllIlIIlIl[1]];
                        nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                        if (!p.llIIIlIIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block5;
                    }
                    int[] nArray = new int[lllIlIIlIl[1]];
                    nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                    int[] nArray5 = new int[lllIlIIlIl[1]];
                    nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                    if (!p.llIIIlIIIIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block5;
                }
                int[] nArray = new int[lllIlIIlIl[1]];
                nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lllIlIIlIl[1]];
                nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                if (!p.llIIIlIIIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
            }
            int[] nArray = new int[lllIlIIlIl[1]];
            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
            if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIlIIlIl[1];

                if (3 > ((0x1F ^ 0x27) & ~(0x87 ^ 0xBF) & ~((0x27 ^ 0x77) & ~(0x61 ^ 0x31)))) return n2 != 0;
                return false;
            }
        }
        n2 = lllIlIIlIl[0];
        return n2 != 0;
    }

    private static boolean llIIIlIIlIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlIIIlIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        try {
            p.aJ();

        }
        catch (Exception var11) {
            var11.printStackTrace();
        }
        if (3 < 1) {
            return (0x67 ^ 0x4D) & ~(0x7E ^ 0x54);
        }
        return lllIlIIlIl[0];
    }

    private static boolean llIIIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean b(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    @Override
    public boolean ah() {
        int n2;
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[3]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[4])) {
            n2 = lllIlIIlIl[1];

            if ((0xA0 ^ 0xA5) <= 0) {
                return false;
            }
        } else {
            n2 = lllIlIIlIl[0];
        }
        return n2 != 0;
    }

    public static void D() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (p.llIIIlIIIlIIl(world.isMembers() ? 1 : 0) && p.llIIIlIIIllll(world.getPlayerCount(), lllIlIIlIl[58]) && p.llIIIlIIlIIll(world.getId(), Worlds.getCurrentId()) && p.llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[59]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[60]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[61]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[21]]) ? 1 : 0) && p.llIIIlIIlIIll(world.getId(), lllIlIIlIl[62]) && p.llIIIlIIlIIll(world.getId(), lllIlIIlIl[63]) && p.llIIIlIIlIIll(world.getId(), lllIlIIlIl[63]) && p.llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[64]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[65]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().contains(lllIlIIIll[lllIlIIlIl[66]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[67]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[68]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[69]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().endsWith(lllIlIIIll[lllIlIIlIl[70]]) ? 1 : 0) && p.llIIIlIIIlIIl(world.getActivity().startsWith(lllIlIIIll[lllIlIIlIl[24]]) ? 1 : 0) && p.llIIIlIIIlllI(world.getPlayerCount(), lllIlIIlIl[21])) {
                n2 = lllIlIIlIl[1];

                if (3 > (0x46 ^ 0x42)) {
                    return false;
                }
            } else {
                n2 = lllIlIIlIl[0];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    private static boolean llIIIlIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    public static void aO() {
        if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[8]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[8]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[19]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[8]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[19]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[36]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[37]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[19]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[36]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[37]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[37]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[36]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[37]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[37]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[40]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[37]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[40]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[2]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[40]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[4]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[3]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[4]) && p.llIIIlIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
    }

    public static void aJ() {
        block22: {
            block24: {
                block23: {
                    if (p.llIIIlIIIIlll(bt ? 1 : 0)) {
                        AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[0]];
                        b.a(bv);
                        if (p.llIIIlIIIlIII(bv.size(), lllIlIIlIl[1])) {
                            System.out.println(lllIlIIIll[lllIlIIlIl[1]]);
                            bt = lllIlIIlIl[0];
                        }
                    }
                    if (!p.llIIIlIIIlIIl(bt ? 1 : 0) || p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[3]) && !p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[4])) break block22;
                    if (p.llIIIlIIIlIIl(p.aM() ? 1 : 0)) {
                        BankLocation var12 = BankLocation.getNearest();
                        if (p.llIIIlIIIlIll(var12) && p.llIIIlIIIlIIl(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[5]];
                            a.a(var12);
                        }
                        if (p.llIIIlIIIlIll(var12) && p.llIIIlIIIIlll(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[6]];
                            if (p.llIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIlIl[7]);

                            }
                            if (p.llIIIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                                if (p.llIIIlIIIllII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIlIIlIl[1]);

                                }
                                if (p.llIIIlIIIllII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIlIIlIl[5]);

                                }
                                if (p.llIIIlIIIlIIl(p.aN() ? 1 : 0)) {
                                    p.Q();
                                    System.out.println(lllIlIIIll[lllIlIIlIl[8]]);
                                    bt = lllIlIIlIl[1];
                                    return;
                                }
                                if (p.llIIIlIIIlIIl(cJ ? 1 : 0)) {
                                    h.X();
                                    cJ = lllIlIIlIl[1];
                                }
                                while (p.llIIIlIIIlIIl(h.bu ? 1 : 0) && p.llIIIlIIIlIIl(AccBuilderSotf.d ? 1 : 0)) {
                                    h.d(lllIlIIIll[lllIlIIlIl[9]]);
                                    Time.sleepTicks((int)lllIlIIlIl[1]);

                                    if (3 > 0) continue;
                                    return;
                                }
                                a.a(cK, lllIlIIlIl[1]);
                                a.a(lllIlIIlIl[10], lllIlIIlIl[11]);
                                a.b(f.ba, lllIlIIlIl[1]);
                                if (p.llIIIlIIIIlll(Inventory.contains((int[])cK) ? 1 : 0)) {
                                    a.a(lllIlIIlIl[12], lllIlIIlIl[13]);
                                }
                            }
                        }
                    }
                    if (!p.llIIIlIIIIlll(p.aM() ? 1 : 0)) break block22;
                    p.aL();
                    cJ = lllIlIIlIl[0];
                    if (p.llIIIlIIIlIlI(Movement.getRunEnergy(), lllIlIIlIl[4]) && p.llIIIlIIIlIIl(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    int[] nArray = new int[lllIlIIlIl[1]];
                    nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray2 = new int[lllIlIIlIl[1]];
                    nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block23;
                    int[] nArray3 = new int[lllIlIIlIl[1]];
                    nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block23;
                    int[] nArray4 = new int[lllIlIIlIl[1]];
                    nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block23;
                    int[] nArray5 = new int[lllIlIIlIl[1]];
                    nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                    if (!p.llIIIlIIIIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block24;
                }
                p.aO();
            }
            if (p.llIIIlIIIllIl(p.llIIIlIIIIllI(e.w(), 45.0))) {
                int[] nArray = new int[lllIlIIlIl[1]];
                nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
                if (p.llIIIlIIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIlIIlIl[1]];
                    nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
                    Inventory.getFirst((int[])nArray6).interact(lllIlIIIll[lllIlIIlIl[19]]);
                    Time.sleepTicks((int)lllIlIIlIl[1]);

                }
            }
            if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[20]) && p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[20])) {
                p.aK();
            }
            if (p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[21]) && !p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[20]) || p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[21]) && !p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[20]) || p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[21]) && !p.llIIIlIIIlIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[20]) || p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[20]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[20])) {
                p.al();
            }
            if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[21]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[21]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[21])) {
                p.aj();
            }
        }
    }

    private static boolean llIIIlIIIllII(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return lllIlIIIll[lllIlIIlIl[57]];
    }

        return String.valueOf(var13);
    }

    private static boolean llIIIlIIIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
        int n2;
        block3: {
            block8: {
                block7: {
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    int[] nArray = new int[lllIlIIlIl[1]];
                                    nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                                    int[] nArray2 = new int[lllIlIIlIl[1]];
                                    nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                                    if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                                    int[] nArray3 = new int[lllIlIIlIl[1]];
                                    nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
                                    if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) break block3;
                                }
                                int[] nArray = new int[lllIlIIlIl[1]];
                                nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                                if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray4 = new int[lllIlIIlIl[1]];
                                nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                                if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
                                int[] nArray5 = new int[lllIlIIlIl[1]];
                                nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
                                if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) break block3;
                            }
                            int[] nArray = new int[lllIlIIlIl[1]];
                            nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                            if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                            int[] nArray6 = new int[lllIlIIlIl[1]];
                            nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                            if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
                            int[] nArray7 = new int[lllIlIIlIl[1]];
                            nArray7[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
                            if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) break block3;
                        }
                        int[] nArray = new int[lllIlIIlIl[1]];
                        nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                        if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                        int[] nArray8 = new int[lllIlIIlIl[1]];
                        nArray8[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                        if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block6;
                        int[] nArray9 = new int[lllIlIIlIl[1]];
                        nArray9[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
                        if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) break block3;
                    }
                    int[] nArray = new int[lllIlIIlIl[1]];
                    nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                    if (!p.llIIIlIIIlIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray10 = new int[lllIlIIlIl[1]];
                    nArray10[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                    if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block7;
                    int[] nArray11 = new int[lllIlIIlIl[1]];
                    nArray11[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
                    if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllIlIIlIl[1]];
                nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
                if (!p.llIIIlIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                int[] nArray12 = new int[lllIlIIlIl[1]];
                nArray12[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
                if (!p.llIIIlIIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) break block3;
            }
            n2 = lllIlIIlIl[1];

            if (1 <= 3) return n2 != 0;
            return ((0x25 ^ 0x4A ^ (0x6B ^ 0xE)) & (77 + 27 - 16 + 74 ^ 119 + 166 - 140 + 23 ^ -1)) != 0;
        }
        n2 = lllIlIIlIl[0];
        return n2 != 0;
    }

    private static int llIIIlIIlIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIIlIIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIlIIIIlII() {
        lllIlIIIll = new String[lllIlIIlIl[89]];
        p.lllIlIIIll[p.lllIlIIlIl[0]] = "Buying items";
        p.lllIlIIIll[p.lllIlIIlIl[1]] = "Finished buying items, switching back to melee training";
        p.lllIlIIIll[p.lllIlIIlIl[5]] = "Navigating to bank";
        p.lllIlIIIll[p.lllIlIIlIl[6]] = "Handling banking";
        p.lllIlIIIll[p.lllIlIIlIl[8]] = "We are missing supplies, switching to BUYING";
        p.lllIlIIIll[p.lllIlIIlIl[9]] = "f2pmelee";
        p.lllIlIIIll[p.lllIlIIlIl[19]] = "Eat";
        p.lllIlIIIll[p.lllIlIIlIl[36]] = "Nav to hill giants";
        p.lllIlIIIll[p.lllIlIIlIl[37]] = "Run to hop tile";
        p.lllIlIIIll[p.lllIlIIlIl[38]] = "World hopping";
        p.lllIlIIIll[p.lllIlIIlIl[39]] = "In combat";
        p.lllIlIIIll[p.lllIlIIlIl[40]] = "Attacking hill giant";
        p.lllIlIIIll[p.lllIlIIlIl[2]] = "Attack";
        p.lllIlIIIll[p.lllIlIIlIl[41]] = "Nav to cows";
        p.lllIlIIIll[p.lllIlIIlIl[3]] = "Attacking cows";
        p.lllIlIIIll[p.lllIlIIlIl[4]] = "Eat";
        p.lllIlIIIll[p.lllIlIIlIl[44]] = "cow";
        p.lllIlIIIll[p.lllIlIIlIl[45]] = "Attack";
        p.lllIlIIIll[p.lllIlIIlIl[46]] = "Attack";
        p.lllIlIIIll[p.lllIlIIlIl[47]] = "Wield";
        p.lllIlIIIll[p.lllIlIIlIl[20]] = "Wield";
        p.lllIlIIIll[p.lllIlIIlIl[48]] = "Wield";
        p.lllIlIIIll[p.lllIlIIlIl[50]] = "Wield";
        p.lllIlIIIll[p.lllIlIIlIl[51]] = "Wield";
        p.lllIlIIIll[p.lllIlIIlIl[52]] = "Nav to cows";
        p.lllIlIIIll[p.lllIlIIlIl[53]] = "Attacking cows";
        p.lllIlIIIll[p.lllIlIIlIl[57]] = "12/14/15 Melee";
        p.lllIlIIIll[p.lllIlIIlIl[59]] = "total";
        p.lllIlIIIll[p.lllIlIIlIl[60]] = "PvP";
        p.lllIlIIIll[p.lllIlIIlIl[61]] = "PvP";
        p.lllIlIIIll[p.lllIlIIlIl[21]] = "High";
        p.lllIlIIIll[p.lllIlIIlIl[64]] = "Leagues";
        p.lllIlIIIll[p.lllIlIIlIl[65]] = "Beta";
        p.lllIlIIIll[p.lllIlIIlIl[66]] = "beta";
        p.lllIlIIIll[p.lllIlIIlIl[67]] = "Deadman";
        p.lllIlIIIll[p.lllIlIIlIl[68]] = "Deadman";
        p.lllIlIIIll[p.lllIlIIlIl[69]] = "Speedrunning";
        p.lllIlIIIll[p.lllIlIIlIl[70]] = "total";
        p.lllIlIIIll[p.lllIlIIlIl[24]] = "Beta";
        p.lllIlIIIll[p.lllIlIIlIl[25]] = "calf";
        p.lllIlIIIll[p.lllIlIIlIl[49]] = "Cow";
        p.lllIlIIIll[p.lllIlIIlIl[71]] = "Attack";
        p.lllIlIIIll[p.lllIlIIlIl[72]] = "Hill";
        p.lllIlIIIll[p.lllIlIIlIl[73]] = "Hill";
    }

    public static void aK() {
        if (p.llIIIlIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.llIIIlIIIlIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[41]];
            Movement.walkTo((WorldPoint)new WorldPoint(lllIlIIlIl[42], lllIlIIlIl[43], lllIlIIlIl[0]));

            Time.sleepTicks((int)lllIlIIlIl[1]);

        }
        if (p.llIIIlIIIIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[3]];
            p.am();
        }
    }

}

