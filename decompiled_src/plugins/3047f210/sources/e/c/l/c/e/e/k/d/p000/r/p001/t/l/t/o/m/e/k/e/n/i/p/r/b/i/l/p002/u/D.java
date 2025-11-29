package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.D  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/D.class */
public class D implements S {
    public static /* synthetic */ List<C0003d> bu;
    private static /* synthetic */ int[] llllIlIlII;
    static /* synthetic */ boolean gT;
    static /* synthetic */ boolean gR;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ WorldPoint gP;
    private static /* synthetic */ String[] llllIIllII;
    public static final /* synthetic */ WorldPoint gO;
    static /* synthetic */ boolean gU;
    public static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint gQ;
    static /* synthetic */ boolean gS;
    public static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ int ck;

    private static boolean llIIllllllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIllIllIIlI(String lllllllllllllllllIlIlIllIlIIlllI, String lllllllllllllllllIlIlIllIlIIllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIllIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlII[2], lllllllllllllllllIlIlIllIlIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIllIlIIllll) {
            lllllllllllllllllIlIlIllIlIIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIlIlII[9]];
        iArr[llllIlIlII[0]] = llllIlIlII[19];
        iArr[llllIlIlII[1]] = llllIlIlII[37];
        iArr[llllIlIlII[2]] = llllIlIlII[46];
        iArr[llllIlIlII[7]] = llllIlIlII[39];
        int i = llllIlIlII[0];
        while (llIIllllIllIl(i, iArr.length)) {
            int[] iArr2 = new int[llllIlIlII[1]];
            iArr2[llllIlIlII[0]] = iArr[i];
            if (llIIllllIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llllIlIlII[0];
            }
            i++;
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllIlIlII[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[63]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028a, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[25]) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a0, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[23]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0526, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[23]) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05ea, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[20]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[7]) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0674, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[20]) != false) goto L87;
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
    private static void ae() {
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
        int[] iArr18 = new int[llllIlIlII[1]];
        iArr18[llllIlIlII[0]] = llllIlIlII[27];
        if (llIIllllIllII(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llllIlIlII[1]];
            iArr19[llllIlIlII[0]] = llllIlIlII[27];
            if (llIIllllIllII(Bank.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llllIlIlII[1]];
                iArr20[llllIlIlII[0]] = llllIlIlII[27];
            }
            iArr = new int[llllIlIlII[1]];
            iArr[llllIlIlII[0]] = llllIlIlII[35];
            if (llIIllllIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr21 = new int[llllIlIlII[1]];
                iArr21[llllIlIlII[0]] = llllIlIlII[35];
                if (llIIllllIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llllIlIlII[1]];
                    iArr22[llllIlIlII[0]] = llllIlIlII[35];
                }
                iArr2 = new int[llllIlIlII[1]];
                iArr2[llllIlIlII[0]] = llllIlIlII[39];
                if (llIIllllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlII[39], llllIlIlII[1], llllIlIlII[310]));
                    "".length();
                }
                iArr3 = new int[llllIlIlII[1]];
                iArr3[llllIlIlII[0]] = llllIlIlII[41];
                if (llIIllllIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlII[41], llllIlIlII[1], llllIlIlII[311]));
                    "".length();
                }
                iArr4 = new int[llllIlIlII[1]];
                iArr4[llllIlIlII[0]] = llllIlIlII[44];
                if (llIIllllIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlII[44], llllIlIlII[1], llllIlIlII[312]));
                    "".length();
                }
                iArr5 = new int[llllIlIlII[1]];
                iArr5[llllIlIlII[0]] = llllIlIlII[42];
                if (llIIllllIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                    bu.add(new C0003d(llllIlIlII[42], llllIlIlII[7], llllIlIlII[310]));
                    "".length();
                }
                iArr6 = new int[llllIlIlII[1]];
                iArr6[llllIlIlII[0]] = llllIlIlII[24];
                if (llIIllllIllII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr23 = new int[llllIlIlII[1]];
                    iArr23[llllIlIlII[0]] = llllIlIlII[24];
                    if (llIIllllIllII(Bank.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[llllIlIlII[1]];
                        iArr24[llllIlIlII[0]] = llllIlIlII[24];
                    }
                    iArr7 = new int[llllIlIlII[1]];
                    iArr7[llllIlIlII[0]] = llllIlIlII[36];
                    if (llIIllllIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[36], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr8 = new int[llllIlIlII[1]];
                    iArr8[llllIlIlII[0]] = llllIlIlII[34];
                    if (llIIllllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[34], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr9 = new int[llllIlIlII[1]];
                    iArr9[llllIlIlII[0]] = llllIlIlII[33];
                    if (llIIllllIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[33], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr10 = new int[llllIlIlII[1]];
                    iArr10[llllIlIlII[0]] = llllIlIlII[32];
                    if (llIIllllIlllI(Bank.contains(iArr10) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[32], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr11 = new int[llllIlIlII[1]];
                    iArr11[llllIlIlII[0]] = llllIlIlII[30];
                    if (llIIllllIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[30], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr12 = new int[llllIlIlII[1]];
                    iArr12[llllIlIlII[0]] = llllIlIlII[31];
                    if (llIIllllIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                        bu.add(new C0003d(llllIlIlII[31], llllIlIlII[1], C0008i.bp));
                        "".length();
                    }
                    iArr13 = new int[llllIlIlII[1]];
                    iArr13[llllIlIlII[0]] = llllIlIlII[37];
                    if (llIIllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr25 = new int[llllIlIlII[1]];
                        iArr25[llllIlIlII[0]] = llllIlIlII[37];
                        if (llIIllllIllII(Bank.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[llllIlIlII[1]];
                            iArr26[llllIlIlII[0]] = llllIlIlII[37];
                        }
                        iArr14 = new int[llllIlIlII[1]];
                        iArr14[llllIlIlII[0]] = llllIlIlII[45];
                        if (llIIllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr27 = new int[llllIlIlII[1]];
                            iArr27[llllIlIlII[0]] = llllIlIlII[45];
                            if (llIIllllIllII(Bank.contains(iArr27) ? 1 : 0)) {
                                int[] iArr28 = new int[llllIlIlII[1]];
                                iArr28[llllIlIlII[0]] = llllIlIlII[45];
                            }
                            if (llIIllllIlllI(Bank.contains(item -> {
                                return item.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
                            }) ? 1 : 0)) {
                                bu.add(new C0003d(llllIlIlII[313], llllIlIlII[11], llllIlIlII[311]));
                                "".length();
                            }
                            iArr15 = new int[llllIlIlII[1]];
                            iArr15[llllIlIlII[0]] = llllIlIlII[19];
                            if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr29 = new int[llllIlIlII[1]];
                                iArr29[llllIlIlII[0]] = llllIlIlII[19];
                                if (llIIllllIllII(Bank.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[llllIlIlII[1]];
                                    iArr30[llllIlIlII[0]] = llllIlIlII[19];
                                }
                                iArr16 = new int[llllIlIlII[1]];
                                iArr16[llllIlIlII[0]] = llllIlIlII[22];
                                if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                                    int[] iArr31 = new int[llllIlIlII[1]];
                                    iArr31[llllIlIlII[0]] = llllIlIlII[22];
                                    if (llIIllllIllII(Bank.contains(iArr31) ? 1 : 0)) {
                                        int[] iArr32 = new int[llllIlIlII[1]];
                                        iArr32[llllIlIlII[0]] = llllIlIlII[22];
                                    }
                                    iArr17 = new int[llllIlIlII[1]];
                                    iArr17[llllIlIlII[0]] = llllIlIlII[21];
                                    if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                                        int[] iArr33 = new int[llllIlIlII[1]];
                                        iArr33[llllIlIlII[0]] = llllIlIlII[21];
                                        if (!llIIllllIllII(Bank.contains(iArr33) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr34 = new int[llllIlIlII[1]];
                                        iArr34[llllIlIlII[0]] = llllIlIlII[21];
                                        if (!llIIllllIllIl(Bank.getFirst(iArr34).getQuantity(), llllIlIlII[20])) {
                                            return;
                                        }
                                    }
                                    bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                                    "".length();
                                }
                                bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
                                "".length();
                                iArr17 = new int[llllIlIlII[1]];
                                iArr17[llllIlIlII[0]] = llllIlIlII[21];
                                if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                                }
                                bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                                "".length();
                            }
                            bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
                            "".length();
                            iArr16 = new int[llllIlIlII[1]];
                            iArr16[llllIlIlII[0]] = llllIlIlII[22];
                            if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
                            "".length();
                            iArr17 = new int[llllIlIlII[1]];
                            iArr17[llllIlIlII[0]] = llllIlIlII[21];
                            if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                            }
                            bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                            "".length();
                        }
                        bu.add(new C0003d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]));
                        "".length();
                        if (llIIllllIlllI(Bank.contains(item2 -> {
                            return item2.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
                        }) ? 1 : 0)) {
                        }
                        iArr15 = new int[llllIlIlII[1]];
                        iArr15[llllIlIlII[0]] = llllIlIlII[19];
                        if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
                        "".length();
                        iArr16 = new int[llllIlIlII[1]];
                        iArr16[llllIlIlII[0]] = llllIlIlII[22];
                        if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
                        "".length();
                        iArr17 = new int[llllIlIlII[1]];
                        iArr17[llllIlIlII[0]] = llllIlIlII[21];
                        if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                        }
                        bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                        "".length();
                    }
                    bu.add(new C0003d(llllIlIlII[37], llllIlIlII[23], C0008i.bp));
                    "".length();
                    iArr14 = new int[llllIlIlII[1]];
                    iArr14[llllIlIlII[0]] = llllIlIlII[45];
                    if (llIIllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]));
                    "".length();
                    if (llIIllllIlllI(Bank.contains(item22 -> {
                        return item22.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
                    }) ? 1 : 0)) {
                    }
                    iArr15 = new int[llllIlIlII[1]];
                    iArr15[llllIlIlII[0]] = llllIlIlII[19];
                    if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
                    "".length();
                    iArr16 = new int[llllIlIlII[1]];
                    iArr16[llllIlIlII[0]] = llllIlIlII[22];
                    if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
                    "".length();
                    iArr17 = new int[llllIlIlII[1]];
                    iArr17[llllIlIlII[0]] = llllIlIlII[21];
                    if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                    "".length();
                }
                bu.add(new C0003d(llllIlIlII[24], llllIlIlII[25], llllIlIlII[309]));
                "".length();
                iArr7 = new int[llllIlIlII[1]];
                iArr7[llllIlIlII[0]] = llllIlIlII[36];
                if (llIIllllIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[llllIlIlII[1]];
                iArr8[llllIlIlII[0]] = llllIlIlII[34];
                if (llIIllllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[llllIlIlII[1]];
                iArr9[llllIlIlII[0]] = llllIlIlII[33];
                if (llIIllllIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[llllIlIlII[1]];
                iArr10[llllIlIlII[0]] = llllIlIlII[32];
                if (llIIllllIlllI(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llllIlIlII[1]];
                iArr11[llllIlIlII[0]] = llllIlIlII[30];
                if (llIIllllIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[llllIlIlII[1]];
                iArr12[llllIlIlII[0]] = llllIlIlII[31];
                if (llIIllllIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[llllIlIlII[1]];
                iArr13[llllIlIlII[0]] = llllIlIlII[37];
                if (llIIllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIlIlII[37], llllIlIlII[23], C0008i.bp));
                "".length();
                iArr14 = new int[llllIlIlII[1]];
                iArr14[llllIlIlII[0]] = llllIlIlII[45];
                if (llIIllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]));
                "".length();
                if (llIIllllIlllI(Bank.contains(item222 -> {
                    return item222.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
                }) ? 1 : 0)) {
                }
                iArr15 = new int[llllIlIlII[1]];
                iArr15[llllIlIlII[0]] = llllIlIlII[19];
                if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
                "".length();
                iArr16 = new int[llllIlIlII[1]];
                iArr16[llllIlIlII[0]] = llllIlIlII[22];
                if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
                "".length();
                iArr17 = new int[llllIlIlII[1]];
                iArr17[llllIlIlII[0]] = llllIlIlII[21];
                if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                }
                bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
                "".length();
            }
            bu.add(new C0003d(llllIlIlII[35], llllIlIlII[63], llllIlIlII[309]));
            "".length();
            iArr2 = new int[llllIlIlII[1]];
            iArr2[llllIlIlII[0]] = llllIlIlII[39];
            if (llIIllllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llllIlIlII[1]];
            iArr3[llllIlIlII[0]] = llllIlIlII[41];
            if (llIIllllIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llllIlIlII[1]];
            iArr4[llllIlIlII[0]] = llllIlIlII[44];
            if (llIIllllIlllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llllIlIlII[1]];
            iArr5[llllIlIlII[0]] = llllIlIlII[42];
            if (llIIllllIlllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llllIlIlII[1]];
            iArr6[llllIlIlII[0]] = llllIlIlII[24];
            if (llIIllllIllII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[24], llllIlIlII[25], llllIlIlII[309]));
            "".length();
            iArr7 = new int[llllIlIlII[1]];
            iArr7[llllIlIlII[0]] = llllIlIlII[36];
            if (llIIllllIlllI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[llllIlIlII[1]];
            iArr8[llllIlIlII[0]] = llllIlIlII[34];
            if (llIIllllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[llllIlIlII[1]];
            iArr9[llllIlIlII[0]] = llllIlIlII[33];
            if (llIIllllIlllI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[llllIlIlII[1]];
            iArr10[llllIlIlII[0]] = llllIlIlII[32];
            if (llIIllllIlllI(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llllIlIlII[1]];
            iArr11[llllIlIlII[0]] = llllIlIlII[30];
            if (llIIllllIlllI(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[llllIlIlII[1]];
            iArr12[llllIlIlII[0]] = llllIlIlII[31];
            if (llIIllllIlllI(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[llllIlIlII[1]];
            iArr13[llllIlIlII[0]] = llllIlIlII[37];
            if (llIIllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[37], llllIlIlII[23], C0008i.bp));
            "".length();
            iArr14 = new int[llllIlIlII[1]];
            iArr14[llllIlIlII[0]] = llllIlIlII[45];
            if (llIIllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]));
            "".length();
            if (llIIllllIlllI(Bank.contains(item2222 -> {
                return item2222.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
            }) ? 1 : 0)) {
            }
            iArr15 = new int[llllIlIlII[1]];
            iArr15[llllIlIlII[0]] = llllIlIlII[19];
            if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
            "".length();
            iArr16 = new int[llllIlIlII[1]];
            iArr16[llllIlIlII[0]] = llllIlIlII[22];
            if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
            "".length();
            iArr17 = new int[llllIlIlII[1]];
            iArr17[llllIlIlII[0]] = llllIlIlII[21];
            if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
            }
            bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
            "".length();
        }
        bu.add(new C0003d(llllIlIlII[27], llllIlIlII[7], llllIlIlII[309]));
        "".length();
        iArr = new int[llllIlIlII[1]];
        iArr[llllIlIlII[0]] = llllIlIlII[35];
        if (llIIllllIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[35], llllIlIlII[63], llllIlIlII[309]));
        "".length();
        iArr2 = new int[llllIlIlII[1]];
        iArr2[llllIlIlII[0]] = llllIlIlII[39];
        if (llIIllllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllIlIlII[1]];
        iArr3[llllIlIlII[0]] = llllIlIlII[41];
        if (llIIllllIlllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llllIlIlII[1]];
        iArr4[llllIlIlII[0]] = llllIlIlII[44];
        if (llIIllllIlllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llllIlIlII[1]];
        iArr5[llllIlIlII[0]] = llllIlIlII[42];
        if (llIIllllIlllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llllIlIlII[1]];
        iArr6[llllIlIlII[0]] = llllIlIlII[24];
        if (llIIllllIllII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[24], llllIlIlII[25], llllIlIlII[309]));
        "".length();
        iArr7 = new int[llllIlIlII[1]];
        iArr7[llllIlIlII[0]] = llllIlIlII[36];
        if (llIIllllIlllI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[llllIlIlII[1]];
        iArr8[llllIlIlII[0]] = llllIlIlII[34];
        if (llIIllllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[llllIlIlII[1]];
        iArr9[llllIlIlII[0]] = llllIlIlII[33];
        if (llIIllllIlllI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[llllIlIlII[1]];
        iArr10[llllIlIlII[0]] = llllIlIlII[32];
        if (llIIllllIlllI(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llllIlIlII[1]];
        iArr11[llllIlIlII[0]] = llllIlIlII[30];
        if (llIIllllIlllI(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[llllIlIlII[1]];
        iArr12[llllIlIlII[0]] = llllIlIlII[31];
        if (llIIllllIlllI(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[llllIlIlII[1]];
        iArr13[llllIlIlII[0]] = llllIlIlII[37];
        if (llIIllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[37], llllIlIlII[23], C0008i.bp));
        "".length();
        iArr14 = new int[llllIlIlII[1]];
        iArr14[llllIlIlII[0]] = llllIlIlII[45];
        if (llIIllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[45], llllIlIlII[23], llllIlIlII[47]));
        "".length();
        if (llIIllllIlllI(Bank.contains(item22222 -> {
            return item22222.getName().toLowerCase().contains(llllIIllII[llllIlIlII[316]]);
        }) ? 1 : 0)) {
        }
        iArr15 = new int[llllIlIlII[1]];
        iArr15[llllIlIlII[0]] = llllIlIlII[19];
        if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[19], llllIlIlII[10], llllIlIlII[314]));
        "".length();
        iArr16 = new int[llllIlIlII[1]];
        iArr16[llllIlIlII[0]] = llllIlIlII[22];
        if (llIIllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[22], llllIlIlII[10], llllIlIlII[314]));
        "".length();
        iArr17 = new int[llllIlIlII[1]];
        iArr17[llllIlIlII[0]] = llllIlIlII[21];
        if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIlIlII[21], llllIlIlII[10], llllIlIlII[314]));
        "".length();
    }

    private static boolean llIIlllllIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIllllIllII(int i) {
        return i != 0;
    }

    private static void ci() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIlllllIIlI(nearest) && llIIllllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[306]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llllIlIlII[2]);
            "".length();
        }
        if (llIIlllllIIlI(nearest) && llIIllllIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[307]];
            if (llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIlIlII[18]);
                "".length();
            }
            if (llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIlIlII[9]);
                    "".length();
                }
                C0000a.a(llllIlIlII[19], llllIlIlII[11]);
                C0000a.a(llllIlIlII[22], llllIlIlII[11]);
                C0000a.a(llllIlIlII[21], llllIlIlII[11]);
                C0000a.b(C0005f.aU, llllIlIlII[2]);
                C0000a.a(llllIlIlII[45], llllIlIlII[7]);
                C0000a.a(llllIlIlII[33], llllIlIlII[1]);
                C0000a.a(llllIlIlII[32], llllIlIlII[1]);
                C0000a.a(llllIlIlII[30], llllIlIlII[1]);
                C0000a.a(llllIlIlII[31], llllIlIlII[1]);
                C0000a.a(llllIlIlII[46], llllIlIlII[47]);
                Bank.withdraw(llllIIllII[llllIlIlII[308]], llllIlIlII[1], Bank.WithdrawMode.ITEM);
                int[] iArr = new int[llllIlIlII[1]];
                iArr[llllIlIlII[0]] = llllIlIlII[36];
                if (llIIllllIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllIlIlII[1]];
                    iArr2[llllIlIlII[0]] = llllIlIlII[36];
                    if (llIIllllIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llllIlIlII[36], llllIlIlII[1], Bank.WithdrawMode.ITEM);
                    }
                }
                C0000a.a(llllIlIlII[35], Inventory.getFreeSlots());
            }
        }
    }

    private static boolean llIIlllllIIlI(Object obj) {
        return obj != null;
    }

    private static String llIIllIllIlII(String lllllllllllllllllIlIlIllIIlllllI, String lllllllllllllllllIlIlIllIIllllIl) {
        String lllllllllllllllllIlIlIllIIlllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIllIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIlIllIIlllIll = lllllllllllllllllIlIlIllIIllllIl.toCharArray();
        int lllllllllllllllllIlIlIllIIlllIlI = llllIlIlII[0];
        char[] charArray = lllllllllllllllllIlIlIllIIlllllI2.toCharArray();
        int lllllllllllllllllIlIlIllIIllIIll = charArray.length;
        int i = llllIlIlII[0];
        while (llIIllllIllIl(i, lllllllllllllllllIlIlIllIIllIIll)) {
            char lllllllllllllllllIlIlIllIIllIIIl = charArray[i];
            sb.append((char) (lllllllllllllllllIlIlIllIIllIIIl ^ lllllllllllllllllIlIlIllIIlllIll[lllllllllllllllllIlIlIllIIlllIlI % lllllllllllllllllIlIlIllIIlllIll.length]));
            "".length();
            lllllllllllllllllIlIlIllIIlllIlI++;
            i++;
            "".length();
            if (((((112 + 115) - 132) + 53) ^ (((116 + 102) - 112) + 38)) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlllllIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x099b, code lost:
        if (llIIllllIlllI(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.gU ? 1 : 0) != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b2f, code lost:
        if (llIIllllIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0325, code lost:
        if (llIIlllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[20]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0368, code lost:
        if (llIIlllllIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[20]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ab, code lost:
        if (llIIllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[20]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03ae, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIIllII[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[23]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.D.llllIlIlII[1];
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
    public static void cf() {
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
        if (llIIllllIllII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[0]];
            C0001b.a(bu);
            if (llIIllllIllIl(bu.size(), llllIlIlII[1])) {
                System.out.println(llllIIllII[llllIlIlII[1]]);
                bs = llllIlIlII[0];
            }
        }
        if (llIIllllIlllI(bs ? 1 : 0)) {
            String[] strArr11 = new String[llllIlIlII[1]];
            strArr11[llllIlIlII[0]] = llllIIllII[llllIlIlII[2]];
            if (llIIllllIllII(Inventory.contains(strArr11) ? 1 : 0)) {
                gU = llllIlIlII[1];
                gT = llllIlIlII[1];
                gR = llllIlIlII[1];
                gS = llllIlIlII[1];
            }
            int[] iArr8 = new int[llllIlIlII[1]];
            iArr8[llllIlIlII[0]] = llllIlIlII[3];
            if (llIIllllIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                gT = llllIlIlII[1];
            }
            int[] iArr9 = new int[llllIlIlII[1]];
            iArr9[llllIlIlII[0]] = llllIlIlII[4];
            if (llIIllllIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                gR = llllIlIlII[1];
            }
            int[] iArr10 = new int[llllIlIlII[1]];
            iArr10[llllIlIlII[0]] = llllIlIlII[5];
            if (llIIllllIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                gS = llllIlIlII[1];
            }
            if (llIIllllIllII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIllllIllIl(Movement.getRunEnergy(), llllIlIlII[6])) {
                Inventory.getFirst(C0005f.aU).interact(llllIIllII[llllIlIlII[7]]);
                Time.sleepTicks(llllIlIlII[1]);
                "".length();
            }
            if (llIIllllIllII(Inventory.contains(C0005f.aR) ? 1 : 0) && llIIllllIllIl(Prayers.getPoints(), llllIlIlII[8])) {
                Inventory.getFirst(C0005f.aR).interact(llllIIllII[llllIlIlII[9]]);
            }
            if (!llIIllllIllIl(Combat.getMissingHealth(), llllIlIlII[10]) || llIIllllIllll(llIIllllIlIll(C0004e.u(), 51.0d))) {
                String[] strArr12 = new String[llllIlIlII[1]];
                strArr12[llllIlIlII[0]] = llllIIllII[llllIlIlII[11]];
                if (llIIllllIllII(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[llllIlIlII[1]];
                    strArr13[llllIlIlII[0]] = llllIIllII[llllIlIlII[12]];
                    Inventory.getFirst(strArr13).interact(llllIIllII[llllIlIlII[13]]);
                }
            }
            if (llIIllllIlllI(Movement.isRunEnabled() ? 1 : 0) && llIIlllllIIII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIIllllIlllI(aa() ? 1 : 0) && llIIllllIllIl(C0004e.j(llllIlIlII[14]), llllIlIlII[2]) && llIIlllllIIIl(C0004e.H(), llllIlIlII[15])) {
                BankLocation nearest4 = BankLocation.getNearest();
                if (llIIlllllIIlI(nearest4) && llIIllllIlllI(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[16]];
                    Movement.walkTo(nearest4);
                    "".length();
                    Time.sleepTicks(llllIlIlII[2]);
                    "".length();
                }
                if (llIIlllllIIlI(nearest4) && llIIllllIllII(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[17]];
                    if (llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIlIlII[18]);
                        "".length();
                    }
                    if (llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlllllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIlIlII[9]);
                            "".length();
                        }
                        if (llIIlllllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIlIlII[2]);
                            "".length();
                        }
                        int[] iArr11 = new int[llllIlIlII[1]];
                        iArr11[llllIlIlII[0]] = llllIlIlII[19];
                        if (llIIllllIllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llllIlIlII[1]];
                            iArr12[llllIlIlII[0]] = llllIlIlII[19];
                        }
                        int[] iArr13 = new int[llllIlIlII[1]];
                        iArr13[llllIlIlII[0]] = llllIlIlII[21];
                        if (llIIllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[llllIlIlII[1]];
                            iArr14[llllIlIlII[0]] = llllIlIlII[21];
                        }
                        int[] iArr15 = new int[llllIlIlII[1]];
                        iArr15[llllIlIlII[0]] = llllIlIlII[22];
                        if (llIIllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[llllIlIlII[1]];
                            iArr16[llllIlIlII[0]] = llllIlIlII[22];
                        }
                        int[] iArr17 = new int[llllIlIlII[1]];
                        iArr17[llllIlIlII[0]] = llllIlIlII[24];
                        if (llIIllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llllIlIlII[1]];
                            iArr18[llllIlIlII[0]] = llllIlIlII[24];
                            if (llIIllllIllIl(Bank.getFirst(iArr18).getQuantity(), llllIlIlII[25])) {
                                ae();
                                System.out.println(llllIIllII[llllIlIlII[26]]);
                                bs = llllIlIlII[1];
                                return;
                            }
                        }
                        int[] iArr19 = new int[llllIlIlII[1]];
                        iArr19[llllIlIlII[0]] = llllIlIlII[27];
                        if (llIIllllIllII(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[llllIlIlII[1]];
                            iArr20[llllIlIlII[0]] = llllIlIlII[27];
                            if (llIIllllIllIl(Bank.getFirst(iArr20).getQuantity(), llllIlIlII[7])) {
                                ae();
                                System.out.println(llllIIllII[llllIlIlII[28]]);
                                bs = llllIlIlII[1];
                                return;
                            }
                        }
                        int[] iArr21 = new int[llllIlIlII[29]];
                        iArr21[llllIlIlII[0]] = llllIlIlII[19];
                        iArr21[llllIlIlII[1]] = llllIlIlII[22];
                        iArr21[llllIlIlII[2]] = llllIlIlII[21];
                        iArr21[llllIlIlII[7]] = llllIlIlII[30];
                        iArr21[llllIlIlII[9]] = llllIlIlII[31];
                        iArr21[llllIlIlII[11]] = llllIlIlII[32];
                        iArr21[llllIlIlII[12]] = llllIlIlII[33];
                        iArr21[llllIlIlII[13]] = llllIlIlII[34];
                        iArr21[llllIlIlII[16]] = llllIlIlII[35];
                        iArr21[llllIlIlII[17]] = llllIlIlII[36];
                        iArr21[llllIlIlII[23]] = llllIlIlII[24];
                        iArr21[llllIlIlII[26]] = llllIlIlII[27];
                        iArr21[llllIlIlII[28]] = llllIlIlII[37];
                        iArr21[llllIlIlII[38]] = llllIlIlII[39];
                        iArr21[llllIlIlII[40]] = llllIlIlII[41];
                        iArr21[llllIlIlII[20]] = llllIlIlII[42];
                        iArr21[llllIlIlII[43]] = llllIlIlII[44];
                        if (llIIllllIlllI(C0004e.b(iArr21) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIIllII[llllIlIlII[38]]);
                            bs = llllIlIlII[1];
                            return;
                        }
                        int[] iArr22 = new int[llllIlIlII[29]];
                        iArr22[llllIlIlII[0]] = llllIlIlII[19];
                        iArr22[llllIlIlII[1]] = llllIlIlII[22];
                        iArr22[llllIlIlII[2]] = llllIlIlII[21];
                        iArr22[llllIlIlII[7]] = llllIlIlII[30];
                        iArr22[llllIlIlII[9]] = llllIlIlII[31];
                        iArr22[llllIlIlII[11]] = llllIlIlII[32];
                        iArr22[llllIlIlII[12]] = llllIlIlII[33];
                        iArr22[llllIlIlII[13]] = llllIlIlII[34];
                        iArr22[llllIlIlII[16]] = llllIlIlII[35];
                        iArr22[llllIlIlII[17]] = llllIlIlII[36];
                        iArr22[llllIlIlII[23]] = llllIlIlII[24];
                        iArr22[llllIlIlII[26]] = llllIlIlII[27];
                        iArr22[llllIlIlII[28]] = llllIlIlII[37];
                        iArr22[llllIlIlII[38]] = llllIlIlII[39];
                        iArr22[llllIlIlII[40]] = llllIlIlII[41];
                        iArr22[llllIlIlII[20]] = llllIlIlII[42];
                        iArr22[llllIlIlII[43]] = llllIlIlII[44];
                        if (llIIllllIllII(C0004e.b(iArr22) ? 1 : 0)) {
                            C0000a.a(llllIlIlII[19], llllIlIlII[11]);
                            C0000a.a(llllIlIlII[22], llllIlIlII[11]);
                            C0000a.a(llllIlIlII[21], llllIlIlII[11]);
                            C0000a.b(C0005f.aU, llllIlIlII[11]);
                            C0000a.a(llllIlIlII[35], llllIlIlII[13]);
                            C0000a.b(C0005f.be, llllIlIlII[1]);
                            C0000a.a(llllIlIlII[42], llllIlIlII[1]);
                            C0000a.a(llllIlIlII[44], llllIlIlII[1]);
                            C0000a.a(llllIlIlII[39], llllIlIlII[1]);
                            C0000a.a(llllIlIlII[36], llllIlIlII[1]);
                            C0000a.a(llllIlIlII[45], llllIlIlII[2]);
                            C0000a.a(llllIlIlII[46], llllIlIlII[47]);
                        }
                    }
                }
            }
            if (llIIllllIllII(aa() ? 1 : 0) && llIIllllIllIl(C0004e.j(llllIlIlII[14]), llllIlIlII[1])) {
                if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[40]];
                    Movement.walkTo(gN);
                    "".length();
                    Time.sleepTicks(llllIlIlII[1]);
                    "".length();
                }
                if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[20]];
                    C0006g.a(llllIIllII[llllIlIlII[43]], bQ, llllIlIlII[1]);
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[1]) && llIIllllIllII(aa() ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(llllIlIlII[48], llllIlIlII[49], llllIlIlII[0]);
                if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), llllIlIlII[16])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[29]];
                    Movement.walkTo(worldPoint5);
                    "".length();
                    Time.sleepTicks(llllIlIlII[1]);
                    "".length();
                }
                if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), llllIlIlII[16])) {
                    C0006g.a(llllIIllII[llllIlIlII[50]], bQ, llllIlIlII[1]);
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[2])) {
                ck = llllIlIlII[0];
                int[] iArr23 = new int[llllIlIlII[1]];
                iArr23[llllIlIlII[0]] = llllIlIlII[44];
                if (llIIllllIllII(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llllIlIlII[1]];
                    iArr24[llllIlIlII[0]] = llllIlIlII[44];
                    if (llIIllllIlllI(Equipment.contains(iArr24) ? 1 : 0)) {
                        String[] strArr14 = new String[llllIlIlII[1]];
                        strArr14[llllIlIlII[0]] = llllIIllII[llllIlIlII[51]];
                        Inventory.getFirst(strArr14).interact(llllIIllII[llllIlIlII[10]]);
                    }
                }
                if (llIIllllIllII(Inventory.contains(item -> {
                    return item.getName().contains(llllIIllII[llllIlIlII[340]]);
                }) ? 1 : 0) && llIIllllIlllI(Equipment.contains(item2 -> {
                    return item2.getName().contains(llllIIllII[llllIlIlII[339]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llllIIllII[llllIlIlII[338]]);
                    }).interact(llllIIllII[llllIlIlII[52]]);
                }
                if (llIIllllIllII(Inventory.contains(item4 -> {
                    return item4.getName().contains(llllIIllII[llllIlIlII[337]]);
                }) ? 1 : 0) && llIIllllIlllI(Equipment.contains(item5 -> {
                    return item5.getName().contains(llllIIllII[llllIlIlII[336]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(llllIIllII[llllIlIlII[335]]);
                    }).interact(llllIIllII[llllIlIlII[53]]);
                }
                if (llIIlllllIllI(Vars.getBit(llllIlIlII[54]), llllIlIlII[1])) {
                    String[] strArr15 = new String[llllIlIlII[1]];
                    strArr15[llllIlIlII[0]] = llllIIllII[llllIlIlII[55]];
                    if (llIIllllIlllI(Inventory.contains(strArr15) ? 1 : 0)) {
                    }
                    if (((llIIllllIlllI(Vars.getBit(llllIlIlII[54])) && llIIllllIlllI(Vars.getBit(llllIlIlII[67])) && !llIIllllIllII(Vars.getBit(llllIlIlII[62]))) || llIIlllllIlIl(C0004e.j(llllIlIlII[72]), llllIlIlII[20])) && llIIllllIlllI(Vars.getBit(llllIlIlII[73]))) {
                        strArr10 = new String[llllIlIlII[1]];
                        strArr10[llllIlIlII[0]] = llllIIllII[llllIlIlII[74]];
                        if (llIIllllIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(llllIlIlII[75], llllIlIlII[76], llllIlIlII[0]);
                            String[] strArr16 = new String[llllIlIlII[1]];
                            strArr16[llllIlIlII[0]] = llllIIllII[llllIlIlII[77]];
                            if (llIIlllllIlll(NPCs.getNearest(strArr16))) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[78]];
                                Movement.walkTo(worldPoint6);
                                "".length();
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                            String[] strArr17 = new String[llllIlIlII[1]];
                            strArr17[llllIlIlII[0]] = llllIIllII[llllIlIlII[79]];
                            if (llIIlllllIIlI(NPCs.getNearest(strArr17))) {
                                C0006g.a(llllIIllII[llllIlIlII[80]], bQ);
                            }
                        }
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[73]), llllIlIlII[1]) && (!llIIllllIllII(Vars.getBit(llllIlIlII[81])) || llIIllllIlllI(gR ? 1 : 0))) {
                        strArr8 = new String[llllIlIlII[1]];
                        strArr8[llllIlIlII[0]] = llllIIllII[llllIlIlII[82]];
                        if (llIIllllIlllI(Inventory.contains(strArr8) ? 1 : 0) && llIIllllIlllI(Vars.getBit(llllIlIlII[83]))) {
                            ci();
                        }
                        strArr9 = new String[llllIlIlII[1]];
                        strArr9[llllIlIlII[0]] = llllIIllII[llllIlIlII[84]];
                        if (llIIllllIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                            WorldPoint worldPoint7 = new WorldPoint(llllIlIlII[85], llllIlIlII[86], llllIlIlII[0]);
                            if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llllIlIlII[9]) && llIIllllIlllI(Vars.getBit(llllIlIlII[81]))) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[87]];
                                if (llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(worldPoint7);
                                "".length();
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                            if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llllIlIlII[23])) {
                                if (llIIllllIlllI(Vars.getBit(llllIlIlII[81]))) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[88]];
                                    String[] strArr18 = new String[llllIlIlII[1]];
                                    strArr18[llllIlIlII[0]] = llllIIllII[llllIlIlII[89]];
                                    if (llIIllllIllII(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[llllIlIlII[1]];
                                        strArr19[llllIlIlII[0]] = llllIIllII[llllIlIlII[90]];
                                        Item first = Inventory.getFirst(strArr19);
                                        String[] strArr20 = new String[llllIlIlII[1]];
                                        strArr20[llllIlIlII[0]] = llllIIllII[llllIlIlII[91]];
                                        first.useOn(TileObjects.getNearest(strArr20));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr21 = new String[llllIlIlII[1]];
                                    strArr21[llllIlIlII[0]] = llllIIllII[llllIlIlII[6]];
                                    if (llIIllllIllII(Inventory.contains(strArr21) ? 1 : 0)) {
                                        String[] strArr22 = new String[llllIlIlII[1]];
                                        strArr22[llllIlIlII[0]] = llllIIllII[llllIlIlII[92]];
                                        Item first2 = Inventory.getFirst(strArr22);
                                        String[] strArr23 = new String[llllIlIlII[1]];
                                        strArr23[llllIlIlII[0]] = llllIIllII[llllIlIlII[93]];
                                        first2.useOn(TileObjects.getNearest(strArr23));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr24 = new String[llllIlIlII[1]];
                                    strArr24[llllIlIlII[0]] = llllIIllII[llllIlIlII[94]];
                                    if (llIIllllIllII(Inventory.contains(strArr24) ? 1 : 0)) {
                                        String[] strArr25 = new String[llllIlIlII[1]];
                                        strArr25[llllIlIlII[0]] = llllIIllII[llllIlIlII[95]];
                                        Item first3 = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[llllIlIlII[1]];
                                        strArr26[llllIlIlII[0]] = llllIIllII[llllIlIlII[96]];
                                        first3.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[llllIlIlII[1]];
                                    strArr27[llllIlIlII[0]] = llllIIllII[llllIlIlII[97]];
                                    if (llIIllllIllII(Inventory.contains(strArr27) ? 1 : 0)) {
                                        String[] strArr28 = new String[llllIlIlII[1]];
                                        strArr28[llllIlIlII[0]] = llllIIllII[llllIlIlII[98]];
                                        Item first4 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[llllIlIlII[1]];
                                        strArr29[llllIlIlII[0]] = llllIIllII[llllIlIlII[99]];
                                        first4.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                }
                                if (llIIlllllIlIl(Vars.getBit(llllIlIlII[81]), llllIlIlII[1])) {
                                    String[] strArr30 = new String[llllIlIlII[1]];
                                    strArr30[llllIlIlII[0]] = llllIIllII[llllIlIlII[100]];
                                    if (llIIllllIllII(Inventory.contains(strArr30) ? 1 : 0)) {
                                        String[] strArr31 = new String[llllIlIlII[1]];
                                        strArr31[llllIlIlII[0]] = llllIIllII[llllIlIlII[101]];
                                        Item first5 = Inventory.getFirst(strArr31);
                                        String[] strArr32 = new String[llllIlIlII[1]];
                                        strArr32[llllIlIlII[0]] = llllIIllII[llllIlIlII[102]];
                                        first5.useOn(TileObjects.getNearest(strArr32));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr33 = new String[llllIlIlII[1]];
                                    strArr33[llllIlIlII[0]] = llllIIllII[llllIlIlII[103]];
                                    if (llIIllllIllII(Inventory.contains(strArr33) ? 1 : 0)) {
                                        String[] strArr34 = new String[llllIlIlII[1]];
                                        strArr34[llllIlIlII[0]] = llllIIllII[llllIlIlII[104]];
                                        Item first6 = Inventory.getFirst(strArr34);
                                        String[] strArr35 = new String[llllIlIlII[1]];
                                        strArr35[llllIlIlII[0]] = llllIIllII[llllIlIlII[105]];
                                        first6.useOn(TileObjects.getNearest(strArr35));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr36 = new String[llllIlIlII[1]];
                                    strArr36[llllIlIlII[0]] = llllIIllII[llllIlIlII[106]];
                                    if (llIIllllIllII(Inventory.contains(strArr36) ? 1 : 0)) {
                                        String[] strArr37 = new String[llllIlIlII[1]];
                                        strArr37[llllIlIlII[0]] = llllIIllII[llllIlIlII[107]];
                                        Item first7 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[llllIlIlII[1]];
                                        strArr38[llllIlIlII[0]] = llllIIllII[llllIlIlII[108]];
                                        first7.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[llllIlIlII[1]];
                                    strArr39[llllIlIlII[0]] = llllIIllII[llllIlIlII[109]];
                                    if (llIIllllIllII(Inventory.contains(strArr39) ? 1 : 0)) {
                                        String[] strArr40 = new String[llllIlIlII[1]];
                                        strArr40[llllIlIlII[0]] = llllIIllII[llllIlIlII[110]];
                                        Item first8 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[llllIlIlII[1]];
                                        strArr41[llllIlIlII[0]] = llllIIllII[llllIlIlII[111]];
                                        first8.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(llllIlIlII[1]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[llllIlIlII[1]];
                                    strArr42[llllIlIlII[0]] = llllIIllII[llllIlIlII[112]];
                                    TileObject nearest5 = TileObjects.getNearest(strArr42);
                                    if (llIIlllllIIlI(nearest5) && llIIllllIlllI(gR ? 1 : 0)) {
                                        if (llIIllllIlllI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            String[] strArr43 = new String[llllIlIlII[1]];
                                            strArr43[llllIlIlII[0]] = llllIIllII[llllIlIlII[113]];
                                            TileObjects.getNearest(strArr43).interact(llllIIllII[llllIlIlII[114]]);
                                            Time.sleepTicks(llllIlIlII[16]);
                                            "".length();
                                        }
                                        if (llIIllllIllII(Reachable.isInteractable(nearest5) ? 1 : 0) && llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr44 = new String[llllIlIlII[1]];
                                            strArr44[llllIlIlII[0]] = llllIIllII[llllIlIlII[115]];
                                            if (llIIllllIllII(nearest5.hasAction(strArr44) ? 1 : 0)) {
                                                nearest5.interact(llllIIllII[llllIlIlII[116]]);
                                                Time.sleepTicks(llllIlIlII[9]);
                                                "".length();
                                            }
                                            String[] strArr45 = new String[llllIlIlII[1]];
                                            strArr45[llllIlIlII[0]] = llllIIllII[llllIlIlII[117]];
                                            if (llIIllllIllII(nearest5.hasAction(strArr45) ? 1 : 0)) {
                                                nearest5.interact(llllIIllII[llllIlIlII[118]]);
                                                Time.sleepTicks(llllIlIlII[9]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[81]), llllIlIlII[1]) && llIIllllIlllI(gR ? 1 : 0)) {
                        strArr2 = new String[llllIlIlII[1]];
                        strArr2[llllIlIlII[0]] = llllIIllII[llllIlIlII[119]];
                        if (llIIllllIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr46 = new String[llllIlIlII[1]];
                            strArr46[llllIlIlII[0]] = llllIIllII[llllIlIlII[120]];
                            Item first9 = Inventory.getFirst(strArr46);
                            String[] strArr47 = new String[llllIlIlII[1]];
                            strArr47[llllIlIlII[0]] = llllIIllII[llllIlIlII[121]];
                            first9.useOn(TileObjects.getNearest(strArr47));
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                        strArr3 = new String[llllIlIlII[1]];
                        strArr3[llllIlIlII[0]] = llllIIllII[llllIlIlII[122]];
                        if (llIIllllIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                            String[] strArr48 = new String[llllIlIlII[1]];
                            strArr48[llllIlIlII[0]] = llllIIllII[llllIlIlII[123]];
                            Item first10 = Inventory.getFirst(strArr48);
                            String[] strArr49 = new String[llllIlIlII[1]];
                            strArr49[llllIlIlII[0]] = llllIIllII[llllIlIlII[124]];
                            first10.useOn(TileObjects.getNearest(strArr49));
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                        strArr4 = new String[llllIlIlII[1]];
                        strArr4[llllIlIlII[0]] = llllIIllII[llllIlIlII[125]];
                        if (llIIllllIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                            String[] strArr50 = new String[llllIlIlII[1]];
                            strArr50[llllIlIlII[0]] = llllIIllII[llllIlIlII[126]];
                            Item first11 = Inventory.getFirst(strArr50);
                            String[] strArr51 = new String[llllIlIlII[1]];
                            strArr51[llllIlIlII[0]] = llllIIllII[llllIlIlII[127]];
                            first11.useOn(TileObjects.getNearest(strArr51));
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                        strArr5 = new String[llllIlIlII[1]];
                        strArr5[llllIlIlII[0]] = llllIIllII[llllIlIlII[128]];
                        if (llIIllllIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                            String[] strArr52 = new String[llllIlIlII[1]];
                            strArr52[llllIlIlII[0]] = llllIIllII[llllIlIlII[129]];
                            Item first12 = Inventory.getFirst(strArr52);
                            String[] strArr53 = new String[llllIlIlII[1]];
                            strArr53[llllIlIlII[0]] = llllIIllII[llllIlIlII[130]];
                            first12.useOn(TileObjects.getNearest(strArr53));
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                        String[] strArr54 = new String[llllIlIlII[1]];
                        strArr54[llllIlIlII[0]] = llllIIllII[llllIlIlII[25]];
                        nearest3 = TileObjects.getNearest(strArr54);
                        if (llIIlllllIIlI(nearest3) && llIIllllIlllI(gR ? 1 : 0)) {
                            if (llIIllllIlllI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                String[] strArr55 = new String[llllIlIlII[1]];
                                strArr55[llllIlIlII[0]] = llllIIllII[llllIlIlII[131]];
                                TileObjects.getNearest(strArr55).interact(llllIIllII[llllIlIlII[132]]);
                                Time.sleepTicks(llllIlIlII[16]);
                                "".length();
                            }
                            if (llIIllllIllII(Reachable.isInteractable(nearest3) ? 1 : 0) && llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                strArr6 = new String[llllIlIlII[1]];
                                strArr6[llllIlIlII[0]] = llllIIllII[llllIlIlII[133]];
                                if (llIIllllIllII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                    nearest3.interact(llllIIllII[llllIlIlII[134]]);
                                    Time.sleepTicks(llllIlIlII[9]);
                                    "".length();
                                }
                                strArr7 = new String[llllIlIlII[1]];
                                strArr7[llllIlIlII[0]] = llllIIllII[llllIlIlII[135]];
                                if (llIIllllIllII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                    nearest3.interact(llllIIllII[llllIlIlII[136]]);
                                    Time.sleepTicks(llllIlIlII[9]);
                                    "".length();
                                }
                            }
                        }
                    }
                    if (llIIllllIllII(gR ? 1 : 0) && llIIllllIlllI(gS ? 1 : 0)) {
                        if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlII[85], llllIlIlII[86], llllIlIlII[0])), llllIlIlII[23])) {
                            int[] iArr25 = new int[llllIlIlII[1]];
                            iArr25[llllIlIlII[0]] = llllIlIlII[21];
                            Inventory.getFirst(iArr25).interact(llllIIllII[llllIlIlII[137]]);
                            Time.sleepTicks(llllIlIlII[16]);
                            "".length();
                        }
                        worldPoint4 = new WorldPoint(llllIlIlII[138], llllIlIlII[139], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[140]];
                            if (llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(worldPoint4);
                                "".length();
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                            String[] strArr56 = new String[llllIlIlII[7]];
                            strArr56[llllIlIlII[0]] = llllIIllII[llllIlIlII[141]];
                            strArr56[llllIlIlII[1]] = llllIIllII[llllIlIlII[142]];
                            strArr56[llllIlIlII[2]] = llllIIllII[llllIlIlII[143]];
                            C0006g.a(strArr56);
                        }
                        if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[144]];
                            C0006g.a(llllIIllII[llllIlIlII[145]], bQ);
                        }
                    }
                    if (llIIllllIllII(gR ? 1 : 0) && llIIllllIllII(gS ? 1 : 0) && llIIllllIlllI(gT ? 1 : 0)) {
                        strArr = new String[llllIlIlII[1]];
                        strArr[llllIlIlII[0]] = llllIIllII[llllIlIlII[146]];
                        if (llIIllllIllII(Inventory.contains(strArr) ? 1 : 0)) {
                            String[] strArr57 = new String[llllIlIlII[1]];
                            strArr57[llllIlIlII[0]] = llllIIllII[llllIlIlII[147]];
                            Inventory.getFirst(strArr57).interact(llllIIllII[llllIlIlII[148]]);
                        }
                        WorldArea worldArea4 = new WorldArea(llllIlIlII[149], llllIlIlII[150], llllIlIlII[51], llllIlIlII[10], llllIlIlII[0]);
                        worldArea = new WorldArea(llllIlIlII[151], llllIlIlII[152], llllIlIlII[58], llllIlIlII[58], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && llIIllllIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            worldPoint3 = new WorldPoint(llllIlIlII[153], llllIlIlII[154], llllIlIlII[0]);
                            if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llllIlIlII[2])) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[155]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                            if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llllIlIlII[2])) {
                                String[] strArr58 = new String[llllIlIlII[1]];
                                strArr58[llllIlIlII[0]] = llllIIllII[llllIlIlII[156]];
                                TileObjects.getNearest(strArr58).interact(llllIIllII[llllIlIlII[157]]);
                                Time.sleepTicks(llllIlIlII[11]);
                                "".length();
                            }
                        }
                        worldArea2 = new WorldArea(llllIlIlII[158], llllIlIlII[159], llllIlIlII[11], llllIlIlII[16], llllIlIlII[0]);
                        WorldArea worldArea5 = new WorldArea(llllIlIlII[160], llllIlIlII[161], llllIlIlII[13], llllIlIlII[7], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && llIIllllIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr5 = new int[llllIlIlII[1]];
                            iArr5[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIllllIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr26 = new int[llllIlIlII[1]];
                                iArr26[llllIlIlII[0]] = llllIlIlII[162];
                                if (llIIlllllIlll(TileItems.getNearest(iArr26)) && llIIllllIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(new WorldArea(llllIlIlII[163], llllIlIlII[164], llllIlIlII[26], llllIlIlII[12], llllIlIlII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[165]];
                                    if (llIIlllllIlll(Players.getLocal().getInteracting())) {
                                        int[] iArr27 = new int[llllIlIlII[1]];
                                        iArr27[llllIlIlII[0]] = llllIlIlII[166];
                                        NPCs.getNearest(iArr27).interact(llllIIllII[llllIlIlII[167]]);
                                        Time.sleepTicks(llllIlIlII[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr6 = new int[llllIlIlII[1]];
                            iArr6[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr6))) {
                                int[] iArr28 = new int[llllIlIlII[1]];
                                iArr28[llllIlIlII[0]] = llllIlIlII[162];
                                TileItems.getNearest(iArr28).interact(llllIIllII[llllIlIlII[168]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                            iArr7 = new int[llllIlIlII[1]];
                            iArr7[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIllllIllII(Inventory.contains(iArr7) ? 1 : 0) && llIIllllIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(llllIlIlII[169], llllIlIlII[170], llllIlIlII[0]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[171]];
                                    C0004e.b(worldPoint2);
                                    Time.sleepTicks(llllIlIlII[2]);
                                    "".length();
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    String[] strArr59 = new String[llllIlIlII[1]];
                                    strArr59[llllIlIlII[0]] = llllIIllII[llllIlIlII[172]];
                                    TileObjects.getNearest(strArr59).interact(llllIIllII[llllIlIlII[173]]);
                                    Time.sleepTicks(llllIlIlII[12]);
                                    "".length();
                                }
                            }
                            if (llIIllllIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIllllIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                nearest2 = TileObjects.getNearest(tileObject -> {
                                    if (llIIllllIllII(tileObject.getName().contains(llllIIllII[llllIlIlII[334]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                                        ?? r0 = llllIlIlII[1];
                                        "".length();
                                        return ((((132 + 76) - 90) + 21) ^ (((20 + 56) - (-3)) + 64)) == (-" ".length()) ? ((((69 + 35) - 82) + 208) ^ (((39 + 160) - 126) + 108)) & (((18 ^ 105) ^ (232 ^ 192)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIlIlII[0];
                                });
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[174]];
                                if (llIIlllllIIlI(nearest2)) {
                                    nearest2.interact(llllIIllII[llllIlIlII[175]]);
                                    Time.sleepTicks(llllIlIlII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1]) && llIIllllIlllI(new WorldArea(llllIlIlII[176], llllIlIlII[177], llllIlIlII[11], llllIlIlII[13], llllIlIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr2 = new int[llllIlIlII[1]];
                            iArr2[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIllllIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr29 = new int[llllIlIlII[1]];
                                iArr29[llllIlIlII[0]] = llllIlIlII[178];
                                if (llIIlllllIlll(TileItems.getNearest(iArr29))) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[179]];
                                    NPC nearest6 = NPCs.getNearest(npc -> {
                                        if (llIIllllIllII(npc.getName().contains(llllIIllII[llllIlIlII[333]]) ? 1 : 0) && llIIllllllIII(npc.getInteracting(), Players.getLocal()) && llIIlllllIlII(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                            ?? r0 = llllIlIlII[1];
                                            "".length();
                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llllIlIlII[0];
                                    });
                                    if (llIIlllllIlll(Players.getLocal().getInteracting()) && llIIlllllIlll(nearest6)) {
                                        int[] iArr30 = new int[llllIlIlII[1]];
                                        iArr30[llllIlIlII[0]] = llllIlIlII[180];
                                        NPCs.getNearest(iArr30).interact(llllIIllII[llllIlIlII[181]]);
                                        Time.sleepTicks(llllIlIlII[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr3 = new int[llllIlIlII[1]];
                            iArr3[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr3))) {
                                int[] iArr31 = new int[llllIlIlII[1]];
                                iArr31[llllIlIlII[0]] = llllIlIlII[178];
                                TileItems.getNearest(iArr31).interact(llllIIllII[llllIlIlII[182]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                            worldArea3 = new WorldArea(llllIlIlII[183], llllIlIlII[184], llllIlIlII[12], llllIlIlII[11], llllIlIlII[1]);
                            iArr4 = new int[llllIlIlII[1]];
                            iArr4[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIllllIllII(Inventory.contains(iArr4) ? 1 : 0) && llIIllllIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint = new WorldPoint(llllIlIlII[163], llllIlIlII[170], llllIlIlII[1]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[185]];
                                    C0004e.b(worldPoint);
                                    Time.sleepTicks(llllIlIlII[2]);
                                    "".length();
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    String[] strArr60 = new String[llllIlIlII[1]];
                                    strArr60[llllIlIlII[0]] = llllIIllII[llllIlIlII[186]];
                                    TileObjects.getNearest(strArr60).interact(llllIIllII[llllIlIlII[187]]);
                                    Time.sleepTicks(llllIlIlII[12]);
                                    "".length();
                                }
                            }
                            if (llIIllllIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest7 = TileObjects.getNearest(tileObject2 -> {
                                    if (llIIllllIllII(tileObject2.getName().contains(llllIIllII[llllIlIlII[332]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                                        ?? r0 = llllIlIlII[1];
                                        "".length();
                                        return (((80 ^ 101) ^ (241 ^ 166)) & (((234 ^ 168) ^ (88 ^ 120)) ^ (-" ".length()))) != 0 ? ((40 ^ 20) ^ (61 ^ 11)) & (((32 ^ 67) ^ (96 ^ 9)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIlIlII[0];
                                });
                                if (llIIlllllIIlI(nearest7)) {
                                    nearest7.interact(llllIIllII[llllIlIlII[188]]);
                                    Time.sleepTicks(llllIlIlII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[2])) {
                            int[] iArr32 = new int[llllIlIlII[1]];
                            iArr32[llllIlIlII[0]] = llllIlIlII[189];
                            if (llIIllllIlllI(Inventory.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[llllIlIlII[1]];
                                iArr33[llllIlIlII[0]] = llllIlIlII[189];
                                if (llIIlllllIlll(TileItems.getNearest(iArr33))) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[190]];
                                    NPC nearest8 = NPCs.getNearest(npc2 -> {
                                        if (llIIllllIllII(npc2.getName().contains(llllIIllII[llllIlIlII[331]]) ? 1 : 0) && llIIllllllIII(npc2.getInteracting(), Players.getLocal()) && llIIlllllIlII(npc2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                            ?? r0 = llllIlIlII[1];
                                            "".length();
                                            return !((true ^ true) ^ (true ^ true)) ? ((94 ^ 23) ^ (5 ^ 12)) & (((((208 + 246) - 451) + 249) ^ (((73 + 24) - (-28)) + 63)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIlIlII[0];
                                    });
                                    if (llIIlllllIlll(Players.getLocal().getInteracting()) && llIIlllllIlll(nearest8)) {
                                        int[] iArr34 = new int[llllIlIlII[1]];
                                        iArr34[llllIlIlII[0]] = llllIlIlII[191];
                                        NPCs.getNearest(iArr34).interact(llllIIllII[llllIlIlII[192]]);
                                        Time.sleepTicks(llllIlIlII[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr35 = new int[llllIlIlII[1]];
                            iArr35[llllIlIlII[0]] = llllIlIlII[189];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr35))) {
                                int[] iArr36 = new int[llllIlIlII[1]];
                                iArr36[llllIlIlII[0]] = llllIlIlII[189];
                                TileItems.getNearest(iArr36).interact(llllIIllII[llllIlIlII[193]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                            WorldArea worldArea6 = new WorldArea(llllIlIlII[149], llllIlIlII[164], llllIlIlII[10], llllIlIlII[38], llllIlIlII[2]);
                            int[] iArr37 = new int[llllIlIlII[1]];
                            iArr37[llllIlIlII[0]] = llllIlIlII[189];
                            if (llIIllllIllII(Inventory.contains(iArr37) ? 1 : 0) && llIIllllIlllI(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint8 = new WorldPoint(llllIlIlII[194], llllIlIlII[159], llllIlIlII[2]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[195]];
                                    C0004e.b(worldPoint8);
                                    Time.sleepTicks(llllIlIlII[2]);
                                    "".length();
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    String[] strArr61 = new String[llllIlIlII[1]];
                                    strArr61[llllIlIlII[0]] = llllIIllII[llllIlIlII[196]];
                                    TileObjects.getNearest(strArr61).interact(llllIIllII[llllIlIlII[197]]);
                                    Time.sleepTicks(llllIlIlII[12]);
                                    "".length();
                                }
                            }
                            if (llIIllllIllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest9 = TileObjects.getNearest(tileObject3 -> {
                                    if (llIIllllIllII(tileObject3.getName().contains(llllIIllII[llllIlIlII[330]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                                        ?? r0 = llllIlIlII[1];
                                        "".length();
                                        return " ".length() > ((((13 + 128) - 110) + 141) ^ (((36 + 114) - 105) + 123)) ? ((((93 + 40) - 36) + 75) ^ (((92 + 10) - (-33)) + 43)) & (((58 ^ 117) ^ (199 ^ 150)) ^ (-" ".length())) : r0;
                                    }
                                    return llllIlIlII[0];
                                });
                                if (llIIlllllIIlI(nearest9)) {
                                    nearest9.interact(llllIIllII[llllIlIlII[198]]);
                                    Time.sleepTicks(llllIlIlII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (llIIllllIlllI(new WorldArea(llllIlIlII[176], llllIlIlII[177], llllIlIlII[11], llllIlIlII[13], llllIlIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIllllIllII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllIlIlII[199], llllIlIlII[200], llllIlIlII[1])) ? 1 : 0)) {
                            nearest = TileObjects.getNearest(tileObject4 -> {
                                if (llIIllllIllII(tileObject4.getName().contains(llllIIllII[llllIlIlII[328]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject4) ? 1 : 0)) {
                                    String[] strArr62 = new String[llllIlIlII[1]];
                                    strArr62[llllIlIlII[0]] = llllIIllII[llllIlIlII[329]];
                                    if (llIIllllIllII(tileObject4.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = llllIlIlII[1];
                                        "".length();
                                        return (-(51 ^ 55)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return llllIlIlII[0];
                            });
                            if (llIIlllllIIlI(nearest)) {
                                nearest.interact(llllIIllII[llllIlIlII[201]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                        }
                        if (llIIllllIllII(new WorldArea(llllIlIlII[163], llllIlIlII[164], llllIlIlII[26], llllIlIlII[12], llllIlIlII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            TileObject nearest10 = TileObjects.getNearest(tileObject5 -> {
                                if (llIIllllIllII(tileObject5.getName().contains(llllIIllII[llllIlIlII[326]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject5) ? 1 : 0)) {
                                    String[] strArr62 = new String[llllIlIlII[1]];
                                    strArr62[llllIlIlII[0]] = llllIIllII[llllIlIlII[327]];
                                    if (llIIllllIllII(tileObject5.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = llllIlIlII[1];
                                        "".length();
                                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return llllIlIlII[0];
                            });
                            if (llIIlllllIIlI(nearest10)) {
                                nearest10.interact(llllIIllII[llllIlIlII[202]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                        }
                        WorldArea worldArea7 = new WorldArea(llllIlIlII[194], llllIlIlII[203], llllIlIlII[43], llllIlIlII[9], llllIlIlII[0]);
                        WorldArea worldArea8 = new WorldArea(llllIlIlII[204], llllIlIlII[205], llllIlIlII[13], llllIlIlII[23], llllIlIlII[0]);
                        WorldArea worldArea9 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                        if (llIIllllIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr38 = new int[llllIlIlII[1]];
                            iArr38[llllIlIlII[0]] = llllIlIlII[207];
                            if (llIIllllIlllI(Inventory.contains(iArr38) ? 1 : 0)) {
                                int[] iArr39 = new int[llllIlIlII[1]];
                                iArr39[llllIlIlII[0]] = llllIlIlII[207];
                                if (llIIlllllIlll(TileItems.getNearest(iArr39)) && llIIllllIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[208]];
                                    NPC nearest11 = NPCs.getNearest(npc3 -> {
                                        if (llIIllllIllII(npc3.getName().contains(llllIIllII[llllIlIlII[325]]) ? 1 : 0) && llIIllllllIII(npc3.getInteracting(), Players.getLocal()) && llIIlllllIlII(npc3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllIlIlII[1])) {
                                            ?? r0 = llllIlIlII[1];
                                            "".length();
                                            return " ".length() < 0 ? ((143 ^ 199) ^ (89 ^ 115)) & (((((188 + 184) - 334) + 159) ^ (((6 + 144) - 8) + 25)) ^ (-" ".length())) : r0;
                                        }
                                        return llllIlIlII[0];
                                    });
                                    if (llIIlllllIlll(Players.getLocal().getInteracting()) && llIIlllllIlll(nearest11)) {
                                        int[] iArr40 = new int[llllIlIlII[1]];
                                        iArr40[llllIlIlII[0]] = llllIlIlII[209];
                                        NPCs.getNearest(iArr40).interact(llllIIllII[llllIlIlII[210]]);
                                        Time.sleepTicks(llllIlIlII[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr41 = new int[llllIlIlII[1]];
                            iArr41[llllIlIlII[0]] = llllIlIlII[207];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr41))) {
                                int[] iArr42 = new int[llllIlIlII[1]];
                                iArr42[llllIlIlII[0]] = llllIlIlII[207];
                                TileItems.getNearest(iArr42).interact(llllIIllII[llllIlIlII[211]]);
                                Time.sleepTicks(llllIlIlII[7]);
                                "".length();
                            }
                            WorldArea worldArea10 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                            int[] iArr43 = new int[llllIlIlII[1]];
                            iArr43[llllIlIlII[0]] = llllIlIlII[207];
                            if (llIIllllIllII(Inventory.contains(iArr43) ? 1 : 0) && llIIllllIlllI(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint9 = new WorldPoint(llllIlIlII[183], llllIlIlII[212], llllIlIlII[0]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[213]];
                                    C0004e.b(worldPoint9);
                                    Time.sleepTicks(llllIlIlII[2]);
                                    "".length();
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    String[] strArr62 = new String[llllIlIlII[1]];
                                    strArr62[llllIlIlII[0]] = llllIIllII[llllIlIlII[214]];
                                    TileObjects.getNearest(strArr62).interact(llllIIllII[llllIlIlII[215]]);
                                    Time.sleepTicks(llllIlIlII[12]);
                                    "".length();
                                }
                            }
                            if (llIIllllIllII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] iArr44 = new int[llllIlIlII[1]];
                                iArr44[llllIlIlII[0]] = llllIlIlII[216];
                                if (llIIllllIlllI(Inventory.contains(iArr44) ? 1 : 0)) {
                                    int[] iArr45 = new int[llllIlIlII[1]];
                                    iArr45[llllIlIlII[0]] = llllIlIlII[216];
                                    if (llIIlllllIlll(TileItems.getNearest(iArr45))) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[217]];
                                        if (llIIllllIlllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (llIIlllllIlll(Players.getLocal().getInteracting())) {
                                            int[] iArr46 = new int[llllIlIlII[1]];
                                            iArr46[llllIlIlII[0]] = llllIlIlII[218];
                                            NPCs.getNearest(iArr46).interact(llllIIllII[llllIlIlII[219]]);
                                            Time.sleepTicks(llllIlIlII[11]);
                                            "".length();
                                        }
                                    }
                                }
                                int[] iArr47 = new int[llllIlIlII[1]];
                                iArr47[llllIlIlII[0]] = llllIlIlII[216];
                                if (llIIlllllIIlI(TileItems.getNearest(iArr47))) {
                                    if (llIIllllIllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    int[] iArr48 = new int[llllIlIlII[1]];
                                    iArr48[llllIlIlII[0]] = llllIlIlII[216];
                                    TileItems.getNearest(iArr48).interact(llllIIllII[llllIlIlII[220]]);
                                    Time.sleepTicks(llllIlIlII[7]);
                                    "".length();
                                }
                                WorldArea worldArea11 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                                int[] iArr49 = new int[llllIlIlII[1]];
                                iArr49[llllIlIlII[0]] = llllIlIlII[216];
                                if (llIIllllIllII(Inventory.contains(iArr49) ? 1 : 0) && llIIllllIllII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint10 = new WorldPoint(llllIlIlII[221], llllIlIlII[222], llllIlIlII[0]);
                                    if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[223]];
                                        C0004e.b(worldPoint10);
                                        Time.sleepTicks(llllIlIlII[2]);
                                        "".length();
                                    }
                                    if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        String[] strArr63 = new String[llllIlIlII[1]];
                                        strArr63[llllIlIlII[0]] = llllIIllII[llllIlIlII[224]];
                                        TileObjects.getNearest(strArr63).interact(llllIIllII[llllIlIlII[225]]);
                                        Time.sleepTicks(llllIlIlII[12]);
                                        "".length();
                                    }
                                }
                            }
                            if (!llIIllllIlllI(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIllllIllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                String[] strArr64 = new String[llllIlIlII[1]];
                                strArr64[llllIlIlII[0]] = llllIIllII[llllIlIlII[226]];
                                NPC nearest12 = NPCs.getNearest(strArr64);
                                if (llIIlllllIIlI(nearest12)) {
                                    int[] iArr50 = new int[llllIlIlII[1]];
                                    iArr50[llllIlIlII[0]] = llllIlIlII[227];
                                    if (llIIllllIlllI(Inventory.contains(iArr50) ? 1 : 0) && llIIlllllIlll(Players.getLocal().getInteracting())) {
                                        if (llIIllllIlllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        nearest12.interact(llllIIllII[llllIlIlII[228]]);
                                        Time.sleepTicks(llllIlIlII[7]);
                                        "".length();
                                    }
                                }
                                int[] iArr51 = new int[llllIlIlII[1]];
                                iArr51[llllIlIlII[0]] = llllIlIlII[227];
                                if (llIIlllllIIlI(TileItems.getNearest(iArr51))) {
                                    int[] iArr52 = new int[llllIlIlII[1]];
                                    iArr52[llllIlIlII[0]] = llllIlIlII[227];
                                    TileItems.getNearest(iArr52).interact(llllIIllII[llllIlIlII[229]]);
                                    Time.sleepTicks(llllIlIlII[2]);
                                    "".length();
                                }
                                int[] iArr53 = new int[llllIlIlII[1]];
                                iArr53[llllIlIlII[0]] = llllIlIlII[227];
                                if (llIIllllIllII(Inventory.contains(iArr53) ? 1 : 0)) {
                                    WorldPoint worldPoint11 = new WorldPoint(llllIlIlII[176], llllIlIlII[230], llllIlIlII[0]);
                                    if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[231]];
                                        C0004e.b(worldPoint11);
                                        Time.sleepTicks(llllIlIlII[2]);
                                        "".length();
                                    }
                                    if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        String[] strArr65 = new String[llllIlIlII[1]];
                                        strArr65[llllIlIlII[0]] = llllIIllII[llllIlIlII[232]];
                                        TileObjects.getNearest(strArr65).interact(llllIIllII[llllIlIlII[233]]);
                                        Time.sleepTicks(llllIlIlII[12]);
                                        "".length();
                                    }
                                }
                            }
                            TileObject nearest13 = TileObjects.getNearest(tileObject6 -> {
                                if (llIIllllIllII(tileObject6.getName().contains(llllIIllII[llllIlIlII[324]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject6) ? 1 : 0)) {
                                    ?? r0 = llllIlIlII[1];
                                    "".length();
                                    return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llllIlIlII[0];
                            });
                            if (llIIlllllIIlI(nearest13)) {
                                if (llIIllllIllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                if (llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr66 = new String[llllIlIlII[1]];
                                    strArr66[llllIlIlII[0]] = llllIIllII[llllIlIlII[234]];
                                    if (llIIllllIllII(nearest13.hasAction(strArr66) ? 1 : 0)) {
                                        nearest13.interact(llllIIllII[llllIlIlII[235]]);
                                        Time.sleepTicks(llllIlIlII[9]);
                                        "".length();
                                    }
                                    String[] strArr67 = new String[llllIlIlII[1]];
                                    strArr67[llllIlIlII[0]] = llllIIllII[llllIlIlII[236]];
                                    if (llIIllllIllII(nearest13.hasAction(strArr67) ? 1 : 0)) {
                                        nearest13.interact(llllIIllII[llllIlIlII[237]]);
                                        Time.sleepTicks(llllIlIlII[9]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIIllllIllII(gS ? 1 : 0) && llIIllllIllII(gT ? 1 : 0) && llIIllllIllII(gR ? 1 : 0) && llIIllllIlllI(gU ? 1 : 0)) {
                        iArr = new int[llllIlIlII[1]];
                        iArr[llllIlIlII[0]] = llllIlIlII[3];
                        if (llIIllllIllII(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr54 = new int[llllIlIlII[1]];
                            iArr54[llllIlIlII[0]] = llllIlIlII[3];
                            Item first13 = Inventory.getFirst(iArr54);
                            int[] iArr55 = new int[llllIlIlII[1]];
                            iArr55[llllIlIlII[0]] = llllIlIlII[5];
                            first13.useOn(Inventory.getFirst(iArr55));
                            Time.sleepTicks(llllIlIlII[7]);
                            "".length();
                        }
                    }
                    if (llIIllllIllII(gU ? 1 : 0)) {
                        String[] strArr68 = new String[llllIlIlII[1]];
                        strArr68[llllIlIlII[0]] = llllIIllII[llllIlIlII[238]];
                        if (llIIllllIlllI(Inventory.contains(strArr68) ? 1 : 0)) {
                            ch();
                        }
                        String[] strArr69 = new String[llllIlIlII[1]];
                        strArr69[llllIlIlII[0]] = llllIIllII[llllIlIlII[239]];
                        if (llIIllllIllII(Inventory.contains(strArr69) ? 1 : 0)) {
                            if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[9])) {
                                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[240]];
                                if (llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr70 = new String[llllIlIlII[1]];
                                    strArr70[llllIlIlII[0]] = llllIIllII[llllIlIlII[241]];
                                    if (llIIlllllIlll(NPCs.getNearest(strArr70))) {
                                        Dialog.close();
                                    }
                                }
                                if (llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo(gQ);
                                    "".length();
                                    Time.sleepTicks(llllIlIlII[1]);
                                    "".length();
                                }
                                String[] strArr71 = new String[llllIlIlII[7]];
                                strArr71[llllIlIlII[0]] = llllIIllII[llllIlIlII[242]];
                                strArr71[llllIlIlII[1]] = llllIIllII[llllIlIlII[243]];
                                strArr71[llllIlIlII[2]] = llllIIllII[llllIlIlII[244]];
                                C0006g.a(strArr71);
                            }
                            if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[9])) {
                                C0006g.a(llllIIllII[llllIlIlII[245]], bQ);
                            }
                        }
                    }
                }
                if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[8]];
                    if (llIIllllIllII(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr56 = new int[llllIlIlII[1]];
                        iArr56[llllIlIlII[0]] = llllIlIlII[35];
                        if (llIIllllIllII(Inventory.contains(iArr56) ? 1 : 0)) {
                            int[] iArr57 = new int[llllIlIlII[1]];
                            iArr57[llllIlIlII[0]] = llllIlIlII[35];
                            Inventory.getFirst(iArr57).interact(llllIIllII[llllIlIlII[56]]);
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                    }
                    Movement.walkTo(gN);
                    "".length();
                    Time.sleepTicks(llllIlIlII[1]);
                    "".length();
                }
                if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gN), llllIlIlII[12])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[57]];
                    if (llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(llllIIllII[llllIlIlII[58]], bQ, llllIlIlII[1]);
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[59]), llllIlIlII[1])) {
                        String[] strArr72 = new String[llllIlIlII[2]];
                        strArr72[llllIlIlII[0]] = llllIIllII[llllIlIlII[60]];
                        strArr72[llllIlIlII[1]] = llllIIllII[llllIlIlII[61]];
                        C0006g.a(strArr72);
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[62]), llllIlIlII[1])) {
                        String[] strArr73 = new String[llllIlIlII[1]];
                        strArr73[llllIlIlII[0]] = llllIIllII[llllIlIlII[63]];
                        C0006g.a(strArr73);
                    }
                    if (!llIIlllllIlIl(Vars.getBit(llllIlIlII[64]), llllIlIlII[1]) || llIIllllIllII(Vars.getBit(llllIlIlII[62]))) {
                        String[] strArr74 = new String[llllIlIlII[1]];
                        strArr74[llllIlIlII[0]] = llllIIllII[llllIlIlII[65]];
                    }
                    String[] strArr75 = new String[llllIlIlII[2]];
                    strArr75[llllIlIlII[0]] = llllIIllII[llllIlIlII[15]];
                    strArr75[llllIlIlII[1]] = llllIIllII[llllIlIlII[66]];
                    C0006g.a(strArr75);
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[67]), llllIlIlII[1])) {
                        String[] strArr76 = new String[llllIlIlII[2]];
                        strArr76[llllIlIlII[0]] = llllIIllII[llllIlIlII[68]];
                        strArr76[llllIlIlII[1]] = llllIIllII[llllIlIlII[69]];
                        C0006g.a(strArr76);
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[54]), llllIlIlII[1])) {
                        String[] strArr77 = new String[llllIlIlII[2]];
                        strArr77[llllIlIlII[0]] = llllIIllII[llllIlIlII[70]];
                        strArr77[llllIlIlII[1]] = llllIIllII[llllIlIlII[71]];
                        C0006g.a(strArr77);
                    }
                }
                if (llIIllllIlllI(Vars.getBit(llllIlIlII[54]))) {
                    strArr10 = new String[llllIlIlII[1]];
                    strArr10[llllIlIlII[0]] = llllIIllII[llllIlIlII[74]];
                    if (llIIllllIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[73]), llllIlIlII[1])) {
                        strArr8 = new String[llllIlIlII[1]];
                        strArr8[llllIlIlII[0]] = llllIIllII[llllIlIlII[82]];
                        if (llIIllllIlllI(Inventory.contains(strArr8) ? 1 : 0)) {
                            ci();
                        }
                        strArr9 = new String[llllIlIlII[1]];
                        strArr9[llllIlIlII[0]] = llllIIllII[llllIlIlII[84]];
                        if (llIIllllIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                        }
                    }
                    if (llIIlllllIlIl(Vars.getBit(llllIlIlII[81]), llllIlIlII[1])) {
                        strArr2 = new String[llllIlIlII[1]];
                        strArr2[llllIlIlII[0]] = llllIIllII[llllIlIlII[119]];
                        if (llIIllllIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                        }
                        strArr3 = new String[llllIlIlII[1]];
                        strArr3[llllIlIlII[0]] = llllIIllII[llllIlIlII[122]];
                        if (llIIllllIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                        }
                        strArr4 = new String[llllIlIlII[1]];
                        strArr4[llllIlIlII[0]] = llllIIllII[llllIlIlII[125]];
                        if (llIIllllIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        }
                        strArr5 = new String[llllIlIlII[1]];
                        strArr5[llllIlIlII[0]] = llllIIllII[llllIlIlII[128]];
                        if (llIIllllIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                        }
                        String[] strArr542 = new String[llllIlIlII[1]];
                        strArr542[llllIlIlII[0]] = llllIIllII[llllIlIlII[25]];
                        nearest3 = TileObjects.getNearest(strArr542);
                        if (llIIlllllIIlI(nearest3)) {
                            if (llIIllllIlllI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            }
                            if (llIIllllIllII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                strArr6 = new String[llllIlIlII[1]];
                                strArr6[llllIlIlII[0]] = llllIIllII[llllIlIlII[133]];
                                if (llIIllllIllII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                }
                                strArr7 = new String[llllIlIlII[1]];
                                strArr7[llllIlIlII[0]] = llllIIllII[llllIlIlII[135]];
                                if (llIIllllIllII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                }
                            }
                        }
                    }
                    if (llIIllllIllII(gR ? 1 : 0)) {
                        if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIlII[85], llllIlIlII[86], llllIlIlII[0])), llllIlIlII[23])) {
                        }
                        worldPoint4 = new WorldPoint(llllIlIlII[138], llllIlIlII[139], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                        if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                    }
                    if (llIIllllIllII(gR ? 1 : 0)) {
                        strArr = new String[llllIlIlII[1]];
                        strArr[llllIlIlII[0]] = llllIIllII[llllIlIlII[146]];
                        if (llIIllllIllII(Inventory.contains(strArr) ? 1 : 0)) {
                        }
                        WorldArea worldArea42 = new WorldArea(llllIlIlII[149], llllIlIlII[150], llllIlIlII[51], llllIlIlII[10], llllIlIlII[0]);
                        worldArea = new WorldArea(llllIlIlII[151], llllIlIlII[152], llllIlIlII[58], llllIlIlII[58], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                            worldPoint3 = new WorldPoint(llllIlIlII[153], llllIlIlII[154], llllIlIlII[0]);
                            if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llllIlIlII[2])) {
                            }
                            if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llllIlIlII[2])) {
                            }
                        }
                        worldArea2 = new WorldArea(llllIlIlII[158], llllIlIlII[159], llllIlIlII[11], llllIlIlII[16], llllIlIlII[0]);
                        WorldArea worldArea52 = new WorldArea(llllIlIlII[160], llllIlIlII[161], llllIlIlII[13], llllIlIlII[7], llllIlIlII[0]);
                        if (llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                            iArr5 = new int[llllIlIlII[1]];
                            iArr5[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIllllIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                            }
                            iArr6 = new int[llllIlIlII[1]];
                            iArr6[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr6))) {
                            }
                            iArr7 = new int[llllIlIlII[1]];
                            iArr7[llllIlIlII[0]] = llllIlIlII[162];
                            if (llIIllllIllII(Inventory.contains(iArr7) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(llllIlIlII[169], llllIlIlII[170], llllIlIlII[0]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                            }
                            if (llIIllllIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                            nearest2 = TileObjects.getNearest(tileObject7 -> {
                                if (llIIllllIllII(tileObject7.getName().contains(llllIIllII[llllIlIlII[334]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject7) ? 1 : 0)) {
                                    ?? r0 = llllIlIlII[1];
                                    "".length();
                                    return ((((132 + 76) - 90) + 21) ^ (((20 + 56) - (-3)) + 64)) == (-" ".length()) ? ((((69 + 35) - 82) + 208) ^ (((39 + 160) - 126) + 108)) & (((18 ^ 105) ^ (232 ^ 192)) ^ (-" ".length())) : r0;
                                }
                                return llllIlIlII[0];
                            });
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[174]];
                            if (llIIlllllIIlI(nearest2)) {
                            }
                        }
                        if (llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                            iArr2 = new int[llllIlIlII[1]];
                            iArr2[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIllllIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                            }
                            iArr3 = new int[llllIlIlII[1]];
                            iArr3[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIlllllIIlI(TileItems.getNearest(iArr3))) {
                            }
                            worldArea3 = new WorldArea(llllIlIlII[183], llllIlIlII[184], llllIlIlII[12], llllIlIlII[11], llllIlIlII[1]);
                            iArr4 = new int[llllIlIlII[1]];
                            iArr4[llllIlIlII[0]] = llllIlIlII[178];
                            if (llIIllllIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                                worldPoint = new WorldPoint(llllIlIlII[163], llllIlIlII[170], llllIlIlII[1]);
                                if (llIIllllIlllI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                                if (llIIllllIllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                            }
                            if (llIIllllIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                        }
                        if (llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[2])) {
                        }
                        if (llIIllllIlllI(new WorldArea(llllIlIlII[176], llllIlIlII[177], llllIlIlII[11], llllIlIlII[13], llllIlIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        nearest = TileObjects.getNearest(tileObject42 -> {
                            if (llIIllllIllII(tileObject42.getName().contains(llllIIllII[llllIlIlII[328]]) ? 1 : 0) && llIIllllIllII(Reachable.isInteractable(tileObject42) ? 1 : 0)) {
                                String[] strArr622 = new String[llllIlIlII[1]];
                                strArr622[llllIlIlII[0]] = llllIIllII[llllIlIlII[329]];
                                if (llIIllllIllII(tileObject42.hasAction(strArr622) ? 1 : 0)) {
                                    ?? r0 = llllIlIlII[1];
                                    "".length();
                                    return (-(51 ^ 55)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return llllIlIlII[0];
                        });
                        if (llIIlllllIIlI(nearest)) {
                        }
                        if (llIIllllIllII(new WorldArea(llllIlIlII[163], llllIlIlII[164], llllIlIlII[26], llllIlIlII[12], llllIlIlII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        WorldArea worldArea72 = new WorldArea(llllIlIlII[194], llllIlIlII[203], llllIlIlII[43], llllIlIlII[9], llllIlIlII[0]);
                        WorldArea worldArea82 = new WorldArea(llllIlIlII[204], llllIlIlII[205], llllIlIlII[13], llllIlIlII[23], llllIlIlII[0]);
                        WorldArea worldArea92 = new WorldArea(llllIlIlII[169], llllIlIlII[206], llllIlIlII[11], llllIlIlII[17], llllIlIlII[0]);
                        if (llIIllllIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                    }
                    if (llIIllllIllII(gS ? 1 : 0)) {
                        iArr = new int[llllIlIlII[1]];
                        iArr[llllIlIlII[0]] = llllIlIlII[3];
                        if (llIIllllIllII(Inventory.contains(iArr) ? 1 : 0)) {
                        }
                    }
                    if (llIIllllIllII(gU ? 1 : 0)) {
                    }
                }
                strArr10 = new String[llllIlIlII[1]];
                strArr10[llllIlIlII[0]] = llllIIllII[llllIlIlII[74]];
                if (llIIllllIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                }
                if (llIIlllllIlIl(Vars.getBit(llllIlIlII[73]), llllIlIlII[1])) {
                }
                if (llIIlllllIlIl(Vars.getBit(llllIlIlII[81]), llllIlIlII[1])) {
                }
                if (llIIllllIllII(gR ? 1 : 0)) {
                }
                if (llIIllllIllII(gR ? 1 : 0)) {
                }
                if (llIIllllIllII(gS ? 1 : 0)) {
                }
                if (llIIllllIllII(gU ? 1 : 0)) {
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[7])) {
                ck = llllIlIlII[0];
                String[] strArr78 = new String[llllIlIlII[1]];
                strArr78[llllIlIlII[0]] = llllIIllII[llllIlIlII[246]];
                NPC nearest14 = NPCs.getNearest(strArr78);
                if (llIIlllllIlll(nearest14) && llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[247]];
                    String[] strArr79 = new String[llllIlIlII[1]];
                    strArr79[llllIlIlII[0]] = llllIIllII[llllIlIlII[248]];
                    TileObjects.getNearest(strArr79).interact(llllIIllII[llllIlIlII[249]]);
                    Time.sleepTicks(llllIlIlII[16]);
                    "".length();
                }
                if (llIIlllllIlll(nearest14) && llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[250]];
                    String[] strArr80 = new String[llllIlIlII[1]];
                    strArr80[llllIlIlII[0]] = llllIIllII[llllIlIlII[251]];
                    TileObjects.getNearest(strArr80).interact(llllIIllII[llllIlIlII[252]]);
                    Time.sleepTicks(llllIlIlII[7]);
                    "".length();
                }
                if (llIIlllllIIlI(nearest14) && llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                    String[] strArr81 = new String[llllIlIlII[1]];
                    strArr81[llllIlIlII[0]] = llllIIllII[llllIlIlII[253]];
                    TileObjects.getNearest(strArr81).interact(llllIIllII[llllIlIlII[254]]);
                    Time.sleepTicks(llllIlIlII[11]);
                    "".length();
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[12])) {
                AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[255]];
                String[] strArr82 = new String[llllIlIlII[1]];
                strArr82[llllIlIlII[0]] = llllIIllII[llllIlIlII[256]];
                NPC nearest15 = NPCs.getNearest(strArr82);
                if (llIIlllllIlll(nearest15)) {
                    Equipment.getFirst(item7 -> {
                        return item7.getName().contains(llllIIllII[llllIlIlII[323]]);
                    }).interact(llllIIllII[llllIlIlII[257]]);
                    Time.sleepTicks(llllIlIlII[23]);
                    "".length();
                    Movement.walkTo(new WorldPoint(llllIlIlII[258], llllIlIlII[259], llllIlIlII[0]));
                    "".length();
                }
                if (llIIlllllIIlI(nearest15)) {
                    C0006g.a(llllIIllII[llllIlIlII[14]], bQ, llllIlIlII[1]);
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[13])) {
                if (llIIllllIlllI(Inventory.contains(item8 -> {
                    return item8.getName().contains(llllIIllII[llllIlIlII[322]]);
                }) ? 1 : 0)) {
                    cg();
                }
                if (llIIllllIllII(Inventory.contains(item9 -> {
                    return item9.getName().contains(llllIIllII[llllIlIlII[321]]);
                }) ? 1 : 0)) {
                    String[] strArr83 = new String[llllIlIlII[1]];
                    strArr83[llllIlIlII[0]] = llllIIllII[llllIlIlII[72]];
                    if (llIIlllllIlll(NPCs.getNearest(strArr83)) && llIIllllIlllI(Players.getLocal().getWorldLocation().getPlane()) && llIIllllIlllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[2])) {
                            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[260]];
                            if (llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr84 = new String[llllIlIlII[1]];
                                strArr84[llllIlIlII[0]] = llllIIllII[llllIlIlII[261]];
                                if (llIIlllllIlll(NPCs.getNearest(strArr84))) {
                                    Dialog.close();
                                }
                            }
                            if (llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(gQ);
                                "".length();
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                            String[] strArr85 = new String[llllIlIlII[7]];
                            strArr85[llllIlIlII[0]] = llllIIllII[llllIlIlII[262]];
                            strArr85[llllIlIlII[1]] = llllIIllII[llllIlIlII[263]];
                            strArr85[llllIlIlII[2]] = llllIIllII[llllIlIlII[264]];
                            C0006g.a(strArr85);
                        }
                        if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(gQ), llllIlIlII[2]) && llIIllllIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr86 = new String[llllIlIlII[1]];
                            strArr86[llllIlIlII[0]] = llllIIllII[llllIlIlII[265]];
                            TileObjects.getNearest(strArr86).interact(llllIIllII[llllIlIlII[266]]);
                            Time.sleepTicks(llllIlIlII[13]);
                            "".length();
                        }
                    }
                    String[] strArr87 = new String[llllIlIlII[1]];
                    strArr87[llllIlIlII[0]] = llllIIllII[llllIlIlII[267]];
                    if (llIIlllllIIlI(NPCs.getNearest(strArr87)) && llIIlllllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlII[1])) {
                        C0006g.a(llllIIllII[llllIlIlII[268]], bQ);
                    }
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[16])) {
                WorldArea worldArea12 = new WorldArea(llllIlIlII[269], llllIlIlII[270], llllIlIlII[89], llllIlIlII[79], llllIlIlII[0]);
                if (llIIllllIlllI(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint12 = new WorldPoint(llllIlIlII[271], llllIlIlII[259], llllIlIlII[0]);
                    if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llllIlIlII[7])) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[272]];
                        Movement.walkTo(worldPoint12);
                        "".length();
                        Time.sleepTicks(llllIlIlII[1]);
                        "".length();
                    }
                    if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llllIlIlII[7])) {
                        String[] strArr88 = new String[llllIlIlII[1]];
                        strArr88[llllIlIlII[0]] = llllIIllII[llllIlIlII[273]];
                        TileObjects.getNearest(strArr88).interact(llllIIllII[llllIlIlII[274]]);
                        Time.sleepTicks(llllIlIlII[9]);
                        "".length();
                    }
                }
                if (llIIllllIllII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr89 = new String[llllIlIlII[1]];
                    strArr89[llllIlIlII[0]] = llllIIllII[llllIlIlII[275]];
                    NPC nearest16 = NPCs.getNearest(strArr89);
                    WorldPoint worldPoint13 = new WorldPoint(llllIlIlII[276], llllIlIlII[152], llllIlIlII[0]);
                    if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llllIlIlII[7]) && llIIlllllIlll(nearest16)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[277]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(llllIlIlII[1]);
                        "".length();
                    }
                    if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llllIlIlII[7]) && llIIlllllIIlI(nearest16) && llIIllllIlllI(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[278]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(llllIlIlII[1]);
                        "".length();
                    }
                    if (llIIlllllIIlI(nearest16) && llIIllllIlllI(Reachable.isInteractable(nearest16) ? 1 : 0) && llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llllIlIlII[7]) && llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                        if (llIIlllllIIll(Combat.getMissingHealth(), llllIlIlII[9])) {
                            String[] strArr90 = new String[llllIlIlII[1]];
                            strArr90[llllIlIlII[0]] = llllIIllII[llllIlIlII[279]];
                            if (llIIllllIllII(Inventory.contains(strArr90) ? 1 : 0)) {
                                String[] strArr91 = new String[llllIlIlII[1]];
                                strArr91[llllIlIlII[0]] = llllIIllII[llllIlIlII[280]];
                                Inventory.getFirst(strArr91).interact(llllIIllII[llllIlIlII[281]]);
                                Time.sleepTicks(llllIlIlII[1]);
                                "".length();
                            }
                        }
                        String[] strArr92 = new String[llllIlIlII[1]];
                        strArr92[llllIlIlII[0]] = llllIIllII[llllIlIlII[282]];
                        TileObjects.getNearest(strArr92).interact(llllIIllII[llllIlIlII[283]]);
                    }
                    if (llIIlllllIIlI(nearest16) && llIIllllIllII(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[284]];
                        if (llIIllllIlllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        if (llIIllllIlllI(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                        }
                        if (llIIllllIlllI(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] strArr93 = new String[llllIlIlII[1]];
                        strArr93[llllIlIlII[0]] = llllIIllII[llllIlIlII[285]];
                        if (llIIllllIllII(Inventory.contains(strArr93) ? 1 : 0)) {
                            String[] strArr94 = new String[llllIlIlII[1]];
                            strArr94[llllIlIlII[0]] = llllIIllII[llllIlIlII[286]];
                            Inventory.getFirst(strArr94).interact(llllIIllII[llllIlIlII[287]]);
                        }
                        if (llIIllllIllII(Inventory.isFull() ? 1 : 0)) {
                            String[] strArr95 = new String[llllIlIlII[1]];
                            strArr95[llllIlIlII[0]] = llllIIllII[llllIlIlII[288]];
                            Inventory.getFirst(strArr95).interact(llllIIllII[llllIlIlII[289]]);
                        }
                        if (llIIlllllIlIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && llIIllllIllII(Inventory.contains(item10 -> {
                            return item10.getName().contains(llllIIllII[llllIlIlII[320]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item11 -> {
                                return item11.getName().contains(llllIIllII[llllIlIlII[319]]);
                            }).interact(llllIIllII[llllIlIlII[290]]);
                        }
                        if (llIIllllIllIl(Vars.getBit(llllIlIlII[291]), llllIlIlII[1]) && llIIllllIllII(Inventory.contains(item12 -> {
                            return item12.getName().contains(llllIIllII[llllIlIlII[318]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item13 -> {
                                return item13.getName().contains(llllIIllII[llllIlIlII[317]]);
                            }).interact(llllIIllII[llllIlIlII[292]]);
                        }
                        if (llIIlllllIlll(Players.getLocal().getInteracting())) {
                            nearest16.interact(llllIIllII[llllIlIlII[293]]);
                            Time.sleepTicks(llllIlIlII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[17])) {
                Prayers.disableAll();
                WorldPoint worldPoint14 = new WorldPoint(llllIlIlII[48], llllIlIlII[49], llllIlIlII[0]);
                if (llIIlllllIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), llllIlIlII[16]) && llIIlllllIlIl(Players.getLocal().getAnimation(), llllIlIlII[294])) {
                    AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[295]];
                    Movement.walkTo(worldPoint14);
                    "".length();
                    Time.sleepTicks(llllIlIlII[1]);
                    "".length();
                }
                if (llIIlllllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), llllIlIlII[16])) {
                    if (llIIllllIllIl(ck, llllIlIlII[1])) {
                        ac.mX += llllIlIlII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIlIlII[1];
                        ac.mX = llllIlIlII[0];
                        cl = llllIlIlII[0];
                    }
                    C0006g.a(llllIIllII[llllIlIlII[296]], bQ, llllIlIlII[1]);
                }
            }
            int[] iArr58 = new int[llllIlIlII[1]];
            iArr58[llllIlIlII[0]] = llllIlIlII[36];
            if (llIIllllIllII(Inventory.contains(iArr58) ? 1 : 0)) {
                int[] iArr59 = new int[llllIlIlII[1]];
                iArr59[llllIlIlII[0]] = llllIlIlII[36];
                if (llIIllllIlllI(Equipment.contains(iArr59) ? 1 : 0) && llIIlllllIIII(C0004e.j(llllIlIlII[14]))) {
                    int[] iArr60 = new int[llllIlIlII[1]];
                    iArr60[llllIlIlII[0]] = llllIlIlII[36];
                    Inventory.getFirst(iArr60).interact(llllIIllII[llllIlIlII[297]]);
                }
            }
            String[] strArr96 = new String[llllIlIlII[1]];
            strArr96[llllIlIlII[0]] = llllIIllII[llllIlIlII[298]];
            if (llIIllllIllII(Inventory.contains(strArr96) ? 1 : 0)) {
                gU = llllIlIlII[1];
                gT = llllIlIlII[1];
                gR = llllIlIlII[1];
                gS = llllIlIlII[1];
            }
            int[] iArr61 = new int[llllIlIlII[1]];
            iArr61[llllIlIlII[0]] = llllIlIlII[3];
            if (llIIllllIllII(Inventory.contains(iArr61) ? 1 : 0)) {
                gT = llllIlIlII[1];
            }
            int[] iArr62 = new int[llllIlIlII[1]];
            iArr62[llllIlIlII[0]] = llllIlIlII[4];
            if (llIIllllIllII(Inventory.contains(iArr62) ? 1 : 0)) {
                gR = llllIlIlII[1];
            }
            int[] iArr63 = new int[llllIlIlII[1]];
            iArr63[llllIlIlII[0]] = llllIlIlII[5];
            if (llIIllllIllII(Inventory.contains(iArr63) ? 1 : 0)) {
                gS = llllIlIlII[1];
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[23])) {
                String[] strArr97 = new String[llllIlIlII[1]];
                strArr97[llllIlIlII[0]] = llllIIllII[llllIlIlII[299]];
                if (llIIlllllIIlI(NPCs.getNearest(strArr97))) {
                    int[] iArr64 = new int[llllIlIlII[1]];
                    iArr64[llllIlIlII[0]] = llllIlIlII[19];
                    if (llIIllllIllII(Inventory.contains(iArr64) ? 1 : 0)) {
                        int[] iArr65 = new int[llllIlIlII[1]];
                        iArr65[llllIlIlII[0]] = llllIlIlII[19];
                        Inventory.getFirst(iArr65).interact(llllIIllII[llllIlIlII[300]]);
                        Time.sleepTicks(llllIlIlII[12]);
                        "".length();
                    }
                }
            }
            if (llIIlllllIlIl(C0004e.j(llllIlIlII[14]), llllIlIlII[23]) && llIIllllIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + C0004e.j(llllIlIlII[14]));
        }
        C0006g.a(new String[llllIlIlII[0]]);
    }

    private static boolean llIIllllIlllI(int i) {
        return i == 0;
    }

    private static void cg() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIlllllIIlI(nearest) && llIIllllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[301]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llllIlIlII[2]);
            "".length();
        }
        if (llIIlllllIIlI(nearest) && llIIllllIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[302]];
            if (llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIlIlII[18]);
                "".length();
            }
            if (llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIlIlII[9]);
                    "".length();
                }
                C0000a.a(llllIlIlII[19], llllIlIlII[11]);
                C0000a.b(C0005f.aU, llllIlIlII[2]);
                C0000a.a(llllIlIlII[45], llllIlIlII[9]);
                C0000a.a(llllIlIlII[41], llllIlIlII[1]);
                C0000a.a(llllIlIlII[39], llllIlIlII[1]);
                C0000a.a(llllIlIlII[46], llllIlIlII[47]);
                int[] iArr = new int[llllIlIlII[1]];
                iArr[llllIlIlII[0]] = llllIlIlII[36];
                if (llIIllllIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllIlIlII[1]];
                    iArr2[llllIlIlII[0]] = llllIlIlII[36];
                    if (llIIllllIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llllIlIlII[36], llllIlIlII[1], Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw(llllIlIlII[35], Inventory.getFreeSlots() - llllIlIlII[1], Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static boolean llIIllllIllll(int i) {
        return i < 0;
    }

    private static String llIIllIllIIll(String lllllllllllllllllIlIlIllIlIllIll, String lllllllllllllllllIlIlIllIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), llllIlIlII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIllIlIlllII) {
            lllllllllllllllllIlIlIllIlIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllllIlII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIlIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlllllIIIl(C0004e.j(llllIlIlII[14]), llllIlIlII[23]) && llIIllllIlllI(Dialog.isOpen() ? 1 : 0)) {
            ?? r0 = llllIlIlII[1];
            "".length();
            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIlII[0];
    }

    private static boolean llIIllllIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlllllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIIllllIlIII() {
        llllIIllII = new String[llllIlIlII[365]];
        llllIIllII[llllIlIlII[0]] = llIIllIllIIlI("Ikh2K/8O2sMCvp/dkorhBw==", "oTbuk");
        llllIIllII[llllIlIlII[1]] = llIIllIllIIll("dLubdeVKOykKE4sjocUU6q8PWUTvQi1uytieSuoDGS7XdC7Ky0lKTjgwzbePpZbs", "zPXje");
        llllIIllII[llllIlIlII[2]] = llIIllIllIIlI("oCWBSd6dS3PnEB7vXk9aNg==", "CNQdT");
        llllIIllII[llllIlIlII[7]] = llIIllIllIIlI("adZSrknnM+Y=", "DYtRh");
        llllIIllII[llllIlIlII[9]] = llIIllIllIIll("cwqIaY1w2rU=", "pTNgb");
        llllIIllII[llllIlIlII[11]] = llIIllIllIIlI("4gqPzyHUQEI=", "KoORt");
        llllIIllII[llllIlIlII[12]] = llIIllIllIIll("kI6/v9DmnJw=", "MdsIU");
        llllIIllII[llllIlIlII[13]] = llIIllIllIlII("LhIH", "kssBN");
        llllIIllII[llllIlIlII[16]] = llIIllIllIlII("HgASWgE/QQYbGzs=", "Padzu");
        llllIIllII[llllIlIlII[17]] = llIIllIllIIlI("zfr1uH5gHxFArdW9YS3CeIc+ggPGi62F", "jjgAr");
        llllIIllII[llllIlIlII[23]] = llIIllIllIIll("UNvJU8YH1EfFAGwj917BJS8FI0yH/mftmNg0P52Yt/Es6XLL2W+g3Z5wL0otL8LJ", "jASmE");
        llllIIllII[llllIlIlII[26]] = llIIllIllIlII("Dgx5LSQ8STQlJSoANyt2Kh08KTp5BzglOipFeT8hMB06JD83Dnk4OXkrDBUfFy4=", "YiYLV");
        llllIIllII[llllIlIlII[28]] = llIIllIllIIll("QiJTTuJrMfgmc3+E31qgK5KXCtFxXQY0l3YmpeSiY0I2XspCTR9mKTQEWK2G2TG/", "nlYqp");
        llllIIllII[llllIlIlII[38]] = llIIllIllIlII("Bj9iEBY0ei8YFyIzLBZEIC8nAhBxKTcBFD0zJwJIcSk1GBAyMisfA3EuLVEmBAMLPyM=", "QZBqd");
        llllIIllII[llllIlIlII[40]] = llIIllIllIlII("JBQXThUFVQIGAAcFQQkUAxkF", "juana");
        llllIIllII[llllIlIlII[20]] = llIIllIllIlII("EhkgOxgoHw==", "FxLPq");
        llllIIllII[llllIlIlII[43]] = llIIllIllIIll("fUBgTdR/yz8Ho6nWq0OVWw==", "HXlMb");
        llllIIllII[llllIlIlII[29]] = llIIllIllIIll("UuzvLTpPb/ZyqLbxyK8Btw==", "rVeRx");
        llllIIllII[llllIlIlII[50]] = llIIllIllIIlI("ZCnEu6ld8Yk=", "zzyla");
        llllIIllII[llllIlIlII[51]] = llIIllIllIlII("BB8dMFMlCRo4GiILAQ==", "VjsUs");
        llllIIllII[llllIlIlII[10]] = llIIllIllIIlI("BnO7udwfS5s=", "vDUeK");
        llllIIllII[llllIlIlII[52]] = llIIllIllIIlI("fh+kcjKbaiA=", "wFbTI");
        llllIIllII[llllIlIlII[53]] = llIIllIllIIlI("HjlA5m3K/4U=", "InEEt");
        llllIIllII[llllIlIlII[55]] = llIIllIllIIll("iJhxOJKPVH3k47/TrenTqg==", "IRdri");
        llllIIllII[llllIlIlII[8]] = llIIllIllIlII("Gg4xdxM7TyQ/BjkfZzASPQMj", "ToGWg");
        llllIIllII[llllIlIlII[56]] = llIIllIllIIll("uzW9INTngts=", "gLKNf");
        llllIIllII[llllIlIlII[57]] = llIIllIllIlII("MhchOiAIEQ==", "fvMQI");
        llllIIllII[llllIlIlII[58]] = llIIllIllIIlI("9LR2PJ2L/OVucxF/NW4u5w==", "ebGVd");
        llllIIllII[llllIlIlII[60]] = llIIllIllIIll("pIOLfzV93y2u3lLtpHRDZ/Z+HXd8/bclF9LwPFJioh25QEokKSYSCw==", "VuxZY");
        llllIIllII[llllIlIlII[61]] = llIIllIllIIll("TTkxOv/BqKEHcGgeJXDKT8XQNVqfk2N+", "CkdZG");
        llllIIllII[llllIlIlII[63]] = llIIllIllIlII("CyQPUDEiJVg5cjM5FwQ3ID9YHSswLhQWciU5Fx1yNyMdUDYxKh8fPGQ4WBIgJioMGG0=", "CKxpR");
        llllIIllII[llllIlIlII[65]] = llIIllIllIIll("jkU/RUNDPCJYStFCoSpg5w==", "XMuei");
        llllIIllII[llllIlIlII[15]] = llIIllIllIIlI("zEOPAdxiqC4Y/03zFEWP4rtrhO3Ypk4cLdNENIPVzMmb2V1P+EcBRQ==", "sKPkz");
        llllIIllII[llllIlIlII[66]] = llIIllIllIIll("DRIDcSSR2wwKzHxo3xnSjupzrpM+vXhCGTJ61p/iYAo=", "dApnE");
        llllIIllII[llllIlIlII[68]] = llIIllIllIIlI("I4LQXLAu0YE7qEsjY+6WKjQA54pzCS0NCL46QLoGOYW/0MWTxo+pHQ==", "gGEVL");
        llllIIllII[llllIlIlII[69]] = llIIllIllIIll("lqcHhN2CoCrszQ2Lco4mFNSLD9VTX9Y4hIm+RZJ4/HM=", "LfKuT");
        llllIIllII[llllIlIlII[70]] = llIIllIllIlII("LQMzZQkEAmQMSgMFKiFKEQQhZRgKGTAgShEDZAYYBAIgKhha", "elDEj");
        llllIIllII[llllIlIlII[71]] = llIIllIllIIll("HJHpor26ArcZRHZdRf9ZYVyjvP45mXuNledRv7Jm2EQ=", "ugefz");
        llllIIllII[llllIlIlII[74]] = llIIllIllIlII("BQcrJEMjAyg=", "HfQAc");
        llllIIllII[llllIlIlII[77]] = llIIllIllIlII("CjEEKzwg", "ECeHP");
        llllIIllII[llllIlIlII[78]] = llIIllIllIIll("6HSn4aYSUH0erhnEW9zrDQ==", "DLocf");
        llllIIllII[llllIlIlII[79]] = llIIllIllIlII("OygmGwcR", "tZGxk");
        llllIIllII[llllIlIlII[80]] = llIIllIllIlII("AzU0KAgp", "LGUKd");
        llllIIllII[llllIlIlII[82]] = llIIllIllIIlI("nlaim+QtHWsyw/fk1Y/yvg==", "QQAzj");
        llllIIllII[llllIlIlII[84]] = llIIllIllIlII("BDcIGCEtKkobOjw=", "HXjkU");
        llllIIllII[llllIlIlII[87]] = llIIllIllIlII("GRgQTxM4WQsOAD4aRgsIOAs=", "Wyfog");
        llllIIllII[llllIlIlII[88]] = llIIllIllIIlI("oBKhxgxAFUiUyyae8UPBN/OVCvSSNWAE", "lEmqL");
        llllIIllII[llllIlIlII[89]] = llIIllIllIIlI("MaAwNLweoc8=", "hnjmT");
        llllIIllII[llllIlIlII[90]] = llIIllIllIIll("IGDyllUOiIc=", "hxgld");
        llllIIllII[llllIlIlII[91]] = llIIllIllIIlI("OCh48qec1evF3ycB5O5YHQ==", "KJNKl");
        llllIIllII[llllIlIlII[6]] = llIIllIllIlII("AjYEFiMrK0YVODo=", "NYfeW");
        llllIIllII[llllIlIlII[92]] = llIIllIllIIll("7hgIyE1N718g3z6GRSwcZg==", "ZalIG");
        llllIIllII[llllIlIlII[93]] = llIIllIllIlII("ATIIPC5sNwA6Pw==", "LSoUM");
        llllIIllII[llllIlIlII[94]] = llIIllIllIIlI("qh25r0+EgujPrJDfcyXAYQ==", "ggxdi");
        llllIIllII[llllIlIlII[95]] = llIIllIllIIll("6uCNM5kXcMfWL+isuu4LDA==", "rUJcT");
        llllIIllII[llllIlIlII[96]] = llIIllIllIIll("W6hxWTMmGxH64i9TSJG1sA==", "cDsMj");
        llllIIllII[llllIlIlII[97]] = llIIllIllIlII("LigUDSUdZh1MOhAvCkw1FiwM", "yAnlW");
        llllIIllII[llllIlIlII[98]] = llIIllIllIIlI("2rE3V1CUdBqZv+P+0/OIYHrJ/xrApGSD", "MgBCk");
        llllIIllII[llllIlIlII[99]] = llIIllIllIlII("BhEdORZrFBU/Bw==", "KpzPu");
        llllIIllII[llllIlIlII[100]] = llIIllIllIlII("JwUeBQ==", "tlrnf");
        llllIIllII[llllIlIlII[101]] = llIIllIllIIlI("n5mErl6Jnqc=", "ZdpOo");
        llllIIllII[llllIlIlII[102]] = llIIllIllIIll("Rp25TLRnNX3gSkBwnD8vVQ==", "yttHf");
        llllIIllII[llllIlIlII[103]] = llIIllIllIIll("0bOUgtS84k3Ol0sauCbpGQ==", "hYISN");
        llllIIllII[llllIlIlII[104]] = llIIllIllIIlI("frwGtWCb+QNXEE5aXu2K6Q==", "Atplo");
        llllIIllII[llllIlIlII[105]] = llIIllIllIlII("OhEXLAFXFB8qEA==", "wppEb");
        llllIIllII[llllIlIlII[106]] = llIIllIllIlII("Hy82BREvJXAODD0t", "JAPlc");
        llllIIllII[llllIlIlII[107]] = llIIllIllIIlI("Ez8cHBsafhu7Vt7HnTZ3Ew==", "SWbSW");
        llllIIllII[llllIlIlII[108]] = llIIllIllIIll("V1wKPfnkMrrywvqVuB+5VQ==", "WZOLz");
        llllIIllII[llllIlIlII[109]] = llIIllIllIlII("BS84MSo2YTFwNTsoJnA6PSsg", "RFBPX");
        llllIIllII[llllIlIlII[110]] = llIIllIllIIll("EzElUCqhMUXIpCk6GICvxdKk0QuKdTIF", "nUjKH");
        llllIIllII[llllIlIlII[111]] = llIIllIllIIll("AtN8TIQXiDjIGJIx4zFNGw==", "aynxX");
        llllIIllII[llllIlIlII[112]] = llIIllIllIIll("uDU+Ft1Tk8k=", "DYYfY");
        llllIIllII[llllIlIlII[113]] = llIIllIllIIlI("N5/OuPJPXdybjjqnhtLV5A==", "Urbdl");
        llllIIllII[llllIlIlII[114]] = llIIllIllIlII("Nx88Pg==", "xoYPY");
        llllIIllII[llllIlIlII[115]] = llIIllIllIIll("HoCl/BRnjFw=", "wIFTf");
        llllIIllII[llllIlIlII[116]] = llIIllIllIIll("uDTAOqGX16E=", "YyYcI");
        llllIIllII[llllIlIlII[117]] = llIIllIllIIlI("OXhm8qgZNsw=", "LtCYU");
        llllIIllII[llllIlIlII[118]] = llIIllIllIIll("7TQ7M3TuFIk=", "qSakt");
        llllIIllII[llllIlIlII[119]] = llIIllIllIIll("p1kFZcBGFAw=", "iepjC");
        llllIIllII[llllIlIlII[120]] = llIIllIllIIlI("9Ese3so5VQ4=", "NhCPm");
        llllIIllII[llllIlIlII[121]] = llIIllIllIIlI("yZflABL12tGykqbHXaWs9Q==", "klSiT");
        llllIIllII[llllIlIlII[122]] = llIIllIllIIll("H5Gdo3bKG8dyyzN7fIfh1g==", "rgwLk");
        llllIIllII[llllIlIlII[123]] = llIIllIllIIll("sorkEoWDTQ4i+DQkuZIwaw==", "ZgLCV");
        llllIIllII[llllIlIlII[124]] = llIIllIllIlII("JiYQOQRLIxg/FQ==", "kGwPg");
        llllIIllII[llllIlIlII[125]] = llIIllIllIIll("VMdDymHSzJK0TU22SOq9VA==", "NOxot");
        llllIIllII[llllIlIlII[126]] = llIIllIllIIll("TcWr9/3VPhSYIHH/qntcgw==", "UJCCl");
        llllIIllII[llllIlIlII[127]] = llIIllIllIlII("ARAfKyZsFRctNw==", "LqxBE");
        llllIIllII[llllIlIlII[128]] = llIIllIllIIll("gbgMXrfOCnf7RlWeKehk3eQco7nhjcBf", "KIqjZ");
        llllIIllII[llllIlIlII[129]] = llIIllIllIIlI("BRsm4LMF0Jf98r+tqe6LgaQLrk6y4VRm", "vwXHe");
        llllIIllII[llllIlIlII[130]] = llIIllIllIlII("JjQmDAFLMS4KEA==", "kUAeb");
        llllIIllII[llllIlIlII[25]] = llIIllIllIlII("FD8yHD4=", "WWWoJ");
        llllIIllII[llllIlIlII[131]] = llIIllIllIIlI("7mxIlE1gqVtYq9NZogWQkw==", "TMXTM");
        llllIIllII[llllIlIlII[132]] = llIIllIllIIlI("EhBlgOZ0lOE=", "UrlLp");
        llllIIllII[llllIlIlII[133]] = llIIllIllIIlI("ZJmMmi5h1gE=", "HlDaN");
        llllIIllII[llllIlIlII[134]] = llIIllIllIIlI("GQA7pJ1N894=", "Mpdzx");
        llllIIllII[llllIlIlII[135]] = llIIllIllIlII("GRIAEzYi", "JwaaU");
        llllIIllII[llllIlIlII[136]] = llIIllIllIlII("MBUDIxUL", "cpbQv");
        llllIIllII[llllIlIlII[137]] = llIIllIllIlII("JTQQMy4=", "gFuRE");
        llllIIllII[llllIlIlII[140]] = llIIllIllIIll("o6G7UF+EgXr8k5aQ69vJJAicbt8WGSvk", "Mjkmh");
        llllIIllII[llllIlIlII[141]] = llIIllIllIIlI("/4yz1Tgk/ewLPdLYOG8blM2p/NtA+PA4bjEy7Typc/k=", "Wprbb");
        llllIIllII[llllIlIlII[142]] = llIIllIllIIll("6+MRUbZVT9ehP+Vgy2MsbiZtlUoC+TQEtm1UJp+G4h5oxoqATF+YMg==", "vCEwn");
        llllIIllII[llllIlIlII[143]] = llIIllIllIIlI("wIZjPRPwwy0=", "KdNNc");
        llllIIllII[llllIlIlII[144]] = llIIllIllIlII("GQg8LTojDg==", "MiPFS");
        llllIIllII[llllIlIlII[145]] = llIIllIllIIlI("ksA59vtnrUqzrZVCyewMIA==", "CxgJV");
        llllIIllII[llllIlIlII[146]] = llIIllIllIIlI("Mootp2/Us9UX9gkMkziXsA==", "NWfeg");
        llllIIllII[llllIlIlII[147]] = llIIllIllIIll("NpRCRl42khpYpdh+4qFBBQ==", "TShJC");
        llllIIllII[llllIlIlII[148]] = llIIllIllIIll("uQxhou4ATXk=", "gMOXT");
        llllIIllII[llllIlIlII[155]] = llIIllIllIlII("CCYdWAQpZwYZCiM=", "FGkxp");
        llllIIllII[llllIlIlII[156]] = llIIllIllIIlI("WRzWE/XjFLk=", "mCFAQ");
        llllIIllII[llllIlIlII[157]] = llIIllIllIlII("Ozw0Hw==", "tLQqq");
        llllIIllII[llllIlIlII[165]] = llIIllIllIIlI("xPo69zG7mACkzqcVBaxzNg==", "qgsCq");
        llllIIllII[llllIlIlII[167]] = llIIllIllIIll("L4SFcjst1JI=", "KOjIe");
        llllIIllII[llllIlIlII[168]] = llIIllIllIIll("6gPTNFFfZds=", "ksOXv");
        llllIIllII[llllIlIlII[171]] = llIIllIllIIlI("Kxvrip2G/VToa5W3dlqh4w==", "OLPZS");
        llllIIllII[llllIlIlII[172]] = llIIllIllIIlI("EGVentiQLiO7089+W7VOSg==", "jbCrx");
        llllIIllII[llllIlIlII[173]] = llIIllIllIlII("CTwdCw==", "FLxex");
        llllIIllII[llllIlIlII[174]] = llIIllIllIlII("MDppAgg=", "wUIwx");
        llllIIllII[llllIlIlII[175]] = llIIllIllIIlI("oNbMtSS4ZQzNUJpTqNI0PQ==", "bXnQc");
        llllIIllII[llllIlIlII[179]] = llIIllIllIlII("LTcWBxsENUIYFxM=", "jRbsr");
        llllIIllII[llllIlIlII[181]] = llIIllIllIIlI("oinJh5jRvE0=", "nOxap");
        llllIIllII[llllIlIlII[182]] = llIIllIllIIll("3AcpS2cRNas=", "BghfV");
        llllIIllII[llllIlIlII[185]] = llIIllIllIIll("8gY6hGc3M+1MqTz56J7p6D2dJNS+eHfZ", "VxacO");
        llllIIllII[llllIlIlII[186]] = llIIllIllIIlI("PznCAHJ88uxx8PtliVymTw==", "zyhYK");
        llllIIllII[llllIlIlII[187]] = llIIllIllIIll("VN6GwV0Vvnk=", "zZVzV");
        llllIIllII[llllIlIlII[188]] = llIIllIllIlII("EjkCHhd8IBs=", "QUksu");
        llllIIllII[llllIlIlII[190]] = llIIllIllIIll("PCgZHaWMrDtNkx+h6LAw/Q==", "XMqvK");
        llllIIllII[llllIlIlII[192]] = llIIllIllIIll("FmIaFbKMtY4=", "AQeFw");
        llllIIllII[llllIlIlII[193]] = llIIllIllIlII("OhQnFg==", "nuLst");
        llllIIllII[llllIlIlII[195]] = llIIllIllIlII("GRssWjg4WiMfIDsVLVooOBUo", "WzZzL");
        llllIIllII[llllIlIlII[196]] = llIIllIllIIlI("xHeO7pUg0TrT09iY98ycFQ==", "okcHG");
        llllIIllII[llllIlIlII[197]] = llIIllIllIIlI("7z0OARPflCA=", "mHRlb");
        llllIIllII[llllIlIlII[198]] = llIIllIllIIll("FN0d6XSE961HgVXep5gsKw==", "xRgJy");
        llllIIllII[llllIlIlII[201]] = llIIllIllIIlI("StK7sGfJZdEUcRhlbT+A7A==", "HzoGw");
        llllIIllII[llllIlIlII[202]] = llIIllIllIIlI("bclKG/bjukCkCu6jJNTCZA==", "RAtcV");
        llllIIllII[llllIlIlII[208]] = llIIllIllIIlI("/mVj1QcU6BzqT1+qmNHNxB/jJTpoqR7B", "zcddy");
        llllIIllII[llllIlIlII[210]] = llIIllIllIIll("hwpEoxqlf18=", "ABKuE");
        llllIIllII[llllIlIlII[211]] = llIIllIllIlII("LBs6Ng==", "xzQSM");
        llllIIllII[llllIlIlII[213]] = llIIllIllIIlI("+pzRAuPVAnmWH8pv9yeur9WvcBwN0XgU", "NTfvM");
        llllIIllII[llllIlIlII[214]] = llIIllIllIIlI("2Rj+/GmI/CzJ149GKPP4ZA==", "OoVWC");
        llllIIllII[llllIlIlII[215]] = llIIllIllIIlI("yzxXuSeAAEI=", "qCJlK");
        llllIIllII[llllIlIlII[217]] = llIIllIllIlII("Hgc6Di03BW4RISA=", "YbNzD");
        llllIIllII[llllIlIlII[219]] = llIIllIllIlII("IhclJTkI", "ccQDZ");
        llllIIllII[llllIlIlII[220]] = llIIllIllIIlI("VtP6a1tiyuo=", "RNNzt");
        llllIIllII[llllIlIlII[223]] = llIIllIllIIlI("Av0ZbWaE6iY8fi1AzOmXwjLoPvhCS4tE", "peaUK");
        llllIIllII[llllIlIlII[224]] = llIIllIllIIlI("zt6xml0LZAr3vxmZxQeIOg==", "JSuvO");
        llllIIllII[llllIlIlII[225]] = llIIllIllIIll("sRtvlyGx2bY=", "VQXNV");
        llllIIllII[llllIlIlII[226]] = llIIllIllIlII("OiwiEgAEaTUECBkn", "vIQae");
        llllIIllII[llllIlIlII[228]] = llIIllIllIIll("ZbDsuboaJfQ=", "CpoPT");
        llllIIllII[llllIlIlII[229]] = llIIllIllIlII("NgIDFA==", "bchqw");
        llllIIllII[llllIlIlII[231]] = llIIllIllIlII("GyU1SyU6ZCQZNDAqYw8+OjY=", "UDCkQ");
        llllIIllII[llllIlIlII[232]] = llIIllIllIIlI("bOrq4WqkPigcaZk81BRSnw==", "moQYt");
        llllIIllII[llllIlIlII[233]] = llIIllIllIlII("GSMIGw==", "VSmuS");
        llllIIllII[llllIlIlII[234]] = llIIllIllIIlI("oi1ozvgVAwM=", "MWMHs");
        llllIIllII[llllIlIlII[235]] = llIIllIllIIll("D+ZKpFRPmlQ=", "rsPcW");
        llllIIllII[llllIlIlII[236]] = llIIllIllIIlI("cRcWeXHs5n8=", "lqvJO");
        llllIIllII[llllIlIlII[237]] = llIIllIllIIll("hjnJxNUE48Y=", "tQNCG");
        llllIIllII[llllIlIlII[238]] = llIIllIllIIll("wuMzjmcXiLc=", "Sgmwy");
        llllIIllII[llllIlIlII[239]] = llIIllIllIlII("OTg2OhM=", "iTWTx");
        llllIIllII[llllIlIlII[240]] = llIIllIllIlII("ATsEZT8gehAqKjs=", "OZrEK");
        llllIIllII[llllIlIlII[241]] = llIIllIllIIll("CcrWVXnQP0IEgSCcY3lsmA==", "mOlaQ");
        llllIIllII[llllIlIlII[242]] = llIIllIllIIlI("DviDKjzYBECu/lQtY56g4++Rr5VSu1Q+tRT6LvW09qA=", "LWQCG");
        llllIIllII[llllIlIlII[243]] = llIIllIllIIlI("FBWcPaL27MBorTviYel1sDR3VJCxdix8aLxSPNsLB5qL+/YivetEnA==", "JShrZ");
        llllIIllII[llllIlIlII[244]] = llIIllIllIIlI("NDn1ks9P6z0=", "HJGJK");
        llllIIllII[llllIlIlII[245]] = llIIllIllIlII("AgcOIxcnGAo=", "IkoQr");
        llllIIllII[llllIlIlII[246]] = llIIllIllIlII("ARsFMARiGAggSggfCTIDLAk=", "BzgYj");
        llllIIllII[llllIlIlII[247]] = llIIllIllIlII("KAANFD0DAQtGOwUOGA==", "jolfY");
        llllIIllII[llllIlIlII[248]] = llIIllIllIIll("HbL8FhJYLEKwAXED1wdi9w==", "ejYPp");
        llllIIllII[llllIlIlII[249]] = llIIllIllIIll("MD5ZCmZeSWM=", "MBAWj");
        llllIIllII[llllIlIlII[250]] = llIIllIllIlII("IS0gKzEaJjdqKxwkNQ==", "sHPJC");
        llllIIllII[llllIlIlII[251]] = llIIllIllIIlI("aHTV7+sGFL0=", "cPCBT");
        llllIIllII[llllIlIlII[252]] = llIIllIllIlII("KgcIDwMK", "xbxnj");
        llllIIllII[llllIlIlII[253]] = llIIllIllIIlI("0SsDS8mwt0g=", "aqDDQ");
        llllIIllII[llllIlIlII[254]] = llIIllIllIIll("TulFEarHyLYV4WL2EzwWlw==", "vhBie");
        llllIIllII[llllIlIlII[255]] = llIIllIllIlII("Ojo6HjgVcyYSMg==", "rSHwV");
        llllIIllII[llllIlIlII[256]] = llIIllIllIIlI("kU7qAOk3N8M=", "qLAVW");
        llllIIllII[llllIlIlII[257]] = llIIllIllIlII("DT04DQAmPXkiByUjOBML", "IOYtn");
        llllIIllII[llllIlIlII[14]] = llIIllIllIIlI("7RrjVVYFu3o=", "ZFFGn");
        llllIIllII[llllIlIlII[72]] = llIIllIllIIll("q6VJdgDhOda8UI63GDhaPw==", "LVVCA");
        llllIIllII[llllIlIlII[260]] = llIIllIllIlII("Jw8xbSwGTiUiOR0=", "inGMX");
        llllIIllII[llllIlIlII[261]] = llIIllIllIlII("LhIxMyMAFGIoKgsOISI+", "mgBGL");
        llllIIllII[llllIlIlII[262]] = llIIllIllIIlI("U5iOVIHV0hdEzhyfRo1Zo2DjXOKnATsP0KZVOowkJ8w=", "iAOZh");
        llllIIllII[llllIlIlII[263]] = llIIllIllIIll("IJSb+u/r7YPVz02yH13e4t7KVoqd1ZpyxE2LQ3aG0ktWJ8NOblRdrA==", "uaVYv");
        llllIIllII[llllIlIlII[264]] = llIIllIllIIll("CQRkH6c/cnw=", "sPEjM");
        llllIIllII[llllIlIlII[265]] = llIIllIllIlII("IBcIEAYLFwgc", "gvfwv");
        llllIIllII[llllIlIlII[266]] = llIIllIllIlII("BCU5BSM=", "GWVvP");
        llllIIllII[llllIlIlII[267]] = llIIllIllIIll("lp42QkanitA8WUbxATbScA==", "IoaVR");
        llllIIllII[llllIlIlII[268]] = llIIllIllIlII("KjslHhgANHUkHA0=", "iZUjy");
        llllIIllII[llllIlIlII[272]] = llIIllIllIlII("JQobVT4ESwgbPhkKAxYv", "kkmuJ");
        llllIIllII[llllIlIlII[273]] = llIIllIllIlII("JSk1CQ==", "mFYlC");
        llllIIllII[llllIlIlII[274]] = llIIllIllIIll("8qV7XlYjMjw=", "uPWEU");
        llllIIllII[llllIlIlII[275]] = llIIllIllIIll("Ye0oYajiHKk=", "ltWdF");
        llllIIllII[llllIlIlII[277]] = llIIllIllIIlI("8o6+hHINKuZjGTIi4bGkgg==", "zTaQk");
        llllIIllII[llllIlIlII[278]] = llIIllIllIlII("KzUsVgUKdDwfFg0g", "eTZvq");
        llllIIllII[llllIlIlII[279]] = llIIllIllIIlI("IxrQkRt3L48=", "vJVeZ");
        llllIIllII[llllIlIlII[280]] = llIIllIllIIll("QUlVlNpe3OM=", "PzkXp");
        llllIIllII[llllIlIlII[281]] = llIIllIllIIll("94avcqK/658=", "aDoJb");
        llllIIllII[llllIlIlII[282]] = llIIllIllIIlI("MBsoo2S+oR8=", "nZYCL");
        llllIIllII[llllIlIlII[283]] = llIIllIllIIll("eZyHiG+dQuclkszcNxJjZA==", "FigFF");
        llllIIllII[llllIlIlII[284]] = llIIllIllIIll("Gg2VdvpbVFAaBc8CWNoAvTKB6/cReOsD", "XSQPY");
        llllIIllII[llllIlIlII[285]] = llIIllIllIlII("ByUtJg==", "QLLJc");
        llllIIllII[llllIlIlII[286]] = llIIllIllIIlI("lYwUu1tSpzc=", "WPrrj");
        llllIIllII[llllIlIlII[287]] = llIIllIllIIlI("1GOf5YirbMo=", "AbeYL");
        llllIIllII[llllIlIlII[288]] = llIIllIllIIll("UCPdYh+LGGM=", "jLcrp");
        llllIIllII[llllIlIlII[289]] = llIIllIllIIll("oTAvX8zLf5w=", "Qbyig");
        llllIIllII[llllIlIlII[290]] = llIIllIllIlII("DwMgJCY=", "KqIJM");
        llllIIllII[llllIlIlII[292]] = llIIllIllIIlI("XlulqctIUZY=", "BppUM");
        llllIIllII[llllIlIlII[293]] = llIIllIllIlII("KiI1FQoA", "kVAti");
        llllIIllII[llllIlIlII[295]] = llIIllIllIlII("KjUsTCILdDUWPwU3Mg==", "dTZlV");
        llllIIllII[llllIlIlII[296]] = llIIllIllIIlI("RJ00sT8Furw=", "rpMCy");
        llllIIllII[llllIlIlII[297]] = llIIllIllIIll("Jlql5/8bqkk=", "qgtwo");
        llllIIllII[llllIlIlII[298]] = llIIllIllIIll("MMQIlA47pZbDA3ZqLIoBxQ==", "DhWQd");
        llllIIllII[llllIlIlII[299]] = llIIllIllIIlI("aN/UAigHVKc=", "hhBnT");
        llllIIllII[llllIlIlII[300]] = llIIllIllIIlI("KhGoZJvULxk=", "EBIgc");
        llllIIllII[llllIlIlII[301]] = llIIllIllIlII("FBg8dQE1WSg0GzE=", "ZyJUu");
        llllIIllII[llllIlIlII[302]] = llIIllIllIIll("s17hAg9uwgA5X70aYRQTPNlqfflDKrM/", "ZXuER");
        llllIIllII[llllIlIlII[303]] = llIIllIllIIll("g+Fn5RHe2/C8OnrnjyEXcg==", "littS");
        llllIIllII[llllIlIlII[304]] = llIIllIllIlII("DRs0LzksFD1rNyQUMSI7Ig==", "EzZKU");
        llllIIllII[llllIlIlII[306]] = llIIllIllIIll("ZyIDDc94Dow3zPUL5hTnnQ==", "UEtej");
        llllIIllII[llllIlIlII[307]] = llIIllIllIIlI("31K0h8TQcxcxytQe3mWKEtj3nQNKexr9", "PXgLT");
        llllIIllII[llllIlIlII[308]] = llIIllIllIIlI("Uqj5TMi0D3hnVSJ14kJfFA==", "kWcCo");
        llllIIllII[llllIlIlII[315]] = llIIllIllIIlI("tYqY2yagGrbHhNc/7T1A+zCBa2Yr4///", "RGNnk");
        llllIIllII[llllIlIlII[316]] = llIIllIllIIlI("NGz16W0nvS88AHLbnJtoF8KkDR+JHFbQ", "apfbw");
        llllIIllII[llllIlIlII[317]] = llIIllIllIIlI("dSOEAcKdSNTBhmQbQGUWoA==", "cmNXL");
        llllIIllII[llllIlIlII[318]] = llIIllIllIlII("Lho6Aw8GBis=", "otNji");
        llllIIllII[llllIlIlII[319]] = llIIllIllIlII("Gx0gEjAM", "xrMpQ");
        llllIIllII[llllIlIlII[320]] = llIIllIllIlII("GyAYLgwM", "xOuLm");
        llllIIllII[llllIlIlII[321]] = llIIllIllIlII("CSggPiIhNDE=", "HFTWD");
        llllIIllII[llllIlIlII[322]] = llIIllIllIIlI("CWaDre5gE+D0iWXqDdREDQ==", "fZVwo");
        llllIIllII[llllIlIlII[323]] = llIIllIllIIlI("MoFpU+ghHu4=", "OdVve");
        llllIIllII[llllIlIlII[324]] = llIIllIllIIlI("1BP01EWN8Jk=", "wBmFY");
        llllIIllII[llllIlIlII[325]] = llIIllIllIlII("AyIqFh88", "YMGtv");
        llllIIllII[llllIlIlII[326]] = llIIllIllIIlI("6aWHsYoVN+4=", "Xoxqa");
        llllIIllII[llllIlIlII[327]] = llIIllIllIlII("NjUYIiNYPR44Lw==", "uYqOA");
        llllIIllII[llllIlIlII[328]] = llIIllIllIIll("xDKhcNNn3D8=", "JNeXk");
        llllIIllII[llllIlIlII[329]] = llIIllIllIIlI("M3pWhz7inrZ9+0CfmVUFig==", "CUPEG");
        llllIIllII[llllIlIlII[330]] = llIIllIllIIlI("EZPrya/XEmo=", "ajcxC");
        llllIIllII[llllIlIlII[331]] = llIIllIllIlII("PwMwGBwYBzs=", "lhUty");
        llllIIllII[llllIlIlII[332]] = llIIllIllIIll("caW54VCj804=", "RyewF");
        llllIIllII[llllIlIlII[333]] = llIIllIllIIll("8WvXmpqQMXg=", "fCMXX");
        llllIIllII[llllIlIlII[334]] = llIIllIllIIlI("K84PoN12gww=", "ZlNee");
        llllIIllII[llllIlIlII[335]] = llIIllIllIlII("PC4WFiYj", "KKwzR");
        llllIIllII[llllIlIlII[336]] = llIIllIllIIlI("71HW4AEJAQ4=", "bkMYl");
        llllIIllII[llllIlIlII[337]] = llIIllIllIIlI("WFAfxSQle4A=", "CXobG");
        llllIIllII[llllIlIlII[338]] = llIIllIllIIlI("lWxkJmUDMm4=", "mtLRK");
        llllIIllII[llllIlIlII[339]] = llIIllIllIlII("IhkgJhQ=", "EuOTm");
        llllIIllII[llllIlIlII[340]] = llIIllIllIIlI("ZSu/7A/+yjg=", "mGACr");
        llllIIllII[llllIlIlII[349]] = llIIllIllIIlI("jsIYnPP2IStgQ4RVOIBS3sFFXTZE2e9p", "VpDxl");
        llllIIllII[llllIlIlII[350]] = llIIllIllIIll("YhccGPjbgLQ=", "kMehS");
        llllIIllII[llllIlIlII[351]] = llIIllIllIIll("vZ8zjQmTQSxaML8qEN0PiQ32vhW/p5Mm7iWTRRINMZXrnf+1s3wW6g==", "PYzvV");
        llllIIllII[llllIlIlII[352]] = llIIllIllIIlI("owd0jwvsa4OgUKpzBmAhgJmJzUzToOTA8qlfVa89/3scoiJKGJCr9/VvfsJhydqe0P33WEP5f+4=", "Cfofg");
        llllIIllII[llllIlIlII[353]] = llIIllIllIlII("InobJjwePQc6cxI1Gm4kDigKbjQEMwEpcx81Tyk6HT9PIzZLO08/Jg4pG2A=", "kZoNS");
        llllIIllII[llllIlIlII[354]] = llIIllIllIIll("569+ZFIqeCqa/4quZckq5MvgpaofNVURTNKTLIr0QyA=", "eTdyQ");
        llllIIllII[llllIlIlII[355]] = llIIllIllIIll("V2+OI/YyQVEW9ww0B/7DMRb3lbm7+A3c", "ksdHY");
        llllIIllII[llllIlIlII[356]] = llIIllIllIIll("VapKJi2mEyjQ9YFRK03SszKyE3kF3R+SGexAibF5Cs5ekGc+o/CF2g==", "iTKAx");
        llllIIllII[llllIlIlII[357]] = llIIllIllIIll("HG63DolwPM86uv/NxThVbbmBN2WwBpyu2b4zUSfr0MZLpIMVQAsya221odBMhaGfAMnuybbf320=", "ZkAYn");
        llllIIllII[llllIlIlII[358]] = llIIllIllIIlI("apWSxSS7TA57TXUQYs2rwP+zRoaOLfrOjieKaS5bFxc9sw9J+kbN53iirIUWkbn5t5BKg3ttwTs=", "cMqfj");
        llllIIllII[llllIlIlII[359]] = llIIllIllIIlI("2FDgnAszwSBMqB2o/hDKQatK+85iO+8uWvCA9EAu1xSsIrXP6npvnOQS12bJQTZm", "sVjDe");
        llllIIllII[llllIlIlII[360]] = llIIllIllIIll("a6pjfDejiBqibgMPr9Rj7MHFDHbiXSWJUcC8cxS9Sok=", "xykxE");
        llllIIllII[llllIlIlII[361]] = llIIllIllIIlI("lRplJ3sdIyxPzdO09+jwZxiFKUxqFuwm", "mVOHD");
        llllIIllII[llllIlIlII[362]] = llIIllIllIIll("AlyF0ZJRvvEHggVhFQ4ux33xwMWQQ44M", "YeHQS");
        llllIIllII[llllIlIlII[363]] = llIIllIllIIlI("Ap6+hXKkaesNxwkpojnsohEj3Yp6LzAG9WKEtnEnthVo0apoACia16axAmVK1Ls8", "mnKdG");
        llllIIllII[llllIlIlII[364]] = llIIllIllIIll("shF/0CdSkBpG8qWmFd9zqA==", "rNAOq");
    }

    private static int llIIllllIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIIllII[llllIlIlII[315]];
    }

    private static void llIIllllIlIlI() {
        llllIlIlII = new int[366];
        llllIlIlII[0] = ((67 ^ 25) ^ (180 ^ 185)) & (((168 ^ 173) ^ (124 ^ 46)) ^ (-" ".length()));
        llllIlIlII[1] = " ".length();
        llllIlIlII[2] = "  ".length();
        llllIlIlII[3] = (-29185) & 30719;
        llllIlIlII[4] = (-((-28291) & 32711)) & (-24625) & 30581;
        llllIlIlII[5] = (-4491) & 6026;
        llllIlIlII[6] = (((151 + 76) - 80) + 16) ^ (((65 + 64) - 126) + 142);
        llllIlIlII[7] = "   ".length();
        llllIlIlII[8] = 221 ^ 197;
        llllIlIlII[9] = 11 ^ 15;
        llllIlIlII[10] = (((163 + 59) - 105) + 72) ^ (((109 + 101) - 134) + 93);
        llllIlIlII[11] = (9 ^ 60) ^ (165 ^ 149);
        llllIlIlII[12] = (72 ^ 101) ^ (0 ^ 43);
        llllIlIlII[13] = (33 ^ 116) ^ (248 ^ 170);
        llllIlIlII[14] = ((130 + 83) - 203) + 166;
        llllIlIlII[15] = 100 ^ 68;
        llllIlIlII[16] = 2 ^ 10;
        llllIlIlII[17] = 61 ^ 52;
        llllIlIlII[18] = (-((-2575) & 3711)) & (-8200) & 14335;
        llllIlIlII[19] = (-8193) & 16199;
        llllIlIlII[20] = (((36 + 32) - (-41)) + 68) ^ (((174 + 93) - 201) + 124);
        llllIlIlII[21] = (-8213) & 16221;
        llllIlIlII[22] = (-146) & 8153;
        llllIlIlII[23] = 33 ^ 43;
        llllIlIlII[24] = (-18557) & 20095;
        llllIlIlII[25] = 84 ^ 14;
        llllIlIlII[26] = 122 ^ 113;
        llllIlIlII[27] = (-((-9801) & 28286)) & (-13321) & 32765;
        llllIlIlII[28] = (118 ^ 58) ^ (46 ^ 110);
        llllIlIlII[29] = 139 ^ 154;
        llllIlIlII[30] = (-6401) & 8191;
        llllIlIlII[31] = (-4233) & 6139;
        llllIlIlII[32] = (-((-4385) & 15345)) & (-1) & 11261;
        llllIlIlII[33] = (-8194) & 9143;
        llllIlIlII[34] = (-1749) & 4095;
        llllIlIlII[35] = (-31841) & 32225;
        llllIlIlII[36] = (-((-6755) & 31606)) & (-73) & 26463;
        llllIlIlII[37] = (-1193) & 13817;
        llllIlIlII[38] = (179 ^ 195) ^ (33 ^ 92);
        llllIlIlII[39] = (-((-9370) & 14075)) & (-8193) & 15349;
        llllIlIlII[40] = (235 ^ 131) ^ (247 ^ 145);
        llllIlIlII[41] = (-((-4629) & 24189)) & (-1) & 32255;
        llllIlIlII[42] = (-16401) & 28378;
        llllIlIlII[43] = 30 ^ 14;
        llllIlIlII[44] = (-10433) & 11765;
        llllIlIlII[45] = (-20578) & 23011;
        llllIlIlII[46] = (-((-9161) & 28637)) & (-4097) & 24567;
        llllIlIlII[47] = (-((-9242) & 25983)) & (-1025) & 32765;
        llllIlIlII[48] = (-1025) & 4093;
        llllIlIlII[49] = (-24579) & 28095;
        llllIlIlII[50] = 172 ^ 190;
        llllIlIlII[51] = (((53 + 26) - (-33)) + 78) ^ (((84 + 152) - 74) + 11);
        llllIlIlII[52] = (30 ^ 71) ^ (238 ^ 162);
        llllIlIlII[53] = (((151 + 57) - 56) + 38) ^ (((143 + 97) - 175) + 103);
        llllIlIlII[54] = (-4362) & 8105;
        llllIlIlII[55] = (12 ^ 87) ^ (99 ^ 47);
        llllIlIlII[56] = (170 ^ 152) ^ (189 ^ 150);
        llllIlIlII[57] = (((53 + 69) - 87) + 107) ^ (((58 + 44) - 26) + 72);
        llllIlIlII[58] = (((79 + 44) - 112) + 153) ^ (((169 + 182) - 164) + 4);
        llllIlIlII[59] = (-16463) & 20207;
        llllIlIlII[60] = (((114 + 39) - (-12)) + 11) ^ (((86 + 77) - 65) + 74);
        llllIlIlII[61] = 172 ^ 177;
        llllIlIlII[62] = (-20813) & 24558;
        llllIlIlII[63] = (199 ^ 146) ^ (215 ^ 156);
        llllIlIlII[64] = (-16481) & 20222;
        llllIlIlII[65] = 98 ^ 125;
        llllIlIlII[66] = 64 ^ 97;
        llllIlIlII[67] = (-4097) & 7839;
        llllIlIlII[68] = (217 ^ 198) ^ (139 ^ 182);
        llllIlIlII[69] = 43 ^ 8;
        llllIlIlII[70] = 135 ^ 163;
        llllIlIlII[71] = 69 ^ 96;
        llllIlIlII[72] = (((175 ^ 142) + (86 ^ 26)) - (79 ^ 23)) + ((127 + 126) - 187) + 90;
        llllIlIlII[73] = (-((-290) & 12793)) & (-16385) & 30719;
        llllIlIlII[74] = 26 ^ 60;
        llllIlIlII[75] = (-25641) & 28654;
        llllIlIlII[76] = (-8705) & 12205;
        llllIlIlII[77] = 44 ^ 11;
        llllIlIlII[78] = (224 ^ 189) ^ (233 ^ 156);
        llllIlIlII[79] = 110 ^ 71;
        llllIlIlII[80] = 234 ^ 192;
        llllIlIlII[81] = (-24657) & 28406;
        llllIlIlII[82] = (153 ^ 151) ^ (94 ^ 123);
        llllIlIlII[83] = (-((-7983) & 16191)) & (-16449) & 28405;
        llllIlIlII[84] = (((101 + 27) - 16) + 21) ^ (((111 + 113) - 100) + 45);
        llllIlIlII[85] = (-5127) & 8175;
        llllIlIlII[86] = (-10) & 9849;
        llllIlIlII[87] = (((60 + 115) - 114) + 74) ^ (((21 + 135) - 18) + 32);
        llllIlIlII[88] = 116 ^ 90;
        llllIlIlII[89] = (((147 + 138) - 197) + 66) ^ (((81 + 82) - 16) + 34);
        llllIlIlII[90] = 166 ^ 150;
        llllIlIlII[91] = 150 ^ 167;
        llllIlIlII[92] = 137 ^ 186;
        llllIlIlII[93] = (74 ^ 98) ^ (144 ^ 140);
        llllIlIlII[94] = 44 ^ 25;
        llllIlIlII[95] = (147 ^ 152) ^ (72 ^ 117);
        llllIlIlII[96] = 99 ^ 84;
        llllIlIlII[97] = (61 ^ 26) ^ (98 ^ 125);
        llllIlIlII[98] = (71 ^ 115) ^ (120 ^ 117);
        llllIlIlII[99] = 68 ^ 126;
        llllIlIlII[100] = 23 ^ 44;
        llllIlIlII[101] = 81 ^ 109;
        llllIlIlII[102] = 10 ^ 55;
        llllIlIlII[103] = 60 ^ 2;
        llllIlIlII[104] = (66 ^ 36) ^ (78 ^ 23);
        llllIlIlII[105] = (((137 + 18) - 129) + 219) ^ (((159 + 53) - 57) + 26);
        llllIlIlII[106] = 69 ^ 4;
        llllIlIlII[107] = 49 ^ 115;
        llllIlIlII[108] = 79 ^ 12;
        llllIlIlII[109] = (170 ^ 146) ^ (8 ^ 116);
        llllIlIlII[110] = (((110 + 192) - 203) + 101) ^ (((39 + 95) - 68) + 75);
        llllIlIlII[111] = (168 ^ 139) ^ (16 ^ 117);
        llllIlIlII[112] = 112 ^ 55;
        llllIlIlII[113] = (((236 + 87) - 162) + 94) ^ (((152 + 147) - 259) + 143);
        llllIlIlII[114] = (((170 + 42) - 35) + 50) ^ (((73 + 71) - 109) + 135);
        llllIlIlII[115] = (150 ^ 153) ^ (207 ^ 138);
        llllIlIlII[116] = 49 ^ 122;
        llllIlIlII[117] = (193 ^ 185) ^ (84 ^ 96);
        llllIlIlII[118] = 25 ^ 84;
        llllIlIlII[119] = (193 ^ 163) ^ (14 ^ 34);
        llllIlIlII[120] = (82 ^ 0) ^ (105 ^ 116);
        llllIlIlII[121] = 114 ^ 34;
        llllIlIlII[122] = 32 ^ 113;
        llllIlIlII[123] = 216 ^ 138;
        llllIlIlII[124] = (((51 + 169) - 77) + 78) ^ (((61 + 83) - 59) + 57);
        llllIlIlII[125] = (122 ^ 69) ^ (95 ^ 52);
        llllIlIlII[126] = (71 ^ 86) ^ (203 ^ 143);
        llllIlIlII[127] = 228 ^ 178;
        llllIlIlII[128] = (((187 + 150) - 126) + 35) ^ (((67 + 93) - 108) + 109);
        llllIlIlII[129] = 117 ^ 45;
        llllIlIlII[130] = (11 ^ 123) ^ (118 ^ 95);
        llllIlIlII[131] = (115 ^ 116) ^ (254 ^ 162);
        llllIlIlII[132] = 159 ^ 195;
        llllIlIlII[133] = (239 ^ 130) ^ (131 ^ 179);
        llllIlIlII[134] = (((10 + 182) - 131) + 189) ^ (((63 + 152) - 187) + 136);
        llllIlIlII[135] = (145 ^ 142) ^ (79 ^ 15);
        llllIlIlII[136] = 55 ^ 87;
        llllIlIlII[137] = (128 ^ 185) ^ (47 ^ 119);
        llllIlIlII[138] = (-21506) & 24517;
        llllIlIlII[139] = (-((-1797) & 30471)) & (-905) & 32767;
        llllIlIlII[140] = 16 ^ 114;
        llllIlIlII[141] = (((17 + 49) - 47) + 221) ^ (((145 + 73) - 151) + 80);
        llllIlIlII[142] = (222 ^ 186) ^ ((12 ^ 2) & ((153 ^ 151) ^ (-1)));
        llllIlIlII[143] = (228 ^ 196) ^ (71 ^ 2);
        llllIlIlII[144] = 2 ^ 100;
        llllIlIlII[145] = (46 ^ 21) ^ (208 ^ 140);
        llllIlIlII[146] = (((73 + 130) - 13) + 6) ^ (((125 + 160) - 231) + 118);
        llllIlIlII[147] = 29 ^ 116;
        llllIlIlII[148] = 103 ^ 13;
        llllIlIlII[149] = (-((-674) & 29367)) & (-1) & 31615;
        llllIlIlII[150] = (-8978) & 12215;
        llllIlIlII[151] = (-156) & 3071;
        llllIlIlII[152] = (-16908) & 26543;
        llllIlIlII[153] = (-((-18461) & 23711)) & (-16385) & 24575;
        llllIlIlII[154] = (-8710) & 11957;
        llllIlIlII[155] = (((232 + 183) - 304) + 132) ^ (((46 + 102) - 93) + 97);
        llllIlIlII[156] = (((45 + 74) - (-44)) + 10) ^ (((56 + 33) - 53) + 157);
        llllIlIlII[157] = (226 ^ 188) ^ (185 ^ 138);
        llllIlIlII[158] = (-19) & 2939;
        llllIlIlII[159] = (-25158) & 28407;
        llllIlIlII[160] = (-(((111 + 46) - 97) + 85)) & (-5121) & 8187;
        llllIlIlII[161] = (-24585) & 27839;
        llllIlIlII[162] = (-((-1665) & 28657)) & (-9) & 28543;
        llllIlIlII[163] = (-((-2290) & 7423)) & (-8321) & 16383;
        llllIlIlII[164] = (-((-27745) & 32635)) & (-16449) & 24575;
        llllIlIlII[165] = (((25 + 59) - (-20)) + 121) ^ (((35 + 88) - 96) + 116);
        llllIlIlII[166] = (-((-17193) & 29503)) & (-9) & 16287;
        llllIlIlII[167] = 194 ^ 173;
        llllIlIlII[168] = 90 ^ 42;
        llllIlIlII[169] = (-5250) & 8175;
        llllIlIlII[170] = (-((-7289) & 32633)) & (-4171) & 32767;
        llllIlIlII[171] = (238 ^ 185) ^ (87 ^ 113);
        llllIlIlII[172] = 64 ^ 50;
        llllIlIlII[173] = (219 ^ 170) ^ "  ".length();
        llllIlIlII[174] = (173 ^ 138) ^ (78 ^ 29);
        llllIlIlII[175] = (118 ^ 4) ^ (42 ^ 45);
        llllIlIlII[176] = (-29831) & 32766;
        llllIlIlII[177] = (-16980) & 20215;
        llllIlIlII[178] = (-((-1633) & 32375)) & (-289) & 32574;
        llllIlIlII[179] = 37 ^ 83;
        llllIlIlII[180] = (-((-3843) & 24371)) & (-65) & 24567;
        llllIlIlII[181] = 81 ^ 38;
        llllIlIlII[182] = (54 ^ 49) ^ (((12 + 1) - (-97)) + 17);
        llllIlIlII[183] = (-13325) & 16255;
        llllIlIlII[184] = (-16970) & 20221;
        llllIlIlII[185] = (130 ^ 184) ^ (57 ^ 122);
        llllIlIlII[186] = 230 ^ 156;
        llllIlIlII[187] = (33 ^ 115) ^ (17 ^ 56);
        llllIlIlII[188] = 253 ^ 129;
        llllIlIlII[189] = (-((-1537) & 12231)) & (-4113) & 16351;
        llllIlIlII[190] = 231 ^ 154;
        llllIlIlII[191] = (-(62 ^ 42)) & (-41) & 4031;
        llllIlIlII[192] = 190 ^ 192;
        llllIlIlII[193] = (((204 ^ 195) + (215 ^ 131)) - (76 ^ 95)) + (177 ^ 158);
        llllIlIlII[194] = (-13443) & 16366;
        llllIlIlII[195] = (((58 ^ 50) + (84 ^ 66)) - (-(48 ^ 6))) + (19 ^ 63);
        llllIlIlII[196] = ((78 + 63) - 50) + 38;
        llllIlIlII[197] = (((174 ^ 179) + (42 ^ 19)) - (-(49 ^ 23))) + (134 ^ 128);
        llllIlIlII[198] = (((241 ^ 172) + (207 ^ 165)) - (((196 + 124) - 144) + 22)) + ((100 + 16) - 105) + 119;
        llllIlIlII[199] = (-((-16629) & 20725)) & (-1157) & 8191;
        llllIlIlII[200] = (-16468) & 19707;
        llllIlIlII[201] = (((94 ^ 116) + (68 ^ 67)) - (-(61 ^ 111))) + " ".length();
        llllIlIlII[202] = (((197 ^ 143) + (228 ^ 157)) - (77 ^ 35)) + (135 ^ 183);
        llllIlIlII[203] = (-((-13687) & 16247)) & (-66) & 12277;
        llllIlIlII[204] = (-21515) & 24447;
        llllIlIlII[205] = (-((-390) & 2951)) & (-4113) & 16319;
        llllIlIlII[206] = (-19029) & 28671;
        llllIlIlII[207] = (-((-518) & 23415)) & (-8193) & 32635;
        llllIlIlII[208] = ((27 + 28) - 2) + 81;
        llllIlIlII[209] = (-((-5) & 8294)) & (-4099) & 16367;
        llllIlIlII[210] = ((30 + 91) - 61) + 75;
        llllIlIlII[211] = (((62 ^ 86) + (82 ^ 14)) - (249 ^ 176)) + (183 ^ 186);
        llllIlIlII[212] = (-((-1185) & 18083)) & (-6226) & 32767;
        llllIlIlII[213] = ((13 + 132) - 29) + 21;
        llllIlIlII[214] = ((14 + 30) - (-47)) + 47;
        llllIlIlII[215] = ((48 + 25) - (-7)) + 59;
        llllIlIlII[216] = (-14789) & 16335;
        llllIlIlII[217] = ((82 + 104) - 88) + 42;
        llllIlIlII[218] = (-29697) & 30519;
        llllIlIlII[219] = (((60 ^ 56) + (32 ^ 51)) - (-(156 ^ 150))) + (81 ^ 61);
        llllIlIlII[220] = (((97 ^ 42) + (((34 + 66) - 53) + 88)) - (((67 + 46) - 92) + 121)) + (7 ^ 77);
        llllIlIlII[221] = (-((-3011) & 19395)) & (-13445) & 32757;
        llllIlIlII[222] = (-23109) & 32759;
        llllIlIlII[223] = (((23 ^ 35) + (105 ^ 74)) - (97 ^ 47)) + ((106 + 114) - 105) + 19;
        llllIlIlII[224] = (((157 ^ 169) + (8 ^ 64)) - "   ".length()) + (66 ^ 85);
        llllIlIlII[225] = ((84 + 77) - 88) + 72;
        llllIlIlII[226] = ((60 + 116) - 153) + 123;
        llllIlIlII[227] = (-((-13965) & 32687)) & (-8386) & 28655;
        llllIlIlII[228] = ((141 + 57) - 78) + 27;
        llllIlIlII[229] = (((57 ^ 13) + (4 ^ 49)) - (142 ^ 165)) + (52 ^ 98);
        llllIlIlII[230] = (-4681) & 14335;
        llllIlIlII[231] = (((76 ^ 67) + (217 ^ 170)) - (32 ^ 91)) + ((44 + 89) - 9) + 18;
        llllIlIlII[232] = (((26 ^ 66) + (23 ^ 0)) - (104 ^ 87)) + (255 ^ 153);
        llllIlIlII[233] = (((158 ^ 189) + (90 ^ 122)) - (49 ^ 32)) + (198 ^ 163);
        llllIlIlII[234] = (((((11 + 51) - (-73)) + 4) + (82 ^ 110)) - (116 ^ 2)) + (108 ^ 43);
        llllIlIlII[235] = ((6 + 139) - (-3)) + 5;
        llllIlIlII[236] = ((74 + 69) - 3) + 14;
        llllIlIlII[237] = ((23 + 77) - 68) + 123;
        llllIlIlII[238] = ((33 + 72) - 37) + 88;
        llllIlIlII[239] = ((52 + 70) - 3) + 38;
        llllIlIlII[240] = ((86 + 64) - 145) + 153;
        llllIlIlII[241] = (((111 ^ 36) + (((114 + 102) - 152) + 86)) - (((138 + 0) - (-6)) + 39)) + (99 ^ 22);
        llllIlIlII[242] = (((((101 + 34) - 29) + 24) + (29 ^ 21)) - (17 ^ 90)) + (88 ^ 57);
        llllIlIlII[243] = (((213 ^ 174) + (45 ^ 117)) - (((106 + 32) - 76) + 125)) + ((57 + 63) - 3) + 20;
        llllIlIlII[244] = ((91 + 100) - 162) + 133;
        llllIlIlII[245] = ((107 + 81) - 74) + 49;
        llllIlIlII[246] = ((0 + 144) - 62) + 82;
        llllIlIlII[247] = (((((61 + 116) - 173) + 134) + (187 ^ 152)) - (((71 + 18) - (-34)) + 5)) + (106 ^ 18);
        llllIlIlII[248] = ((48 + 22) - 12) + 108;
        llllIlIlII[249] = (((99 ^ 1) + (((36 + 85) - 1) + 29)) - (((79 + 191) - 235) + 211)) + ((71 + 33) - (-2)) + 60;
        llllIlIlII[250] = ((67 + 41) - (-58)) + 2;
        llllIlIlII[251] = (((0 ^ 116) + (((55 + 132) - 124) + 83)) - (((67 + 89) - 111) + 119)) + (68 ^ 3);
        llllIlIlII[252] = (((231 ^ 198) + (158 ^ 190)) - (-(173 ^ 168))) + (57 ^ 93);
        llllIlIlII[253] = ((19 + 51) - 10) + 111;
        llllIlIlII[254] = (((236 ^ 130) + (181 ^ 132)) - (14 ^ 119)) + ((58 + 2) - (-70)) + 4;
        llllIlIlII[255] = ((112 + 142) - 173) + 92;
        llllIlIlII[256] = ((130 + 44) - 23) + 23;
        llllIlIlII[257] = ((167 + 126) - 249) + 131;
        llllIlIlII[258] = (-8454) & 11551;
        llllIlIlII[259] = (-((-1247) & 22239)) & (-326) & 24575;
        llllIlIlII[260] = ((153 + 6) - 80) + 99;
        llllIlIlII[261] = (((140 ^ 134) + (199 ^ 133)) - (-(220 ^ 188))) + (86 ^ 81);
        llllIlIlII[262] = (((242 ^ 162) + (28 ^ 82)) - (-(26 ^ 29))) + (56 ^ 55);
        llllIlIlII[263] = ((173 + 122) - 248) + 134;
        llllIlIlII[264] = ((132 + 178) - 155) + 27;
        llllIlIlII[265] = ((7 + 80) - (-6)) + 90;
        llllIlIlII[266] = ((5 + 139) - 132) + 172;
        llllIlIlII[267] = ((168 + 115) - 216) + 118;
        llllIlIlII[268] = (((79 ^ 36) + (((56 + 83) - 24) + 15)) - (12 ^ 84)) + (160 ^ 133);
        llllIlIlII[269] = (-1060) & 3883;
        llllIlIlII[270] = (-((-8209) & 30777)) & (-65) & 32255;
        llllIlIlII[271] = (-((-1489) & 26098)) & (-1033) & 28475;
        llllIlIlII[272] = (((54 ^ 59) + (156 ^ 153)) - (-(127 ^ 3))) + (85 ^ 120);
        llllIlIlII[273] = ((69 + 177) - 237) + 179;
        llllIlIlII[274] = (((((72 + 104) - 104) + 113) + (41 ^ 124)) - (((66 + 27) - 16) + 54)) + (88 ^ 106);
        llllIlIlII[275] = (((((127 + 18) - 112) + 138) + (((33 + 15) - 39) + 129)) - (((62 + 56) - 45) + 120)) + (61 ^ 119);
        llllIlIlII[276] = (-((-1297) & 30195)) & (-1) & 31743;
        llllIlIlII[277] = ((149 + 120) - 134) + 56;
        llllIlIlII[278] = (((111 ^ 14) + (196 ^ 160)) - (((168 + 14) - 18) + 31)) + ((131 + 178) - 130) + 11;
        llllIlIlII[279] = (((109 ^ 48) + (158 ^ 190)) - (142 ^ 133)) + (232 ^ 167);
        llllIlIlII[280] = ((44 + 146) - 49) + 53;
        llllIlIlII[281] = ((57 + 149) - 116) + 105;
        llllIlIlII[282] = ((0 + 46) - (-65)) + 85;
        llllIlIlII[283] = (((66 ^ 69) + (84 ^ 98)) - (134 ^ 129)) + ((122 + 71) - 59) + 9;
        llllIlIlII[284] = (((((145 + 17) - 154) + 150) + (((103 + 16) - 83) + 100)) - ((-11426) & 11703)) + ((112 + 158) - 185) + 97;
        llllIlIlII[285] = ((198 + 160) - 177) + 18;
        llllIlIlII[286] = ((90 + 23) - 109) + 196;
        llllIlIlII[287] = ((20 + 195) - 85) + 71;
        llllIlIlII[288] = ((167 + 34) - 38) + 39;
        llllIlIlII[289] = ((37 + 71) - (-13)) + 82;
        llllIlIlII[290] = ((54 + 113) - 30) + 67;
        llllIlIlII[291] = (-8195) & 12175;
        llllIlIlII[292] = (((140 ^ 171) + (54 ^ 111)) - (-(22 ^ 3))) + (24 ^ 32);
        llllIlIlII[293] = (((201 ^ 130) + (195 ^ 163)) - (97 ^ 119)) + (170 ^ 147);
        llllIlIlII[294] = -" ".length();
        llllIlIlII[295] = (((108 ^ 16) + (73 ^ 95)) - (((124 + 33) - 95) + 66)) + ((105 + 162) - 130) + 52;
        llllIlIlII[296] = ((126 + 135) - 123) + 70;
        llllIlIlII[297] = (((((85 + 151) - 78) + 12) + (205 ^ 140)) - (214 ^ 140)) + (54 ^ 118);
        llllIlIlII[298] = ((136 + 6) - 47) + 115;
        llllIlIlII[299] = ((46 + 120) - (-41)) + 4;
        llllIlIlII[300] = ((170 + 55) - 211) + 198;
        llllIlIlII[301] = (((176 ^ 183) + (((115 + 105) - 217) + 156)) - (11 ^ 79)) + (19 ^ 96);
        llllIlIlII[302] = (((((138 + 73) - 170) + 163) + (134 ^ 189)) - (((120 + 159) - 78) + 44)) + ((123 + 126) - 167) + 114;
        llllIlIlII[303] = ((2 + 44) - (-163)) + 6;
        llllIlIlII[304] = ((85 + 119) - 124) + 136;
        llllIlIlII[305] = (-23025) & 24562;
        llllIlIlII[306] = ((203 + 93) - 263) + 184;
        llllIlIlII[307] = (((((114 + 103) - 166) + 111) + (77 ^ 52)) - (196 ^ 188)) + (78 ^ 121);
        llllIlIlII[308] = (((15 ^ 28) + (18 ^ 35)) - (16 ^ 81)) + ((83 + 19) - (-80)) + 34;
        llllIlIlII[309] = (-((-12871) & 31319)) & (-8200) & 27647;
        llllIlIlII[310] = (-((-15383) & 15734)) & (-12417) & 32767;
        llllIlIlII[311] = (-1541) & 26540;
        llllIlIlII[312] = (-((-23145) & 23407)) & (-9217) & 44478;
        llllIlIlII[313] = (-((-16961) & 21315)) & (-17) & 16350;
        llllIlIlII[314] = (-((-9489) & 30202)) & (-10753) & 32765;
        llllIlIlII[315] = ((126 + 162) - 281) + 213;
        llllIlIlII[316] = ((109 + 131) - 151) + 132;
        llllIlIlII[317] = (((((51 + 80) - 11) + 68) + (((154 + 66) - 145) + 80)) - ((-29249) & 29542)) + ((8 + 162) - 145) + 148;
        llllIlIlII[318] = (((116 ^ 54) + (133 ^ 184)) - (40 ^ 112)) + ((141 + 179) - 201) + 65;
        llllIlIlII[319] = ((125 + 68) - 103) + 134;
        llllIlIlII[320] = (((190 ^ 176) + (92 ^ 121)) - (-(119 ^ 65))) + (217 ^ 161);
        llllIlIlII[321] = ((82 + 224) - 119) + 39;
        llllIlIlII[322] = ((25 + 79) - 46) + 169;
        llllIlIlII[323] = (((230 ^ 167) + (((69 + 127) - 103) + 76)) - (103 ^ 26)) + (48 ^ 71);
        llllIlIlII[324] = ((" ".length() + (29 ^ 73)) - (172 ^ 142)) + ((68 + 64) - (-18)) + 28;
        llllIlIlII[325] = (((10 ^ 41) + (17 ^ 24)) - (-"  ".length())) + ((9 + 173) - 76) + 78;
        llllIlIlII[326] = ((150 + 191) - 281) + 171;
        llllIlIlII[327] = ((127 + 39) - 65) + 131;
        llllIlIlII[328] = (((63 ^ 29) + (((134 + 105) - 209) + 156)) - (((187 + 13) - 126) + 122)) + ((119 + 0) - 5) + 95;
        llllIlIlII[329] = ((116 + 109) - 74) + 83;
        llllIlIlII[330] = (((((15 + 81) - 31) + 72) + (((195 + 95) - 140) + 63)) - (((22 + 52) - 70) + 176)) + (45 ^ 108);
        llllIlIlII[331] = ((211 + 66) - 124) + 83;
        llllIlIlII[332] = (((86 ^ 58) + (((62 + 155) - 16) + 27)) - (((165 + 188) - 299) + 179)) + ((34 + 131) - 146) + 115;
        llllIlIlII[333] = (((((31 + 6) - (-19)) + 143) + (((50 + 83) - 126) + 123)) - (((122 + 127) - 212) + 123)) + (56 ^ 125);
        llllIlIlII[334] = (((105 ^ 18) + (47 ^ 72)) - (29 ^ 119)) + (58 ^ 77);
        llllIlIlII[335] = ((157 + 8) - 157) + 232;
        llllIlIlII[336] = ((94 + 188) - 181) + 140;
        llllIlIlII[337] = ((129 + 28) - 83) + 168;
        llllIlIlII[338] = ((103 + 93) - 56) + 103;
        llllIlIlII[339] = ((219 + 119) - 328) + 234;
        llllIlIlII[340] = ((9 + 133) - 54) + 157;
        llllIlIlII[341] = (-((-2195) & 30875)) & (-1) & 31871;
        llllIlIlII[342] = (-((-9751) & 26207)) & (-12933) & 32750;
        llllIlIlII[343] = (-12291) & 15358;
        llllIlIlII[344] = (-29250) & 32767;
        llllIlIlII[345] = (-((-185) & 29374)) & (-337) & 32735;
        llllIlIlII[346] = (-29193) & 32414;
        llllIlIlII[347] = (-20498) & 23543;
        llllIlIlII[348] = (-((-6089) & 14329)) & (-16705) & 28147;
        llllIlIlII[349] = ((142 + 119) - 176) + 161;
        llllIlIlII[350] = (((90 ^ 124) + (((182 + 62) - 161) + 112)) - (224 ^ 175)) + (31 ^ 66);
        llllIlIlII[351] = ((33 + 158) - 39) + 96;
        llllIlIlII[352] = ((210 + 68) - 246) + 217;
        llllIlIlII[353] = (((192 ^ 135) + (75 ^ 12)) - (-(10 ^ 89))) + (83 ^ 74);
        llllIlIlII[354] = ((186 + 136) - 179) + 108;
        llllIlIlII[355] = ((41 + 81) - (-15)) + 115;
        llllIlIlII[356] = (((198 ^ 165) + (((64 + 22) - (-59)) + 21)) - (89 ^ 77)) + (92 ^ 84);
        llllIlIlII[357] = ((146 + 61) - 49) + 96;
        llllIlIlII[358] = (((221 ^ 157) + (47 ^ 102)) - (148 ^ 134)) + ((103 + 11) - 70) + 92;
        llllIlIlII[359] = (-18077) & 18332;
        llllIlIlII[360] = (-((-21) & 30973)) & (-23) & 31231;
        llllIlIlII[361] = (-24233) & 24490;
        llllIlIlII[362] = (-31273) & 31531;
        llllIlIlII[363] = (-31364) & 31623;
        llllIlIlII[364] = (-((-1281) & 32219)) & (-1025) & 32223;
        llllIlIlII[365] = (-((-1425) & 11769)) & (-22018) & 32623;
    }

    private static boolean llIIlllllIlll(Object obj) {
        return obj == null;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cf();
            "".length();
            if ("   ".length() == 0) {
                return ((((54 + 35) - (-3)) + 107) ^ (((45 + 117) - 94) + 79)) & (((((42 + 34) - (-16)) + 104) ^ (((23 + 26) - (-42)) + 53)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return llllIlIlII[142];
    }

    static {
        llIIllllIlIlI();
        llIIllllIlIII();
        gN = new WorldPoint(llllIlIlII[341], llllIlIlII[342], llllIlIlII[0]);
        gO = new WorldPoint(llllIlIlII[343], llllIlIlII[344], llllIlIlII[0]);
        gP = new WorldPoint(llllIlIlII[345], llllIlIlII[346], llllIlIlII[1]);
        gQ = new WorldPoint(llllIlIlII[347], llllIlIlII[348], llllIlIlII[0]);
        bu = new ArrayList();
        String[] strArr = new String[llllIlIlII[43]];
        strArr[llllIlIlII[0]] = llllIIllII[llllIlIlII[349]];
        strArr[llllIlIlII[1]] = llllIIllII[llllIlIlII[350]];
        strArr[llllIlIlII[2]] = llllIIllII[llllIlIlII[351]];
        strArr[llllIlIlII[7]] = llllIIllII[llllIlIlII[352]];
        strArr[llllIlIlII[9]] = llllIIllII[llllIlIlII[353]];
        strArr[llllIlIlII[11]] = llllIIllII[llllIlIlII[354]];
        strArr[llllIlIlII[12]] = llllIIllII[llllIlIlII[355]];
        strArr[llllIlIlII[13]] = llllIIllII[llllIlIlII[356]];
        strArr[llllIlIlII[16]] = llllIIllII[llllIlIlII[357]];
        strArr[llllIlIlII[17]] = llllIIllII[llllIlIlII[358]];
        strArr[llllIlIlII[23]] = llllIIllII[llllIlIlII[359]];
        strArr[llllIlIlII[26]] = llllIIllII[llllIlIlII[360]];
        strArr[llllIlIlII[28]] = llllIIllII[llllIlIlII[361]];
        strArr[llllIlIlII[38]] = llllIIllII[llllIlIlII[362]];
        strArr[llllIlIlII[40]] = llllIIllII[llllIlIlII[363]];
        strArr[llllIlIlII[20]] = llllIIllII[llllIlIlII[364]];
        bQ = strArr;
    }

    private static boolean llIIlllllIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlllllIIII(int i) {
        return i > 0;
    }

    private static void ch() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIlllllIIlI(nearest) && llIIllllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[303]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llllIlIlII[2]);
            "".length();
        }
        if (llIIlllllIIlI(nearest) && llIIllllIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllII[llllIlIlII[304]];
            if (llIIllllIlllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIlIlII[18]);
                "".length();
            }
            if (llIIllllIllII(Bank.isOpen() ? 1 : 0)) {
                if (llIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIlIlII[9]);
                    "".length();
                }
                C0000a.a(llllIlIlII[19], llllIlIlII[11]);
                C0000a.a(llllIlIlII[22], llllIlIlII[11]);
                C0000a.a(llllIlIlII[21], llllIlIlII[11]);
                C0000a.b(C0005f.aU, llllIlIlII[11]);
                C0000a.a(llllIlIlII[35], llllIlIlII[11]);
                C0000a.a(llllIlIlII[45], llllIlIlII[1]);
                C0000a.a(llllIlIlII[27], llllIlIlII[7]);
                C0000a.a(llllIlIlII[34], llllIlIlII[1]);
                C0000a.a(llllIlIlII[24], llllIlIlII[25]);
                C0000a.a(llllIlIlII[305], llllIlIlII[1]);
                C0000a.a(llllIlIlII[46], llllIlIlII[47]);
                int[] iArr = new int[llllIlIlII[1]];
                iArr[llllIlIlII[0]] = llllIlIlII[36];
                if (llIIllllIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllIlIlII[1]];
                    iArr2[llllIlIlII[0]] = llllIlIlII[36];
                    if (llIIllllIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llllIlIlII[36], llllIlIlII[1], Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }
}
