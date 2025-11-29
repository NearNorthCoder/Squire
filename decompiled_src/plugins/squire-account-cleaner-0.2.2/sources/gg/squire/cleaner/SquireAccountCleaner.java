package gg.squire.cleaner;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import u.r.i.l.a.e.c.t.p000.q.s.c.n.a.c.u.o.e.p001.e.r.n.a;
import u.r.i.l.a.e.c.t.p000.q.s.c.n.a.c.u.o.e.p001.e.r.n.b;
@SquireUtil
@PluginDescriptor(name = "Squire Account Cleaner", enabledByDefault = false)
/* loaded from: squire-account-cleaner-0.2.2.jar:gg/squire/cleaner/SquireAccountCleaner.class */
public class SquireAccountCleaner extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireAccountCleanerConfig c;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ EventBus b;
    private static /* synthetic */ int[] lIlIlIIIIll;
    private static /* synthetic */ String[] lIlIlIIIIlI;

    private static String lIIlIIIIlllIlI(String llllllllllllllllIlIlllIlIllllIlI, String llllllllllllllllIlIlllIlIlllIlII) {
        String llllllllllllllllIlIlllIlIllllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlllIlIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIlllIlIlllIlll = llllllllllllllllIlIlllIlIlllIlII.toCharArray();
        int llllllllllllllllIlIlllIlIlllIllI = lIlIlIIIIll[1];
        char[] charArray = llllllllllllllllIlIlllIlIllllIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIIll[1];
        while (lIIlIIIlIIIIII(i, length)) {
            char llllllllllllllllIlIlllIlIllllIll = charArray[i];
            sb.append((char) (llllllllllllllllIlIlllIlIllllIll ^ llllllllllllllllIlIlllIlIlllIlll[llllllllllllllllIlIlllIlIlllIllI % llllllllllllllllIlIlllIlIlllIlll.length]));
            "".length();
            llllllllllllllllIlIlllIlIlllIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIIIllllll(int i) {
        return i != 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIlIIIIll[0]];
        clsArr[lIlIlIIIIll[1]] = a.class;
        clsArr[lIlIlIIIIll[2]] = b.class;
        return clsArr;
    }

    private static boolean lIIlIIIIlllllI(int i) {
        return i == 0;
    }

    @Provides
    SquireAccountCleanerConfig a(ConfigManager configManager) {
        return (SquireAccountCleanerConfig) configManager.getConfig(SquireAccountCleanerConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v39, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v43 */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        boolean z;
        if (lIIlIIIIlllllI(configButtonClicked.getGroup().equals(lIlIlIIIIlI[lIlIlIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        if (lIIlIIIIllllll(configButtonClicked.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[2]]) ? 1 : 0)) {
            if (lIIlIIIIlllllI(isPaused() ? 1 : 0)) {
                ?? r1 = lIlIlIIIIll[2];
                "".length();
                z = r1;
                if (" ".length() != " ".length()) {
                    return;
                }
            } else {
                z = lIlIlIIIIll[1];
            }
            setPaused(z);
        }
        if (lIIlIIIIllllll(configButtonClicked.getKey().equals(lIlIlIIIIlI[lIlIlIIIIll[0]]) ? 1 : 0)) {
            String ignoreList = this.c.ignoreList();
            ArrayList<Integer> arrayList = new ArrayList();
            if (lIIlIIIIlllllI(ignoreList.isEmpty() ? 1 : 0)) {
                String[] split = ignoreList.split(lIlIlIIIIlI[lIlIlIIIIll[3]]);
                int llllllllllllllllIlIlllIllIlIIIlI = split.length;
                int i = lIlIlIIIIll[1];
                while (lIIlIIIlIIIIII(i, llllllllllllllllIlIlllIllIlIIIlI)) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(split[i])));
                    "".length();
                    i++;
                    "".length();
                    if ((-" ".length()) > ((((54 + 158) - 210) + 197) ^ (((179 + 120) - 132) + 28))) {
                        return;
                    }
                }
            }
            for (Item item : Inventory.getAll()) {
                if (lIIlIIIIlllllI(arrayList.contains(Integer.valueOf(item.getId())) ? 1 : 0)) {
                    arrayList.add(Integer.valueOf(item.getId()));
                    "".length();
                }
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Integer num : arrayList) {
                int llllllllllllllllIlIlllIllIlIIIlI2 = num.intValue();
                sb.append(llllllllllllllllIlIlllIllIlIIIlI2).append(lIlIlIIIIlI[lIlIlIIIIll[4]]);
                "".length();
                "".length();
                if (0 != 0) {
                    return;
                }
            }
            Static.getConfigManager().setConfiguration(lIlIlIIIIlI[lIlIlIIIIll[5]], lIlIlIIIIlI[lIlIlIIIIll[6]], String.valueOf(sb));
        }
    }

    private static boolean lIIlIIIlIIIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIlllIIl(String llllllllllllllllIlIlllIllIIlIlll, String llllllllllllllllIlIlllIllIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlllIllIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlllIllIIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlllIllIIllIIl.init(lIlIlIIIIll[0], llllllllllllllllIlIlllIllIIllIlI);
            return new String(llllllllllllllllIlIlllIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlllIllIIllIII) {
            llllllllllllllllIlIlllIllIIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIllllII() {
        lIlIlIIIIlI = new String[lIlIlIIIIll[7]];
        lIlIlIIIIlI[lIlIlIIIIll[1]] = lIIlIIIIlllIIl("KJBcsX7wSc6jjqPqZi7uFQ==", "truak");
        lIlIlIIIIlI[lIlIlIIIIll[2]] = lIIlIIIIlllIIl("zZ4ZB0xwPLU=", "CPjxx");
        lIlIlIIIIlI[lIlIlIIIIll[0]] = lIIlIIIIlllIlI("BhwpEiAuHyMpPQI=", "gxMFO");
        lIlIlIIIIlI[lIlIlIIIIll[3]] = lIIlIIIIlllIll("7M+ZyTDyNXw=", "vQwQk");
        lIlIlIIIIlI[lIlIlIIIIll[4]] = lIIlIIIIlllIlI("Vg==", "zHVpk");
        lIlIlIIIIlI[lIlIlIIIIll[5]] = lIIlIIIIlllIIl("gZcUZoRiGj4h0bKCpWmH2Q==", "RtNfX");
        lIlIlIIIIlI[lIlIlIIIIll[6]] = lIIlIIIIlllIll("f8M65SOSbF1kNKF/EhZ1nw==", "WYOsQ");
    }

    static {
        lIIlIIIIllllIl();
        lIIlIIIIllllII();
    }

    protected void onStart() {
    }

    private static void lIIlIIIIllllIl() {
        lIlIlIIIIll = new int[9];
        lIlIlIIIIll[0] = "  ".length();
        lIlIlIIIIll[1] = (237 ^ 183) & ((27 ^ 65) ^ (-1));
        lIlIlIIIIll[2] = " ".length();
        lIlIlIIIIll[3] = "   ".length();
        lIlIlIIIIll[4] = (208 ^ 135) ^ (18 ^ 65);
        lIlIlIIIIll[5] = 187 ^ 190;
        lIlIlIIIIll[6] = (20 ^ 40) ^ (31 ^ 37);
        lIlIlIIIIll[7] = 139 ^ 140;
        lIlIlIIIIll[8] = (((122 + 130) - 219) + 122) ^ (((5 + 99) - 99) + 142);
    }

    private static String lIIlIIIIlllIll(String llllllllllllllllIlIlllIllIIIlIlI, String llllllllllllllllIlIlllIllIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlllIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIll[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlllIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlllIllIIIlIll) {
            llllllllllllllllIlIlllIllIIIlIll.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }
}
