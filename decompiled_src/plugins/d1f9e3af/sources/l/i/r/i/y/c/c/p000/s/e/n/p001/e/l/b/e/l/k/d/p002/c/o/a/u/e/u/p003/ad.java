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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ad  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ad.class */
public class ad implements W {
    private static /* synthetic */ String[] lIlllIIll;
    static /* synthetic */ WorldPoint bx;
    private static /* synthetic */ int[] lIlllIlII;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ boolean bu;
    static /* synthetic */ WorldArea bw;
    static /* synthetic */ WorldPoint by;

    private static void lIIllIllIllI() {
        lIlllIIll = new String[lIlllIlII[81]];
        lIlllIIll[lIlllIlII[0]] = lIIllIllIIll("EiwQGCc3eQAFLD0q", "PYiqI");
        lIlllIIll[lIlllIlII[1]] = lIIllIllIIll("BRM6DjErHzBHIDYDPQklYxMgAi8wVnQUNSoONw8rLR10BSMgEXQTLWMXNQArIFogFSMqFD0JJQ==", "CzTgB");
        lIlllIIll[lIlllIlII[2]] = lIIllIllIlII("KQsBYbj9hJEuaQWD2M8sKg8TaIdPD7jG", "aYKEc");
        lIlllIIll[lIlllIlII[3]] = lIIllIllIIll("IgAdFC8DDxRQIQsPGBktDQ==", "jaspC");
        lIlllIIll[lIlllIlII[6]] = lIIllIllIIll("NQN3AzYHRjoLNxEPOQVkERMnEigLAyROZBERPhYnCg85BWQWCXcgETsvGSU=", "bfWbD");
        lIlllIIll[lIlllIlII[18]] = lIIllIllIIll("AwcYawIiRg0kAT4=", "MfnKv");
        lIlllIIll[lIlllIlII[5]] = lIIllIllIlII("YMzXfw9MrF1/jhV/bBwGNg==", "nrcCq");
        lIlllIIll[lIlllIlII[26]] = lIIllIllIlII("hWUXBhoqDHv8npDJpGQd+mCrR4xdBWQI", "vZDgW");
        lIlllIIll[lIlllIlII[29]] = lIIllIllIIll("GhkQJBs3H0M8BzQaGnAGPBQG", "YxcPr");
        lIlllIIll[lIlllIlII[31]] = lIIllIllIlII("oOZ4XJE5bDr7SPkDNF/3qbgYeAgjiJvk", "Nyunc");
        lIlllIIll[lIlllIlII[32]] = lIIllIllIlII("Uo68EQVbnSe+T6xiP2hPMY9SLQjHZ+wd", "bqoar");
        lIlllIIll[lIlllIlII[33]] = lIIllIllIlIl("i7sI0B4JBqU=", "LBruo");
        lIlllIIll[lIlllIlII[36]] = lIIllIllIIll("FA4sAi8=", "CgInK");
        lIlllIIll[lIlllIlII[38]] = lIIllIllIlIl("ZUJnrKNu3gsf8tPyzOj051n1HQnsflyv", "OGiDa");
        lIlllIIll[lIlllIlII[42]] = lIIllIllIlII("h9V9gszclL4SpISE6ogUfQ==", "jKRsL");
        lIlllIIll[lIlllIlII[43]] = lIIllIllIlIl("wrpGB3YutNc8rdkXObhamQ==", "QgWvc");
        lIlllIIll[lIlllIlII[44]] = lIIllIllIlIl("5i/L+u8/GeU=", "eNeZh");
        lIlllIIll[lIlllIlII[45]] = lIIllIllIIll("By0O", "DByxo");
        lIlllIIll[lIlllIlII[46]] = lIIllIllIIll("Owkv", "XfXGH");
        lIlllIIll[lIlllIlII[48]] = lIIllIllIlIl("9zwOkfSIx1U=", "InRST");
        lIlllIIll[lIlllIlII[52]] = lIIllIllIlIl("SlXFBi1ZRurlYp+V1khNkVuDBxRp9w6N", "kFkWu");
        lIlllIIll[lIlllIlII[53]] = lIIllIllIIll("DyQ+HTspbCICLSAg", "LLQrH");
        lIlllIIll[lIlllIlII[55]] = lIIllIllIlIl("3KZ7a+pZ9Ume6wtwNEO3Lg==", "RNyTU");
        lIlllIIll[lIlllIlII[56]] = lIIllIllIIll("MyIuBzlEEC4QIg8m", "dCZbK");
        lIlllIIll[lIlllIlII[57]] = lIIllIllIlIl("htM0mVl/Sg97jO9NriKtTA==", "cGHyx");
        lIlllIIll[lIlllIlII[20]] = lIIllIllIlII("nJltfmmDxOGkXZ01q2+Amg==", "HTGgG");
        lIlllIIll[lIlllIlII[51]] = lIIllIllIIll("NzomIUciJyYtDBQ=", "qSTDg");
        lIlllIIll[lIlllIlII[73]] = lIIllIllIlIl("EsUgn/LMRihnXQBOT86gIA==", "fXygP");
        lIlllIIll[lIlllIlII[75]] = lIIllIllIlIl("e13VzsewVSF2SU/Ek0pee80ThBteNVIO", "JwtFV");
        lIlllIIll[lIlllIlII[76]] = lIIllIllIIll("BQk+", "FfIAb");
    }

    private static void aa() {
        if (lIIlllIIIIIl(lIIlllIIIIII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlllIlII[1]];
            iArr[lIlllIlII[0]] = lIlllIlII[19];
            if (lIIllIlllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlII[1]];
                iArr2[lIlllIlII[0]] = lIlllIlII[19];
                Inventory.getFirst(iArr2).interact(lIlllIIll[lIlllIlII[44]]);
                Time.sleepTicks(lIlllIlII[1]);
                "".length();
            }
        }
        if (lIIllIllllll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIllIlllIII(npc.getName().contains(lIlllIIll[lIlllIlII[76]]) ? 1 : 0) && lIIllIlllIlI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlllIlII[1];
                    "".length();
                    return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlII[0];
            });
            String[] strArr = new String[lIlllIlII[2]];
            strArr[lIlllIlII[0]] = lIlllIIll[lIlllIlII[45]];
            strArr[lIlllIlII[1]] = lIlllIIll[lIlllIlII[46]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIlllIIIIlI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlllIlII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlllIlII[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIlllIlII[1]];
            iArr3[lIlllIlII[0]] = lIlllIlII[47];
            if (lIIllIlllIII(Equipment.contains(iArr3) ? 1 : 0) && lIIllIlllIlI(ad() ? 1 : 0)) {
                ae();
            }
            if (lIIllIlllIll(nearest) && lIIllIlllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlllIIll[lIlllIlII[48]]);
                Time.sleepTicks(lIlllIlII[3]);
                "".length();
            }
        }
    }

    private static boolean lIIllIlllIII(int i) {
        return i != 0;
    }

    private static boolean lIIllIlllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllIIIIIl(int i) {
        return i < 0;
    }

    private static boolean lIIllIlllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (lIIllIlllllI(Vars.getBit(lIlllIlII[49]), lIlllIlII[1]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[18])) {
            return lIlllIlII[1];
        }
        if (lIIllIlllllI(Vars.getBit(lIlllIlII[49]), lIlllIlII[2]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31]) && lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[18])) {
            return lIlllIlII[1];
        }
        if (lIIllIlllllI(Vars.getBit(lIlllIlII[49]), lIlllIlII[3]) && lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[38])) {
            return lIlllIlII[1];
        }
        if (lIIllIlllllI(Vars.getBit(lIlllIlII[49]), lIlllIlII[3]) && lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31])) {
            int[] iArr = new int[lIlllIlII[1]];
            iArr[lIlllIlII[0]] = lIlllIlII[13];
            if (lIIllIlllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIlllIlII[1];
            }
        }
        if (lIIllIlllllI(Vars.getBit(lIlllIlII[49]), lIlllIlII[6]) && lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[38])) {
            int[] iArr2 = new int[lIlllIlII[1]];
            iArr2[lIlllIlII[0]] = lIlllIlII[13];
            if (lIIllIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlllIlII[1];
            }
        }
        return lIlllIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[74])) {
            ?? r0 = lIlllIlII[1];
            "".length();
            return (-((19 ^ 88) ^ (36 ^ 107))) > 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
        }
        return lIlllIlII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIIllIllIlll();
        lIIllIllIllI();
        bu = lIlllIlII[0];
        bv = new ArrayList();
        bw = new WorldArea(lIlllIlII[77], lIlllIlII[78], lIlllIlII[52], lIlllIlII[42], lIlllIlII[0]);
        bx = new WorldPoint(lIlllIlII[79], lIlllIlII[80], lIlllIlII[0]);
        by = null;
    }

    public static void ae() {
        if (lIIllIlllIll(Widgets.get(lIlllIlII[50], lIlllIlII[51]))) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[52]];
            Widgets.get(lIlllIlII[50], lIlllIlII[51]).interact(lIlllIIll[lIlllIlII[53]]);
            Time.sleepTicks(lIlllIlII[6]);
            "".length();
        }
        if (lIIllIllllll(Widgets.get(lIlllIlII[50], lIlllIlII[51])) && lIIllIlllIlI(Widgets.get(lIlllIlII[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIlllIlII[1]);
            "".length();
            if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[18])) {
                Widgets.get(lIlllIlII[54], lIlllIlII[1]).getChild(lIlllIlII[1]).interact(lIlllIIll[lIlllIlII[55]]);
            }
            if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31]) && lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[18])) {
                Widgets.get(lIlllIlII[54], lIlllIlII[1]).getChild(lIlllIlII[2]).interact(lIlllIIll[lIlllIlII[56]]);
            }
            if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[38])) {
                Widgets.get(lIlllIlII[54], lIlllIlII[1]).getChild(lIlllIlII[3]).interact(lIlllIIll[lIlllIlII[57]]);
            }
            if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[31])) {
                int[] iArr = new int[lIlllIlII[1]];
                iArr[lIlllIlII[0]] = lIlllIlII[13];
                if (lIIllIlllIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIlllIlII[54], lIlllIlII[1]).getChild(lIlllIlII[3]).interact(lIlllIIll[lIlllIlII[20]]);
                }
            }
            if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[38])) {
                int[] iArr2 = new int[lIlllIlII[1]];
                iArr2[lIlllIlII[0]] = lIlllIlII[13];
                if (lIIllIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIlllIlII[54], lIlllIlII[1]).getChild(lIlllIlII[6]).interact(lIlllIIll[lIlllIlII[51]]);
                }
            }
            Time.sleepTicks(lIlllIlII[1]);
            "".length();
        }
    }

    private static void af() {
        if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
            int[] iArr = new int[lIlllIlII[1]];
            iArr[lIlllIlII[0]] = lIlllIlII[15];
            if (lIIllIlllIlI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[15], lIlllIlII[58], lIlllIlII[59]));
                "".length();
            }
            int[] iArr2 = new int[lIlllIlII[1]];
            iArr2[lIlllIlII[0]] = lIlllIlII[8];
            if (lIIllIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[8], lIlllIlII[60], lIlllIlII[5]));
                "".length();
            }
            int[] iArr3 = new int[lIlllIlII[1]];
            iArr3[lIlllIlII[0]] = lIlllIlII[10];
            if (lIIllIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[10], lIlllIlII[61], lIlllIlII[5]));
                "".length();
            }
            int[] iArr4 = new int[lIlllIlII[1]];
            iArr4[lIlllIlII[0]] = lIlllIlII[12];
            if (lIIllIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[12], lIlllIlII[62], lIlllIlII[5]));
                "".length();
            }
            int[] iArr5 = new int[lIlllIlII[1]];
            iArr5[lIlllIlII[0]] = lIlllIlII[13];
            if (lIIllIlllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[13], lIlllIlII[4], lIlllIlII[5]));
                "".length();
            }
            int[] iArr6 = new int[lIlllIlII[1]];
            iArr6[lIlllIlII[0]] = lIlllIlII[47];
            if (lIIllIlllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[47], lIlllIlII[1], C0004e.c(lIlllIlII[63], lIlllIlII[64])));
                "".length();
            }
        }
        if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
            int[] iArr7 = new int[lIlllIlII[1]];
            iArr7[lIlllIlII[0]] = lIlllIlII[23];
            if (lIIllIlllIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlllIlII[1]];
                iArr8[lIlllIlII[0]] = lIlllIlII[23];
                if (lIIllIlllIIl(Bank.getFirst(iArr8).getQuantity(), lIlllIlII[62])) {
                    int i = lIlllIlII[23];
                    int i2 = lIlllIlII[62];
                    int[] iArr9 = new int[lIlllIlII[1]];
                    iArr9[lIlllIlII[0]] = lIlllIlII[23];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIlllIlII[65]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIlllIlII[1]];
            iArr10[lIlllIlII[0]] = lIlllIlII[23];
            if (lIIllIlllIlI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[23], lIlllIlII[62], lIlllIlII[65]));
                "".length();
            }
            int[] iArr11 = new int[lIlllIlII[1]];
            iArr11[lIlllIlII[0]] = lIlllIlII[24];
            if (lIIllIlllIII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlllIlII[1]];
                iArr12[lIlllIlII[0]] = lIlllIlII[24];
                if (lIIllIlllIIl(Bank.getFirst(iArr12).getQuantity(), lIlllIlII[62])) {
                    int i3 = lIlllIlII[24];
                    int i4 = lIlllIlII[62];
                    int[] iArr13 = new int[lIlllIlII[1]];
                    iArr13[lIlllIlII[0]] = lIlllIlII[24];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIlllIlII[66]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIlllIlII[1]];
            iArr14[lIlllIlII[0]] = lIlllIlII[24];
            if (lIIllIlllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlII[24], lIlllIlII[62], lIlllIlII[66]));
                "".length();
            }
            int[] iArr15 = new int[lIlllIlII[1]];
            iArr15[lIlllIlII[0]] = lIlllIlII[21];
            if (lIIllIlllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlllIlII[1]];
                iArr16[lIlllIlII[0]] = lIlllIlII[21];
                if (lIIllIlllIlI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIlllIlII[21], lIlllIlII[1], lIlllIlII[67]));
                    "".length();
                }
            }
            if (lIIllIlllIII(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlII[1]];
                iArr17[lIlllIlII[0]] = lIlllIlII[15];
                if (lIIllIlllIII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlllIlII[1]];
                    iArr18[lIlllIlII[0]] = lIlllIlII[15];
                    if (lIIllIlllIIl(Bank.getFirst(iArr18).getQuantity(), lIlllIlII[62])) {
                        int i5 = lIlllIlII[15];
                        int i6 = lIlllIlII[62];
                        int[] iArr19 = new int[lIlllIlII[1]];
                        iArr19[lIlllIlII[0]] = lIlllIlII[15];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIlllIlII[59]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlllIlII[1]];
                iArr20[lIlllIlII[0]] = lIlllIlII[15];
                if (lIIllIlllIlI(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIlllIlII[15], lIlllIlII[62], lIlllIlII[59]));
                    "".length();
                }
                int[] iArr21 = new int[lIlllIlII[1]];
                iArr21[lIlllIlII[0]] = lIlllIlII[22];
                if (lIIllIlllIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlII[1]];
                    iArr22[lIlllIlII[0]] = lIlllIlII[22];
                    if (lIIllIlllIIl(Bank.getFirst(iArr22).getQuantity(), lIlllIlII[67])) {
                        int i7 = lIlllIlII[22];
                        int i8 = lIlllIlII[67];
                        int[] iArr23 = new int[lIlllIlII[1]];
                        iArr23[lIlllIlII[0]] = lIlllIlII[22];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIlllIlII[5]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlllIlII[1]];
                iArr24[lIlllIlII[0]] = lIlllIlII[22];
                if (lIIllIlllIlI(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIlllIlII[22], lIlllIlII[67], lIlllIlII[5]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIlllIlII[1]];
        iArr25[lIlllIlII[0]] = lIlllIlII[19];
        if (lIIllIlllIlI(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlII[19], lIlllIlII[68], lIlllIlII[39]));
            "".length();
        }
        if (lIIllIlllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIll[lIlllIlII[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlII[69], lIlllIlII[18], lIlllIlII[70]));
            "".length();
        }
        int[] iArr26 = new int[lIlllIlII[1]];
        iArr26[lIlllIlII[0]] = lIlllIlII[71];
        if (lIIllIlllIlI(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlII[71], lIlllIlII[32], lIlllIlII[72]));
            "".length();
        }
        int[] iArr27 = new int[lIlllIlII[1]];
        iArr27[lIlllIlII[0]] = lIlllIlII[17];
        if (lIIllIlllIlI(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlII[17], lIlllIlII[32], lIlllIlII[72]));
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllIIll[lIlllIlII[73]];
    }

    private static String lIIllIllIIll(String llIIlIIIlIIllI, String llIIlIIIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(llIIlIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIlIIIlIIlIl.toCharArray();
        int llIIlIIIlIIIlI = lIlllIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlllIlII[0];
        while (lIIllIlllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llIIlIIIlIIIlI % charArray.length]));
            "".length();
            llIIlIIIlIIIlI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIllIllIlll() {
        lIlllIlII = new int[82];
        lIlllIlII[0] = ((166 ^ 199) ^ (2 ^ 116)) & (((((17 + 2) - (-18)) + 110) ^ (((4 + 62) - 15) + 81)) ^ (-" ".length()));
        lIlllIlII[1] = " ".length();
        lIlllIlII[2] = "  ".length();
        lIlllIlII[3] = "   ".length();
        lIlllIlII[4] = (-8225) & 13224;
        lIlllIlII[5] = (((8 + 48) - 47) + 126) ^ (((63 + 13) - 65) + 118);
        lIlllIlII[6] = (32 ^ 66) ^ (230 ^ 128);
        lIlllIlII[7] = (54 ^ 58) ^ (186 ^ 129);
        lIlllIlII[8] = (-19794) & 20351;
        lIlllIlII[9] = (-((-333) & 31599)) & (-1) & 32766;
        lIlllIlII[10] = (-((-24325) & 32725)) & (-22785) & 31739;
        lIlllIlII[11] = (-((-25477) & 30647)) & (-2) & 7671;
        lIlllIlII[12] = (-15361) & 15917;
        lIlllIlII[13] = (-((-26881) & 27990)) & (-22657) & 24319;
        lIlllIlII[14] = (-((-12497) & 31443)) & (-9321) & 32766;
        lIlllIlII[15] = (-((-22449) & 32693)) & (-17545) & 28351;
        lIlllIlII[16] = (-553) & 13177;
        lIlllIlII[17] = (-((-12297) & 28815)) & (-49) & 24575;
        lIlllIlII[18] = 186 ^ 191;
        lIlllIlII[19] = (-5765) & 6143;
        lIlllIlII[20] = (88 ^ 9) ^ (103 ^ 47);
        lIlllIlII[21] = (-((-1919) & 20351)) & (-4117) & 23935;
        lIlllIlII[22] = (-(((111 + 79) - 59) + 17)) & (-13377) & 14079;
        lIlllIlII[23] = (-((-1653) & 16245)) & (-65) & 15217;
        lIlllIlII[24] = 130 ^ 188;
        lIlllIlII[25] = 138 ^ 149;
        lIlllIlII[26] = 144 ^ 151;
        lIlllIlII[27] = -" ".length();
        lIlllIlII[28] = (208 ^ 131) ^ (87 ^ 33);
        lIlllIlII[29] = (((173 + 151) - 153) + 16) ^ (((135 + 151) - 285) + 178);
        lIlllIlII[30] = 134 ^ 171;
        lIlllIlII[31] = (((122 + 83) - 145) + 74) ^ (((19 + 86) - 12) + 50);
        lIlllIlII[32] = 53 ^ 63;
        lIlllIlII[33] = (188 ^ 134) ^ (100 ^ 85);
        lIlllIlII[34] = (-((-5729) & 30694)) & (-545) & 28671;
        lIlllIlII[35] = (-12321) & 15807;
        lIlllIlII[36] = (((82 + 81) - 42) + 30) ^ (((45 + 6) - (-16)) + 88);
        lIlllIlII[37] = (((138 + 147) - 275) + 168) ^ (((116 + 44) - 102) + 83);
        lIlllIlII[38] = 130 ^ 143;
        lIlllIlII[39] = (-((-16705) & 21477)) & (-27665) & 32756;
        lIlllIlII[40] = (-((-861) & 2045)) & (-24837) & 26550;
        lIlllIlII[41] = (-((-8002) & 32595)) & (-4163) & 32255;
        lIlllIlII[42] = (39 ^ 63) ^ (215 ^ 193);
        lIlllIlII[43] = 57 ^ 54;
        lIlllIlII[44] = (46 ^ 108) ^ (111 ^ 61);
        lIlllIlII[45] = 188 ^ 173;
        lIlllIlII[46] = 120 ^ 106;
        lIlllIlII[47] = (-12953) & 14333;
        lIlllIlII[48] = (((67 + 6) - 47) + 148) ^ (((17 + 130) - 3) + 45);
        lIlllIlII[49] = (-31369) & 31644;
        lIlllIlII[50] = (-((-22737) & 32255)) & (-20481) & 30591;
        lIlllIlII[51] = (91 ^ 122) ^ (118 ^ 77);
        lIlllIlII[52] = (188 ^ 149) ^ (24 ^ 37);
        lIlllIlII[53] = 11 ^ 30;
        lIlllIlII[54] = (((158 ^ 177) + (171 ^ 153)) - (-(169 ^ 165))) + (230 ^ 186);
        lIlllIlII[55] = 35 ^ 53;
        lIlllIlII[56] = 6 ^ 17;
        lIlllIlII[57] = 165 ^ 189;
        lIlllIlII[58] = (-((-1953) & 16311)) & (-1) & 15358;
        lIlllIlII[59] = (((84 ^ 100) + (41 ^ 112)) - (90 ^ 1)) + (89 ^ 37);
        lIlllIlII[60] = (-91) & 4090;
        lIlllIlII[61] = (-2062) & 4061;
        lIlllIlII[62] = (-((-2857) & 27503)) & (-4097) & 31742;
        lIlllIlII[63] = (-((-4266) & 6061)) & (-16425) & 30719;
        lIlllIlII[64] = (-16740) & 32239;
        lIlllIlII[65] = (130 ^ 189) ^ (27 ^ 92);
        lIlllIlII[66] = ((75 + 107) - 63) + 31;
        lIlllIlII[67] = (-16647) & 31646;
        lIlllIlII[68] = 251 ^ 159;
        lIlllIlII[69] = (-16385) & 28364;
        lIlllIlII[70] = (-((-24612) & 29227)) & (-1) & 29615;
        lIlllIlII[71] = (-((-6987) & 15211)) & (-16409) & 32639;
        lIlllIlII[72] = (-5203) & 6102;
        lIlllIlII[73] = 222 ^ 197;
        lIlllIlII[74] = (169 ^ 182) ^ (211 ^ 135);
        lIlllIlII[75] = 182 ^ 170;
        lIlllIlII[76] = 55 ^ 42;
        lIlllIlII[77] = (-13314) & 16335;
        lIlllIlII[78] = (-24861) & 28159;
        lIlllIlII[79] = (-16393) & 19423;
        lIlllIlII[80] = (-((-11481) & 32729)) & (-8193) & 32745;
        lIlllIlII[81] = 137 ^ 151;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dc, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027e, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0330, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20])) {
            int[] iArr = new int[lIlllIlII[1]];
            iArr[lIlllIlII[0]] = lIlllIlII[8];
            if (lIIllIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlII[1]];
                iArr2[lIlllIlII[0]] = lIlllIlII[12];
                if (lIIllIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIlII[1]];
                    iArr3[lIlllIlII[0]] = lIlllIlII[10];
                    if (lIIllIlllIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlllIlII[1]];
                        iArr4[lIlllIlII[0]] = lIlllIlII[13];
                        if (lIIllIlllIII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlllIlII[1]];
                            iArr5[lIlllIlII[0]] = lIlllIlII[19];
                            if (lIIllIlllIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlII[1]];
                                iArr6[lIlllIlII[0]] = lIlllIlII[47];
                                if (lIIllIlllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlllIlII[1]];
                                    iArr7[lIlllIlII[0]] = lIlllIlII[47];
                                }
                                ?? r0 = lIlllIlII[1];
                                "".length();
                                return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
            int[] iArr8 = new int[lIlllIlII[1]];
            iArr8[lIlllIlII[0]] = lIlllIlII[12];
            if (lIIllIlllIII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlII[1]];
                iArr9[lIlllIlII[0]] = lIlllIlII[10];
                if (lIIllIlllIII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlII[1]];
                    iArr10[lIlllIlII[0]] = lIlllIlII[13];
                    if (lIIllIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlllIlII[1]];
                        iArr11[lIlllIlII[0]] = lIlllIlII[15];
                        if (lIIllIlllIII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIlII[1]];
                            iArr12[lIlllIlII[0]] = lIlllIlII[47];
                            if (lIIllIlllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIlII[1]];
                                iArr13[lIlllIlII[0]] = lIlllIlII[47];
                            }
                            ?? r02 = lIlllIlII[1];
                            "".length();
                            return ((175 ^ 190) ^ (173 ^ 184)) < 0 ? ((17 ^ 79) ^ (71 ^ 38)) & (((((2 + 94) - 2) + 39) ^ (((22 + 92) - 37) + 109)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7]) && lIIllIlllIlI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIlllIlII[1]];
            iArr14[lIlllIlII[0]] = lIlllIlII[21];
            if (lIIllIlllIlI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlII[1]];
                iArr15[lIlllIlII[0]] = lIlllIlII[21];
            }
            int[] iArr16 = new int[lIlllIlII[1]];
            iArr16[lIlllIlII[0]] = lIlllIlII[23];
            if (lIIllIlllIII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlII[1]];
                iArr17[lIlllIlII[0]] = lIlllIlII[24];
                if (lIIllIlllIII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlllIlII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7]) && lIIllIlllIII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIlllIlII[1]];
            iArr18[lIlllIlII[0]] = lIlllIlII[21];
            if (lIIllIlllIlI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlII[1]];
                iArr19[lIlllIlII[0]] = lIlllIlII[21];
            }
            int[] iArr20 = new int[lIlllIlII[1]];
            iArr20[lIlllIlII[0]] = lIlllIlII[15];
            if (lIIllIlllIII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlllIlII[1]];
                iArr21[lIlllIlII[0]] = lIlllIlII[22];
                if (lIIllIlllIII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlII[1]];
                    iArr22[lIlllIlII[0]] = lIlllIlII[22];
                    if (lIIllIllllIl(Bank.getFirst(iArr22).getQuantity(), lIlllIlII[18])) {
                        int[] iArr23 = new int[lIlllIlII[1]];
                        iArr23[lIlllIlII[0]] = lIlllIlII[23];
                        if (lIIllIlllIII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlllIlII[1]];
                            iArr24[lIlllIlII[0]] = lIlllIlII[24];
                            if (lIIllIlllIII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlllIlII[1];
                                "".length();
                                return " ".length() > "   ".length() ? ((113 ^ 27) ^ (109 ^ 39)) & (((((91 + 88) - 120) + 89) ^ (((154 + 170) - 237) + 93)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else {
            return lIlllIlII[0];
        }
    }

    private static boolean lIIlllIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIllIllllIl(int i, int i2) {
        return i >= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            Y();
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((72 ^ 113) ^ (10 ^ 99)) & (((109 ^ 107) ^ (214 ^ 128)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllIlII[68];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v398, types: [boolean] */
    public static void Y() {
        if (lIIllIlllIII(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[0]];
            C0001b.a(bv);
            if (lIIllIlllIIl(bv.size(), lIlllIlII[1])) {
                System.out.println(lIlllIIll[lIlllIlII[1]]);
                bt = lIlllIlII[0];
            }
        }
        if (lIIllIlllIlI(bt ? 1 : 0)) {
            if (lIIllIlllIlI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIlllIll(nearest) && lIIllIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[2]];
                    C0000a.a(nearest);
                }
                if (lIIllIlllIll(nearest) && lIIllIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[3]];
                    if (lIIllIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIlII[4]);
                        "".length();
                        Time.sleepTicks(lIlllIlII[5]);
                        "".length();
                    }
                    if (lIIllIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIlII[6]);
                            "".length();
                        }
                        while (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7]) && lIIllIlllIlI(C0025z.bi() ? 1 : 0)) {
                            C0025z.bg();
                            Time.sleepTicks(lIlllIlII[1]);
                            "".length();
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        if (lIIllIlllIlI(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIlllIIll[lIlllIlII[6]]);
                            bt = lIlllIlII[1];
                            return;
                        }
                        if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
                            int[] iArr = new int[lIlllIlII[1]];
                            iArr[lIlllIlII[0]] = lIlllIlII[8];
                            if (lIIllIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlllIlII[1]];
                                iArr2[lIlllIlII[0]] = lIlllIlII[8];
                                if (lIIllIlllIIl(Inventory.getCount(iArr2), lIlllIlII[1])) {
                                    Bank.withdraw(lIlllIlII[8], lIlllIlII[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIlllIlII[1]];
                                        iArr3[lIlllIlII[0]] = lIlllIlII[8];
                                        if (lIIllIllllII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return ((104 ^ 126) ^ (81 ^ 67)) < "  ".length() ? ((((163 + 56) - 187) + 137) ^ (((103 + 129) - 108) + 25)) & (((153 ^ 136) ^ (154 ^ 183)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIlllIlII[1]];
                            iArr3[lIlllIlII[0]] = lIlllIlII[10];
                            if (lIIllIlllIII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlllIlII[1]];
                                iArr4[lIlllIlII[0]] = lIlllIlII[10];
                                if (lIIllIlllIIl(Inventory.getCount(iArr4), lIlllIlII[1])) {
                                    Bank.withdraw(lIlllIlII[10], lIlllIlII[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIlllIlII[1]];
                                        iArr5[lIlllIlII[0]] = lIlllIlII[10];
                                        if (lIIllIllllII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return (103 ^ 99) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIlllIlII[1]];
                            iArr5[lIlllIlII[0]] = lIlllIlII[12];
                            if (lIIllIlllIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlII[1]];
                                iArr6[lIlllIlII[0]] = lIlllIlII[12];
                                if (lIIllIlllIIl(Inventory.getCount(iArr6), lIlllIlII[1])) {
                                    Bank.withdraw(lIlllIlII[12], lIlllIlII[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIlllIlII[1]];
                                        iArr7[lIlllIlII[0]] = lIlllIlII[12];
                                        if (lIIllIllllII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return " ".length() >= (120 ^ 124) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIlllIlII[1]];
                            iArr7[lIlllIlII[0]] = lIlllIlII[13];
                            if (lIIllIlllIII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlllIlII[1]];
                                iArr8[lIlllIlII[0]] = lIlllIlII[13];
                                if (lIIllIlllIIl(Inventory.getCount(iArr8), lIlllIlII[1])) {
                                    Bank.withdraw(lIlllIlII[13], lIlllIlII[14], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIlllIlII[1]];
                                        iArr9[lIlllIlII[0]] = lIlllIlII[13];
                                        if (lIIllIllllII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return "  ".length() <= (-" ".length()) ? ((((51 + 2) - (-113)) + 16) ^ (((65 + 74) - 104) + 101)) & (((7 ^ 121) ^ (82 ^ 18)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIlllIlII[1]];
                            iArr9[lIlllIlII[0]] = lIlllIlII[15];
                            if (lIIllIlllIII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlllIlII[1]];
                                iArr10[lIlllIlII[0]] = lIlllIlII[15];
                                if (lIIllIlllIIl(Inventory.getCount(iArr10), lIlllIlII[1])) {
                                    Bank.withdraw(lIlllIlII[15], lIlllIlII[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIlllIlII[1]];
                                        iArr11[lIlllIlII[0]] = lIlllIlII[15];
                                        if (lIIllIllllII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return "   ".length() <= 0 ? ((((100 + 87) - 178) + 126) ^ (((144 + 17) - 114) + 139)) & (((((44 + 41) - 54) + 152) ^ (((131 + 88) - 108) + 27)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIlllIlII[1]];
                            iArr11[lIlllIlII[0]] = lIlllIlII[16];
                            if (lIIllIlllIII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlllIlII[1]];
                                iArr12[lIlllIlII[0]] = lIlllIlII[16];
                                if (lIIllIlllIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIlllIlII[16], lIlllIlII[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIlllIlII[1]];
                                        iArr13[lIlllIlII[0]] = lIlllIlII[16];
                                        return Inventory.contains(iArr13);
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIlllIlII[17], lIlllIlII[18], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIlllIlII[1]];
                            iArr13[lIlllIlII[0]] = lIlllIlII[19];
                            if (lIIllIlllIII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlllIlII[1]];
                                iArr14[lIlllIlII[0]] = lIlllIlII[19];
                                if (lIIllIlllIIl(Inventory.getCount(iArr14), lIlllIlII[1]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20])) {
                                    Bank.withdrawAll(lIlllIlII[19], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlllIlII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIlllIlII[1]];
                                        iArr15[lIlllIlII[0]] = lIlllIlII[19];
                                        if (lIIllIllllII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIlllIlII[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlllIlII[0];
                                    }, lIlllIlII[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
                            int[] iArr15 = new int[lIlllIlII[1]];
                            iArr15[lIlllIlII[0]] = lIlllIlII[21];
                            if (lIIllIlllIlI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlllIlII[21], lIlllIlII[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlII[1]);
                                "".length();
                            }
                            if (lIIllIlllIII(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIlllIlII[22], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlII[1]);
                                "".length();
                                Bank.withdrawAll(lIlllIlII[15], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlllIlII[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIlllIlII[3]);
                            "".length();
                            Bank.withdrawAll(lIlllIlII[23], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlllIlII[1]);
                            "".length();
                            Bank.withdrawAll(lIlllIlII[24], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIlllIlII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIllIlllIII(ab() ? 1 : 0)) {
                if (lIIllIlllIII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20])) {
                    if (lIIllIlllIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[18]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIlllIlII[1]);
                        "".length();
                    }
                    if (lIIllIlllIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[5]];
                        aa();
                    }
                }
                if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[25])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[26]];
                    if (lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIlllIlII[1]);
                        "".length();
                    }
                }
                if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[25]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[28])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[29]];
                    if (lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIlllIlII[1]);
                        "".length();
                    }
                }
                if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[28]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[30])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[31]];
                    if (lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIlllIlII[1]);
                        "".length();
                    }
                }
                if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[30]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[32]];
                    if (lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIlllIlII[1]);
                        "".length();
                    }
                }
                if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
                    AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[33]];
                    if (lIIllIllllll(by)) {
                        by = new WorldPoint(lIlllIlII[34] + C0004e.c(lIlllIlII[1], lIlllIlII[6]), lIlllIlII[35], lIlllIlII[0]);
                    }
                    int[] iArr16 = new int[lIlllIlII[1]];
                    iArr16[lIlllIlII[0]] = lIlllIlII[21];
                    if (lIIllIlllIII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlllIlII[1]];
                        iArr17[lIlllIlII[0]] = lIlllIlII[21];
                        if (lIIllIlllIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlllIlII[1]];
                            iArr18[lIlllIlII[0]] = lIlllIlII[21];
                            Inventory.getFirst(iArr18).interact(lIlllIIll[lIlllIlII[36]]);
                            Time.sleepTicks(lIlllIlII[1]);
                            "".length();
                        }
                    }
                    if (lIIllIlllIII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIlllIlII[1]];
                    iArr19[lIlllIlII[0]] = lIlllIlII[23];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIlllIlII[1]];
                    iArr20[lIlllIlII[0]] = lIlllIlII[37];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIllIlllIlI(bu ? 1 : 0) && lIIllIlllIll(by)) {
                        if (lIIllIlllIlI(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[38]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIlllIlII[1]);
                            "".length();
                        }
                        if (lIIllIlllIII(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && lIIllIlllIll(first) && lIIllIlllIll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlllIIIIll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIlllIlII[1];
                                    "".length();
                                    return "   ".length() < "   ".length() ? ((51 ^ 67) ^ (239 ^ 151)) & (((((132 + 14) - 45) + 64) ^ (((116 + 71) - 36) + 22)) ^ (-" ".length())) : r0;
                                }
                                return lIlllIlII[0];
                            }, lIlllIlII[9]);
                            "".length();
                            Time.sleep(C0004e.c(lIlllIlII[39], lIlllIlII[40]));
                            "".length();
                        }
                    }
                    if (lIIllIlllIII(bu ? 1 : 0)) {
                        if (lIIllIlllIll(first) && lIIllIlllIll(first2) && lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIlllIIIIll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIlllIlII[1];
                                    "".length();
                                    return (-" ".length()) == (62 ^ 58) ? " ".length() & (" ".length() ^ (-1)) : r0;
                                }
                                return lIlllIlII[0];
                            }, lIlllIlII[9]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIllIlllllI(Players.getLocal().getAnimation(), lIlllIlII[27])) {
                                ?? r0 = lIlllIlII[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIlII[0];
                        }, lIlllIlII[41]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void Z() {
        if (lIIllIlllIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIllIlllIlI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[42]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIlllIlII[1]);
            "".length();
        }
        if (lIIllIlllIII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIll[lIlllIlII[43]];
            aa();
        }
    }

    private static boolean lIIllIlllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f2, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0294, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0364, code lost:
        if (lIIllIlllIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20])) {
            int[] iArr = new int[lIlllIlII[1]];
            iArr[lIlllIlII[0]] = lIlllIlII[8];
            if (lIIllIlllIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlII[1]];
                iArr2[lIlllIlII[0]] = lIlllIlII[12];
                if (lIIllIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIlII[1]];
                    iArr3[lIlllIlII[0]] = lIlllIlII[10];
                    if (lIIllIlllIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlllIlII[1]];
                        iArr4[lIlllIlII[0]] = lIlllIlII[13];
                        if (lIIllIlllIII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlllIlII[1]];
                            iArr5[lIlllIlII[0]] = lIlllIlII[19];
                            if (lIIllIlllIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlII[1]];
                                iArr6[lIlllIlII[0]] = lIlllIlII[47];
                                if (lIIllIlllIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlllIlII[1]];
                                    iArr7[lIlllIlII[0]] = lIlllIlII[47];
                                }
                                ?? r0 = lIlllIlII[1];
                                "".length();
                                return 0 != 0 ? ((176 ^ 164) ^ (144 ^ 161)) & (((((161 + 123) - 117) + 23) ^ (((25 + 19) - (-11)) + 100)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[20]) && lIIllIlllIIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7])) {
            int[] iArr8 = new int[lIlllIlII[1]];
            iArr8[lIlllIlII[0]] = lIlllIlII[12];
            if (lIIllIlllIII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlII[1]];
                iArr9[lIlllIlII[0]] = lIlllIlII[10];
                if (lIIllIlllIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlII[1]];
                    iArr10[lIlllIlII[0]] = lIlllIlII[13];
                    if (lIIllIlllIII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlllIlII[1]];
                        iArr11[lIlllIlII[0]] = lIlllIlII[15];
                        if (lIIllIlllIII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIlII[1]];
                            iArr12[lIlllIlII[0]] = lIlllIlII[47];
                            if (lIIllIlllIlI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIlII[1]];
                                iArr13[lIlllIlII[0]] = lIlllIlII[47];
                            }
                            ?? r02 = lIlllIlII[1];
                            "".length();
                            return (-" ".length()) == " ".length() ? ((((64 + 67) - 76) + 110) ^ (((90 + 2) - 55) + 140)) & (((121 ^ 9) ^ (12 ^ 104)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7]) && lIIllIlllIlI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIlllIlII[1]];
            iArr14[lIlllIlII[0]] = lIlllIlII[21];
            if (lIIllIlllIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlII[1]];
                iArr15[lIlllIlII[0]] = lIlllIlII[21];
            }
            int[] iArr16 = new int[lIlllIlII[1]];
            iArr16[lIlllIlII[0]] = lIlllIlII[23];
            if (lIIllIlllIII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlII[1]];
                iArr17[lIlllIlII[0]] = lIlllIlII[37];
                if (lIIllIlllIII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlllIlII[1];
                    "".length();
                    return (-" ".length()) == "  ".length() ? ((87 ^ 20) ^ (112 ^ 28)) & (((98 ^ 69) ^ (85 ^ 93)) ^ (-" ".length())) : r03;
                }
            }
            return lIlllIlII[0];
        } else if (lIIllIllllIl(Skills.getLevel(Skill.MAGIC), lIlllIlII[7]) && lIIllIlllIII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIlllIlII[1]];
            iArr18[lIlllIlII[0]] = lIlllIlII[21];
            if (lIIllIlllIlI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlII[1]];
                iArr19[lIlllIlII[0]] = lIlllIlII[21];
            }
            int[] iArr20 = new int[lIlllIlII[1]];
            iArr20[lIlllIlII[0]] = lIlllIlII[15];
            if (lIIllIlllIII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlllIlII[1]];
                iArr21[lIlllIlII[0]] = lIlllIlII[22];
                if (lIIllIlllIII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlllIlII[1]];
                    iArr22[lIlllIlII[0]] = lIlllIlII[22];
                    if (lIIllIllllIl(Inventory.getFirst(iArr22).getQuantity(), lIlllIlII[18])) {
                        int[] iArr23 = new int[lIlllIlII[1]];
                        iArr23[lIlllIlII[0]] = lIlllIlII[23];
                        if (lIIllIlllIII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlllIlII[1]];
                            iArr24[lIlllIlII[0]] = lIlllIlII[37];
                            if (lIIllIlllIII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlllIlII[1];
                                "".length();
                                return (((36 ^ 10) ^ (29 ^ 43)) & (((((143 + 187) - 267) + 154) ^ (((90 + 78) - 28) + 53)) ^ (-" ".length()))) != 0 ? ((((118 + 22) - 88) + 94) ^ (((118 + 129) - 228) + 131)) & (((74 ^ 3) ^ (45 ^ 96)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlllIlII[0];
        } else {
            return lIlllIlII[0];
        }
    }

    private static String lIIllIllIlII(String llIIlIIIIlIIIl, String llIIlIIIIlIIII) {
        try {
            SecretKeySpec llIIlIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIIIlIIll = Cipher.getInstance("Blowfish");
            llIIlIIIIlIIll.init(lIlllIlII[2], llIIlIIIIlIlII);
            return new String(llIIlIIIIlIIll.doFinal(Base64.getDecoder().decode(llIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIIIlIIlI) {
            llIIlIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static int lIIlllIIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIllIlllllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIIIIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIllIllIlIl(String llIIlIIIllIllI, String llIIlIIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIlllIlII[29]), "DES");
            Cipher llIIlIIIlllIII = Cipher.getInstance("DES");
            llIIlIIIlllIII.init(lIlllIlII[2], secretKeySpec);
            return new String(llIIlIIIlllIII.doFinal(Base64.getDecoder().decode(llIIlIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIIllIlll) {
            llIIlIIIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIllllII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlllIlII[0];
    }
}
