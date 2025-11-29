package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/i.class */
public class C0034i {
    private static final /* synthetic */ String aq;
    private static final /* synthetic */ String ar;
    private final /* synthetic */ Client as;
    private final /* synthetic */ C0043r au;
    private final /* synthetic */ ConfigManager at;
    private static final /* synthetic */ Logger ap;
    private static /* synthetic */ String[] lIlllllIlIII;
    private static /* synthetic */ int[] lIlllllIlIlI;

    private static String lllIlllllIIIIl(String lllllllllllllllIlIllIIIIIllIIIlI, String lllllllllllllllIlIllIIIIIllIIIIl) {
        String lllllllllllllllIlIllIIIIIllIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllIIIIIlIlllll = lllllllllllllllIlIllIIIIIllIIIIl.toCharArray();
        int lllllllllllllllIlIllIIIIIlIllllI = lIlllllIlIlI[0];
        char[] charArray = lllllllllllllllIlIllIIIIIllIIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlllllIlIlI[0];
        while (lllIlllllIllII(i, length)) {
            char lllllllllllllllIlIllIIIIIllIIIll = charArray[i];
            sb.append((char) (lllllllllllllllIlIllIIIIIllIIIll ^ lllllllllllllllIlIllIIIIIlIlllll[lllllllllllllllIlIllIIIIIlIllllI % lllllllllllllllIlIllIIIIIlIlllll.length]));
            "".length();
            lllllllllllllllIlIllIIIIIlIllllI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIlllllIIIlI(String lllllllllllllllIlIllIIIIIlIIlIll, String lllllllllllllllIlIllIIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIIIlIIllll.init(lIlllllIlIlI[2], lllllllllllllllIlIllIIIIIlIlIIII);
            return new String(lllllllllllllllIlIllIIIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIIlIIlllI) {
            lllllllllllllllIlIllIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlllllIllIl(int i, int i2) {
        return i == i2;
    }

    private N a(int i) {
        N n = null;
        for (C0042q c0042q : this.au.d(this.as.getLocalPlayer().getWorldLocation())) {
            N[] ae = c0042q.ae();
            int length = ae.length;
            int i2 = lIlllllIlIlI[0];
            while (lllIlllllIllII(i2, length)) {
                N n2 = ae[i2];
                if (lllIlllllIllIl(n2.aN(), i)) {
                    if (lllIlllllIIlll(n)) {
                        Logger logger = ap;
                        String str = lIlllllIlIII[lIlllllIlIlI[6]];
                        Object[] objArr = new Object[lIlllllIlIlI[3]];
                        objArr[lIlllllIlIlI[0]] = Integer.valueOf(i);
                        objArr[lIlllllIlIlI[1]] = n;
                        objArr[lIlllllIlIlI[2]] = n2;
                        logger.debug(str, objArr);
                        return null;
                    }
                    n = n2;
                }
                i2++;
                "".length();
                if (" ".length() <= (("   ".length() ^ (59 ^ 32)) & (((99 ^ 1) ^ (82 ^ 40)) ^ (-" ".length())))) {
                    return null;
                }
            }
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return n;
    }

    private static void lllIlllllIIIll() {
        lIlllllIlIII = new String[lIlllllIlIlI[9]];
        lIlllllIlIII[lIlllllIlIlI[0]] = lllIlllllIIIII("JqWJ42ePp/ZaWZZcPW2doSO3hO0onzQZBHovF5VXVDzBnDTfsQJpCJcE7GK1sYTlipNseQ6bDOROi9sKI5zyDduikIx4qVPAbNINsBM6ps+e/dF3IUCRuw==", "GFTlF");
        lIlllllIlIII[lIlllllIlIlI[1]] = lllIlllllIIIII("GHPD4KZn1m1jGWxeDwPWpdk/gRzU7RZfQJQ9WFwhCzxdAhDlwBFIvHZrAdw/KNyZXAfhSC/HV5EOP0Kkrn1cm5pZM16e6r+AhdgW6eRtdf9KCvXhbhzFlCLFmSe8ZZj3", "CprRk");
        lIlllllIlIII[lIlllllIlIlI[2]] = lllIlllllIIIIl("BhUaFy02FQpSPiMEDRpuMhEXHyssBE4UITBQFQ9uagsTWw==", "BpnrN");
        lIlllllIlIII[lIlllllIlIlI[3]] = lllIlllllIIIII("8jIR/h0ECFirNyBGw48tBw==", "tafdA");
        lIlllllIlIII[lIlllllIlIlI[4]] = lllIlllllIIIIl("JhIMJAYwBRg/GTAR", "UcyMt");
        lIlllllIlIII[lIlllllIlIlI[5]] = lllIlllllIIIIl("Kh80CAg8CCATFzwc", "YnAaz");
        lIlllllIlIII[lIlllllIlIlI[6]] = lllIlllllIIIIl("JggAIgASChc4RxcEGyYCCRFCPwhHHh9rBQIRFS4CCUUZNkcGCwZrHBo=", "gebKg");
        lIlllllIlIII[lIlllllIlIlI[7]] = lllIlllllIIIlI("FO08mlhXVYeRphcdnQAvC+EBeg3yW5xG+ka4hKB1PE++pP4F646cER3Q/xjniW8ytu44MSZ8eTgfQiMRCXejJyK2QfEcKj6+L5XfJzN/r/GDIj/MUaBfVWrQKvEoo/ho", "GRgPL");
        lIlllllIlIII[lIlllllIlIlI[8]] = lllIlllllIIIIl("ORooPHMBHmksO00cICsxAQtlaCcEAGdoGAgTPy10BAZpPz0ZGmklMU1faQFzAR5pJTUGF2k7IR8XdSomUwYhKSBNAig8NwVSLjo7GgFpLjsfUjAnIUM=", "mrIHT");
    }

    private static void lllIlllllIIllI() {
        lIlllllIlIlI = new int[10];
        lIlllllIlIlI[0] = (8 ^ 73) & ((113 ^ 48) ^ (-1));
        lIlllllIlIlI[1] = " ".length();
        lIlllllIlIlI[2] = "  ".length();
        lIlllllIlIlI[3] = "   ".length();
        lIlllllIlIlI[4] = "   ".length() ^ (39 ^ 32);
        lIlllllIlIlI[5] = 27 ^ 30;
        lIlllllIlIlI[6] = 135 ^ 129;
        lIlllllIlIlI[7] = 127 ^ 120;
        lIlllllIlIlI[8] = (((155 + 121) - 214) + 143) ^ (((16 + 113) - 13) + 81);
        lIlllllIlIlI[9] = 77 ^ 68;
    }

    private static String a(N n) {
        return n.aJ() + ".protected";
    }

    private static boolean lllIlllllIlIlI(Object obj) {
        return obj == null;
    }

    private static boolean lllIlllllIlIll(int i) {
        return i != 0;
    }

    private static boolean lllIlllllIlIII(int i) {
        return i == 0;
    }

    private static String lllIlllllIIIII(String lllllllllllllllIlIllIIIIIlllIIII, String lllllllllllllllIlIllIIIIIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllllIlIlI[8]), "DES");
            Cipher lllllllllllllllIlIllIIIIIlllIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIIIlllIlII.init(lIlllllIlIlI[2], lllllllllllllllIlIllIIIIIlllIlIl);
            return new String(lllllllllllllllIlIllIIIIIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIIlllIIll) {
            lllllllllllllllIlIllIIIIIlllIIll.printStackTrace();
            return null;
        }
    }

    static {
        lllIlllllIIllI();
        lllIlllllIIIll();
        ar = lIlllllIlIII[lIlllllIlIlI[7]];
        aq = lIlllllIlIII[lIlllllIlIlI[8]];
        ap = LoggerFactory.getLogger(C0034i.class);
    }

    public boolean y(N n) {
        return Boolean.TRUE.equals(this.at.getRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[5]], a(n), Boolean.class));
    }

    private static boolean lllIlllllIlIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIlllllIIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Widget widget = this.as.getWidget(WidgetInfo.DIALOG_NPC_TEXT);
        if (lllIlllllIIlll(widget)) {
            if (lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[0]].equals(widget.getText()) ? 1 : 0) && lllIlllllIlIII(lIlllllIlIII[lIlllllIlIlI[1]].equals(widget.getText()) ? 1 : 0)) {
                return;
            }
            Widget widget2 = this.as.getWidget(WidgetInfo.DIALOG_NPC_NAME);
            Widget widget3 = this.as.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
            if (lllIlllllIIlll(widget2) && lllIlllllIIlll(widget3) && !lllIlllllIlIIl(widget3.getModelType(), lIlllllIlIlI[2])) {
                int modelId = widget3.getModelId();
                N a = a(modelId);
                if (lllIlllllIlIlI(a) || lllIlllllIlIll(y(a) ? 1 : 0)) {
                    return;
                }
                ap.debug(lIlllllIlIII[lIlllllIlIlI[2]], widget2.getText(), Integer.valueOf(modelId));
                a(a, lIlllllIlIlI[1]);
            }
        }
    }

    @Inject
    private C0034i(Client client, ConfigManager configManager, C0043r c0043r) {
        this.as = client;
        this.at = configManager;
        this.au = c0043r;
    }

    public void a(N n, boolean z) {
        if (!lllIlllllIlIII(z ? 1 : 0)) {
            this.at.setRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[4]], a(n), Boolean.valueOf(z));
            return;
        }
        this.at.unsetRSProfileConfiguration(lIlllllIlIII[lIlllllIlIlI[3]], a(n));
        "".length();
        if (((94 ^ 104) ^ (174 ^ 156)) != ((((86 + 32) - 62) + 72) ^ (((127 + 64) - 156) + 97))) {
        }
    }

    private static boolean lllIlllllIllII(int i, int i2) {
        return i < i2;
    }
}
