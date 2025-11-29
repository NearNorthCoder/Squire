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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.h;

public class p
implements ac {
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ String[] lllIlIIIll;
    public static /* synthetic */ WorldArea cj;
    private static /* synthetic */ int[] lllIlIIlIl;
    public static /* synthetic */ boolean cJ;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ WorldPoint cO;

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
        void lllllllllllllllllIlllIIIIlIIllIl;
        NPC lllllllllllllllllIlllIIIIlIIlIII;
        WorldArea worldArea = new WorldArea(lllIlIIlIl[22], lllIlIIlIl[23], lllIlIIlIl[24], lllIlIIlIl[25], lllIlIIlIl[0]);
        WorldPoint worldPoint = new WorldPoint(lllIlIIlIl[26], lllIlIIlIl[27], lllIlIIlIl[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIlIl[28], lllIlIIlIl[29], lllIlIIlIl[0]);
        e.F();
        if (p.llIIIlIIIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIlllIIIIlIIllII;
            WorldPoint worldPoint3 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[31], lllIlIIlIl[0]);
            WorldPoint worldPoint4 = new WorldPoint(lllIlIIlIl[30], lllIlIIlIl[32], lllIlIIlIl[0]);
            if (!p.llIIIlIIIlIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || p.llIIIlIIIIlll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lllllllllllllllllIlllIIIIlIIlIII = new WorldPoint(lllIlIIlIl[33], lllIlIIlIl[34], lllIlIIlIl[0]);
                e.c((WorldPoint)lllllllllllllllllIlllIIIIlIIlIII);
                Time.sleepUntil(() -> p.e((WorldPoint)lllllllllllllllllIlllIIIIlIIlIII), (int)lllIlIIlIl[35]);
                "".length();
            }
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[36]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIIIlIIllII);
            "".length();
            Time.sleepTicks((int)lllIlIIlIl[1]);
            "".length();
        }
        List lllllllllllllllllIlllIIIIlIIlIlI = Players.getAll(arg_0 -> p.b((WorldArea)lllllllllllllllllIlllIIIIlIIllIl, arg_0));
        if (p.llIIIlIIIIlll(lllllllllllllllllIlllIIIIlIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIIlIIIlIlI(lllllllllllllllllIlllIIIIlIIlIlI.size(), lllIlIIlIl[19])) {
            void lllllllllllllllllIlllIIIIlIIlIll;
            if (p.llIIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlllIIIIlIIlIll), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[37]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlllIIIIlIIlIll);
                "".length();
                Time.sleepTicks((int)lllIlIIlIl[1]);
                "".length();
            }
            if (p.llIIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlllIIIIlIIlIll), lllIlIIlIl[5])) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[38]];
                p.D();
            }
        }
        if (p.llIIIlIIIIlll(lllllllllllllllllIlllIIIIlIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIIlIIIlIII(lllllllllllllllllIlllIIIIlIIlIlI.size(), lllIlIIlIl[19])) {
            if (p.llIIIlIIIlIll(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[39]];
            }
            if (p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                NPC lllllllllllllllllIlllIIIIlIIlIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[73]]) ? 1 : 0) && p.llIIIlIIlIIII(nPC.getInteracting()) && p.llIIIlIIIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];
                        "".length();
                        if ((0x8B ^ 0x8F) <= 0) {
                            return ((0x4F ^ 0x1E) & ~(0xC2 ^ 0x93)) != 0;
                        }
                    } else {
                        n2 = lllIlIIlIl[0];
                    }
                    return n2 != 0;
                });
                lllllllllllllllllIlllIIIIlIIlIII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[72]]) ? 1 : 0) && p.llIIIlIIlIlII(nPC.getInteracting(), Players.getLocal()) && p.llIIIlIIIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];
                        "".length();
                        if ("  ".length() < 0) {
                            return ((142 + 147 - 274 + 144 ^ 126 + 74 - 170 + 133) & (0x37 ^ 0x23 ^ (0xAF ^ 0x87) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = lllIlIIlIl[0];
                    }
                    return n2 != 0;
                });
                if (p.llIIIlIIIlIll(lllllllllllllllllIlllIIIIlIIlIIl) && p.llIIIlIIlIIII(lllllllllllllllllIlllIIIIlIIlIII)) {
                    AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[40]];
                    lllllllllllllllllIlllIIIIlIIlIIl.interact(lllIlIIIll[lllIlIIlIl[2]]);
                    Time.sleepTicks((int)lllIlIIlIl[5]);
                    "".length();
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
                "".length();
            }
        }
        e.F();
        if (p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
            NPC lllllllllllllllllIlllIIIIlIIIlIl = NPCs.getNearest(nPC -> {
                int n2;
                if (!p.llIIIlIIIlIIl(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[25]]) ? 1 : 0) || p.llIIIlIIIIlll(nPC.getName().contains(lllIlIIIll[lllIlIIlIl[49]]) ? 1 : 0)) {
                    NPC lllllllllllllllllIlllIIIIIlllIlI;
                    String[] stringArray = new String[lllIlIIlIl[1]];
                    stringArray[p.lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[71]];
                    if (p.llIIIlIIIIlll(lllllllllllllllllIlllIIIIIlllIlI.hasAction(stringArray) ? 1 : 0) && p.llIIIlIIlIIII(lllllllllllllllllIlllIIIIIlllIlI.getInteracting()) && p.llIIIlIIIlIIl(lllllllllllllllllIlllIIIIIlllIlI.isDead() ? 1 : 0)) {
                        n2 = lllIlIIlIl[1];
                        "".length();
                        if (-" ".length() < ((48 + 113 - 33 + 78 ^ 73 + 1 - 10 + 66) & (140 + 79 - 215 + 236 ^ 148 + 55 - 202 + 187 ^ -" ".length()))) return n2 != 0;
                        return ((170 + 116 - 212 + 113 ^ 102 + 79 - 180 + 129) & (224 + 63 - 193 + 155 ^ 173 + 130 - 226 + 115 ^ -" ".length())) != 0;
                    }
                }
                n2 = lllIlIIlIl[0];
                return n2 != 0;
            });
            String[] stringArray = new String[lllIlIIlIl[1]];
            stringArray[p.lllIlIIlIl[0]] = lllIlIIIll[lllIlIIlIl[44]];
            List lllllllllllllllllIlllIIIIlIIIlII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (p.llIIIlIIlIlII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIlIIlIl[1];
                    "".length();
                    if ((0xAB ^ 0xAF) == 0) {
                        return ((0x3A ^ 2) & ~(0xA4 ^ 0x9C)) != 0;
                    }
                } else {
                    bl = lllIlIIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.llIIIlIIIlIll(lllllllllllllllllIlllIIIIlIIIlIl) && p.llIIIlIIIIlll(lllllllllllllllllIlllIIIIlIIIlII.isEmpty() ? 1 : 0) && p.llIIIlIIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                lllllllllllllllllIlllIIIIlIIIlIl.interact(lllIlIIIll[lllIlIIlIl[45]]);
                Time.sleepTicks((int)lllIlIIlIl[6]);
                "".length();
            }
            if (p.llIIIlIIIlIIl(lllllllllllllllllIlllIIIIlIIIlII.isEmpty() ? 1 : 0) && p.llIIIlIIlIIII(Players.getLocal().getInteracting())) {
                ((NPC)lllllllllllllllllIlllIIIIlIIIlII.get(lllIlIIlIl[0])).interact(lllIlIIIll[lllIlIIlIl[46]]);
                Time.sleepTicks((int)lllIlIIlIl[6]);
                "".length();
            }
        }
    }

    private static /* synthetic */ boolean e(WorldPoint worldPoint) {
        return Players.getLocal().getWorldLocation().equals((Object)worldPoint);
    }

    public static void Q() {
        d lllllllllllllllllIlllIIIIlIIIIlI;
        int[] nArray = new int[lllIlIIlIl[1]];
        nArray[p.lllIlIIlIl[0]] = lllIlIIlIl[12];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIlIIlIl[12], lllIlIIlIl[13], lllIlIIlIl[54]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIlIIlIl[1]];
        nArray2[p.lllIlIIlIl[0]] = lllIlIIlIl[18];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllllllllllllllllIlllIIIIlIIIIlI = new d(lllIlIIlIl[18], lllIlIIlIl[1], lllIlIIlIl[55]);
            bv.add(lllllllllllllllllIlllIIIIlIIIIlI);
            "".length();
        }
        int[] nArray3 = new int[lllIlIIlIl[1]];
        nArray3[p.lllIlIIlIl[0]] = lllIlIIlIl[14];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllllllllllllllllIlllIIIIlIIIIlI = new d(lllIlIIlIl[14], lllIlIIlIl[1], lllIlIIlIl[7]);
            bv.add(lllllllllllllllllIlllIIIIlIIIIlI);
            "".length();
        }
        int[] nArray4 = new int[lllIlIIlIl[1]];
        nArray4[p.lllIlIIlIl[0]] = lllIlIIlIl[15];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllllllllllllllllIlllIIIIlIIIIlI = new d(lllIlIIlIl[15], lllIlIIlIl[1], lllIlIIlIl[7]);
            bv.add(lllllllllllllllllIlllIIIIlIIIIlI);
            "".length();
        }
        int[] nArray5 = new int[lllIlIIlIl[1]];
        nArray5[p.lllIlIIlIl[0]] = lllIlIIlIl[16];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllllllllllllllllIlllIIIIlIIIIlI = new d(lllIlIIlIl[16], lllIlIIlIl[1], lllIlIIlIl[56]);
            bv.add(lllllllllllllllllIlllIIIIlIIIIlI);
            "".length();
        }
        int[] nArray6 = new int[lllIlIIlIl[1]];
        nArray6[p.lllIlIIlIl[0]] = lllIlIIlIl[17];
        if (p.llIIIlIIIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllllllllllllllllIlllIIIIlIIIIlI = new d(lllIlIIlIl[17], lllIlIIlIl[1], lllIlIIlIl[56]);
            bv.add(lllllllllllllllllIlllIIIIlIIIIlI);
            "".length();
        }
    }

    private static String llIIIlIIIIIII(String lllllllllllllllllIlllIIIIIlIlllI, String lllllllllllllllllIlllIIIIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), lllIlIIlIl[37]), "DES");
            Cipher lllllllllllllllllIlllIIIIIllIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIIIIIllIIII.init(lllIlIIlIl[5], lllllllllllllllllIlllIIIIIllIIIl);
            return new String(lllllllllllllllllIlllIIIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIIIlIllll) {
            lllllllllllllllllIlllIIIIIlIllll.printStackTrace();
            return null;
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
            "".length();
            Time.sleepTicks((int)lllIlIIlIl[1]);
            "".length();
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
                "".length();
                if ("   ".length() > ((0x1F ^ 0x27) & ~(0x87 ^ 0xBF) & ~((0x27 ^ 0x77) & ~(0x61 ^ 0x31)))) return n2 != 0;
                return ((0x15 ^ 0x74) & ~(0xE1 ^ 0x80)) != 0;
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
            "".length();
        }
        catch (Exception lllllllllllllllllIlllIIIIlIIIIII) {
            lllllllllllllllllIlllIIIIlIIIIII.printStackTrace();
        }
        if ("   ".length() < " ".length()) {
            return (0x67 ^ 0x4D) & ~(0x7E ^ 0x54);
        }
        return lllIlIIlIl[0];
    }

    private static boolean llIIIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean b(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    @Override
    public boolean ah() {
        int n2;
        if (p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIlIIlIl[2]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIlIIlIl[3]) && p.llIIIlIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIlIIlIl[4])) {
            n2 = lllIlIIlIl[1];
            "".length();
            if ((0xA0 ^ 0xA5) <= 0) {
                return ((0x5E ^ 0x56) & ~(0x32 ^ 0x3A)) != 0;
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
                "".length();
                if ("   ".length() > (0x46 ^ 0x42)) {
                    return ((0x55 ^ 0x41) & ~(0x65 ^ 0x71)) != 0;
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

    private static String llIIIlIIIIIIl(String lllllllllllllllllIlllIIIIIlIIIIl, String lllllllllllllllllIlllIIIIIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIIIIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIIIIIlIIIll.init(lllIlIIlIl[5], lllllllllllllllllIlllIIIIIlIIlII);
            return new String(lllllllllllllllllIlllIIIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlllIIIIIlIIIlI) {
            lllllllllllllllllIlllIIIIIlIIIlI.printStackTrace();
            return null;
        }
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
                        BankLocation lllllllllllllllllIlllIIIIlIlIlII = BankLocation.getNearest();
                        if (p.llIIIlIIIlIll(lllllllllllllllllIlllIIIIlIlIlII) && p.llIIIlIIIlIIl(lllllllllllllllllIlllIIIIlIlIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[5]];
                            a.a(lllllllllllllllllIlllIIIIlIlIlII);
                        }
                        if (p.llIIIlIIIlIll(lllllllllllllllllIlllIIIIlIlIlII) && p.llIIIlIIIIlll(lllllllllllllllllIlllIIIIlIlIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[6]];
                            if (p.llIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIlIl[7]);
                                "".length();
                            }
                            if (p.llIIIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                                if (p.llIIIlIIIllII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIlIIlIl[1]);
                                    "".length();
                                }
                                if (p.llIIIlIIIllII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIlIIlIl[5]);
                                    "".length();
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
                                    "".length();
                                    "".length();
                                    if ("   ".length() > 0) continue;
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
                    "".length();
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

    private static String llIIIlIIIIIlI(String lllllllllllllllllIlllIIIIIIIllII, String lllllllllllllllllIlllIIIIIIIlIll) {
        lllllllllllllllllIlllIIIIIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIIIIIllll = new StringBuilder();
        char[] lllllllllllllllllIlllIIIIIIIlllI = lllllllllllllllllIlllIIIIIIIlIll.toCharArray();
        int lllllllllllllllllIlllIIIIIIIllIl = lllIlIIlIl[0];
        char[] lllllllllllllllllIlllIIIIIIIIlll = lllllllllllllllllIlllIIIIIIIllII.toCharArray();
        int lllllllllllllllllIlllIIIIIIIIllI = lllllllllllllllllIlllIIIIIIIIlll.length;
        int lllllllllllllllllIlllIIIIIIIIlIl = lllIlIIlIl[0];
        while (p.llIIIlIIIlIII(lllllllllllllllllIlllIIIIIIIIlIl, lllllllllllllllllIlllIIIIIIIIllI)) {
            char lllllllllllllllllIlllIIIIIIlIIlI = lllllllllllllllllIlllIIIIIIIIlll[lllllllllllllllllIlllIIIIIIIIlIl];
            lllllllllllllllllIlllIIIIIIIllll.append((char)(lllllllllllllllllIlllIIIIIIlIIlI ^ lllllllllllllllllIlllIIIIIIIlllI[lllllllllllllllllIlllIIIIIIIllIl % lllllllllllllllllIlllIIIIIIIlllI.length]));
            "".length();
            ++lllllllllllllllllIlllIIIIIIIllIl;
            ++lllllllllllllllllIlllIIIIIIIIlIl;
            "".length();
            if (((0xC1 ^ 0x89) & ~(0x2E ^ 0x66)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlllIIIIIIIllll);
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
            "".length();
            if (" ".length() <= "   ".length()) return n2 != 0;
            return ((0x25 ^ 0x4A ^ (0x6B ^ 0xE)) & (77 + 27 - 16 + 74 ^ 119 + 166 - 140 + 23 ^ -" ".length())) != 0;
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
        p.lllIlIIIll[p.lllIlIIlIl[0]] = p.llIIIlIIIIIII("IXw2kFm1TMjsf3MEbOGhDg==", "YbdCv");
        p.lllIlIIIll[p.lllIlIIlIl[1]] = p.llIIIlIIIIIII("ZqrHm1C3ARR1D/ULNn7rwQKOFnJkrz5vrkBMJmPLdm0qTK6IuZzAenUURq2qq5PKFTrsa3zB3jM=", "NssNE");
        p.lllIlIIIll[p.lllIlIIlIl[5]] = p.llIIIlIIIIIIl("8GH+/sUASsfozO1W0SEFeD4F/d6ceBxy", "ldLjI");
        p.lllIlIIIll[p.lllIlIIlIl[6]] = p.llIIIlIIIIIlI("AyYKETgiKQNVNiopDxw6LA==", "KGduT");
        p.lllIlIIIll[p.lllIlIIlIl[8]] = p.llIIIlIIIIIIl("UEi22vMuSCPtyg9SHNl6gweOc3Nb1611K2lS107mMpr1ebdPTEZTYG4ESt5bT69q", "OPayu");
        p.lllIlIIIll[p.lllIlIIlIl[9]] = p.llIIIlIIIIIIl("zMMUXrpnhU307IsB+vlRQg==", "LntSX");
        p.lllIlIIIll[p.lllIlIIlIl[19]] = p.llIIIlIIIIIII("UJ5anM6Yz3E=", "jWCdC");
        p.lllIlIIIll[p.lllIlIIlIl[36]] = p.llIIIlIIIIIlI("ACMZZCUhYgctPSJiCC0wIDYc", "NBoDQ");
        p.lllIlIIIll[p.lllIlIIlIl[37]] = p.llIIIlIIIIIII("csNFvD3qNaRfbueJnmHzKw==", "fXMEY");
        p.lllIlIIIll[p.lllIlIIlIl[38]] = p.llIIIlIIIIIlI("Gys+HhZsLCMCAiUqKw==", "LDLrr");
        p.lllIlIIIll[p.lllIlIIlIl[39]] = p.llIIIlIIIIIIl("bx4cSt5n/eihkn36Qw1ECw==", "cUkKp");
        p.lllIlIIIll[p.lllIlIIlIl[40]] = p.llIIIlIIIIIII("UTFz1CKO4fHW7nxsPIfaw7NdljJaVKwn", "pGfNx");
        p.lllIlIIIll[p.lllIlIIlIl[2]] = p.llIIIlIIIIIlI("MAQBBxca", "qpuft");
        p.lllIlIIIll[p.lllIlIIlIl[41]] = p.llIIIlIIIIIII("GruF71F+7u54t4FGr1Pd0g==", "YDVJc");
        p.lllIlIIIll[p.lllIlIIlIl[3]] = p.llIIIlIIIIIlI("IAUCOBkKGBg+WgIeASo=", "aqvYz");
        p.lllIlIIIll[p.lllIlIIlIl[4]] = p.llIIIlIIIIIIl("yCLxXhsZxVg=", "kNowW");
        p.lllIlIIIll[p.lllIlIIlIl[44]] = p.llIIIlIIIIIlI("FjUZ", "uZniD");
        p.lllIlIIIll[p.lllIlIIlIl[45]] = p.llIIIlIIIIIII("D+F7XtqzI9I=", "iAlYp");
        p.lllIlIIIll[p.lllIlIIlIl[46]] = p.llIIIlIIIIIIl("aLvrF+Q3KRQ=", "MqoFA");
        p.lllIlIIIll[p.lllIlIIlIl[47]] = p.llIIIlIIIIIIl("bxI4tiDon/s=", "ScXmw");
        p.lllIlIIIll[p.lllIlIIlIl[20]] = p.llIIIlIIIIIlI("Oh8BKjM=", "mvdFW");
        p.lllIlIIIll[p.lllIlIIlIl[48]] = p.llIIIlIIIIIII("gGlTmz4Caqc=", "BKiRC");
        p.lllIlIIIll[p.lllIlIIlIl[50]] = p.llIIIlIIIIIIl("i4zEbqkTetA=", "WuTQq");
        p.lllIlIIIll[p.lllIlIIlIl[51]] = p.llIIIlIIIIIIl("czUSW4sG+oo=", "eJkJa");
        p.lllIlIIIll[p.lllIlIIlIl[52]] = p.llIIIlIIIIIlI("BAQcYSQlRQkuJzk=", "JejAP");
        p.lllIlIIIll[p.lllIlIIlIl[53]] = p.llIIIlIIIIIIl("a5Y6cgRMX0obcj8OxYkkyw==", "wjwMM");
        p.lllIlIIIll[p.lllIlIIlIl[57]] = p.llIIIlIIIIIII("pZuEpSIRj8py24lpy+el5Q==", "MdJMO");
        p.lllIlIIIll[p.lllIlIIlIl[59]] = p.llIIIlIIIIIII("gqAuf+xSqgI=", "erRrc");
        p.lllIlIIIll[p.lllIlIIlIl[60]] = p.llIIIlIIIIIlI("CAIX", "XtGHY");
        p.lllIlIIIll[p.lllIlIIlIl[61]] = p.llIIIlIIIIIII("z2tINYEsDT4=", "ByQtz");
        p.lllIlIIIll[p.lllIlIIlIl[21]] = p.llIIIlIIIIIII("rlCl3tMCn/o=", "puPSL");
        p.lllIlIIIll[p.lllIlIIlIl[64]] = p.llIIIlIIIIIlI("Oio0BQATPA==", "vOUbu");
        p.lllIlIIIll[p.lllIlIIlIl[65]] = p.llIIIlIIIIIlI("ECAfCw==", "REkjN");
        p.lllIlIIIll[p.lllIlIIlIl[66]] = p.llIIIlIIIIIlI("JB8RDA==", "FzemB");
        p.lllIlIIIll[p.lllIlIIlIl[67]] = p.llIIIlIIIIIIl("hPkfOYdw1Yc=", "sUEFZ");
        p.lllIlIIIll[p.lllIlIIlIl[68]] = p.llIIIlIIIIIIl("Kkn6qRX8iW0=", "zEJPE");
        p.lllIlIIIll[p.lllIlIIlIl[69]] = p.llIIIlIIIIIIl("VFE549s2vtkFJobT3SNaUg==", "kmcJX");
        p.lllIlIIIll[p.lllIlIIlIl[70]] = p.llIIIlIIIIIIl("CraK+EbNajY=", "mkZXH");
        p.lllIlIIIll[p.lllIlIIlIl[24]] = p.llIIIlIIIIIIl("dDhEjM6P9P8=", "mTaZE");
        p.lllIlIIIll[p.lllIlIIlIl[25]] = p.llIIIlIIIIIlI("IjY8Lg==", "AWPHn");
        p.lllIlIIIll[p.lllIlIIlIl[49]] = p.llIIIlIIIIIlI("Djce", "MXiax");
        p.lllIlIIIll[p.lllIlIIlIl[71]] = p.llIIIlIIIIIII("2nLAKYKZ2nU=", "fgvwx");
        p.lllIlIIIll[p.lllIlIIlIl[72]] = p.llIIIlIIIIIlI("DjkAFQ==", "FPlyp");
        p.lllIlIIIll[p.lllIlIIlIl[73]] = p.llIIIlIIIIIIl("Wdikv6AZeYk=", "aLQWf");
    }

    public static void aK() {
        if (p.llIIIlIIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.llIIIlIIIlIIl(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[41]];
            Movement.walkTo((WorldPoint)new WorldPoint(lllIlIIlIl[42], lllIlIIlIl[43], lllIlIIlIl[0]));
            "".length();
            Time.sleepTicks((int)lllIlIIlIl[1]);
            "".length();
        }
        if (p.llIIIlIIIIlll(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIlIIIll[lllIlIIlIl[3]];
            p.am();
        }
    }

    private static void llIIIlIIIIlIl() {
        lllIlIIlIl = new int[90];
        p.lllIlIIlIl[0] = (0xE8 ^ 0xC7 ^ (9 ^ 0x3F)) & (94 + 150 - 81 + 9 ^ 161 + 142 - 201 + 79 ^ -" ".length()) & ((0xDB ^ 0x9D ^ (0x78 ^ 0x31)) & (0x72 ^ 0x6E ^ (0xB9 ^ 0xAA) ^ -" ".length()) ^ -" ".length());
        p.lllIlIIlIl[1] = " ".length();
        p.lllIlIIlIl[2] = 0x4E ^ 0x42;
        p.lllIlIIlIl[3] = 124 + 36 - 94 + 103 ^ 160 + 91 - 211 + 127;
        p.lllIlIIlIl[4] = 0x1F ^ 0x10;
        p.lllIlIIlIl[5] = "  ".length();
        p.lllIlIIlIl[6] = "   ".length();
        p.lllIlIIlIl[7] = -(0xFFFFE6D6 & 0x3D7F) & (0xFFFFBFDF & 0x77FD);
        p.lllIlIIlIl[8] = 0x40 ^ 0x44;
        p.lllIlIIlIl[9] = 0xE7 ^ 0x92 ^ (0x5B ^ 0x2B);
        p.lllIlIIlIl[10] = 0xFFFFE3F7 & 0x1FEB;
        p.lllIlIIlIl[11] = -(0xFFFFFE94 & 0x297F) & (0xFFFFFBFB & 0x2FFF);
        p.lllIlIIlIl[12] = -(0xFFFF9D09 & 0x76F7) & (0xFFFFBFFF & 0x557B);
        p.lllIlIIlIl[13] = 0xE0 ^ 0xC1 ^ (0x6F ^ 0x2A);
        p.lllIlIIlIl[14] = 0xFFFFAFBF & 0x556B;
        p.lllIlIIlIl[15] = -(0xFFFF8BDD & 0x76E3) & (0xFFFFD7EF & 0x2FFD);
        p.lllIlIIlIl[16] = 0xFFFFB53D & 0x4FF3;
        p.lllIlIIlIl[17] = 0xFFFF9573 & 0x6FBF;
        p.lllIlIIlIl[18] = 0xFFFF957D & 0x6FB7;
        p.lllIlIIlIl[19] = 0x69 ^ 0x21 ^ (0x2C ^ 0x62);
        p.lllIlIIlIl[20] = 0x26 ^ 0x60 ^ (0x6E ^ 0x3C);
        p.lllIlIIlIl[21] = 0x2E ^ 0x30;
        p.lllIlIIlIl[22] = 0xFFFFDD5B & 0x2FBF;
        p.lllIlIIlIl[23] = -(0xFFFFF7AF & 0x4BD5) & (0xFFFFDFFF & 0x6FBF);
        p.lllIlIIlIl[24] = 160 + 127 - 203 + 89 ^ 56 + 127 - 157 + 113;
        p.lllIlIIlIl[25] = 0xBC ^ 0xA2 ^ (0x9D ^ 0xA4);
        p.lllIlIIlIl[26] = -(0xFFFFEBEF & 0x3615) & (0xFFFFAF77 & 0x7FBD);
        p.lllIlIIlIl[27] = -(0xFFFFFDF3 & 0x72AE) & (0xFFFFFEEF & 0x7DFF);
        p.lllIlIIlIl[28] = -(0xFFFFFCE7 & 0x435D) & (0xFFFFDD6E & 0x6FFF);
        p.lllIlIIlIl[29] = -(0xFFFFEFBB & 0x73E5) & (0xFFFFFFFF & 0x6FFE);
        p.lllIlIIlIl[30] = 0xFFFFAEE6 & 0x5DDD;
        p.lllIlIIlIl[31] = -(0xFFFF87DE & 0x7A25) & (0xFFFFFEBF & 0xFDF);
        p.lllIlIIlIl[32] = -(0xFFFFBF5D & 0x73E7) & (0xFFFFFFFF & 0x3FDF);
        p.lllIlIIlIl[33] = 0xFFFFBEEF & 0x4DDE;
        p.lllIlIIlIl[34] = -(0xFFFFFBD6 & 0x766B) & (0xFFFFFFFB & 0x7EDF);
        p.lllIlIIlIl[35] = -(0xFFFFF3CB & 0x6E3D) & (0xFFFFFFFE & 0x739D);
        p.lllIlIIlIl[36] = 0x3B ^ 3 ^ (0xE ^ 0x31);
        p.lllIlIIlIl[37] = 0x86 ^ 0x8E;
        p.lllIlIIlIl[38] = 135 + 177 - 272 + 146 ^ 157 + 117 - 205 + 110;
        p.lllIlIIlIl[39] = 0x33 ^ 0x35 ^ (5 ^ 9);
        p.lllIlIIlIl[40] = 0x8F ^ 0x84;
        p.lllIlIIlIl[41] = 0x5D ^ 0x50;
        p.lllIlIIlIl[42] = -(0xFFFFB49E & 0x7B7F) & (0xFFFFFFFF & 0x3C7F);
        p.lllIlIIlIl[43] = -(0xFFFFDAFE & 0x77FB) & (0xFFFFDFFB & Short.MAX_VALUE);
        p.lllIlIIlIl[44] = 0xD3 ^ 0x90 ^ (0xC5 ^ 0x96);
        p.lllIlIIlIl[45] = 0x1B ^ 0xD ^ (0x6B ^ 0x6C);
        p.lllIlIIlIl[46] = 0x8E ^ 0x9B ^ (1 ^ 6);
        p.lllIlIIlIl[47] = 0xAD ^ 0xAA ^ (0x45 ^ 0x51);
        p.lllIlIIlIl[48] = 0x5E ^ 0x23 ^ (0xD2 ^ 0xBA);
        p.lllIlIIlIl[49] = 0x62 ^ 0x4A;
        p.lllIlIIlIl[50] = 8 ^ 0x69 ^ (0x2D ^ 0x5A);
        p.lllIlIIlIl[51] = 0x5B ^ 0x4C;
        p.lllIlIIlIl[52] = 0x27 ^ 0x3F;
        p.lllIlIIlIl[53] = 3 ^ 0x1A;
        p.lllIlIIlIl[54] = -(0xFFFFFFC6 & 0x3A3D) & (0xFFFFFFFF & 0x3BF7);
        p.lllIlIIlIl[55] = 0xFFFFEFEE & 0x71B9;
        p.lllIlIIlIl[56] = -(0xFFFFF65B & 0x4DEC) & (0xFFFFFFDF & 0x7EFF);
        p.lllIlIIlIl[57] = 0x5B ^ 0x41;
        p.lllIlIIlIl[58] = 0xFFFF9FFF & 0x679E;
        p.lllIlIIlIl[59] = 0x62 ^ 0x6C ^ (0x20 ^ 0x35);
        p.lllIlIIlIl[60] = 129 + 119 - 144 + 46 ^ 94 + 126 - 210 + 128;
        p.lllIlIIlIl[61] = 0x38 ^ 0x4A ^ (0xD2 ^ 0xBD);
        p.lllIlIIlIl[62] = 0xFFFFA7DF & 0x59FA;
        p.lllIlIIlIl[63] = -(0xFFFFE5F7 & 0x3FCB) & (0xFFFFAFDF & 0x77F7);
        p.lllIlIIlIl[64] = 0x9E ^ 0x81;
        p.lllIlIIlIl[65] = 106 + 79 - 129 + 107 ^ 26 + 94 - -9 + 2;
        p.lllIlIIlIl[66] = 0x22 ^ 3;
        p.lllIlIIlIl[67] = 0x52 ^ 0x70;
        p.lllIlIIlIl[68] = 0xF ^ 0x2C;
        p.lllIlIIlIl[69] = 0x39 ^ 0x1D;
        p.lllIlIIlIl[70] = 0x45 ^ 0x60;
        p.lllIlIIlIl[71] = 0xAD ^ 0x84;
        p.lllIlIIlIl[72] = 0x9F ^ 0xB5;
        p.lllIlIIlIl[73] = 0xA4 ^ 0x8F;
        p.lllIlIIlIl[74] = -(0xFFFFEEBD & 0x7167) & (0xFFFFFCBF & 0x6FFD);
        p.lllIlIIlIl[75] = -(0xFFFFC2F1 & 0x7D0F) & (0xFFFFECFE & 0x5FDB);
        p.lllIlIIlIl[76] = -(0xFFFFF2FD & 0x7D03) & (0xFFFFFCBD & 0x7FEE);
        p.lllIlIIlIl[77] = 0xFFFF8CD4 & 0x7FFB;
        p.lllIlIIlIl[78] = 0xFFFFEF79 & 0x1CF7;
        p.lllIlIIlIl[79] = -(0xFFFFE53D & 0x7AE3) & (0xFFFFEEFF & 0x7D7F);
        p.lllIlIIlIl[80] = 0xC ^ 0x3C;
        p.lllIlIIlIl[81] = -(0xFFFFF6F9 & 0x6B67) & (0xFFFFEEEF & 0x7FFD);
        p.lllIlIIlIl[82] = -(0xFFFFFABF & 0x77D1) & (0xFFFFFFFD & 0x7EFF);
        p.lllIlIIlIl[83] = -(0xFFFFBF99 & 0x636F) & (0xFFFFEFFE & 0x3FBF);
        p.lllIlIIlIl[84] = 0xFFFFBEDF & 0x4DBF;
        p.lllIlIIlIl[85] = -(0xFFFFC3DF & 0x7F33) & (0xFFFFDFF6 & 0x6FFB);
        p.lllIlIIlIl[86] = 0xFFFFCCF7 & 0x3F5A;
        p.lllIlIIlIl[87] = 0xFFFFDDFF & 0x2EF7;
        p.lllIlIIlIl[88] = -(0xFFFFF69F & 0x196B) & (0xFFFFDEEB & 0x3D7F);
        p.lllIlIIlIl[89] = 0x40 ^ 0x6C;
    }
}

