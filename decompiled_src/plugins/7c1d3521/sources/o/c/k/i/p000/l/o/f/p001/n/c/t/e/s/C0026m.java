package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/m.class */
public class C0026m implements InterfaceC0003ac {
    public static /* synthetic */ boolean ci;
    private static /* synthetic */ int[] lIllllIlll;
    static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ String[] lIllllIllI;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ WorldArea cj;
    static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ boolean bt;

    private static boolean lIlIIIIIlIlII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (lIlIIIIIlIIlI(Vars.getBit(lIllllIlll[48]), lIllllIlll[1]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (lIlIIIIIlIIlI(Vars.getBit(lIllllIlll[48]), lIllllIlll[2]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31]) && lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[17])) {
            return lIllllIlll[1];
        }
        if (lIlIIIIIlIIlI(Vars.getBit(lIllllIlll[48]), lIllllIlll[3]) && lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[36])) {
            return lIllllIlll[1];
        }
        if (lIlIIIIIlIIlI(Vars.getBit(lIllllIlll[48]), lIllllIlll[3]) && lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31])) {
            int[] iArr = new int[lIllllIlll[1]];
            iArr[lIllllIlll[0]] = lIllllIlll[12];
            if (lIlIIIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        if (lIlIIIIIlIIlI(Vars.getBit(lIllllIlll[48]), lIllllIlll[5]) && lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[36])) {
            int[] iArr2 = new int[lIllllIlll[1]];
            iArr2[lIllllIlll[0]] = lIllllIlll[12];
            if (lIlIIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIllllIlll[1];
            }
        }
        return lIllllIlll[0];
    }

    public static void aq() {
        if (lIlIIIIIIllll(Widgets.get(lIllllIlll[49], lIllllIlll[50]))) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[51]];
            Widgets.get(lIllllIlll[49], lIllllIlll[50]).interact(lIllllIllI[lIllllIlll[52]]);
            Time.sleepTicks(lIllllIlll[5]);
            "".length();
        }
        if (lIlIIIIIlIlIl(Widgets.get(lIllllIlll[49], lIllllIlll[50])) && lIlIIIIIIlllI(Widgets.get(lIllllIlll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIllllIlll[1]);
            "".length();
            if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get(lIllllIlll[53], lIllllIlll[1]).getChild(lIllllIlll[1]).interact(lIllllIllI[lIllllIlll[54]]);
            }
            if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31]) && lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[17])) {
                Widgets.get(lIllllIlll[53], lIllllIlll[1]).getChild(lIllllIlll[2]).interact(lIllllIllI[lIllllIlll[55]]);
            }
            if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[36])) {
                Widgets.get(lIllllIlll[53], lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[19]]);
            }
            if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[31])) {
                int[] iArr = new int[lIllllIlll[1]];
                iArr[lIllllIlll[0]] = lIllllIlll[12];
                if (lIlIIIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIllllIlll[53], lIllllIlll[1]).getChild(lIllllIlll[3]).interact(lIllllIllI[lIllllIlll[50]]);
                }
            }
            if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[36])) {
                int[] iArr2 = new int[lIllllIlll[1]];
                iArr2[lIllllIlll[0]] = lIllllIlll[12];
                if (lIlIIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIllllIlll[53], lIllllIlll[1]).getChild(lIllllIlll[5]).interact(lIllllIllI[lIllllIlll[56]]);
                }
            }
            Time.sleepTicks(lIllllIlll[1]);
            "".length();
        }
    }

    private static String lIlIIIIIIlIII(String llllllllllllllllllIlllIIlIIIIIlI, String llllllllllllllllllIlllIIlIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIlIIIIlIl) {
            llllllllllllllllllIlllIIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIIIIIIlIlI() {
        lIllllIllI = new String[lIllllIlll[25]];
        lIllllIllI[lIllllIlll[0]] = lIlIIIIIIIlll("tjmSghPxcdd8zdSNj3r3ag==", "kSFWb");
        lIllllIllI[lIllllIlll[1]] = lIlIIIIIIlIII("MQA1sl+ffv26Ft1NPEY1o05aTtRg3Q3yznM4tdQRUPIN4OJcRDwjGN5hf3yY0Trj5b806jXgOFI=", "arHKd");
        lIllllIllI[lIllllIlll[2]] = lIlIIIIIIIlll("JBmKyFrH22KDuuLQ9K+ZErK/iA9b8BEj", "NaWKp");
        lIllllIllI[lIllllIlll[3]] = lIlIIIIIIlIII("DF+N0v2rvZ/R8PXE0djKwz6MgMWzyYnZ", "sPKVT");
        lIllllIllI[lIllllIlll[5]] = lIlIIIIIIlIIl("HCFWGQAuZBsRATgtGB9SODEGCB4iIQVUUjgzHwwRIy0YH1I/K1Y6JxINOD8=", "KDvxr");
        lIllllIllI[lIllllIlll[17]] = lIlIIIIIIIlll("p93LQORGb5sG73p9QD8iXg==", "Eipwk");
        lIllllIllI[lIllllIlll[24]] = lIlIIIIIIIlll("Kv7NhJxSVz4oy8bU5UKFOA==", "NqQcK");
        lIllllIllI[lIllllIlll[26]] = lIlIIIIIIlIII("zPZGQEyEjb0dE0LpTyPif2tByJf0PGqU", "lyvXC");
        lIllllIllI[lIllllIlll[29]] = lIlIIIIIIIlll("9xLN6NPdL2RM0Wzf7C7DtQiSDMfnmhMr", "ydYKm");
        lIllllIllI[lIllllIlll[31]] = lIlIIIIIIIlll("eJSKnwqY/rPdb0FubryZ6AW7nYZBKDce", "butDP");
        lIllllIllI[lIllllIlll[32]] = lIlIIIIIIIlll("t+EgauqlI2SYdoj1PZ7M7JZGrgz0c1Xd", "xXvMS");
        lIllllIllI[lIllllIlll[33]] = lIlIIIIIIlIII("0lLvRe5ibmg=", "FTGAN");
        lIllllIllI[lIllllIlll[34]] = lIlIIIIIIlIIl("GCgGAS4=", "OAcmJ");
        lIllllIllI[lIllllIlll[36]] = lIlIIIIIIIlll("gbRgHLzr48zYLNJ3FrlPHl+uV95+zyJU", "OJHbx");
        lIllllIllI[lIllllIlll[40]] = lIlIIIIIIlIIl("PxsRWSAeWgQWIwI=", "qzgyT");
        lIllllIllI[lIllllIlll[41]] = lIlIIIIIIlIIl("JhUH", "ctsSd");
        lIllllIllI[lIllllIlll[42]] = lIlIIIIIIlIIl("Jg4x", "eaFkU");
        lIllllIllI[lIllllIlll[43]] = lIlIIIIIIlIIl("OQ4y", "ZaEEe");
        lIllllIllI[lIllllIlll[45]] = lIlIIIIIIlIII("kQdRFnCekePulT15uM5ahg==", "oAiVi");
        lIllllIllI[lIllllIlll[46]] = lIlIIIIIIIlll("frJUFzzjGn8=", "XHvrR");
        lIllllIllI[lIllllIlll[47]] = lIlIIIIIIlIIl("OS1hMy4dISAk", "pCAPA");
        lIllllIllI[lIllllIlll[51]] = lIlIIIIIIlIII("tgT2i/B65y0DMthPFP/OxroWqGVYEFjC", "zNCin");
        lIllllIllI[lIllllIlll[52]] = lIlIIIIIIIlll("uUvHtVpvbfxavA1kRVzDuw==", "CwYTK");
        lIllllIllI[lIllllIlll[54]] = lIlIIIIIIIlll("CFiwKdTwkvBIzUrc46cw7w==", "oRnvF");
        lIllllIllI[lIllllIlll[55]] = lIlIIIIIIlIII("T43jHbgQp28CpQkyPF+D6w==", "hCmTi");
        lIllllIllI[lIllllIlll[19]] = lIlIIIIIIlIIl("CColJC1tGCMiLCYu", "MKWPE");
        lIllllIllI[lIllllIlll[50]] = lIlIIIIIIIlll("o42pJJp5xInCwnTY84WvSQ==", "kXhRJ");
        lIllllIllI[lIllllIlll[56]] = lIlIIIIIIlIIl("CCUgD3odOCADMSs=", "NLRjZ");
        lIllllIllI[lIllllIlll[72]] = lIlIIIIIIlIIl("AiooHzRvPz0XPiEiIRE=", "OKOvW");
        lIllllIllI[lIllllIlll[74]] = lIlIIIIIIlIII("aAtfx+08e8EUIOaNFA4hAwSLnSSc6SaK", "hEhRE");
        lIllllIllI[lIllllIlll[75]] = lIlIIIIIIlIIl("Lx8a", "lpmXN");
    }

    private static void Q() {
        if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
            int[] iArr = new int[lIllllIlll[1]];
            iArr[lIllllIlll[0]] = lIllllIlll[14];
            if (lIlIIIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[14], lIllllIlll[57], lIllllIlll[58]));
                "".length();
            }
            int[] iArr2 = new int[lIllllIlll[1]];
            iArr2[lIllllIlll[0]] = lIllllIlll[7];
            if (lIlIIIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[7], lIllllIlll[59], lIllllIlll[24]));
                "".length();
            }
            int[] iArr3 = new int[lIllllIlll[1]];
            iArr3[lIllllIlll[0]] = lIllllIlll[9];
            if (lIlIIIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[9], lIllllIlll[60], lIllllIlll[24]));
                "".length();
            }
            int[] iArr4 = new int[lIllllIlll[1]];
            iArr4[lIllllIlll[0]] = lIllllIlll[11];
            if (lIlIIIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[11], lIllllIlll[61], lIllllIlll[24]));
                "".length();
            }
            int[] iArr5 = new int[lIllllIlll[1]];
            iArr5[lIllllIlll[0]] = lIllllIlll[12];
            if (lIlIIIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[12], lIllllIlll[4], lIllllIlll[24]));
                "".length();
            }
            int[] iArr6 = new int[lIllllIlll[1]];
            iArr6[lIllllIlll[0]] = lIllllIlll[44];
            if (lIlIIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[44], lIllllIlll[1], C0018e.c(lIllllIlll[62], lIllllIlll[63])));
                "".length();
            }
        }
        if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
            int[] iArr7 = new int[lIllllIlll[1]];
            iArr7[lIllllIlll[0]] = lIllllIlll[22];
            if (lIlIIIIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllllIlll[1]];
                iArr8[lIllllIlll[0]] = lIllllIlll[22];
                if (lIlIIIIIIllIl(Bank.getFirst(iArr8).getQuantity(), lIllllIlll[61])) {
                    int i = lIllllIlll[22];
                    int i2 = lIllllIlll[61];
                    int[] iArr9 = new int[lIllllIlll[1]];
                    iArr9[lIllllIlll[0]] = lIllllIlll[22];
                    bv.add(new C0017d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIllllIlll[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIllllIlll[1]];
            iArr10[lIllllIlll[0]] = lIllllIlll[22];
            if (lIlIIIIIIlllI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[22], lIllllIlll[61], lIllllIlll[64]));
                "".length();
            }
            int[] iArr11 = new int[lIllllIlll[1]];
            iArr11[lIllllIlll[0]] = lIllllIlll[23];
            if (lIlIIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIllllIlll[1]];
                iArr12[lIllllIlll[0]] = lIllllIlll[23];
                if (lIlIIIIIIllIl(Bank.getFirst(iArr12).getQuantity(), lIllllIlll[61])) {
                    int i3 = lIllllIlll[23];
                    int i4 = lIllllIlll[61];
                    int[] iArr13 = new int[lIllllIlll[1]];
                    iArr13[lIllllIlll[0]] = lIllllIlll[23];
                    bv.add(new C0017d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIllllIlll[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIllllIlll[1]];
            iArr14[lIllllIlll[0]] = lIllllIlll[23];
            if (lIlIIIIIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(lIllllIlll[23], lIllllIlll[61], lIllllIlll[65]));
                "".length();
            }
            int[] iArr15 = new int[lIllllIlll[1]];
            iArr15[lIllllIlll[0]] = lIllllIlll[20];
            if (lIlIIIIIIlllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIllllIlll[1]];
                iArr16[lIllllIlll[0]] = lIllllIlll[20];
                if (lIlIIIIIIlllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllIlll[20], lIllllIlll[1], lIllllIlll[66]));
                    "".length();
                }
            }
            if (lIlIIIIIIllII(ci ? 1 : 0)) {
                int[] iArr17 = new int[lIllllIlll[1]];
                iArr17[lIllllIlll[0]] = lIllllIlll[14];
                if (lIlIIIIIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIllllIlll[1]];
                    iArr18[lIllllIlll[0]] = lIllllIlll[14];
                    if (lIlIIIIIIllIl(Bank.getFirst(iArr18).getQuantity(), lIllllIlll[61])) {
                        int i5 = lIllllIlll[14];
                        int i6 = lIllllIlll[61];
                        int[] iArr19 = new int[lIllllIlll[1]];
                        iArr19[lIllllIlll[0]] = lIllllIlll[14];
                        bv.add(new C0017d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIllllIlll[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIllllIlll[1]];
                iArr20[lIllllIlll[0]] = lIllllIlll[14];
                if (lIlIIIIIIlllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllIlll[14], lIllllIlll[61], lIllllIlll[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIllllIlll[1]];
                iArr21[lIllllIlll[0]] = lIllllIlll[21];
                if (lIlIIIIIIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllIlll[1]];
                    iArr22[lIllllIlll[0]] = lIllllIlll[21];
                    if (lIlIIIIIIllIl(Bank.getFirst(iArr22).getQuantity(), lIllllIlll[66])) {
                        int i7 = lIllllIlll[21];
                        int i8 = lIllllIlll[66];
                        int[] iArr23 = new int[lIllllIlll[1]];
                        iArr23[lIllllIlll[0]] = lIllllIlll[21];
                        bv.add(new C0017d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIllllIlll[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIllllIlll[1]];
                iArr24[lIllllIlll[0]] = lIllllIlll[21];
                if (lIlIIIIIIlllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0017d(lIllllIlll[21], lIllllIlll[66], lIllllIlll[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIllllIlll[1]];
        iArr25[lIllllIlll[0]] = lIllllIlll[18];
        if (lIlIIIIIIlllI(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIlll[18], lIllllIlll[67], lIllllIlll[37]));
            "".length();
        }
        if (lIlIIIIIIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllllIllI[lIllllIlll[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIlll[68], lIllllIlll[17], lIllllIlll[69]));
            "".length();
        }
        int[] iArr26 = new int[lIllllIlll[1]];
        iArr26[lIllllIlll[0]] = lIllllIlll[70];
        if (lIlIIIIIIlllI(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIlll[70], lIllllIlll[32], lIllllIlll[71]));
            "".length();
        }
        int[] iArr27 = new int[lIllllIlll[1]];
        iArr27[lIllllIlll[0]] = lIllllIlll[16];
        if (lIlIIIIIIlllI(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0017d(lIllllIlll[16], lIllllIlll[32], lIllllIlll[71]));
            "".length();
        }
    }

    private static boolean lIlIIIIIIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dd, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0276, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0345, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ao() {
        if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19])) {
            int[] iArr = new int[lIllllIlll[1]];
            iArr[lIllllIlll[0]] = lIllllIlll[7];
            if (lIlIIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllIlll[1]];
                iArr2[lIllllIlll[0]] = lIllllIlll[11];
                if (lIlIIIIIIllII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllllIlll[1]];
                    iArr3[lIllllIlll[0]] = lIllllIlll[9];
                    if (lIlIIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllllIlll[1]];
                        iArr4[lIllllIlll[0]] = lIllllIlll[12];
                        if (lIlIIIIIIllII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIllllIlll[1]];
                            iArr5[lIllllIlll[0]] = lIllllIlll[18];
                            if (lIlIIIIIIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllIlll[1]];
                                iArr6[lIllllIlll[0]] = lIllllIlll[44];
                                if (lIlIIIIIIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIllllIlll[1]];
                                    iArr7[lIllllIlll[0]] = lIllllIlll[44];
                                }
                                ?? r0 = lIllllIlll[1];
                                "".length();
                                return " ".length() > "   ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
            int[] iArr8 = new int[lIllllIlll[1]];
            iArr8[lIllllIlll[0]] = lIllllIlll[11];
            if (lIlIIIIIIllII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIllllIlll[1]];
                iArr9[lIllllIlll[0]] = lIllllIlll[9];
                if (lIlIIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIllllIlll[1]];
                    iArr10[lIllllIlll[0]] = lIllllIlll[12];
                    if (lIlIIIIIIllII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIllllIlll[1]];
                        iArr11[lIllllIlll[0]] = lIllllIlll[14];
                        if (lIlIIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIllllIlll[1]];
                            iArr12[lIllllIlll[0]] = lIllllIlll[44];
                            if (lIlIIIIIIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIllllIlll[1]];
                                iArr13[lIllllIlll[0]] = lIllllIlll[44];
                            }
                            ?? r02 = lIllllIlll[1];
                            "".length();
                            return " ".length() == 0 ? ((107 ^ 82) ^ (28 ^ 49)) & (((((99 + 111) - 121) + 45) ^ (((64 + 53) - 78) + 107)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6]) && lIlIIIIIIlllI(ci ? 1 : 0)) {
            int[] iArr14 = new int[lIllllIlll[1]];
            iArr14[lIllllIlll[0]] = lIllllIlll[20];
            if (lIlIIIIIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIllllIlll[1]];
                iArr15[lIllllIlll[0]] = lIllllIlll[20];
            }
            int[] iArr16 = new int[lIllllIlll[1]];
            iArr16[lIllllIlll[0]] = lIllllIlll[22];
            if (lIlIIIIIIllII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIllllIlll[1]];
                iArr17[lIllllIlll[0]] = lIllllIlll[23];
                if (lIlIIIIIIllII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIllllIlll[1];
                    "".length();
                    return ((121 ^ 92) & ((45 ^ 8) ^ (-1))) < ((201 ^ 195) & ((120 ^ 114) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6]) && lIlIIIIIIllII(ci ? 1 : 0)) {
            int[] iArr18 = new int[lIllllIlll[1]];
            iArr18[lIllllIlll[0]] = lIllllIlll[20];
            if (lIlIIIIIIlllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIllllIlll[1]];
                iArr19[lIllllIlll[0]] = lIllllIlll[20];
            }
            int[] iArr20 = new int[lIllllIlll[1]];
            iArr20[lIllllIlll[0]] = lIllllIlll[14];
            if (lIlIIIIIIllII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIllllIlll[1]];
                iArr21[lIllllIlll[0]] = lIllllIlll[21];
                if (lIlIIIIIIllII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllIlll[1]];
                    iArr22[lIllllIlll[0]] = lIllllIlll[21];
                    if (lIlIIIIIlIIIl(Bank.getFirst(iArr22).getQuantity(), lIllllIlll[17])) {
                        int[] iArr23 = new int[lIllllIlll[1]];
                        iArr23[lIllllIlll[0]] = lIllllIlll[22];
                        if (lIlIIIIIIllII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIllllIlll[1]];
                            iArr24[lIllllIlll[0]] = lIllllIlll[23];
                            if (lIlIIIIIIllII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIllllIlll[1];
                                "".length();
                                return (-"   ".length()) > 0 ? ((((127 + 70) - 174) + 199) ^ (((8 + 99) - 97) + 181)) & (((((29 + 35) - (-63)) + 37) ^ (((1 + 18) - (-162)) + 16)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else {
            return lIllllIlll[0];
        }
    }

    private static String lIlIIIIIIIlll(String llllllllllllllllllIlllIIlIlIlIIl, String llllllllllllllllllIlllIIlIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllllIlllIIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), lIllllIlll[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIlll[2], llllllllllllllllllIlllIIlIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllIIlIlIlIlI) {
            llllllllllllllllllIlllIIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x022b, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cf, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0385, code lost:
        if (lIlIIIIIIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19])) {
            int[] iArr = new int[lIllllIlll[1]];
            iArr[lIllllIlll[0]] = lIllllIlll[7];
            if (lIlIIIIIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllIlll[1]];
                iArr2[lIllllIlll[0]] = lIllllIlll[11];
                if (lIlIIIIIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllllIlll[1]];
                    iArr3[lIllllIlll[0]] = lIllllIlll[9];
                    if (lIlIIIIIIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIllllIlll[1]];
                        iArr4[lIllllIlll[0]] = lIllllIlll[12];
                        if (lIlIIIIIIllII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIllllIlll[1]];
                            iArr5[lIllllIlll[0]] = lIllllIlll[18];
                            if (lIlIIIIIIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllIlll[1]];
                                iArr6[lIllllIlll[0]] = lIllllIlll[44];
                                if (lIlIIIIIIlllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIllllIlll[1]];
                                    iArr7[lIllllIlll[0]] = lIllllIlll[44];
                                }
                                ?? r0 = lIllllIlll[1];
                                "".length();
                                return (((17 ^ 66) ^ (12 ^ 106)) & (((((122 + 53) - 125) + 94) ^ (((63 + 148) - 200) + 154)) ^ (-" ".length()))) != 0 ? ((((148 + 10) - 104) + 108) ^ (((162 + 136) - 247) + 135)) & (((((61 + 116) - 137) + 99) ^ (((135 + 9) - 90) + 93)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
            int[] iArr8 = new int[lIllllIlll[1]];
            iArr8[lIllllIlll[0]] = lIllllIlll[11];
            if (lIlIIIIIIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIllllIlll[1]];
                iArr9[lIllllIlll[0]] = lIllllIlll[9];
                if (lIlIIIIIIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIllllIlll[1]];
                    iArr10[lIllllIlll[0]] = lIllllIlll[12];
                    if (lIlIIIIIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIllllIlll[1]];
                        iArr11[lIllllIlll[0]] = lIllllIlll[14];
                        if (lIlIIIIIIllII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIllllIlll[1]];
                            iArr12[lIllllIlll[0]] = lIllllIlll[44];
                            if (lIlIIIIIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIllllIlll[1]];
                                iArr13[lIllllIlll[0]] = lIllllIlll[44];
                            }
                            ?? r02 = lIllllIlll[1];
                            "".length();
                            return "   ".length() != "   ".length() ? ((((77 + 129) - 120) + 58) ^ (((69 + 136) - 95) + 69)) & (((194 ^ 149) ^ (235 ^ 159)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6]) && lIlIIIIIIlllI(ci ? 1 : 0)) {
            int[] iArr14 = new int[lIllllIlll[1]];
            iArr14[lIllllIlll[0]] = lIllllIlll[20];
            if (lIlIIIIIIlllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIllllIlll[1]];
                iArr15[lIllllIlll[0]] = lIllllIlll[20];
            }
            int[] iArr16 = new int[lIllllIlll[1]];
            iArr16[lIllllIlll[0]] = lIllllIlll[22];
            if (lIlIIIIIIllII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIllllIlll[1]];
                iArr17[lIllllIlll[0]] = lIllllIlll[35];
                if (lIlIIIIIIllII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIllllIlll[1];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIllllIlll[0];
        } else if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6]) && lIlIIIIIIllII(ci ? 1 : 0)) {
            int[] iArr18 = new int[lIllllIlll[1]];
            iArr18[lIllllIlll[0]] = lIllllIlll[20];
            if (lIlIIIIIIlllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIllllIlll[1]];
                iArr19[lIllllIlll[0]] = lIllllIlll[20];
            }
            int[] iArr20 = new int[lIllllIlll[1]];
            iArr20[lIllllIlll[0]] = lIllllIlll[14];
            if (lIlIIIIIIllII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIllllIlll[1]];
                iArr21[lIllllIlll[0]] = lIllllIlll[21];
                if (lIlIIIIIIllII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIllllIlll[1]];
                    iArr22[lIllllIlll[0]] = lIllllIlll[21];
                    if (lIlIIIIIlIIIl(Inventory.getFirst(iArr22).getQuantity(), lIllllIlll[17])) {
                        int[] iArr23 = new int[lIllllIlll[1]];
                        iArr23[lIllllIlll[0]] = lIllllIlll[22];
                        if (lIlIIIIIIllII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIllllIlll[1]];
                            iArr24[lIllllIlll[0]] = lIllllIlll[35];
                            if (lIlIIIIIIllII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIllllIlll[1];
                                "".length();
                                return "  ".length() < 0 ? ((((177 + 160) - 176) + 83) ^ (((7 + 27) - 11) + 125)) & (((((65 + 8) - 63) + 209) ^ (((90 + 15) - (-70)) + 12)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIllllIlll[0];
        } else {
            return lIllllIlll[0];
        }
    }

    private static boolean lIlIIIIIlIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIIIlIIII(int i) {
        return i > 0;
    }

    private static boolean lIlIIIIIlIIIl(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ak();
            "".length();
            if ("   ".length() != "   ".length()) {
                return (251 ^ 152) & ((25 ^ 122) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllllIlll[67];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIllllIllI[lIllllIlll[72]];
    }

    private static boolean lIlIIIIIIlllI(int i) {
        return i == 0;
    }

    private static int lIlIIIIIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlIIIIIIlIIl(String llllllllllllllllllIlllIIlIIllIIl, String llllllllllllllllllIlllIIlIIllIII) {
        String llllllllllllllllllIlllIIlIIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlllIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllIIlIIlIlll = new StringBuilder();
        char[] charArray = llllllllllllllllllIlllIIlIIllIII.toCharArray();
        int llllllllllllllllllIlllIIlIIlIlIl = lIllllIlll[0];
        char[] charArray2 = llllllllllllllllllIlllIIlIIllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllllIlll[0];
        while (lIlIIIIIIllIl(i, length)) {
            llllllllllllllllllIlllIIlIIlIlll.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIlllIIlIIlIlIl % charArray.length]));
            "".length();
            llllllllllllllllllIlllIIlIIlIlIl++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlllIIlIIlIlll);
    }

    private static boolean lIlIIIIIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIllllIlll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v388, types: [boolean] */
    public static void ak() {
        if (lIlIIIIIIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[0]];
            C0015b.a(bv);
            if (lIlIIIIIIllIl(bv.size(), lIllllIlll[1])) {
                System.out.println(lIllllIllI[lIllllIlll[1]]);
                bt = lIllllIlll[0];
            }
        }
        if (lIlIIIIIIlllI(bt ? 1 : 0)) {
            if (lIlIIIIIIlllI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIIIllll(nearest) && lIlIIIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[2]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIIIllll(nearest) && lIlIIIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[3]];
                    if (lIlIIIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllIlll[4]);
                        "".length();
                    }
                    if (lIlIIIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllIlll[5]);
                            "".length();
                        }
                        while (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6]) && lIlIIIIIIlllI(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks(lIllllIlll[1]);
                            "".length();
                            "".length();
                            if ((true ^ true) & ((true ^ true) ^ true)) {
                                return;
                            }
                        }
                        if (lIlIIIIIIlllI(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(lIllllIllI[lIllllIlll[5]]);
                            bt = lIllllIlll[1];
                            return;
                        }
                        if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
                            int[] iArr = new int[lIllllIlll[1]];
                            iArr[lIllllIlll[0]] = lIllllIlll[7];
                            if (lIlIIIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIllllIlll[1]];
                                iArr2[lIllllIlll[0]] = lIllllIlll[7];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr2), lIllllIlll[1])) {
                                    Bank.withdraw(lIllllIlll[7], lIllllIlll[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIllllIlll[1]];
                                        iArr3[lIllllIlll[0]] = lIllllIlll[7];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return (-((141 ^ 155) ^ (160 ^ 178))) >= 0 ? ((53 ^ 88) ^ (55 ^ 29)) & (((((45 + 76) - 85) + 162) ^ (((21 + 76) - 70) + 102)) ^ (-" ".length())) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIllllIlll[1]];
                            iArr3[lIllllIlll[0]] = lIllllIlll[9];
                            if (lIlIIIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIllllIlll[1]];
                                iArr4[lIllllIlll[0]] = lIllllIlll[9];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr4), lIllllIlll[1])) {
                                    Bank.withdraw(lIllllIlll[9], lIllllIlll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIllllIlll[1]];
                                        iArr5[lIllllIlll[0]] = lIllllIlll[9];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return ((101 ^ 124) & ((105 ^ 112) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIllllIlll[1]];
                            iArr5[lIllllIlll[0]] = lIllllIlll[11];
                            if (lIlIIIIIIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIllllIlll[1]];
                                iArr6[lIllllIlll[0]] = lIllllIlll[11];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr6), lIllllIlll[1])) {
                                    Bank.withdraw(lIllllIlll[11], lIllllIlll[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIllllIlll[1]];
                                        iArr7[lIllllIlll[0]] = lIllllIlll[11];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return "   ".length() < ((12 ^ 81) & ((233 ^ 180) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIllllIlll[1]];
                            iArr7[lIllllIlll[0]] = lIllllIlll[12];
                            if (lIlIIIIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIllllIlll[1]];
                                iArr8[lIllllIlll[0]] = lIllllIlll[12];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr8), lIllllIlll[1])) {
                                    Bank.withdraw(lIllllIlll[12], lIllllIlll[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIllllIlll[1]];
                                        iArr9[lIllllIlll[0]] = lIllllIlll[12];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return "   ".length() >= (165 ^ 161) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIllllIlll[1]];
                            iArr9[lIllllIlll[0]] = lIllllIlll[14];
                            if (lIlIIIIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIllllIlll[1]];
                                iArr10[lIllllIlll[0]] = lIllllIlll[14];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr10), lIllllIlll[1])) {
                                    Bank.withdraw(lIllllIlll[14], lIllllIlll[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIllllIlll[1]];
                                        iArr11[lIllllIlll[0]] = lIllllIlll[14];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIllllIlll[1]];
                            iArr11[lIllllIlll[0]] = lIllllIlll[15];
                            if (lIlIIIIIIllII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIllllIlll[1]];
                                iArr12[lIllllIlll[0]] = lIllllIlll[15];
                                if (lIlIIIIIIlllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIllllIlll[15], lIllllIlll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIllllIlll[1]];
                                        iArr13[lIllllIlll[0]] = lIllllIlll[15];
                                        return Inventory.contains(iArr13);
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIllllIlll[16], lIllllIlll[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIllllIlll[1]];
                            iArr13[lIllllIlll[0]] = lIllllIlll[18];
                            if (lIlIIIIIIllII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIllllIlll[1]];
                                iArr14[lIllllIlll[0]] = lIllllIlll[18];
                                if (lIlIIIIIIllIl(Inventory.getCount(iArr14), lIllllIlll[1]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19])) {
                                    Bank.withdrawAll(lIllllIlll[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIllllIlll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIllllIlll[1]];
                                        iArr15[lIllllIlll[0]] = lIllllIlll[18];
                                        if (lIlIIIIIlIIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIllllIlll[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIllllIlll[0];
                                    }, lIllllIlll[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
                            int[] iArr15 = new int[lIllllIlll[1]];
                            iArr15[lIllllIlll[0]] = lIllllIlll[20];
                            if (lIlIIIIIIlllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIllllIlll[20], lIllllIlll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllIlll[1]);
                                "".length();
                            }
                            if (lIlIIIIIIllII(ci ? 1 : 0)) {
                                Bank.withdrawAll(lIllllIlll[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllIlll[1]);
                                "".length();
                                Bank.withdrawAll(lIllllIlll[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIllllIlll[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIllllIlll[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIllllIlll[1]);
                            "".length();
                            Bank.withdrawAll(lIllllIlll[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIllllIlll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIIIIIllII(an() ? 1 : 0)) {
                if (lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19])) {
                    if (lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[17]];
                        Movement.walkTo(ck);
                        "".length();
                        Time.sleepTicks(lIllllIlll[1]);
                        "".length();
                    }
                    if (lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = lIllllIllI[lIllllIlll[24]];
                        am();
                    }
                }
                if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[19]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[25])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[26]];
                    if (lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIllllIlll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[25]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[28])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[29]];
                    if (lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIllllIlll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[28]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[30])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[31]];
                    if (lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIllllIlll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[30]) && lIlIIIIIIllIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[32]];
                    if (lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIllllIlll[1]);
                        "".length();
                    }
                }
                if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[6])) {
                    AccBuilderSotf.c = lIllllIllI[lIllllIlll[33]];
                    int[] iArr16 = new int[lIllllIlll[1]];
                    iArr16[lIllllIlll[0]] = lIllllIlll[20];
                    if (lIlIIIIIIllII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIllllIlll[1]];
                        iArr17[lIllllIlll[0]] = lIllllIlll[20];
                        if (lIlIIIIIIlllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIllllIlll[1]];
                            iArr18[lIllllIlll[0]] = lIllllIlll[20];
                            Inventory.getFirst(iArr18).interact(lIllllIllI[lIllllIlll[34]]);
                            Time.sleepTicks(lIllllIlll[1]);
                            "".length();
                        }
                    }
                    if (lIlIIIIIIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0015b.g();
                    }
                    int[] iArr19 = new int[lIllllIlll[1]];
                    iArr19[lIllllIlll[0]] = lIllllIlll[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIllllIlll[1]];
                    iArr20[lIllllIlll[0]] = lIllllIlll[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIlIIIIIIlllI(ci ? 1 : 0)) {
                        if (lIlIIIIIIlllI(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0)) {
                            AccBuilderSotf.c = lIllllIllI[lIllllIlll[36]];
                            Movement.walkTo(cl);
                            "".length();
                            Time.sleepTicks(lIllllIlll[1]);
                            "".length();
                        }
                        if (lIlIIIIIIllII(Players.getLocal().getWorldLocation().equals(cl) ? 1 : 0) && lIlIIIIIIllll(first) && lIlIIIIIIllll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIIIIlIlll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIllllIlll[1];
                                    "".length();
                                    return ((((8 + 125) - 128) + 173) ^ (((172 + 52) - 96) + 54)) < 0 ? ((((116 + 75) - 118) + 61) ^ (((135 + 128) - 238) + 120)) & (((((138 + 83) - 166) + 131) ^ (((8 + 60) - (-73)) + 32)) ^ (-" ".length())) : r0;
                                }
                                return lIllllIlll[0];
                            }, lIllllIlll[8]);
                            "".length();
                            Time.sleep(C0018e.c(lIllllIlll[37], lIllllIlll[38]));
                            "".length();
                        }
                    }
                    if (lIlIIIIIIllII(ci ? 1 : 0)) {
                        if (lIlIIIIIIllll(first) && lIlIIIIIIllll(first2) && lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIlIIIIIlIlll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIllllIlll[1];
                                    "".length();
                                    return (-" ".length()) >= (((((141 + 121) - 217) + 101) ^ (((54 + 169) - 104) + 67)) & (((170 ^ 196) ^ (202 ^ 140)) ^ (-" ".length()))) ? ("  ".length() ^ (26 ^ 0)) & (((((138 + 173) - 233) + 110) ^ (((69 + 108) - 168) + 155)) ^ (-" ".length())) : r0;
                                }
                                return lIllllIlll[0];
                            }, lIllllIlll[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIlIIIIIlIIlI(Players.getLocal().getAnimation(), lIllllIlll[27])) {
                                ?? r0 = lIllllIlll[1];
                                "".length();
                                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllllIlll[0];
                        }, lIllllIlll[39]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIlIIIIIlIlIl(Object obj) {
        return obj == null;
    }

    public static void al() {
        if (lIlIIIIIIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIIIIIlllI(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[40]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(lIllllIlll[1]);
            "".length();
        }
        if (lIlIIIIIIllII(cj.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            am();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIIIlIIIl(Skills.getLevel(Skill.MAGIC), lIllllIlll[73])) {
            ?? r0 = lIllllIlll[1];
            "".length();
            return (-((115 ^ 66) ^ (164 ^ 145))) >= 0 ? ((31 ^ 20) ^ (38 ^ 109)) & (((62 ^ 73) ^ (131 ^ 180)) ^ (-" ".length())) : r0;
        }
        return lIllllIlll[0];
    }

    static {
        lIlIIIIIIlIll();
        lIlIIIIIIlIlI();
        bv = new ArrayList();
        cj = new WorldArea(lIllllIlll[76], lIllllIlll[77], lIllllIlll[47], lIllllIlll[40], lIllllIlll[0]);
        ck = new WorldPoint(lIllllIlll[78], lIllllIlll[79], lIllllIlll[0]);
        cl = new WorldPoint(lIllllIlll[80] + C0018e.c(lIllllIlll[1], lIllllIlll[5]), lIllllIlll[81], lIllllIlll[0]);
    }

    private static void lIlIIIIIIlIll() {
        lIllllIlll = new int[82];
        lIllllIlll[0] = ((((152 + 141) - 141) + 27) ^ (((71 + 110) - 157) + 149)) & (((74 ^ 91) ^ (190 ^ 177)) ^ (-" ".length()));
        lIllllIlll[1] = " ".length();
        lIllllIlll[2] = "  ".length();
        lIllllIlll[3] = "   ".length();
        lIllllIlll[4] = (-27651) & 32650;
        lIllllIlll[5] = 37 ^ 33;
        lIllllIlll[6] = (((130 + 38) - 103) + 103) ^ (((76 + 140) - 113) + 56);
        lIllllIlll[7] = (-((-17551) & 29855)) & (-2434) & 15295;
        lIllllIlll[8] = (-14337) & 15836;
        lIllllIlll[9] = (-((-8879) & 12287)) & (-28673) & 32635;
        lIllllIlll[10] = (-9252) & 11751;
        lIllllIlll[11] = (-27089) & 27645;
        lIllllIlll[12] = (-21953) & 22506;
        lIllllIlll[13] = (-((-20868) & 21999)) & (-8705) & 14335;
        lIllllIlll[14] = (-19713) & 20275;
        lIllllIlll[15] = (-553) & 13177;
        lIllllIlll[16] = (-16417) & 24425;
        lIllllIlll[17] = 57 ^ 60;
        lIllllIlll[18] = (-27781) & 28159;
        lIllllIlll[19] = ((50 ^ 52) & ((84 ^ 82) ^ (-1))) ^ (107 ^ 114);
        lIllllIlll[20] = (-((-27299) & 31415)) & (-641) & 6143;
        lIllllIlll[21] = (-15828) & 16383;
        lIllllIlll[22] = (-19597) & 20157;
        lIllllIlll[23] = (42 ^ 126) ^ (247 ^ 157);
        lIllllIlll[24] = (221 ^ 147) ^ (82 ^ 26);
        lIllllIlll[25] = 146 ^ 141;
        lIllllIlll[26] = (70 ^ 92) ^ (33 ^ 60);
        lIllllIlll[27] = -" ".length();
        lIllllIlll[28] = 136 ^ 173;
        lIllllIlll[29] = 135 ^ 143;
        lIllllIlll[30] = (((166 + 116) - 48) + 1) ^ (((15 + 44) - (-138)) + 1);
        lIllllIlll[31] = 203 ^ 194;
        lIllllIlll[32] = 33 ^ 43;
        lIllllIlll[33] = 186 ^ 177;
        lIllllIlll[34] = (10 ^ 94) ^ (70 ^ 30);
        lIllllIlll[35] = 164 ^ 155;
        lIllllIlll[36] = 168 ^ 165;
        lIllllIlll[37] = (-15535) & 15854;
        lIllllIlll[38] = (-22565) & 23094;
        lIllllIlll[39] = (-((-10569) & 31564)) & (-8257) & 32751;
        lIllllIlll[40] = 5 ^ 11;
        lIllllIlll[41] = 123 ^ 116;
        lIllllIlll[42] = 104 ^ 120;
        lIllllIlll[43] = 215 ^ 198;
        lIllllIlll[44] = (-((-803) & 15291)) & (-3) & 15871;
        lIllllIlll[45] = 157 ^ 143;
        lIllllIlll[46] = 21 ^ 6;
        lIllllIlll[47] = 79 ^ 91;
        lIllllIlll[48] = (-((-19794) & 28667)) & (-23619) & 32767;
        lIllllIlll[49] = (-((-871) & 12263)) & (-289) & 12273;
        lIllllIlll[50] = (40 ^ 30) ^ (63 ^ 19);
        lIllllIlll[51] = 80 ^ 69;
        lIllllIlll[52] = (((79 + 135) - 171) + 137) ^ (((121 + 71) - 54) + 24);
        lIllllIlll[53] = ((80 + 34) - (-64)) + 23;
        lIllllIlll[54] = 126 ^ 105;
        lIllllIlll[55] = (48 ^ 125) ^ (150 ^ 195);
        lIllllIlll[56] = 177 ^ 170;
        lIllllIlll[57] = (-((-5677) & 13869)) & (-18449) & 27640;
        lIllllIlll[58] = ((30 + 150) - 168) + 158;
        lIllllIlll[59] = (-((-3858) & 32603)) & (-7) & 32751;
        lIllllIlll[60] = (-((-394) & 31149)) & (-9) & 32763;
        lIllllIlll[61] = (-((-2577) & 18967)) & (-9217) & 28606;
        lIllllIlll[62] = (-((-65) & 1897)) & (-18436) & 32767;
        lIllllIlll[63] = (-((-2613) & 2933)) & (-16388) & 32207;
        lIllllIlll[64] = (17 ^ 90) ^ (175 ^ 156);
        lIllllIlll[65] = ((79 + 121) - 172) + 122;
        lIllllIlll[66] = (-16385) & 31384;
        lIllllIlll[67] = (28 ^ 12) ^ (6 ^ 114);
        lIllllIlll[68] = (-((-3681) & 3956)) & (-20481) & 32735;
        lIllllIlll[69] = (-((-8687) & 16383)) & (-1) & 32696;
        lIllllIlll[70] = (-((-4241) & 12473)) & (-16513) & 32751;
        lIllllIlll[71] = (-"  ".length()) & (-28763) & 29663;
        lIllllIlll[72] = (250 ^ 148) ^ (78 ^ 60);
        lIllllIlll[73] = (135 ^ 138) ^ (56 ^ 86);
        lIllllIlll[74] = 101 ^ 120;
        lIllllIlll[75] = (((126 + 164) - 115) + 47) ^ (((107 + 160) - 81) + 6);
        lIllllIlll[76] = (-((-8453) & 30005)) & (-1) & 24574;
        lIllllIlll[77] = (-20485) & 23783;
        lIllllIlll[78] = (-25609) & 28639;
        lIllllIlll[79] = (-((-3311) & 31983)) & (-1) & 31977;
        lIllllIlll[80] = (-28805) & 31966;
        lIllllIlll[81] = (-1) & 3487;
    }

    private static void am() {
        if (lIlIIIIIlIlII(lIlIIIIIlIIll(C0018e.w(), 30.0d))) {
            int[] iArr = new int[lIllllIlll[1]];
            iArr[lIllllIlll[0]] = lIllllIlll[18];
            if (lIlIIIIIIllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllIlll[1]];
                iArr2[lIllllIlll[0]] = lIllllIlll[18];
                Inventory.getFirst(iArr2).interact(lIllllIllI[lIllllIlll[41]]);
                Time.sleepTicks(lIllllIlll[1]);
                "".length();
            }
        }
        if (lIlIIIIIlIlIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIIIIIIllII(npc.getName().contains(lIllllIllI[lIllllIlll[75]]) ? 1 : 0) && lIlIIIIIIlllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIllllIlll[1];
                    "".length();
                    return (((38 ^ 93) ^ (34 ^ 29)) & (((23 ^ 14) ^ (39 ^ 122)) ^ (-" ".length()))) >= " ".length() ? ((((13 + 33) - (-41)) + 121) ^ (((76 + 35) - 106) + 139)) & (((((75 + 142) - 160) + 173) ^ (((27 + 12) - (-101)) + 26)) ^ (-" ".length())) : r0;
                }
                return lIllllIlll[0];
            });
            String[] strArr = new String[lIllllIlll[2]];
            strArr[lIllllIlll[0]] = lIllllIllI[lIllllIlll[42]];
            strArr[lIllllIlll[1]] = lIllllIllI[lIllllIlll[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIlIIIIIlIllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIllllIlll[1];
                    "".length();
                    return (((169 ^ 163) ^ (208 ^ 154)) & (((54 ^ 89) ^ (137 ^ 166)) ^ (-" ".length()))) != 0 ? ((60 ^ 126) ^ (45 ^ 39)) & (((69 ^ 92) ^ (17 ^ 64)) ^ (-" ".length())) : r0;
                }
                return lIllllIlll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIllllIlll[1]];
            iArr3[lIllllIlll[0]] = lIllllIlll[44];
            if (lIlIIIIIIllII(Equipment.contains(iArr3) ? 1 : 0) && lIlIIIIIIlllI(ap() ? 1 : 0)) {
                aq();
            }
            if (lIlIIIIIIllll(nearest) && lIlIIIIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderSotf.c = lIllllIllI[lIllllIlll[45]];
                nearest.interact(lIllllIllI[lIllllIlll[46]]);
                Time.sleepTicks(lIllllIlll[3]);
                "".length();
            }
        }
        if (lIlIIIIIIllll(Players.getLocal().getInteracting())) {
            AccBuilderSotf.c = lIllllIllI[lIllllIlll[47]];
            Time.sleepTicks(lIllllIlll[1]);
            "".length();
        }
    }
}
