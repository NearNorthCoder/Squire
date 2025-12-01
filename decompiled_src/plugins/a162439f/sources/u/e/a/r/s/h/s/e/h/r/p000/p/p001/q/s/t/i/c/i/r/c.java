package u.e.a.r.s.h.s.e.h.r.p000.p.p001.q.s.t.i.c.i.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.charters.SquireCharterShips;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Charter shiping")
/* renamed from: u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r.c  reason: invalid package */
/* loaded from: a162439f-48e7-4aeb-adb7-778d42249168.jar:u/e/a/r/s/h/s/e/h/r/-/p/-/q/s/t/i/c/i/r/c.class */
public class c extends Task {
    private static /* synthetic */ String[] lIlIllIllllI;
    private /* synthetic */ boolean c;
    @Inject
    private /* synthetic */ SquireCharterShips b;
    private /* synthetic */ boolean e;
    private static /* synthetic */ int[] lIlIlllIIIIl;
    private /* synthetic */ int d;

    private static boolean lllIIIIlIlIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    private void a(int lllllllllllllllIllIIlIIlIIIlIIII, int i) {
        if (!lllIIIIlIlIIII(Shop.getStock(lIlIlllIIIIl[7])) || lllIIIIlIlIllI(Shop.getStock(lIlIlllIIIIl[8]))) {
            this.c = lIlIlllIIIIl[2];
            Keyboard.type(lIlIlllIIIIl[11]);
            return;
        }
        ?? r0 = lIlIlllIIIIl[2];
        int[] iArr = new int[lIlIlllIIIIl[2]];
        iArr[lIlIlllIIIIl[1]] = lIlIlllIIIIl[12];
        if (lllIIIIlIlIIll(Inventory.getCount((boolean) r0, iArr), lIlIlllIIIIl[13])) {
            Log.info(lIlIllIllllI[lIlIlllIIIIl[2]]);
            this.b.forceStop();
        } else if (!lllIIIIlIlIIll(lllllllllllllllIllIIlIIlIIIlIIII, i)) {
            Shop.buyTen(lIlIlllIIIIl[8]);
        } else {
            Shop.buyTen(lIlIlllIIIIl[7]);
            "".length();
            if ((-(((79 ^ 0) & ((222 ^ 145) ^ (-1))) ^ (110 ^ 106))) >= 0) {
            }
        }
    }

    private static boolean lllIIIIlIlIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean h() {
        if (lllIIIIlIlIlII(Players.getLocal().getAnimation(), lIlIlllIIIIl[10])) {
            int[] iArr = new int[lIlIlllIIIIl[2]];
            iArr[lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
            if (lllIIIIlIlIlIl(Inventory.getCount(iArr))) {
                ?? r0 = lIlIlllIIIIl[2];
                "".length();
                return "  ".length() != "  ".length() ? ((63 ^ 32) ^ (77 ^ 6)) & (((((47 + 56) - (-63)) + 75) ^ (((70 + 36) - (-14)) + 45)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIlllIIIIl[1];
    }

    private void b(int i, int i2) {
        if (lllIIIIlIlIlIl(i) && lllIIIIlIlIlIl(i2)) {
            SpellBook.Lunar lunar = SpellBook.Lunar.SUPERGLASS_MAKE;
            if (lllIIIIlIlIllI(lunar.canCast() ? 1 : 0)) {
                Log.info(lIlIllIllllI[lIlIlllIIIIl[5]]);
                this.b.forceStop();
                return;
            }
            Magic.cast(lunar);
        }
        int[] iArr = new int[lIlIlllIIIIl[2]];
        iArr[lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (lllIIIIlIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
            return;
        }
        if (lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(a.b().a());
            this.d = lIlIlllIIIIl[0];
            return;
        }
        Inventory.use(lIlIlllIIIIl[4], lIlIlllIIIIl[6]);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean g() {
        int i = this.d;
        this.d = i - lIlIlllIIIIl[2];
        if (lllIIIIlIlIIIl(i, lIlIlllIIIIl[2])) {
            ?? r0 = lIlIlllIIIIl[2];
            "".length();
            return 0 != 0 ? true & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIIIIl[1];
    }

    private static boolean lllIIIIlIlIllI(int i) {
        return i == 0;
    }

    static {
        lllIIIIlIIllll();
        lllIIIIlIIllIl();
    }

    private static int f() {
        int i = lIlIlllIIIIl[1];
        a[] values = a.values();
        int length = values.length;
        int i2 = lIlIlllIIIIl[1];
        while (lllIIIIlIlIIll(i2, length)) {
            a aVar = values[i2];
            int[] iArr = new int[lIlIlllIIIIl[2]];
            iArr[lIlIlllIIIIl[1]] = aVar.c();
            if (lllIIIIlIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIlllIIIIl[2]];
                iArr2[lIlIlllIIIIl[1]] = aVar.c();
                int count = Inventory.getCount(iArr2);
                if (lllIIIIlIlIIIl(i, lIlIlllIIIIl[3])) {
                    "".length();
                    if ((-" ".length()) > "   ".length()) {
                        return ((118 ^ 79) ^ (210 ^ 182)) & (((176 ^ 133) ^ (233 ^ 129)) ^ (-" ".length()));
                    }
                } else {
                    int[] iArr3 = new int[lIlIlllIIIIl[2]];
                    iArr3[lIlIlllIIIIl[1]] = aVar.c();
                    Inventory.dropAll(iArr3);
                    "".length();
                    i += count;
                }
            }
            i2++;
            "".length();
            if ((((87 ^ 6) ^ (28 ^ 47)) & (((179 ^ 175) ^ (9 ^ 119)) ^ (-" ".length()))) != 0) {
                return ((((71 + 109) - 72) + 25) ^ (((95 + 139) - 114) + 23)) & (((88 ^ 122) ^ (106 ^ 66)) ^ (-" ".length()));
            }
        }
        return i;
    }

    private static String lllIIIIlIIlIlI(String lllllllllllllllIllIIlIIIlllllIII, String lllllllllllllllIllIIlIIIllllIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIIIllllIllI = new StringBuilder();
        char[] lllllllllllllllIllIIlIIIllllIlIl = lllllllllllllllIllIIlIIIllllIlll.toCharArray();
        int lllllllllllllllIllIIlIIIllllIlII = lIlIlllIIIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllIIIIl[1];
        while (lllIIIIlIlIIll(i, length)) {
            lllllllllllllllIllIIlIIIllllIllI.append((char) (charArray[i] ^ lllllllllllllllIllIIlIIIllllIlIl[lllllllllllllllIllIIlIIIllllIlII % lllllllllllllllIllIIlIIIllllIlIl.length]));
            "".length();
            lllllllllllllllIllIIlIIIllllIlII++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIlIIIllllIllI);
    }

    private static String lllIIIIlIIllII(String lllllllllllllllIllIIlIIIllIlIllI, String lllllllllllllllIllIIlIIIllIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIIIIl[5], lllllllllllllllIllIIlIIIllIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIllIlIlll) {
            lllllllllllllllIllIIlIIIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIlIIlIll(String lllllllllllllllIllIIlIIIlllIIIll, String lllllllllllllllIllIIlIIIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlllIIIIl[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIIIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIlllIIlII) {
            lllllllllllllllIllIIlIIIlllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36, types: [boolean] */
    public boolean run() {
        if (lllIIIIlIlIIII(h() ? 1 : 0)) {
            this.d = lIlIlllIIIIl[0];
        }
        if (lllIIIIlIlIIII(g() ? 1 : 0)) {
            return lIlIlllIIIIl[1];
        }
        if (lllIIIIlIlIIII(i() ? 1 : 0)) {
            this.e = lIlIlllIIIIl[2];
        }
        if (lllIIIIlIlIIII(this.e ? 1 : 0)) {
            if (lllIIIIlIlIIIl(f(), lIlIlllIIIIl[3])) {
                return lIlIlllIIIIl[2];
            }
            this.e = lIlIlllIIIIl[1];
        }
        a b = a.b();
        int[] iArr = new int[lIlIlllIIIIl[2]];
        iArr[lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
        if (lllIIIIlIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
            if (lllIIIIlIlIIII(Production.isOpen() ? 1 : 0)) {
                Production.chooseOption(b.a());
                this.d = lIlIlllIIIIl[5];
                return lIlIlllIIIIl[1];
            }
            Inventory.use(lIlIlllIIIIl[4], lIlIlllIIIIl[6]);
            "".length();
            return lIlIlllIIIIl[2];
        }
        int[] iArr2 = new int[lIlIlllIIIIl[2]];
        iArr2[lIlIlllIIIIl[1]] = lIlIlllIIIIl[7];
        int count = Inventory.getCount(iArr2);
        int[] iArr3 = new int[lIlIlllIIIIl[2]];
        iArr3[lIlIlllIIIIl[1]] = lIlIlllIIIIl[8];
        int count2 = Inventory.getCount(iArr3);
        int[] iArr4 = new int[lIlIlllIIIIl[2]];
        iArr4[lIlIlllIIIIl[1]] = lIlIlllIIIIl[9];
        int count3 = count2 + Inventory.getCount(iArr4);
        if (lllIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            b(count, count3);
            return lIlIlllIIIIl[2];
        } else if (lllIIIIlIlIIII(this.c ? 1 : 0)) {
            Worlds.hopTo(Worlds.getRandom(world -> {
                if (lllIIIIlIlIIII(world.isNormal() ? 1 : 0) && lllIIIIlIlIIII(world.isMembers() ? 1 : 0)) {
                    ?? r0 = lIlIlllIIIIl[2];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlllIIIIl[1];
            }));
            this.c = lIlIlllIIIIl[1];
            return lIlIlllIIIIl[2];
        } else if (lllIIIIlIlIIII(Shop.isOpen() ? 1 : 0)) {
            a(count, count3);
            return lIlIlllIIIIl[2];
        } else {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lllIIIIlIlIIII(npc.getName().contains(lIlIllIllllI[lIlIlllIIIIl[14]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIlllIIIIl[2]];
                    strArr[lIlIlllIIIIl[1]] = lIlIllIllllI[lIlIlllIIIIl[0]];
                    if (lllIIIIlIlIIII(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIlllIIIIl[2];
                        "".length();
                        return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIlllIIIIl[1];
            });
            if (lllIIIIlIlIIlI(nearest)) {
                return lIlIlllIIIIl[1];
            }
            nearest.interact(lIlIllIllllI[lIlIlllIIIIl[1]]);
            return lIlIlllIIIIl[2];
        }
    }

    private static boolean lllIIIIlIlIIII(int i) {
        return i != 0;
    }

    private static boolean lllIIIIlIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIIIIlIlIlII(int i, int i2) {
        return i == i2;
    }

    private static void lllIIIIlIIllll() {
        lIlIlllIIIIl = new int[16];
        lIlIlllIIIIl[0] = (34 ^ 71) ^ (94 ^ 63);
        lIlIlllIIIIl[1] = (116 ^ 101) & ((176 ^ 161) ^ (-1));
        lIlIlllIIIIl[2] = " ".length();
        lIlIlllIIIIl[3] = (((60 + 82) - (-3)) + 42) ^ (((141 + 22) - 72) + 88);
        lIlIlllIIIIl[4] = (-28945) & 30719;
        lIlIlllIIIIl[5] = "  ".length();
        lIlIlllIIIIl[6] = (-((-16529) & 31125)) & (-3) & 16383;
        lIlIlllIIIIl[7] = (-((-10263) & 26903)) & (-12297) & 30719;
        lIlIlllIIIIl[8] = (-((-8577) & 30127)) & (-577) & 22527;
        lIlIlllIIIIl[9] = (-((-12755) & 31195)) & (-8451) & 28671;
        lIlIlllIIIIl[10] = (-28804) & 29687;
        lIlIlllIIIIl[11] = 65 ^ 90;
        lIlIlllIIIIl[12] = (-((-1921) & 3989)) & (-13313) & 16375;
        lIlIlllIIIIl[13] = 206 ^ 170;
        lIlIlllIIIIl[14] = "   ".length();
        lIlIlllIIIIl[15] = (237 ^ 151) ^ (((51 + 69) - 108) + 115);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    private static boolean i() {
        if (lllIIIIlIlIIII(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lIlIlllIIIIl[2]];
            iArr[lIlIlllIIIIl[1]] = lIlIlllIIIIl[4];
            if (lllIIIIlIlIllI(Inventory.getCount(iArr))) {
                ?? r0 = lIlIlllIIIIl[2];
                "".length();
                return (-" ".length()) >= 0 ? ((244 ^ 132) ^ (44 ^ 64)) & (((((88 + 81) - 119) + 128) ^ (((71 + 83) - 138) + 158)) ^ (-" ".length())) : r0;
            }
        }
        return lIlIlllIIIIl[1];
    }

    private static boolean lllIIIIlIlIIlI(Object obj) {
        return obj == null;
    }

    private static void lllIIIIlIIllIl() {
        lIlIllIllllI = new String[lIlIlllIIIIl[15]];
        lIlIllIllllI[lIlIlllIIIIl[1]] = lllIIIIlIIlIlI("JTMLEzc=", "qAjwR");
        lIlIllIllllI[lIlIlllIIIIl[2]] = lllIIIIlIIlIlI("KxMoKgARCSB6Eh0EJi8DHUcwP1AZFSJ6Hw0TZzUWWAQoMx4L", "xgGZp");
        lIlIllIllllI[lIlIlllIIIIl[5]] = lllIIIIlIIlIlI("MDgtKDYKIiV4JAYvIy01Bmw1PWYALSw2KRdsITk1F2wxLTYGPiU0JxA/YjUnCCk=", "cLBXF");
        lIlIllIllllI[lIlIlllIIIIl[14]] = lllIIIIlIIlIll("fu2cnrtnm20=", "HMGPg");
        lIlIllIllllI[lIlIlllIIIIl[0]] = lllIIIIlIIllII("UUtbZx0GfqQ=", "LnJYP");
    }
}
