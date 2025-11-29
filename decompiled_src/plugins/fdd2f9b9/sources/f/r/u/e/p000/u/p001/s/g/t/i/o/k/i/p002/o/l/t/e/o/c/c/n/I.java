package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.I  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/I.class */
public class I implements G {
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ WorldArea iA;
    static /* synthetic */ WorldArea iz;
    private static /* synthetic */ String[] lIIIlIlIlI;
    private static /* synthetic */ int[] lIIIllIIII;
    static /* synthetic */ WorldArea iB;
    public static /* synthetic */ int iy;
    public static /* synthetic */ int ix;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int iw;
    private static /* synthetic */ WorldPoint iC;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cp() {
        if (lllIllIllIlI(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[0]];
            C0001b.a(bv);
            if (lllIllIllIll(bv.size(), lIIIllIIII[1])) {
                System.out.println(lIIIlIlIlI[lIIIllIIII[1]]);
                bt = lIIIllIIII[0];
            }
        }
        if (lllIllIlllII(bt ? 1 : 0) && lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[2])) {
            if (lllIllIlllII(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIllIlllIl(nearest) && lllIllIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[3]];
                    if (lllIllIllIlI(new WorldArea(lIIIllIIII[4], lIIIllIIII[5], lIIIllIIII[6], lIIIllIIII[7], lIIIllIIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIIllIIII[8], lIIIllIIII[9], lIIIllIIII[0]);
                        if (lllIllIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIII[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIIllIIII[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lllIllIlllIl(nearest) && lllIllIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[10]];
                    if (lllIllIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllIIII[11]);
                        "".length();
                    }
                    if (lllIllIllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lllIllIlllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllIIII[1]);
                            "".length();
                        }
                        if (lllIllIlllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllIIII[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIIllIIII[12]];
                    iArr[lIIIllIIII[0]] = lIIIllIIII[13];
                    iArr[lIIIllIIII[1]] = lIIIllIIII[14];
                    iArr[lIIIllIIII[3]] = lIIIllIIII[15];
                    iArr[lIIIllIIII[10]] = lIIIllIIII[16];
                    iArr[lIIIllIIII[17]] = lIIIllIIII[18];
                    iArr[lIIIllIIII[2]] = lIIIllIIII[19];
                    iArr[lIIIllIIII[20]] = lIIIllIIII[21];
                    iArr[lIIIllIIII[22]] = lIIIllIIII[23];
                    iArr[lIIIllIIII[24]] = lIIIllIIII[25];
                    iArr[lIIIllIIII[26]] = lIIIllIIII[27];
                    if (lllIllIlllII(C0004e.b(iArr) ? 1 : 0)) {
                        af();
                        System.out.println(lIIIlIlIlI[lIIIllIIII[17]]);
                        bt = lIIIllIIII[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIIllIIII[12]];
                    iArr2[lIIIllIIII[0]] = lIIIllIIII[13];
                    iArr2[lIIIllIIII[1]] = lIIIllIIII[14];
                    iArr2[lIIIllIIII[3]] = lIIIllIIII[15];
                    iArr2[lIIIllIIII[10]] = lIIIllIIII[16];
                    iArr2[lIIIllIIII[17]] = lIIIllIIII[18];
                    iArr2[lIIIllIIII[2]] = lIIIllIIII[19];
                    iArr2[lIIIllIIII[20]] = lIIIllIIII[21];
                    iArr2[lIIIllIIII[22]] = lIIIllIIII[23];
                    iArr2[lIIIllIIII[24]] = lIIIllIIII[25];
                    iArr2[lIIIllIIII[26]] = lIIIllIIII[27];
                    if (lllIllIllIlI(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIIllIIII[28], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[29], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[30], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[31], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[32], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[33], lIIIllIIII[1]);
                        C0000a.a(lIIIllIIII[34], lIIIllIIII[1]);
                        int[] iArr3 = new int[lIIIllIIII[1]];
                        iArr3[lIIIllIIII[0]] = lIIIllIIII[28];
                        if (lllIllIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIllIIII[1]];
                            iArr4[lIIIllIIII[0]] = lIIIllIIII[28];
                            if (lllIllIlllII(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIIllIIII[1]];
                                iArr5[lIIIllIIII[0]] = lIIIllIIII[28];
                                if (lllIllIlllII(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIIllIIII[35], lIIIllIIII[1]);
                                }
                            }
                        }
                        C0000a.a(lIIIllIIII[18], lIIIllIIII[1]);
                        C0004e.l(lIIIllIIII[28]);
                        C0004e.l(lIIIllIIII[29]);
                        C0004e.l(lIIIllIIII[30]);
                        C0004e.l(lIIIllIIII[31]);
                        C0004e.l(lIIIllIIII[32]);
                        Time.sleepTicks(lIIIllIIII[1]);
                        "".length();
                        C0004e.l(lIIIllIIII[34]);
                        C0004e.l(lIIIllIIII[36]);
                        C0004e.l(lIIIllIIII[33]);
                        C0004e.l(lIIIllIIII[35]);
                        C0004e.l(lIIIllIIII[18]);
                        Time.sleepTicks(lIIIllIIII[10]);
                        "".length();
                        if (lllIllIlllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIIllIIII[20]);
                            "".length();
                        }
                        if (lllIllIllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[37])) {
                                C0000a.a(lIIIllIIII[13], lIIIllIIII[12]);
                                C0000a.a(lIIIllIIII[14], lIIIllIIII[12]);
                                C0000a.a(lIIIllIIII[21], lIIIllIIII[12]);
                                C0000a.a(lIIIllIIII[15], lIIIllIIII[12]);
                                C0000a.b(C0005f.bf, lIIIllIIII[1]);
                                C0000a.a(lIIIllIIII[27], lIIIllIIII[1]);
                                C0000a.a(lIIIllIIII[19], lIIIllIIII[2]);
                                C0000a.a(lIIIllIIII[23], lIIIllIIII[38]);
                            }
                            if (lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[37])) {
                                C0000a.a(lIIIllIIII[13], lIIIllIIII[12]);
                                C0000a.a(lIIIllIIII[21], lIIIllIIII[12]);
                                C0000a.a(lIIIllIIII[25], lIIIllIIII[12]);
                                C0000a.b(C0005f.bf, lIIIllIIII[1]);
                                C0000a.a(lIIIllIIII[27], lIIIllIIII[1]);
                                C0000a.a(lIIIllIIII[19], lIIIllIIII[24]);
                                C0000a.a(lIIIllIIII[23], lIIIllIIII[12]);
                            }
                        }
                    }
                }
            }
            if (lllIllIllIlI(ab() ? 1 : 0)) {
                String[] strArr = new String[lIIIllIIII[1]];
                strArr[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[2]];
                if (lllIllIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIllIIII[1]];
                    strArr2[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[20]];
                    Inventory.getFirst(strArr2).interact(lIIIlIlIlI[lIIIllIIII[22]]);
                }
                if (lllIllIllIlI(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIllIllIll(Movement.getRunEnergy(), lIIIllIIII[39])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIIlIlIlI[lIIIllIIII[24]]);
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllllI(Combat.getMissingHealth(), lIIIllIIII[40])) {
                    int[] iArr6 = new int[lIIIllIIII[1]];
                    iArr6[lIIIllIIII[0]] = lIIIllIIII[23];
                    if (lllIllIllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIllIIII[1]];
                        iArr7[lIIIllIIII[0]] = lIIIllIIII[23];
                        Inventory.getFirst(iArr7).interact(lIIIlIlIlI[lIIIllIIII[26]]);
                        Time.sleepTicks(lIIIllIIII[3]);
                        "".length();
                    }
                }
                if (lllIllIllllI(Movement.getRunEnergy(), lIIIllIIII[41]) && lllIllIlllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[42])) {
                    cq();
                }
                if ((!lllIlllIIIII(C0004e.j(lIIIllIIII[43]), lIIIllIIII[44]) || lllIllIllIll(C0004e.j(lIIIllIIII[45]), lIIIllIIII[2])) && lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[42]) && lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[44])) {
                    cr();
                }
                if (lllIlllIIIII(C0004e.j(lIIIllIIII[43]), lIIIllIIII[44]) && lllIlllIIIII(C0004e.j(lIIIllIIII[45]), lIIIllIIII[2])) {
                    if (lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[42]) && lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[37])) {
                        cr();
                    }
                    if (lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[37]) && lllIllIllIll(Skills.getLevel(Skill.AGILITY), lIIIllIIII[44])) {
                        cs();
                    }
                }
                if (lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[44])) {
                    ct();
                }
            }
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIlIlI[lIIIllIIII[203]];
    }

    private static void cq() {
        new WorldArea(lIIIllIIII[46], lIIIllIIII[47], lIIIllIIII[12], lIIIllIIII[20], lIIIllIIII[0]);
        WorldArea worldArea = new WorldArea(lIIIllIIII[46], lIIIllIIII[48], lIIIllIIII[49], lIIIllIIII[24], lIIIllIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIllIIII[46], lIIIllIIII[50], lIIIllIIII[49], lIIIllIIII[24], lIIIllIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIllIIII[51], lIIIllIIII[52], lIIIllIIII[53], lIIIllIIII[54], lIIIllIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIllIIII[55], lIIIllIIII[56], lIIIllIIII[24], lIIIllIIII[12], lIIIllIIII[3]);
        WorldArea worldArea5 = new WorldArea(lIIIllIIII[57], lIIIllIIII[58], lIIIllIIII[49], lIIIllIIII[12], lIIIllIIII[0]);
        WorldArea worldArea6 = new WorldArea(lIIIllIIII[59], lIIIllIIII[60], lIIIllIIII[12], lIIIllIIII[20], lIIIllIIII[0]);
        WorldArea worldArea7 = new WorldArea(lIIIllIIII[46], lIIIllIIII[47], lIIIllIIII[61], lIIIllIIII[20], lIIIllIIII[0]);
        if (lllIllIlllII(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[12]];
            C0004e.b(iC);
            Time.sleepTicks(lIIIllIIII[1]);
            "".length();
        }
        if (!(lllIllIlllII(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllIllIllIlI(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIlllIIIIl(Players.getLocal().getAnimation(), lIIIllIIII[62]) && lllIllIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lllIllIllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[49]];
                String[] strArr = new String[lIIIllIIII[1]];
                strArr[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[63]];
                TileObjects.getNearest(strArr).interact(lIIIlIlIlI[lIIIllIIII[64]]);
                Time.sleepTicks(lIIIllIIII[3]);
                "".length();
            }
            if (lllIllIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[53]];
                String[] strArr2 = new String[lIIIllIIII[1]];
                strArr2[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[38]];
                TileObjects.getNearest(strArr2).interact(lIIIlIlIlI[lIIIllIIII[65]]);
                Time.sleepTicks(lIIIllIIII[3]);
                "".length();
            }
            if (lllIllIllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[66]];
                String[] strArr3 = new String[lIIIllIIII[1]];
                strArr3[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[54]];
                TileObjects.getNearest(strArr3).interact(lIIIlIlIlI[lIIIllIIII[67]]);
                Time.sleepTicks(lIIIllIIII[3]);
                "".length();
            }
            if (lllIllIllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[40]];
                String[] strArr4 = new String[lIIIllIIII[1]];
                strArr4[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[68]];
                TileObjects.getNearest(strArr4).interact(lIIIlIlIlI[lIIIllIIII[61]]);
                Time.sleepTicks(lIIIllIIII[2]);
                "".length();
            }
            if (lllIllIllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[69]];
                String[] strArr5 = new String[lIIIllIIII[1]];
                strArr5[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[70]];
                TileObjects.getNearest(strArr5).interact(lIIIlIlIlI[lIIIllIIII[41]]);
                Time.sleepTicks(lIIIllIIII[17]);
                "".length();
            }
            if (lllIllIllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[71]];
                String[] strArr6 = new String[lIIIllIIII[1]];
                strArr6[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[72]];
                TileObjects.getNearest(strArr6).interact(lIIIlIlIlI[lIIIllIIII[73]]);
                Time.sleepTicks(lIIIllIIII[10]);
                "".length();
            }
            if (lllIllIllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[74]];
                String[] strArr7 = new String[lIIIllIIII[1]];
                strArr7[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[42]];
                TileObjects.getNearest(strArr7).interact(lIIIlIlIlI[lIIIllIIII[75]]);
                Time.sleepTicks(lIIIllIIII[17]);
                "".length();
            }
        }
    }

    private static boolean lllIllIlllII(int i) {
        return i == 0;
    }

    private static boolean lllIllIlllIl(Object obj) {
        return obj != null;
    }

    private static String lllIlIlllIlI(String lIIIIIlllIll, String lIIIIIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIIII[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIllIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIllllII) {
            lIIIIIllllII.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlllIll(String lIIIIllIIIII, String lIIIIlIlllll) {
        try {
            SecretKeySpec lIIIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIllIIIlI = Cipher.getInstance("Blowfish");
            lIIIIllIIIlI.init(lIIIllIIII[3], lIIIIllIIIll);
            return new String(lIIIIllIIIlI.doFinal(Base64.getDecoder().decode(lIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIllIIIIl) {
            lIIIIllIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIllIIII[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cp();
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return (208 ^ 158) & ((120 ^ 54) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllIIII[186];
    }

    private static void ct() {
        WorldArea worldArea = new WorldArea(lIIIllIIII[162], lIIIllIIII[163], lIIIllIIII[111], lIIIllIIII[111], lIIIllIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIllIIII[162], lIIIllIIII[163], lIIIllIIII[111], lIIIllIIII[111], lIIIllIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIllIIII[162], lIIIllIIII[163], lIIIllIIII[111], lIIIllIIII[111], lIIIllIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIllIIII[162], lIIIllIIII[163], lIIIllIIII[111], lIIIllIIII[111], lIIIllIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIllIIII[164], lIIIllIIII[133], lIIIllIIII[64], lIIIllIIII[12], lIIIllIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIllIIII[165], lIIIllIIII[139], lIIIllIIII[38], lIIIllIIII[53], lIIIllIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIllIIII[166], lIIIllIIII[134], lIIIllIIII[49], lIIIllIIII[26], lIIIllIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIllIIII[167], lIIIllIIII[136], lIIIllIIII[70], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIllIIII[168], lIIIllIIII[169], lIIIllIIII[54], lIIIllIIII[63], lIIIllIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIllIIII[170], lIIIllIIII[171], lIIIllIIII[0]);
        if (lllIllIllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllIllIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIllIIII[1]);
            "".length();
        }
        if (lllIllIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIllIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIII[20])) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIllIIII[1]);
                "".length();
            }
            if (lllIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIII[20])) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIllIIII[1]];
                strArr[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[175]];
                TileObjects.getNearest(strArr).interact(lIIIlIlIlI[lIIIllIIII[35]]);
                Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                }, lIIIllIIII[104]);
                "".length();
                Time.sleepTicks(lIIIllIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIllIIII[1]];
        strArr2[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lllIllIlllIl(nearest) && lllIllIllIlI(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[177]];
            System.out.println(lIIIlIlIlI[lIIIllIIII[178]]);
            nearest.interact(lIIIlIlIlI[lIIIllIIII[179]]);
            Time.sleepTicks(lIIIllIIII[10]);
            "".length();
        }
        if (lllIllIlllII(cu() ? 1 : 0)) {
            if (lllIllIllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lllIllIllIlI(tileObject.getName().contains(lIIIlIlIlI[lIIIllIIII[218]]) ? 1 : 0) && lllIlllIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[219], lIIIllIIII[220], lIIIllIIII[10])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (" ".length() & (" ".length() ^ (-1))) > ((225 ^ 191) & ((120 ^ 38) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[180]];
                    nearest2.interact(lIIIlIlIlI[lIIIllIIII[79]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return ((254 ^ 175) & ((250 ^ 171) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lllIllIllIlI(tileObject2.getName().contains(lIIIlIlIlI[lIIIllIIII[216]]) ? 1 : 0) && lllIlllIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[217], lIIIllIIII[128], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return "   ".length() != "   ".length() ? ((105 ^ 8) ^ (121 ^ 55)) & (((165 ^ 196) ^ (141 ^ 195)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest3)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIlIlIlI[lIIIllIIII[182]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return ((220 ^ 190) & ((84 ^ 54) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lllIllIllIlI(tileObject3.getName().contains(lIIIlIlIlI[lIIIllIIII[213]]) ? 1 : 0) && lllIlllIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[214], lIIIllIIII[215], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (((37 ^ 18) ^ (15 ^ 107)) & (((((170 + 7) - 168) + 210) ^ (((64 + 70) - 97) + 99)) ^ (-" ".length()))) < 0 ? ((((66 + 39) - 50) + 107) ^ (((101 + 117) - 128) + 38)) & (((52 ^ 91) ^ (68 ^ 9)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest4)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIlIlIlI[lIIIllIIII[184]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lllIllIllIlI(tileObject4.getName().contains(lIIIlIlIlI[lIIIllIIII[211]]) ? 1 : 0) && lllIlllIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[209], lIIIllIIII[212], lIIIllIIII[10])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest5)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIlIlIlI[lIIIllIIII[186]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) > ((202 ^ 136) & ((47 ^ 109) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (!lllIllIllIlI(cu() ? 1 : 0) && lllIllIllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lllIllIllIlI(tileObject5.getName().contains(lIIIlIlIlI[lIIIllIIII[208]]) ? 1 : 0) && lllIlllIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[209], lIIIllIIII[210], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (((249 ^ 137) ^ (227 ^ 176)) & (((149 ^ 184) ^ (81 ^ 95)) ^ (-" ".length()))) > 0 ? ((3 ^ 45) ^ (138 ^ 141)) & (((((55 + 30) - 70) + 170) ^ (((131 + 139) - 180) + 54)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest6)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIlIlIlI[lIIIllIIII[188]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static void cr() {
        WorldArea worldArea = new WorldArea(lIIIllIIII[76], lIIIllIIII[77], lIIIllIIII[78], lIIIllIIII[79], lIIIllIIII[1]);
        WorldArea worldArea2 = new WorldArea(lIIIllIIII[76], lIIIllIIII[77], lIIIllIIII[78], lIIIllIIII[79], lIIIllIIII[3]);
        WorldArea worldArea3 = new WorldArea(lIIIllIIII[76], lIIIllIIII[77], lIIIllIIII[78], lIIIllIIII[79], lIIIllIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIllIIII[80], lIIIllIIII[81], lIIIllIIII[69], lIIIllIIII[64], lIIIllIIII[0]);
        WorldArea worldArea5 = new WorldArea(lIIIllIIII[82], lIIIllIIII[81], lIIIllIIII[12], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIllIIII[83], lIIIllIIII[84], lIIIllIIII[63], lIIIllIIII[49], lIIIllIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIllIIII[85], lIIIllIIII[86], lIIIllIIII[26], lIIIllIIII[22], lIIIllIIII[1]);
        WorldArea worldArea8 = new WorldArea(lIIIllIIII[85], lIIIllIIII[87], lIIIllIIII[12], lIIIllIIII[24], lIIIllIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIllIIII[88], lIIIllIIII[89], lIIIllIIII[75], lIIIllIIII[40], lIIIllIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIllIIII[90], lIIIllIIII[91], lIIIllIIII[66], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIllIIII[92], lIIIllIIII[93], lIIIllIIII[22], lIIIllIIII[26], lIIIllIIII[10]);
        WorldArea worldArea12 = new WorldArea(lIIIllIIII[92], lIIIllIIII[94], lIIIllIIII[12], lIIIllIIII[22], lIIIllIIII[10]);
        if (lllIllIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[95]];
            if (lllIllIllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lllIllIllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIIllIIII[96], lIIIllIIII[52], lIIIllIIII[0]));
            "".length();
            Time.sleepTicks(lIIIllIIII[1]);
            "".length();
        }
        if (lllIlllIIIIl(Players.getLocal().getAnimation(), lIIIllIIII[62]) && lllIllIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIIllIIII[1]];
            strArr[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lllIllIlllIl(nearest) && lllIllIllIlI(cu() ? 1 : 0)) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[98]];
                System.out.println(lIIIlIlIlI[lIIIllIIII[99]]);
                nearest.interact(lIIIlIlIlI[lIIIllIIII[100]]);
                Time.sleepTicks(lIIIllIIII[10]);
                "".length();
            }
            if (lllIllIlllII(cu() ? 1 : 0)) {
                if (lllIllIllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIIllIIII[1]];
                    strArr2[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[102]];
                    TileObjects.getNearest(strArr2).interact(lIIIlIlIlI[lIIIllIIII[103]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIIllIIII[1]];
                    strArr3[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[105]];
                    TileObjects.getNearest(strArr3).interact(lIIIlIlIlI[lIIIllIIII[106]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) == (138 ^ 142) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIIllIIII[1]];
                    strArr4[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[108]];
                    TileObjects.getNearest(strArr4).interact(lIIIlIlIlI[lIIIllIIII[109]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return 0 != 0 ? ((((37 + 151) - (-11)) + 20) ^ (((77 + 151) - 155) + 123)) & (((92 ^ 80) ^ (83 ^ 64)) ^ (-" ".length())) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIIllIIII[1]];
                    strArr5[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[111]];
                    TileObjects.getNearest(strArr5).interact(lIIIlIlIlI[lIIIllIIII[112]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return " ".length() < 0 ? ((150 ^ 181) ^ (11 ^ 121)) & (((239 ^ 155) ^ (16 ^ 53)) ^ (-" ".length())) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIIllIIII[1]];
                    strArr6[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[39]];
                    TileObjects.getNearest(strArr6).interact(lIIIlIlIlI[lIIIllIIII[7]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (110 ^ 106) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIIllIIII[1]];
                    iArr[lIIIllIIII[0]] = lIIIllIIII[115];
                    TileObjects.getNearest(iArr).interact(lIIIlIlIlI[lIIIllIIII[116]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIIllIIII[1]];
                    iArr2[lIIIllIIII[0]] = lIIIllIIII[118];
                    TileObjects.getNearest(iArr2).interact(lIIIlIlIlI[lIIIllIIII[119]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) >= ((245 ^ 176) & ((10 ^ 79) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIIllIIII[1]];
                    iArr3[lIIIllIIII[0]] = lIIIllIIII[121];
                    TileObjects.getNearest(iArr3).interact(lIIIlIlIlI[lIIIllIIII[122]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
                if (lllIllIllIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIIllIIII[1]];
                    strArr7[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[124]];
                    TileObjects.getNearest(strArr7).interact(lIIIlIlIlI[lIIIllIIII[44]]);
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return "   ".length() != "   ".length() ? ((((230 + 226) - 287) + 73) ^ (((119 + 113) - 46) + 3)) & (((72 ^ 3) ^ (113 ^ 117)) ^ (-" ".length())) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllIlllIIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    private static boolean cu() {
        WorldArea worldArea = new WorldArea(lIIIllIIII[80], lIIIllIIII[81], lIIIllIIII[69], lIIIllIIII[64], lIIIllIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIllIIII[82], lIIIllIIII[81], lIIIllIIII[12], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea3 = new WorldArea(lIIIllIIII[83], lIIIllIIII[84], lIIIllIIII[63], lIIIllIIII[49], lIIIllIIII[10]);
        WorldArea worldArea4 = new WorldArea(lIIIllIIII[189], lIIIllIIII[190], lIIIllIIII[24], lIIIllIIII[2], lIIIllIIII[1]);
        WorldArea worldArea5 = new WorldArea(lIIIllIIII[85], lIIIllIIII[87], lIIIllIIII[12], lIIIllIIII[24], lIIIllIIII[10]);
        WorldArea worldArea6 = new WorldArea(lIIIllIIII[191], lIIIllIIII[192], lIIIllIIII[73], lIIIllIIII[38], lIIIllIIII[10]);
        WorldArea worldArea7 = new WorldArea(lIIIllIIII[90], lIIIllIIII[91], lIIIllIIII[66], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea8 = new WorldArea(lIIIllIIII[92], lIIIllIIII[93], lIIIllIIII[22], lIIIllIIII[26], lIIIllIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIllIIII[92], lIIIllIIII[94], lIIIllIIII[12], lIIIllIIII[22], lIIIllIIII[10]);
        WorldArea worldArea10 = new WorldArea(lIIIllIIII[127], lIIIllIIII[128], lIIIllIIII[49], lIIIllIIII[12], lIIIllIIII[3]);
        WorldArea worldArea11 = new WorldArea(lIIIllIIII[129], lIIIllIIII[127], lIIIllIIII[49], lIIIllIIII[24], lIIIllIIII[3]);
        WorldArea worldArea12 = new WorldArea(lIIIllIIII[130], lIIIllIIII[131], lIIIllIIII[63], lIIIllIIII[49], lIIIllIIII[3]);
        WorldArea worldArea13 = new WorldArea(lIIIllIIII[132], lIIIllIIII[133], lIIIllIIII[12], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea14 = new WorldArea(lIIIllIIII[134], lIIIllIIII[9], lIIIllIIII[49], lIIIllIIII[26], lIIIllIIII[3]);
        WorldArea worldArea15 = new WorldArea(lIIIllIIII[135], lIIIllIIII[136], lIIIllIIII[68], lIIIllIIII[53], lIIIllIIII[10]);
        WorldArea worldArea16 = new WorldArea(lIIIllIIII[137], lIIIllIIII[138], lIIIllIIII[63], lIIIllIIII[64], lIIIllIIII[3]);
        WorldArea worldArea17 = new WorldArea(lIIIllIIII[164], lIIIllIIII[133], lIIIllIIII[64], lIIIllIIII[12], lIIIllIIII[10]);
        WorldArea worldArea18 = new WorldArea(lIIIllIIII[165], lIIIllIIII[139], lIIIllIIII[38], lIIIllIIII[53], lIIIllIIII[3]);
        WorldArea worldArea19 = new WorldArea(lIIIllIIII[166], lIIIllIIII[134], lIIIllIIII[49], lIIIllIIII[26], lIIIllIIII[3]);
        WorldArea worldArea20 = new WorldArea(lIIIllIIII[167], lIIIllIIII[136], lIIIllIIII[70], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea21 = new WorldArea(lIIIllIIII[168], lIIIllIIII[169], lIIIllIIII[54], lIIIllIIII[63], lIIIllIIII[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIIIllIIII[68]];
        worldAreaArr[lIIIllIIII[0]] = worldArea;
        worldAreaArr[lIIIllIIII[1]] = worldArea2;
        worldAreaArr[lIIIllIIII[3]] = worldArea3;
        worldAreaArr[lIIIllIIII[10]] = worldArea4;
        worldAreaArr[lIIIllIIII[17]] = worldArea5;
        worldAreaArr[lIIIllIIII[2]] = worldArea6;
        worldAreaArr[lIIIllIIII[20]] = worldArea7;
        worldAreaArr[lIIIllIIII[22]] = worldArea8;
        worldAreaArr[lIIIllIIII[24]] = worldArea9;
        worldAreaArr[lIIIllIIII[26]] = worldArea10;
        worldAreaArr[lIIIllIIII[12]] = worldArea11;
        worldAreaArr[lIIIllIIII[49]] = worldArea12;
        worldAreaArr[lIIIllIIII[63]] = worldArea13;
        worldAreaArr[lIIIllIIII[64]] = worldArea14;
        worldAreaArr[lIIIllIIII[53]] = worldArea15;
        worldAreaArr[lIIIllIIII[38]] = worldArea16;
        worldAreaArr[lIIIllIIII[65]] = worldArea17;
        worldAreaArr[lIIIllIIII[66]] = worldArea18;
        worldAreaArr[lIIIllIIII[54]] = worldArea19;
        worldAreaArr[lIIIllIIII[67]] = worldArea20;
        worldAreaArr[lIIIllIIII[40]] = worldArea21;
        int[] iArr = new int[lIIIllIIII[1]];
        iArr[lIIIllIIII[0]] = lIIIllIIII[193];
        if (lllIllIlllIl(TileItems.getNearest(iArr))) {
            System.out.println(lIIIlIlIlI[lIIIllIIII[194]]);
            int i = lIIIllIIII[0];
            while (lllIllIllIll(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[lIIIllIIII[1]];
                iArr2[lIIIllIIII[0]] = lIIIllIIII[193];
                if (lllIllIllIlI(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lllIllIllIlI(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIIllIIII[1];
                }
                i++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIIllIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIlllIIIII(Skills.getLevel(Skill.AGILITY), lIIIllIIII[2])) {
            ?? r0 = lIIIllIIII[1];
            "".length();
            return (-" ".length()) >= (150 ^ 146) ? " ".length() & (" ".length() ^ (-1)) : r0;
        }
        return lIIIllIIII[0];
    }

    private static boolean lllIlllIIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlllIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static String lllIlIllllII(String lIIIIlIlIIII, String lIIIIlIIllll) {
        String str = new String(Base64.getDecoder().decode(lIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIlllI = new StringBuilder();
        char[] charArray = lIIIIlIIllll.toCharArray();
        int lIIIIlIIIlll = lIIIllIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIIII[0];
        while (lllIllIllIll(i, length)) {
            char lIIIIlIlIIIl = charArray2[i];
            lIIIIlIIlllI.append((char) (lIIIIlIlIIIl ^ charArray[lIIIIlIIIlll % charArray.length]));
            "".length();
            lIIIIlIIIlll++;
            i++;
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIIlIIlllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (lllIlllIIIII(Skills.getBoostedLevel(Skill.AGILITY), lIIIllIIII[37])) {
            int[] iArr = new int[lIIIllIIII[1]];
            iArr[lIIIllIIII[0]] = lIIIllIIII[13];
            if (lllIllIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllIIII[1]];
                iArr2[lIIIllIIII[0]] = lIIIllIIII[25];
                if (lllIllIllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIllIIII[1]];
                    iArr3[lIIIllIIII[0]] = lIIIllIIII[23];
                    if (lllIllIllIlI(Inventory.contains(iArr3) ? 1 : 0) && ((!lllIllIlllII(Inventory.contains(item -> {
                        return item.getName().contains(lIIIlIlIlI[lIIIllIIII[207]]);
                    }) ? 1 : 0) || lllIllIllIlI(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIIlIlIlI[lIIIllIIII[206]]);
                    }) ? 1 : 0)) && (!lllIllIlllII(Inventory.contains(C0005f.bf) ? 1 : 0) || lllIllIllIlI(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return ((191 ^ 179) & ((123 ^ 119) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIIIllIIII[0];
        }
        int[] iArr4 = new int[lIIIllIIII[1]];
        iArr4[lIIIllIIII[0]] = lIIIllIIII[13];
        if (lllIllIllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIIllIIII[1]];
            iArr5[lIIIllIIII[0]] = lIIIllIIII[15];
            if (lllIllIllIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIllIIII[1]];
                iArr6[lIIIllIIII[0]] = lIIIllIIII[14];
                if (lllIllIllIlI(Inventory.contains(iArr6) ? 1 : 0) && ((!lllIllIlllII(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIIlIlIlI[lIIIllIIII[205]]);
                }) ? 1 : 0) || lllIllIllIlI(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIIlIlIlI[lIIIllIIII[204]]);
                }) ? 1 : 0)) && (!lllIllIlllII(Inventory.contains(C0005f.bf) ? 1 : 0) || lllIllIllIlI(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIIIllIIII[1];
                    "".length();
                    return (-"  ".length()) > 0 ? ((3 ^ 95) ^ (218 ^ 175)) & (((((166 + 80) - 72) + 14) ^ (((67 + 98) - 106) + 90)) ^ (-" ".length())) : r02;
                }
            }
        }
        return lIIIllIIII[0];
    }

    private static void lllIllIIlllI() {
        lIIIlIlIlI = new String[lIIIllIIII[238]];
        lIIIlIlIlI[lIIIllIIII[0]] = lllIlIlllIlI("GYNd63ciOeGD1upVNksXYA==", "ZsEtH");
        lIIIlIlIlI[lIIIllIIII[1]] = lllIlIlllIll("WoVZcsBfevLgcRJguSuOfggwPdWxEUYmKfvRQzVqQirJz1/DYwzsMXKD4QfWKKh+TpYNb5F6zTE=", "uHnGa");
        lIIIlIlIlI[lIIIllIIII[3]] = lllIlIlllIll("Pnvw3rbxoaFZGwAkhRSDB9tdJ/Z1eBpw", "azNQA");
        lIIIlIlIlI[lIIIllIIII[10]] = lllIlIllllII("GxI6MwI6HTN3DDIdPz4ANA==", "SsTWn");
        lIIIlIlIlI[lIIIllIIII[17]] = lllIlIlllIll("aNDedd56w6c2BTpnLc0h0jDmftFqAszMOWzre0YTtBBh2x4PaWPRh6Y9o0Ns+1Rz2KsKqbS9XZU=", "AVTyN");
        lIIIlIlIlI[lIIIllIIII[2]] = lllIlIlllIlI("R5x7qPR/ewQ=", "IUfup");
        lIIIlIlIlI[lIIIllIIII[20]] = lllIlIlllIlI("Il1+HbdJj70=", "FFIIG");
        lIIIlIlIlI[lIIIllIIII[22]] = lllIlIlllIlI("bGnJ+wRSVUA=", "MBtcP");
        lIIIlIlIlI[lIIIllIIII[24]] = lllIlIllllII("ABUnDSE=", "DgNcJ");
        lIIIlIlIlI[lIIIllIIII[26]] = lllIlIlllIll("FMLnFwY9HTw=", "AMFNA");
        lIIIlIlIlI[lIIIllIIII[12]] = lllIlIllllII("FwQzSyQ2RSIFPzQAZQg/LBc2Dg==", "YeEkP");
        lIIIlIlIlI[lIIIllIIII[49]] = lllIlIlllIll("KxeXFX3UNS/3l+YERuiyTA==", "OVKWu");
        lIIIlIlIlI[lIIIllIIII[63]] = lllIlIllllII("JAQNcy4JBws9Lw0=", "hkjSL");
        lIIIlIlIlI[lIIIllIIII[64]] = lllIlIlllIlI("oSPeqVibBpfTucRgYmk9Lw==", "kDsIw");
        lIIIlIlIlI[lIIIllIIII[53]] = lllIlIlllIlI("yuM9ExFVU1V6HvYRWffGmQ==", "xCVHp");
        lIIIlIlIlI[lIIIllIIII[38]] = lllIlIllllII("OhobAxIWFA1XHRAM", "uxhws");
        lIIIlIlIlI[lIIIllIIII[65]] = lllIlIllllII("Ah4KHThsHRUVKA==", "ArcpZ");
        lIIIlIlIlI[lIIIllIIII[66]] = lllIlIlllIlI("a1fDqQedQN23b37jZ9rCfQ==", "vdTAh");
        lIIIlIlIlI[lIIIllIIII[54]] = lllIlIllllII("BCYQNm4yJhQ9LTg=", "PTuSN");
        lIIIlIlIlI[lIIIllIIII[67]] = lllIlIllllII("MTgeIjY=", "rTwOT");
        lIIIlIlIlI[lIIIllIIII[40]] = lllIlIllllII("OjAbHBoQLBNPGxYyEQ==", "yBtoi");
        lIIIlIlIlI[lIIIllIIII[68]] = lllIlIlllIlI("stbLAnqgrGMn4AzQwU7sFQ==", "vUnAE");
        lIIIlIlIlI[lIIIllIIII[61]] = lllIlIlllIll("n6+rdyCsByQ=", "NMsMS");
        lIIIlIlIlI[lIIIllIIII[69]] = lllIlIlllIlI("56yoZpS6XWYvJJvZs0bu7Q==", "XAOJw");
        lIIIlIlIlI[lIIIllIIII[70]] = lllIlIlllIll("UioDf7yPLoAzmBJ0KDezgQ==", "mLQsF");
        lIIIlIlIlI[lIIIllIIII[41]] = lllIlIlllIll("2l5pVsH9E7OgwX5HQN8qaw==", "GKeIS");
        lIIIlIlIlI[lIIIllIIII[71]] = lllIlIlllIlI("/c7PYrMgMVexAd+kFPCTKQ==", "izbAB");
        lIIIlIlIlI[lIIIllIIII[72]] = lllIlIlllIlI("L32FVCH5z8HYaSm5v/bCtw==", "AwWfv");
        lIIIlIlIlI[lIIIllIIII[73]] = lllIlIllllII("OQo6IBdXCSUoBw==", "zfSMu");
        lIIIlIlIlI[lIIIllIIII[74]] = lllIlIllllII("NAAGFQEeHA5GAh4CDA==", "wrifr");
        lIIIlIlIlI[lIIIllIIII[42]] = lllIlIlllIll("y+gY8moRe58Z8QeZNH3YrA==", "dphPV");
        lIIIlIlIlI[lIIIllIIII[75]] = lllIlIlllIll("hX7Szm3PLO4wzi1c+kVAxQ==", "XxErQ");
        lIIIlIlIlI[lIIIllIIII[95]] = lllIlIllllII("IiIHZhgDYwIyDR43", "lCqFl");
        lIIIlIlIlI[lIIIllIIII[97]] = lllIlIlllIlI("q6m/b7zW5xWTcou3twTloQ==", "MGrIf");
        lIIIlIlIlI[lIIIllIIII[98]] = lllIlIlllIlI("dJ/g5/UCz8Ap97nrfDtamw==", "KQfwx");
        lIIIlIlIlI[lIIIllIIII[99]] = lllIlIlllIll("K3exPPAPjB1isEaJ/ZrF276R561NTTKh", "BKLXv");
        lIIIlIlIlI[lIIIllIIII[100]] = lllIlIlllIlI("LdIrV8B1mGA=", "SJvZC");
        lIIIlIlIlI[lIIIllIIII[101]] = lllIlIllllII("JzMFJhMdKQN0BBsyFicC", "tGdTg");
        lIIIlIlIlI[lIIIllIIII[102]] = lllIlIlllIlI("HqxQJV+b2n7ialbSfTMzmA==", "vdkay");
        lIIIlIlIlI[lIIIllIIII[103]] = lllIlIlllIlI("/Wg7f+4ZEPI=", "VwCUZ");
        lIIIlIlIlI[lIIIllIIII[37]] = lllIlIlllIll("AUOow+WlR+pQtWZnHtLXb+2p3rSVSf5E", "mGwOm");
        lIIIlIlIlI[lIIIllIIII[105]] = lllIlIlllIll("lftwhq9tP11BpugE3PXKxg==", "JwSqK");
        lIIIlIlIlI[lIIIllIIII[106]] = lllIlIllllII("Dx8eNBk=", "LmqGj");
        lIIIlIlIlI[lIIIllIIII[107]] = lllIlIllllII("PgARHCAcAg==", "replI");
        lIIIlIlIlI[lIIIllIIII[108]] = lllIlIlllIll("iEUCzpvuJbQ=", "hCVYJ");
        lIIIlIlIlI[lIIIllIIII[109]] = lllIlIlllIll("s75Q9dMfAL8=", "qUrFn");
        lIIIlIlIlI[lIIIllIIII[110]] = lllIlIllllII("EgolFAYzAicS", "PkIuh");
        lIIIlIlIlI[lIIIllIIII[111]] = lllIlIlllIlI("I7XrVmIfmB8=", "HiGyo");
        lIIIlIlIlI[lIIIllIIII[112]] = lllIlIlllIll("sIwj1VXb2Aw=", "OHsNK");
        lIIIlIlIlI[lIIIllIIII[113]] = lllIlIllllII("JRIHGg0BAEoNBR8=", "ogjjd");
        lIIIlIlIlI[lIIIllIIII[39]] = lllIlIlllIlI("KHT8kA1uIR0=", "tQkSs");
        lIIIlIlIlI[lIIIllIIII[7]] = lllIlIlllIll("nqvOxcWqbrg=", "qhZvg");
        lIIIlIlIlI[lIIIllIIII[114]] = lllIlIllllII("IiEZGiMGM1QNKxh0Rg==", "hTtjJ");
        lIIIlIlIlI[lIIIllIIII[116]] = lllIlIlllIll("Vs16fRy1flM=", "ulbWu");
        lIIIlIlIlI[lIIIllIIII[117]] = lllIlIlllIll("41xKvoKaQ8QV73NQuPXOMQ==", "bMnOs");
        lIIIlIlIlI[lIIIllIIII[119]] = lllIlIlllIll("tcOH2J+GmOc=", "ovaNq");
        lIIIlIlIlI[lIIIllIIII[120]] = lllIlIllllII("Gh4gBQg3SyAOCzQ=", "RkRad");
        lIIIlIlIlI[lIIIllIIII[122]] = lllIlIlllIlI("r3HeoKXiLcs=", "sEAsZ");
        lIIIlIlIlI[lIIIllIIII[123]] = lllIlIlllIlI("q9+6zY0nNdoffeNKEWr66QcJKxMjQDHF", "xjBFK");
        lIIIlIlIlI[lIIIllIIII[124]] = lllIlIlllIll("Qnr6JOw5Qt0=", "TWUPn");
        lIIIlIlIlI[lIIIllIIII[44]] = lllIlIlllIlI("qbNRRNdTiXX6jWm0+LWatQ==", "iucNh");
        lIIIlIlIlI[lIIIllIIII[140]] = lllIlIllllII("GikQZyI7aAUmODUuDzR2NycTNSUx", "THfGV");
        lIIIlIlIlI[lIIIllIIII[6]] = lllIlIlllIll("Zv9AlPblN26em0yBN8lLtA==", "mEtxL");
        lIIIlIlIlI[lIIIllIIII[141]] = lllIlIllllII("FSEsFRovOypHDSkgPxQL", "FUMgn");
        lIIIlIlIlI[lIIIllIIII[142]] = lllIlIlllIlI("MSBQO1B+7vJ2hL9ZVTgidg==", "psoTu");
        lIIIlIlIlI[lIIIllIIII[143]] = lllIlIlllIlI("/p5sAUFnWWU=", "cqujL");
        lIIIlIlIlI[lIIIllIIII[144]] = lllIlIlllIll("raSkXYJo8V24GTb0ZrNbBg==", "upgCP");
        lIIIlIlIlI[lIIIllIIII[145]] = lllIlIllllII("JhQcPT0VVRo1IRk=", "ruwTS");
        lIIIlIlIlI[lIIIllIIII[146]] = lllIlIllllII("FhU/JAZwFys4CXAVJGoFIhU/JAY=", "PzJJb");
        lIIIlIlIlI[lIIIllIIII[147]] = lllIlIllllII("Ey4eKQ==", "GOuLd");
        lIIIlIlIlI[lIIIllIIII[148]] = lllIlIlllIlI("MHCezkzx0R/2CDKFcpm6wg==", "YShgc");
        lIIIlIlIlI[lIIIllIIII[149]] = lllIlIllllII("DTwKHA==", "GIgll");
        lIIIlIlIlI[lIIIllIIII[150]] = lllIlIlllIlI("hGwsFh3APSRel92Jmcwt0Q==", "lcCyb");
        lIIIlIlIlI[lIIIllIIII[151]] = lllIlIlllIll("8X8wVjYA/NU=", "ANNpf");
        lIIIlIlIlI[lIIIllIIII[152]] = lllIlIlllIll("EzR19gVaiWQG13nkkarNyw==", "fmKXf");
        lIIIlIlIlI[lIIIllIIII[153]] = lllIlIlllIll("9N4QvhwIRds=", "tsCyl");
        lIIIlIlIlI[lIIIllIIII[154]] = lllIlIllllII("CyI3Bj8vMHoRNzF3bg==", "AWZvV");
        lIIIlIlIlI[lIIIllIIII[155]] = lllIlIlllIlI("BJSLNxTwmKs=", "SRLma");
        lIIIlIlIlI[lIIIllIIII[156]] = lllIlIllllII("NyQ3FCQIKyU=", "aEBxP");
        lIIIlIlIlI[lIIIllIIII[157]] = lllIlIllllII("LgMSCDw=", "xbgdH");
        lIIIlIlIlI[lIIIllIIII[158]] = lllIlIlllIll("eIKeoabFO3Adsr+ucTwr6w==", "kTWKE");
        lIIIlIlIlI[lIIIllIIII[159]] = lllIlIllllII("LwIqAQ==", "ewGqZ");
        lIIIlIlIlI[lIIIllIIII[160]] = lllIlIlllIlI("Fh+rUmwxSi/e5kEqGyJHig==", "pcmch");
        lIIIlIlIlI[lIIIllIIII[161]] = lllIlIlllIll("Ktt5i7lNv80=", "TkWmM");
        lIIIlIlIlI[lIIIllIIII[172]] = lllIlIlllIlI("kZc0xeRoFNZmcOBVudJSPMuy73KbPW87", "QXDPx");
        lIIIlIlIlI[lIIIllIIII[173]] = lllIlIlllIll("TMoiCVcSD6AfSChXcywkmA==", "DhlGA");
        lIIIlIlIlI[lIIIllIIII[174]] = lllIlIlllIll("+E49SmStaGlmq4Yr0JEybg==", "Domuh");
        lIIIlIlIlI[lIIIllIIII[175]] = lllIlIllllII("LhImBA==", "ysJhz");
        lIIIlIlIlI[lIIIllIIII[35]] = lllIlIlllIll("vjrAH72fG/Qi1cONKLlMgw==", "sSgKB");
        lIIIlIlIlI[lIIIllIIII[176]] = lllIlIllllII("BCMGAlEmJFQOAyghEQ==", "IBtiq");
        lIIIlIlIlI[lIIIllIIII[177]] = lllIlIlllIll("/i3wjvxOED4Cfoe10RXdmg==", "NmCoU");
        lIIIlIlIlI[lIIIllIIII[178]] = lllIlIlllIll("NhLcjbrFP5Z6+JEZzOv+042t3dYph/OQ", "VsKdW");
        lIIIlIlIlI[lIIIllIIII[179]] = lllIlIlllIlI("2MoAtc7wLjw=", "LowFn");
        lIIIlIlIlI[lIIIllIIII[180]] = lllIlIllllII("GhA3HTg+AnoKMCBFaw==", "PeZmQ");
        lIIIlIlIlI[lIIIllIIII[79]] = lllIlIllllII("DhMMOA==", "DfaHz");
        lIIIlIlIlI[lIIIllIIII[181]] = lllIlIlllIll("L6fWGucGTYAjiKd5CEVO4Q==", "oIgRy");
        lIIIlIlIlI[lIIIllIIII[182]] = lllIlIlllIll("woJf+MTao34=", "lRUcm");
        lIIIlIlIlI[lIIIllIIII[183]] = lllIlIlllIlI("gPNWpRiSgD26scGhMu7mQw==", "bREBQ");
        lIIIlIlIlI[lIIIllIIII[184]] = lllIlIllllII("Ez4gNw==", "YKMGN");
        lIIIlIlIlI[lIIIllIIII[185]] = lllIlIlllIll("+/1TxlEh9WNnl1eKdmcS/Q==", "DmXKP");
        lIIIlIlIlI[lIIIllIIII[186]] = lllIlIlllIll("YuMbKLcXrU0=", "gwdZv");
        lIIIlIlIlI[lIIIllIIII[187]] = lllIlIllllII("HwAuBjo7EmMzNzIQ", "UuCvS");
        lIIIlIlIlI[lIIIllIIII[188]] = lllIlIlllIlI("AxB1l78OTYM=", "viuiy");
        lIIIlIlIlI[lIIIllIIII[194]] = lllIlIlllIlI("2s3M/wfoSYIsZcB7+0dOiBFnhOVWQYXh", "Djedu");
        lIIIlIlIlI[lIIIllIIII[203]] = lllIlIlllIlI("FMQuCZ6yJhc=", "dMioD");
        lIIIlIlIlI[lIIIllIIII[204]] = lllIlIlllIlI("kvOFMhJCOx4=", "JNyZu");
        lIIIlIlIlI[lIIIllIIII[205]] = lllIlIllllII("NzMWJCUgNw==", "GReWD");
        lIIIlIlIlI[lIIIllIIII[206]] = lllIlIlllIll("2v2fsSehSjI=", "pJsTt");
        lIIIlIlIlI[lIIIllIIII[207]] = lllIlIlllIll("stqWZjpvNdI=", "fiXdv");
        lIIIlIlIlI[lIIIllIIII[208]] = lllIlIllllII("ACc+DA==", "ECYiA");
        lIIIlIlIlI[lIIIllIIII[211]] = lllIlIllllII("LDsR", "kZaLv");
        lIIIlIlIlI[lIIIllIIII[213]] = lllIlIlllIlI("U2uWuLBYNsw=", "UlUlp");
        lIIIlIlIlI[lIIIllIIII[216]] = lllIlIlllIll("/cmeFTpHfU3ZRJEvDfS6Aw==", "uwief");
        lIIIlIlIlI[lIIIllIIII[218]] = lllIlIllllII("Lhsa", "izjuh");
        lIIIlIlIlI[lIIIllIIII[221]] = lllIlIlllIll("G2LLF5gotnE=", "xMbNc");
        lIIIlIlIlI[lIIIllIIII[224]] = lllIlIllllII("EBUg", "WtPju");
        lIIIlIlIlI[lIIIllIIII[226]] = lllIlIllllII("NCwiMUISIjs4Gw==", "dCNTo");
        lIIIlIlIlI[lIIIllIIII[227]] = lllIlIlllIll("NWf3CzUiiqo=", "TeXws");
        lIIIlIlIlI[lIIIllIIII[230]] = lllIlIlllIlI("kSBenDZFbbk=", "MiBxu");
        lIIIlIlIlI[lIIIllIIII[232]] = lllIlIlllIll("r4VelpmrIv4=", "vyfej");
        lIIIlIlIlI[lIIIllIIII[233]] = lllIlIlllIlI("/L7uasDeNLA=", "YPAnI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (lllIllIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.I.lIIIllIIII[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (lllIllIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.I.lIIIllIIII[12]) != false) goto L43;
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
        int[] iArr4 = new int[lIIIllIIII[1]];
        iArr4[lIIIllIIII[0]] = lIIIllIIII[16];
        if (lllIllIlllII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[16], lIIIllIIII[1], lIIIllIIII[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllIIII[1]];
        iArr5[lIIIllIIII[0]] = lIIIllIIII[18];
        if (lllIllIlllII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[18], lIIIllIIII[3], lIIIllIIII[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIIllIIII[1]];
        iArr6[lIIIllIIII[0]] = lIIIllIIII[27];
        if (lllIllIlllII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[27], lIIIllIIII[3], lIIIllIIII[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIIllIIII[1]];
        iArr7[lIIIllIIII[0]] = lIIIllIIII[13];
        if (lllIllIlllII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[13], lIIIllIIII[12], lIIIllIIII[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIIllIIII[1]];
        iArr8[lIIIllIIII[0]] = lIIIllIIII[21];
        if (lllIllIlllII(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[21], lIIIllIIII[12], lIIIllIIII[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIIllIIII[1]];
        iArr9[lIIIllIIII[0]] = lIIIllIIII[15];
        if (lllIllIlllII(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[15], lIIIllIIII[12], lIIIllIIII[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIIllIIII[1]];
        iArr10[lIIIllIIII[0]] = lIIIllIIII[14];
        if (lllIllIlllII(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIIII[14], lIIIllIIII[12], lIIIllIIII[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIIllIIII[1]];
        iArr11[lIIIllIIII[0]] = lIIIllIIII[23];
        if (lllIllIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIllIIII[1]];
            iArr12[lIIIllIIII[0]] = lIIIllIIII[23];
            if (lllIllIllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIllIIII[1]];
                iArr13[lIIIllIIII[0]] = lIIIllIIII[23];
            }
            iArr = new int[lIIIllIIII[1]];
            iArr[lIIIllIIII[0]] = lIIIllIIII[25];
            if (lllIllIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIIllIIII[1]];
                iArr14[lIIIllIIII[0]] = lIIIllIIII[25];
                if (lllIllIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIllIIII[1]];
                    iArr15[lIIIllIIII[0]] = lIIIllIIII[25];
                }
                iArr2 = new int[lIIIllIIII[1]];
                iArr2[lIIIllIIII[0]] = lIIIllIIII[201];
                if (lllIllIlllII(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIllIIII[201], lIIIllIIII[1], lIIIllIIII[202]));
                    "".length();
                }
                iArr3 = new int[lIIIllIIII[1]];
                iArr3[lIIIllIIII[0]] = lIIIllIIII[19];
                if (lllIllIlllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIllIIII[19], lIIIllIIII[40], C0008i.bq));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIIllIIII[25], lIIIllIIII[12], lIIIllIIII[200]));
            "".length();
            iArr2 = new int[lIIIllIIII[1]];
            iArr2[lIIIllIIII[0]] = lIIIllIIII[201];
            if (lllIllIlllII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIIllIIII[1]];
            iArr3[lIIIllIIII[0]] = lIIIllIIII[19];
            if (lllIllIlllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(ix, lIIIllIIII[44], lIIIllIIII[199]));
        "".length();
        iArr = new int[lIIIllIIII[1]];
        iArr[lIIIllIIII[0]] = lIIIllIIII[25];
        if (lllIllIllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIllIIII[25], lIIIllIIII[12], lIIIllIIII[200]));
        "".length();
        iArr2 = new int[lIIIllIIII[1]];
        iArr2[lIIIllIIII[0]] = lIIIllIIII[201];
        if (lllIllIlllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIllIIII[1]];
        iArr3[lIIIllIIII[0]] = lIIIllIIII[19];
        if (lllIllIlllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static void lllIllIllIIl() {
        lIIIllIIII = new int[239];
        lIIIllIIII[0] = ((95 ^ 51) ^ (41 ^ 97)) & (((20 ^ 75) ^ (195 ^ 184)) ^ (-" ".length()));
        lIIIllIIII[1] = " ".length();
        lIIIllIIII[2] = 16 ^ 21;
        lIIIllIIII[3] = "  ".length();
        lIIIllIIII[4] = (-((-4281) & 13049)) & (-16433) & 28663;
        lIIIllIIII[5] = (-8753) & 12213;
        lIIIllIIII[6] = 154 ^ 164;
        lIIIllIIII[7] = (73 ^ 68) ^ (11 ^ 53);
        lIIIllIIII[8] = (-16902) & 20413;
        lIIIllIIII[9] = (-((-12203) & 28591)) & (-4196) & 24063;
        lIIIllIIII[10] = "   ".length();
        lIIIllIIII[11] = (-26724) & 31723;
        lIIIllIIII[12] = 10 ^ 0;
        lIIIllIIII[13] = (-8361) & 16367;
        lIIIllIIII[14] = (-24611) & 32618;
        lIIIllIIII[15] = (-((-451) & 25043)) & (-167) & 32767;
        lIIIllIIII[16] = (-((-18345) & 30713)) & (-3) & 16223;
        lIIIllIIII[17] = (91 ^ 37) ^ (72 ^ 50);
        lIIIllIIII[18] = (-((-16077) & 32767)) & (-4097) & 32766;
        lIIIllIIII[19] = (-19471) & 32095;
        lIIIllIIII[20] = 107 ^ 109;
        lIIIllIIII[21] = (-146) & 8155;
        lIIIllIIII[22] = (21 ^ 18) ^ ((176 ^ 165) & ((130 ^ 151) ^ (-1)));
        lIIIllIIII[23] = (-18047) & 18431;
        lIIIllIIII[24] = 9 ^ 1;
        lIIIllIIII[25] = (-12817) & 32435;
        lIIIllIIII[26] = (65 ^ 13) ^ (130 ^ 199);
        lIIIllIIII[27] = (-((-12673) & 15781)) & (-8194) & 32447;
        lIIIllIIII[28] = (-((-10149) & 26542)) & (-4515) & 32767;
        lIIIllIIII[29] = (-4268) & 16123;
        lIIIllIIII[30] = (-((-9805) & 26574)) & (-4113) & 32735;
        lIIIllIIII[31] = (-4147) & 15998;
        lIIIllIIII[32] = (-((-1538) & 1803)) & (-20517) & 32639;
        lIIIllIIII[33] = (-((-7819) & 24507)) & (-4098) & 32635;
        lIIIllIIII[34] = (-((-19157) & 23253)) & (-44) & 16107;
        lIIIllIIII[35] = (25 ^ 103) ^ (39 ^ 1);
        lIIIllIIII[36] = (-((-1923) & 14291)) & (-1) & 32603;
        lIIIllIIII[37] = (21 ^ 71) ^ (1 ^ 123);
        lIIIllIIII[38] = (106 ^ 59) ^ (13 ^ 83);
        lIIIllIIII[39] = 78 ^ 124;
        lIIIllIIII[40] = (190 ^ 130) ^ (124 ^ 84);
        lIIIllIIII[41] = 42 ^ 51;
        lIIIllIIII[42] = 135 ^ 153;
        lIIIllIIII[43] = (-(99 ^ 33)) & (-2193) & 2559;
        lIIIllIIII[44] = (44 ^ 101) ^ (23 ^ 98);
        lIIIllIIII[45] = (-17097) & 17403;
        lIIIllIIII[46] = (-9819) & 12287;
        lIIIllIIII[47] = (-((-27107) & 31731)) & (-16517) & 24575;
        lIIIllIIII[48] = (-((-66) & 29399)) & (-9) & 32765;
        lIIIllIIII[49] = 169 ^ 162;
        lIIIllIIII[50] = (-((-5241) & 29947)) & (-4129) & 32255;
        lIIIllIIII[51] = (-((-10467) & 16127)) & (-65) & 8189;
        lIIIllIIII[52] = (-((-1555) & 14003)) & (-9) & 15871;
        lIIIllIIII[53] = 72 ^ 70;
        lIIIllIIII[54] = 163 ^ 177;
        lIIIllIIII[55] = (-24577) & 27059;
        lIIIllIIII[56] = (-20488) & 23903;
        lIIIllIIII[57] = (-4614) & 7095;
        lIIIllIIII[58] = (-16931) & 20347;
        lIIIllIIII[59] = (-5129) & 7609;
        lIIIllIIII[60] = (-669) & 4095;
        lIIIllIIII[61] = 133 ^ 147;
        lIIIllIIII[62] = -" ".length();
        lIIIllIIII[63] = 103 ^ 107;
        lIIIllIIII[64] = (((32 + 60) - 88) + 169) ^ (((88 + 65) - 29) + 36);
        lIIIllIIII[65] = 190 ^ 174;
        lIIIllIIII[66] = 179 ^ 162;
        lIIIllIIII[67] = (121 ^ 33) ^ (242 ^ 185);
        lIIIllIIII[68] = 153 ^ 140;
        lIIIllIIII[69] = 60 ^ 43;
        lIIIllIIII[70] = (77 ^ 29) ^ (61 ^ 117);
        lIIIllIIII[71] = (((67 + 108) - 107) + 71) ^ (((42 + 139) - 43) + 7);
        lIIIllIIII[72] = (35 ^ 64) ^ (113 ^ 9);
        lIIIllIIII[73] = 184 ^ 164;
        lIIIllIIII[74] = (186 ^ 135) ^ (124 ^ 92);
        lIIIllIIII[75] = (((38 + 53) - (-49)) + 9) ^ (((118 + 43) - 47) + 24);
        lIIIllIIII[76] = (-25249) & 28415;
        lIIIllIIII[77] = (-((-16503) & 17151)) & (-12321) & 16318;
        lIIIllIIII[78] = ((81 + 40) - 82) + 98;
        lIIIllIIII[79] = (38 ^ 101) ^ (42 ^ 55);
        lIIIllIIII[80] = (-((-23699) & 31959)) & (-16649) & 28127;
        lIIIllIIII[81] = (-(((132 + 0) - 122) + 153)) & (-28673) & 32243;
        lIIIllIIII[82] = (-((-2123) & 31083)) & (-594) & 32765;
        lIIIllIIII[83] = (-13057) & 16254;
        lIIIllIIII[84] = (-17067) & 20478;
        lIIIllIIII[85] = (-((-2246) & 18895)) & (-12417) & 32255;
        lIIIllIIII[86] = (-((-11429) & 27815)) & (-8201) & 27999;
        lIIIllIIII[87] = (-((-3395) & 16371)) & (-16391) & 32767;
        lIIIllIIII[88] = (-((-1665) & 18065)) & (-4865) & 24443;
        lIIIllIIII[89] = (-((-11558) & 32231)) & (-513) & 24567;
        lIIIllIIII[90] = (-21095) & 24311;
        lIIIllIIII[91] = (-((-8721) & 29366)) & (-8715) & 32751;
        lIIIllIIII[92] = (-12614) & 15847;
        lIIIllIIII[93] = (-((-3087) & 31919)) & (-513) & 32746;
        lIIIllIIII[94] = (-12838) & 16247;
        lIIIllIIII[95] = (((160 + 124) - 193) + 87) ^ (((113 + 3) - (-16)) + 14);
        lIIIllIIII[96] = (-24582) & 27805;
        lIIIllIIII[97] = 133 ^ 164;
        lIIIllIIII[98] = (61 ^ 88) ^ (100 ^ 35);
        lIIIllIIII[99] = (46 ^ 7) ^ (38 ^ 44);
        lIIIllIIII[100] = (245 ^ 154) ^ (109 ^ 38);
        lIIIllIIII[101] = (((72 + 143) - 108) + 66) ^ (((32 + 81) - 112) + 135);
        lIIIllIIII[102] = (31 ^ 105) ^ (13 ^ 93);
        lIIIllIIII[103] = (205 ^ 174) ^ (73 ^ 13);
        lIIIllIIII[104] = (-((-10531) & 12139)) & (-22530) & 32637;
        lIIIllIIII[105] = (((154 + 71) - 150) + 90) ^ (((137 + 0) - 16) + 19);
        lIIIllIIII[106] = 48 ^ 26;
        lIIIllIIII[107] = 63 ^ 20;
        lIIIllIIII[108] = (34 ^ 100) ^ (96 ^ 10);
        lIIIllIIII[109] = (240 ^ 152) ^ (241 ^ 180);
        lIIIllIIII[110] = 39 ^ 9;
        lIIIllIIII[111] = (82 ^ 25) ^ (160 ^ 196);
        lIIIllIIII[112] = 63 ^ 15;
        lIIIllIIII[113] = (108 ^ 81) ^ (36 ^ 40);
        lIIIllIIII[114] = (36 ^ 98) ^ (111 ^ 29);
        lIIIllIIII[115] = (-16906) & 31739;
        lIIIllIIII[116] = 15 ^ 58;
        lIIIllIIII[117] = (12 ^ 1) ^ (250 ^ 193);
        lIIIllIIII[118] = (-((-2401) & 18793)) & (-1) & 31227;
        lIIIllIIII[119] = (102 ^ 52) ^ (92 ^ 57);
        lIIIllIIII[120] = 66 ^ 122;
        lIIIllIIII[121] = (-((-2423) & 3967)) & (-2) & 16381;
        lIIIllIIII[122] = (15 ^ 7) ^ (7 ^ 54);
        lIIIllIIII[123] = 146 ^ 168;
        lIIIllIIII[124] = (176 ^ 165) ^ (58 ^ 20);
        lIIIllIIII[125] = (-529) & 3999;
        lIIIllIIII[126] = (-28673) & 32138;
        lIIIllIIII[127] = (-8257) & 11758;
        lIIIllIIII[128] = (-((-4418) & 29531)) & (-5) & 28607;
        lIIIllIIII[129] = (-8785) & 12279;
        lIIIllIIII[130] = (-((-20241) & 24373)) & (-16385) & 23999;
        lIIIllIIII[131] = (-((-19857) & 20375)) & (-20545) & 24559;
        lIIIllIIII[132] = (-((-3331) & 16206)) & (-16417) & 32763;
        lIIIllIIII[133] = (-24651) & 28139;
        lIIIllIIII[134] = (-((-3091) & 23603)) & (-8261) & 32247;
        lIIIllIIII[135] = (-16449) & 19933;
        lIIIllIIII[136] = (-((-7043) & 31703)) & (-1) & 28127;
        lIIIllIIII[137] = (-4170) & 7675;
        lIIIllIIII[138] = (-((-775) & 21319)) & (-8203) & 32219;
        lIIIllIIII[139] = (-29217) & 32702;
        lIIIllIIII[140] = 5 ^ 56;
        lIIIllIIII[141] = (((95 + 15) - 37) + 106) ^ (((17 + 44) - (-74)) + 5);
        lIIIllIIII[142] = (((115 + 178) - 113) + 47) ^ (((127 + 87) - 100) + 49);
        lIIIllIIII[143] = 8 ^ 73;
        lIIIllIIII[144] = (158 ^ 182) ^ (42 ^ 64);
        lIIIllIIII[145] = (32 ^ 6) ^ (226 ^ 135);
        lIIIllIIII[146] = 194 ^ 134;
        lIIIllIIII[147] = (((122 + 41) - (-32)) + 52) ^ (((61 + 151) - 198) + 164);
        lIIIllIIII[148] = 14 ^ 72;
        lIIIllIIII[149] = 130 ^ 197;
        lIIIllIIII[150] = (((155 + 150) - 257) + 171) ^ (((129 + 49) - 127) + 96);
        lIIIllIIII[151] = 102 ^ 47;
        lIIIllIIII[152] = 104 ^ 34;
        lIIIllIIII[153] = (((141 + 146) - 244) + 166) ^ (((83 + 11) - 67) + 127);
        lIIIllIIII[154] = (251 ^ 163) ^ (12 ^ 24);
        lIIIllIIII[155] = (((57 + 116) - 51) + 21) ^ (((192 + 178) - 314) + 138);
        lIIIllIIII[156] = 221 ^ 147;
        lIIIllIIII[157] = (((28 + 229) - 239) + 225) ^ (((157 + 120) - 265) + 176);
        lIIIllIIII[158] = 36 ^ 116;
        lIIIllIIII[159] = (75 ^ 82) ^ (96 ^ 40);
        lIIIllIIII[160] = 8 ^ 90;
        lIIIllIIII[161] = 203 ^ 152;
        lIIIllIIII[162] = (-16385) & 19071;
        lIIIllIIII[163] = (-16385) & 19838;
        lIIIllIIII[164] = (-17441) & 20159;
        lIIIllIIII[165] = (-((-31655) & 32759)) & (-8227) & 12031;
        lIIIllIIII[166] = (-28741) & 31447;
        lIIIllIIII[167] = (-((-297) & 13631)) & (-321) & 16351;
        lIIIllIIII[168] = (-5432) & 8119;
        lIIIllIIII[169] = (-25129) & 28585;
        lIIIllIIII[170] = (-((-513) & 1605)) & (-4355) & 8175;
        lIIIllIIII[171] = (-12812) & 16299;
        lIIIllIIII[172] = (((88 + 12) - 64) + 114) ^ (((134 + 102) - 140) + 98);
        lIIIllIIII[173] = (222 ^ 198) ^ (223 ^ 146);
        lIIIllIIII[174] = (((28 + 30) - (-121)) + 31) ^ (((73 + 94) - 153) + 118);
        lIIIllIIII[175] = 23 ^ 64;
        lIIIllIIII[176] = 254 ^ 167;
        lIIIllIIII[177] = 104 ^ 50;
        lIIIllIIII[178] = (((122 + 154) - 186) + 136) ^ (((75 + 96) - 100) + 114);
        lIIIllIIII[179] = 62 ^ 98;
        lIIIllIIII[180] = (((174 + 68) - 210) + 163) ^ (((72 + 126) - 78) + 38);
        lIIIllIIII[181] = 11 ^ 84;
        lIIIllIIII[182] = 21 ^ 117;
        lIIIllIIII[183] = (47 ^ 93) ^ (212 ^ 199);
        lIIIllIIII[184] = (((39 + 209) - 129) + 134) ^ (((138 + 119) - 208) + 110);
        lIIIllIIII[185] = (7 ^ 119) ^ (8 ^ 27);
        lIIIllIIII[186] = 163 ^ 199;
        lIIIllIIII[187] = 41 ^ 76;
        lIIIllIIII[188] = 3 ^ 101;
        lIIIllIIII[189] = (-((-10309) & 31437)) & (-257) & 24575;
        lIIIllIIII[190] = (-((-2074) & 23067)) & (-41) & 24447;
        lIIIllIIII[191] = (-130) & 3311;
        lIIIllIIII[192] = (-20549) & 23935;
        lIIIllIIII[193] = (-((-2121) & 18685)) & (-4353) & 32765;
        lIIIllIIII[194] = 219 ^ 188;
        lIIIllIIII[195] = (-((-1317) & 26533)) & (-2051) & 32766;
        lIIIllIIII[196] = (-((-1412) & 7643)) & (-1025) & 32255;
        lIIIllIIII[197] = (-((-9347) & 25854)) & (-5121) & 22527;
        lIIIllIIII[198] = (-12297) & 13246;
        lIIIllIIII[199] = (-((-25217) & 29346)) & (-18497) & 24575;
        lIIIllIIII[200] = (-((-4731) & 4987)) & (-23553) & 32758;
        lIIIllIIII[201] = (-4134) & 16111;
        lIIIllIIII[202] = (-((-9493) & 16150)) & (-129) & 32735;
        lIIIllIIII[203] = (24 ^ 124) ^ (22 ^ 26);
        lIIIllIIII[204] = 193 ^ 168;
        lIIIllIIII[205] = (107 ^ 15) ^ (141 ^ 131);
        lIIIllIIII[206] = (64 ^ 29) ^ (155 ^ 173);
        lIIIllIIII[207] = 106 ^ 6;
        lIIIllIIII[208] = 194 ^ 175;
        lIIIllIIII[209] = (-13585) & 16287;
        lIIIllIIII[210] = (-29217) & 32681;
        lIIIllIIII[211] = (120 ^ 17) ^ (62 ^ 57);
        lIIIllIIII[212] = (-((-25613) & 30317)) & (-24577) & 32749;
        lIIIllIIII[213] = (((158 + 83) - 72) + 5) ^ (((77 + 27) - (-18)) + 71);
        lIIIllIIII[214] = (-((-27221) & 28533)) & (-24585) & 28607;
        lIIIllIIII[215] = (-4172) & 7647;
        lIIIllIIII[216] = 207 ^ 191;
        lIIIllIIII[217] = (-((-913) & 14266)) & (-16641) & 32703;
        lIIIllIIII[218] = 34 ^ 83;
        lIIIllIIII[219] = (-17755) & 20475;
        lIIIllIIII[220] = (-28739) & 32231;
        lIIIllIIII[221] = 202 ^ 184;
        lIIIllIIII[222] = (-73) & 3582;
        lIIIllIIII[223] = (-((-9129) & 13291)) & (-25089) & 32734;
        lIIIllIIII[224] = (((150 + 199) - 269) + 127) ^ (((122 + 104) - 175) + 137);
        lIIIllIIII[225] = (-29185) & 32687;
        lIIIllIIII[226] = (((188 + 159) - 157) + 51) ^ (((28 + 90) - 48) + 63);
        lIIIllIIII[227] = 16 ^ 101;
        lIIIllIIII[228] = (-((-6546) & 31739)) & (-1) & 28671;
        lIIIllIIII[229] = (-((-15535) & 32447)) & (-4098) & 24501;
        lIIIllIIII[230] = (((7 + 125) - 129) + 199) ^ (((47 + 54) - (-68)) + 19);
        lIIIllIIII[231] = (-((-491) & 25579)) & (-4165) & 32751;
        lIIIllIIII[232] = 46 ^ 89;
        lIIIllIIII[233] = 75 ^ 51;
        lIIIllIIII[234] = (-((-1571) & 5671)) & (-16905) & 24509;
        lIIIllIIII[235] = (-((-12709) & 14270)) & (-28675) & 32703;
        lIIIllIIII[236] = (-16978) & 19451;
        lIIIllIIII[237] = (-((-2317) & 15247)) & (-16385) & 32751;
        lIIIllIIII[238] = 14 ^ 119;
    }

    private static boolean lllIllIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIllIllIlI(int i) {
        return i != 0;
    }

    private static boolean lllIllIlllll(int i) {
        return i > 0;
    }

    static {
        lllIllIllIIl();
        lllIllIIlllI();
        bv = new ArrayList();
        iw = lIIIllIIII[27];
        ix = lIIIllIIII[23];
        iz = new WorldArea(lIIIllIIII[235], lIIIllIIII[52], lIIIllIIII[69], lIIIllIIII[72], lIIIllIIII[0]);
        iA = new WorldArea(lIIIllIIII[235], lIIIllIIII[52], lIIIllIIII[69], lIIIllIIII[72], lIIIllIIII[1]);
        iB = new WorldArea(lIIIllIIII[235], lIIIllIIII[52], lIIIllIIII[69], lIIIllIIII[72], lIIIllIIII[3]);
        iC = new WorldPoint(lIIIllIIII[236], lIIIllIIII[237], lIIIllIIII[0]);
    }

    private static void cs() {
        WorldArea worldArea = new WorldArea(lIIIllIIII[125], lIIIllIIII[126], lIIIllIIII[112], lIIIllIIII[107], lIIIllIIII[0]);
        WorldArea worldArea2 = new WorldArea(lIIIllIIII[125], lIIIllIIII[126], lIIIllIIII[112], lIIIllIIII[107], lIIIllIIII[1]);
        WorldArea worldArea3 = new WorldArea(lIIIllIIII[125], lIIIllIIII[126], lIIIllIIII[112], lIIIllIIII[107], lIIIllIIII[3]);
        WorldArea worldArea4 = new WorldArea(lIIIllIIII[125], lIIIllIIII[126], lIIIllIIII[112], lIIIllIIII[107], lIIIllIIII[10]);
        WorldArea worldArea5 = new WorldArea(lIIIllIIII[127], lIIIllIIII[128], lIIIllIIII[49], lIIIllIIII[12], lIIIllIIII[3]);
        WorldArea worldArea6 = new WorldArea(lIIIllIIII[129], lIIIllIIII[127], lIIIllIIII[49], lIIIllIIII[24], lIIIllIIII[3]);
        WorldArea worldArea7 = new WorldArea(lIIIllIIII[130], lIIIllIIII[131], lIIIllIIII[63], lIIIllIIII[49], lIIIllIIII[3]);
        WorldArea worldArea8 = new WorldArea(lIIIllIIII[132], lIIIllIIII[133], lIIIllIIII[12], lIIIllIIII[64], lIIIllIIII[10]);
        WorldArea worldArea9 = new WorldArea(lIIIllIIII[134], lIIIllIIII[9], lIIIllIIII[49], lIIIllIIII[26], lIIIllIIII[3]);
        WorldArea worldArea10 = new WorldArea(lIIIllIIII[135], lIIIllIIII[136], lIIIllIIII[68], lIIIllIIII[53], lIIIllIIII[10]);
        WorldArea worldArea11 = new WorldArea(lIIIllIIII[137], lIIIllIIII[138], lIIIllIIII[63], lIIIllIIII[64], lIIIllIIII[3]);
        WorldPoint worldPoint = new WorldPoint(lIIIllIIII[137], lIIIllIIII[139], lIIIllIIII[0]);
        if (lllIllIllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllIllIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIIllIIII[1]);
            "".length();
        }
        if (lllIllIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIllIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIII[20])) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIIllIIII[1]);
                "".length();
            }
            if (lllIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllIIII[20])) {
                AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIIllIIII[1]];
                strArr[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[142]];
                TileObjects.getNearest(strArr).interact(lIIIlIlIlI[lIIIllIIII[143]]);
                Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return ((254 ^ 189) ^ (47 ^ 104)) < "   ".length() ? ((85 ^ 95) ^ (0 ^ 17)) & (((((15 + 42) - 50) + 121) ^ (((39 + 75) - (-22)) + 19)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                }, lIIIllIIII[104]);
                "".length();
                Time.sleepTicks(lIIIllIIII[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIIllIIII[1]];
        strArr2[lIIIllIIII[0]] = lIIIlIlIlI[lIIIllIIII[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lllIllIlllIl(nearest) && lllIllIllIlI(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[145]];
            System.out.println(lIIIlIlIlI[lIIIllIIII[146]]);
            nearest.interact(lIIIlIlIlI[lIIIllIIII[147]]);
            Time.sleepTicks(lIIIllIIII[10]);
            "".length();
        }
        if (lllIllIlllII(cu() ? 1 : 0)) {
            if (lllIllIllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lllIllIllIlI(tileObject.getName().contains(lIIIlIlIlI[lIIIllIIII[233]]) ? 1 : 0) && lllIlllIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[234], lIIIllIIII[131], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return "  ".length() > "   ".length() ? ((129 ^ 137) ^ (53 ^ 31)) & (((90 ^ 8) ^ (243 ^ 131)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest2)) {
                    int lIIIlllllIlI = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[148]];
                    nearest2.interact(lIIIlIlIlI[lIIIllIIII[149]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lllIllIllIlI(tileObject2.getName().contains(lIIIlIlIlI[lIIIllIIII[232]]) ? 1 : 0) && lllIlllIIIlI(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[131], lIIIllIIII[225], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest3)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[150]];
                    int lIIIlllllIlI2 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIIlIlIlI[lIIIllIIII[151]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI2)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (((((186 + 6) - 189) + 204) ^ (((80 + 75) - 139) + 181)) & (((31 ^ 32) ^ (33 ^ 20)) ^ (-" ".length()))) > 0 ? ((((103 + 12) - 39) + 83) ^ (((18 + 65) - (-38)) + 11)) & (((31 ^ 108) ^ (60 ^ 84)) ^ (-" ".length())) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lllIllIllIlI(tileObject3.getName().contains(lIIIlIlIlI[lIIIllIIII[230]]) ? 1 : 0) && lllIlllIIIlI(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[139], lIIIllIIII[231], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return (((((175 + 140) - 184) + 51) ^ (((11 + 85) - 57) + 113)) & (((((138 + 121) - 199) + 114) ^ (((38 + 112) - 34) + 12)) ^ (-" ".length()))) == (-" ".length()) ? ((7 ^ 72) ^ (9 ^ 75)) & (((126 ^ 18) ^ (5 ^ 100)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest4)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[152]];
                    int lIIIlllllIlI3 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIIlIlIlI[lIIIllIIII[153]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI3)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) >= ((29 ^ 44) & ((56 ^ 9) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lllIllIllIlI(tileObject4.getName().contains(lIIIlIlIlI[lIIIllIIII[227]]) ? 1 : 0) && lllIlllIIIlI(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[228], lIIIllIIII[229], lIIIllIIII[10])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest5)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[154]];
                    int lIIIlllllIlI4 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIIlIlIlI[lIIIllIIII[155]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI4)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lllIllIllIlI(tileObject5.getName().contains(lIIIlIlIlI[lIIIllIIII[226]]) ? 1 : 0) && lllIlllIIIlI(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[9], lIIIllIIII[130], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest6)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[156]];
                    int lIIIlllllIlI5 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIIlIlIlI[lIIIllIIII[157]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI5)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (-" ".length()) > " ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (lllIllIllIlI(cu() ? 1 : 0)) {
                return;
            }
            if (lllIllIllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lllIllIllIlI(tileObject6.getName().contains(lIIIlIlIlI[lIIIllIIII[224]]) ? 1 : 0) && lllIlllIIIlI(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[225], lIIIllIIII[215], lIIIllIIII[10])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return ((87 ^ 14) & ((94 ^ 7) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest7)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[158]];
                    int lIIIlllllIlI6 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIIlIlIlI[lIIIllIIII[159]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI6)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return (60 ^ 56) <= ((174 ^ 184) & ((111 ^ 121) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
            if (!lllIllIllIlI(cu() ? 1 : 0) && lllIllIllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lllIllIllIlI(tileObject7.getName().contains(lIIIlIlIlI[lIIIllIIII[221]]) ? 1 : 0) && lllIlllIIIlI(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIIllIIII[222], lIIIllIIII[223], lIIIllIIII[3])), lIIIllIIII[3])) {
                        ?? r0 = lIIIllIIII[1];
                        "".length();
                        return 0 != 0 ? ((79 ^ 21) ^ (100 ^ 24)) & (((((130 + 1) - 59) + 76) ^ (((33 + 54) - (-19)) + 72)) ^ (-" ".length())) : r0;
                    }
                    return lIIIllIIII[0];
                });
                if (lllIllIlllIl(nearest8)) {
                    AccBuilderRogues.c = lIIIlIlIlI[lIIIllIIII[160]];
                    int lIIIlllllIlI7 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIIlIlIlI[lIIIllIIII[161]]);
                    Time.sleepTicks(C0004e.c(lIIIllIIII[1], lIIIllIIII[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lllIllIllllI(Skills.getExperience(Skill.AGILITY), lIIIlllllIlI7)) {
                            ?? r0 = lIIIllIIII[1];
                            "".length();
                            return ((159 ^ 141) & ((179 ^ 161) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIIII[0];
                    }, lIIIllIIII[104]);
                    "".length();
                    Time.sleepTicks(lIIIllIIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllIllIllllI(int i, int i2) {
        return i > i2;
    }
}
