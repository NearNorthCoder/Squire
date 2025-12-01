package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Teleport out", priority = 250, blocking = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.C  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/C.class */
public class C extends Task {
    private final /* synthetic */ SquireAlchemicalHydraConfig bg;
    private static /* synthetic */ String[] llllIlIlIIII;
    private final /* synthetic */ SquireAlchemicalHydraPlugin bf;
    private static /* synthetic */ int[] llllIlIlIlII;
    private final /* synthetic */ C0000a be;

    private static void lIIlIIIIlllIlll() {
        llllIlIlIIII = new String[llllIlIlIlII[13]];
        llllIlIlIIII[llllIlIlIlII[0]] = lIIlIIIIllIIIlI("g1brg4XmvrE=", "cljNy");
        llllIlIlIIII[llllIlIlIlII[1]] = lIIlIIIIllIIIll("zp9kTYpxn9d+eCkMnG5XhxSWAcX1D9o0", "BUWcy");
        llllIlIlIIII[llllIlIlIlII[2]] = lIIlIIIIllIIlII("HicNL2c+LUEaCAI=", "JBaJG");
        llllIlIlIIII[llllIlIlIlII[3]] = lIIlIIIIllIIIlI("6MGVOGI3zwe0ml5snu6Keg==", "NCGrF");
        llllIlIlIIII[llllIlIlIlII[4]] = lIIlIIIIllIIIlI("hk0GpavM7F4=", "hiAmB");
        llllIlIlIIII[llllIlIlIlII[5]] = lIIlIIIIllIIIll("tYRRXG+m/OAEnhCxd4fSNw==", "VDlzP");
        llllIlIlIIII[llllIlIlIlII[6]] = lIIlIIIIllIIlII("Ey8nBj4oOD8=", "GJKcN");
        llllIlIlIIII[llllIlIlIlII[7]] = lIIlIIIIllIIlII("LB8qFzI=", "nmOvY");
        llllIlIlIIII[llllIlIlIlII[8]] = lIIlIIIIllIIIll("voFNc/CuAN6NvXbooV4v8g==", "QoGFb");
        llllIlIlIIII[llllIlIlIlII[9]] = lIIlIIIIllIIIlI("SyrR132B3vbUBnIwVOf3hw==", "XLtbs");
        llllIlIlIIII[llllIlIlIlII[10]] = lIIlIIIIllIIIlI("hCT5Z1+JgbM=", "dZQgH");
        llllIlIlIIII[llllIlIlIlII[11]] = lIIlIIIIllIIIll("2fPP0aLefM8=", "BqgoQ");
        llllIlIlIIII[llllIlIlIlII[12]] = lIIlIIIIllIIIlI("rvWpx3wMN/U=", "USGyj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public boolean run() {
        int i;
        int i2;
        if (!lIIlIIIIllllIIl(this.be.g() ? 1 : 0) && !lIIlIIIIllllIlI(this.be.k())) {
            NPC K = this.be.k().K();
            if (!lIIlIIIIllllIll(K) || lIIlIIIIlllllII(K.isDead() ? 1 : 0)) {
                return llllIlIlIlII[0];
            }
            if (lIIlIIIIllllIIl(Inventory.contains(item -> {
                String[] strArr = new String[llllIlIlIlII[1]];
                strArr[llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[12]];
                return item.hasAction(strArr);
            }) ? 1 : 0) && lIIlIIIIlllllIl(Combat.getMissingHealth(), this.bg.eatAt())) {
                i = llllIlIlIlII[1];
                "".length();
                if (" ".length() <= 0) {
                    return ((157 ^ 143) ^ " ".length()) & (((((14 + 100) - (-56)) + 13) ^ (((111 + 32) - 13) + 34)) ^ (-" ".length()));
                }
            } else {
                i = llllIlIlIlII[0];
            }
            int i3 = i;
            if (lIIlIIIIllllIIl(Inventory.contains(item2 -> {
                String[] strArr = new String[llllIlIlIlII[1]];
                strArr[llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[10]];
                if (lIIlIIIIlllllII(item2.hasAction(strArr) ? 1 : 0) && lIIlIIIIlllllII(item2.getName().toLowerCase().contains(llllIlIlIIII[llllIlIlIlII[11]]) ? 1 : 0)) {
                    ?? r0 = llllIlIlIlII[1];
                    "".length();
                    return 0 != 0 ? ((40 ^ 4) ^ (60 ^ 75)) & (((60 ^ 85) ^ (57 ^ 11)) ^ (-" ".length())) : r0;
                }
                return llllIlIlIlII[0];
            }) ? 1 : 0) && lIIlIIIIlllllII(Combat.isPoisoned() ? 1 : 0)) {
                i2 = llllIlIlIlII[1];
                "".length();
                if (((189 ^ 182) & ((43 ^ 32) ^ (-1))) < (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i2 = llllIlIlIlII[0];
            }
            int lllllllllllllllIIlIlIIIllIlIIlIl = i2;
            if (lIIlIIIIllllIIl(i3) && lIIlIIIIllllIIl(lllllllllllllllIIlIlIIIllIlIIlIl) && lIIlIIIIllllIIl(this.bf.c() ? 1 : 0)) {
                return llllIlIlIlII[0];
            }
            List all = TileItems.getAll();
            if (lIIlIIIIllllIIl(all.isEmpty() ? 1 : 0) && lIIlIIIIllllIIl(Inventory.isFull() ? 1 : 0)) {
                ((TileItem) all.iterator().next()).interact(llllIlIlIIII[llllIlIlIlII[0]]);
                return llllIlIlIlII[1];
            }
            Item first = Inventory.getFirst(item3 -> {
                String[] strArr = new String[llllIlIlIlII[3]];
                strArr[llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[7]];
                strArr[llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[8]];
                strArr[llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[9]];
                return item3.hasAction(strArr);
            });
            if (lIIlIIIIllllIlI(first)) {
                Log.info(llllIlIlIIII[llllIlIlIlII[1]]);
                Magic.cast(SpellBook.Standard.TELEPORT_TO_HOUSE);
                return llllIlIlIlII[1];
            }
            String[] strArr = new String[llllIlIlIlII[1]];
            strArr[llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[2]];
            if (lIIlIIIIlllllII(first.hasAction(strArr) ? 1 : 0)) {
                first.interact(llllIlIlIIII[llllIlIlIlII[3]]);
                return llllIlIlIlII[1];
            }
            String[] strArr2 = new String[llllIlIlIlII[3]];
            strArr2[llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[4]];
            strArr2[llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[5]];
            strArr2[llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[6]];
            first.interact(strArr2);
            return llllIlIlIlII[1];
        }
        return llllIlIlIlII[0];
    }

    private static void lIIlIIIIllllIII() {
        llllIlIlIlII = new int[14];
        llllIlIlIlII[0] = (59 ^ 60) & ((132 ^ 131) ^ (-1));
        llllIlIlIlII[1] = " ".length();
        llllIlIlIlII[2] = "  ".length();
        llllIlIlIlII[3] = "   ".length();
        llllIlIlIlII[4] = 139 ^ 143;
        llllIlIlIlII[5] = (82 ^ 24) ^ (48 ^ 127);
        llllIlIlIlII[6] = 199 ^ 193;
        llllIlIlIlII[7] = (((37 + 128) - 92) + 70) ^ (((55 + 135) - 179) + 125);
        llllIlIlIlII[8] = 88 ^ 80;
        llllIlIlIlII[9] = 123 ^ 114;
        llllIlIlIlII[10] = 123 ^ 113;
        llllIlIlIlII[11] = (118 ^ 68) ^ (155 ^ 162);
        llllIlIlIlII[12] = (24 ^ 1) ^ (62 ^ 43);
        llllIlIlIlII[13] = 22 ^ 27;
    }

    private static boolean lIIlIIIIllllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIlllllIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIIIIllIIIlI(String lllllllllllllllIIlIlIIIllIIlIlll, String lllllllllllllllIIlIlIIIllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), llllIlIlIlII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIlIlII[2], lllllllllllllllIIlIlIIIllIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIllIIllIlI) {
            lllllllllllllllIIlIlIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlllllII(int i) {
        return i != 0;
    }

    static {
        lIIlIIIIllllIII();
        lIIlIIIIlllIlll();
    }

    @Inject
    public C(C0000a c0000a, SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.be = c0000a;
        this.bf = squireAlchemicalHydraPlugin;
        this.bg = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIllIIIll(String lllllllllllllllIIlIlIIIllIIIllII, String lllllllllllllllIIlIlIIIllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIlII[2], lllllllllllllllIIlIlIIIllIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIllIIIllIl) {
            lllllllllllllllIIlIlIIIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllllIIl(int i) {
        return i == 0;
    }

    private static String lIIlIIIIllIIlII(String lllllllllllllllIIlIlIIIlIlllllII, String lllllllllllllllIIlIlIIIlIllllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIlIIIlIllllIIl = lllllllllllllllIIlIlIIIlIllllIll.toCharArray();
        int lllllllllllllllIIlIlIIIlIllllIII = llllIlIlIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIlIlIlII[0];
        while (lIIlIIIIllllllI(i, length)) {
            char lllllllllllllllIIlIlIIIlIlllllIl = charArray[i];
            sb.append((char) (lllllllllllllllIIlIlIIIlIlllllIl ^ lllllllllllllllIIlIlIIIlIllllIIl[lllllllllllllllIIlIlIIIlIllllIII % lllllllllllllllIIlIlIIIlIllllIIl.length]));
            "".length();
            lllllllllllllllIIlIlIIIlIllllIII++;
            i++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIIIllllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIllllIlI(Object obj) {
        return obj == null;
    }
}
