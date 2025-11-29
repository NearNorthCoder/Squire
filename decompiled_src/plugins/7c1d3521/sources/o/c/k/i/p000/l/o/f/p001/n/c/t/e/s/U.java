package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.U  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/U.class */
public class U implements InterfaceC0003ac {
    static /* synthetic */ boolean mc;
    public static final /* synthetic */ WorldPoint lZ;
    public static final /* synthetic */ WorldPoint lY;
    static /* synthetic */ int di;
    static /* synthetic */ boolean md;
    static /* synthetic */ boolean ma;
    private static /* synthetic */ int[] llIIIllIII;
    static /* synthetic */ boolean mb;
    private static /* synthetic */ String[] llIIIlIllI;
    public static /* synthetic */ String[] cE;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint lX;
    static /* synthetic */ boolean dj;
    public static final /* synthetic */ WorldPoint lW;

    private static boolean lIlIIlllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[63]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028a, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[25]) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04a0, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[23]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0526, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[23]) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05ea, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[20]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[7]) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0674, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[20]) != false) goto L87;
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
        int[] iArr18 = new int[llIIIllIII[1]];
        iArr18[llIIIllIII[0]] = llIIIllIII[27];
        if (lIlIIllIIllII(Bank.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIIllIII[1]];
            iArr19[llIIIllIII[0]] = llIIIllIII[27];
            if (lIlIIllIIllII(Bank.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIIllIII[1]];
                iArr20[llIIIllIII[0]] = llIIIllIII[27];
            }
            iArr = new int[llIIIllIII[1]];
            iArr[llIIIllIII[0]] = llIIIllIII[35];
            if (lIlIIllIIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr21 = new int[llIIIllIII[1]];
                iArr21[llIIIllIII[0]] = llIIIllIII[35];
                if (lIlIIllIIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIIllIII[1]];
                    iArr22[llIIIllIII[0]] = llIIIllIII[35];
                }
                iArr2 = new int[llIIIllIII[1]];
                iArr2[llIIIllIII[0]] = llIIIllIII[39];
                if (lIlIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIllIII[39], llIIIllIII[1], llIIIllIII[310]));
                    "".length();
                }
                iArr3 = new int[llIIIllIII[1]];
                iArr3[llIIIllIII[0]] = llIIIllIII[41];
                if (lIlIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIllIII[41], llIIIllIII[1], llIIIllIII[311]));
                    "".length();
                }
                iArr4 = new int[llIIIllIII[1]];
                iArr4[llIIIllIII[0]] = llIIIllIII[44];
                if (lIlIIllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIllIII[44], llIIIllIII[1], llIIIllIII[312]));
                    "".length();
                }
                iArr5 = new int[llIIIllIII[1]];
                iArr5[llIIIllIII[0]] = llIIIllIII[42];
                if (lIlIIllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0017d(llIIIllIII[42], llIIIllIII[7], llIIIllIII[310]));
                    "".length();
                }
                iArr6 = new int[llIIIllIII[1]];
                iArr6[llIIIllIII[0]] = llIIIllIII[24];
                if (lIlIIllIIllII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr23 = new int[llIIIllIII[1]];
                    iArr23[llIIIllIII[0]] = llIIIllIII[24];
                    if (lIlIIllIIllII(Bank.contains(iArr23) ? 1 : 0)) {
                        int[] iArr24 = new int[llIIIllIII[1]];
                        iArr24[llIIIllIII[0]] = llIIIllIII[24];
                    }
                    iArr7 = new int[llIIIllIII[1]];
                    iArr7[llIIIllIII[0]] = llIIIllIII[36];
                    if (lIlIIllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[36], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr8 = new int[llIIIllIII[1]];
                    iArr8[llIIIllIII[0]] = llIIIllIII[34];
                    if (lIlIIllIlIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[34], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr9 = new int[llIIIllIII[1]];
                    iArr9[llIIIllIII[0]] = llIIIllIII[33];
                    if (lIlIIllIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[33], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr10 = new int[llIIIllIII[1]];
                    iArr10[llIIIllIII[0]] = llIIIllIII[32];
                    if (lIlIIllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[32], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr11 = new int[llIIIllIII[1]];
                    iArr11[llIIIllIII[0]] = llIIIllIII[30];
                    if (lIlIIllIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[30], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr12 = new int[llIIIllIII[1]];
                    iArr12[llIIIllIII[0]] = llIIIllIII[31];
                    if (lIlIIllIlIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        bv.add(new C0017d(llIIIllIII[31], llIIIllIII[1], C0023j.cf));
                        "".length();
                    }
                    iArr13 = new int[llIIIllIII[1]];
                    iArr13[llIIIllIII[0]] = llIIIllIII[37];
                    if (lIlIIllIIllII(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr25 = new int[llIIIllIII[1]];
                        iArr25[llIIIllIII[0]] = llIIIllIII[37];
                        if (lIlIIllIIllII(Bank.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[llIIIllIII[1]];
                            iArr26[llIIIllIII[0]] = llIIIllIII[37];
                        }
                        iArr14 = new int[llIIIllIII[1]];
                        iArr14[llIIIllIII[0]] = llIIIllIII[45];
                        if (lIlIIllIIllII(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr27 = new int[llIIIllIII[1]];
                            iArr27[llIIIllIII[0]] = llIIIllIII[45];
                            if (lIlIIllIIllII(Bank.contains(iArr27) ? 1 : 0)) {
                                int[] iArr28 = new int[llIIIllIII[1]];
                                iArr28[llIIIllIII[0]] = llIIIllIII[45];
                            }
                            if (lIlIIllIlIIIl(Bank.contains(item -> {
                                return item.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
                            }) ? 1 : 0)) {
                                bv.add(new C0017d(llIIIllIII[313], llIIIllIII[11], llIIIllIII[311]));
                                "".length();
                            }
                            iArr15 = new int[llIIIllIII[1]];
                            iArr15[llIIIllIII[0]] = llIIIllIII[19];
                            if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr29 = new int[llIIIllIII[1]];
                                iArr29[llIIIllIII[0]] = llIIIllIII[19];
                                if (lIlIIllIIllII(Bank.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[llIIIllIII[1]];
                                    iArr30[llIIIllIII[0]] = llIIIllIII[19];
                                }
                                iArr16 = new int[llIIIllIII[1]];
                                iArr16[llIIIllIII[0]] = llIIIllIII[22];
                                if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                                    int[] iArr31 = new int[llIIIllIII[1]];
                                    iArr31[llIIIllIII[0]] = llIIIllIII[22];
                                    if (lIlIIllIIllII(Bank.contains(iArr31) ? 1 : 0)) {
                                        int[] iArr32 = new int[llIIIllIII[1]];
                                        iArr32[llIIIllIII[0]] = llIIIllIII[22];
                                    }
                                    iArr17 = new int[llIIIllIII[1]];
                                    iArr17[llIIIllIII[0]] = llIIIllIII[21];
                                    if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                                        int[] iArr33 = new int[llIIIllIII[1]];
                                        iArr33[llIIIllIII[0]] = llIIIllIII[21];
                                        if (!lIlIIllIIllII(Bank.contains(iArr33) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr34 = new int[llIIIllIII[1]];
                                        iArr34[llIIIllIII[0]] = llIIIllIII[21];
                                        if (!lIlIIllIIllll(Bank.getFirst(iArr34).getQuantity(), llIIIllIII[20])) {
                                            return;
                                        }
                                    }
                                    bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                                    "".length();
                                }
                                bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
                                "".length();
                                iArr17 = new int[llIIIllIII[1]];
                                iArr17[llIIIllIII[0]] = llIIIllIII[21];
                                if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                                }
                                bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                                "".length();
                            }
                            bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
                            "".length();
                            iArr16 = new int[llIIIllIII[1]];
                            iArr16[llIIIllIII[0]] = llIIIllIII[22];
                            if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
                            "".length();
                            iArr17 = new int[llIIIllIII[1]];
                            iArr17[llIIIllIII[0]] = llIIIllIII[21];
                            if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                            "".length();
                        }
                        bv.add(new C0017d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]));
                        "".length();
                        if (lIlIIllIlIIIl(Bank.contains(item2 -> {
                            return item2.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
                        }) ? 1 : 0)) {
                        }
                        iArr15 = new int[llIIIllIII[1]];
                        iArr15[llIIIllIII[0]] = llIIIllIII[19];
                        if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
                        "".length();
                        iArr16 = new int[llIIIllIII[1]];
                        iArr16[llIIIllIII[0]] = llIIIllIII[22];
                        if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
                        "".length();
                        iArr17 = new int[llIIIllIII[1]];
                        iArr17[llIIIllIII[0]] = llIIIllIII[21];
                        if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                        "".length();
                    }
                    bv.add(new C0017d(llIIIllIII[37], llIIIllIII[23], C0023j.cf));
                    "".length();
                    iArr14 = new int[llIIIllIII[1]];
                    iArr14[llIIIllIII[0]] = llIIIllIII[45];
                    if (lIlIIllIIllII(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]));
                    "".length();
                    if (lIlIIllIlIIIl(Bank.contains(item22 -> {
                        return item22.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
                    }) ? 1 : 0)) {
                    }
                    iArr15 = new int[llIIIllIII[1]];
                    iArr15[llIIIllIII[0]] = llIIIllIII[19];
                    if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
                    "".length();
                    iArr16 = new int[llIIIllIII[1]];
                    iArr16[llIIIllIII[0]] = llIIIllIII[22];
                    if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
                    "".length();
                    iArr17 = new int[llIIIllIII[1]];
                    iArr17[llIIIllIII[0]] = llIIIllIII[21];
                    if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                    "".length();
                }
                bv.add(new C0017d(llIIIllIII[24], llIIIllIII[25], llIIIllIII[309]));
                "".length();
                iArr7 = new int[llIIIllIII[1]];
                iArr7[llIIIllIII[0]] = llIIIllIII[36];
                if (lIlIIllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[llIIIllIII[1]];
                iArr8[llIIIllIII[0]] = llIIIllIII[34];
                if (lIlIIllIlIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[llIIIllIII[1]];
                iArr9[llIIIllIII[0]] = llIIIllIII[33];
                if (lIlIIllIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[llIIIllIII[1]];
                iArr10[llIIIllIII[0]] = llIIIllIII[32];
                if (lIlIIllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llIIIllIII[1]];
                iArr11[llIIIllIII[0]] = llIIIllIII[30];
                if (lIlIIllIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                }
                iArr12 = new int[llIIIllIII[1]];
                iArr12[llIIIllIII[0]] = llIIIllIII[31];
                if (lIlIIllIlIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                }
                iArr13 = new int[llIIIllIII[1]];
                iArr13[llIIIllIII[0]] = llIIIllIII[37];
                if (lIlIIllIIllII(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllIII[37], llIIIllIII[23], C0023j.cf));
                "".length();
                iArr14 = new int[llIIIllIII[1]];
                iArr14[llIIIllIII[0]] = llIIIllIII[45];
                if (lIlIIllIIllII(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]));
                "".length();
                if (lIlIIllIlIIIl(Bank.contains(item222 -> {
                    return item222.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
                }) ? 1 : 0)) {
                }
                iArr15 = new int[llIIIllIII[1]];
                iArr15[llIIIllIII[0]] = llIIIllIII[19];
                if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
                "".length();
                iArr16 = new int[llIIIllIII[1]];
                iArr16[llIIIllIII[0]] = llIIIllIII[22];
                if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
                "".length();
                iArr17 = new int[llIIIllIII[1]];
                iArr17[llIIIllIII[0]] = llIIIllIII[21];
                if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
                "".length();
            }
            bv.add(new C0017d(llIIIllIII[35], llIIIllIII[63], llIIIllIII[309]));
            "".length();
            iArr2 = new int[llIIIllIII[1]];
            iArr2[llIIIllIII[0]] = llIIIllIII[39];
            if (lIlIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIIIllIII[1]];
            iArr3[llIIIllIII[0]] = llIIIllIII[41];
            if (lIlIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llIIIllIII[1]];
            iArr4[llIIIllIII[0]] = llIIIllIII[44];
            if (lIlIIllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIIIllIII[1]];
            iArr5[llIIIllIII[0]] = llIIIllIII[42];
            if (lIlIIllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIIllIII[1]];
            iArr6[llIIIllIII[0]] = llIIIllIII[24];
            if (lIlIIllIIllII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[24], llIIIllIII[25], llIIIllIII[309]));
            "".length();
            iArr7 = new int[llIIIllIII[1]];
            iArr7[llIIIllIII[0]] = llIIIllIII[36];
            if (lIlIIllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[llIIIllIII[1]];
            iArr8[llIIIllIII[0]] = llIIIllIII[34];
            if (lIlIIllIlIIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[llIIIllIII[1]];
            iArr9[llIIIllIII[0]] = llIIIllIII[33];
            if (lIlIIllIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[llIIIllIII[1]];
            iArr10[llIIIllIII[0]] = llIIIllIII[32];
            if (lIlIIllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llIIIllIII[1]];
            iArr11[llIIIllIII[0]] = llIIIllIII[30];
            if (lIlIIllIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            }
            iArr12 = new int[llIIIllIII[1]];
            iArr12[llIIIllIII[0]] = llIIIllIII[31];
            if (lIlIIllIlIIIl(Bank.contains(iArr12) ? 1 : 0)) {
            }
            iArr13 = new int[llIIIllIII[1]];
            iArr13[llIIIllIII[0]] = llIIIllIII[37];
            if (lIlIIllIIllII(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[37], llIIIllIII[23], C0023j.cf));
            "".length();
            iArr14 = new int[llIIIllIII[1]];
            iArr14[llIIIllIII[0]] = llIIIllIII[45];
            if (lIlIIllIIllII(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]));
            "".length();
            if (lIlIIllIlIIIl(Bank.contains(item2222 -> {
                return item2222.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
            }) ? 1 : 0)) {
            }
            iArr15 = new int[llIIIllIII[1]];
            iArr15[llIIIllIII[0]] = llIIIllIII[19];
            if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
            "".length();
            iArr16 = new int[llIIIllIII[1]];
            iArr16[llIIIllIII[0]] = llIIIllIII[22];
            if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
            "".length();
            iArr17 = new int[llIIIllIII[1]];
            iArr17[llIIIllIII[0]] = llIIIllIII[21];
            if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
            "".length();
        }
        bv.add(new C0017d(llIIIllIII[27], llIIIllIII[7], llIIIllIII[309]));
        "".length();
        iArr = new int[llIIIllIII[1]];
        iArr[llIIIllIII[0]] = llIIIllIII[35];
        if (lIlIIllIIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[35], llIIIllIII[63], llIIIllIII[309]));
        "".length();
        iArr2 = new int[llIIIllIII[1]];
        iArr2[llIIIllIII[0]] = llIIIllIII[39];
        if (lIlIIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIIllIII[1]];
        iArr3[llIIIllIII[0]] = llIIIllIII[41];
        if (lIlIIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llIIIllIII[1]];
        iArr4[llIIIllIII[0]] = llIIIllIII[44];
        if (lIlIIllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIIIllIII[1]];
        iArr5[llIIIllIII[0]] = llIIIllIII[42];
        if (lIlIIllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIIllIII[1]];
        iArr6[llIIIllIII[0]] = llIIIllIII[24];
        if (lIlIIllIIllII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[24], llIIIllIII[25], llIIIllIII[309]));
        "".length();
        iArr7 = new int[llIIIllIII[1]];
        iArr7[llIIIllIII[0]] = llIIIllIII[36];
        if (lIlIIllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[llIIIllIII[1]];
        iArr8[llIIIllIII[0]] = llIIIllIII[34];
        if (lIlIIllIlIIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[llIIIllIII[1]];
        iArr9[llIIIllIII[0]] = llIIIllIII[33];
        if (lIlIIllIlIIIl(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[llIIIllIII[1]];
        iArr10[llIIIllIII[0]] = llIIIllIII[32];
        if (lIlIIllIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llIIIllIII[1]];
        iArr11[llIIIllIII[0]] = llIIIllIII[30];
        if (lIlIIllIlIIIl(Bank.contains(iArr11) ? 1 : 0)) {
        }
        iArr12 = new int[llIIIllIII[1]];
        iArr12[llIIIllIII[0]] = llIIIllIII[31];
        if (lIlIIllIlIIIl(Bank.contains(iArr12) ? 1 : 0)) {
        }
        iArr13 = new int[llIIIllIII[1]];
        iArr13[llIIIllIII[0]] = llIIIllIII[37];
        if (lIlIIllIIllII(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[37], llIIIllIII[23], C0023j.cf));
        "".length();
        iArr14 = new int[llIIIllIII[1]];
        iArr14[llIIIllIII[0]] = llIIIllIII[45];
        if (lIlIIllIIllII(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[45], llIIIllIII[23], llIIIllIII[47]));
        "".length();
        if (lIlIIllIlIIIl(Bank.contains(item22222 -> {
            return item22222.getName().toLowerCase().contains(llIIIlIllI[llIIIllIII[316]]);
        }) ? 1 : 0)) {
        }
        iArr15 = new int[llIIIllIII[1]];
        iArr15[llIIIllIII[0]] = llIIIllIII[19];
        if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[19], llIIIllIII[10], llIIIllIII[314]));
        "".length();
        iArr16 = new int[llIIIllIII[1]];
        iArr16[llIIIllIII[0]] = llIIIllIII[22];
        if (lIlIIllIIllII(Bank.contains(iArr16) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[22], llIIIllIII[10], llIIIllIII[314]));
        "".length();
        iArr17 = new int[llIIIllIII[1]];
        iArr17[llIIIllIII[0]] = llIIIllIII[21];
        if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllIII[21], llIIIllIII[10], llIIIllIII[314]));
        "".length();
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIlIllI[llIIIllIII[315]];
    }

    private static void dF() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllIlIlll(nearest) && lIlIIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[303]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llIIIllIII[2]);
            "".length();
        }
        if (lIlIIllIlIlll(nearest) && lIlIIllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[304]];
            if (lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIIllIII[18]);
                "".length();
            }
            if (lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIIllIII[9]);
                    "".length();
                }
                C0000a.a(llIIIllIII[19], llIIIllIII[11]);
                C0000a.a(llIIIllIII[22], llIIIllIII[11]);
                C0000a.a(llIIIllIII[21], llIIIllIII[11]);
                C0000a.b(C0019f.ba, llIIIllIII[11]);
                C0000a.a(llIIIllIII[35], llIIIllIII[11]);
                C0000a.a(llIIIllIII[45], llIIIllIII[1]);
                C0000a.a(llIIIllIII[27], llIIIllIII[7]);
                C0000a.a(llIIIllIII[34], llIIIllIII[1]);
                C0000a.a(llIIIllIII[24], llIIIllIII[25]);
                C0000a.a(llIIIllIII[305], llIIIllIII[1]);
                C0000a.a(llIIIllIII[46], llIIIllIII[47]);
                int[] iArr = new int[llIIIllIII[1]];
                iArr[llIIIllIII[0]] = llIIIllIII[36];
                if (lIlIIllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIllIII[1]];
                    iArr2[llIIIllIII[0]] = llIIIllIII[36];
                    if (lIlIIllIlIIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llIIIllIII[36], llIIIllIII[1], Bank.WithdrawMode.ITEM);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIllIllIlI(int i, int i2) {
        return i > i2;
    }

    private static void dE() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllIlIlll(nearest) && lIlIIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[301]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llIIIllIII[2]);
            "".length();
        }
        if (lIlIIllIlIlll(nearest) && lIlIIllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[302]];
            if (lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIIllIII[18]);
                "".length();
            }
            if (lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIIllIII[9]);
                    "".length();
                }
                C0000a.a(llIIIllIII[19], llIIIllIII[11]);
                C0000a.b(C0019f.ba, llIIIllIII[2]);
                C0000a.a(llIIIllIII[45], llIIIllIII[9]);
                C0000a.a(llIIIllIII[41], llIIIllIII[1]);
                C0000a.a(llIIIllIII[39], llIIIllIII[1]);
                C0000a.a(llIIIllIII[46], llIIIllIII[47]);
                int[] iArr = new int[llIIIllIII[1]];
                iArr[llIIIllIII[0]] = llIIIllIII[36];
                if (lIlIIllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIllIII[1]];
                    iArr2[llIIIllIII[0]] = llIIIllIII[36];
                    if (lIlIIllIlIIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llIIIllIII[36], llIIIllIII[1], Bank.WithdrawMode.ITEM);
                    }
                }
                Bank.withdraw(llIIIllIII[35], Inventory.getFreeSlots() - llIIIllIII[1], Bank.WithdrawMode.ITEM);
            }
        }
    }

    private static void dG() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllIlIlll(nearest) && lIlIIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[306]];
            Movement.walkTo(nearest);
            "".length();
            Time.sleepTicks(llIIIllIII[2]);
            "".length();
        }
        if (lIlIIllIlIlll(nearest) && lIlIIllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[307]];
            if (lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIIllIII[18]);
                "".length();
            }
            if (lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIllIlIlIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIIllIII[9]);
                    "".length();
                }
                C0000a.a(llIIIllIII[19], llIIIllIII[11]);
                C0000a.a(llIIIllIII[22], llIIIllIII[11]);
                C0000a.a(llIIIllIII[21], llIIIllIII[11]);
                C0000a.b(C0019f.ba, llIIIllIII[2]);
                C0000a.a(llIIIllIII[45], llIIIllIII[7]);
                C0000a.a(llIIIllIII[33], llIIIllIII[1]);
                C0000a.a(llIIIllIII[32], llIIIllIII[1]);
                C0000a.a(llIIIllIII[30], llIIIllIII[1]);
                C0000a.a(llIIIllIII[31], llIIIllIII[1]);
                C0000a.a(llIIIllIII[46], llIIIllIII[47]);
                Bank.withdraw(llIIIlIllI[llIIIllIII[308]], llIIIllIII[1], Bank.WithdrawMode.ITEM);
                int[] iArr = new int[llIIIllIII[1]];
                iArr[llIIIllIII[0]] = llIIIllIII[36];
                if (lIlIIllIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIllIII[1]];
                    iArr2[llIIIllIII[0]] = llIIIllIII[36];
                    if (lIlIIllIlIIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        Bank.withdraw(llIIIllIII[36], llIIIllIII[1], Bank.WithdrawMode.ITEM);
                    }
                }
                C0000a.a(llIIIllIII[35], Inventory.getFreeSlots());
            }
        }
    }

    private static void lIlIIllIIIlll() {
        llIIIlIllI = new String[llIIIllIII[365]];
        llIIIlIllI[llIIIllIII[0]] = lIlIIllIIIIIl("lI6ygnhMkvn/ZQVWtLTZBA==", "BypTX");
        llIIIlIllI[llIIIllIII[1]] = lIlIIllIIIIlI("3nfTg8VgcgohrDRObklOzlMH+sIUA/07C1kSlvVMI8jJ8bcKEWUAaq2mslIFQ9wr", "TFbrk");
        llIIIlIllI[llIIIllIII[2]] = lIlIIllIIIIIl("f0XzZ0wG9uFVtrci0cN7gA==", "wiGci");
        llIIIlIllI[llIIIllIII[7]] = lIlIIllIIIIIl("XDW93Wom1Jo=", "raRqj");
        llIIIlIllI[llIIIllIII[9]] = lIlIIllIIIIlI("z34Di/yQbRs=", "uxgXF");
        llIIIlIllI[llIIIllIII[11]] = lIlIIllIIIIlI("e6nOi2ONf50=", "IOMPt");
        llIIIlIllI[llIIIllIII[12]] = lIlIIllIIIIIl("JjSU3naQaTo=", "WMvzw");
        llIIIlIllI[llIIIllIII[13]] = lIlIIllIIIIIl("Imu+9gO1MtA=", "yZCWY");
        llIIIlIllI[llIIIllIII[16]] = lIlIIllIIIIIl("H+UpTtgBjrc/1VI+4KuVEg==", "HvwPk");
        llIIIlIllI[llIIIllIII[17]] = lIlIIllIIIIll("MBgpECMRFyBULRkXLB0hHw==", "xyGtO");
        llIIIlIllI[llIIIllIII[23]] = lIlIIllIIIIll("ESRHNh8jYQo+HjUoCTBNMiQLMh0pMxMkQWYyED4ZJSkOOQpmNQh3LxMYLhkq", "FAgWm");
        llIIIlIllI[llIIIllIII[26]] = lIlIIllIIIIIl("W+9N9AvDXAPEKJ4fnEhldh+AiMVAK9BfrqhU1zzouK9xIUfEu1HzwxsFcy8mgIhq", "mvqGK");
        llIIIlIllI[llIIIllIII[28]] = lIlIIllIIIIll("PxBKEjcNVQcaNhscBBRlGBkLHS4bWUoAMgEBCRssBhJKBypINz8qDCYy", "hujsE");
        llIIIlIllI[llIIIllIII[38]] = lIlIIllIIIIll("AQ5FCxMzSwgDEiUCCw1BJx4AGRV2GBAaEToCABlNdhgSAxU1AwwEBnYfCkojAzIsJCY=", "Vkeja");
        llIIIlIllI[llIIIllIII[40]] = lIlIIllIIIIlI("6BEzJ7yvbnfpIpccITF94T1Y0/gNd92r", "MxANp");
        llIIIlIllI[llIIIllIII[20]] = lIlIIllIIIIIl("ymC6dy0NTKw=", "nKONL");
        llIIIlIllI[llIIIllIII[43]] = lIlIIllIIIIll("BT4AADAvKhoYMTA=", "BKilT");
        llIIIlIllI[llIIIllIII[29]] = lIlIIllIIIIll("HDYibD49dzs2IzM0PA==", "RWTLJ");
        llIIIlIllI[llIIIllIII[50]] = lIlIIllIIIIll("OiAjFRQd", "uZJtw");
        llIIIlIllI[llIIIllIII[51]] = lIlIIllIIIIIl("+NCgcXBmKZSd2hld2o7iTQ==", "HEFYw");
        llIIIlIllI[llIIIllIII[10]] = lIlIIllIIIIll("PBwxKAg=", "kuTDl");
        llIIIlIllI[llIIIllIII[52]] = lIlIIllIIIIlI("HNwrAbmw3KQ=", "houuB");
        llIIIlIllI[llIIIllIII[53]] = lIlIIllIIIIll("OysuAw==", "lNOqe");
        llIIIlIllI[llIIIllIII[55]] = lIlIIllIIIIlI("Rd3IHJikwyBYB09n5+VyMA==", "iEGtn");
        llIIIlIllI[llIIIllIII[8]] = lIlIIllIIIIll("HQogSC08SzUAOD4bdg8sOgcy", "SkVhY");
        llIIIlIllI[llIIIllIII[56]] = lIlIIllIIIIll("DDAE", "IQpQO");
        llIIIlIllI[llIIIllIII[57]] = lIlIIllIIIIlI("RhcKWiYto+U=", "txelM");
        llIIIlIllI[llIIIllIII[58]] = lIlIIllIIIIll("EAwCLh46GBg2HyU=", "WykBz");
        llIIIlIllI[llIIIllIII[60]] = lIlIIllIIIIll("Mj4LAjdFNQ8ecix2CBk8AXYaGDdFJAcXOhF2HRg7FWk=", "eVnpR");
        llIIIlIllI[llIIIllIII[61]] = lIlIIllIIIIll("LFAWFyMOFQZWOwpQLQwmBBMKWGFL", "epbvO");
        llIIIlIllI[llIIIllIII[63]] = lIlIIllIIIIlI("ZhuWxO7GVlIj0Rg39RJ1qmh5yuezYB/JEfLHyaEh6MuhjvsVC6nznmfi4PwIt52oF/9etGG9CKI=", "gFCYY");
        llIIIlIllI[llIIIllIII[65]] = lIlIIllIIIIIl("EWOsVraVxaxQbM7cpEbI4g==", "mOCtD");
        llIIIlIllI[llIIIllIII[15]] = lIlIIllIIIIIl("LjwvEb6DSzUGZfUaSnu6XTlF+jlsLga1Jgo25d6r9TpUtILcdHdBrQ==", "TtCDH");
        llIIIlIllI[llIIIllIII[66]] = lIlIIllIIIIll("JzoSEAFQOwRCKRU+DQMWVyFXDwUAcgcLARM3SA==", "pRwbd");
        llIIIlIllI[llIIIllIII[68]] = lIlIIllIIIIlI("n00RvQfTeRn3iTMbo64mmTBwcrSmwrPXK2xT8wH45j5W7D5cA8sqVA==", "DAaGn");
        llIIIlIllI[llIIIllIII[69]] = lIlIIllIIIIll("Jgw2ORdRDSBrJhkFPzETA0Mgax8QFHM7GxQHNnQ=", "qdSKr");
        llIIIlIllI[llIIIllIII[70]] = lIlIIllIIIIlI("vIw2gIkfluUcbSOMmwJWe9a6n2y7EAPIIho4RHl4FIL45kXWsSJSuQ==", "PXFmt");
        llIIIlIllI[llIIIllIII[71]] = lIlIIllIIIIll("DgUgNiR5BDZkDTYXJDZmKk0oJTF5HSwhIjxS", "YmEDA");
        llIIIlIllI[llIIIllIII[74]] = lIlIIllIIIIIl("JtM48Q0AwovrvviL0eyjxA==", "mEJSU");
        llIIIlIllI[llIIIllIII[77]] = lIlIIllIIIIlI("hS/+Joi3vXU=", "PgKYQ");
        llIIIlIllI[llIIIllIII[78]] = lIlIIllIIIIll("JhQUSwcHVQ0ZEgsZBw==", "hubks");
        llIIIlIllI[llIIIllIII[79]] = lIlIIllIIIIIl("8FBaWlMZlco=", "RuUPB");
        llIIIlIllI[llIIIllIII[80]] = lIlIIllIIIIIl("TRcF2Md8S54=", "OQqDN");
        llIIIlIllI[llIIIllIII[82]] = lIlIIllIIIIlI("uqgdMvB6IXE4c86oa9ZZ3Q==", "tDZQu");
        llIIIlIllI[llIIIllIII[84]] = lIlIIllIIIIll("LQwmBwIEEWQEGRU=", "acDtv");
        llIIIlIllI[llIIIllIII[87]] = lIlIIllIIIIll("LQssTDcMSjcNJAoJeggsDBg=", "cjZlC");
        llIIIlIllI[llIIIllIII[88]] = lIlIIllIIIIll("PgcYJjUfCBFiNBcBHyF5EgkZMA==", "vfvBY");
        llIIIlIllI[llIIIllIII[89]] = lIlIIllIIIIll("MiYLGg==", "aOgqk");
        llIIIlIllI[llIIIllIII[90]] = lIlIIllIIIIlI("M5zWZRYoows=", "ibMoe");
        llIIIlIllI[llIIIllIII[91]] = lIlIIllIIIIlI("QLg8r2+lq+niLZhn/9Oogw==", "VdSCf");
        llIIIlIllI[llIIIllIII[6]] = lIlIIllIIIIll("Bx43PhcuA3U9DD8=", "KqUMc");
        llIIIlIllI[llIIIllIII[92]] = lIlIIllIIIIll("PBgBGgQVBUMZHwQ=", "pwcip");
        llIIIlIllI[llIIIllIII[93]] = lIlIIllIIIIll("KRQEEwtEEQwVGg==", "duczh");
        llIIIlIllI[llIIIllIII[94]] = lIlIIllIIIIll("Bh8jETw2FWUaISQd", "SqExN");
        llIIIlIllI[llIIIllIII[95]] = lIlIIllIIIIlI("ySyiCixlp4XArUa0f8EpSw==", "cdOew");
        llIIIlIllI[llIIIllIII[96]] = lIlIIllIIIIIl("bfD83GctFyJ/iETbNIXOTQ==", "IYxvh");
        llIIIlIllI[llIIIllIII[97]] = lIlIIllIIIIll("Ej8LCCQhcQJJOyw4FUk0KjsT", "EVqiV");
        llIIIlIllI[llIIIllIII[98]] = lIlIIllIIIIlI("VVM4p20QRjOrPivcbuqpsBqzXlBrCM24", "iZYwW");
        llIIIlIllI[llIIIllIII[99]] = lIlIIllIIIIIl("G/zrDi0yibBrbTo1JOKxrw==", "VWSHJ");
        llIIIlIllI[llIIIllIII[100]] = lIlIIllIIIIIl("+UxA30X+E3s=", "rUHKk");
        llIIIlIllI[llIIIllIII[101]] = lIlIIllIIIIll("CjE7IQ==", "YXWJD");
        llIIIlIllI[llIIIllIII[102]] = lIlIIllIIIIIl("iu3NpxeJvwQKAMg+p3uRgQ==", "MxuZt");
        llIIIlIllI[llIIIllIII[103]] = lIlIIllIIIIlI("B+YH67dmJvPlHpuYjqF16g==", "gygrl");
        llIIIlIllI[llIIIllIII[104]] = lIlIIllIIIIll("KScuOTgAOmw6IxE=", "eHLJL");
        llIIIlIllI[llIIIllIII[105]] = lIlIIllIIIIlI("umQzaeUDaAnKohEk3JxhGA==", "tUVRL");
        llIIIlIllI[llIIIllIII[106]] = lIlIIllIIIIIl("32Lhamlu/ZuF+TsFplgE3A==", "algaB");
        llIIIlIllI[llIIIllIII[107]] = lIlIIllIIIIll("JwcQLjMXDVYlLgUF", "rivGA");
        llIIIlIllI[llIIIllIII[108]] = lIlIIllIIIIIl("PNem+SkwMvC0kZm1GZBCog==", "SMklJ");
        llIIIlIllI[llIIIllIII[109]] = lIlIIllIIIIll("HT8gICMucSlhPCM4PmEzJTs4", "JVZAQ");
        llIIIlIllI[llIIIllIII[110]] = lIlIIllIIIIlI("axoLkjdmaJj+kjb3oEq7ip4Hu8UNd430", "AFywA");
        llIIIlIllI[llIIIllIII[111]] = lIlIIllIIIIlI("SsGU9e/uXVbcPCYtLvK3Pw==", "BTNJF");
        llIIIlIllI[llIIIllIII[112]] = lIlIIllIIIIIl("2+OV91UQw50=", "GSyJx");
        llIIIlIllI[llIIIllIII[113]] = lIlIIllIIIIlI("E4REDNsRdZRHjfFtfZXxWQ==", "tYlxg");
        llIIIlIllI[llIIIllIII[114]] = lIlIIllIIIIlI("y4vJkQRcDbY=", "UnISM");
        llIIIlIllI[llIIIllIII[115]] = lIlIIllIIIIIl("X4X8lRisAQs=", "nNkGM");
        llIIIlIllI[llIIIllIII[116]] = lIlIIllIIIIll("KDYgLQ==", "gFECh");
        llIIIlIllI[llIIIllIII[117]] = lIlIIllIIIIIl("wqfCXlwhiPw=", "ZNtmJ");
        llIIIlIllI[llIIIllIII[118]] = lIlIIllIIIIll("IDInMTob", "sWFCY");
        llIIIlIllI[llIIIllIII[119]] = lIlIIllIIIIlI("LenVCNxOTwY=", "GPNJH");
        llIIIlIllI[llIIIllIII[120]] = lIlIIllIIIIIl("8+sBKhxM78A=", "OqQPS");
        llIIIlIllI[llIIIllIII[121]] = lIlIIllIIIIll("AzYMLAtuMwQqGg==", "NWkEh");
        llIIIlIllI[llIIIllIII[122]] = lIlIIllIIIIIl("FLf4Qdrm872pevkYX2JtBw==", "dSYJI");
        llIIIlIllI[llIIIllIII[123]] = lIlIIllIIIIIl("rnK46VDhB7bgHRTEMmpNHA==", "WRfcm");
        llIIIlIllI[llIIIllIII[124]] = lIlIIllIIIIlI("eRoh8rzafOWZM6KhXsS9dQ==", "NjrHZ");
        llIIIlIllI[llIIIllIII[125]] = lIlIIllIIIIlI("qM4HOiHnUEG4kaa/rLVQ9Q==", "qCNue");
        llIIIlIllI[llIIIllIII[126]] = lIlIIllIIIIIl("QNd9XPCZsCYhJMQ/70iZ6A==", "OJPMb");
        llIIIlIllI[llIIIllIII[127]] = lIlIIllIIIIlI("XaFodwtXhjuRENillLySBA==", "KHAsS");
        llIIIlIllI[llIIIllIII[128]] = lIlIIllIIIIll("PAEZNDMPTxB1LAIGB3UjBAUB", "khcUA");
        llIIIlIllI[llIIIllIII[129]] = lIlIIllIIIIIl("kpMTEFqtEcfkeYy7o0d5WFKa+5k3JOSE", "BZecy");
        llIIIlIllI[llIIIllIII[130]] = lIlIIllIIIIIl("kMnwDDUvYg+u04AiDi5Jrw==", "yFjLr");
        llIIIlIllI[llIIIllIII[25]] = lIlIIllIIIIll("EBALNho=", "SxnEn");
        llIIIlIllI[llIIIllIII[131]] = lIlIIllIIIIIl("jtRsTMB4U9r0ASDv3dtQVQ==", "DEwvO");
        llIIIlIllI[llIIIllIII[132]] = lIlIIllIIIIIl("4LTOazliT5s=", "LRoUd");
        llIIIlIllI[llIIIllIII[133]] = lIlIIllIIIIIl("5Viti7WtYkI=", "eFOxC");
        llIIIlIllI[llIIIllIII[134]] = lIlIIllIIIIll("Ph4UKw==", "qnqEz");
        llIIIlIllI[llIIIllIII[135]] = lIlIIllIIIIlI("gFLA3vQy4KI=", "IpawE");
        llIIIlIllI[llIIIllIII[136]] = lIlIIllIIIIlI("EG7yz78YkGE=", "xVgfJ");
        llIIIlIllI[llIIIllIII[137]] = lIlIIllIIIIIl("6D/MCcA8/Uk=", "GkNqG");
        llIIIlIllI[llIIIllIII[140]] = lIlIIllIIIIll("DQ8nZBssTiYrHS4MIyUGLQ==", "CnQDo");
        llIIIlIllI[llIIIllIII[141]] = lIlIIllIIIIlI("lIa+1Q5ui0qKmwq3oU7pdMNNR5Mkd2u0BY0mBIfsuuU=", "mKsJL");
        llIIIlIllI[llIIIllIII[142]] = lIlIIllIIIIll("JSwDKw4eaQMuDA9lQhBNHigUPE0YJhYxBBguQi0CViELPQhY", "vIbYm");
        llIIIlIllI[llIIIllIII[143]] = lIlIIllIIIIIl("8jfnFrko7lg=", "JyOGY");
        llIIIlIllI[llIIIllIII[144]] = lIlIIllIIIIIl("WepzgQdDrhU=", "vlgVi");
        llIIIlIllI[llIIIllIII[145]] = lIlIIllIIIIlI("dwsh6cUpyaeSI7aV8BADRA==", "llgAL");
        llIIIlIllI[llIIIllIII[146]] = lIlIIllIIIIlI("wR4HNbk0TNb3ATj1ZRa4Dg==", "cJcmM");
        llIIIlIllI[llIIIllIII[147]] = lIlIIllIIIIlI("yFpKOFRYFYzzZoHKOciO5A==", "Gxhdu");
        llIIIlIllI[llIIIllIII[148]] = lIlIIllIIIIlI("UPiLkWL9Bv8=", "CgKgs");
        llIIIlIllI[llIIIllIII[155]] = lIlIIllIIIIIl("6iNbDarty6k0bF0xXlK+8g==", "hnMJW");
        llIIIlIllI[llIIIllIII[156]] = lIlIIllIIIIIl("uyL7xvvM5Os=", "QQyuB");
        llIIIlIllI[llIIIllIII[157]] = lIlIIllIIIIIl("NgAJTOgWIN8=", "Mkqba");
        llIIIlIllI[llIIIllIII[165]] = lIlIIllIIIIIl("nKfBtBLvwNPVHtN/wcQJPw==", "EjQyl");
        llIIIlIllI[llIIIllIII[167]] = lIlIIllIIIIIl("UIKdNWdHJD4=", "GGNAI");
        llIIIlIllI[llIIIllIII[168]] = lIlIIllIIIIIl("Fxyz5R8dIL0=", "BNqEP");
        llIIIlIllI[llIIIllIII[171]] = lIlIIllIIIIll("HDY1RhI9dzEDAnIzLAkU", "RWCff");
        llIIIlIllI[llIIIllIII[172]] = lIlIIllIIIIlI("CKdmZaXXddKqCg5c+U9xqA==", "BzyAP");
        llIIIlIllI[llIIIllIII[173]] = lIlIIllIIIIIl("ZVXDDJ0gVUI=", "TqoYn");
        llIIIlIllI[llIIIllIII[174]] = lIlIIllIIIIIl("QGvBZ2ap/rc=", "UjMxk");
        llIIIlIllI[llIIIllIII[175]] = lIlIIllIIIIll("EgUnCTd8HD4=", "QiNdU");
        llIIIlIllI[llIIIllIII[179]] = lIlIIllIIIIlI("qfEYhP4eon1HJYvNH52yGA==", "vCoXr");
        llIIIlIllI[llIIIllIII[181]] = lIlIIllIIIIlI("1cdjiT+CHVQ=", "FasFu");
        llIIIlIllI[llIIIllIII[182]] = lIlIIllIIIIlI("/xStn87HauI=", "xGPGP");
        llIIIlIllI[llIIIllIII[185]] = lIlIIllIIIIll("FgwxdBM3TSgmBjYKInQDNwI1", "XmGTg");
        llIIIlIllI[llIIIllIII[186]] = lIlIIllIIIIIl("FvvpVrEuVnSEJK3D9bfWdw==", "viuMg");
        llIIIlIllI[llIIIllIII[187]] = lIlIIllIIIIll("FjIWFw==", "YBsyQ");
        llIIIlIllI[llIIIllIII[188]] = lIlIIllIIIIll("OwshJgBVEjg=", "xgHKb");
        llIIIlIllI[llIIIllIII[190]] = lIlIIllIIIIlI("MIhWocRPFNYWysULeGLhmA==", "nBIPD");
        llIIIlIllI[llIIIllIII[192]] = lIlIIllIIIIlI("+YgKHupoo8w=", "NWKsn");
        llIIIlIllI[llIIIllIII[193]] = lIlIIllIIIIlI("jyu26KChn6E=", "HbhLI");
        llIIIlIllI[llIIIllIII[195]] = lIlIIllIIIIlI("d3Wlg6k16q2aAYhu5hhWSlEWpuO8ELwz", "HGBZn");
        llIIIlIllI[llIIIllIII[196]] = lIlIIllIIIIlI("fUUJRDbxr9NbHN+lbTTZbA==", "wSaTq");
        llIIIlIllI[llIIIllIII[197]] = lIlIIllIIIIlI("SPtMNB6TZN4=", "OwakD");
        llIIIlIllI[llIIIllIII[198]] = lIlIIllIIIIIl("DfUIr9h1Hr4d76knmgm2nA==", "EBLoM");
        llIIIlIllI[llIIIllIII[201]] = lIlIIllIIIIlI("HAQUmUtA8oHu3ARdPXCh5w==", "ulHmh");
        llIIIlIllI[llIIIllIII[202]] = lIlIIllIIIIIl("ZDXIC+glV/sjhnqpzeTBlQ==", "ndCCh");
        llIIIlIllI[llIIIllIII[208]] = lIlIIllIIIIIl("ylEV+RnpXJ+9RVpt6Jl9p+c5iPeWUZyq", "GciMC");
        llIIIlIllI[llIIIllIII[210]] = lIlIIllIIIIlI("XohYddECrUk=", "fFIEt");
        llIIIlIllI[llIIIllIII[211]] = lIlIIllIIIIlI("ZkuOTVyEM2w=", "liqvk");
        llIIIlIllI[llIIIllIII[213]] = lIlIIllIIIIIl("/Hv+LLW4Va71IaGgRuShFEZZCaD7qP3V", "xbWAt");
        llIIIlIllI[llIIIllIII[214]] = lIlIIllIIIIIl("VOuEPndWc9Gd7moXoWWYYg==", "PAvgK");
        llIIIlIllI[llIIIllIII[215]] = lIlIIllIIIIll("JxIzHQ==", "hbVsT");
        llIIIlIllI[llIIIllIII[217]] = lIlIIllIIIIIl("dp+pCpjuYyZGcF77dWZjKg==", "oHAop");
        llIIIlIllI[llIIIllIII[219]] = lIlIIllIIIIIl("p2rquq9v4qA=", "gFISf");
        llIIIlIllI[llIIIllIII[220]] = lIlIIllIIIIll("AiM7Dw==", "VBPjq");
        llIIIlIllI[llIIIllIII[223]] = lIlIIllIIIIIl("KEz/9eHZ3+dqb3sCvUhK2K2zNkC9L+OI", "jLaDa");
        llIIIlIllI[llIIIllIII[224]] = lIlIIllIIIIIl("VJb2MexrLjJU24f5g/OhQQ==", "gHkmO");
        llIIIlIllI[llIIIllIII[225]] = lIlIIllIIIIlI("08sQRpxDMao=", "AmkXn");
        llIIIlIllI[llIIIllIII[226]] = lIlIIllIIIIll("PBM9HTwCVioLNB8Y", "pvNnY");
        llIIIlIllI[llIIIllIII[228]] = lIlIIllIIIIlI("2qJ1I7mG4cw=", "RAErw");
        llIIIlIllI[llIIIllIII[229]] = lIlIIllIIIIll("DRk5Aw==", "YxRfe");
        llIIIlIllI[llIIIllIII[231]] = lIlIIllIIIIlI("uo0MIjezL+w27lxpdSzJMI4m56AC1exQ", "XKvPP");
        llIIIlIllI[llIIIllIII[232]] = lIlIIllIIIIIl("2xyWwsyG/RXO7wOsr2UwLw==", "QxeHB");
        llIIIlIllI[llIIIllIII[233]] = lIlIIllIIIIll("CBIdKg==", "GbxDi");
        llIIIlIllI[llIIIllIII[234]] = lIlIIllIIIIll("OhgGAQ==", "uhcoa");
        llIIIlIllI[llIIIllIII[235]] = lIlIIllIIIIIl("hLEhzpjZAww=", "mfvOR");
        llIIIlIllI[llIIIllIII[236]] = lIlIIllIIIIll("HjEJBCEl", "MThvB");
        llIIIlIllI[llIIIllIII[237]] = lIlIIllIIIIll("JQAROCoe", "vepJI");
        llIIIlIllI[llIIIllIII[238]] = lIlIIllIIIIll("Fi4zPTk=", "FBRSR");
        llIIIlIllI[llIIIllIII[239]] = lIlIIllIIIIll("MQYAISI=", "ajaOI");
        llIIIlIllI[llIIIllIII[240]] = lIlIIllIIIIIl("Y1utC7VOTHcuk1EEqbCsmA==", "WQfnx");
        llIIIlIllI[llIIIllIII[241]] = lIlIIllIIIIlI("mLg5Up9MuAhT/PYqfg+TuA==", "oNUcp");
        llIIIlIllI[llIIIllIII[242]] = lIlIIllIIIIIl("lZdFO7m+RsJCH6Gmm24oXfh23f0Z/5hinwObUA9541c=", "ckIxL");
        llIIIlIllI[llIIIllIII[243]] = lIlIIllIIIIlI("3TU49t5dZE7co7HI8ceRxAqxuzLEhJANOaHGjnkE/nISt90mDOydOQ==", "AYQqs");
        llIIIlIllI[llIIIllIII[244]] = lIlIIllIIIIIl("cQ3ftyTAcVY=", "EwPHe");
        llIIIlIllI[llIIIllIII[245]] = lIlIIllIIIIIl("LgCVlZn1LRBdAwinnKGJUQ==", "GeAZk");
        llIIIlIllI[llIIIllIII[246]] = lIlIIllIIIIll("AjcxIhhhNDwyVgszPSAfLyU=", "AVSKv");
        llIIIlIllI[llIIIllIII[247]] = lIlIIllIIIIlI("E79SlPak12J9KIDbvGNyOQ==", "JnCjc");
        llIIIlIllI[llIIIllIII[248]] = lIlIIllIIIIll("DCgGETgnKAYd", "KIhvH");
        llIIIlIllI[llIIIllIII[249]] = lIlIIllIIIIlI("bq8xt+6zeDM=", "HttOA");
        llIIIlIllI[llIIIllIII[250]] = lIlIIllIIIIll("FiIWDj0tKQFPJysrAw==", "DGfoO");
        llIIIlIllI[llIIIllIII[251]] = lIlIIllIIIIll("AjYqLA==", "JYFIB");
        llIIIlIllI[llIIIllIII[252]] = lIlIIllIIIIll("CBASDBso", "Zubmr");
        llIIIlIllI[llIIIllIII[253]] = lIlIIllIIIIlI("WOpnCgBgr74=", "EqXHK");
        llIIIlIllI[llIIIllIII[254]] = lIlIIllIIIIll("EjsOPSl8MwgnJQ==", "QWgPK");
        llIIIlIllI[llIIIllIII[255]] = lIlIIllIIIIll("Jg4jGBYJRz8UHA==", "ngQqx");
        llIIIlIllI[llIIIllIII[256]] = lIlIIllIIIIll("AgIx", "LgUJS");
        llIIIlIllI[llIIIllIII[257]] = lIlIIllIIIIIl("y5JZWZzoBh7huJVvGQawuQ==", "VWASa");
        llIIIlIllI[llIIIllIII[14]] = lIlIIllIIIIll("LT8+", "cZZag");
        llIIIlIllI[llIIIllIII[72]] = lIlIIllIIIIIl("0QJ/2i1+2y88vEUWtgjeqA==", "eihrJ");
        llIIIlIllI[llIIIllIII[260]] = lIlIIllIIIIIl("bB1HK5I+yyghT8dtu+EBcQ==", "iYJPj");
        llIIIlIllI[llIIIllIII[261]] = lIlIIllIIIIlI("rx+plApohYuIiDZfYyIldQ==", "raTsU");
        llIIIlIllI[llIIIllIII[262]] = lIlIIllIIIIIl("vS8WJzkVM52yza8g2OCh5U0Z7Km31ZZVaPcf5zTMh/Y=", "gYAje");
        llIIIlIllI[llIIIllIII[263]] = lIlIIllIIIIIl("9PPIlHCa1GzyWTu/G+kBh89N+mtYduPvjfOK5y3ZtiKPUm8zRDxLrQ==", "GYSEk");
        llIIIlIllI[llIIIllIII[264]] = lIlIIllIIIIll("Gjxb", "UWuIi");
        llIIIlIllI[llIIIllIII[265]] = lIlIIllIIIIll("MRclBggaFyUK", "vvKax");
        llIIIlIllI[llIIIllIII[266]] = lIlIIllIIIIlI("5mXv64VTcNg=", "KfNVM");
        llIIIlIllI[llIIIllIII[267]] = lIlIIllIIIIll("OhkfESsQFk8rLx0=", "yxoeJ");
        llIIIlIllI[llIIIllIII[268]] = lIlIIllIIIIll("Ew8FOAY5AFUCAjQ=", "PnuLg");
        llIIIlIllI[llIIIllIII[272]] = lIlIIllIIIIlI("pUICi0WIt7xhZuzAH+9iLw==", "HYdOb");
        llIIIlIllI[llIIIllIII[273]] = lIlIIllIIIIlI("NOQnNZylRlU=", "KzzJF");
        llIIIlIllI[llIIIllIII[274]] = lIlIIllIIIIlI("OQ3ma3zC/pU=", "qQRVc");
        llIIIlIllI[llIIIllIII[275]] = lIlIIllIIIIll("IxkRMCIB", "fugQP");
        llIIIlIllI[llIIIllIII[277]] = lIlIIllIIIIIl("YZPOshjoNXZoAcFu1kxElg==", "vGLRG");
        llIIIlIllI[llIIIllIII[278]] = lIlIIllIIIIIl("kFk3qy6PnOZDTPOTk0H/qw==", "xMRhU");
        llIIIlIllI[llIIIllIII[279]] = lIlIIllIIIIll("ESQvOho=", "BLNHq");
        llIIIlIllI[llIIIllIII[280]] = lIlIIllIIIIlI("qj27Yh5L/ts=", "UAyot");
        llIIIlIllI[llIIIllIII[281]] = lIlIIllIIIIll("NDYF", "qWqqQ");
        llIIIlIllI[llIIIllIII[282]] = lIlIIllIIIIIl("cKVIvLPKJVM=", "Ekxmh");
        llIIIlIllI[llIIIllIII[283]] = lIlIIllIIIIIl("DOZ61VDI2aZ91TI4/OhBkQ==", "aeEwL");
        llIIIlIllI[llIIIllIII[284]] = lIlIIllIIIIIl("lE8iZXBqnrISh5wWag6EYDt4QQgTi9s5", "UMwcl");
        llIIIlIllI[llIIIllIII[285]] = lIlIIllIIIIIl("B8Bb/nRFAac=", "etrik");
        llIIIlIllI[llIIIllIII[286]] = lIlIIllIIIIlI("GJc9CuN5lhw=", "etGRq");
        llIIIlIllI[llIIIllIII[287]] = lIlIIllIIIIlI("U07Eny4oDPQ=", "EMaIG");
        llIIIlIllI[llIIIllIII[288]] = lIlIIllIIIIIl("0mbwoHf1Ae4=", "GVBAR");
        llIIIlIllI[llIIIllIII[289]] = lIlIIllIIIIlI("oW5yNv6fmF4=", "SkzLb");
        llIIIlIllI[llIIIllIII[290]] = lIlIIllIIIIIl("UakVYyYRgqI=", "khAna");
        llIIIlIllI[llIIIllIII[292]] = lIlIIllIIIIll("HTs5Oio=", "YIPTA");
        llIIIlIllI[llIIIllIII[293]] = lIlIIllIIIIIl("CM/FmsHyG1o=", "AZKmP");
        llIIIlIllI[llIIIllIII[295]] = lIlIIllIIIIlI("NbVVLlTG2D+nyhIiSrrJWg==", "HkNQo");
        llIIIlIllI[llIIIllIII[296]] = lIlIIllIIIIll("Ay8cCBsk", "LUuix");
        llIIIlIllI[llIIIllIII[297]] = lIlIIllIIIIll("JSoNIQ==", "rOlSI");
        llIIIlIllI[llIIIllIII[298]] = lIlIIllIIIIIl("XPFAjum7fzuqnmG6antd0A==", "agEKz");
        llIIIlIllI[llIIIllIII[299]] = lIlIIllIIIIIl("TcpRIutnvz4=", "Gklqu");
        llIIIlIllI[llIIIllIII[300]] = lIlIIllIIIIlI("+ZlARjFN6CE=", "xgtAj");
        llIIIlIllI[llIIIllIII[301]] = lIlIIllIIIIIl("z1V12mVrEN9Rc1Rj3zumQg==", "tlwWT");
        llIIIlIllI[llIIIllIII[302]] = lIlIIllIIIIIl("SDQp9ac8dGUSpJdtVhgdLCEF23ntf5Im", "nChKX");
        llIIIlIllI[llIIIllIII[303]] = lIlIIllIIIIIl("Hr/k0P7vtRF0mKaPhI4L0A==", "Beuog");
        llIIIlIllI[llIIIllIII[304]] = lIlIIllIIIIIl("9YDT94irJ4iSTBlBY2XVDuytpkgLnvY9", "qqjbS");
        llIIIlIllI[llIIIllIII[306]] = lIlIIllIIIIlI("Q6Le9ouvIvUOWA24RY21ow==", "Bkepk");
        llIIIlIllI[llIIIllIII[307]] = lIlIIllIIIIll("Ii8YMQQDIBF1CgsgHTwGDQ==", "jNvUh");
        llIIIlIllI[llIIIllIII[308]] = lIlIIllIIIIIl("7E1zeiOw9xYLV9iz/w5UXg==", "MUNOy");
        llIIIlIllI[llIIIllIII[315]] = lIlIIllIIIIll("NQExCjcfUyMBOQgWIk1pUQIlCCsF", "qsPmX");
        llIIIlIllI[llIIIllIII[316]] = lIlIIllIIIIlI("m9IAaeMWZF1wE0XQGSb9q58XEDIg2TVD", "ykFJL");
        llIIIlIllI[llIIIllIII[317]] = lIlIIllIIIIll("BBgAAyksBBE=", "EvtjO");
        llIIIlIllI[llIIIllIII[318]] = lIlIIllIIIIIl("bjlDzX1mtktDf3QqvqNRvA==", "sIPUf");
        llIIIlIllI[llIIIllIII[319]] = lIlIIllIIIIIl("ZZFSp2Y4uOs=", "mPHPd");
        llIIIlIllI[llIIIllIII[320]] = lIlIIllIIIIlI("nnKBDJaDYu8=", "zhKtk");
        llIIIlIllI[llIIIllIII[321]] = lIlIIllIIIIll("GQk/ByoxFS4=", "XgKnL");
        llIIIlIllI[llIIIllIII[322]] = lIlIIllIIIIll("Jhg+LQMOBC8=", "gvJDe");
        llIIIlIllI[llIIIllIII[323]] = lIlIIllIIIIlI("r2XJQiAvHok=", "faFNS");
        llIIIlIllI[llIIIllIII[324]] = lIlIIllIIIIIl("24/perASt08=", "IGcxv");
        llIIIlIllI[llIIIllIII[325]] = lIlIIllIIIIIl("1aRGPDd4wjA=", "uUbjl");
        llIIIlIllI[llIIIllIII[326]] = lIlIIllIIIIIl("wQ+bne3qrUU=", "gzGUa");
        llIIIlIllI[llIIIllIII[327]] = lIlIIllIIIIll("Ew8xKg19BzcwAQ==", "PcXGo");
        llIIIlIllI[llIIIllIII[328]] = lIlIIllIIIIlI("UKLwvOHJygg=", "xQpFn");
        llIIIlIllI[llIIIllIII[329]] = lIlIIllIIIIlI("J+py8WcjxkRXpUNqaNSmiw==", "asaVb");
        llIIIlIllI[llIIIllIII[330]] = lIlIIllIIIIll("IgQQJQEc", "netAd");
        llIIIlIllI[llIIIllIII[331]] = lIlIIllIIIIll("AgciLxclAyk=", "QlGCr");
        llIIIlIllI[llIIIllIII[332]] = lIlIIllIIIIIl("Gz8/rRHGYUg=", "Qqlhk");
        llIIIlIllI[llIIIllIII[333]] = lIlIIllIIIIlI("yytWiAW5tgw=", "uXeDk");
        llIIIlIllI[llIIIllIII[334]] = lIlIIllIIIIll("FSIxFw0r", "YCUsh");
        llIIIlIllI[llIIIllIII[335]] = lIlIIllIIIIll("AwIuLTkc", "tgOAM");
        llIIIlIllI[llIIIllIII[336]] = lIlIIllIIIIIl("cblbL7RIGqM=", "fWlEt");
        llIIIlIllI[llIIIllIII[337]] = lIlIIllIIIIlI("WP2z5e9bHSs=", "MpzGw");
        llIIIlIllI[llIIIllIII[338]] = lIlIIllIIIIIl("mQ+uHxMtw2E=", "BzOWk");
        llIIIlIllI[llIIIllIII[339]] = lIlIIllIIIIlI("E1YukVzGbLM=", "LxUyB");
        llIIIlIllI[llIIIllIII[340]] = lIlIIllIIIIlI("HoRj8QoI5jA=", "TYHOs");
        llIIIlIllI[llIIIllIII[349]] = lIlIIllIIIIll("KyQgRztILS8RF0gkbhYHDTY6WA==", "hENgr");
        llIIIlIllI[llIIIllIII[350]] = lIlIIllIIIIlI("QGpvxNypq3s=", "MnRPu");
        llIIIlIllI[llIIIllIII[351]] = lIlIIllIIIIll("MxgKbD8fDEQ/IxwVRCEjUBhEPjMeHEQ8KhENAS4pFABb", "pydLF");
        llIIIlIllI[llIIIllIII[352]] = lIlIIllIIIIlI("f7D4UDaOwo2ks+wfpK6fzAZHsaaTx1YvIksGcmp0Z8NDGEXr6WTczP5rfVMMUk0R0Fgr4a+Lbpw=", "VRIux");
        llIIIlIllI[llIIIllIII[353]] = lIlIIllIIIIll("MVIEGTUNFRgFegEdBVEtHQAVUT0XGx4WegwdUBYzDhdQHD9YE1AALx0BBF8=", "xrpqZ");
        llIIIlIllI[llIIIllIII[354]] = lIlIIllIIIIlI("w6g918AY+TlNpZau4sEtAeslpU7mqamyR+KkbfQlhrQ=", "PUxoZ");
        llIIIlIllI[llIIIllIII[355]] = lIlIIllIIIIll("O2gGIyEZLRZiOR1oPTgkEysabGNc", "rHrBM");
        llIIIlIllI[llIIIllIII[356]] = lIlIIllIIIIIl("B2IZlzxTJPW9A+M0kepaHCfkVNWXF/yRJydd+tF2cuKPNHb8u/NdNg==", "vJqhl");
        llIIIlIllI[llIIIllIII[357]] = lIlIIllIIIIIl("ynLdOVHLtp3MUFPpLPSHHPSLzdGm+dcQAQFhqVLNftpRhZiVM3+JdLMh/hIdRaUHP8rkrMZpxUI=", "FvULd");
        llIIIlIllI[llIIIllIII[358]] = lIlIIllIIIIll("L2o1AjkPLyECdR8lIkAjA2owCCFGK3cXPAMpMkc6AGo6BiVGPj8GIUYDdwkwAy55", "fJWgU");
        llIIIlIllI[llIIIllIII[359]] = lIlIIllIIIIll("DHIaHSQ1PRoNdAxyCgchKTZJGDU8chAHIWU0Bhp0MToMSDkkIkkYPSAxDEZ6aw==", "ERihT");
        llIIIlIllI[llIIIllIII[360]] = lIlIIllIIIIlI("bwyEDkVU2HKw1T8DQ6IzcKOSDQBTSKEdoEXFkjjx0C4=", "GZZVN");
        llIIIlIllI[llIIIllIII[361]] = lIlIIllIIIIIl("zMSJdXaTxdJT5cMYluOjLMQBq6+tpEU6", "kMsgM");
        llIIIlIllI[llIIIllIII[362]] = lIlIIllIIIIIl("nN74pEqhwOeYC+zpEngu/j/K4YqEAua8", "lMFHN");
        llIIIlIllI[llIIIllIII[363]] = lIlIIllIIIIll("DQIjQzkxTTdEODUEOgs5a00VCz44CXYdJCFNIgUgMU07AWsgAnYnOTUDMgs5aw==", "TmVdK");
        llIIIlIllI[llIIIllIII[364]] = lIlIIllIIIIIl("wcd0oyipaoluAnzwXnsVhw==", "NNmFf");
    }

    private static boolean lIlIIllIlIIll(int i) {
        return i < 0;
    }

    private static boolean lIlIIllIIllII(int i) {
        return i != 0;
    }

    private static boolean lIlIIllIIllll(int i, int i2) {
        return i < i2;
    }

    private static int lIlIIllIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIllIlllll(int i, int i2) {
        return i != i2;
    }

    static {
        lIlIIllIIlIIl();
        lIlIIllIIIlll();
        lW = new WorldPoint(llIIIllIII[341], llIIIllIII[342], llIIIllIII[0]);
        lX = new WorldPoint(llIIIllIII[343], llIIIllIII[344], llIIIllIII[0]);
        lY = new WorldPoint(llIIIllIII[345], llIIIllIII[346], llIIIllIII[1]);
        lZ = new WorldPoint(llIIIllIII[347], llIIIllIII[348], llIIIllIII[0]);
        bv = new ArrayList();
        String[] strArr = new String[llIIIllIII[43]];
        strArr[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[349]];
        strArr[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[350]];
        strArr[llIIIllIII[2]] = llIIIlIllI[llIIIllIII[351]];
        strArr[llIIIllIII[7]] = llIIIlIllI[llIIIllIII[352]];
        strArr[llIIIllIII[9]] = llIIIlIllI[llIIIllIII[353]];
        strArr[llIIIllIII[11]] = llIIIlIllI[llIIIllIII[354]];
        strArr[llIIIllIII[12]] = llIIIlIllI[llIIIllIII[355]];
        strArr[llIIIllIII[13]] = llIIIlIllI[llIIIllIII[356]];
        strArr[llIIIllIII[16]] = llIIIlIllI[llIIIllIII[357]];
        strArr[llIIIllIII[17]] = llIIIlIllI[llIIIllIII[358]];
        strArr[llIIIllIII[23]] = llIIIlIllI[llIIIllIII[359]];
        strArr[llIIIllIII[26]] = llIIIlIllI[llIIIllIII[360]];
        strArr[llIIIllIII[28]] = llIIIlIllI[llIIIllIII[361]];
        strArr[llIIIllIII[38]] = llIIIlIllI[llIIIllIII[362]];
        strArr[llIIIllIII[40]] = llIIIlIllI[llIIIllIII[363]];
        strArr[llIIIllIII[20]] = llIIIlIllI[llIIIllIII[364]];
        cE = strArr;
    }

    private static boolean lIlIIllIlIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIIllIII[9]];
        iArr[llIIIllIII[0]] = llIIIllIII[19];
        iArr[llIIIllIII[1]] = llIIIllIII[37];
        iArr[llIIIllIII[2]] = llIIIllIII[46];
        iArr[llIIIllIII[7]] = llIIIllIII[39];
        int i = llIIIllIII[0];
        while (lIlIIllIIllll(i, iArr.length)) {
            int[] iArr2 = new int[llIIIllIII[1]];
            iArr2[llIIIllIII[0]] = iArr[i];
            if (lIlIIllIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIIIllIII[0];
            }
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIllIII[1];
    }

    private static String lIlIIllIIIIIl(String llllllllllllllllllIlIllIlIlIIlII, String llllllllllllllllllIlIllIlIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIllIlIlIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIllIlIlIlIII.init(llIIIllIII[2], secretKeySpec);
            return new String(llllllllllllllllllIlIllIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIllIlIlIIlll) {
            llllllllllllllllllIlIllIlIlIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIllIlIllI(C0018e.j(llIIIllIII[14]), llIIIllIII[23]) && lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
            ?? r0 = llIIIllIII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllIII[0];
    }

    private static boolean lIlIIllIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIlIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x099b, code lost:
        if (lIlIIllIlIIIl(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.md ? 1 : 0) != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b2f, code lost:
        if (lIlIIllIlIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0325, code lost:
        if (lIlIIllIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[20]) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0368, code lost:
        if (lIlIIllIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[20]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ab, code lost:
        if (lIlIIllIIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[20]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03ae, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIlIllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[23]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.U.llIIIllIII[1];
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
    public static void dD() {
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
        if (lIlIIllIIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[0]];
            C0015b.a(bv);
            if (lIlIIllIIllll(bv.size(), llIIIllIII[1])) {
                System.out.println(llIIIlIllI[llIIIllIII[1]]);
                bt = llIIIllIII[0];
            }
        }
        if (lIlIIllIlIIIl(bt ? 1 : 0)) {
            String[] strArr11 = new String[llIIIllIII[1]];
            strArr11[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[2]];
            if (lIlIIllIIllII(Inventory.contains(strArr11) ? 1 : 0)) {
                md = llIIIllIII[1];
                mc = llIIIllIII[1];
                ma = llIIIllIII[1];
                mb = llIIIllIII[1];
            }
            int[] iArr8 = new int[llIIIllIII[1]];
            iArr8[llIIIllIII[0]] = llIIIllIII[3];
            if (lIlIIllIIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                mc = llIIIllIII[1];
            }
            int[] iArr9 = new int[llIIIllIII[1]];
            iArr9[llIIIllIII[0]] = llIIIllIII[4];
            if (lIlIIllIIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                ma = llIIIllIII[1];
            }
            int[] iArr10 = new int[llIIIllIII[1]];
            iArr10[llIIIllIII[0]] = llIIIllIII[5];
            if (lIlIIllIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                mb = llIIIllIII[1];
            }
            if (lIlIIllIIllII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIllIIllll(Movement.getRunEnergy(), llIIIllIII[6])) {
                Inventory.getFirst(C0019f.ba).interact(llIIIlIllI[llIIIllIII[7]]);
                Time.sleepTicks(llIIIllIII[1]);
                "".length();
            }
            if (lIlIIllIIllII(Inventory.contains(C0019f.aX) ? 1 : 0) && lIlIIllIIllll(Prayers.getPoints(), llIIIllIII[8])) {
                Inventory.getFirst(C0019f.aX).interact(llIIIlIllI[llIIIllIII[9]]);
            }
            if (!lIlIIllIIllll(Combat.getMissingHealth(), llIIIllIII[10]) || lIlIIllIlIIll(lIlIIllIIlIlI(C0018e.w(), 51.0d))) {
                String[] strArr12 = new String[llIIIllIII[1]];
                strArr12[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[11]];
                if (lIlIIllIIllII(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[llIIIllIII[1]];
                    strArr13[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[12]];
                    Inventory.getFirst(strArr13).interact(llIIIlIllI[llIIIllIII[13]]);
                }
            }
            if (lIlIIllIlIIIl(Movement.isRunEnabled() ? 1 : 0) && lIlIIllIlIlIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIllIlIIIl(an() ? 1 : 0) && lIlIIllIIllll(C0018e.j(llIIIllIII[14]), llIIIllIII[2]) && lIlIIllIlIllI(C0018e.J(), llIIIllIII[15])) {
                BankLocation nearest4 = BankLocation.getNearest();
                if (lIlIIllIlIlll(nearest4) && lIlIIllIlIIIl(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[16]];
                    Movement.walkTo(nearest4);
                    "".length();
                    Time.sleepTicks(llIIIllIII[2]);
                    "".length();
                }
                if (lIlIIllIlIlll(nearest4) && lIlIIllIIllII(nearest4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[17]];
                    if (lIlIIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIllIII[18]);
                        "".length();
                    }
                    if (lIlIIllIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIllIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIllIII[9]);
                            "".length();
                        }
                        if (lIlIIllIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIllIII[2]);
                            "".length();
                        }
                        int[] iArr11 = new int[llIIIllIII[1]];
                        iArr11[llIIIllIII[0]] = llIIIllIII[19];
                        if (lIlIIllIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIIllIII[1]];
                            iArr12[llIIIllIII[0]] = llIIIllIII[19];
                        }
                        int[] iArr13 = new int[llIIIllIII[1]];
                        iArr13[llIIIllIII[0]] = llIIIllIII[21];
                        if (lIlIIllIIllII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[llIIIllIII[1]];
                            iArr14[llIIIllIII[0]] = llIIIllIII[21];
                        }
                        int[] iArr15 = new int[llIIIllIII[1]];
                        iArr15[llIIIllIII[0]] = llIIIllIII[22];
                        if (lIlIIllIIllII(Bank.contains(iArr15) ? 1 : 0)) {
                            int[] iArr16 = new int[llIIIllIII[1]];
                            iArr16[llIIIllIII[0]] = llIIIllIII[22];
                        }
                        int[] iArr17 = new int[llIIIllIII[1]];
                        iArr17[llIIIllIII[0]] = llIIIllIII[24];
                        if (lIlIIllIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIIIllIII[1]];
                            iArr18[llIIIllIII[0]] = llIIIllIII[24];
                            if (lIlIIllIIllll(Bank.getFirst(iArr18).getQuantity(), llIIIllIII[25])) {
                                Q();
                                System.out.println(llIIIlIllI[llIIIllIII[26]]);
                                bt = llIIIllIII[1];
                                return;
                            }
                        }
                        int[] iArr19 = new int[llIIIllIII[1]];
                        iArr19[llIIIllIII[0]] = llIIIllIII[27];
                        if (lIlIIllIIllII(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[llIIIllIII[1]];
                            iArr20[llIIIllIII[0]] = llIIIllIII[27];
                            if (lIlIIllIIllll(Bank.getFirst(iArr20).getQuantity(), llIIIllIII[7])) {
                                Q();
                                System.out.println(llIIIlIllI[llIIIllIII[28]]);
                                bt = llIIIllIII[1];
                                return;
                            }
                        }
                        int[] iArr21 = new int[llIIIllIII[29]];
                        iArr21[llIIIllIII[0]] = llIIIllIII[19];
                        iArr21[llIIIllIII[1]] = llIIIllIII[22];
                        iArr21[llIIIllIII[2]] = llIIIllIII[21];
                        iArr21[llIIIllIII[7]] = llIIIllIII[30];
                        iArr21[llIIIllIII[9]] = llIIIllIII[31];
                        iArr21[llIIIllIII[11]] = llIIIllIII[32];
                        iArr21[llIIIllIII[12]] = llIIIllIII[33];
                        iArr21[llIIIllIII[13]] = llIIIllIII[34];
                        iArr21[llIIIllIII[16]] = llIIIllIII[35];
                        iArr21[llIIIllIII[17]] = llIIIllIII[36];
                        iArr21[llIIIllIII[23]] = llIIIllIII[24];
                        iArr21[llIIIllIII[26]] = llIIIllIII[27];
                        iArr21[llIIIllIII[28]] = llIIIllIII[37];
                        iArr21[llIIIllIII[38]] = llIIIllIII[39];
                        iArr21[llIIIllIII[40]] = llIIIllIII[41];
                        iArr21[llIIIllIII[20]] = llIIIllIII[42];
                        iArr21[llIIIllIII[43]] = llIIIllIII[44];
                        if (lIlIIllIlIIIl(C0018e.c(iArr21) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlIllI[llIIIllIII[38]]);
                            bt = llIIIllIII[1];
                            return;
                        }
                        int[] iArr22 = new int[llIIIllIII[29]];
                        iArr22[llIIIllIII[0]] = llIIIllIII[19];
                        iArr22[llIIIllIII[1]] = llIIIllIII[22];
                        iArr22[llIIIllIII[2]] = llIIIllIII[21];
                        iArr22[llIIIllIII[7]] = llIIIllIII[30];
                        iArr22[llIIIllIII[9]] = llIIIllIII[31];
                        iArr22[llIIIllIII[11]] = llIIIllIII[32];
                        iArr22[llIIIllIII[12]] = llIIIllIII[33];
                        iArr22[llIIIllIII[13]] = llIIIllIII[34];
                        iArr22[llIIIllIII[16]] = llIIIllIII[35];
                        iArr22[llIIIllIII[17]] = llIIIllIII[36];
                        iArr22[llIIIllIII[23]] = llIIIllIII[24];
                        iArr22[llIIIllIII[26]] = llIIIllIII[27];
                        iArr22[llIIIllIII[28]] = llIIIllIII[37];
                        iArr22[llIIIllIII[38]] = llIIIllIII[39];
                        iArr22[llIIIllIII[40]] = llIIIllIII[41];
                        iArr22[llIIIllIII[20]] = llIIIllIII[42];
                        iArr22[llIIIllIII[43]] = llIIIllIII[44];
                        if (lIlIIllIIllII(C0018e.c(iArr22) ? 1 : 0)) {
                            C0000a.a(llIIIllIII[19], llIIIllIII[11]);
                            C0000a.a(llIIIllIII[22], llIIIllIII[11]);
                            C0000a.a(llIIIllIII[21], llIIIllIII[11]);
                            C0000a.b(C0019f.ba, llIIIllIII[11]);
                            C0000a.a(llIIIllIII[35], llIIIllIII[13]);
                            C0000a.b(C0019f.bk, llIIIllIII[1]);
                            C0000a.a(llIIIllIII[42], llIIIllIII[1]);
                            C0000a.a(llIIIllIII[44], llIIIllIII[1]);
                            C0000a.a(llIIIllIII[39], llIIIllIII[1]);
                            C0000a.a(llIIIllIII[36], llIIIllIII[1]);
                            C0000a.a(llIIIllIII[45], llIIIllIII[2]);
                            C0000a.a(llIIIllIII[46], llIIIllIII[47]);
                        }
                    }
                }
            }
            if (lIlIIllIIllII(an() ? 1 : 0) && lIlIIllIIllll(C0018e.j(llIIIllIII[14]), llIIIllIII[1])) {
                if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[40]];
                    Movement.walkTo(lW);
                    "".length();
                    Time.sleepTicks(llIIIllIII[1]);
                    "".length();
                }
                if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[20]];
                    C0020g.a(llIIIlIllI[llIIIllIII[43]], cE, llIIIllIII[1]);
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[1]) && lIlIIllIIllII(an() ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(llIIIllIII[48], llIIIllIII[49], llIIIllIII[0]);
                if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), llIIIllIII[16])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[29]];
                    Movement.walkTo(worldPoint5);
                    "".length();
                    Time.sleepTicks(llIIIllIII[1]);
                    "".length();
                }
                if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), llIIIllIII[16])) {
                    C0020g.a(llIIIlIllI[llIIIllIII[50]], cE, llIIIllIII[1]);
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[2])) {
                di = llIIIllIII[0];
                int[] iArr23 = new int[llIIIllIII[1]];
                iArr23[llIIIllIII[0]] = llIIIllIII[44];
                if (lIlIIllIIllII(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIIIllIII[1]];
                    iArr24[llIIIllIII[0]] = llIIIllIII[44];
                    if (lIlIIllIlIIIl(Equipment.contains(iArr24) ? 1 : 0)) {
                        String[] strArr14 = new String[llIIIllIII[1]];
                        strArr14[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[51]];
                        Inventory.getFirst(strArr14).interact(llIIIlIllI[llIIIllIII[10]]);
                    }
                }
                if (lIlIIllIIllII(Inventory.contains(item -> {
                    return item.getName().contains(llIIIlIllI[llIIIllIII[340]]);
                }) ? 1 : 0) && lIlIIllIlIIIl(Equipment.contains(item2 -> {
                    return item2.getName().contains(llIIIlIllI[llIIIllIII[339]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llIIIlIllI[llIIIllIII[338]]);
                    }).interact(llIIIlIllI[llIIIllIII[52]]);
                }
                if (lIlIIllIIllII(Inventory.contains(item4 -> {
                    return item4.getName().contains(llIIIlIllI[llIIIllIII[337]]);
                }) ? 1 : 0) && lIlIIllIlIIIl(Equipment.contains(item5 -> {
                    return item5.getName().contains(llIIIlIllI[llIIIllIII[336]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(llIIIlIllI[llIIIllIII[335]]);
                    }).interact(llIIIlIllI[llIIIllIII[53]]);
                }
                if (lIlIIllIlllll(Vars.getBit(llIIIllIII[54]), llIIIllIII[1])) {
                    String[] strArr15 = new String[llIIIllIII[1]];
                    strArr15[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[55]];
                    if (lIlIIllIlIIIl(Inventory.contains(strArr15) ? 1 : 0)) {
                    }
                    if (((lIlIIllIlIIIl(Vars.getBit(llIIIllIII[54])) && lIlIIllIlIIIl(Vars.getBit(llIIIllIII[67])) && !lIlIIllIIllII(Vars.getBit(llIIIllIII[62]))) || lIlIIllIllllI(C0018e.j(llIIIllIII[72]), llIIIllIII[20])) && lIlIIllIlIIIl(Vars.getBit(llIIIllIII[73]))) {
                        strArr10 = new String[llIIIllIII[1]];
                        strArr10[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[74]];
                        if (lIlIIllIIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(llIIIllIII[75], llIIIllIII[76], llIIIllIII[0]);
                            String[] strArr16 = new String[llIIIllIII[1]];
                            strArr16[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[77]];
                            if (lIlIIlllIIIII(NPCs.getNearest(strArr16))) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[78]];
                                Movement.walkTo(worldPoint6);
                                "".length();
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                            String[] strArr17 = new String[llIIIllIII[1]];
                            strArr17[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[79]];
                            if (lIlIIllIlIlll(NPCs.getNearest(strArr17))) {
                                C0020g.a(llIIIlIllI[llIIIllIII[80]], cE);
                            }
                        }
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[73]), llIIIllIII[1]) && (!lIlIIllIIllII(Vars.getBit(llIIIllIII[81])) || lIlIIllIlIIIl(ma ? 1 : 0))) {
                        strArr8 = new String[llIIIllIII[1]];
                        strArr8[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[82]];
                        if (lIlIIllIlIIIl(Inventory.contains(strArr8) ? 1 : 0) && lIlIIllIlIIIl(Vars.getBit(llIIIllIII[83]))) {
                            dG();
                        }
                        strArr9 = new String[llIIIllIII[1]];
                        strArr9[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[84]];
                        if (lIlIIllIIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                            WorldPoint worldPoint7 = new WorldPoint(llIIIllIII[85], llIIIllIII[86], llIIIllIII[0]);
                            if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIIIllIII[9]) && lIlIIllIlIIIl(Vars.getBit(llIIIllIII[81]))) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[87]];
                                if (lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(worldPoint7);
                                "".length();
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                            if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIIIllIII[23])) {
                                if (lIlIIllIlIIIl(Vars.getBit(llIIIllIII[81]))) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[88]];
                                    String[] strArr18 = new String[llIIIllIII[1]];
                                    strArr18[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[89]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[llIIIllIII[1]];
                                        strArr19[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[90]];
                                        Item first = Inventory.getFirst(strArr19);
                                        String[] strArr20 = new String[llIIIllIII[1]];
                                        strArr20[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[91]];
                                        first.useOn(TileObjects.getNearest(strArr20));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr21 = new String[llIIIllIII[1]];
                                    strArr21[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[6]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr21) ? 1 : 0)) {
                                        String[] strArr22 = new String[llIIIllIII[1]];
                                        strArr22[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[92]];
                                        Item first2 = Inventory.getFirst(strArr22);
                                        String[] strArr23 = new String[llIIIllIII[1]];
                                        strArr23[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[93]];
                                        first2.useOn(TileObjects.getNearest(strArr23));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr24 = new String[llIIIllIII[1]];
                                    strArr24[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[94]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr24) ? 1 : 0)) {
                                        String[] strArr25 = new String[llIIIllIII[1]];
                                        strArr25[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[95]];
                                        Item first3 = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[llIIIllIII[1]];
                                        strArr26[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[96]];
                                        first3.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[llIIIllIII[1]];
                                    strArr27[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[97]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr27) ? 1 : 0)) {
                                        String[] strArr28 = new String[llIIIllIII[1]];
                                        strArr28[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[98]];
                                        Item first4 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[llIIIllIII[1]];
                                        strArr29[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[99]];
                                        first4.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                }
                                if (lIlIIllIllllI(Vars.getBit(llIIIllIII[81]), llIIIllIII[1])) {
                                    String[] strArr30 = new String[llIIIllIII[1]];
                                    strArr30[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[100]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr30) ? 1 : 0)) {
                                        String[] strArr31 = new String[llIIIllIII[1]];
                                        strArr31[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[101]];
                                        Item first5 = Inventory.getFirst(strArr31);
                                        String[] strArr32 = new String[llIIIllIII[1]];
                                        strArr32[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[102]];
                                        first5.useOn(TileObjects.getNearest(strArr32));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr33 = new String[llIIIllIII[1]];
                                    strArr33[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[103]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr33) ? 1 : 0)) {
                                        String[] strArr34 = new String[llIIIllIII[1]];
                                        strArr34[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[104]];
                                        Item first6 = Inventory.getFirst(strArr34);
                                        String[] strArr35 = new String[llIIIllIII[1]];
                                        strArr35[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[105]];
                                        first6.useOn(TileObjects.getNearest(strArr35));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr36 = new String[llIIIllIII[1]];
                                    strArr36[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[106]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr36) ? 1 : 0)) {
                                        String[] strArr37 = new String[llIIIllIII[1]];
                                        strArr37[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[107]];
                                        Item first7 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[llIIIllIII[1]];
                                        strArr38[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[108]];
                                        first7.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[llIIIllIII[1]];
                                    strArr39[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[109]];
                                    if (lIlIIllIIllII(Inventory.contains(strArr39) ? 1 : 0)) {
                                        String[] strArr40 = new String[llIIIllIII[1]];
                                        strArr40[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[110]];
                                        Item first8 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[llIIIllIII[1]];
                                        strArr41[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[111]];
                                        first8.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(llIIIllIII[1]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[llIIIllIII[1]];
                                    strArr42[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[112]];
                                    TileObject nearest5 = TileObjects.getNearest(strArr42);
                                    if (lIlIIllIlIlll(nearest5) && lIlIIllIlIIIl(ma ? 1 : 0)) {
                                        if (lIlIIllIlIIIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            String[] strArr43 = new String[llIIIllIII[1]];
                                            strArr43[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[113]];
                                            TileObjects.getNearest(strArr43).interact(llIIIlIllI[llIIIllIII[114]]);
                                            Time.sleepTicks(llIIIllIII[16]);
                                            "".length();
                                        }
                                        if (lIlIIllIIllII(Reachable.isInteractable(nearest5) ? 1 : 0) && lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr44 = new String[llIIIllIII[1]];
                                            strArr44[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[115]];
                                            if (lIlIIllIIllII(nearest5.hasAction(strArr44) ? 1 : 0)) {
                                                nearest5.interact(llIIIlIllI[llIIIllIII[116]]);
                                                Time.sleepTicks(llIIIllIII[9]);
                                                "".length();
                                            }
                                            String[] strArr45 = new String[llIIIllIII[1]];
                                            strArr45[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[117]];
                                            if (lIlIIllIIllII(nearest5.hasAction(strArr45) ? 1 : 0)) {
                                                nearest5.interact(llIIIlIllI[llIIIllIII[118]]);
                                                Time.sleepTicks(llIIIllIII[9]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[81]), llIIIllIII[1]) && lIlIIllIlIIIl(ma ? 1 : 0)) {
                        strArr2 = new String[llIIIllIII[1]];
                        strArr2[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[119]];
                        if (lIlIIllIIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr46 = new String[llIIIllIII[1]];
                            strArr46[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[120]];
                            Item first9 = Inventory.getFirst(strArr46);
                            String[] strArr47 = new String[llIIIllIII[1]];
                            strArr47[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[121]];
                            first9.useOn(TileObjects.getNearest(strArr47));
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                        strArr3 = new String[llIIIllIII[1]];
                        strArr3[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[122]];
                        if (lIlIIllIIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                            String[] strArr48 = new String[llIIIllIII[1]];
                            strArr48[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[123]];
                            Item first10 = Inventory.getFirst(strArr48);
                            String[] strArr49 = new String[llIIIllIII[1]];
                            strArr49[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[124]];
                            first10.useOn(TileObjects.getNearest(strArr49));
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                        strArr4 = new String[llIIIllIII[1]];
                        strArr4[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[125]];
                        if (lIlIIllIIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                            String[] strArr50 = new String[llIIIllIII[1]];
                            strArr50[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[126]];
                            Item first11 = Inventory.getFirst(strArr50);
                            String[] strArr51 = new String[llIIIllIII[1]];
                            strArr51[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[127]];
                            first11.useOn(TileObjects.getNearest(strArr51));
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                        strArr5 = new String[llIIIllIII[1]];
                        strArr5[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[128]];
                        if (lIlIIllIIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                            String[] strArr52 = new String[llIIIllIII[1]];
                            strArr52[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[129]];
                            Item first12 = Inventory.getFirst(strArr52);
                            String[] strArr53 = new String[llIIIllIII[1]];
                            strArr53[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[130]];
                            first12.useOn(TileObjects.getNearest(strArr53));
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                        String[] strArr54 = new String[llIIIllIII[1]];
                        strArr54[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[25]];
                        nearest3 = TileObjects.getNearest(strArr54);
                        if (lIlIIllIlIlll(nearest3) && lIlIIllIlIIIl(ma ? 1 : 0)) {
                            if (lIlIIllIlIIIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                String[] strArr55 = new String[llIIIllIII[1]];
                                strArr55[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[131]];
                                TileObjects.getNearest(strArr55).interact(llIIIlIllI[llIIIllIII[132]]);
                                Time.sleepTicks(llIIIllIII[16]);
                                "".length();
                            }
                            if (lIlIIllIIllII(Reachable.isInteractable(nearest3) ? 1 : 0) && lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                strArr6 = new String[llIIIllIII[1]];
                                strArr6[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[133]];
                                if (lIlIIllIIllII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                    nearest3.interact(llIIIlIllI[llIIIllIII[134]]);
                                    Time.sleepTicks(llIIIllIII[9]);
                                    "".length();
                                }
                                strArr7 = new String[llIIIllIII[1]];
                                strArr7[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[135]];
                                if (lIlIIllIIllII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                    nearest3.interact(llIIIlIllI[llIIIllIII[136]]);
                                    Time.sleepTicks(llIIIllIII[9]);
                                    "".length();
                                }
                            }
                        }
                    }
                    if (lIlIIllIIllII(ma ? 1 : 0) && lIlIIllIlIIIl(mb ? 1 : 0)) {
                        if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllIII[85], llIIIllIII[86], llIIIllIII[0])), llIIIllIII[23])) {
                            int[] iArr25 = new int[llIIIllIII[1]];
                            iArr25[llIIIllIII[0]] = llIIIllIII[21];
                            Inventory.getFirst(iArr25).interact(llIIIlIllI[llIIIllIII[137]]);
                            Time.sleepTicks(llIIIllIII[16]);
                            "".length();
                        }
                        worldPoint4 = new WorldPoint(llIIIllIII[138], llIIIllIII[139], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[140]];
                            if (lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(worldPoint4);
                                "".length();
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                            String[] strArr56 = new String[llIIIllIII[7]];
                            strArr56[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[141]];
                            strArr56[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[142]];
                            strArr56[llIIIllIII[2]] = llIIIlIllI[llIIIllIII[143]];
                            C0020g.a(strArr56);
                        }
                        if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[144]];
                            C0020g.a(llIIIlIllI[llIIIllIII[145]], cE);
                        }
                    }
                    if (lIlIIllIIllII(ma ? 1 : 0) && lIlIIllIIllII(mb ? 1 : 0) && lIlIIllIlIIIl(mc ? 1 : 0)) {
                        strArr = new String[llIIIllIII[1]];
                        strArr[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[146]];
                        if (lIlIIllIIllII(Inventory.contains(strArr) ? 1 : 0)) {
                            String[] strArr57 = new String[llIIIllIII[1]];
                            strArr57[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[147]];
                            Inventory.getFirst(strArr57).interact(llIIIlIllI[llIIIllIII[148]]);
                        }
                        WorldArea worldArea4 = new WorldArea(llIIIllIII[149], llIIIllIII[150], llIIIllIII[51], llIIIllIII[10], llIIIllIII[0]);
                        worldArea = new WorldArea(llIIIllIII[151], llIIIllIII[152], llIIIllIII[58], llIIIllIII[58], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && lIlIIllIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            worldPoint3 = new WorldPoint(llIIIllIII[153], llIIIllIII[154], llIIIllIII[0]);
                            if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIIIllIII[2])) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[155]];
                                Movement.walkTo(worldPoint3);
                                "".length();
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                            if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIIIllIII[2])) {
                                String[] strArr58 = new String[llIIIllIII[1]];
                                strArr58[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[156]];
                                TileObjects.getNearest(strArr58).interact(llIIIlIllI[llIIIllIII[157]]);
                                Time.sleepTicks(llIIIllIII[11]);
                                "".length();
                            }
                        }
                        worldArea2 = new WorldArea(llIIIllIII[158], llIIIllIII[159], llIIIllIII[11], llIIIllIII[16], llIIIllIII[0]);
                        WorldArea worldArea5 = new WorldArea(llIIIllIII[160], llIIIllIII[161], llIIIllIII[13], llIIIllIII[7], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && lIlIIllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr5 = new int[llIIIllIII[1]];
                            iArr5[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr26 = new int[llIIIllIII[1]];
                                iArr26[llIIIllIII[0]] = llIIIllIII[162];
                                if (lIlIIlllIIIII(TileItems.getNearest(iArr26)) && lIlIIllIlIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(new WorldArea(llIIIllIII[163], llIIIllIII[164], llIIIllIII[26], llIIIllIII[12], llIIIllIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[165]];
                                    if (lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                        int[] iArr27 = new int[llIIIllIII[1]];
                                        iArr27[llIIIllIII[0]] = llIIIllIII[166];
                                        NPCs.getNearest(iArr27).interact(llIIIlIllI[llIIIllIII[167]]);
                                        Time.sleepTicks(llIIIllIII[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr6 = new int[llIIIllIII[1]];
                            iArr6[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr6))) {
                                int[] iArr28 = new int[llIIIllIII[1]];
                                iArr28[llIIIllIII[0]] = llIIIllIII[162];
                                TileItems.getNearest(iArr28).interact(llIIIlIllI[llIIIllIII[168]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                            iArr7 = new int[llIIIllIII[1]];
                            iArr7[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIIllII(Inventory.contains(iArr7) ? 1 : 0) && lIlIIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(llIIIllIII[169], llIIIllIII[170], llIIIllIII[0]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[171]];
                                    C0018e.c(worldPoint2);
                                    Time.sleepTicks(llIIIllIII[2]);
                                    "".length();
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                    String[] strArr59 = new String[llIIIllIII[1]];
                                    strArr59[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[172]];
                                    TileObjects.getNearest(strArr59).interact(llIIIlIllI[llIIIllIII[173]]);
                                    Time.sleepTicks(llIIIllIII[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                nearest2 = TileObjects.getNearest(tileObject -> {
                                    if (lIlIIllIIllII(tileObject.getName().contains(llIIIlIllI[llIIIllIII[334]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                                        ?? r0 = llIIIllIII[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIllIII[0];
                                });
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[174]];
                                if (lIlIIllIlIlll(nearest2)) {
                                    nearest2.interact(llIIIlIllI[llIIIllIII[175]]);
                                    Time.sleepTicks(llIIIllIII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1]) && lIlIIllIlIIIl(new WorldArea(llIIIllIII[176], llIIIllIII[177], llIIIllIII[11], llIIIllIII[13], llIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            iArr2 = new int[llIIIllIII[1]];
                            iArr2[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                int[] iArr29 = new int[llIIIllIII[1]];
                                iArr29[llIIIllIII[0]] = llIIIllIII[178];
                                if (lIlIIlllIIIII(TileItems.getNearest(iArr29))) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[179]];
                                    NPC nearest6 = NPCs.getNearest(npc -> {
                                        if (lIlIIllIIllII(npc.getName().contains(llIIIlIllI[llIIIllIII[333]]) ? 1 : 0) && lIlIIlllIIIlI(npc.getInteracting(), Players.getLocal()) && lIlIIllIlllII(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                            ?? r0 = llIIIllIII[1];
                                            "".length();
                                            return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIllIII[0];
                                    });
                                    if (lIlIIlllIIIII(Players.getLocal().getInteracting()) && lIlIIlllIIIII(nearest6)) {
                                        int[] iArr30 = new int[llIIIllIII[1]];
                                        iArr30[llIIIllIII[0]] = llIIIllIII[180];
                                        NPCs.getNearest(iArr30).interact(llIIIlIllI[llIIIllIII[181]]);
                                        Time.sleepTicks(llIIIllIII[11]);
                                        "".length();
                                    }
                                }
                            }
                            iArr3 = new int[llIIIllIII[1]];
                            iArr3[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr3))) {
                                int[] iArr31 = new int[llIIIllIII[1]];
                                iArr31[llIIIllIII[0]] = llIIIllIII[178];
                                TileItems.getNearest(iArr31).interact(llIIIlIllI[llIIIllIII[182]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                            worldArea3 = new WorldArea(llIIIllIII[183], llIIIllIII[184], llIIIllIII[12], llIIIllIII[11], llIIIllIII[1]);
                            iArr4 = new int[llIIIllIII[1]];
                            iArr4[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIIllII(Inventory.contains(iArr4) ? 1 : 0) && lIlIIllIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                worldPoint = new WorldPoint(llIIIllIII[163], llIIIllIII[170], llIIIllIII[1]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[185]];
                                    C0018e.c(worldPoint);
                                    Time.sleepTicks(llIIIllIII[2]);
                                    "".length();
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                    String[] strArr60 = new String[llIIIllIII[1]];
                                    strArr60[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[186]];
                                    TileObjects.getNearest(strArr60).interact(llIIIlIllI[llIIIllIII[187]]);
                                    Time.sleepTicks(llIIIllIII[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest7 = TileObjects.getNearest(tileObject2 -> {
                                    if (lIlIIllIIllII(tileObject2.getName().contains(llIIIlIllI[llIIIllIII[332]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject2) ? 1 : 0)) {
                                        ?? r0 = llIIIllIII[1];
                                        "".length();
                                        return 0 != 0 ? ((((86 + 104) - 27) + 13) ^ (((113 + 145) - 180) + 89)) & (((233 ^ 173) ^ (109 ^ 62)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIIllIII[0];
                                });
                                if (lIlIIllIlIlll(nearest7)) {
                                    nearest7.interact(llIIIlIllI[llIIIllIII[188]]);
                                    Time.sleepTicks(llIIIllIII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[2])) {
                            int[] iArr32 = new int[llIIIllIII[1]];
                            iArr32[llIIIllIII[0]] = llIIIllIII[189];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr32) ? 1 : 0)) {
                                int[] iArr33 = new int[llIIIllIII[1]];
                                iArr33[llIIIllIII[0]] = llIIIllIII[189];
                                if (lIlIIlllIIIII(TileItems.getNearest(iArr33))) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[190]];
                                    NPC nearest8 = NPCs.getNearest(npc2 -> {
                                        if (lIlIIllIIllII(npc2.getName().contains(llIIIlIllI[llIIIllIII[331]]) ? 1 : 0) && lIlIIlllIIIlI(npc2.getInteracting(), Players.getLocal()) && lIlIIllIlllII(npc2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                            ?? r0 = llIIIllIII[1];
                                            "".length();
                                            return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIllIII[0];
                                    });
                                    if (lIlIIlllIIIII(Players.getLocal().getInteracting()) && lIlIIlllIIIII(nearest8)) {
                                        int[] iArr34 = new int[llIIIllIII[1]];
                                        iArr34[llIIIllIII[0]] = llIIIllIII[191];
                                        NPCs.getNearest(iArr34).interact(llIIIlIllI[llIIIllIII[192]]);
                                        Time.sleepTicks(llIIIllIII[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr35 = new int[llIIIllIII[1]];
                            iArr35[llIIIllIII[0]] = llIIIllIII[189];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr35))) {
                                int[] iArr36 = new int[llIIIllIII[1]];
                                iArr36[llIIIllIII[0]] = llIIIllIII[189];
                                TileItems.getNearest(iArr36).interact(llIIIlIllI[llIIIllIII[193]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                            WorldArea worldArea6 = new WorldArea(llIIIllIII[149], llIIIllIII[164], llIIIllIII[10], llIIIllIII[38], llIIIllIII[2]);
                            int[] iArr37 = new int[llIIIllIII[1]];
                            iArr37[llIIIllIII[0]] = llIIIllIII[189];
                            if (lIlIIllIIllII(Inventory.contains(iArr37) ? 1 : 0) && lIlIIllIlIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint8 = new WorldPoint(llIIIllIII[194], llIIIllIII[159], llIIIllIII[2]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[195]];
                                    C0018e.c(worldPoint8);
                                    Time.sleepTicks(llIIIllIII[2]);
                                    "".length();
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                    String[] strArr61 = new String[llIIIllIII[1]];
                                    strArr61[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[196]];
                                    TileObjects.getNearest(strArr61).interact(llIIIlIllI[llIIIllIII[197]]);
                                    Time.sleepTicks(llIIIllIII[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIllIIllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                TileObject nearest9 = TileObjects.getNearest(tileObject3 -> {
                                    if (lIlIIllIIllII(tileObject3.getName().contains(llIIIlIllI[llIIIllIII[330]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject3) ? 1 : 0)) {
                                        ?? r0 = llIIIllIII[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIIllIII[0];
                                });
                                if (lIlIIllIlIlll(nearest9)) {
                                    nearest9.interact(llIIIlIllI[llIIIllIII[198]]);
                                    Time.sleepTicks(llIIIllIII[7]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIllIlIIIl(new WorldArea(llIIIllIII[176], llIIIllIII[177], llIIIllIII[11], llIIIllIII[13], llIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIII[199], llIIIllIII[200], llIIIllIII[1])) ? 1 : 0)) {
                            nearest = TileObjects.getNearest(tileObject4 -> {
                                if (lIlIIllIIllII(tileObject4.getName().contains(llIIIlIllI[llIIIllIII[328]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject4) ? 1 : 0)) {
                                    String[] strArr62 = new String[llIIIllIII[1]];
                                    strArr62[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[329]];
                                    if (lIlIIllIIllII(tileObject4.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = llIIIllIII[1];
                                        "".length();
                                        return "  ".length() == 0 ? ((((87 + 106) - 90) + 109) ^ (((63 + 114) - 61) + 32)) & (((144 ^ 159) ^ (242 ^ 189)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return llIIIllIII[0];
                            });
                            if (lIlIIllIlIlll(nearest)) {
                                nearest.interact(llIIIlIllI[llIIIllIII[201]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                        }
                        if (lIlIIllIIllII(new WorldArea(llIIIllIII[163], llIIIllIII[164], llIIIllIII[26], llIIIllIII[12], llIIIllIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            TileObject nearest10 = TileObjects.getNearest(tileObject5 -> {
                                if (lIlIIllIIllII(tileObject5.getName().contains(llIIIlIllI[llIIIllIII[326]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject5) ? 1 : 0)) {
                                    String[] strArr62 = new String[llIIIllIII[1]];
                                    strArr62[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[327]];
                                    if (lIlIIllIIllII(tileObject5.hasAction(strArr62) ? 1 : 0)) {
                                        ?? r0 = llIIIllIII[1];
                                        "".length();
                                        return " ".length() < (-" ".length()) ? ((((98 + 38) - 14) + 63) ^ (((127 + 84) - 110) + 34)) & (((((108 + 12) - 81) + 94) ^ (((77 + 71) - 108) + 147)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return llIIIllIII[0];
                            });
                            if (lIlIIllIlIlll(nearest10)) {
                                nearest10.interact(llIIIlIllI[llIIIllIII[202]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                        }
                        WorldArea worldArea7 = new WorldArea(llIIIllIII[194], llIIIllIII[203], llIIIllIII[43], llIIIllIII[9], llIIIllIII[0]);
                        WorldArea worldArea8 = new WorldArea(llIIIllIII[204], llIIIllIII[205], llIIIllIII[13], llIIIllIII[23], llIIIllIII[0]);
                        WorldArea worldArea9 = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                        if (lIlIIllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr38 = new int[llIIIllIII[1]];
                            iArr38[llIIIllIII[0]] = llIIIllIII[207];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr38) ? 1 : 0)) {
                                int[] iArr39 = new int[llIIIllIII[1]];
                                iArr39[llIIIllIII[0]] = llIIIllIII[207];
                                if (lIlIIlllIIIII(TileItems.getNearest(iArr39)) && lIlIIllIlIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[208]];
                                    NPC nearest11 = NPCs.getNearest(npc3 -> {
                                        if (lIlIIllIIllII(npc3.getName().contains(llIIIlIllI[llIIIllIII[325]]) ? 1 : 0) && lIlIIlllIIIlI(npc3.getInteracting(), Players.getLocal()) && lIlIIllIlllII(npc3.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIII[1])) {
                                            ?? r0 = llIIIllIII[1];
                                            "".length();
                                            return ((53 ^ 109) ^ (54 ^ 106)) < (((83 ^ 2) ^ (44 ^ 72)) & (((76 ^ 122) ^ "   ".length()) ^ (-" ".length()))) ? ((53 ^ 98) ^ (134 ^ 177)) & ((" ".length() ^ (116 ^ 21)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIIllIII[0];
                                    });
                                    if (lIlIIlllIIIII(Players.getLocal().getInteracting()) && lIlIIlllIIIII(nearest11)) {
                                        int[] iArr40 = new int[llIIIllIII[1]];
                                        iArr40[llIIIllIII[0]] = llIIIllIII[209];
                                        NPCs.getNearest(iArr40).interact(llIIIlIllI[llIIIllIII[210]]);
                                        Time.sleepTicks(llIIIllIII[11]);
                                        "".length();
                                    }
                                }
                            }
                            int[] iArr41 = new int[llIIIllIII[1]];
                            iArr41[llIIIllIII[0]] = llIIIllIII[207];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr41))) {
                                int[] iArr42 = new int[llIIIllIII[1]];
                                iArr42[llIIIllIII[0]] = llIIIllIII[207];
                                TileItems.getNearest(iArr42).interact(llIIIlIllI[llIIIllIII[211]]);
                                Time.sleepTicks(llIIIllIII[7]);
                                "".length();
                            }
                            WorldArea worldArea10 = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                            int[] iArr43 = new int[llIIIllIII[1]];
                            iArr43[llIIIllIII[0]] = llIIIllIII[207];
                            if (lIlIIllIIllII(Inventory.contains(iArr43) ? 1 : 0) && lIlIIllIlIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                WorldPoint worldPoint9 = new WorldPoint(llIIIllIII[183], llIIIllIII[212], llIIIllIII[0]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[213]];
                                    C0018e.c(worldPoint9);
                                    Time.sleepTicks(llIIIllIII[2]);
                                    "".length();
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                    String[] strArr62 = new String[llIIIllIII[1]];
                                    strArr62[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[214]];
                                    TileObjects.getNearest(strArr62).interact(llIIIlIllI[llIIIllIII[215]]);
                                    Time.sleepTicks(llIIIllIII[12]);
                                    "".length();
                                }
                            }
                            if (lIlIIllIIllII(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] iArr44 = new int[llIIIllIII[1]];
                                iArr44[llIIIllIII[0]] = llIIIllIII[216];
                                if (lIlIIllIlIIIl(Inventory.contains(iArr44) ? 1 : 0)) {
                                    int[] iArr45 = new int[llIIIllIII[1]];
                                    iArr45[llIIIllIII[0]] = llIIIllIII[216];
                                    if (lIlIIlllIIIII(TileItems.getNearest(iArr45))) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[217]];
                                        if (lIlIIllIlIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        if (lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                            int[] iArr46 = new int[llIIIllIII[1]];
                                            iArr46[llIIIllIII[0]] = llIIIllIII[218];
                                            NPCs.getNearest(iArr46).interact(llIIIlIllI[llIIIllIII[219]]);
                                            Time.sleepTicks(llIIIllIII[11]);
                                            "".length();
                                        }
                                    }
                                }
                                int[] iArr47 = new int[llIIIllIII[1]];
                                iArr47[llIIIllIII[0]] = llIIIllIII[216];
                                if (lIlIIllIlIlll(TileItems.getNearest(iArr47))) {
                                    if (lIlIIllIIllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    int[] iArr48 = new int[llIIIllIII[1]];
                                    iArr48[llIIIllIII[0]] = llIIIllIII[216];
                                    TileItems.getNearest(iArr48).interact(llIIIlIllI[llIIIllIII[220]]);
                                    Time.sleepTicks(llIIIllIII[7]);
                                    "".length();
                                }
                                WorldArea worldArea11 = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                                int[] iArr49 = new int[llIIIllIII[1]];
                                iArr49[llIIIllIII[0]] = llIIIllIII[216];
                                if (lIlIIllIIllII(Inventory.contains(iArr49) ? 1 : 0) && lIlIIllIIllII(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint10 = new WorldPoint(llIIIllIII[221], llIIIllIII[222], llIIIllIII[0]);
                                    if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[223]];
                                        C0018e.c(worldPoint10);
                                        Time.sleepTicks(llIIIllIII[2]);
                                        "".length();
                                    }
                                    if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                        String[] strArr63 = new String[llIIIllIII[1]];
                                        strArr63[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[224]];
                                        TileObjects.getNearest(strArr63).interact(llIIIlIllI[llIIIllIII[225]]);
                                        Time.sleepTicks(llIIIllIII[12]);
                                        "".length();
                                    }
                                }
                            }
                            if (!lIlIIllIlIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIIllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                String[] strArr64 = new String[llIIIllIII[1]];
                                strArr64[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[226]];
                                NPC nearest12 = NPCs.getNearest(strArr64);
                                if (lIlIIllIlIlll(nearest12)) {
                                    int[] iArr50 = new int[llIIIllIII[1]];
                                    iArr50[llIIIllIII[0]] = llIIIllIII[227];
                                    if (lIlIIllIlIIIl(Inventory.contains(iArr50) ? 1 : 0) && lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                                        if (lIlIIllIlIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                        }
                                        nearest12.interact(llIIIlIllI[llIIIllIII[228]]);
                                        Time.sleepTicks(llIIIllIII[7]);
                                        "".length();
                                    }
                                }
                                int[] iArr51 = new int[llIIIllIII[1]];
                                iArr51[llIIIllIII[0]] = llIIIllIII[227];
                                if (lIlIIllIlIlll(TileItems.getNearest(iArr51))) {
                                    int[] iArr52 = new int[llIIIllIII[1]];
                                    iArr52[llIIIllIII[0]] = llIIIllIII[227];
                                    TileItems.getNearest(iArr52).interact(llIIIlIllI[llIIIllIII[229]]);
                                    Time.sleepTicks(llIIIllIII[2]);
                                    "".length();
                                }
                                int[] iArr53 = new int[llIIIllIII[1]];
                                iArr53[llIIIllIII[0]] = llIIIllIII[227];
                                if (lIlIIllIIllII(Inventory.contains(iArr53) ? 1 : 0)) {
                                    WorldPoint worldPoint11 = new WorldPoint(llIIIllIII[176], llIIIllIII[230], llIIIllIII[0]);
                                    if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[231]];
                                        C0018e.c(worldPoint11);
                                        Time.sleepTicks(llIIIllIII[2]);
                                        "".length();
                                    }
                                    if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                        String[] strArr65 = new String[llIIIllIII[1]];
                                        strArr65[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[232]];
                                        TileObjects.getNearest(strArr65).interact(llIIIlIllI[llIIIllIII[233]]);
                                        Time.sleepTicks(llIIIllIII[12]);
                                        "".length();
                                    }
                                }
                            }
                            TileObject nearest13 = TileObjects.getNearest(tileObject6 -> {
                                if (lIlIIllIIllII(tileObject6.getName().contains(llIIIlIllI[llIIIllIII[324]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject6) ? 1 : 0)) {
                                    ?? r0 = llIIIllIII[1];
                                    "".length();
                                    return ((((92 + 116) - 57) + 20) ^ (((34 + 165) - 135) + 111)) < " ".length() ? ((160 ^ 149) ^ (44 ^ 43)) & (((217 ^ 192) ^ (30 ^ 53)) ^ (-" ".length())) : r0;
                                }
                                return llIIIllIII[0];
                            });
                            if (lIlIIllIlIlll(nearest13)) {
                                if (lIlIIllIIllII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                if (lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr66 = new String[llIIIllIII[1]];
                                    strArr66[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[234]];
                                    if (lIlIIllIIllII(nearest13.hasAction(strArr66) ? 1 : 0)) {
                                        nearest13.interact(llIIIlIllI[llIIIllIII[235]]);
                                        Time.sleepTicks(llIIIllIII[9]);
                                        "".length();
                                    }
                                    String[] strArr67 = new String[llIIIllIII[1]];
                                    strArr67[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[236]];
                                    if (lIlIIllIIllII(nearest13.hasAction(strArr67) ? 1 : 0)) {
                                        nearest13.interact(llIIIlIllI[llIIIllIII[237]]);
                                        Time.sleepTicks(llIIIllIII[9]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIlIIllIIllII(mb ? 1 : 0) && lIlIIllIIllII(mc ? 1 : 0) && lIlIIllIIllII(ma ? 1 : 0) && lIlIIllIlIIIl(md ? 1 : 0)) {
                        iArr = new int[llIIIllIII[1]];
                        iArr[llIIIllIII[0]] = llIIIllIII[3];
                        if (lIlIIllIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                            int[] iArr54 = new int[llIIIllIII[1]];
                            iArr54[llIIIllIII[0]] = llIIIllIII[3];
                            Item first13 = Inventory.getFirst(iArr54);
                            int[] iArr55 = new int[llIIIllIII[1]];
                            iArr55[llIIIllIII[0]] = llIIIllIII[5];
                            first13.useOn(Inventory.getFirst(iArr55));
                            Time.sleepTicks(llIIIllIII[7]);
                            "".length();
                        }
                    }
                    if (lIlIIllIIllII(md ? 1 : 0)) {
                        String[] strArr68 = new String[llIIIllIII[1]];
                        strArr68[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[238]];
                        if (lIlIIllIlIIIl(Inventory.contains(strArr68) ? 1 : 0)) {
                            dF();
                        }
                        String[] strArr69 = new String[llIIIllIII[1]];
                        strArr69[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[239]];
                        if (lIlIIllIIllII(Inventory.contains(strArr69) ? 1 : 0)) {
                            if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[9])) {
                                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[240]];
                                if (lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] strArr70 = new String[llIIIllIII[1]];
                                    strArr70[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[241]];
                                    if (lIlIIlllIIIII(NPCs.getNearest(strArr70))) {
                                        Dialog.close();
                                    }
                                }
                                if (lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Movement.walkTo(lZ);
                                    "".length();
                                    Time.sleepTicks(llIIIllIII[1]);
                                    "".length();
                                }
                                String[] strArr71 = new String[llIIIllIII[7]];
                                strArr71[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[242]];
                                strArr71[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[243]];
                                strArr71[llIIIllIII[2]] = llIIIlIllI[llIIIllIII[244]];
                                C0020g.a(strArr71);
                            }
                            if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[9])) {
                                C0020g.a(llIIIlIllI[llIIIllIII[245]], cE);
                            }
                        }
                    }
                }
                if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[8]];
                    if (lIlIIllIIllII(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr56 = new int[llIIIllIII[1]];
                        iArr56[llIIIllIII[0]] = llIIIllIII[35];
                        if (lIlIIllIIllII(Inventory.contains(iArr56) ? 1 : 0)) {
                            int[] iArr57 = new int[llIIIllIII[1]];
                            iArr57[llIIIllIII[0]] = llIIIllIII[35];
                            Inventory.getFirst(iArr57).interact(llIIIlIllI[llIIIllIII[56]]);
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                    }
                    Movement.walkTo(lW);
                    "".length();
                    Time.sleepTicks(llIIIllIII[1]);
                    "".length();
                }
                if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lW), llIIIllIII[12])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[57]];
                    if (lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        C0020g.a(llIIIlIllI[llIIIllIII[58]], cE, llIIIllIII[1]);
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[59]), llIIIllIII[1])) {
                        String[] strArr72 = new String[llIIIllIII[2]];
                        strArr72[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[60]];
                        strArr72[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[61]];
                        C0020g.a(strArr72);
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[62]), llIIIllIII[1])) {
                        String[] strArr73 = new String[llIIIllIII[1]];
                        strArr73[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[63]];
                        C0020g.a(strArr73);
                    }
                    if (!lIlIIllIllllI(Vars.getBit(llIIIllIII[64]), llIIIllIII[1]) || lIlIIllIIllII(Vars.getBit(llIIIllIII[62]))) {
                        String[] strArr74 = new String[llIIIllIII[1]];
                        strArr74[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[65]];
                    }
                    String[] strArr75 = new String[llIIIllIII[2]];
                    strArr75[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[15]];
                    strArr75[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[66]];
                    C0020g.a(strArr75);
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[67]), llIIIllIII[1])) {
                        String[] strArr76 = new String[llIIIllIII[2]];
                        strArr76[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[68]];
                        strArr76[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[69]];
                        C0020g.a(strArr76);
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[54]), llIIIllIII[1])) {
                        String[] strArr77 = new String[llIIIllIII[2]];
                        strArr77[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[70]];
                        strArr77[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[71]];
                        C0020g.a(strArr77);
                    }
                }
                if (lIlIIllIlIIIl(Vars.getBit(llIIIllIII[54]))) {
                    strArr10 = new String[llIIIllIII[1]];
                    strArr10[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[74]];
                    if (lIlIIllIIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[73]), llIIIllIII[1])) {
                        strArr8 = new String[llIIIllIII[1]];
                        strArr8[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[82]];
                        if (lIlIIllIlIIIl(Inventory.contains(strArr8) ? 1 : 0)) {
                            dG();
                        }
                        strArr9 = new String[llIIIllIII[1]];
                        strArr9[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[84]];
                        if (lIlIIllIIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIllIllllI(Vars.getBit(llIIIllIII[81]), llIIIllIII[1])) {
                        strArr2 = new String[llIIIllIII[1]];
                        strArr2[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[119]];
                        if (lIlIIllIIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                        }
                        strArr3 = new String[llIIIllIII[1]];
                        strArr3[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[122]];
                        if (lIlIIllIIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                        }
                        strArr4 = new String[llIIIllIII[1]];
                        strArr4[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[125]];
                        if (lIlIIllIIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        }
                        strArr5 = new String[llIIIllIII[1]];
                        strArr5[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[128]];
                        if (lIlIIllIIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                        }
                        String[] strArr542 = new String[llIIIllIII[1]];
                        strArr542[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[25]];
                        nearest3 = TileObjects.getNearest(strArr542);
                        if (lIlIIllIlIlll(nearest3)) {
                            if (lIlIIllIlIIIl(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            }
                            if (lIlIIllIIllII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                                strArr6 = new String[llIIIllIII[1]];
                                strArr6[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[133]];
                                if (lIlIIllIIllII(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                }
                                strArr7 = new String[llIIIllIII[1]];
                                strArr7[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[135]];
                                if (lIlIIllIIllII(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                }
                            }
                        }
                    }
                    if (lIlIIllIIllII(ma ? 1 : 0)) {
                        if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllIII[85], llIIIllIII[86], llIIIllIII[0])), llIIIllIII[23])) {
                        }
                        worldPoint4 = new WorldPoint(llIIIllIII[138], llIIIllIII[139], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                        if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIllIIllII(ma ? 1 : 0)) {
                        strArr = new String[llIIIllIII[1]];
                        strArr[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[146]];
                        if (lIlIIllIIllII(Inventory.contains(strArr) ? 1 : 0)) {
                        }
                        WorldArea worldArea42 = new WorldArea(llIIIllIII[149], llIIIllIII[150], llIIIllIII[51], llIIIllIII[10], llIIIllIII[0]);
                        worldArea = new WorldArea(llIIIllIII[151], llIIIllIII[152], llIIIllIII[58], llIIIllIII[58], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            worldPoint3 = new WorldPoint(llIIIllIII[153], llIIIllIII[154], llIIIllIII[0]);
                            if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIIIllIII[2])) {
                            }
                            if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), llIIIllIII[2])) {
                            }
                        }
                        worldArea2 = new WorldArea(llIIIllIII[158], llIIIllIII[159], llIIIllIII[11], llIIIllIII[16], llIIIllIII[0]);
                        WorldArea worldArea52 = new WorldArea(llIIIllIII[160], llIIIllIII[161], llIIIllIII[13], llIIIllIII[7], llIIIllIII[0]);
                        if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            iArr5 = new int[llIIIllIII[1]];
                            iArr5[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                            }
                            iArr6 = new int[llIIIllIII[1]];
                            iArr6[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr6))) {
                            }
                            iArr7 = new int[llIIIllIII[1]];
                            iArr7[llIIIllIII[0]] = llIIIllIII[162];
                            if (lIlIIllIIllII(Inventory.contains(iArr7) ? 1 : 0)) {
                                worldPoint2 = new WorldPoint(llIIIllIII[169], llIIIllIII[170], llIIIllIII[0]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                }
                            }
                            if (lIlIIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                            nearest2 = TileObjects.getNearest(tileObject7 -> {
                                if (lIlIIllIIllII(tileObject7.getName().contains(llIIIlIllI[llIIIllIII[334]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject7) ? 1 : 0)) {
                                    ?? r0 = llIIIllIII[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIllIII[0];
                            });
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[174]];
                            if (lIlIIllIlIlll(nearest2)) {
                            }
                        }
                        if (lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                            iArr2 = new int[llIIIllIII[1]];
                            iArr2[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                            }
                            iArr3 = new int[llIIIllIII[1]];
                            iArr3[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIlIlll(TileItems.getNearest(iArr3))) {
                            }
                            worldArea3 = new WorldArea(llIIIllIII[183], llIIIllIII[184], llIIIllIII[12], llIIIllIII[11], llIIIllIII[1]);
                            iArr4 = new int[llIIIllIII[1]];
                            iArr4[llIIIllIII[0]] = llIIIllIII[178];
                            if (lIlIIllIIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                                worldPoint = new WorldPoint(llIIIllIII[163], llIIIllIII[170], llIIIllIII[1]);
                                if (lIlIIllIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                                if (lIlIIllIIllII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                                }
                            }
                            if (lIlIIllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            }
                        }
                        if (lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[2])) {
                        }
                        if (lIlIIllIlIIIl(new WorldArea(llIIIllIII[176], llIIIllIII[177], llIIIllIII[11], llIIIllIII[13], llIIIllIII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        nearest = TileObjects.getNearest(tileObject42 -> {
                            if (lIlIIllIIllII(tileObject42.getName().contains(llIIIlIllI[llIIIllIII[328]]) ? 1 : 0) && lIlIIllIIllII(Reachable.isInteractable(tileObject42) ? 1 : 0)) {
                                String[] strArr622 = new String[llIIIllIII[1]];
                                strArr622[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[329]];
                                if (lIlIIllIIllII(tileObject42.hasAction(strArr622) ? 1 : 0)) {
                                    ?? r0 = llIIIllIII[1];
                                    "".length();
                                    return "  ".length() == 0 ? ((((87 + 106) - 90) + 109) ^ (((63 + 114) - 61) + 32)) & (((144 ^ 159) ^ (242 ^ 189)) ^ (-" ".length())) : r0;
                                }
                            }
                            return llIIIllIII[0];
                        });
                        if (lIlIIllIlIlll(nearest)) {
                        }
                        if (lIlIIllIIllII(new WorldArea(llIIIllIII[163], llIIIllIII[164], llIIIllIII[26], llIIIllIII[12], llIIIllIII[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                        WorldArea worldArea72 = new WorldArea(llIIIllIII[194], llIIIllIII[203], llIIIllIII[43], llIIIllIII[9], llIIIllIII[0]);
                        WorldArea worldArea82 = new WorldArea(llIIIllIII[204], llIIIllIII[205], llIIIllIII[13], llIIIllIII[23], llIIIllIII[0]);
                        WorldArea worldArea92 = new WorldArea(llIIIllIII[169], llIIIllIII[206], llIIIllIII[11], llIIIllIII[17], llIIIllIII[0]);
                        if (lIlIIllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIllIIllII(mb ? 1 : 0)) {
                        iArr = new int[llIIIllIII[1]];
                        iArr[llIIIllIII[0]] = llIIIllIII[3];
                        if (lIlIIllIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                        }
                    }
                    if (lIlIIllIIllII(md ? 1 : 0)) {
                    }
                }
                strArr10 = new String[llIIIllIII[1]];
                strArr10[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[74]];
                if (lIlIIllIIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                }
                if (lIlIIllIllllI(Vars.getBit(llIIIllIII[73]), llIIIllIII[1])) {
                }
                if (lIlIIllIllllI(Vars.getBit(llIIIllIII[81]), llIIIllIII[1])) {
                }
                if (lIlIIllIIllII(ma ? 1 : 0)) {
                }
                if (lIlIIllIIllII(ma ? 1 : 0)) {
                }
                if (lIlIIllIIllII(mb ? 1 : 0)) {
                }
                if (lIlIIllIIllII(md ? 1 : 0)) {
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[7])) {
                di = llIIIllIII[0];
                String[] strArr78 = new String[llIIIllIII[1]];
                strArr78[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[246]];
                NPC nearest14 = NPCs.getNearest(strArr78);
                if (lIlIIlllIIIII(nearest14) && lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[247]];
                    String[] strArr79 = new String[llIIIllIII[1]];
                    strArr79[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[248]];
                    TileObjects.getNearest(strArr79).interact(llIIIlIllI[llIIIllIII[249]]);
                    Time.sleepTicks(llIIIllIII[16]);
                    "".length();
                }
                if (lIlIIlllIIIII(nearest14) && lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[250]];
                    String[] strArr80 = new String[llIIIllIII[1]];
                    strArr80[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[251]];
                    TileObjects.getNearest(strArr80).interact(llIIIlIllI[llIIIllIII[252]]);
                    Time.sleepTicks(llIIIllIII[7]);
                    "".length();
                }
                if (lIlIIllIlIlll(nearest14) && lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                    String[] strArr81 = new String[llIIIllIII[1]];
                    strArr81[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[253]];
                    TileObjects.getNearest(strArr81).interact(llIIIlIllI[llIIIllIII[254]]);
                    Time.sleepTicks(llIIIllIII[11]);
                    "".length();
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[12])) {
                AccBuilderSotf.c = llIIIlIllI[llIIIllIII[255]];
                String[] strArr82 = new String[llIIIllIII[1]];
                strArr82[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[256]];
                NPC nearest15 = NPCs.getNearest(strArr82);
                if (lIlIIlllIIIII(nearest15)) {
                    Equipment.getFirst(item7 -> {
                        return item7.getName().contains(llIIIlIllI[llIIIllIII[323]]);
                    }).interact(llIIIlIllI[llIIIllIII[257]]);
                    Time.sleepTicks(llIIIllIII[23]);
                    "".length();
                    Movement.walkTo(new WorldPoint(llIIIllIII[258], llIIIllIII[259], llIIIllIII[0]));
                    "".length();
                }
                if (lIlIIllIlIlll(nearest15)) {
                    C0020g.a(llIIIlIllI[llIIIllIII[14]], cE, llIIIllIII[1]);
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[13])) {
                if (lIlIIllIlIIIl(Inventory.contains(item8 -> {
                    return item8.getName().contains(llIIIlIllI[llIIIllIII[322]]);
                }) ? 1 : 0)) {
                    dE();
                }
                if (lIlIIllIIllII(Inventory.contains(item9 -> {
                    return item9.getName().contains(llIIIlIllI[llIIIllIII[321]]);
                }) ? 1 : 0)) {
                    String[] strArr83 = new String[llIIIllIII[1]];
                    strArr83[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[72]];
                    if (lIlIIlllIIIII(NPCs.getNearest(strArr83)) && lIlIIllIlIIIl(Players.getLocal().getWorldLocation().getPlane()) && lIlIIllIlIIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                        if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[2])) {
                            AccBuilderSotf.c = llIIIlIllI[llIIIllIII[260]];
                            if (lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr84 = new String[llIIIllIII[1]];
                                strArr84[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[261]];
                                if (lIlIIlllIIIII(NPCs.getNearest(strArr84))) {
                                    Dialog.close();
                                }
                            }
                            if (lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Movement.walkTo(lZ);
                                "".length();
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                            String[] strArr85 = new String[llIIIllIII[7]];
                            strArr85[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[262]];
                            strArr85[llIIIllIII[1]] = llIIIlIllI[llIIIllIII[263]];
                            strArr85[llIIIllIII[2]] = llIIIlIllI[llIIIllIII[264]];
                            C0020g.a(strArr85);
                        }
                        if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(lZ), llIIIllIII[2]) && lIlIIllIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr86 = new String[llIIIllIII[1]];
                            strArr86[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[265]];
                            TileObjects.getNearest(strArr86).interact(llIIIlIllI[llIIIllIII[266]]);
                            Time.sleepTicks(llIIIllIII[13]);
                            "".length();
                        }
                    }
                    String[] strArr87 = new String[llIIIllIII[1]];
                    strArr87[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[267]];
                    if (lIlIIllIlIlll(NPCs.getNearest(strArr87)) && lIlIIllIllllI(Players.getLocal().getWorldLocation().getPlane(), llIIIllIII[1])) {
                        C0020g.a(llIIIlIllI[llIIIllIII[268]], cE);
                    }
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[16])) {
                WorldArea worldArea12 = new WorldArea(llIIIllIII[269], llIIIllIII[270], llIIIllIII[89], llIIIllIII[79], llIIIllIII[0]);
                if (lIlIIllIlIIIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint12 = new WorldPoint(llIIIllIII[271], llIIIllIII[259], llIIIllIII[0]);
                    if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llIIIllIII[7])) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[272]];
                        Movement.walkTo(worldPoint12);
                        "".length();
                        Time.sleepTicks(llIIIllIII[1]);
                        "".length();
                    }
                    if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llIIIllIII[7])) {
                        String[] strArr88 = new String[llIIIllIII[1]];
                        strArr88[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[273]];
                        TileObjects.getNearest(strArr88).interact(llIIIlIllI[llIIIllIII[274]]);
                        Time.sleepTicks(llIIIllIII[9]);
                        "".length();
                    }
                }
                if (lIlIIllIIllII(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr89 = new String[llIIIllIII[1]];
                    strArr89[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[275]];
                    NPC nearest16 = NPCs.getNearest(strArr89);
                    WorldPoint worldPoint13 = new WorldPoint(llIIIllIII[276], llIIIllIII[152], llIIIllIII[0]);
                    if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llIIIllIII[7]) && lIlIIlllIIIII(nearest16)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[277]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(llIIIllIII[1]);
                        "".length();
                    }
                    if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llIIIllIII[7]) && lIlIIllIlIlll(nearest16) && lIlIIllIlIIIl(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[278]];
                        Movement.walkTo(worldPoint13);
                        "".length();
                        Time.sleepTicks(llIIIllIII[1]);
                        "".length();
                    }
                    if (lIlIIllIlIlll(nearest16) && lIlIIllIlIIIl(Reachable.isInteractable(nearest16) ? 1 : 0) && lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), llIIIllIII[7]) && lIlIIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        if (lIlIIllIllIlI(Combat.getMissingHealth(), llIIIllIII[9])) {
                            String[] strArr90 = new String[llIIIllIII[1]];
                            strArr90[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[279]];
                            if (lIlIIllIIllII(Inventory.contains(strArr90) ? 1 : 0)) {
                                String[] strArr91 = new String[llIIIllIII[1]];
                                strArr91[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[280]];
                                Inventory.getFirst(strArr91).interact(llIIIlIllI[llIIIllIII[281]]);
                                Time.sleepTicks(llIIIllIII[1]);
                                "".length();
                            }
                        }
                        String[] strArr92 = new String[llIIIllIII[1]];
                        strArr92[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[282]];
                        TileObjects.getNearest(strArr92).interact(llIIIlIllI[llIIIllIII[283]]);
                    }
                    if (lIlIIllIlIlll(nearest16) && lIlIIllIIllII(Reachable.isInteractable(nearest16) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIllI[llIIIllIII[284]];
                        if (lIlIIllIlIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                        }
                        if (lIlIIllIlIIIl(Prayers.isEnabled(Prayer.ULTIMATE_STRENGTH) ? 1 : 0)) {
                            Prayers.toggle(Prayer.ULTIMATE_STRENGTH);
                        }
                        if (lIlIIllIlIIIl(Prayers.isEnabled(Prayer.INCREDIBLE_REFLEXES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.INCREDIBLE_REFLEXES);
                        }
                        String[] strArr93 = new String[llIIIllIII[1]];
                        strArr93[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[285]];
                        if (lIlIIllIIllII(Inventory.contains(strArr93) ? 1 : 0)) {
                            String[] strArr94 = new String[llIIIllIII[1]];
                            strArr94[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[286]];
                            Inventory.getFirst(strArr94).interact(llIIIlIllI[llIIIllIII[287]]);
                        }
                        if (lIlIIllIIllII(Inventory.isFull() ? 1 : 0)) {
                            String[] strArr95 = new String[llIIIllIII[1]];
                            strArr95[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[288]];
                            Inventory.getFirst(strArr95).interact(llIIIlIllI[llIIIllIII[289]]);
                        }
                        if (lIlIIllIllllI(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIIllIIllII(Inventory.contains(item10 -> {
                            return item10.getName().contains(llIIIlIllI[llIIIllIII[320]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item11 -> {
                                return item11.getName().contains(llIIIlIllI[llIIIllIII[319]]);
                            }).interact(llIIIlIllI[llIIIllIII[290]]);
                        }
                        if (lIlIIllIIllll(Vars.getBit(llIIIllIII[291]), llIIIllIII[1]) && lIlIIllIIllII(Inventory.contains(item12 -> {
                            return item12.getName().contains(llIIIlIllI[llIIIllIII[318]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item13 -> {
                                return item13.getName().contains(llIIIlIllI[llIIIllIII[317]]);
                            }).interact(llIIIlIllI[llIIIllIII[292]]);
                        }
                        if (lIlIIlllIIIII(Players.getLocal().getInteracting())) {
                            nearest16.interact(llIIIlIllI[llIIIllIII[293]]);
                            Time.sleepTicks(llIIIllIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[17])) {
                Prayers.disableAll();
                WorldPoint worldPoint14 = new WorldPoint(llIIIllIII[48], llIIIllIII[49], llIIIllIII[0]);
                if (lIlIIllIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), llIIIllIII[16]) && lIlIIllIllllI(Players.getLocal().getAnimation(), llIIIllIII[294])) {
                    AccBuilderSotf.c = llIIIlIllI[llIIIllIII[295]];
                    Movement.walkTo(worldPoint14);
                    "".length();
                    Time.sleepTicks(llIIIllIII[1]);
                    "".length();
                }
                if (lIlIIllIlllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), llIIIllIII[16])) {
                    if (lIlIIllIIllll(di, llIIIllIII[1])) {
                        aN.tc += llIIIllIII[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIIllIII[1];
                        aN.tc = llIIIllIII[0];
                        dj = llIIIllIII[0];
                    }
                    C0020g.a(llIIIlIllI[llIIIllIII[296]], cE, llIIIllIII[1]);
                }
            }
            int[] iArr58 = new int[llIIIllIII[1]];
            iArr58[llIIIllIII[0]] = llIIIllIII[36];
            if (lIlIIllIIllII(Inventory.contains(iArr58) ? 1 : 0)) {
                int[] iArr59 = new int[llIIIllIII[1]];
                iArr59[llIIIllIII[0]] = llIIIllIII[36];
                if (lIlIIllIlIIIl(Equipment.contains(iArr59) ? 1 : 0) && lIlIIllIlIlIl(C0018e.j(llIIIllIII[14]))) {
                    int[] iArr60 = new int[llIIIllIII[1]];
                    iArr60[llIIIllIII[0]] = llIIIllIII[36];
                    Inventory.getFirst(iArr60).interact(llIIIlIllI[llIIIllIII[297]]);
                }
            }
            String[] strArr96 = new String[llIIIllIII[1]];
            strArr96[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[298]];
            if (lIlIIllIIllII(Inventory.contains(strArr96) ? 1 : 0)) {
                md = llIIIllIII[1];
                mc = llIIIllIII[1];
                ma = llIIIllIII[1];
                mb = llIIIllIII[1];
            }
            int[] iArr61 = new int[llIIIllIII[1]];
            iArr61[llIIIllIII[0]] = llIIIllIII[3];
            if (lIlIIllIIllII(Inventory.contains(iArr61) ? 1 : 0)) {
                mc = llIIIllIII[1];
            }
            int[] iArr62 = new int[llIIIllIII[1]];
            iArr62[llIIIllIII[0]] = llIIIllIII[4];
            if (lIlIIllIIllII(Inventory.contains(iArr62) ? 1 : 0)) {
                ma = llIIIllIII[1];
            }
            int[] iArr63 = new int[llIIIllIII[1]];
            iArr63[llIIIllIII[0]] = llIIIllIII[5];
            if (lIlIIllIIllII(Inventory.contains(iArr63) ? 1 : 0)) {
                mb = llIIIllIII[1];
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[23])) {
                String[] strArr97 = new String[llIIIllIII[1]];
                strArr97[llIIIllIII[0]] = llIIIlIllI[llIIIllIII[299]];
                if (lIlIIllIlIlll(NPCs.getNearest(strArr97))) {
                    int[] iArr64 = new int[llIIIllIII[1]];
                    iArr64[llIIIllIII[0]] = llIIIllIII[19];
                    if (lIlIIllIIllII(Inventory.contains(iArr64) ? 1 : 0)) {
                        int[] iArr65 = new int[llIIIllIII[1]];
                        iArr65[llIIIllIII[0]] = llIIIllIII[19];
                        Inventory.getFirst(iArr65).interact(llIIIlIllI[llIIIllIII[300]]);
                        Time.sleepTicks(llIIIllIII[12]);
                        "".length();
                    }
                }
            }
            if (lIlIIllIllllI(C0018e.j(llIIIllIII[14]), llIIIllIII[23]) && lIlIIllIIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            System.out.println("Setting: " + C0018e.j(llIIIllIII[14]));
        }
        C0020g.a(new String[llIIIllIII[0]]);
    }

    private static void lIlIIllIIlIIl() {
        llIIIllIII = new int[366];
        llIIIllIII[0] = (105 ^ 64) & ((160 ^ 137) ^ (-1));
        llIIIllIII[1] = " ".length();
        llIIIllIII[2] = "  ".length();
        llIIIllIII[3] = (-26625) & 28159;
        llIIIllIII[4] = (-((-10273) & 14835)) & (-16385) & 22483;
        llIIIllIII[5] = (-((-1537) & 5804)) & (-26689) & 32491;
        llIIIllIII[6] = 49 ^ 3;
        llIIIllIII[7] = "   ".length();
        llIIIllIII[8] = 103 ^ 127;
        llIIIllIII[9] = (((96 + 49) - 43) + 49) ^ (((96 + 75) - 167) + 143);
        llIIIllIII[10] = 145 ^ 133;
        llIIIllIII[11] = (232 ^ 176) ^ (192 ^ 157);
        llIIIllIII[12] = (108 ^ 1) ^ (26 ^ 113);
        llIIIllIII[13] = 119 ^ 112;
        llIIIllIII[14] = (((2 ^ 112) + (248 ^ 183)) - (83 ^ 28)) + (91 ^ 101);
        llIIIllIII[15] = (102 ^ 42) ^ (23 ^ 123);
        llIIIllIII[16] = (93 ^ 118) ^ (140 ^ 175);
        llIIIllIII[17] = (((156 + 107) - 181) + 86) ^ (((33 + 121) - 153) + 160);
        llIIIllIII[18] = (-((-10242) & 27651)) & (-10277) & 32685;
        llIIIllIII[19] = (-169) & 8175;
        llIIIllIII[20] = (180 ^ 131) ^ (166 ^ 158);
        llIIIllIII[21] = (-16423) & 24431;
        llIIIllIII[22] = (-(172 ^ 152)) & (-8197) & 16255;
        llIIIllIII[23] = (184 ^ 148) ^ (76 ^ 106);
        llIIIllIII[24] = (-20677) & 22215;
        llIIIllIII[25] = (((23 + 184) - 54) + 57) ^ (((16 + 76) - 37) + 81);
        llIIIllIII[26] = (((60 + 39) - (-33)) + 52) ^ (((77 + 122) - 20) + 0);
        llIIIllIII[27] = (-(131 ^ 191)) & (-2049) & 3067;
        llIIIllIII[28] = (93 ^ 108) ^ (173 ^ 144);
        llIIIllIII[29] = (33 ^ 42) ^ (179 ^ 169);
        llIIIllIII[30] = (-4353) & 6143;
        llIIIllIII[31] = (-2189) & 4095;
        llIIIllIII[32] = (-26707) & 27007;
        llIIIllIII[33] = (-((-1601) & 5706)) & (-8257) & 13311;
        llIIIllIII[34] = (-((-1163) & 30427)) & (-1157) & 32767;
        llIIIllIII[35] = (-((-421) & 29095)) & (-1025) & 30083;
        llIIIllIII[36] = (-16555) & 18094;
        llIIIllIII[37] = (-3241) & 15865;
        llIIIllIII[38] = (34 ^ 84) ^ (196 ^ 191);
        llIIIllIII[39] = (-((-405) & 29598)) & (-1123) & 32767;
        llIIIllIII[40] = (16 ^ 102) ^ (85 ^ 45);
        llIIIllIII[41] = (-((-15517) & 16093)) & (-16417) & 29687;
        llIIIllIII[42] = (-309) & 12286;
        llIIIllIII[43] = 184 ^ 168;
        llIIIllIII[44] = (-4297) & 5629;
        llIIIllIII[45] = (-((-9501) & 14205)) & (-9230) & 16367;
        llIIIllIII[46] = (-((-10329) & 11353)) & (-2049) & 4067;
        llIIIllIII[47] = (-36) & 15035;
        llIIIllIII[48] = (-"   ".length()) & (-4097) & 7167;
        llIIIllIII[49] = (-((-921) & 13275)) & (-16897) & 32767;
        llIIIllIII[50] = 159 ^ 141;
        llIIIllIII[51] = (((99 + 90) - 159) + 111) ^ (((45 + 67) - 92) + 138);
        llIIIllIII[52] = (85 ^ 122) ^ (22 ^ 44);
        llIIIllIII[53] = 28 ^ 10;
        llIIIllIII[54] = (-280) & 4023;
        llIIIllIII[55] = (90 ^ 99) ^ (90 ^ 116);
        llIIIllIII[56] = 92 ^ 69;
        llIIIllIII[57] = (15 ^ 59) ^ (111 ^ 65);
        llIIIllIII[58] = 48 ^ 43;
        llIIIllIII[59] = (-28739) & 32483;
        llIIIllIII[60] = 109 ^ 113;
        llIIIllIII[61] = 93 ^ 64;
        llIIIllIII[62] = (-((-645) & 13277)) & (-6) & 16383;
        llIIIllIII[63] = 86 ^ 72;
        llIIIllIII[64] = (-((-27865) & 31994)) & (-257) & 8127;
        llIIIllIII[65] = (134 ^ 141) ^ (117 ^ 97);
        llIIIllIII[66] = (((117 + 14) - 3) + 7) ^ (((119 + 48) - 142) + 141);
        llIIIllIII[67] = (-28993) & 32735;
        llIIIllIII[68] = 182 ^ 148;
        llIIIllIII[69] = 33 ^ 2;
        llIIIllIII[70] = 30 ^ 58;
        llIIIllIII[71] = (((89 + 123) - 180) + 146) ^ (((72 + 73) - 144) + 150);
        llIIIllIII[72] = (((41 ^ 14) + (103 ^ 105)) - (-(131 ^ 161))) + (113 ^ 43);
        llIIIllIII[73] = (-((-4872) & 15263)) & (-16385) & 28607;
        llIIIllIII[74] = (103 ^ 48) ^ (71 ^ 54);
        llIIIllIII[75] = (-((-6850) & 24291)) & (-12305) & 32759;
        llIIIllIII[76] = (-67) & 3567;
        llIIIllIII[77] = 8 ^ 47;
        llIIIllIII[78] = ((6 ^ 32) & ((130 ^ 164) ^ (-1))) ^ (15 ^ 39);
        llIIIllIII[79] = 75 ^ 98;
        llIIIllIII[80] = 35 ^ 9;
        llIIIllIII[81] = (-((-19617) & 24057)) & (-16385) & 24574;
        llIIIllIII[82] = 65 ^ 106;
        llIIIllIII[83] = (-20819) & 24567;
        llIIIllIII[84] = (106 ^ 0) ^ (64 ^ 6);
        llIIIllIII[85] = (-17411) & 20459;
        llIIIllIII[86] = (-20489) & 30328;
        llIIIllIII[87] = 61 ^ 16;
        llIIIllIII[88] = (((28 + 115) - 112) + 102) ^ (((83 + 84) - 86) + 90);
        llIIIllIII[89] = 190 ^ 145;
        llIIIllIII[90] = (((117 + 110) - 191) + 104) ^ (((66 + 58) - (-55)) + 9);
        llIIIllIII[91] = (((14 + 128) - 110) + 99) ^ (((83 + 134) - 190) + 151);
        llIIIllIII[92] = 160 ^ 147;
        llIIIllIII[93] = (((147 + 91) - 133) + 55) ^ (((78 + 69) - 102) + 103);
        llIIIllIII[94] = 77 ^ 120;
        llIIIllIII[95] = 69 ^ 115;
        llIIIllIII[96] = (((27 + 20) - (-13)) + 73) ^ (((31 + 123) - 78) + 102);
        llIIIllIII[97] = (((85 + 146) - 225) + 150) ^ (((27 + 43) - 31) + 125);
        llIIIllIII[98] = (196 ^ 140) ^ (69 ^ 52);
        llIIIllIII[99] = 65 ^ 123;
        llIIIllIII[100] = (3 ^ 4) ^ (110 ^ 82);
        llIIIllIII[101] = 119 ^ 75;
        llIIIllIII[102] = (((112 + 80) - 63) + 42) ^ (((127 + 142) - 189) + 70);
        llIIIllIII[103] = (6 ^ 28) ^ (65 ^ 101);
        llIIIllIII[104] = 65 ^ 126;
        llIIIllIII[105] = 195 ^ 131;
        llIIIllIII[106] = "   ".length() ^ (94 ^ 28);
        llIIIllIII[107] = (46 ^ 30) ^ (217 ^ 171);
        llIIIllIII[108] = (((136 + 202) - 267) + 155) ^ (((61 + 121) - 45) + 24);
        llIIIllIII[109] = (74 ^ 87) ^ (232 ^ 177);
        llIIIllIII[110] = 226 ^ 167;
        llIIIllIII[111] = 68 ^ 2;
        llIIIllIII[112] = (105 ^ 93) ^ (54 ^ 69);
        llIIIllIII[113] = (100 ^ 63) ^ (138 ^ 153);
        llIIIllIII[114] = 62 ^ 119;
        llIIIllIII[115] = 195 ^ 137;
        llIIIllIII[116] = 34 ^ 105;
        llIIIllIII[117] = 20 ^ 88;
        llIIIllIII[118] = (((226 + 219) - 410) + 209) ^ (((119 + 164) - 144) + 46);
        llIIIllIII[119] = (20 ^ 117) ^ (7 ^ 40);
        llIIIllIII[120] = (10 ^ 25) ^ (210 ^ 142);
        llIIIllIII[121] = 15 ^ 95;
        llIIIllIII[122] = (113 ^ 121) ^ (86 ^ 15);
        llIIIllIII[123] = 193 ^ 147;
        llIIIllIII[124] = (((221 + 164) - 301) + 147) ^ (((85 + 138) - 91) + 48);
        llIIIllIII[125] = (111 ^ 107) ^ (8 ^ 88);
        llIIIllIII[126] = 196 ^ 145;
        llIIIllIII[127] = 120 ^ 46;
        llIIIllIII[128] = (((7 + 64) - 44) + 171) ^ (((21 + 47) - 55) + 132);
        llIIIllIII[129] = 85 ^ 13;
        llIIIllIII[130] = (98 ^ 79) ^ (22 ^ 98);
        llIIIllIII[131] = 116 ^ 47;
        llIIIllIII[132] = (182 ^ 133) ^ (57 ^ 86);
        llIIIllIII[133] = (64 ^ 25) ^ (195 ^ 199);
        llIIIllIII[134] = 212 ^ 138;
        llIIIllIII[135] = 4 ^ 91;
        llIIIllIII[136] = (((103 + 196) - 291) + 243) ^ (((76 + 54) - 7) + 32);
        llIIIllIII[137] = (((193 + 129) - 296) + 223) ^ (((32 + 2) - (-36)) + 82);
        llIIIllIII[138] = (-((-6217) & 15484)) & (-20489) & 32767;
        llIIIllIII[139] = (-((-18981) & 27559)) & (-16905) & 28671;
        llIIIllIII[140] = (123 ^ 24) ^ " ".length();
        llIIIllIII[141] = 116 ^ 23;
        llIIIllIII[142] = 196 ^ 160;
        llIIIllIII[143] = 29 ^ 120;
        llIIIllIII[144] = 116 ^ 18;
        llIIIllIII[145] = 226 ^ 133;
        llIIIllIII[146] = 33 ^ 73;
        llIIIllIII[147] = 174 ^ 199;
        llIIIllIII[148] = (62 ^ 46) ^ (199 ^ 189);
        llIIIllIII[149] = (-25618) & 28539;
        llIIIllIII[150] = (-((-69) & 13133)) & (-1) & 16302;
        llIIIllIII[151] = (-((-14454) & 31991)) & (-17) & 20469;
        llIIIllIII[152] = (-((-1833) & 22331)) & (-513) & 30646;
        llIIIllIII[153] = (-((-1401) & 30075)) & (-1153) & 32767;
        llIIIllIII[154] = (-((-11845) & 28231)) & (-12866) & 32499;
        llIIIllIII[155] = (((15 + 162) - 8) + 6) ^ (((67 + 114) - 51) + 66);
        llIIIllIII[156] = 8 ^ 100;
        llIIIllIII[157] = (((138 + 150) - 199) + 110) ^ (((62 + 12) - (-82)) + 14);
        llIIIllIII[158] = (-(185 ^ 170)) & (-25605) & 28543;
        llIIIllIII[159] = (-20742) & 23991;
        llIIIllIII[160] = (-17425) & 20347;
        llIIIllIII[161] = (-28737) & 31991;
        llIIIllIII[162] = (-((-5) & 12709)) & (-2137) & 16383;
        llIIIllIII[163] = (-((-1841) & 10173)) & (-17409) & 28670;
        llIIIllIII[164] = (-539) & 3775;
        llIIIllIII[165] = 119 ^ 25;
        llIIIllIII[166] = (-28701) & 32669;
        llIIIllIII[167] = (((159 + 7) - 20) + 53) ^ (((129 + 152) - 115) + 2);
        llIIIllIII[168] = (8 ^ 36) ^ (113 ^ 45);
        llIIIllIII[169] = (-4113) & 7038;
        llIIIllIII[170] = (-((-8725) & 29533)) & (-8705) & 32765;
        llIIIllIII[171] = (31 ^ 33) ^ (54 ^ 121);
        llIIIllIII[172] = 180 ^ 198;
        llIIIllIII[173] = 121 ^ 10;
        llIIIllIII[174] = 225 ^ 149;
        llIIIllIII[175] = (231 ^ 157) ^ (56 ^ 55);
        llIIIllIII[176] = (-12421) & 15356;
        llIIIllIII[177] = (-((-3268) & 4063)) & (-65) & 4095;
        llIIIllIII[178] = (-435) & 1978;
        llIIIllIII[179] = 31 ^ 105;
        llIIIllIII[180] = (-(12 ^ 125)) & (-8193) & 12279;
        llIIIllIII[181] = (124 ^ 114) ^ (75 ^ 50);
        llIIIllIII[182] = 234 ^ 146;
        llIIIllIII[183] = (-17541) & 20471;
        llIIIllIII[184] = (-((-8289) & 12642)) & (-25089) & 32693;
        llIIIllIII[185] = 2 ^ 123;
        llIIIllIII[186] = 240 ^ 138;
        llIIIllIII[187] = 119 ^ 12;
        llIIIllIII[188] = 240 ^ 140;
        llIIIllIII[189] = (-((-6751) & 31743)) & (-4167) & 30703;
        llIIIllIII[190] = (74 ^ 62) ^ (35 ^ 42);
        llIIIllIII[191] = (-12355) & 16326;
        llIIIllIII[192] = 227 ^ 157;
        llIIIllIII[193] = ((11 + 6) - (-81)) + 29;
        llIIIllIII[194] = (-((-16413) & 25759)) & (-20497) & 32766;
        llIIIllIII[195] = ((120 + 67) - 94) + 35;
        llIIIllIII[196] = (((30 ^ 95) + (189 ^ 177)) - (139 ^ 151)) + (234 ^ 186);
        llIIIllIII[197] = (((29 ^ 11) + (246 ^ 151)) - (1 ^ 26)) + (141 ^ 171);
        llIIIllIII[198] = (((27 ^ 64) + (18 ^ 43)) - (30 ^ 47)) + (63 ^ 31);
        llIIIllIII[199] = (-((-22313) & 30637)) & (-4097) & 15359;
        llIIIllIII[200] = (-20803) & 24042;
        llIIIllIII[201] = (((189 ^ 130) + (201 ^ 196)) - (10 ^ 21)) + (246 ^ 161);
        llIIIllIII[202] = ((83 + 117) - 182) + 115;
        llIIIllIII[203] = (-4612) & 14263;
        llIIIllIII[204] = (-29707) & 32639;
        llIIIllIII[205] = (-(29 ^ 76)) & (-2049) & 11774;
        llIIIllIII[206] = (-((-8235) & 14395)) & (-581) & 16383;
        llIIIllIII[207] = (-((-521) & 31613)) & (-130) & 32767;
        llIIIllIII[208] = ((29 + 45) - 30) + 90;
        llIIIllIII[209] = (-((-2345) & 14651)) & (-2) & 16287;
        llIIIllIII[210] = (((104 ^ 62) + (106 ^ 35)) - (232 ^ 182)) + (50 ^ 116);
        llIIIllIII[211] = ((120 + 115) - 231) + 132;
        llIIIllIII[212] = (-((-17641) & 24314)) & (-16449) & 32765;
        llIIIllIII[213] = (((100 ^ 24) + (((40 + 123) - 158) + 128)) - (((67 + 83) - 17) + 50)) + (131 ^ 188);
        llIIIllIII[214] = (((((5 + 98) - 63) + 95) + (60 ^ 51)) - (170 ^ 185)) + (153 ^ 158);
        llIIIllIII[215] = ((132 + 30) - 103) + 80;
        llIIIllIII[216] = (-((-12875) & 15071)) & (-16385) & 20127;
        llIIIllIII[217] = ((5 + 32) - (-18)) + 85;
        llIIIllIII[218] = (-((-533) & 29405)) & (-3073) & 32767;
        llIIIllIII[219] = (((((20 + 92) - 30) + 55) + (46 ^ 64)) - (((44 + 154) - 108) + 71)) + (41 ^ 30);
        llIIIllIII[220] = (((254 ^ 142) + (52 ^ 104)) - (((29 + 33) - (-24)) + 46)) + (194 ^ 132);
        llIIIllIII[221] = (-((-6899) & 23291)) & (-12417) & 31737;
        llIIIllIII[222] = (-19017) & 28667;
        llIIIllIII[223] = ((6 + 75) - 34) + 96;
        llIIIllIII[224] = ((81 + 38) - 99) + 124;
        llIIIllIII[225] = ((4 + 20) - (-120)) + 1;
        llIIIllIII[226] = ((28 + 77) - 94) + 135;
        llIIIllIII[227] = (-2242) & 3789;
        llIIIllIII[228] = (((103 ^ 69) + (((120 + 127) - 129) + 11)) - (((75 + 2) - (-4)) + 56)) + (15 ^ 118);
        llIIIllIII[229] = (((29 ^ 57) + (93 ^ 39)) - (31 ^ 102)) + (108 ^ 3);
        llIIIllIII[230] = (-((-9607) & 16263)) & (-16385) & 32695;
        llIIIllIII[231] = (((58 ^ 117) + (56 ^ 107)) - (47 ^ 109)) + (31 ^ 42);
        llIIIllIII[232] = ((129 + 13) - 20) + 28;
        llIIIllIII[233] = (((((77 + 34) - 104) + 129) + (144 ^ 186)) - (254 ^ 162)) + (239 ^ 174);
        llIIIllIII[234] = (((237 ^ 195) + (202 ^ 191)) - (95 ^ 33)) + (32 ^ 83);
        llIIIllIII[235] = ((49 + 151) - 172) + 125;
        llIIIllIII[236] = (((91 ^ 83) + (((47 + 13) - (-53)) + 21)) - (98 ^ 110)) + (118 ^ 110);
        llIIIllIII[237] = ((14 + 86) - 26) + 81;
        llIIIllIII[238] = (((((28 + 83) - (-11)) + 27) + (((14 + 79) - 81) + 136)) - ((-29732) & 30015)) + ((79 + 103) - 147) + 108;
        llIIIllIII[239] = ((103 + 116) - 141) + 79;
        llIIIllIII[240] = (((105 ^ 82) + (71 ^ 60)) - (((157 + 53) - 175) + 129)) + ((69 + 60) - 79) + 90;
        llIIIllIII[241] = (((137 ^ 184) + (18 ^ 92)) - (180 ^ 198)) + ((141 + 89) - 102) + 18;
        llIIIllIII[242] = (((135 ^ 178) + (75 ^ 14)) - (-(38 ^ 4))) + (131 ^ 135);
        llIIIllIII[243] = ((140 + 102) - 173) + 92;
        llIIIllIII[244] = (((((93 + 121) - 170) + 97) + (252 ^ 183)) - (52 ^ 126)) + (123 ^ 111);
        llIIIllIII[245] = ((107 + 149) - 214) + 121;
        llIIIllIII[246] = (((((35 + 25) - 53) + 144) + (96 ^ 60)) - (((132 + 119) - 122) + 12)) + (22 ^ 40);
        llIIIllIII[247] = ((38 + 161) - 171) + 137;
        llIIIllIII[248] = ((122 + 23) - 20) + 41;
        llIIIllIII[249] = (((32 ^ 91) + (((55 + 42) - 63) + 108)) - (((107 + 0) - 75) + 164)) + (231 ^ 133);
        llIIIllIII[250] = (((((73 + 71) - 22) + 41) + (144 ^ 155)) - (108 ^ 68)) + (48 ^ 18);
        llIIIllIII[251] = ((142 + 46) - 63) + 44;
        llIIIllIII[252] = ((136 + 54) - 132) + 112;
        llIIIllIII[253] = (((72 ^ 0) + (186 ^ 152)) - (-(43 ^ 51))) + (33 ^ 8);
        llIIIllIII[254] = ((30 + 101) - (-9)) + 32;
        llIIIllIII[255] = (((((18 + 13) - (-24)) + 89) + (18 ^ 87)) - (((58 + 93) - 126) + 110)) + (196 ^ 155);
        llIIIllIII[256] = (((27 ^ 14) + (((59 + 0) - (-20)) + 80)) - (208 ^ 178)) + (75 ^ 23);
        llIIIllIII[257] = ((8 + 29) - (-95)) + 43;
        llIIIllIII[258] = (-12833) & 15930;
        llIIIllIII[259] = (-((-25266) & 25591)) & (-1) & 3583;
        llIIIllIII[260] = (((27 ^ 121) + (177 ^ 133)) - (34 ^ 94)) + ((144 + 91) - 94) + 11;
        llIIIllIII[261] = ((112 + 122) - 131) + 76;
        llIIIllIII[262] = ((96 + 166) - 133) + 51;
        llIIIllIII[263] = ((76 + 56) - 5) + 54;
        llIIIllIII[264] = (((192 ^ 168) + (95 ^ 88)) - (52 ^ 125)) + ((50 + 21) - (-32)) + 41;
        llIIIllIII[265] = (((35 ^ 21) + (139 ^ 141)) - (-(43 ^ 2))) + (47 ^ 125);
        llIIIllIII[266] = (((231 ^ 154) + (179 ^ 139)) - (57 ^ 7)) + (224 ^ 161);
        llIIIllIII[267] = (((((139 + 118) - 216) + 101) + (12 ^ 86)) - (((148 + 75) - 132) + 101)) + ((138 + 74) - 125) + 58;
        llIIIllIII[268] = ((47 + 11) - 3) + 131;
        llIIIllIII[269] = (-((-265) & 29166)) & (-17) & 31741;
        llIIIllIII[270] = (-((-26647) & 31287)) & (-16393) & 30655;
        llIIIllIII[271] = (-((-8469) & 30013)) & (-193) & 24570;
        llIIIllIII[272] = ((56 + 11) - (-51)) + 69;
        llIIIllIII[273] = (((((83 + 52) - 8) + 13) + (((130 + 125) - 160) + 60)) - (((25 + 27) - 25) + 133)) + (100 ^ 81);
        llIIIllIII[274] = ((41 + 39) - 4) + 113;
        llIIIllIII[275] = ((148 + 99) - 244) + 187;
        llIIIllIII[276] = (-8257) & 11101;
        llIIIllIII[277] = (((((116 + 114) - 206) + 133) + (102 ^ 92)) - (((116 + 173) - 230) + 117)) + ((27 + 127) - 83) + 81;
        llIIIllIII[278] = (((220 ^ 150) + (((3 + 140) - 97) + 115)) - (((152 + 142) - 175) + 40)) + (212 ^ 160);
        llIIIllIII[279] = (((((87 + 123) - 152) + 75) + (3 ^ 67)) - (36 ^ 5)) + (146 ^ 143);
        llIIIllIII[280] = ((78 + 45) - 87) + 158;
        llIIIllIII[281] = ((115 + 10) - 55) + 125;
        llIIIllIII[282] = ((77 + 140) - 193) + 172;
        llIIIllIII[283] = ((58 + 18) - (-68)) + 53;
        llIIIllIII[284] = ((6 + 36) - 15) + 171;
        llIIIllIII[285] = ((174 + 169) - 220) + 76;
        llIIIllIII[286] = (((((83 + 22) - 39) + 121) + (((131 + 190) - 251) + 125)) - ((-16008) & 16319)) + ((23 + 25) - (-70)) + 12;
        llIIIllIII[287] = (((100 ^ 40) + (190 ^ 172)) - (27 ^ 82)) + ((165 + 46) - 134) + 103;
        llIIIllIII[288] = ((74 + 35) - 24) + 117;
        llIIIllIII[289] = ((65 + 41) - (-26)) + 71;
        llIIIllIII[290] = ((41 + 45) - (-23)) + 95;
        llIIIllIII[291] = (-1) & 3981;
        llIIIllIII[292] = (((((55 + 17) - 7) + 79) + " ".length()) - (49 ^ 94)) + ((136 + 151) - 240) + 124;
        llIIIllIII[293] = ((117 + 131) - 107) + 65;
        llIIIllIII[294] = -" ".length();
        llIIIllIII[295] = ((145 + 160) - 101) + 3;
        llIIIllIII[296] = ((102 + 42) - 37) + 101;
        llIIIllIII[297] = (((((1 + 25) - (-160)) + 9) + (((5 + 0) - (-24)) + 145)) - (((13 + 54) - (-99)) + 66)) + (25 ^ 81);
        llIIIllIII[298] = (((205 ^ 173) + (((26 + 96) - 109) + 164)) - (224 ^ 136)) + (63 ^ 22);
        llIIIllIII[299] = ((80 + 40) - 51) + 142;
        llIIIllIII[300] = (((((158 + 4) - 14) + 38) + (((4 + 19) - (-53)) + 64)) - (((22 + 120) - 3) + 62)) + (32 ^ 119);
        llIIIllIII[301] = ((14 + 8) - (-82)) + 109;
        llIIIllIII[302] = ((160 + 155) - 201) + 100;
        llIIIllIII[303] = ((52 + 32) - 81) + 212;
        llIIIllIII[304] = (((((179 + 192) - 291) + 116) + (85 ^ 82)) - (((97 + 38) - (-46)) + 3)) + ((33 + 162) - 66) + 68;
        llIIIllIII[305] = (-6369) & 7906;
        llIIIllIII[306] = (((144 ^ 175) + (247 ^ 129)) - (107 ^ 56)) + (117 ^ 2);
        llIIIllIII[307] = (((((57 + 57) - 109) + 188) + (90 ^ 58)) - (((49 + 134) - 103) + 59)) + (204 ^ 136);
        llIIIllIII[308] = ((139 + 171) - 133) + 42;
        llIIIllIII[309] = (-16407) & 17406;
        llIIIllIII[310] = (-((-22017) & 30550)) & (-4105) & 32637;
        llIIIllIII[311] = (-((-13886) & 15999)) & (-1025) & 28137;
        llIIIllIII[312] = (-28933) & 63932;
        llIIIllIII[313] = (-((-26765) & 31134)) & (-35) & 16383;
        llIIIllIII[314] = (-6179) & 7478;
        llIIIllIII[315] = ((43 + 212) - 150) + 115;
        llIIIllIII[316] = ((95 + 208) - 127) + 45;
        llIIIllIII[317] = (((239 ^ 191) + (83 ^ 86)) - (163 ^ 144)) + ((92 + 66) - 103) + 133;
        llIIIllIII[318] = (((222 ^ 156) + (169 ^ 152)) - (112 ^ 93)) + ((14 + 26) - (-29)) + 84;
        llIIIllIII[319] = ((138 + 34) - 111) + 163;
        llIIIllIII[320] = (((166 ^ 146) + (43 ^ 101)) - (-(236 ^ 184))) + (203 ^ 192);
        llIIIllIII[321] = (((((20 + 98) - 112) + 122) + (((18 + 83) - (-82)) + 37)) - ((-21637) & 21910)) + ((49 + 137) - 66) + 32;
        llIIIllIII[322] = ((35 + 196) - 228) + 224;
        llIIIllIII[323] = ((27 + 112) - (-38)) + 51;
        llIIIllIII[324] = ((" ".length() + (88 ^ 75)) - (-(((159 + 182) - 136) + 1))) + "   ".length();
        llIIIllIII[325] = ((135 + 181) - 119) + 33;
        llIIIllIII[326] = (((159 ^ 128) + (((179 + 221) - 213) + 36)) - (128 ^ 182)) + (62 ^ 33);
        llIIIllIII[327] = ((154 + 17) - 145) + 206;
        llIIIllIII[328] = (((67 ^ 11) + (89 ^ 74)) - (142 ^ 155)) + ((146 + 127) - 271) + 161;
        llIIIllIII[329] = ((111 + 108) - 103) + 118;
        llIIIllIII[330] = ((107 + 204) - 217) + 141;
        llIIIllIII[331] = ((226 + 232) - 377) + 155;
        llIIIllIII[332] = ((214 + 96) - 212) + 139;
        llIIIllIII[333] = ((8 + 67) - 67) + 230;
        llIIIllIII[334] = ((87 + 15) - 48) + 185;
        llIIIllIII[335] = ((176 + 206) - 208) + 66;
        llIIIllIII[336] = (((((8 + 21) - (-120)) + 14) + (((13 + 7) - (-104)) + 26)) - (((104 + 139) - 139) + 39)) + (107 ^ 44);
        llIIIllIII[337] = (((((78 + 20) - 34) + 99) + (70 ^ 93)) - (((134 + 25) - 71) + 71)) + ((154 + 185) - 329) + 201;
        llIIIllIII[338] = ((225 + 172) - 330) + 176;
        llIIIllIII[339] = ((51 + 43) - (-65)) + 85;
        llIIIllIII[340] = ((96 + 108) - 196) + 237;
        llIIIllIII[341] = (-((-585) & 29257)) & (-905) & 32767;
        llIIIllIII[342] = (-((-18961) & 27353)) & (-4117) & 15870;
        llIIIllIII[343] = (-((-21493) & 30711)) & (-4098) & 16383;
        llIIIllIII[344] = (-((-5157) & 29733)) & (-4674) & 32767;
        llIIIllIII[345] = (-17201) & 20410;
        llIIIllIII[346] = (-8546) & 11767;
        llIIIllIII[347] = (-20481) & 23526;
        llIIIllIII[348] = (-17001) & 20203;
        llIIIllIII[349] = (((((113 + 78) - 69) + 12) + (((58 + 132) - 131) + 153)) - (((101 + 120) - 152) + 71)) + (109 ^ 69);
        llIIIllIII[350] = ((219 + 126) - 284) + 186;
        llIIIllIII[351] = ((44 + 231) - 244) + 217;
        llIIIllIII[352] = ((204 + 4) - 134) + 175;
        llIIIllIII[353] = (((236 ^ 178) + (74 ^ 83)) - (-(7 ^ 107))) + (36 ^ 51);
        llIIIllIII[354] = ((95 + 133) - 190) + 213;
        llIIIllIII[355] = (((49 ^ 20) + (((93 + 51) - 74) + 77)) - (106 ^ 45)) + ((95 + 19) - 20) + 45;
        llIIIllIII[356] = ((112 + 231) - 93) + 3;
        llIIIllIII[357] = (((63 ^ 115) + (((38 + 27) - 5) + 80)) - (((98 + 63) - 141) + 126)) + ((82 + 53) - (-35)) + 14;
        llIIIllIII[358] = (((((115 + 64) - 85) + 61) + (95 ^ 39)) - (((3 + 200) - 77) + 78)) + ((170 + 181) - 254) + 87;
        llIIIllIII[359] = (-13983) & 14238;
        llIIIllIII[360] = (-13851) & 14107;
        llIIIllIII[361] = (-13922) & 14179;
        llIIIllIII[362] = (-3793) & 4051;
        llIIIllIII[363] = (-((-5193) & 31996)) & (-5697) & 32759;
        llIIIllIII[364] = (-15995) & 16255;
        llIIIllIII[365] = (-30266) & 30527;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIllIII[0];
    }

    private static boolean lIlIIllIlllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIllIllllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIllIIIIlI(String llllllllllllllllllIlIllIlIIllIIl, String llllllllllllllllllIlIllIlIIllIII) {
        try {
            SecretKeySpec llllllllllllllllllIlIllIlIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIllIlIIllIII.getBytes(StandardCharsets.UTF_8)), llIIIllIII[16]), "DES");
            Cipher llllllllllllllllllIlIllIlIIllIll = Cipher.getInstance("DES");
            llllllllllllllllllIlIllIlIIllIll.init(llIIIllIII[2], llllllllllllllllllIlIllIlIIlllII);
            return new String(llllllllllllllllllIlIllIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIllIlIIllIlI) {
            llllllllllllllllllIlIllIlIIllIlI.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            dD();
            "".length();
            if ("  ".length() == 0) {
                return (31 ^ 45) & ((64 ^ 114) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIllIII[142];
    }

    private static boolean lIlIIlllIIIII(Object obj) {
        return obj == null;
    }

    private static String lIlIIllIIIIll(String llllllllllllllllllIlIllIlIlllIll, String llllllllllllllllllIlIllIlIlllIlI) {
        String llllllllllllllllllIlIllIlIlllIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlIllIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIllIlIlllIIl = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIllIlIlllIlI.toCharArray();
        int llllllllllllllllllIlIllIlIllIIlI = llIIIllIII[0];
        char[] charArray2 = llllllllllllllllllIlIllIlIlllIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIllIII[0];
        while (lIlIIllIIllll(i, length)) {
            char llllllllllllllllllIlIllIlIllllII = charArray2[i];
            llllllllllllllllllIlIllIlIlllIIl.append((char) (llllllllllllllllllIlIllIlIllllII ^ charArray[llllllllllllllllllIlIllIlIllIIlI % charArray.length]));
            "".length();
            llllllllllllllllllIlIllIlIllIIlI++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlIllIlIlllIIl);
    }
}
