package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.D  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/D.class */
public class D implements M {
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ int gY;
    static /* synthetic */ WorldPoint fd;
    static /* synthetic */ WorldPoint hc;
    private static /* synthetic */ int[] lIIlIIIIlIIll;
    static /* synthetic */ WorldPoint hd;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    static /* synthetic */ WorldPoint ha;
    static /* synthetic */ boolean he;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ String[] lIIlIIIIlIIlI;
    static /* synthetic */ WorldPoint gZ;
    static /* synthetic */ WorldPoint hb;
    static /* synthetic */ String[] bW;

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ci();
            "".length();
            if (0 != 0) {
                return ((204 ^ 185) ^ (6 ^ 122)) & (((((63 + 1) - 10) + 134) ^ (((157 + 102) - 165) + 87)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIIIlIIll[83];
    }

    private static int lIlIIllllIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v269, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v312, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v565, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v574, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v596, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v135, types: [boolean] */
    public static void ci() {
        if (lIlIIllllIlllII(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIIllllIlllIl(bA.size(), lIIlIIIIlIIll[0])) {
                System.out.println(lIIlIIIIlIIlI[lIIlIIIIlIIll[1]]);
                by = lIIlIIIIlIIll[1];
            }
        }
        if (lIlIIllllIllllI(by ? 1 : 0)) {
            if (lIlIIllllIllllI(S() ? 1 : 0) && lIlIIllllIlllIl(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllllIlllll(nearest) && lIlIIllllIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIllllIlllll(nearest) && lIlIIllllIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllllIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIlIIll[3]);
                        "".length();
                    }
                    if (lIlIIllllIlllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[4]];
                        if (lIlIIlllllIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIlIIll[5]);
                            "".length();
                        }
                        if (lIlIIlllllIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIlIIll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIIlIIll[0]];
                        iArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[6];
                        if (lIlIIllllIlllII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIlIIIIlIIll[0]];
                            iArr2[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[6];
                            if (lIlIIllllIlllIl(Bank.getFirst(iArr2).getQuantity(), lIIlIIIIlIIll[7])) {
                                W();
                                System.out.println(lIIlIIIIlIIlI[lIIlIIIIlIIll[7]]);
                                by = lIIlIIIIlIIll[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIlIIIIlIIll[8]];
                        iArr3[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                        iArr3[lIIlIIIIlIIll[0]] = lIIlIIIIlIIll[10];
                        iArr3[lIIlIIIIlIIll[4]] = lIIlIIIIlIIll[11];
                        iArr3[lIIlIIIIlIIll[7]] = lIIlIIIIlIIll[12];
                        iArr3[lIIlIIIIlIIll[5]] = lIIlIIIIlIIll[13];
                        iArr3[lIIlIIIIlIIll[14]] = lIIlIIIIlIIll[15];
                        iArr3[lIIlIIIIlIIll[16]] = lIIlIIIIlIIll[17];
                        iArr3[lIIlIIIIlIIll[18]] = lIIlIIIIlIIll[19];
                        iArr3[lIIlIIIIlIIll[20]] = lIIlIIIIlIIll[21];
                        iArr3[lIIlIIIIlIIll[22]] = lIIlIIIIlIIll[23];
                        iArr3[lIIlIIIIlIIll[24]] = lIIlIIIIlIIll[6];
                        iArr3[lIIlIIIIlIIll[25]] = lIIlIIIIlIIll[26];
                        if (lIlIIllllIllllI(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIlIIIIlIIlI[lIIlIIIIlIIll[5]]);
                            by = lIIlIIIIlIIll[0];
                            return;
                        }
                        int[] iArr4 = new int[lIIlIIIIlIIll[8]];
                        iArr4[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                        iArr4[lIIlIIIIlIIll[0]] = lIIlIIIIlIIll[10];
                        iArr4[lIIlIIIIlIIll[4]] = lIIlIIIIlIIll[11];
                        iArr4[lIIlIIIIlIIll[7]] = lIIlIIIIlIIll[12];
                        iArr4[lIIlIIIIlIIll[5]] = lIIlIIIIlIIll[13];
                        iArr4[lIIlIIIIlIIll[14]] = lIIlIIIIlIIll[15];
                        iArr4[lIIlIIIIlIIll[16]] = lIIlIIIIlIIll[17];
                        iArr4[lIIlIIIIlIIll[18]] = lIIlIIIIlIIll[19];
                        iArr4[lIIlIIIIlIIll[20]] = lIIlIIIIlIIll[21];
                        iArr4[lIIlIIIIlIIll[22]] = lIIlIIIIlIIll[23];
                        iArr4[lIIlIIIIlIIll[24]] = lIIlIIIIlIIll[6];
                        iArr4[lIIlIIIIlIIll[25]] = lIIlIIIIlIIll[26];
                        if (lIlIIllllIlllII(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(lIIlIIIIlIIll[10], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[12], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[13], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[15], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[17], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[21], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[19], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[23], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[26], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[27], lIIlIIIIlIIll[14]);
                            C0000a.a(lIIlIIIIlIIll[9], lIIlIIIIlIIll[24]);
                            C0000a.a(lIIlIIIIlIIll[28], lIIlIIIIlIIll[0]);
                            C0000a.a(lIIlIIIIlIIll[6], lIIlIIIIlIIll[7]);
                            C0000a.a(lIIlIIIIlIIll[11], lIIlIIIIlIIll[7]);
                            C0000a.a(lIIlIIIIlIIll[29], lIIlIIIIlIIll[4]);
                            C0000a.a(lIIlIIIIlIIll[30], lIIlIIIIlIIll[31]);
                        }
                    }
                }
            }
            if (lIlIIllllIlllII(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllllIlllIl(Movement.getRunEnergy(), lIIlIIIIlIIll[32])) {
                Inventory.getFirst(C0005f.ba).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[14]]);
                Time.sleepTicks(lIIlIIIIlIIll[0]);
                "".length();
            }
            int[] iArr5 = new int[lIIlIIIIlIIll[0]];
            iArr5[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[27];
            if (lIlIIllllIlllII(Inventory.contains(iArr5) ? 1 : 0) && lIlIIlllllIIIIl(lIlIIllllIllIll(C0004e.v(), 50.0d))) {
                int[] iArr6 = new int[lIIlIIIIlIIll[0]];
                iArr6[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[27];
                Inventory.getFirst(iArr6).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[16]]);
                Time.sleepTicks(lIIlIIIIlIIll[0]);
                "".length();
            }
            if (lIlIIllllIlllII(S() ? 1 : 0) && lIlIIllllIllllI(C0004e.j(lIIlIIIIlIIll[2]))) {
                if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIlIIll[18])) {
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[18]];
                    Movement.walkTo(fd);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIIll[0]);
                    "".length();
                }
                if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIlIIll[18])) {
                    C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[20]], bW);
                }
            }
            if (lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[24])) {
                if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[14])) {
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[22]];
                    Movement.walkTo(gZ);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIIll[0]);
                    "".length();
                }
                if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[14])) {
                    C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[24]], bW);
                }
            }
            if (lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[33])) {
                co = lIIlIIIIlIIll[1];
                String[] strArr = new String[lIIlIIIIlIIll[0]];
                strArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[25]];
                if (lIlIIllllIllllI(Inventory.contains(strArr) ? 1 : 0)) {
                    if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ha), lIIlIIIIlIIll[4])) {
                        if (lIlIIllllIlllII(Inventory.contains(item -> {
                            return item.getName().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[103]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item2 -> {
                                return item2.getName().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[102]]);
                            }).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[8]]);
                        }
                        AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[34]];
                        Movement.walkTo(ha);
                        "".length();
                        Time.sleepTicks(lIIlIIIIlIIll[0]);
                        "".length();
                    }
                    if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(ha), lIIlIIIIlIIll[4])) {
                        C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[35]], bW);
                    }
                }
                String[] strArr2 = new String[lIIlIIIIlIIll[0]];
                strArr2[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[36]];
                if (lIlIIllllIlllII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIlIIIIlIIll[0]];
                    strArr3[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[37]];
                    if (lIlIIllllIllllI(Inventory.contains(strArr3) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIIIIlIIll[0]];
                        iArr7[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[12];
                        if (lIlIIllllIlllII(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIlIIIIlIIll[0]];
                            iArr8[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[12];
                            Item first = Inventory.getFirst(iArr8);
                            String[] strArr4 = new String[lIIlIIIIlIIll[0]];
                            strArr4[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[38]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIIlIIIIlIIll[4]);
                            "".length();
                        }
                        int[] iArr9 = new int[lIIlIIIIlIIll[0]];
                        iArr9[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[12];
                        if (lIlIIllllIllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                            String[] strArr5 = new String[lIIlIIIIlIIll[0]];
                            strArr5[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[39]];
                            NPC nearest2 = NPCs.getNearest(strArr5);
                            new WorldArea(lIIlIIIIlIIll[40], lIIlIIIIlIIll[41], lIIlIIIIlIIll[14], lIIlIIIIlIIll[16], lIIlIIIIlIIll[1]);
                            if (!lIlIIllllIlllll(nearest2) || (lIlIIllllIlllll(nearest2) && lIlIIllllIllllI(Reachable.isInteractable(nearest2) ? 1 : 0))) {
                                Movement.walkTo(hb);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIIll[0]);
                                "".length();
                            }
                            if (lIlIIllllIlllll(nearest2)) {
                                C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[42]], bW, lIIlIIIIlIIll[0]);
                            }
                        }
                    }
                }
                String[] strArr6 = new String[lIIlIIIIlIIll[0]];
                strArr6[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[33]];
                if (lIlIIllllIlllII(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIlIIIIlIIll[0]];
                    strArr7[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[43]];
                    if (lIlIIllllIlllII(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[lIIlIIIIlIIll[0]];
                        strArr8[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[44]];
                        if (lIlIIllllIllllI(Inventory.contains(strArr8) ? 1 : 0) && lIlIIllllIllllI(he ? 1 : 0)) {
                            if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hc), lIIlIIIIlIIll[18]) && lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[45])) {
                                AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[46]];
                                Movement.walkTo(hc);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIIll[0]);
                                "".length();
                            }
                            if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(hc), lIIlIIIIlIIll[18])) {
                                WorldPoint worldPoint = new WorldPoint(lIIlIIIIlIIll[47], lIIlIIIIlIIll[48], lIIlIIIIlIIll[1]);
                                WorldPoint worldPoint2 = new WorldPoint(lIIlIIIIlIIll[47], lIIlIIIIlIIll[49], lIIlIIIIlIIll[1]);
                                if ((!lIlIIllllIllllI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || lIlIIllllIlllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) && lIlIIllllIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo(new WorldPoint(lIIlIIIIlIIll[50], lIIlIIIIlIIll[51], lIIlIIIIlIIll[1]));
                                    "".length();
                                    Time.sleepTicks(lIIlIIIIlIIll[7]);
                                    "".length();
                                }
                                C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[52]], bW, lIIlIIIIlIIll[0]);
                            }
                        }
                    }
                }
                String[] strArr9 = new String[lIIlIIIIlIIll[0]];
                strArr9[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[45]];
                if (lIlIIllllIlllII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIIlIIIIlIIll[0]];
                    strArr10[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[53]];
                    if (lIlIIllllIlllII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIIlIIIIlIIll[0]];
                        strArr11[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[54]];
                        if (lIlIIllllIlllII(Inventory.contains(strArr11) ? 1 : 0) && lIlIIllllIllllI(he ? 1 : 0)) {
                            if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[14])) {
                                AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[55]];
                                Movement.walkTo(gZ);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIIll[0]);
                                "".length();
                            }
                            if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[14])) {
                                C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[56]], bW);
                                List options = Dialog.getOptions();
                                if (lIlIIllllIllllI(options.isEmpty() ? 1 : 0)) {
                                    int i2 = lIIlIIIIlIIll[1];
                                    while (lIlIIllllIlllIl(i2, options.size())) {
                                        if (lIlIIllllIlllII(((Widget) options.get(i2)).getText().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[57]]) ? 1 : 0)) {
                                            System.out.println(lIIlIIIIlIIlI[lIIlIIIIlIIll[58]]);
                                            he = lIIlIIIIlIIll[0];
                                        }
                                        i2++;
                                        "".length();
                                        if ("  ".length() < ((45 ^ 1) & ((236 ^ 192) ^ (-1)))) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(gZ), lIIlIIIIlIIll[20]) && lIlIIllllIllllI(he ? 1 : 0)) {
                    String[] strArr12 = new String[lIIlIIIIlIIll[0]];
                    strArr12[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[59]];
                    if (lIlIIllllIlllII(Inventory.contains(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[lIIlIIIIlIIll[0]];
                        strArr13[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[60]];
                        if (lIlIIllllIlllII(Inventory.contains(strArr13) ? 1 : 0)) {
                            C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[61]], bW);
                            List options2 = Dialog.getOptions();
                            if (lIlIIllllIllllI(options2.isEmpty() ? 1 : 0)) {
                                int i3 = lIIlIIIIlIIll[1];
                                while (lIlIIllllIlllIl(i3, options2.size())) {
                                    if (lIlIIllllIlllII(((Widget) options2.get(i3)).getText().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[62]]) ? 1 : 0)) {
                                        System.out.println(lIIlIIIIlIIlI[lIIlIIIIlIIll[63]]);
                                        he = lIIlIIIIlIIll[0];
                                    }
                                    i3++;
                                    "".length();
                                    if ((true ^ true) & ((true ^ true) ^ true)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIlIIllllIlllII(he ? 1 : 0)) {
                    String[] strArr14 = new String[lIIlIIIIlIIll[0]];
                    strArr14[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[64]];
                    if (lIlIIllllIlllII(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIIlIIIIlIIll[0]];
                        strArr15[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[65]];
                        if (lIlIIllllIlllII(Inventory.contains(strArr15) ? 1 : 0)) {
                            if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hd), lIIlIIIIlIIll[16])) {
                                if (lIlIIllllIlllII(Inventory.contains(item3 -> {
                                    return item3.getName().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[101]]);
                                }) ? 1 : 0)) {
                                    Inventory.getFirst(item4 -> {
                                        return item4.getName().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[100]]);
                                    }).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[66]]);
                                }
                                if (lIlIIllllIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr16 = new String[lIIlIIIIlIIll[0]];
                                strArr16[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[67]];
                                C0006g.a(strArr16);
                                AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[68]];
                                Movement.walkTo(hd);
                                "".length();
                                Time.sleepTicks(lIIlIIIIlIIll[0]);
                                "".length();
                            }
                            if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(hd), lIIlIIIIlIIll[16])) {
                                C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[69]], bW);
                            }
                        }
                    }
                }
            }
            if (!lIlIIlllllIIlIl(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[57]) || lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[58])) {
                String[] strArr17 = new String[lIIlIIIIlIIll[0]];
                strArr17[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[70]];
                if (lIlIIllllIlllII(Inventory.contains(strArr17) ? 1 : 0)) {
                    WorldArea worldArea = new WorldArea(lIIlIIIIlIIll[71], lIIlIIIIlIIll[72], lIIlIIIIlIIll[24], lIIlIIIIlIIll[18], lIIlIIIIlIIll[1]);
                    C0006g.a(bW);
                    if (lIlIIllllIllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[73]];
                        Movement.walkTo(hc);
                        "".length();
                        Time.sleepTicks(lIIlIIIIlIIll[0]);
                        "".length();
                    }
                    if (lIlIIllllIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[74]];
                        C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[75]], bW, lIIlIIIIlIIll[0]);
                    }
                }
            }
            if (lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[67])) {
                String[] strArr18 = new String[lIIlIIIIlIIll[0]];
                strArr18[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[76]];
                if (lIlIIllllIlllII(Inventory.contains(strArr18) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[77]];
                    String[] strArr19 = new String[lIIlIIIIlIIll[0]];
                    strArr19[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[78]];
                    Item first2 = Inventory.getFirst(strArr19);
                    String[] strArr20 = new String[lIIlIIIIlIIll[0]];
                    strArr20[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[32]];
                    first2.useOn(NPCs.getNearest(strArr20));
                    Time.sleepTicks(lIIlIIIIlIIll[20]);
                    "".length();
                }
            }
            if (lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[32])) {
                WorldArea worldArea2 = new WorldArea(lIIlIIIIlIIll[71], lIIlIIIIlIIll[72], lIIlIIIIlIIll[14], lIIlIIIIlIIll[5], lIIlIIIIlIIll[1]);
                if (lIlIIllllIllllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[79]];
                    String[] strArr21 = new String[lIIlIIIIlIIll[0]];
                    strArr21[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[80]];
                    Item first3 = Inventory.getFirst(strArr21);
                    String[] strArr22 = new String[lIIlIIIIlIIll[0]];
                    strArr22[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[81]];
                    first3.useOn(TileObjects.getNearest(strArr22));
                    Time.sleepTicks(lIIlIIIIlIIll[7]);
                    "".length();
                }
                if (lIlIIllllIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[82]], bW);
                }
            }
            if (lIlIIlllllIIlII(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[83])) {
                if (lIlIIlllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIlIIll[18])) {
                    if (lIlIIllllIlllII(new WorldArea(lIIlIIIIlIIll[71], lIIlIIIIlIIll[72], lIIlIIIIlIIll[14], lIIlIIIIlIIll[5], lIIlIIIIlIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllllI(Equipment.contains(C0005f.aW) ? 1 : 0)) {
                        int[] iArr10 = new int[lIIlIIIIlIIll[0]];
                        iArr10[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                        if (lIlIIllllIlllII(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lIIlIIIIlIIll[0]];
                            iArr11[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                            Inventory.getFirst(iArr11).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[84]]);
                            Time.sleepTicks(C0004e.c(lIIlIIIIlIIll[16], lIIlIIIIlIIll[20]));
                            "".length();
                        }
                    }
                    if (lIlIIllllIlllII(new WorldArea(lIIlIIIIlIIll[51], lIIlIIIIlIIll[85], lIIlIIIIlIIll[52], lIIlIIIIlIIll[55], lIIlIIIIlIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlllllIIIll(Players.getLocal().getWorldLocation().getX(), lIIlIIIIlIIll[86])) {
                        AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[87]];
                        String[] strArr23 = new String[lIIlIIIIlIIll[0]];
                        strArr23[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[88]];
                        TileObjects.getNearest(strArr23).interact(lIIlIIIIlIIlI[lIIlIIIIlIIll[89]]);
                        Time.sleepTicks(C0004e.c(lIIlIIIIlIIll[5], lIIlIIIIlIIll[16]));
                        "".length();
                    }
                    AccBuilderRat.c = lIIlIIIIlIIlI[lIIlIIIIlIIll[90]];
                    Movement.walkTo(fd);
                    "".length();
                    Time.sleepTicks(lIIlIIIIlIIll[0]);
                    "".length();
                }
                if (lIlIIlllllIIIll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIlIIll[18])) {
                    if (lIlIIllllIlllIl(co, lIIlIIIIlIIll[0])) {
                        P.ls += lIIlIIIIlIIll[0];
                        P.d(AccBuilderRat.m);
                        co += lIIlIIIIlIIll[0];
                        P.ls = lIIlIIIIlIIll[1];
                        cp = lIIlIIIIlIIll[1];
                    }
                    C0006g.a(lIIlIIIIlIIlI[lIIlIIIIlIIll[91]], bW);
                }
            }
            C0006g.a(new String[lIIlIIIIlIIll[1]]);
        }
    }

    private static boolean lIlIIllllIllllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlllllIIIll(int i2, int i3) {
        return i2 <= i3;
    }

    private static String lIlIIllllIllIII(String llllllllllllllIlllllllIIIlIIIIlI, String llllllllllllllIlllllllIIIlIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIIlIIll[4], llllllllllllllIlllllllIIIlIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIIlIIIIll) {
            llllllllllllllIlllllllIIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllllIlllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0171, code lost:
        if (lIlIIllllIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.D.lIIlIIIIlIIll[7]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[lIIlIIIIlIIll[0]];
        iArr10[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[28];
        if (lIlIIllllIllllI(Bank.contains(iArr10) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIlIIll[28], lIIlIIIIlIIll[0], lIIlIIIIlIIll[92]));
            "".length();
        }
        int[] iArr11 = new int[lIIlIIIIlIIll[0]];
        iArr11[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[26];
        if (lIlIIllllIllllI(Bank.contains(iArr11) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIlIIll[26], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
            "".length();
        }
        int[] iArr12 = new int[lIIlIIIIlIIll[0]];
        iArr12[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[23];
        if (lIlIIllllIllllI(Bank.contains(iArr12) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIlIIll[23], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
            "".length();
        }
        int[] iArr13 = new int[lIIlIIIIlIIll[0]];
        iArr13[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[21];
        if (lIlIIllllIllllI(Bank.contains(iArr13) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIlIIll[21], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
            "".length();
        }
        int[] iArr14 = new int[lIIlIIIIlIIll[0]];
        iArr14[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[6];
        if (lIlIIllllIlllII(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIIlIIIIlIIll[0]];
            iArr15[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[6];
            if (lIlIIllllIlllII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlIIIIlIIll[0]];
                iArr16[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[6];
            }
            iArr = new int[lIIlIIIIlIIll[0]];
            iArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[15];
            if (lIlIIllllIllllI(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[15], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr2 = new int[lIIlIIIIlIIll[0]];
            iArr2[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[17];
            if (lIlIIllllIllllI(Bank.contains(iArr2) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[17], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr3 = new int[lIIlIIIIlIIll[0]];
            iArr3[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[19];
            if (lIlIIllllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[19], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr4 = new int[lIIlIIIIlIIll[0]];
            iArr4[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[13];
            if (lIlIIllllIllllI(Bank.contains(iArr4) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[13], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr5 = new int[lIIlIIIIlIIll[0]];
            iArr5[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[12];
            if (lIlIIllllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[12], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr6 = new int[lIIlIIIIlIIll[0]];
            iArr6[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[11];
            if (lIlIIllllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[11], lIIlIIIIlIIll[7], lIIlIIIIlIIll[93]));
                "".length();
            }
            iArr7 = new int[lIIlIIIIlIIll[0]];
            iArr7[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[10];
            if (lIlIIllllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[10], lIIlIIIIlIIll[0], lIIlIIIIlIIll[93]));
                "".length();
            }
            if (lIlIIllllIllllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[99]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[94], lIIlIIIIlIIll[14], lIIlIIIIlIIll[95]));
                "".length();
            }
            iArr8 = new int[lIIlIIIIlIIll[0]];
            iArr8[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[29];
            if (lIlIIllllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
                bA.add(new C0003d(lIIlIIIIlIIll[29], lIIlIIIIlIIll[5], C0007h.bv));
                "".length();
            }
            iArr9 = new int[lIIlIIIIlIIll[0]];
            iArr9[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
            if (lIlIIllllIlllII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIIIlIIll[0]];
                iArr17[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                if (!lIlIIllllIlllII(Bank.contains(iArr17) ? 1 : 0)) {
                    return;
                }
                int[] iArr18 = new int[lIIlIIIIlIIll[0]];
                iArr18[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
                if (!lIlIIllllIlllIl(Bank.getFirst(iArr18).getQuantity(), lIIlIIIIlIIll[36])) {
                    return;
                }
            }
            bA.add(new C0003d(lIIlIIIIlIIll[9], lIIlIIIIlIIll[67], lIIlIIIIlIIll[96]));
            "".length();
        }
        bA.add(new C0003d(lIIlIIIIlIIll[6], lIIlIIIIlIIll[7], lIIlIIIIlIIll[93]));
        "".length();
        iArr = new int[lIIlIIIIlIIll[0]];
        iArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[15];
        if (lIlIIllllIllllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlIIIIlIIll[0]];
        iArr2[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[17];
        if (lIlIIllllIllllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIIIIlIIll[0]];
        iArr3[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[19];
        if (lIlIIllllIllllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIIIIlIIll[0]];
        iArr4[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[13];
        if (lIlIIllllIllllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIIIIlIIll[0]];
        iArr5[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[12];
        if (lIlIIllllIllllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIIIIlIIll[0]];
        iArr6[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[11];
        if (lIlIIllllIllllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIlIIIIlIIll[0]];
        iArr7[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[10];
        if (lIlIIllllIllllI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (lIlIIllllIllllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlIIIIlIIlI[lIIlIIIIlIIll[99]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[lIIlIIIIlIIll[0]];
        iArr8[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[29];
        if (lIlIIllllIllllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIlIIIIlIIll[0]];
        iArr9[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
        if (lIlIIllllIlllII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIlIIIIlIIll[9], lIIlIIIIlIIll[67], lIIlIIIIlIIll[96]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIlIIll[1];
    }

    private static void lIlIIllllIllIlI() {
        lIIlIIIIlIIll = new int[130];
        lIIlIIIIlIIll[0] = " ".length();
        lIIlIIIIlIIll[1] = (144 ^ 138) & ((55 ^ 45) ^ (-1));
        lIIlIIIIlIIll[2] = (-((-2961) & 31733)) & (-515) & 29559;
        lIIlIIIIlIIll[3] = (-9235) & 14234;
        lIIlIIIIlIIll[4] = "  ".length();
        lIIlIIIIlIIll[5] = (((4 + 102) - (-49)) + 32) ^ (((22 + 2) - (-95)) + 72);
        lIIlIIIIlIIll[6] = (-22657) & 24573;
        lIIlIIIIlIIll[7] = "   ".length();
        lIIlIIIIlIIll[8] = (((17 + 146) - 103) + 143) ^ (((169 + 120) - 198) + 108);
        lIIlIIIIlIIll[9] = (-24753) & 32759;
        lIIlIIIIlIIll[10] = (-31) & 1791;
        lIIlIIIIlIIll[11] = (-((-16487) & 31079)) & (-16385) & 32735;
        lIIlIIIIlIIll[12] = (-16387) & 18151;
        lIIlIIIIlIIll[13] = (-33) & 1983;
        lIIlIIIIlIIll[14] = (59 ^ 95) ^ (119 ^ 22);
        lIIlIIIIlIIll[15] = (-((-2069) & 23710)) & (-8195) & 30427;
        lIIlIIIIlIIll[16] = (((73 + 109) - 93) + 65) ^ (((18 + 42) - 21) + 117);
        lIIlIIIIlIIll[17] = (-6229) & 8157;
        lIIlIIIIlIIll[18] = (133 ^ 198) ^ (104 ^ 44);
        lIIlIIIIlIIll[19] = (-4115) & 6047;
        lIIlIIIIlIIll[20] = 76 ^ 68;
        lIIlIIIIlIIll[21] = (-17937) & 20285;
        lIIlIIIIlIIll[22] = (((1 + 31) - (-13)) + 89) ^ (((36 + 25) - 28) + 110);
        lIIlIIIIlIIll[23] = (-30731) & 31743;
        lIIlIIIIlIIll[24] = 31 ^ 21;
        lIIlIIIIlIIll[25] = (116 ^ 2) ^ (73 ^ 52);
        lIIlIIIIlIIll[26] = (-((-4307) & 22739)) & (-4097) & 23482;
        lIIlIIIIlIIll[27] = (-4613) & 4991;
        lIIlIIIIlIIll[28] = (-((-8233) & 8506)) & (-37) & 12287;
        lIIlIIIIlIIll[29] = (-((-13073) & 32543)) & (-673) & 32767;
        lIIlIIIIlIIll[30] = (-((-1905) & 22389)) & (-11265) & 32743;
        lIIlIIIIlIIll[31] = (-3075) & 4074;
        lIIlIIIIlIIll[32] = 149 ^ 167;
        lIIlIIIIlIIll[33] = (((148 + 166) - 234) + 102) ^ (((135 + 108) - 149) + 68);
        lIIlIIIIlIIll[34] = 73 ^ 68;
        lIIlIIIIlIIll[35] = (179 ^ 173) ^ (9 ^ 25);
        lIIlIIIIlIIll[36] = (118 ^ 88) ^ (128 ^ 161);
        lIIlIIIIlIIll[37] = (153 ^ 198) ^ (71 ^ 8);
        lIIlIIIIlIIll[38] = 186 ^ 171;
        lIIlIIIIlIIll[39] = 112 ^ 98;
        lIIlIIIIlIIll[40] = (-16401) & 19483;
        lIIlIIIIlIIll[41] = (-321) & 3576;
        lIIlIIIIlIIll[42] = (133 ^ 168) ^ (3 ^ 61);
        lIIlIIIIlIIll[43] = 186 ^ 175;
        lIIlIIIIlIIll[44] = 72 ^ 94;
        lIIlIIIIlIIll[45] = 189 ^ 164;
        lIIlIIIIlIIll[46] = (46 ^ 105) ^ (60 ^ 108);
        lIIlIIIIlIIll[47] = (-16579) & 19706;
        lIIlIIIIlIIll[48] = (-20802) & 24047;
        lIIlIIIIlIIll[49] = (-((-869) & 9077)) & (-20737) & 32191;
        lIIlIIIIlIIll[50] = (-((-13313) & 30149)) & (-12803) & 32767;
        lIIlIIIIlIIll[51] = (-((-5365) & 14069)) & (-4417) & 16365;
        lIIlIIIIlIIll[52] = 82 ^ 74;
        lIIlIIIIlIIll[53] = (83 ^ 104) ^ (53 ^ 20);
        lIIlIIIIlIIll[54] = (24 ^ 94) ^ (81 ^ 12);
        lIIlIIIIlIIll[55] = (132 ^ 177) ^ (44 ^ 5);
        lIIlIIIIlIIll[56] = 156 ^ 129;
        lIIlIIIIlIIll[57] = (183 ^ 197) ^ (15 ^ 99);
        lIIlIIIIlIIll[58] = 188 ^ 163;
        lIIlIIIIlIIll[59] = 129 ^ 161;
        lIIlIIIIlIIll[60] = " ".length() ^ (82 ^ 114);
        lIIlIIIIlIIll[61] = 6 ^ 36;
        lIIlIIIIlIIll[62] = (93 ^ 38) ^ (97 ^ 57);
        lIIlIIIIlIIll[63] = 11 ^ 47;
        lIIlIIIIlIIll[64] = (123 ^ 90) ^ (194 ^ 198);
        lIIlIIIIlIIll[65] = (69 ^ 23) ^ (229 ^ 145);
        lIIlIIIIlIIll[66] = (((1 + 53) - (-26)) + 47) ^ (66 ^ 26);
        lIIlIIIIlIIll[67] = (((88 + 17) - 49) + 106) ^ (((4 + 93) - 26) + 67);
        lIIlIIIIlIIll[68] = (232 ^ 183) ^ (57 ^ 79);
        lIIlIIIIlIIll[69] = (56 ^ 17) ^ "   ".length();
        lIIlIIIIlIIll[70] = 28 ^ 55;
        lIIlIIIIlIIll[71] = (-4235) & 7355;
        lIIlIIIIlIIll[72] = (-16721) & 19960;
        lIIlIIIIlIIll[73] = (((238 + 117) - 145) + 29) ^ (((179 + 45) - 153) + 124);
        lIIlIIIIlIIll[74] = 40 ^ 5;
        lIIlIIIIlIIll[75] = (140 ^ 153) ^ (129 ^ 186);
        lIIlIIIIlIIll[76] = (192 ^ 156) ^ (74 ^ 57);
        lIIlIIIIlIIll[77] = 127 ^ 79;
        lIIlIIIIlIIll[78] = (192 ^ 197) ^ (133 ^ 177);
        lIIlIIIIlIIll[79] = (76 ^ 6) ^ (112 ^ 9);
        lIIlIIIIlIIll[80] = 144 ^ 164;
        lIIlIIIIlIIll[81] = (30 ^ 54) ^ (223 ^ 194);
        lIIlIIIIlIIll[82] = (123 ^ 69) ^ (99 ^ 107);
        lIIlIIIIlIIll[83] = 241 ^ 149;
        lIIlIIIIlIIll[84] = (184 ^ 156) ^ (210 ^ 193);
        lIIlIIIIlIIll[85] = (-21025) & 24244;
        lIIlIIIIlIIll[86] = (-((-6347) & 31695)) & (-4097) & 32711;
        lIIlIIIIlIIll[87] = " ".length() ^ (71 ^ 126);
        lIIlIIIIlIIll[88] = (147 ^ 176) ^ (138 ^ 144);
        lIIlIIIIlIIll[89] = 48 ^ 10;
        lIIlIIIIlIIll[90] = (((123 + 30) - 132) + 110) ^ (((105 + 111) - 105) + 73);
        lIIlIIIIlIIll[91] = 52 ^ 8;
        lIIlIIIIlIIll[92] = (-((-38) & 5047)) & (-8257) & 32765;
        lIIlIIIIlIIll[93] = (-((-21077) & 31445)) & (-1) & 15868;
        lIIlIIIIlIIll[94] = (-16385) & 28364;
        lIIlIIIIlIIll[95] = (-2577) & 27576;
        lIIlIIIIlIIll[96] = (-6290) & 8189;
        lIIlIIIIlIIll[97] = 254 ^ 195;
        lIIlIIIIlIIll[98] = (((42 + 134) - 151) + 219) ^ (((82 + 111) - 111) + 72);
        lIIlIIIIlIIll[99] = 176 ^ 142;
        lIIlIIIIlIIll[100] = 132 ^ 187;
        lIIlIIIIlIIll[101] = (161 ^ 136) ^ (89 ^ 48);
        lIIlIIIIlIIll[102] = 199 ^ 134;
        lIIlIIIIlIIll[103] = 95 ^ 29;
        lIIlIIIIlIIll[104] = (-17153) & 20451;
        lIIlIIIIlIIll[105] = (-28805) & 31965;
        lIIlIIIIlIIll[106] = (-4869) & 8158;
        lIIlIIIIlIIll[107] = (-16513) & 19694;
        lIIlIIIIlIIll[108] = (-21474) & 24571;
        lIIlIIIIlIIll[109] = (-29441) & 32698;
        lIIlIIIIlIIll[110] = (-((-10643) & 27123)) & (-403) & 19967;
        lIIlIIIIlIIll[111] = (-20737) & 23995;
        lIIlIIIIlIIll[112] = (-193) & 3318;
        lIIlIIIIlIIll[113] = (-((-10305) & 31573)) & (-8257) & 32767;
        lIIlIIIIlIIll[114] = (-((-28187) & 28443)) & (-8407) & 11774;
        lIIlIIIIlIIll[115] = (-((-3306) & 4075)) & (-16385) & 20415;
        lIIlIIIIlIIll[116] = 23 ^ 84;
        lIIlIIIIlIIll[117] = 23 ^ 83;
        lIIlIIIIlIIll[118] = (86 ^ 124) ^ (209 ^ 190);
        lIIlIIIIlIIll[119] = 119 ^ 49;
        lIIlIIIIlIIll[120] = (196 ^ 184) ^ (39 ^ 28);
        lIIlIIIIlIIll[121] = (198 ^ 151) ^ (114 ^ 107);
        lIIlIIIIlIIll[122] = (((149 + 57) - 148) + 152) ^ (((126 + 37) - 38) + 30);
        lIIlIIIIlIIll[123] = 96 ^ 42;
        lIIlIIIIlIIll[124] = (((1 + 203) - (-16)) + 28) ^ (((91 + 104) - 86) + 70);
        lIIlIIIIlIIll[125] = 39 ^ 107;
        lIIlIIIIlIIll[126] = (86 ^ 71) ^ (114 ^ 46);
        lIIlIIIIlIIll[127] = 11 ^ 69;
        lIIlIIIIlIIll[128] = 98 ^ 45;
        lIIlIIIIlIIll[129] = (60 ^ 66) ^ (91 ^ 117);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlllllIIllI(C0004e.j(lIIlIIIIlIIll[2]), lIIlIIIIlIIll[98])) {
            ?? r0 = lIIlIIIIlIIll[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIIlIIll[1];
    }

    static {
        lIlIIllllIllIlI();
        lIlIIllllIllIIl();
        gY = lIIlIIIIlIIll[2];
        bA = new ArrayList();
        fd = new WorldPoint(lIIlIIIIlIIll[104], lIIlIIIIlIIll[105], lIIlIIIIlIIll[1]);
        gZ = new WorldPoint(lIIlIIIIlIIll[106], lIIlIIIIlIIll[107], lIIlIIIIlIIll[1]);
        ha = new WorldPoint(lIIlIIIIlIIll[108], lIIlIIIIlIIll[109], lIIlIIIIlIIll[1]);
        hb = new WorldPoint(lIIlIIIIlIIll[110], lIIlIIIIlIIll[111], lIIlIIIIlIIll[1]);
        hc = new WorldPoint(lIIlIIIIlIIll[112], lIIlIIIIlIIll[113], lIIlIIIIlIIll[1]);
        hd = new WorldPoint(lIIlIIIIlIIll[114], lIIlIIIIlIIll[115], lIIlIIIIlIIll[1]);
        String[] strArr = new String[lIIlIIIIlIIll[34]];
        strArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[116]];
        strArr[lIIlIIIIlIIll[0]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[117]];
        strArr[lIIlIIIIlIIll[4]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[118]];
        strArr[lIIlIIIIlIIll[7]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[119]];
        strArr[lIIlIIIIlIIll[5]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[120]];
        strArr[lIIlIIIIlIIll[14]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[121]];
        strArr[lIIlIIIIlIIll[16]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[122]];
        strArr[lIIlIIIIlIIll[18]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[123]];
        strArr[lIIlIIIIlIIll[20]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[124]];
        strArr[lIIlIIIIlIIll[22]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[125]];
        strArr[lIIlIIIIlIIll[24]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[126]];
        strArr[lIIlIIIIlIIll[25]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[127]];
        strArr[lIIlIIIIlIIll[8]] = lIIlIIIIlIIlI[lIIlIIIIlIIll[128]];
        bW = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIlIIIIlIIll[8]];
        iArr[lIIlIIIIlIIll[1]] = lIIlIIIIlIIll[9];
        iArr[lIIlIIIIlIIll[0]] = lIIlIIIIlIIll[10];
        iArr[lIIlIIIIlIIll[4]] = lIIlIIIIlIIll[11];
        iArr[lIIlIIIIlIIll[7]] = lIIlIIIIlIIll[12];
        iArr[lIIlIIIIlIIll[5]] = lIIlIIIIlIIll[13];
        iArr[lIIlIIIIlIIll[14]] = lIIlIIIIlIIll[15];
        iArr[lIIlIIIIlIIll[16]] = lIIlIIIIlIIll[17];
        iArr[lIIlIIIIlIIll[18]] = lIIlIIIIlIIll[19];
        iArr[lIIlIIIIlIIll[20]] = lIIlIIIIlIIll[21];
        iArr[lIIlIIIIlIIll[22]] = lIIlIIIIlIIll[23];
        iArr[lIIlIIIIlIIll[24]] = lIIlIIIIlIIll[6];
        iArr[lIIlIIIIlIIll[25]] = lIIlIIIIlIIll[26];
        int i2 = lIIlIIIIlIIll[1];
        while (lIlIIllllIlllIl(i2, iArr.length)) {
            int[] iArr2 = new int[lIIlIIIIlIIll[0]];
            iArr2[lIIlIIIIlIIll[1]] = iArr[i2];
            if (lIlIIllllIllllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIIlIIll[1];
            }
            i2++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIlIIIIlIIll[0];
    }

    private static boolean lIlIIlllllIIIII(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlllllIIIIl(int i2) {
        return i2 < 0;
    }

    private static boolean lIlIIlllllIIIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIlIIllllIllIIl() {
        lIIlIIIIlIIlI = new String[lIIlIIIIlIIll[129]];
        lIIlIIIIlIIlI[lIIlIIIIlIIll[1]] = lIlIIllllIlIllI("C9qc9w3/RJGT2Tv+7tOVoxEU8uznsOqD028SKgVowzYYzLWQrybjeJRxh5MZbBBW", "gymPo");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[0]] = lIlIIllllIlIlll("BRMzWgckUicbHSA=", "KrEzs");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[4]] = lIlIIllllIlIllI("Z89VA1bByoL3z1n2R+6IJcna6yZWezzB", "XWLrz");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[7]] = lIlIIllllIllIII("WPYDRk6SwEFRVdpvPa4yQzlCYvnMiOeJgvJpZhIPUUR+n1VO7+Kxoeiljx6XC0BQhALd9dUQ4IE=", "MYDLF");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[5]] = lIlIIllllIlIllI("js2m1n5juZ86hC1n9t+FTRPqMkoNVCCgvjyp73m/b5976Wt4oLr+y4+bgWaWFQ1aAXRgL7y8QWI=", "BSRdv");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[14]] = lIlIIllllIlIlll("CwE6JD0=", "OsSJV");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[16]] = lIlIIllllIllIII("zI7qKDh/Ha8=", "vErGB");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[18]] = lIlIIllllIlIlll("PggAYwYfSQU3EwId", "pivCr");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[20]] = lIlIIllllIllIII("H1N8Oqm1xkVa5A4kzgElBrJcYOG64nmr", "WEEvk");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[22]] = lIlIIllllIlIllI("cT0ohECFybLHgSaWxlBgrg==", "UpXol");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[24]] = lIlIIllllIlIlll("Ijo6Jjw=", "mIWGR");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[25]] = lIlIIllllIlIllI("H2nAwtJZFKs=", "SYwPe");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[8]] = lIlIIllllIlIlll("MD8wCg==", "gZQxM");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[34]] = lIlIIllllIlIllI("oDDsd+i5Y1YA41qWiDZ3iA==", "lsroY");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[35]] = lIlIIllllIlIllI("6CprjUDvWJA=", "sjbuX");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[36]] = lIlIIllllIlIllI("/rpAnXAj3rI=", "PXdXM");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[37]] = lIlIIllllIlIllI("U0NYT+lUHxc=", "bknbH");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[38]] = lIlIIllllIllIII("0QuVlXhr7+w=", "JeaDd");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[39]] = lIlIIllllIllIII("mjvAENpqN30=", "lavpv");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[42]] = lIlIIllllIlIlll("NSUTKiI=", "tBtCG");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[33]] = lIlIIllllIlIlll("FhsP", "ArhGR");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[43]] = lIlIIllllIllIII("wRa+SM2rHh4=", "qQTGh");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[44]] = lIlIIllllIlIllI("lF7eodU9nWoGL+JluzodnA==", "JFkmq");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[46]] = lIlIIllllIlIllI("7zX1ZQL6uKwHzWk6IEYIdQ==", "PNguo");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[52]] = lIlIIllllIlIllI("kRjhBZcCzYxzjUVo0Gki/g==", "mbYdD");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[45]] = lIlIIllllIllIII("4oKwK8+nt/w=", "uAnqf");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[53]] = lIlIIllllIlIlll("NhcENQY=", "fvwAc");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[54]] = lIlIIllllIllIII("Dd/CSzkgf3Uv0L91H8BjLw==", "JKGwi");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[55]] = lIlIIllllIllIII("2eoMy7n6hRJUVlc3GzUsQQ==", "RdgMt");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[56]] = lIlIIllllIlIllI("1FJ19w+NMTk=", "aiZOY");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[57]] = lIlIIllllIllIII("VOmQmDy1opW1EUVsp7zRrw==", "TWogU");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[58]] = lIlIIllllIlIlll("IQ1iNgFmDicnAic=", "FbBBn");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[59]] = lIlIIllllIllIII("NjG1jDEw37c=", "FAqMW");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[60]] = lIlIIllllIllIII("FMFc8cbRyfw=", "UphcA");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[61]] = lIlIIllllIlIllI("AB/d5GH2QUk=", "ukkLL");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[62]] = lIlIIllllIllIII("KT8fiM97NLlQ2VdJ0qWySw==", "YwwYM");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[63]] = lIlIIllllIllIII("SeDLiBrFoQQhygzoIUqVqw==", "Ajpzb");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[64]] = lIlIIllllIllIII("S75opmodNaI=", "kXBAG");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[65]] = lIlIIllllIllIII("M/yktcCCakQ=", "Ayyqi");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[66]] = lIlIIllllIllIII("D4IeoImBwQc=", "iFxWA");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[67]] = lIlIIllllIlIlll("CGUGCUgmJx5FDy4rBAJG", "ABjeh");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[68]] = lIlIIllllIlIllI("ovkgVPIDU+clxmZrYpnoVw==", "fmpbU");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[69]] = lIlIIllllIllIII("4wgYVPo5geU=", "Rxdeb");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[70]] = lIlIIllllIlIlll("Ego7CjI1WD8BMQ==", "PxTdH");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[73]] = lIlIIllllIllIII("NGpoSd7/ZeXPMOV96PMd3g==", "qLRpX");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[74]] = lIlIIllllIlIlll("Ew83Bms2AyQR", "TfAcK");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[75]] = lIlIIllllIlIlll("IScg", "kHEIa");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[76]] = lIlIIllllIlIllI("uaqfScLQb5g=", "dTzii");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[77]] = lIlIIllllIlIlll("MAM8JDVEDyU=", "dzUJR");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[78]] = lIlIIllllIlIlll("KzUWJA==", "yZfAq");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[32]] = lIlIIllllIllIII("pztaG5/kp+51YVTk4MmFnQ==", "GkNHf");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[79]] = lIlIIllllIlIlll("BiIXFxoqIgRSAiIlDw==", "CLcrh");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[80]] = lIlIIllllIlIllI("PrbZndFpBuKHSaPmRqCKbg==", "eSSvy");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[81]] = lIlIIllllIllIII("HQvQwvnX72CP+IqXmXr/jA==", "YnNhD");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[82]] = lIlIIllllIlIlll("KCobOQIdeDM7CA==", "xXrWa");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[84]] = lIlIIllllIlIllI("KIFkafjTxrA=", "DJfkf");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[87]] = lIlIIllllIllIII("KLiay+dpWymf+Snoyo61rw==", "fkQtD");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[88]] = lIlIIllllIllIII("IvoMC/oE90k=", "EcYYh");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[89]] = lIlIIllllIlIllI("YMmSonrslAE=", "sJfgi");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[90]] = lIlIIllllIllIII("VkE4YZgkrrJftyoX7F1kPA==", "dWJQl");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[91]] = lIlIIllllIlIllI("vcwNRgsEZlRMUuGdvGTeSAdZCJl8GKgi", "jtLvU");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[97]] = lIlIIllllIlIllI("hrIswVAZ3Bzvle5Y6NUqOkx62h39pVB4", "zRgZq");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[99]] = lIlIIllllIllIII("CeHHnrv2f/pRpg6E5vmqdXtNHEXWD5Yc", "yPpxg");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[100]] = lIlIIllllIlIlll("MyM+JSk=", "TOQWP");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[101]] = lIlIIllllIllIII("NcsievhZBFc=", "hzpBH");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[102]] = lIlIIllllIllIII("SBTUxhbto9U=", "FnwrP");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[103]] = lIlIIllllIlIllI("o6tHLmDcyRY=", "QilZO");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[116]] = lIlIIllllIlIlll("DgQkew==", "WaWUN");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[117]] = lIlIIllllIllIII("7QMgDbylDao+K1cKyyvXgHaLmSha7xBdFNOkZYkxp3KEEUhtj/6Gzg==", "GzLQT");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[118]] = lIlIIllllIlIllI("n9P1BGhbwxpiOTHM7sE9R1UiBetj9veqEhyPzYXPsqtuW9Ompgz807mB2F13qRmz", "ViWEM");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[119]] = lIlIIllllIlIllI("IQHsqn7+1RV9UluDGLRaj1XNz8lodvxUffUiqI6U8ys=", "sPedk");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[120]] = lIlIIllllIlIlll("I1EHKwcPURsiFAdRBy8DD19PGh0PEBwvUQcQBC9RBxRPK1EdGAhk", "jqoJq");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[121]] = lIlIIllllIllIII("TazhFoU+NJTBq/2vtzc2dgQ2ipGNTWkBoDoupIyfUBw=", "GTsmW");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[122]] = lIlIIllllIlIllI("jN20mDLnYMiNeLeajn8wnpUD+jbhaJ75iJldHwmgkZJn7YNHnF75jQ==", "qbMon");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[123]] = lIlIIllllIlIlll("ASMSOyBpKRVpPSYzTGkdJjNUOyFpIBIkKzw1UyAqaQEaLCggKBw7ZQ==", "IFsID");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[124]] = lIlIIllllIllIII("vYc9wfsUHjJAGWlkKaZ5hdO6ykVEtYx+FJ4PYte0bpc=", "oohlF");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[125]] = lIlIIllllIlIlll("KiIOaQsNbQAmGkImFyYYQj4WJAoNIxxpGA0jXj1PFj8AaRsNbR87CgdtESACXQ==", "bMyIo");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[126]] = lIlIIllllIllIII("lstdYMzl0ROFH/hxzPqVFHoOOKK3+2ZjrzVTo0xkhuo=", "zuzYb");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[127]] = lIlIIllllIlIllI("E6EGSq1Xdhv//s40978/jFvMbkvAyZ1hbr1CpyF2A/QwRzJwTmemEzW2Ncv1oo7e", "kmufv");
        lIIlIIIIlIIlI[lIIlIIIIlIIll[128]] = lIlIIllllIlIlll("E0McMQY/Qwc/HT9DFjUVKEMcNQI/TVQWETQADXAfNAZL", "ZctPp");
    }

    private static boolean lIlIIlllllIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlllllIIllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static String lIlIIllllIlIlll(String llllllllllllllIlllllllIIIlIlIlll, String llllllllllllllIlllllllIIIlIlIllI) {
        String llllllllllllllIlllllllIIIlIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllllIIIlIlIlIl = new StringBuilder();
        char[] charArray = llllllllllllllIlllllllIIIlIlIllI.toCharArray();
        int llllllllllllllIlllllllIIIlIIlllI = lIIlIIIIlIIll[1];
        char[] charArray2 = llllllllllllllIlllllllIIIlIlIlll2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllllllIIIlIIlIll = lIIlIIIIlIIll[1];
        while (lIlIIllllIlllIl(llllllllllllllIlllllllIIIlIIlIll, length)) {
            llllllllllllllIlllllllIIIlIlIlIl.append((char) (charArray2[llllllllllllllIlllllllIIIlIIlIll] ^ charArray[llllllllllllllIlllllllIIIlIIlllI % charArray.length]));
            "".length();
            llllllllllllllIlllllllIIIlIIlllI++;
            llllllllllllllIlllllllIIIlIIlIll++;
            "".length();
            if ((((((0 + 64) - 25) + 94) ^ (((27 + 122) - 13) + 12)) & (((24 ^ 56) ^ (175 ^ 158)) ^ (-" ".length()))) != (((((104 + 56) - 32) + 54) ^ (((116 + 6) - (-22)) + 1)) & (((105 ^ 52) ^ (223 ^ 165)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllllIIIlIlIlIl);
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIlIIlI[lIIlIIIIlIIll[97]];
    }

    private static boolean lIlIIllllIlllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIllllIlIllI(String llllllllllllllIlllllllIIIllIIlll, String llllllllllllllIlllllllIIIllIIllI) {
        try {
            SecretKeySpec llllllllllllllIlllllllIIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllIIIllIIllI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIIll[20]), "DES");
            Cipher llllllllllllllIlllllllIIIllIlIIl = Cipher.getInstance("DES");
            llllllllllllllIlllllllIIIllIlIIl.init(lIIlIIIIlIIll[4], llllllllllllllIlllllllIIIllIlIlI);
            return new String(llllllllllllllIlllllllIIIllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllIIIllIlIII) {
            llllllllllllllIlllllllIIIllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllllIlllII(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlllllIIlIl(int i2, int i3) {
        return i2 != i3;
    }
}
