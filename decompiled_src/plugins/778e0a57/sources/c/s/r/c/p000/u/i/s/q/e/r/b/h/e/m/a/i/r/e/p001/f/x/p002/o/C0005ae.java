package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ae  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ae.class */
public class C0005ae extends Task {
    private final /* synthetic */ SquireChambersPlugin cH;
    private static /* synthetic */ String[] lIlIIIIIIlIl;
    private static /* synthetic */ int[] lIlIIIIIIllI;
    private final /* synthetic */ C0036k cG;
    /* synthetic */ int cD = lIlIIIIIIllI[0];
    /* synthetic */ boolean cE = lIlIIIIIIllI[0];

    private static String llIlIIllllIllI(String lllllllllllllllIlllIIlIIllllllll, String lllllllllllllllIlllIIlIIlllllllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIlIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIlllllllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIIllI[7], lllllllllllllllIlllIIlIlIIIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIlIIIIIIII) {
            lllllllllllllllIlllIIlIlIIIIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean ct() {
        if (llIlIIllllllll(C0046u.be() ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        Player local = Players.getLocal();
        if (!llIlIIlllllllI(C0046u.bg(), lIlIIIIIIllI[4]) || llIlIIlllllIlI(local.getPlane())) {
            return lIlIIIIIIllI[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIlIIlllllIlI(tileObject.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIllI[2]];
                strArr[lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[4]];
                if (llIlIIlllllIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIllI[2];
                    "".length();
                    return ("  ".length() & ("  ".length() ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIIllI[0];
        });
        if (!llIlIlIIIIIIII(nearest) && !llIlIlIIIIIIIl(local.getWorldY(), nearest.getWorldY())) {
            return lIlIIIIIIllI[2];
        }
        return lIlIIIIIIllI[0];
    }

    private static boolean llIlIIllllllIl(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIIIlIl = new String[lIlIIIIIIllI[14]];
        lIlIIIIIIlIl[lIlIIIIIIllI[0]] = llIlIIllllIlII("NT8gDB0=", "qMIbv");
        lIlIIIIIIlIl[lIlIIIIIIllI[2]] = llIlIIllllIlIl("cEKhvso+FQI=", "fbUKN");
        lIlIIIIIIlIl[lIlIIIIIIllI[7]] = llIlIIllllIlII("FA0aJQ==", "BliDM");
        lIlIIIIIIlIl[lIlIIIIIIllI[1]] = llIlIIllllIlIl("FZDS7L+AcwVWcMmOpvPCkp/umsmikDN3", "iUGsn");
        lIlIIIIIIlIl[lIlIIIIIIllI[4]] = llIlIIllllIllI("EUWrxjwAluDqMupEHOuAmg==", "dbYtB");
        lIlIIIIIIlIl[lIlIIIIIIllI[3]] = llIlIIllllIlII("KSYgHytaITUJLRUhNQ==", "zSPzY");
        lIlIIIIIIlIl[lIlIIIIIIllI[8]] = llIlIIllllIlIl("HuRH4QMOEdRmwq3YRBLL6w==", "tZNLj");
        lIlIIIIIIlIl[lIlIIIIIIllI[9]] = llIlIIllllIlIl("I6A8bMC47JQ=", "wCyLe");
        lIlIIIIIIlIl[lIlIIIIIIllI[10]] = llIlIIllllIlIl("ncSqJxj9TUnr0T9Sw2Cnog==", "TAFFA");
        lIlIIIIIIlIl[lIlIIIIIIllI[11]] = llIlIIllllIlII("HgAhGz4=", "ZrHuU");
        lIlIIIIIIlIl[lIlIIIIIIllI[12]] = llIlIIllllIlII("KxYxCwVUAGMDDxc=", "ssCbf");
        lIlIIIIIIlIl[lIlIIIIIIllI[13]] = llIlIIllllIlII("Mj4rHww=", "vLBqg");
    }

    private static String llIlIIllllIlIl(String lllllllllllllllIlllIIlIlIIIIllII, String lllllllllllllllIlllIIlIlIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIlIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIllI[7], lllllllllllllllIlllIIlIlIIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlIlIIIIllIl) {
            lllllllllllllllIlllIIlIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    protected boolean cx() {
        if (llIlIIlllllllI(Skills.getBoostedLevel(Skill.ATTACK) + lIlIIIIIIllI[3], Skills.getLevel(Skill.ATTACK))) {
            ?? r0 = lIlIIIIIIllI[2];
            "".length();
            return (103 ^ 99) < (-" ".length()) ? " ".length() & (" ".length() ^ (-1)) : r0;
        }
        return lIlIIIIIIllI[0];
    }

    private static boolean llIlIlIIIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlIIIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIlIIlllllIII() {
        lIlIIIIIIllI = new int[15];
        lIlIIIIIIllI[0] = ((((55 + 24) - 29) + 140) ^ (((128 + 84) - 182) + 124)) & (((((2 + 35) - (-49)) + 90) ^ (((133 + 38) - 95) + 72)) ^ (-" ".length()));
        lIlIIIIIIllI[1] = "   ".length();
        lIlIIIIIIllI[2] = " ".length();
        lIlIIIIIIllI[3] = (((121 + 8) - 103) + 102) ^ (((2 + 89) - (-24)) + 18);
        lIlIIIIIIllI[4] = 16 ^ 20;
        lIlIIIIIIllI[5] = (((77 + 95) - 76) + 145) ^ (((113 + 181) - 174) + 75);
        lIlIIIIIIllI[6] = 87 ^ 67;
        lIlIIIIIIllI[7] = "  ".length();
        lIlIIIIIIllI[8] = 159 ^ 153;
        lIlIIIIIIllI[9] = (230 ^ 184) ^ (251 ^ 162);
        lIlIIIIIIllI[10] = (((133 + 134) - 137) + 8) ^ (((24 + 52) - (-30)) + 24);
        lIlIIIIIIllI[11] = 44 ^ 37;
        lIlIIIIIIllI[12] = 104 ^ 98;
        lIlIIIIIIllI[13] = (((16 + 86) - 101) + 145) ^ (((140 + 151) - 146) + 8);
        lIlIIIIIIllI[14] = 90 ^ 86;
    }

    private static boolean llIlIIlllllIlI(int i) {
        return i != 0;
    }

    private static boolean llIlIIllllllll(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIIIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIllllllII(int i) {
        return i < 0;
    }

    private static boolean llIlIIlllllIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    public boolean run() {
        int cA = cA();
        if (llIlIIlllllIlI(ct() ? 1 : 0) && llIlIIlllllIlI(cx() ? 1 : 0) && llIlIIlllllIll(Combat.getCurrentHealth(), cA) && llIlIIllllllII(llIlIIlllllIIl(Combat.getHealthPercent(), 95.0d)) && llIlIIllllllIl(this.cG.aJ(), lIlIIIIIIllI[1]) && llIlIIlllllIll(this.cG.aK(), lIlIIIIIIllI[2])) {
            cy();
            "".length();
            return lIlIIIIIIllI[2];
        }
        if (llIlIIlllllIlI(cx() ? 1 : 0) && llIlIIlllllllI(this.cD, lIlIIIIIIllI[1])) {
            this.cE = lIlIIIIIIllI[0];
        }
        if (llIlIIllllllIl(Combat.getCurrentHealth(), cA)) {
            if (llIlIIllllllll(this.cE ? 1 : 0)) {
                this.cD = lIlIIIIIIllI[0];
            }
            this.cE = lIlIIIIIIllI[2];
        }
        if (llIlIIllllllll(this.cE ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        if (!llIlIIllllllIl(this.cD, lIlIIIIIIllI[1])) {
            cz();
            "".length();
            return lIlIIIIIIllI[2];
        }
        cy();
        "".length();
        this.cD += lIlIIIIIIllI[2];
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIlllllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIlIIIIIIIl(int i, int i2) {
        return i <= i2;
    }

    static {
        llIlIIlllllIII();
        llIlIIllllIlll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean cy() {
        Item first = Inventory.getFirst(item -> {
            if (llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[12]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIllI[2]];
                strArr[lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[13]];
                if (llIlIIlllllIlI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIllI[2];
                    "".length();
                    return ((133 ^ 173) & ((38 ^ 14) ^ (-1))) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIIIIIIllI[0];
        });
        if (llIlIlIIIIIIII(first)) {
            first = Inventory.getFirst(item2 -> {
                if (llIlIIlllllIlI(item2.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[10]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIIIIIllI[2]];
                    strArr[lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[11]];
                    if (llIlIIlllllIlI(item2.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIIIIIIllI[2];
                        "".length();
                        return " ".length() >= "   ".length() ? ((43 ^ 125) ^ (118 ^ 107)) & (((76 ^ 7) ^ ((253 ^ 180) & ((253 ^ 180) ^ (-1)))) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIIIIIIllI[0];
            });
        }
        if (llIlIlIIIIIIII(first)) {
            return lIlIIIIIIllI[0];
        }
        first.interact(lIlIIIIIIlIl[lIlIIIIIIllI[0]]);
        sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean cz() {
        Item first = Inventory.getFirst(item -> {
            if (!llIlIIllllllll(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[3]]) ? 1 : 0) || llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[8]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIIIIllI[2]];
                strArr[lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[9]];
                if (llIlIIlllllIlI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIIllI[2];
                    "".length();
                    return (-"  ".length()) > 0 ? ((101 ^ 113) ^ (23 ^ 50)) & (((80 ^ 111) ^ (64 ^ 78)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIIIIllI[0];
        });
        if (llIlIlIIIIIIII(first)) {
            return lIlIIIIIIllI[0];
        }
        first.interact(lIlIIIIIIlIl[lIlIIIIIIllI[2]]);
        sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    private int cA() {
        C0039n L = this.cH.L();
        if (!llIlIlIIIIIIlI(L) || llIlIIllllllll(L.a((Locatable) Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIIIllI[5];
        }
        N aM = L.aM();
        return (llIlIlIIIIIIll(aM, N.VASA) && llIlIlIIIIIIlI(NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[7]]);
        }))) ? lIlIIIIIIllI[6] : llIlIlIIIIIIll(aM, N.VESPULA) ? lIlIIIIIIllI[0] : lIlIIIIIIllI[5];
    }

    private static int llIlIIlllllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Inject
    public C0005ae(SquireChambersPlugin squireChambersPlugin) {
        this.cG = squireChambersPlugin.A();
        this.cH = squireChambersPlugin;
    }

    private static String llIlIIllllIlII(String lllllllllllllllIlllIIlIIlllIllll, String lllllllllllllllIlllIIlIIlllIlllI) {
        String lllllllllllllllIlllIIlIIlllIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIlIIlllIlllI.toCharArray();
        int lllllllllllllllIlllIIlIIlllIlIll = lIlIIIIIIllI[0];
        char[] charArray2 = lllllllllllllllIlllIIlIIlllIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIIllI[0];
        while (llIlIIllllllIl(i, length)) {
            char lllllllllllllllIlllIIlIIllllIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlllIIlIIllllIIII ^ charArray[lllllllllllllllIlllIIlIIlllIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlllIIlIIlllIlIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
