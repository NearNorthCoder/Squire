/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class M_Unknown
implements K {
    public static /* synthetic */ int js;
    private static /* synthetic */ int[] lIlIlIllIl;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ String[] lIlIlIlIll;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ int jr;
    static /* synthetic */ WorldArea ju;
    public static /* synthetic */ int jt;
    static /* synthetic */ WorldArea jv;
    static /* synthetic */ WorldArea jw;
    private static /* synthetic */ WorldPoint jx;

    public static void cO() {
        if (M.lIIlIIIlllIlI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[0]];
            b.a(bp);
            if (M.lIIlIIIlllIll(bp.size(), lIlIlIllIl[1])) {
                System.out.println(lIlIlIlIll[lIlIlIllIl[1]]);
                bn = lIlIlIllIl[0];
            }
        }
        if (M.lIIlIIIllllII(bn ? 1 : 0) && M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[2])) {
            if (M.lIIlIIIllllII(M.al() ? 1 : 0)) {
                BankLocation var9 = BankLocation.getNearest();
                if (M.lIIlIIIllllIl(var9) && M.lIIlIIIllllII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[3]];
                    WorldArea var66 = new WorldArea(lIlIlIllIl[4], lIlIlIllIl[5], lIlIlIllIl[6], lIlIlIllIl[7], lIlIlIllIl[0]);
                    if (M.lIIlIIIlllIlI(var66.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var26 = new WorldPoint(lIlIlIllIl[8], lIlIlIllIl[9], lIlIlIllIl[0]);
                        if (M.lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(var26), lIlIlIllIl[10])) {
                            Movement.walkTo((WorldPoint)var26);
                            0;
                            Time.sleepTicks((int)lIlIlIllIl[1]);
                            0;
                        }
                    }
                    a.a(var9);
                }
                if (M.lIIlIIIllllIl(var9) && M.lIIlIIIlllIlI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[10]];
                    if (M.lIIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIllIl[11]);
                        0;
                    }
                    if (M.lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (M.lIIlIIIllllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIlIllIl[1]);
                            0;
                        }
                        if (M.lIIlIIIllllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIlIllIl[3]);
                            0;
                        }
                    }
                    int[] nArray = new int[lIlIlIllIl[12]];
                    nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[13];
                    nArray[M.lIlIlIllIl[1]] = lIlIlIllIl[14];
                    nArray[M.lIlIlIllIl[3]] = lIlIlIllIl[15];
                    nArray[M.lIlIlIllIl[10]] = lIlIlIllIl[16];
                    nArray[M.lIlIlIllIl[17]] = lIlIlIllIl[18];
                    nArray[M.lIlIlIllIl[2]] = lIlIlIllIl[19];
                    nArray[M.lIlIlIllIl[20]] = lIlIlIllIl[21];
                    nArray[M.lIlIlIllIl[22]] = lIlIlIllIl[23];
                    nArray[M.lIlIlIllIl[24]] = lIlIlIllIl[25];
                    nArray[M.lIlIlIllIl[26]] = lIlIlIllIl[27];
                    if (M.lIIlIIIllllII(e.b(nArray) ? 1 : 0)) {
                        M.O();
                        System.out.println(lIlIlIlIll[lIlIlIllIl[17]]);
                        bn = lIlIlIllIl[1];
                        return;
                    }
                    int[] nArray2 = new int[lIlIlIllIl[12]];
                    nArray2[M.lIlIlIllIl[0]] = lIlIlIllIl[13];
                    nArray2[M.lIlIlIllIl[1]] = lIlIlIllIl[14];
                    nArray2[M.lIlIlIllIl[3]] = lIlIlIllIl[15];
                    nArray2[M.lIlIlIllIl[10]] = lIlIlIllIl[16];
                    nArray2[M.lIlIlIllIl[17]] = lIlIlIllIl[18];
                    nArray2[M.lIlIlIllIl[2]] = lIlIlIllIl[19];
                    nArray2[M.lIlIlIllIl[20]] = lIlIlIllIl[21];
                    nArray2[M.lIlIlIllIl[22]] = lIlIlIllIl[23];
                    nArray2[M.lIlIlIllIl[24]] = lIlIlIllIl[25];
                    nArray2[M.lIlIlIllIl[26]] = lIlIlIllIl[27];
                    if (M.lIIlIIIlllIlI(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIlIlIllIl[28], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[29], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[30], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[31], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[32], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[33], lIlIlIllIl[1]);
                        a.a(lIlIlIllIl[34], lIlIlIllIl[1]);
                        int[] nArray3 = new int[lIlIlIllIl[1]];
                        nArray3[M.lIlIlIllIl[0]] = lIlIlIllIl[28];
                        if (M.lIIlIIIllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIlIllIl[1]];
                            nArray4[M.lIlIlIllIl[0]] = lIlIlIllIl[28];
                            if (M.lIIlIIIllllII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIlIllIl[1]];
                                nArray5[M.lIlIlIllIl[0]] = lIlIlIllIl[28];
                                if (M.lIIlIIIllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIlIlIllIl[35], lIlIlIllIl[1]);
                                }
                            }
                        }
                        a.a(lIlIlIllIl[18], lIlIlIllIl[1]);
                        e.l(lIlIlIllIl[28]);
                        e.l(lIlIlIllIl[29]);
                        e.l(lIlIlIllIl[30]);
                        e.l(lIlIlIllIl[31]);
                        e.l(lIlIlIllIl[32]);
                        Time.sleepTicks((int)lIlIlIllIl[1]);
                        0;
                        e.l(lIlIlIllIl[34]);
                        e.l(lIlIlIllIl[36]);
                        e.l(lIlIlIllIl[33]);
                        e.l(lIlIlIllIl[35]);
                        e.l(lIlIlIllIl[18]);
                        Time.sleepTicks((int)lIlIlIllIl[10]);
                        0;
                        if (M.lIIlIIIllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIlIlIllIl[20]);
                            0;
                        }
                        if (M.lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[37])) {
                                a.a(lIlIlIllIl[13], lIlIlIllIl[12]);
                                a.a(lIlIlIllIl[14], lIlIlIllIl[12]);
                                a.a(lIlIlIllIl[21], lIlIlIllIl[12]);
                                a.a(lIlIlIllIl[15], lIlIlIllIl[12]);
                                a.b(f.be, lIlIlIllIl[1]);
                                a.a(lIlIlIllIl[27], lIlIlIllIl[1]);
                                a.a(lIlIlIllIl[19], lIlIlIllIl[2]);
                                a.a(lIlIlIllIl[23], lIlIlIllIl[38]);
                            }
                            if (M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[37])) {
                                a.a(lIlIlIllIl[13], lIlIlIllIl[12]);
                                a.a(lIlIlIllIl[21], lIlIlIllIl[12]);
                                a.a(lIlIlIllIl[25], lIlIlIllIl[12]);
                                a.b(f.be, lIlIlIllIl[1]);
                                a.a(lIlIlIllIl[27], lIlIlIllIl[1]);
                                a.a(lIlIlIllIl[19], lIlIlIllIl[24]);
                                a.a(lIlIlIllIl[23], lIlIlIllIl[12]);
                            }
                        }
                    }
                }
            }
            if (M.lIIlIIIlllIlI(M.al() ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[2]];
                if (M.lIIlIIIlllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlIlIllIl[1]];
                    stringArray2[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIlIlIll[lIlIlIllIl[22]]);
                }
                if (M.lIIlIIIlllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && M.lIIlIIIlllIll(Movement.getRunEnergy(), lIlIlIllIl[39])) {
                    Inventory.getFirst((int[])f.aU).interact(lIlIlIlIll[lIlIlIllIl[24]]);
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllllI(Combat.getMissingHealth(), lIlIlIllIl[40])) {
                    int[] nArray = new int[lIlIlIllIl[1]];
                    nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                    if (M.lIIlIIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlIlIllIl[1]];
                        nArray6[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                        Inventory.getFirst((int[])nArray6).interact(lIlIlIlIll[lIlIlIllIl[26]]);
                        Time.sleepTicks((int)lIlIlIllIl[3]);
                        0;
                    }
                }
                if (M.lIIlIIIlllllI(Movement.getRunEnergy(), lIlIlIllIl[41]) && M.lIIlIIIllllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[42])) {
                    M.cP();
                }
                if ((!M.lIIlIIlIIIIII(e.j(lIlIlIllIl[43]), lIlIlIllIl[44]) || M.lIIlIIIlllIll(e.j(lIlIlIllIl[45]), lIlIlIllIl[2])) && M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[42]) && M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[44])) {
                    M.cQ();
                }
                if (M.lIIlIIlIIIIII(e.j(lIlIlIllIl[43]), lIlIlIllIl[44]) && M.lIIlIIlIIIIII(e.j(lIlIlIllIl[45]), lIlIlIllIl[2])) {
                    if (M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[42]) && M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[37])) {
                        M.cQ();
                    }
                    if (M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[37]) && M.lIIlIIIlllIll(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[44])) {
                        M.cR();
                    }
                }
                if (M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[44])) {
                    M.cS();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cQ() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[1]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[3]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[76], lIlIlIllIl[77], lIlIlIllIl[78], lIlIlIllIl[79], lIlIlIllIl[10]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[80], lIlIlIllIl[81], lIlIlIllIl[69], lIlIlIllIl[64], lIlIlIllIl[0]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[82], lIlIlIllIl[81], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[83], lIlIlIllIl[84], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[10]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[86], lIlIlIllIl[26], lIlIlIllIl[22], lIlIlIllIl[1]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[87], lIlIlIllIl[12], lIlIlIllIl[24], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[88], lIlIlIllIl[89], lIlIlIllIl[75], lIlIlIllIl[40], lIlIlIllIl[10]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[90], lIlIlIllIl[91], lIlIlIllIl[66], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[93], lIlIlIllIl[22], lIlIlIllIl[26], lIlIlIllIl[10]);
        WorldArea worldArea12 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[94], lIlIlIllIl[12], lIlIlIllIl[22], lIlIlIllIl[10]);
        if (M.lIIlIIIllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[95]];
            if (M.lIIlIIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (M.lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIlIllIl[96], lIlIlIllIl[52], lIlIlIllIl[0]));
            0;
            Time.sleepTicks((int)lIlIlIllIl[1]);
            0;
        }
        if (M.lIIlIIlIIIIIl(Players.getLocal().getAnimation(), lIlIlIllIl[62]) && M.lIIlIIIllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIllIl[1]];
            stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[97]];
            TileItem var18 = TileItems.getNearest((String[])stringArray);
            if (M.lIIlIIIllllIl(var18) && M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[98]];
                System.out.println(lIlIlIlIll[lIlIlIllIl[99]]);
                var18.interact(lIlIlIlIll[lIlIlIllIl[100]]);
                Time.sleepTicks((int)lIlIlIllIl[10]);
                0;
            }
            if (M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                void var28;
                void var30;
                void var37;
                void var61;
                void var71;
                void var67;
                void var45;
                void var69;
                int var38;
                void var54;
                if (M.lIIlIIIlllIlI(var54.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[101]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIlIlIllIl[1]];
                    stringArray2[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIlIlIlIll[lIlIlIllIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (3 < 1) {
                                return ((0x31 ^ 0x76) & ~(0x47 ^ 0) & ~((0x17 ^ 0x56) & ~(0xFB ^ 0xBA))) != 0;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var69.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[37]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIlIlIllIl[1]];
                    stringArray3[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIlIlIlIll[lIlIlIllIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (-1 > -1) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[107]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIlIlIllIl[1]];
                    stringArray4[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIlIlIlIll[lIlIlIllIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (3 == 2) {
                                return ((0x3B ^ 0x56 ^ (0x5B ^ 0xA)) & (124 + 33 - 147 + 136 ^ 13 + 153 - 65 + 73 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var67.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[110]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIlIlIllIl[1]];
                    stringArray5[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIlIlIlIll[lIlIlIllIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (2 < -1) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var71.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[113]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIlIlIllIl[1]];
                    stringArray6[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIlIlIlIll[lIlIlIllIl[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (3 < 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var61.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[114]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIlIllIl[1]];
                    nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[115];
                    TileObjects.getNearest((int[])nArray).interact(lIlIlIlIll[lIlIlIllIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if ((0x4D ^ 0x49) <= 3) {
                                return (2 & ~2) != 0;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[117]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIlIllIl[1]];
                    nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[118];
                    TileObjects.getNearest((int[])nArray).interact(lIlIlIlIll[lIlIlIllIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (-1 != -1) {
                                return ((0xB7 ^ 0x9E ^ (0x76 ^ 0x7C)) & (0x7C ^ 0x68 ^ (0x11 ^ 0x26) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[120]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIlIllIl[1]];
                    nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[121];
                    TileObjects.getNearest((int[])nArray).interact(lIlIlIlIll[lIlIlIllIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (1 > 2) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
                if (M.lIIlIIIlllIlI(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[123]];
                    var38 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIlIlIllIl[1]];
                    stringArray7[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIlIlIlIll[lIlIlIllIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                            bl = lIlIlIllIl[1];
                            0;
                            if (-(0xB2 ^ 0xB7) >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIlIlIllIl[0];
                        }
                        return bl;
                    }, (int)lIlIlIllIl[104]);
                    0;
                    Time.sleepTicks((int)lIlIlIllIl[1]);
                    0;
                }
            }
        }
    }

    @Override
    public int ad() {
        try {
            M.cO();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 != -1) {
            return (0x7B ^ 0x77) & ~(0x76 ^ 0x7A);
        }
        return lIlIlIllIl[186];
    }

    private static boolean lIIlIIIllllII(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIlIllII(String var21, String var31) {
        try {
            SecretKeySpec var60 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var31.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIlIllIl[3], var60);
            return new String(var7.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIlIlIll(String var3, String var8) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var44 = new StringBuilder();
        char[] var70 = var8.toCharArray();
        int var55 = lIlIlIllIl[0];
        char[] var64 = var3.toCharArray();
        int var62 = var64.length;
        int var41 = lIlIlIllIl[0];
        while (M.lIIlIIIlllIll(var41, var62)) {
            char var12 = var64[var41];
            var44.append((char)(var12 ^ var70[var55 % var70.length]));
            0;
            ++var55;
            ++var41;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var44);
    }

    private static boolean lIIlIIlIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void O() {
        d var57;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIlIlIllIl[1]];
                        nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[16];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlIlIllIl[16], lIlIlIllIl[1], lIlIlIllIl[195]);
                            bp.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIlIlIllIl[1]];
                        nArray2[M.lIlIlIllIl[0]] = lIlIlIllIl[18];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[18], lIlIlIllIl[3], lIlIlIllIl[196]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray3 = new int[lIlIlIllIl[1]];
                        nArray3[M.lIlIlIllIl[0]] = lIlIlIllIl[27];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[27], lIlIlIllIl[3], lIlIlIllIl[196]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray4 = new int[lIlIlIllIl[1]];
                        nArray4[M.lIlIlIllIl[0]] = lIlIlIllIl[13];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[13], lIlIlIllIl[12], lIlIlIllIl[197]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray5 = new int[lIlIlIllIl[1]];
                        nArray5[M.lIlIlIllIl[0]] = lIlIlIllIl[21];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[21], lIlIlIllIl[12], lIlIlIllIl[198]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray6 = new int[lIlIlIllIl[1]];
                        nArray6[M.lIlIlIllIl[0]] = lIlIlIllIl[15];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[15], lIlIlIllIl[12], lIlIlIllIl[198]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray7 = new int[lIlIlIllIl[1]];
                        nArray7[M.lIlIlIllIl[0]] = lIlIlIllIl[14];
                        if (M.lIIlIIIllllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var57 = new d(lIlIlIllIl[14], lIlIlIllIl[12], lIlIlIllIl[198]);
                            bp.add(var57);
                            0;
                        }
                        int[] nArray8 = new int[lIlIlIllIl[1]];
                        nArray8[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                        if (!M.lIIlIIIlllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIlIlIllIl[1]];
                        nArray9[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                        if (!M.lIIlIIIlllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIlIlIllIl[1]];
                        nArray10[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                        if (!M.lIIlIIIlllIll(Bank.getFirst((int[])nArray10).getQuantity(), lIlIlIllIl[12])) break block16;
                    }
                    var57 = new d(js, lIlIlIllIl[44], lIlIlIllIl[199]);
                    bp.add(var57);
                    0;
                }
                int[] nArray = new int[lIlIlIllIl[1]];
                nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (!M.lIIlIIIlllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIlIlIllIl[1]];
                nArray11[M.lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (!M.lIIlIIIlllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIlIlIllIl[1]];
                nArray12[M.lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (!M.lIIlIIIlllIll(Bank.getFirst((int[])nArray12).getQuantity(), lIlIlIllIl[12])) break block18;
            }
            var57 = new d(lIlIlIllIl[25], lIlIlIllIl[12], lIlIlIllIl[200]);
            bp.add(var57);
            0;
        }
        int[] nArray = new int[lIlIlIllIl[1]];
        nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[201];
        if (M.lIIlIIIllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var57 = new d(lIlIlIllIl[201], lIlIlIllIl[1], lIlIlIllIl[202]);
            bp.add(var57);
            0;
        }
        int[] nArray13 = new int[lIlIlIllIl[1]];
        nArray13[M.lIlIlIllIl[0]] = lIlIlIllIl[19];
        if (M.lIIlIIIllllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var57 = new d(lIlIlIllIl[19], lIlIlIllIl[40], j.bZ);
            bp.add(var57);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void cP() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[47], lIlIlIllIl[12], lIlIlIllIl[20], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[48], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[0]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[50], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[1]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[51], lIlIlIllIl[52], lIlIlIllIl[53], lIlIlIllIl[54], lIlIlIllIl[3]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[55], lIlIlIllIl[56], lIlIlIllIl[24], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[57], lIlIlIllIl[58], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[0]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[59], lIlIlIllIl[60], lIlIlIllIl[12], lIlIlIllIl[20], lIlIlIllIl[0]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[46], lIlIlIllIl[47], lIlIlIllIl[61], lIlIlIllIl[20], lIlIlIllIl[0]);
        if (M.lIIlIIIllllII(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[12]];
            e.b(jx);
            Time.sleepTicks((int)lIlIlIllIl[1]);
            0;
        }
        if ((!M.lIIlIIIllllII(ju.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !M.lIIlIIIllllII(jv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || M.lIIlIIIlllIlI(jw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && M.lIIlIIlIIIIIl(Players.getLocal().getAnimation(), lIlIlIllIl[62]) && M.lIIlIIIllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            void var19;
            void var39;
            void var22;
            void var40;
            void var23;
            void var58;
            void var59;
            if (M.lIIlIIIlllIlI(var59.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[49]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[64]]);
                Time.sleepTicks((int)lIlIlIllIl[3]);
                0;
            }
            if (M.lIIlIIIlllIlI(var58.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[53]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[65]]);
                Time.sleepTicks((int)lIlIlIllIl[3]);
                0;
            }
            if (M.lIIlIIIlllIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[66]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[67]]);
                Time.sleepTicks((int)lIlIlIllIl[3]);
                0;
            }
            if (M.lIIlIIIlllIlI(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[40]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[61]]);
                Time.sleepTicks((int)lIlIlIllIl[2]);
                0;
            }
            if (M.lIIlIIIlllIlI(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[69]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[41]]);
                Time.sleepTicks((int)lIlIlIllIl[17]);
                0;
            }
            if (M.lIIlIIIlllIlI(var39.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[71]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[73]]);
                Time.sleepTicks((int)lIlIlIllIl[10]);
                0;
            }
            if (M.lIIlIIIlllIlI(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[74]];
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[75]]);
                Time.sleepTicks((int)lIlIlIllIl[17]);
                0;
            }
        }
    }

    private static boolean lIIlIIIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIllllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (M.lIIlIIlIIIIII(Skills.getLevel((Skill)Skill.AGILITY), lIlIlIllIl[2])) {
            bl = lIlIlIllIl[1];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            bl = lIlIlIllIl[0];
        }
        return bl;
    }

    @Override
    public String ae() {
        return lIlIlIlIll[lIlIlIllIl[203]];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean cT() {
        WorldArea worldArea = new WorldArea(lIlIlIllIl[80], lIlIlIllIl[81], lIlIlIllIl[69], lIlIlIllIl[64], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[82], lIlIlIllIl[81], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[83], lIlIlIllIl[84], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[10]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[189], lIlIlIllIl[190], lIlIlIllIl[24], lIlIlIllIl[2], lIlIlIllIl[1]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[85], lIlIlIllIl[87], lIlIlIllIl[12], lIlIlIllIl[24], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[191], lIlIlIllIl[192], lIlIlIllIl[73], lIlIlIllIl[38], lIlIlIllIl[10]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[90], lIlIlIllIl[91], lIlIlIllIl[66], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[93], lIlIlIllIl[22], lIlIlIllIl[26], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[92], lIlIlIllIl[94], lIlIlIllIl[12], lIlIlIllIl[22], lIlIlIllIl[10]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[127], lIlIlIllIl[128], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[129], lIlIlIllIl[127], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[3]);
        WorldArea worldArea12 = new WorldArea(lIlIlIllIl[130], lIlIlIllIl[131], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[3]);
        WorldArea worldArea13 = new WorldArea(lIlIlIllIl[132], lIlIlIllIl[133], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea14 = new WorldArea(lIlIlIllIl[134], lIlIlIllIl[9], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea15 = new WorldArea(lIlIlIllIl[135], lIlIlIllIl[136], lIlIlIllIl[68], lIlIlIllIl[53], lIlIlIllIl[10]);
        WorldArea worldArea16 = new WorldArea(lIlIlIllIl[137], lIlIlIllIl[138], lIlIlIllIl[63], lIlIlIllIl[64], lIlIlIllIl[3]);
        WorldArea worldArea17 = new WorldArea(lIlIlIllIl[164], lIlIlIllIl[133], lIlIlIllIl[64], lIlIlIllIl[12], lIlIlIllIl[10]);
        WorldArea worldArea18 = new WorldArea(lIlIlIllIl[165], lIlIlIllIl[139], lIlIlIllIl[38], lIlIlIllIl[53], lIlIlIllIl[3]);
        WorldArea worldArea19 = new WorldArea(lIlIlIllIl[166], lIlIlIllIl[134], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea20 = new WorldArea(lIlIlIllIl[167], lIlIlIllIl[136], lIlIlIllIl[70], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea21 = new WorldArea(lIlIlIllIl[168], lIlIlIllIl[169], lIlIlIllIl[54], lIlIlIllIl[63], lIlIlIllIl[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIlIlIllIl[68]];
        worldAreaArray[M.lIlIlIllIl[0]] = worldArea;
        worldAreaArray[M.lIlIlIllIl[1]] = worldArea2;
        worldAreaArray[M.lIlIlIllIl[3]] = worldArea3;
        worldAreaArray[M.lIlIlIllIl[10]] = worldArea4;
        worldAreaArray[M.lIlIlIllIl[17]] = worldArea5;
        worldAreaArray[M.lIlIlIllIl[2]] = worldArea6;
        worldAreaArray[M.lIlIlIllIl[20]] = worldArea7;
        worldAreaArray[M.lIlIlIllIl[22]] = worldArea8;
        worldAreaArray[M.lIlIlIllIl[24]] = worldArea9;
        worldAreaArray[M.lIlIlIllIl[26]] = worldArea10;
        worldAreaArray[M.lIlIlIllIl[12]] = worldArea11;
        worldAreaArray[M.lIlIlIllIl[49]] = worldArea12;
        worldAreaArray[M.lIlIlIllIl[63]] = worldArea13;
        worldAreaArray[M.lIlIlIllIl[64]] = worldArea14;
        worldAreaArray[M.lIlIlIllIl[53]] = worldArea15;
        worldAreaArray[M.lIlIlIllIl[38]] = worldArea16;
        worldAreaArray[M.lIlIlIllIl[65]] = worldArea17;
        worldAreaArray[M.lIlIlIllIl[66]] = worldArea18;
        worldAreaArray[M.lIlIlIllIl[54]] = worldArea19;
        worldAreaArray[M.lIlIlIllIl[67]] = worldArea20;
        worldAreaArray[M.lIlIlIllIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIlIlIllIl[1]];
        nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[193];
        if (M.lIIlIIIllllIl(TileItems.getNearest((int[])nArray))) {
            void var16;
            System.out.println(lIlIlIlIll[lIlIlIllIl[194]]);
            int var17 = lIlIlIllIl[0];
            while (M.lIIlIIIlllIll(var17, ((void)var16).length)) {
                int[] nArray2 = new int[lIlIlIllIl[1]];
                nArray2[M.lIlIlIllIl[0]] = lIlIlIllIl[193];
                if (M.lIIlIIIlllIlI(var16[var17].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && M.lIIlIIIlllIlI(var16[var17].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIllIl[1];
                }
                ++var17;
                0;
                if (((0xE ^ 0x23 ^ (0x11 ^ 0x27)) & (62 + 1 - -53 + 23 ^ 0 + 116 - 13 + 41 ^ -1)) <= 0) continue;
                return ((0xD1 ^ 0x9F ^ (1 ^ 0x6A)) & (0xAA ^ 0xC4 ^ (0xFF ^ 0xB4) ^ -1)) != 0;
            }
        }
        return lIlIlIllIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void cR() {
        void var25;
        void var68;
        void var5;
        void var33;
        void var11;
        WorldArea worldArea = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[1]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[3]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[125], lIlIlIllIl[126], lIlIlIllIl[112], lIlIlIllIl[107], lIlIlIllIl[10]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[127], lIlIlIllIl[128], lIlIlIllIl[49], lIlIlIllIl[12], lIlIlIllIl[3]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[129], lIlIlIllIl[127], lIlIlIllIl[49], lIlIlIllIl[24], lIlIlIllIl[3]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[130], lIlIlIllIl[131], lIlIlIllIl[63], lIlIlIllIl[49], lIlIlIllIl[3]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[132], lIlIlIllIl[133], lIlIlIllIl[12], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[134], lIlIlIllIl[9], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea10 = new WorldArea(lIlIlIllIl[135], lIlIlIllIl[136], lIlIlIllIl[68], lIlIlIllIl[53], lIlIlIllIl[10]);
        WorldArea worldArea11 = new WorldArea(lIlIlIllIl[137], lIlIlIllIl[138], lIlIlIllIl[63], lIlIlIllIl[64], lIlIlIllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIlIllIl[137], lIlIlIllIl[139], lIlIlIllIl[0]);
        if (M.lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (M.lIIlIIIllllII(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var68.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[140]];
            Movement.walkTo((WorldPoint)var25);
            0;
            Time.sleepTicks((int)lIlIlIllIl[1]);
            0;
        }
        if (M.lIIlIIIlllIlI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (M.lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var25), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[6]];
                Movement.walkTo((WorldPoint)var25);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var25), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[141]];
                int var63 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[143]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var63)) {
                        bl = lIlIlIllIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
        }
        String[] stringArray = new String[lIlIlIllIl[1]];
        stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[144]];
        TileItem var63 = TileItems.getNearest((String[])stringArray);
        if (M.lIIlIIIllllIl(var63) && M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[145]];
            System.out.println(lIlIlIlIll[lIlIlIllIl[146]]);
            var63.interact(lIlIlIlIll[lIlIlIllIl[147]]);
            Time.sleepTicks((int)lIlIlIllIl[10]);
            0;
        }
        if (M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
            void var42;
            void var36;
            void var35;
            void var6;
            void var43;
            void var49;
            int var24;
            TileObject var46;
            void var51;
            if (M.lIIlIIIlllIlI(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[233]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[234], lIlIlIllIl[131], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[148]];
                var46.interact(lIlIlIlIll[lIlIlIllIl[149]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if ((108 + 82 - 51 + 55 ^ 163 + 125 - 112 + 22) <= -1) {
                            return ((0x30 ^ 0xA ^ (0x95 ^ 0xAB)) & (72 + 125 - 192 + 127 ^ 125 + 28 - 126 + 101 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[232]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[131], lIlIlIllIl[225], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (3 <= 2) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[150]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[151]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (3 <= 0) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[230]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[139], lIlIlIllIl[231], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (((85 + 54 - 30 + 44 ^ 63 + 63 - 74 + 92) & (143 + 104 - 109 + 7 ^ 81 + 112 - 52 + 11 ^ -1)) != 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[152]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[153]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (1 > (0xD9 ^ 0x9F ^ (4 ^ 0x46))) {
                            return ((0x52 ^ 0x22 ^ (0x79 ^ 0x41)) & (0x49 ^ 0xC ^ (0xA3 ^ 0xAE) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[227]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[228], lIlIlIllIl[229], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (((15 + 29 - -11 + 101 ^ 83 + 1 - 77 + 147) & (0x54 ^ 0x2A ^ (0xF7 ^ 0x8F) ^ -1)) != ((0x3B ^ 0x17 ^ (0x19 ^ 0x38)) & (86 + 4 - -51 + 18 ^ 7 + 68 - 8 + 79 ^ -1))) {
                        return ((0xB1 ^ 0xC6 ^ (0xCE ^ 0x93)) & (131 + 57 - 74 + 63 ^ 10 + 65 - -8 + 72 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[154]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[155]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (1 == 0) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[226]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[9], lIlIlIllIl[130], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (-1 >= 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[156]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[157]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (1 <= -1) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[224]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[225], lIlIlIllIl[215], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (-(0x56 ^ 0x52) >= 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[158]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[159]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var42.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var46 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[221]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[222], lIlIlIllIl[223], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (((0xCE ^ 0x9A) & ~(0xEC ^ 0xB8)) != 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[160]];
                var24 = Skills.getExperience((Skill)Skill.AGILITY);
                var46.interact(lIlIlIlIll[lIlIlIllIl[161]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var24)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (-1 == 1) {
                            return ((0x13 ^ 0x5A ^ (0xF6 ^ 0x9D)) & (0x41 ^ 4 ^ (0x11 ^ 0x76) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
        }
    }

    private static boolean lIIlIIIllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIIIlllIIl() {
        lIlIlIllIl = new int[239];
        M.lIlIlIllIl[0] = (0x83 ^ 0x9B) & ~(0xB0 ^ 0xA8);
        M.lIlIlIllIl[1] = 1;
        M.lIlIlIllIl[2] = 0xA6 ^ 0xA3;
        M.lIlIlIllIl[3] = 2;
        M.lIlIlIllIl[4] = 0xFFFFFFC7 & 0xDBF;
        M.lIlIlIllIl[5] = 0xFFFFCDA7 & 0x3FDD;
        M.lIlIlIllIl[6] = 0x1A ^ 0x24;
        M.lIlIlIllIl[7] = 38 + 46 - 62 + 107 ^ 120 + 154 - 167 + 71;
        M.lIlIlIllIl[8] = -(0xFFFFF449 & 0x7BBE) & (0xFFFFFFBF & 0x7DFF);
        M.lIlIlIllIl[9] = 0xFFFFEFFE & 0x1D99;
        M.lIlIlIllIl[10] = 3;
        M.lIlIlIllIl[11] = -(0xFFFFB377 & 0x6CED) & (0xFFFFF3ED & 0x3FFE);
        M.lIlIlIllIl[12] = 0x26 ^ 0x2C;
        M.lIlIlIllIl[13] = -(0xFFFFAEF1 & 0x71AF) & (0xFFFFFFF7 & 0x3FEF);
        M.lIlIlIllIl[14] = 0xFFFF9FD8 & 0x7F6F;
        M.lIlIlIllIl[15] = -(0xFFFFF2B5 & 0x2DCF) & (0xFFFFFFEF & 0x3FDD);
        M.lIlIlIllIl[16] = -(0xFFFFFAC3 & 0x35FD) & (0xFFFFBFFF & 0x7FCD);
        M.lIlIlIllIl[17] = 113 + 79 - 173 + 179 ^ 120 + 156 - 199 + 117;
        M.lIlIlIllIl[18] = -(0xFFFF8732 & 0x79CF) & (0xFFFFFFCD & 0x2FFF);
        M.lIlIlIllIl[19] = 0xFFFFBDF9 & 0x7357;
        M.lIlIlIllIl[20] = 0x62 ^ 0x64;
        M.lIlIlIllIl[21] = 0xFFFFDFDF & 0x3F6A;
        M.lIlIlIllIl[22] = 0x80 ^ 0x87;
        M.lIlIlIllIl[23] = 0xFFFF83B1 & 0x7DCF;
        M.lIlIlIllIl[24] = 0x6F ^ 0x67;
        M.lIlIlIllIl[25] = 0xFFFFCCF3 & 0x7FAF;
        M.lIlIlIllIl[26] = 68 + 122 - 115 + 92 ^ 88 + 54 - 57 + 89;
        M.lIlIlIllIl[27] = -(0xFFFFE553 & 0x1BAD) & (0xFFFFDBDB & 0x77BE);
        M.lIlIlIllIl[28] = -(0xFFFFC06E & 0x7FBD) & (0xFFFFEFFF & 0x7E7F);
        M.lIlIlIllIl[29] = 0xFFFFEFDC & 0x3E73;
        M.lIlIlIllIl[30] = 0xFFFFEFDF & 0x3E6E;
        M.lIlIlIllIl[31] = -(0xFFFFFFC3 & 0x51BE) & (0xFFFFFFFF & 0x7FCD);
        M.lIlIlIllIl[32] = 0xFFFFAFFE & 0x7E53;
        M.lIlIlIllIl[33] = 0xFFFFFEDE & 0x2F6B;
        M.lIlIlIllIl[34] = 0xFFFFFFDE & 0x2EE1;
        M.lIlIlIllIl[35] = 0x2A ^ 0x72;
        M.lIlIlIllIl[36] = -(0xFFFFFEF7 & 0x11FD) & (0xFFFFDFFF & Short.MAX_VALUE);
        M.lIlIlIllIl[37] = 5 ^ 0x2D;
        M.lIlIlIllIl[38] = 0x25 ^ 0x2A;
        M.lIlIlIllIl[39] = 0x82 ^ 0xB0;
        M.lIlIlIllIl[40] = 0xD3 ^ 0xC7;
        M.lIlIlIllIl[41] = 148 + 108 - 132 + 30 ^ 71 + 111 - 88 + 37;
        M.lIlIlIllIl[42] = 0x47 ^ 0x59;
        M.lIlIlIllIl[43] = -(0xFFFFAFFF & 0x5ED1) & (0xFFFFBFFF & 0x4FFE);
        M.lIlIlIllIl[44] = 0xB3 ^ 0xAA ^ (0x68 ^ 0x4D);
        M.lIlIlIllIl[45] = -(0xFFFFFB89 & 0x667F) & (0xFFFFE77F & 0x7BBB);
        M.lIlIlIllIl[46] = 0xFFFF9BED & 0x6DB7;
        M.lIlIlIllIl[47] = 0xFFFFBDFB & 0x4F6F;
        M.lIlIlIllIl[48] = -(0xFFFFFB9E & 0x24F9) & (0xFFFFFDF7 & 0x2FFF);
        M.lIlIlIllIl[49] = 0x46 ^ 0x5E ^ (0x60 ^ 0x73);
        M.lIlIlIllIl[50] = 0xFFFF9DFF & 0x6F5D;
        M.lIlIlIllIl[51] = 0xFFFFDDEB & 0x2BB5;
        M.lIlIlIllIl[52] = 0xFFFF8FF7 & 0x7D5F;
        M.lIlIlIllIl[53] = 129 + 117 - 177 + 79 ^ 57 + 136 - 45 + 6;
        M.lIlIlIllIl[54] = 0x47 ^ 0x55;
        M.lIlIlIllIl[55] = 0xFFFFDFBF & 0x29F3;
        M.lIlIlIllIl[56] = 0xFFFFEFDE & 0x1D79;
        M.lIlIlIllIl[57] = 0xFFFFB9F6 & 0x4FBB;
        M.lIlIlIllIl[58] = -(0xFFFFFEF3 & 0x51AF) & (0xFFFFFFFB & 0x5DFF);
        M.lIlIlIllIl[59] = -(0xFFFFFE5D & 0x53E7) & (0xFFFFDFF5 & 0x7BFF);
        M.lIlIlIllIl[60] = 0xFFFFBD63 & 0x4FFF;
        M.lIlIlIllIl[61] = 0x94 ^ 0x82;
        M.lIlIlIllIl[62] = -1;
        M.lIlIlIllIl[63] = 156 + 13 - 153 + 158 ^ 131 + 45 - 75 + 61;
        M.lIlIlIllIl[64] = 0x21 ^ 0x2C;
        M.lIlIlIllIl[65] = 0x51 ^ 0x41;
        M.lIlIlIllIl[66] = 0x31 ^ 0xE ^ (0x13 ^ 0x3D);
        M.lIlIlIllIl[67] = 0x20 ^ 0x33;
        M.lIlIlIllIl[68] = 44 + 57 - -31 + 32 ^ 172 + 83 - 173 + 95;
        M.lIlIlIllIl[69] = 3 ^ 0x52 ^ (0x1B ^ 0x5D);
        M.lIlIlIllIl[70] = 0x95 ^ 0x8D;
        M.lIlIlIllIl[71] = 0xB5 ^ 0xAF;
        M.lIlIlIllIl[72] = 0x2B ^ 0x71 ^ (0x57 ^ 0x16);
        M.lIlIlIllIl[73] = 0xA0 ^ 0xBC;
        M.lIlIlIllIl[74] = 0x57 ^ 0x4A;
        M.lIlIlIllIl[75] = 0x21 ^ 0x3E;
        M.lIlIlIllIl[76] = -(0xFFFFBBEB & 0x5595) & (0xFFFFFFDF & 0x1DFF);
        M.lIlIlIllIl[77] = 0xFFFFED16 & 0x1FFF;
        M.lIlIlIllIl[78] = (0xAB ^ 0xAD) + (0x71 ^ 0xD) - (0x91 ^ 0xC0) + (0x9B ^ 0xC3);
        M.lIlIlIllIl[79] = 0xF8 ^ 0xA6;
        M.lIlIlIllIl[80] = -(0xFFFFF63F & 0x7BC9) & (0xFFFFFE9F & 0x7FFB);
        M.lIlIlIllIl[81] = -(0xFFFFE509 & 0x7AFF) & (0xFFFFEF7B & 0x7DDD);
        M.lIlIlIllIl[82] = -(0xFFFFD87F & 0x77E1) & (0xFFFFFFFE & 0x5CED);
        M.lIlIlIllIl[83] = -(0xFFFFDFE1 & 0x619F) & (0xFFFFFDFF & 0x4FFE);
        M.lIlIlIllIl[84] = 0xFFFFADF5 & 0x5F5E;
        M.lIlIlIllIl[85] = 0xFFFFEE77 & 0x1DFE;
        M.lIlIlIllIl[86] = 0xFFFFBD5D & 0x4FF7;
        M.lIlIlIllIl[87] = -(0xFFFFB93B & 0x76F5) & (0xFFFFBF7D & 0x7DFB);
        M.lIlIlIllIl[88] = -(0xFFFFD7F7 & 0x389D) & (0xFFFF9CFF & Short.MAX_VALUE);
        M.lIlIlIllIl[89] = 0xFFFFDF7E & 0x2DB7;
        M.lIlIlIllIl[90] = -(0xFFFFE30B & 0x3DFD) & (0xFFFFFFF9 & 0x2D9F);
        M.lIlIlIllIl[91] = -(0xFFFFFA9F & 0x17F7) & (0xFFFFBFF7 & 0x5FDE);
        M.lIlIlIllIl[92] = -(0xFFFFD55B & 0x6BFD) & (0xFFFFCFFB & 0x7DFE);
        M.lIlIlIllIl[93] = -(0xFFFF8BFF & 0x7622) & (0xFFFFEF6B & 0x1FFF);
        M.lIlIlIllIl[94] = 0xFFFFCFFE & 0x3D53;
        M.lIlIlIllIl[95] = 0x25 ^ 0x7D ^ (0xF4 ^ 0x8C);
        M.lIlIlIllIl[96] = 0xFFFFBDB9 & 0x4EDE;
        M.lIlIlIllIl[97] = 0x3A ^ 0x47 ^ (0x63 ^ 0x3F);
        M.lIlIlIllIl[98] = 0x70 ^ 0x4A ^ (0x92 ^ 0x8A);
        M.lIlIlIllIl[99] = 0x2D ^ 0xE;
        M.lIlIlIllIl[100] = 140 + 32 - 77 + 90 ^ 25 + 135 - 27 + 24;
        M.lIlIlIllIl[101] = 0xE5 ^ 0xC0;
        M.lIlIlIllIl[102] = 0x50 ^ 0x76;
        M.lIlIlIllIl[103] = 0x55 ^ 0x72;
        M.lIlIlIllIl[104] = -(0xFFFFEDD3 & 0x162F) & (0xFFFFED76 & 0x37BF);
        M.lIlIlIllIl[105] = 0x73 ^ 0x5A;
        M.lIlIlIllIl[106] = 0x96 ^ 0xBC;
        M.lIlIlIllIl[107] = 153 + 32 - 53 + 37 ^ 36 + 84 - 5 + 15;
        M.lIlIlIllIl[108] = 7 ^ 0x10 ^ (0x43 ^ 0x78);
        M.lIlIlIllIl[109] = 0x3C ^ 0x11;
        M.lIlIlIllIl[110] = (6 ^ 0x56) & ~(0x7B ^ 0x2B) ^ (0x7F ^ 0x51);
        M.lIlIlIllIl[111] = 7 ^ 0x28;
        M.lIlIlIllIl[112] = 0x79 ^ 0x35 ^ (0xCC ^ 0xB0);
        M.lIlIlIllIl[113] = 0x23 ^ 0x12;
        M.lIlIlIllIl[114] = 0x74 ^ 0x15 ^ (0x24 ^ 0x71);
        M.lIlIlIllIl[115] = -(0xFFFFD78B & 0x6A7E) & (0xFFFFFFFF & 0x7BFB);
        M.lIlIlIllIl[116] = 0x2F ^ 0x1A;
        M.lIlIlIllIl[117] = 0x13 ^ 0x25;
        M.lIlIlIllIl[118] = -(0xFFFFC26D & 0x7F9B) & (0xFFFFFBFF & 0x7FFB);
        M.lIlIlIllIl[119] = 0x46 ^ 0x54 ^ (0x5C ^ 0x79);
        M.lIlIlIllIl[120] = 65 + 40 - 71 + 136 ^ 128 + 9 - 63 + 72;
        M.lIlIlIllIl[121] = 0xFFFFFBF4 & 0x3DFF;
        M.lIlIlIllIl[122] = 0x4A ^ 0x73;
        M.lIlIlIllIl[123] = 109 + 153 - 217 + 120 ^ 139 + 16 - 79 + 83;
        M.lIlIlIllIl[124] = 0x57 ^ 0x6C;
        M.lIlIlIllIl[125] = 0xFFFFBFBF & 0x4DCF;
        M.lIlIlIllIl[126] = 0xFFFF9FDB & 0x6DAE;
        M.lIlIlIllIl[127] = 0xFFFFBFBE & 0x4DEF;
        M.lIlIlIllIl[128] = -(0xFFFF9EDF & 0x733D) & (0xFFFFFFFF & 0x1FBE);
        M.lIlIlIllIl[129] = 0xFFFFFFBF & 0xDE7;
        M.lIlIlIllIl[130] = 0xFFFFBFDF & 0x4DBB;
        M.lIlIlIllIl[131] = 0xFFFFEFFB & 0x1DAD;
        M.lIlIlIllIl[132] = 0xFFFFBF98 & 0x4DF7;
        M.lIlIlIllIl[133] = 0xFFFFFDA1 & 0xFFF;
        M.lIlIlIllIl[134] = -(0xFFFFD047 & 0x3FFD) & (0xFFFF9FD7 & 0x7DFF);
        M.lIlIlIllIl[135] = 0xFFFFDD9D & 0x2FFF;
        M.lIlIlIllIl[136] = -(0xFFFF976D & 0x7AB3) & (0xFFFFFFFB & 0x1FAF);
        M.lIlIlIllIl[137] = 0xFFFFEDBF & 0x1FF2;
        M.lIlIlIllIl[138] = 0xFFFFAFD1 & 0x5DBF;
        M.lIlIlIllIl[139] = -(0xFFFF91F3 & 0x7E4E) & (0xFFFF9FFF & 0x7DDF);
        M.lIlIlIllIl[140] = 0x42 ^ 0x7F;
        M.lIlIlIllIl[141] = 0x74 ^ 0x4B;
        M.lIlIlIllIl[142] = 0x34 ^ 0x48 ^ (0x5C ^ 0x60);
        M.lIlIlIllIl[143] = 0x23 ^ 0x62;
        M.lIlIlIllIl[144] = 0x34 ^ 0x2F ^ (0x72 ^ 0x2B);
        M.lIlIlIllIl[145] = 0xF8 ^ 0x9E ^ (0xE0 ^ 0xC5);
        M.lIlIlIllIl[146] = 0x58 ^ 0x1C;
        M.lIlIlIllIl[147] = 155 + 79 - 44 + 53 ^ 109 + 138 - 195 + 130;
        M.lIlIlIllIl[148] = 0x82 ^ 0xC4;
        M.lIlIlIllIl[149] = 0x26 ^ 0x61;
        M.lIlIlIllIl[150] = 0xF5 ^ 0xBD;
        M.lIlIlIllIl[151] = 0x20 ^ 0x69;
        M.lIlIlIllIl[152] = 0x23 ^ 0x69;
        M.lIlIlIllIl[153] = 34 + 106 - 17 + 20 ^ 69 + 104 - 115 + 138;
        M.lIlIlIllIl[154] = 0xC0 ^ 0x8C;
        M.lIlIlIllIl[155] = 0x5A ^ 0x17;
        M.lIlIlIllIl[156] = 0xCA ^ 0x84;
        M.lIlIlIllIl[157] = 0xF2 ^ 0xBD;
        M.lIlIlIllIl[158] = 0x33 ^ 0x56 ^ (0xB6 ^ 0x83);
        M.lIlIlIllIl[159] = 184 + 180 - 325 + 156 ^ 137 + 80 - 195 + 124;
        M.lIlIlIllIl[160] = 7 + 36 - -118 + 67 ^ 11 + 29 - -16 + 126;
        M.lIlIlIllIl[161] = 0xB ^ 0x5C ^ (0x9B ^ 0x9F);
        M.lIlIlIllIl[162] = -(0xFFFFFD27 & 0x33D9) & (0xFFFFBF7F & 0x7BFF);
        M.lIlIlIllIl[163] = -(0xFFFFF2FF & 0x6F82) & (0xFFFFFFFF & 0x6FFF);
        M.lIlIlIllIl[164] = -(0xFFFFD47D & 0x6FE3) & (0xFFFFDEFF & 0x6FFF);
        M.lIlIlIllIl[165] = -(0xFFFFD435 & 0x7BFB) & (0xFFFFDEBF & 0x7BFD);
        M.lIlIlIllIl[166] = 0xFFFF8EDB & 0x7BB7;
        M.lIlIlIllIl[167] = -(0xFFFFF17B & 0x4FF5) & (0xFFFFFBF9 & 0x4FFF);
        M.lIlIlIllIl[168] = -(0xFFFFDFD1 & 0x213F) & (0xFFFFEF99 & 0x1BF6);
        M.lIlIlIllIl[169] = -(0xFFFFF53D & 0x7ADB) & (0xFFFFFDFF & 0x7F99);
        M.lIlIlIllIl[170] = -(0xFFFFFDF3 & 0x335D) & (0xFFFFBFF9 & 0x7BFF);
        M.lIlIlIllIl[171] = -(0xFFFF8A5F & 0x77B4) & (0xFFFFDFB7 & 0x2FFB);
        M.lIlIlIllIl[172] = 0x4B ^ 0x57 ^ (0x36 ^ 0x7E);
        M.lIlIlIllIl[173] = 0x5E ^ 0xB;
        M.lIlIlIllIl[174] = 0x1F ^ 0x7C ^ (0x38 ^ 0xD);
        M.lIlIlIllIl[175] = 0x7E ^ 0x5F ^ (3 ^ 0x75);
        M.lIlIlIllIl[176] = 0x6A ^ 0x78 ^ (0x7C ^ 0x37);
        M.lIlIlIllIl[177] = 0xDC ^ 0x86;
        M.lIlIlIllIl[178] = 27 + 44 - -39 + 44 ^ 71 + 148 - 139 + 113;
        M.lIlIlIllIl[179] = 0x4D ^ 0x11;
        M.lIlIlIllIl[180] = 0xCF ^ 0x8E ^ (0x80 ^ 0x9C);
        M.lIlIlIllIl[181] = 209 + 60 - 43 + 2 ^ 45 + 67 - 55 + 130;
        M.lIlIlIllIl[182] = 0x16 ^ 0x46 ^ (0x54 ^ 0x64);
        M.lIlIlIllIl[183] = 0x4A ^ 0x2B;
        M.lIlIlIllIl[184] = 0xE5 ^ 0x87;
        M.lIlIlIllIl[185] = 0x45 ^ 0x26;
        M.lIlIlIllIl[186] = 165 + 149 - 302 + 189 ^ 3 + 36 - -16 + 118;
        M.lIlIlIllIl[187] = 0xBE ^ 0x96 ^ (0x21 ^ 0x6C);
        M.lIlIlIllIl[188] = 160 + 130 - 126 + 36 ^ 157 + 148 - 283 + 152;
        M.lIlIlIllIl[189] = 0xFFFF8F7F & 0x7CF7;
        M.lIlIlIllIl[190] = -(0xFFFFD16B & 0x6EB6) & (0xFFFFCD77 & Short.MAX_VALUE);
        M.lIlIlIllIl[191] = 0xFFFFDD7F & 0x2EEE;
        M.lIlIlIllIl[192] = 0xFFFFFD7B & 0xFBF;
        M.lIlIlIllIl[193] = 0xFFFFFE7D & 0x2FCB;
        M.lIlIlIllIl[194] = 0xA8 ^ 0xBB ^ (1 ^ 0x75);
        M.lIlIlIllIl[195] = -(0xFFFFFBF6 & 0x260D) & (0xFFFFBF7F & 0x77FF);
        M.lIlIlIllIl[196] = 0xFFFFF3F9 & 0x6DAE;
        M.lIlIlIllIl[197] = -(0xFFFFDDCC & 0x7E3F) & (0xFFFFDF8F & Short.MAX_VALUE);
        M.lIlIlIllIl[198] = -(0xFFFFD8F7 & 0x7F0A) & (0xFFFFFBF7 & 0x5FBF);
        M.lIlIlIllIl[199] = 0xFFFFA7FF & 0x5F9E;
        M.lIlIlIllIl[200] = -(0xFFFFDEFB & 0x7D0D) & (0xFFFFFFFF & 0x7EFE);
        M.lIlIlIllIl[201] = 0xFFFFFEEE & 0x2FDB;
        M.lIlIlIllIl[202] = 0xFFFFE77E & 0x7DDF;
        M.lIlIlIllIl[203] = 0x32 ^ 4 ^ (0x1E ^ 0x40);
        M.lIlIlIllIl[204] = 103 + 109 - 121 + 128 ^ 173 + 131 - 196 + 70;
        M.lIlIlIllIl[205] = 0x62 ^ 0x20 ^ (0xB3 ^ 0x9B);
        M.lIlIlIllIl[206] = 0x1C ^ 0x77;
        M.lIlIlIllIl[207] = 0xD7 ^ 0xBB;
        M.lIlIlIllIl[208] = 54 + 101 - 124 + 198 ^ 5 + 41 - -21 + 69;
        M.lIlIlIllIl[209] = 0xFFFF9EAF & 0x6BDF;
        M.lIlIlIllIl[210] = 0xFFFFDFAB & 0x2DDD;
        M.lIlIlIllIl[211] = 0xD1 ^ 0x93 ^ (0xA7 ^ 0x8B);
        M.lIlIlIllIl[212] = -(0xFFFFF163 & 0x7EDF) & (0xFFFFFFDF & 0x7DEF);
        M.lIlIlIllIl[213] = 0x14 ^ 0x61 ^ (0x55 ^ 0x4F);
        M.lIlIlIllIl[214] = -(0xFFFFFBBB & 0x156D) & (0xFFFFFFBF & 0x1BFF);
        M.lIlIlIllIl[215] = 0xFFFFBF9E & 0x4DF5;
        M.lIlIlIllIl[216] = 0x5B ^ 0x2B;
        M.lIlIlIllIl[217] = 0xFFFFAADF & 0x5FB6;
        M.lIlIlIllIl[218] = 0x28 ^ 0x59;
        M.lIlIlIllIl[219] = 0xFFFF8EA3 & 0x7BFD;
        M.lIlIlIllIl[220] = 0xFFFFCDFF & 0x3FA5;
        M.lIlIlIllIl[221] = 0x8B ^ 0x84 ^ (0xF1 ^ 0x8C);
        M.lIlIlIllIl[222] = -(0xFFFFF2FE & 0x2D4B) & (0xFFFFFFFF & 0x2DFF);
        M.lIlIlIllIl[223] = -(0xFFFFF87C & 0x27A7) & (0xFFFFBFFF & 0x6DBF);
        M.lIlIlIllIl[224] = 156 + 159 - 141 + 39 ^ 114 + 125 - 191 + 118;
        M.lIlIlIllIl[225] = 0xFFFFCFBF & 0x3DEF;
        M.lIlIlIllIl[226] = 39 + 45 - -66 + 69 ^ 69 + 116 - 139 + 129;
        M.lIlIlIllIl[227] = 0xCA ^ 0xBF;
        M.lIlIlIllIl[228] = 0xFFFFBDF6 & 0x4F9F;
        M.lIlIlIllIl[229] = 0xFFFF8FA6 & 0x7DFD;
        M.lIlIlIllIl[230] = 0xA ^ 7 ^ (0x3C ^ 0x47);
        M.lIlIlIllIl[231] = 0xFFFFCDBF & 0x3FEB;
        M.lIlIlIllIl[232] = 0x63 ^ 0x14;
        M.lIlIlIllIl[233] = 0x28 ^ 0x50;
        M.lIlIlIllIl[234] = -(0xFFFFF84F & 0x77F5) & (0xFFFFFFF5 & 0x7DFF);
        M.lIlIlIllIl[235] = 0xFFFF9DF4 & 0x6BAF;
        M.lIlIlIllIl[236] = 0xFFFFEDAF & 0x1BFA;
        M.lIlIlIllIl[237] = 0xFFFFCF7F & 0x3DED;
        M.lIlIlIllIl[238] = 0x5F ^ 0x40 ^ (0xFA ^ 0x9C);
    }

    /*
     * WARNING - void declaration
     */
    private static void cS() {
        void var47;
        void var1;
        void var14;
        void var4;
        void var48;
        WorldArea worldArea = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[0]);
        WorldArea worldArea2 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[1]);
        WorldArea worldArea3 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[3]);
        WorldArea worldArea4 = new WorldArea(lIlIlIllIl[162], lIlIlIllIl[163], lIlIlIllIl[111], lIlIlIllIl[111], lIlIlIllIl[10]);
        WorldArea worldArea5 = new WorldArea(lIlIlIllIl[164], lIlIlIllIl[133], lIlIlIllIl[64], lIlIlIllIl[12], lIlIlIllIl[10]);
        WorldArea worldArea6 = new WorldArea(lIlIlIllIl[165], lIlIlIllIl[139], lIlIlIllIl[38], lIlIlIllIl[53], lIlIlIllIl[3]);
        WorldArea worldArea7 = new WorldArea(lIlIlIllIl[166], lIlIlIllIl[134], lIlIlIllIl[49], lIlIlIllIl[26], lIlIlIllIl[3]);
        WorldArea worldArea8 = new WorldArea(lIlIlIllIl[167], lIlIlIllIl[136], lIlIlIllIl[70], lIlIlIllIl[64], lIlIlIllIl[10]);
        WorldArea worldArea9 = new WorldArea(lIlIlIllIl[168], lIlIlIllIl[169], lIlIlIllIl[54], lIlIlIllIl[63], lIlIlIllIl[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIlIllIl[170], lIlIlIllIl[171], lIlIlIllIl[0]);
        if (M.lIIlIIIlllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (M.lIIlIIIllllII(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllII(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[172]];
            Movement.walkTo((WorldPoint)var47);
            0;
            Time.sleepTicks((int)lIlIlIllIl[1]);
            0;
        }
        if (M.lIIlIIIlllIlI(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (M.lIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var47), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[173]];
                Movement.walkTo((WorldPoint)var47);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var47), lIlIlIllIl[20])) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[174]];
                int var50 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlIlIllIl[1]];
                stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIlIlIll[lIlIlIllIl[35]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var50)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (2 > 2) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
        }
        String[] stringArray = new String[lIlIlIllIl[1]];
        stringArray[M.lIlIlIllIl[0]] = lIlIlIlIll[lIlIlIllIl[176]];
        TileItem var50 = TileItems.getNearest((String[])stringArray);
        if (M.lIIlIIIllllIl(var50) && M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[177]];
            System.out.println(lIlIlIlIll[lIlIlIllIl[178]]);
            var50.interact(lIlIlIlIll[lIlIlIllIl[179]]);
            Time.sleepTicks((int)lIlIlIllIl[10]);
            0;
        }
        if (M.lIIlIIIllllII(M.cT() ? 1 : 0)) {
            void var65;
            void var2;
            void var52;
            void var20;
            int var15;
            TileObject var34;
            void var27;
            if (M.lIIlIIIlllIlI(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[218]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[219], lIlIlIllIl[220], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                var15 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[180]];
                var34.interact(lIlIlIlIll[lIlIlIllIl[79]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var15)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (((0xA5 ^ 0x89) & ~(0x9E ^ 0xB2)) < 0) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[216]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[217], lIlIlIllIl[128], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (-1 >= ((6 + 86 - 0 + 135 ^ 56 + 33 - 10 + 82) & (0xA5 ^ 0xB9 ^ (0x7F ^ 0x21) ^ -1))) {
                        return ((0x34 ^ 0x26 ^ (0xBF ^ 0x8C)) & (0x2F ^ 0x65 ^ (0x29 ^ 0x42) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[181]];
                var15 = Skills.getExperience((Skill)Skill.AGILITY);
                var34.interact(lIlIlIlIll[lIlIlIllIl[182]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var15)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (-2 > 0) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[213]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[214], lIlIlIllIl[215], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[183]];
                var15 = Skills.getExperience((Skill)Skill.AGILITY);
                var34.interact(lIlIlIlIll[lIlIlIllIl[184]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var15)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (-(0xC2 ^ 0x9C ^ (0xD6 ^ 0x8C)) > 0) {
                            return ((0x7F ^ 0x76 ^ (0xAA ^ 0x96)) & (0x2D ^ 0x60 ^ (0xDA ^ 0xA2) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[211]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[209], lIlIlIllIl[212], lIlIlIllIl[10])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (-(0xB1 ^ 0xA5 ^ (0x5E ^ 0x4E)) >= 0) {
                        return false;
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[185]];
                var15 = Skills.getExperience((Skill)Skill.AGILITY);
                var34.interact(lIlIlIlIll[lIlIlIllIl[186]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var15)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (-1 == (0x84 ^ 0x80)) {
                            return false;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
            if (M.lIIlIIIlllIlI(M.cT() ? 1 : 0)) {
                return;
            }
            if (M.lIIlIIIlllIlI(var65.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && M.lIIlIIIllllIl(var34 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (M.lIIlIIIlllIlI(tileObject.getName().contains(lIlIlIlIll[lIlIlIllIl[208]]) ? 1 : 0) && M.lIIlIIlIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIlIllIl[209], lIlIlIllIl[210], lIlIlIllIl[3])), lIlIlIllIl[3])) {
                    n2 = lIlIlIllIl[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIlIllIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderShamans.c = lIlIlIlIll[lIlIlIllIl[187]];
                var15 = Skills.getExperience((Skill)Skill.AGILITY);
                var34.interact(lIlIlIlIll[lIlIlIllIl[188]]);
                Time.sleepTicks((int)e.c(lIlIlIllIl[1], lIlIlIllIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (M.lIIlIIIlllllI(Skills.getExperience((Skill)Skill.AGILITY), var15)) {
                        bl = lIlIlIllIl[1];
                        0;
                        if (-1 > 0) {
                            return ((0x6F ^ 0x65 ^ (0x33 ^ 0x67)) & (0xB ^ 0x15 ^ (0xEE ^ 0xAE) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIlIlIllIl[0];
                    }
                    return bl;
                }, (int)lIlIlIllIl[104]);
                0;
                Time.sleepTicks((int)lIlIlIllIl[1]);
                0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        if (M.lIIlIIlIIIIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIlIlIllIl[37])) {
            int n3;
            int[] nArray = new int[lIlIlIllIl[1]];
            nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[13];
            if (M.lIIlIIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIlIllIl[1]];
                nArray2[M.lIlIlIllIl[0]] = lIlIlIllIl[25];
                if (M.lIIlIIIlllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIlIllIl[1]];
                    nArray3[M.lIlIlIllIl[0]] = lIlIlIllIl[23];
                    if (!(!M.lIIlIIIlllIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || M.lIIlIIIllllII(Inventory.contains(item -> item.getName().contains(lIlIlIlIll[lIlIlIllIl[207]])) ? 1 : 0) && !M.lIIlIIIlllIlI(Equipment.contains(item -> item.getName().contains(lIlIlIlIll[lIlIlIllIl[206]])) ? 1 : 0) || M.lIIlIIIllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !M.lIIlIIIlllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = lIlIlIllIl[1];
                        0;
                        if (3 <= 3) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = lIlIlIllIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIlIlIllIl[1]];
        nArray[M.lIlIlIllIl[0]] = lIlIlIllIl[13];
        if (M.lIIlIIIlllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIlIlIllIl[1]];
            nArray4[M.lIlIlIllIl[0]] = lIlIlIllIl[15];
            if (M.lIIlIIIlllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIlIlIllIl[1]];
                nArray5[M.lIlIlIllIl[0]] = lIlIlIllIl[14];
                if (!(!M.lIIlIIIlllIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || M.lIIlIIIllllII(Inventory.contains(item -> item.getName().contains(lIlIlIlIll[lIlIlIllIl[205]])) ? 1 : 0) && !M.lIIlIIIlllIlI(Equipment.contains(item -> item.getName().contains(lIlIlIlIll[lIlIlIllIl[204]])) ? 1 : 0) || M.lIIlIIIllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !M.lIIlIIIlllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = lIlIlIllIl[1];
                    0;
                    if (-2 <= 0) return n2 != 0;
                    return ((0xB3 ^ 0x84 ^ (0x1D ^ 0x27)) & (0xD3 ^ 0x90 ^ (0x18 ^ 0x56) ^ -1)) != 0;
                }
            }
        }
        n2 = lIlIlIllIl[0];
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        return lIlIlIllIl[0];
    }

    private static void lIIlIIIlllIII() {
        lIlIlIlIll = new String[lIlIlIllIl[238]];
        M.lIlIlIlIll[M.lIlIlIllIl[0]] = M."Buying items";
        M.lIlIlIlIll[M.lIlIlIllIl[1]] = M."Finished buying items, switching back to agility";
        M.lIlIlIlIll[M.lIlIlIllIl[3]] = M."Navigating to bank";
        M.lIlIlIlIll[M.lIlIlIllIl[10]] = M."Handling banking";
        M.lIlIlIlIll[M.lIlIlIllIl[17]] = M."We are missing quest supplies, switching to BUYING";
        M.lIlIlIlIll[M.lIlIlIllIl[2]] = M."Vial";
        M.lIlIlIlIll[M.lIlIlIllIl[20]] = M."Vial";
        M.lIlIlIlIll[M.lIlIlIllIl[22]] = M."Drop";
        M.lIlIlIlIll[M.lIlIlIllIl[24]] = M."Drink";
        M.lIlIlIlIll[M.lIlIlIllIl[26]] = M."Eat";
        M.lIlIlIlIll[M.lIlIlIllIl[12]] = M."Nav to gnome course";
        M.lIlIlIlIll[M.lIlIlIllIl[49]] = M."Crossing log";
        M.lIlIlIlIll[M.lIlIlIllIl[63]] = M."Log balance";
        M.lIlIlIlIll[M.lIlIlIllIl[64]] = M."Walk-across";
        M.lIlIlIlIll[M.lIlIlIllIl[53]] = M."Climbing net";
        M.lIlIlIlIll[M.lIlIlIllIl[38]] = M."Obstacle net";
        M.lIlIlIlIll[M.lIlIlIllIl[65]] = M."Climb-over";
        M.lIlIlIlIll[M.lIlIlIllIl[66]] = M."Climbing branch";
        M.lIlIlIlIll[M.lIlIlIllIl[54]] = M."Tree branch";
        M.lIlIlIlIll[M.lIlIlIllIl[67]] = M."Climb";
        M.lIlIlIlIll[M.lIlIlIllIl[40]] = M."Crossing rope";
        M.lIlIlIlIll[M.lIlIlIllIl[68]] = M."Balancing rope";
        M.lIlIlIlIll[M.lIlIlIllIl[61]] = M."Walk-on";
        M.lIlIlIlIll[M.lIlIlIllIl[69]] = M."Climbing down";
        M.lIlIlIlIll[M.lIlIlIllIl[70]] = M."Tree branch";
        M.lIlIlIlIll[M.lIlIlIllIl[41]] = M."Climb-down";
        M.lIlIlIlIll[M.lIlIlIllIl[71]] = M."Climbing net";
        M.lIlIlIlIll[M.lIlIlIllIl[72]] = M."Obstacle net";
        M.lIlIlIlIll[M.lIlIlIllIl[73]] = M."Climb-over";
        M.lIlIlIlIll[M.lIlIlIllIl[74]] = M."Crossing pipe";
        M.lIlIlIlIll[M.lIlIlIllIl[42]] = M."Obstacle pipe";
        M.lIlIlIlIll[M.lIlIlIllIl[75]] = M."Squeeze-through";
        M.lIlIlIlIll[M.lIlIlIllIl[95]] = M."Nav to start";
        M.lIlIlIlIll[M.lIlIlIllIl[97]] = M."Mark of grace";
        M.lIlIlIlIll[M.lIlIlIllIl[98]] = M."Taking mark";
        M.lIlIlIlIll[M.lIlIlIllIl[99]] = M."Found mark on ground";
        M.lIlIlIlIll[M.lIlIlIllIl[100]] = M."Take";
        M.lIlIlIlIll[M.lIlIlIllIl[101]] = M."Starting course";
        M.lIlIlIlIll[M.lIlIlIllIl[102]] = M."Rough wall";
        M.lIlIlIlIll[M.lIlIlIllIl[103]] = M."Climb";
        M.lIlIlIlIll[M.lIlIlIllIl[37]] = M."Crossing clothes line";
        M.lIlIlIlIll[M.lIlIlIllIl[105]] = M."Clothes line";
        M.lIlIlIlIll[M.lIlIlIllIl[106]] = M."Cross";
        M.lIlIlIlIll[M.lIlIlIllIl[107]] = M."Leaping";
        M.lIlIlIlIll[M.lIlIlIllIl[108]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[109]] = M."Leap";
        M.lIlIlIlIll[M.lIlIlIllIl[110]] = M."Balancing";
        M.lIlIlIlIll[M.lIlIlIllIl[111]] = M."Wall";
        M.lIlIlIlIll[M.lIlIlIllIl[112]] = M."Balance";
        M.lIlIlIlIll[M.lIlIlIllIl[113]] = M."Jumping gap";
        M.lIlIlIlIll[M.lIlIlIllIl[39]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[7]] = M."Leap";
        M.lIlIlIlIll[M.lIlIlIllIl[114]] = M."Jumping gap 2";
        M.lIlIlIlIll[M.lIlIlIllIl[116]] = M."Leap";
        M.lIlIlIlIll[M.lIlIlIllIl[117]] = M."Jumping gap 3";
        M.lIlIlIlIll[M.lIlIlIllIl[119]] = M."Leap";
        M.lIlIlIlIll[M.lIlIlIllIl[120]] = M."Hurdle roof";
        M.lIlIlIlIll[M.lIlIlIllIl[122]] = M."Hurdle";
        M.lIlIlIlIll[M.lIlIlIllIl[123]] = M."Finishing course";
        M.lIlIlIlIll[M.lIlIlIllIl[124]] = M."Edge";
        M.lIlIlIlIll[M.lIlIlIllIl[44]] = M."Jump-off";
        M.lIlIlIlIll[M.lIlIlIllIl[140]] = M."Nav to canafis course";
        M.lIlIlIlIll[M.lIlIlIllIl[6]] = M."Nav to start";
        M.lIlIlIlIll[M.lIlIlIllIl[141]] = M."Starting course";
        M.lIlIlIlIll[M.lIlIlIllIl[142]] = M."Tall tree";
        M.lIlIlIlIll[M.lIlIlIllIl[143]] = M."Climb";
        M.lIlIlIlIll[M.lIlIlIllIl[144]] = M."Mark of grace";
        M.lIlIlIlIll[M.lIlIlIllIl[145]] = M."Taking mark";
        M.lIlIlIlIll[M.lIlIlIllIl[146]] = M."Found mark on ground";
        M.lIlIlIlIll[M.lIlIlIllIl[147]] = M."Take";
        M.lIlIlIlIll[M.lIlIlIllIl[148]] = M."Jumping gap 1";
        M.lIlIlIlIll[M.lIlIlIllIl[149]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[150]] = M."Jumping gap 2";
        M.lIlIlIlIll[M.lIlIlIllIl[151]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[152]] = M."Jumping gap 3";
        M.lIlIlIlIll[M.lIlIlIllIl[153]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[154]] = M."Jumping gap 4";
        M.lIlIlIlIll[M.lIlIlIllIl[155]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[156]] = M."Vaulting";
        M.lIlIlIlIll[M.lIlIlIllIl[157]] = M."Vault";
        M.lIlIlIlIll[M.lIlIlIllIl[158]] = M."Jumping gap 5";
        M.lIlIlIlIll[M.lIlIlIllIl[159]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[160]] = M."Jumping gap 6";
        M.lIlIlIlIll[M.lIlIlIllIl[161]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[172]] = M."Nav to canafis course";
        M.lIlIlIlIll[M.lIlIlIllIl[173]] = M."Nav to start";
        M.lIlIlIlIll[M.lIlIlIllIl[174]] = M."Starting course";
        M.lIlIlIlIll[M.lIlIlIllIl[175]] = M."Wall";
        M.lIlIlIlIll[M.lIlIlIllIl[35]] = M."Climb-up";
        M.lIlIlIlIll[M.lIlIlIllIl[176]] = M."Mark of grace";
        M.lIlIlIlIll[M.lIlIlIllIl[177]] = M."Taking mark";
        M.lIlIlIlIll[M.lIlIlIllIl[178]] = M."Found mark on ground";
        M.lIlIlIlIll[M.lIlIlIllIl[179]] = M."Take";
        M.lIlIlIlIll[M.lIlIlIllIl[180]] = M."Jumping gap 1";
        M.lIlIlIlIll[M.lIlIlIllIl[79]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[181]] = M."cross rope";
        M.lIlIlIlIll[M.lIlIlIllIl[182]] = M."Cross";
        M.lIlIlIlIll[M.lIlIlIllIl[183]] = M."Jumping gap 3";
        M.lIlIlIlIll[M.lIlIlIllIl[184]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[185]] = M."Jumping gap 4";
        M.lIlIlIlIll[M.lIlIlIllIl[186]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[187]] = M."Jumping Edge";
        M.lIlIlIlIll[M.lIlIlIllIl[188]] = M."Jump";
        M.lIlIlIlIll[M.lIlIlIllIl[194]] = M."Found mark on ground";
        M.lIlIlIlIll[M.lIlIlIllIl[203]] = M."Agility";
        M.lIlIlIlIll[M.lIlIlIllIl[204]] = M."passage";
        M.lIlIlIlIll[M.lIlIlIllIl[205]] = M."passage";
        M.lIlIlIlIll[M.lIlIlIllIl[206]] = M."passage";
        M.lIlIlIlIll[M.lIlIlIllIl[207]] = M."passage";
        M.lIlIlIlIll[M.lIlIlIllIl[208]] = M."Edge";
        M.lIlIlIlIll[M.lIlIlIllIl[211]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[213]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[216]] = M."Tightrope";
        M.lIlIlIlIll[M.lIlIlIllIl[218]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[221]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[224]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[226]] = M."Pole-vault";
        M.lIlIlIlIll[M.lIlIlIllIl[227]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[230]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[232]] = M."Gap";
        M.lIlIlIlIll[M.lIlIlIllIl[233]] = M."Gap";
    }

    private static String lIIlIIIlIlIlI(String var29, String var13) {
        try {
            SecretKeySpec var56 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIlIllIl[24]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIllIl[3], var56);
            return new String(var10.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        M.lIIlIIIlllIIl();
        M.lIIlIIIlllIII();
        bp = new ArrayList<d>();
        jr = lIlIlIllIl[27];
        js = lIlIlIllIl[23];
        ju = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[0]);
        jv = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[1]);
        jw = new WorldArea(lIlIlIllIl[235], lIlIlIllIl[52], lIlIlIllIl[69], lIlIlIllIl[72], lIlIlIllIl[3]);
        jx = new WorldPoint(lIlIlIllIl[236], lIlIlIllIl[237], lIlIlIllIl[0]);
    }
}

