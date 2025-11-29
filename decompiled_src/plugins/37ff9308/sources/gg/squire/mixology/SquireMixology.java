package gg.squire.mixology;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mixology.overlay.MixologyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.g;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.h;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.i;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.j;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.k;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.l;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.m;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.n;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.o;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.p;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.q;
@PluginDescriptor(name = "Squire Mixology", enabledByDefault = false)
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:gg/squire/mixology/SquireMixology.class */
public class SquireMixology extends SquirePlugin {
    public static /* synthetic */ int w;
    @Inject
    private /* synthetic */ g e;
    public static /* synthetic */ int r;
    public static /* synthetic */ String n;
    public static /* synthetic */ String m;
    public static /* synthetic */ String g;
    public static /* synthetic */ int i;
    public static /* synthetic */ long l;
    private static /* synthetic */ int[] lIIIIIIIIlIlI;
    public static /* synthetic */ int h;
    @Inject
    private /* synthetic */ SquireMixologyConfig c;
    public static /* synthetic */ int x;
    public static /* synthetic */ List<String> y;
    public static /* synthetic */ int t;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ MixologyInfoBox d;
    public static /* synthetic */ List<Integer> z;
    public static /* synthetic */ int u;
    public static /* synthetic */ int s;
    private static /* synthetic */ String[] lIIIIIIIIlIIl;
    public static /* synthetic */ int v;
    public static /* synthetic */ String f;

    /* renamed from: o  reason: collision with root package name */
    public static /* synthetic */ String f0o;
    public static /* synthetic */ boolean A;
    public static /* synthetic */ String q;
    public static /* synthetic */ boolean j;
    @Inject
    private /* synthetic */ EventBus b;
    public static /* synthetic */ String p;
    public static /* synthetic */ boolean k;

    @Provides
    SquireMixologyConfig a(ConfigManager configManager) {
        return (SquireMixologyConfig) configManager.getConfig(SquireMixologyConfig.class);
    }

    private static boolean lIIlIllIIlIllll(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIlIllIIlIllII() {
        lIIIIIIIIlIlI = new int[21];
        lIIIIIIIIlIlI[0] = 96 ^ 106;
        lIIIIIIIIlIlI[1] = (109 ^ 45) & ((242 ^ 178) ^ (-1));
        lIIIIIIIIlIlI[2] = " ".length();
        lIIIIIIIIlIlI[3] = "  ".length();
        lIIIIIIIIlIlI[4] = "   ".length();
        lIIIIIIIIlIlI[5] = 159 ^ 155;
        lIIIIIIIIlIlI[6] = 43 ^ 46;
        lIIIIIIIIlIlI[7] = (161 ^ 143) ^ (112 ^ 88);
        lIIIIIIIIlIlI[8] = 42 ^ 45;
        lIIIIIIIIlIlI[9] = (117 ^ 63) ^ (125 ^ 63);
        lIIIIIIIIlIlI[10] = (61 ^ 93) ^ (247 ^ 158);
        lIIIIIIIIlIlI[11] = -" ".length();
        lIIIIIIIIlIlI[12] = (((15 + 18) - 30) + 188) ^ (((97 + 143) - 179) + 119);
        lIIIIIIIIlIlI[13] = (((94 + 86) - 147) + 156) ^ (((175 + 87) - 128) + 43);
        lIIIIIIIIlIlI[14] = (((36 + 34) - (-43)) + 87) ^ (((133 + 26) - 120) + 158);
        lIIIIIIIIlIlI[15] = 61 ^ 51;
        lIIIIIIIIlIlI[16] = (192 ^ 196) ^ (141 ^ 134);
        lIIIIIIIIlIlI[17] = (77 ^ 69) ^ (95 ^ 71);
        lIIIIIIIIlIlI[18] = 106 ^ 123;
        lIIIIIIIIlIlI[19] = 80 ^ 66;
        lIIIIIIIIlIlI[20] = (98 ^ 108) ^ (13 ^ 16);
    }

    private static String lIIlIllIIlIlIIl(String lllllllllllllllIIlIIIIIIIlIlIIlI, String lllllllllllllllIIlIIIIIIIlIlIIIl) {
        String lllllllllllllllIIlIIIIIIIlIlIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIIIlIIllll = lllllllllllllllIIlIIIIIIIlIlIIIl.toCharArray();
        int lllllllllllllllIIlIIIIIIIlIIlIIl = lIIIIIIIIlIlI[1];
        char[] charArray = lllllllllllllllIIlIIIIIIIlIlIIlI2.toCharArray();
        int length = charArray.length;
        int i2 = lIIIIIIIIlIlI[1];
        while (lIIlIllIIlIllll(i2, length)) {
            sb.append((char) (charArray[i2] ^ lllllllllllllllIIlIIIIIIIlIIllll[lllllllllllllllIIlIIIIIIIlIIlIIl % lllllllllllllllIIlIIIIIIIlIIllll.length]));
            "".length();
            lllllllllllllllIIlIIIIIIIlIIlIIl++;
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        boolean z2;
        if (!lIIlIllIIlIllIl(configButtonClicked.getGroup().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[6]]) ? 1 : 0) && lIIlIllIIlIlllI(configButtonClicked.getKey().equals(lIIIIIIIIlIIl[lIIIIIIIIlIlI[7]]) ? 1 : 0)) {
            if (lIIlIllIIlIllIl(isPaused() ? 1 : 0)) {
                ?? r1 = lIIIIIIIIlIlI[2];
                "".length();
                z2 = r1;
                if ((-" ".length()) > "   ".length()) {
                    return;
                }
            } else {
                z2 = lIIIIIIIIlIlI[1];
            }
            setPaused(z2);
        }
    }

    private static boolean lIIlIllIIlIlllI(int i2) {
        return i2 != 0;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIIIIIIlIlI[0]];
        clsArr[lIIIIIIIIlIlI[1]] = i.class;
        clsArr[lIIIIIIIIlIlI[2]] = m.class;
        clsArr[lIIIIIIIIlIlI[3]] = p.class;
        clsArr[lIIIIIIIIlIlI[4]] = o.class;
        clsArr[lIIIIIIIIlIlI[5]] = n.class;
        clsArr[lIIIIIIIIlIlI[6]] = k.class;
        clsArr[lIIIIIIIIlIlI[7]] = l.class;
        clsArr[lIIIIIIIIlIlI[8]] = j.class;
        clsArr[lIIIIIIIIlIlI[9]] = q.class;
        clsArr[lIIIIIIIIlIlI[10]] = h.class;
        return clsArr;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    private static boolean lIIlIllIIlIllIl(int i2) {
        return i2 == 0;
    }

    private static void lIIlIllIIlIlIll() {
        lIIIIIIIIlIIl = new String[lIIIIIIIIlIlI[20]];
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[1]] = lIIlIllIIlIlIII("zM5h/68P3lpffYs2+UDm/Q==", "Xhdns");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[2]] = lIIlIllIIlIlIIl("ISAKLgM=", "dMzZz");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[3]] = lIIlIllIIlIlIIl("NSg2Ozo=", "pEFOC");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[4]] = lIIlIllIIlIlIIl("FT4eEgM=", "PSnfz");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[5]] = lIIlIllIIlIlIIl("FjgUAgA=", "SUdvy");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[6]] = lIIlIllIIlIlIIl("ERY9OiUHCiErOA4ILyo=", "bgHSW");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[7]] = lIIlIllIIlIlIIl("Pwo2CRQ=", "OkCzq");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[8]] = lIIlIllIIlIlIII("6JgMrrrj/pE2kpGvaTyTW23owFRMTrB/", "NvDwv");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[9]] = lIIlIllIIlIlIlI("YmuGQk7F/QrpVDBhN/jSZtTgXiyQg+j/", "DhGjx");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[10]] = lIIlIllIIlIlIIl("EiQgOQ8=", "WIPMv");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[0]] = lIIlIllIIlIlIlI("WQ9+wF+pwwY=", "EITfg");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[12]] = lIIlIllIIlIlIIl("DDkZPyA=", "ITiKY");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[13]] = lIIlIllIIlIlIIl("EhgaNRc=", "WujAn");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[14]] = lIIlIllIIlIlIlI("90caJRRXdI0=", "mVCQJ");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[15]] = lIIlIllIIlIlIIl("BisGFTM=", "CFvaJ");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[16]] = lIIlIllIIlIlIlI("YcakGVGEGiA=", "AaScH");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[17]] = lIIlIllIIlIlIIl("MQwUIx0=", "tadWd");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[18]] = lIIlIllIIlIlIIl("IgcmHz8=", "gjVkF");
        lIIIIIIIIlIIl[lIIIIIIIIlIlI[19]] = lIIlIllIIlIlIIl("Kgwk", "kkENk");
    }

    protected void onStop() {
        this.a.remove(this.e);
        "".length();
        this.a.remove(this.d);
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIllIIlIlllI(chatMessage.getMessage().contains(lIIIIIIIIlIIl[lIIIIIIIIlIlI[8]]) ? 1 : 0)) {
            System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[9]]);
            m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[10]];
            f0o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[0]];
            n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[12]];
            p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[13]];
            r = lIIIIIIIIlIlI[11];
            A = lIIIIIIIIlIlI[1];
            k = lIIIIIIIIlIlI[1];
            u = lIIIIIIIIlIlI[2];
            v = lIIIIIIIIlIlI[2];
            w = lIIIIIIIIlIlI[2];
            s = lIIIIIIIIlIlI[11];
            t = lIIIIIIIIlIlI[11];
            x = lIIIIIIIIlIlI[11];
            Integer[] numArr = new Integer[lIIIIIIIIlIlI[4]];
            numArr[lIIIIIIIIlIlI[1]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
            numArr[lIIIIIIIIlIlI[2]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
            numArr[lIIIIIIIIlIlI[3]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
            z = new ArrayList(Arrays.asList(numArr));
            String[] strArr = new String[lIIIIIIIIlIlI[4]];
            strArr[lIIIIIIIIlIlI[1]] = null;
            strArr[lIIIIIIIIlIlI[2]] = null;
            strArr[lIIIIIIIIlIlI[3]] = null;
            y = new ArrayList(Arrays.asList(strArr));
        }
    }

    static {
        lIIlIllIIlIllII();
        lIIlIllIIlIlIll();
        f = lIIIIIIIIlIIl[lIIIIIIIIlIlI[14]];
        l = System.currentTimeMillis();
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[15]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[16]];
        f0o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[17]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[18]];
        q = lIIIIIIIIlIIl[lIIIIIIIIlIlI[19]];
        r = lIIIIIIIIlIlI[11];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        x = lIIIIIIIIlIlI[11];
        String[] strArr = new String[lIIIIIIIIlIlI[4]];
        strArr[lIIIIIIIIlIlI[1]] = null;
        strArr[lIIIIIIIIlIlI[2]] = null;
        strArr[lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList(Arrays.asList(strArr));
        Integer[] numArr = new Integer[lIIIIIIIIlIlI[4]];
        numArr[lIIIIIIIIlIlI[1]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        numArr[lIIIIIIIIlIlI[2]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        numArr[lIIIIIIIIlIlI[3]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        z = new ArrayList(Arrays.asList(numArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    protected void onStart() {
        this.a.add(this.e);
        "".length();
        this.a.add(this.d);
        "".length();
        System.out.println(lIIIIIIIIlIIl[lIIIIIIIIlIlI[1]]);
        m = lIIIIIIIIlIIl[lIIIIIIIIlIlI[2]];
        r = lIIIIIIIIlIlI[11];
        A = lIIIIIIIIlIlI[1];
        k = lIIIIIIIIlIlI[1];
        u = lIIIIIIIIlIlI[2];
        v = lIIIIIIIIlIlI[2];
        w = lIIIIIIIIlIlI[2];
        f0o = lIIIIIIIIlIIl[lIIIIIIIIlIlI[3]];
        n = lIIIIIIIIlIIl[lIIIIIIIIlIlI[4]];
        p = lIIIIIIIIlIIl[lIIIIIIIIlIlI[5]];
        s = lIIIIIIIIlIlI[11];
        t = lIIIIIIIIlIlI[11];
        x = lIIIIIIIIlIlI[11];
        Integer[] numArr = new Integer[lIIIIIIIIlIlI[4]];
        numArr[lIIIIIIIIlIlI[1]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        numArr[lIIIIIIIIlIlI[2]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        numArr[lIIIIIIIIlIlI[3]] = Integer.valueOf(lIIIIIIIIlIlI[11]);
        z = new ArrayList(Arrays.asList(numArr));
        String[] strArr = new String[lIIIIIIIIlIlI[4]];
        strArr[lIIIIIIIIlIlI[1]] = null;
        strArr[lIIIIIIIIlIlI[2]] = null;
        strArr[lIIIIIIIIlIlI[3]] = null;
        y = new ArrayList(Arrays.asList(strArr));
        j = lIIIIIIIIlIlI[1];
        r = lIIIIIIIIlIlI[11];
        l = System.currentTimeMillis();
        h = lIIIIIIIIlIlI[1];
        MixologyInfoBox.D = lIIIIIIIIlIlI[1];
        MixologyInfoBox.F = lIIIIIIIIlIlI[1];
        MixologyInfoBox.E = lIIIIIIIIlIlI[1];
    }

    private static String lIIlIllIIlIlIII(String lllllllllllllllIIlIIIIIIIIllIIII, String lllllllllllllllIIlIIIIIIIIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIIIIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIIIIIllIIlI.init(lIIIIIIIIlIlI[3], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIIIIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIIIllIIIl) {
            lllllllllllllllIIlIIIIIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIIlIlIlI(String lllllllllllllllIIlIIIIIIIIllllIl, String lllllllllllllllIIlIIIIIIIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIIIIllllII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIlIlI[9]), "DES");
            Cipher lllllllllllllllIIlIIIIIIIIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIIIIllllll.init(lIIIIIIIIlIlI[3], secretKeySpec);
            return new String(lllllllllllllllIIlIIIIIIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIIIIlllllI) {
            lllllllllllllllIIlIIIIIIIIlllllI.printStackTrace();
            return null;
        }
    }
}
