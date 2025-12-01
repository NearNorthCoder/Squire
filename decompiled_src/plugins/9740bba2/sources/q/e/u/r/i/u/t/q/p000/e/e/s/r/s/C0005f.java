package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.WorldType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneScapeProfileType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/f.class */
public class C0005f {
    private final /* synthetic */ Gson V;
    private final /* synthetic */ ConfigManager T;
    private static final /* synthetic */ Logger Q;
    private /* synthetic */ RuneScapeProfileType aa;
    private /* synthetic */ String Z;
    private /* synthetic */ List<Item> Y;
    private static final /* synthetic */ String R;
    private static /* synthetic */ String[] lIIIllIlIlIIl;
    private static /* synthetic */ int[] lIIIllIlIlIlI;
    private static final /* synthetic */ String S;
    public /* synthetic */ List<WorldType> X;
    private final /* synthetic */ g W;
    private final /* synthetic */ Client U;

    private static String lIlIIIlIlIlIlll(String lllllllllllllllIIIIlIIIllIllllIl, String lllllllllllllllIIIIlIIIllIllllII) {
        String lllllllllllllllIIIIlIIIllIllllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIllIlllIll = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIllIlllIlI = lllllllllllllllIIIIlIIIllIllllII.toCharArray();
        int lllllllllllllllIIIIlIIIllIlllIIl = lIIIllIlIlIlI[1];
        char[] charArray = lllllllllllllllIIIIlIIIllIllllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIIllIlIlIlI[1];
        while (lIlIIIlIllIllIl(i, length)) {
            char lllllllllllllllIIIIlIIIllIlllllI = charArray[i];
            lllllllllllllllIIIIlIIIllIlllIll.append((char) (lllllllllllllllIIIIlIIIllIlllllI ^ lllllllllllllllIIIIlIIIllIlllIlI[lllllllllllllllIIIIlIIIllIlllIIl % lllllllllllllllIIIIlIIIllIlllIlI.length]));
            "".length();
            lllllllllllllllIIIIlIIIllIlllIIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIIIllIlllIll);
    }

    private static boolean lIlIIIlIllIllII(int i) {
        return i != 0;
    }

    private static String lIlIIIlIlIlIlIl(String lllllllllllllllIIIIlIIIllIlIlIII, String lllllllllllllllIIIIlIIIllIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIlIlIlI[3], lllllllllllllllIIIIlIIIllIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIllIlIlIIl) {
            lllllllllllllllIIIIlIIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    public void o() {
        this.Z = null;
        this.aa = null;
        this.W.t();
        this.Y = new ArrayList();
    }

    public void r() {
        if (lIlIIIlIllIlIll(this.Z)) {
            return;
        }
        this.T.setConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[4]], this.Z, lIIIllIlIlIIl[lIIIllIlIlIlI[0]], this.V.toJson(this.W.v()));
    }

    public void p() {
        if (lIlIIIlIllIlIIl(RuneScapeProfileType.getCurrent(this.U).equals(this.aa) ? 1 : 0)) {
            if (lIlIIIlIllIlIlI(this.Z)) {
                r();
            }
            q();
        }
    }

    private static String lIlIIIlIlIlIllI(String lllllllllllllllIIIIlIIIllIIllIll, String lllllllllllllllIIIIlIIIllIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIlIlIlI[8]), "DES");
            Cipher lllllllllllllllIIIIlIIIllIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIllIIlllIl.init(lIIIllIlIlIlI[3], lllllllllllllllIIIIlIIIllIIllllI);
            return new String(lllllllllllllllIIIIlIIIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIllIIlllII) {
            lllllllllllllllIIIIlIIIllIIlllII.printStackTrace();
            return null;
        }
    }

    private String s() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.U.getWorldType().iterator();
        while (lIlIIIlIllIllII(it.hasNext() ? 1 : 0)) {
            WorldType worldType = (WorldType) it.next();
            if (lIlIIIlIllIllII(this.X.contains(worldType) ? 1 : 0)) {
                sb.append(worldType.name()).append(lIIIllIlIlIIl[lIIIllIlIlIlI[5]]);
                "".length();
            }
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        if (lIlIIIlIllIlIll(this.U.getLocalPlayer())) {
            return lIIIllIlIlIIl[lIIIllIlIlIlI[6]];
        }
        sb.append(this.U.getLocalPlayer().getName());
        "".length();
        return String.valueOf(sb);
    }

    private void q() {
        this.T.unsetConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[1]], s());
        this.Z = this.T.getRSProfileKey();
        this.aa = RuneScapeProfileType.getCurrent(this.U);
        try {
            this.W.a((int[]) this.V.fromJson(this.T.getRSProfileConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[2]], lIIIllIlIlIIl[lIIIllIlIlIlI[3]]), int[].class));
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        } catch (JsonSyntaxException e) {
            this.W.a(new int[lIIIllIlIlIlI[1]]);
            r();
        }
        this.Y = this.W.u();
    }

    private static boolean lIlIIIlIllIlIlI(Object obj) {
        return obj != null;
    }

    private static void lIlIIIlIlIllIII() {
        lIIIllIlIlIIl = new String[lIIIllIlIlIlI[9]];
        lIIIllIlIlIIl[lIIIllIlIlIlI[1]] = lIlIIIlIlIlIlIl("RoVsR1y2vsTlWrUPbGKU9w==", "KknVO");
        lIIIllIlIlIIl[lIIIllIlIlIlI[2]] = lIlIIIlIlIlIllI("xZbc5nxKd6KSfTIKBFIlSQ==", "yxGKH");
        lIIIllIlIlIIl[lIIIllIlIlIlI[3]] = lIlIIIlIlIlIlIl("nZtNFhxjpTNB50t/nbhKCA==", "MMZOj");
        lIIIllIlIlIIl[lIIIllIlIlIlI[4]] = lIlIIIlIlIlIlll("GSgfBwAPKB8LAR48GA==", "jYjnr");
        lIIIllIlIlIIl[lIIIllIlIlIlI[0]] = lIlIIIlIlIlIlll("DjgvCCQYPCwQ", "lYAcM");
        lIIIllIlIlIIl[lIIIllIlIlIlI[5]] = lIlIIIlIlIlIlIl("0D16A/A5Ong=", "VUrfh");
        lIIIllIlIlIIl[lIIIllIlIlIlI[6]] = lIlIIIlIlIlIlIl("rDypXE/qPKDemI6bmp9+kw==", "qMiTJ");
        lIIIllIlIlIIl[lIIIllIlIlIlI[7]] = lIlIIIlIlIlIlIl("hqKQdrLP6Av7KbcCnY5d7A==", "YYrcx");
        lIIIllIlIlIIl[lIIIllIlIlIlI[8]] = lIlIIIlIlIlIlll("HzUmCjUJNSYGNBghIQ==", "lDScG");
    }

    public void a(Item[] itemArr) {
        this.W.b(itemArr);
        this.Y = this.W.u();
    }

    public List<Item> n() {
        return this.Y;
    }

    private static void lIlIIIlIllIlIII() {
        lIIIllIlIlIlI = new int[10];
        lIIIllIlIlIlI[0] = (((124 + 165) - 274) + 179) ^ (((33 + 125) - 36) + 76);
        lIIIllIlIlIlI[1] = (221 ^ 153) & ((130 ^ 198) ^ (-1));
        lIIIllIlIlIlI[2] = " ".length();
        lIIIllIlIlIlI[3] = "  ".length();
        lIIIllIlIlIlI[4] = "   ".length();
        lIIIllIlIlIlI[5] = 1 ^ 4;
        lIIIllIlIlIlI[6] = 164 ^ 162;
        lIIIllIlIlIlI[7] = 143 ^ 136;
        lIIIllIlIlIlI[8] = (((41 + 139) - 44) + 28) ^ (((151 + 79) - 112) + 54);
        lIIIllIlIlIlI[9] = (((161 + 4) - (-10)) + 31) ^ (((69 + 33) - 52) + 149);
    }

    private static boolean lIlIIIlIllIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIllIlIIl(int i) {
        return i == 0;
    }

    static {
        lIlIIIlIllIlIII();
        lIlIIIlIlIllIII();
        S = lIIIllIlIlIIl[lIIIllIlIlIlI[7]];
        R = lIIIllIlIlIIl[lIIIllIlIlIlI[8]];
        Q = LoggerFactory.getLogger(C0005f.class);
    }

    private static boolean lIlIIIlIllIlIll(Object obj) {
        return obj == null;
    }

    @Inject
    public C0005f(Client client, ConfigManager configManager, Gson gson) {
        WorldType[] worldTypeArr = new WorldType[lIIIllIlIlIlI[0]];
        worldTypeArr[lIIIllIlIlIlI[1]] = WorldType.SEASONAL;
        worldTypeArr[lIIIllIlIlIlI[2]] = WorldType.TOURNAMENT_WORLD;
        worldTypeArr[lIIIllIlIlIlI[3]] = WorldType.DEADMAN;
        worldTypeArr[lIIIllIlIlIlI[4]] = WorldType.NOSAVE_MODE;
        this.X = Arrays.asList(worldTypeArr);
        this.T = configManager;
        this.U = client;
        this.V = gson;
        this.W = new g();
        this.Y = new ArrayList();
    }
}
