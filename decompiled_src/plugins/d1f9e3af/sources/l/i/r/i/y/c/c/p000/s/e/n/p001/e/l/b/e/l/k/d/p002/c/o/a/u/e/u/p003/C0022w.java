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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.w  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/w.class */
public class C0022w implements W {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint cZ;
    private static /* synthetic */ WorldPoint dc;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIllIlIII;
    private static /* synthetic */ WorldPoint db;
    private static /* synthetic */ int dd;
    static /* synthetic */ String[] bR;
    static /* synthetic */ boolean cX;
    static /* synthetic */ int cl;
    private static /* synthetic */ WorldPoint da;
    private static /* synthetic */ String[] lIllIIlll;
    private static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ WorldPoint cY;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldArea cW;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void aT() {
        if (lIIllIIIIIIl(Skills.getLevel(Skill.FISHING), lIllIlIII[0])) {
            aj.ef();
        }
        if (lIIllIIIIIlI(Skills.getLevel(Skill.FISHING), lIllIlIII[0])) {
            if (lIIllIIIIIll(bt ? 1 : 0)) {
                C0001b.a(bv);
                if (lIIllIIIIIIl(bv.size(), lIllIlIII[1])) {
                    System.out.println(lIllIIlll[lIllIlIII[2]]);
                    bt = lIllIlIII[2];
                }
            }
            if (lIIllIIIIlII(bt ? 1 : 0)) {
                if (lIIllIIIIlII(ab() ? 1 : 0) && lIIllIIIIIIl(C0004e.j(dd), lIllIlIII[1])) {
                    String[] strArr = new String[lIllIlIII[1]];
                    strArr[lIllIlIII[2]] = lIllIIlll[lIllIlIII[1]];
                    if (lIIllIIIIlII(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIIllIIIIlIl(nearest) && lIIllIIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[3]];
                            C0000a.a(nearest);
                        }
                        if (lIIllIIIIlIl(nearest) && lIIllIIIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIllIIIIlII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, lIllIlIII[4]);
                                "".length();
                            }
                            if (lIIllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[5]];
                                if (lIIllIIIIllI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(lIllIlIII[6]);
                                    "".length();
                                }
                                if (lIIllIIIIllI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(lIllIlIII[3]);
                                    "".length();
                                }
                                int[] iArr = new int[lIllIlIII[7]];
                                iArr[lIllIlIII[2]] = lIllIlIII[8];
                                iArr[lIllIlIII[1]] = lIllIlIII[9];
                                iArr[lIllIlIII[3]] = lIllIlIII[10];
                                iArr[lIllIlIII[5]] = lIllIlIII[11];
                                iArr[lIllIlIII[6]] = lIllIlIII[12];
                                iArr[lIllIlIII[13]] = lIllIlIII[14];
                                iArr[lIllIlIII[15]] = lIllIlIII[16];
                                if (lIIllIIIIlII(C0004e.b(iArr) ? 1 : 0)) {
                                    af();
                                    System.out.println(lIllIIlll[lIllIlIII[6]]);
                                    bt = lIllIlIII[1];
                                    return;
                                }
                                int[] iArr2 = new int[lIllIlIII[15]];
                                iArr2[lIllIlIII[2]] = lIllIlIII[8];
                                iArr2[lIllIlIII[1]] = lIllIlIII[9];
                                iArr2[lIllIlIII[3]] = lIllIlIII[10];
                                iArr2[lIllIlIII[5]] = lIllIlIII[11];
                                iArr2[lIllIlIII[6]] = lIllIlIII[12];
                                iArr2[lIllIlIII[13]] = lIllIlIII[14];
                                if (lIIllIIIIIll(C0004e.b(iArr2) ? 1 : 0)) {
                                    C0000a.a(lIllIlIII[8], lIllIlIII[0]);
                                    C0000a.a(lIllIlIII[14], lIllIlIII[0]);
                                    C0000a.a(lIllIlIII[9], lIllIlIII[1]);
                                    C0000a.a(lIllIlIII[10], lIllIlIII[1]);
                                    C0000a.a(lIllIlIII[11], lIllIlIII[0]);
                                    C0000a.a(lIllIlIII[12], lIllIlIII[1]);
                                    C0000a.a(lIllIlIII[16], lIllIlIII[5]);
                                    C0000a.a(lIllIlIII[17], lIllIlIII[18]);
                                }
                            }
                        }
                    }
                }
                if (lIIllIIIIIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIllIIIIIIl(Movement.getRunEnergy(), lIllIlIII[19])) {
                    Inventory.getFirst(C0005f.aV).interact(lIllIIlll[lIllIlIII[13]]);
                    Time.sleepTicks(lIllIlIII[1]);
                    "".length();
                }
                if (lIIllIIIIIll(ab() ? 1 : 0) && lIIllIIIIIIl(C0004e.j(dd), lIllIlIII[1])) {
                    int[] iArr3 = new int[lIllIlIII[1]];
                    iArr3[lIllIlIII[2]] = lIllIlIII[20];
                    if (lIIllIIIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[0])) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[15]];
                            if (lIIllIIIIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(bX);
                            "".length();
                            Time.sleepTicks(lIllIlIII[1]);
                            "".length();
                        }
                        if (lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[21])) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[7]];
                            C0006g.a(lIllIIlll[lIllIlIII[22]], bR);
                        }
                    }
                }
                if (lIIllIIIlIIl(C0004e.j(dd), lIllIlIII[1])) {
                    int[] iArr4 = new int[lIllIlIII[1]];
                    iArr4[lIllIlIII[2]] = lIllIlIII[20];
                    if (lIIllIIIIIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[lIllIlIII[1]];
                        strArr2[lIllIlIII[2]] = lIllIIlll[lIllIlIII[23]];
                        if (lIIllIIIIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                            cl = lIllIlIII[2];
                            String[] strArr3 = new String[lIllIlIII[1]];
                            strArr3[lIllIlIII[2]] = lIllIIlll[lIllIlIII[0]];
                            if (lIIllIIIIlII(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(cZ), lIllIlIII[6])) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[24]];
                                    Movement.walkTo(cZ);
                                    "".length();
                                }
                                if (lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIllIlIII[6])) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[21]];
                                    String[] strArr4 = new String[lIllIlIII[1]];
                                    strArr4[lIllIlIII[2]] = lIllIIlll[lIllIlIII[25]];
                                    if (lIIllIIIIlII(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[lIllIlIII[1]];
                                        strArr5[lIllIlIII[2]] = lIllIIlll[lIllIlIII[26]];
                                        if (lIIllIIIIlIl(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[lIllIlIII[1]];
                                            strArr6[lIllIlIII[2]] = lIllIIlll[lIllIlIII[27]];
                                            TileObjects.getNearest(strArr6).interact(lIllIIlll[lIllIlIII[28]]);
                                            Time.sleepTicks(lIllIlIII[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[lIllIlIII[1]];
                            strArr7[lIllIlIII[2]] = lIllIIlll[lIllIlIII[29]];
                            if (lIIllIIIIIll(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIIllIIIIlII(cW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[30]];
                                    if (lIIllIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(dc);
                                        "".length();
                                        Time.sleepTicks(lIllIlIII[1]);
                                        "".length();
                                    }
                                    C0006g.a(bR);
                                }
                                if (lIIllIIIIIll(cW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[lIllIlIII[1]];
                                    strArr8[lIllIlIII[2]] = lIllIIlll[lIllIlIII[31]];
                                    if (lIIllIIIIIll(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[lIllIlIII[1]];
                                        strArr9[lIllIlIII[2]] = lIllIIlll[lIllIlIII[33]];
                                        if (lIIllIIIIlll(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), lIllIlIII[3])) {
                                            String[] strArr10 = new String[lIllIlIII[1]];
                                            strArr10[lIllIlIII[2]] = lIllIIlll[lIllIlIII[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIllIlIII[6]);
                                            "".length();
                                        }
                                        if (lIIllIIIIlII(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[lIllIlIII[1]];
                                            strArr11[lIllIlIII[2]] = lIllIIlll[lIllIlIII[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[lIllIlIII[1]];
                                            strArr12[lIllIlIII[2]] = lIllIIlll[lIllIlIII[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(lIllIlIII[3]);
                                            "".length();
                                        }
                                        C0006g.a(bR);
                                    }
                                    String[] strArr13 = new String[lIllIlIII[1]];
                                    strArr13[lIllIlIII[2]] = lIllIIlll[lIllIlIII[37]];
                                    if (lIIllIIIIlII(Inventory.contains(strArr13) ? 1 : 0) && lIIllIIIIlII(cX ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[38]];
                                        C0006g.a(lIllIIlll[lIllIlIII[20]], bR);
                                        if (lIIllIIIIIll(Dialog.getText().contains(lIllIIlll[lIllIlIII[39]]) ? 1 : 0)) {
                                            cX = lIllIlIII[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIllIIIlIIl(C0004e.j(dd), lIllIlIII[5])) {
                    String[] strArr14 = new String[lIllIlIII[1]];
                    strArr14[lIllIlIII[2]] = lIllIIlll[lIllIlIII[40]];
                    if (lIIllIIIIlII(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIllIlIII[1]];
                        strArr15[lIllIlIII[2]] = lIllIIlll[lIllIlIII[41]];
                        if (lIIllIIIIlII(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[42]];
                            int[] iArr5 = new int[lIllIlIII[1]];
                            iArr5[lIllIlIII[2]] = lIllIlIII[43];
                            NPCs.getNearest(iArr5).interact(lIllIIlll[lIllIlIII[44]]);
                            Time.sleepTicks(lIllIlIII[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[lIllIlIII[1]];
                    strArr16[lIllIlIII[2]] = lIllIIlll[lIllIlIII[45]];
                    if (lIIllIIIIIll(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[46]];
                        C0006g.a(lIllIIlll[lIllIlIII[47]], bR);
                    }
                }
                String[] strArr17 = new String[lIllIlIII[1]];
                strArr17[lIllIlIII[2]] = lIllIIlll[lIllIlIII[48]];
                if (lIIllIIIIIll(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIIllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[13])) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[49]];
                        Movement.walkTo(bX);
                        "".length();
                        Time.sleepTicks(lIllIlIII[1]);
                        "".length();
                    }
                    if (lIIllIIIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIlIII[13])) {
                        AccBuilderEasyClues.c = lIllIIlll[lIllIlIII[50]];
                        if (lIIllIIIIIIl(cl, lIllIlIII[1])) {
                            an.mQ += lIllIlIII[1];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIllIlIII[1];
                            an.mQ = lIllIlIII[2];
                            cm = lIllIlIII[2];
                        }
                        C0006g.a(lIllIIlll[lIllIlIII[51]], bR);
                    }
                }
            }
        }
    }

    private static String lIIlIllllIll(String llIllIIllIIIll, String llIllIIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(llIllIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIllIIllIIIlI.toCharArray();
        int llIllIIlIlllll = lIllIlIII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIII[2];
        while (lIIllIIIIIIl(i, length)) {
            char llIllIIllIIlII = charArray2[i];
            sb.append((char) (llIllIIllIIlII ^ charArray[llIllIIlIlllll % charArray.length]));
            "".length();
            llIllIIlIlllll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllIIIIlII(int i) {
        return i == 0;
    }

    private static void lIIlIlllllIl() {
        lIllIIlll = new String[lIllIlIII[86]];
        lIllIIlll[lIllIlIII[2]] = lIIlIllllIIl("+hMlZwLStNHPqcH3ohMipIpWwK2bJzRVI+mZX08lwrh29zgiITHSz9i7zIVFmsH1", "XCqnM");
        lIllIIlll[lIllIlIII[1]] = lIIlIllllIIl("iA3q6LSTH2crzKmPQygBbw==", "YNPwa");
        lIllIIlll[lIllIlIII[3]] = lIIlIllllIlI("uSQ0R5v6GI1tNc8Fj2ikxw==", "kbXUB");
        lIllIIlll[lIllIlIII[5]] = lIIlIllllIll("JBMMHCMFHAVYLQ0cCREhCw==", "lrbxO");
        lIllIIlll[lIllIlIII[6]] = lIIlIllllIlI("BWdkbfSGz5XOjIf6jyPFkH7nHmywsbgnuhfr1q2AyvY0pb6rQp6qMOWVo8otZSI9rc3mJwGxNvg=", "ozjAF");
        lIllIIlll[lIllIlIII[13]] = lIIlIllllIll("MD0dBRg=", "tOtks");
        lIllIIlll[lIllIlIII[15]] = lIIlIllllIIl("tptFommAGglzpJO1z1xo5Q==", "YhrRq");
        lIllIIlll[lIllIlIII[7]] = lIIlIllllIIl("ahMUZjbzq7BMhLNxEPBKdQ==", "cqHYj");
        lIllIIlll[lIllIlIII[22]] = lIIlIllllIIl("ktS1ND7wSJE=", "jJZpE");
        lIllIIlll[lIllIlIII[23]] = lIIlIllllIlI("vc07ILTEEBrz4cxZPI177A==", "zWbfP");
        lIllIIlll[lIllIlIII[0]] = lIIlIllllIlI("EZlNFFIMPHMxgZwLartSdg==", "EWKoR");
        lIllIIlll[lIllIlIII[24]] = lIIlIllllIIl("KEfEW+evHtgFchCyBUBM3A==", "BXtCl");
        lIllIIlll[lIllIlIII[21]] = lIIlIllllIlI("/KwfGcvXbHY=", "FADMd");
        lIllIIlll[lIllIlIII[25]] = lIIlIllllIIl("pE75UCmVfFZsrVFltGaOsQ==", "vLPzp");
        lIllIIlll[lIllIlIII[26]] = lIIlIllllIll("FS8vDw==", "CFAjN");
        lIllIIlll[lIllIlIII[27]] = lIIlIllllIlI("F6DoefFHm44=", "WdFhx");
        lIllIIlll[lIllIlIII[28]] = lIIlIllllIll("JRoKJi8=", "froED");
        lIllIIlll[lIllIlIII[29]] = lIIlIllllIlI("zaSJoMnquN7AHebrmZwK1g==", "UxFke");
        lIllIIlll[lIllIlIII[30]] = lIIlIllllIIl("0g/QugdLuddSqQpMwpOEJA==", "vqUiZ");
        lIllIIlll[lIllIlIII[31]] = lIIlIllllIIl("bseJJb4GANo=", "JDTVa");
        lIllIIlll[lIllIlIII[32]] = lIIlIllllIIl("9IwO71L7ptGannEipxxbQw==", "ISoxn");
        lIllIIlll[lIllIlIII[33]] = lIIlIllllIll("Fhs5CnAREyUD", "AzUfP");
        lIllIIlll[lIllIlIII[34]] = lIIlIllllIIl("tH7dkuS5WVAiFaGohQUmGw==", "YBdfK");
        lIllIIlll[lIllIlIII[35]] = lIIlIllllIlI("6sYZFWdxr7o=", "utCCi");
        lIllIIlll[lIllIlIII[36]] = lIIlIllllIlI("sFdd/jFsD9Z8/Zj3GBijiQ==", "GEvUG");
        lIllIIlll[lIllIlIII[37]] = lIIlIllllIll("EQMbFic1", "VbizN");
        lIllIIlll[lIllIlIII[38]] = lIIlIllllIll("CQ4zGg16GT0GDT8JJg==", "ZzRhy");
        lIllIIlll[lIllIlIII[20]] = lIIlIllllIIl("htFVkDxHANM=", "bYUvh");
        lIllIIlll[lIllIlIII[39]] = lIIlIllllIlI("Fu/w3QXnkWaiikv5Ffx+wyvIMCRd6X5Zs+7k8gJscDII3gAewIt+61zEFOLe/WR0", "GYEsj");
        lIllIIlll[lIllIlIII[40]] = lIIlIllllIll("HhI6FAM6", "YsHxj");
        lIllIIlll[lIllIlIII[41]] = lIIlIllllIIl("kFZDZUNSuixY8c+GJW4lcg==", "KqnTQ");
        lIllIIlll[lIllIlIII[42]] = lIIlIllllIIl("KoYHuoW/6uI=", "dylzo");
        lIllIIlll[lIllIlIII[44]] = lIIlIllllIll("LRkLNg==", "oxbBZ");
        lIllIIlll[lIllIlIII[45]] = lIIlIllllIlI("pBb5FL8zCDYiB6AntrVWhw==", "aoDLy");
        lIllIIlll[lIllIlIII[46]] = lIIlIllllIIl("TMNYjx5YMR0+LRBSW+UOxQ==", "aMJBR");
        lIllIIlll[lIllIlIII[47]] = lIIlIllllIll("NwwZPQU=", "ucwGj");
        lIllIIlll[lIllIlIII[48]] = lIIlIllllIll("JCInETsMLHQNIA07PAA=", "bKTyR");
        lIllIIlll[lIllIlIII[49]] = lIIlIllllIll("PDI+ej0dczsuKAAn", "rSHZI");
        lIllIIlll[lIllIlIII[50]] = lIIlIllllIlI("EgvNSkOunGZAo9ba9joiMw==", "peSOR");
        lIllIIlll[lIllIlIII[51]] = lIIlIllllIIl("Boh1ycvXA7c=", "RlvKQ");
        lIllIIlll[lIllIlIII[52]] = lIIlIllllIll("MyApMgQfNWQjDRwkNDgaBA==", "pADWh");
        lIllIIlll[lIllIlIII[53]] = lIIlIllllIIl("C2tfpGVTRR8=", "pfWQM");
        lIllIIlll[lIllIlIII[54]] = lIIlIllllIll("AwoELgA=", "PzeJe");
        lIllIIlll[lIllIlIII[55]] = lIIlIllllIIl("sDSBcN8YGJEp4/0Tsqa9Ig==", "OnYkV");
        lIllIIlll[lIllIlIII[56]] = lIIlIllllIll("EgcdHSo6CU4XIj0a", "TnnuC");
        lIllIIlll[lIllIlIII[63]] = lIIlIllllIIl("/hIv8odp/5w5Zr/m/5+mgA==", "eVKNp");
        lIllIIlll[lIllIlIII[64]] = lIIlIllllIlI("znuc0GsBfUE6KdLJQE1u5BJ7H+2rMctM", "vAYmK");
        lIllIIlll[lIllIlIII[67]] = lIIlIllllIIl("n2KffEEQ1lxgg3CPtro+haIvH4oorWTKHp7teZaAoJ3M3B+4lhyhQ1Uqngc+eEz9", "pShCN");
        lIllIIlll[lIllIlIII[68]] = lIIlIllllIlI("mfYzZno5g0dlndOuzSVpgg==", "klDWD");
        lIllIIlll[lIllIlIII[69]] = lIIlIllllIlI("UubmqbZTI7WpVunInldKZvtUESeO3f20IY3DQfPFiwsOQwO+jGVrOrNIpsQ0ue0T", "ArquO");
        lIllIIlll[lIllIlIII[19]] = lIIlIllllIlI("uv3DdxdhFc/0EKx9rqRwPQM65gg764N/", "OnLkA");
        lIllIIlll[lIllIlIII[70]] = lIIlIllllIIl("2ca2b26mDnrD3Idhj2x3ND6Y5SfTosjesfPeHC4AN4Q=", "CyADw");
        lIllIIlll[lIllIlIII[71]] = lIIlIllllIlI("b/7t0JYBMsC5iv9WBgDhVPV5yfPDK61yuSZur2HmZmQrdDbc0uyVAw==", "gKdti");
        lIllIIlll[lIllIlIII[72]] = lIIlIllllIlI("iVGD83LR3sABIvUGAF5ax+HwyuRv7sHgh54/lIyKXBFFw2OugSYN4fRDkMdDAvxp", "OETLV");
        lIllIIlll[lIllIlIII[73]] = lIIlIllllIIl("ejN2xupb1Ic=", "xnuVP");
    }

    private static boolean lIIllIIIIlIl(Object obj) {
        return obj != null;
    }

    private static void lIIllIIIIIII() {
        lIllIlIII = new int[87];
        lIllIlIII[0] = (((66 + 25) - (-46)) + 35) ^ (((51 + 68) - 66) + 113);
        lIllIlIII[1] = " ".length();
        lIllIlIII[2] = (118 ^ 49) & ((49 ^ 118) ^ (-1));
        lIllIlIII[3] = "  ".length();
        lIllIlIII[4] = (-((-2098) & 26743)) & (-3073) & 32717;
        lIllIlIII[5] = "   ".length();
        lIllIlIII[6] = 153 ^ 157;
        lIllIlIII[7] = 42 ^ 45;
        lIllIlIII[8] = (-16537) & 24543;
        lIllIlIII[9] = (-((-651) & 27343)) & (-4) & 27647;
        lIllIlIII[10] = (-((-5159) & 14055)) & (-6157) & 15359;
        lIllIlIII[11] = (-10375) & 10687;
        lIllIlIII[12] = (-((-1562) & 32635)) & (-145) & 32767;
        lIllIlIII[13] = (51 ^ 81) ^ (239 ^ 136);
        lIllIlIII[14] = (-8198) & 16207;
        lIllIlIII[15] = 183 ^ 177;
        lIllIlIII[16] = (-17549) & 30173;
        lIllIlIII[17] = (-7189) & 8183;
        lIllIlIII[18] = (-10262) & 11261;
        lIllIlIII[19] = (41 ^ 47) ^ (183 ^ 131);
        lIllIlIII[20] = (168 ^ 167) ^ (57 ^ 45);
        lIllIlIII[21] = (27 ^ 20) ^ "   ".length();
        lIllIlIII[22] = 1 ^ 9;
        lIllIlIII[23] = (47 ^ 32) ^ (168 ^ 174);
        lIllIlIII[24] = 171 ^ 160;
        lIllIlIII[25] = (((57 + 117) - 124) + 79) ^ (((35 + 132) - 75) + 48);
        lIllIlIII[26] = (((83 + 123) - 99) + 58) ^ (((138 + 7) - 17) + 43);
        lIllIlIII[27] = 163 ^ 172;
        lIllIlIII[28] = (((64 + 83) - 99) + 137) ^ (((115 + 68) - 179) + 165);
        lIllIlIII[29] = 146 ^ 131;
        lIllIlIII[30] = 102 ^ 116;
        lIllIlIII[31] = 51 ^ 32;
        lIllIlIII[32] = 26 ^ 14;
        lIllIlIII[33] = (162 ^ 177) ^ (144 ^ 150);
        lIllIlIII[34] = (((9 + 112) - 1) + 10) ^ (((18 + 120) - 63) + 73);
        lIllIlIII[35] = 36 ^ 51;
        lIllIlIII[36] = 74 ^ 82;
        lIllIlIII[37] = 33 ^ 56;
        lIllIlIII[38] = 120 ^ 98;
        lIllIlIII[39] = 142 ^ 146;
        lIllIlIII[40] = (57 ^ 99) ^ (132 ^ 195);
        lIllIlIII[41] = (((74 + 41) - 19) + 44) ^ (((130 + 37) - 43) + 22);
        lIllIlIII[42] = (73 ^ 45) ^ (104 ^ 19);
        lIllIlIII[43] = (-4101) & 8180;
        lIllIlIII[44] = (120 ^ 127) ^ (68 ^ 99);
        lIllIlIII[45] = (((11 + 132) - (-34)) + 4) ^ (((45 + 17) - (-16)) + 70);
        lIllIlIII[46] = (21 ^ 68) ^ (247 ^ 132);
        lIllIlIII[47] = 26 ^ 57;
        lIllIlIII[48] = 82 ^ 118;
        lIllIlIII[49] = 138 ^ 175;
        lIllIlIII[50] = (8 ^ 36) ^ (207 ^ 197);
        lIllIlIII[51] = (28 ^ 97) ^ (22 ^ 76);
        lIllIlIII[52] = (169 ^ 139) ^ (47 ^ 37);
        lIllIlIII[53] = 104 ^ 65;
        lIllIlIII[54] = 7 ^ 45;
        lIllIlIII[55] = 81 ^ 122;
        lIllIlIII[56] = 20 ^ 56;
        lIllIlIII[57] = (-22728) & 31727;
        lIllIlIII[58] = (-((-645) & 13965)) & (-16386) & 30205;
        lIllIlIII[59] = (-((-169) & 16826)) & (-1) & 28637;
        lIllIlIII[60] = (-((-16772) & 24023)) & (-517) & 32767;
        lIllIlIII[61] = (-27675) & 28574;
        lIllIlIII[62] = 76 ^ 40;
        lIllIlIII[63] = (24 ^ 22) ^ (106 ^ 73);
        lIllIlIII[64] = 161 ^ 143;
        lIllIlIII[65] = (-4) & 2635;
        lIllIlIII[66] = (-((-939) & 29615)) & (-129) & 32238;
        lIllIlIII[67] = 102 ^ 73;
        lIllIlIII[68] = 134 ^ 182;
        lIllIlIII[69] = (216 ^ 158) ^ (26 ^ 109);
        lIllIlIII[70] = (((73 + 101) - 128) + 90) ^ (((3 + 155) - 66) + 95);
        lIllIlIII[71] = (181 ^ 189) ^ (107 ^ 87);
        lIllIlIII[72] = 128 ^ 181;
        lIllIlIII[73] = 50 ^ 4;
        lIllIlIII[74] = (-8241) & 11059;
        lIllIlIII[75] = (-((-3457) & 32708)) & (-9) & 32747;
        lIllIlIII[76] = (-((-5757) & 30589)) & (-1053) & 28543;
        lIllIlIII[77] = (-20497) & 23996;
        lIllIlIII[78] = (-((-23063) & 32671)) & (-20513) & 32751;
        lIllIlIII[79] = (-24586) & 28079;
        lIllIlIII[80] = (-((-19) & 5430)) & (-16385) & 24439;
        lIllIlIII[81] = (-4226) & 7667;
        lIllIlIII[82] = (-((-4525) & 29117)) & (-5249) & 32478;
        lIllIlIII[83] = (-137) & 3581;
        lIllIlIII[84] = (-24579) & 27219;
        lIllIlIII[85] = (-((-16647) & 29591)) & (-16385) & 32767;
        lIllIlIII[86] = (125 ^ 17) ^ (232 ^ 179);
    }

    private static void af() {
        int[] iArr = new int[lIllIlIII[1]];
        iArr[lIllIlIII[2]] = lIllIlIII[12];
        if (lIIllIIIIlII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[12], lIllIlIII[1], lIllIlIII[57]));
            "".length();
        }
        int[] iArr2 = new int[lIllIlIII[1]];
        iArr2[lIllIlIII[2]] = lIllIlIII[10];
        if (lIIllIIIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[10], lIllIlIII[1], lIllIlIII[4]));
            "".length();
        }
        int[] iArr3 = new int[lIllIlIII[1]];
        iArr3[lIllIlIII[2]] = lIllIlIII[9];
        if (lIIllIIIIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[9], lIllIlIII[1], lIllIlIII[4]));
            "".length();
        }
        int[] iArr4 = new int[lIllIlIII[1]];
        iArr4[lIllIlIII[2]] = lIllIlIII[14];
        if (lIIllIIIIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[14], lIllIlIII[24], lIllIlIII[4]));
            "".length();
        }
        int[] iArr5 = new int[lIllIlIII[1]];
        iArr5[lIllIlIII[2]] = lIllIlIII[16];
        if (lIIllIIIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[16], lIllIlIII[24], C0008i.bq));
            "".length();
        }
        int[] iArr6 = new int[lIllIlIII[1]];
        iArr6[lIllIlIII[2]] = lIllIlIII[11];
        if (lIIllIIIIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[11], lIllIlIII[0], lIllIlIII[58]));
            "".length();
        }
        if (lIIllIIIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIIlll[lIllIlIII[64]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[59], lIllIlIII[13], lIllIlIII[60]));
            "".length();
        }
        int[] iArr7 = new int[lIllIlIII[1]];
        iArr7[lIllIlIII[2]] = lIllIlIII[8];
        if (lIIllIIIIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIllIlIII[8], lIllIlIII[52], lIllIlIII[61]));
            "".length();
        }
    }

    private static boolean lIIllIIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIIllI(int i) {
        return i > 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aT();
            "".length();
            if (" ".length() < ((56 ^ 54) & ((42 ^ 36) ^ (-1)))) {
                return (67 ^ 10) & ((250 ^ 179) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIlIII[62];
    }

    private static String lIIlIllllIlI(String llIllIIlIIlllI, String llIllIIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIIlIlIIII = Cipher.getInstance("Blowfish");
            llIllIIlIlIIII.init(lIllIlIII[3], secretKeySpec);
            return new String(llIllIIlIlIIII.doFinal(Base64.getDecoder().decode(llIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIlIIlIlI) {
            llIllIIlIIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIllIlIII[2];
    }

    private static boolean lIIllIIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllIIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIllIlIII[1]];
        iArr[lIllIlIII[2]] = lIllIlIII[8];
        if (lIIllIIIIllI(Inventory.getCount(iArr))) {
            String[] strArr = new String[lIllIlIII[1]];
            strArr[lIllIlIII[2]] = lIllIIlll[lIllIlIII[52]];
            if (lIIllIIIIllI(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[lIllIlIII[1]];
                strArr2[lIllIlIII[2]] = lIllIIlll[lIllIlIII[53]];
                if (lIIllIIIIllI(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[lIllIlIII[1]];
                    strArr3[lIllIlIII[2]] = lIllIIlll[lIllIlIII[54]];
                    if (lIIllIIIIllI(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[lIllIlIII[1]];
                        strArr4[lIllIlIII[2]] = lIllIIlll[lIllIlIII[55]];
                        if (lIIllIIIIllI(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[lIllIlIII[1]];
                            strArr5[lIllIlIII[2]] = lIllIIlll[lIllIlIII[56]];
                            if (lIIllIIIIllI(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[lIllIlIII[1]];
                                iArr2[lIllIlIII[2]] = lIllIlIII[17];
                                if (lIIllIIIIllI(Inventory.getCount(iArr2)) && lIIllIIIIIll(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                                    ?? r0 = lIllIlIII[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIllIlIII[2];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIllIIlll[lIllIlIII[63]];
    }

    private static boolean lIIllIIIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIIIlIII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIIllIIIIIII();
        lIIlIlllllIl();
        bv = new ArrayList();
        cW = new WorldArea(lIllIlIII[65], lIllIlIII[66], lIllIlIII[24], lIllIlIII[25], lIllIlIII[2]);
        String[] strArr = new String[lIllIlIII[22]];
        strArr[lIllIlIII[2]] = lIllIIlll[lIllIlIII[67]];
        strArr[lIllIlIII[1]] = lIllIIlll[lIllIlIII[68]];
        strArr[lIllIlIII[3]] = lIllIIlll[lIllIlIII[69]];
        strArr[lIllIlIII[5]] = lIllIIlll[lIllIlIII[19]];
        strArr[lIllIlIII[6]] = lIllIIlll[lIllIlIII[70]];
        strArr[lIllIlIII[13]] = lIllIIlll[lIllIlIII[71]];
        strArr[lIllIlIII[15]] = lIllIIlll[lIllIlIII[72]];
        strArr[lIllIlIII[7]] = lIllIIlll[lIllIlIII[73]];
        bR = strArr;
        bX = new WorldPoint(lIllIlIII[74], lIllIlIII[75], lIllIlIII[2]);
        cY = new WorldPoint(lIllIlIII[76], lIllIlIII[77], lIllIlIII[2]);
        cZ = new WorldPoint(lIllIlIII[78], lIllIlIII[79], lIllIlIII[2]);
        da = new WorldPoint(lIllIlIII[80], lIllIlIII[81], lIllIlIII[2]);
        db = new WorldPoint(lIllIlIII[82], lIllIlIII[83], lIllIlIII[2]);
        dc = new WorldPoint(lIllIlIII[84], lIllIlIII[85], lIllIlIII[2]);
        dd = lIllIlIII[24];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIllIIIIIlI(C0004e.j(dd), lIllIlIII[13])) {
            ?? r0 = lIllIlIII[1];
            "".length();
            return "  ".length() < (-" ".length()) ? ((189 ^ 153) ^ (250 ^ 191)) & (((((110 + 189) - 212) + 121) ^ (((174 + 145) - 183) + 41)) ^ (-" ".length())) : r0;
        }
        return lIllIlIII[2];
    }

    private static String lIIlIllllIIl(String llIllIIlIIIIIl, String llIllIIlIIIIII) {
        try {
            SecretKeySpec llIllIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIlIIIIII.getBytes(StandardCharsets.UTF_8)), lIllIlIII[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIII[3], llIllIIlIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIlIIIIlI) {
            llIllIIlIIIIlI.printStackTrace();
            return null;
        }
    }
}
