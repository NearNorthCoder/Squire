package gg.squire.leagues.cooking;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@SquireUtil
@PluginDescriptor(name = "[Leagues] 1t cooker", enabledByDefault = false)
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/cooking/TickCooker.class */
public class TickCooker extends SquirePlugin {
    private static /* synthetic */ String[] lll;
    private static /* synthetic */ int[] lIIl;

    private static String lIII(String llllllllIlIIIll, String llllllllIlIIIlI) {
        String llllllllIlIIIll2 = new String(Base64.getDecoder().decode(llllllllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllIlIIIIl = new StringBuilder();
        char[] charArray = llllllllIlIIIlI.toCharArray();
        int llllllllIIlllll = lIIl[0];
        char[] charArray2 = llllllllIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIl[0];
        while (lIlII(i2, length)) {
            char llllllllIlIIlII = charArray2[i2];
            llllllllIlIIIIl.append((char) (llllllllIlIIlII ^ charArray[llllllllIIlllll % charArray.length]));
            "".length();
            llllllllIIlllll++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllIlIIIIl);
    }

    private static boolean lIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private static void llIl() {
        lIIl = new int[9];
        lIIl[0] = ((63 ^ 107) ^ (111 ^ 37)) & (((86 ^ 111) ^ (172 ^ 139)) ^ (-" ".length()));
        lIIl[1] = " ".length();
        lIIl[2] = 179 ^ 188;
        lIIl[3] = (36 ^ 85) ^ (253 ^ 152);
        lIIl[4] = "  ".length();
        lIIl[5] = "   ".length();
        lIIl[6] = 195 ^ 199;
        lIIl[7] = 44 ^ 41;
        lIIl[8] = (139 ^ 195) ^ (236 ^ 172);
    }

    private static boolean lIlII(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStart() {
    }

    private static boolean llll(int i2) {
        return i2 == 0;
    }

    public void onGameTick(GameTick gameTick) {
        Item item = Inventory.getItem(lIIl[0]);
        if (!lllI(item) || llll(item.isNoted() ? 1 : 0)) {
            return;
        }
        Item first = Inventory.getFirst(item2 -> {
            if (lIIlI(item2.getName().contains(lll[lIIl[6]]) ? 1 : 0) && llll(item2.isNoted() ? 1 : 0)) {
                ?? r0 = lIIl[1];
                "".length();
                return "  ".length() != "  ".length() ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
            }
            return lIIl[0];
        });
        if (lllI(first)) {
            int[] iArr = new int[lIIl[1]];
            iArr[lIIl[0]] = first.getId();
            Item first2 = Inventory.getFirst(iArr);
            int[] iArr2 = new int[lIIl[1]];
            iArr2[lIIl[0]] = a.a;
            first2.useOn(Inventory.getFirst(iArr2));
            return;
        }
        List all = Inventory.getAll(item3 -> {
            String[] strArr = new String[lIIl[1]];
            strArr[lIIl[0]] = lll[lIIl[5]];
            if (lIIlI(item3.hasAction(strArr) ? 1 : 0) && llll(item3.isNoted() ? 1 : 0)) {
                ?? r0 = lIIl[1];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIl[0];
        });
        if (llll(all.isEmpty() ? 1 : 0) && lIIII(all.size(), lIIl[2])) {
            int[] iArr3 = new int[lIIl[1]];
            iArr3[lIIl[0]] = a.a;
            ((Item) all.get(lIIl[0])).useOn(Inventory.getFirst(iArr3));
            return;
        }
        if (lIIIl(Inventory.getFirst(item4 -> {
            if (llll(item4.isNoted() ? 1 : 0) && lIIlI(item4.getName().equals(item.getName()) ? 1 : 0)) {
                ?? r0 = lIIl[1];
                "".length();
                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIl[0];
        }))) {
            Inventory.use(item5 -> {
                if (lIIll(item5.getId(), item.getId())) {
                    ?? r0 = lIIl[1];
                    "".length();
                    return (-"  ".length()) > 0 ? ((190 ^ 186) ^ (118 ^ 78)) & (((((61 + 151) - 133) + 172) ^ (((177 + 43) - 217) + 196)) ^ (-" ".length())) : r0;
                }
                return lIIl[0];
            }, item6 -> {
                if (lIIll(item6.getId(), a.a)) {
                    ?? r0 = lIIl[1];
                    "".length();
                    return (-(125 ^ 121)) >= 0 ? (true ^ true) & ((!true) ^ true) : r0;
                }
                return lIIl[0];
            });
            "".length();
        }
        List all2 = Inventory.getAll(item7 -> {
            if (llll(item7.isNoted() ? 1 : 0)) {
                String[] strArr = new String[lIIl[1]];
                strArr[lIIl[0]] = lll[lIIl[4]];
                if (lIIlI(item7.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIl[1];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIl[0];
        });
        if (!llll(all2.isEmpty() ? 1 : 0) || !lIIII(all2.size(), lIIl[3])) {
            TileObjects.getNearest(tileObject -> {
                String[] strArr = new String[lIIl[1]];
                strArr[lIIl[0]] = lll[lIIl[1]];
                return tileObject.hasAction(strArr);
            }).interact(lll[lIIl[0]]);
            return;
        }
        int[] iArr4 = new int[lIIl[1]];
        iArr4[lIIl[0]] = a.a;
        ((Item) all2.get(lIIl[0])).useOn(Inventory.getFirst(iArr4));
    }

    private static boolean lIIIl(Object obj) {
        return obj == null;
    }

    private static String lIIl(String llllllllIllIIll, String llllllllIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIllIlII) {
            llllllllIllIlII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }

    @Provides
    TickCookerconfig b(ConfigManager configManager) {
        return (TickCookerconfig) configManager.getConfig(TickCookerconfig.class);
    }

    private static boolean lllI(Object obj) {
        return obj != null;
    }

    static {
        llIl();
        llII();
    }

    private static void llII() {
        lll = new String[lIIl[7]];
        lll[lIIl[0]] = lIII("OTYcOw==", "zYsPj");
        lll[lIIl[1]] = lIIl("aa5U9QeifHI=", "XkhvD");
        lll[lIIl[4]] = lIlI("gKn4YQtmtH0=", "ZXfNC");
        lll[lIIl[5]] = lIIl("9HCEThxjA7k=", "OXmzD");
        lll[lIIl[6]] = lIII("OBcwGho=", "zbBtn");
    }

    private static boolean lIIll(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlI(String llllllllIIIlllI, String llllllllIIIllIl) {
        try {
            SecretKeySpec llllllllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIl[4], llllllllIIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllIIIllll) {
            llllllllIIIllll.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        return new Class[lIIl[0]];
    }

    private static boolean lIIlI(int i2) {
        return i2 != 0;
    }
}
