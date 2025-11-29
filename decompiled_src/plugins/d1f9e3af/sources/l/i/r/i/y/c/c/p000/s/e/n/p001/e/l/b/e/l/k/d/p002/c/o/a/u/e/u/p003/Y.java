package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Y  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/Y.class */
public class Y implements W {
    public static /* synthetic */ int ky;
    static /* synthetic */ WorldArea kB;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int kx;
    private static /* synthetic */ String[] lIlIIIlIl;
    private static /* synthetic */ int[] lIlIIlIII;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ WorldArea kC;
    static /* synthetic */ WorldArea kA;
    public static /* synthetic */ int kz;
    private static /* synthetic */ WorldPoint kD;

    private static boolean lIIIlIlIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[2])) {
            ?? r0 = lIlIIlIII[1];
            "".length();
            return ((81 ^ 107) ^ (186 ^ 132)) < (((127 ^ 81) ^ (126 ^ 48)) & (((((162 + 88) - 82) + 72) ^ (((21 + 6) - (-90)) + 27)) ^ (-" ".length()))) ? ((49 ^ 42) ^ (3 ^ 47)) & (((((55 + 150) - 147) + 107) ^ (((115 + 82) - 143) + 92)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIII[0];
    }

    private static boolean lIIIlIlIIllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIIIlIIIIlll(String lllIlllllIlIIl, String lllIlllllIlIII) {
        String lllIlllllIlIIl2 = new String(Base64.getDecoder().decode(lllIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIlllllIlIII.toCharArray();
        int lllIlllllIIlIl = lIlIIlIII[0];
        char[] charArray2 = lllIlllllIlIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIII[0];
        while (lIIIlIlIIIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllIlllllIIlIl % charArray.length]));
            "".length();
            lllIlllllIIlIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlIlIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void dg() {
        if (lIIIlIlIIIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[0]];
            C0001b.a(bv);
            if (lIIIlIlIIIIl(bv.size(), lIlIIlIII[1])) {
                System.out.println(lIlIIIlIl[lIlIIlIII[1]]);
                bt = lIlIIlIII[0];
            }
        }
        if (lIIIlIlIIIlI(bt ? 1 : 0) && lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[2])) {
            if (lIIIlIlIIIlI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIlIIIll(nearest) && lIIIlIlIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[3]];
                    if (lIIIlIlIIIII(new WorldArea(lIlIIlIII[4], lIlIIlIII[5], lIlIIlIII[6], lIlIIlIII[7], lIlIIlIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIlIIlIII[8], lIlIIlIII[9], lIlIIlIII[0]);
                        if (lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIlIIlIII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIIlIlIIIll(nearest) && lIIIlIlIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[10]];
                    if (lIIIlIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIlIII[11]);
                        "".length();
                    }
                    if (lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIlIII[1]);
                            "".length();
                        }
                        if (lIIIlIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIlIII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIlIIlIII[12]];
                    iArr[lIlIIlIII[0]] = lIlIIlIII[13];
                    iArr[lIlIIlIII[1]] = lIlIIlIII[14];
                    iArr[lIlIIlIII[3]] = lIlIIlIII[15];
                    iArr[lIlIIlIII[10]] = lIlIIlIII[16];
                    iArr[lIlIIlIII[17]] = lIlIIlIII[18];
                    iArr[lIlIIlIII[2]] = lIlIIlIII[19];
                    iArr[lIlIIlIII[20]] = lIlIIlIII[21];
                    iArr[lIlIIlIII[22]] = lIlIIlIII[23];
                    iArr[lIlIIlIII[24]] = lIlIIlIII[25];
                    iArr[lIlIIlIII[26]] = lIlIIlIII[27];
                    if (lIIIlIlIIIlI(C0004e.b(iArr) ? 1 : 0)) {
                        af();
                        System.out.println(lIlIIIlIl[lIlIIlIII[17]]);
                        bt = lIlIIlIII[1];
                        return;
                    }
                    int[] iArr2 = new int[lIlIIlIII[12]];
                    iArr2[lIlIIlIII[0]] = lIlIIlIII[13];
                    iArr2[lIlIIlIII[1]] = lIlIIlIII[14];
                    iArr2[lIlIIlIII[3]] = lIlIIlIII[15];
                    iArr2[lIlIIlIII[10]] = lIlIIlIII[16];
                    iArr2[lIlIIlIII[17]] = lIlIIlIII[18];
                    iArr2[lIlIIlIII[2]] = lIlIIlIII[19];
                    iArr2[lIlIIlIII[20]] = lIlIIlIII[21];
                    iArr2[lIlIIlIII[22]] = lIlIIlIII[23];
                    iArr2[lIlIIlIII[24]] = lIlIIlIII[25];
                    iArr2[lIlIIlIII[26]] = lIlIIlIII[27];
                    if (lIIIlIlIIIII(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIlIIlIII[28], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[29], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[30], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[31], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[32], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[33], lIlIIlIII[1]);
                        C0000a.a(lIlIIlIII[34], lIlIIlIII[1]);
                        int[] iArr3 = new int[lIlIIlIII[1]];
                        iArr3[lIlIIlIII[0]] = lIlIIlIII[28];
                        if (lIIIlIlIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIIlIII[1]];
                            iArr4[lIlIIlIII[0]] = lIlIIlIII[28];
                            if (lIIIlIlIIIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIlIIlIII[1]];
                                iArr5[lIlIIlIII[0]] = lIlIIlIII[28];
                                if (lIIIlIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIlIIlIII[35], lIlIIlIII[1]);
                                }
                            }
                        }
                        C0000a.a(lIlIIlIII[18], lIlIIlIII[1]);
                        C0004e.l(lIlIIlIII[28]);
                        C0004e.l(lIlIIlIII[29]);
                        C0004e.l(lIlIIlIII[30]);
                        C0004e.l(lIlIIlIII[31]);
                        C0004e.l(lIlIIlIII[32]);
                        Time.sleepTicks(lIlIIlIII[1]);
                        "".length();
                        C0004e.l(lIlIIlIII[34]);
                        C0004e.l(lIlIIlIII[36]);
                        C0004e.l(lIlIIlIII[33]);
                        C0004e.l(lIlIIlIII[35]);
                        C0004e.l(lIlIIlIII[18]);
                        Time.sleepTicks(lIlIIlIII[10]);
                        "".length();
                        if (lIIIlIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIlIIlIII[20]);
                            "".length();
                        }
                        if (lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[37])) {
                                C0000a.a(lIlIIlIII[13], lIlIIlIII[12]);
                                C0000a.a(lIlIIlIII[14], lIlIIlIII[12]);
                                C0000a.a(lIlIIlIII[21], lIlIIlIII[12]);
                                C0000a.a(lIlIIlIII[15], lIlIIlIII[12]);
                                C0000a.b(C0005f.bf, lIlIIlIII[1]);
                                C0000a.a(lIlIIlIII[27], lIlIIlIII[1]);
                                C0000a.a(lIlIIlIII[19], lIlIIlIII[2]);
                                C0000a.a(lIlIIlIII[23], lIlIIlIII[38]);
                            }
                            if (lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[37])) {
                                C0000a.a(lIlIIlIII[13], lIlIIlIII[12]);
                                C0000a.a(lIlIIlIII[21], lIlIIlIII[12]);
                                C0000a.a(lIlIIlIII[25], lIlIIlIII[12]);
                                C0000a.b(C0005f.bf, lIlIIlIII[1]);
                                C0000a.a(lIlIIlIII[27], lIlIIlIII[1]);
                                C0000a.a(lIlIIlIII[19], lIlIIlIII[24]);
                                C0000a.a(lIlIIlIII[23], lIlIIlIII[12]);
                            }
                        }
                    }
                }
            }
            if (lIIIlIlIIIII(ab() ? 1 : 0)) {
                String[] strArr = new String[lIlIIlIII[1]];
                strArr[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[2]];
                if (lIIIlIlIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIlIII[1]];
                    strArr2[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[20]];
                    Inventory.getFirst(strArr2).interact(lIlIIIlIl[lIlIIlIII[22]]);
                }
                if (lIIIlIlIIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIlIlIIIIl(Movement.getRunEnergy(), lIlIIlIII[39])) {
                    Inventory.getFirst(C0005f.aV).interact(lIlIIIlIl[lIlIIlIII[24]]);
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIlII(Combat.getMissingHealth(), lIlIIlIII[40])) {
                    int[] iArr6 = new int[lIlIIlIII[1]];
                    iArr6[lIlIIlIII[0]] = lIlIIlIII[23];
                    if (lIIIlIlIIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIIlIII[1]];
                        iArr7[lIlIIlIII[0]] = lIlIIlIII[23];
                        Inventory.getFirst(iArr7).interact(lIlIIIlIl[lIlIIlIII[26]]);
                        Time.sleepTicks(lIlIIlIII[3]);
                        "".length();
                    }
                }
                if (lIIIlIlIIlII(Movement.getRunEnergy(), lIlIIlIII[41]) && lIIIlIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[42])) {
                    dh();
                }
                if ((!lIIIlIlIIllI(C0004e.j(lIlIIlIII[43]), lIlIIlIII[44]) || lIIIlIlIIIIl(C0004e.j(lIlIIlIII[45]), lIlIIlIII[2])) && lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[42]) && lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[44])) {
                    di();
                }
                if (lIIIlIlIIllI(C0004e.j(lIlIIlIII[43]), lIlIIlIII[44]) && lIIIlIlIIllI(C0004e.j(lIlIIlIII[45]), lIlIIlIII[2])) {
                    if (lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[42]) && lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[37])) {
                        di();
                    }
                    if (lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[37]) && lIIIlIlIIIIl(Skills.getLevel(Skill.AGILITY), lIlIIlIII[44])) {
                        dj();
                    }
                }
                if (lIIIlIlIIllI(Skills.getLevel(Skill.AGILITY), lIlIIlIII[44])) {
                    dk();
                }
            }
        }
    }

    static {
        lIIIlIIlllll();
        lIIIlIIlIlII();
        bv = new ArrayList();
        kx = lIlIIlIII[27];
        ky = lIlIIlIII[23];
        kA = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[0]);
        kB = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[1]);
        kC = new WorldArea(lIlIIlIII[235], lIlIIlIII[52], lIlIIlIII[69], lIlIIlIII[72], lIlIIlIII[3]);
        kD = new WorldPoint(lIlIIlIII[236], lIlIIlIII[237], lIlIIlIII[0]);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dg();
            "".length();
            if ("   ".length() <= 0) {
                return ((((76 + 117) - 119) + 75) ^ (((120 + 155) - 169) + 92)) & (((((141 + 31) - 137) + 114) ^ (((2 + 129) - (-38)) + 29)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIlIII[186];
    }

    private static void lIIIlIIlIlII() {
        lIlIIIlIl = new String[lIlIIlIII[238]];
        lIlIIIlIl[lIlIIlIII[0]] = lIIIlIIIIlll("ADcRGzwlYgEGNy8x", "BBhrR");
        lIlIIIlIl[lIlIIlIII[1]] = lIIIlIIIlIII("dYkJvzv6o/JllvrJ7a7BF2paVpPU5LMv9zw6utszEWDcgV23tXdVHamL9hsRgTdrxlj2YwtKUFE=", "WfXFS");
        lIlIIIlIl[lIlIIlIII[3]] = lIIIlIIIIlll("LyswBxEAPi8AEUE+KU4UACQt", "aJFnv");
        lIlIIIlIl[lIlIIlIII[10]] = lIIIlIIIIlll("IjMpNgEDPCByDws8LDsDDQ==", "jRGRm");
        lIlIIIlIl[lIlIIlIII[17]] = lIIIlIIIlIII("3I6+arIOUX+iSo8P5C5V7cxCk4oNY2W+RKZNj4oIokjZiWZW60ICuVowf4ENo3dPbCygNm/dJGU=", "glJoA");
        lIlIIIlIl[lIlIIlIII[2]] = lIIIlIIIlIII("DlJ5djgRVps=", "UDIDn");
        lIlIIIlIl[lIlIIlIII[20]] = lIIIlIIIlIII("LjItS0EAfjc=", "ppycv");
        lIlIIIlIl[lIlIIlIII[22]] = lIIIlIIIlIII("SB8AsxJXS+0=", "ImMJe");
        lIlIIIlIl[lIlIIlIII[24]] = lIIIlIIIlIIl("TiEonc7DbYk=", "bJUDo");
        lIlIIIlIl[lIlIIlIII[26]] = lIIIlIIIIlll("EBc2", "UvBaU");
        lIlIIIlIl[lIlIIlIII[12]] = lIIIlIIIlIII("C7qRd8CnXGNuEahHzMZerAlXCB3dEckN", "CRHge");
        lIlIIIlIl[lIlIIlIII[49]] = lIIIlIIIIlll("IRgqNQcLBCJmGA0N", "bjEFt");
        lIlIIIlIl[lIlIIlIII[63]] = lIIIlIIIlIII("140DVzIlJ883CTB+gtBWzQ==", "qfOTs");
        lIlIIIlIl[lIlIIlIII[64]] = lIIIlIIIIlll("ADgVBGs2OgsANSQ=", "WYyoF");
        lIlIIIlIl[lIlIIlIII[53]] = lIIIlIIIIlll("MgooIBsYCCZtFxQS", "qfAMy");
        lIlIIIlIl[lIlIIlIII[38]] = lIIIlIIIlIII("AjXYldoUUTVMBxFGkogMIA==", "NPEAv");
        lIlIIIlIl[lIlIIlIII[65]] = lIIIlIIIlIIl("Cjk6RPjbt8wbpA9mY/HTQQ==", "eAYlB");
        lIlIIIlIl[lIlIIlIII[66]] = lIIIlIIIlIIl("TbMcty0n+di8G8oTQlrUvw==", "qNznP");
        lIlIIIlIl[lIlIIlIII[54]] = lIIIlIIIIlll("IxsdEk8VGxkZDB8=", "wixwo");
        lIlIIIlIl[lIlIIlIII[67]] = lIIIlIIIlIIl("5i97alignlA=", "GfUDL");
        lIlIIIlIl[lIlIIlIII[40]] = lIIIlIIIlIII("lGQyOVjvNDJmUqs7902RYQ==", "IbqOX");
        lIlIIIlIl[lIlIIlIII[68]] = lIIIlIIIlIII("V36axqU63e6NE6J9kvTJhQ==", "gohcv");
        lIlIIIlIl[lIlIIlIII[61]] = lIIIlIIIIlll("My8VLWoLIA==", "dNyFG");
        lIlIIIlIl[lIlIIlIII[69]] = lIIIlIIIIlll("AjkFDgwoOwtDCi4iAg==", "AUlcn");
        lIlIIIlIl[lIlIIlIII[70]] = lIIIlIIIlIIl("XrUuALtj2kvn0Q5NtAZCBA==", "SJVtN");
        lIlIIIlIl[lIlIIlIII[41]] = lIIIlIIIlIII("ftyjMaqp7f8Cwo2nXHqGvw==", "SgybV");
        lIlIIIlIl[lIlIIlIII[71]] = lIIIlIIIIlll("LwMEIAsFAQptBwkb", "lomMi");
        lIlIIIlIl[lIlIIlIII[72]] = lIIIlIIIIlll("GiQLJi82Kh1yIDAy", "UFxRN");
        lIlIIIlIl[lIlIIlIII[73]] = lIIIlIIIIlll("FhQvDA14FzAEHQ==", "UxFao");
        lIlIIIlIl[lIlIIlIII[74]] = lIIIlIIIlIII("1M60Eq1o9VpR5XOik4NkgA==", "cpNqB");
        lIlIIIlIl[lIlIIlIII[42]] = lIIIlIIIIlll("HgkgNiAyBzZiMTgbNg==", "QkSBA");
        lIlIIIlIl[lIlIIlIII[75]] = lIIIlIIIlIIl("OyHQd7EspjNeeQuOJUU6Iw==", "bOeGk");
        lIlIIIlIl[lIlIIlIII[95]] = lIIIlIIIlIIl("BnZnhb+6oyNJUHMp9AigHA==", "ZeuNu");
        lIlIIIlIl[lIlIIlIII[97]] = lIIIlIIIlIIl("uaw38ZMEQ8Zw+Lmpu5NjeQ==", "zUNwO");
        lIlIIIlIl[lIlIIlIII[98]] = lIIIlIIIIlll("FyojHwMkayUXHyg=", "CKHvm");
        lIlIIIlIl[lIlIIlIII[99]] = lIIIlIIIIlll("CR4wHTBvHCQBP28eK1MzPR4wHTA=", "OqEsT");
        lIlIIIlIl[lIlIIlIII[100]] = lIIIlIIIlIII("h9EpehmvbpU=", "swlpP");
        lIlIIIlIl[lIlIIlIII[101]] = lIIIlIIIlIIl("I2F2CZ+r56CGQ42QZQ7PrA==", "wfsfC");
        lIlIIIlIl[lIlIIlIII[102]] = lIIIlIIIlIII("W7bKLNdDv++wzB/BIkFc0Q==", "mogPV");
        lIlIIIlIl[lIlIIlIII[103]] = lIIIlIIIlIIl("igxmOBELlrw=", "WbvNw");
        lIlIIIlIl[lIlIIlIII[37]] = lIIIlIIIIlll("NhkKIhgcBQJxCBkEETkOBksJOAUQ", "ukeQk");
        lIlIIIlIl[lIlIIlIII[105]] = lIIIlIIIlIII("OTKdQTZt+hO8RMSaIOnpsg==", "bSlji");
        lIlIIIlIl[lIlIIlIII[106]] = lIIIlIIIlIII("l9RyGajdWIo=", "Yoinc");
        lIlIIIlIl[lIlIIlIII[107]] = lIIIlIIIIlll("FA8yMgo2DQ==", "XjSBc");
        lIlIIIlIl[lIlIIlIII[108]] = lIIIlIIIIlll("IgYp", "egYFg");
        lIlIIIlIl[lIlIIlIII[109]] = lIIIlIIIlIII("8dkSnvXtxlA=", "sOTCD");
        lIlIIIlIl[lIlIIlIII[110]] = lIIIlIIIlIIl("COrDrboiCbG3IORp87T25Q==", "VxSOl");
        lIlIIIlIl[lIlIIlIII[111]] = lIIIlIIIlIIl("52u2ADGyA8Y=", "LRfjg");
        lIlIIIlIl[lIlIIlIII[112]] = lIIIlIIIlIIl("qFHPe0AXDwI=", "IGYuE");
        lIlIIIlIl[lIlIIlIII[113]] = lIIIlIIIlIIl("Mk8Rr1dYx4jMLLwSH1Q6nA==", "jjpEa");
        lIlIIIlIl[lIlIIlIII[39]] = lIIIlIIIIlll("Egsy", "UjBXA");
        lIlIIIlIl[lIlIIlIII[7]] = lIIIlIIIlIIl("OfNC94fqkAI=", "nuUqs");
        lIlIIIlIl[lIlIIlIII[114]] = lIIIlIIIIlll("JDQnJhEAJmoxGR5heA==", "nAJVx");
        lIlIIIlIl[lIlIIlIII[116]] = lIIIlIIIlIIl("DmJenuEwt4k=", "RJfQq");
        lIlIIIlIl[lIlIIlIII[117]] = lIIIlIIIlIII("dZ7gmvqo0tiUhz0W8tj7rw==", "cLfEd");
        lIlIIIlIl[lIlIIlIII[119]] = lIIIlIIIlIIl("OW64Bnl5zng=", "eBHPj");
        lIlIIIlIl[lIlIIlIII[120]] = lIIIlIIIIlll("PA0rDCIRWCsHIRI=", "txYhN");
        lIlIIIlIl[lIlIIlIII[122]] = lIIIlIIIlIII("/tCWrFpEAl0=", "rzWBs");
        lIlIIIlIl[lIlIIlIII[123]] = lIIIlIIIlIII("ewYUk0k0xyeCbzbR+TG3ofmFWZqJsDNp", "sUWrT");
        lIlIIIlIl[lIlIIlIII[124]] = lIIIlIIIlIII("Q+OvoEue2h4=", "ryJXU");
        lIlIIIlIl[lIlIIlIII[44]] = lIIIlIIIlIII("jMfwKASOdRvmuKGHYLDghg==", "aUdcz");
        lIlIIIlIl[lIlIIlIII[140]] = lIIIlIIIlIIl("rIJLEaXr0tOahw2LYRjiAA7ila48wGen", "XCcLP");
        lIlIIIlIl[lIlIIlIII[6]] = lIIIlIIIlIII("tvCJyLSQlmuIZ/fX5XBzhw==", "lCnbC");
        lIlIIIlIl[lIlIIlIII[141]] = lIIIlIIIlIIl("pZIiG+1Fril16LSb1wiMHg==", "COMrf");
        lIlIIIlIl[lIlIIlIII[142]] = lIIIlIIIlIII("B7hH8D8QWyZ0aTSBsfsOxw==", "NXOhb");
        lIlIIIlIl[lIlIIlIII[143]] = lIIIlIIIIlll("GRwhHQs=", "ZpHpi");
        lIlIIIlIl[lIlIIlIII[144]] = lIIIlIIIIlll("AhkhLWYgHnMhNC4bNg==", "OxSFF");
        lIlIIIlIl[lIlIIlIII[145]] = lIIIlIIIlIII("8ADltCImZXjS0AWy2YrUmw==", "qFbcc");
        lIlIIIlIl[lIlIIlIII[146]] = lIIIlIIIlIII("z/Mk2KYNedgp7/RtmDyP5pNVRNioc3JS", "EDfpp");
        lIlIIIlIl[lIlIIlIII[147]] = lIIIlIIIlIII("h/D2fgkx12A=", "judTu");
        lIlIIIlIl[lIlIIlIII[148]] = lIIIlIIIlIIl("WW8S7/QX/3PN1Til5z0pxQ==", "JaCCB");
        lIlIIIlIl[lIlIIlIII[149]] = lIIIlIIIlIII("DMake9h90R8=", "Zxsty");
        lIlIIIlIl[lIlIIlIII[150]] = lIIIlIIIIlll("HRs8Az45CXEUNidOYw==", "WnQsW");
        lIlIIIlIl[lIlIIlIII[151]] = lIIIlIIIIlll("HBgmEQ==", "VmKae");
        lIlIIIlIl[lIlIIlIII[152]] = lIIIlIIIlIII("35IMw/adEDo2rzdEJgu5EQ==", "GGQzP");
        lIlIIIlIl[lIlIIlIII[153]] = lIIIlIIIIlll("PiUMNA==", "tPaDU");
        lIlIIIlIl[lIlIIlIII[154]] = lIIIlIIIlIII("CnGxIc6pnlsGwYh+YjMNig==", "myZCB");
        lIlIIIlIl[lIlIIlIII[155]] = lIIIlIIIlIIl("Edc/4Nc+b3M=", "hPtOw");
        lIlIIIlIl[lIlIIlIII[156]] = lIIIlIIIIlll("LhUAIAERGhI=", "xtuLu");
        lIlIIIlIl[lIlIIlIII[157]] = lIIIlIIIlIIl("VQC42U0uq0w=", "GPHzm");
        lIlIIIlIl[lIlIIlIII[158]] = lIIIlIIIlIII("PBTzLqwyWEOpncKP/MJSXA==", "PmQJl");
        lIlIIIlIl[lIlIIlIII[159]] = lIIIlIIIIlll("BDYhIA==", "NCLPa");
        lIlIIIlIl[lIlIIlIII[160]] = lIIIlIIIIlll("IjEXOD0GI1ovNRhkTA==", "hDzHT");
        lIlIIIlIl[lIlIIlIII[161]] = lIIIlIIIlIII("HDHuvBPIc8E=", "vzJYR");
        lIlIIIlIl[lIlIIlIII[172]] = lIIIlIIIIlll("IwoUejoCSwE7IAwNCyluDgQXKD0I", "mkbZN");
        lIlIIIlIl[lIlIIlIII[173]] = lIIIlIIIlIIl("stF6URaplKk8K3QixyT07g==", "DuKud");
        lIlIIIlIl[lIlIIlIII[174]] = lIIIlIIIIlll("KQ4oHBYTFC5OARUPOx0H", "zzInb");
        lIlIIIlIl[lIlIIlIII[175]] = lIIIlIIIlIIl("haxfZbnCi+Q=", "KMBjj");
        lIlIIIlIl[lIlIIlIII[35]] = lIIIlIIIlIIl("/Hygt07fSFN1g8MvkPLFwQ==", "VVFMA");
        lIlIIIlIl[lIlIIlIII[176]] = lIIIlIIIlIII("zvXSTeXHZ0a5M39QQ99gBA==", "dQSCC");
        lIlIIIlIl[lIlIIlIII[177]] = lIIIlIIIlIIl("dca1jMekMwQEhKPcbtcdTQ==", "hUSZY");
        lIlIIIlIl[lIlIIlIII[178]] = lIIIlIIIIlll("AiA5Pj5kIi0iMWQgInA9NiA5Pj4=", "DOLPZ");
        lIlIIIlIl[lIlIIlIII[179]] = lIIIlIIIlIIl("vevNzlvAdHQ=", "SNKAd");
        lIlIIIlIl[lIlIIlIII[180]] = lIIIlIIIIlll("BC0PBQogP0ISAj54Uw==", "NXbuc");
        lIlIIIlIl[lIlIIlIII[79]] = lIIIlIIIIlll("OQE5HA==", "stTlE");
        lIlIIIlIl[lIlIIlIII[181]] = lIIIlIIIIlll("LBkcJyRvGRwkMg==", "OksTW");
        lIlIIIlIl[lIlIIlIII[182]] = lIIIlIIIIlll("JjcOGyQ=", "eEahW");
        lIlIIIlIl[lIlIIlIII[183]] = lIIIlIIIlIIl("qrj8FBTWf4lFsGr0Nq9ZEw==", "MrFqE");
        lIlIIIlIl[lIlIIlIII[184]] = lIIIlIIIIlll("ED0hGw==", "ZHLkY");
        lIlIIIlIl[lIlIIlIII[185]] = lIIIlIIIIlll("Pj4vCCsaLGIfIwRrdg==", "tKBxB");
        lIlIIIlIl[lIlIIlIII[186]] = lIIIlIIIlIIl("HTuWpiK2WY0=", "VMOUd");
        lIlIIIlIl[lIlIIlIII[187]] = lIIIlIIIlIIl("R3Q0amaC6Q588PHzoT2D6g==", "ZluTE");
        lIlIIIlIl[lIlIIlIII[188]] = lIIIlIIIlIIl("E2H0Ebkzyao=", "KNwgm");
        lIlIIIlIl[lIlIIlIII[194]] = lIIIlIIIlIII("kt6nk9ibRntGrfYB5DOxp9WKagVvgtUl", "lasIy");
        lIlIIIlIl[lIlIIlIII[203]] = lIIIlIIIlIIl("wyC6AGI1i80=", "sYjCR");
        lIlIIIlIl[lIlIIlIII[204]] = lIIIlIIIIlll("JjYGCisxMg==", "VWuyJ");
        lIlIIIlIl[lIlIIlIII[205]] = lIIIlIIIlIIl("uJ3++uuZGPg=", "tIyrr");
        lIlIIIlIl[lIlIIlIII[206]] = lIIIlIIIIlll("PAopAhsrDg==", "LkZqz");
        lIlIIIlIl[lIlIIlIII[207]] = lIIIlIIIlIII("7d/TN5It5rk=", "tJfVL");
        lIlIIIlIl[lIlIIlIII[208]] = lIIIlIIIlIIl("8pOz54LLU4Y=", "xCDpL");
        lIlIIIlIl[lIlIIlIII[211]] = lIIIlIIIlIII("SXZ/qVvcc5E=", "nhkpy");
        lIlIIIlIl[lIlIIlIII[213]] = lIIIlIIIIlll("ITQR", "fUarD");
        lIlIIIlIl[lIlIIlIII[216]] = lIIIlIIIIlll("JDgsCgwCPjsH", "pQKbx");
        lIlIIIlIl[lIlIIlIII[218]] = lIIIlIIIIlll("CTM9", "NRMjd");
        lIlIIIlIl[lIlIIlIII[221]] = lIIIlIIIlIII("4lTD37EZYwE=", "wyVWd");
        lIlIIIlIl[lIlIIlIII[224]] = lIIIlIIIlIIl("aF2sBshePYY=", "MvfuU");
        lIlIIIlIl[lIlIIlIII[226]] = lIIIlIIIlIII("fzNM9HgC0ks7qheazVZLmg==", "lXkwD");
        lIlIIIlIl[lIlIIlIII[227]] = lIIIlIIIlIII("dAFX5kM6PBw=", "Suwwh");
        lIlIIIlIl[lIlIIlIII[230]] = lIIIlIIIlIII("rcwwBO8wc1w=", "PQkrJ");
        lIlIIIlIl[lIlIIlIII[232]] = lIIIlIIIIlll("Ewwb", "TmkHu");
        lIlIIIlIl[lIlIIlIII[233]] = lIIIlIIIlIIl("9ereqlG5XoY=", "fmyuB");
    }

    private static String lIIIlIIIlIII(String llllIIIIIIIllI, String llllIIIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIII[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIIIIIlll) {
            llllIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIIlIl[lIlIIlIII[203]];
    }

    private static boolean lIIIlIlIIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
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
        WorldArea[] worldAreaArr = new WorldArea[lIlIIlIII[68]];
        worldAreaArr[lIlIIlIII[0]] = worldArea;
        worldAreaArr[lIlIIlIII[1]] = worldArea2;
        worldAreaArr[lIlIIlIII[3]] = worldArea3;
        worldAreaArr[lIlIIlIII[10]] = worldArea4;
        worldAreaArr[lIlIIlIII[17]] = worldArea5;
        worldAreaArr[lIlIIlIII[2]] = worldArea6;
        worldAreaArr[lIlIIlIII[20]] = worldArea7;
        worldAreaArr[lIlIIlIII[22]] = worldArea8;
        worldAreaArr[lIlIIlIII[24]] = worldArea9;
        worldAreaArr[lIlIIlIII[26]] = worldArea10;
        worldAreaArr[lIlIIlIII[12]] = worldArea11;
        worldAreaArr[lIlIIlIII[49]] = worldArea12;
        worldAreaArr[lIlIIlIII[63]] = worldArea13;
        worldAreaArr[lIlIIlIII[64]] = worldArea14;
        worldAreaArr[lIlIIlIII[53]] = worldArea15;
        worldAreaArr[lIlIIlIII[38]] = worldArea16;
        worldAreaArr[lIlIIlIII[65]] = worldArea17;
        worldAreaArr[lIlIIlIII[66]] = worldArea18;
        worldAreaArr[lIlIIlIII[54]] = worldArea19;
        worldAreaArr[lIlIIlIII[67]] = worldArea20;
        worldAreaArr[lIlIIlIII[40]] = worldArea21;
        int[] iArr = new int[lIlIIlIII[1]];
        iArr[lIlIIlIII[0]] = lIlIIlIII[193];
        if (lIIIlIlIIIll(TileItems.getNearest(iArr))) {
            System.out.println(lIlIIIlIl[lIlIIlIII[194]]);
            int i = lIlIIlIII[0];
            while (lIIIlIlIIIIl(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIlIIlIII[1]];
                iArr2[lIlIIlIII[0]] = lIlIIlIII[193];
                if (lIIIlIlIIIII(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIIIlIlIIIII(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIlIIlIII[1];
                }
                i++;
                "".length();
                if ((-((89 ^ 31) ^ (195 ^ 129))) >= 0) {
                    return ((((137 + 8) - 93) + 91) ^ (((144 + 170) - 159) + 27)) & (((((115 + 146) - 96) + 0) ^ (((136 + 5) - 97) + 112)) ^ (-" ".length()));
                }
            }
        }
        return lIlIIlIII[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lIIIlIlIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.Y.lIlIIlIII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lIIIlIlIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.Y.lIlIIlIII[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIlIIlIII[1]];
        iArr4[lIlIIlIII[0]] = lIlIIlIII[16];
        if (lIIIlIlIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[16], lIlIIlIII[1], lIlIIlIII[195]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIlIII[1]];
        iArr5[lIlIIlIII[0]] = lIlIIlIII[18];
        if (lIIIlIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[18], lIlIIlIII[3], lIlIIlIII[196]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIlIII[1]];
        iArr6[lIlIIlIII[0]] = lIlIIlIII[27];
        if (lIIIlIlIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[27], lIlIIlIII[3], lIlIIlIII[196]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIlIII[1]];
        iArr7[lIlIIlIII[0]] = lIlIIlIII[13];
        if (lIIIlIlIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[13], lIlIIlIII[12], lIlIIlIII[197]));
            "".length();
        }
        int[] iArr8 = new int[lIlIIlIII[1]];
        iArr8[lIlIIlIII[0]] = lIlIIlIII[21];
        if (lIIIlIlIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[21], lIlIIlIII[12], lIlIIlIII[198]));
            "".length();
        }
        int[] iArr9 = new int[lIlIIlIII[1]];
        iArr9[lIlIIlIII[0]] = lIlIIlIII[15];
        if (lIIIlIlIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[15], lIlIIlIII[12], lIlIIlIII[198]));
            "".length();
        }
        int[] iArr10 = new int[lIlIIlIII[1]];
        iArr10[lIlIIlIII[0]] = lIlIIlIII[14];
        if (lIIIlIlIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIlIII[14], lIlIIlIII[12], lIlIIlIII[198]));
            "".length();
        }
        int[] iArr11 = new int[lIlIIlIII[1]];
        iArr11[lIlIIlIII[0]] = lIlIIlIII[23];
        if (lIIIlIlIIIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIlIIlIII[1]];
            iArr12[lIlIIlIII[0]] = lIlIIlIII[23];
            if (lIIIlIlIIIII(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIlIIlIII[1]];
                iArr13[lIlIIlIII[0]] = lIlIIlIII[23];
            }
            iArr = new int[lIlIIlIII[1]];
            iArr[lIlIIlIII[0]] = lIlIIlIII[25];
            if (lIIIlIlIIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIlIIlIII[1]];
                iArr14[lIlIIlIII[0]] = lIlIIlIII[25];
                if (lIIIlIlIIIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIIlIII[1]];
                    iArr15[lIlIIlIII[0]] = lIlIIlIII[25];
                }
                iArr2 = new int[lIlIIlIII[1]];
                iArr2[lIlIIlIII[0]] = lIlIIlIII[201];
                if (lIIIlIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlIII[201], lIlIIlIII[1], lIlIIlIII[202]));
                    "".length();
                }
                iArr3 = new int[lIlIIlIII[1]];
                iArr3[lIlIIlIII[0]] = lIlIIlIII[19];
                if (lIIIlIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIlIIlIII[19], lIlIIlIII[40], C0008i.bq));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIlIIlIII[25], lIlIIlIII[12], lIlIIlIII[200]));
            "".length();
            iArr2 = new int[lIlIIlIII[1]];
            iArr2[lIlIIlIII[0]] = lIlIIlIII[201];
            if (lIIIlIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIlIIlIII[1]];
            iArr3[lIlIIlIII[0]] = lIlIIlIII[19];
            if (lIIIlIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(ky, lIlIIlIII[44], lIlIIlIII[199]));
        "".length();
        iArr = new int[lIlIIlIII[1]];
        iArr[lIlIIlIII[0]] = lIlIIlIII[25];
        if (lIIIlIlIIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlIIlIII[25], lIlIIlIII[12], lIlIIlIII[200]));
        "".length();
        iArr2 = new int[lIlIIlIII[1]];
        iArr2[lIlIIlIII[0]] = lIlIIlIII[201];
        if (lIIIlIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIIlIII[1]];
        iArr3[lIlIIlIII[0]] = lIlIIlIII[19];
        if (lIIIlIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static void dh() {
        new WorldArea(lIlIIlIII[46], lIlIIlIII[47], lIlIIlIII[12], lIlIIlIII[20], lIlIIlIII[0]);
        WorldArea worldArea = new WorldArea(lIlIIlIII[46], lIlIIlIII[48], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIlIII[46], lIlIIlIII[50], lIlIIlIII[49], lIlIIlIII[24], lIlIIlIII[1]);
        WorldArea worldArea3 = new WorldArea(lIlIIlIII[51], lIlIIlIII[52], lIlIIlIII[53], lIlIIlIII[54], lIlIIlIII[3]);
        WorldArea worldArea4 = new WorldArea(lIlIIlIII[55], lIlIIlIII[56], lIlIIlIII[24], lIlIIlIII[12], lIlIIlIII[3]);
        WorldArea worldArea5 = new WorldArea(lIlIIlIII[57], lIlIIlIII[58], lIlIIlIII[49], lIlIIlIII[12], lIlIIlIII[0]);
        WorldArea worldArea6 = new WorldArea(lIlIIlIII[59], lIlIIlIII[60], lIlIIlIII[12], lIlIIlIII[20], lIlIIlIII[0]);
        WorldArea worldArea7 = new WorldArea(lIlIIlIII[46], lIlIIlIII[47], lIlIIlIII[61], lIlIIlIII[20], lIlIIlIII[0]);
        if (lIIIlIlIIIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[12]];
            C0004e.b(kD);
            Time.sleepTicks(lIlIIlIII[1]);
            "".length();
        }
        if (!(lIIIlIlIIIlI(kA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(kB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIIlIlIIIII(kC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIIlIlIIlll(Players.getLocal().getAnimation(), lIlIIlIII[62]) && lIIIlIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIIIlIlIIIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[49]];
                String[] strArr = new String[lIlIIlIII[1]];
                strArr[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[63]];
                TileObjects.getNearest(strArr).interact(lIlIIIlIl[lIlIIlIII[64]]);
                Time.sleepTicks(lIlIIlIII[3]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[53]];
                String[] strArr2 = new String[lIlIIlIII[1]];
                strArr2[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[38]];
                TileObjects.getNearest(strArr2).interact(lIlIIIlIl[lIlIIlIII[65]]);
                Time.sleepTicks(lIlIIlIII[3]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[66]];
                String[] strArr3 = new String[lIlIIlIII[1]];
                strArr3[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[54]];
                TileObjects.getNearest(strArr3).interact(lIlIIIlIl[lIlIIlIII[67]]);
                Time.sleepTicks(lIlIIlIII[3]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[40]];
                String[] strArr4 = new String[lIlIIlIII[1]];
                strArr4[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[68]];
                TileObjects.getNearest(strArr4).interact(lIlIIIlIl[lIlIIlIII[61]]);
                Time.sleepTicks(lIlIIlIII[2]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[69]];
                String[] strArr5 = new String[lIlIIlIII[1]];
                strArr5[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[70]];
                TileObjects.getNearest(strArr5).interact(lIlIIIlIl[lIlIIlIII[41]]);
                Time.sleepTicks(lIlIIlIII[17]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[71]];
                String[] strArr6 = new String[lIlIIlIII[1]];
                strArr6[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[72]];
                TileObjects.getNearest(strArr6).interact(lIlIIIlIl[lIlIIlIII[73]]);
                Time.sleepTicks(lIlIIlIII[10]);
                "".length();
            }
            if (lIIIlIlIIIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[74]];
                String[] strArr7 = new String[lIlIIlIII[1]];
                strArr7[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[42]];
                TileObjects.getNearest(strArr7).interact(lIlIIIlIl[lIlIIlIII[75]]);
                Time.sleepTicks(lIlIIlIII[17]);
                "".length();
            }
        }
    }

    private static void dk() {
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
        if (lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIlIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIIlIII[1]);
            "".length();
        }
        if (lIIIlIlIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlIIlIII[1]);
                "".length();
            }
            if (lIIIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlIIlIII[1]];
                strArr[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[175]];
                TileObjects.getNearest(strArr).interact(lIlIIIlIl[lIlIIlIII[35]]);
                Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (-(143 ^ 139)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                }, lIlIIlIII[104]);
                "".length();
                Time.sleepTicks(lIlIIlIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlIIlIII[1]];
        strArr2[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIIlIlIIIll(nearest) && lIIIlIlIIIII(dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[177]];
            System.out.println(lIlIIIlIl[lIlIIlIII[178]]);
            nearest.interact(lIlIIIlIl[lIlIIlIII[179]]);
            Time.sleepTicks(lIlIIlIII[10]);
            "".length();
        }
        if (lIIIlIlIIIlI(dl() ? 1 : 0)) {
            if (lIIIlIlIIIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[218]]) ? 1 : 0) && lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[219], lIlIIlIII[220], lIlIIlIII[10])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[180]];
                    nearest2.interact(lIlIIIlIl[lIlIIlIII[79]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-" ".length()) == "   ".length() ? (true ^ true) & ((false ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIlIlIIIII(tileObject2.getName().contains(lIlIIIlIl[lIlIIlIII[216]]) ? 1 : 0) && lIIIlIlIlIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[217], lIlIIlIII[128], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest3)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIIIlIl[lIlIIlIII[182]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return 0 != 0 ? ((37 ^ 106) ^ (235 ^ 133)) & (((43 ^ 109) ^ (238 ^ 137)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIlIlIIIII(tileObject3.getName().contains(lIlIIIlIl[lIlIIlIII[213]]) ? 1 : 0) && lIIIlIlIlIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[214], lIlIIlIII[215], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (((((124 + 47) - 125) + 106) ^ (((74 + 146) - 183) + 114)) & (((((162 + 99) - 221) + 163) ^ (((67 + 8) - 59) + 180)) ^ (-" ".length()))) == "  ".length() ? ((((66 + 115) - 56) + 11) ^ (((127 + 141) - 106) + 23)) & (((81 ^ 75) ^ (90 ^ 113)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest4)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIIIlIl[lIlIIlIII[184]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return "  ".length() >= ((184 ^ 190) ^ "  ".length()) ? ((50 ^ 24) ^ (67 ^ 53)) & (((157 ^ 137) ^ (5 ^ 77)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIIlIlIIIII(tileObject4.getName().contains(lIlIIIlIl[lIlIIlIII[211]]) ? 1 : 0) && lIIIlIlIlIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[209], lIlIIlIII[212], lIlIIlIII[10])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (27 ^ 31) < (17 ^ 21) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest5)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIIIlIl[lIlIIlIII[186]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (!lIIIlIlIIIII(dl() ? 1 : 0) && lIIIlIlIIIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIIlIlIIIII(tileObject5.getName().contains(lIlIIIlIl[lIlIIlIII[208]]) ? 1 : 0) && lIIIlIlIlIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[209], lIlIIlIII[210], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest6)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIIIlIl[lIlIIlIII[188]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return ((171 ^ 145) & ((29 ^ 39) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
        }
    }

    private static void dj() {
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
        if (lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIlIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIIlIII[1]);
            "".length();
        }
        if (lIIIlIlIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIlIlIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlIIlIII[1]);
                "".length();
            }
            if (lIIIlIlIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIII[20])) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIlIIlIII[1]];
                strArr[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[142]];
                TileObjects.getNearest(strArr).interact(lIlIIIlIl[lIlIIlIII[143]]);
                Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (23 ^ 19) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                }, lIlIIlIII[104]);
                "".length();
                Time.sleepTicks(lIlIIlIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIlIIlIII[1]];
        strArr2[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIIlIlIIIll(nearest) && lIIIlIlIIIII(dl() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[145]];
            System.out.println(lIlIIIlIl[lIlIIlIII[146]]);
            nearest.interact(lIlIIIlIl[lIlIIlIII[147]]);
            Time.sleepTicks(lIlIIlIII[10]);
            "".length();
        }
        if (lIIIlIlIIIlI(dl() ? 1 : 0)) {
            if (lIIIlIlIIIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIIlIlIIIII(tileObject.getName().contains(lIlIIIlIl[lIlIIlIII[233]]) ? 1 : 0) && lIIIlIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[234], lIlIIlIII[131], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (-(165 ^ 161)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[148]];
                    nearest2.interact(lIlIIIlIl[lIlIIlIII[149]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIlIlIIIII(tileObject2.getName().contains(lIlIIIlIl[lIlIIlIII[232]]) ? 1 : 0) && lIIIlIlIlIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[131], lIlIIlIII[225], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (-" ".length()) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest3)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIlIIIlIl[lIlIIlIII[151]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIlIlIIIII(tileObject3.getName().contains(lIlIIIlIl[lIlIIlIII[230]]) ? 1 : 0) && lIIIlIlIlIII(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[139], lIlIIlIII[231], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest4)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIlIIIlIl[lIlIIlIII[153]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIIlIlIIIII(tileObject4.getName().contains(lIlIIIlIl[lIlIIlIII[227]]) ? 1 : 0) && lIIIlIlIlIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[228], lIlIIlIII[229], lIlIIlIII[10])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (154 ^ 158) <= 0 ? (false ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest5)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIlIIIlIl[lIlIIlIII[155]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return "   ".length() <= " ".length() ? ((113 ^ 36) ^ (43 ^ 69)) & (((123 ^ 82) ^ (112 ^ 98)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIIlIlIIIII(tileObject5.getName().contains(lIlIIIlIl[lIlIIlIII[226]]) ? 1 : 0) && lIIIlIlIlIII(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[9], lIlIIlIII[130], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest6)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIlIIIlIl[lIlIIlIII[157]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return 0 != 0 ? ((105 ^ 0) ^ (115 ^ 1)) & (((((91 + 101) - 71) + 33) ^ (((46 + 49) - 42) + 76)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (lIIIlIlIIIII(dl() ? 1 : 0)) {
                return;
            }
            if (lIIIlIlIIIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIIlIlIIIII(tileObject6.getName().contains(lIlIIIlIl[lIlIIlIII[224]]) ? 1 : 0) && lIIIlIlIlIII(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[225], lIlIIlIII[215], lIlIIlIII[10])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (((99 ^ 18) ^ (250 ^ 196)) & (((113 ^ 26) ^ (162 ^ 134)) ^ (-" ".length()))) != 0 ? ((((82 + 98) - 69) + 49) ^ (((27 + 62) - 6) + 83)) & (((((75 + 60) - 117) + 180) ^ (((155 + 127) - 280) + 190)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest7)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIlIIIlIl[lIlIIlIII[159]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return "   ".length() != "   ".length() ? ((((24 + 60) - (-137)) + 25) ^ (((30 + 39) - 62) + 184)) & (((89 ^ 96) ^ (43 ^ 91)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
            if (!lIIIlIlIIIII(dl() ? 1 : 0) && lIIIlIlIIIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIIlIlIIIII(tileObject7.getName().contains(lIlIIIlIl[lIlIIlIII[221]]) ? 1 : 0) && lIIIlIlIlIII(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIII[222], lIlIIlIII[223], lIlIIlIII[3])), lIlIIlIII[3])) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return 0 != 0 ? ((((76 + 70) - 24) + 8) ^ (((72 + 98) - 44) + 9)) & (((((113 + 53) - 22) + 11) ^ (((102 + 86) - 143) + 113)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIlIII[0];
                });
                if (lIIIlIlIIIll(nearest8)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIlIIIlIl[lIlIIlIII[161]]);
                    Time.sleepTicks(C0004e.c(lIlIIlIII[1], lIlIIlIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIlIlIlIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIlIIlIl(int i) {
        return i > 0;
    }

    private static void lIIIlIIlllll() {
        lIlIIlIII = new int[239];
        lIlIIlIII[0] = ((((80 + 155) - 145) + 156) ^ (((122 + 147) - 114) + 7)) & (((((195 + 33) - 214) + 182) ^ (((52 + 126) - 88) + 54)) ^ (-" ".length()));
        lIlIIlIII[1] = " ".length();
        lIlIIlIII[2] = (((120 + 20) - 73) + 93) ^ (((95 + 114) - 166) + 122);
        lIlIIlIII[3] = "  ".length();
        lIlIIlIII[4] = (-((-16899) & 29275)) & (-16929) & 32767;
        lIlIIlIII[5] = (-619) & 4079;
        lIlIIlIII[6] = (14 ^ 45) ^ (120 ^ 101);
        lIlIIlIII[7] = 96 ^ 83;
        lIlIIlIII[8] = (-((-5273) & 29853)) & (-1) & 28092;
        lIlIIlIII[9] = (-((-5441) & 30534)) & (-4161) & 32733;
        lIlIIlIII[10] = "   ".length();
        lIlIIlIII[11] = (-((-473) & 27102)) & (-17) & 31645;
        lIlIIlIII[12] = (36 ^ 14) ^ (4 ^ 36);
        lIlIIlIII[13] = (-((-8003) & 32619)) & (-1) & 32623;
        lIlIIlIII[14] = (-149) & 8156;
        lIlIIlIII[15] = (-((-7473) & 23987)) & (-33) & 24555;
        lIlIIlIII[16] = (-8353) & 12205;
        lIlIIlIII[17] = (176 ^ 173) ^ (175 ^ 182);
        lIlIIlIII[18] = (-20740) & 32719;
        lIlIIlIII[19] = (-(82 ^ 121)) & (-641) & 13307;
        lIlIIlIII[20] = 96 ^ 102;
        lIlIIlIII[21] = (-((-7745) & 24294)) & (-8193) & 32751;
        lIlIIlIII[22] = 38 ^ 33;
        lIlIIlIII[23] = (-((-2201) & 14521)) & (-16395) & 29099;
        lIlIIlIII[24] = 34 ^ 42;
        lIlIIlIII[25] = (-((-18465) & 19069)) & (-12545) & 32767;
        lIlIIlIII[26] = (54 ^ 43) ^ (89 ^ 77);
        lIlIIlIII[27] = (-((-642) & 11239)) & (-1025) & 32767;
        lIlIIlIII[28] = (-4524) & 16383;
        lIlIIlIII[29] = (-(109 ^ 99)) & (-16385) & 28253;
        lIlIIlIII[30] = (-4370) & 16223;
        lIlIIlIII[31] = (-16401) & 28252;
        lIlIIlIII[32] = (-((-1419) & 21935)) & (-1) & 32374;
        lIlIIlIII[33] = (-20613) & 32462;
        lIlIIlIII[34] = (-((-13105) & 29502)) & (-291) & 28655;
        lIlIIlIII[35] = 237 ^ 181;
        lIlIIlIII[36] = (-((-25897) & 30061)) & (-8241) & 32639;
        lIlIIlIII[37] = 98 ^ 74;
        lIlIIlIII[38] = (77 ^ 37) ^ (46 ^ 73);
        lIlIIlIII[39] = (12 ^ 44) ^ (117 ^ 103);
        lIlIIlIII[40] = 170 ^ 190;
        lIlIIlIII[41] = (34 ^ 81) ^ (170 ^ 192);
        lIlIIlIII[42] = (((20 + 31) - (-4)) + 129) ^ (((137 + 16) - 150) + 163);
        lIlIIlIII[43] = (-((-166) & 30967)) & (-1025) & 32127;
        lIlIIlIII[44] = 51 ^ 15;
        lIlIIlIII[45] = (-17033) & 17339;
        lIlIIlIII[46] = (-18011) & 20479;
        lIlIIlIII[47] = (-((-19707) & 20219)) & (-12289) & 16235;
        lIlIIlIII[48] = (-((-1381) & 21999)) & (-21) & 24062;
        lIlIIlIII[49] = (47 ^ 127) ^ (19 ^ 72);
        lIlIIlIII[50] = (-((-20237) & 32687)) & (-16385) & 32255;
        lIlIIlIII[51] = (-13901) & 16365;
        lIlIIlIII[52] = (-12809) & 16223;
        lIlIIlIII[53] = (214 ^ 172) ^ (213 ^ 161);
        lIlIIlIII[54] = (194 ^ 143) ^ (62 ^ 97);
        lIlIIlIII[55] = (-((-391) & 13199)) & (-1093) & 16383;
        lIlIIlIII[56] = (-((-3881) & 28591)) & (-4642) & 32767;
        lIlIIlIII[57] = (-24585) & 27066;
        lIlIIlIII[58] = (-((-7433) & 24495)) & (-12289) & 32767;
        lIlIIlIII[59] = (-((-6497) & 32103)) & (-4609) & 32695;
        lIlIIlIII[60] = (-28825) & 32251;
        lIlIIlIII[61] = (((141 + 21) - 71) + 66) ^ (((73 + 71) - 124) + 119);
        lIlIIlIII[62] = -" ".length();
        lIlIIlIII[63] = (65 ^ 90) ^ (0 ^ 23);
        lIlIIlIII[64] = 90 ^ 87;
        lIlIIlIII[65] = (127 ^ 28) ^ (50 ^ 65);
        lIlIIlIII[66] = 2 ^ 19;
        lIlIIlIII[67] = (8 ^ 123) ^ (75 ^ 43);
        lIlIIlIII[68] = (42 ^ 12) ^ (151 ^ 164);
        lIlIIlIII[69] = (133 ^ 151) ^ (88 ^ 93);
        lIlIIlIII[70] = (114 ^ 79) ^ (0 ^ 37);
        lIlIIlIII[71] = 13 ^ 23;
        lIlIIlIII[72] = (44 ^ 53) ^ "  ".length();
        lIlIIlIII[73] = (((59 + 58) - 53) + 99) ^ (((41 + 125) - 57) + 82);
        lIlIIlIII[74] = 166 ^ 187;
        lIlIIlIII[75] = 29 ^ 2;
        lIlIIlIII[76] = (-((-2133) & 27637)) & (-1) & 28671;
        lIlIIlIII[77] = (-12482) & 15831;
        lIlIIlIII[78] = (((159 ^ 136) + (17 ^ 119)) - (163 ^ 182)) + (58 ^ 27);
        lIlIIlIII[79] = 96 ^ 62;
        lIlIIlIII[80] = (-((-19497) & 32557)) & (-65) & 16343;
        lIlIIlIII[81] = (-((-17549) & 22191)) & (-16513) & 24563;
        lIlIIlIII[82] = (-8963) & 12174;
        lIlIIlIII[83] = (-((-4393) & 29609)) & (-2) & 28415;
        lIlIIlIII[84] = (-16516) & 19927;
        lIlIIlIII[85] = (-((-6183) & 31655)) & (-10) & 28671;
        lIlIIlIII[86] = (-12297) & 15709;
        lIlIIlIII[87] = (-((-3657) & 11903)) & (-4097) & 15743;
        lIlIIlIII[88] = (-((-291) & 5043)) & (-8193) & 16123;
        lIlIIlIII[89] = (-((-1798) & 10063)) & (-21121) & 32767;
        lIlIIlIII[90] = (-((-2433) & 15301)) & (-259) & 16343;
        lIlIIlIII[91] = (-((-11585) & 32743)) & (-8217) & 32766;
        lIlIIlIII[92] = (-8718) & 11951;
        lIlIIlIII[93] = (-((-2889) & 7038)) & (-16897) & 24447;
        lIlIIlIII[94] = (-((-3089) & 24222)) & (-8193) & 32735;
        lIlIIlIII[95] = (215 ^ 195) ^ (147 ^ 167);
        lIlIIlIII[96] = (-102) & 3325;
        lIlIIlIII[97] = (201 ^ 185) ^ (9 ^ 88);
        lIlIIlIII[98] = 31 ^ 61;
        lIlIIlIII[99] = (207 ^ 163) ^ (14 ^ 65);
        lIlIIlIII[100] = (20 ^ 87) ^ (47 ^ 72);
        lIlIIlIII[101] = 55 ^ 18;
        lIlIIlIII[102] = (123 ^ 85) ^ (97 ^ 105);
        lIlIIlIII[103] = (86 ^ 62) ^ (117 ^ 58);
        lIlIIlIII[104] = (-((-1510) & 2031)) & (-7171) & 16191;
        lIlIIlIII[105] = (31 ^ 112) ^ (127 ^ 57);
        lIlIIlIII[106] = (((149 + 105) - 149) + 68) ^ (((43 + 110) - 143) + 125);
        lIlIIlIII[107] = (((3 + 133) - 73) + 76) ^ (((67 + 8) - (-82)) + 3);
        lIlIIlIII[108] = (224 ^ 196) ^ (85 ^ 93);
        lIlIIlIII[109] = (232 ^ 138) ^ (253 ^ 178);
        lIlIIlIII[110] = 78 ^ 96;
        lIlIIlIII[111] = 63 ^ 16;
        lIlIIlIII[112] = (253 ^ 163) ^ (115 ^ 29);
        lIlIIlIII[113] = 90 ^ 107;
        lIlIIlIII[114] = 181 ^ 129;
        lIlIIlIII[115] = (-((-5810) & 22203)) & (-1025) & 32251;
        lIlIIlIII[116] = 131 ^ 182;
        lIlIIlIII[117] = 84 ^ 98;
        lIlIIlIII[118] = (-1537) & 16371;
        lIlIIlIII[119] = (25 ^ 98) ^ (60 ^ 112);
        lIlIIlIII[120] = (((83 + 39) - (-11)) + 29) ^ (((55 + 88) - 66) + 77);
        lIlIIlIII[121] = (-((-4594) & 6139)) & (-16387) & 32767;
        lIlIIlIII[122] = (((69 + 93) - (-2)) + 24) ^ (((93 + 60) - 62) + 42);
        lIlIIlIII[123] = (((116 + 86) - 137) + 96) ^ (((56 + 21) - 40) + 118);
        lIlIIlIII[124] = 33 ^ 26;
        lIlIIlIII[125] = (-81) & 3551;
        lIlIIlIII[126] = (-12834) & 16299;
        lIlIIlIII[127] = (-20545) & 24046;
        lIlIIlIII[128] = (-8193) & 11682;
        lIlIIlIII[129] = (-29273) & 32767;
        lIlIIlIII[130] = (-((-6349) & 31469)) & (-4161) & 32763;
        lIlIIlIII[131] = (-((-24995) & 29175)) & (-513) & 8189;
        lIlIIlIII[132] = (-4705) & 8176;
        lIlIIlIII[133] = (-20575) & 24063;
        lIlIIlIII[134] = (-((-12035) & 16227)) & (-25093) & 32759;
        lIlIIlIII[135] = (-((-3087) & 32367)) & (-1) & 32765;
        lIlIIlIII[136] = (-12337) & 15803;
        lIlIIlIII[137] = (-((-25381) & 29549)) & (-2) & 7675;
        lIlIIlIII[138] = (-((-1923) & 14319)) & (-3) & 15871;
        lIlIIlIII[139] = (-12321) & 15806;
        lIlIIlIII[140] = (((44 + 3) - 12) + 107) ^ (((25 + 173) - 25) + 6);
        lIlIIlIII[141] = 116 ^ 75;
        lIlIIlIII[142] = (((174 + 170) - 259) + 142) ^ (((77 + 157) - 116) + 45);
        lIlIIlIII[143] = 8 ^ 73;
        lIlIIlIII[144] = (((12 + 26) - 3) + 99) ^ (((135 + 8) - (-13)) + 40);
        lIlIIlIII[145] = 235 ^ 168;
        lIlIIlIII[146] = 76 ^ 8;
        lIlIIlIII[147] = (186 ^ 135) ^ (101 ^ 29);
        lIlIIlIII[148] = (((172 + 72) - 98) + 50) ^ (((124 + 115) - 168) + 59);
        lIlIIlIII[149] = 108 ^ 43;
        lIlIIlIII[150] = (((179 + 196) - 218) + 92) ^ (((132 + 20) - 102) + 127);
        lIlIIlIII[151] = (61 ^ 19) ^ (46 ^ 73);
        lIlIIlIII[152] = (130 ^ 190) ^ (46 ^ 88);
        lIlIIlIII[153] = 213 ^ 158;
        lIlIIlIII[154] = (130 ^ 150) ^ (255 ^ 167);
        lIlIIlIII[155] = 14 ^ 67;
        lIlIIlIII[156] = 55 ^ 121;
        lIlIIlIII[157] = 48 ^ 127;
        lIlIIlIII[158] = 254 ^ 174;
        lIlIIlIII[159] = (50 ^ 7) ^ (17 ^ 117);
        lIlIIlIII[160] = (((24 + 31) - 15) + 168) ^ (((114 + 93) - 107) + 30);
        lIlIIlIII[161] = 4 ^ 87;
        lIlIIlIII[162] = (-((-3381) & 32181)) & (-1281) & 32767;
        lIlIIlIII[163] = (-12930) & 16383;
        lIlIIlIII[164] = (-((-7195) & 31803)) & (-257) & 27583;
        lIlIIlIII[165] = (-28771) & 31471;
        lIlIIlIII[166] = (-9549) & 12255;
        lIlIIlIII[167] = (-((-1033) & 21819)) & (-65) & 23547;
        lIlIIlIII[168] = (-13636) & 16323;
        lIlIIlIII[169] = (-8271) & 11727;
        lIlIIlIII[170] = (-((-3425) & 28017)) & (-5445) & 32765;
        lIlIIlIII[171] = (-((-17441) & 17983)) & (-8194) & 12223;
        lIlIIlIII[172] = (124 ^ 30) ^ (74 ^ 124);
        lIlIIlIII[173] = (113 ^ 119) ^ (207 ^ 156);
        lIlIIlIII[174] = (94 ^ 28) ^ (41 ^ 61);
        lIlIIlIII[175] = 242 ^ 165;
        lIlIIlIII[176] = (110 ^ 40) ^ (152 ^ 135);
        lIlIIlIII[177] = 120 ^ 34;
        lIlIIlIII[178] = 9 ^ 82;
        lIlIIlIII[179] = (((135 + 171) - 211) + 130) ^ (((139 + 185) - 318) + 183);
        lIlIIlIII[180] = (75 ^ 13) ^ (0 ^ 27);
        lIlIIlIII[181] = 17 ^ 78;
        lIlIIlIII[182] = (156 ^ 187) ^ (75 ^ 12);
        lIlIIlIII[183] = (108 ^ 12) ^ " ".length();
        lIlIIlIII[184] = 244 ^ 150;
        lIlIIlIII[185] = 64 ^ 35;
        lIlIIlIII[186] = (249 ^ 135) ^ (176 ^ 170);
        lIlIIlIII[187] = 99 ^ 6;
        lIlIIlIII[188] = (8 ^ 25) ^ (73 ^ 62);
        lIlIIlIII[189] = (-((-15379) & 32027)) & (-4609) & 24447;
        lIlIIlIII[190] = (-8713) & 12126;
        lIlIIlIII[191] = (-((-17517) & 26477)) & (-4225) & 16366;
        lIlIIlIII[192] = (-12353) & 15739;
        lIlIIlIII[193] = (-((-9347) & 30103)) & (-33) & 32637;
        lIlIIlIII[194] = (160 ^ 183) ^ (119 ^ 7);
        lIlIIlIII[195] = (-((-20545) & 31299)) & (-16385) & 32638;
        lIlIIlIII[196] = (-((-97) & 7797)) & (-4) & 32703;
        lIlIIlIII[197] = (-21553) & 22452;
        lIlIIlIII[198] = (-((-178) & 8379)) & (-7169) & 16319;
        lIlIIlIII[199] = (-((-9857) & 16098)) & (-16385) & 24575;
        lIlIIlIII[200] = (-3338) & 12287;
        lIlIIlIII[201] = (-16386) & 28363;
        lIlIIlIII[202] = (-4770) & 30719;
        lIlIIlIII[203] = (88 ^ 99) ^ (1 ^ 82);
        lIlIIlIII[204] = 87 ^ 62;
        lIlIIlIII[205] = (21 ^ 68) ^ (60 ^ 7);
        lIlIIlIII[206] = 242 ^ 153;
        lIlIIlIII[207] = (138 ^ 144) ^ (110 ^ 24);
        lIlIIlIII[208] = 42 ^ 71;
        lIlIIlIII[209] = (-((-4307) & 5363)) & (-20497) & 24255;
        lIlIIlIII[210] = (-24597) & 28061;
        lIlIIlIII[211] = (((21 + 45) - (-14)) + 113) ^ (((97 + 117) - 210) + 171);
        lIlIIlIII[212] = (-((-3245) & 31997)) & (-33) & 32253;
        lIlIIlIII[213] = 53 ^ 90;
        lIlIIlIII[214] = (-((-10717) & 31229)) & (-321) & 23543;
        lIlIIlIII[215] = (-99) & 3574;
        lIlIIlIII[216] = (20 ^ 94) ^ (120 ^ 66);
        lIlIIlIII[217] = (-20489) & 23198;
        lIlIIlIII[218] = (33 ^ 113) ^ (42 ^ 11);
        lIlIIlIII[219] = (-((-10985) & 16127)) & (-9) & 7871;
        lIlIIlIII[220] = (-((-16737) & 29563)) & (-16385) & 32703;
        lIlIIlIII[221] = 0 ^ 114;
        lIlIIlIII[222] = (-((-21542) & 30319)) & (-4097) & 16383;
        lIlIIlIII[223] = (-25154) & 28637;
        lIlIIlIII[224] = (216 ^ 156) ^ (53 ^ 2);
        lIlIIlIII[225] = (-4625) & 8127;
        lIlIIlIII[226] = (((119 + 213) - 255) + 163) ^ (((96 + 129) - 159) + 66);
        lIlIIlIII[227] = 245 ^ 128;
        lIlIIlIII[228] = (-((-2053) & 18510)) & (-8225) & 28159;
        lIlIIlIII[229] = (-((-3076) & 28191)) & (-4161) & 32767;
        lIlIIlIII[230] = (((208 + 209) - 207) + 45) ^ (((51 + 54) - 21) + 53);
        lIlIIlIII[231] = (-((-22445) & 30637)) & (-20545) & 32235;
        lIlIIlIII[232] = (127 ^ 46) ^ (87 ^ 113);
        lIlIIlIII[233] = (((197 + 229) - 421) + 239) ^ (((89 + 80) - 69) + 40);
        lIlIIlIII[234] = (-25153) & 28657;
        lIlIIlIII[235] = (-((-933) & 29695)) & (-1025) & 32254;
        lIlIIlIII[236] = (-9797) & 12270;
        lIlIIlIII[237] = (-((-8491) & 25515)) & (-12291) & 32751;
        lIlIIlIII[238] = (192 ^ 135) ^ (114 ^ 76);
    }

    private static boolean lIIIlIlIIIll(Object obj) {
        return obj != null;
    }

    private static String lIIIlIIIlIIl(String lllIlllllllIIl, String lllIlllllllIII) {
        try {
            SecretKeySpec lllIllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlllllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllllllIll = Cipher.getInstance("Blowfish");
            lllIlllllllIll.init(lIlIIlIII[3], lllIllllllllII);
            return new String(lllIlllllllIll.doFinal(Base64.getDecoder().decode(lllIlllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllllllIlI) {
            lllIlllllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIlll(int i, int i2) {
        return i == i2;
    }

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
        if (lIIIlIlIIIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[95]];
            if (lIIIlIlIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIIlIlIIIII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIlIIlIII[96], lIlIIlIII[52], lIlIIlIII[0]));
            "".length();
            Time.sleepTicks(lIlIIlIII[1]);
            "".length();
        }
        if (lIIIlIlIIlll(Players.getLocal().getAnimation(), lIlIIlIII[62]) && lIIIlIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIlIIlIII[1]];
            strArr[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIIIlIlIIIll(nearest) && lIIIlIlIIIII(dl() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[98]];
                System.out.println(lIlIIIlIl[lIlIIlIII[99]]);
                nearest.interact(lIlIIIlIl[lIlIIlIII[100]]);
                Time.sleepTicks(lIlIIlIII[10]);
                "".length();
            }
            if (lIIIlIlIIIlI(dl() ? 1 : 0)) {
                if (lIIIlIlIIIII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIlIIlIII[1]];
                    strArr2[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[102]];
                    TileObjects.getNearest(strArr2).interact(lIlIIIlIl[lIlIIlIII[103]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (((((138 + 143) - 133) + 62) ^ (((68 + 78) - 135) + 140)) & (((((137 + 185) - 105) + 28) ^ (((129 + 145) - 224) + 126)) ^ (-" ".length()))) != 0 ? ((((67 + 29) - (-45)) + 7) ^ (((13 + 128) - 128) + 141)) & (((((49 + 91) - 37) + 81) ^ (((57 + 171) - 118) + 72)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIlIIlIII[1]];
                    strArr3[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[105]];
                    TileObjects.getNearest(strArr3).interact(lIlIIIlIl[lIlIIlIII[106]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIlIIlIII[1]];
                    strArr4[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[108]];
                    TileObjects.getNearest(strArr4).interact(lIlIIIlIl[lIlIIlIII[109]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (((80 ^ 118) ^ (249 ^ 189)) & (((((17 + 85) - (-50)) + 98) ^ (((101 + 47) - 15) + 19)) ^ (-" ".length()))) != 0 ? ((((0 + 112) - 14) + 46) ^ (((94 + 148) - 189) + 116)) & (((128 ^ 142) ^ (23 ^ 32)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIlIIlIII[1]];
                    strArr5[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[111]];
                    TileObjects.getNearest(strArr5).interact(lIlIIIlIl[lIlIIlIII[112]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-" ".length()) >= (180 ^ 176) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIlIIlIII[1]];
                    strArr6[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[39]];
                    TileObjects.getNearest(strArr6).interact(lIlIIIlIl[lIlIIlIII[7]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIlIIlIII[1]];
                    iArr[lIlIIlIII[0]] = lIlIIlIII[115];
                    TileObjects.getNearest(iArr).interact(lIlIIIlIl[lIlIIlIII[116]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIlIIlIII[1]];
                    iArr2[lIlIIlIII[0]] = lIlIIlIII[118];
                    TileObjects.getNearest(iArr2).interact(lIlIIIlIl[lIlIIlIII[119]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-" ".length()) >= 0 ? ((114 ^ 50) ^ (75 ^ 5)) & (((108 ^ 72) ^ (12 ^ 38)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIlIIlIII[1]];
                    iArr3[lIlIIlIII[0]] = lIlIIlIII[121];
                    TileObjects.getNearest(iArr3).interact(lIlIIIlIl[lIlIIlIII[122]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return " ".length() < " ".length() ? ((37 ^ 13) ^ (138 ^ 158)) & (((132 ^ 171) ^ (215 ^ 196)) ^ (-" ".length())) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
                if (lIIIlIlIIIII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIlIIIlI(dl() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIlIl[lIlIIlIII[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIlIIlIII[1]];
                    strArr7[lIlIIlIII[0]] = lIlIIIlIl[lIlIIlIII[124]];
                    TileObjects.getNearest(strArr7).interact(lIlIIIlIl[lIlIIlIII[44]]);
                    Time.sleepUntil(() -> {
                        if (lIIIlIlIIlII(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIlIIlIII[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIIlIII[0];
                    }, lIlIIlIII[104]);
                    "".length();
                    Time.sleepTicks(lIlIIlIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIlIlIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (lIIIlIlIIllI(Skills.getBoostedLevel(Skill.AGILITY), lIlIIlIII[37])) {
            int[] iArr = new int[lIlIIlIII[1]];
            iArr[lIlIIlIII[0]] = lIlIIlIII[13];
            if (lIIIlIlIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIlIII[1]];
                iArr2[lIlIIlIII[0]] = lIlIIlIII[25];
                if (lIIIlIlIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIlIII[1]];
                    iArr3[lIlIIlIII[0]] = lIlIIlIII[23];
                    if (lIIIlIlIIIII(Inventory.contains(iArr3) ? 1 : 0) && ((!lIIIlIlIIIlI(Inventory.contains(item -> {
                        return item.getName().contains(lIlIIIlIl[lIlIIlIII[207]]);
                    }) ? 1 : 0) || lIIIlIlIIIII(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIlIIIlIl[lIlIIlIII[206]]);
                    }) ? 1 : 0)) && (!lIIIlIlIIIlI(Inventory.contains(C0005f.bf) ? 1 : 0) || lIIIlIlIIIII(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                        ?? r0 = lIlIIlIII[1];
                        "".length();
                        return (-" ".length()) > ((71 ^ 126) & ((21 ^ 44) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIlIIlIII[0];
        }
        int[] iArr4 = new int[lIlIIlIII[1]];
        iArr4[lIlIIlIII[0]] = lIlIIlIII[13];
        if (lIIIlIlIIIII(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIlIIlIII[1]];
            iArr5[lIlIIlIII[0]] = lIlIIlIII[15];
            if (lIIIlIlIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIIlIII[1]];
                iArr6[lIlIIlIII[0]] = lIlIIlIII[14];
                if (lIIIlIlIIIII(Inventory.contains(iArr6) ? 1 : 0) && ((!lIIIlIlIIIlI(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIlIIIlIl[lIlIIlIII[205]]);
                }) ? 1 : 0) || lIIIlIlIIIII(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIlIIIlIl[lIlIIlIII[204]]);
                }) ? 1 : 0)) && (!lIIIlIlIIIlI(Inventory.contains(C0005f.bf) ? 1 : 0) || lIIIlIlIIIII(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIlIIlIII[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r02;
                }
            }
        }
        return lIlIIlIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIlIII[0];
    }
}
