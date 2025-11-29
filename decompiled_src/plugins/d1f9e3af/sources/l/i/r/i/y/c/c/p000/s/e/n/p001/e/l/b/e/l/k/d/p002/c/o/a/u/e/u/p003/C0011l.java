package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.l  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/l.class */
public class C0011l implements W {
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    private static /* synthetic */ String[] lIIllIlll;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIlllIIl;
    public static /* synthetic */ boolean bu;
    static /* synthetic */ WorldPoint bx;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dd, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0274, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x034d, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ab() {
        if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19])) {
            int[] iArr = new int[lIIlllIIl[1]];
            iArr[lIIlllIIl[0]] = lIIlllIIl[7];
            if (lIIIIIlIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllIIl[1]];
                iArr2[lIIlllIIl[0]] = lIIlllIIl[11];
                if (lIIIIIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlllIIl[1]];
                    iArr3[lIIlllIIl[0]] = lIIlllIIl[9];
                    if (lIIIIIlIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlllIIl[1]];
                        iArr4[lIIlllIIl[0]] = lIIlllIIl[12];
                        if (lIIIIIlIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlllIIl[1]];
                            iArr5[lIIlllIIl[0]] = lIIlllIIl[18];
                            if (lIIIIIlIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllIIl[1]];
                                iArr6[lIIlllIIl[0]] = lIIlllIIl[44];
                                if (lIIIIIlIIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlllIIl[1]];
                                    iArr7[lIIlllIIl[0]] = lIIlllIIl[44];
                                }
                                ?? r0 = lIIlllIIl[1];
                                "".length();
                                return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
            int[] iArr8 = new int[lIIlllIIl[1]];
            iArr8[lIIlllIIl[0]] = lIIlllIIl[11];
            if (lIIIIIlIIIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlllIIl[1]];
                iArr9[lIIlllIIl[0]] = lIIlllIIl[9];
                if (lIIIIIlIIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlllIIl[1]];
                    iArr10[lIIlllIIl[0]] = lIIlllIIl[12];
                    if (lIIIIIlIIIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlllIIl[1]];
                        iArr11[lIIlllIIl[0]] = lIIlllIIl[14];
                        if (lIIIIIlIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlllIIl[1]];
                            iArr12[lIIlllIIl[0]] = lIIlllIIl[44];
                            if (lIIIIIlIIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlllIIl[1]];
                                iArr13[lIIlllIIl[0]] = lIIlllIIl[44];
                            }
                            ?? r02 = lIIlllIIl[1];
                            "".length();
                            return (" ".length() ^ (164 ^ 160)) == 0 ? ((46 ^ 79) ^ (124 ^ 17)) & (((21 ^ 32) ^ (174 ^ 151)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6]) && lIIIIIlIIlII(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlllIIl[1]];
            iArr14[lIIlllIIl[0]] = lIIlllIIl[20];
            if (lIIIIIlIIlII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlllIIl[1]];
                iArr15[lIIlllIIl[0]] = lIIlllIIl[20];
            }
            int[] iArr16 = new int[lIIlllIIl[1]];
            iArr16[lIIlllIIl[0]] = lIIlllIIl[22];
            if (lIIIIIlIIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllIIl[1]];
                iArr17[lIIlllIIl[0]] = lIIlllIIl[35];
                if (lIIIIIlIIIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlllIIl[1];
                    "".length();
                    return " ".length() > ((213 ^ 192) ^ (165 ^ 180)) ? ((189 ^ 195) ^ (106 ^ 0)) & (((224 ^ 188) ^ (39 ^ 111)) ^ (-" ".length())) : r03;
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6]) && lIIIIIlIIIlI(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlllIIl[1]];
            iArr18[lIIlllIIl[0]] = lIIlllIIl[20];
            if (lIIIIIlIIlII(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlllIIl[1]];
                iArr19[lIIlllIIl[0]] = lIIlllIIl[20];
            }
            int[] iArr20 = new int[lIIlllIIl[1]];
            iArr20[lIIlllIIl[0]] = lIIlllIIl[14];
            if (lIIIIIlIIIlI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlllIIl[1]];
                iArr21[lIIlllIIl[0]] = lIIlllIIl[21];
                if (lIIIIIlIIIlI(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllIIl[1]];
                    iArr22[lIIlllIIl[0]] = lIIlllIIl[21];
                    if (lIIIIIlIIlll(Inventory.getFirst(iArr22).getQuantity(), lIIlllIIl[17])) {
                        int[] iArr23 = new int[lIIlllIIl[1]];
                        iArr23[lIIlllIIl[0]] = lIIlllIIl[22];
                        if (lIIIIIlIIIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlllIIl[1]];
                            iArr24[lIIlllIIl[0]] = lIIlllIIl[35];
                            if (lIIIIIlIIIlI(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlllIIl[1];
                                "".length();
                                return (-" ".length()) > " ".length() ? " ".length() & (" ".length() ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else {
            return lIIlllIIl[0];
        }
    }

    public static void ae() {
        if (lIIIIIlIIlIl(Widgets.get(lIIlllIIl[49], lIIlllIIl[50]))) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[51]];
            Widgets.get(lIIlllIIl[49], lIIlllIIl[50]).interact(lIIllIlll[lIIlllIIl[52]]);
            Time.sleepTicks(lIIlllIIl[5]);
            "".length();
        }
        if (lIIIIIlIlIll(Widgets.get(lIIlllIIl[49], lIIlllIIl[50])) && lIIIIIlIIlII(Widgets.get(lIIlllIIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIlllIIl[1]);
            "".length();
            if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get(lIIlllIIl[53], lIIlllIIl[1]).getChild(lIIlllIIl[1]).interact(lIIllIlll[lIIlllIIl[54]]);
            }
            if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31]) && lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[17])) {
                Widgets.get(lIIlllIIl[53], lIIlllIIl[1]).getChild(lIIlllIIl[2]).interact(lIIllIlll[lIIlllIIl[55]]);
            }
            if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[36])) {
                Widgets.get(lIIlllIIl[53], lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[19]]);
            }
            if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31])) {
                int[] iArr = new int[lIIlllIIl[1]];
                iArr[lIIlllIIl[0]] = lIIlllIIl[12];
                if (lIIIIIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIlllIIl[53], lIIlllIIl[1]).getChild(lIIlllIIl[3]).interact(lIIllIlll[lIIlllIIl[50]]);
                }
            }
            if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[36])) {
                int[] iArr2 = new int[lIIlllIIl[1]];
                iArr2[lIIlllIIl[0]] = lIIlllIIl[12];
                if (lIIIIIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIlllIIl[53], lIIlllIIl[1]).getChild(lIIlllIIl[5]).interact(lIIllIlll[lIIlllIIl[56]]);
                }
            }
            Time.sleepTicks(lIIlllIIl[1]);
            "".length();
        }
    }

    private static void lIIIIIlIIIII() {
        lIIllIlll = new String[lIIlllIIl[25]];
        lIIllIlll[lIIlllIIl[0]] = lIIIIIIllIlI("LRYxDicIQyETLAIQ", "ocHgI");
        lIIllIlll[lIIlllIIl[1]] = lIIIIIIllIll("9CscE2cXzE3ZCODqdPEe5IpiF3Vj2Z1NFRr7owwr6PUTTydyK4KoXwPUhpbGBelvZrpCjO4zTzE=", "heaLa");
        lIIllIlll[lIIlllIIl[2]] = lIIIIIIllIlI("JSU9Pj0KMCI5PUswJHc4Ciog", "kDKWZ");
        lIIllIlll[lIIlllIIl[3]] = lIIIIIIlllII("Q0izk1NgYCL2sZYG380ffZTMmGkeeOy/", "HkpaU");
        lIIllIlll[lIIlllIIl[5]] = lIIIIIIlllII("9MIhl7Lby8trLXwxZUGa/1n3GCeTqnMMEz//rfI7QuNDycreKvAl6ffaibYQUh23", "VithT");
        lIIllIlll[lIIlllIIl[17]] = lIIIIIIllIll("nEX8Y+MibbTqvFyCBMh6zA==", "bKQpm");
        lIIllIlll[lIIlllIIl[24]] = lIIIIIIllIll("qP5xXT4va3RwAAM0JSBm0A==", "KhLSv");
        lIIllIlll[lIIlllIIl[26]] = lIIIIIIllIlI("FTA/OR44Nmw7FiQjIy4cdiUpIRI=", "VQLMw");
        lIIllIlll[lIIlllIIl[29]] = lIIIIIIlllII("APCirqR5U1y5+FY+4taIKYSGD20rOXhD", "vHZrx");
        lIIllIlll[lIIlllIIl[31]] = lIIIIIIllIll("FZfHWxmzhttlX4PhGb1DxYMnIJHi3TKP", "LqFQm");
        lIIllIlll[lIIlllIIl[32]] = lIIIIIIllIll("G1mDQvFODzM53RSDwZTn7jusY3VPDRAk", "oBNxJ");
        lIIllIlll[lIIlllIIl[33]] = lIIIIIIllIlI("ChsHHCElEA==", "KwdtH");
        lIIllIlll[lIIlllIIl[34]] = lIIIIIIlllII("7Y8tHkZzI8E=", "oaqxy");
        lIIllIlll[lIIlllIIl[36]] = lIIIIIIllIlI("AB8+BnE5H2gCPS4YaBAhIgQ=", "MpHcQ");
        lIIllIlll[lIIlllIIl[40]] = lIIIIIIllIlI("AhYAaTgjVxUmOz8=", "LwvIL");
        lIIllIlll[lIIlllIIl[41]] = lIIIIIIlllII("7v8foHnnuUw=", "Zaobg");
        lIIllIlll[lIIlllIIl[42]] = lIIIIIIlllII("rP8a9iDM1p4=", "maWYS");
        lIIllIlll[lIIlllIIl[43]] = lIIIIIIlllII("Da84tjbO+HQ=", "pcXkf");
        lIIllIlll[lIIlllIIl[45]] = lIIIIIIllIlI("NiYSNAkcOwgyShQ9ESY=", "wRfUj");
        lIIllIlll[lIIlllIIl[46]] = lIIIIIIllIll("vkLzIJgk4GA=", "rhvnh");
        lIIllIlll[lIIlllIIl[47]] = lIIIIIIlllII("1g/k+sef5OvCH2SSFnN7bg==", "gMoYI");
        lIIllIlll[lIIlllIIl[51]] = lIIIIIIlllII("74dmnV0uHkQbo25v7oQ460k0M9SVlDRI", "uVAjj");
        lIIllIlll[lIIlllIIl[52]] = lIIIIIIllIll("2ooL+5xNkIIgscLI0jg9tQ==", "bVAGN");
        lIIllIlll[lIIlllIIl[54]] = lIIIIIIllIll("imj47TQrKkE7hWYKQK7dlA==", "SrhgV");
        lIIllIlll[lIIlllIIl[55]] = lIIIIIIllIll("TNGwL1BjVBDk3CpI7Ca7Uw==", "ujkdd");
        lIIllIlll[lIIlllIIl[19]] = lIIIIIIllIll("qWV4B3ghZVhdYQBt5cr0eA==", "HJTZy");
        lIIllIlll[lIIlllIIl[50]] = lIIIIIIllIlI("JjIhJhhDACcgGQg2", "cSSRp");
        lIIllIlll[lIIlllIIl[56]] = lIIIIIIllIll("nq5uM+5u0Np5hLyYuLVX5A==", "eiwbq");
        lIIllIlll[lIIlllIIl[72]] = lIIIIIIllIll("un1xC5KbKiY9UbJO/UgwPg==", "SqLDk");
        lIIllIlll[lIIlllIIl[74]] = lIIIIIIllIll("S1+7A8/qzJAmQuVs2huzkQH/QBNQ8ksa", "dWRLp");
        lIIllIlll[lIIlllIIl[75]] = lIIIIIIllIlI("Ljw4", "mSORx");
    }

    private static boolean lIIIIIlIlIll(Object obj) {
        return obj == null;
    }

    private static String lIIIIIIllIll(String lIIIIIIIIIIIIlI, String lIIIIIIIIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIl[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIIIIIIIIll) {
            lIIIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIllIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIIIIIlIIIIl();
        lIIIIIlIIIII();
        bv = new ArrayList();
        bw = new WorldArea(lIIlllIIl[76], lIIlllIIl[77], lIIlllIIl[47], lIIlllIIl[40], lIIlllIIl[0]);
        bx = new WorldPoint(lIIlllIIl[78], lIIlllIIl[79], lIIlllIIl[0]);
        by = new WorldPoint(lIIlllIIl[80] + C0004e.c(lIIlllIIl[1], lIIlllIIl[5]), lIIlllIIl[81], lIIlllIIl[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (lIIIIIlIlIII(Vars.getBit(lIIlllIIl[48]), lIIlllIIl[1]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (lIIIIIlIlIII(Vars.getBit(lIIlllIIl[48]), lIIlllIIl[2]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31]) && lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[17])) {
            return lIIlllIIl[1];
        }
        if (lIIIIIlIlIII(Vars.getBit(lIIlllIIl[48]), lIIlllIIl[3]) && lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[36])) {
            return lIIlllIIl[1];
        }
        if (lIIIIIlIlIII(Vars.getBit(lIIlllIIl[48]), lIIlllIIl[3]) && lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[31])) {
            int[] iArr = new int[lIIlllIIl[1]];
            iArr[lIIlllIIl[0]] = lIIlllIIl[12];
            if (lIIIIIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        if (lIIIIIlIlIII(Vars.getBit(lIIlllIIl[48]), lIIlllIIl[5]) && lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[36])) {
            int[] iArr2 = new int[lIIlllIIl[1]];
            iArr2[lIIlllIIl[0]] = lIIlllIIl[12];
            if (lIIIIIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlllIIl[1];
            }
        }
        return lIIlllIIl[0];
    }

    private static boolean lIIIIIlIIIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlIlIlI(int i) {
        return i < 0;
    }

    private static boolean lIIIIIlIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIlIIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e6, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0322, code lost:
        if (lIIIIIlIIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ac() {
        if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19])) {
            int[] iArr = new int[lIIlllIIl[1]];
            iArr[lIIlllIIl[0]] = lIIlllIIl[7];
            if (lIIIIIlIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllIIl[1]];
                iArr2[lIIlllIIl[0]] = lIIlllIIl[11];
                if (lIIIIIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlllIIl[1]];
                    iArr3[lIIlllIIl[0]] = lIIlllIIl[9];
                    if (lIIIIIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlllIIl[1]];
                        iArr4[lIIlllIIl[0]] = lIIlllIIl[12];
                        if (lIIIIIlIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlllIIl[1]];
                            iArr5[lIIlllIIl[0]] = lIIlllIIl[18];
                            if (lIIIIIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllIIl[1]];
                                iArr6[lIIlllIIl[0]] = lIIlllIIl[44];
                                if (lIIIIIlIIlII(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlllIIl[1]];
                                    iArr7[lIIlllIIl[0]] = lIIlllIIl[44];
                                }
                                ?? r0 = lIIlllIIl[1];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
            int[] iArr8 = new int[lIIlllIIl[1]];
            iArr8[lIIlllIIl[0]] = lIIlllIIl[11];
            if (lIIIIIlIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlllIIl[1]];
                iArr9[lIIlllIIl[0]] = lIIlllIIl[9];
                if (lIIIIIlIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlllIIl[1]];
                    iArr10[lIIlllIIl[0]] = lIIlllIIl[12];
                    if (lIIIIIlIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlllIIl[1]];
                        iArr11[lIIlllIIl[0]] = lIIlllIIl[14];
                        if (lIIIIIlIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlllIIl[1]];
                            iArr12[lIIlllIIl[0]] = lIIlllIIl[44];
                            if (lIIIIIlIIlII(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlllIIl[1]];
                                iArr13[lIIlllIIl[0]] = lIIlllIIl[44];
                            }
                            ?? r02 = lIIlllIIl[1];
                            "".length();
                            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6]) && lIIIIIlIIlII(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlllIIl[1]];
            iArr14[lIIlllIIl[0]] = lIIlllIIl[20];
            if (lIIIIIlIIlII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlllIIl[1]];
                iArr15[lIIlllIIl[0]] = lIIlllIIl[20];
            }
            int[] iArr16 = new int[lIIlllIIl[1]];
            iArr16[lIIlllIIl[0]] = lIIlllIIl[22];
            if (lIIIIIlIIIlI(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllIIl[1]];
                iArr17[lIIlllIIl[0]] = lIIlllIIl[23];
                if (lIIIIIlIIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlllIIl[1];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIIlllIIl[0];
        } else if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6]) && lIIIIIlIIIlI(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlllIIl[1]];
            iArr18[lIIlllIIl[0]] = lIIlllIIl[20];
            if (lIIIIIlIIlII(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlllIIl[1]];
                iArr19[lIIlllIIl[0]] = lIIlllIIl[20];
            }
            int[] iArr20 = new int[lIIlllIIl[1]];
            iArr20[lIIlllIIl[0]] = lIIlllIIl[14];
            if (lIIIIIlIIIlI(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlllIIl[1]];
                iArr21[lIIlllIIl[0]] = lIIlllIIl[21];
                if (lIIIIIlIIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllIIl[1]];
                    iArr22[lIIlllIIl[0]] = lIIlllIIl[21];
                    if (lIIIIIlIIlll(Bank.getFirst(iArr22).getQuantity(), lIIlllIIl[17])) {
                        int[] iArr23 = new int[lIIlllIIl[1]];
                        iArr23[lIIlllIIl[0]] = lIIlllIIl[22];
                        if (lIIIIIlIIIlI(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlllIIl[1]];
                            iArr24[lIIlllIIl[0]] = lIIlllIIl[23];
                            if (lIIIIIlIIIlI(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlllIIl[1];
                                "".length();
                                return 0 != 0 ? ((229 ^ 137) ^ (96 ^ 23)) & (((((6 + 13) - (-10)) + 154) ^ (((7 + 74) - 53) + 144)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlllIIl[0];
        } else {
            return lIIlllIIl[0];
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIllIlll[lIIlllIIl[72]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlllIIl[0];
    }

    private static int lIIIIIlIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIIIIIIlllII(String llllllllIlllIl, String llllllllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIllllI) {
            llllllllIllllI.printStackTrace();
            return null;
        }
    }

    private static void af() {
        if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
            int[] iArr = new int[lIIlllIIl[1]];
            iArr[lIIlllIIl[0]] = lIIlllIIl[14];
            if (lIIIIIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[14], lIIlllIIl[57], lIIlllIIl[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIlllIIl[1]];
            iArr2[lIIlllIIl[0]] = lIIlllIIl[7];
            if (lIIIIIlIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[7], lIIlllIIl[59], lIIlllIIl[24]));
                "".length();
            }
            int[] iArr3 = new int[lIIlllIIl[1]];
            iArr3[lIIlllIIl[0]] = lIIlllIIl[9];
            if (lIIIIIlIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[9], lIIlllIIl[60], lIIlllIIl[24]));
                "".length();
            }
            int[] iArr4 = new int[lIIlllIIl[1]];
            iArr4[lIIlllIIl[0]] = lIIlllIIl[11];
            if (lIIIIIlIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[11], lIIlllIIl[61], lIIlllIIl[24]));
                "".length();
            }
            int[] iArr5 = new int[lIIlllIIl[1]];
            iArr5[lIIlllIIl[0]] = lIIlllIIl[12];
            if (lIIIIIlIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[12], lIIlllIIl[4], lIIlllIIl[24]));
                "".length();
            }
            int[] iArr6 = new int[lIIlllIIl[1]];
            iArr6[lIIlllIIl[0]] = lIIlllIIl[44];
            if (lIIIIIlIIlII(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[44], lIIlllIIl[1], C0004e.c(lIIlllIIl[62], lIIlllIIl[63])));
                "".length();
            }
        }
        if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
            int[] iArr7 = new int[lIIlllIIl[1]];
            iArr7[lIIlllIIl[0]] = lIIlllIIl[22];
            if (lIIIIIlIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlllIIl[1]];
                iArr8[lIIlllIIl[0]] = lIIlllIIl[22];
                if (lIIIIIlIIIll(Bank.getFirst(iArr8).getQuantity(), lIIlllIIl[61])) {
                    int i = lIIlllIIl[22];
                    int i2 = lIIlllIIl[61];
                    int[] iArr9 = new int[lIIlllIIl[1]];
                    iArr9[lIIlllIIl[0]] = lIIlllIIl[22];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIlllIIl[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIlllIIl[1]];
            iArr10[lIIlllIIl[0]] = lIIlllIIl[22];
            if (lIIIIIlIIlII(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[22], lIIlllIIl[61], lIIlllIIl[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIlllIIl[1]];
            iArr11[lIIlllIIl[0]] = lIIlllIIl[23];
            if (lIIIIIlIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlllIIl[1]];
                iArr12[lIIlllIIl[0]] = lIIlllIIl[23];
                if (lIIIIIlIIIll(Bank.getFirst(iArr12).getQuantity(), lIIlllIIl[61])) {
                    int i3 = lIIlllIIl[23];
                    int i4 = lIIlllIIl[61];
                    int[] iArr13 = new int[lIIlllIIl[1]];
                    iArr13[lIIlllIIl[0]] = lIIlllIIl[23];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIlllIIl[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIlllIIl[1]];
            iArr14[lIIlllIIl[0]] = lIIlllIIl[23];
            if (lIIIIIlIIlII(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIl[23], lIIlllIIl[61], lIIlllIIl[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIlllIIl[1]];
            iArr15[lIIlllIIl[0]] = lIIlllIIl[20];
            if (lIIIIIlIIlII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlllIIl[1]];
                iArr16[lIIlllIIl[0]] = lIIlllIIl[20];
                if (lIIIIIlIIlII(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIl[20], lIIlllIIl[1], lIIlllIIl[66]));
                    "".length();
                }
            }
            if (lIIIIIlIIIlI(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllIIl[1]];
                iArr17[lIIlllIIl[0]] = lIIlllIIl[14];
                if (lIIIIIlIIIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIlllIIl[1]];
                    iArr18[lIIlllIIl[0]] = lIIlllIIl[14];
                    if (lIIIIIlIIIll(Bank.getFirst(iArr18).getQuantity(), lIIlllIIl[61])) {
                        int i5 = lIIlllIIl[14];
                        int i6 = lIIlllIIl[61];
                        int[] iArr19 = new int[lIIlllIIl[1]];
                        iArr19[lIIlllIIl[0]] = lIIlllIIl[14];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIlllIIl[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIlllIIl[1]];
                iArr20[lIIlllIIl[0]] = lIIlllIIl[14];
                if (lIIIIIlIIlII(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIl[14], lIIlllIIl[61], lIIlllIIl[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIlllIIl[1]];
                iArr21[lIIlllIIl[0]] = lIIlllIIl[21];
                if (lIIIIIlIIIlI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllIIl[1]];
                    iArr22[lIIlllIIl[0]] = lIIlllIIl[21];
                    if (lIIIIIlIIIll(Bank.getFirst(iArr22).getQuantity(), lIIlllIIl[66])) {
                        int i7 = lIIlllIIl[21];
                        int i8 = lIIlllIIl[66];
                        int[] iArr23 = new int[lIIlllIIl[1]];
                        iArr23[lIIlllIIl[0]] = lIIlllIIl[21];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIlllIIl[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIlllIIl[1]];
                iArr24[lIIlllIIl[0]] = lIIlllIIl[21];
                if (lIIIIIlIIlII(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIl[21], lIIlllIIl[66], lIIlllIIl[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIlllIIl[1]];
        iArr25[lIIlllIIl[0]] = lIIlllIIl[18];
        if (lIIIIIlIIlII(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIIl[18], lIIlllIIl[67], lIIlllIIl[37]));
            "".length();
        }
        if (lIIIIIlIIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllIlll[lIIlllIIl[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIIl[68], lIIlllIIl[17], lIIlllIIl[69]));
            "".length();
        }
        int[] iArr26 = new int[lIIlllIIl[1]];
        iArr26[lIIlllIIl[0]] = lIIlllIIl[70];
        if (lIIIIIlIIlII(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIIl[70], lIIlllIIl[32], lIIlllIIl[71]));
            "".length();
        }
        int[] iArr27 = new int[lIIlllIIl[1]];
        iArr27[lIIlllIIl[0]] = lIIlllIIl[16];
        if (lIIIIIlIIlII(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllIIl[16], lIIlllIIl[32], lIIlllIIl[71]));
            "".length();
        }
    }

    private static boolean lIIIIIlIIlll(int i, int i2) {
        return i >= i2;
    }

    public static void Z() {
        if (lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[40]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIlllIIl[1]);
            "".length();
        }
        if (lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            aa();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[73])) {
            ?? r0 = lIIlllIIl[1];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllIIl[0];
    }

    private static String lIIIIIIllIlI(String llllllllllIIlI, String llllllllllIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllIllll = llllllllllIIIl.toCharArray();
        int lllllllllIlllI = lIIlllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIl[0];
        while (lIIIIIlIIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllIllll[lllllllllIlllI % lllllllllIllll.length]));
            "".length();
            lllllllllIlllI++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v386, types: [boolean] */
    public static void Y() {
        if (lIIIIIlIIIlI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[0]];
            C0001b.a(bv);
            if (lIIIIIlIIIll(bv.size(), lIIlllIIl[1])) {
                System.out.println(lIIllIlll[lIIlllIIl[1]]);
                bt = lIIlllIIl[0];
            }
        }
        if (lIIIIIlIIlII(bt ? 1 : 0)) {
            if (lIIIIIlIIlII(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIIlIIlIl(nearest) && lIIIIIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[2]];
                    C0000a.a(nearest);
                }
                if (lIIIIIlIIlIl(nearest) && lIIIIIlIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[3]];
                    if (lIIIIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlllIIl[4]);
                        "".length();
                    }
                    if (lIIIIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIIlIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlllIIl[5]);
                            "".length();
                        }
                        while (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6]) && lIIIIIlIIlII(C0025z.bi() ? 1 : 0)) {
                            C0025z.bg();
                            Time.sleepTicks(lIIlllIIl[1]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (lIIIIIlIIlII(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIllIlll[lIIlllIIl[5]]);
                            bt = lIIlllIIl[1];
                            return;
                        }
                        if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
                            int[] iArr = new int[lIIlllIIl[1]];
                            iArr[lIIlllIIl[0]] = lIIlllIIl[7];
                            if (lIIIIIlIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlllIIl[1]];
                                iArr2[lIIlllIIl[0]] = lIIlllIIl[7];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr2), lIIlllIIl[1])) {
                                    Bank.withdraw(lIIlllIIl[7], lIIlllIIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIlllIIl[1]];
                                        iArr3[lIIlllIIl[0]] = lIIlllIIl[7];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return (-" ".length()) >= 0 ? ((182 ^ 193) ^ (124 ^ 76)) & (((162 ^ 199) ^ (187 ^ 153)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIlllIIl[1]];
                            iArr3[lIIlllIIl[0]] = lIIlllIIl[9];
                            if (lIIIIIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlllIIl[1]];
                                iArr4[lIIlllIIl[0]] = lIIlllIIl[9];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr4), lIIlllIIl[1])) {
                                    Bank.withdraw(lIIlllIIl[9], lIIlllIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIlllIIl[1]];
                                        iArr5[lIIlllIIl[0]] = lIIlllIIl[9];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return (23 ^ 18) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIlllIIl[1]];
                            iArr5[lIIlllIIl[0]] = lIIlllIIl[11];
                            if (lIIIIIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllIIl[1]];
                                iArr6[lIIlllIIl[0]] = lIIlllIIl[11];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr6), lIIlllIIl[1])) {
                                    Bank.withdraw(lIIlllIIl[11], lIIlllIIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIlllIIl[1]];
                                        iArr7[lIIlllIIl[0]] = lIIlllIIl[11];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIlllIIl[1]];
                            iArr7[lIIlllIIl[0]] = lIIlllIIl[12];
                            if (lIIIIIlIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIlllIIl[1]];
                                iArr8[lIIlllIIl[0]] = lIIlllIIl[12];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr8), lIIlllIIl[1])) {
                                    Bank.withdraw(lIIlllIIl[12], lIIlllIIl[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIlllIIl[1]];
                                        iArr9[lIIlllIIl[0]] = lIIlllIIl[12];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return (-" ".length()) > "  ".length() ? ((((31 + 192) - (-3)) + 4) ^ (((85 + 91) - 92) + 50)) & (((231 ^ 156) ^ (77 ^ 86)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIlllIIl[1]];
                            iArr9[lIIlllIIl[0]] = lIIlllIIl[14];
                            if (lIIIIIlIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIlllIIl[1]];
                                iArr10[lIIlllIIl[0]] = lIIlllIIl[14];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr10), lIIlllIIl[1])) {
                                    Bank.withdraw(lIIlllIIl[14], lIIlllIIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIlllIIl[1]];
                                        iArr11[lIIlllIIl[0]] = lIIlllIIl[14];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return (-"   ".length()) > 0 ? ((52 ^ 97) ^ (56 ^ 105)) & (((((9 + 27) - 23) + 150) ^ (((69 + 121) - 66) + 43)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIlllIIl[1]];
                            iArr11[lIIlllIIl[0]] = lIIlllIIl[15];
                            if (lIIIIIlIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIlllIIl[1]];
                                iArr12[lIIlllIIl[0]] = lIIlllIIl[15];
                                if (lIIIIIlIIlII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIlllIIl[15], lIIlllIIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIlllIIl[1]];
                                        iArr13[lIIlllIIl[0]] = lIIlllIIl[15];
                                        return Inventory.contains(iArr13);
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIlllIIl[16], lIIlllIIl[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIlllIIl[1]];
                            iArr13[lIIlllIIl[0]] = lIIlllIIl[18];
                            if (lIIIIIlIIIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIlllIIl[1]];
                                iArr14[lIIlllIIl[0]] = lIIlllIIl[18];
                                if (lIIIIIlIIIll(Inventory.getCount(iArr14), lIIlllIIl[1]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19])) {
                                    Bank.withdrawAll(lIIlllIIl[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllIIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIlllIIl[1]];
                                        iArr15[lIIlllIIl[0]] = lIIlllIIl[18];
                                        if (lIIIIIlIIllI(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIlllIIl[1];
                                            "".length();
                                            return ((51 ^ 108) ^ (222 ^ 132)) <= 0 ? ((((176 + 192) - 132) + 9) ^ (((106 + 173) - 155) + 62)) & (((0 ^ 91) ^ (97 ^ 117)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllIIl[0];
                                    }, lIIlllIIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
                            int[] iArr15 = new int[lIIlllIIl[1]];
                            iArr15[lIIlllIIl[0]] = lIIlllIIl[20];
                            if (lIIIIIlIIlII(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIlllIIl[20], lIIlllIIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllIIl[1]);
                                "".length();
                            }
                            if (lIIIIIlIIIlI(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIIlllIIl[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllIIl[1]);
                                "".length();
                                Bank.withdrawAll(lIIlllIIl[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllIIl[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIIlllIIl[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIlllIIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIlllIIl[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIlllIIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIIlIIIlI(ab() ? 1 : 0)) {
                if (lIIIIIlIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19])) {
                    if (lIIIIIlIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[17]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIIlllIIl[1]);
                        "".length();
                    }
                    if (lIIIIIlIIIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[24]];
                        aa();
                    }
                }
                if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[19]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[25])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[26]];
                    if (lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIlllIIl[1]);
                        "".length();
                    }
                }
                if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[25]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[28])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[29]];
                    if (lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIlllIIl[1]);
                        "".length();
                    }
                }
                if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[28]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[30])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[31]];
                    if (lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIlllIIl[1]);
                        "".length();
                    }
                }
                if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[30]) && lIIIIIlIIIll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[32]];
                    if (lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIlllIIl[1]);
                        "".length();
                    }
                }
                if (lIIIIIlIIlll(Skills.getLevel(Skill.MAGIC), lIIlllIIl[6])) {
                    AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[33]];
                    int[] iArr16 = new int[lIIlllIIl[1]];
                    iArr16[lIIlllIIl[0]] = lIIlllIIl[20];
                    if (lIIIIIlIIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIlllIIl[1]];
                        iArr17[lIIlllIIl[0]] = lIIlllIIl[20];
                        if (lIIIIIlIIlII(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIlllIIl[1]];
                            iArr18[lIIlllIIl[0]] = lIIlllIIl[20];
                            Inventory.getFirst(iArr18).interact(lIIllIlll[lIIlllIIl[34]]);
                            Time.sleepTicks(lIIlllIIl[1]);
                            "".length();
                        }
                    }
                    if (lIIIIIlIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIlllIIl[1]];
                    iArr19[lIIlllIIl[0]] = lIIlllIIl[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIlllIIl[1]];
                    iArr20[lIIlllIIl[0]] = lIIlllIIl[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIIIIlIIlII(bu ? 1 : 0)) {
                        if (lIIIIIlIIlII(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[36]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIIlllIIl[1]);
                            "".length();
                        }
                        if (lIIIIIlIIIlI(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && lIIIIIlIIlIl(first) && lIIIIIlIIlIl(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIIIlIllIl(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIIlllIIl[1];
                                    "".length();
                                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlllIIl[0];
                            }, lIIlllIIl[8]);
                            "".length();
                            Time.sleep(C0004e.c(lIIlllIIl[37], lIIlllIIl[38]));
                            "".length();
                        }
                    }
                    if (lIIIIIlIIIlI(bu ? 1 : 0)) {
                        if (lIIIIIlIIlIl(first) && lIIIIIlIIlIl(first2) && lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIIIlIllIl(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIIlllIIl[1];
                                    "".length();
                                    return (((115 ^ 84) ^ (63 ^ 120)) & (((((41 + 138) - (-73)) + 1) ^ (((33 + 77) - (-6)) + 41)) ^ (-" ".length()))) != 0 ? ((((85 + 67) - 33) + 24) ^ (((92 + 68) - 61) + 63)) & (((118 ^ 98) ^ (155 ^ 162)) ^ (-" ".length())) : r0;
                                }
                                return lIIlllIIl[0];
                            }, lIIlllIIl[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIIIIlIlIII(Players.getLocal().getAnimation(), lIIlllIIl[27])) {
                                ?? r0 = lIIlllIIl[1];
                                "".length();
                                return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlllIIl[0];
                        }, lIIlllIIl[39]);
                        "".length();
                    }
                }
            }
        }
    }

    private static void aa() {
        if (lIIIIIlIlIlI(lIIIIIlIlIIl(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIIlllIIl[1]];
            iArr[lIIlllIIl[0]] = lIIlllIIl[18];
            if (lIIIIIlIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllIIl[1]];
                iArr2[lIIlllIIl[0]] = lIIlllIIl[18];
                Inventory.getFirst(iArr2).interact(lIIllIlll[lIIlllIIl[41]]);
                Time.sleepTicks(lIIlllIIl[1]);
                "".length();
            }
        }
        if (lIIIIIlIlIll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIIIIlIIIlI(npc.getName().contains(lIIllIlll[lIIlllIIl[75]]) ? 1 : 0) && lIIIIIlIIlII(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIlllIIl[1];
                    "".length();
                    return (((105 ^ 110) ^ " ".length()) & (((243 ^ 139) ^ (42 ^ 84)) ^ (-" ".length()))) != 0 ? ((196 ^ 189) ^ (96 ^ 44)) & (((89 ^ 114) ^ (72 ^ 86)) ^ (-" ".length())) : r0;
                }
                return lIIlllIIl[0];
            });
            String[] strArr = new String[lIIlllIIl[2]];
            strArr[lIIlllIIl[0]] = lIIllIlll[lIIlllIIl[42]];
            strArr[lIIlllIIl[1]] = lIIllIlll[lIIlllIIl[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIIIIlIllII(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIlllIIl[1];
                    "".length();
                    return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlllIIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIlllIIl[1]];
            iArr3[lIIlllIIl[0]] = lIIlllIIl[44];
            if (lIIIIIlIIIlI(Equipment.contains(iArr3) ? 1 : 0) && lIIIIIlIIlII(ad() ? 1 : 0)) {
                ae();
            }
            if (lIIIIIlIIlIl(nearest) && lIIIIIlIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[45]];
                nearest.interact(lIIllIlll[lIIlllIIl[46]]);
                Time.sleepTicks(lIIlllIIl[3]);
                "".length();
            }
        }
        if (lIIIIIlIIlIl(Players.getLocal().getInteracting())) {
            AccBuilderEasyClues.c = lIIllIlll[lIIlllIIl[47]];
            Time.sleepTicks(lIIlllIIl[1]);
            "".length();
        }
    }

    private static boolean lIIIIIlIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIlIIllI(int i) {
        return i > 0;
    }

    private static boolean lIIIIIlIIlII(int i) {
        return i == 0;
    }

    private static void lIIIIIlIIIIl() {
        lIIlllIIl = new int[82];
        lIIlllIIl[0] = (18 ^ 27) & ((202 ^ 195) ^ (-1));
        lIIlllIIl[1] = " ".length();
        lIIlllIIl[2] = "  ".length();
        lIIlllIIl[3] = "   ".length();
        lIIlllIIl[4] = (-((-6250) & 23663)) & (-8305) & 30717;
        lIIlllIIl[5] = (187 ^ 166) ^ (54 ^ 47);
        lIIlllIIl[6] = 165 ^ 146;
        lIIlllIIl[7] = (-25746) & 26303;
        lIIlllIIl[8] = (-((-19502) & 23599)) & (-10243) & 15839;
        lIIlllIIl[9] = (-((-315) & 20991)) & (-11521) & 32751;
        lIIlllIIl[10] = (-((-23585) & 32307)) & (-20514) & 31735;
        lIIlllIIl[11] = (-22723) & 23279;
        lIIlllIIl[12] = (-((-8289) & 30822)) & (-8337) & 31423;
        lIIlllIIl[13] = (-((-2911) & 27519)) & (-3145) & 32252;
        lIIlllIIl[14] = (-((-577) & 11973)) & (-20553) & 32511;
        lIIlllIIl[15] = (-19083) & 31707;
        lIIlllIIl[16] = (-33) & 8041;
        lIIlllIIl[17] = 82 ^ 87;
        lIIlllIIl[18] = (-((-559) & 30383)) & (-517) & 30719;
        lIIlllIIl[19] = 156 ^ 133;
        lIIlllIIl[20] = (-((-1953) & 28593)) & (-4225) & 32251;
        lIIlllIIl[21] = (-10259) & 10814;
        lIIlllIIl[22] = (-((-7813) & 16335)) & (-18565) & 27647;
        lIIlllIIl[23] = (216 ^ 148) ^ (1 ^ 115);
        lIIlllIIl[24] = 109 ^ 107;
        lIIlllIIl[25] = 91 ^ 68;
        lIIlllIIl[26] = "   ".length() ^ (169 ^ 173);
        lIIlllIIl[27] = -" ".length();
        lIIlllIIl[28] = (((147 + 78) - 0) + 4) ^ (((51 + 78) - 1) + 64);
        lIIlllIIl[29] = 191 ^ 183;
        lIIlllIIl[30] = 64 ^ 109;
        lIIlllIIl[31] = (144 ^ 185) ^ (224 ^ 192);
        lIIlllIIl[32] = 59 ^ 49;
        lIIlllIIl[33] = (77 ^ 112) ^ (182 ^ 128);
        lIIlllIIl[34] = (((104 + 28) - 88) + 113) ^ (((23 + 1) - (-60)) + 61);
        lIIlllIIl[35] = 37 ^ 26;
        lIIlllIIl[36] = (18 ^ 89) ^ (243 ^ 181);
        lIIlllIIl[37] = (-((-28737) & 31998)) & (-20993) & 24573;
        lIIlllIIl[38] = (-30821) & 31350;
        lIIlllIIl[39] = (-12883) & 16382;
        lIIlllIIl[40] = (((17 + 2) - 10) + 137) ^ (((127 + 75) - 165) + 119);
        lIIlllIIl[41] = 153 ^ 150;
        lIIlllIIl[42] = (242 ^ 168) ^ (31 ^ 85);
        lIIlllIIl[43] = 166 ^ 183;
        lIIlllIIl[44] = (-((-8471) & 15127)) & (-8337) & 16373;
        lIIlllIIl[45] = (155 ^ 148) ^ (186 ^ 167);
        lIIlllIIl[46] = (202 ^ 192) ^ (50 ^ 43);
        lIIlllIIl[47] = 191 ^ 171;
        lIIlllIIl[48] = (-21193) & 21468;
        lIIlllIIl[49] = (-12551) & 13143;
        lIIlllIIl[50] = (12 ^ 100) ^ (195 ^ 177);
        lIIlllIIl[51] = (99 ^ 66) ^ (45 ^ 25);
        lIIlllIIl[52] = 92 ^ 74;
        lIIlllIIl[53] = ((81 + 96) - 174) + 198;
        lIIlllIIl[54] = (69 ^ 46) ^ (127 ^ 3);
        lIIlllIIl[55] = (152 ^ 178) ^ (164 ^ 150);
        lIIlllIIl[56] = (((101 + 8) - 45) + 88) ^ (((122 + 5) - 56) + 60);
        lIIlllIIl[57] = (-((-16994) & 26229)) & (-4097) & 14331;
        lIIlllIIl[58] = ((42 + 75) - (-29)) + 24;
        lIIlllIIl[59] = (-((-10646) & 31157)) & (-1) & 24511;
        lIIlllIIl[60] = (-((-277) & 8502)) & (-20491) & 30715;
        lIIlllIIl[61] = (-((-714) & 21199)) & (-3) & 23487;
        lIIlllIIl[62] = (-17449) & 29948;
        lIIlllIIl[63] = (-((-4140) & 21375)) & (-1) & 32735;
        lIIlllIIl[64] = (246 ^ 165) ^ (170 ^ 129);
        lIIlllIIl[65] = ((143 + 53) - 157) + 111;
        lIIlllIIl[66] = (-((-31115) & 32175)) & (-16388) & 32447;
        lIIlllIIl[67] = (((17 + 90) - 19) + 104) ^ (((36 + 14) - (-113)) + 1);
        lIIlllIIl[68] = (-((-18513) & 22867)) & (-16434) & 32767;
        lIIlllIIl[69] = (-2582) & 27581;
        lIIlllIIl[70] = (-8337) & 16343;
        lIIlllIIl[71] = (-((-898) & 27629)) & (-17) & 27647;
        lIIlllIIl[72] = 67 ^ 95;
        lIIlllIIl[73] = (117 ^ 5) ^ (22 ^ 5);
        lIIlllIIl[74] = 187 ^ 166;
        lIIlllIIl[75] = " ".length() ^ (53 ^ 42);
        lIIlllIIl[76] = (-((-2334) & 3359)) & (-24577) & 28623;
        lIIlllIIl[77] = (-16909) & 20207;
        lIIlllIIl[78] = (-1025) & 4055;
        lIIlllIIl[79] = (-29445) & 32749;
        lIIlllIIl[80] = (-((-1577) & 30637)) & (-33) & 32254;
        lIIlllIIl[81] = (-((-28319) & 32415)) & (-8193) & 15775;
    }

    private static boolean lIIIIIlIlIII(int i, int i2) {
        return i == i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            Y();
            "".length();
            if ((((231 ^ 188) ^ (104 ^ 26)) & (((((125 + 185) - 284) + 163) ^ (((12 + 61) - 71) + 146)) ^ (-" ".length()))) == "  ".length()) {
                return ((225 ^ 196) ^ (111 ^ 102)) & (((206 ^ 187) ^ (215 ^ 142)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlllIIl[67];
    }
}
