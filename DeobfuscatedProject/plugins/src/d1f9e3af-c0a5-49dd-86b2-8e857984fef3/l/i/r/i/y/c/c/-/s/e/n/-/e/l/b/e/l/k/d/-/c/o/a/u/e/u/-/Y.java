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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class Y
implements W {
    public static /* synthetic */ int ky;
    static /* synthetic */ WorldArea kB;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int kx;
    private static /* synthetic */ String[] lIlIIIlIl;
    private static /* synthetic */ int[] lIlIIlIII;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldArea kC;
    static /* synthetic */ WorldArea kA;
    public static /* synthetic */ int kz;
    private static /* synthetic */ WorldPoint kD;

    private static boolean lIIIlIlIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[2])) {
            bl = lIlIIlIII[1];
            "".length();
            if ((0x51 ^ 0x6B ^ (0xBA ^ 0x84)) < ((0x7F ^ 0x51 ^ (0x7E ^ 0x30)) & (162 + 88 - 82 + 72 ^ 21 + 6 - -90 + 27 ^ -" ".length()))) {
                return ((0x31 ^ 0x2A ^ (3 ^ 0x2F)) & (55 + 150 - 147 + 107 ^ 115 + 82 - 143 + 92 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIIlIII[0];
        }
        return bl;
    }

    private static boolean lIIIlIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIlIIIIlll(String lllIlllllIIlII, String lllIlllllIIIll) {
        lllIlllllIIlII = new String(Base64.getDecoder().decode(lllIlllllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllllIIlll = new StringBuilder();
        char[] lllIlllllIIllI = lllIlllllIIIll.toCharArray();
        int lllIlllllIIlIl = lIlIIlIII[0];
        char[] lllIllllIlllll = lllIlllllIIlII.toCharArray();
        int lllIllllIllllI = lllIllllIlllll.length;
        int lllIllllIlllIl = lIlIIlIII[0];
        while (Y.lIIIlIlIIIIl(lllIllllIlllIl, lllIllllIllllI)) {
            char lllIlllllIlIlI = lllIllllIlllll[lllIllllIlllIl];
            lllIlllllIIlll.append((char)(lllIlllllIlIlI ^ lllIlllllIIllI[lllIlllllIIlIl % lllIlllllIIllI.length]));
            "".length();
            ++lllIlllllIIlIl;
            ++lllIllllIlllIl;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllIlllllIIlll);
    }

    private static boolean lIIIlIlIIIII(int n2) {
        return n2 != 0;
    }

    public static void dg() {
        if (Y.lIIIlIlIIIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[0]];
            b.a(bv);
            if (Y.lIIIlIlIIIIl(bv.size(), lIlIIlIII[1])) {
                System.out.println(lIlIIIlIl[lIlIIlIII[1]]);
                bt = lIlIIlIII[0];
            }
        }
        if (Y.lIIIlIlIIIlI(bt ? 1 : 0) && Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[2])) {
            if (Y.lIIIlIlIIIlI(Y.ab() ? 1 : 0)) {
                BankLocation llllIIlllIllII = BankLocation.getNearest();
                if (Y.lIIIlIlIIIll(llllIIlllIllII) && Y.lIIIlIlIIIlI(llllIIlllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[3]];
                    WorldArea llllIIlllIlIll = new WorldArea(lIlIIlIII[4], lIlIIlIII[5], lIlIIlIII[6], lIlIIlIII[7], lIlIIlIII[0]);
                    if (Y.lIIIlIlIIIII(llllIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint llllIIlllIlIlI = new WorldPoint(lIlIIlIII[8], lIlIIlIII[9], lIlIIlIII[0]);
                        if (Y.lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(llllIIlllIlIlI), lIlIIlIII[10])) {
                            Movement.walkTo((WorldPoint)llllIIlllIlIlI);
                            "".length();
                            Time.sleepTicks((int)lIlIIlIII[1]);
                            "".length();
                        }
                    }
                    a.a(llllIIlllIllII);
                }
                if (Y.lIIIlIlIIIll(llllIIlllIllII) && Y.lIIIlIlIIIII(llllIIlllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[10]];
                    if (Y.lIIIlIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIII[11]);
                        "".length();
                    }
                    if (Y.lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (Y.lIIIlIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIlIII[1]);
                            "".length();
                        }
                        if (Y.lIIIlIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIIlIII[3]);
                            "".length();
                        }
                    }
                    int[] nArray = new int[lIlIIlIII[12]];
                    nArray[Y.lIlIIlIII[0]] = lIlIIlIII[13];
                    nArray[Y.lIlIIlIII[1]] = lIlIIlIII[14];
                    nArray[Y.lIlIIlIII[3]] = lIlIIlIII[15];
                    nArray[Y.lIlIIlIII[10]] = lIlIIlIII[16];
                    nArray[Y.lIlIIlIII[17]] = lIlIIlIII[18];
                    nArray[Y.lIlIIlIII[2]] = lIlIIlIII[19];
                    nArray[Y.lIlIIlIII[20]] = lIlIIlIII[21];
                    nArray[Y.lIlIIlIII[22]] = lIlIIlIII[23];
                    nArray[Y.lIlIIlIII[24]] = lIlIIlIII[25];
                    nArray[Y.lIlIIlIII[26]] = lIlIIlIII[27];
                    if (Y.lIIIlIlIIIlI(e.b(nArray) ? 1 : 0)) {
                        Y.af();
                        System.out.println(lIlIIIlIl[lIlIIlIII[17]]);
                        bt = lIlIIlIII[1];
                        return;
                    }
                    int[] nArray2 = new int[lIlIIlIII[12]];
                    nArray2[Y.lIlIIlIII[0]] = lIlIIlIII[13];
                    nArray2[Y.lIlIIlIII[1]] = lIlIIlIII[14];
                    nArray2[Y.lIlIIlIII[3]] = lIlIIlIII[15];
                    nArray2[Y.lIlIIlIII[10]] = lIlIIlIII[16];
                    nArray2[Y.lIlIIlIII[17]] = lIlIIlIII[18];
                    nArray2[Y.lIlIIlIII[2]] = lIlIIlIII[19];
                    nArray2[Y.lIlIIlIII[20]] = lIlIIlIII[21];
                    nArray2[Y.lIlIIlIII[22]] = lIlIIlIII[23];
                    nArray2[Y.lIlIIlIII[24]] = lIlIIlIII[25];
                    nArray2[Y.lIlIIlIII[26]] = lIlIIlIII[27];
                    if (Y.lIIIlIlIIIII(e.b(nArray2) ? 1 : 0)) {
                        a.a(lIlIIlIII[28], lIlIIlIII[1]);
                        a.a(lIlIIlIII[29], lIlIIlIII[1]);
                        a.a(lIlIIlIII[30], lIlIIlIII[1]);
                        a.a(lIlIIlIII[31], lIlIIlIII[1]);
                        a.a(lIlIIlIII[32], lIlIIlIII[1]);
                        a.a(lIlIIlIII[33], lIlIIlIII[1]);
                        a.a(lIlIIlIII[34], lIlIIlIII[1]);
                        int[] nArray3 = new int[lIlIIlIII[1]];
                        nArray3[Y.lIlIIlIII[0]] = lIlIIlIII[28];
                        if (Y.lIIIlIlIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIIlIII[1]];
                            nArray4[Y.lIlIIlIII[0]] = lIlIIlIII[28];
                            if (Y.lIIIlIlIIIlI(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIIlIII[1]];
                                nArray5[Y.lIlIIlIII[0]] = lIlIIlIII[28];
                                if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(lIlIIlIII[35], lIlIIlIII[1]);
                                }
                            }
                        }
                        a.a(lIlIIlIII[18], lIlIIlIII[1]);
                        e.l(lIlIIlIII[28]);
                        e.l(lIlIIlIII[29]);
                        e.l(lIlIIlIII[30]);
                        e.l(lIlIIlIII[31]);
                        e.l(lIlIIlIII[32]);
                        Time.sleepTicks((int)lIlIIlIII[1]);
                        "".length();
                        e.l(lIlIIlIII[34]);
                        e.l(lIlIIlIII[36]);
                        e.l(lIlIIlIII[33]);
                        e.l(lIlIIlIII[35]);
                        e.l(lIlIIlIII[18]);
                        Time.sleepTicks((int)lIlIIlIII[10]);
                        "".length();
                        if (Y.lIIIlIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIlIIlIII[20]);
                            "".length();
                        }
                        if (Y.lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[37])) {
                                a.a(lIlIIlIII[13], lIlIIlIII[12]);
                                a.a(lIlIIlIII[14], lIlIIlIII[12]);
                                a.a(lIlIIlIII[21], lIlIIlIII[12]);
                                a.a(lIlIIlIII[15], lIlIIlIII[12]);
                                a.b(f.bf, lIlIIlIII[1]);
                                a.a(lIlIIlIII[27], lIlIIlIII[1]);
                                a.a(lIlIIlIII[19], lIlIIlIII[2]);
                                a.a(lIlIIlIII[23], lIlIIlIII[38]);
                            }
                            if (Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[37])) {
                                a.a(lIlIIlIII[13], lIlIIlIII[12]);
                                a.a(lIlIIlIII[21], lIlIIlIII[12]);
                                a.a(lIlIIlIII[25], lIlIIlIII[12]);
                                a.b(f.bf, lIlIIlIII[1]);
                                a.a(lIlIIlIII[27], lIlIIlIII[1]);
                                a.a(lIlIIlIII[19], lIlIIlIII[24]);
                                a.a(lIlIIlIII[23], lIlIIlIII[12]);
                            }
                        }
                    }
                }
            }
            if (Y.lIIIlIlIIIII(Y.ab() ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[2]];
                if (Y.lIIIlIlIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlIIlIII[1]];
                    stringArray2[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[20]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIIIlIl[lIlIIlIII[22]]);
                }
                if (Y.lIIIlIlIIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && Y.lIIIlIlIIIIl(Movement.getRunEnergy(), lIlIIlIII[39])) {
                    Inventory.getFirst((int[])f.aV).interact(lIlIIIlIl[lIlIIlIII[24]]);
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIlII(Combat.getMissingHealth(), lIlIIlIII[40])) {
                    int[] nArray = new int[lIlIIlIII[1]];
                    nArray[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                    if (Y.lIIIlIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIlIIlIII[1]];
                        nArray6[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                        Inventory.getFirst((int[])nArray6).interact(lIlIIIlIl[lIlIIlIII[26]]);
                        Time.sleepTicks((int)lIlIIlIII[3]);
                        "".length();
                    }
                }
                if (Y.lIIIlIlIIlII(Movement.getRunEnergy(), lIlIIlIII[41]) && Y.lIIIlIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[42])) {
                    Y.dh();
                }
                if ((!Y.lIIIlIlIIllI(e.j(lIlIIlIII[43]), lIlIIlIII[44]) || Y.lIIIlIlIIIIl(e.j(lIlIIlIII[45]), lIlIIlIII[2])) && Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[42]) && Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[44])) {
                    Y.di();
                }
                if (Y.lIIIlIlIIllI(e.j(lIlIIlIII[43]), lIlIIlIII[44]) && Y.lIIIlIlIIllI(e.j(lIlIIlIII[45]), lIlIIlIII[2])) {
                    if (Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[42]) && Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[37])) {
                        Y.di();
                    }
                    if (Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[37]) && Y.lIIIlIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[44])) {
                        Y.dj();
                    }
                }
                if (Y.lIIIlIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), lIlIIlIII[44])) {
                    Y.dk();
                }
            }
        }
    }

    static {
        Y.lIIIlIIlllll();
        Y.lIIIlIIlIlII();
        bv = new ArrayList<d>();
        kx = lIlIIlIII[27];
        ky = lIlIIlIII[23];
        kA = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[0]);
        kB = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[1]);
        kC = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[3]);
        kD = new WorldPoint(lIlIIlIII[236], lIlIIlIII[237], lIlIIlIII[0]);
    }

    @Override
    public int T() {
        try {
            Y.dg();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() <= 0) {
            return (76 + 117 - 119 + 75 ^ 120 + 155 - 169 + 92) & (141 + 31 - 137 + 114 ^ 2 + 129 - -38 + 29 ^ -" ".length());
        }
        return lIlIIlIII[186];
    }

    private static void lIIIlIIlIlII() {
        lIlIIIlIl = new String[lIlIIlIII[238]];
        Y.lIlIIIlIl[Y.lIlIIlIII[0]] = Y.lIIIlIIIIlll("ADcRGzwlYgEGNy8x", "BBhrR");
        Y.lIlIIIlIl[Y.lIlIIlIII[1]] = Y.lIIIlIIIlIII("dYkJvzv6o/JllvrJ7a7BF2paVpPU5LMv9zw6utszEWDcgV23tXdVHamL9hsRgTdrxlj2YwtKUFE=", "WfXFS");
        Y.lIlIIIlIl[Y.lIlIIlIII[3]] = Y.lIIIlIIIIlll("LyswBxEAPi8AEUE+KU4UACQt", "aJFnv");
        Y.lIlIIIlIl[Y.lIlIIlIII[10]] = Y.lIIIlIIIIlll("IjMpNgEDPCByDws8LDsDDQ==", "jRGRm");
        Y.lIlIIIlIl[Y.lIlIIlIII[17]] = Y.lIIIlIIIlIII("3I6+arIOUX+iSo8P5C5V7cxCk4oNY2W+RKZNj4oIokjZiWZW60ICuVowf4ENo3dPbCygNm/dJGU=", "glJoA");
        Y.lIlIIIlIl[Y.lIlIIlIII[2]] = Y.lIIIlIIIlIII("DlJ5djgRVps=", "UDIDn");
        Y.lIlIIIlIl[Y.lIlIIlIII[20]] = Y.lIIIlIIIlIII("LjItS0EAfjc=", "ppycv");
        Y.lIlIIIlIl[Y.lIlIIlIII[22]] = Y.lIIIlIIIlIII("SB8AsxJXS+0=", "ImMJe");
        Y.lIlIIIlIl[Y.lIlIIlIII[24]] = Y.lIIIlIIIlIIl("TiEonc7DbYk=", "bJUDo");
        Y.lIlIIIlIl[Y.lIlIIlIII[26]] = Y.lIIIlIIIIlll("EBc2", "UvBaU");
        Y.lIlIIIlIl[Y.lIlIIlIII[12]] = Y.lIIIlIIIlIII("C7qRd8CnXGNuEahHzMZerAlXCB3dEckN", "CRHge");
        Y.lIlIIIlIl[Y.lIlIIlIII[49]] = Y.lIIIlIIIIlll("IRgqNQcLBCJmGA0N", "bjEFt");
        Y.lIlIIIlIl[Y.lIlIIlIII[63]] = Y.lIIIlIIIlIII("140DVzIlJ883CTB+gtBWzQ==", "qfOTs");
        Y.lIlIIIlIl[Y.lIlIIlIII[64]] = Y.lIIIlIIIIlll("ADgVBGs2OgsANSQ=", "WYyoF");
        Y.lIlIIIlIl[Y.lIlIIlIII[53]] = Y.lIIIlIIIIlll("MgooIBsYCCZtFxQS", "qfAMy");
        Y.lIlIIIlIl[Y.lIlIIlIII[38]] = Y.lIIIlIIIlIII("AjXYldoUUTVMBxFGkogMIA==", "NPEAv");
        Y.lIlIIIlIl[Y.lIlIIlIII[65]] = Y.lIIIlIIIlIIl("Cjk6RPjbt8wbpA9mY/HTQQ==", "eAYlB");
        Y.lIlIIIlIl[Y.lIlIIlIII[66]] = Y.lIIIlIIIlIIl("TbMcty0n+di8G8oTQlrUvw==", "qNznP");
        Y.lIlIIIlIl[Y.lIlIIlIII[54]] = Y.lIIIlIIIIlll("IxsdEk8VGxkZDB8=", "wixwo");
        Y.lIlIIIlIl[Y.lIlIIlIII[67]] = Y.lIIIlIIIlIIl("5i97alignlA=", "GfUDL");
        Y.lIlIIIlIl[Y.lIlIIlIII[40]] = Y.lIIIlIIIlIII("lGQyOVjvNDJmUqs7902RYQ==", "IbqOX");
        Y.lIlIIIlIl[Y.lIlIIlIII[68]] = Y.lIIIlIIIlIII("V36axqU63e6NE6J9kvTJhQ==", "gohcv");
        Y.lIlIIIlIl[Y.lIlIIlIII[61]] = Y.lIIIlIIIIlll("My8VLWoLIA==", "dNyFG");
        Y.lIlIIIlIl[Y.lIlIIlIII[69]] = Y.lIIIlIIIIlll("AjkFDgwoOwtDCi4iAg==", "AUlcn");
        Y.lIlIIIlIl[Y.lIlIIlIII[70]] = Y.lIIIlIIIlIIl("XrUuALtj2kvn0Q5NtAZCBA==", "SJVtN");
        Y.lIlIIIlIl[Y.lIlIIlIII[41]] = Y.lIIIlIIIlIII("ftyjMaqp7f8Cwo2nXHqGvw==", "SgybV");
        Y.lIlIIIlIl[Y.lIlIIlIII[71]] = Y.lIIIlIIIIlll("LwMEIAsFAQptBwkb", "lomMi");
        Y.lIlIIIlIl[Y.lIlIIlIII[72]] = Y.lIIIlIIIIlll("GiQLJi82Kh1yIDAy", "UFxRN");
        Y.lIlIIIlIl[Y.lIlIIlIII[73]] = Y.lIIIlIIIIlll("FhQvDA14FzAEHQ==", "UxFao");
        Y.lIlIIIlIl[Y.lIlIIlIII[74]] = Y.lIIIlIIIlIII("1M60Eq1o9VpR5XOik4NkgA==", "cpNqB");
        Y.lIlIIIlIl[Y.lIlIIlIII[42]] = Y.lIIIlIIIIlll("HgkgNiAyBzZiMTgbNg==", "QkSBA");
        Y.lIlIIIlIl[Y.lIlIIlIII[75]] = Y.lIIIlIIIlIIl("OyHQd7EspjNeeQuOJUU6Iw==", "bOeGk");
        Y.lIlIIIlIl[Y.lIlIIlIII[95]] = Y.lIIIlIIIlIIl("BnZnhb+6oyNJUHMp9AigHA==", "ZeuNu");
        Y.lIlIIIlIl[Y.lIlIIlIII[97]] = Y.lIIIlIIIlIIl("uaw38ZMEQ8Zw+Lmpu5NjeQ==", "zUNwO");
        Y.lIlIIIlIl[Y.lIlIIlIII[98]] = Y.lIIIlIIIIlll("FyojHwMkayUXHyg=", "CKHvm");
        Y.lIlIIIlIl[Y.lIlIIlIII[99]] = Y.lIIIlIIIIlll("CR4wHTBvHCQBP28eK1MzPR4wHTA=", "OqEsT");
        Y.lIlIIIlIl[Y.lIlIIlIII[100]] = Y.lIIIlIIIlIII("h9EpehmvbpU=", "swlpP");
        Y.lIlIIIlIl[Y.lIlIIlIII[101]] = Y.lIIIlIIIlIIl("I2F2CZ+r56CGQ42QZQ7PrA==", "wfsfC");
        Y.lIlIIIlIl[Y.lIlIIlIII[102]] = Y.lIIIlIIIlIII("W7bKLNdDv++wzB/BIkFc0Q==", "mogPV");
        Y.lIlIIIlIl[Y.lIlIIlIII[103]] = Y.lIIIlIIIlIIl("igxmOBELlrw=", "WbvNw");
        Y.lIlIIIlIl[Y.lIlIIlIII[37]] = Y.lIIIlIIIIlll("NhkKIhgcBQJxCBkEETkOBksJOAUQ", "ukeQk");
        Y.lIlIIIlIl[Y.lIlIIlIII[105]] = Y.lIIIlIIIlIII("OTKdQTZt+hO8RMSaIOnpsg==", "bSlji");
        Y.lIlIIIlIl[Y.lIlIIlIII[106]] = Y.lIIIlIIIlIII("l9RyGajdWIo=", "Yoinc");
        Y.lIlIIIlIl[Y.lIlIIlIII[107]] = Y.lIIIlIIIIlll("FA8yMgo2DQ==", "XjSBc");
        Y.lIlIIIlIl[Y.lIlIIlIII[108]] = Y.lIIIlIIIIlll("IgYp", "egYFg");
        Y.lIlIIIlIl[Y.lIlIIlIII[109]] = Y.lIIIlIIIlIII("8dkSnvXtxlA=", "sOTCD");
        Y.lIlIIIlIl[Y.lIlIIlIII[110]] = Y.lIIIlIIIlIIl("COrDrboiCbG3IORp87T25Q==", "VxSOl");
        Y.lIlIIIlIl[Y.lIlIIlIII[111]] = Y.lIIIlIIIlIIl("52u2ADGyA8Y=", "LRfjg");
        Y.lIlIIIlIl[Y.lIlIIlIII[112]] = Y.lIIIlIIIlIIl("qFHPe0AXDwI=", "IGYuE");
        Y.lIlIIIlIl[Y.lIlIIlIII[113]] = Y.lIIIlIIIlIIl("Mk8Rr1dYx4jMLLwSH1Q6nA==", "jjpEa");
        Y.lIlIIIlIl[Y.lIlIIlIII[39]] = Y.lIIIlIIIIlll("Egsy", "UjBXA");
        Y.lIlIIIlIl[Y.lIlIIlIII[7]] = Y.lIIIlIIIlIIl("OfNC94fqkAI=", "nuUqs");
        Y.lIlIIIlIl[Y.lIlIIlIII[114]] = Y.lIIIlIIIIlll("JDQnJhEAJmoxGR5heA==", "nAJVx");
        Y.lIlIIIlIl[Y.lIlIIlIII[116]] = Y.lIIIlIIIlIIl("DmJenuEwt4k=", "RJfQq");
        Y.lIlIIIlIl[Y.lIlIIlIII[117]] = Y.lIIIlIIIlIII("dZ7gmvqo0tiUhz0W8tj7rw==", "cLfEd");
        Y.lIlIIIlIl[Y.lIlIIlIII[119]] = Y.lIIIlIIIlIIl("OW64Bnl5zng=", "eBHPj");
        Y.lIlIIIlIl[Y.lIlIIlIII[120]] = Y.lIIIlIIIIlll("PA0rDCIRWCsHIRI=", "txYhN");
        Y.lIlIIIlIl[Y.lIlIIlIII[122]] = Y.lIIIlIIIlIII("/tCWrFpEAl0=", "rzWBs");
        Y.lIlIIIlIl[Y.lIlIIlIII[123]] = Y.lIIIlIIIlIII("ewYUk0k0xyeCbzbR+TG3ofmFWZqJsDNp", "sUWrT");
        Y.lIlIIIlIl[Y.lIlIIlIII[124]] = Y.lIIIlIIIlIII("Q+OvoEue2h4=", "ryJXU");
        Y.lIlIIIlIl[Y.lIlIIlIII[44]] = Y.lIIIlIIIlIII("jMfwKASOdRvmuKGHYLDghg==", "aUdcz");
        Y.lIlIIIlIl[Y.lIlIIlIII[140]] = Y.lIIIlIIIlIIl("rIJLEaXr0tOahw2LYRjiAA7ila48wGen", "XCcLP");
        Y.lIlIIIlIl[Y.lIlIIlIII[6]] = Y.lIIIlIIIlIII("tvCJyLSQlmuIZ/fX5XBzhw==", "lCnbC");
        Y.lIlIIIlIl[Y.lIlIIlIII[141]] = Y.lIIIlIIIlIIl("pZIiG+1Fril16LSb1wiMHg==", "COMrf");
        Y.lIlIIIlIl[Y.lIlIIlIII[142]] = Y.lIIIlIIIlIII("B7hH8D8QWyZ0aTSBsfsOxw==", "NXOhb");
        Y.lIlIIIlIl[Y.lIlIIlIII[143]] = Y.lIIIlIIIIlll("GRwhHQs=", "ZpHpi");
        Y.lIlIIIlIl[Y.lIlIIlIII[144]] = Y.lIIIlIIIIlll("AhkhLWYgHnMhNC4bNg==", "OxSFF");
        Y.lIlIIIlIl[Y.lIlIIlIII[145]] = Y.lIIIlIIIlIII("8ADltCImZXjS0AWy2YrUmw==", "qFbcc");
        Y.lIlIIIlIl[Y.lIlIIlIII[146]] = Y.lIIIlIIIlIII("z/Mk2KYNedgp7/RtmDyP5pNVRNioc3JS", "EDfpp");
        Y.lIlIIIlIl[Y.lIlIIlIII[147]] = Y.lIIIlIIIlIII("h/D2fgkx12A=", "judTu");
        Y.lIlIIIlIl[Y.lIlIIlIII[148]] = Y.lIIIlIIIlIIl("WW8S7/QX/3PN1Til5z0pxQ==", "JaCCB");
        Y.lIlIIIlIl[Y.lIlIIlIII[149]] = Y.lIIIlIIIlIII("DMake9h90R8=", "Zxsty");
        Y.lIlIIIlIl[Y.lIlIIlIII[150]] = Y.lIIIlIIIIlll("HRs8Az45CXEUNidOYw==", "WnQsW");
        Y.lIlIIIlIl[Y.lIlIIlIII[151]] = Y.lIIIlIIIIlll("HBgmEQ==", "VmKae");
        Y.lIlIIIlIl[Y.lIlIIlIII[152]] = Y.lIIIlIIIlIII("35IMw/adEDo2rzdEJgu5EQ==", "GGQzP");
        Y.lIlIIIlIl[Y.lIlIIlIII[153]] = Y.lIIIlIIIIlll("PiUMNA==", "tPaDU");
        Y.lIlIIIlIl[Y.lIlIIlIII[154]] = Y.lIIIlIIIlIII("CnGxIc6pnlsGwYh+YjMNig==", "myZCB");
        Y.lIlIIIlIl[Y.lIlIIlIII[155]] = Y.lIIIlIIIlIIl("Edc/4Nc+b3M=", "hPtOw");
        Y.lIlIIIlIl[Y.lIlIIlIII[156]] = Y.lIIIlIIIIlll("LhUAIAERGhI=", "xtuLu");
        Y.lIlIIIlIl[Y.lIlIIlIII[157]] = Y.lIIIlIIIlIIl("VQC42U0uq0w=", "GPHzm");
        Y.lIlIIIlIl[Y.lIlIIlIII[158]] = Y.lIIIlIIIlIII("PBTzLqwyWEOpncKP/MJSXA==", "PmQJl");
        Y.lIlIIIlIl[Y.lIlIIlIII[159]] = Y.lIIIlIIIIlll("BDYhIA==", "NCLPa");
        Y.lIlIIIlIl[Y.lIlIIlIII[160]] = Y.lIIIlIIIIlll("IjEXOD0GI1ovNRhkTA==", "hDzHT");
        Y.lIlIIIlIl[Y.lIlIIlIII[161]] = Y.lIIIlIIIlIII("HDHuvBPIc8E=", "vzJYR");
        Y.lIlIIIlIl[Y.lIlIIlIII[172]] = Y.lIIIlIIIIlll("IwoUejoCSwE7IAwNCyluDgQXKD0I", "mkbZN");
        Y.lIlIIIlIl[Y.lIlIIlIII[173]] = Y.lIIIlIIIlIIl("stF6URaplKk8K3QixyT07g==", "DuKud");
        Y.lIlIIIlIl[Y.lIlIIlIII[174]] = Y.lIIIlIIIIlll("KQ4oHBYTFC5OARUPOx0H", "zzInb");
        Y.lIlIIIlIl[Y.lIlIIlIII[175]] = Y.lIIIlIIIlIIl("haxfZbnCi+Q=", "KMBjj");
        Y.lIlIIIlIl[Y.lIlIIlIII[35]] = Y.lIIIlIIIlIIl("/Hygt07fSFN1g8MvkPLFwQ==", "VVFMA");
        Y.lIlIIIlIl[Y.lIlIIlIII[176]] = Y.lIIIlIIIlIII("zvXSTeXHZ0a5M39QQ99gBA==", "dQSCC");
        Y.lIlIIIlIl[Y.lIlIIlIII[177]] = Y.lIIIlIIIlIIl("dca1jMekMwQEhKPcbtcdTQ==", "hUSZY");
        Y.lIlIIIlIl[Y.lIlIIlIII[178]] = Y.lIIIlIIIIlll("AiA5Pj5kIi0iMWQgInA9NiA5Pj4=", "DOLPZ");
        Y.lIlIIIlIl[Y.lIlIIlIII[179]] = Y.lIIIlIIIlIIl("vevNzlvAdHQ=", "SNKAd");
        Y.lIlIIIlIl[Y.lIlIIlIII[180]] = Y.lIIIlIIIIlll("BC0PBQogP0ISAj54Uw==", "NXbuc");
        Y.lIlIIIlIl[Y.lIlIIlIII[79]] = Y.lIIIlIIIIlll("OQE5HA==", "stTlE");
        Y.lIlIIIlIl[Y.lIlIIlIII[181]] = Y.lIIIlIIIIlll("LBkcJyRvGRwkMg==", "OksTW");
        Y.lIlIIIlIl[Y.lIlIIlIII[182]] = Y.lIIIlIIIIlll("JjcOGyQ=", "eEahW");
        Y.lIlIIIlIl[Y.lIlIIlIII[183]] = Y.lIIIlIIIlIIl("qrj8FBTWf4lFsGr0Nq9ZEw==", "MrFqE");
        Y.lIlIIIlIl[Y.lIlIIlIII[184]] = Y.lIIIlIIIIlll("ED0hGw==", "ZHLkY");
        Y.lIlIIIlIl[Y.lIlIIlIII[185]] = Y.lIIIlIIIIlll("Pj4vCCsaLGIfIwRrdg==", "tKBxB");
        Y.lIlIIIlIl[Y.lIlIIlIII[186]] = Y.lIIIlIIIlIIl("HTuWpiK2WY0=", "VMOUd");
        Y.lIlIIIlIl[Y.lIlIIlIII[187]] = Y.lIIIlIIIlIIl("R3Q0amaC6Q588PHzoT2D6g==", "ZluTE");
        Y.lIlIIIlIl[Y.lIlIIlIII[188]] = Y.lIIIlIIIlIIl("E2H0Ebkzyao=", "KNwgm");
        Y.lIlIIIlIl[Y.lIlIIlIII[194]] = Y.lIIIlIIIlIII("kt6nk9ibRntGrfYB5DOxp9WKagVvgtUl", "lasIy");
        Y.lIlIIIlIl[Y.lIlIIlIII[203]] = Y.lIIIlIIIlIIl("wyC6AGI1i80=", "sYjCR");
        Y.lIlIIIlIl[Y.lIlIIlIII[204]] = Y.lIIIlIIIIlll("JjYGCisxMg==", "VWuyJ");
        Y.lIlIIIlIl[Y.lIlIIlIII[205]] = Y.lIIIlIIIlIIl("uJ3++uuZGPg=", "tIyrr");
        Y.lIlIIIlIl[Y.lIlIIlIII[206]] = Y.lIIIlIIIIlll("PAopAhsrDg==", "LkZqz");
        Y.lIlIIIlIl[Y.lIlIIlIII[207]] = Y.lIIIlIIIlIII("7d/TN5It5rk=", "tJfVL");
        Y.lIlIIIlIl[Y.lIlIIlIII[208]] = Y.lIIIlIIIlIIl("8pOz54LLU4Y=", "xCDpL");
        Y.lIlIIIlIl[Y.lIlIIlIII[211]] = Y.lIIIlIIIlIII("SXZ/qVvcc5E=", "nhkpy");
        Y.lIlIIIlIl[Y.lIlIIlIII[213]] = Y.lIIIlIIIIlll("ITQR", "fUarD");
        Y.lIlIIIlIl[Y.lIlIIlIII[216]] = Y.lIIIlIIIIlll("JDgsCgwCPjsH", "pQKbx");
        Y.lIlIIIlIl[Y.lIlIIlIII[218]] = Y.lIIIlIIIIlll("CTM9", "NRMjd");
        Y.lIlIIIlIl[Y.lIlIIlIII[221]] = Y.lIIIlIIIlIII("4lTD37EZYwE=", "wyVWd");
        Y.lIlIIIlIl[Y.lIlIIlIII[224]] = Y.lIIIlIIIlIIl("aF2sBshePYY=", "MvfuU");
        Y.lIlIIIlIl[Y.lIlIIlIII[226]] = Y.lIIIlIIIlIII("fzNM9HgC0ks7qheazVZLmg==", "lXkwD");
        Y.lIlIIIlIl[Y.lIlIIlIII[227]] = Y.lIIIlIIIlIII("dAFX5kM6PBw=", "Suwwh");
        Y.lIlIIIlIl[Y.lIlIIlIII[230]] = Y.lIIIlIIIlIII("rcwwBO8wc1w=", "PQkrJ");
        Y.lIlIIIlIl[Y.lIlIIlIII[232]] = Y.lIIIlIIIIlll("Ewwb", "TmkHu");
        Y.lIlIIIlIl[Y.lIlIIlIII[233]] = Y.lIIIlIIIlIIl("9ereqlG5XoY=", "fmyuB");
    }

    private static String lIIIlIIIlIII(String llllIIIIIIIlII, String llllIIIIIIIIll) {
        try {
            SecretKeySpec llllIIIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIII[24]), "DES");
            Cipher llllIIIIIIlIII = Cipher.getInstance("DES");
            llllIIIIIIlIII.init(lIlIIlIII[3], llllIIIIIIlIIl);
            return new String(llllIIIIIIlIII.doFinal(Base64.getDecoder().decode(llllIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIIIIIlll) {
            llllIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public String U() {
        return lIlIIIlIl[lIlIIlIII[203]];
    }

    private static boolean lIIIlIlIIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dl() {
        WorldArea worldArea = new WorldArea(lIlIIlIII[80], lIlIIlIII[81], lIlIIlIII[69], lIlIIlIII[64], lIlIIlIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[82], lIlIIlIII[81], lIlIIlIII[12], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[83], lIlIIlIII[84], lIlIIlIII[63], lIlIIlIII[49], lIlIIlIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[189], lIlIIlIII[190], lIlIIlIII[24], lIlIIlIII[2], lIlIIlIII[1]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[85], lIlIIlIII[87], lIlIIlIII[12], lIlIIlIII[24], lIlIIlIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[191], lIlIIlIII[192], lIlIIlIII[73], lIlIIlIII[38], lIlIIlIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[90], lIlIIlIII[91], lIlIIlIII[66], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea8 = new WorldArea(lIlIIlIII[92], lIlIIlIII[93], lIlIIlIII[22], lIlIIlIII[26], lIlIIlIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlIIlIII[92], lIlIIlIII[94], lIlIIlIII[12], lIlIIlIII[22], lIlIIlIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlIIlIII[127], lIlIIlIII[128], lIlIIlIII[49], lIlIIlIII[12], lIlIIlIII[3]);
        WorldArea worldArea11 = new WorldArea(lIlIIlIII[129], lIlIIlIII[127], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[3]);
        WorldArea worldArea12 = new WorldArea(lIlIIlIII[130], lIlIIlIII[131], lIlIIlIII[63], lIlIIlIII[49], lIlIIlIII[3]);
        WorldArea worldArea13 = new WorldArea(lIlIIlIII[132], lIlIIlIII[133], lIlIIlIII[12], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea14 = new WorldArea(lIlIIlIII[134], lIlIIlIII[9], lIlIIlIII[49], lIlIIlIII[26], lIlIIlIII[3]);
        WorldArea worldArea15 = new WorldArea(lIlIIlIII[135], lIlIIlIII[136], lIlIIlIII[68], lIlIIlIII[53], lIlIIlIII[10]);
        WorldArea worldArea16 = new WorldArea(lIlIIlIII[137], lIlIIlIII[138], lIlIIlIII[63], lIlIIlIII[64], lIlIIlIII[3]);
        WorldArea worldArea17 = new WorldArea(lIlIIlIII[164], lIlIIlIII[133], lIlIIlIII[64], lIlIIlIII[12], lIlIIlIII[10]);
        WorldArea worldArea18 = new WorldArea(lIlIIlIII[165], lIlIIlIII[139], lIlIIlIII[38], lIlIIlIII[53], lIlIIlIII[3]);
        WorldArea worldArea19 = new WorldArea(lIlIIlIII[166], lIlIIlIII[134], lIlIIlIII[49], lIlIIlIII[26], lIlIIlIII[3]);
        WorldArea worldArea20 = new WorldArea(lIlIIlIII[167], lIlIIlIII[136], lIlIIlIII[70], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea21 = new WorldArea(lIlIIlIII[168], lIlIIlIII[169], lIlIIlIII[54], lIlIIlIII[63], lIlIIlIII[3]);
        WorldArea[] worldAreaArray = new WorldArea[lIlIIlIII[68]];
        worldAreaArray[Y.lIlIIlIII[0]] = worldArea;
        worldAreaArray[Y.lIlIIlIII[1]] = worldArea2;
        worldAreaArray[Y.lIlIIlIII[3]] = worldArea3;
        worldAreaArray[Y.lIlIIlIII[10]] = worldArea4;
        worldAreaArray[Y.lIlIIlIII[17]] = worldArea5;
        worldAreaArray[Y.lIlIIlIII[2]] = worldArea6;
        worldAreaArray[Y.lIlIIlIII[20]] = worldArea7;
        worldAreaArray[Y.lIlIIlIII[22]] = worldArea8;
        worldAreaArray[Y.lIlIIlIII[24]] = worldArea9;
        worldAreaArray[Y.lIlIIlIII[26]] = worldArea10;
        worldAreaArray[Y.lIlIIlIII[12]] = worldArea11;
        worldAreaArray[Y.lIlIIlIII[49]] = worldArea12;
        worldAreaArray[Y.lIlIIlIII[63]] = worldArea13;
        worldAreaArray[Y.lIlIIlIII[64]] = worldArea14;
        worldAreaArray[Y.lIlIIlIII[53]] = worldArea15;
        worldAreaArray[Y.lIlIIlIII[38]] = worldArea16;
        worldAreaArray[Y.lIlIIlIII[65]] = worldArea17;
        worldAreaArray[Y.lIlIIlIII[66]] = worldArea18;
        worldAreaArray[Y.lIlIIlIII[54]] = worldArea19;
        worldAreaArray[Y.lIlIIlIII[67]] = worldArea20;
        worldAreaArray[Y.lIlIIlIII[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[lIlIIlIII[1]];
        nArray[Y.lIlIIlIII[0]] = lIlIIlIII[193];
        if (Y.lIIIlIlIIIll(TileItems.getNearest((int[])nArray))) {
            void llllIIIlIllIIl;
            System.out.println(lIlIIIlIl[lIlIIlIII[194]]);
            int llllIIIlIllIII = lIlIIlIII[0];
            while (Y.lIIIlIlIIIIl(llllIIIlIllIII, ((void)llllIIIlIllIIl).length)) {
                int[] nArray2 = new int[lIlIIlIII[1]];
                nArray2[Y.lIlIIlIII[0]] = lIlIIlIII[193];
                if (Y.lIIIlIlIIIII(llllIIIlIllIIl[llllIIIlIllIII].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIII(llllIIIlIllIIl[llllIIIlIllIII].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlIIlIII[1];
                }
                ++llllIIIlIllIII;
                "".length();
                if (-(0x59 ^ 0x1F ^ (0xC3 ^ 0x81)) < 0) continue;
                return ((137 + 8 - 93 + 91 ^ 144 + 170 - 159 + 27) & (115 + 146 - 96 + 0 ^ 136 + 5 - 97 + 112 ^ -" ".length())) != 0;
            }
        }
        return lIlIIlIII[0];
    }

    public static void af() {
        d llllIIIlIlIllI;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[lIlIIlIII[1]];
                        nArray[Y.lIlIIlIII[0]] = lIlIIlIII[16];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlIIlIII[16], lIlIIlIII[1], lIlIIlIII[195]);
                            bv.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[lIlIIlIII[1]];
                        nArray2[Y.lIlIIlIII[0]] = lIlIIlIII[18];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[18], lIlIIlIII[3], lIlIIlIII[196]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray3 = new int[lIlIIlIII[1]];
                        nArray3[Y.lIlIIlIII[0]] = lIlIIlIII[27];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[27], lIlIIlIII[3], lIlIIlIII[196]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray4 = new int[lIlIIlIII[1]];
                        nArray4[Y.lIlIIlIII[0]] = lIlIIlIII[13];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[13], lIlIIlIII[12], lIlIIlIII[197]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray5 = new int[lIlIIlIII[1]];
                        nArray5[Y.lIlIIlIII[0]] = lIlIIlIII[21];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[21], lIlIIlIII[12], lIlIIlIII[198]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray6 = new int[lIlIIlIII[1]];
                        nArray6[Y.lIlIIlIII[0]] = lIlIIlIII[15];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[15], lIlIIlIII[12], lIlIIlIII[198]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray7 = new int[lIlIIlIII[1]];
                        nArray7[Y.lIlIIlIII[0]] = lIlIIlIII[14];
                        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llllIIIlIlIllI = new d(lIlIIlIII[14], lIlIIlIII[12], lIlIIlIII[198]);
                            bv.add(llllIIIlIlIllI);
                            "".length();
                        }
                        int[] nArray8 = new int[lIlIIlIII[1]];
                        nArray8[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                        if (!Y.lIIIlIlIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[lIlIIlIII[1]];
                        nArray9[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                        if (!Y.lIIIlIlIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[lIlIIlIII[1]];
                        nArray10[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                        if (!Y.lIIIlIlIIIIl(Bank.getFirst((int[])nArray10).getQuantity(), lIlIIlIII[12])) break block16;
                    }
                    llllIIIlIlIllI = new d(ky, lIlIIlIII[44], lIlIIlIII[199]);
                    bv.add(llllIIIlIlIllI);
                    "".length();
                }
                int[] nArray = new int[lIlIIlIII[1]];
                nArray[Y.lIlIIlIII[0]] = lIlIIlIII[25];
                if (!Y.lIIIlIlIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[lIlIIlIII[1]];
                nArray11[Y.lIlIIlIII[0]] = lIlIIlIII[25];
                if (!Y.lIIIlIlIIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[lIlIIlIII[1]];
                nArray12[Y.lIlIIlIII[0]] = lIlIIlIII[25];
                if (!Y.lIIIlIlIIIIl(Bank.getFirst((int[])nArray12).getQuantity(), lIlIIlIII[12])) break block18;
            }
            llllIIIlIlIllI = new d(lIlIIlIII[25], lIlIIlIII[12], lIlIIlIII[200]);
            bv.add(llllIIIlIlIllI);
            "".length();
        }
        int[] nArray = new int[lIlIIlIII[1]];
        nArray[Y.lIlIIlIII[0]] = lIlIIlIII[201];
        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllIIIlIlIllI = new d(lIlIIlIII[201], lIlIIlIII[1], lIlIIlIII[202]);
            bv.add(llllIIIlIlIllI);
            "".length();
        }
        int[] nArray13 = new int[lIlIIlIII[1]];
        nArray13[Y.lIlIIlIII[0]] = lIlIIlIII[19];
        if (Y.lIIIlIlIIIlI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llllIIIlIlIllI = new d(lIlIIlIII[19], lIlIIlIII[40], i.bq);
            bv.add(llllIIIlIlIllI);
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dh() {
        WorldArea worldArea = new WorldArea(lIlIIlIII[46], lIlIIlIII[47], lIlIIlIII[12], lIlIIlIII[20], lIlIIlIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[46], lIlIIlIII[48], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[0]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[46], lIlIIlIII[50], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[1]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[51], lIlIIlIII[52], lIlIIlIII[53], lIlIIlIII[54], lIlIIlIII[3]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[55], lIlIIlIII[56], lIlIIlIII[24], lIlIIlIII[12], lIlIIlIII[3]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[57], lIlIIlIII[58], lIlIIlIII[49], lIlIIlIII[12], lIlIIlIII[0]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[59], lIlIIlIII[60], lIlIIlIII[12], lIlIIlIII[20], lIlIIlIII[0]);
        WorldArea worldArea8 = new WorldArea(lIlIIlIII[46], lIlIIlIII[47], lIlIIlIII[61], lIlIIlIII[20], lIlIIlIII[0]);
        if (Y.lIIIlIlIIIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[12]];
            e.b(kD);
            Time.sleepTicks((int)lIlIIlIII[1]);
            "".length();
        }
        if ((!Y.lIIIlIlIIIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !Y.lIIIlIlIIIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || Y.lIIIlIlIIIII(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && Y.lIIIlIlIIlll(Players.getLocal().getAnimation(), lIlIIlIII[62]) && Y.lIIIlIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            void llllIIllIllIll;
            void llllIIllIlllII;
            void llllIIllIlllIl;
            void llllIIllIllllI;
            void llllIIllIlllll;
            void llllIIlllIIIII;
            void llllIIllIllIlI;
            if (Y.lIIIlIlIIIII(llllIIllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[49]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[63]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[64]]);
                Time.sleepTicks((int)lIlIIlIII[3]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIlllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[53]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[65]]);
                Time.sleepTicks((int)lIlIIlIII[3]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[66]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[54]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[67]]);
                Time.sleepTicks((int)lIlIIlIII[3]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[40]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[68]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[61]]);
                Time.sleepTicks((int)lIlIIlIII[2]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[69]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[70]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[41]]);
                Time.sleepTicks((int)lIlIIlIII[17]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[71]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[72]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[73]]);
                Time.sleepTicks((int)lIlIIlIII[10]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(llllIIllIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[74]];
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[42]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[75]]);
                Time.sleepTicks((int)lIlIIlIII[17]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dk() {
        void llllIIlIIIlIIl;
        void llllIIlIIIllll;
        void llllIIlIIlIIII;
        void llllIIlIIlIIIl;
        void llllIIlIIlIIlI;
        WorldArea worldArea = new WorldArea(lIlIIlIII[162], lIlIIlIII[163], lIlIIlIII[111], lIlIIlIII[111], lIlIIlIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[162], lIlIIlIII[163], lIlIIlIII[111], lIlIIlIII[111], lIlIIlIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[162], lIlIIlIII[163], lIlIIlIII[111], lIlIIlIII[111], lIlIIlIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[162], lIlIIlIII[163], lIlIIlIII[111], lIlIIlIII[111], lIlIIlIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[164], lIlIIlIII[133], lIlIIlIII[64], lIlIIlIII[12], lIlIIlIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[165], lIlIIlIII[139], lIlIIlIII[38], lIlIIlIII[53], lIlIIlIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[166], lIlIIlIII[134], lIlIIlIII[49], lIlIIlIII[26], lIlIIlIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlIIlIII[167], lIlIIlIII[136], lIlIIlIII[70], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlIIlIII[168], lIlIIlIII[169], lIlIIlIII[54], lIlIIlIII[63], lIlIIlIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIIlIII[170], lIlIIlIII[171], lIlIIlIII[0]);
        if (Y.lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (Y.lIIIlIlIIIlI(llllIIlIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[172]];
            Movement.walkTo((WorldPoint)llllIIlIIIlIIl);
            "".length();
            Time.sleepTicks((int)lIlIIlIII[1]);
            "".length();
        }
        if (Y.lIIIlIlIIIII(llllIIlIIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (Y.lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIIIlIIl), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[173]];
                Movement.walkTo((WorldPoint)llllIIlIIIlIIl);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIIIlIIl), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[174]];
                int llllIIlIIIlIII = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[175]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[35]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIlIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (-(0x8F ^ 0x8B) >= 0) {
                            return ((0x7C ^ 0x1F) & ~(0x6D ^ 0xE)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIlIIlIII[1]];
        stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[176]];
        TileItem llllIIlIIIlIII = TileItems.getNearest((String[])stringArray);
        if (Y.lIIIlIlIIIll(llllIIlIIIlIII) && Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[177]];
            System.out.println(lIlIIIlIl[lIlIIlIII[178]]);
            llllIIlIIIlIII.interact(lIlIIIlIl[lIlIIlIII[179]]);
            Time.sleepTicks((int)lIlIIlIII[10]);
            "".length();
        }
        if (Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
            void llllIIlIIIlIlI;
            void llllIIlIIIlIll;
            void llllIIlIIIllII;
            void llllIIlIIIllIl;
            int llllIIlIIIIllI;
            TileObject llllIIlIIIIlll;
            void llllIIlIIIlllI;
            if (Y.lIIIlIlIIIII(llllIIlIIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[218]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[219], lIlIIlIII[220], lIlIIlIII[10])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x7A ^ 0x3D) & ~(0x36 ^ 0x71)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                llllIIlIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[180]];
                llllIIlIIIIlll.interact(lIlIIIlIl[lIlIIlIII[79]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIIllI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (-" ".length() == "   ".length()) {
                            return ((0x24 ^ 0x30) & ~(0 ^ 0x14)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[216]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[217], lIlIIlIII[128], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0xF5 ^ 0xA8) & ~(0x5F ^ 2)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[181]];
                llllIIlIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIIIIlll.interact(lIlIIIlIl[lIlIIlIII[182]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIIllI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (null != null) {
                            return ((0x25 ^ 0x6A ^ (0xEB ^ 0x85)) & (0x2B ^ 0x6D ^ (0xEE ^ 0x89) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[213]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[214], lIlIIlIII[215], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (((124 + 47 - 125 + 106 ^ 74 + 146 - 183 + 114) & (162 + 99 - 221 + 163 ^ 67 + 8 - 59 + 180 ^ -" ".length())) == "  ".length()) {
                        return ((66 + 115 - 56 + 11 ^ 127 + 141 - 106 + 23) & (0x51 ^ 0x4B ^ (0x5A ^ 0x71) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[183]];
                llllIIlIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIIIIlll.interact(lIlIIIlIl[lIlIIlIII[184]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIIllI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if ("  ".length() >= (0xB8 ^ 0xBE ^ "  ".length())) {
                            return ((0x32 ^ 0x18 ^ (0x43 ^ 0x35)) & (0x9D ^ 0x89 ^ (5 ^ 0x4D) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[211]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[209], lIlIIlIII[212], lIlIIlIII[10])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if ((0x1B ^ 0x1F) < (0x11 ^ 0x15)) {
                        return ((0x18 ^ 0x1D) & ~(0x88 ^ 0x8D)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[185]];
                llllIIlIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIIIIlll.interact(lIlIIIlIl[lIlIIlIII[186]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIIllI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (null != null) {
                            return ((0x55 ^ 0x1E) & ~(0x6D ^ 0x26)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIIIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIIIIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[208]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[209], lIlIIlIII[210], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((0x6B ^ 0x6F) & ~(0xBA ^ 0xBE)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[187]];
                llllIIlIIIIllI = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIIIIlll.interact(lIlIIIlIl[lIlIIlIII[188]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIIIIllI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (((0xAB ^ 0x91) & ~(0x1D ^ 0x27)) > 0) {
                            return ((0x56 ^ 0x18) & ~(1 ^ 0x4F)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dj() {
        void llllIIlIlIIIll;
        void llllIIlIlIlIll;
        void llllIIlIlIllII;
        void llllIIlIlIllIl;
        void llllIIlIlIlllI;
        WorldArea worldArea = new WorldArea(lIlIIlIII[125], lIlIIlIII[126], lIlIIlIII[112], lIlIIlIII[107], lIlIIlIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[125], lIlIIlIII[126], lIlIIlIII[112], lIlIIlIII[107], lIlIIlIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[125], lIlIIlIII[126], lIlIIlIII[112], lIlIIlIII[107], lIlIIlIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[125], lIlIIlIII[126], lIlIIlIII[112], lIlIIlIII[107], lIlIIlIII[10]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[127], lIlIIlIII[128], lIlIIlIII[49], lIlIIlIII[12], lIlIIlIII[3]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[129], lIlIIlIII[127], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[3]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[130], lIlIIlIII[131], lIlIIlIII[63], lIlIIlIII[49], lIlIIlIII[3]);
        WorldArea worldArea8 = new WorldArea(lIlIIlIII[132], lIlIIlIII[133], lIlIIlIII[12], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlIIlIII[134], lIlIIlIII[9], lIlIIlIII[49], lIlIIlIII[26], lIlIIlIII[3]);
        WorldArea worldArea10 = new WorldArea(lIlIIlIII[135], lIlIIlIII[136], lIlIIlIII[68], lIlIIlIII[53], lIlIIlIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlIIlIII[137], lIlIIlIII[138], lIlIIlIII[63], lIlIIlIII[64], lIlIIlIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIlIIlIII[137], lIlIIlIII[139], lIlIIlIII[0]);
        if (Y.lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (Y.lIIIlIlIIIlI(llllIIlIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIlIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIlIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(llllIIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[140]];
            Movement.walkTo((WorldPoint)llllIIlIlIIIll);
            "".length();
            Time.sleepTicks((int)lIlIIlIII[1]);
            "".length();
        }
        if (Y.lIIIlIlIIIII(llllIIlIlIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (Y.lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIlIIIll), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[6]];
                Movement.walkTo((WorldPoint)llllIIlIlIIIll);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIlIIIll), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[141]];
                int llllIIlIlIIIlI = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[lIlIIlIII[1]];
                stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[142]];
                TileObjects.getNearest((String[])stringArray).interact(lIlIIIlIl[lIlIIlIII[143]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIlI)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if ((0x17 ^ 0x13) < 0) {
                            return ((0x81 ^ 0xBD) & ~(0xA6 ^ 0x9A)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
        }
        String[] stringArray = new String[lIlIIlIII[1]];
        stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[144]];
        TileItem llllIIlIlIIIlI = TileItems.getNearest((String[])stringArray);
        if (Y.lIIIlIlIIIll(llllIIlIlIIIlI) && Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[145]];
            System.out.println(lIlIIIlIl[lIlIIlIII[146]]);
            llllIIlIlIIIlI.interact(lIlIIIlIl[lIlIIlIII[147]]);
            Time.sleepTicks((int)lIlIIlIII[10]);
            "".length();
        }
        if (Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
            void llllIIlIlIIlII;
            void llllIIlIlIIlIl;
            void llllIIlIlIIllI;
            void llllIIlIlIIlll;
            void llllIIlIlIlIII;
            void llllIIlIlIlIIl;
            int llllIIlIlIIIII;
            TileObject llllIIlIlIIIIl;
            void llllIIlIlIlIlI;
            if (Y.lIIIlIlIIIII(llllIIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[233]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[234], lIlIIlIII[131], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (-(0xA5 ^ 0xA1) >= 0) {
                        return ((0x4E ^ 4) & ~(0xC3 ^ 0x89)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[148]];
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[149]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (null != null) {
                            return ((0x39 ^ 0x14) & ~(0x55 ^ 0x78)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[232]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[131], lIlIIlIII[225], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return ((0xDC ^ 0x87) & ~(4 ^ 0x5F)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[150]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[151]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (-"   ".length() > 0) {
                            return ((0x44 ^ 0x67) & ~(0xE ^ 0x2D)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[230]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[139], lIlIIlIII[231], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (null != null) {
                        return ((0x8C ^ 0xBE) & ~(0x84 ^ 0xB6)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[152]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[153]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (((0x78 ^ 0x5A) & ~(0x1C ^ 0x3E)) != 0) {
                            return ((0x53 ^ 0x5A) & ~(0x4C ^ 0x45)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[227]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[228], lIlIIlIII[229], lIlIIlIII[10])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if ((0x9A ^ 0x9E) <= 0) {
                        return ((0 ^ 0x4D) & ~(0xF0 ^ 0xBD) & ~((0x3B ^ 0x16) & ~(0x7F ^ 0x52))) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[154]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[155]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return ((0x71 ^ 0x24 ^ (0x2B ^ 0x45)) & (0x7B ^ 0x52 ^ (0x70 ^ 0x62) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[226]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[9], lIlIIlIII[130], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return ((0x71 ^ 0x58) & ~(0x8A ^ 0xA3)) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[156]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[157]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (null != null) {
                            return ((0x69 ^ 0 ^ (0x73 ^ 1)) & (91 + 101 - 71 + 33 ^ 46 + 49 - 42 + 76 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[224]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[225], lIlIIlIII[215], lIlIIlIII[10])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (((0x63 ^ 0x12 ^ (0xFA ^ 0xC4)) & (0x71 ^ 0x1A ^ (0xA2 ^ 0x86) ^ -" ".length())) != 0) {
                        return ((82 + 98 - 69 + 49 ^ 27 + 62 - 6 + 83) & (75 + 60 - 117 + 180 ^ 155 + 127 - 280 + 190 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[158]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[159]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((24 + 60 - -137 + 25 ^ 30 + 39 - 62 + 184) & (0x59 ^ 0x60 ^ (0x2B ^ 0x5B) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
            if (Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                return;
            }
            if (Y.lIIIlIlIIIII(llllIIlIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIll(llllIIlIlIIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (Y.lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[221]]) ? 1 : 0) && Y.lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[222], lIlIIlIII[223], lIlIIlIII[3])), lIlIIlIII[3])) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (null != null) {
                        return ((76 + 70 - 24 + 8 ^ 72 + 98 - 44 + 9) & (113 + 53 - 22 + 11 ^ 102 + 86 - 143 + 113 ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIlIII[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[160]];
                llllIIlIlIIIII = Skills.getExperience((Skill)Skill.AGILITY);
                llllIIlIlIIIIl.interact(lIlIIIlIl[lIlIIlIII[161]]);
                Time.sleepTicks((int)e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlIIIII)) {
                        bl = lIlIIlIII[1];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return ((0xB0 ^ 0x93) & ~(0x81 ^ 0xA2)) != 0;
                        }
                    } else {
                        bl = lIlIIlIII[0];
                    }
                    return bl;
                }, (int)lIlIIlIII[104]);
                "".length();
                Time.sleepTicks((int)lIlIIlIII[1]);
                "".length();
            }
        }
    }

    private static boolean lIIIlIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIlIIlIl(int n2) {
        return n2 > 0;
    }

    private static void lIIIlIIlllll() {
        lIlIIlIII = new int[239];
        Y.lIlIIlIII[0] = (80 + 155 - 145 + 156 ^ 122 + 147 - 114 + 7) & (195 + 33 - 214 + 182 ^ 52 + 126 - 88 + 54 ^ -" ".length());
        Y.lIlIIlIII[1] = " ".length();
        Y.lIlIIlIII[2] = 120 + 20 - 73 + 93 ^ 95 + 114 - 166 + 122;
        Y.lIlIIlIII[3] = "  ".length();
        Y.lIlIIlIII[4] = -(0xFFFFBDFD & 0x725B) & (0xFFFFBDDF & Short.MAX_VALUE);
        Y.lIlIIlIII[5] = 0xFFFFFD95 & 0xFEF;
        Y.lIlIIlIII[6] = 0xE ^ 0x2D ^ (0x78 ^ 0x65);
        Y.lIlIIlIII[7] = 0x60 ^ 0x53;
        Y.lIlIIlIII[8] = -(0xFFFFEB67 & 0x749D) & (0xFFFFFFFF & 0x6DBC);
        Y.lIlIIlIII[9] = -(0xFFFFEABF & 0x7746) & (0xFFFFEFBF & 0x7FDD);
        Y.lIlIIlIII[10] = "   ".length();
        Y.lIlIIlIII[11] = -(0xFFFFFE27 & 0x69DE) & (0xFFFFFFEF & 0x7B9D);
        Y.lIlIIlIII[12] = 0x24 ^ 0xE ^ (4 ^ 0x24);
        Y.lIlIIlIII[13] = -(0xFFFFE0BD & 0x7F6B) & (0xFFFFFFFF & 0x7F6F);
        Y.lIlIIlIII[14] = 0xFFFFFF6B & 0x1FDC;
        Y.lIlIIlIII[15] = -(0xFFFFE2CF & 0x5DB3) & (0xFFFFFFDF & 0x5FEB);
        Y.lIlIIlIII[16] = 0xFFFFDF5F & 0x2FAD;
        Y.lIlIIlIII[17] = 0xB0 ^ 0xAD ^ (0xAF ^ 0xB6);
        Y.lIlIIlIII[18] = 0xFFFFAEFC & 0x7FCF;
        Y.lIlIIlIII[19] = -(0x52 ^ 0x79) & (0xFFFFFD7F & 0x33FB);
        Y.lIlIIlIII[20] = 0x60 ^ 0x66;
        Y.lIlIIlIII[21] = -(0xFFFFE1BF & 0x5EE6) & (0xFFFFDFFF & 0x7FEF);
        Y.lIlIIlIII[22] = 0x26 ^ 0x21;
        Y.lIlIIlIII[23] = -(0xFFFFF767 & 0x38B9) & (0xFFFFBFF5 & 0x71AB);
        Y.lIlIIlIII[24] = 0x22 ^ 0x2A;
        Y.lIlIIlIII[25] = -(0xFFFFB7DF & 0x4A7D) & (0xFFFFCEFF & Short.MAX_VALUE);
        Y.lIlIIlIII[26] = 0x36 ^ 0x2B ^ (0x59 ^ 0x4D);
        Y.lIlIIlIII[27] = -(0xFFFFFD7E & 0x2BE7) & (0xFFFFFBFF & Short.MAX_VALUE);
        Y.lIlIIlIII[28] = 0xFFFFEE54 & 0x3FFF;
        Y.lIlIIlIII[29] = -(0x6D ^ 0x63) & (0xFFFFBFFF & 0x6E5D);
        Y.lIlIIlIII[30] = 0xFFFFEEEE & 0x3F5F;
        Y.lIlIIlIII[31] = 0xFFFFBFEF & 0x6E5C;
        Y.lIlIIlIII[32] = -(0xFFFFFA75 & 0x55AF) & (0xFFFFFFFF & 0x7E76);
        Y.lIlIIlIII[33] = 0xFFFFAF7B & 0x7ECE;
        Y.lIlIIlIII[34] = -(0xFFFFCCCF & 0x733E) & (0xFFFFFEDD & 0x6FEF);
        Y.lIlIIlIII[35] = 0xED ^ 0xB5;
        Y.lIlIIlIII[36] = -(0xFFFF9AD7 & 0x756D) & (0xFFFFDFCF & 0x7F7F);
        Y.lIlIIlIII[37] = 0x62 ^ 0x4A;
        Y.lIlIIlIII[38] = 0x4D ^ 0x25 ^ (0x2E ^ 0x49);
        Y.lIlIIlIII[39] = 0xC ^ 0x2C ^ (0x75 ^ 0x67);
        Y.lIlIIlIII[40] = 0xAA ^ 0xBE;
        Y.lIlIIlIII[41] = 0x22 ^ 0x51 ^ (0xAA ^ 0xC0);
        Y.lIlIIlIII[42] = 20 + 31 - -4 + 129 ^ 137 + 16 - 150 + 163;
        Y.lIlIIlIII[43] = -(0xFFFFFF5A & 0x78F7) & (0xFFFFFBFF & 0x7D7F);
        Y.lIlIIlIII[44] = 0x33 ^ 0xF;
        Y.lIlIIlIII[45] = 0xFFFFBD77 & 0x43BB;
        Y.lIlIIlIII[46] = 0xFFFFB9A5 & 0x4FFF;
        Y.lIlIIlIII[47] = -(0xFFFFB305 & 0x4EFB) & (0xFFFFCFFF & 0x3F6B);
        Y.lIlIIlIII[48] = -(0xFFFFFA9B & 0x55EF) & (0xFFFFFFEB & 0x5DFE);
        Y.lIlIIlIII[49] = 0x2F ^ 0x7F ^ (0x13 ^ 0x48);
        Y.lIlIIlIII[50] = -(0xFFFFB0F3 & 0x7FAF) & (0xFFFFBFFF & 0x7DFF);
        Y.lIlIIlIII[51] = 0xFFFFC9B3 & 0x3FED;
        Y.lIlIIlIII[52] = 0xFFFFCDF7 & 0x3F5F;
        Y.lIlIIlIII[53] = 0xD6 ^ 0xAC ^ (0xD5 ^ 0xA1);
        Y.lIlIIlIII[54] = 0xC2 ^ 0x8F ^ (0x3E ^ 0x61);
        Y.lIlIIlIII[55] = -(0xFFFFFE79 & 0x338F) & (0xFFFFFBBB & 0x3FFF);
        Y.lIlIIlIII[56] = -(0xFFFFF0D7 & 0x6FAF) & (0xFFFFEDDE & Short.MAX_VALUE);
        Y.lIlIIlIII[57] = 0xFFFF9FF7 & 0x69BA;
        Y.lIlIIlIII[58] = -(0xFFFFE2F7 & 0x5FAF) & (0xFFFFCFFF & Short.MAX_VALUE);
        Y.lIlIIlIII[59] = -(0xFFFFE69F & 0x7D67) & (0xFFFFEDFF & 0x7FB7);
        Y.lIlIIlIII[60] = 0xFFFF8F67 & 0x7DFB;
        Y.lIlIIlIII[61] = 141 + 21 - 71 + 66 ^ 73 + 71 - 124 + 119;
        Y.lIlIIlIII[62] = -" ".length();
        Y.lIlIIlIII[63] = 0x41 ^ 0x5A ^ (0 ^ 0x17);
        Y.lIlIIlIII[64] = 0x5A ^ 0x57;
        Y.lIlIIlIII[65] = 0x7F ^ 0x1C ^ (0x32 ^ 0x41);
        Y.lIlIIlIII[66] = 2 ^ 0x13;
        Y.lIlIIlIII[67] = 8 ^ 0x7B ^ (0x4B ^ 0x2B);
        Y.lIlIIlIII[68] = 0x2A ^ 0xC ^ (0x97 ^ 0xA4);
        Y.lIlIIlIII[69] = 0x85 ^ 0x97 ^ (0x58 ^ 0x5D);
        Y.lIlIIlIII[70] = 0x72 ^ 0x4F ^ (0 ^ 0x25);
        Y.lIlIIlIII[71] = 0xD ^ 0x17;
        Y.lIlIIlIII[72] = 0x2C ^ 0x35 ^ "  ".length();
        Y.lIlIIlIII[73] = 59 + 58 - 53 + 99 ^ 41 + 125 - 57 + 82;
        Y.lIlIIlIII[74] = 0xA6 ^ 0xBB;
        Y.lIlIIlIII[75] = 0x1D ^ 2;
        Y.lIlIIlIII[76] = -(0xFFFFF7AB & 0x6BF5) & (0xFFFFFFFF & 0x6FFF);
        Y.lIlIIlIII[77] = 0xFFFFCF3E & 0x3DD7;
        Y.lIlIIlIII[78] = (0x9F ^ 0x88) + (0x11 ^ 0x77) - (0xA3 ^ 0xB6) + (0x3A ^ 0x1B);
        Y.lIlIIlIII[79] = 0x60 ^ 0x3E;
        Y.lIlIIlIII[80] = -(0xFFFFB3D7 & 0x7F2D) & (0xFFFFFFBF & 0x3FD7);
        Y.lIlIIlIII[81] = -(0xFFFFBB73 & 0x56AF) & (0xFFFFBF7F & 0x5FF3);
        Y.lIlIIlIII[82] = 0xFFFFDCFD & 0x2F8E;
        Y.lIlIIlIII[83] = -(0xFFFFEED7 & 0x73A9) & (0xFFFFFFFE & 0x6EFF);
        Y.lIlIIlIII[84] = 0xFFFFBF7C & 0x4DD7;
        Y.lIlIIlIII[85] = -(0xFFFFE7D9 & 0x7BA7) & (0xFFFFFFF6 & 0x6FFF);
        Y.lIlIIlIII[86] = 0xFFFFCFF7 & 0x3D5D;
        Y.lIlIIlIII[87] = -(0xFFFFF1B7 & 0x2E7F) & (0xFFFFEFFF & 0x3D7F);
        Y.lIlIIlIII[88] = -(0xFFFFFEDD & 0x13B3) & (0xFFFFDFFF & 0x3EFB);
        Y.lIlIIlIII[89] = -(0xFFFFF8FA & 0x274F) & (0xFFFFAD7F & Short.MAX_VALUE);
        Y.lIlIIlIII[90] = -(0xFFFFF67F & 0x3BC5) & (0xFFFFFEFD & 0x3FD7);
        Y.lIlIIlIII[91] = -(0xFFFFD2BF & 0x7FE7) & (0xFFFFDFE7 & 0x7FFE);
        Y.lIlIIlIII[92] = 0xFFFFDDF2 & 0x2EAF;
        Y.lIlIIlIII[93] = -(0xFFFFF4B7 & 0x1B7E) & (0xFFFFBDFF & 0x5F7F);
        Y.lIlIIlIII[94] = -(0xFFFFF3EF & 0x5E9E) & (0xFFFFDFFF & 0x7FDF);
        Y.lIlIIlIII[95] = 0xD7 ^ 0xC3 ^ (0x93 ^ 0xA7);
        Y.lIlIIlIII[96] = 0xFFFFFF9A & 0xCFD;
        Y.lIlIIlIII[97] = 0xC9 ^ 0xB9 ^ (9 ^ 0x58);
        Y.lIlIIlIII[98] = 0x1F ^ 0x3D;
        Y.lIlIIlIII[99] = 0xCF ^ 0xA3 ^ (0xE ^ 0x41);
        Y.lIlIIlIII[100] = 0x14 ^ 0x57 ^ (0x2F ^ 0x48);
        Y.lIlIIlIII[101] = 0x37 ^ 0x12;
        Y.lIlIIlIII[102] = 0x7B ^ 0x55 ^ (0x61 ^ 0x69);
        Y.lIlIIlIII[103] = 0x56 ^ 0x3E ^ (0x75 ^ 0x3A);
        Y.lIlIIlIII[104] = -(0xFFFFFA1A & 0x7EF) & (0xFFFFE3FD & 0x3F3F);
        Y.lIlIIlIII[105] = 0x1F ^ 0x70 ^ (0x7F ^ 0x39);
        Y.lIlIIlIII[106] = 149 + 105 - 149 + 68 ^ 43 + 110 - 143 + 125;
        Y.lIlIIlIII[107] = 3 + 133 - 73 + 76 ^ 67 + 8 - -82 + 3;
        Y.lIlIIlIII[108] = 0xE0 ^ 0xC4 ^ (0x55 ^ 0x5D);
        Y.lIlIIlIII[109] = 0xE8 ^ 0x8A ^ (0xFD ^ 0xB2);
        Y.lIlIIlIII[110] = 0x4E ^ 0x60;
        Y.lIlIIlIII[111] = 0x3F ^ 0x10;
        Y.lIlIIlIII[112] = 0xFD ^ 0xA3 ^ (0x73 ^ 0x1D);
        Y.lIlIIlIII[113] = 0x5A ^ 0x6B;
        Y.lIlIIlIII[114] = 0xB5 ^ 0x81;
        Y.lIlIIlIII[115] = -(0xFFFFE94E & 0x56BB) & (0xFFFFFBFF & 0x7DFB);
        Y.lIlIIlIII[116] = 0x83 ^ 0xB6;
        Y.lIlIIlIII[117] = 0x54 ^ 0x62;
        Y.lIlIIlIII[118] = 0xFFFFF9FF & 0x3FF3;
        Y.lIlIIlIII[119] = 0x19 ^ 0x62 ^ (0x3C ^ 0x70);
        Y.lIlIIlIII[120] = 83 + 39 - -11 + 29 ^ 55 + 88 - 66 + 77;
        Y.lIlIIlIII[121] = -(0xFFFFEE0E & 0x17FB) & (0xFFFFBFFD & Short.MAX_VALUE);
        Y.lIlIIlIII[122] = 69 + 93 - -2 + 24 ^ 93 + 60 - 62 + 42;
        Y.lIlIIlIII[123] = 116 + 86 - 137 + 96 ^ 56 + 21 - 40 + 118;
        Y.lIlIIlIII[124] = 0x21 ^ 0x1A;
        Y.lIlIIlIII[125] = 0xFFFFFFAF & 0xDDF;
        Y.lIlIIlIII[126] = 0xFFFFCDDE & 0x3FAB;
        Y.lIlIIlIII[127] = 0xFFFFAFBF & 0x5DEE;
        Y.lIlIIlIII[128] = 0xFFFFDFFF & 0x2DA2;
        Y.lIlIIlIII[129] = 0xFFFF8DA7 & Short.MAX_VALUE;
        Y.lIlIIlIII[130] = -(0xFFFFE733 & 0x7AED) & (0xFFFFEFBF & 0x7FFB);
        Y.lIlIIlIII[131] = -(0xFFFF9E5D & 0x71F7) & (0xFFFFFDFF & 0x1FFD);
        Y.lIlIIlIII[132] = 0xFFFFED9F & 0x1FF0;
        Y.lIlIIlIII[133] = 0xFFFFAFA1 & 0x5DFF;
        Y.lIlIIlIII[134] = -(0xFFFFD0FD & 0x3F63) & (0xFFFF9DFB & 0x7FF7);
        Y.lIlIIlIII[135] = -(0xFFFFF3F1 & 0x7E6F) & (0xFFFFFFFF & 0x7FFD);
        Y.lIlIIlIII[136] = 0xFFFFCFCF & 0x3DBB;
        Y.lIlIIlIII[137] = -(0xFFFF9CDB & 0x736D) & (0xFFFFFFFE & 0x1DFB);
        Y.lIlIIlIII[138] = -(0xFFFFF87D & 0x37EF) & (0xFFFFFFFD & 0x3DFF);
        Y.lIlIIlIII[139] = 0xFFFFCFDF & 0x3DBE;
        Y.lIlIIlIII[140] = 44 + 3 - 12 + 107 ^ 25 + 173 - 25 + 6;
        Y.lIlIIlIII[141] = 0x74 ^ 0x4B;
        Y.lIlIIlIII[142] = 174 + 170 - 259 + 142 ^ 77 + 157 - 116 + 45;
        Y.lIlIIlIII[143] = 8 ^ 0x49;
        Y.lIlIIlIII[144] = 12 + 26 - 3 + 99 ^ 135 + 8 - -13 + 40;
        Y.lIlIIlIII[145] = 0xEB ^ 0xA8;
        Y.lIlIIlIII[146] = 0x4C ^ 8;
        Y.lIlIIlIII[147] = 0xBA ^ 0x87 ^ (0x65 ^ 0x1D);
        Y.lIlIIlIII[148] = 172 + 72 - 98 + 50 ^ 124 + 115 - 168 + 59;
        Y.lIlIIlIII[149] = 0x6C ^ 0x2B;
        Y.lIlIIlIII[150] = 179 + 196 - 218 + 92 ^ 132 + 20 - 102 + 127;
        Y.lIlIIlIII[151] = 0x3D ^ 0x13 ^ (0x2E ^ 0x49);
        Y.lIlIIlIII[152] = 0x82 ^ 0xBE ^ (0x2E ^ 0x58);
        Y.lIlIIlIII[153] = 0xD5 ^ 0x9E;
        Y.lIlIIlIII[154] = 0x82 ^ 0x96 ^ (0xFF ^ 0xA7);
        Y.lIlIIlIII[155] = 0xE ^ 0x43;
        Y.lIlIIlIII[156] = 0x37 ^ 0x79;
        Y.lIlIIlIII[157] = 0x30 ^ 0x7F;
        Y.lIlIIlIII[158] = 0xFE ^ 0xAE;
        Y.lIlIIlIII[159] = 0x32 ^ 7 ^ (0x11 ^ 0x75);
        Y.lIlIIlIII[160] = 24 + 31 - 15 + 168 ^ 114 + 93 - 107 + 30;
        Y.lIlIIlIII[161] = 4 ^ 0x57;
        Y.lIlIIlIII[162] = -(0xFFFFF2CB & 0x7DB5) & (0xFFFFFAFF & Short.MAX_VALUE);
        Y.lIlIIlIII[163] = 0xFFFFCD7E & 0x3FFF;
        Y.lIlIIlIII[164] = -(0xFFFFE3E5 & 0x7C3B) & (0xFFFFFEFF & 0x6BBF);
        Y.lIlIIlIII[165] = 0xFFFF8F9D & 0x7AEF;
        Y.lIlIIlIII[166] = 0xFFFFDAB3 & 0x2FDF;
        Y.lIlIIlIII[167] = -(0xFFFFFBF7 & 0x553B) & (0xFFFFFFBF & 0x5BFB);
        Y.lIlIIlIII[168] = 0xFFFFCABC & 0x3FC3;
        Y.lIlIIlIII[169] = 0xFFFFDFB1 & 0x2DCF;
        Y.lIlIIlIII[170] = -(0xFFFFF29F & 0x6D71) & (0xFFFFEABB & 0x7FFD);
        Y.lIlIIlIII[171] = -(0xFFFFBBDF & 0x463F) & (0xFFFFDFFE & 0x2FBF);
        Y.lIlIIlIII[172] = 0x7C ^ 0x1E ^ (0x4A ^ 0x7C);
        Y.lIlIIlIII[173] = 0x71 ^ 0x77 ^ (0xCF ^ 0x9C);
        Y.lIlIIlIII[174] = 0x5E ^ 0x1C ^ (0x29 ^ 0x3D);
        Y.lIlIIlIII[175] = 0xF2 ^ 0xA5;
        Y.lIlIIlIII[176] = 0x6E ^ 0x28 ^ (0x98 ^ 0x87);
        Y.lIlIIlIII[177] = 0x78 ^ 0x22;
        Y.lIlIIlIII[178] = 9 ^ 0x52;
        Y.lIlIIlIII[179] = 135 + 171 - 211 + 130 ^ 139 + 185 - 318 + 183;
        Y.lIlIIlIII[180] = 0x4B ^ 0xD ^ (0 ^ 0x1B);
        Y.lIlIIlIII[181] = 0x11 ^ 0x4E;
        Y.lIlIIlIII[182] = 0x9C ^ 0xBB ^ (0x4B ^ 0xC);
        Y.lIlIIlIII[183] = 0x6C ^ 0xC ^ " ".length();
        Y.lIlIIlIII[184] = 0xF4 ^ 0x96;
        Y.lIlIIlIII[185] = 0x40 ^ 0x23;
        Y.lIlIIlIII[186] = 0xF9 ^ 0x87 ^ (0xB0 ^ 0xAA);
        Y.lIlIIlIII[187] = 0x63 ^ 6;
        Y.lIlIIlIII[188] = 8 ^ 0x19 ^ (0x49 ^ 0x3E);
        Y.lIlIIlIII[189] = -(0xFFFFC3ED & 0x7D1B) & (0xFFFFEDFF & 0x5F7F);
        Y.lIlIIlIII[190] = 0xFFFFDDF7 & 0x2F5E;
        Y.lIlIIlIII[191] = -(0xFFFFBB93 & 0x676D) & (0xFFFFEF7F & 0x3FEE);
        Y.lIlIIlIII[192] = 0xFFFFCFBF & 0x3D7B;
        Y.lIlIIlIII[193] = -(0xFFFFDB7D & 0x7597) & (0xFFFFFFDF & 0x7F7D);
        Y.lIlIIlIII[194] = 0xA0 ^ 0xB7 ^ (0x77 ^ 7);
        Y.lIlIIlIII[195] = -(0xFFFFAFBF & 0x7A43) & (0xFFFFBFFF & 0x7F7E);
        Y.lIlIIlIII[196] = -(0xFFFFFF9F & 0x1E75) & (0xFFFFFFFC & 0x7FBF);
        Y.lIlIIlIII[197] = 0xFFFFABCF & 0x57B4;
        Y.lIlIIlIII[198] = -(0xFFFFFF4E & 0x20BB) & (0xFFFFE3FF & 0x3FBF);
        Y.lIlIIlIII[199] = -(0xFFFFD97F & 0x3EE2) & (0xFFFFBFFF & 0x5FFF);
        Y.lIlIIlIII[200] = 0xFFFFF2F6 & 0x2FFF;
        Y.lIlIIlIII[201] = 0xFFFFBFFE & 0x6ECB;
        Y.lIlIIlIII[202] = 0xFFFFED5E & 0x77FF;
        Y.lIlIIlIII[203] = 0x58 ^ 0x63 ^ (1 ^ 0x52);
        Y.lIlIIlIII[204] = 0x57 ^ 0x3E;
        Y.lIlIIlIII[205] = 0x15 ^ 0x44 ^ (0x3C ^ 7);
        Y.lIlIIlIII[206] = 0xF2 ^ 0x99;
        Y.lIlIIlIII[207] = 0x8A ^ 0x90 ^ (0x6E ^ 0x18);
        Y.lIlIIlIII[208] = 0x2A ^ 0x47;
        Y.lIlIIlIII[209] = -(0xFFFFEF2D & 0x14F3) & (0xFFFFAFEF & 0x5EBF);
        Y.lIlIIlIII[210] = 0xFFFF9FEB & 0x6D9D;
        Y.lIlIIlIII[211] = 21 + 45 - -14 + 113 ^ 97 + 117 - 210 + 171;
        Y.lIlIIlIII[212] = -(0xFFFFF353 & 0x7CFD) & (0xFFFFFFDF & 0x7DFD);
        Y.lIlIIlIII[213] = 0x35 ^ 0x5A;
        Y.lIlIIlIII[214] = -(0xFFFFD623 & 0x79FD) & (0xFFFFFEBF & 0x5BF7);
        Y.lIlIIlIII[215] = 0xFFFFFF9D & 0xDF6;
        Y.lIlIIlIII[216] = 0x14 ^ 0x5E ^ (0x78 ^ 0x42);
        Y.lIlIIlIII[217] = 0xFFFFAFF7 & 0x5A9E;
        Y.lIlIIlIII[218] = 0x21 ^ 0x71 ^ (0x2A ^ 0xB);
        Y.lIlIIlIII[219] = -(0xFFFFD517 & 0x3EFF) & (0xFFFFFFF7 & 0x1EBF);
        Y.lIlIIlIII[220] = -(0xFFFFBE9F & 0x737B) & (0xFFFFBFFF & 0x7FBF);
        Y.lIlIIlIII[221] = 0 ^ 0x72;
        Y.lIlIIlIII[222] = -(0xFFFFABDA & 0x766F) & (0xFFFFEFFF & 0x3FFF);
        Y.lIlIIlIII[223] = 0xFFFF9DBE & 0x6FDD;
        Y.lIlIIlIII[224] = 0xD8 ^ 0x9C ^ (0x35 ^ 2);
        Y.lIlIIlIII[225] = 0xFFFFEDEF & 0x1FBF;
        Y.lIlIIlIII[226] = 119 + 213 - 255 + 163 ^ 96 + 129 - 159 + 66;
        Y.lIlIIlIII[227] = 0xF5 ^ 0x80;
        Y.lIlIIlIII[228] = -(0xFFFFF7FB & 0x484E) & (0xFFFFDFDF & 0x6DFF);
        Y.lIlIIlIII[229] = -(0xFFFFF3FC & 0x6E1F) & (0xFFFFEFBF & Short.MAX_VALUE);
        Y.lIlIIlIII[230] = 208 + 209 - 207 + 45 ^ 51 + 54 - 21 + 53;
        Y.lIlIIlIII[231] = -(0xFFFFA853 & 0x77AD) & (0xFFFFAFBF & 0x7DEB);
        Y.lIlIIlIII[232] = 0x7F ^ 0x2E ^ (0x57 ^ 0x71);
        Y.lIlIIlIII[233] = 197 + 229 - 421 + 239 ^ 89 + 80 - 69 + 40;
        Y.lIlIIlIII[234] = 0xFFFF9DBF & 0x6FF1;
        Y.lIlIIlIII[235] = -(0xFFFFFC5B & 0x73FF) & (0xFFFFFBFF & 0x7DFE);
        Y.lIlIIlIII[236] = 0xFFFFD9BB & 0x2FEE;
        Y.lIlIIlIII[237] = -(0xFFFFDED5 & 0x63AB) & (0xFFFFCFFD & 0x7FEF);
        Y.lIlIIlIII[238] = 0xC0 ^ 0x87 ^ (0x72 ^ 0x4C);
    }

    private static boolean lIIIlIlIIIll(Object object) {
        return object != null;
    }

    private static String lIIIlIIIlIIl(String lllIllllllIlll, String lllIllllllIllI) {
        try {
            SecretKeySpec lllIllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllllllIll = Cipher.getInstance("Blowfish");
            lllIlllllllIll.init(lIlIIlIII[3], lllIllllllllII);
            return new String(lllIlllllllIll.doFinal(Base64.getDecoder().decode(lllIllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlllllllIlI) {
            lllIlllllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIlll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void di() {
        WorldArea worldArea = new WorldArea(lIlIIlIII[76], lIlIIlIII[77], lIlIIlIII[78], lIlIIlIII[79], lIlIIlIII[1]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[76], lIlIIlIII[77], lIlIIlIII[78], lIlIIlIII[79], lIlIIlIII[3]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[76], lIlIIlIII[77], lIlIIlIII[78], lIlIIlIII[79], lIlIIlIII[10]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[80], lIlIIlIII[81], lIlIIlIII[69], lIlIIlIII[64], lIlIIlIII[0]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[82], lIlIIlIII[81], lIlIIlIII[12], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[83], lIlIIlIII[84], lIlIIlIII[63], lIlIIlIII[49], lIlIIlIII[10]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[85], lIlIIlIII[86], lIlIIlIII[26], lIlIIlIII[22], lIlIIlIII[1]);
        WorldArea worldArea8 = new WorldArea(lIlIIlIII[85], lIlIIlIII[87], lIlIIlIII[12], lIlIIlIII[24], lIlIIlIII[10]);
        WorldArea worldArea9 = new WorldArea(lIlIIlIII[88], lIlIIlIII[89], lIlIIlIII[75], lIlIIlIII[40], lIlIIlIII[10]);
        WorldArea worldArea10 = new WorldArea(lIlIIlIII[90], lIlIIlIII[91], lIlIIlIII[66], lIlIIlIII[64], lIlIIlIII[10]);
        WorldArea worldArea11 = new WorldArea(lIlIIlIII[92], lIlIIlIII[93], lIlIIlIII[22], lIlIIlIII[26], lIlIIlIII[10]);
        WorldArea worldArea12 = new WorldArea(lIlIIlIII[92], lIlIIlIII[94], lIlIIlIII[12], lIlIIlIII[22], lIlIIlIII[10]);
        if (Y.lIIIlIlIIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[95]];
            if (Y.lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (Y.lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIIlIII[96], lIlIIlIII[52], lIlIIlIII[0]));
            "".length();
            Time.sleepTicks((int)lIlIIlIII[1]);
            "".length();
        }
        if (Y.lIIIlIlIIlll(Players.getLocal().getAnimation(), lIlIIlIII[62]) && Y.lIIIlIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[lIlIIlIII[1]];
            stringArray[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[97]];
            TileItem llllIIlIllllll = TileItems.getNearest((String[])stringArray);
            if (Y.lIIIlIlIIIll(llllIIlIllllll) && Y.lIIIlIlIIIII(Y.dl() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[98]];
                System.out.println(lIlIIIlIl[lIlIIlIII[99]]);
                llllIIlIllllll.interact(lIlIIIlIl[lIlIIlIII[100]]);
                Time.sleepTicks((int)lIlIIlIII[10]);
                "".length();
            }
            if (Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                void llllIIllIIIIII;
                void llllIIllIIIIIl;
                void llllIIllIIIIlI;
                void llllIIllIIIIll;
                void llllIIllIIIlII;
                void llllIIllIIIlIl;
                void llllIIllIIIllI;
                void llllIIllIIIlll;
                int llllIIlIlllllI;
                void llllIIllIIlIII;
                if (Y.lIIIlIlIIIII(llllIIllIIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[101]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[lIlIIlIII[1]];
                    stringArray2[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(lIlIIIlIl[lIlIIlIII[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (((138 + 143 - 133 + 62 ^ 68 + 78 - 135 + 140) & (137 + 185 - 105 + 28 ^ 129 + 145 - 224 + 126 ^ -" ".length())) != 0) {
                                return ((67 + 29 - -45 + 7 ^ 13 + 128 - 128 + 141) & (49 + 91 - 37 + 81 ^ 57 + 171 - 118 + 72 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[37]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[lIlIIlIII[1]];
                    stringArray3[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(lIlIIIlIl[lIlIIlIII[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if ("  ".length() >= "   ".length()) {
                                return ((0x72 ^ 0x67) & ~(0x2B ^ 0x3E) & ~((0xD ^ 0x2C) & ~(0x91 ^ 0xB0))) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[107]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[lIlIIlIII[1]];
                    stringArray4[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(lIlIIIlIl[lIlIIlIII[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (((0x50 ^ 0x76 ^ (0xF9 ^ 0xBD)) & (17 + 85 - -50 + 98 ^ 101 + 47 - 15 + 19 ^ -" ".length())) != 0) {
                                return ((0 + 112 - 14 + 46 ^ 94 + 148 - 189 + 116) & (0x80 ^ 0x8E ^ (0x17 ^ 0x20) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[110]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[lIlIIlIII[1]];
                    stringArray5[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIlIIIlIl[lIlIIlIII[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (-" ".length() >= (0xB4 ^ 0xB0)) {
                                return ((0x7E ^ 0x65) & ~(0x7D ^ 0x66)) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[113]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[lIlIIlIII[1]];
                    stringArray6[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(lIlIIIlIl[lIlIIlIII[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if ("   ".length() < 0) {
                                return ((0xAB ^ 0xA6) & ~(0xAE ^ 0xA3)) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[114]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIIlIII[1]];
                    nArray[Y.lIlIIlIII[0]] = lIlIIlIII[115];
                    TileObjects.getNearest((int[])nArray).interact(lIlIIIlIl[lIlIIlIII[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (null != null) {
                                return ((0x2F ^ 0x7B) & ~(0x91 ^ 0xC5)) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[117]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIIlIII[1]];
                    nArray[Y.lIlIIlIII[0]] = lIlIIlIII[118];
                    TileObjects.getNearest((int[])nArray).interact(lIlIIIlIl[lIlIIlIII[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (-" ".length() >= 0) {
                                return ((0x72 ^ 0x32 ^ (0x4B ^ 5)) & (0x6C ^ 0x48 ^ (0xC ^ 0x26) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[120]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[lIlIIlIII[1]];
                    nArray[Y.lIlIIlIII[0]] = lIlIIlIII[121];
                    TileObjects.getNearest((int[])nArray).interact(lIlIIIlIl[lIlIIlIII[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (" ".length() < " ".length()) {
                                return ((0x25 ^ 0xD ^ (0x8A ^ 0x9E)) & (0x84 ^ 0xAB ^ (0xD7 ^ 0xC4) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
                if (Y.lIIIlIlIIIII(llllIIllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && Y.lIIIlIlIIIlI(Y.dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[123]];
                    llllIIlIlllllI = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[lIlIIlIII[1]];
                    stringArray7[Y.lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(lIlIIIlIl[lIlIIlIII[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (Y.lIIIlIlIIlII(Skills.getExperience((Skill)Skill.AGILITY), llllIIlIlllllI)) {
                            bl = lIlIIlIII[1];
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return ((0xD6 ^ 0xC1) & ~(0x79 ^ 0x6E)) != 0;
                            }
                        } else {
                            bl = lIlIIlIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks((int)lIlIIlIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (Y.lIIIlIlIIllI(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIlIIlIII[37])) {
            int n3;
            int[] nArray = new int[lIlIIlIII[1]];
            nArray[Y.lIlIIlIII[0]] = lIlIIlIII[13];
            if (Y.lIIIlIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIlIII[1]];
                nArray2[Y.lIlIIlIII[0]] = lIlIIlIII[25];
                if (Y.lIIIlIlIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlIIlIII[1]];
                    nArray3[Y.lIlIIlIII[0]] = lIlIIlIII[23];
                    if (!(!Y.lIIIlIlIIIII(Inventory.contains((int[])nArray3) ? 1 : 0) || Y.lIIIlIlIIIlI(Inventory.contains(item -> item.getName().contains(lIlIIIlIl[lIlIIlIII[207]])) ? 1 : 0) && !Y.lIIIlIlIIIII(Equipment.contains(item -> item.getName().contains(lIlIIIlIl[lIlIIlIII[206]])) ? 1 : 0) || Y.lIIIlIlIIIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && !Y.lIIIlIlIIIII(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                        n3 = lIlIIlIII[1];
                        "".length();
                        if (-" ".length() <= ((0x47 ^ 0x7E) & ~(0x15 ^ 0x2C))) return n3 != 0;
                        return ((0xB8 ^ 0xAE) & ~(0xD7 ^ 0xC1)) != 0;
                    }
                }
            }
            n3 = lIlIIlIII[0];
            return n3 != 0;
        }
        int[] nArray = new int[lIlIIlIII[1]];
        nArray[Y.lIlIIlIII[0]] = lIlIIlIII[13];
        if (Y.lIIIlIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[lIlIIlIII[1]];
            nArray4[Y.lIlIIlIII[0]] = lIlIIlIII[15];
            if (Y.lIIIlIlIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIlIIlIII[1]];
                nArray5[Y.lIlIIlIII[0]] = lIlIIlIII[14];
                if (!(!Y.lIIIlIlIIIII(Inventory.contains((int[])nArray5) ? 1 : 0) || Y.lIIIlIlIIIlI(Inventory.contains(item -> item.getName().contains(lIlIIIlIl[lIlIIlIII[205]])) ? 1 : 0) && !Y.lIIIlIlIIIII(Equipment.contains(item -> item.getName().contains(lIlIIIlIl[lIlIIlIII[204]])) ? 1 : 0) || Y.lIIIlIlIIIlI(Inventory.contains((int[])f.bf) ? 1 : 0) && !Y.lIIIlIlIIIII(Equipment.contains((int[])f.bf) ? 1 : 0))) {
                    n2 = lIlIIlIII[1];
                    "".length();
                    if (((0x36 ^ 0xE) & ~(0xB6 ^ 0x8E)) == 0) return n2 != 0;
                    return ("   ".length() & ~"   ".length()) != 0;
                }
            }
        }
        n2 = lIlIIlIII[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIlIIlIII[0];
    }
}

