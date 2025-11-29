package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer potion", priority = 5)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ag  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ag.class */
public class C0007ag extends Task {
    private static /* synthetic */ int[] lIlIIIIIl;
    private static /* synthetic */ String[] lIlIIIIII;
    private final /* synthetic */ DagannothKingConfig cI;

    private static boolean lIIIllIIlII(int i2, int i3) {
        return i2 >= i3;
    }

    private static String lIIIlIlllll(String llIIIIllllIIIIl, String llIIIIllllIIIII) {
        try {
            SecretKeySpec llIIIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIl[8], llIIIIllllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIllllIIIlI) {
            llIIIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIIII() {
        lIlIIIIII = new String[lIlIIIIIl[7]];
        lIlIIIIII[lIlIIIIIl[1]] = lIIIlIllllI("DQonCBM=", "IxNfx");
        lIlIIIIII[lIlIIIIIl[0]] = lIIIlIlllll("mJW9c+SXItQ=", "MvQHb");
        lIlIIIIII[lIlIIIIIl[8]] = lIIIlIllllI("CwU/IyV4Aio1Iw==", "XpOFW");
    }

    private static void lIIIllIIIIl() {
        lIlIIIIIl = new int[10];
        lIlIIIIIl[0] = " ".length();
        lIlIIIIIl[1] = (7 ^ 87) & ((246 ^ 166) ^ (-1));
        lIlIIIIIl[2] = (-481) & 9193;
        lIlIIIIIl[3] = (-2114) & 3943;
        lIlIIIIIl[4] = (-20745) & 30633;
        lIlIIIIIl[5] = 132 ^ 156;
        lIlIIIIIl[6] = (0 ^ 83) ^ (3 ^ 71);
        lIlIIIIIl[7] = "   ".length();
        lIlIIIIIl[8] = "  ".length();
        lIlIIIIIl[9] = 80 ^ 88;
    }

    private static boolean lIIIllIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIIlIllllI(String llIIIIlllllIllI, String llIIIIlllllIlIl) {
        String llIIIIlllllIllI2 = new String(Base64.getDecoder().decode(llIIIIlllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIlllllIlII = new StringBuilder();
        char[] charArray = llIIIIlllllIlIl.toCharArray();
        int llIIIIlllllIIlI = lIlIIIIIl[1];
        char[] charArray2 = llIIIIlllllIllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIIIIIl[1];
        while (lIIIllIIllI(i2, length)) {
            char llIIIIlllllIlll = charArray2[i2];
            llIIIIlllllIlII.append((char) (llIIIIlllllIlll ^ charArray[llIIIIlllllIIlI % charArray.length]));
            "".length();
            llIIIIlllllIIlI++;
            i2++;
            "".length();
            if (((55 ^ 36) & ((188 ^ 175) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llIIIIlllllIlII);
    }

    private static boolean lIIIllIIIlI(int i2) {
        return i2 == 0;
    }

    static {
        lIIIllIIIIl();
        lIIIllIIIII();
    }

    private static boolean lIIIllIIlIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIllIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIlIIIIIl[0]];
        iArr[lIlIIIIIl[1]] = lIlIIIIIl[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIIIllIIIlI(new WorldArea(lIlIIIIIl[3], lIlIIIIIl[4], lIlIIIIIl[5], lIlIIIIIl[6], lIlIIIIIl[1]).contains(Players.getLocal()) ? 1 : 0) && !lIIIllIIIll(nearest) && !lIIIllIIlII(Prayers.getPoints(), this.cI.restorePrayerLevel())) {
            Item first = Inventory.getFirst(item -> {
                if (!lIIIllIIIlI(item.getName().startsWith(lIlIIIIII[lIlIIIIIl[0]]) ? 1 : 0) || lIIIllIIlIl(item.getName().startsWith(lIlIIIIII[lIlIIIIIl[8]]) ? 1 : 0)) {
                    ?? r0 = lIlIIIIIl[0];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIIl[1];
            });
            if (lIIIllIIIll(first)) {
                return lIlIIIIIl[1];
            }
            first.interact(lIlIIIIII[lIlIIIIIl[1]]);
            sleep(lIlIIIIIl[7]);
            return lIlIIIIIl[0];
        }
        return lIlIIIIIl[1];
    }

    @Inject
    public C0007ag(DagannothKingConfig dagannothKingConfig) {
        this.cI = dagannothKingConfig;
    }
}
