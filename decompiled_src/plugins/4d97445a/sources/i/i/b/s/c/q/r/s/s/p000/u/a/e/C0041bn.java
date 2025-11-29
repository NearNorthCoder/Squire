package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Interacting with object")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bn  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bn.class */
public class C0041bn extends Task {
    private static /* synthetic */ int[] lIIIIIIlI;
    private /* synthetic */ int fQ = lIIIIIIlI[0];
    private static /* synthetic */ String[] lIIIIIIIl;
    private /* synthetic */ int fR;
    private final /* synthetic */ SquireQuestHelper fP;

    @Inject
    public C0041bn(SquireQuestHelper squireQuestHelper) {
        this.fP = squireQuestHelper;
    }

    private static void lllIIIIlIl() {
        lIIIIIIIl = new String[lIIIIIIlI[1]];
        lIIIIIIIl[lIIIIIIlI[0]] = lllIIIIIlI("IRIlNjkaIzs2Kg==", "npOSZ");
        lIIIIIIIl[lIIIIIIlI[2]] = lllIIIIIlI("KikEHxkRawcJWgs+AhZWRTwPFhEMJQk=", "eKnzz");
        lIIIIIIIl[lIIIIIIlI[4]] = lllIIIIIll("ZiOekP2SWStoQOKCpiaQuG1yB38S3IVz", "LdkIr");
        lIIIIIIIl[lIIIIIIlI[6]] = lllIIIIlII("Q1wQpLNDd4vAqrPuhUtRJg==", "vYjVv");
        lIIIIIIIl[lIIIIIIlI[5]] = lllIIIIlII("lo/tJkOqaPZvdobooVf+8+m21ath6kcbtB5LqopaHPY=", "WqZHW");
        lIIIIIIIl[lIIIIIIlI[3]] = lllIIIIIlI("WA==", "uHObk");
        lIIIIIIIl[lIIIIIIlI[7]] = lllIIIIIlI("Qg==", "bCIFk");
        lIIIIIIIl[lIIIIIIlI[8]] = lllIIIIIll("WrQySdffZw0=", "zSdyf");
    }

    private static boolean lllIIIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        if (lllIIIIlll(Dialog.isOpen() ? 1 : 0) && lllIIIlIIl(this.fP.cu() ? 1 : 0) && lllIIIlIlI(this.fR, lIIIIIIlI[3])) {
            this.fR += lIIIIIIlI[2];
            return lIIIIIIlI[0];
        }
        this.fR = lIIIIIIlI[0];
        if (!lllIIIlIIl(this.fP.cz().equals(lIIIIIIIl[lIIIIIIlI[0]]) ? 1 : 0) && !lllIIIlIIl(Movement.shouldWalk() ? 1 : 0)) {
            TileObject cx = this.fP.cx();
            if (lllIIIlIll(cx)) {
                Log.info(lIIIIIIIl[lIIIIIIlI[2]]);
                return this.fP.cB();
            } else if (lllIIIIlll(e(cx) ? 1 : 0) && lllIIIllII(this.fQ, lIIIIIIlI[3])) {
                if (lllIIIIlll(this.fP.d(cx) ? 1 : 0)) {
                    return lIIIIIIlI[2];
                }
                Log.info(lIIIIIIIl[lIIIIIIlI[4]]);
                this.fQ += lIIIIIIlI[2];
                return lIIIIIIlI[2];
            } else {
                this.fQ = lIIIIIIlI[0];
                List<Integer> cI = this.fP.cI();
                if (lllIIIlIIl(cI.isEmpty() ? 1 : 0)) {
                    Item first = Inventory.getFirst(item -> {
                        return cI.contains(Integer.valueOf(item.getId()));
                    });
                    if (lllIIIllIl(first)) {
                        first.useOn(cx);
                        sleep(lIIIIIIlI[5]);
                        return lIIIIIIlI[2];
                    }
                }
                Predicate<String> cL = cL();
                String[] actions = cx.getActions();
                int length = actions.length;
                int i2 = lIIIIIIlI[0];
                while (lllIIIlIlI(i2, length)) {
                    String str = actions[i2];
                    if (lllIIIlIll(str)) {
                        "".length();
                        if (0 != 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else if (lllIIIIlll(cL.test(str) ? 1 : 0)) {
                        sleep(lIIIIIIlI[4]);
                        String str2 = lIIIIIIIl[lIIIIIIlI[6]];
                        Object[] objArr = new Object[lIIIIIIlI[2]];
                        objArr[lIIIIIIlI[0]] = str;
                        Log.info(str2, objArr);
                        cx.interact(str);
                        return lIIIIIIlI[2];
                    }
                    i2++;
                    "".length();
                    if ((-" ".length()) != (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                Log.info(lIIIIIIIl[lIIIIIIlI[5]]);
                cx.interact((v0) -> {
                    return Objects.nonNull(v0);
                });
                return lIIIIIIlI[2];
            }
        }
        return lIIIIIIlI[0];
    }

    private static boolean lllIIIllII(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lllIIIlIll(Object obj) {
        return obj == null;
    }

    private static String lllIIIIIlI(String llIIlllIllIIIIl, String llIIlllIlIllIll) {
        String llIIlllIllIIIIl2 = new String(Base64.getDecoder().decode(llIIlllIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlllIlIlllll = new StringBuilder();
        char[] charArray = llIIlllIlIllIll.toCharArray();
        int llIIlllIlIlllIl = lIIIIIIlI[0];
        char[] charArray2 = llIIlllIllIIIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIIIIlI[0];
        while (lllIIIlIlI(i2, length)) {
            char llIIlllIlIlIlII = charArray2[i2];
            llIIlllIlIlllll.append((char) (llIIlllIlIlIlII ^ charArray[llIIlllIlIlllIl % charArray.length]));
            "".length();
            llIIlllIlIlllIl++;
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llIIlllIlIlllll);
    }

    private Predicate<String> cL() {
        this.fP.cy();
        List<String> cD = this.fP.cD();
        return llIIlllIlllllIl -> {
            if (lllIIIlIll(llIIlllIlllllIl)) {
                return lIIIIIIlI[0];
            }
            String[] split = llIIlllIlllllIl.replaceAll(lIIIIIIIl[lIIIIIIlI[3]], lIIIIIIIl[lIIIIIIlI[7]]).split(lIIIIIIIl[lIIIIIIlI[8]]);
            int length = split.length;
            int llIIlllIllllIlI = lIIIIIIlI[0];
            while (lllIIIlIlI(llIIlllIllllIlI, length)) {
                String str = split[llIIlllIllllIlI];
                if (lllIIIlIIl(cD.stream().noneMatch(str2 -> {
                    return str2.toLowerCase().contains(str.toLowerCase());
                }) ? 1 : 0)) {
                    return lIIIIIIlI[0];
                }
                llIIlllIllllIlI++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIIIIIIlI[2];
        };
    }

    private static void lllIIIIllI() {
        lIIIIIIlI = new int[9];
        lIIIIIIlI[0] = (15 ^ 63) & ((189 ^ 141) ^ (-1));
        lIIIIIIlI[1] = (((97 + 109) - 92) + 22) ^ (((119 + 96) - 130) + 43);
        lIIIIIIlI[2] = " ".length();
        lIIIIIIlI[3] = 180 ^ 177;
        lIIIIIIlI[4] = "  ".length();
        lIIIIIIlI[5] = 101 ^ 97;
        lIIIIIIlI[6] = "   ".length();
        lIIIIIIlI[7] = 187 ^ 189;
        lIIIIIIlI[8] = 97 ^ 102;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean e(TileObject tileObject) {
        if (!lllIIIIlll(Reachable.isInteractable(tileObject) ? 1 : 0) || lllIIIlIII(tileObject.getWorldLocation().distanceTo(Players.getLocal()), lIIIIIIlI[1])) {
            ?? r0 = lIIIIIIlI[2];
            "".length();
            return "  ".length() == 0 ? ((183 ^ 193) ^ (6 ^ 100)) & (((170 ^ 191) ^ " ".length()) ^ (-" ".length())) : r0;
        }
        return lIIIIIIlI[0];
    }

    private static String lllIIIIIll(String llIIlllIlllIIIl, String llIIlllIlllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIlllIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIlI[1]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllIlllIIlI) {
            llIIlllIlllIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lllIIIIllI();
        lllIIIIlIl();
    }

    private static String lllIIIIlII(String llIIlllIlIIllII, String llIIlllIlIIlIll) {
        try {
            SecretKeySpec llIIlllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlI[4], llIIlllIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllIlIIllIl) {
            llIIlllIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlll(int i2) {
        return i2 != 0;
    }

    private static boolean lllIIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIlIII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lllIIIlIIl(int i2) {
        return i2 == 0;
    }
}
