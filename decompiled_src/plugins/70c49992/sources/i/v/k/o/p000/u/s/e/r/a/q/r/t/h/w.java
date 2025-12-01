package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.w  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/w.class */
public abstract class w extends Task {
    @Inject
    protected /* synthetic */ SquireVorkathPlugin x;
    private static final /* synthetic */ int cd;
    @Inject
    protected /* synthetic */ C0003d l;
    protected final /* synthetic */ C0005f cg;
    private static /* synthetic */ String[] lIlIlIlIIIlll;
    private static /* synthetic */ int[] lIlIlIlIIlIII;
    protected final /* synthetic */ SquireVorkathConfig ce;
    @Inject
    protected /* synthetic */ C0007h ch;
    protected final /* synthetic */ Client cf;

    private static void lIlllllIlIIlIIl() {
        lIlIlIlIIlIII = new int[5];
        lIlIlIlIIlIII[0] = ((242 ^ 138) ^ (22 ^ 44)) & (((((114 + 181) - 209) + 124) ^ (((137 + 1) - 80) + 86)) ^ (-" ".length()));
        lIlIlIlIIlIII[1] = (-20673) & 29695;
        lIlIlIlIIlIII[2] = " ".length();
        lIlIlIlIIlIII[3] = "  ".length();
        lIlIlIlIIlIII[4] = (245 ^ 195) ^ (177 ^ 143);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (lIlllllIlIIlIlI(this.cf.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIIlIII[0];
        }
        int[] mapRegions = this.cf.getMapRegions();
        int i2 = lIlIlIlIIlIII[0];
        int length = mapRegions.length;
        int i3 = lIlIlIlIIlIII[0];
        do {
            if (lIlllllIlIIlIll(i3, length)) {
                if (lIlllllIlIIllII(mapRegions[i3], lIlIlIlIIlIII[1])) {
                    i2 = lIlIlIlIIlIII[2];
                    "".length();
                    if ("   ".length() < (-" ".length())) {
                        return ((((26 + 119) - 133) + 164) ^ (((93 + 75) - 135) + 148)) & (((((19 + 107) - 104) + 149) ^ (((1 + 68) - 45) + 150)) ^ (-" ".length()));
                    }
                } else {
                    i3++;
                    "".length();
                }
            }
            if (lIlllllIlIIllIl(i2) && lIlllllIlIIllIl(Q() ? 1 : 0)) {
                ?? r0 = lIlIlIlIIlIII[2];
                "".length();
                return "  ".length() >= ((49 ^ 59) ^ (206 ^ 192)) ? ((((14 + 71) - 26) + 68) ^ (17 ^ 107)) & (((((67 + 63) - 126) + 170) ^ (((33 + 160) - 160) + 138)) ^ (-" ".length())) : r0;
            }
            return lIlIlIlIIlIII[0];
        } while ("  ".length() != "   ".length());
        return ((49 ^ 86) ^ (78 ^ 114)) & (((148 ^ 168) ^ (83 ^ 52)) ^ (-" ".length()));
    }

    private static boolean lIlllllIlIIllII(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean V() {
        return lIlllllIlIIlIll(Inventory.getCount(item -> {
            String[] strArr = new String[lIlIlIlIIlIII[2]];
            strArr[lIlIlIlIIlIII[0]] = lIlIlIlIIIlll[lIlIlIlIIlIII[2]];
            return item.hasAction(strArr);
        }) + TileItems.getAll(this::a).size(), this.ce.multiple()) ? lIlIlIlIIlIII[0] : lIlIlIlIIlIII[2];
    }

    private static boolean lIlllllIlIIlIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlllllIlIIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public boolean a(TileItem tileItem) {
        ItemComposition itemComposition = this.cf.getItemComposition(tileItem.getId());
        if (!lIlllllIlIIlllI(itemComposition) && !lIlllllIlIIlllI(itemComposition.getInventoryActions())) {
            String[] inventoryActions = itemComposition.getInventoryActions();
            int length = inventoryActions.length;
            int i2 = lIlIlIlIIlIII[0];
            while (lIlllllIlIIlIll(i2, length)) {
                String llllllllllllllIllIlIllIIlllIlIII = inventoryActions[i2];
                if (lIlllllIlIIllIl(lIlIlIlIIIlll[lIlIlIlIIlIII[0]].equals(llllllllllllllIllIlIllIIlllIlIII) ? 1 : 0)) {
                    return lIlIlIlIIlIII[2];
                }
                i2++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & (true ^ true);
                }
            }
            return lIlIlIlIIlIII[0];
        }
        return lIlIlIlIIlIII[0];
    }

    public abstract boolean Q();

    private static String lIlllllIlIIIlll(String llllllllllllllIllIlIllIIllIIlIII, String llllllllllllllIllIlIllIIllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIllIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlIII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIIllIIlIIl) {
            llllllllllllllIllIlIllIIllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIlIIlIII() {
        lIlIlIlIIIlll = new String[lIlIlIlIIlIII[3]];
        lIlIlIlIIIlll[lIlIlIlIIlIII[0]] = lIlllllIlIIIllI("EwAW", "VabTq");
        lIlIlIlIIIlll[lIlIlIlIIlIII[2]] = lIlllllIlIIIlll("b+becfABivQ=", "lEREM");
    }

    private static String lIlllllIlIIIllI(String llllllllllllllIllIlIllIIllIlllIl, String llllllllllllllIllIlIllIIllIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIllIIllIllIlI = llllllllllllllIllIlIllIIllIlllII.toCharArray();
        int llllllllllllllIllIlIllIIllIllIIl = lIlIlIlIIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIlIIlIII[0];
        while (lIlllllIlIIlIll(i2, length)) {
            sb.append((char) (charArray[i2] ^ llllllllllllllIllIlIllIIllIllIlI[llllllllllllllIllIlIllIIllIllIIl % llllllllllllllIllIlIllIIllIllIlI.length]));
            "".length();
            llllllllllllllIllIlIllIIllIllIIl++;
            i2++;
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllllIlIIlIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlllllIlIIllIl(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public w(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        this.cf = client;
        this.ce = squireVorkathConfig;
        this.cg = c0005f;
    }

    static {
        lIlllllIlIIlIIl();
        lIlllllIlIIlIII();
        cd = lIlIlIlIIlIII[1];
    }
}
