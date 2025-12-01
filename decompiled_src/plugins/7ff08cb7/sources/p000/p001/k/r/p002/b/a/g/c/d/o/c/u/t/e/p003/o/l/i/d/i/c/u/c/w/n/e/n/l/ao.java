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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ao  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ao.class */
public class ao implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIIlIIl;
    public static /* synthetic */ WorldArea mv;
    private static /* synthetic */ WorldPoint mw;
    private static /* synthetic */ WorldPoint mx;
    private static /* synthetic */ String[] lllIIIlll;
    private static /* synthetic */ int[] my;
    public static /* synthetic */ List<C0003d> bx;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eA() {
        if (llIIIIIlllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[42]];
            C0001b.a(bx);
            if (llIIIIlIIIII(bx.size(), lllIIlIIl[1])) {
                System.out.println(lllIIIlll[lllIIlIIl[43]]);
                bv = lllIIlIIl[0];
            }
        }
        if (llIIIIlIIIIl(bv ? 1 : 0)) {
            if (llIIIIlIIIIl(eB() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIlIIIlI(nearest) && llIIIIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIlll[lllIIlIIl[44]];
                    C0000a.a(nearest);
                }
                if (llIIIIlIIIlI(nearest) && llIIIIIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIlIIl[4]);
                        "".length();
                    }
                    if (llIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[46]];
                        if (llIIIIlIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIlIIl[5]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIlIIl[1]];
                        iArr[lllIIlIIl[0]] = lllIIlIIl[6];
                        if (llIIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lllIIlIIl[1]];
                            strArr[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[47]];
                        }
                        if (!llIIIIlIIIIl(Bank.contains(C0005f.aV) ? 1 : 0) || !llIIIIlIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) || !llIIIIlIIIIl(Equipment.contains(C0005f.aV) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIIlIIl[1]];
                            iArr2[lllIIlIIl[0]] = lllIIlIIl[6];
                            if (llIIIIIlllll(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[49]], lllIIlIIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[lllIIlIIl[1]];
                                    strArr2[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[76]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr2))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return "   ".length() <= (((12 ^ 61) ^ ((84 ^ 64) & ((189 ^ 169) ^ (-1)))) & (((((12 + 20) - 18) + 150) ^ (((121 + 14) - 23) + 37)) ^ (-" ".length()))) ? ((99 ^ 89) ^ (54 ^ 88)) & (((255 ^ 179) ^ (13 ^ 21)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            if (llIIIIIlllll(Bank.contains(C0005f.aV) ? 1 : 0)) {
                                C0000a.b(C0005f.aV, lllIIlIIl[1]);
                            }
                        }
                        Q();
                        System.out.println(lllIIIlll[lllIIlIIl[48]]);
                        bv = lllIIlIIl[1];
                        return;
                    }
                }
            }
            if (llIIIIIlllll(eB() ? 1 : 0)) {
                if (llIIIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIlIIl[1]];
                    iArr3[lllIIlIIl[0]] = lllIIlIIl[50];
                    if (llIIIIlIIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lllIIlIIl[51], lllIIlIIl[52], lllIIlIIl[0]);
                        if (llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlIIl[9])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lllIIlIIl[1]);
                            "".length();
                        }
                        if (llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIIlIIl[13])) {
                            if (llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (llIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                C0000a.a(lllIIlIIl[6], lllIIlIIl[1]);
                            }
                        }
                    }
                }
                if (llIIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    if (llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mw), lllIIlIIl[7])) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[54]];
                        if (llIIIIIlllll(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aV).interact(lllIIIlll[lllIIlIIl[55]]);
                        }
                        Movement.walkTo(mw);
                        "".length();
                        Time.sleepTicks(lllIIlIIl[1]);
                        "".length();
                    }
                    if (llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[56]];
                        if (llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                            int[] iArr4 = new int[lllIIlIIl[1]];
                            iArr4[lllIIlIIl[0]] = lllIIlIIl[31];
                            if (llIIIIlIIIlI(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[lllIIlIIl[1]];
                                iArr5[lllIIlIIl[0]] = lllIIlIIl[31];
                                NPCs.getNearest(iArr5).interact(lllIIlIIl[0]);
                                Time.sleepTicks(lllIIlIIl[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIlIIl[1]];
                    iArr6[lllIIlIIl[0]] = lllIIlIIl[50];
                    if (llIIIIIlllll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIIlIIl[1]];
                        iArr7[lllIIlIIl[0]] = lllIIlIIl[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static boolean llIIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static String llIIIIIllIII(String llllIIIlIIlll, String llllIIIlIIllI) {
        try {
            SecretKeySpec llllIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlIIl[13]), "DES");
            Cipher llllIIIlIlIIl = Cipher.getInstance("DES");
            llllIIIlIlIIl.init(lllIIlIIl[2], llllIIIlIlIlI);
            return new String(llllIIIlIlIIl.doFinal(Base64.getDecoder().decode(llllIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIlIlIII) {
            llllIIIlIlIII.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIllllI();
        llIIIIIlllIl();
        mv = new WorldArea(lllIIlIIl[83], lllIIlIIl[84], lllIIlIIl[29], lllIIlIIl[39], lllIIlIIl[0]);
        bx = new ArrayList();
        mw = new WorldPoint(lllIIlIIl[85], lllIIlIIl[86], lllIIlIIl[0]);
        mx = new WorldPoint(lllIIlIIl[87], lllIIlIIl[88], lllIIlIIl[0]);
        int[] iArr = new int[lllIIlIIl[17]];
        iArr[lllIIlIIl[0]] = lllIIlIIl[89];
        iArr[lllIIlIIl[1]] = lllIIlIIl[90];
        iArr[lllIIlIIl[2]] = lllIIlIIl[91];
        iArr[lllIIlIIl[3]] = lllIIlIIl[92];
        iArr[lllIIlIIl[5]] = lllIIlIIl[93];
        iArr[lllIIlIIl[7]] = lllIIlIIl[94];
        iArr[lllIIlIIl[9]] = lllIIlIIl[95];
        iArr[lllIIlIIl[11]] = lllIIlIIl[96];
        iArr[lllIIlIIl[13]] = lllIIlIIl[97];
        iArr[lllIIlIIl[15]] = lllIIlIIl[98];
        iArr[lllIIlIIl[16]] = lllIIlIIl[99];
        my = iArr;
    }

    private static String llIIIIIlIlll(String llllIIlIIlIIl, String llllIIlIIlIII) {
        String llllIIlIIlIIl2 = new String(Base64.getDecoder().decode(llllIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIIlIIIllI = llllIIlIIlIII.toCharArray();
        int llllIIlIIIlIl = lllIIlIIl[0];
        char[] charArray = llllIIlIIlIIl2.toCharArray();
        int length = charArray.length;
        int llllIIIllllIl = lllIIlIIl[0];
        while (llIIIIlIIIII(llllIIIllllIl, length)) {
            char llllIIlIIlIlI = charArray[llllIIIllllIl];
            sb.append((char) (llllIIlIIlIlI ^ llllIIlIIIllI[llllIIlIIIlIl % llllIIlIIIllI.length]));
            "".length();
            llllIIlIIIlIl++;
            llllIIIllllIl++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIlIIlll(int i, int i2) {
        return i <= i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        ey();
        return lllIIlIIl[72];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean eB() {
        String[] strArr = new String[lllIIlIIl[1]];
        strArr[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[57]];
        if (!llIIIIIlllll(Inventory.contains(strArr) ? 1 : 0) || (llIIIIlIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && !llIIIIIlllll(Equipment.contains(C0005f.aV) ? 1 : 0))) {
            return lllIIlIIl[0];
        }
        ?? r0 = lllIIlIIl[1];
        "".length();
        return (-" ".length()) != (-" ".length()) ? " ".length() & (" ".length() ^ (-1)) : r0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIIlll[lllIIlIIl[73]];
    }

    public static void ez() {
        if (llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[38]];
            System.out.println(lllIIIlll[lllIIlIIl[39]]);
            Inventory.getAll(my).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (llIIIIlIIIIl(Inventory.isFull() ? 1 : 0) && llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
            String[] strArr = new String[lllIIlIIl[1]];
            strArr[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[40]];
            NPCs.getNearest(strArr).interact(lllIIIlll[lllIIlIIl[41]]);
            Time.sleepTicks(lllIIlIIl[2]);
            "".length();
        }
    }

    private static boolean llIIIIlIIlIl(int i, int i2) {
        return i > i2;
    }

    private static void llIIIIIlllIl() {
        lllIIIlll = new String[lllIIlIIl[100]];
        lllIIIlll[lllIIlIIl[0]] = llIIIIIlIlll("DgUaEzorUAoOMSED", "LpczT");
        lllIIIlll[lllIIlIIl[1]] = llIIIIIllIII("RekIypSNHOSKDsHVY62sXuwI8bwy/0uzAqxln9ROsA3LsKgOLXrfgnMjcDklKYX6MjVAfXRY3jU=", "xBKQG");
        lllIIIlll[lllIIlIIl[2]] = llIIIIIllIIl("ijC5gFiU/3gIqeZ/mkg77Tr0lvU8cCSM", "svice");
        lllIIIlll[lllIIlIIl[3]] = llIIIIIllIII("E8DJFbiP1gBOTOnoEGKbLQ==", "bPGDL");
        lllIIIlll[lllIIlIIl[5]] = llIIIIIllIII("CL6uSX9qyK+9PsIekID8UIU5NPBRHkyv", "vHbJq");
        lllIIIlll[lllIIlIIl[7]] = llIIIIIlIlll("EBksBRhjEiQaHCoaKkkaJgA=", "CtMit");
        lllIIIlll[lllIIlIIl[9]] = llIIIIIllIIl("X5BvV0vV7F33oad86wRv8g==", "brUua");
        lllIIIlll[lllIIlIIl[11]] = llIIIIIllIII("Jhq661+7MHbeO4Tca14Y7O2OvvRy8fNT", "HPFhK");
        lllIIIlll[lllIIlIIl[13]] = llIIIIIllIIl("tpFkIjoz0G0=", "Mcknt");
        lllIIIlll[lllIIlIIl[15]] = llIIIIIllIII("3Lqp8eXA0+NVGZSSGPwOxQ==", "IiSNG");
        lllIIIlll[lllIIlIIl[16]] = llIIIIIllIII("Fji0bR5KPqX1ZF7RRdFZskCBBbR06hkntt/KE1URoE+dTIbrohTVZtIrLRHo5coD", "MwLon");
        lllIIIlll[lllIIlIIl[17]] = llIIIIIllIII("Nb3CvWv7OKODP/NIBLCr0org+6bNseBa", "BrKeU");
        lllIIIlll[lllIIlIIl[18]] = llIIIIIlIlll("MgIAPwoaDFMlDBA=", "tksWc");
        lllIIIlll[lllIIlIIl[19]] = llIIIIIllIII("v92SItJ6XvSe5S2C/9luzA==", "tgVPW");
        lllIIIlll[lllIIlIIl[20]] = llIIIIIllIII("rUmUzUpWHPw=", "SfYab");
        lllIIIlll[lllIIlIIl[22]] = llIIIIIllIIl("JkEd0ob7GQ2K1yCo+a5/jQ==", "SDnGY");
        lllIIIlll[lllIIlIIl[25]] = llIIIIIllIIl("ksSz8T8ZpCaGwYzZEQ9mXw==", "OCxhh");
        lllIIIlll[lllIIlIIl[26]] = llIIIIIllIII("kEM7mnQMQzBTk5DyqJJ1Rg==", "zzRDo");
        lllIIIlll[lllIIlIIl[28]] = llIIIIIlIlll("LBICZBINUwcpBw4fVCIPERtUNxYNBw==", "bstDf");
        lllIIIlll[lllIIlIIl[29]] = llIIIIIllIII("ONOj1eYMth8=", "QZbMz");
        lllIIIlll[lllIIlIIl[27]] = llIIIIIllIII("HUuIkXZHwTg=", "FFNiu");
        lllIIIlll[lllIIlIIl[32]] = llIIIIIllIII("890Ia9duu7xlwjBXlNCjTVVu6VI8CanO", "YEZGc");
        lllIIIlll[lllIIlIIl[33]] = llIIIIIllIII("LLCaJDILrAY=", "goEDq");
        lllIIIlll[lllIIlIIl[34]] = llIIIIIllIII("FR6T+tMFTEY=", "sGZLk");
        lllIIIlll[lllIIlIIl[35]] = llIIIIIlIlll("LC0ScAwNbAI8AUIqDSMQQj8UPww=", "bLdPx");
        lllIIIlll[lllIIlIIl[36]] = llIIIIIllIIl("O1nKoKMmzNI=", "bKnHv");
        lllIIIlll[lllIIlIIl[37]] = llIIIIIllIIl("+mTRrIqZrf4=", "SbzoH");
        lllIIIlll[lllIIlIIl[38]] = llIIIIIllIIl("oC7lTH5KRoyPsDYrbMy43Q==", "udOMh");
        lllIIIlll[lllIIlIIl[39]] = llIIIIIllIIl("GHo8FzhLKtqFNSMisCOvxQ==", "HnSrZ");
        lllIIIlll[lllIIlIIl[40]] = llIIIIIlIlll("KQUZJz0BC0o8JAAY", "oljOT");
        lllIIIlll[lllIIlIIl[41]] = llIIIIIllIIl("NMg8GmRNhNE=", "SiOPI");
        lllIIIlll[lllIIlIIl[42]] = llIIIIIllIIl("1/1cDlQ6GxU8oG7GwpdvPQ==", "EISvP");
        lllIIIlll[lllIIlIIl[43]] = llIIIIIllIIl("n1NsSqyyrilif69s97FYvg4pZMzyIUCKDSzIWHUAmLk1sF0BMyW4xPFBYfnsPwgCimZ2WOcSkv0=", "UvJum");
        lllIIIlll[lllIIlIIl[44]] = llIIIIIllIIl("TVMOpDrIBzmngp4w+mlMUAAjloE14YAj", "xmgRb");
        lllIIIlll[lllIIlIIl[45]] = llIIIIIllIIl("6LKPNgE+5248HPdUxa26Ug==", "aYJgu");
        lllIIIlll[lllIIlIIl[46]] = llIIIIIlIlll("LwUXECQOCh5UKgYKEh0mAA==", "gdytH");
        lllIIIlll[lllIIlIIl[47]] = llIIIIIlIlll("AQIEISJyCQw+JjsBAm0gNxs=", "RoeMN");
        lllIIIlll[lllIIlIIl[48]] = llIIIIIllIIl("eOHhw3E5/Xfbp2XpKYxPBjFZPaQHfe9GnrNwKnTvKv6Bt/bb2SEuV3epDr8hEc1Y", "GDPHa");
        lllIIIlll[lllIIlIIl[49]] = llIIIIIlIlll("NCIAKj9HKQg1Ow4hBmY9Ajs=", "gOaFS");
        lllIIIlll[lllIIlIIl[53]] = llIIIIIllIII("kBEflMLW/Kz9kyGe+G1EKQ==", "dRDkX");
        lllIIIlll[lllIIlIIl[54]] = llIIIIIllIIl("NPAFdzb0LfbOpFhMx8vMjWS3jkGoZ1b8", "bTLLK");
        lllIIIlll[lllIIlIIl[55]] = llIIIIIlIlll("GzIWIQ==", "LWwSp");
        lllIIIlll[lllIIlIIl[56]] = llIIIIIlIlll("NSsRPSIdJQ==", "sBbUK");
        lllIIIlll[lllIIlIIl[57]] = llIIIIIlIlll("Ih8QKx5RFBg0GhgcFmccFAY=", "qrqGr");
        lllIIIlll[lllIIlIIl[58]] = llIIIIIllIIl("DtvYNIvJElYyDwPUXGYhZKf6FS3z7NSK", "OqDvM");
        lllIIIlll[lllIIlIIl[59]] = llIIIIIlIlll("MiwkPxAaInclFhA=", "tEWWy");
        lllIIIlll[lllIIlIIl[60]] = llIIIIIlIlll("IDwJYRcPIxgoHwFwAi4V", "fPpAq");
        lllIIIlll[lllIIlIIl[61]] = llIIIIIlIlll("FQojEyM2HQ==", "SoBgK");
        lllIIIlll[lllIIlIIl[62]] = llIIIIIllIII("l5aoFv0lp4dGoM/MRnkOcg==", "yIebP");
        lllIIIlll[lllIIlIIl[73]] = llIIIIIlIlll("FiICBw4+LA==", "PKqog");
        lllIIIlll[lllIIlIIl[75]] = llIIIIIlIlll("FyIgFmsKLW4GLgQnOhlrTQ==", "eKNqK");
        lllIIIlll[lllIIlIIl[76]] = llIIIIIllIII("k0dL3NL4flSCKstRwyZxL3I13S5OFclF", "brAwS");
        lllIIIlll[lllIIlIIl[78]] = llIIIIIllIIl("hbqAbEWayglGKNfmA41WfQ==", "DaNpy");
        lllIIIlll[lllIIlIIl[79]] = llIIIIIllIIl("IGMtHwZurNU=", "zmOya");
        lllIIIlll[lllIIlIIl[80]] = llIIIIIlIlll("KSQIWD4GOxkRNghoAxc8", "oHqxX");
        lllIIIlll[lllIIlIIl[81]] = llIIIIIllIIl("TA9sDNQDOj1hT3Ipsfhtrg==", "WWcxX");
        lllIIIlll[lllIIlIIl[82]] = llIIIIIllIIl("wbZ3jFdF6Q7HsFrDEQkFiubGi4aAlLHY", "kEwXm");
    }

    private static void llIIIIIllllI() {
        lllIIlIIl = new int[101];
        lllIIlIIl[0] = (180 ^ 136) & ((43 ^ 23) ^ (-1));
        lllIIlIIl[1] = " ".length();
        lllIIlIIl[2] = "  ".length();
        lllIIlIIl[3] = "   ".length();
        lllIIlIIl[4] = (-((-30979) & 32086)) & (-37) & 6143;
        lllIIlIIl[5] = 189 ^ 185;
        lllIIlIIl[6] = (-((-7169) & 32401)) & (-1089) & 26623;
        lllIIlIIl[7] = 58 ^ 63;
        lllIIlIIl[8] = (-31437) & 31743;
        lllIIlIIl[9] = (((48 + 60) - 89) + 171) ^ (((86 + 146) - 110) + 62);
        lllIIlIIl[10] = (-20163) & 20471;
        lllIIlIIl[11] = 176 ^ 183;
        lllIIlIIl[12] = (-3781) & 4094;
        lllIIlIIl[13] = 35 ^ 43;
        lllIIlIIl[14] = (-((-25) & 31775)) & (-193) & 32255;
        lllIIlIIl[15] = (((11 + 80) - 4) + 76) ^ (((70 + 65) - (-27)) + 8);
        lllIIlIIl[16] = (((103 + 41) - 53) + 98) ^ (((156 + 100) - 169) + 96);
        lllIIlIIl[17] = 124 ^ 119;
        lllIIlIIl[18] = (121 ^ 62) ^ (43 ^ 96);
        lllIIlIIl[19] = (110 ^ 10) ^ (101 ^ 12);
        lllIIlIIl[20] = (180 ^ 134) ^ (50 ^ 14);
        lllIIlIIl[21] = (-338) & 100337;
        lllIIlIIl[22] = (((81 + 66) - 136) + 117) ^ (((16 + 78) - 48) + 97);
        lllIIlIIl[23] = (-24582) & 25581;
        lllIIlIIl[24] = (-34) & 8041;
        lllIIlIIl[25] = (((214 + 101) - 284) + 184) ^ (((155 + 69) - 119) + 94);
        lllIIlIIl[26] = 22 ^ 7;
        lllIIlIIl[27] = (160 ^ 183) ^ "   ".length();
        lllIIlIIl[28] = (142 ^ 192) ^ (122 ^ 38);
        lllIIlIIl[29] = (((199 + 102) - 136) + 43) ^ (((70 + 69) - 21) + 77);
        lllIIlIIl[30] = -" ".length();
        lllIIlIIl[31] = (-338) & 1881;
        lllIIlIIl[32] = (109 ^ 24) ^ (58 ^ 90);
        lllIIlIIl[33] = (6 ^ 35) ^ (54 ^ 5);
        lllIIlIIl[34] = 115 ^ 100;
        lllIIlIIl[35] = (74 ^ 117) ^ (154 ^ 189);
        lllIIlIIl[36] = (127 ^ 85) ^ (133 ^ 182);
        lllIIlIIl[37] = 174 ^ 180;
        lllIIlIIl[38] = ((13 ^ 7) & ((170 ^ 160) ^ (-1))) ^ (138 ^ 145);
        lllIIlIIl[39] = 72 ^ 84;
        lllIIlIIl[40] = 123 ^ 102;
        lllIIlIIl[41] = (((106 + 108) - 154) + 69) ^ (((103 + 25) - 92) + 123);
        lllIIlIIl[42] = (6 ^ 44) ^ (147 ^ 166);
        lllIIlIIl[43] = 148 ^ 180;
        lllIIlIIl[44] = (209 ^ 134) ^ (3 ^ 117);
        lllIIlIIl[45] = 69 ^ 103;
        lllIIlIIl[46] = 0 ^ 35;
        lllIIlIIl[47] = 168 ^ 140;
        lllIIlIIl[48] = (195 ^ 162) ^ (194 ^ 134);
        lllIIlIIl[49] = 27 ^ 61;
        lllIIlIIl[50] = (-(164 ^ 153)) & (-22657) & 23037;
        lllIIlIIl[51] = (-((-2151) & 31871)) & (-513) & 32767;
        lllIIlIIl[52] = (-((-6205) & 30783)) & (-513) & 28663;
        lllIIlIIl[53] = 109 ^ 74;
        lllIIlIIl[54] = 165 ^ 141;
        lllIIlIIl[55] = (((32 + 103) - 78) + 91) ^ (((48 + 183) - 42) + 0);
        lllIIlIIl[56] = 42 ^ 0;
        lllIIlIIl[57] = (153 ^ 182) ^ (112 ^ 116);
        lllIIlIIl[58] = (68 ^ 114) ^ (72 ^ 82);
        lllIIlIIl[59] = (34 ^ 55) ^ (108 ^ 84);
        lllIIlIIl[60] = 142 ^ 160;
        lllIIlIIl[61] = 180 ^ 155;
        lllIIlIIl[62] = (39 ^ 102) ^ (232 ^ 153);
        lllIIlIIl[63] = (-7239) & 16238;
        lllIIlIIl[64] = (-26244) & 26543;
        lllIIlIIl[65] = (-31746) & 32245;
        lllIIlIIl[66] = (-((-18457) & 19517)) & (-18434) & 32493;
        lllIIlIIl[67] = (-((-21577) & 29817)) & (-16579) & 28671;
        lllIIlIIl[68] = (-((-26407) & 30519)) & (-35) & 16126;
        lllIIlIIl[69] = (-((-18465) & 23092)) & (-1025) & 30651;
        lllIIlIIl[70] = (-((-7625) & 32249)) & (-129) & 32759;
        lllIIlIIl[71] = (-((-209) & 29946)) & (-81) & 30717;
        lllIIlIIl[72] = 253 ^ 153;
        lllIIlIIl[73] = (131 ^ 151) ^ (140 ^ 169);
        lllIIlIIl[74] = 52 ^ 87;
        lllIIlIIl[75] = 32 ^ 18;
        lllIIlIIl[76] = (8 ^ 108) ^ (194 ^ 149);
        lllIIlIIl[77] = (-((-1753) & 7899)) & (-24602) & 32255;
        lllIIlIIl[78] = 78 ^ 122;
        lllIIlIIl[79] = (((35 + 27) - (-112)) + 9) ^ (((71 + 129) - 176) + 106);
        lllIIlIIl[80] = 87 ^ 97;
        lllIIlIIl[81] = (((69 + 15) - (-82)) + 11) ^ (((19 + 69) - (-11)) + 35);
        lllIIlIIl[82] = 157 ^ 165;
        lllIIlIIl[83] = (-21009) & 23514;
        lllIIlIIl[84] = (-((-15381) & 15901)) & (-16386) & 20461;
        lllIIlIIl[85] = (-16929) & 19445;
        lllIIlIIl[86] = (-((-19647) & 32447)) & (-1) & 16372;
        lllIIlIIl[87] = (-((-21228) & 29439)) & (-1033) & 11775;
        lllIIlIIl[88] = (-((-2337) & 14756)) & (-545) & 16375;
        lllIIlIIl[89] = (-2073) & 3583;
        lllIIlIIl[90] = (-29195) & 30715;
        lllIIlIIl[91] = (-28689) & 30207;
        lllIIlIIl[92] = (-((-24849) & 28115)) & (-513) & 4095;
        lllIIlIIl[93] = (-((-26969) & 32761)) & (-18433) & 24551;
        lllIIlIIl[94] = (-7333) & 7663;
        lllIIlIIl[95] = (-((-6169) & 23583)) & (-14465) & 32223;
        lllIIlIIl[96] = (-((-8709) & 30373)) & (-2065) & 24063;
        lllIIlIIl[97] = (-((-8261) & 29694)) & (-1) & 32763;
        lllIIlIIl[98] = (-((-25125) & 29631)) & (-16417) & 32254;
        lllIIlIIl[99] = (-4888) & 16215;
        lllIIlIIl[100] = (147 ^ 158) ^ (175 ^ 155);
    }

    private static boolean llIIIIIlllll(int i) {
        return i != 0;
    }

    private static boolean llIIIIlIIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIIlIIlII(Skills.getLevel(Skill.FISHING), lllIIlIIl[74])) {
            ?? r0 = lllIIlIIl[1];
            "".length();
            return (((((83 + 198) - 272) + 243) ^ (((73 + 33) - 95) + 177)) & (((((37 + 26) - (-41)) + 105) ^ (((87 + 102) - 124) + 80)) ^ (-" ".length()))) != (((144 ^ 129) ^ (23 ^ 88)) & (((((115 + 45) - 115) + 110) ^ (((117 + 22) - 138) + 196)) ^ (-" ".length()))) ? ((78 ^ 94) ^ (12 ^ 49)) & (((34 ^ 76) ^ (237 ^ 174)) ^ (-" ".length())) : r0;
        }
        return lllIIlIIl[0];
    }

    private static boolean llIIIIlIIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (llIIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ao.lllIIlIIl[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ey() {
        if (llIIIIIlllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[0]];
            C0001b.a(bx);
            if (llIIIIlIIIII(bx.size(), lllIIlIIl[1])) {
                System.out.println(lllIIIlll[lllIIlIIl[1]]);
                bv = lllIIlIIl[0];
            }
        }
        if (llIIIIlIIIIl(bv ? 1 : 0)) {
            if (llIIIIlIIIIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIlIIIlI(nearest) && llIIIIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIlll[lllIIlIIl[2]];
                    C0000a.a(nearest);
                }
                if (llIIIIlIIIlI(nearest) && llIIIIIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIlIIl[4]);
                        "".length();
                    }
                    if (llIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[5]];
                        if (llIIIIlIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIlIIl[5]);
                            "".length();
                        }
                        if (llIIIIlIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIlIIl[2]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIlIIl[1]];
                        iArr[lllIIlIIl[0]] = lllIIlIIl[6];
                        if (llIIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lllIIlIIl[1]];
                            strArr[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[7]];
                        }
                        int[] iArr2 = new int[lllIIlIIl[1]];
                        iArr2[lllIIlIIl[0]] = lllIIlIIl[8];
                        if (llIIIIlIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[lllIIlIIl[1]];
                            strArr2[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[9]];
                        }
                        int[] iArr3 = new int[lllIIlIIl[1]];
                        iArr3[lllIIlIIl[0]] = lllIIlIIl[10];
                        if (llIIIIlIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[lllIIlIIl[1]];
                            strArr3[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[11]];
                        }
                        int[] iArr4 = new int[lllIIlIIl[1]];
                        iArr4[lllIIlIIl[0]] = lllIIlIIl[12];
                        if (llIIIIlIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[lllIIlIIl[1]];
                            strArr4[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[13]];
                        }
                        int[] iArr5 = new int[lllIIlIIl[1]];
                        iArr5[lllIIlIIl[0]] = lllIIlIIl[14];
                        if (llIIIIlIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[lllIIlIIl[1]];
                            strArr5[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[15]];
                        }
                        if ((!llIIIIlIIIIl(Bank.contains(C0005f.aV) ? 1 : 0) || llIIIIlIIlII(Inventory.getCount(C0005f.aV), lllIIlIIl[1])) && !llIIIIIlllll(Equipment.contains(C0005f.aV) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIIlIIl[1]];
                            iArr6[lllIIlIIl[0]] = lllIIlIIl[6];
                            if (llIIIIIlllll(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[17]], lllIIlIIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lllIIlIIl[1]];
                                    strArr6[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[82]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return (173 ^ 169) > (171 ^ 175) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[lllIIlIIl[1]];
                            iArr7[lllIIlIIl[0]] = lllIIlIIl[8];
                            if (llIIIIIlllll(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[18]], lllIIlIIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lllIIlIIl[1]];
                                    strArr6[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[81]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[lllIIlIIl[1]];
                            iArr8[lllIIlIIl[0]] = lllIIlIIl[10];
                            if (llIIIIIlllll(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[19]], lllIIlIIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lllIIlIIl[1]];
                                    strArr6[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[80]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return 0 != 0 ? ((81 ^ 28) ^ (8 ^ 81)) & (((((40 + 82) - 7) + 56) ^ (((76 + 103) - 143) + 155)) ^ (-" ".length())) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[lllIIlIIl[1]];
                            iArr9[lllIIlIIl[0]] = lllIIlIIl[12];
                            if (llIIIIIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[20]], lllIIlIIl[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lllIIlIIl[1]];
                                    strArr6[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[79]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[lllIIlIIl[1]];
                            iArr10[lllIIlIIl[0]] = lllIIlIIl[14];
                            if (llIIIIIlllll(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(lllIIIlll[lllIIlIIl[22]], lllIIlIIl[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lllIIlIIl[1]];
                                    strArr6[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[78]];
                                    if (llIIIIlIIIll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }, lllIIlIIl[4]);
                                "".length();
                            }
                            if (llIIIIIlllll(Bank.contains(C0005f.aV) ? 1 : 0)) {
                                C0000a.b(C0005f.aV, lllIIlIIl[1]);
                            }
                            int[] iArr11 = new int[lllIIlIIl[1]];
                            iArr11[lllIIlIIl[0]] = lllIIlIIl[24];
                            if (llIIIIIlllll(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(lllIIlIIl[24], lllIIlIIl[1]);
                            }
                        }
                        Q();
                        System.out.println(lllIIIlll[lllIIlIIl[16]]);
                        bv = lllIIlIIl[1];
                        return;
                    }
                }
            }
            if (llIIIIIlllll(an() ? 1 : 0)) {
                if (llIIIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIlll[lllIIlIIl[25]];
                    System.out.println(lllIIIlll[lllIIlIIl[26]]);
                    Inventory.getAll(my).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    if (llIIIIlIIIII(Skills.getLevel(Skill.FISHING), lllIIlIIl[27])) {
                        if (llIIIIlIIIII(Skills.getLevel(Skill.FISHING), lllIIlIIl[7])) {
                            if (llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mw), lllIIlIIl[7])) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[28]];
                                if (llIIIIIlllll(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                                    Inventory.getFirst(C0005f.aV).interact(lllIIIlll[lllIIlIIl[29]]);
                                }
                                Movement.walkTo(mw);
                                "".length();
                                Time.sleepTicks(lllIIlIIl[1]);
                                "".length();
                            }
                            if (llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[27]];
                                if (llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                                    int[] iArr12 = new int[lllIIlIIl[1]];
                                    iArr12[lllIIlIIl[0]] = lllIIlIIl[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (llIIIIlIIIlI(nearest2) && llIIIIIlllll(mv.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[lllIIlIIl[1]];
                                        iArr13[lllIIlIIl[0]] = lllIIlIIl[31];
                                        NPCs.getNearest(iArr13).interact(lllIIlIIl[0]);
                                        Time.sleepTicks(lllIIlIIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (llIIIIlIIlII(Skills.getLevel(Skill.FISHING), lllIIlIIl[7]) && llIIIIlIIIII(Skills.getLevel(Skill.FISHING), lllIIlIIl[27])) {
                            if (llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[32]];
                                Movement.walkTo(mw);
                                "".length();
                                Time.sleepTicks(lllIIlIIl[1]);
                                "".length();
                            }
                            if (llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[33]];
                                if (llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                                    int[] iArr14 = new int[lllIIlIIl[1]];
                                    iArr14[lllIIlIIl[0]] = lllIIlIIl[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (llIIIIlIIIlI(nearest3) && llIIIIIlllll(mv.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[lllIIlIIl[1]];
                                        iArr15[lllIIlIIl[0]] = lllIIlIIl[31];
                                        NPCs.getNearest(iArr15).interact(lllIIIlll[lllIIlIIl[34]]);
                                        Time.sleepTicks(lllIIlIIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIIIIlIIlII(Skills.getLevel(Skill.FISHING), lllIIlIIl[27])) {
                        if (llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[35]];
                            Movement.walkTo(mx);
                            "".length();
                            Time.sleepTicks(lllIIlIIl[1]);
                            "".length();
                        }
                        if (llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[36]];
                            if (llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30]) && llIIIIlIIIlI(NPCs.getNearest(npc -> {
                                if (llIIIIlIIllI(npc.getId(), lllIIlIIl[77]) && llIIIIlIIlll(npc.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                    ?? r0 = lllIIlIIl[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                                }
                                return lllIIlIIl[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (llIIIIlIIllI(npc2.getId(), lllIIlIIl[77]) && llIIIIlIIlll(npc2.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                        ?? r0 = lllIIlIIl[1];
                                        "".length();
                                        return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lllIIlIIl[0];
                                }).interact(lllIIIlll[lllIIlIIl[37]]);
                                Time.sleepTicks(lllIIlIIl[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean an() {
        String[] strArr = new String[lllIIlIIl[1]];
        strArr[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[58]];
        if (llIIIIIlllll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lllIIlIIl[1]];
            strArr2[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[59]];
            if (llIIIIIlllll(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lllIIlIIl[1]];
                strArr3[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[60]];
                if (llIIIIIlllll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIIlIIl[1]];
                    strArr4[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[61]];
                    if (llIIIIIlllll(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[lllIIlIIl[1]];
                        strArr5[lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[62]];
                        if (llIIIIIlllll(Inventory.contains(strArr5) ? 1 : 0) && (!llIIIIlIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) || llIIIIIlllll(Equipment.contains(C0005f.aV) ? 1 : 0))) {
                            ?? r0 = lllIIlIIl[1];
                            "".length();
                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lllIIlIIl[0];
    }

    public static void Q() {
        int[] iArr = new int[lllIIlIIl[1]];
        iArr[lllIIlIIl[0]] = lllIIlIIl[6];
        if (llIIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[6], lllIIlIIl[1], lllIIlIIl[4]));
            "".length();
        }
        int[] iArr2 = new int[lllIIlIIl[1]];
        iArr2[lllIIlIIl[0]] = lllIIlIIl[8];
        if (llIIIIlIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[8], lllIIlIIl[1], lllIIlIIl[4]));
            "".length();
        }
        int[] iArr3 = new int[lllIIlIIl[1]];
        iArr3[lllIIlIIl[0]] = lllIIlIIl[10];
        if (llIIIIlIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[10], lllIIlIIl[1], lllIIlIIl[63]));
            "".length();
        }
        int[] iArr4 = new int[lllIIlIIl[1]];
        iArr4[lllIIlIIl[0]] = lllIIlIIl[14];
        if (llIIIIlIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[14], lllIIlIIl[64], lllIIlIIl[65]));
            "".length();
        }
        int[] iArr5 = new int[lllIIlIIl[1]];
        iArr5[lllIIlIIl[0]] = lllIIlIIl[12];
        if (llIIIIlIIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[12], lllIIlIIl[66], lllIIlIIl[7]));
            "".length();
        }
        int[] iArr6 = new int[lllIIlIIl[1]];
        iArr6[lllIIlIIl[0]] = lllIIlIIl[67];
        if (llIIIIlIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[67], lllIIlIIl[1], lllIIlIIl[4]));
            "".length();
        }
        int[] iArr7 = new int[lllIIlIIl[1]];
        iArr7[lllIIlIIl[0]] = lllIIlIIl[24];
        if (llIIIIlIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[24], lllIIlIIl[16], lllIIlIIl[4]));
            "".length();
        }
        if (llIIIIlIIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIIlll[lllIIlIIl[75]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[68], lllIIlIIl[7], lllIIlIIl[69]));
            "".length();
        }
        int[] iArr8 = new int[lllIIlIIl[1]];
        iArr8[lllIIlIIl[0]] = lllIIlIIl[70];
        if (llIIIIlIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIIl[70], lllIIlIIl[54], lllIIlIIl[71]));
            "".length();
        }
    }

    private static String llIIIIIllIIl(String llllIIIllIlII, String llllIIIllIIll) {
        try {
            SecretKeySpec llllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIllIllI = Cipher.getInstance("Blowfish");
            llllIIIllIllI.init(lllIIlIIl[2], llllIIIllIlll);
            return new String(llllIIIllIllI.doFinal(Base64.getDecoder().decode(llllIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIIllIIII) {
            llllIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIIlII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIlIIIll(int i) {
        return i > 0;
    }

    private static boolean llIIIIlIIIlI(Object obj) {
        return obj != null;
    }
}
