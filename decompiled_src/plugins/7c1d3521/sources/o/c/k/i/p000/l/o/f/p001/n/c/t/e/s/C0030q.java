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
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/q.class */
public class C0030q {
    static /* synthetic */ int cY;
    private static /* synthetic */ String[] llIIlIIIlI;
    static /* synthetic */ WorldPoint cU;
    static /* synthetic */ WorldArea cT;
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] llIIlIIIll;
    private static /* synthetic */ int[] cZ;
    static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ boolean cJ;
    static /* synthetic */ int cX;
    static /* synthetic */ WorldPoint cS;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ int cW;

    private static boolean lIlIlIIlIllIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIIIlllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0155, code lost:
        if (lIlIlIIIllIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0406, code lost:
        if (lIlIlIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0030q.llIIlIIIll[126(0x7e, float:1.77E-43)]) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(String str) {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIlIIlIIlIl(nearest) && lIlIlIIIllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[118]];
            C0000a.a(nearest);
        }
        if (lIlIlIIlIIlIl(nearest) && lIlIlIIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[119]];
            if (lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIlIIIll[120]);
                "".length();
                Time.sleepTicks(C0018e.c(llIIlIIIll[5], llIIlIIIll[8]));
                "".length();
            }
            if (lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (lIlIlIIlIlIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIlIIIll[5]);
                    "".length();
                }
                if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[121]]) ? 1 : 0)) {
                    if (lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        C0021h.X();
                    }
                    int[] iArr = new int[llIIlIIIll[0]];
                    iArr[llIIlIIIll[3]] = llIIlIIIll[102];
                    if (lIlIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIIlIIIll[0]];
                        iArr2[llIIlIIIll[3]] = llIIlIIIll[102];
                        if (lIlIlIIIllIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIIlIIIll[0]];
                            iArr3[llIIlIIIll[3]] = llIIlIIIll[101];
                            if (lIlIlIIIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIIlIIIll[0]];
                                iArr4[llIIlIIIll[3]] = llIIlIIIll[122];
                            }
                            h(llIIlIIIlI[llIIlIIIll[123]]);
                            System.out.println(llIIlIIIlI[llIIlIIIll[124]]);
                            bt = llIIlIIIll[0];
                            return;
                        }
                    }
                    int[] iArr5 = new int[llIIlIIIll[0]];
                    iArr5[llIIlIIIll[3]] = llIIlIIIll[102];
                    if (lIlIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIlIIIll[0]];
                        iArr6[llIIlIIIll[3]] = llIIlIIIll[102];
                        if (lIlIlIIIllIlI(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llIIlIIIll[0]];
                            iArr7[llIIlIIIll[3]] = llIIlIIIll[101];
                            if (lIlIlIIIllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIIlIIIll[0]];
                                iArr8[llIIlIIIll[3]] = llIIlIIIll[122];
                                if (lIlIlIIIllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                                    do {
                                        int[] iArr9 = new int[llIIlIIIll[0]];
                                        iArr9[llIIlIIIll[3]] = llIIlIIIll[102];
                                        if (lIlIlIIIllIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[125]];
                                            int[] iArr10 = new int[llIIlIIIll[0]];
                                            iArr10[llIIlIIIll[3]] = llIIlIIIll[101];
                                            if (lIlIlIIIllIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                                                C0000a.a(llIIlIIIll[101], llIIlIIIll[0]);
                                            }
                                            int[] iArr11 = new int[llIIlIIIll[0]];
                                            iArr11[llIIlIIIll[3]] = llIIlIIIll[122];
                                            if (lIlIlIIIllIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                                                C0000a.a(llIIlIIIll[122], llIIlIIIll[0]);
                                            }
                                            int[] iArr12 = new int[llIIlIIIll[0]];
                                            iArr12[llIIlIIIll[3]] = llIIlIIIll[101];
                                            if (lIlIlIIIllIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                                int[] iArr13 = new int[llIIlIIIll[0]];
                                                iArr13[llIIlIIIll[3]] = llIIlIIIll[122];
                                                if (lIlIlIIIllIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                                                    int[] iArr14 = new int[llIIlIIIll[0]];
                                                    iArr14[llIIlIIIll[3]] = llIIlIIIll[101];
                                                    Item first = Inventory.getFirst(iArr14);
                                                    int[] iArr15 = new int[llIIlIIIll[0]];
                                                    iArr15[llIIlIIIll[3]] = llIIlIIIll[122];
                                                    first.useOn(Inventory.getFirst(iArr15));
                                                    Time.sleepTicks(llIIlIIIll[4]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                int[] iArr16 = new int[llIIlIIIll[0]];
                                                iArr16[llIIlIIIll[3]] = llIIlIIIll[102];
                                                if (lIlIlIIIllIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                                    C0000a.a(llIIlIIIll[102], llIIlIIIll[0]);
                                                }
                                            }
                                            int[] iArr17 = new int[llIIlIIIll[0]];
                                            iArr17[llIIlIIIll[3]] = llIIlIIIll[102];
                                            if (lIlIlIIIllIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                                                if (lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                                    C0000a.a();
                                                    Time.sleepTicks(llIIlIIIll[9]);
                                                    "".length();
                                                }
                                                if (lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                    Bank.depositInventory();
                                                    Time.sleepTicks(llIIlIIIll[5]);
                                                    "".length();
                                                    "".length();
                                                    if ("  ".length() == " ".length()) {
                                                        return;
                                                    }
                                                }
                                            }
                                            Time.sleepTicks(llIIlIIIll[0]);
                                            "".length();
                                            "".length();
                                        }
                                    } while (((80 ^ 97) & ((3 ^ 50) ^ (-1))) <= 0);
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr18 = new int[llIIlIIIll[0]];
                    iArr18[llIIlIIIll[3]] = llIIlIIIll[92];
                    if (lIlIlIIIllIIl(Bank.contains(iArr18) ? 1 : 0)) {
                        int[] iArr19 = new int[llIIlIIIll[0]];
                        iArr19[llIIlIIIll[3]] = llIIlIIIll[92];
                        if (lIlIlIIIllIIl(Bank.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[llIIlIIIll[0]];
                            iArr20[llIIlIIIll[3]] = llIIlIIIll[92];
                        }
                    }
                    int[] iArr21 = new int[llIIlIIIll[0]];
                    iArr21[llIIlIIIll[3]] = llIIlIIIll[92];
                    if (lIlIlIIIllIlI(Equipment.contains(iArr21) ? 1 : 0)) {
                        h(llIIlIIIlI[llIIlIIIll[127]]);
                        System.out.println(llIIlIIIlI[llIIlIIIll[128]]);
                        bt = llIIlIIIll[0];
                        return;
                    }
                }
                if (lIlIlIIIllIlI(cJ ? 1 : 0)) {
                    C0021h.X();
                    cJ = llIIlIIIll[0];
                }
                while (lIlIlIIIllIlI(C0021h.bu ? 1 : 0) && lIlIlIIIllIlI(AccBuilderSotf.d ? 1 : 0)) {
                    if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[129]]) ? 1 : 0)) {
                        C0021h.d(llIIlIIIlI[llIIlIIIll[130]]);
                    }
                    if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[131]]) ? 1 : 0)) {
                        C0021h.d(llIIlIIIlI[llIIlIIIll[132]]);
                    }
                    Time.sleepTicks(llIIlIIIll[0]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
                if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[133]]) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIlIIIll[0]];
                    iArr22[llIIlIIIll[3]] = llIIlIIIll[92];
                    if (lIlIlIIIllIIl(Bank.contains(iArr22) ? 1 : 0)) {
                        Bank.withdrawAll(llIIlIIIll[92], Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(llIIlIIIll[4]);
                        "".length();
                        int[] iArr23 = new int[llIIlIIIll[0]];
                        iArr23[llIIlIIIll[3]] = llIIlIIIll[92];
                        if (lIlIlIIIllIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[llIIlIIIll[0]];
                            iArr24[llIIlIIIll[3]] = llIIlIIIll[92];
                            Inventory.getFirst(iArr24).interact(llIIlIIIlI[llIIlIIIll[134]]);
                            Time.sleepTicks(llIIlIIIll[0]);
                            "".length();
                        }
                        if (lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIlIIIll[9]);
                            "".length();
                        }
                    }
                }
                if (lIlIlIIIllIlI(an() ? 1 : 0) && (!lIlIlIIIllIlI(f(llIIlIIIlI[llIIlIIIll[135]]) ? 1 : 0) || lIlIlIIIllIIl(f(llIIlIIIlI[llIIlIIIll[136]]) ? 1 : 0))) {
                    h(llIIlIIIlI[llIIlIIIll[137]]);
                    System.out.println(llIIlIIIlI[llIIlIIIll[138]]);
                    bt = llIIlIIIll[0];
                } else if (lIlIlIIIllIIl(an() ? 1 : 0)) {
                    if (!lIlIlIIIllIlI(f(llIIlIIIlI[llIIlIIIll[139]]) ? 1 : 0) || lIlIlIIIllIIl(f(llIIlIIIlI[llIIlIIIll[140]]) ? 1 : 0)) {
                        while (lIlIlIIIllIlI(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a(llIIlIIIll[16], llIIlIIIll[141]);
                                C0000a.b(C0019f.ba, llIIlIIIll[4]);
                                Bank.withdraw(item -> {
                                    return item.getName().contains(llIIlIIIlI[llIIlIIIll[199]]);
                                }, llIIlIIIll[0], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIIlIIIll[0]);
                                "".length();
                            }
                            if (lIlIlIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                            }
                            if (lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cU), llIIlIIIll[8])) {
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[142]];
                                Movement.walkTo(cU);
                                "".length();
                                Time.sleepTicks(llIIlIIIll[0]);
                                "".length();
                            }
                            Time.sleepTicks(llIIlIIIll[0]);
                            "".length();
                            "".length();
                            if ((-" ".length()) != (-" ".length())) {
                                return;
                            }
                        }
                        if (lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[143]];
                            if (lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, llIIlIIIll[120]);
                                "".length();
                                Time.sleepTicks(C0018e.c(llIIlIIIll[5], llIIlIIIll[8]));
                                "".length();
                            }
                            if (lIlIlIIlIlIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIIlIIIll[5]);
                                "".length();
                            }
                            if (lIlIlIIIlllII(Vars.getBit(llIIlIIIll[58]), llIIlIIIll[15])) {
                                C0000a.a(llIIlIIIll[16], llIIlIIIll[144]);
                            }
                            if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[145]]) ? 1 : 0)) {
                                Bank.withdrawAll(llIIlIIIll[92], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(llIIlIIIll[4]);
                                "".length();
                            }
                            int[] iArr25 = new int[llIIlIIIll[0]];
                            iArr25[llIIlIIIll[3]] = llIIlIIIll[92];
                            if (lIlIlIIIllIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                                C0018e.l(llIIlIIIll[92]);
                                if (lIlIlIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                                    C0000a.a();
                                    Time.sleepTicks(llIIlIIIll[9]);
                                    "".length();
                                }
                            }
                            C0000a.a(llIIlIIIll[146], llIIlIIIll[27]);
                            C0000a.a(llIIlIIIll[147], llIIlIIIll[13]);
                            C0000a.a(llIIlIIIll[148], llIIlIIIll[13]);
                            C0000a.a(llIIlIIIll[149], llIIlIIIll[13]);
                            C0000a.a(llIIlIIIll[150], llIIlIIIll[13]);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIlIIIll[0]];
        iArr[llIIlIIIll[3]] = llIIlIIIll[146];
        if (lIlIlIIIllIIl(Bank.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIIIll[0]];
            iArr2[llIIlIIIll[3]] = llIIlIIIll[151];
            if (lIlIlIIIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIIIll[0]];
                iArr3[llIIlIIIll[3]] = llIIlIIIll[152];
                if (lIlIlIIIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlIIIll[0]];
                    iArr4[llIIlIIIll[3]] = llIIlIIIll[153];
                    if (lIlIlIIIllIIl(Bank.contains(iArr4) ? 1 : 0) && lIlIlIIIllIIl(Bank.contains(item -> {
                        return item.getName().contains(llIIlIIIlI[llIIlIIIll[198]]);
                    }) ? 1 : 0)) {
                        ?? r0 = llIIlIIIll[0];
                        "".length();
                        return ((((66 + 78) - 93) + 89) ^ (((124 + 55) - 63) + 21)) <= 0 ? ("   ".length() ^ (62 ^ 104)) & (((57 ^ 48) ^ (6 ^ 90)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return llIIlIIIll[3];
    }

    private static boolean lIlIlIIlIIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlIIIlIIlI(String llllllllllllllllllIlIIllIllllIlI, String llllllllllllllllllIlIIllIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIllIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIllIlllllII.init(llIIlIIIll[4], secretKeySpec);
            return new String(llllllllllllllllllIlIIllIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIllIllllIll) {
            llllllllllllllllllIlIIllIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlIIlIIllI(int i, int i2) {
        return i > i2;
    }

    private static void lIlIlIIIlIlIl() {
        llIIlIIIlI = new String[llIIlIIIll[216]];
        llIIlIIIlI[llIIlIIIll[3]] = lIlIlIIIlIIlI("l7RpQGK6b4oIh8itsDLhfg==", "HclLV");
        llIIlIIIlI[llIIlIIIll[0]] = lIlIlIIIlIIlI("e4pBbYA+F/sCyvaI2wTK8A94+3lvnyLc+SGagcHVgY1u1mGZ+u6OCU+TfNfz5uKX9Ul73MVnJsU=", "SkPxb");
        llIIlIIIlI[llIIlIIIll[4]] = lIlIlIIIlIIlI("iIV7gO6nSVI=", "wZnDr");
        llIIlIIIlI[llIIlIIIll[5]] = lIlIlIIIlIIlI("MDtSAa+rQ132Mr3I4NseTw==", "YIMOy");
        llIIlIIIlI[llIIlIIIll[7]] = lIlIlIIIlIIlI("jNshQqs18RQ=", "wbygN");
        llIIlIIIlI[llIIlIIIll[8]] = lIlIlIIIlIIll("MvYKjg8J5aZUvQItKGjuAFpcSaBIpQSH", "pbkTu");
        llIIlIIIlI[llIIlIIIll[9]] = lIlIlIIIlIIlI("VNhdjiMNMHs=", "nCMAS");
        llIIlIIIlI[llIIlIIIll[10]] = lIlIlIIIlIIll("VBiM9OfN4i8=", "ZOKPB");
        llIIlIIIlI[llIIlIIIll[11]] = lIlIlIIIlIlII("OCgYHAg=", "UMtym");
        llIIlIIIlI[llIIlIIIll[12]] = lIlIlIIIlIIlI("iUHzPFoA+JE=", "aIpCT");
        llIIlIIIlI[llIIlIIIll[13]] = lIlIlIIIlIIlI("Hdol7mJNNBk=", "vzvzy");
        llIIlIIIlI[llIIlIIIll[14]] = lIlIlIIIlIlII("EQsfNi8=", "cjqQJ");
        llIIlIIIlI[llIIlIIIll[17]] = lIlIlIIIlIlII("JSYFABYIZwgLHAsiGQ==", "mGkdz");
        llIIlIIIlI[llIIlIIIll[18]] = lIlIlIIIlIIll("zm1QtbLERTi0yPeSJ7YkBgedeXebC3ty", "ReWAn");
        llIIlIIIlI[llIIlIIIll[19]] = lIlIlIIIlIlII("Gjc/OAgk", "OYSWk");
        llIIlIIIlI[llIIlIIIll[20]] = lIlIlIIIlIIll("VAMlwdn+0E3ehAw08Xg4KAzrXCVd5JCA", "smPGX");
        llIIlIIIlI[llIIlIIIll[21]] = lIlIlIIIlIIlI("fBONHR+RwR0=", "mePKB");
        llIIlIIIlI[llIIlIIIll[22]] = lIlIlIIIlIIll("FxulH9Qk2DK7IjUQzSl4ahRW0JXrxW6f", "mtSaT");
        llIIlIIIlI[llIIlIIIll[23]] = lIlIlIIIlIlII("Oxcg", "ndEdp");
        llIIlIIIlI[llIIlIIIll[24]] = lIlIlIIIlIIlI("duuT2Yc5ujGWyEfbOajJ2Q==", "vfmQw");
        llIIlIIIlI[llIIlIIIll[27]] = lIlIlIIIlIlII("LxkOQiQOWBYPKkELDAMiFQ==", "axxbP");
        llIIlIIIlI[llIIlIIIll[29]] = lIlIlIIIlIIlI("V0Jp62+qmdOrFQXphckFTg==", "mOEDq");
        llIIlIIIlI[llIIlIIIll[30]] = lIlIlIIIlIIll("HZHKwbbRpTjJ4X5OxAoKwA==", "qeHXj");
        llIIlIIIlI[llIIlIIIll[31]] = lIlIlIIIlIIlI("/0/A8vt4t4k=", "LgQOa");
        llIIlIIIlI[llIIlIIIll[32]] = lIlIlIIIlIIlI("x1NSN3AsNb0=", "yzmAN");
        llIIlIIIlI[llIIlIIIll[33]] = lIlIlIIIlIlII("CAY7Z1Z6", "JsBJc");
        llIIlIIIlI[llIIlIIIll[34]] = lIlIlIIIlIIll("FDURX5vzjw0=", "flVAZ");
        llIIlIIIlI[llIIlIIIll[35]] = lIlIlIIIlIIll("f0/FV1e5lotiE/pB80fEMg==", "SunvT");
        llIIlIIIlI[llIIlIIIll[36]] = lIlIlIIIlIIll("UNP7s9BLv1Fpt18TJC6GXkFRUfaI8nvI", "RrPnH");
        llIIlIIIlI[llIIlIIIll[37]] = lIlIlIIIlIlII("Nhw2GxkWCzdJBRYeOgYb", "yjSiu");
        llIIlIIIlI[llIIlIIIll[15]] = lIlIlIIIlIlII("FhEGIQ==", "BpmDW");
        llIIlIIIlI[llIIlIIIll[40]] = lIlIlIIIlIIll("JSkF5iHBSa73C/gebsyuiw==", "SCYgm");
        llIIlIIIlI[llIIlIIIll[41]] = lIlIlIIIlIIlI("5E8nJCfw/21YwFlSdaARM1HmRqUpXdCX", "syVSD");
        llIIlIIIlI[llIIlIIIll[42]] = lIlIlIIIlIIll("rFWujULsfnQ=", "dpRgS");
        llIIlIIIlI[llIIlIIIll[43]] = lIlIlIIIlIlII("MwQnOjgeCG0gdhQELDUzBQ==", "wkJSV");
        llIIlIIIlI[llIIlIIIll[44]] = lIlIlIIIlIIll("y/aZaY5QNOo=", "hbELW");
        llIIlIIIlI[llIIlIIIll[45]] = lIlIlIIIlIIlI("Nl56wrmNfJrZkwV3G1Symge5knlEMe4y", "OabuT");
        llIIlIIIlI[llIIlIIIll[46]] = lIlIlIIIlIIlI("jAD6QQn9+Zw=", "OPmhc");
        llIIlIIIlI[llIIlIIIll[47]] = lIlIlIIIlIlII("KSYiJRAEN3InDAMmK2Q=", "mCRJc");
        llIIlIIIlI[llIIlIIIll[49]] = lIlIlIIIlIIll("uSOVGeakMYmuRpdftoJV1g==", "rFyNN");
        llIIlIIIlI[llIIlIIIll[50]] = lIlIlIIIlIIll("/1J3VPlxcbYOw+jQTxaPmg==", "pPzue");
        llIIlIIIlI[llIIlIIIll[51]] = lIlIlIIIlIlII("IgseIgUPB1MEBQ8LHQ==", "fdsKk");
        llIIlIIIlI[llIIlIIIll[52]] = lIlIlIIIlIlII("HDAOETU=", "XBkpX");
        llIIlIIIlI[llIIlIIIll[53]] = lIlIlIIIlIIlI("0ocjINdueiXkT/sLSXXrzA==", "NopJq");
        llIIlIIIlI[llIIlIIIll[54]] = lIlIlIIIlIIll("3zjDhpC76h8=", "QMUtQ");
        llIIlIIIlI[llIIlIIIll[55]] = lIlIlIIIlIlII("ORw0CR8O", "kiYks");
        llIIlIIIlI[llIIlIIIll[56]] = lIlIlIIIlIIlI("ckMRDYYdBXFCEoZ+CbyHKjWMWIH5ECT1", "qgsVd");
        llIIlIIIlI[llIIlIIIll[57]] = lIlIlIIIlIIll("SZFW5jn2iuQ=", "kvuuN");
        llIIlIIIlI[llIIlIIIll[60]] = lIlIlIIIlIIll("cqjj/19bwyM=", "VbPlY");
        llIIlIIIlI[llIIlIIIll[61]] = lIlIlIIIlIlII("BSUfBB0=", "AWvjv");
        llIIlIIIlI[llIIlIIIll[62]] = lIlIlIIIlIIll("wqHmqx63RFsWzO12WubJD51v70fwR0/E", "YkCjB");
        llIIlIIIlI[llIIlIIIll[65]] = lIlIlIIIlIIll("bgBTgjnknWjas+GON2SCQQ==", "UhUlA");
        llIIlIIIlI[llIIlIIIll[66]] = lIlIlIIIlIIll("ENIek3IhOXiDbJEKc5PgZQ==", "LEkVW");
        llIIlIIIlI[llIIlIIIll[67]] = lIlIlIIIlIIll("3lxuvCnbb/M=", "kpPmI");
        llIIlIIIlI[llIIlIIIll[68]] = lIlIlIIIlIIlI("rg5X/3xWiWBpEmi1ejhIuA==", "dnoVS");
        llIIlIIIlI[llIIlIIIll[69]] = lIlIlIIIlIlII("GD8LCTgpcBgcMSlwHx49PjkY", "LPlnT");
        llIIlIIIlI[llIIlIIIll[70]] = lIlIlIIIlIlII("PAMQKR4N", "hlwNr");
        llIIlIIIlI[llIIlIIIll[71]] = lIlIlIIIlIIll("IjSFgwSlZ008WsI3Q/xQMg==", "DuCTo");
        llIIlIIIlI[llIIlIIIll[72]] = lIlIlIIIlIIlI("2jWUhwx2uAdBvbYKMjf1cg==", "OwuAt");
        llIIlIIIlI[llIIlIIIll[73]] = lIlIlIIIlIIll("KB4utpnr2Lo=", "JjdVD");
        llIIlIIIlI[llIIlIIIll[74]] = lIlIlIIIlIlII("CwAzJSBsJiAuIQ==", "LrRKD");
        llIIlIIIlI[llIIlIIIll[75]] = lIlIlIIIlIlII("MDggCQABdyUCDQc8ZwoJCTgp", "dWGnl");
        llIIlIIIlI[llIIlIIIll[76]] = lIlIlIIIlIIlI("2Ic6oVaxKfw=", "KRlCU");
        llIIlIIIlI[llIIlIIIll[77]] = lIlIlIIIlIIll("ZwDAE+K/aOhjmcLF5AfXq0Iw/ph+mt0i", "MLXmD");
        llIIlIIIlI[llIIlIIIll[78]] = lIlIlIIIlIIll("GrSOP25PrFTu2Ph3Jk2hLd1VK2cX5Xs2", "ChlEd");
        llIIlIIIlI[llIIlIIIll[79]] = lIlIlIIIlIIlI("8aRlAWY2dIc=", "tMWiE");
        llIIlIIIlI[llIIlIIIll[80]] = lIlIlIIIlIIll("QMwe8Js+IaAzESl95J0/tw==", "sXwcy");
        llIIlIIIlI[llIIlIIIll[81]] = lIlIlIIIlIlII("JSkaBB0IJVciHQgpGQ==", "aFwms");
        llIIlIIIlI[llIIlIIIll[82]] = lIlIlIIIlIIll("PaOn6jrCgvb36BopJpxOnw==", "CxYtR");
        llIIlIIIlI[llIIlIIIll[83]] = lIlIlIIIlIIll("Ze57wSnzQ+xKtVLWOUiCMA==", "vyXvb");
        llIIlIIIlI[llIIlIIIll[84]] = lIlIlIIIlIIlI("5J6wC8cgrmpIZP/BKd1NhA==", "WcgGG");
        llIIlIIIlI[llIIlIIIll[85]] = lIlIlIIIlIIlI("HmdaL26DkOS2vC8D2EHBjQ==", "ccIKH");
        llIIlIIIlI[llIIlIIIll[86]] = lIlIlIIIlIIll("2FF/A0ctJBI=", "cElou");
        llIIlIIIlI[llIIlIIIll[87]] = lIlIlIIIlIIlI("5eNrFGAUvzo=", "EBYqB");
        llIIlIIIlI[llIIlIIIll[88]] = lIlIlIIIlIIlI("F6Uo5Uy/rRQ=", "RnHTY");
        llIIlIIIlI[llIIlIIIll[89]] = lIlIlIIIlIIlI("ODev1/EsHhBFwxCM9P1wFw==", "cCPos");
        llIIlIIIlI[llIIlIIIll[90]] = lIlIlIIIlIIll("U+fwnpu/HhtD0F4O5DwdIg==", "RrlML");
        llIIlIIIlI[llIIlIIIll[91]] = lIlIlIIIlIIlI("aHy47/xvWy7Vn6gjpkDYMw==", "olEoz");
        llIIlIIIlI[llIIlIIIll[93]] = lIlIlIIIlIIlI("RH+sLfp8dfU=", "ZgpNG");
        llIIlIIIlI[llIIlIIIll[94]] = lIlIlIIIlIlII("Pjg4EQ==", "PWVtr");
        llIIlIIIlI[llIIlIIIll[95]] = lIlIlIIIlIIlI("PkQpD6f0zFg=", "QssgK");
        llIIlIIIlI[llIIlIIIll[110]] = lIlIlIIIlIlII("BRMqPRM=", "hvFXv");
        llIIlIIIlI[llIIlIIIll[118]] = lIlIlIIIlIIll("OkTp6DTbg+53y7JJoL8CrGKv90IXWeND", "AQTrA");
        llIIlIIIlI[llIIlIIIll[119]] = lIlIlIIIlIIlI("Za3tTMoCu07LqwST1Jv9/m87wvVijF1Z", "rEmyH");
        llIIlIIIlI[llIIlIIIll[121]] = lIlIlIIIlIlII("GCAKAiQ=", "jAdeA");
        llIIlIIIlI[llIIlIIIll[123]] = lIlIlIIIlIlII("AgUKAQY=", "pddfc");
        llIIlIIIlI[llIIlIIIll[124]] = lIlIlIIIlIlII("MT1qLRgDeCclGRUxJCtKCzktJQlGKyIjGBJ4I2BKFS8jOAkOMSQrShI3ag4/PxEECw==", "fXJLj");
        llIIlIIIlI[llIIlIIIll[125]] = lIlIlIIIlIlII("DiUlHgUkZAMkKWNsJ14=", "CDNwk");
        llIIlIIIlI[llIIlIIIll[127]] = lIlIlIIIlIlII("JDUjBTA=", "VTMbU");
        llIIlIIIlI[llIIlIIIll[128]] = lIlIlIIIlIIll("w0qzQwuSl9O2Hk1nvTfEhoBoxoiVuRzjJ77cFgp29QnqZ9lVSJqQUG6TXRoUbQOq", "vNtml");
        llIIlIIIlI[llIIlIIIll[129]] = lIlIlIIIlIIll("HKUK1ErlB9k=", "ASjFg");
        llIIlIIIlI[llIIlIIIll[130]] = lIlIlIIIlIIll("+HbSzglQ7+lsp+QKxRuE+A==", "Iaxbd");
        llIIlIIIlI[llIIlIIIll[131]] = lIlIlIIIlIlII("NBAlHxA=", "FqKxu");
        llIIlIIIlI[llIIlIIIll[132]] = lIlIlIIIlIIll("deoeQe2r/0x/FY+8wuunJQ==", "HHXCZ");
        llIIlIIIlI[llIIlIIIll[133]] = lIlIlIIIlIIll("AkowJmQY1KQ=", "glgqF");
        llIIlIIIlI[llIIlIIIll[134]] = lIlIlIIIlIIlI("LMP6Y8aY0wQ=", "lMOfj");
        llIIlIIIlI[llIIlIIIll[135]] = lIlIlIIIlIIll("0Rt6L5kKhsc=", "KhZRr");
        llIIlIIIlI[llIIlIIIll[136]] = lIlIlIIIlIIlI("wMNfX7lgMN8=", "IpOao");
        llIIlIIIlI[llIIlIIIll[137]] = lIlIlIIIlIlII("BDo5JhkeKjo=", "wOIVu");
        llIIlIIIlI[llIIlIIIll[138]] = lIlIlIIIlIIlI("cl+c2qBTEIjAWJtViQvFyhHBezDtMwYoxke26E9dLXj/PCgVl0dHbvj+PNl48rWu", "Mibeh");
        llIIlIIIlI[llIIlIIIll[139]] = lIlIlIIIlIlII("KD0nHRc=", "EXKxr");
        llIIlIIIlI[llIIlIIIll[140]] = lIlIlIIIlIIll("6GiMgY2ooK8=", "obdTS");
        llIIlIIIlI[llIIlIIIll[142]] = lIlIlIIIlIIll("wcIJb9WEmPqQhfDhcZN7Tg==", "HYwtH");
        llIIlIIIlI[llIIlIIIll[143]] = lIlIlIIIlIIll("rTR+83FWKH9Bdhlj/LLw1ZXbUK5LhAZy", "orAdE");
        llIIlIIIlI[llIIlIIIll[145]] = lIlIlIIIlIIlI("iwIt+OKKW+U=", "SvonI");
        llIIlIIIlI[llIIlIIIll[154]] = lIlIlIIIlIlII("HD88Ayo=", "XMUmA");
        llIIlIIIlI[llIIlIIIll[155]] = lIlIlIIIlIlII("ERYfFjg=", "UdvxS");
        llIIlIIIlI[llIIlIIIll[158]] = lIlIlIIIlIIll("tK3TkyA4HVI=", "bwmuA");
        llIIlIIIlI[llIIlIIIll[159]] = lIlIlIIIlIlII("KCQ1ESIJPXQROw84dAA1BzY=", "lSTcT");
        llIIlIIIlI[llIIlIIIll[160]] = lIlIlIIIlIIll("6s6j4iTOxcU=", "FQifU");
        llIIlIIIlI[llIIlIIIll[161]] = lIlIlIIIlIIlI("ZNLN3EMHj1d/2nsT7a1syw==", "CfcJr");
        llIIlIIIlI[llIIlIIIll[167]] = lIlIlIIIlIIll("WCqdvqz80BY=", "dxCDx");
        llIIlIIIlI[llIIlIIIll[184]] = lIlIlIIIlIlII("GysEDQ0=", "iJjjh");
        llIIlIIIlI[llIIlIIIll[195]] = lIlIlIIIlIIll("XV1k0gmevYX3V/OMbbXfNw==", "qhAgU");
        llIIlIIIlI[llIIlIIIll[196]] = lIlIlIIIlIlII("CBcLEyAoAAo=", "GanaL");
        llIIlIIIlI[llIIlIIIll[197]] = lIlIlIIIlIlII("AA0wDjMxGyoOLw==", "AoCaA");
        llIIlIIIlI[llIIlIIIll[198]] = lIlIlIIIlIIlI("DG0XgmYJWNQ=", "wOwSo");
        llIIlIIIlI[llIIlIIIll[199]] = lIlIlIIIlIIlI("VXgHjWeYrfk=", "kpsIc");
        llIIlIIIlI[llIIlIIIll[200]] = lIlIlIIIlIIll("p/Nx+ejRgDI=", "Agtbe");
        llIIlIIIlI[llIIlIIIll[201]] = lIlIlIIIlIIlI("j2ON45LqY/A=", "HdRCa");
        llIIlIIIlI[llIIlIIIll[162]] = lIlIlIIIlIIlI("rQrhHPHfvs0d0ZvpU3aLPA==", "GRTjH");
        llIIlIIIlI[llIIlIIIll[202]] = lIlIlIIIlIIll("03+EsS1CejE=", "DmzfA");
        llIIlIIIlI[llIIlIIIll[203]] = lIlIlIIIlIIlI("vXEz5gbeOaJ0rjndoopYyA==", "OuMZR");
        llIIlIIIlI[llIIlIIIll[204]] = lIlIlIIIlIlII("NgYWGidUDhIUIxo=", "tjwyL");
        llIIlIIIlI[llIIlIIIll[205]] = lIlIlIIIlIIll("JBuiwjf02k4=", "znaIA");
        llIIlIIIlI[llIIlIIIll[206]] = lIlIlIIIlIlII("HhoSGyw8", "NhsbI");
        llIIlIIIlI[llIIlIIIll[208]] = lIlIlIIIlIIll("tfi1b3JXtOxI+W5LqjsaiQ==", "tTARR");
    }

    private static String lIlIlIIIlIIll(String llllllllllllllllllIlIIlllIIlllll, String llllllllllllllllllIlIIlllIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIIlllIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlllIIllllI.getBytes(StandardCharsets.UTF_8)), llIIlIIIll[11]), "DES");
            Cipher llllllllllllllllllIlIIlllIlIIIIl = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlllIlIIIIl.init(llIIlIIIll[4], llllllllllllllllllIlIIlllIlIIIlI);
            return new String(llllllllllllllllllIlIIlllIlIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIlllIlIIIII) {
            llllllllllllllllllIlIIlllIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIIIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIlIlIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v647, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v86, types: [boolean] */
    public static void e(String str) {
        C0018e.t();
        if (lIlIlIIIllIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[3]];
            C0015b.a(bv);
            if (lIlIlIIIlllII(bv.size(), llIIlIIIll[0])) {
                System.out.println(llIIlIIIlI[llIIlIIIll[0]]);
                bt = llIIlIIIll[3];
            }
        }
        if (lIlIlIIIllIlI(bt ? 1 : 0)) {
            if (lIlIlIIIllIlI(f(str) ? 1 : 0) && lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                String[] strArr = new String[llIIlIIIll[0]];
                strArr[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[4]];
                if (lIlIlIIlIIlIl(TileObjects.getNearest(strArr))) {
                    if (lIlIlIIIllIIl(Equipment.contains(C0019f.aS) ? 1 : 0)) {
                        Equipment.getFirst(C0019f.aS).interact(llIIlIIIlI[llIIlIIIll[5]]);
                        Time.sleepUntil(() -> {
                            int[] iArr = new int[llIIlIIIll[0]];
                            iArr[llIIlIIIll[3]] = llIIlIIIll[207];
                            if (lIlIlIIlIlIII(TileObjects.getNearest(iArr))) {
                                ?? r0 = llIIlIIIll[0];
                                "".length();
                                return "  ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIlIIIll[3];
                        }, llIIlIIIll[6]);
                        "".length();
                    }
                    if (lIlIlIIIllIlI(Equipment.contains(C0019f.aS) ? 1 : 0) && lIlIlIIIllIIl(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aS).interact(llIIlIIIlI[llIIlIIIll[7]]);
                    }
                }
                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[8]];
                String[] strArr2 = new String[llIIlIIIll[0]];
                strArr2[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[9]];
                TileObjects.getNearest(strArr2).interact(llIIlIIIlI[llIIlIIIll[10]]);
                Time.sleepTicks(llIIlIIIll[7]);
                "".length();
            }
            if ((!lIlIlIIIllIIl(f(str) ? 1 : 0) || lIlIlIIIllIlI(Inventory.contains(item -> {
                if (lIlIlIIIllIIl(item.getName().contains(llIIlIIIlI[llIIlIIIll[206]]) ? 1 : 0) && lIlIlIIIllIlI(item.isNoted() ? 1 : 0)) {
                    ?? r0 = llIIlIIIll[0];
                    "".length();
                    return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                }
                return llIIlIIIll[3];
            }) ? 1 : 0)) && lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[11]]) ? 1 : 0)) {
                    g(llIIlIIIlI[llIIlIIIll[12]]);
                }
                if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[13]]) ? 1 : 0)) {
                    g(llIIlIIIlI[llIIlIIIll[14]]);
                }
            }
            if (lIlIlIIIllIIl(f(str) ? 1 : 0) && lIlIlIIIlllII(Vars.getBit(cX), llIIlIIIll[15]) && lIlIlIIIllIIl(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr = new int[llIIlIIIll[0]];
                iArr[llIIlIIIll[3]] = llIIlIIIll[16];
                if (lIlIlIIIllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    g(str);
                }
                int[] iArr2 = new int[llIIlIIIll[0]];
                iArr2[llIIlIIIll[3]] = llIIlIIIll[16];
                if (lIlIlIIIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[17]];
                    if (lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr3 = new String[llIIlIIIll[0]];
                        strArr3[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[18]];
                        TileObject nearest = TileObjects.getNearest(strArr3);
                        String[] strArr4 = new String[llIIlIIIll[0]];
                        strArr4[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[19]];
                        if (lIlIlIIIllIIl(nearest.hasAction(strArr4) ? 1 : 0)) {
                            String[] strArr5 = new String[llIIlIIIll[0]];
                            strArr5[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[20]];
                            TileObjects.getNearest(strArr5).interact(llIIlIIIlI[llIIlIIIll[21]]);
                            Time.sleepTicks(llIIlIIIll[4]);
                            "".length();
                            "".length();
                            if ("   ".length() <= (-" ".length())) {
                                return;
                            }
                        } else {
                            String[] strArr6 = new String[llIIlIIIll[0]];
                            strArr6[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[22]];
                            TileObjects.getNearest(strArr6).interact(llIIlIIIlI[llIIlIIIll[23]]);
                        }
                    }
                    if (lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        String[] strArr7 = new String[llIIlIIIll[0]];
                        strArr7[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[24]];
                        C0020g.a(strArr7);
                    }
                    if (lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                        Dialog.enterAmount(C0018e.c(llIIlIIIll[25], llIIlIIIll[26]));
                        Time.sleepTicks(llIIlIIIll[9]);
                        "".length();
                        Dialog.close();
                    }
                }
            }
            if (lIlIlIIIllIIl(f(str) ? 1 : 0) && lIlIlIIIllIlI(cT.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                g(str);
            }
            if (lIlIlIIIllIIl(f(str) ? 1 : 0) && lIlIlIIIllIIl(Inventory.contains(item2 -> {
                if (lIlIlIIIllIIl(item2.getName().contains(llIIlIIIlI[llIIlIIIll[205]]) ? 1 : 0) && lIlIlIIIllIlI(item2.isNoted() ? 1 : 0)) {
                    ?? r0 = llIIlIIIll[0];
                    "".length();
                    return ((52 ^ 45) & ((177 ^ 168) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIlIIIll[3];
            }) ? 1 : 0) && lIlIlIIIllllI(Vars.getBit(cX), llIIlIIIll[15])) {
                if (lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cV), llIIlIIIll[13]) && lIlIlIIIllIlI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[27]];
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(llIIlIIIll[0]);
                    "".length();
                }
                if (lIlIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(cV), llIIlIIIll[13])) {
                    if (lIlIlIIIllllI(Vars.getBit(cX), llIIlIIIll[15]) && lIlIlIIIlllII(Vars.getBit(cW), llIIlIIIll[27]) && lIlIlIIIllllI(C0018e.j(llIIlIIIll[1]), llIIlIIIll[2])) {
                        while (lIlIlIIIlllII(Vars.getBit(cW), llIIlIIIll[27]) && lIlIlIIIllllI(C0018e.j(llIIlIIIll[1]), llIIlIIIll[2]) && lIlIlIIIllIlI(AccBuilderSotf.d ? 1 : 0)) {
                            if (lIlIlIIIllIIl(Widgets.get(llIIlIIIll[28]).isEmpty() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[29]];
                                String[] strArr8 = new String[llIIlIIIll[0]];
                                strArr8[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[30]];
                                TileObjects.getNearest(strArr8).interact(llIIlIIIlI[llIIlIIIll[31]]);
                                Time.sleepTicks(llIIlIIIll[5]);
                                "".length();
                            }
                            if (lIlIlIIIllIlI(Widgets.get(llIIlIIIll[28]).isEmpty() ? 1 : 0)) {
                                Widgets.get(llIIlIIIll[28], llIIlIIIll[4]).getChild(llIIlIIIll[7]);
                                Widget child = Widgets.get(llIIlIIIll[28], llIIlIIIll[9]).getChild(llIIlIIIll[9]);
                                if (lIlIlIIlIIlIl(child)) {
                                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[32]];
                                    child.interact(llIIlIIIlI[llIIlIIIll[33]]);
                                }
                                if (lIlIlIIlIlIII(child)) {
                                    AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[34]];
                                    Shop.buyFifty(llIIlIIIlI[llIIlIIIll[35]]);
                                }
                            }
                            Time.sleepTicks(llIIlIIIll[4]);
                            "".length();
                            "".length();
                            if (((76 ^ 115) & ((134 ^ 185) ^ (-1))) > 0) {
                                return;
                            }
                        }
                    }
                    if (lIlIlIIIllllI(Vars.getBit(cX), llIIlIIIll[15]) && lIlIlIIlIlIIl(Vars.getBit(cW)) && lIlIlIIIllIlI(Inventory.isFull() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[36]];
                        if (lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            String[] strArr9 = new String[llIIlIIIll[0]];
                            strArr9[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[37]];
                            TileObjects.getNearest(strArr9).interact(llIIlIIIlI[llIIlIIIll[15]]);
                            Time.sleepTicks(llIIlIIIll[5]);
                            "".length();
                        }
                        if (lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                            Dialog.enterAmount(C0018e.c(llIIlIIIll[38], llIIlIIIll[39]));
                        }
                    }
                    if (lIlIlIIIlllII(Vars.getBit(cX), llIIlIIIll[15])) {
                        int[] iArr3 = new int[llIIlIIIll[0]];
                        iArr3[llIIlIIIll[3]] = llIIlIIIll[16];
                        if (lIlIlIIIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[40]];
                            if (lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr10 = new String[llIIlIIIll[0]];
                                strArr10[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[41]];
                                TileObject nearest2 = TileObjects.getNearest(strArr10);
                                String[] strArr11 = new String[llIIlIIIll[0]];
                                strArr11[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[42]];
                                if (lIlIlIIIllIIl(nearest2.hasAction(strArr11) ? 1 : 0)) {
                                    String[] strArr12 = new String[llIIlIIIll[0]];
                                    strArr12[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[43]];
                                    TileObjects.getNearest(strArr12).interact(llIIlIIIlI[llIIlIIIll[44]]);
                                    Time.sleepTicks(llIIlIIIll[4]);
                                    "".length();
                                    "".length();
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    String[] strArr13 = new String[llIIlIIIll[0]];
                                    strArr13[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[45]];
                                    TileObjects.getNearest(strArr13).interact(llIIlIIIlI[llIIlIIIll[46]]);
                                }
                            }
                            if (lIlIlIIIllIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                String[] strArr14 = new String[llIIlIIIll[0]];
                                strArr14[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[47]];
                                C0020g.a(strArr14);
                            }
                            if (lIlIlIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                                Dialog.enterAmount(C0018e.c(llIIlIIIll[25], llIIlIIIll[26]));
                                Time.sleepTicks(llIIlIIIll[5]);
                                "".length();
                                Dialog.close();
                            }
                        }
                    }
                    if (lIlIlIIIllIIl(aQ() ? 1 : 0) && lIlIlIIIllllI(Vars.getBit(cX), llIIlIIIll[15]) && lIlIlIIIlllII(Vars.getBit(llIIlIIIll[48]), llIIlIIIll[0])) {
                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[49]];
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr15 = new String[llIIlIIIll[0]];
                        strArr15[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[50]];
                        if (lIlIlIIlIIllI(worldLocation.distanceTo(NPCs.getNearest(strArr15)), llIIlIIIll[0]) && lIlIlIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr16 = new String[llIIlIIIll[0]];
                            strArr16[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[51]];
                            NPCs.getNearest(strArr16).interact(llIIlIIIlI[llIIlIIIll[52]]);
                        }
                        if (lIlIlIIIllIlI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr17 = new String[llIIlIIIll[0]];
                            strArr17[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[53]];
                            NPCs.getNearest(strArr17).interact(llIIlIIIlI[llIIlIIIll[54]]);
                            Time.sleepTicks(llIIlIIIll[4]);
                            "".length();
                        }
                        String[] strArr18 = new String[llIIlIIIll[5]];
                        strArr18[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[55]];
                        strArr18[llIIlIIIll[0]] = llIIlIIIlI[llIIlIIIll[56]];
                        strArr18[llIIlIIIll[4]] = llIIlIIIlI[llIIlIIIll[57]];
                        C0020g.a(strArr18);
                    }
                    if (lIlIlIIIllllI(Vars.getBit(llIIlIIIll[58]), llIIlIIIll[15]) && lIlIlIIlIlIIl(Vars.getBit(llIIlIIIll[48]))) {
                        if (lIlIlIIIllIIl(Widgets.get(llIIlIIIll[59]).isEmpty() ? 1 : 0)) {
                            String[] strArr19 = new String[llIIlIIIll[0]];
                            strArr19[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[60]];
                            TileObjects.getNearest(strArr19).interact(llIIlIIIlI[llIIlIIIll[61]]);
                            Time.sleepTicks(llIIlIIIll[5]);
                            "".length();
                        }
                        if (lIlIlIIIllIlI(Widgets.get(llIIlIIIll[59]).isEmpty() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[62]];
                            Widget widget = Widgets.get(llIIlIIIll[59], llIIlIIIll[9]);
                            int i = llIIlIIIll[63];
                            int i2 = llIIlIIIll[64];
                            int i3 = llIIlIIIll[3];
                            int i4 = llIIlIIIll[3];
                            Widget[] children = Widgets.get(llIIlIIIll[59], llIIlIIIll[18]).getChildren();
                            int i5 = llIIlIIIll[3];
                            while (lIlIlIIIlllII(i5, children.length)) {
                                if (lIlIlIIlIlIll(children[i5].getTextColor(), i2)) {
                                    i4++;
                                    "".length();
                                    if ("   ".length() < 0) {
                                        return;
                                    }
                                } else {
                                    i3++;
                                }
                                i5++;
                                "".length();
                                if ((-"  ".length()) >= 0) {
                                    return;
                                }
                            }
                            if (lIlIlIIlIIllI(i4, llIIlIIIll[8])) {
                                Widget widget2 = Widgets.get(llIIlIIIll[59], llIIlIIIll[11]);
                                if (lIlIlIIlIIlIl(widget2)) {
                                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llIIlIIIll[0]);
                                    Time.sleepTicks(llIIlIIIll[0]);
                                    "".length();
                                }
                            }
                            if (lIlIlIIIlllII(i4, llIIlIIIll[8])) {
                                int i6 = llIIlIIIll[3];
                                int i7 = llIIlIIIll[3];
                                int i8 = llIIlIIIll[3];
                                int i9 = llIIlIIIll[3];
                                int i10 = llIIlIIIll[3];
                                int i11 = llIIlIIIll[3];
                                while (lIlIlIIIlllII(i11, children.length)) {
                                    if (lIlIlIIIllIIl(children[i11].getName().contains(llIIlIIIlI[llIIlIIIll[65]]) ? 1 : 0) && lIlIlIIIllIlI(i6)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[66]];
                                        children[i11].interact(llIIlIIIlI[llIIlIIIll[67]]);
                                        Time.sleepTicks(llIIlIIIll[0]);
                                        "".length();
                                        i6 = llIIlIIIll[0];
                                    }
                                    if (lIlIlIIIllIIl(children[i11].getName().contains(llIIlIIIlI[llIIlIIIll[68]]) ? 1 : 0) && lIlIlIIIllIlI(i7)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[69]];
                                        children[i11].interact(llIIlIIIlI[llIIlIIIll[70]]);
                                        Time.sleepTicks(llIIlIIIll[0]);
                                        "".length();
                                        i7 = llIIlIIIll[0];
                                    }
                                    if (lIlIlIIIllIIl(children[i11].getName().contains(llIIlIIIlI[llIIlIIIll[71]]) ? 1 : 0) && lIlIlIIIllIlI(i8)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[72]];
                                        children[i11].interact(llIIlIIIlI[llIIlIIIll[73]]);
                                        Time.sleepTicks(llIIlIIIll[0]);
                                        "".length();
                                        i8 = llIIlIIIll[0];
                                    }
                                    if (lIlIlIIIllIIl(children[i11].getName().contains(llIIlIIIlI[llIIlIIIll[74]]) ? 1 : 0) && lIlIlIIIllIlI(i9)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[75]];
                                        children[i11].interact(llIIlIIIlI[llIIlIIIll[76]]);
                                        Time.sleepTicks(llIIlIIIll[0]);
                                        "".length();
                                        i9 = llIIlIIIll[0];
                                    }
                                    if (lIlIlIIIllIIl(children[i11].getName().contains(llIIlIIIlI[llIIlIIIll[77]]) ? 1 : 0) && lIlIlIIIllIlI(i10)) {
                                        AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[78]];
                                        children[i11].interact(llIIlIIIlI[llIIlIIIll[79]]);
                                        Time.sleepTicks(llIIlIIIll[0]);
                                        "".length();
                                        i10 = llIIlIIIll[0];
                                    }
                                    i11++;
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                            if (lIlIlIIlIlIll(i4, llIIlIIIll[8])) {
                                AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[80]];
                                if (lIlIlIIlIIlIl(widget)) {
                                    Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIIlIIIll[0]);
                                    Time.sleepTicks(llIIlIIIll[8]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                String[] strArr20 = new String[llIIlIIIll[0]];
                strArr20[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[81]];
                if (lIlIlIIlIIlIl(NPCs.getNearest(strArr20))) {
                    cR = null;
                }
                if (lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlIlIIlIlIII(cR)) {
                    Time.sleepTicks(llIIlIIIll[7]);
                    "".length();
                    System.out.println(llIIlIIIlI[llIIlIIIll[82]]);
                    cR = Players.getLocal().getWorldLocation();
                    cS = new WorldPoint(cR.getX() - C0018e.c(llIIlIIIll[0], llIIlIIIll[5]), cR.getY() + C0018e.c(llIIlIIIll[19], llIIlIIIll[21]), cR.getPlane());
                }
                if (lIlIlIIIllIIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlIlIIlIIlIl(cR)) {
                    if (lIlIlIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(cS), llIIlIIIll[5])) {
                        String[] strArr21 = new String[llIIlIIIll[0]];
                        strArr21[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[83]];
                        if (lIlIlIIlIlIII(TileObjects.getNearest(strArr21))) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[84]];
                            C0018e.c(cS);
                            Time.sleepTicks(llIIlIIIll[0]);
                            "".length();
                        }
                    }
                    if (lIlIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(cS), llIIlIIIll[5])) {
                        String[] strArr22 = new String[llIIlIIIll[0]];
                        strArr22[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[85]];
                        if (lIlIlIIlIlIII(TileObjects.getNearest(strArr22))) {
                            AccBuilderSotf.c = llIIlIIIlI[llIIlIIIll[86]];
                            List all = NPCs.getAll(npc -> {
                                return npc.getName().contains(llIIlIIIlI[llIIlIIIll[204]]);
                            });
                            if (lIlIlIIIllllI(all.size(), llIIlIIIll[5]) && lIlIlIIlIlIII(Players.getLocal().getInteracting())) {
                                ((NPC) all.get(llIIlIIIll[3])).interact(llIIlIIIlI[llIIlIIIll[87]]);
                                Time.sleepTicks(llIIlIIIll[4]);
                                "".length();
                            }
                            Item first = Inventory.getFirst(item3 -> {
                                return item3.getName().contains(llIIlIIIlI[llIIlIIIll[203]]);
                            });
                            if (lIlIlIIlIIlIl(first) && lIlIlIIlIlIll(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIlIIIllllI(Skills.getBoostedLevel(Skill.HITPOINTS), llIIlIIIll[65])) {
                                first.interact(llIIlIIIlI[llIIlIIIll[88]]);
                                Time.sleepTicks(llIIlIIIll[5]);
                                "".length();
                                Time.sleepTicks(llIIlIIIll[20]);
                                "".length();
                            }
                        }
                    }
                    if (lIlIlIIIllIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && lIlIlIIlIlIIl(Prayers.getPoints())) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (!lIlIlIIlIlIII(NPCs.getNearest(npc2 -> {
                    return npc2.getName().contains(llIIlIIIlI[llIIlIIIll[202]]);
                })) || lIlIlIIlIIlIl(NPCs.getNearest(npc3 -> {
                    return npc3.getName().contains(llIIlIIIlI[llIIlIIIll[162]]);
                }))) {
                    C0018e.F();
                    if (lIlIlIIIllIIl(Equipment.contains(item4 -> {
                        if (lIlIlIIlIlIll(item4.getId(), llIIlIIIll[102])) {
                            ?? r0 = llIIlIIIll[0];
                            "".length();
                            return " ".length() > " ".length() ? ((166 ^ 163) ^ (118 ^ 109)) & (((87 ^ 59) ^ (91 ^ 41)) ^ (-" ".length())) : r0;
                        }
                        return llIIlIIIll[3];
                    }) ? 1 : 0)) {
                        if (lIlIlIIlIllII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
                        }
                        String[] strArr23 = new String[llIIlIIIll[0]];
                        strArr23[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[89]];
                        if (lIlIlIIlIIlIl(TileObjects.getNearest(strArr23))) {
                            String[] strArr24 = new String[llIIlIIIll[0]];
                            strArr24[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[90]];
                            TileObjects.getNearest(strArr24).interact(llIIlIIIlI[llIIlIIIll[91]]);
                            Time.sleepTicks(llIIlIIIll[5]);
                            "".length();
                        }
                        if (lIlIlIIIllllI(Combat.getSpecEnergy(), llIIlIIIll[62]) && lIlIlIIIllIlI(Combat.isSpecEnabled() ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlIIIll[0]];
                            iArr4[llIIlIIIll[3]] = llIIlIIIll[92];
                            if (lIlIlIIIllIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llIIlIIIll[0]];
                                iArr5[llIIlIIIll[3]] = llIIlIIIll[92];
                                if (lIlIlIIIllllI(Equipment.getFirst(iArr5).getQuantity(), llIIlIIIll[4])) {
                                    Combat.toggleSpec();
                                }
                            }
                        }
                    }
                    if (lIlIlIIIlllII(Prayers.getPoints(), llIIlIIIll[27]) && lIlIlIIIllIIl(Inventory.contains(item5 -> {
                        return item5.getName().contains(llIIlIIIlI[llIIlIIIll[201]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item6 -> {
                            return item6.getName().contains(llIIlIIIlI[llIIlIIIll[200]]);
                        }).interact(llIIlIIIlI[llIIlIIIll[93]]);
                        Time.sleepTicks(llIIlIIIll[0]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0525, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x055f, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0599, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05d3, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x060d, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0647, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0681, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x06bb, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x06e2, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0030q.llIIlIIIll[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024d, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a4, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03c5, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x041c, code lost:
        if (lIlIlIIIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v234, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v276, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean f(String str) {
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[94]]) ? 1 : 0)) {
            return llIIlIIIll[0];
        }
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[95]]) ? 1 : 0)) {
            if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[62]) && lIlIlIIIlllII(Skills.getLevel(Skill.RANGED), llIIlIIIll[74])) {
                int[] iArr = new int[llIIlIIIll[0]];
                iArr[llIIlIIIll[3]] = llIIlIIIll[96];
                if (lIlIlIIIllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIlIIIll[0]];
                    iArr2[llIIlIIIll[3]] = llIIlIIIll[97];
                    if (lIlIlIIIllIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIIIll[0]];
                        iArr3[llIIlIIIll[3]] = llIIlIIIll[98];
                        if (lIlIlIIIllIlI(Equipment.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlIIIll[0]];
                            iArr4[llIIlIIIll[3]] = llIIlIIIll[99];
                        }
                        int[] iArr5 = new int[llIIlIIIll[0]];
                        iArr5[llIIlIIIll[3]] = llIIlIIIll[100];
                        if (lIlIlIIIllIIl(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIlIIIll[0]];
                            iArr6[llIIlIIIll[3]] = llIIlIIIll[101];
                            if (lIlIlIIIllIlI(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[llIIlIIIll[0]];
                                iArr7[llIIlIIIll[3]] = llIIlIIIll[102];
                            }
                            int[] iArr8 = new int[llIIlIIIll[0]];
                            iArr8[llIIlIIIll[3]] = llIIlIIIll[103];
                            if (lIlIlIIIllIIl(Equipment.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[llIIlIIIll[0]];
                                iArr9[llIIlIIIll[3]] = llIIlIIIll[92];
                                if (lIlIlIIIllIIl(Equipment.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[llIIlIIIll[0]];
                                    iArr10[llIIlIIIll[3]] = llIIlIIIll[104];
                                    if (lIlIlIIIllIIl(Equipment.contains(iArr10) ? 1 : 0)) {
                                        int[] iArr11 = new int[llIIlIIIll[0]];
                                        iArr11[llIIlIIIll[3]] = llIIlIIIll[105];
                                        if (lIlIlIIIllIIl(Equipment.contains(iArr11) ? 1 : 0)) {
                                            ?? r0 = llIIlIIIll[0];
                                            "".length();
                                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIIlIIIll[3];
            } else if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[74]) && lIlIlIIIlllII(Skills.getLevel(Skill.RANGED), llIIlIIIll[84])) {
                int[] iArr12 = new int[llIIlIIIll[0]];
                iArr12[llIIlIIIll[3]] = llIIlIIIll[106];
                if (lIlIlIIIllIIl(Equipment.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[llIIlIIIll[0]];
                    iArr13[llIIlIIIll[3]] = llIIlIIIll[107];
                    if (lIlIlIIIllIIl(Equipment.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[llIIlIIIll[0]];
                        iArr14[llIIlIIIll[3]] = llIIlIIIll[98];
                        if (lIlIlIIIllIlI(Equipment.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[llIIlIIIll[0]];
                            iArr15[llIIlIIIll[3]] = llIIlIIIll[99];
                        }
                        int[] iArr16 = new int[llIIlIIIll[0]];
                        iArr16[llIIlIIIll[3]] = llIIlIIIll[100];
                        if (lIlIlIIIllIIl(Equipment.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[llIIlIIIll[0]];
                            iArr17[llIIlIIIll[3]] = llIIlIIIll[101];
                            if (lIlIlIIIllIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                                int[] iArr18 = new int[llIIlIIIll[0]];
                                iArr18[llIIlIIIll[3]] = llIIlIIIll[102];
                            }
                            int[] iArr19 = new int[llIIlIIIll[0]];
                            iArr19[llIIlIIIll[3]] = llIIlIIIll[103];
                            if (lIlIlIIIllIIl(Equipment.contains(iArr19) ? 1 : 0)) {
                                int[] iArr20 = new int[llIIlIIIll[0]];
                                iArr20[llIIlIIIll[3]] = llIIlIIIll[92];
                                if (lIlIlIIIllIIl(Equipment.contains(iArr20) ? 1 : 0)) {
                                    int[] iArr21 = new int[llIIlIIIll[0]];
                                    iArr21[llIIlIIIll[3]] = llIIlIIIll[104];
                                    if (lIlIlIIIllIIl(Equipment.contains(iArr21) ? 1 : 0)) {
                                        int[] iArr22 = new int[llIIlIIIll[0]];
                                        iArr22[llIIlIIIll[3]] = llIIlIIIll[105];
                                        if (lIlIlIIIllIIl(Equipment.contains(iArr22) ? 1 : 0)) {
                                            ?? r02 = llIIlIIIll[0];
                                            "".length();
                                            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIIlIIIll[3];
            } else if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[84])) {
                int[] iArr23 = new int[llIIlIIIll[0]];
                iArr23[llIIlIIIll[3]] = llIIlIIIll[108];
                if (lIlIlIIIllIIl(Equipment.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIIlIIIll[0]];
                    iArr24[llIIlIIIll[3]] = llIIlIIIll[109];
                    if (lIlIlIIIllIIl(Equipment.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[llIIlIIIll[0]];
                        iArr25[llIIlIIIll[3]] = llIIlIIIll[98];
                        if (lIlIlIIIllIlI(Equipment.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[llIIlIIIll[0]];
                            iArr26[llIIlIIIll[3]] = llIIlIIIll[99];
                        }
                        int[] iArr27 = new int[llIIlIIIll[0]];
                        iArr27[llIIlIIIll[3]] = llIIlIIIll[100];
                        if (lIlIlIIIllIIl(Equipment.contains(iArr27) ? 1 : 0)) {
                            int[] iArr28 = new int[llIIlIIIll[0]];
                            iArr28[llIIlIIIll[3]] = llIIlIIIll[101];
                            if (lIlIlIIIllIlI(Equipment.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[llIIlIIIll[0]];
                                iArr29[llIIlIIIll[3]] = llIIlIIIll[102];
                            }
                            int[] iArr30 = new int[llIIlIIIll[0]];
                            iArr30[llIIlIIIll[3]] = llIIlIIIll[103];
                            if (lIlIlIIIllIIl(Equipment.contains(iArr30) ? 1 : 0)) {
                                int[] iArr31 = new int[llIIlIIIll[0]];
                                iArr31[llIIlIIIll[3]] = llIIlIIIll[92];
                                if (lIlIlIIIllIIl(Equipment.contains(iArr31) ? 1 : 0)) {
                                    int[] iArr32 = new int[llIIlIIIll[0]];
                                    iArr32[llIIlIIIll[3]] = llIIlIIIll[104];
                                    if (lIlIlIIIllIIl(Equipment.contains(iArr32) ? 1 : 0)) {
                                        int[] iArr33 = new int[llIIlIIIll[0]];
                                        iArr33[llIIlIIIll[3]] = llIIlIIIll[105];
                                        if (lIlIlIIIllIIl(Equipment.contains(iArr33) ? 1 : 0)) {
                                            ?? r03 = llIIlIIIll[0];
                                            "".length();
                                            return ((true ^ true) & ((true ^ true) ^ true)) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return llIIlIIIll[3];
            }
        }
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[110]]) ? 1 : 0)) {
            int[] iArr34 = new int[llIIlIIIll[0]];
            iArr34[llIIlIIIll[3]] = llIIlIIIll[111];
            if (lIlIlIIIllIlI(Equipment.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIlIIIll[0]];
                iArr35[llIIlIIIll[3]] = llIIlIIIll[111];
            }
            int[] iArr36 = new int[llIIlIIIll[0]];
            iArr36[llIIlIIIll[3]] = llIIlIIIll[112];
            if (lIlIlIIIllIlI(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIIlIIIll[0]];
                iArr37[llIIlIIIll[3]] = llIIlIIIll[112];
            }
            int[] iArr38 = new int[llIIlIIIll[0]];
            iArr38[llIIlIIIll[3]] = llIIlIIIll[113];
            if (lIlIlIIIllIlI(Equipment.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIIlIIIll[0]];
                iArr39[llIIlIIIll[3]] = llIIlIIIll[113];
            }
            int[] iArr40 = new int[llIIlIIIll[0]];
            iArr40[llIIlIIIll[3]] = llIIlIIIll[114];
            if (lIlIlIIIllIlI(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIlIIIll[0]];
                iArr41[llIIlIIIll[3]] = llIIlIIIll[114];
            }
            int[] iArr42 = new int[llIIlIIIll[0]];
            iArr42[llIIlIIIll[3]] = llIIlIIIll[115];
            if (lIlIlIIIllIlI(Equipment.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIIlIIIll[0]];
                iArr43[llIIlIIIll[3]] = llIIlIIIll[115];
            }
            int[] iArr44 = new int[llIIlIIIll[0]];
            iArr44[llIIlIIIll[3]] = llIIlIIIll[116];
            if (lIlIlIIIllIlI(Equipment.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIIlIIIll[0]];
                iArr45[llIIlIIIll[3]] = llIIlIIIll[116];
            }
            int[] iArr46 = new int[llIIlIIIll[0]];
            iArr46[llIIlIIIll[3]] = llIIlIIIll[117];
            if (lIlIlIIIllIlI(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIIlIIIll[0]];
                iArr47[llIIlIIIll[3]] = llIIlIIIll[117];
            }
            int[] iArr48 = new int[llIIlIIIll[0]];
            iArr48[llIIlIIIll[3]] = llIIlIIIll[105];
            if (lIlIlIIIllIlI(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIIlIIIll[0]];
                iArr49[llIIlIIIll[3]] = llIIlIIIll[105];
            }
            ?? r04 = llIIlIIIll[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
        }
        return llIIlIIIll[3];
    }

    static {
        lIlIlIIIlIlll();
        lIlIlIIIlIlIl();
        bv = new ArrayList();
        cR = null;
        cS = null;
        cT = new WorldArea(llIIlIIIll[209], llIIlIIIll[210], llIIlIIIll[37], llIIlIIIll[46], llIIlIIIll[3]);
        cU = new WorldPoint(llIIlIIIll[211], llIIlIIIll[212], llIIlIIIll[3]);
        cV = new WorldPoint(llIIlIIIll[213], llIIlIIIll[214], llIIlIIIll[3]);
        cW = llIIlIIIll[215];
        cX = llIIlIIIll[58];
        cY = llIIlIIIll[3];
        cI = C0018e.c(llIIlIIIll[0], llIIlIIIll[4]);
        int[] iArr = new int[llIIlIIIll[12]];
        iArr[llIIlIIIll[3]] = llIIlIIIll[111];
        iArr[llIIlIIIll[0]] = llIIlIIIll[117];
        iArr[llIIlIIIll[4]] = llIIlIIIll[114];
        iArr[llIIlIIIll[5]] = llIIlIIIll[112];
        iArr[llIIlIIIll[7]] = llIIlIIIll[113];
        iArr[llIIlIIIll[8]] = llIIlIIIll[116];
        iArr[llIIlIIIll[9]] = llIIlIIIll[115];
        iArr[llIIlIIIll[10]] = llIIlIIIll[105];
        iArr[llIIlIIIll[11]] = llIIlIIIll[171];
        cZ = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bf, code lost:
        if (lIlIlIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0030q.llIIlIIIll[13]) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0642, code lost:
        if (lIlIlIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0030q.llIIlIIIll[126(0x7e, float:1.77E-43)]) != false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x075c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(String str) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[161]]) ? 1 : 0)) {
            int[] iArr9 = new int[llIIlIIIll[0]];
            iArr9[llIIlIIIll[3]] = llIIlIIIll[146];
            if (lIlIlIIIllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[146], llIIlIIIll[162], llIIlIIIll[163]));
                "".length();
            }
        }
        int[] iArr10 = new int[llIIlIIIll[0]];
        iArr10[llIIlIIIll[3]] = llIIlIIIll[152];
        if (lIlIlIIIllIIl(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[llIIlIIIll[0]];
            iArr11[llIIlIIIll[3]] = llIIlIIIll[152];
            if (lIlIlIIIllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIlIIIll[0]];
                iArr12[llIIlIIIll[3]] = llIIlIIIll[152];
            }
            iArr = new int[llIIlIIIll[0]];
            iArr[llIIlIIIll[3]] = llIIlIIIll[164];
            if (lIlIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[164], llIIlIIIll[13], llIIlIIIll[165]));
                "".length();
            }
            iArr2 = new int[llIIlIIIll[0]];
            iArr2[llIIlIIIll[3]] = llIIlIIIll[153];
            if (lIlIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[153], llIIlIIIll[50], llIIlIIIll[166]));
                "".length();
            }
            iArr3 = new int[llIIlIIIll[0]];
            iArr3[llIIlIIIll[3]] = llIIlIIIll[151];
            if (lIlIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[151], llIIlIIIll[50], llIIlIIIll[166]));
                "".length();
            }
            if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[167]]) ? 1 : 0)) {
                int[] iArr13 = new int[llIIlIIIll[0]];
                iArr13[llIIlIIIll[3]] = llIIlIIIll[105];
                if (lIlIlIIIllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIIIll[105], llIIlIIIll[0], llIIlIIIll[168]));
                    "".length();
                }
                if (lIlIlIIIllllI(Skills.getLevel(Skill.ATTACK), llIIlIIIll[74]) && lIlIlIIIllllI(Skills.getLevel(Skill.DEFENCE), llIIlIIIll[74]) && lIlIlIIIllllI(Skills.getLevel(Skill.STRENGTH), llIIlIIIll[74])) {
                    int[] iArr14 = new int[llIIlIIIll[0]];
                    iArr14[llIIlIIIll[3]] = llIIlIIIll[111];
                    if (lIlIlIIIllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[111], llIIlIIIll[0], C0018e.c(llIIlIIIll[169], llIIlIIIll[170])));
                        "".length();
                    }
                    int[] iArr15 = new int[llIIlIIIll[0]];
                    iArr15[llIIlIIIll[3]] = llIIlIIIll[171];
                    if (lIlIlIIIllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[171], llIIlIIIll[0], C0018e.c(llIIlIIIll[172], llIIlIIIll[173])));
                        "".length();
                    }
                    int[] iArr16 = new int[llIIlIIIll[0]];
                    iArr16[llIIlIIIll[3]] = llIIlIIIll[116];
                    if (lIlIlIIIllIlI(Bank.contains(iArr16) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[116], llIIlIIIll[0], C0018e.c(llIIlIIIll[174], llIIlIIIll[175])));
                        "".length();
                    }
                    int[] iArr17 = new int[llIIlIIIll[0]];
                    iArr17[llIIlIIIll[3]] = llIIlIIIll[114];
                    if (lIlIlIIIllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[114], llIIlIIIll[0], C0018e.c(llIIlIIIll[174], llIIlIIIll[175])));
                        "".length();
                    }
                    int[] iArr18 = new int[llIIlIIIll[0]];
                    iArr18[llIIlIIIll[3]] = llIIlIIIll[112];
                    if (lIlIlIIIllIlI(Bank.contains(iArr18) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[112], llIIlIIIll[0], C0018e.c(llIIlIIIll[176], llIIlIIIll[177])));
                        "".length();
                    }
                    int[] iArr19 = new int[llIIlIIIll[0]];
                    iArr19[llIIlIIIll[3]] = llIIlIIIll[113];
                    if (lIlIlIIIllIlI(Bank.contains(iArr19) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[113], llIIlIIIll[0], C0018e.c(llIIlIIIll[178], llIIlIIIll[179])));
                        "".length();
                    }
                    int[] iArr20 = new int[llIIlIIIll[0]];
                    iArr20[llIIlIIIll[3]] = llIIlIIIll[115];
                    if (lIlIlIIIllIlI(Bank.contains(iArr20) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[115], llIIlIIIll[0], C0018e.c(llIIlIIIll[180], llIIlIIIll[181])));
                        "".length();
                    }
                    int[] iArr21 = new int[llIIlIIIll[0]];
                    iArr21[llIIlIIIll[3]] = llIIlIIIll[117];
                    if (lIlIlIIIllIlI(Bank.contains(iArr21) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[117], llIIlIIIll[0], C0018e.c(llIIlIIIll[182], llIIlIIIll[183])));
                        "".length();
                    }
                }
            }
            if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[184]]) ? 1 : 0)) {
                return;
            }
            int[] iArr22 = new int[llIIlIIIll[0]];
            iArr22[llIIlIIIll[3]] = llIIlIIIll[103];
            if (lIlIlIIIllIlI(Bank.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIlIIIll[0]];
                iArr23[llIIlIIIll[3]] = llIIlIIIll[103];
                if (lIlIlIIIllIlI(Equipment.contains(iArr23) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIIIll[103], llIIlIIIll[0], C0018e.c(llIIlIIIll[185], llIIlIIIll[186])));
                    "".length();
                }
            }
            int[] iArr24 = new int[llIIlIIIll[0]];
            iArr24[llIIlIIIll[3]] = llIIlIIIll[100];
            if (lIlIlIIIllIlI(Bank.contains(iArr24) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[100], llIIlIIIll[4], llIIlIIIll[187]));
                "".length();
            }
            int[] iArr25 = new int[llIIlIIIll[0]];
            iArr25[llIIlIIIll[3]] = llIIlIIIll[98];
            if (lIlIlIIIllIlI(Bank.contains(iArr25) ? 1 : 0)) {
                bv.add(new C0017d(llIIlIIIll[98], llIIlIIIll[4], llIIlIIIll[187]));
                "".length();
            }
            int[] iArr26 = new int[llIIlIIIll[0]];
            iArr26[llIIlIIIll[3]] = llIIlIIIll[92];
            if (lIlIlIIIllIIl(Bank.contains(iArr26) ? 1 : 0)) {
                int[] iArr27 = new int[llIIlIIIll[0]];
                iArr27[llIIlIIIll[3]] = llIIlIIIll[92];
                if (lIlIlIIIllIIl(Bank.contains(iArr27) ? 1 : 0)) {
                    int[] iArr28 = new int[llIIlIIIll[0]];
                    iArr28[llIIlIIIll[3]] = llIIlIIIll[92];
                }
                iArr4 = new int[llIIlIIIll[0]];
                iArr4[llIIlIIIll[3]] = llIIlIIIll[102];
                if (lIlIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr29 = new int[llIIlIIIll[0]];
                    iArr29[llIIlIIIll[3]] = llIIlIIIll[102];
                    if (lIlIlIIIllIlI(Equipment.contains(iArr29) ? 1 : 0)) {
                        int[] iArr30 = new int[llIIlIIIll[0]];
                        iArr30[llIIlIIIll[3]] = llIIlIIIll[122];
                        if (lIlIlIIIllIlI(Bank.contains(iArr30) ? 1 : 0)) {
                            bv.add(new C0017d(llIIlIIIll[122], llIIlIIIll[0], C0018e.c(llIIlIIIll[191], llIIlIIIll[192])));
                            "".length();
                        }
                        int[] iArr31 = new int[llIIlIIIll[0]];
                        iArr31[llIIlIIIll[3]] = llIIlIIIll[101];
                        if (lIlIlIIIllIlI(Bank.contains(iArr31) ? 1 : 0)) {
                            bv.add(new C0017d(llIIlIIIll[101], llIIlIIIll[4], llIIlIIIll[187]));
                            "".length();
                        }
                    }
                }
                if (lIlIlIIIlllII(Skills.getBoostedLevel(Skill.RANGED), llIIlIIIll[74])) {
                    int[] iArr32 = new int[llIIlIIIll[0]];
                    iArr32[llIIlIIIll[3]] = llIIlIIIll[97];
                    if (lIlIlIIIllIlI(Bank.contains(iArr32) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[97], llIIlIIIll[4], llIIlIIIll[187]));
                        "".length();
                    }
                    int[] iArr33 = new int[llIIlIIIll[0]];
                    iArr33[llIIlIIIll[3]] = llIIlIIIll[97];
                    if (lIlIlIIIllIIl(Bank.contains(iArr33) ? 1 : 0)) {
                        int[] iArr34 = new int[llIIlIIIll[0]];
                        iArr34[llIIlIIIll[3]] = llIIlIIIll[97];
                        if (lIlIlIIIlllII(Bank.getFirst(iArr34).getQuantity(), llIIlIIIll[4])) {
                            int i = llIIlIIIll[97];
                            int i2 = llIIlIIIll[4];
                            int[] iArr35 = new int[llIIlIIIll[0]];
                            iArr35[llIIlIIIll[3]] = llIIlIIIll[97];
                            bv.add(new C0017d(i, i2 - Bank.getFirst(iArr35).getQuantity(), llIIlIIIll[187]));
                            "".length();
                        }
                    }
                    int[] iArr36 = new int[llIIlIIIll[0]];
                    iArr36[llIIlIIIll[3]] = llIIlIIIll[96];
                    if (lIlIlIIIllIlI(Bank.contains(iArr36) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[96], llIIlIIIll[4], llIIlIIIll[187]));
                        "".length();
                    }
                    int[] iArr37 = new int[llIIlIIIll[0]];
                    iArr37[llIIlIIIll[3]] = llIIlIIIll[96];
                    if (lIlIlIIIllIIl(Bank.contains(iArr37) ? 1 : 0)) {
                        int[] iArr38 = new int[llIIlIIIll[0]];
                        iArr38[llIIlIIIll[3]] = llIIlIIIll[96];
                        if (lIlIlIIIlllII(Bank.getFirst(iArr38).getQuantity(), llIIlIIIll[4])) {
                            int i3 = llIIlIIIll[96];
                            int i4 = llIIlIIIll[4];
                            int[] iArr39 = new int[llIIlIIIll[0]];
                            iArr39[llIIlIIIll[3]] = llIIlIIIll[96];
                            bv.add(new C0017d(i3, i4 - Bank.getFirst(iArr39).getQuantity(), llIIlIIIll[187]));
                            "".length();
                        }
                    }
                }
                if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[74]) && lIlIlIIIlllII(Skills.getLevel(Skill.RANGED), llIIlIIIll[84])) {
                    iArr5 = new int[llIIlIIIll[0]];
                    iArr5[llIIlIIIll[3]] = llIIlIIIll[107];
                    if (lIlIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[107], llIIlIIIll[4], llIIlIIIll[193]));
                        "".length();
                    }
                    iArr6 = new int[llIIlIIIll[0]];
                    iArr6[llIIlIIIll[3]] = llIIlIIIll[107];
                    if (lIlIlIIIllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr40 = new int[llIIlIIIll[0]];
                        iArr40[llIIlIIIll[3]] = llIIlIIIll[107];
                        if (lIlIlIIIlllII(Bank.getFirst(iArr40).getQuantity(), llIIlIIIll[4])) {
                            int i5 = llIIlIIIll[107];
                            int i6 = llIIlIIIll[4];
                            int[] iArr41 = new int[llIIlIIIll[0]];
                            iArr41[llIIlIIIll[3]] = llIIlIIIll[107];
                            bv.add(new C0017d(i5, i6 - Bank.getFirst(iArr41).getQuantity(), llIIlIIIll[193]));
                            "".length();
                        }
                    }
                    iArr7 = new int[llIIlIIIll[0]];
                    iArr7[llIIlIIIll[3]] = llIIlIIIll[106];
                    if (lIlIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIIll[106], llIIlIIIll[4], llIIlIIIll[194]));
                        "".length();
                    }
                    iArr8 = new int[llIIlIIIll[0]];
                    iArr8[llIIlIIIll[3]] = llIIlIIIll[106];
                    if (lIlIlIIIllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr42 = new int[llIIlIIIll[0]];
                        iArr42[llIIlIIIll[3]] = llIIlIIIll[106];
                        if (lIlIlIIIlllII(Bank.getFirst(iArr42).getQuantity(), llIIlIIIll[4])) {
                            int i7 = llIIlIIIll[106];
                            int i8 = llIIlIIIll[4];
                            int[] iArr43 = new int[llIIlIIIll[0]];
                            iArr43[llIIlIIIll[3]] = llIIlIIIll[106];
                            bv.add(new C0017d(i7, i8 - Bank.getFirst(iArr43).getQuantity(), llIIlIIIll[194]));
                            "".length();
                        }
                    }
                }
                if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[84])) {
                    return;
                }
                int[] iArr44 = new int[llIIlIIIll[0]];
                iArr44[llIIlIIIll[3]] = llIIlIIIll[109];
                if (lIlIlIIIllIlI(Bank.contains(iArr44) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIIIll[109], llIIlIIIll[4], llIIlIIIll[193]));
                    "".length();
                }
                int[] iArr45 = new int[llIIlIIIll[0]];
                iArr45[llIIlIIIll[3]] = llIIlIIIll[109];
                if (lIlIlIIIllIIl(Bank.contains(iArr45) ? 1 : 0)) {
                    int[] iArr46 = new int[llIIlIIIll[0]];
                    iArr46[llIIlIIIll[3]] = llIIlIIIll[109];
                    if (lIlIlIIIlllII(Bank.getFirst(iArr46).getQuantity(), llIIlIIIll[4])) {
                        int i9 = llIIlIIIll[109];
                        int i10 = llIIlIIIll[4];
                        int[] iArr47 = new int[llIIlIIIll[0]];
                        iArr47[llIIlIIIll[3]] = llIIlIIIll[109];
                        bv.add(new C0017d(i9, i10 - Bank.getFirst(iArr47).getQuantity(), llIIlIIIll[193]));
                        "".length();
                    }
                }
                int[] iArr48 = new int[llIIlIIIll[0]];
                iArr48[llIIlIIIll[3]] = llIIlIIIll[108];
                if (lIlIlIIIllIlI(Bank.contains(iArr48) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIIIll[108], llIIlIIIll[4], llIIlIIIll[6]));
                    "".length();
                }
                int[] iArr49 = new int[llIIlIIIll[0]];
                iArr49[llIIlIIIll[3]] = llIIlIIIll[108];
                if (lIlIlIIIllIIl(Bank.contains(iArr49) ? 1 : 0)) {
                    int[] iArr50 = new int[llIIlIIIll[0]];
                    iArr50[llIIlIIIll[3]] = llIIlIIIll[108];
                    if (lIlIlIIIlllII(Bank.getFirst(iArr50).getQuantity(), llIIlIIIll[4])) {
                        int i11 = llIIlIIIll[108];
                        int i12 = llIIlIIIll[4];
                        int[] iArr51 = new int[llIIlIIIll[0]];
                        iArr51[llIIlIIIll[3]] = llIIlIIIll[108];
                        bv.add(new C0017d(i11, i12 - Bank.getFirst(iArr51).getQuantity(), llIIlIIIll[6]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIIlIIIll[92], llIIlIIIll[188], C0018e.c(llIIlIIIll[189], llIIlIIIll[190])));
            "".length();
            iArr4 = new int[llIIlIIIll[0]];
            iArr4[llIIlIIIll[3]] = llIIlIIIll[102];
            if (lIlIlIIIllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            if (lIlIlIIIlllII(Skills.getBoostedLevel(Skill.RANGED), llIIlIIIll[74])) {
            }
            if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[74])) {
                iArr5 = new int[llIIlIIIll[0]];
                iArr5[llIIlIIIll[3]] = llIIlIIIll[107];
                if (lIlIlIIIllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIIlIIIll[0]];
                iArr6[llIIlIIIll[3]] = llIIlIIIll[107];
                if (lIlIlIIIllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                iArr7 = new int[llIIlIIIll[0]];
                iArr7[llIIlIIIll[3]] = llIIlIIIll[106];
                if (lIlIlIIIllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                iArr8 = new int[llIIlIIIll[0]];
                iArr8[llIIlIIIll[3]] = llIIlIIIll[106];
                if (lIlIlIIIllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                }
            }
            if (lIlIlIIIllllI(Skills.getLevel(Skill.RANGED), llIIlIIIll[84])) {
            }
        }
        bv.add(new C0017d(llIIlIIIll[152], llIIlIIIll[13], C0023j.cf));
        "".length();
        iArr = new int[llIIlIIIll[0]];
        iArr[llIIlIIIll[3]] = llIIlIIIll[164];
        if (lIlIlIIIllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIIlIIIll[0]];
        iArr2[llIIlIIIll[3]] = llIIlIIIll[153];
        if (lIlIlIIIllIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIlIIIll[0]];
        iArr3[llIIlIIIll[3]] = llIIlIIIll[151];
        if (lIlIlIIIllIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[167]]) ? 1 : 0)) {
        }
        if (lIlIlIIIllIIl(str.equalsIgnoreCase(llIIlIIIlI[llIIlIIIll[184]]) ? 1 : 0)) {
        }
    }

    private static void aR() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(llIIlIIIlI[llIIlIIIll[197]]);
        });
        Item first2 = Inventory.getFirst(item2 -> {
            return item2.getName().contains(llIIlIIIlI[llIIlIIIll[196]]);
        });
        if (lIlIlIIlIIlIl(first2) && lIlIlIIlIlIll(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIlIIIllllI(Skills.getBoostedLevel(Skill.HITPOINTS), llIIlIIIll[65])) {
            first2.interact(llIIlIIIlI[llIIlIIIll[154]]);
            Time.sleepTicks(llIIlIIIll[5]);
            "".length();
            if (lIlIlIIlIIlIl(first)) {
                first.interact(llIIlIIIlI[llIIlIIIll[155]]);
                Time.sleepTicks(llIIlIIIll[0]);
                "".length();
            }
            Time.sleepTicks(llIIlIIIll[20]);
            "".length();
        }
        if (lIlIlIIlIIlIl(first) && lIlIlIIlIIlll(Vars.getBit(llIIlIIIll[156]), llIIlIIIll[62]) && lIlIlIIlIllIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIlIIIlllII(Skills.getBoostedLevel(Skill.HITPOINTS), llIIlIIIll[65])) {
            while (true) {
                if (!lIlIlIIIlllII(Vars.getBit(llIIlIIIll[156]), llIIlIIIll[157])) {
                    break;
                }
                if (lIlIlIIlIIlIl(first)) {
                    first.interact(llIIlIIIlI[llIIlIIIll[158]]);
                    Time.sleepTicks(llIIlIIIll[0]);
                    "".length();
                }
                first = Inventory.getFirst(item3 -> {
                    return item3.getName().contains(llIIlIIIlI[llIIlIIIll[195]]);
                });
                if (lIlIlIIlIlIII(first)) {
                    "".length();
                    if (((41 ^ 66) ^ (195 ^ 172)) <= " ".length()) {
                        return;
                    }
                }
            }
        }
        String[] strArr = new String[llIIlIIIll[0]];
        strArr[llIIlIIIll[3]] = llIIlIIIlI[llIIlIIIll[159]];
        Item first3 = Inventory.getFirst(strArr);
        if (lIlIlIIlIIlIl(first3) && lIlIlIIlIllIl(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH)) && lIlIlIIIlllII(Skills.getBoostedLevel(Skill.HITPOINTS), llIIlIIIll[65]) && lIlIlIIlIIllI(Skills.getBoostedLevel(Skill.HITPOINTS), llIIlIIIll[0])) {
            first3.interact(llIIlIIIlI[llIIlIIIll[160]]);
            cI = C0018e.c(llIIlIIIll[0], llIIlIIIll[4]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    static boolean aQ() {
        if ((!lIlIlIIIllIIl(Inventory.contains(item -> {
            return item.getName().contains(llIIlIIIlI[llIIlIIIll[208]]);
        }) ? 1 : 0) || (lIlIlIIIllIlI(Inventory.isFull() ? 1 : 0) && (!lIlIlIIIlllII(Vars.getBit(cW), llIIlIIIll[0]) || lIlIlIIIllllI(Vars.getBit(llIIlIIIll[1]), llIIlIIIll[2])))) && !(lIlIlIIIlllII(Vars.getBit(cW), llIIlIIIll[0]) && lIlIlIIIlllII(Vars.getBit(llIIlIIIll[1]), llIIlIIIll[2]))) {
            return llIIlIIIll[3];
        }
        ?? r0 = llIIlIIIll[0];
        "".length();
        return (((((26 + 21) - (-120)) + 17) ^ (((125 + 135) - 169) + 68)) & (((195 ^ 190) ^ (114 ^ 40)) ^ (-" ".length()))) != 0 ? ((253 ^ 187) ^ (33 ^ 60)) & (((14 ^ 105) ^ (133 ^ 185)) ^ (-" ".length())) : r0;
    }

    private static boolean lIlIlIIlIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIlIlIll(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIIIlIlII(String llllllllllllllllllIlIIlllIIIllll, String llllllllllllllllllIlIIlllIIIlllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIlllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIlIIlllIIIllII = llllllllllllllllllIlIIlllIIIlllI.toCharArray();
        int llllllllllllllllllIlIIlllIIIlIll = llIIlIIIll[3];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlIIIll[3];
        while (lIlIlIIIlllII(i, length)) {
            char llllllllllllllllllIlIIlllIIlIIII = charArray[i];
            sb.append((char) (llllllllllllllllllIlIIlllIIlIIII ^ llllllllllllllllllIlIIlllIIIllII[llllllllllllllllllIlIIlllIIIlIll % llllllllllllllllllIlIIlllIIIllII.length]));
            "".length();
            llllllllllllllllllIlIIlllIIIlIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIIIllIlI(int i) {
        return i == 0;
    }

    private static void lIlIlIIIlIlll() {
        llIIlIIIll = new int[217];
        llIIlIIIll[0] = " ".length();
        llIIlIIIll[1] = (-((-9260) & 32383)) & (-8457) & 32639;
        llIIlIIIll[2] = (-10756) & 12255;
        llIIlIIIll[3] = (180 ^ 134) & ((18 ^ 32) ^ (-1));
        llIIlIIIll[4] = "  ".length();
        llIIlIIIll[5] = "   ".length();
        llIIlIIIll[6] = (-((-24585) & 30219)) & (-18561) & 32694;
        llIIlIIIll[7] = (25 ^ 10) ^ (88 ^ 79);
        llIIlIIIll[8] = 190 ^ 187;
        llIIlIIIll[9] = (18 ^ 64) ^ (225 ^ 181);
        llIIlIIIll[10] = (((91 + 28) - 3) + 63) ^ (((170 + 146) - 239) + 103);
        llIIlIIIll[11] = (47 ^ 77) ^ (243 ^ 153);
        llIIlIIIll[12] = 41 ^ 32;
        llIIlIIIll[13] = 143 ^ 133;
        llIIlIIIll[14] = 96 ^ 107;
        llIIlIIIll[15] = (((143 + 162) - 198) + 78) ^ (((32 + 73) - (-57)) + 5);
        llIIlIIIll[16] = (-((-4689) & 22109)) & (-10257) & 28671;
        llIIlIIIll[17] = 159 ^ 147;
        llIIlIIIll[18] = (((73 + 34) - (-19)) + 57) ^ (((36 + 63) - (-87)) + 0);
        llIIlIIIll[19] = 104 ^ 102;
        llIIlIIIll[20] = (((17 + 111) - 112) + 172) ^ (((68 + 39) - 42) + 114);
        llIIlIIIll[21] = 38 ^ 54;
        llIIlIIIll[22] = "   ".length() ^ (191 ^ 173);
        llIIlIIIll[23] = 90 ^ 72;
        llIIlIIIll[24] = (128 ^ 134) ^ (160 ^ 181);
        llIIlIIIll[25] = (-14) & 2000013;
        llIIlIIIll[26] = (-4126) & 2504125;
        llIIlIIIll[27] = 120 ^ 108;
        llIIlIIIll[28] = (((215 ^ 198) + (((110 + 20) - 89) + 105)) - (61 ^ 81)) + ((36 + 1) - (-71)) + 43;
        llIIlIIIll[29] = (33 ^ 112) ^ (223 ^ 155);
        llIIlIIIll[30] = (135 ^ 142) ^ (56 ^ 39);
        llIIlIIIll[31] = (((172 + 150) - 273) + 128) ^ (((50 + 30) - (-62)) + 24);
        llIIlIIIll[32] = (136 ^ 161) ^ (108 ^ 93);
        llIIlIIIll[33] = 94 ^ 71;
        llIIlIIIll[34] = 39 ^ 61;
        llIIlIIIll[35] = (147 ^ 163) ^ (74 ^ 97);
        llIIlIIIll[36] = 189 ^ 161;
        llIIlIIIll[37] = (66 ^ 32) ^ (((105 + 6) - (-7)) + 9);
        llIIlIIIll[38] = (-6228) & 6527;
        llIIlIIIll[39] = (-10243) & 10742;
        llIIlIIIll[40] = (178 ^ 186) ^ (141 ^ 154);
        llIIlIIIll[41] = (193 ^ 180) ^ (227 ^ 182);
        llIIlIIIll[42] = 110 ^ 79;
        llIIlIIIll[43] = 53 ^ 23;
        llIIlIIIll[44] = 156 ^ 191;
        llIIlIIIll[45] = (19 ^ 26) ^ (81 ^ 124);
        llIIlIIIll[46] = (((156 + 162) - 254) + 114) ^ (((104 + 130) - 218) + 135);
        llIIlIIIll[47] = (((119 + 101) - 84) + 34) ^ (((52 + 134) - 168) + 122);
        llIIlIIIll[48] = (-((-3395) & 32195)) & (-6) & 32751;
        llIIlIIIll[49] = (175 ^ 185) ^ (80 ^ 97);
        llIIlIIIll[50] = (26 ^ 69) ^ (119 ^ 0);
        llIIlIIIll[51] = 236 ^ 197;
        llIIlIIIll[52] = (((0 + 41) - (-12)) + 87) ^ (((109 + 51) - 76) + 82);
        llIIlIIIll[53] = 127 ^ 84;
        llIIlIIIll[54] = "  ".length() ^ (178 ^ 156);
        llIIlIIIll[55] = (((97 + 14) - 71) + 87) ^ (103 ^ 53);
        llIIlIIIll[56] = (6 ^ 40) ^ ((229 ^ 180) & ((107 ^ 58) ^ (-1)));
        llIIlIIIll[57] = (119 ^ 64) ^ (53 ^ 45);
        llIIlIIIll[58] = (-((-6506) & 14843)) & (-4099) & 16383;
        llIIlIIIll[59] = (((55 ^ 43) + (178 ^ 144)) - (-(154 ^ 156))) + (132 ^ 185);
        llIIlIIIll[60] = (204 ^ 172) ^ (12 ^ 92);
        llIIlIIIll[61] = (173 ^ 169) ^ (73 ^ 124);
        llIIlIIIll[62] = 23 ^ 37;
        llIIlIIIll[63] = (-4097) & 9412495;
        llIIlIIIll[64] = (-((-18563) & 20451)) & (-24577) & 16777087;
        llIIlIIIll[65] = 172 ^ 159;
        llIIlIIIll[66] = 64 ^ 116;
        llIIlIIIll[67] = (78 ^ 121) ^ "  ".length();
        llIIlIIIll[68] = 119 ^ 65;
        llIIlIIIll[69] = 170 ^ 157;
        llIIlIIIll[70] = (61 ^ 59) ^ (62 ^ 0);
        llIIlIIIll[71] = 191 ^ 134;
        llIIlIIIll[72] = (((110 + 38) - 60) + 39) ^ (89 ^ 28);
        llIIlIIIll[73] = (109 ^ 117) ^ (2 ^ 33);
        llIIlIIIll[74] = (255 ^ 174) ^ (9 ^ 100);
        llIIlIIIll[75] = (144 ^ 135) ^ (11 ^ 33);
        llIIlIIIll[76] = 149 ^ 171;
        llIIlIIIll[77] = (((107 + 146) - 192) + 188) ^ (((97 + 83) - 86) + 104);
        llIIlIIIll[78] = (((59 + 69) - (-108)) + 17) ^ (((7 + 79) - (-60)) + 43);
        llIIlIIIll[79] = 1 ^ 64;
        llIIlIIIll[80] = (16 ^ 32) ^ (247 ^ 133);
        llIIlIIIll[81] = (50 ^ 55) ^ (239 ^ 169);
        llIIlIIIll[82] = 31 ^ 91;
        llIIlIIIll[83] = 83 ^ 22;
        llIIlIIIll[84] = 118 ^ 48;
        llIIlIIIll[85] = 246 ^ 177;
        llIIlIIIll[86] = (209 ^ 192) ^ (117 ^ 44);
        llIIlIIIll[87] = (50 ^ 92) ^ (28 ^ 59);
        llIIlIIIll[88] = (((245 + 113) - 122) + 12) ^ (((44 + 118) - 151) + 167);
        llIIlIIIll[89] = 81 ^ 26;
        llIIlIIIll[90] = (93 ^ 3) ^ (30 ^ 12);
        llIIlIIIll[91] = (36 ^ 21) ^ (15 ^ 115);
        llIIlIIIll[92] = (-((-4157) & 22590)) & (-8323) & 27647;
        llIIlIIIll[93] = 71 ^ 9;
        llIIlIIIll[94] = (((0 + 25) - (-71)) + 151) ^ (((51 + 115) - 156) + 174);
        llIIlIIIll[95] = (((202 + 15) - 155) + 187) ^ (((102 + 164) - 191) + 94);
        llIIlIIIll[96] = (-((-10805) & 28213)) & (-513) & 20413;
        llIIlIIIll[97] = (-22049) & 24547;
        llIIlIIIll[98] = (-((-16422) & 26479)) & (-16385) & 32767;
        llIIlIIIll[99] = (-439) & 13823;
        llIIlIIIll[100] = (-((-857) & 26457)) & (-578) & 32505;
        llIIlIIIll[101] = (-((-16873) & 31211)) & (-33) & 15231;
        llIIlIIIll[102] = (-((-12764) & 30687)) & (-9) & 30719;
        llIIlIIIll[103] = (-((-18596) & 31207)) & (-18449) & 32763;
        llIIlIIIll[104] = (-((-4545) & 21469)) & (-225) & 27647;
        llIIlIIIll[105] = (-((-10691) & 31179)) & (-2) & 31615;
        llIIlIIIll[106] = (-((-10689) & 16321)) & (-24641) & 32767;
        llIIlIIIll[107] = (-20481) & 22981;
        llIIlIIIll[108] = (-((-323) & 21875)) & (-8705) & 32759;
        llIIlIIIll[109] = (-((-18561) & 24207)) & (-8193) & 16335;
        llIIlIIIll[110] = (50 ^ 21) ^ (50 ^ 68);
        llIIlIIIll[111] = (-((-9139) & 25523)) & (-8705) & 31611;
        llIIlIIIll[112] = (-((-21029) & 32423)) & (-73) & 32767;
        llIIlIIIll[113] = (-((-16659) & 17751)) & (-2178) & 24573;
        llIIlIIIll[114] = (-((-4327) & 14575)) & (-1154) & 32699;
        llIIlIIIll[115] = (-1155) & 7678;
        llIIlIIIll[116] = (-((-16461) & 26206)) & (-3) & 16315;
        llIIlIIIll[117] = (-4) & 11131;
        llIIlIIIll[118] = 99 ^ 49;
        llIIlIIIll[119] = 250 ^ 169;
        llIIlIIIll[120] = (-((-24993) & 26087)) & (-2066) & 8159;
        llIIlIIIll[121] = 61 ^ 105;
        llIIlIIIll[122] = (-((-2289) & 19710)) & (-513) & 30719;
        llIIlIIIll[123] = 221 ^ 136;
        llIIlIIIll[124] = (67 ^ 32) ^ (50 ^ 7);
        llIIlIIIll[125] = "  ".length() ^ (32 ^ 117);
        llIIlIIIll[126] = (-((-8625) & 13748)) & (-8197) & 14319;
        llIIlIIIll[127] = 246 ^ 174;
        llIIlIIIll[128] = (84 ^ 44) ^ (73 ^ 104);
        llIIlIIIll[129] = (73 ^ 113) ^ (193 ^ 163);
        llIIlIIIll[130] = (60 ^ 7) ^ (195 ^ 163);
        llIIlIIIll[131] = 230 ^ 186;
        llIIlIIIll[132] = (150 ^ 179) ^ (67 ^ 59);
        llIIlIIIll[133] = 229 ^ 187;
        llIIlIIIll[134] = 15 ^ 80;
        llIIlIIIll[135] = (((119 + 172) - 95) + 54) ^ (((4 + 2) - (-104)) + 44);
        llIIlIIIll[136] = 35 ^ 66;
        llIIlIIIll[137] = (((48 + 69) - (-32)) + 14) ^ (((134 + 156) - 224) + 127);
        llIIlIIIll[138] = 79 ^ 44;
        llIIlIIIll[139] = 27 ^ 127;
        llIIlIIIll[140] = (74 ^ 17) ^ (64 ^ 126);
        llIIlIIIll[141] = (-4615) & 154614;
        llIIlIIIll[142] = (147 ^ 199) ^ (167 ^ 149);
        llIIlIIIll[143] = (((78 + 43) - 26) + 71) ^ (((113 + 21) - 115) + 174);
        llIIlIIIll[144] = (-2416) & 252415;
        llIIlIIIll[145] = 203 ^ 163;
        llIIlIIIll[146] = (-20489) & 22922;
        llIIlIIIll[147] = (-((-9363) & 29879)) & (-10) & 32255;
        llIIlIIIll[148] = (-(70 ^ 103)) & (-4621) & 16383;
        llIIlIIIll[149] = (-4131) & 15862;
        llIIlIIIll[150] = (-((-9641) & 13739)) & (-16385) & 32215;
        llIIlIIIll[151] = (-8209) & 16218;
        llIIlIIIll[152] = (-16519) & 29143;
        llIIlIIIll[153] = (-((-3075) & 27683)) & (-25) & 32639;
        llIIlIIIll[154] = 251 ^ 146;
        llIIlIIIll[155] = 237 ^ 135;
        llIIlIIIll[156] = (-((-2663) & 31471)) & (-2) & 32765;
        llIIlIIIll[157] = (-9284) & 9983;
        llIIlIIIll[158] = (25 ^ 96) ^ (0 ^ 18);
        llIIlIIIll[159] = 169 ^ 197;
        llIIlIIIll[160] = 127 ^ 18;
        llIIlIIIll[161] = 80 ^ 62;
        llIIlIIIll[162] = (158 ^ 161) ^ (196 ^ 131);
        llIIlIIIll[163] = (-((-521) & 24459)) & (-18) & 32755;
        llIIlIIIll[164] = (-((-30893) & 31917)) & (-8197) & 11772;
        llIIlIIIll[165] = (-130) & 2029;
        llIIlIIIll[166] = (-((-4355) & 32059)) & (-4164) & 32767;
        llIIlIIIll[167] = (((38 + 75) - (-98)) + 1) ^ (((152 + 156) - 218) + 97);
        llIIlIIIll[168] = (-((-2089) & 16238)) & (-16385) & 65533;
        llIIlIIIll[169] = (-529) & 585528;
        llIIlIIIll[170] = (-16533) & 641532;
        llIIlIIIll[171] = (-((-8217) & 29087)) & (-10) & 32719;
        llIIlIIIll[172] = (-17415) & 192414;
        llIIlIIIll[173] = (-((-21003) & 31582)) & (-5) & 195583;
        llIIlIIIll[174] = (-1509) & 896508;
        llIIlIIIll[175] = (-(((78 + 92) - 132) + 125)) & (-8194) & 933355;
        llIIlIIIll[176] = (-((-26113) & 32492)) & (-16641) & 1473019;
        llIIlIIIll[177] = (-16804) & 1506803;
        llIIlIIIll[178] = (-28873) & 1178872;
        llIIlIIIll[179] = (-((-12473) & 29118)) & (-2057) & 1268701;
        llIIlIIIll[180] = (-8201) & 698200;
        llIIlIIIll[181] = (-1052) & 741051;
        llIIlIIIll[182] = (-((-267) & 31115)) & (-10) & 2980857;
        llIIlIIIll[183] = (-99) & 3055098;
        llIIlIIIll[184] = (((226 + 166) - 327) + 184) ^ (((15 + 85) - 15) + 52);
        llIIlIIIll[185] = (-((-1629) & 11871)) & (-1) & 65242;
        llIIlIIIll[186] = (-22) & 65021;
        llIIlIIIll[187] = (-((-21259) & 31630)) & (-16389) & 32759;
        llIIlIIIll[188] = (-((-9286) & 13645)) & (-1) & 15359;
        llIIlIIIll[189] = ((42 + 47) - 14) + 55;
        llIIlIIIll[190] = ((41 + 33) - 62) + 138;
        llIIlIIIll[191] = (-16401) & 416700;
        llIIlIIIll[192] = (-((-12997) & 31685)) & (-49) & 458736;
        llIIlIIIll[193] = (-16404) & 23903;
        llIIlIIIll[194] = (-((-149) & 12030)) & (-16387) & 32767;
        llIIlIIIll[195] = 63 ^ 78;
        llIIlIIIll[196] = (177 ^ 136) ^ (212 ^ 159);
        llIIlIIIll[197] = 46 ^ 93;
        llIIlIIIll[198] = (193 ^ 129) ^ (63 ^ 11);
        llIIlIIIll[199] = (157 ^ 167) ^ (224 ^ 175);
        llIIlIIIll[200] = (((138 + 236) - 350) + 225) ^ (((82 + 136) - 147) + 72);
        llIIlIIIll[201] = (((3 + 104) - (-49)) + 21) ^ (((145 + 86) - 220) + 187);
        llIIlIIIll[202] = (((24 + 106) - 3) + 115) ^ (((21 + 18) - (-57)) + 43);
        llIIlIIIll[203] = (140 ^ 175) ^ (90 ^ 3);
        llIIlIIIll[204] = (((140 + 81) - 64) + 48) ^ (((66 + 133) - 175) + 158);
        llIIlIIIll[205] = (((88 + 146) - 178) + 177) ^ (((106 + 133) - 223) + 133);
        llIIlIIIll[206] = (184 ^ 141) ^ (204 ^ 132);
        llIIlIIIll[207] = (-((-11) & 26635)) & (-515) & 31663;
        llIIlIIIll[208] = (157 ^ 151) ^ (51 ^ 71);
        llIIlIIIll[209] = (-((-2645) & 32734)) & (-17) & 32699;
        llIIlIIIll[210] = (-21218) & 24303;
        llIIlIIIll[211] = (-13323) & 15935;
        llIIlIIIll[212] = (-21473) & 24566;
        llIIlIIIll[213] = (-13633) & 16236;
        llIIlIIIll[214] = (-((-3467) & 20431)) & (-8465) & 28543;
        llIIlIIIll[215] = (-8327) & 12279;
        llIIlIIIll[216] = (((20 ^ 57) + (91 ^ 98)) - (17 ^ 91)) + (197 ^ 166);
    }

    private static boolean lIlIlIIlIlIII(Object obj) {
        return obj == null;
    }
}
