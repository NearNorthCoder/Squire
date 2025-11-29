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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.T  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/T.class */
public class T implements ab {
    public static final /* synthetic */ WorldPoint lb;
    public static final /* synthetic */ WorldPoint lc;
    public static /* synthetic */ String[] cG;
    static /* synthetic */ boolean lh;
    private static /* synthetic */ String[] llllIllll;
    static /* synthetic */ boolean dl;
    static /* synthetic */ boolean lg;
    public static final /* synthetic */ WorldPoint ld;
    public static final /* synthetic */ WorldPoint le;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllllIllI;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ boolean lf;
    static /* synthetic */ boolean li;
    static /* synthetic */ int dk;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIlIlIlllll(C0004e.j(lllllIllI[14]), lllllIllI[23]) && llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
            ?? r0 = lllllIllI[1];
            "".length();
            return (-((188 ^ 172) ^ (166 ^ 179))) >= 0 ? ((210 ^ 177) ^ (41 ^ 25)) & (((((226 + 136) - 181) + 54) ^ (((139 + 87) - 179) + 137)) ^ (-" ".length())) : r0;
        }
        return lllllIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllllIllI[9]];
        iArr[lllllIllI[0]] = lllllIllI[19];
        iArr[lllllIllI[1]] = lllllIllI[37];
        iArr[lllllIllI[2]] = lllllIllI[46];
        iArr[lllllIllI[7]] = lllllIllI[39];
        int lIlIlllIlIIlI = lllllIllI[0];
        while (llIlIlIllIll(lIlIlllIlIIlI, iArr.length)) {
            int[] iArr2 = new int[lllllIllI[1]];
            iArr2[lllllIllI[0]] = iArr[lIlIlllIlIIlI];
            if (llIlIlIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllllIllI[0];
            }
            lIlIlllIlIIlI++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllIllI[1];
    }

    private static String llIlIIllIIIl(String lIlIllIlIIlIl, String lIlIllIlIIlII) {
        try {
            SecretKeySpec lIlIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIIlll = Cipher.getInstance("Blowfish");
            lIlIllIlIIlll.init(lllllIllI[2], lIlIllIlIlIII);
            return new String(lIlIllIlIIlll.doFinal(Base64.getDecoder().decode(lIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIIllI) {
            lIlIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIllllI(int i) {
        return i > 0;
    }

    static {
        llIlIlIllIII();
        llIlIlIlIlII();
        lb = new WorldPoint(lllllIllI[341], lllllIllI[342], lllllIllI[0]);
        lc = new WorldPoint(lllllIllI[343], lllllIllI[344], lllllIllI[0]);
        ld = new WorldPoint(lllllIllI[345], lllllIllI[346], lllllIllI[1]);
        le = new WorldPoint(lllllIllI[347], lllllIllI[348], lllllIllI[0]);
        bx = new ArrayList();
        String[] strArr = new String[lllllIllI[43]];
        strArr[lllllIllI[0]] = llllIllll[lllllIllI[349]];
        strArr[lllllIllI[1]] = llllIllll[lllllIllI[350]];
        strArr[lllllIllI[2]] = llllIllll[lllllIllI[351]];
        strArr[lllllIllI[7]] = llllIllll[lllllIllI[352]];
        strArr[lllllIllI[9]] = llllIllll[lllllIllI[353]];
        strArr[lllllIllI[11]] = llllIllll[lllllIllI[354]];
        strArr[lllllIllI[12]] = llllIllll[lllllIllI[355]];
        strArr[lllllIllI[13]] = llllIllll[lllllIllI[356]];
        strArr[lllllIllI[16]] = llllIllll[lllllIllI[357]];
        strArr[lllllIllI[17]] = llllIllll[lllllIllI[358]];
        strArr[lllllIllI[23]] = llllIllll[lllllIllI[359]];
        strArr[lllllIllI[26]] = llllIllll[lllllIllI[360]];
        strArr[lllllIllI[28]] = llllIllll[lllllIllI[361]];
        strArr[lllllIllI[38]] = llllIllll[lllllIllI[362]];
        strArr[lllllIllI[40]] = llllIllll[lllllIllI[363]];
        strArr[lllllIllI[20]] = llllIllll[lllllIllI[364]];
        cG = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x099b, code lost:
        if (llIlIlIlllII(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.li ? 1 : 0) != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b2f, code lost:
        if (llIlIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0325, code lost:
        if (llIlIlIlllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[20]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0368, code lost:
        if (llIlIlIlllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[20]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ab, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[20]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03ae, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.llllIllll[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[23]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c9, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d68  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1299  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x12c4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x132f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x139a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1406  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1488  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x14fd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x1543  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x156c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x15a6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x1607  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x168a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x16b2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x16e7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x17c7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1804  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x18cf  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x19b9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1a61  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1a95  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1b15  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1ba1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1c42  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1d01  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1d35  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1d84  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1dcd  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x2079  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x20d5  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x2192  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x2875  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x28ac  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x28f3  */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1760, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1769, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1778, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1793, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1836, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1838, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1840, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1842, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1844, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1846, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1848, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1857, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v590, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v598, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cW() {
        int[] iArr;
        String[] strArr;
        WorldArea worldArea;
        WorldArea worldArea2;
        TileObject nearest;
        int[] iArr2;
        int[] iArr3;
        WorldArea worldArea3;
        int[] iArr4;
        WorldPoint worldPoint;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        TileObject nearest2;
        WorldPoint worldPoint2;
        WorldPoint worldPoint3;
        WorldPoint worldPoint4;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        TileObject nearest3;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        if (llIlIlIllIlI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[0]];
            C0001b.a(bx);
            if (llIlIlIllIll(bx.size(), lllllIllI[1])) {
                System.out.println(llllIllll[lllllIllI[1]]);
                bv = lllllIllI[0];
            }
        }
        if (llIlIlIlllII(bv ? 1 : 0)) {
            String[] strArr11 = new String[lllllIllI[1]];
            strArr11[lllllIllI[0]] = llllIllll[lllllIllI[2]];
            if (llIlIlIllIlI(Inventory.contains(strArr11) ? 1 : 0)) {
                li = lllllIllI[1];
                lh = lllllIllI[1];
                lf = lllllIllI[1];
                lg = lllllIllI[1];
            }
            int[] iArr8 = new int[lllllIllI[1]];
            iArr8[lllllIllI[0]] = lllllIllI[3];
            if (llIlIlIllIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                lh = lllllIllI[1];
            }
            int[] iArr9 = new int[lllllIllI[1]];
            iArr9[lllllIllI[0]] = lllllIllI[4];
            if (llIlIlIllIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                lf = lllllIllI[1];
            }
            int[] iArr10 = new int[lllllIllI[1]];
            iArr10[lllllIllI[0]] = lllllIllI[5];
            if (llIlIlIllIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                lg = lllllIllI[1];
            }
            if (llIlIlIllIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlIlIllIll(Movement.getRunEnergy(), lllllIllI[6])) {
                Inventory.getFirst(C0005f.bc).interact(llllIllll[lllllIllI[7]]);
                Time.sleepTicks(lllllIllI[1]);
                "".length();
            }
            if (llIlIlIllIlI(Inventory.contains(C0005f.aZ) ? 1 : 0) && llIlIlIllIll(Prayers.getPoints(), lllllIllI[8])) {
                Inventory.getFirst(C0005f.aZ).interact(llllIllll[lllllIllI[9]]);
            }
            if (!llIlIlIllIll(Combat.getMissingHealth(), lllllIllI[10]) || llIlIlIlllIl(llIlIlIllIIl(C0004e.w(), 51.0d))) {
                String[] strArr12 = new String[lllllIllI[1]];
                strArr12[lllllIllI[0]] = llllIllll[lllllIllI[11]];
                if (llIlIlIllIlI(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[lllllIllI[1]];
                    strArr13[lllllIllI[0]] = llllIllll[lllllIllI[12]];
                    Inventory.getFirst(strArr13).interact(llllIllll[lllllIllI[13]]);
                }
            }
            if (llIlIlIlllII(Movement.isRunEnabled() ? 1 : 0) && llIlIlIllllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIlIlIlllII(an() ? 1 : 0) && llIlIlIllIll(C0004e.j(lllllIllI[14]), lllllIllI[2]) && llIlIlIlllll(C0004e.J(), lllllIllI[15])) {
                BankLocation nearest4 = BankLocation.getNearest();
                if (llIlIllIIIII(nearest4) && llIlIlIlllII(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[16]];
                    Movement.walkTo(nearest4);
                    "".length();
                    Time.sleepTicks(lllllIllI[2]);
                    "".length();
                }
                if (llIlIllIIIII(nearest4) && llIlIlIllIlI(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[17]];
                    if (llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIllI[18]);
                        "".length();
                    }
                    if (llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIlIllllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIllI[9]);
                            "".length();
                        }
                        if (llIlIlIllllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllIllI[2]);
                            "".length();
                        }
                        int[] iArr11 = new int[lllllIllI[1]];
                        iArr11[lllllIllI[0]] = lllllIllI[19];
                        if (llIlIlIllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lllllIllI[1]];
                            iArr12[lllllIllI[0]] = lllllIllI[19];
                        }
                        int[] iArr13 = new int[lllllIllI[1]];
                        iArr13[lllllIllI[0]] = lllllIllI[21];
                        if (llIlIlIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lllllIllI[1]];
                            iArr14[lllllIllI[0]] = lllllIllI[21];
                        }
                        int[] iArr15 = new int[lllllIllI[1]];
                        iArr15[lllllIllI[0]] = lllllIllI[22];
                        if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[lllllIllI[1]];
                            iArr16[lllllIllI[0]] = lllllIllI[22];
                        }
                        int[] iArr17 = new int[lllllIllI[1]];
                        iArr17[lllllIllI[0]] = lllllIllI[24];
                        if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lllllIllI[1]];
                            iArr18[lllllIllI[0]] = lllllIllI[24];
                            if (llIlIlIllIll(Bank.getFirst(iArr18).getQuantity(), lllllIllI[25])) {
                                Q();
                                System.out.println(llllIllll[lllllIllI[26]]);
                                bv = lllllIllI[1];
                                return;
                            }
                        }
                        int[] iArr19 = new int[lllllIllI[1]];
                        iArr19[lllllIllI[0]] = lllllIllI[27];
                        if (llIlIlIllIlI(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[lllllIllI[1]];
                            iArr20[lllllIllI[0]] = lllllIllI[27];
                            if (llIlIlIllIll(Bank.getFirst(iArr20).getQuantity(), lllllIllI[7])) {
                                Q();
                                System.out.println(llllIllll[lllllIllI[28]]);
                                bv = lllllIllI[1];
                                return;
                            }
                        }
                        int[] iArr21 = new int[lllllIllI[29]];
                        iArr21[lllllIllI[0]] = lllllIllI[19];
                        iArr21[lllllIllI[1]] = lllllIllI[22];
                        iArr21[lllllIllI[2]] = lllllIllI[21];
                        iArr21[lllllIllI[7]] = lllllIllI[30];
                        iArr21[lllllIllI[9]] = lllllIllI[31];
                        iArr21[lllllIllI[11]] = lllllIllI[32];
                        iArr21[lllllIllI[12]] = lllllIllI[33];
                        iArr21[lllllIllI[13]] = lllllIllI[34];
                        iArr21[lllllIllI[16]] = lllllIllI[35];
                        iArr21[lllllIllI[17]] = lllllIllI[36];
                        iArr21[lllllIllI[23]] = lllllIllI[24];
                        iArr21[lllllIllI[26]] = lllllIllI[27];
                        iArr21[lllllIllI[28]] = lllllIllI[37];
                        iArr21[lllllIllI[38]] = lllllIllI[39];
                        iArr21[lllllIllI[40]] = lllllIllI[41];
                        iArr21[lllllIllI[20]] = lllllIllI[42];
                        iArr21[lllllIllI[43]] = lllllIllI[44];
                        if (llIlIlIlllII(C0004e.d(iArr21) ? 1 : 0)) {
                            Q();
                            System.out.println(llllIllll[lllllIllI[38]]);
                            bv = lllllIllI[1];
                            return;
                        }
                        int[] iArr22 = new int[lllllIllI[29]];
                        iArr22[lllllIllI[0]] = lllllIllI[19];
                        iArr22[lllllIllI[1]] = lllllIllI[22];
                        iArr22[lllllIllI[2]] = lllllIllI[21];
                        iArr22[lllllIllI[7]] = lllllIllI[30];
                        iArr22[lllllIllI[9]] = lllllIllI[31];
                        iArr22[lllllIllI[11]] = lllllIllI[32];
                        iArr22[lllllIllI[12]] = lllllIllI[33];
                        iArr22[lllllIllI[13]] = lllllIllI[34];
                        iArr22[lllllIllI[16]] = lllllIllI[35];
                        iArr22[lllllIllI[17]] = lllllIllI[36];
                        iArr22[lllllIllI[23]] = lllllIllI[24];
                        iArr22[lllllIllI[26]] = lllllIllI[27];
                        iArr22[lllllIllI[28]] = lllllIllI[37];
                        iArr22[lllllIllI[38]] = lllllIllI[39];
                        iArr22[lllllIllI[40]] = lllllIllI[41];
                        iArr22[lllllIllI[20]] = lllllIllI[42];
                        iArr22[lllllIllI[43]] = lllllIllI[44];
                        if (llIlIlIllIlI(C0004e.d(iArr22) ? 1 : 0)) {
                            C0000a.a(lllllIllI[19], lllllIllI[11]);
                            C0000a.a(lllllIllI[22], lllllIllI[11]);
                            C0000a.a(lllllIllI[21], lllllIllI[11]);
                            C0000a.b(C0005f.bc, lllllIllI[11]);
                            C0000a.a(lllllIllI[35], lllllIllI[13]);
                            C0000a.b(C0005f.bm, lllllIllI[1]);
                            C0000a.a(lllllIllI[42], lllllIllI[1]);
                            C0000a.a(lllllIllI[44], lllllIllI[1]);
                            C0000a.a(lllllIllI[39], lllllIllI[1]);
                            C0000a.a(lllllIllI[36], lllllIllI[1]);
                            C0000a.a(lllllIllI[45], lllllIllI[2]);
                            C0000a.a(lllllIllI[46], lllllIllI[47]);
                        }
                    }
                }
            }
            if (llIlIlIllIlI(an() ? 1 : 0) && llIlIlIllIll(C0004e.j(lllllIllI[14]), lllllIllI[1])) {
                if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[40]];
                    Movement.walkTo(lb);
                    "".length();
                    Time.sleepTicks(lllllIllI[1]);
                    "".length();
                }
                if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[20]];
                    C0006g.a(llllIllll[lllllIllI[43]], cG, lllllIllI[1]);
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[1]) && llIlIlIllIlI(an() ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllllIllI[48], lllllIllI[49], lllllIllI[0]);
                if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllllIllI[16])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[29]];
                    Movement.walkTo(worldPoint5);
                    "".length();
                    Time.sleepTicks(lllllIllI[1]);
                    "".length();
                }
                if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllllIllI[16])) {
                    C0006g.a(llllIllll[lllllIllI[50]], cG, lllllIllI[1]);
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[2])) {
                dk = lllllIllI[0];
                int[] iArr23 = new int[lllllIllI[1]];
                iArr23[lllllIllI[0]] = lllllIllI[44];
                if (llIlIlIllIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lllllIllI[1]];
                    iArr24[lllllIllI[0]] = lllllIllI[44];
                    if (llIlIlIlllII(Equipment.contains(iArr24) ? 1 : 0)) {
                        String[] strArr14 = new String[lllllIllI[1]];
                        strArr14[lllllIllI[0]] = llllIllll[lllllIllI[51]];
                        Inventory.getFirst(strArr14).interact(llllIllll[lllllIllI[10]]);
                    }
                }
                if (llIlIlIllIlI(Inventory.contains(item -> {
                    return item.getName().contains(llllIllll[lllllIllI[340]]);
                }) ? 1 : 0) && llIlIlIlllII(Equipment.contains(item2 -> {
                    return item2.getName().contains(llllIllll[lllllIllI[339]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llllIllll[lllllIllI[338]]);
                    }).interact(llllIllll[lllllIllI[52]]);
                }
                if (llIlIlIllIlI(Inventory.contains(item4 -> {
                    return item4.getName().contains(llllIllll[lllllIllI[337]]);
                }) ? 1 : 0) && llIlIlIlllII(Equipment.contains(item5 -> {
                    return item5.getName().contains(llllIllll[lllllIllI[336]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(llllIllll[lllllIllI[335]]);
                    }).interact(llllIllll[lllllIllI[53]]);
                }
                if (llIlIllIIlII(Vars.getBit(lllllIllI[54]), lllllIllI[1])) {
                    String[] strArr15 = new String[lllllIllI[1]];
                    strArr15[lllllIllI[0]] = llllIllll[lllllIllI[55]];
                    if (llIlIlIlllII(Inventory.contains(strArr15) ? 1 : 0)) {
                    }
                    if (((llIlIlIlllII(Vars.getBit(lllllIllI[54])) && llIlIlIlllII(Vars.getBit(lllllIllI[67])) && !llIlIlIllIlI(Vars.getBit(lllllIllI[62]))) || llIlIllIIIll(C0004e.j(lllllIllI[72]), lllllIllI[20])) && llIlIlIlllII(Vars.getBit(lllllIllI[73]))) {
                        strArr10 = new String[lllllIllI[1]];
                        strArr10[lllllIllI[0]] = llllIllll[lllllIllI[74]];
                        if (llIlIlIllIlI(Inventory.contains(strArr10) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(lllllIllI[75], lllllIllI[76], lllllIllI[0]);
                            String[] strArr16 = new String[lllllIllI[1]];
                            strArr16[lllllIllI[0]] = llllIllll[lllllIllI[77]];
                            if (llIlIllIIlIl(NPCs.getNearest(strArr16))) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[78]];
                                Movement.walkTo(worldPoint6);
                                "".length();
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                            String[] strArr17 = new String[lllllIllI[1]];
                            strArr17[lllllIllI[0]] = llllIllll[lllllIllI[79]];
                            if (llIlIllIIIII(NPCs.getNearest(strArr17))) {
                                C0006g.a(llllIllll[lllllIllI[80]], cG);
                            }
                        }
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[73]), lllllIllI[1]) && (!llIlIlIllIlI(Vars.getBit(lllllIllI[81])) || llIlIlIlllII(lf ? 1 : 0))) {
                        strArr8 = new String[lllllIllI[1]];
                        strArr8[lllllIllI[0]] = llllIllll[lllllIllI[82]];
                        if (llIlIlIlllII(Inventory.contains(strArr8) ? 1 : 0) && llIlIlIlllII(Vars.getBit(lllllIllI[83]))) {
                            cZ();
                        }
                        strArr9 = new String[lllllIllI[1]];
                        strArr9[lllllIllI[0]] = llllIllll[lllllIllI[84]];
                        if (llIlIlIllIlI(Inventory.contains(strArr9) ? 1 : 0)) {
                            WorldPoint worldPoint7 = new WorldPoint(lllllIllI[85], lllllIllI[86], lllllIllI[0]);
                            if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllllIllI[9]) && llIlIlIlllII(Vars.getBit(lllllIllI[81]))) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[87]];
                                if (llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(worldPoint7);
                                "".length();
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                            if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllllIllI[23])) {
                                if (llIlIlIlllII(Vars.getBit(lllllIllI[81]))) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[88]];
                                    String[] strArr18 = new String[lllllIllI[1]];
                                    strArr18[lllllIllI[0]] = llllIllll[lllllIllI[89]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[lllllIllI[1]];
                                        strArr19[lllllIllI[0]] = llllIllll[lllllIllI[90]];
                                        Item first = Inventory.getFirst(strArr19);
                                        String[] strArr20 = new String[lllllIllI[1]];
                                        strArr20[lllllIllI[0]] = llllIllll[lllllIllI[91]];
                                        first.useOn(TileObjects.getNearest(strArr20));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr21 = new String[lllllIllI[1]];
                                    strArr21[lllllIllI[0]] = llllIllll[lllllIllI[6]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr21) ? 1 : 0)) {
                                        String[] strArr22 = new String[lllllIllI[1]];
                                        strArr22[lllllIllI[0]] = llllIllll[lllllIllI[92]];
                                        Item first2 = Inventory.getFirst(strArr22);
                                        String[] strArr23 = new String[lllllIllI[1]];
                                        strArr23[lllllIllI[0]] = llllIllll[lllllIllI[93]];
                                        first2.useOn(TileObjects.getNearest(strArr23));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr24 = new String[lllllIllI[1]];
                                    strArr24[lllllIllI[0]] = llllIllll[lllllIllI[94]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr24) ? 1 : 0)) {
                                        String[] strArr25 = new String[lllllIllI[1]];
                                        strArr25[lllllIllI[0]] = llllIllll[lllllIllI[95]];
                                        Item first3 = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[lllllIllI[1]];
                                        strArr26[lllllIllI[0]] = llllIllll[lllllIllI[96]];
                                        first3.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[lllllIllI[1]];
                                    strArr27[lllllIllI[0]] = llllIllll[lllllIllI[97]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr27) ? 1 : 0)) {
                                        String[] strArr28 = new String[lllllIllI[1]];
                                        strArr28[lllllIllI[0]] = llllIllll[lllllIllI[98]];
                                        Item first4 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[lllllIllI[1]];
                                        strArr29[lllllIllI[0]] = llllIllll[lllllIllI[99]];
                                        first4.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                }
                                if (llIlIllIIIll(Vars.getBit(lllllIllI[81]), lllllIllI[1])) {
                                    String[] strArr30 = new String[lllllIllI[1]];
                                    strArr30[lllllIllI[0]] = llllIllll[lllllIllI[100]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr30) ? 1 : 0)) {
                                        String[] strArr31 = new String[lllllIllI[1]];
                                        strArr31[lllllIllI[0]] = llllIllll[lllllIllI[101]];
                                        Item first5 = Inventory.getFirst(strArr31);
                                        String[] strArr32 = new String[lllllIllI[1]];
                                        strArr32[lllllIllI[0]] = llllIllll[lllllIllI[102]];
                                        first5.useOn(TileObjects.getNearest(strArr32));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr33 = new String[lllllIllI[1]];
                                    strArr33[lllllIllI[0]] = llllIllll[lllllIllI[103]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr33) ? 1 : 0)) {
                                        String[] strArr34 = new String[lllllIllI[1]];
                                        strArr34[lllllIllI[0]] = llllIllll[lllllIllI[104]];
                                        Item first6 = Inventory.getFirst(strArr34);
                                        String[] strArr35 = new String[lllllIllI[1]];
                                        strArr35[lllllIllI[0]] = llllIllll[lllllIllI[105]];
                                        first6.useOn(TileObjects.getNearest(strArr35));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr36 = new String[lllllIllI[1]];
                                    strArr36[lllllIllI[0]] = llllIllll[lllllIllI[106]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr36) ? 1 : 0)) {
                                        String[] strArr37 = new String[lllllIllI[1]];
                                        strArr37[lllllIllI[0]] = llllIllll[lllllIllI[107]];
                                        Item first7 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[lllllIllI[1]];
                                        strArr38[lllllIllI[0]] = llllIllll[lllllIllI[108]];
                                        first7.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[lllllIllI[1]];
                                    strArr39[lllllIllI[0]] = llllIllll[lllllIllI[109]];
                                    if (llIlIlIllIlI(Inventory.contains(strArr39) ? 1 : 0)) {
                                        String[] strArr40 = new String[lllllIllI[1]];
                                        strArr40[lllllIllI[0]] = llllIllll[lllllIllI[110]];
                                        Item first8 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[lllllIllI[1]];
                                        strArr41[lllllIllI[0]] = llllIllll[lllllIllI[111]];
                                        first8.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(lllllIllI[1]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[lllllIllI[1]];
                                    strArr42[lllllIllI[0]] = llllIllll[lllllIllI[112]];
                                    TileObject nearest5 = TileObjects.getNearest(strArr42);
                                    if (llIlIllIIIII(nearest5) && llIlIlIlllII(lf ? 1 : 0)) {
                                        if (llIlIlIlllII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            String[] strArr43 = new String[lllllIllI[1]];
                                            strArr43[lllllIllI[0]] = llllIllll[lllllIllI[113]];
                                            TileObjects.getNearest(strArr43).interact(llllIllll[lllllIllI[114]]);
                                            Time.sleepTicks(lllllIllI[16]);
                                            "".length();
                                        }
                                        if (llIlIlIllIlI(Reachable.isInteractable(nearest5) ? 1 : 0) && llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr44 = new String[lllllIllI[1]];
                                            strArr44[lllllIllI[0]] = llllIllll[lllllIllI[115]];
                                            if (llIlIlIllIlI(nearest5.hasAction(strArr44) ? 1 : 0)) {
                                                nearest5.interact(llllIllll[lllllIllI[116]]);
                                                Time.sleepTicks(lllllIllI[9]);
                                                "".length();
                                            }
                                            String[] strArr45 = new String[lllllIllI[1]];
                                            strArr45[lllllIllI[0]] = llllIllll[lllllIllI[117]];
                                            if (llIlIlIllIlI(nearest5.hasAction(strArr45) ? 1 : 0)) {
                                                nearest5.interact(llllIllll[lllllIllI[118]]);
                                                Time.sleepTicks(lllllIllI[9]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[81]), lllllIllI[1]) && llIlIlIlllII(lf ? 1 : 0)) {
                        strArr2 = new String[lllllIllI[1]];
                        strArr2[lllllIllI[0]] = llllIllll[lllllIllI[119]];
                        if (llIlIlIllIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr46 = new String[lllllIllI[1]];
                            strArr46[lllllIllI[0]] = llllIllll[lllllIllI[120]];
                            Item first9 = Inventory.getFirst(strArr46);
                            String[] strArr47 = new String[lllllIllI[1]];
                            strArr47[lllllIllI[0]] = llllIllll[lllllIllI[121]];
                            first9.useOn(TileObjects.getNearest(strArr47));
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                        strArr3 = new String[lllllIllI[1]];
                        strArr3[lllllIllI[0]] = llllIllll[lllllIllI[122]];
                        if (llIlIlIllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                            String[] strArr48 = new String[lllllIllI[1]];
                            strArr48[lllllIllI[0]] = llllIllll[lllllIllI[123]];
                            Item first10 = Inventory.getFirst(strArr48);
                            String[] strArr49 = new String[lllllIllI[1]];
                            strArr49[lllllIllI[0]] = llllIllll[lllllIllI[124]];
                            first10.useOn(TileObjects.getNearest(strArr49));
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                        strArr4 = new String[lllllIllI[1]];
                        strArr4[lllllIllI[0]] = llllIllll[lllllIllI[125]];
                        if (llIlIlIllIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                            String[] strArr50 = new String[lllllIllI[1]];
                            strArr50[lllllIllI[0]] = llllIllll[lllllIllI[126]];
                            Item first11 = Inventory.getFirst(strArr50);
                            String[] strArr51 = new String[lllllIllI[1]];
                            strArr51[lllllIllI[0]] = llllIllll[lllllIllI[127]];
                            first11.useOn(TileObjects.getNearest(strArr51));
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                        strArr5 = new String[lllllIllI[1]];
                        strArr5[lllllIllI[0]] = llllIllll[lllllIllI[128]];
                        if (llIlIlIllIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                            String[] strArr52 = new String[lllllIllI[1]];
                            strArr52[lllllIllI[0]] = llllIllll[lllllIllI[129]];
                            Item first12 = Inventory.getFirst(strArr52);
                            String[] strArr53 = new String[lllllIllI[1]];
                            strArr53[lllllIllI[0]] = llllIllll[lllllIllI[130]];
                            first12.useOn(TileObjects.getNearest(strArr53));
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                        String[] strArr54 = new String[lllllIllI[1]];
                        strArr54[lllllIllI[0]] = llllIllll[lllllIllI[25]];
                        nearest3 = TileObjects.getNearest(strArr54);
                        if (llIlIllIIIII(nearest3) && llIlIlIlllII(lf ? 1 : 0)) {
                            if (llIlIlIlllII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                String[] strArr55 = new String[lllllIllI[1]];
                                strArr55[lllllIllI[0]] = llllIllll[lllllIllI[131]];
                                TileObjects.getNearest(strArr55).interact(llllIllll[lllllIllI[132]]);
                                Time.sleepTicks(lllllIllI[16]);
                                "".length();
                            }
                            if (llIlIlIllIlI(Reachable.isInteractable(nearest3) ? 1 : 0) && llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                strArr6 = new String[lllllIllI[1]];
                                strArr6[lllllIllI[0]] = llllIllll[lllllIllI[133]];
                                if (llIlIlIllIlI(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                    nearest3.interact(llllIllll[lllllIllI[134]]);
                                    Time.sleepTicks(lllllIllI[9]);
                                    "".length();
                                }
                                strArr7 = new String[lllllIllI[1]];
                                strArr7[lllllIllI[0]] = llllIllll[lllllIllI[135]];
                                if (llIlIlIllIlI(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                    nearest3.interact(llllIllll[lllllIllI[136]]);
                                    Time.sleepTicks(lllllIllI[9]);
                                    "".length();
                                }
                            }
                        }
                    }
                    if (llIlIlIllIlI(lf ? 1 : 0) && llIlIlIlllII(lg ? 1 : 0)) {
                        if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIllI[85], lllllIllI[86], lllllIllI[0])), lllllIllI[23])) {
                            int[] iArr25 = new int[lllllIllI[1]];
                            iArr25[lllllIllI[0]] = lllllIllI[21];
                            Inventory.getFirst(iArr25).interact(llllIllll[lllllIllI[137]]);
                            Time.sleepTicks(lllllIllI[16]);
                            "".length();
                        }
                        worldPoint4 = new WorldPoint(lllllIllI[138], lllllIllI[139], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[140]];
                            if (llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(worldPoint4);
                                "".length();
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                            String[] strArr56 = new String[lllllIllI[7]];
                            strArr56[lllllIllI[0]] = llllIllll[lllllIllI[141]];
                            strArr56[lllllIllI[1]] = llllIllll[lllllIllI[142]];
                            strArr56[lllllIllI[2]] = llllIllll[lllllIllI[143]];
                            C0006g.a(strArr56);
                        }
                        if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[144]];
                            C0006g.a(llllIllll[lllllIllI[145]], cG);
                        }
                    }
                    if (llIlIlIllIlI(lf ? 1 : 0) && llIlIlIllIlI(lg ? 1 : 0) && llIlIlIlllII(lh ? 1 : 0)) {
                        strArr = new String[lllllIllI[1]];
                        strArr[lllllIllI[0]] = llllIllll[lllllIllI[146]];
                        if (llIlIlIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                            String[] strArr57 = new String[lllllIllI[1]];
                            strArr57[lllllIllI[0]] = llllIllll[lllllIllI[147]];
                            Inventory.getFirst(strArr57).interact(llllIllll[lllllIllI[148]]);
                        }
                        WorldArea worldArea4 = new WorldArea(lllllIllI[149], lllllIllI[150], lllllIllI[51], lllllIllI[10], lllllIllI[0]);
                        worldArea = new WorldArea(lllllIllI[151], lllllIllI[152], lllllIllI[58], lllllIllI[58], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && llIlIlIlllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            worldPoint3 = new WorldPoint(lllllIllI[153], lllllIllI[154], lllllIllI[0]);
                            if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllllIllI[2])) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[155]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                            if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllllIllI[2])) {
                                String[] strArr58 = new String[lllllIllI[1]];
                                strArr58[lllllIllI[0]] = llllIllll[lllllIllI[156]];
                                TileObjects.getNearest(strArr58).interact(llllIllll[lllllIllI[157]]);
                                Time.sleepTicks(lllllIllI[11]);
                                "".length();
                            }
                        }
                        worldArea2 = new WorldArea(lllllIllI[158], lllllIllI[159], lllllIllI[11], lllllIllI[16], lllllIllI[0]);
                        WorldArea worldArea5 = new WorldArea(lllllIllI[160], lllllIllI[161], lllllIllI[13], lllllIllI[7], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && llIlIlIllIlI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr5 = new int[lllllIllI[1]];
                            iArr5[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIlIlllII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr26 = new int[lllllIllI[1]];
                                iArr26[lllllIllI[0]] = lllllIllI[162];
                                if (llIlIllIIlIl(TileItems.getNearest(iArr26)) && llIlIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[165]];
                                    if (llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                        int[] iArr27 = new int[lllllIllI[1]];
                                        iArr27[lllllIllI[0]] = lllllIllI[166];
                                        NPCs.getNearest(iArr27).interact(llllIllll[lllllIllI[167]]);
                                        Time.sleepTicks(lllllIllI[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr6 = new int[lllllIllI[1]];
                            iArr6[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIllIIIII(TileItems.getNearest(iArr6))) {
                                int[] iArr28 = new int[lllllIllI[1]];
                                iArr28[lllllIllI[0]] = lllllIllI[162];
                                TileItems.getNearest(iArr28).interact(llllIllll[lllllIllI[168]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                            iArr7 = new int[lllllIllI[1]];
                            iArr7[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIlIllIlI(Inventory.contains(iArr7) ? 1 : 0) && llIlIlIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(lllllIllI[169], lllllIllI[170], lllllIllI[0]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[171]];
                                    C0004e.c(worldPoint2);
                                    Time.sleepTicks(lllllIllI[2]);
                                    "".length();
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    String[] strArr59 = new String[lllllIllI[1]];
                                    strArr59[lllllIllI[0]] = llllIllll[lllllIllI[172]];
                                    TileObjects.getNearest(strArr59).interact(llllIllll[lllllIllI[173]]);
                                    Time.sleepTicks(lllllIllI[12]);
                                    "".length();
                                }
                            }
                            if (llIlIlIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIllIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                nearest2 = TileObjects.getNearest(tileObject -> {
                                    if (llIlIlIllIlI(tileObject.getName().contains(llllIllll[lllllIllI[334]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                                        ?? r0 = lllllIllI[1];
                                        "".length();
                                        return ((((54 + 35) - (-75)) + 7) ^ (((24 + 54) - (-8)) + 89)) <= "  ".length() ? ((246 ^ 179) ^ (162 ^ 189)) & (((3 ^ 58) ^ (14 ^ 109)) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIllI[0];
                                });
                                AccBuilderGWD.c = llllIllll[lllllIllI[174]];
                                if (llIlIllIIIII(nearest2)) {
                                    nearest2.interact(llllIllll[lllllIllI[175]]);
                                    Time.sleepTicks(lllllIllI[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1]) && llIlIlIlllII(new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr2 = new int[lllllIllI[1]];
                            iArr2[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIlIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr29 = new int[lllllIllI[1]];
                                iArr29[lllllIllI[0]] = lllllIllI[178];
                                if (llIlIllIIlIl(TileItems.getNearest(iArr29))) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[179]];
                                    NPC nearest6 = NPCs.getNearest(npc -> {
                                        if (llIlIlIllIlI(npc.getName().contains(llllIllll[lllllIllI[333]]) ? 1 : 0) && llIlIllIIllI(npc.getInteracting(), Players.getLocal()) && llIlIllIIIlI(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                            ?? r0 = lllllIllI[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllllIllI[0];
                                    });
                                    if (llIlIllIIlIl(Players.getLocal().getInteracting()) && llIlIllIIlIl(nearest6)) {
                                        int[] iArr30 = new int[lllllIllI[1]];
                                        iArr30[lllllIllI[0]] = lllllIllI[180];
                                        NPCs.getNearest(iArr30).interact(llllIllll[lllllIllI[181]]);
                                        Time.sleepTicks(lllllIllI[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr3 = new int[lllllIllI[1]];
                            iArr3[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIllIIIII(TileItems.getNearest(iArr3))) {
                                int[] iArr31 = new int[lllllIllI[1]];
                                iArr31[lllllIllI[0]] = lllllIllI[178];
                                TileItems.getNearest(iArr31).interact(llllIllll[lllllIllI[182]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                            worldArea3 = new WorldArea(lllllIllI[183], lllllIllI[184], lllllIllI[12], lllllIllI[11], lllllIllI[1]);
                            iArr4 = new int[lllllIllI[1]];
                            iArr4[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIlIllIlI(Inventory.contains(iArr4) ? 1 : 0) && llIlIlIlllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint = new WorldPoint(lllllIllI[163], lllllIllI[170], lllllIllI[1]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[185]];
                                    C0004e.c(worldPoint);
                                    Time.sleepTicks(lllllIllI[2]);
                                    "".length();
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    String[] strArr60 = new String[lllllIllI[1]];
                                    strArr60[lllllIllI[0]] = llllIllll[lllllIllI[186]];
                                    TileObjects.getNearest(strArr60).interact(llllIllll[lllllIllI[187]]);
                                    Time.sleepTicks(lllllIllI[12]);
                                    "".length();
                                }
                            }
                            if (llIlIlIllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest7 = TileObjects.getNearest(tileObject2 -> {
                                    if (llIlIlIllIlI(tileObject2.getName().contains(llllIllll[lllllIllI[332]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                                        ?? r0 = lllllIllI[1];
                                        "".length();
                                        return ((((56 + 135) - 178) + 157) ^ (((66 + 81) - 111) + 138)) <= 0 ? ((72 ^ 115) ^ (16 ^ 72)) & (((((128 + 138) - 35) + 19) ^ (((23 + 140) - 68) + 58)) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIllI[0];
                                });
                                if (llIlIllIIIII(nearest7)) {
                                    nearest7.interact(llllIllll[lllllIllI[188]]);
                                    Time.sleepTicks(lllllIllI[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[2])) {
                            int[] iArr32 = new int[lllllIllI[1]];
                            iArr32[lllllIllI[0]] = lllllIllI[189];
                            if (llIlIlIlllII(Inventory.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[lllllIllI[1]];
                                iArr33[lllllIllI[0]] = lllllIllI[189];
                                if (llIlIllIIlIl(TileItems.getNearest(iArr33))) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[190]];
                                    NPC nearest8 = NPCs.getNearest(npc2 -> {
                                        if (llIlIlIllIlI(npc2.getName().contains(llllIllll[lllllIllI[331]]) ? 1 : 0) && llIlIllIIllI(npc2.getInteracting(), Players.getLocal()) && llIlIllIIIlI(npc2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                            ?? r0 = lllllIllI[1];
                                            "".length();
                                            return "  ".length() <= ((236 ^ 169) & ((21 ^ 80) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                                        }
                                        return lllllIllI[0];
                                    });
                                    if (llIlIllIIlIl(Players.getLocal().getInteracting()) && llIlIllIIlIl(nearest8)) {
                                        int[] iArr34 = new int[lllllIllI[1]];
                                        iArr34[lllllIllI[0]] = lllllIllI[191];
                                        NPCs.getNearest(iArr34).interact(llllIllll[lllllIllI[192]]);
                                        Time.sleepTicks(lllllIllI[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr35 = new int[lllllIllI[1]];
                            iArr35[lllllIllI[0]] = lllllIllI[189];
                            if (llIlIllIIIII(TileItems.getNearest(iArr35))) {
                                int[] iArr36 = new int[lllllIllI[1]];
                                iArr36[lllllIllI[0]] = lllllIllI[189];
                                TileItems.getNearest(iArr36).interact(llllIllll[lllllIllI[193]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                            WorldArea worldArea6 = new WorldArea(lllllIllI[149], lllllIllI[164], lllllIllI[10], lllllIllI[38], lllllIllI[2]);
                            int[] iArr37 = new int[lllllIllI[1]];
                            iArr37[lllllIllI[0]] = lllllIllI[189];
                            if (llIlIlIllIlI(Inventory.contains(iArr37) ? 1 : 0) && llIlIlIlllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint8 = new WorldPoint(lllllIllI[194], lllllIllI[159], lllllIllI[2]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[195]];
                                    C0004e.c(worldPoint8);
                                    Time.sleepTicks(lllllIllI[2]);
                                    "".length();
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    String[] strArr61 = new String[lllllIllI[1]];
                                    strArr61[lllllIllI[0]] = llllIllll[lllllIllI[196]];
                                    TileObjects.getNearest(strArr61).interact(llllIllll[lllllIllI[197]]);
                                    Time.sleepTicks(lllllIllI[12]);
                                    "".length();
                                }
                            }
                            if (llIlIlIllIlI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest9 = TileObjects.getNearest(tileObject3 -> {
                                    if (llIlIlIllIlI(tileObject3.getName().contains(llllIllll[lllllIllI[330]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                                        ?? r0 = lllllIllI[1];
                                        "".length();
                                        return (((245 ^ 180) ^ (196 ^ 194)) & (((((157 + 36) - 17) + 36) ^ (((137 + 78) - 71) + 3)) ^ (-" ".length()))) != 0 ? ((113 ^ 94) ^ (150 ^ 152)) & (((((104 + 176) - 270) + 179) ^ (((20 + 78) - 59) + 117)) ^ (-" ".length())) : r0;
                                    }
                                    return lllllIllI[0];
                                });
                                if (llIlIllIIIII(nearest9)) {
                                    nearest9.interact(llllIllll[lllllIllI[198]]);
                                    Time.sleepTicks(lllllIllI[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIlIlIlllII(new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllllIllI[199], lllllIllI[200], lllllIllI[1])) ? 1 : 0)) {
                            nearest = TileObjects.getNearest(tileObject4 -> {
                                if (llIlIlIllIlI(tileObject4.getName().contains(llllIllll[lllllIllI[328]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject4) ? 1 : 0)) {
                                    String[] strArr62 = new String[lllllIllI[1]];
                                    strArr62[lllllIllI[0]] = llllIllll[lllllIllI[329]];
                                    if (llIlIlIllIlI(tileObject4.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = lllllIllI[1];
                                        "".length();
                                        return (-" ".length()) >= 0 ? ((147 ^ 184) ^ (10 ^ 107)) & (((156 ^ 142) ^ (82 ^ 10)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lllllIllI[0];
                            });
                            if (llIlIllIIIII(nearest)) {
                                nearest.interact(llllIllll[lllllIllI[201]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                        }
                        if (llIlIlIllIlI(new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            TileObject nearest10 = TileObjects.getNearest(tileObject5 -> {
                                if (llIlIlIllIlI(tileObject5.getName().contains(llllIllll[lllllIllI[326]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject5) ? 1 : 0)) {
                                    String[] strArr62 = new String[lllllIllI[1]];
                                    strArr62[lllllIllI[0]] = llllIllll[lllllIllI[327]];
                                    if (llIlIlIllIlI(tileObject5.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = lllllIllI[1];
                                        "".length();
                                        return (((63 ^ 114) ^ (18 ^ 83)) & (((249 ^ 196) ^ (165 ^ 148)) ^ (-" ".length()))) != 0 ? ((((82 + 28) - (-61)) + 0) ^ (((77 + 126) - 195) + 176)) & (((75 ^ 45) ^ (250 ^ 143)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lllllIllI[0];
                            });
                            if (llIlIllIIIII(nearest10)) {
                                nearest10.interact(llllIllll[lllllIllI[202]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                        }
                        WorldArea worldArea7 = new WorldArea(lllllIllI[194], lllllIllI[203], lllllIllI[43], lllllIllI[9], lllllIllI[0]);
                        WorldArea worldArea8 = new WorldArea(lllllIllI[204], lllllIllI[205], lllllIllI[13], lllllIllI[23], lllllIllI[0]);
                        WorldArea worldArea9 = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                        if (llIlIlIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr38 = new int[lllllIllI[1]];
                            iArr38[lllllIllI[0]] = lllllIllI[207];
                            if (llIlIlIlllII(Inventory.contains(iArr38) ? 1 : 0)) {
                                int[] iArr39 = new int[lllllIllI[1]];
                                iArr39[lllllIllI[0]] = lllllIllI[207];
                                if (llIlIllIIlIl(TileItems.getNearest(iArr39)) && llIlIlIlllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[208]];
                                    NPC nearest11 = NPCs.getNearest(npc3 -> {
                                        if (llIlIlIllIlI(npc3.getName().contains(llllIllll[lllllIllI[325]]) ? 1 : 0) && llIlIllIIllI(npc3.getInteracting(), Players.getLocal()) && llIlIllIIIlI(npc3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllllIllI[1])) {
                                            ?? r0 = lllllIllI[1];
                                            "".length();
                                            return (40 ^ 44) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllllIllI[0];
                                    });
                                    if (llIlIllIIlIl(Players.getLocal().getInteracting()) && llIlIllIIlIl(nearest11)) {
                                        int[] iArr40 = new int[lllllIllI[1]];
                                        iArr40[lllllIllI[0]] = lllllIllI[209];
                                        NPCs.getNearest(iArr40).interact(llllIllll[lllllIllI[210]]);
                                        Time.sleepTicks(lllllIllI[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr41 = new int[lllllIllI[1]];
                            iArr41[lllllIllI[0]] = lllllIllI[207];
                            if (llIlIllIIIII(TileItems.getNearest(iArr41))) {
                                int[] iArr42 = new int[lllllIllI[1]];
                                iArr42[lllllIllI[0]] = lllllIllI[207];
                                TileItems.getNearest(iArr42).interact(llllIllll[lllllIllI[211]]);
                                Time.sleepTicks(lllllIllI[7]);
                                "".length();
                            }
                            WorldArea worldArea10 = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                            int[] iArr43 = new int[lllllIllI[1]];
                            iArr43[lllllIllI[0]] = lllllIllI[207];
                            if (llIlIlIllIlI(Inventory.contains(iArr43) ? 1 : 0) && llIlIlIlllII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint9 = new WorldPoint(lllllIllI[183], lllllIllI[212], lllllIllI[0]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    AccBuilderGWD.c = llllIllll[lllllIllI[213]];
                                    C0004e.c(worldPoint9);
                                    Time.sleepTicks(lllllIllI[2]);
                                    "".length();
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    String[] strArr62 = new String[lllllIllI[1]];
                                    strArr62[lllllIllI[0]] = llllIllll[lllllIllI[214]];
                                    TileObjects.getNearest(strArr62).interact(llllIllll[lllllIllI[215]]);
                                    Time.sleepTicks(lllllIllI[12]);
                                    "".length();
                                }
                            }
                            if (llIlIlIllIlI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] iArr44 = new int[lllllIllI[1]];
                                iArr44[lllllIllI[0]] = lllllIllI[216];
                                if (llIlIlIlllII(Inventory.contains(iArr44) ? 1 : 0)) {
                                    int[] iArr45 = new int[lllllIllI[1]];
                                    iArr45[lllllIllI[0]] = lllllIllI[216];
                                    if (llIlIllIIlIl(TileItems.getNearest(iArr45))) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[217]];
                                        if (llIlIlIlllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                            int[] iArr46 = new int[lllllIllI[1]];
                                            iArr46[lllllIllI[0]] = lllllIllI[218];
                                            NPCs.getNearest(iArr46).interact(llllIllll[lllllIllI[219]]);
                                            Time.sleepTicks(lllllIllI[11]);
                                            "".length();
                                        }
                                    }
                                }
                                int[] iArr47 = new int[lllllIllI[1]];
                                iArr47[lllllIllI[0]] = lllllIllI[216];
                                if (llIlIllIIIII(TileItems.getNearest(iArr47))) {
                                    if (llIlIlIllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    int[] iArr48 = new int[lllllIllI[1]];
                                    iArr48[lllllIllI[0]] = lllllIllI[216];
                                    TileItems.getNearest(iArr48).interact(llllIllll[lllllIllI[220]]);
                                    Time.sleepTicks(lllllIllI[7]);
                                    "".length();
                                }
                                WorldArea worldArea11 = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                                int[] iArr49 = new int[lllllIllI[1]];
                                iArr49[lllllIllI[0]] = lllllIllI[216];
                                if (llIlIlIllIlI(Inventory.contains(iArr49) ? 1 : 0) && llIlIlIllIlI(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIlllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint10 = new WorldPoint(lllllIllI[221], lllllIllI[222], lllllIllI[0]);
                                    if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[223]];
                                        C0004e.c(worldPoint10);
                                        Time.sleepTicks(lllllIllI[2]);
                                        "".length();
                                    }
                                    if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        String[] strArr63 = new String[lllllIllI[1]];
                                        strArr63[lllllIllI[0]] = llllIllll[lllllIllI[224]];
                                        TileObjects.getNearest(strArr63).interact(llllIllll[lllllIllI[225]]);
                                        Time.sleepTicks(lllllIllI[12]);
                                        "".length();
                                    }
                                }
                            }
                            if (!llIlIlIlllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIllIlI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                String[] strArr64 = new String[lllllIllI[1]];
                                strArr64[lllllIllI[0]] = llllIllll[lllllIllI[226]];
                                NPC nearest12 = NPCs.getNearest(strArr64);
                                if (llIlIllIIIII(nearest12)) {
                                    int[] iArr50 = new int[lllllIllI[1]];
                                    iArr50[lllllIllI[0]] = lllllIllI[227];
                                    if (llIlIlIlllII(Inventory.contains(iArr50) ? 1 : 0) && llIlIllIIlIl(Players.getLocal().getInteracting())) {
                                        if (llIlIlIlllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        nearest12.interact(llllIllll[lllllIllI[228]]);
                                        Time.sleepTicks(lllllIllI[7]);
                                        "".length();
                                    }
                                }
                                int[] iArr51 = new int[lllllIllI[1]];
                                iArr51[lllllIllI[0]] = lllllIllI[227];
                                if (llIlIllIIIII(TileItems.getNearest(iArr51))) {
                                    int[] iArr52 = new int[lllllIllI[1]];
                                    iArr52[lllllIllI[0]] = lllllIllI[227];
                                    TileItems.getNearest(iArr52).interact(llllIllll[lllllIllI[229]]);
                                    Time.sleepTicks(lllllIllI[2]);
                                    "".length();
                                }
                                int[] iArr53 = new int[lllllIllI[1]];
                                iArr53[lllllIllI[0]] = lllllIllI[227];
                                if (llIlIlIllIlI(Inventory.contains(iArr53) ? 1 : 0)) {
                                    WorldPoint worldPoint11 = new WorldPoint(lllllIllI[176], lllllIllI[230], lllllIllI[0]);
                                    if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        AccBuilderGWD.c = llllIllll[lllllIllI[231]];
                                        C0004e.c(worldPoint11);
                                        Time.sleepTicks(lllllIllI[2]);
                                        "".length();
                                    }
                                    if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        String[] strArr65 = new String[lllllIllI[1]];
                                        strArr65[lllllIllI[0]] = llllIllll[lllllIllI[232]];
                                        TileObjects.getNearest(strArr65).interact(llllIllll[lllllIllI[233]]);
                                        Time.sleepTicks(lllllIllI[12]);
                                        "".length();
                                    }
                                }
                            }
                            TileObject nearest13 = TileObjects.getNearest(tileObject6 -> {
                                if (llIlIlIllIlI(tileObject6.getName().contains(llllIllll[lllllIllI[324]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject6) ? 1 : 0)) {
                                    ?? r0 = lllllIllI[1];
                                    "".length();
                                    return (-" ".length()) >= 0 ? ((189 ^ 192) ^ (161 ^ 199)) & (((((206 + 60) - 169) + 124) ^ (((139 + 15) - 135) + 179)) ^ (-" ".length())) : r0;
                                }
                                return lllllIllI[0];
                            });
                            if (llIlIllIIIII(nearest13)) {
                                if (llIlIlIllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                if (llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr66 = new String[lllllIllI[1]];
                                    strArr66[lllllIllI[0]] = llllIllll[lllllIllI[234]];
                                    if (llIlIlIllIlI(nearest13.hasAction(strArr66) ? 1 : 0)) {
                                        nearest13.interact(llllIllll[lllllIllI[235]]);
                                        Time.sleepTicks(lllllIllI[9]);
                                        "".length();
                                    }
                                    String[] strArr67 = new String[lllllIllI[1]];
                                    strArr67[lllllIllI[0]] = llllIllll[lllllIllI[236]];
                                    if (llIlIlIllIlI(nearest13.hasAction(strArr67) ? 1 : 0)) {
                                        nearest13.interact(llllIllll[lllllIllI[237]]);
                                        Time.sleepTicks(lllllIllI[9]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIlIlIllIlI(lg ? 1 : 0) && llIlIlIllIlI(lh ? 1 : 0) && llIlIlIllIlI(lf ? 1 : 0) && llIlIlIlllII(li ? 1 : 0)) {
                        iArr = new int[lllllIllI[1]];
                        iArr[lllllIllI[0]] = lllllIllI[3];
                        if (llIlIlIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr54 = new int[lllllIllI[1]];
                            iArr54[lllllIllI[0]] = lllllIllI[3];
                            Item first13 = Inventory.getFirst(iArr54);
                            int[] iArr55 = new int[lllllIllI[1]];
                            iArr55[lllllIllI[0]] = lllllIllI[5];
                            first13.useOn(Inventory.getFirst(iArr55));
                            Time.sleepTicks(lllllIllI[7]);
                            "".length();
                        }
                    }
                    if (llIlIlIllIlI(li ? 1 : 0)) {
                        String[] strArr68 = new String[lllllIllI[1]];
                        strArr68[lllllIllI[0]] = llllIllll[lllllIllI[238]];
                        if (llIlIlIlllII(Inventory.contains(strArr68) ? 1 : 0)) {
                            cY();
                        }
                        String[] strArr69 = new String[lllllIllI[1]];
                        strArr69[lllllIllI[0]] = llllIllll[lllllIllI[239]];
                        if (llIlIlIllIlI(Inventory.contains(strArr69) ? 1 : 0)) {
                            if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[9])) {
                                AccBuilderGWD.c = llllIllll[lllllIllI[240]];
                                if (llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr70 = new String[lllllIllI[1]];
                                    strArr70[lllllIllI[0]] = llllIllll[lllllIllI[241]];
                                    if (llIlIllIIlIl(NPCs.getNearest(strArr70))) {
                                        Dialog.close();
                                    }
                                }
                                if (llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo(le);
                                    "".length();
                                    Time.sleepTicks(lllllIllI[1]);
                                    "".length();
                                }
                                String[] strArr71 = new String[lllllIllI[7]];
                                strArr71[lllllIllI[0]] = llllIllll[lllllIllI[242]];
                                strArr71[lllllIllI[1]] = llllIllll[lllllIllI[243]];
                                strArr71[lllllIllI[2]] = llllIllll[lllllIllI[244]];
                                C0006g.a(strArr71);
                            }
                            if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[9])) {
                                C0006g.a(llllIllll[lllllIllI[245]], cG);
                            }
                        }
                    }
                }
                if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[8]];
                    if (llIlIlIllIlI(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr56 = new int[lllllIllI[1]];
                        iArr56[lllllIllI[0]] = lllllIllI[35];
                        if (llIlIlIllIlI(Inventory.contains(iArr56) ? 1 : 0)) {
                            int[] iArr57 = new int[lllllIllI[1]];
                            iArr57[lllllIllI[0]] = lllllIllI[35];
                            Inventory.getFirst(iArr57).interact(llllIllll[lllllIllI[56]]);
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                    }
                    Movement.walkTo(lb);
                    "".length();
                    Time.sleepTicks(lllllIllI[1]);
                    "".length();
                }
                if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(lb), lllllIllI[12])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[57]];
                    if (llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(llllIllll[lllllIllI[58]], cG, lllllIllI[1]);
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[59]), lllllIllI[1])) {
                        String[] strArr72 = new String[lllllIllI[2]];
                        strArr72[lllllIllI[0]] = llllIllll[lllllIllI[60]];
                        strArr72[lllllIllI[1]] = llllIllll[lllllIllI[61]];
                        C0006g.a(strArr72);
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[62]), lllllIllI[1])) {
                        String[] strArr73 = new String[lllllIllI[1]];
                        strArr73[lllllIllI[0]] = llllIllll[lllllIllI[63]];
                        C0006g.a(strArr73);
                    }
                    if (!llIlIllIIIll(Vars.getBit(lllllIllI[64]), lllllIllI[1]) || llIlIlIllIlI(Vars.getBit(lllllIllI[62]))) {
                        String[] strArr74 = new String[lllllIllI[1]];
                        strArr74[lllllIllI[0]] = llllIllll[lllllIllI[65]];
                    }
                    String[] strArr75 = new String[lllllIllI[2]];
                    strArr75[lllllIllI[0]] = llllIllll[lllllIllI[15]];
                    strArr75[lllllIllI[1]] = llllIllll[lllllIllI[66]];
                    C0006g.a(strArr75);
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[67]), lllllIllI[1])) {
                        String[] strArr76 = new String[lllllIllI[2]];
                        strArr76[lllllIllI[0]] = llllIllll[lllllIllI[68]];
                        strArr76[lllllIllI[1]] = llllIllll[lllllIllI[69]];
                        C0006g.a(strArr76);
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[54]), lllllIllI[1])) {
                        String[] strArr77 = new String[lllllIllI[2]];
                        strArr77[lllllIllI[0]] = llllIllll[lllllIllI[70]];
                        strArr77[lllllIllI[1]] = llllIllll[lllllIllI[71]];
                        C0006g.a(strArr77);
                    }
                }
                if (llIlIlIlllII(Vars.getBit(lllllIllI[54]))) {
                    strArr10 = new String[lllllIllI[1]];
                    strArr10[lllllIllI[0]] = llllIllll[lllllIllI[74]];
                    if (llIlIlIllIlI(Inventory.contains(strArr10) ? 1 : 0)) {
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[73]), lllllIllI[1])) {
                        strArr8 = new String[lllllIllI[1]];
                        strArr8[lllllIllI[0]] = llllIllll[lllllIllI[82]];
                        if (llIlIlIlllII(Inventory.contains(strArr8) ? 1 : 0)) {
                            cZ();
                        }
                        strArr9 = new String[lllllIllI[1]];
                        strArr9[lllllIllI[0]] = llllIllll[lllllIllI[84]];
                        if (llIlIlIllIlI(Inventory.contains(strArr9) ? 1 : 0)) {
                        }
                    }
                    if (llIlIllIIIll(Vars.getBit(lllllIllI[81]), lllllIllI[1])) {
                        strArr2 = new String[lllllIllI[1]];
                        strArr2[lllllIllI[0]] = llllIllll[lllllIllI[119]];
                        if (llIlIlIllIlI(Inventory.contains(strArr2) ? 1 : 0)) {
                        }
                        strArr3 = new String[lllllIllI[1]];
                        strArr3[lllllIllI[0]] = llllIllll[lllllIllI[122]];
                        if (llIlIlIllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                        }
                        strArr4 = new String[lllllIllI[1]];
                        strArr4[lllllIllI[0]] = llllIllll[lllllIllI[125]];
                        if (llIlIlIllIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                        }
                        strArr5 = new String[lllllIllI[1]];
                        strArr5[lllllIllI[0]] = llllIllll[lllllIllI[128]];
                        if (llIlIlIllIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                        }
                        String[] strArr542 = new String[lllllIllI[1]];
                        strArr542[lllllIllI[0]] = llllIllll[lllllIllI[25]];
                        nearest3 = TileObjects.getNearest(strArr542);
                        if (llIlIllIIIII(nearest3)) {
                            if (llIlIlIlllII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            }
                            if (llIlIlIllIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                strArr6 = new String[lllllIllI[1]];
                                strArr6[lllllIllI[0]] = llllIllll[lllllIllI[133]];
                                if (llIlIlIllIlI(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                }
                                strArr7 = new String[lllllIllI[1]];
                                strArr7[lllllIllI[0]] = llllIllll[lllllIllI[135]];
                                if (llIlIlIllIlI(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                }
                            }
                        }
                    }
                    if (llIlIlIllIlI(lf ? 1 : 0)) {
                        if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIllI[85], lllllIllI[86], lllllIllI[0])), lllllIllI[23])) {
                        }
                        worldPoint4 = new WorldPoint(lllllIllI[138], lllllIllI[139], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                        if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                    }
                    if (llIlIlIllIlI(lf ? 1 : 0)) {
                        strArr = new String[lllllIllI[1]];
                        strArr[lllllIllI[0]] = llllIllll[lllllIllI[146]];
                        if (llIlIlIllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                        }
                        WorldArea worldArea42 = new WorldArea(lllllIllI[149], lllllIllI[150], lllllIllI[51], lllllIllI[10], lllllIllI[0]);
                        worldArea = new WorldArea(lllllIllI[151], lllllIllI[152], lllllIllI[58], lllllIllI[58], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                            worldPoint3 = new WorldPoint(lllllIllI[153], lllllIllI[154], lllllIllI[0]);
                            if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllllIllI[2])) {
                            }
                            if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllllIllI[2])) {
                            }
                        }
                        worldArea2 = new WorldArea(lllllIllI[158], lllllIllI[159], lllllIllI[11], lllllIllI[16], lllllIllI[0]);
                        WorldArea worldArea52 = new WorldArea(lllllIllI[160], lllllIllI[161], lllllIllI[13], lllllIllI[7], lllllIllI[0]);
                        if (llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                            iArr5 = new int[lllllIllI[1]];
                            iArr5[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIlIlllII(Inventory.contains(iArr5) ? 1 : 0)) {
                            }
                            iArr6 = new int[lllllIllI[1]];
                            iArr6[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIllIIIII(TileItems.getNearest(iArr6))) {
                            }
                            iArr7 = new int[lllllIllI[1]];
                            iArr7[lllllIllI[0]] = lllllIllI[162];
                            if (llIlIlIllIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(lllllIllI[169], lllllIllI[170], lllllIllI[0]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                            }
                            if (llIlIlIlllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                            nearest2 = TileObjects.getNearest(tileObject7 -> {
                                if (llIlIlIllIlI(tileObject7.getName().contains(llllIllll[lllllIllI[334]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject7) ? 1 : 0)) {
                                    ?? r0 = lllllIllI[1];
                                    "".length();
                                    return ((((54 + 35) - (-75)) + 7) ^ (((24 + 54) - (-8)) + 89)) <= "  ".length() ? ((246 ^ 179) ^ (162 ^ 189)) & (((3 ^ 58) ^ (14 ^ 109)) ^ (-" ".length())) : r0;
                                }
                                return lllllIllI[0];
                            });
                            AccBuilderGWD.c = llllIllll[lllllIllI[174]];
                            if (llIlIllIIIII(nearest2)) {
                            }
                        }
                        if (llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                            iArr2 = new int[lllllIllI[1]];
                            iArr2[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIlIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                            }
                            iArr3 = new int[lllllIllI[1]];
                            iArr3[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIllIIIII(TileItems.getNearest(iArr3))) {
                            }
                            worldArea3 = new WorldArea(lllllIllI[183], lllllIllI[184], lllllIllI[12], lllllIllI[11], lllllIllI[1]);
                            iArr4 = new int[lllllIllI[1]];
                            iArr4[lllllIllI[0]] = lllllIllI[178];
                            if (llIlIlIllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                                worldPoint = new WorldPoint(lllllIllI[163], lllllIllI[170], lllllIllI[1]);
                                if (llIlIlIlllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                                if (llIlIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                            }
                            if (llIlIlIllIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                        }
                        if (llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[2])) {
                        }
                        if (llIlIlIlllII(new WorldArea(lllllIllI[176], lllllIllI[177], lllllIllI[11], lllllIllI[13], lllllIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        nearest = TileObjects.getNearest(tileObject42 -> {
                            if (llIlIlIllIlI(tileObject42.getName().contains(llllIllll[lllllIllI[328]]) ? 1 : 0) && llIlIlIllIlI(Reachable.isInteractable(tileObject42) ? 1 : 0)) {
                                String[] strArr622 = new String[lllllIllI[1]];
                                strArr622[lllllIllI[0]] = llllIllll[lllllIllI[329]];
                                if (llIlIlIllIlI(tileObject42.hasAction(strArr622) ? 1 : 0)) {
                                    ?? r0 = lllllIllI[1];
                                    "".length();
                                    return (-" ".length()) >= 0 ? ((147 ^ 184) ^ (10 ^ 107)) & (((156 ^ 142) ^ (82 ^ 10)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lllllIllI[0];
                        });
                        if (llIlIllIIIII(nearest)) {
                        }
                        if (llIlIlIllIlI(new WorldArea(lllllIllI[163], lllllIllI[164], lllllIllI[26], lllllIllI[12], lllllIllI[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        WorldArea worldArea72 = new WorldArea(lllllIllI[194], lllllIllI[203], lllllIllI[43], lllllIllI[9], lllllIllI[0]);
                        WorldArea worldArea82 = new WorldArea(lllllIllI[204], lllllIllI[205], lllllIllI[13], lllllIllI[23], lllllIllI[0]);
                        WorldArea worldArea92 = new WorldArea(lllllIllI[169], lllllIllI[206], lllllIllI[11], lllllIllI[17], lllllIllI[0]);
                        if (llIlIlIllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                    }
                    if (llIlIlIllIlI(lg ? 1 : 0)) {
                        iArr = new int[lllllIllI[1]];
                        iArr[lllllIllI[0]] = lllllIllI[3];
                        if (llIlIlIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                        }
                    }
                    if (llIlIlIllIlI(li ? 1 : 0)) {
                    }
                }
                strArr10 = new String[lllllIllI[1]];
                strArr10[lllllIllI[0]] = llllIllll[lllllIllI[74]];
                if (llIlIlIllIlI(Inventory.contains(strArr10) ? 1 : 0)) {
                }
                if (llIlIllIIIll(Vars.getBit(lllllIllI[73]), lllllIllI[1])) {
                }
                if (llIlIllIIIll(Vars.getBit(lllllIllI[81]), lllllIllI[1])) {
                }
                if (llIlIlIllIlI(lf ? 1 : 0)) {
                }
                if (llIlIlIllIlI(lf ? 1 : 0)) {
                }
                if (llIlIlIllIlI(lg ? 1 : 0)) {
                }
                if (llIlIlIllIlI(li ? 1 : 0)) {
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[7])) {
                dk = lllllIllI[0];
                String[] strArr78 = new String[lllllIllI[1]];
                strArr78[lllllIllI[0]] = llllIllll[lllllIllI[246]];
                NPC nearest14 = NPCs.getNearest(strArr78);
                if (llIlIllIIlIl(nearest14) && llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[247]];
                    String[] strArr79 = new String[lllllIllI[1]];
                    strArr79[lllllIllI[0]] = llllIllll[lllllIllI[248]];
                    TileObjects.getNearest(strArr79).interact(llllIllll[lllllIllI[249]]);
                    Time.sleepTicks(lllllIllI[16]);
                    "".length();
                }
                if (llIlIllIIlIl(nearest14) && llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[250]];
                    String[] strArr80 = new String[lllllIllI[1]];
                    strArr80[lllllIllI[0]] = llllIllll[lllllIllI[251]];
                    TileObjects.getNearest(strArr80).interact(llllIllll[lllllIllI[252]]);
                    Time.sleepTicks(lllllIllI[7]);
                    "".length();
                }
                if (llIlIllIIIII(nearest14) && llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                    String[] strArr81 = new String[lllllIllI[1]];
                    strArr81[lllllIllI[0]] = llllIllll[lllllIllI[253]];
                    TileObjects.getNearest(strArr81).interact(llllIllll[lllllIllI[254]]);
                    Time.sleepTicks(lllllIllI[11]);
                    "".length();
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[12])) {
                AccBuilderGWD.c = llllIllll[lllllIllI[255]];
                String[] strArr82 = new String[lllllIllI[1]];
                strArr82[lllllIllI[0]] = llllIllll[lllllIllI[256]];
                NPC nearest15 = NPCs.getNearest(strArr82);
                if (llIlIllIIlIl(nearest15)) {
                    Equipment.getFirst(item7 -> {
                        return item7.getName().contains(llllIllll[lllllIllI[323]]);
                    }).interact(llllIllll[lllllIllI[257]]);
                    Time.sleepTicks(lllllIllI[23]);
                    "".length();
                    Movement.walkTo(new WorldPoint(lllllIllI[258], lllllIllI[259], lllllIllI[0]));
                    "".length();
                }
                if (llIlIllIIIII(nearest15)) {
                    C0006g.a(llllIllll[lllllIllI[14]], cG, lllllIllI[1]);
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[13])) {
                if (llIlIlIlllII(Inventory.contains(item8 -> {
                    return item8.getName().contains(llllIllll[lllllIllI[322]]);
                }) ? 1 : 0)) {
                    cX();
                }
                if (llIlIlIllIlI(Inventory.contains(item9 -> {
                    return item9.getName().contains(llllIllll[lllllIllI[321]]);
                }) ? 1 : 0)) {
                    String[] strArr83 = new String[lllllIllI[1]];
                    strArr83[lllllIllI[0]] = llllIllll[lllllIllI[72]];
                    if (llIlIllIIlIl(NPCs.getNearest(strArr83)) && llIlIlIlllII(Players.getLocal().getWorldLocation().getPlane()) && llIlIlIlllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[2])) {
                            AccBuilderGWD.c = llllIllll[lllllIllI[260]];
                            if (llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr84 = new String[lllllIllI[1]];
                                strArr84[lllllIllI[0]] = llllIllll[lllllIllI[261]];
                                if (llIlIllIIlIl(NPCs.getNearest(strArr84))) {
                                    Dialog.close();
                                }
                            }
                            if (llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(le);
                                "".length();
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                            String[] strArr85 = new String[lllllIllI[7]];
                            strArr85[lllllIllI[0]] = llllIllll[lllllIllI[262]];
                            strArr85[lllllIllI[1]] = llllIllll[lllllIllI[263]];
                            strArr85[lllllIllI[2]] = llllIllll[lllllIllI[264]];
                            C0006g.a(strArr85);
                        }
                        if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(le), lllllIllI[2]) && llIlIlIlllII(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr86 = new String[lllllIllI[1]];
                            strArr86[lllllIllI[0]] = llllIllll[lllllIllI[265]];
                            TileObjects.getNearest(strArr86).interact(llllIllll[lllllIllI[266]]);
                            Time.sleepTicks(lllllIllI[13]);
                            "".length();
                        }
                    }
                    String[] strArr87 = new String[lllllIllI[1]];
                    strArr87[lllllIllI[0]] = llllIllll[lllllIllI[267]];
                    if (llIlIllIIIII(NPCs.getNearest(strArr87)) && llIlIllIIIll(Players.getLocal().getWorldLocation().getPlane(), lllllIllI[1])) {
                        C0006g.a(llllIllll[lllllIllI[268]], cG);
                    }
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[16])) {
                WorldArea worldArea12 = new WorldArea(lllllIllI[269], lllllIllI[270], lllllIllI[89], lllllIllI[79], lllllIllI[0]);
                if (llIlIlIlllII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint12 = new WorldPoint(lllllIllI[271], lllllIllI[259], lllllIllI[0]);
                    if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lllllIllI[7])) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[272]];
                        Movement.walkTo(worldPoint12);
                        "".length();
                        Time.sleepTicks(lllllIllI[1]);
                        "".length();
                    }
                    if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lllllIllI[7])) {
                        String[] strArr88 = new String[lllllIllI[1]];
                        strArr88[lllllIllI[0]] = llllIllll[lllllIllI[273]];
                        TileObjects.getNearest(strArr88).interact(llllIllll[lllllIllI[274]]);
                        Time.sleepTicks(lllllIllI[9]);
                        "".length();
                    }
                }
                if (llIlIlIllIlI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr89 = new String[lllllIllI[1]];
                    strArr89[lllllIllI[0]] = llllIllll[lllllIllI[275]];
                    NPC nearest16 = NPCs.getNearest(strArr89);
                    WorldPoint worldPoint13 = new WorldPoint(lllllIllI[276], lllllIllI[152], lllllIllI[0]);
                    if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lllllIllI[7]) && llIlIllIIlIl(nearest16)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[277]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(lllllIllI[1]);
                        "".length();
                    }
                    if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lllllIllI[7]) && llIlIllIIIII(nearest16) && llIlIlIlllII(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[278]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(lllllIllI[1]);
                        "".length();
                    }
                    if (llIlIllIIIII(nearest16) && llIlIlIlllII(Reachable.isInteractable(nearest16) ? 1 : 0) && llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lllllIllI[7]) && llIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                        if (llIlIllIIIIl(Combat.getMissingHealth(), lllllIllI[9])) {
                            String[] strArr90 = new String[lllllIllI[1]];
                            strArr90[lllllIllI[0]] = llllIllll[lllllIllI[279]];
                            if (llIlIlIllIlI(Inventory.contains(strArr90) ? 1 : 0)) {
                                String[] strArr91 = new String[lllllIllI[1]];
                                strArr91[lllllIllI[0]] = llllIllll[lllllIllI[280]];
                                Inventory.getFirst(strArr91).interact(llllIllll[lllllIllI[281]]);
                                Time.sleepTicks(lllllIllI[1]);
                                "".length();
                            }
                        }
                        String[] strArr92 = new String[lllllIllI[1]];
                        strArr92[lllllIllI[0]] = llllIllll[lllllIllI[282]];
                        TileObjects.getNearest(strArr92).interact(llllIllll[lllllIllI[283]]);
                    }
                    if (llIlIllIIIII(nearest16) && llIlIlIllIlI(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIllll[lllllIllI[284]];
                        if (llIlIlIlllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        if (llIlIlIlllII(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                        }
                        if (llIlIlIlllII(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] strArr93 = new String[lllllIllI[1]];
                        strArr93[lllllIllI[0]] = llllIllll[lllllIllI[285]];
                        if (llIlIlIllIlI(Inventory.contains(strArr93) ? 1 : 0)) {
                            String[] strArr94 = new String[lllllIllI[1]];
                            strArr94[lllllIllI[0]] = llllIllll[lllllIllI[286]];
                            Inventory.getFirst(strArr94).interact(llllIllll[lllllIllI[287]]);
                        }
                        if (llIlIlIllIlI(Inventory.isFull() ? 1 : 0)) {
                            String[] strArr95 = new String[lllllIllI[1]];
                            strArr95[lllllIllI[0]] = llllIllll[lllllIllI[288]];
                            Inventory.getFirst(strArr95).interact(llllIllll[lllllIllI[289]]);
                        }
                        if (llIlIllIIIll(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && llIlIlIllIlI(Inventory.contains(item10 -> {
                            return item10.getName().contains(llllIllll[lllllIllI[320]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item11 -> {
                                return item11.getName().contains(llllIllll[lllllIllI[319]]);
                            }).interact(llllIllll[lllllIllI[290]]);
                        }
                        if (llIlIlIllIll(Vars.getBit(lllllIllI[291]), lllllIllI[1]) && llIlIlIllIlI(Inventory.contains(item12 -> {
                            return item12.getName().contains(llllIllll[lllllIllI[318]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item13 -> {
                                return item13.getName().contains(llllIllll[lllllIllI[317]]);
                            }).interact(llllIllll[lllllIllI[292]]);
                        }
                        if (llIlIllIIlIl(Players.getLocal().getInteracting())) {
                            nearest16.interact(llllIllll[lllllIllI[293]]);
                            Time.sleepTicks(lllllIllI[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[17])) {
                Prayers.disableAll();
                WorldPoint worldPoint14 = new WorldPoint(lllllIllI[48], lllllIllI[49], lllllIllI[0]);
                if (llIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lllllIllI[16]) && llIlIllIIIll(Players.getLocal().getAnimation(), lllllIllI[294])) {
                    AccBuilderGWD.c = llllIllll[lllllIllI[295]];
                    Movement.walkTo(worldPoint14);
                    "".length();
                    Time.sleepTicks(lllllIllI[1]);
                    "".length();
                }
                if (llIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lllllIllI[16])) {
                    if (llIlIlIllIll(dk, lllllIllI[1])) {
                        as.pX += lllllIllI[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllllIllI[1];
                        as.pX = lllllIllI[0];
                        dl = lllllIllI[0];
                    }
                    C0006g.a(llllIllll[lllllIllI[296]], cG, lllllIllI[1]);
                }
            }
            int[] iArr58 = new int[lllllIllI[1]];
            iArr58[lllllIllI[0]] = lllllIllI[36];
            if (llIlIlIllIlI(Inventory.contains(iArr58) ? 1 : 0)) {
                int[] iArr59 = new int[lllllIllI[1]];
                iArr59[lllllIllI[0]] = lllllIllI[36];
                if (llIlIlIlllII(Equipment.contains(iArr59) ? 1 : 0) && llIlIlIllllI(C0004e.j(lllllIllI[14]))) {
                    int[] iArr60 = new int[lllllIllI[1]];
                    iArr60[lllllIllI[0]] = lllllIllI[36];
                    Inventory.getFirst(iArr60).interact(llllIllll[lllllIllI[297]]);
                }
            }
            String[] strArr96 = new String[lllllIllI[1]];
            strArr96[lllllIllI[0]] = llllIllll[lllllIllI[298]];
            if (llIlIlIllIlI(Inventory.contains(strArr96) ? 1 : 0)) {
                li = lllllIllI[1];
                lh = lllllIllI[1];
                lf = lllllIllI[1];
                lg = lllllIllI[1];
            }
            int[] iArr61 = new int[lllllIllI[1]];
            iArr61[lllllIllI[0]] = lllllIllI[3];
            if (llIlIlIllIlI(Inventory.contains(iArr61) ? 1 : 0)) {
                lh = lllllIllI[1];
            }
            int[] iArr62 = new int[lllllIllI[1]];
            iArr62[lllllIllI[0]] = lllllIllI[4];
            if (llIlIlIllIlI(Inventory.contains(iArr62) ? 1 : 0)) {
                lf = lllllIllI[1];
            }
            int[] iArr63 = new int[lllllIllI[1]];
            iArr63[lllllIllI[0]] = lllllIllI[5];
            if (llIlIlIllIlI(Inventory.contains(iArr63) ? 1 : 0)) {
                lg = lllllIllI[1];
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[23])) {
                String[] strArr97 = new String[lllllIllI[1]];
                strArr97[lllllIllI[0]] = llllIllll[lllllIllI[299]];
                if (llIlIllIIIII(NPCs.getNearest(strArr97))) {
                    int[] iArr64 = new int[lllllIllI[1]];
                    iArr64[lllllIllI[0]] = lllllIllI[19];
                    if (llIlIlIllIlI(Inventory.contains(iArr64) ? 1 : 0)) {
                        int[] iArr65 = new int[lllllIllI[1]];
                        iArr65[lllllIllI[0]] = lllllIllI[19];
                        Inventory.getFirst(iArr65).interact(llllIllll[lllllIllI[300]]);
                        Time.sleepTicks(lllllIllI[12]);
                        "".length();
                    }
                }
            }
            if (llIlIllIIIll(C0004e.j(lllllIllI[14]), lllllIllI[23]) && llIlIlIllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + C0004e.j(lllllIllI[14]));
        }
        C0006g.a(new String[lllllIllI[0]]);
    }

    private static void cX() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIllIIIII(nearest) && llIlIlIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[301]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lllllIllI[2]);
            "".length();
        }
        if (llIlIllIIIII(nearest) && llIlIlIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[302]];
            if (llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllllIllI[18]);
                "".length();
            }
            if (llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllllIllI[9]);
                    "".length();
                }
                C0000a.a(lllllIllI[19], lllllIllI[11]);
                C0000a.b(C0005f.bc, lllllIllI[2]);
                C0000a.a(lllllIllI[45], lllllIllI[9]);
                C0000a.a(lllllIllI[41], lllllIllI[1]);
                C0000a.a(lllllIllI[39], lllllIllI[1]);
                C0000a.a(lllllIllI[46], lllllIllI[47]);
                int[] iArr = new int[lllllIllI[1]];
                iArr[lllllIllI[0]] = lllllIllI[36];
                if (llIlIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIllI[1]];
                    iArr2[lllllIllI[0]] = lllllIllI[36];
                    if (llIlIlIlllII(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lllllIllI[36], lllllIllI[1], Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw(lllllIllI[35], Inventory.getFreeSlots() - lllllIllI[1], Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean llIlIlIlllIl(int i) {
        return i < 0;
    }

    private static boolean llIlIllIIIII(Object obj) {
        return obj != null;
    }

    private static int llIlIlIllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIlIllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIlIlIllIII() {
        lllllIllI = new int[366];
        lllllIllI[0] = (6 ^ 20) & ((176 ^ 162) ^ (-1));
        lllllIllI[1] = " ".length();
        lllllIllI[2] = "  ".length();
        lllllIllI[3] = (-1) & 1535;
        lllllIllI[4] = (-4503) & 6039;
        lllllIllI[5] = (-((-10114) & 28655)) & (-145) & 20221;
        lllllIllI[6] = (((115 + 70) - 87) + 90) ^ (((40 + 13) - (-32)) + 57);
        lllllIllI[7] = "   ".length();
        lllllIllI[8] = (((108 + 13) - 57) + 104) ^ (((153 + 59) - 147) + 111);
        lllllIllI[9] = (65 ^ 0) ^ (33 ^ 100);
        lllllIllI[10] = 151 ^ 131;
        lllllIllI[11] = 178 ^ 183;
        lllllIllI[12] = 73 ^ 79;
        lllllIllI[13] = 48 ^ 55;
        lllllIllI[14] = (((99 ^ 4) + (((52 + 129) - 37) + 26)) - (((130 + 22) - 62) + 47)) + (78 ^ 102);
        lllllIllI[15] = 163 ^ 131;
        lllllIllI[16] = 100 ^ 108;
        lllllIllI[17] = (103 ^ 51) ^ (104 ^ 53);
        lllllIllI[18] = (-((-405) & 9692)) & (-18449) & 32735;
        lllllIllI[19] = (-17) & 8023;
        lllllIllI[20] = 145 ^ 158;
        lllllIllI[21] = (-((-281) & 8639)) & (-16401) & 32767;
        lllllIllI[22] = (-8369) & 16376;
        lllllIllI[23] = 160 ^ 170;
        lllllIllI[24] = (-((-3601) & 28537)) & (-2193) & 28667;
        lllllIllI[25] = 115 ^ 41;
        lllllIllI[26] = 150 ^ 157;
        lllllIllI[27] = (-8215) & 9174;
        lllllIllI[28] = 63 ^ 51;
        lllllIllI[29] = (20 ^ 76) ^ (109 ^ 36);
        lllllIllI[30] = (-16385) & 18175;
        lllllIllI[31] = (-((-21835) & 32207)) & (-16393) & 28671;
        lllllIllI[32] = (-30723) & 31023;
        lllllIllI[33] = (-5130) & 6079;
        lllllIllI[34] = (-((-23) & 13463)) & (-533) & 16319;
        lllllIllI[35] = (-(154 ^ 143)) & (-8739) & 9143;
        lllllIllI[36] = (-6604) & 8143;
        lllllIllI[37] = (-16555) & 29179;
        lllllIllI[38] = (9 ^ 84) ^ (55 ^ 103);
        lllllIllI[39] = (-28675) & 31126;
        lllllIllI[40] = (((70 + 163) - 56) + 6) ^ (((62 + 97) - 130) + 156);
        lllllIllI[41] = (-((-11545) & 28537)) & (-3073) & 32759;
        lllllIllI[42] = (-((-2009) & 22526)) & (-257) & 32751;
        lllllIllI[43] = 191 ^ 175;
        lllllIllI[44] = (-((-18725) & 23023)) & (-18945) & 24575;
        lllllIllI[45] = (-8809) & 11242;
        lllllIllI[46] = (-25609) & 26603;
        lllllIllI[47] = (-296) & 15295;
        lllllIllI[48] = (-((-17265) & 18291)) & (-4097) & 8191;
        lllllIllI[49] = (-((-2081) & 27235)) & (-1) & 28671;
        lllllIllI[50] = 134 ^ 148;
        lllllIllI[51] = (((101 + 15) - 38) + 130) ^ (((192 + 158) - 250) + 95);
        lllllIllI[52] = 21 ^ 0;
        lllllIllI[53] = (((15 + 54) - (-34)) + 50) ^ (((56 + 19) - (-40)) + 28);
        lllllIllI[54] = (-((-14997) & 31453)) & (-4376) & 24575;
        lllllIllI[55] = (((100 + 160) - 192) + 123) ^ (((76 + 70) - 113) + 135);
        lllllIllI[56] = 100 ^ 125;
        lllllIllI[57] = 133 ^ 159;
        lllllIllI[58] = 51 ^ 40;
        lllllIllI[59] = (-265) & 4009;
        lllllIllI[60] = 0 ^ 28;
        lllllIllI[61] = (162 ^ 155) ^ (58 ^ 30);
        lllllIllI[62] = (-((-5137) & 21789)) & (-4113) & 24510;
        lllllIllI[63] = (244 ^ 170) ^ (43 ^ 107);
        lllllIllI[64] = (-24833) & 28574;
        lllllIllI[65] = 108 ^ 115;
        lllllIllI[66] = 108 ^ 77;
        lllllIllI[67] = (-((-18481) & 18801)) & (-20513) & 24575;
        lllllIllI[68] = ((85 ^ 20) & ((107 ^ 42) ^ (-1))) ^ (160 ^ 130);
        lllllIllI[69] = (63 ^ 58) ^ (57 ^ 31);
        lllllIllI[70] = 8 ^ 44;
        lllllIllI[71] = 226 ^ 199;
        lllllIllI[72] = ((102 + 62) - (-8)) + 5;
        lllllIllI[73] = (-((-553) & 31277)) & (-1) & 32556;
        lllllIllI[74] = 88 ^ 126;
        lllllIllI[75] = (-((-7514) & 15739)) & (-1033) & 12271;
        lllllIllI[76] = (-4177) & 7677;
        lllllIllI[77] = (164 ^ 193) ^ (61 ^ 127);
        lllllIllI[78] = 55 ^ 31;
        lllllIllI[79] = 89 ^ 112;
        lllllIllI[80] = (((123 + 46) - 37) + 3) ^ (((103 + 161) - 189) + 98);
        lllllIllI[81] = (-282) & 4031;
        lllllIllI[82] = 38 ^ 13;
        lllllIllI[83] = (-((-2081) & 14459)) & (-1) & 16127;
        lllllIllI[84] = 21 ^ 57;
        lllllIllI[85] = (-((-4841) & 14077)) & (-3) & 12287;
        lllllIllI[86] = (-6410) & 16249;
        lllllIllI[87] = 190 ^ 147;
        lllllIllI[88] = 62 ^ 16;
        lllllIllI[89] = (215 ^ 195) ^ (28 ^ 39);
        lllllIllI[90] = (123 ^ 21) ^ (253 ^ 163);
        lllllIllI[91] = (((51 + 142) - 92) + 62) ^ (((130 + 25) - 103) + 94);
        lllllIllI[92] = 2 ^ 49;
        lllllIllI[93] = (((99 + 171) - 189) + 101) ^ (((21 + 75) - 75) + 109);
        lllllIllI[94] = (104 ^ 26) ^ (70 ^ 1);
        lllllIllI[95] = (((83 + 56) - 68) + 69) ^ (((37 + 19) - 41) + 171);
        lllllIllI[96] = (34 ^ 19) ^ (134 ^ 128);
        lllllIllI[97] = 51 ^ 11;
        lllllIllI[98] = (((25 + 9) - (-57)) + 52) ^ (((159 + 131) - 204) + 96);
        lllllIllI[99] = 42 ^ 16;
        lllllIllI[100] = 17 ^ 42;
        lllllIllI[101] = (166 ^ 130) ^ (145 ^ 137);
        lllllIllI[102] = 181 ^ 136;
        lllllIllI[103] = 62 ^ 0;
        lllllIllI[104] = (((121 + 93) - 101) + 46) ^ (((78 + 39) - 10) + 53);
        lllllIllI[105] = (244 ^ 174) ^ (128 ^ 154);
        lllllIllI[106] = 34 ^ 99;
        lllllIllI[107] = (142 ^ 139) ^ (103 ^ 32);
        lllllIllI[108] = 102 ^ 37;
        lllllIllI[109] = (((124 + 91) - 128) + 112) ^ (((62 + 81) - 107) + 95);
        lllllIllI[110] = (((144 + 11) - 5) + 43) ^ (((61 + 67) - 101) + 105);
        lllllIllI[111] = 99 ^ 37;
        lllllIllI[112] = (((111 + 160) - 258) + 228) ^ (((71 + 132) - 118) + 97);
        lllllIllI[113] = 86 ^ 30;
        lllllIllI[114] = 36 ^ 109;
        lllllIllI[115] = 20 ^ 94;
        lllllIllI[116] = 44 ^ 103;
        lllllIllI[117] = 248 ^ 180;
        lllllIllI[118] = 212 ^ 153;
        lllllIllI[119] = 75 ^ 5;
        lllllIllI[120] = (30 ^ 120) ^ (97 ^ 72);
        lllllIllI[121] = "   ".length() ^ (212 ^ 135);
        lllllIllI[122] = 3 ^ 82;
        lllllIllI[123] = (((176 + 19) - 27) + 28) ^ (((79 + 107) - 160) + 124);
        lllllIllI[124] = (115 ^ 45) ^ (49 ^ 60);
        lllllIllI[125] = (((67 + 90) - (-26)) + 48) ^ (((78 + 114) - 128) + 115);
        lllllIllI[126] = (137 ^ 190) ^ (163 ^ 193);
        lllllIllI[127] = 237 ^ 187;
        lllllIllI[128] = (((138 + 194) - 213) + 86) ^ (((27 + 43) - (-39)) + 45);
        lllllIllI[129] = 15 ^ 87;
        lllllIllI[130] = (173 ^ 163) ^ (222 ^ 137);
        lllllIllI[131] = 85 ^ 14;
        lllllIllI[132] = 39 ^ 123;
        lllllIllI[133] = (179 ^ 189) ^ (20 ^ 71);
        lllllIllI[134] = (((20 + 83) - (-53)) + 76) ^ (((101 + 43) - 4) + 42);
        lllllIllI[135] = 232 ^ 183;
        lllllIllI[136] = (2 ^ 116) ^ (28 ^ 10);
        lllllIllI[137] = 160 ^ 193;
        lllllIllI[138] = (-(67 ^ 89)) & (-29699) & 32735;
        lllllIllI[139] = (-24971) & 28159;
        lllllIllI[140] = 45 ^ 79;
        lllllIllI[141] = 26 ^ 121;
        lllllIllI[142] = 228 ^ 128;
        lllllIllI[143] = (((7 + 90) - (-131)) + 26) ^ (((95 + 24) - 73) + 109);
        lllllIllI[144] = 217 ^ 191;
        lllllIllI[145] = (((31 + 91) - (-41)) + 58) ^ (((108 + 95) - 61) + 44);
        lllllIllI[146] = 125 ^ 21;
        lllllIllI[147] = (2 ^ 119) ^ (39 ^ 59);
        lllllIllI[148] = 213 ^ 191;
        lllllIllI[149] = (-5253) & 8174;
        lllllIllI[150] = (-29449) & 32686;
        lllllIllI[151] = (-((-2889) & 24409)) & (-8204) & 32639;
        lllllIllI[152] = (-((-30083) & 30606)) & (-22545) & 32703;
        lllllIllI[153] = (-21507) & 24447;
        lllllIllI[154] = (-4929) & 8176;
        lllllIllI[155] = (131 ^ 152) ^ (216 ^ 168);
        lllllIllI[156] = 64 ^ 44;
        lllllIllI[157] = 36 ^ 73;
        lllllIllI[158] = (-12433) & 15353;
        lllllIllI[159] = (-((-10263) & 14935)) & (-16645) & 24566;
        lllllIllI[160] = (-9221) & 12143;
        lllllIllI[161] = (-28737) & 31991;
        lllllIllI[162] = (-((-7303) & 24063)) & (-8321) & 26623;
        lllllIllI[163] = (-21645) & 24574;
        lllllIllI[164] = (-273) & 3509;
        lllllIllI[165] = (178 ^ 193) ^ (174 ^ 179);
        lllllIllI[166] = (-((-12037) & 16231)) & (-25) & 8187;
        lllllIllI[167] = 74 ^ 37;
        lllllIllI[168] = (241 ^ 129) ^ ((96 ^ 127) & ((32 ^ 63) ^ (-1)));
        lllllIllI[169] = (-((-1037) & 9246)) & (-16513) & 27647;
        lllllIllI[170] = (-17155) & 20407;
        lllllIllI[171] = 220 ^ 173;
        lllllIllI[172] = (29 ^ 5) ^ (226 ^ 136);
        lllllIllI[173] = (247 ^ 197) ^ (13 ^ 76);
        lllllIllI[174] = 43 ^ 95;
        lllllIllI[175] = (((62 + 85) - 1) + 76) ^ (((38 + 94) - 111) + 150);
        lllllIllI[176] = (-((-2393) & 15711)) & (-16514) & 32767;
        lllllIllI[177] = (-((-5541) & 14333)) & (-4354) & 16381;
        lllllIllI[178] = (-((-22027) & 30591)) & (-16515) & 26622;
        lllllIllI[179] = 34 ^ 84;
        lllllIllI[180] = (-((-1319) & 5503)) & (-33) & 8191;
        lllllIllI[181] = 19 ^ 100;
        lllllIllI[182] = (((117 + 243) - 208) + 93) ^ (((94 + 56) - 102) + 93);
        lllllIllI[183] = (-4101) & 7031;
        lllllIllI[184] = (-((-19639) & 32255)) & (-16385) & 32252;
        lllllIllI[185] = (((112 + 162) - 84) + 63) ^ (((76 + 4) - (-13)) + 39);
        lllllIllI[186] = 44 ^ 86;
        lllllIllI[187] = 67 ^ 56;
        lllllIllI[188] = 215 ^ 171;
        lllllIllI[189] = (-8293) & 9837;
        lllllIllI[190] = (30 ^ 110) ^ (116 ^ 121);
        lllllIllI[191] = (-24578) & 28549;
        lllllIllI[192] = (((131 + 87) - 162) + 147) ^ (((177 + 137) - 240) + 107);
        lllllIllI[193] = (((17 ^ 50) + (91 ^ 92)) - (-(197 ^ 144))) + ((85 ^ 124) & ((100 ^ 77) ^ (-1)));
        lllllIllI[194] = (-5249) & 8172;
        lllllIllI[195] = ((28 + 34) - 46) + 112;
        lllllIllI[196] = (((242 ^ 144) + (128 ^ 181)) - (134 ^ 156)) + (43 ^ 47);
        lllllIllI[197] = ((52 + 76) - 4) + 6;
        lllllIllI[198] = (((204 ^ 180) + (32 ^ 40)) - (214 ^ 161)) + (214 ^ 172);
        lllllIllI[199] = (-1157) & 4095;
        lllllIllI[200] = (-8465) & 11704;
        lllllIllI[201] = ((43 + 43) - 51) + 97;
        lllllIllI[202] = ((67 + 90) - 84) + 60;
        lllllIllI[203] = (-((-3) & 6726)) & (-16393) & 32767;
        lllllIllI[204] = (-((-595) & 13019)) & (-16385) & 31741;
        lllllIllI[205] = (-22610) & 32255;
        lllllIllI[206] = (-16901) & 26543;
        lllllIllI[207] = (-10597) & 12142;
        lllllIllI[208] = ((40 + 113) - 67) + 48;
        lllllIllI[209] = (-(244 ^ 166)) & (-20481) & 24541;
        lllllIllI[210] = (((109 ^ 22) + (((48 + 96) - 117) + 103)) - (((67 + 2) - (-117)) + 59)) + ((76 + 59) - 83) + 75;
        lllllIllI[211] = (((126 ^ 119) + (86 ^ 22)) - (12 ^ 42)) + (26 ^ 127);
        lllllIllI[212] = (-(69 ^ 22)) & (-16898) & 26623;
        lllllIllI[213] = (((113 ^ 121) + (74 ^ 107)) - (0 ^ 40)) + ((66 + 93) - 84) + 61;
        lllllIllI[214] = ((93 + 121) - 126) + 50;
        lllllIllI[215] = (((48 ^ 5) + (147 ^ 193)) - (41 ^ 112)) + (31 ^ 66);
        lllllIllI[216] = (-((-6795) & 31467)) & (-133) & 26351;
        lllllIllI[217] = (((106 ^ 88) + (75 ^ 115)) - (64 ^ 12)) + (175 ^ 193);
        lllllIllI[218] = (-((-8839) & 32463)) & (-129) & 24575;
        lllllIllI[219] = ((63 + 73) - 105) + 110;
        lllllIllI[220] = (((149 ^ 185) + (67 ^ 72)) - (12 ^ 16)) + (65 ^ 50);
        lllllIllI[221] = (-((-161) & 13485)) & (-129) & 16381;
        lllllIllI[222] = (-21001) & 30651;
        lllllIllI[223] = ((71 + 9) - (-25)) + 38;
        lllllIllI[224] = (((12 ^ 114) + (((10 + 99) - 52) + 77)) - (((18 + 34) - (-92)) + 71)) + (26 ^ 121);
        lllllIllI[225] = (((59 ^ 89) + (11 ^ 13)) - (106 ^ 36)) + (225 ^ 150);
        lllllIllI[226] = ((25 + 81) - 40) + 80;
        lllllIllI[227] = (-18628) & 20175;
        lllllIllI[228] = (((230 ^ 169) + (233 ^ 165)) - (75 ^ 126)) + (15 ^ 34);
        lllllIllI[229] = ((68 + 137) - 70) + 13;
        lllllIllI[230] = (-(143 ^ 198)) & (-1) & 9727;
        lllllIllI[231] = (((126 ^ 102) + (122 ^ 16)) - (21 ^ 117)) + (23 ^ 100);
        lllllIllI[232] = ((68 + 28) - (-33)) + 21;
        lllllIllI[233] = (((43 ^ 112) + (((56 + 123) - 67) + 27)) - (((29 + 17) - (-78)) + 8)) + (23 ^ 34);
        lllllIllI[234] = ((1 + 104) - 104) + 151;
        lllllIllI[235] = (((86 ^ 66) + (161 ^ 199)) - (211 ^ 131)) + (65 ^ 46);
        lllllIllI[236] = (((157 ^ 198) + (16 ^ 13)) - (-(22 ^ 18))) + (108 ^ 114);
        lllllIllI[237] = (((241 ^ 196) + (213 ^ 144)) - (111 ^ 115)) + (114 ^ 79);
        lllllIllI[238] = (((204 ^ 168) + "   ".length()) - (176 ^ 134)) + (196 ^ 175);
        lllllIllI[239] = ((81 + 8) - (-52)) + 16;
        lllllIllI[240] = ((105 + 95) - 120) + 78;
        lllllIllI[241] = ((96 + 126) - 119) + 56;
        lllllIllI[242] = ((102 + 158) - 185) + 85;
        lllllIllI[243] = (((29 ^ 105) + (61 ^ 84)) - (((63 + 66) - 126) + 213)) + ((56 + 8) - (-87)) + 5;
        lllllIllI[244] = (((46 ^ 111) + (67 ^ 113)) - (-"   ".length())) + (69 ^ 105);
        lllllIllI[245] = (((166 ^ 154) + (222 ^ 185)) - (((62 + 20) - (-46)) + 11)) + ((71 + 14) - (-15)) + 39;
        lllllIllI[246] = ((133 + 20) - 63) + 74;
        lllllIllI[247] = ((0 + 57) - (-23)) + 85;
        lllllIllI[248] = (((((30 + 88) - 113) + 143) + (30 ^ 66)) - (((85 + 81) - (-23)) + 23)) + ((95 + 115) - 200) + 128;
        lllllIllI[249] = ((17 + 125) - 134) + 159;
        lllllIllI[250] = (((109 ^ 86) + (7 ^ 56)) - (55 ^ 29)) + (92 ^ 4);
        lllllIllI[251] = ((117 + 33) - 139) + 158;
        lllllIllI[252] = ((161 + 120) - 169) + 58;
        lllllIllI[253] = ((146 + 154) - 133) + 4;
        lllllIllI[254] = (((((115 + 29) - 2) + 27) + (107 ^ 10)) - (207 ^ 172)) + (111 ^ 106);
        lllllIllI[255] = (((61 ^ 64) + (55 ^ 15)) - (47 ^ 23)) + (64 ^ 112);
        lllllIllI[256] = ((159 + 100) - 173) + 88;
        lllllIllI[257] = ((150 + 72) - 124) + 77;
        lllllIllI[258] = (-12581) & 15678;
        lllllIllI[259] = (-((-17563) & 30175)) & (-16897) & 32766;
        lllllIllI[260] = (((25 ^ 83) + (212 ^ 133)) - (63 ^ 30)) + (14 ^ 54);
        lllllIllI[261] = ((82 + 36) - 93) + 154;
        lllllIllI[262] = ((68 + 47) - 70) + 135;
        lllllIllI[263] = ((86 + 136) - 124) + 83;
        lllllIllI[264] = ((88 + 48) - (-9)) + 37;
        lllllIllI[265] = ((118 + 102) - 113) + 76;
        lllllIllI[266] = (((164 ^ 136) + (204 ^ 187)) - (((82 + 52) - (-4)) + 4)) + ((157 + 59) - 117) + 64;
        lllllIllI[267] = ((55 + 8) - (-110)) + 12;
        lllllIllI[268] = (((8 ^ 30) + (86 ^ 4)) - (-(112 ^ 84))) + (50 ^ 28);
        lllllIllI[269] = (-((-3433) & 19817)) & (-4097) & 23304;
        lllllIllI[270] = (-((-163) & 23267)) & (-41) & 32767;
        lllllIllI[271] = (-29801) & 32634;
        lllllIllI[272] = (((226 ^ 194) + (((23 + 2) - (-27)) + 100)) - (24 ^ 84)) + (12 ^ 67);
        lllllIllI[273] = ((125 + 5) - 56) + 114;
        lllllIllI[274] = (((((119 + 91) - 158) + 75) + (139 ^ 149)) - (0 ^ 56)) + (28 ^ 68);
        lllllIllI[275] = (((133 ^ 180) + (((61 + 100) - 140) + 140)) - (105 ^ 20)) + (219 ^ 178);
        lllllIllI[276] = (-((-2623) & 28415)) & (-4131) & 32767;
        lllllIllI[277] = ((89 + 134) - 127) + 95;
        lllllIllI[278] = (((119 ^ 52) + (182 ^ 154)) - (-(164 ^ 190))) + (113 ^ 70);
        lllllIllI[279] = (((17 ^ 98) + (1 ^ 11)) - (195 ^ 187)) + ((54 + 25) - 65) + 174;
        lllllIllI[280] = (((((57 + 135) - 99) + 47) + (((64 + 29) - (-3)) + 68)) - (((63 + 98) - 127) + 107)) + (161 ^ 190);
        lllllIllI[281] = (((12 ^ 83) + (14 ^ 44)) - (-(110 ^ 120))) + (19 ^ 63);
        lllllIllI[282] = ((154 + 164) - 164) + 42;
        lllllIllI[283] = ((93 + 81) - 109) + 132;
        lllllIllI[284] = ((178 + 117) - 247) + 150;
        lllllIllI[285] = ((151 + 79) - 210) + 179;
        lllllIllI[286] = (((254 ^ 179) + (106 ^ 16)) - (((28 + 90) - 77) + 86)) + ((35 + 105) - 102) + 90;
        lllllIllI[287] = ((128 + 42) - 17) + 48;
        lllllIllI[288] = ((16 + 99) - 10) + 97;
        lllllIllI[289] = ((125 + 125) - 225) + 178;
        lllllIllI[290] = ((118 + 59) - 29) + 56;
        lllllIllI[291] = (-((-18445) & 30815)) & (-33) & 16383;
        lllllIllI[292] = ((47 + 92) - 104) + 170;
        lllllIllI[293] = (((((73 + 110) - 115) + 65) + (220 ^ 168)) - (43 ^ 105)) + (123 ^ 108);
        lllllIllI[294] = -" ".length();
        lllllIllI[295] = ((37 + 203) - 160) + 127;
        lllllIllI[296] = (((204 ^ 153) + (116 ^ 90)) - (-(6 ^ 19))) + (143 ^ 183);
        lllllIllI[297] = ((56 + 29) - (-85)) + 39;
        lllllIllI[298] = ((133 + 164) - 123) + 36;
        lllllIllI[299] = ((37 + 195) - 213) + 192;
        lllllIllI[300] = (((((134 + 56) - 38) + 26) + (95 ^ 16)) - (((104 + 198) - 138) + 41)) + ((16 + 6) - (-21)) + 117;
        lllllIllI[301] = ((146 + 28) - (-37)) + 2;
        lllllIllI[302] = ((202 + 192) - 209) + 29;
        lllllIllI[303] = ((82 + 34) - 95) + 194;
        lllllIllI[304] = ((72 + 1) - 3) + 146;
        lllllIllI[305] = (-((-19586) & 24047)) & (-26753) & 32751;
        lllllIllI[306] = (((((6 + 110) - 9) + 56) + (124 ^ 14)) - (214 ^ 151)) + (147 ^ 150);
        lllllIllI[307] = ((208 + 193) - 392) + 209;
        lllllIllI[308] = (((((17 + 111) - 44) + 61) + (106 ^ 56)) - (((53 + 59) - 36) + 113)) + ((107 + 174) - 228) + 128;
        lllllIllI[309] = (-16401) & 17400;
        lllllIllI[310] = (-((-23761) & 32222)) & (-17) & 28477;
        lllllIllI[311] = (-3591) & 28590;
        lllllIllI[312] = (-22273) & 57272;
        lllllIllI[313] = (-4145) & 16124;
        lllllIllI[314] = (-27307) & 28606;
        lllllIllI[315] = (((((70 + 40) - (-4)) + 13) + (83 ^ 46)) - (((159 + 137) - 280) + 182)) + ((161 + 24) - 81) + 62;
        lllllIllI[316] = (((15 ^ 8) + (((126 + 69) - 55) + 25)) - (196 ^ 168)) + ((24 + 86) - 38) + 85;
        lllllIllI[317] = ((79 + 80) - 117) + 180;
        lllllIllI[318] = ((120 + 68) - 145) + 180;
        lllllIllI[319] = ((86 + 193) - 235) + 180;
        lllllIllI[320] = (((((45 + 139) - 48) + 79) + (((19 + 79) - 49) + 92)) - ((-6665) & 6971)) + ((19 + 173) - 63) + 47;
        lllllIllI[321] = ((154 + 188) - 308) + 192;
        lllllIllI[322] = ((191 + 61) - 82) + 57;
        lllllIllI[323] = (((((148 + 77) - 199) + 123) + (240 ^ 136)) - ((-30241) & 30507)) + ((95 + 10) - 23) + 144;
        lllllIllI[324] = ((9 + 146) - 77) + 151;
        lllllIllI[325] = ((209 + 32) - 52) + 41;
        lllllIllI[326] = (((69 ^ 46) + (173 ^ 184)) - (69 ^ 89)) + ((16 + 119) - 32) + 28;
        lllllIllI[327] = (((((95 + 94) - 118) + 120) + (6 ^ 1)) - (111 ^ 100)) + (32 ^ 13);
        lllllIllI[328] = ((229 + 55) - 168) + 117;
        lllllIllI[329] = (((33 ^ 53) + (((135 + 112) - 220) + 113)) - (90 ^ 83)) + (252 ^ 175);
        lllllIllI[330] = ((188 + 13) - 83) + 117;
        lllllIllI[331] = (((((187 + 17) - (-7)) + 0) + (10 ^ 44)) - (((25 + 143) - 17) + 7)) + ((101 + 56) - 68) + 56;
        lllllIllI[332] = (((((44 + 108) - 141) + 130) + (186 ^ 189)) - (83 ^ 52)) + ((7 + 77) - (-59)) + 49;
        lllllIllI[333] = (((20 ^ 63) + (249 ^ 138)) - (76 ^ 87)) + (70 ^ 45);
        lllllIllI[334] = ((181 + 77) - 28) + 9;
        lllllIllI[335] = (((103 ^ 104) + (241 ^ 191)) - (141 ^ 158)) + ((0 + 116) - 99) + 149;
        lllllIllI[336] = ((48 + 157) - 118) + 154;
        lllllIllI[337] = (((((150 + 37) - 46) + 23) + (((92 + 5) - 3) + 133)) - ((-65) & 335)) + (1 ^ 123);
        lllllIllI[338] = (((((0 + 192) - 185) + 227) + (21 ^ 16)) - (8 ^ 85)) + (89 ^ 56);
        lllllIllI[339] = (((6 ^ 113) + ((51 ^ 80) & ((56 ^ 91) ^ (-1)))) - (-(68 ^ 95))) + (5 ^ 103);
        lllllIllI[340] = ((111 + 203) - 143) + 74;
        lllllIllI[341] = (-((-19781) & 20429)) & (-20737) & 24575;
        lllllIllI[342] = (-93) & 3454;
        lllllIllI[343] = (-1) & 3068;
        lllllIllI[344] = (-66) & 3583;
        lllllIllI[345] = (-((-2185) & 23545)) & (-8198) & 32767;
        lllllIllI[346] = (-((-18823) & 31663)) & (-16642) & 32703;
        lllllIllI[347] = (-13338) & 16383;
        lllllIllI[348] = (-24701) & 27903;
        lllllIllI[349] = (((((35 + 108) - (-9)) + 12) + " ".length()) - (-(198 ^ 195))) + (111 ^ 35);
        lllllIllI[350] = ((237 + 151) - 169) + 28;
        lllllIllI[351] = (((((92 + 44) - 54) + 73) + (118 ^ 52)) - (51 ^ 26)) + (201 ^ 141);
        lllllIllI[352] = (((((44 + 36) - (-119)) + 0) + (147 ^ 187)) - (((97 + 115) - 141) + 77)) + ((76 + 76) - 22) + 28;
        lllllIllI[353] = ((44 + 32) - 68) + 242;
        lllllIllI[354] = ((47 + 182) - 18) + 40;
        lllllIllI[355] = (((((179 + 56) - 232) + 198) + (((36 + 30) - 44) + 124)) - (((57 + 95) - 65) + 68)) + (100 ^ 88);
        lllllIllI[356] = ((245 + 93) - 328) + 243;
        lllllIllI[357] = (((((16 + 110) - (-24)) + 91) + (((148 + 66) - 58) + 17)) - (((209 + 238) - 354) + 160)) + (220 ^ 129);
        lllllIllI[358] = (((66 ^ 31) + (225 ^ 138)) - (-(145 ^ 165))) + "   ".length();
        lllllIllI[359] = (-((-5164) & 15487)) & (-4741) & 15319;
        lllllIllI[360] = (-30909) & 31165;
        lllllIllI[361] = (-((-5262) & 14079)) & (-17409) & 26483;
        lllllIllI[362] = (-20533) & 20791;
        lllllIllI[363] = (-1570) & 1829;
        lllllIllI[364] = (-((-4239) & 31487)) & (-9) & 27517;
        lllllIllI[365] = (-4273) & 4534;
    }

    private static void cZ() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIllIIIII(nearest) && llIlIlIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[306]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lllllIllI[2]);
            "".length();
        }
        if (llIlIllIIIII(nearest) && llIlIlIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[307]];
            if (llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllllIllI[18]);
                "".length();
            }
            if (llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllllIllI[9]);
                    "".length();
                }
                C0000a.a(lllllIllI[19], lllllIllI[11]);
                C0000a.a(lllllIllI[22], lllllIllI[11]);
                C0000a.a(lllllIllI[21], lllllIllI[11]);
                C0000a.b(C0005f.bc, lllllIllI[2]);
                C0000a.a(lllllIllI[45], lllllIllI[7]);
                C0000a.a(lllllIllI[33], lllllIllI[1]);
                C0000a.a(lllllIllI[32], lllllIllI[1]);
                C0000a.a(lllllIllI[30], lllllIllI[1]);
                C0000a.a(lllllIllI[31], lllllIllI[1]);
                C0000a.a(lllllIllI[46], lllllIllI[47]);
                Bank.withdraw(llllIllll[lllllIllI[308]], lllllIllI[1], Bank.WithdrawMode.ITEM);
                int[] iArr = new int[lllllIllI[1]];
                iArr[lllllIllI[0]] = lllllIllI[36];
                if (llIlIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIllI[1]];
                    iArr2[lllllIllI[0]] = lllllIllI[36];
                    if (llIlIlIlllII(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lllllIllI[36], lllllIllI[1], Bank.WithdrawMode.ITEM);
                    }
                }
                C0000a.a(lllllIllI[35], Inventory.getFreeSlots());
            }
        }
    }

    private static void cY() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIllIIIII(nearest) && llIlIlIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[303]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(lllllIllI[2]);
            "".length();
        }
        if (llIlIllIIIII(nearest) && llIlIlIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIllll[lllllIllI[304]];
            if (llIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllllIllI[18]);
                "".length();
            }
            if (llIlIlIllIlI(Bank.isOpen() ? 1 : 0)) {
                if (llIlIlIllllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllllIllI[9]);
                    "".length();
                }
                C0000a.a(lllllIllI[19], lllllIllI[11]);
                C0000a.a(lllllIllI[22], lllllIllI[11]);
                C0000a.a(lllllIllI[21], lllllIllI[11]);
                C0000a.b(C0005f.bc, lllllIllI[11]);
                C0000a.a(lllllIllI[35], lllllIllI[11]);
                C0000a.a(lllllIllI[45], lllllIllI[1]);
                C0000a.a(lllllIllI[27], lllllIllI[7]);
                C0000a.a(lllllIllI[34], lllllIllI[1]);
                C0000a.a(lllllIllI[24], lllllIllI[25]);
                C0000a.a(lllllIllI[305], lllllIllI[1]);
                C0000a.a(lllllIllI[46], lllllIllI[47]);
                int[] iArr = new int[lllllIllI[1]];
                iArr[lllllIllI[0]] = lllllIllI[36];
                if (llIlIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIllI[1]];
                    iArr2[lllllIllI[0]] = lllllIllI[36];
                    if (llIlIlIlllII(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(lllllIllI[36], lllllIllI[1], Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean llIlIlIllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[63]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028a, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[25]) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a0, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[23]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0526, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[23]) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05ea, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[20]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[7]) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0674, code lost:
        if (llIlIlIllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.T.lllllIllI[20]) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        int[] iArr17;
        int[] iArr18 = new int[lllllIllI[1]];
        iArr18[lllllIllI[0]] = lllllIllI[27];
        if (llIlIlIllIlI(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllllIllI[1]];
            iArr19[lllllIllI[0]] = lllllIllI[27];
            if (llIlIlIllIlI(Bank.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllllIllI[1]];
                iArr20[lllllIllI[0]] = lllllIllI[27];
            }
            iArr = new int[lllllIllI[1]];
            iArr[lllllIllI[0]] = lllllIllI[35];
            if (llIlIlIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr21 = new int[lllllIllI[1]];
                iArr21[lllllIllI[0]] = lllllIllI[35];
                if (llIlIlIllIlI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lllllIllI[1]];
                    iArr22[lllllIllI[0]] = lllllIllI[35];
                }
                iArr2 = new int[lllllIllI[1]];
                iArr2[lllllIllI[0]] = lllllIllI[39];
                if (llIlIlIlllII(Bank.contains(iArr2) ? 1 : 0)) {
                    bx.add(new C0003d(lllllIllI[39], lllllIllI[1], lllllIllI[310]));
                    "".length();
                }
                iArr3 = new int[lllllIllI[1]];
                iArr3[lllllIllI[0]] = lllllIllI[41];
                if (llIlIlIlllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bx.add(new C0003d(lllllIllI[41], lllllIllI[1], lllllIllI[311]));
                    "".length();
                }
                iArr4 = new int[lllllIllI[1]];
                iArr4[lllllIllI[0]] = lllllIllI[44];
                if (llIlIlIlllII(Bank.contains(iArr4) ? 1 : 0)) {
                    bx.add(new C0003d(lllllIllI[44], lllllIllI[1], lllllIllI[312]));
                    "".length();
                }
                iArr5 = new int[lllllIllI[1]];
                iArr5[lllllIllI[0]] = lllllIllI[42];
                if (llIlIlIlllII(Bank.contains(iArr5) ? 1 : 0)) {
                    bx.add(new C0003d(lllllIllI[42], lllllIllI[7], lllllIllI[310]));
                    "".length();
                }
                iArr6 = new int[lllllIllI[1]];
                iArr6[lllllIllI[0]] = lllllIllI[24];
                if (llIlIlIllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr23 = new int[lllllIllI[1]];
                    iArr23[lllllIllI[0]] = lllllIllI[24];
                    if (llIlIlIllIlI(Bank.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[lllllIllI[1]];
                        iArr24[lllllIllI[0]] = lllllIllI[24];
                    }
                    iArr7 = new int[lllllIllI[1]];
                    iArr7[lllllIllI[0]] = lllllIllI[36];
                    if (llIlIlIlllII(Bank.contains(iArr7) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[36], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr8 = new int[lllllIllI[1]];
                    iArr8[lllllIllI[0]] = lllllIllI[34];
                    if (llIlIlIlllII(Bank.contains(iArr8) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[34], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr9 = new int[lllllIllI[1]];
                    iArr9[lllllIllI[0]] = lllllIllI[33];
                    if (llIlIlIlllII(Bank.contains(iArr9) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[33], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr10 = new int[lllllIllI[1]];
                    iArr10[lllllIllI[0]] = lllllIllI[32];
                    if (llIlIlIlllII(Bank.contains(iArr10) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[32], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr11 = new int[lllllIllI[1]];
                    iArr11[lllllIllI[0]] = lllllIllI[30];
                    if (llIlIlIlllII(Bank.contains(iArr11) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[30], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr12 = new int[lllllIllI[1]];
                    iArr12[lllllIllI[0]] = lllllIllI[31];
                    if (llIlIlIlllII(Bank.contains(iArr12) ? 1 : 0)) {
                        bx.add(new C0003d(lllllIllI[31], lllllIllI[1], C0009j.ch));
                        "".length();
                    }
                    iArr13 = new int[lllllIllI[1]];
                    iArr13[lllllIllI[0]] = lllllIllI[37];
                    if (llIlIlIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr25 = new int[lllllIllI[1]];
                        iArr25[lllllIllI[0]] = lllllIllI[37];
                        if (llIlIlIllIlI(Bank.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[lllllIllI[1]];
                            iArr26[lllllIllI[0]] = lllllIllI[37];
                        }
                        iArr14 = new int[lllllIllI[1]];
                        iArr14[lllllIllI[0]] = lllllIllI[45];
                        if (llIlIlIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr27 = new int[lllllIllI[1]];
                            iArr27[lllllIllI[0]] = lllllIllI[45];
                            if (llIlIlIllIlI(Bank.contains(iArr27) ? 1 : 0)) {
                                int[] iArr28 = new int[lllllIllI[1]];
                                iArr28[lllllIllI[0]] = lllllIllI[45];
                            }
                            if (llIlIlIlllII(Bank.contains(item -> {
                                return item.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
                            }) ? 1 : 0)) {
                                bx.add(new C0003d(lllllIllI[313], lllllIllI[11], lllllIllI[311]));
                                "".length();
                            }
                            iArr15 = new int[lllllIllI[1]];
                            iArr15[lllllIllI[0]] = lllllIllI[19];
                            if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr29 = new int[lllllIllI[1]];
                                iArr29[lllllIllI[0]] = lllllIllI[19];
                                if (llIlIlIllIlI(Bank.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[lllllIllI[1]];
                                    iArr30[lllllIllI[0]] = lllllIllI[19];
                                }
                                iArr16 = new int[lllllIllI[1]];
                                iArr16[lllllIllI[0]] = lllllIllI[22];
                                if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                                    int[] iArr31 = new int[lllllIllI[1]];
                                    iArr31[lllllIllI[0]] = lllllIllI[22];
                                    if (llIlIlIllIlI(Bank.contains(iArr31) ? 1 : 0)) {
                                        int[] iArr32 = new int[lllllIllI[1]];
                                        iArr32[lllllIllI[0]] = lllllIllI[22];
                                    }
                                    iArr17 = new int[lllllIllI[1]];
                                    iArr17[lllllIllI[0]] = lllllIllI[21];
                                    if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                                        int[] iArr33 = new int[lllllIllI[1]];
                                        iArr33[lllllIllI[0]] = lllllIllI[21];
                                        if (!llIlIlIllIlI(Bank.contains(iArr33) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr34 = new int[lllllIllI[1]];
                                        iArr34[lllllIllI[0]] = lllllIllI[21];
                                        if (!llIlIlIllIll(Bank.getFirst(iArr34).getQuantity(), lllllIllI[20])) {
                                            return;
                                        }
                                    }
                                    bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                                    "".length();
                                }
                                bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
                                "".length();
                                iArr17 = new int[lllllIllI[1]];
                                iArr17[lllllIllI[0]] = lllllIllI[21];
                                if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                                "".length();
                            }
                            bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
                            "".length();
                            iArr16 = new int[lllllIllI[1]];
                            iArr16[lllllIllI[0]] = lllllIllI[22];
                            if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
                            "".length();
                            iArr17 = new int[lllllIllI[1]];
                            iArr17[lllllIllI[0]] = lllllIllI[21];
                            if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                            "".length();
                        }
                        bx.add(new C0003d(lllllIllI[45], lllllIllI[23], lllllIllI[47]));
                        "".length();
                        if (llIlIlIlllII(Bank.contains(item2 -> {
                            return item2.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
                        }) ? 1 : 0)) {
                        }
                        iArr15 = new int[lllllIllI[1]];
                        iArr15[lllllIllI[0]] = lllllIllI[19];
                        if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
                        "".length();
                        iArr16 = new int[lllllIllI[1]];
                        iArr16[lllllIllI[0]] = lllllIllI[22];
                        if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
                        "".length();
                        iArr17 = new int[lllllIllI[1]];
                        iArr17[lllllIllI[0]] = lllllIllI[21];
                        if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                        "".length();
                    }
                    bx.add(new C0003d(lllllIllI[37], lllllIllI[23], C0009j.ch));
                    "".length();
                    iArr14 = new int[lllllIllI[1]];
                    iArr14[lllllIllI[0]] = lllllIllI[45];
                    if (llIlIlIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllllIllI[45], lllllIllI[23], lllllIllI[47]));
                    "".length();
                    if (llIlIlIlllII(Bank.contains(item22 -> {
                        return item22.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
                    }) ? 1 : 0)) {
                    }
                    iArr15 = new int[lllllIllI[1]];
                    iArr15[lllllIllI[0]] = lllllIllI[19];
                    if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
                    "".length();
                    iArr16 = new int[lllllIllI[1]];
                    iArr16[lllllIllI[0]] = lllllIllI[22];
                    if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
                    "".length();
                    iArr17 = new int[lllllIllI[1]];
                    iArr17[lllllIllI[0]] = lllllIllI[21];
                    if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                    "".length();
                }
                bx.add(new C0003d(lllllIllI[24], lllllIllI[25], lllllIllI[309]));
                "".length();
                iArr7 = new int[lllllIllI[1]];
                iArr7[lllllIllI[0]] = lllllIllI[36];
                if (llIlIlIlllII(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[lllllIllI[1]];
                iArr8[lllllIllI[0]] = lllllIllI[34];
                if (llIlIlIlllII(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lllllIllI[1]];
                iArr9[lllllIllI[0]] = lllllIllI[33];
                if (llIlIlIlllII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lllllIllI[1]];
                iArr10[lllllIllI[0]] = lllllIllI[32];
                if (llIlIlIlllII(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lllllIllI[1]];
                iArr11[lllllIllI[0]] = lllllIllI[30];
                if (llIlIlIlllII(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[lllllIllI[1]];
                iArr12[lllllIllI[0]] = lllllIllI[31];
                if (llIlIlIlllII(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[lllllIllI[1]];
                iArr13[lllllIllI[0]] = lllllIllI[37];
                if (llIlIlIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllllIllI[37], lllllIllI[23], C0009j.ch));
                "".length();
                iArr14 = new int[lllllIllI[1]];
                iArr14[lllllIllI[0]] = lllllIllI[45];
                if (llIlIlIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllllIllI[45], lllllIllI[23], lllllIllI[47]));
                "".length();
                if (llIlIlIlllII(Bank.contains(item222 -> {
                    return item222.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
                }) ? 1 : 0)) {
                }
                iArr15 = new int[lllllIllI[1]];
                iArr15[lllllIllI[0]] = lllllIllI[19];
                if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
                "".length();
                iArr16 = new int[lllllIllI[1]];
                iArr16[lllllIllI[0]] = lllllIllI[22];
                if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
                "".length();
                iArr17 = new int[lllllIllI[1]];
                iArr17[lllllIllI[0]] = lllllIllI[21];
                if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
                "".length();
            }
            bx.add(new C0003d(lllllIllI[35], lllllIllI[63], lllllIllI[309]));
            "".length();
            iArr2 = new int[lllllIllI[1]];
            iArr2[lllllIllI[0]] = lllllIllI[39];
            if (llIlIlIlllII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lllllIllI[1]];
            iArr3[lllllIllI[0]] = lllllIllI[41];
            if (llIlIlIlllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lllllIllI[1]];
            iArr4[lllllIllI[0]] = lllllIllI[44];
            if (llIlIlIlllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lllllIllI[1]];
            iArr5[lllllIllI[0]] = lllllIllI[42];
            if (llIlIlIlllII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllllIllI[1]];
            iArr6[lllllIllI[0]] = lllllIllI[24];
            if (llIlIlIllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[24], lllllIllI[25], lllllIllI[309]));
            "".length();
            iArr7 = new int[lllllIllI[1]];
            iArr7[lllllIllI[0]] = lllllIllI[36];
            if (llIlIlIlllII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lllllIllI[1]];
            iArr8[lllllIllI[0]] = lllllIllI[34];
            if (llIlIlIlllII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lllllIllI[1]];
            iArr9[lllllIllI[0]] = lllllIllI[33];
            if (llIlIlIlllII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lllllIllI[1]];
            iArr10[lllllIllI[0]] = lllllIllI[32];
            if (llIlIlIlllII(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lllllIllI[1]];
            iArr11[lllllIllI[0]] = lllllIllI[30];
            if (llIlIlIlllII(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[lllllIllI[1]];
            iArr12[lllllIllI[0]] = lllllIllI[31];
            if (llIlIlIlllII(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[lllllIllI[1]];
            iArr13[lllllIllI[0]] = lllllIllI[37];
            if (llIlIlIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[37], lllllIllI[23], C0009j.ch));
            "".length();
            iArr14 = new int[lllllIllI[1]];
            iArr14[lllllIllI[0]] = lllllIllI[45];
            if (llIlIlIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[45], lllllIllI[23], lllllIllI[47]));
            "".length();
            if (llIlIlIlllII(Bank.contains(item2222 -> {
                return item2222.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
            }) ? 1 : 0)) {
            }
            iArr15 = new int[lllllIllI[1]];
            iArr15[lllllIllI[0]] = lllllIllI[19];
            if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
            "".length();
            iArr16 = new int[lllllIllI[1]];
            iArr16[lllllIllI[0]] = lllllIllI[22];
            if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
            "".length();
            iArr17 = new int[lllllIllI[1]];
            iArr17[lllllIllI[0]] = lllllIllI[21];
            if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
            "".length();
        }
        bx.add(new C0003d(lllllIllI[27], lllllIllI[7], lllllIllI[309]));
        "".length();
        iArr = new int[lllllIllI[1]];
        iArr[lllllIllI[0]] = lllllIllI[35];
        if (llIlIlIllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[35], lllllIllI[63], lllllIllI[309]));
        "".length();
        iArr2 = new int[lllllIllI[1]];
        iArr2[lllllIllI[0]] = lllllIllI[39];
        if (llIlIlIlllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lllllIllI[1]];
        iArr3[lllllIllI[0]] = lllllIllI[41];
        if (llIlIlIlllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lllllIllI[1]];
        iArr4[lllllIllI[0]] = lllllIllI[44];
        if (llIlIlIlllII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lllllIllI[1]];
        iArr5[lllllIllI[0]] = lllllIllI[42];
        if (llIlIlIlllII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllllIllI[1]];
        iArr6[lllllIllI[0]] = lllllIllI[24];
        if (llIlIlIllIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[24], lllllIllI[25], lllllIllI[309]));
        "".length();
        iArr7 = new int[lllllIllI[1]];
        iArr7[lllllIllI[0]] = lllllIllI[36];
        if (llIlIlIlllII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lllllIllI[1]];
        iArr8[lllllIllI[0]] = lllllIllI[34];
        if (llIlIlIlllII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lllllIllI[1]];
        iArr9[lllllIllI[0]] = lllllIllI[33];
        if (llIlIlIlllII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lllllIllI[1]];
        iArr10[lllllIllI[0]] = lllllIllI[32];
        if (llIlIlIlllII(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lllllIllI[1]];
        iArr11[lllllIllI[0]] = lllllIllI[30];
        if (llIlIlIlllII(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[lllllIllI[1]];
        iArr12[lllllIllI[0]] = lllllIllI[31];
        if (llIlIlIlllII(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[lllllIllI[1]];
        iArr13[lllllIllI[0]] = lllllIllI[37];
        if (llIlIlIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[37], lllllIllI[23], C0009j.ch));
        "".length();
        iArr14 = new int[lllllIllI[1]];
        iArr14[lllllIllI[0]] = lllllIllI[45];
        if (llIlIlIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[45], lllllIllI[23], lllllIllI[47]));
        "".length();
        if (llIlIlIlllII(Bank.contains(item22222 -> {
            return item22222.getName().toLowerCase().contains(llllIllll[lllllIllI[316]]);
        }) ? 1 : 0)) {
        }
        iArr15 = new int[lllllIllI[1]];
        iArr15[lllllIllI[0]] = lllllIllI[19];
        if (llIlIlIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[19], lllllIllI[10], lllllIllI[314]));
        "".length();
        iArr16 = new int[lllllIllI[1]];
        iArr16[lllllIllI[0]] = lllllIllI[22];
        if (llIlIlIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[22], lllllIllI[10], lllllIllI[314]));
        "".length();
        iArr17 = new int[lllllIllI[1]];
        iArr17[lllllIllI[0]] = lllllIllI[21];
        if (llIlIlIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllllIllI[21], lllllIllI[10], lllllIllI[314]));
        "".length();
    }

    private static String llIlIIllIIlI(String lIlIllIIlIlIl, String lIlIllIIlIlII) {
        String lIlIllIIlIlIl2 = new String(Base64.getDecoder().decode(lIlIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIllIIlIIlI = lIlIllIIlIlII.toCharArray();
        int lIlIllIIlIIIl = lllllIllI[0];
        char[] charArray = lIlIllIIlIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllllIllI[0];
        while (llIlIlIllIll(i, length)) {
            char lIlIllIIIlIII = charArray[i];
            sb.append((char) (lIlIllIIIlIII ^ lIlIllIIlIIlI[lIlIllIIlIIIl % lIlIllIIlIIlI.length]));
            "".length();
            lIlIllIIlIIIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIllIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlIlIlllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIllIIlIl(Object obj) {
        return obj == null;
    }

    private static void llIlIlIlIlII() {
        llllIllll = new String[lllllIllI[365]];
        llllIllll[lllllIllI[0]] = llIlIIllIIII("nFZozcl0U0gwt4PGqbJEtw==", "OjMqt");
        llllIllll[lllllIllI[1]] = llIlIIllIIII("3wS/mmhFMAFQ1wy7Ah/k/oBZCuFgRCnJanNz1dH/95Xngysw/QhMx0dBmxJ8ECk5", "flgzN");
        llllIllll[lllllIllI[2]] = llIlIIllIIIl("qH5Ig7htRIyh/haGl6ZAYA==", "OeAfA");
        llllIllll[lllllIllI[7]] = llIlIIllIIIl("NykwoLmzqpE=", "nPUTI");
        llllIllll[lllllIllI[9]] = llIlIIllIIIl("aF5VYvwbsNU=", "tqTBy");
        llllIllll[lllllIllI[11]] = llIlIIllIIIl("pSp5dC+WTNo=", "LLjke");
        llllIllll[lllllIllI[12]] = llIlIIllIIIl("5iny5ku5uV8=", "rweCJ");
        llllIllll[lllllIllI[13]] = llIlIIllIIlI("CTsQ", "LZdEn");
        llllIllll[lllllIllI[16]] = llIlIIllIIlI("Fhs6Shg3Wi4LAjM=", "XzLjl");
        llllIllll[lllllIllI[17]] = llIlIIllIIIl("6aOspr4rNfUL0oUGStihAQws1jM/kup3", "KlcHK");
        llllIllll[lllllIllI[23]] = llIlIIllIIIl("6hgHUXzno92nVZlSqicBRBjxLFCYgujPgZKDdYLlx79nUROcGhG36K29MrZ/BYtD", "tHMuk");
        llllIllll[lllllIllI[26]] = llIlIIllIIlI("AxZZNRcxUxQ9FicaFzNFJwccMQl0HRg9CSdfWScSPQcaPAw6FFkgCnQxLA0sGjQ=", "TsyTe");
        llllIllll[lllllIllI[28]] = llIlIIllIIII("jd5hquZxeATWRmVjjux+1tattrYgQYp2Rvwl5KEDQwRJx6nUjjnwpjPNQsnwcDSH", "fcUwq");
        llllIllll[lllllIllI[38]] = llIlIIllIIII("xUBBl4SLa17Ty5hzsm+FKeLndUM+aBCytya8RMZQucG6vA7APYSVPtS668zNw4IeMffUd9/xinQ=", "dJhNx");
        llllIllll[lllllIllI[40]] = llIlIIllIIlI("CCcvZBUpZjosACs2eSMULyo9", "FFYDa");
        llllIllll[lllllIllI[20]] = llIlIIllIIIl("16lFcEb7LFc=", "mbssF");
        llllIllll[lllllIllI[43]] = llIlIIllIIII("car065XNnTKimyx4MV/SXA==", "uTUhZ");
        llllIllll[lllllIllI[29]] = llIlIIllIIIl("1U6m2PhkoHustvP+PLuECw==", "OBdZj");
        llllIllll[lllllIllI[50]] = llIlIIllIIIl("oBQs2AV27/4=", "UGgCu");
        llllIllll[lllllIllI[51]] = llIlIIllIIIl("UaRWDakcO8wG2hKyb0XEsg==", "WPsYw");
        llllIllll[lllllIllI[10]] = llIlIIllIIlI("Bw0qLRE=", "PdOAu");
        llllIllll[lllllIllI[52]] = llIlIIllIIIl("ZPWFAQPiK9k=", "YuIQf");
        llllIllll[lllllIllI[53]] = llIlIIllIIII("IRgNxezqlAk=", "Vgqqg");
        llllIllll[lllllIllI[55]] = llIlIIllIIlI("KwgzFk4NDDA=", "fiIsn");
        llllIllll[lllllIllI[8]] = llIlIIllIIII("bIMdZ0UYBHrzdVWRiGNC+cZ5xCr9VV90", "dRyDT");
        llllIllll[lllllIllI[56]] = llIlIIllIIII("pwjWAck0Ly8=", "rTExs");
        llllIllll[lllllIllI[57]] = llIlIIllIIII("ec8/rHKzOs8=", "hpkyt");
        llllIllll[lllllIllI[58]] = llIlIIllIIII("o6/+CJceYe25JhRINA6Iyg==", "ptWNc");
        llllIllll[lllllIllI[60]] = llIlIIllIIlI("MywGNg1EJwIqSC1kBS0GAGQXLA1ENgojABBkECwBFHs=", "dDcDh");
        llllIllll[lllllIllI[61]] = llIlIIllIIIl("MyOVhHEUVwZCv392OPMRfa7MSaj6Xd1j", "bokYQ");
        llllIllll[lllllIllI[63]] = llIlIIllIIIl("B95jZ1kXliRyXOnYtvHq4WrKBZH4+yLLGJJurKX7c88dFFKU9NrmVOMrgwS3kxZeFQmm0wMMnYc=", "vZdxX");
        llllIllll[lllllIllI[65]] = llIlIIllIIlI("KhMZHUsMFxo=", "grcxk");
        llllIllll[lllllIllI[15]] = llIlIIllIIII("En3caPqSlWMAWFC8nf63doebe0e/PZU9kAN0iChV+ofhmg38ig/I6w==", "nkpwR");
        llllIllll[lllllIllI[66]] = llIlIIllIIlI("AjINORR1MxtrPDA2EioDcilIJhAlehgiFDY/Vw==", "UZhKq");
        llllIllll[lllllIllI[68]] = llIlIIllIIlI("Jjc0VSkPNmM8aggxLRFqGjAmVTgBLTcQaho3YzY4DzYnGjhR", "nXCuJ");
        llllIllll[lllllIllI[69]] = llIlIIllIIlI("FhoTGSdhGwVLFikTGhEjM1UFSy8gAlYbKyQRE1Q=", "ArvkB");
        llllIllll[lllllIllI[70]] = llIlIIllIIII("ZhylbTS0Bx9vvwp+vE9AVcG+6IzO8SGrKxOXKF0CUUoY5IHES6bE7A==", "MIZiU");
        llllIllll[lllllIllI[71]] = llIlIIllIIIl("2GSpzdOz2zSZWearwxXQxunqbsRd2SibdSqEFNbl7Oo=", "FNZmh");
        llllIllll[lllllIllI[74]] = llIlIIllIIII("Yu2xpAap4bo7YeYA5AnZag==", "fdlYk");
        llllIllll[lllllIllI[77]] = llIlIIllIIlI("DjMEAh0k", "AAeaq");
        llllIllll[lllllIllI[78]] = llIlIIllIIII("hyyvrqrdNTOGnVKhL8vOag==", "dbGsr");
        llllIllll[lllllIllI[79]] = llIlIIllIIII("qA49QwLzMIg=", "udtLA");
        llllIllll[lllllIllI[80]] = llIlIIllIIIl("dSrlabcfi5s=", "qycuS");
        llllIllll[lllllIllI[82]] = llIlIIllIIIl("3EcUr9zK12Y9+iTJngCjFw==", "kLwdH");
        llllIllll[lllllIllI[84]] = llIlIIllIIIl("5nUmYTdtH3lOec6QLnJniQ==", "iapar");
        llllIllll[lllllIllI[87]] = llIlIIllIIlI("DxElUQwuUD4QHygTcxUXLgI=", "ApSqx");
        llllIllll[lllllIllI[88]] = llIlIIllIIII("PblIKj6edKJxoQIMm6UScA8CuvMPBROx", "oKFZk");
        llllIllll[lllllIllI[89]] = llIlIIllIIIl("TLvSsS2xHqA=", "gIkKF");
        llllIllll[lllllIllI[90]] = llIlIIllIIIl("mRxdAt57Vbg=", "NIcuV");
        llllIllll[lllllIllI[91]] = llIlIIllIIIl("fyO/wvU8uBfYO04YqODzDA==", "IvGoV");
        llllIllll[lllllIllI[6]] = llIlIIllIIlI("NRUoNREcCGo2Cg0=", "yzJFe");
        llllIllll[lllllIllI[92]] = llIlIIllIIIl("NiyVaPLlor5ImvsSC49uMw==", "gWwJT");
        llllIllll[lllllIllI[93]] = llIlIIllIIII("2gE/RboI3ZwL7u5mZzm+9g==", "omfVc");
        llllIllll[lllllIllI[94]] = llIlIIllIIlI("NDYlBAQEPGMPGRY0", "aXCmv");
        llllIllll[lllllIllI[95]] = llIlIIllIIII("e6ylHrkvLp0wKv3bHe+gRg==", "VXThr");
        llllIllll[lllllIllI[96]] = llIlIIllIIII("SF2SA/3/kMWOynj7fqS1lg==", "gUgvS");
        llllIllll[lllllIllI[97]] = llIlIIllIIII("48326C0rJg1n2gHoanBeNDn61DBqhmLz", "vLCtp");
        llllIllll[lllllIllI[98]] = llIlIIllIIlI("IyUbLzcQaxJuKB0iBW4nGyED", "tLaNE");
        llllIllll[lllllIllI[99]] = llIlIIllIIlI("KC4tKBVFKyUuBA==", "eOJAv");
        llllIllll[lllllIllI[100]] = llIlIIllIIII("k7Up1RhJvmA=", "mrlek");
        llllIllll[lllllIllI[101]] = llIlIIllIIIl("3EjjxEQVKL8=", "PxyoY");
        llllIllll[lllllIllI[102]] = llIlIIllIIIl("Ajv6X2fuEg2PN/H70gb4Cw==", "HzIAl");
        llllIllll[lllllIllI[103]] = llIlIIllIIIl("czEIbk1YfIzjulfU0M5JsA==", "hymGf");
        llllIllll[lllllIllI[104]] = llIlIIllIIII("7Xw5VW4sYm5Wt98YZPCTJg==", "PXSYF");
        llllIllll[lllllIllI[105]] = llIlIIllIIlI("FwAtLil6BSUoOA==", "ZaJGJ");
        llllIllll[lllllIllI[106]] = llIlIIllIIII("To4oiSsENtsc4hwxmbK5aQ==", "oINHM");
        llllIllll[lllllIllI[107]] = llIlIIllIIIl("B9dSjRgvlpVlIylrha/UJw==", "dnYvc");
        llllIllll[lllllIllI[108]] = llIlIIllIIIl("uUjX8lfrZGVEcBz7QBwHMg==", "DgRSO");
        llllIllll[lllllIllI[109]] = llIlIIllIIlI("NgACNxYFTgt2CQgHHHYGDgQa", "aixVd");
        llllIllll[lllllIllI[110]] = llIlIIllIIIl("K9zUjvFKrb4wysRk6kdd3Sf7NhcCXXS8", "BEJkd");
        llllIllll[lllllIllI[111]] = llIlIIllIIII("WS96k23+t531rYFB0BvC7A==", "nBuBl");
        llllIllll[lllllIllI[112]] = llIlIIllIIIl("gaXdl18lbAw=", "wlbsC");
        llllIllll[lllllIllI[113]] = llIlIIllIIIl("w16O8W+O87IxapI/2XkHwA==", "emulK");
        llllIllll[lllllIllI[114]] = llIlIIllIIlI("Bjc/AA==", "IGZnb");
        llllIllll[lllllIllI[115]] = llIlIIllIIII("2DxRxsl2TPQ=", "JwRoj");
        llllIllll[lllllIllI[116]] = llIlIIllIIlI("Agc2KA==", "MwSFz");
        llllIllll[lllllIllI[117]] = llIlIIllIIII("lLoBjRLV6Sc=", "YJqOs");
        llllIllll[lllllIllI[118]] = llIlIIllIIIl("H0oHi/+qiIE=", "DXPsx");
        llllIllll[lllllIllI[119]] = llIlIIllIIIl("qO+ctBitlu4=", "QsWjR");
        llllIllll[lllllIllI[120]] = llIlIIllIIlI("AQEmHw==", "RhJth");
        llllIllll[lllllIllI[121]] = llIlIIllIIlI("HxEzJg5yFDsgHw==", "RpTOm");
        llllIllll[lllllIllI[122]] = llIlIIllIIII("KLT1mnKv7SCR/p3lqvgxLw==", "WznzM");
        llllIllll[lllllIllI[123]] = llIlIIllIIlI("Niw2GTgfMXQaIw4=", "zCTjL");
        llllIllll[lllllIllI[124]] = llIlIIllIIlI("HRY/KipwEzcsOw==", "PwXCI");
        llllIllll[lllllIllI[125]] = llIlIIllIIlI("DDQzIzQ8PnUoKS42", "YZUJF");
        llllIllll[lllllIllI[126]] = llIlIIllIIlI("AQs+DgYxAXgFGyMJ", "TeXgt");
        llllIllll[lllllIllI[127]] = llIlIIllIIII("lNff2tZZbLanc5GztxzskQ==", "iBbYE");
        llllIllll[lllllIllI[128]] = llIlIIllIIII("CMQ7ftz5KDmpdbsYVW+/3bM2oNP5Z/1Z", "SIxAC");
        llllIllll[lllllIllI[129]] = llIlIIllIIII("OyJQk2d1EnL8hHFWeUIDAiN2trGqsbSh", "znFxc");
        llllIllll[lllllIllI[130]] = llIlIIllIIIl("JWl9tPYhX5XvhiFqm96Gpw==", "HzGgN");
        llllIllll[lllllIllI[25]] = llIlIIllIIIl("CxYcfwDtUOc=", "zpjLc");
        llllIllll[lllllIllI[131]] = llIlIIllIIII("3MBeaHhoBIvlKfhB6769kQ==", "vimyE");
        llllIllll[lllllIllI[132]] = llIlIIllIIII("QRDrc4UNUe4=", "Apnjr");
        llllIllll[lllllIllI[133]] = llIlIIllIIlI("IiIiOA==", "mRGVY");
        llllIllll[lllllIllI[134]] = llIlIIllIIII("Uruq5Lp0INk=", "gMGLQ");
        llllIllll[lllllIllI[135]] = llIlIIllIIIl("T100m4XonAQ=", "EXYyp");
        llllIllll[lllllIllI[136]] = llIlIIllIIIl("w6C0pAhA5aE=", "WcYYp");
        llllIllll[lllllIllI[137]] = llIlIIllIIlI("FDchGQA=", "VEDxk");
        llllIllll[lllllIllI[140]] = llIlIIllIIII("Wn3QRdA/8cjoR9yV9W6gsclkrHs8x7De", "ljpUR");
        llllIllll[lllllIllI[141]] = llIlIIllIIIl("sewCLRRW8G2TsRbNwYAVizihdq0CrMYw/mvmkvmlluE=", "UrURh");
        llllIllll[lllllIllI[142]] = llIlIIllIIlI("MTwvJg4KeS8jDBt1bh1NCjg4MU0MNjo8BAw+biACQjEnMAhM", "bYNTm");
        llllIllll[lllllIllI[143]] = llIlIIllIIII("I+HzZoGqTKE=", "svwyL");
        llllIllll[lllllIllI[144]] = llIlIIllIIIl("A+6eR54xiSY=", "phtKQ");
        llllIllll[lllllIllI[145]] = llIlIIllIIlI("HTsZLBE4NQIv", "JTkAs");
        llllIllll[lllllIllI[146]] = llIlIIllIIlI("EiMJN3c3Kg02JA==", "PFlEW");
        llllIllll[lllllIllI[147]] = llIlIIllIIlI("CiQpB1IvLS0GAQ==", "HALur");
        llllIllll[lllllIllI[148]] = llIlIIllIIIl("2bu1SsNQ2+M=", "UjWhw");
        llllIllll[lllllIllI[155]] = llIlIIllIIlI("FAwHawY1TRwqCD8=", "ZmqKr");
        llllIllll[lllllIllI[156]] = llIlIIllIIlI("EDshJA==", "TTNVV");
        llllIllll[lllllIllI[157]] = llIlIIllIIlI("GCEQFg==", "WQuxy");
        llllIllll[lllllIllI[165]] = llIlIIllIIIl("UZ0U4ZSbQlx7yS5Uwl8Opw==", "IYelJ");
        llllIllll[lllllIllI[167]] = llIlIIllIIlI("BQM3Bg4v", "DwCgm");
        llllIllll[lllllIllI[168]] = llIlIIllIIII("0UP1+wu1M3s=", "FdbRv");
        llllIllll[lllllIllI[171]] = llIlIIllIIIl("Wtv1QkywfW+Uz8fSYPhp0A==", "emXKZ");
        llllIllll[lllllIllI[172]] = llIlIIllIIIl("5E24jyBDGhTolv7oFU3Zig==", "WkTUV");
        llllIllll[lllllIllI[173]] = llIlIIllIIII("s/D/CxZgfMc=", "LXALJ");
        llllIllll[lllllIllI[174]] = llIlIIllIIlI("MQ1tIwM=", "vbMVs");
        llllIllll[lllllIllI[175]] = llIlIIllIIII("d8/+X5Ymrpd0cyztiZfDig==", "AmxWc");
        llllIllll[lllllIllI[179]] = llIlIIllIIII("z89nQi7E2fnmxa2nrU2zKg==", "dDWXd");
        llllIllll[lllllIllI[181]] = llIlIIllIIII("DtuWRPdeCZQ=", "iyrJM");
        llllIllll[lllllIllI[182]] = llIlIIllIIlI("JSM7Eg==", "qBPwl");
        llllIllll[lllllIllI[185]] = llIlIIllIIlI("LSQedjkMZQckLA0iDXYpDCoa", "cEhVM");
        llllIllll[lllllIllI[186]] = llIlIIllIIlI("LgYwHxEEVDUeGRM=", "atQqv");
        llllIllll[lllllIllI[187]] = llIlIIllIIIl("FNVY0T1xxnk=", "EAiup");
        llllIllll[lllllIllI[188]] = llIlIIllIIII("cx0pIigzPv2sawukQFnS7g==", "atCnO");
        llllIllll[lllllIllI[190]] = llIlIIllIIII("MN7lJSORQDXWrS1BE03tLQ==", "ifubh");
        llllIllll[lllllIllI[192]] = llIlIIllIIlI("Eg0gECs4", "SyTqH");
        llllIllll[lllllIllI[193]] = llIlIIllIIII("1XrYyqgvr7g=", "xeQCI");
        llllIllll[lllllIllI[195]] = llIlIIllIIII("35sV/wKKDT+f7Dn2rvhJoqnMEoD/Ef35", "JyXGB");
        llllIllll[lllllIllI[196]] = llIlIIllIIII("aDqH07rY592Z91lTbbQ0nQ==", "MbxKj");
        llllIllll[lllllIllI[197]] = llIlIIllIIIl("qOXh6N+teRg=", "NvWCZ");
        llllIllll[lllllIllI[198]] = llIlIIllIIII("3dIL8y+3Jg8TDxSVlQgRig==", "iakIW");
        llllIllll[lllllIllI[201]] = llIlIIllIIlI("OwsNPRBVAwsnHA==", "xgdPr");
        llllIllll[lllllIllI[202]] = llIlIIllIIII("mkK+Q6+L+hhQnuiVaMScTQ==", "cwCGD");
        llllIllll[lllllIllI[208]] = llIlIIllIIII("a8HEmG3BJHNJBlYTew7RNbvxByJu0iaX", "yrBeR");
        llllIllll[lllllIllI[210]] = llIlIIllIIIl("gHt5TnZqWD8=", "VGkGD");
        llllIllll[lllllIllI[211]] = llIlIIllIIlI("HxUzAA==", "KtXez");
        llllIllll[lllllIllI[213]] = llIlIIllIIlI("DAIcTgUtQwgCBCdDDgEeMA==", "Bcjnq");
        llllIllll[lllllIllI[214]] = llIlIIllIIlI("CTYgFmsvNToB", "KZUsK");
        llllIllll[lllllIllI[215]] = llIlIIllIIlI("JBcyBg==", "kgWhO");
        llllIllll[lllllIllI[217]] = llIlIIllIIlI("Ni8NGy8fLVkEIwg=", "qJyoF");
        llllIllll[lllllIllI[219]] = llIlIIllIIIl("ZKPZe8/M5CA=", "NsqnV");
        llllIllll[lllllIllI[220]] = llIlIIllIIlI("NwYmPQ==", "cgMXd");
        llllIllll[lllllIllI[223]] = llIlIIllIIII("KGvCL4LvQFzePHnTkvyu6612chAYrNuu", "bJQmq");
        llllIllll[lllllIllI[224]] = llIlIIllIIII("ibTFRF8dNRfj4XlQk+ZxKA==", "JXqJs");
        llllIllll[lllllIllI[225]] = llIlIIllIIIl("NfMF8TOykf8=", "xckDg");
        llllIllll[lllllIllI[226]] = llIlIIllIIlI("PBEyFwYCVCUBDh8a", "ptAdc");
        llllIllll[lllllIllI[228]] = llIlIIllIIII("MIVJ51jicU4=", "xbBgc");
        llllIllll[lllllIllI[229]] = llIlIIllIIIl("T7zYnvrjkC0=", "xoBHp");
        llllIllll[lllllIllI[231]] = llIlIIllIIII("NPxnLa8/Ww3Kijy+8rUtVi7kra95si32", "ugERK");
        llllIllll[lllllIllI[232]] = llIlIIllIIlI("KzAwIS9MJjorMw==", "lBUDA");
        llllIllll[lllllIllI[233]] = llIlIIllIIIl("ABBLCutXjGs=", "IarQH");
        llllIllll[lllllIllI[234]] = llIlIIllIIII("9dqu8kVgTPA=", "cANCW");
        llllIllll[lllllIllI[235]] = llIlIIllIIIl("dkba6bNKRjE=", "nEMzX");
        llllIllll[lllllIllI[236]] = llIlIIllIIlI("JzEVMQcc", "tTtCd");
        llllIllll[lllllIllI[237]] = llIlIIllIIlI("Jgg1PTAd", "umTOS");
        llllIllll[lllllIllI[238]] = llIlIIllIIII("t8CkwPVSe4g=", "DwkOz");
        llllIllll[lllllIllI[239]] = llIlIIllIIIl("f+iug2b3tFo=", "IlbDe");
        llllIllll[lllllIllI[240]] = llIlIIllIIIl("cyjx1ONJdiPSnUvhm42YTQ==", "JfiIZ");
        llllIllll[lllllIllI[241]] = llIlIIllIIIl("mH8KkJy0PhW8diyeznjFSg==", "eMKyP");
        llllIllll[lllllIllI[242]] = llIlIIllIIII("8fdTmfEdvQ6HlMdItuM5t6IQEL/WrHZZQwxRA7HPoBA=", "pvflB");
        llllIllll[lllllIllI[243]] = llIlIIllIIIl("FsnpZ/njJQe2AiJw+hvp18LBq9jQIPh2g8J0WHl+wNW63n8wWPZeRw==", "rsBOY");
        llllIllll[lllllIllI[244]] = llIlIIllIIIl("Md0Ar7AzP40=", "BhGOa");
        llllIllll[lllllIllI[245]] = llIlIIllIIIl("Sag8upUv9NIO9sW6IxhL6Q==", "XyRtw");
        llllIllll[lllllIllI[246]] = llIlIIllIIIl("duq9HyWkNJjkXJq761PKPFNRBolRl6FG", "wFzFZ");
        llllIllll[lllllIllI[247]] = llIlIIllIIII("ebDGDp5B9rgCqv/jI2PusQ==", "yEoKA");
        llllIllll[lllllIllI[248]] = llIlIIllIIIl("Y7F/LmRbPTpxiRsCKHR+Ew==", "TQSql");
        llllIllll[lllllIllI[249]] = llIlIIllIIIl("+pTyjjdKbyg=", "GGSak");
        llllIllll[lllllIllI[250]] = llIlIIllIIlI("ERI6ICcqGS1hPSwbLw==", "CwJAU");
        llllIllll[lllllIllI[251]] = llIlIIllIIIl("Ex+gu0Q23S4=", "keOpH");
        llllIllll[lllllIllI[252]] = llIlIIllIIII("BRItpH9j0ZE=", "DHLeS");
        llllIllll[lllllIllI[253]] = llIlIIllIIlI("AwAQKBE9", "OatLt");
        llllIllll[lllllIllI[254]] = llIlIIllIIIl("7zcmFl+YhG7K8fFfhfx09w==", "UDhtW");
        llllIllll[lllllIllI[255]] = llIlIIllIIIl("Qsn1EFxB4nvHJ4Tr0E+wkw==", "TMHQE");
        llllIllll[lllllIllI[256]] = llIlIIllIIlI("Ah8m", "LzBbY");
        llllIllll[lllllIllI[257]] = llIlIIllIIII("J7uEgKK+8JFAXb12lEDTGw==", "nbNJS");
        llllIllll[lllllIllI[14]] = llIlIIllIIlI("BA49", "JkYkR");
        llllIllll[lllllIllI[72]] = llIlIIllIIII("asbZzGcCQwxqKyJYf7h1/w==", "fjsYa");
        llllIllll[lllllIllI[260]] = llIlIIllIIlI("CTQXQxEodQMMBDM=", "GUace");
        llllIllll[lllllIllI[261]] = llIlIIllIIIl("CWUQcSW4kHVmtZE0Jjox+Q==", "xLHgY");
        llllIllll[lllllIllI[262]] = llIlIIllIIIl("7B267S7Zoclpzx3ZAp9ArDedZnjyxscN4pFOPMEnkpo=", "jtnSv");
        llllIllll[lllllIllI[263]] = llIlIIllIIII("mf2OGE4ZnM49AMXPvGV91QSiqltvkrx5lxds2NAJpwRAXrR05YLSfg==", "xYMgi");
        llllIllll[lllllIllI[264]] = llIlIIllIIII("6OpNzpUVf5g=", "waeqU");
        llllIllll[lllllIllI[265]] = llIlIIllIIlI("CTsZKhwiOxkm", "NZwMl");
        llllIllll[lllllIllI[266]] = llIlIIllIIII("elz8eEyLtsw=", "sXwSA");
        llllIllll[lllllIllI[267]] = llIlIIllIIIl("I4l3xQ6uC4x8TzAWEP5URA==", "alTYg");
        llllIllll[lllllIllI[268]] = llIlIIllIIlI("NygGBA8dJ1Y+CxA=", "tIvpn");
        llllIllll[lllllIllI[272]] = llIlIIllIIIl("wdJstudEx95UQTQ0L6hWOA==", "ZtXhM");
        llllIllll[lllllIllI[273]] = llIlIIllIIIl("Pu5hpkjVjq4=", "nrIAv");
        llllIllll[lllllIllI[274]] = llIlIIllIIIl("d7izd2AMdn0=", "frwWH");
        llllIllll[lllllIllI[275]] = llIlIIllIIII("9MQNdgrbauQ=", "KPSwC");
        llllIllll[lllllIllI[277]] = llIlIIllIIIl("+ZCDCqX9jUbjfeLDpRgQRQ==", "oOkKP");
        llllIllll[lllllIllI[278]] = llIlIIllIIII("PD6nV00/M+NipsWfZ/q1FA==", "oBLzM");
        llllIllll[lllllIllI[279]] = llIlIIllIIIl("OT7TK0l2Ps8=", "waFIo");
        llllIllll[lllllIllI[280]] = llIlIIllIIIl("angL1c2hGEU=", "GkLiB");
        llllIllll[lllllIllI[281]] = llIlIIllIIIl("f/WbSooAAfU=", "ItCmM");
        llllIllll[lllllIllI[282]] = llIlIIllIIIl("kgtkjpDcIJc=", "uzKuf");
        llllIllll[lllllIllI[283]] = llIlIIllIIII("Q5XI11odBObxa67DE/owbQ==", "LbhGP");
        llllIllll[lllllIllI[284]] = llIlIIllIIII("oEvZwpCCDF8zZWQDHXrkhsCTwX3lD2Yt", "GWwmN");
        llllIllll[lllllIllI[285]] = llIlIIllIIII("ZtExUgKgcFk=", "QyKfG");
        llllIllll[lllllIllI[286]] = llIlIIllIIIl("x4QG1MmFocU=", "qPlAQ");
        llllIllll[lllllIllI[287]] = llIlIIllIIlI("HDAbIg==", "XBtRS");
        llllIllll[lllllIllI[288]] = llIlIIllIIII("oxnYjvVpdpU=", "wfzrV");
        llllIllll[lllllIllI[289]] = llIlIIllIIIl("1uxXrhiKg2s=", "KHaVL");
        llllIllll[lllllIllI[290]] = llIlIIllIIlI("ATkkKR8=", "EKMGt");
        llllIllll[lllllIllI[292]] = llIlIIllIIlI("CD0lIgQ=", "LOLLo");
        llllIllll[lllllIllI[293]] = llIlIIllIIlI("ExwuNic5", "RhZWD");
        llllIllll[lllllIllI[295]] = llIlIIllIIIl("KIxWKGjgbLwNwNK9eB/x8g==", "VZNYJ");
        llllIllll[lllllIllI[296]] = llIlIIllIIlI("Gh4gEDE9", "UdIqR");
        llllIllll[lllllIllI[297]] = llIlIIllIIlI("DQ87MQ==", "ZjZCI");
        llllIllll[lllllIllI[298]] = llIlIIllIIlI("KwMsLz4HA20sOxg=", "hqMAZ");
        llllIllll[lllllIllI[299]] = llIlIIllIIII("TIE6Am3V18c=", "fnIpf");
        llllIllll[lllllIllI[300]] = llIlIIllIIIl("CX9jStwBEVs=", "vbpiR");
        llllIllll[lllllIllI[301]] = llIlIIllIIlI("LCcTRD4NZgcFJAk=", "bFedJ");
        llllIllll[lllllIllI[302]] = llIlIIllIIlI("MDQgFTUROylROxk7JRg3Hw==", "xUNqY");
        llllIllll[lllllIllI[303]] = llIlIIllIIlI("Ki0PaiILbBsrOA8=", "dLyJV");
        llllIllll[lllllIllI[304]] = llIlIIllIIlI("GjMqAA07PCNEAzM8Lw0PNQ==", "RRDda");
        llllIllll[lllllIllI[306]] = llIlIIllIIII("1JaFYpzEF5QLOEe8bo4s8Q==", "zGpAK");
        llllIllll[lllllIllI[307]] = llIlIIllIIlI("GDgeNAQ5NxdwCjE3GzkGNw==", "PYpPh");
        llllIllll[lllllIllI[308]] = llIlIIllIIII("n0yfoGLYjlweC+ZkH7rAXQ==", "ZDyHc");
        llllIllll[lllllIllI[315]] = llIlIIllIIII("zuPM7b1GazYpINg3FOpjVjhEzfvdW47m", "uLgic");
        llllIllll[lllllIllI[316]] = llIlIIllIIlI("PBEqN28hHmQnKi8UMDhvZg==", "NxDPO");
        llllIllll[lllllIllI[317]] = llIlIIllIIIl("PTn/tPz/8vLkKSJv9lynoA==", "ZYHKq");
        llllIllll[lllllIllI[318]] = llIlIIllIIII("aP6v5IFX1TJV/bK2J6Poew==", "gmtoU");
        llllIllll[lllllIllI[319]] = llIlIIllIIlI("ND48Mw8j", "WQQQn");
        llllIllll[lllllIllI[320]] = llIlIIllIIIl("EDHFlCesFoU=", "ULCHF");
        llllIllll[lllllIllI[321]] = llIlIIllIIIl("a3t8QjvCgo4gyXdZyiyApQ==", "BSOuh");
        llllIllll[lllllIllI[322]] = llIlIIllIIII("emshe3xFMobM5+mNHdYBzw==", "bezPM");
        llllIllll[lllllIllI[323]] = llIlIIllIIIl("0Fo8iu+gU3c=", "IRBnV");
        llllIllll[lllllIllI[324]] = llIlIIllIIlI("KxIKIhI=", "hzoQf");
        llllIllll[lllllIllI[325]] = llIlIIllIIlI("IhwdCwod", "xspic");
        llllIllll[lllllIllI[326]] = llIlIIllIIlI("HikQNyMg", "RHtSF");
        llllIllll[lllllIllI[327]] = llIlIIllIIIl("D6HwfxJ2QFGkrIn5PK7gkQ==", "ziyJf");
        llllIllll[lllllIllI[328]] = llIlIIllIIII("DlYKtstlY1w=", "PcziK");
        llllIllll[lllllIllI[329]] = llIlIIllIIIl("owzU9mZhQ5AeRtj28GBlNA==", "VVpaU");
        llllIllll[lllllIllI[330]] = llIlIIllIIlI("BDI1ACc6", "HSQdB");
        llllIllll[lllllIllI[331]] = llIlIIllIIlI("Cik9PgotLTY=", "YBXRo");
        llllIllll[lllllIllI[332]] = llIlIIllIIIl("SzHGD8jfrYo=", "QGzfY");
        llllIllll[lllllIllI[333]] = llIlIIllIIII("MwsPwMe43RU=", "mymsH");
        llllIllll[lllllIllI[334]] = llIlIIllIIIl("eHNI3zfPAqQ=", "EnfWn");
        llllIllll[lllllIllI[335]] = llIlIIllIIIl("lo0LKqZSz6Q=", "ZhIOb");
        llllIllll[lllllIllI[336]] = llIlIIllIIlI("EhQHJzwN", "eqfKH");
        llllIllll[lllllIllI[337]] = llIlIIllIIII("kOMdOt8oLAA=", "hamqR");
        llllIllll[lllllIllI[338]] = llIlIIllIIlI("BB4dOSE=", "crrKX");
        llllIllll[lllllIllI[339]] = llIlIIllIIlI("NRoJFg0=", "Rvfdt");
        llllIllll[lllllIllI[340]] = llIlIIllIIII("FYkc2Rr8gwk=", "orFrL");
        llllIllll[lllllIllI[349]] = llIlIIllIIIl("A0t/LhaRwvq1QcbTKEf5ddAbhmoKGpzE", "xJyVf");
        llllIllll[lllllIllI[350]] = llIlIIllIIlI("EgMXTA==", "KfdbS");
        llllIllll[lllllIllI[351]] = llIlIIllIIIl("yKYwx4K5a/l7cO/OZFBVxDorGVAoDfYoYFY+vQ/tmHYDREbpcy1oFg==", "SoLgh");
        llllIllll[lllllIllI[352]] = llIlIIllIIlI("HC0tSjI9LCQOGCk2PA8HaCouSgEgIGgpHSkoOAMaJjZvSjI9LCQOVTwqJA5VJSBm", "HEHju");
        llllIllll[lllllIllI[353]] = llIlIIllIIIl("FAtd9cviYQGYR3MoB7WU2Yy2HCf6MXbC6u9LOkXY3ZD+VDAegqu1u/MtDIGQXlpm", "aASzt");
        llllIllll[lllllIllI[354]] = llIlIIllIIIl("boEfCOlnRmZdsdVBOlPVDFBxUbgOxG13e9eXIXyi6rk=", "uGBgY");
        llllIllll[lllllIllI[355]] = llIlIIllIIII("Jw9FAd2JP+DrQKRnzOjOE/1mtPWPmfe2", "HajeN");
        llllIllll[lllllIllI[356]] = llIlIIllIIII("VVaAeBWmKo3sAC2CFrpnW02b90JBzK23LcVW8EY5aflJfs+bSxqG+Q==", "kYKLX");
        llllIllll[lllllIllI[357]] = llIlIIllIIIl("ddoYCy7UppLADl19hN+n9GKdlwvYko3MqzhcJmRLS2tGcj4eVDFa8OQblg5L8ZET9Dw87nNu3ss=", "sKVxz");
        llllIllll[lllllIllI[358]] = llIlIIllIIlI("ClozIiAqHycibDoVJGA6Jlo2KDhjG3E3JSYZNGcjJVo8JjxjDjkmOGMzcSkpJh5/", "CzQGL");
        llllIllll[lllllIllI[359]] = llIlIIllIIIl("O5sk4yaukafozhzGpPcEV37CreZdaR60rhaxb/o9o40Cb+lZPDBqIilTErRCIKNX", "zucfG");
        llllIllll[lllllIllI[360]] = llIlIIllIIII("tpF8+1Q0MehE10GljhA4v/ie9FqpxEzmXiPngn+ytiU=", "vlhAb");
        llllIllll[lllllIllI[361]] = llIlIIllIIlI("AVIGeB4hHgd4BidVAC0LaB0HKlw=", "HubXr");
        llllIllll[lllllIllI[362]] = llIlIIllIIIl("glGcsTmZIdEew29AF/bRTB7dSabPJBUS", "qrFgl");
        llllIllll[lllllIllI[363]] = llIlIIllIIlI("FAglYSooRzFmKywOPCkqckcTKS0hA3A/NzhHJCczKEc9I3g5CHAFKiwJNCkqcg==", "MgPFX");
        llllIllll[lllllIllI[364]] = llIlIIllIIlI("KQ4XZ1AcDhBsA1AMC2o=", "pkdKp");
    }

    private static boolean llIlIllIIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllllIllI[0];
    }

    private static boolean llIlIllIIlII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlIlIllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIlllII(int i) {
        return i == 0;
    }

    private static String llIlIIllIIII(String lIlIllIllIIlI, String lIlIllIllIIIl) {
        try {
            SecretKeySpec lIlIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIllIIIl.getBytes(StandardCharsets.UTF_8)), lllllIllI[16]), "DES");
            Cipher lIlIllIllIlII = Cipher.getInstance("DES");
            lIlIllIllIlII.init(lllllIllI[2], lIlIllIllIlIl);
            return new String(lIlIllIllIlII.doFinal(Base64.getDecoder().decode(lIlIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIlllI) {
            lIlIllIlIlllI.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cW();
            "".length();
            if ("   ".length() == ((22 ^ 89) ^ (35 ^ 104))) {
                return ((80 ^ 50) ^ (37 ^ 29)) & (((16 ^ 63) ^ (78 ^ 59)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllllIllI[142];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llllIllll[lllllIllI[315]];
    }

    private static boolean llIlIllIIIll(int i, int i2) {
        return i == i2;
    }
}
