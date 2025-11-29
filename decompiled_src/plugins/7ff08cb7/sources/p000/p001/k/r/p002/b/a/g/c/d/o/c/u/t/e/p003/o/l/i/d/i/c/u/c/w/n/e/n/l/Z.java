package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.Z  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/Z.class */
public class Z implements ab {
    private static /* synthetic */ String[] llIlIIlll;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint lN;
    static /* synthetic */ int cI;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint lO;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint lP;
    private static /* synthetic */ int[] llIlIlIII;
    public static final /* synthetic */ WorldPoint lM;
    static /* synthetic */ int dk;
    public static final /* synthetic */ String[] lQ;

    private static String lIllIIlIIIll(String lIIllIIIllIIll, String lIIllIIIllIIlI) {
        String lIIllIIIllIIll2 = new String(Base64.getDecoder().decode(lIIllIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIllIIIl = new StringBuilder();
        char[] charArray = lIIllIIIllIIlI.toCharArray();
        int lIIllIIIlIllll = llIlIlIII[0];
        char[] charArray2 = lIIllIIIllIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIII[0];
        while (lIllIIlIlIIl(i, length)) {
            char lIIllIIIllIlII = charArray2[i];
            lIIllIIIllIIIl.append((char) (lIIllIIIllIlII ^ charArray[lIIllIIIlIllll % charArray.length]));
            "".length();
            lIIllIIIlIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIIllIIIllIIIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIlIlIII[1]];
        strArr[llIlIlIII[0]] = llIlIIlll[llIlIlIII[47]];
        if (lIllIIlIlIII(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIlIlIII[1]];
            strArr2[llIlIlIII[0]] = llIlIIlll[llIlIlIII[48]];
            if (lIllIIlIlIII(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[llIlIlIII[1]];
                strArr3[llIlIlIII[0]] = llIlIIlll[llIlIlIII[49]];
                if (lIllIIlIlIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    ?? r0 = llIlIlIII[1];
                    "".length();
                    return (70 ^ 67) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIlIlIII[0];
    }

    private static boolean lIllIIlIllII(int i) {
        return i < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (lIllIIlIllIl(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x054a, code lost:
        if (lIllIIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v369, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dO() {
        if (lIllIIlIlIII(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIlIIlll[llIlIlIII[0]];
            C0001b.a(bx);
            if (lIllIIlIlIIl(bx.size(), llIlIlIII[1])) {
                System.out.println(llIlIIlll[llIlIlIII[1]]);
                bv = llIlIlIII[0];
            }
        }
        if (lIllIIlIlIlI(bv ? 1 : 0) && lIllIIlIlIIl(C0004e.j(llIlIlIII[2]), llIlIlIII[3])) {
            N.cv();
        }
        if (lIllIIlIlIlI(bv ? 1 : 0) && lIllIIlIlIll(C0004e.j(llIlIlIII[2]), llIlIlIII[3])) {
            if (lIllIIlIlIII(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllIIlIlIIl(Movement.getRunEnergy(), llIlIlIII[4])) {
                Inventory.getFirst(C0005f.bc).interact(llIlIIlll[llIlIlIII[5]]);
                Time.sleepTicks(llIlIlIII[1]);
                "".length();
            }
            if (lIllIIlIllII(lIllIIlIIlll(C0004e.w(), 70.0d))) {
                int[] iArr = new int[llIlIlIII[1]];
                iArr[llIlIlIII[0]] = llIlIlIII[6];
                if (lIllIIlIlIII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIlIlIII[1]];
                    iArr2[llIlIlIII[0]] = llIlIlIII[6];
                    Inventory.getFirst(iArr2).interact(llIlIIlll[llIlIlIII[7]]);
                }
            }
            if (lIllIIlIlIlI(Movement.isRunEnabled() ? 1 : 0) && lIllIIlIllIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIllIIlIlIII(an() ? 1 : 0)) {
                int[] iArr3 = new int[llIlIlIII[1]];
                iArr3[llIlIlIII[0]] = llIlIlIII[8];
            }
            if (lIllIIlIlIIl(C0004e.j(llIlIlIII[9]), llIlIlIII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIlIlllI(nearest) && lIllIIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[10]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIlIlIII[5]);
                    "".length();
                }
                if (lIllIIlIlllI(nearest) && lIllIIlIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[11]];
                    if (lIllIIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlIII[12]);
                        "".length();
                    }
                    if (lIllIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIlIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlIII[10]);
                            "".length();
                        }
                        if (lIllIIlIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlIII[5]);
                            "".length();
                        }
                        int[] iArr4 = new int[llIlIlIII[11]];
                        iArr4[llIlIlIII[0]] = llIlIlIII[13];
                        iArr4[llIlIlIII[1]] = llIlIlIII[14];
                        iArr4[llIlIlIII[5]] = llIlIlIII[15];
                        iArr4[llIlIlIII[7]] = llIlIlIII[16];
                        iArr4[llIlIlIII[10]] = llIlIlIII[17];
                        if (lIllIIlIlIlI(C0004e.d(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIIlll[llIlIlIII[18]]);
                            bv = llIlIlIII[1];
                            return;
                        }
                        Bank.withdraw(llIlIlIII[13], llIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        Bank.withdraw(llIlIlIII[14], llIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        Bank.withdraw(llIlIlIII[15], llIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        Bank.withdraw(llIlIlIII[16], llIlIlIII[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        Bank.withdraw(llIlIlIII[19], llIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        Bank.withdraw(llIlIlIII[17], llIlIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                        C0000a.b(C0005f.bc, llIlIlIII[1]);
                        C0000a.a(llIlIlIII[6], llIlIlIII[3]);
                        C0000a.b(C0005f.bm, llIlIlIII[1]);
                    }
                }
            }
            if (lIllIIlIlIII(an() ? 1 : 0) && lIllIIlIlIIl(C0004e.j(llIlIlIII[9]), llIlIlIII[1])) {
                if (lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lM), llIlIlIII[5])) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[20]];
                    if (lIllIIlIlIlI(Equipment.contains(C0005f.aY) ? 1 : 0) && lIllIIlIlIII(Inventory.contains(C0005f.aY) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aY).interact(llIlIIlll[llIlIlIII[21]]);
                        Time.sleepTicks(llIlIlIII[1]);
                        "".length();
                    }
                    if (lIllIIlIlIIl(cI, llIlIlIII[1])) {
                        C0004e.x();
                        cI += llIlIlIII[1];
                    }
                    Movement.walkTo(lM);
                    "".length();
                    Time.sleepTicks(llIlIlIII[1]);
                    "".length();
                }
                if (lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lM), llIlIlIII[7])) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[22]];
                    C0006g.a(llIlIIlll[llIlIlIII[3]], lQ);
                }
            }
            if (lIllIIlIlIll(C0004e.j(llIlIlIII[9]), llIlIlIII[1])) {
                dk = llIlIlIII[0];
                if (lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[21])) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[23]];
                    Movement.walkTo(lN);
                    "".length();
                    Time.sleepTicks(llIlIlIII[1]);
                    "".length();
                }
                if (lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[21])) {
                    AccBuilderGWD.c = llIlIIlll[llIlIlIII[24]];
                    C0006g.a(llIlIIlll[llIlIlIII[25]], lQ);
                }
            }
            if (lIllIIlIlIll(C0004e.j(llIlIlIII[9]), llIlIlIII[5])) {
                String[] strArr = new String[llIlIlIII[1]];
                strArr[llIlIlIII[0]] = llIlIIlll[llIlIlIII[26]];
                if (lIllIIlIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIlIII[1]];
                    strArr2[llIlIlIII[0]] = llIlIIlll[llIlIlIII[27]];
                }
                AccBuilderGWD.c = llIlIIlll[llIlIlIII[28]];
                C0006g.a(llIlIIlll[llIlIlIII[29]], lQ);
                C0006g.a(lQ);
            }
            if (lIllIIlIlIll(C0004e.j(llIlIlIII[9]), llIlIlIII[5])) {
                String[] strArr3 = new String[llIlIlIII[1]];
                strArr3[llIlIlIII[0]] = llIlIIlll[llIlIlIII[30]];
                if (lIllIIlIlIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIlIlIII[1]];
                    strArr4[llIlIlIII[0]] = llIlIIlll[llIlIlIII[31]];
                    if (lIllIIlIlIII(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lO), llIlIlIII[5]) && lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[32]];
                            if (lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lN), llIlIlIII[3]) && lIllIIlIlIII(Equipment.contains(C0005f.aY) ? 1 : 0) && lIllIIllIIIl(Players.getLocal().getAnimation(), llIlIlIII[33])) {
                                Equipment.getFirst(C0005f.aY).interact(llIlIIlll[llIlIlIII[34]]);
                                Time.sleepTicks(llIlIlIII[7]);
                                "".length();
                            }
                            Movement.walkTo(lO);
                            "".length();
                            Time.sleepTicks(llIlIlIII[1]);
                            "".length();
                        }
                        if (lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lO), llIlIlIII[10])) {
                            AccBuilderGWD.c = llIlIIlll[llIlIlIII[35]];
                            String[] strArr5 = new String[llIlIlIII[1]];
                            strArr5[llIlIlIII[0]] = llIlIIlll[llIlIlIII[36]];
                            TileObjects.getNearest(strArr5).interact(llIlIIlll[llIlIlIII[37]]);
                            Time.sleepTicks(llIlIlIII[7]);
                            "".length();
                        }
                        if (lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                            String[] strArr6 = new String[llIlIlIII[1]];
                            strArr6[llIlIlIII[0]] = llIlIIlll[llIlIlIII[38]];
                            if (lIllIIllIIlI(NPCs.getNearest(strArr6))) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[39]];
                                if (lIllIIlIlIIl(dk, llIlIlIII[1])) {
                                    as.pK += llIlIlIII[1];
                                    as.u(AccBuilderGWD.m);
                                    dk += llIlIlIII[1];
                                    as.pK = llIlIlIII[0];
                                    dl = llIlIlIII[0];
                                }
                                String[] strArr7 = new String[llIlIlIII[1]];
                                strArr7[llIlIlIII[0]] = llIlIIlll[llIlIlIII[40]];
                                TileObjects.getNearest(strArr7).interact(llIlIIlll[llIlIlIII[41]]);
                                Time.sleepTicks(llIlIlIII[10]);
                                "".length();
                            }
                            String[] strArr8 = new String[llIlIlIII[1]];
                            strArr8[llIlIlIII[0]] = llIlIIlll[llIlIlIII[42]];
                            NPC nearest2 = NPCs.getNearest(strArr8);
                            if (lIllIIlIlllI(nearest2)) {
                                AccBuilderGWD.c = llIlIIlll[llIlIlIII[43]];
                                int[] iArr5 = new int[llIlIlIII[1]];
                                iArr5[llIlIlIII[0]] = llIlIlIII[17];
                                if (lIllIIlIlIlI(Equipment.contains(iArr5) ? 1 : 0)) {
                                    int[] iArr6 = new int[llIlIlIII[1]];
                                    iArr6[llIlIlIII[0]] = llIlIlIII[17];
                                    if (lIllIIlIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                        int[] iArr7 = new int[llIlIlIII[1]];
                                        iArr7[llIlIlIII[0]] = llIlIlIII[17];
                                        Inventory.getFirst(iArr7).interact(llIlIIlll[llIlIlIII[44]]);
                                        Time.sleepTicks(llIlIlIII[1]);
                                        "".length();
                                    }
                                }
                                if (lIllIIllIIlI(Players.getLocal().getInteracting()) && lIllIIlIlIlI(nearest2.isDead() ? 1 : 0)) {
                                    nearest2.interact(llIlIIlll[llIlIlIII[45]]);
                                    Time.sleepTicks(llIlIlIII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIllIIlIlIll(C0004e.j(llIlIlIII[9]), llIlIlIII[7]) && lIllIIllIIII(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[3])) {
                int[] iArr8 = new int[llIlIlIII[1]];
                iArr8[llIlIlIII[0]] = llIlIlIII[16];
                if (lIllIIlIlIII(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIlIlIII[1]];
                    iArr9[llIlIlIII[0]] = llIlIlIII[16];
                    Inventory.getFirst(iArr9).interact(llIlIIlll[llIlIlIII[46]]);
                    Time.sleepTicks(llIlIlIII[5]);
                    "".length();
                }
            }
            C0006g.a(new String[llIlIlIII[0]]);
        }
    }

    private static boolean lIllIIlIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIlIlIlI(int i) {
        return i == 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIlIIlll[llIlIlIII[60]];
    }

    private static void lIllIIlIIlIl() {
        llIlIIlll = new String[llIlIlIII[73]];
        llIlIIlll[llIlIlIII[0]] = lIllIIlIIIlI("PDe33YKjvnZRby0btazSKA==", "ghIkg");
        llIlIIlll[llIlIlIII[1]] = lIllIIlIIIlI("80PvhZI5pf/z4pynkhONisxFftyeGFUjJjd30thUbBPoExyxKkN0Awdb8Ta3B1HT", "MeYWY");
        llIlIIlll[llIlIlIII[5]] = lIllIIlIIIll("FCY/Jww=", "PTVIg");
        llIlIIlll[llIlIlIII[7]] = lIllIIlIIIll("IhkM", "gxxsY");
        llIlIIlll[llIlIlIII[10]] = lIllIIlIIIll("FxgiayM2WTYqOTI=", "YyTKW");
        llIlIIlll[llIlIlIII[11]] = lIllIIlIIlII("KQj2gqsxfgQNsrT3OonEn+IWbr03PbE9", "jDQwP");
        llIlIIlll[llIlIlIII[18]] = lIllIIlIIIlI("AdDnJyTftoIli65BnPAiPjzCrZ3sXYGzX4zL6HIm1VO9AyV7rLR0UfKUDGrlKEQFBKdUwZ6kml0=", "tvpAO");
        llIlIIlll[llIlIlIII[20]] = lIllIIlIIIll("NDI8ZREVczkxBAgn", "zSJEe");
        llIlIIlll[llIlIlIII[21]] = lIllIIlIIlII("FAnP4B91zsk=", "sTpYl");
        llIlIIlll[llIlIlIII[22]] = lIllIIlIIIll("JygIJyYdLkQiPxA=", "sIdLO");
        llIlIIlll[llIlIlIII[3]] = lIllIIlIIIll("LgYoJREN", "ciZBp");
        llIlIIlll[llIlIlIII[23]] = lIllIIlIIIll("NxYAdS0WVwYgOw==", "ywvUY");
        llIlIIlll[llIlIlIII[24]] = lIllIIlIIlII("OMNmWV2QzY9YRQfP5agJcg==", "JGrGy");
        llIlIIlll[llIlIlIII[25]] = lIllIIlIIIll("DDtuIQs6JSEe", "HINij");
        llIlIIlll[llIlIlIII[26]] = lIllIIlIIIll("ExYTJQ==", "QsvWT");
        llIlIIlll[llIlIlIII[27]] = lIllIIlIIlII("CdJCrerOXBw=", "oDvOP");
        llIlIIlll[llIlIlIII[28]] = lIllIIlIIlII("aaTEILAWuMuKIeQSTI0Bcg==", "fcsWN");
        llIlIIlll[llIlIlIII[29]] = lIllIIlIIlII("ro91gCw3RHbtMKnpy0dFsg==", "ynDEr");
        llIlIIlll[llIlIlIII[30]] = lIllIIlIIIlI("Esy1JbIsr4o=", "cOOAj");
        llIlIIlll[llIlIlIII[31]] = lIllIIlIIIll("HhEQADE=", "MeqkT");
        llIlIIlll[llIlIlIII[32]] = lIllIIlIIIlI("4bpJtNAjOPIjHKuda0LW6w==", "gpaHK");
        llIlIIlll[llIlIlIII[34]] = lIllIIlIIlII("UgLzUjXqNaJLozTkfnCigA==", "jilwO");
        llIlIIlll[llIlIlIII[35]] = lIllIIlIIIll("JRUDJQgcE08qDgUaTz0VEx0dPQ==", "rtoNa");
        llIlIIlll[llIlIlIII[36]] = lIllIIlIIIlI("1IVy2u0qTEE=", "CxihX");
        llIlIIlll[llIlIlIII[37]] = lIllIIlIIIll("Hzs0KEYMNS8t", "HZXCk");
        llIlIIlll[llIlIlIII[38]] = lIllIIlIIIlI("1SJ0MVlcsKf6XuTx2xCytQ==", "OHcRx");
        llIlIIlll[llIlIlIII[39]] = lIllIIlIIIlI("H5ndYIUTyO8Nst6ymK3o5Q==", "JkXbl");
        llIlIIlll[llIlIlIII[40]] = lIllIIlIIIll("JAcNJCIJ", "ghkBK");
        llIlIIlll[llIlIlIII[41]] = lIllIIlIIIll("AjUKPA==", "MEoRC");
        llIlIIlll[llIlIlIII[42]] = lIllIIlIIlII("DZ8W2IHSapWewFt2Obx3xQ==", "jqwkE");
        llIlIIlll[llIlIlIII[43]] = lIllIIlIIlII("T37git+rktLPMAd8a++KSQ==", "rcvvs");
        llIlIIlll[llIlIlIII[44]] = lIllIIlIIIll("BToCKQc=", "RSgEc");
        llIlIIlll[llIlIlIII[45]] = lIllIIlIIIll("IzkHLAkJ", "bMsMj");
        llIlIIlll[llIlIlIII[46]] = lIllIIlIIIll("FRAEChk=", "Wbakr");
        llIlIIlll[llIlIlIII[47]] = lIllIIlIIlII("2DOvrwxbUQ0=", "tYCSz");
        llIlIIlll[llIlIlIII[48]] = lIllIIlIIIll("Iys3Ai0H", "dJEnD");
        llIlIIlll[llIlIlIII[49]] = lIllIIlIIIll("GBUVBwQi", "Ptxja");
        llIlIIlll[llIlIlIII[60]] = lIllIIlIIIlI("OG0F/nDUE+EChqlJHgLZBeh8EF6PnLfg", "QLeNJ");
        llIlIIlll[llIlIlIII[61]] = lIllIIlIIlII("X+G9U08BJt97+HryxNM4An2CWUWxPZmu", "uuQnv");
        llIlIIlll[llIlIlIII[70]] = lIllIIlIIIlI("5NRvo/5BicNqe0n/TdKnP8AP5uL4b4n9/Cmr3bfbNSg=", "LauSg");
        llIlIIlll[llIlIlIII[53]] = lIllIIlIIlII("psW7AVe0yqc8AZivXuUZF1Z9xO90wCJmCBi4DZGQj9DN76KL2juBgw==", "PqdxX");
        llIlIIlll[llIlIlIII[71]] = lIllIIlIIlII("SJL9W1YQKoLxYXSZ9Lta2j1nEVi1WTOH", "PFamG");
        llIlIIlll[llIlIlIII[72]] = lIllIIlIIIll("NRMWdw==", "lveYD");
    }

    private static boolean lIllIIlIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIllIIlI(Object obj) {
        return obj == null;
    }

    private static int lIllIIlIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIllIIlIllIl(int i) {
        return i > 0;
    }

    private static String lIllIIlIIlII(String lIIllIIIIlIIIl, String lIIllIIIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIIIlIIll = Cipher.getInstance("Blowfish");
            lIIllIIIIlIIll.init(llIlIlIII[5], secretKeySpec);
            return new String(lIIllIIIIlIIll.doFinal(Base64.getDecoder().decode(lIIllIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIIIllIl) {
            lIIllIIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIllIIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIlIlIII[0];
    }

    private static boolean lIllIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIlIIllI() {
        llIlIlIII = new int[74];
        llIlIlIII[0] = ((6 ^ 8) ^ (174 ^ 182)) & (((80 ^ 9) ^ (73 ^ 6)) ^ (-" ".length()));
        llIlIlIII[1] = " ".length();
        llIlIlIII[2] = 63 ^ 126;
        llIlIlIII[3] = 38 ^ 44;
        llIlIlIII[4] = (20 ^ 121) ^ (140 ^ 167);
        llIlIlIII[5] = "  ".length();
        llIlIlIII[6] = (-13825) & 14203;
        llIlIlIII[7] = "   ".length();
        llIlIlIII[8] = (-((-5905) & 30493)) & (-3089) & 28671;
        llIlIlIII[9] = (((64 ^ 122) + (((41 + 78) - (-35)) + 12)) - (211 ^ 173)) + (207 ^ 159);
        llIlIlIII[10] = (((51 + 45) - (-2)) + 46) ^ (((63 + 145) - 144) + 84);
        llIlIlIII[11] = (((32 + 99) - 93) + 147) ^ (((31 + 172) - 67) + 52);
        llIlIlIII[12] = (-67) & 5066;
        llIlIlIII[13] = (-18563) & 20479;
        llIlIlIII[14] = (-8369) & 9918;
        llIlIlIII[15] = (-((-18579) & 32471)) & (-16513) & 32751;
        llIlIlIII[16] = (-1) & 8007;
        llIlIlIII[17] = (-27209) & 28541;
        llIlIlIII[18] = 28 ^ 26;
        llIlIlIII[19] = (-20737) & 32714;
        llIlIlIII[20] = 114 ^ 117;
        llIlIlIII[21] = (148 ^ 193) ^ (112 ^ 45);
        llIlIlIII[22] = (207 ^ 148) ^ (124 ^ 46);
        llIlIlIII[23] = 77 ^ 70;
        llIlIlIII[24] = 142 ^ 130;
        llIlIlIII[25] = (((48 + 175) - 21) + 1) ^ (((106 + 36) - (-54)) + 2);
        llIlIlIII[26] = (4 ^ 72) ^ (92 ^ 30);
        llIlIlIII[27] = 174 ^ 161;
        llIlIlIII[28] = (208 ^ 192) ^ ((84 ^ 67) & ((35 ^ 52) ^ (-1)));
        llIlIlIII[29] = 55 ^ 38;
        llIlIlIII[30] = (3 ^ 26) ^ (203 ^ 192);
        llIlIlIII[31] = (249 ^ 143) ^ (249 ^ 156);
        llIlIlIII[32] = (((87 + 70) - 68) + 58) ^ (((45 + 100) - 31) + 21);
        llIlIlIII[33] = (-((-513) & 32565)) & (-2) & 32767;
        llIlIlIII[34] = "  ".length() ^ (173 ^ 186);
        llIlIlIII[35] = (39 ^ 82) ^ (165 ^ 198);
        llIlIlIII[36] = (((25 + 98) - 71) + 79) ^ (((76 + 60) - 50) + 62);
        llIlIlIII[37] = 76 ^ 84;
        llIlIlIII[38] = 61 ^ 36;
        llIlIlIII[39] = (((21 + 118) - 112) + 134) ^ (((93 + 149) - 60) + 5);
        llIlIlIII[40] = (76 ^ 55) ^ (121 ^ 25);
        llIlIlIII[41] = 145 ^ 141;
        llIlIlIII[42] = (19 ^ 0) ^ (88 ^ 86);
        llIlIlIII[43] = 0 ^ 30;
        llIlIlIII[44] = 114 ^ 109;
        llIlIlIII[45] = (211 ^ 193) ^ (67 ^ 113);
        llIlIlIII[46] = 165 ^ 132;
        llIlIlIII[47] = (58 ^ 90) ^ (194 ^ 128);
        llIlIlIII[48] = 0 ^ 35;
        llIlIlIII[49] = (115 ^ 28) ^ (203 ^ 128);
        llIlIlIII[50] = (-18435) & 24334;
        llIlIlIII[51] = (-531) & 26430;
        llIlIlIII[52] = (-16707) & 32606;
        llIlIlIII[53] = (26 ^ 69) ^ (60 ^ 75);
        llIlIlIII[54] = (-((-289) & 29551)) & (-2049) & 31710;
        llIlIlIII[55] = (-(16 ^ 51)) & (-20737) & 32750;
        llIlIlIII[56] = (-4694) & 29693;
        llIlIlIII[57] = (-((-16493) & 26751)) & (-16513) & 28670;
        llIlIlIII[58] = (-((-25421) & 26607)) & (-2061) & 15871;
        llIlIlIII[59] = 111 ^ 11;
        llIlIlIII[60] = (240 ^ 195) ^ (138 ^ 156);
        llIlIlIII[61] = (73 ^ 80) ^ (181 ^ 138);
        llIlIlIII[62] = (-((-5513) & 14318)) & (-4353) & 16255;
        llIlIlIII[63] = (-12828) & 16095;
        llIlIlIII[64] = (-((-213) & 25077)) & (-521) & 28607;
        llIlIlIII[65] = (-4253) & 7647;
        llIlIlIII[66] = (-16705) & 19820;
        llIlIlIII[67] = (-4193) & 7548;
        llIlIlIII[68] = (-((-17057) & 29667)) & (-185) & 15871;
        llIlIlIII[69] = (-((-35) & 2551)) & (-16385) & 28671;
        llIlIlIII[70] = (((70 + 115) - 66) + 13) ^ (((101 + 141) - 211) + 132);
        llIlIlIII[71] = 144 ^ 185;
        llIlIlIII[72] = 132 ^ 174;
        llIlIlIII[73] = 71 ^ 108;
    }

    private static void Q() {
        int[] iArr = new int[llIlIlIII[1]];
        iArr[llIlIlIII[0]] = llIlIlIII[13];
        if (lIllIIlIlIlI(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[13], llIlIlIII[1], llIlIlIII[50]));
            "".length();
        }
        int[] iArr2 = new int[llIlIlIII[1]];
        iArr2[llIlIlIII[0]] = llIlIlIII[15];
        if (lIllIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[15], llIlIlIII[1], llIlIlIII[50]));
            "".length();
        }
        int[] iArr3 = new int[llIlIlIII[1]];
        iArr3[llIlIlIII[0]] = llIlIlIII[17];
        if (lIllIIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[17], llIlIlIII[1], llIlIlIII[51]));
            "".length();
        }
        int[] iArr4 = new int[llIlIlIII[1]];
        iArr4[llIlIlIII[0]] = llIlIlIII[14];
        if (lIllIIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[14], llIlIlIII[1], llIlIlIII[50]));
            "".length();
        }
        int[] iArr5 = new int[llIlIlIII[1]];
        iArr5[llIlIlIII[0]] = llIlIlIII[19];
        if (lIllIIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[19], llIlIlIII[1], llIlIlIII[52]));
            "".length();
        }
        int[] iArr6 = new int[llIlIlIII[1]];
        iArr6[llIlIlIII[0]] = llIlIlIII[6];
        if (lIllIIlIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[6], llIlIlIII[3], llIlIlIII[50]));
            "".length();
        }
        int[] iArr7 = new int[llIlIlIII[1]];
        iArr7[llIlIlIII[0]] = llIlIlIII[6];
        if (lIllIIlIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[llIlIlIII[1]];
            iArr8[llIlIlIII[0]] = llIlIlIII[6];
            if (lIllIIlIlIIl(Bank.getFirst(iArr8).getQuantity(), llIlIlIII[32])) {
                bx.add(new C0003d(llIlIlIII[6], llIlIlIII[53], llIlIlIII[54]));
                "".length();
            }
        }
        if (lIllIIlIlIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIlll[llIlIlIII[61]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[55], llIlIlIII[11], llIlIlIII[56]));
            "".length();
        }
        int[] iArr9 = new int[llIlIlIII[1]];
        iArr9[llIlIlIII[0]] = llIlIlIII[16];
        if (lIllIIlIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[16], llIlIlIII[53], llIlIlIII[57]));
            "".length();
        }
        int[] iArr10 = new int[llIlIlIII[1]];
        iArr10[llIlIlIII[0]] = llIlIlIII[58];
        if (lIllIIlIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bx.add(new C0003d(llIlIlIII[58], llIlIlIII[11], C0009j.ch));
            "".length();
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dO();
            "".length();
            if (" ".length() <= 0) {
                return (237 ^ 187) & ((201 ^ 159) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlIlIII[59];
    }

    private static String lIllIIlIIIlI(String lIIllIIIIllllI, String lIIllIIIIlllIl) {
        try {
            SecretKeySpec lIIllIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIlIlIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlIII[5], lIIllIIIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIIlllll) {
            lIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIlIIllI();
        lIllIIlIIlIl();
        lM = new WorldPoint(llIlIlIII[62], llIlIlIII[63], llIlIlIII[0]);
        lN = new WorldPoint(llIlIlIII[64], llIlIlIII[65], llIlIlIII[0]);
        lO = new WorldPoint(llIlIlIII[66], llIlIlIII[67], llIlIlIII[0]);
        lP = new WorldPoint(llIlIlIII[68], llIlIlIII[69], llIlIlIII[0]);
        String[] strArr = new String[llIlIlIII[10]];
        strArr[llIlIlIII[0]] = llIlIIlll[llIlIlIII[70]];
        strArr[llIlIlIII[1]] = llIlIIlll[llIlIlIII[53]];
        strArr[llIlIlIII[5]] = llIlIIlll[llIlIlIII[71]];
        strArr[llIlIlIII[7]] = llIlIIlll[llIlIlIII[72]];
        lQ = strArr;
        bx = new ArrayList();
        cI = llIlIlIII[0];
    }

    private static boolean lIllIIllIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllIIllIIll(C0004e.j(llIlIlIII[9]), llIlIlIII[7]) && lIllIIlIllll(Players.getLocal().getWorldLocation().distanceTo(lP), llIlIlIII[43])) {
            ?? r0 = llIlIlIII[1];
            "".length();
            return (-" ".length()) > (((5 ^ 108) ^ (53 ^ 20)) & (((190 ^ 162) ^ (237 ^ 185)) ^ (-" ".length()))) ? ((20 ^ 90) ^ (190 ^ 169)) & (((50 ^ 94) ^ (146 ^ 167)) ^ (-" ".length())) : r0;
        }
        return llIlIlIII[0];
    }

    private static boolean lIllIIlIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIlIlIII(int i) {
        return i != 0;
    }
}
