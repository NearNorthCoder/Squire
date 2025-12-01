package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Creating Rejuvenation Potions", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.h  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/h.class */
public class h extends Task {
    private final /* synthetic */ b M;
    private static /* synthetic */ String[] lIlIlllllllll;
    private static /* synthetic */ int[] lIllIIIIIIIlI;
    private final /* synthetic */ SquireWintertodtConfig L;

    private static boolean llIIIIllllIIIII(int i) {
        return i != 0;
    }

    private static boolean llIIIIlllIlllll(int i) {
        return i == 0;
    }

    private static void llIIIIlllIlllII() {
        lIllIIIIIIIlI = new int[20];
        lIllIIIIIIIlI[0] = " ".length();
        lIllIIIIIIIlI[1] = ((233 ^ 136) ^ (153 ^ 178)) & (((26 ^ 18) ^ (233 ^ 171)) ^ (-" ".length()));
        lIllIIIIIIIlI[2] = 47 ^ 42;
        lIllIIIIIIIlI[3] = "  ".length();
        lIllIIIIIIIlI[4] = (-((-21649) & 32433)) & (-257) & 31735;
        lIllIIIIIIIlI[5] = (-((-23684) & 32167)) & (-3589) & 32767;
        lIllIIIIIIIlI[6] = (-1044) & 30363;
        lIllIIIIIIIlI[7] = -" ".length();
        lIllIIIIIIIlI[8] = "   ".length();
        lIllIIIIIIIlI[9] = (72 ^ 117) ^ (40 ^ 17);
        lIllIIIIIIIlI[10] = (-((-12353) & 31313)) & (-3) & 32755;
        lIllIIIIIIIlI[11] = 160 ^ 166;
        lIllIIIIIIIlI[12] = (161 ^ 184) ^ (172 ^ 178);
        lIllIIIIIIIlI[13] = 91 ^ 83;
        lIllIIIIIIIlI[14] = (164 ^ 157) ^ (164 ^ 148);
        lIllIIIIIIIlI[15] = (215 ^ 191) ^ (52 ^ 86);
        lIllIIIIIIIlI[16] = 173 ^ 166;
        lIllIIIIIIIlI[17] = 71 ^ 75;
        lIllIIIIIIIlI[18] = (((88 + 17) - 33) + 78) ^ (((99 + 32) - 50) + 74);
        lIllIIIIIIIlI[19] = 70 ^ 72;
    }

    private static boolean llIIIIlllIllllI(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIlllIIllIl(String llllllllllllllIllIIllIllIllIlIIl, String llllllllllllllIllIIllIllIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIIIIlI[3], llllllllllllllIllIIllIllIllIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIllIllIlIlI) {
            llllllllllllllIllIIllIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    private boolean C() {
        int count = Inventory.getCount(item -> {
            return item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[15]]);
        });
        String[] strArr = new String[lIllIIIIIIIlI[0]];
        strArr[lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[9]];
        int count2 = Inventory.getCount(strArr);
        if (llIIIIllllIIIll(count) && llIIIIlllIlllll(count2)) {
            Inventory.dropAll(item2 -> {
                return item2.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[14]]);
            });
            "".length();
            return lIllIIIIIIIlI[0];
        } else if (!llIIIIllllIIIII(count) || llIIIIlllIlllll(count2)) {
            return lIllIIIIIIIlI[1];
        } else {
            if (llIIIIllllIIIII(Quests.isFinished(Quest.DRUIDIC_RITUAL) ? 1 : 0)) {
                Inventory.use(item3 -> {
                    return item3.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[13]]);
                }, item4 -> {
                    return item4.getName().equals(lIlIlllllllll[lIllIIIIIIIlI[12]]);
                });
                "".length();
                return lIllIIIIIIIlI[0];
            }
            String[] strArr2 = new String[lIllIIIIIIIlI[0]];
            strArr2[lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[2]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (llIIIIllllIIlII(nearest)) {
                int[] iArr = new int[lIllIIIIIIIlI[0]];
                iArr[lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[10];
                nearest = NPCs.getNearest(iArr);
            }
            if (llIIIIllllIIIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIllIIIIIIIlI[0];
            }
            Inventory.use(item5 -> {
                return lIlIlllllllll[lIllIIIIIIIlI[11]].equalsIgnoreCase(item5.getName());
            }, nearest);
            "".length();
            return lIllIIIIIIIlI[0];
        }
    }

    private static String llIIIIlllIlIIIl(String llllllllllllllIllIIllIllIlllIllI, String llllllllllllllIllIIllIllIlllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIlI[13]), "DES");
            Cipher llllllllllllllIllIIllIllIllllIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllIllllIII.init(lIllIIIIIIIlI[3], secretKeySpec);
            return new String(llllllllllllllIllIIllIllIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIllIlllIlll) {
            llllllllllllllIllIIllIllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllllIIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIIllllIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIllllIIIll(int i) {
        return i > 0;
    }

    static {
        llIIIIlllIlllII();
        llIIIIlllIllIIl();
    }

    @Inject
    public h(SquireWintertodtConfig squireWintertodtConfig, b bVar) {
        this.L = squireWintertodtConfig;
        this.M = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    public boolean run() {
        int count = Inventory.getCount(item -> {
            if (llIIIIllllIIIII(item.getName().startsWith(lIlIlllllllll[lIllIIIIIIIlI[17]]) ? 1 : 0) && llIIIIlllIlllll(item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[18]]) ? 1 : 0)) {
                ?? r0 = lIllIIIIIIIlI[0];
                "".length();
                return (-((((64 + 155) - 160) + 114) ^ (((128 + 164) - 266) + 143))) >= 0 ? ((3 ^ 27) ^ (134 ^ 153)) & (((191 ^ 137) ^ (122 ^ 75)) ^ (-" ".length())) : r0;
            }
            return lIllIIIIIIIlI[1];
        });
        int count2 = Inventory.getCount(item2 -> {
            return item2.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[16]]);
        });
        String[] strArr = new String[lIllIIIIIIIlI[0]];
        strArr[lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[1]];
        int count3 = Inventory.getCount(strArr);
        if (!llIIIIlllIlllIl(count) || llIIIIlllIllllI(count3, this.L.foodAmount())) {
            return C();
        }
        if (llIIIIlllIlllll(this.M.i() ? 1 : 0)) {
            return lIllIIIIIIIlI[1];
        }
        if (llIIIIllllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIIIlI[0];
        }
        if (llIIIIllllIIIIl(Inventory.getFreeSlots(), lIllIIIIIIIlI[2])) {
            int[] iArr = new int[lIllIIIIIIIlI[3]];
            iArr[lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[4];
            iArr[lIllIIIIIIIlI[0]] = lIllIIIIIIIlI[5];
            Inventory.dropAll(iArr);
            "".length();
        }
        if (llIIIIlllIlllll(count2)) {
            int[] iArr2 = new int[lIllIIIIIIIlI[0]];
            iArr2[lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[6];
            TileObjects.getNearest(iArr2).interact(lIlIlllllllll[lIllIIIIIIIlI[0]]);
            return lIllIIIIIIIlI[0];
        } else if (llIIIIllllIIIIl(count3, this.L.foodAmount())) {
            if (llIIIIllllIIIlI(Players.getLocal().getAnimation(), lIllIIIIIIIlI[7])) {
                return lIllIIIIIIIlI[0];
            }
            String[] strArr2 = new String[lIllIIIIIIIlI[0]];
            strArr2[lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[3]];
            TileObjects.getNearest(strArr2).interact(lIlIlllllllll[lIllIIIIIIIlI[8]]);
            return lIllIIIIIIIlI[0];
        } else {
            return lIllIIIIIIIlI[1];
        }
    }

    private static void llIIIIlllIllIIl() {
        lIlIlllllllll = new String[lIllIIIIIIIlI[19]];
        lIlIlllllllll[lIllIIIIIIIlI[1]] = llIIIIlllIIllII("Ej4lBgRwJDUZBw==", "PLPke");
        lIlIlllllllll[lIllIIIIIIIlI[0]] = llIIIIlllIIllIl("YY3GHX0oYIdVS/8rQh0hV88re6H8FR0i", "SkJzE");
        lIlIlllllllll[lIllIIIIIIIlI[3]] = llIIIIlllIIllIl("qg1WCFQDdm3vUBFilKu12g==", "VzqJm");
        lIlIlllllllll[lIllIIIIIIIlI[8]] = llIIIIlllIlIIIl("7w+d8ydpDsc=", "vhwQg");
        lIlIlllllllll[lIllIIIIIIIlI[9]] = llIIIIlllIIllII("MRYCAjdTDBIdNA==", "sdwoV");
        lIlIlllllllll[lIllIIIIIIIlI[2]] = llIIIIlllIIllIl("s7CIzyR1mVA=", "RJqWi");
        lIlIlllllllll[lIllIIIIIIIlI[11]] = llIIIIlllIIllII("NTgWAilXIgYdKg==", "wJcoH");
        lIlIlllllllll[lIllIIIIIIIlI[12]] = llIIIIlllIIllIl("te32muIOxNFbvmLokObMBg==", "CFVqx");
        lIlIlllllllll[lIllIIIIIIIlI[13]] = llIIIIlllIIllIl("dSWqqyvIFyg=", "nxVuq");
        lIlIlllllllll[lIllIIIIIIIlI[14]] = llIIIIlllIIllII("LQwP", "XbitA");
        lIlIlllllllll[lIllIIIIIIIlI[15]] = llIIIIlllIIllII("NBgF", "AvceN");
        lIlIlllllllll[lIllIIIIIIIlI[16]] = llIIIIlllIlIIIl("5JPj6NxC+8k=", "GQpDM");
        lIlIlllllllll[lIllIIIIIIIlI[17]] = llIIIIlllIlIIIl("um3HCPpw73jpOa267LgUNw==", "ekGnm");
        lIlIlllllllll[lIllIIIIIIIlI[18]] = llIIIIlllIIllIl("BXSGpUHQRF4=", "yPpkD");
    }

    private static boolean llIIIIllllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlllIlllIl(int i) {
        return i <= 0;
    }

    private static String llIIIIlllIIllII(String llllllllllllllIllIIllIlllIIIlIll, String llllllllllllllIllIIllIlllIIIlIlI) {
        String llllllllllllllIllIIllIlllIIIlIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlllIIIlIIl = new StringBuilder();
        char[] llllllllllllllIllIIllIlllIIIlIII = llllllllllllllIllIIllIlllIIIlIlI.toCharArray();
        int llllllllllllllIllIIllIlllIIIIlll = lIllIIIIIIIlI[1];
        char[] charArray = llllllllllllllIllIIllIlllIIIlIll2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIIIIlI[1];
        while (llIIIIllllIIIIl(i, length)) {
            char llllllllllllllIllIIllIlllIIIllII = charArray[i];
            llllllllllllllIllIIllIlllIIIlIIl.append((char) (llllllllllllllIllIIllIlllIIIllII ^ llllllllllllllIllIIllIlllIIIlIII[llllllllllllllIllIIllIlllIIIIlll % llllllllllllllIllIIllIlllIIIlIII.length]));
            "".length();
            llllllllllllllIllIIllIlllIIIIlll++;
            i++;
            "".length();
            if (((107 ^ 113) & ((126 ^ 100) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIlllIIIlIIl);
    }
}
