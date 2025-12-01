package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

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
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.f  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/f.class */
public class C0005f {
    private static final /* synthetic */ String T;
    private static /* synthetic */ int[] lIlIIIllIlIll;
    private static final /* synthetic */ String S;
    private /* synthetic */ RuneScapeProfileType ab;
    private final /* synthetic */ ConfigManager U;
    private /* synthetic */ String aa;
    private final /* synthetic */ C0006g X;
    private final /* synthetic */ Gson W;
    private static final /* synthetic */ Logger R;
    public /* synthetic */ List<WorldType> Y;
    private static /* synthetic */ String[] lIlIIIllIlIlI;
    private final /* synthetic */ Client V;
    private /* synthetic */ List<Item> Z;

    private static boolean lIlllIIIIllIlII(int i) {
        return i != 0;
    }

    public void a(Item[] itemArr) {
        this.X.b(itemArr);
        this.Z = this.X.v();
    }

    private static boolean lIlllIIIIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIIIIllIIlI(Object obj) {
        return obj != null;
    }

    public List<Item> o() {
        return this.Z;
    }

    static {
        lIlllIIIIllIIII();
        lIlllIIIIlIllll();
        S = lIlIIIllIlIlI[lIlIIIllIlIll[7]];
        T = lIlIIIllIlIlI[lIlIIIllIlIll[8]];
        R = LoggerFactory.getLogger(C0005f.class);
    }

    private static String lIlllIIIIlIllIl(String llllllllllllllIlllIIIlIIIlIIlIll, String llllllllllllllIlllIIIlIIIlIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIllIlIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIIlIIllII) {
            llllllllllllllIlllIIIlIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIIlIlllI(String llllllllllllllIlllIIIlIIIllIllIl, String llllllllllllllIlllIIIlIIIllIllII) {
        String llllllllllllllIlllIIIlIIIllIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIIlIIIllIlIlI = llllllllllllllIlllIIIlIIIllIllII.toCharArray();
        int llllllllllllllIlllIIIlIIIllIlIIl = lIlIIIllIlIll[1];
        char[] charArray = llllllllllllllIlllIIIlIIIllIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIllIlIll[1];
        while (lIlllIIIIllIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIIIlIIIllIlIlI[llllllllllllllIlllIIIlIIIllIlIIl % llllllllllllllIlllIIIlIIIllIlIlI.length]));
            "".length();
            llllllllllllllIlllIIIlIIIllIlIIl++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public void s() {
        if (lIlllIIIIllIIll(this.aa)) {
            return;
        }
        this.U.setConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[4]], this.aa, lIlIIIllIlIlI[lIlIIIllIlIll[0]], this.W.toJson(this.X.w()));
    }

    private static void lIlllIIIIllIIII() {
        lIlIIIllIlIll = new int[10];
        lIlIIIllIlIll[0] = (18 ^ 81) ^ (19 ^ 84);
        lIlIIIllIlIll[1] = "   ".length() & ("   ".length() ^ (-1));
        lIlIIIllIlIll[2] = " ".length();
        lIlIIIllIlIll[3] = "  ".length();
        lIlIIIllIlIll[4] = "   ".length();
        lIlIIIllIlIll[5] = 156 ^ 153;
        lIlIIIllIlIll[6] = 78 ^ 72;
        lIlIIIllIlIll[7] = 66 ^ 69;
        lIlIIIllIlIll[8] = 50 ^ 58;
        lIlIIIllIlIll[9] = 28 ^ 21;
    }

    private String t() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.V.getWorldType().iterator();
        while (lIlllIIIIllIlII(it.hasNext() ? 1 : 0)) {
            WorldType worldType = (WorldType) it.next();
            if (lIlllIIIIllIlII(this.Y.contains(worldType) ? 1 : 0)) {
                sb.append(worldType.name()).append(lIlIIIllIlIlI[lIlIIIllIlIll[5]]);
                "".length();
            }
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        if (lIlllIIIIllIIll(this.V.getLocalPlayer())) {
            return lIlIIIllIlIlI[lIlIIIllIlIll[6]];
        }
        sb.append(this.V.getLocalPlayer().getName());
        "".length();
        return String.valueOf(sb);
    }

    private static void lIlllIIIIlIllll() {
        lIlIIIllIlIlI = new String[lIlIIIllIlIll[9]];
        lIlIIIllIlIlI[lIlIIIllIlIll[1]] = lIlllIIIIlIllII("GYySPRXsoxwD+PcjqI1QSA==", "VYkoF");
        lIlIIIllIlIlI[lIlIIIllIlIll[2]] = lIlllIIIIlIllIl("K9Xu5qB4HX0wT5eV+JmlZA==", "LTTDt");
        lIlIIIllIlIlI[lIlIIIllIlIll[3]] = lIlllIIIIlIllIl("CsNeVHyXjLTzlbXMzw6zCg==", "uUCLu");
        lIlIIIllIlIlI[lIlIIIllIlIll[4]] = lIlllIIIIlIllIl("XYVu3ht7SC77/p/5Z2odgg==", "iWtze");
        lIlIIIllIlIlI[lIlIIIllIlIll[0]] = lIlllIIIIlIllIl("Eoy0DyV1zZyVMqXrDZrs6g==", "ZkxPM");
        lIlIIIllIlIlI[lIlIIIllIlIll[5]] = lIlllIIIIlIlllI("cA==", "JCETC");
        lIlIIIllIlIlI[lIlIIIllIlIll[6]] = lIlllIIIIlIllIl("ntMjPGlVcrlf9aKbBOh2ZQ==", "RRRSl");
        lIlIIIllIlIlI[lIlIIIllIlIll[7]] = lIlllIIIIlIlllI("MicjIBQkJyMsFTUzJA==", "AVVIf");
        lIlIIIllIlIlI[lIlIIIllIlIll[8]] = lIlllIIIIlIllIl("jweDAuaFs0y9IYelcGrMsQ==", "imGqT");
    }

    private static boolean lIlllIIIIllIIll(Object obj) {
        return obj == null;
    }

    public void p() {
        this.aa = null;
        this.ab = null;
        this.X.u();
        this.Z = new ArrayList();
    }

    private static boolean lIlllIIIIllIIIl(int i) {
        return i == 0;
    }

    @Inject
    public C0005f(Client client, ConfigManager configManager, Gson gson) {
        WorldType[] worldTypeArr = new WorldType[lIlIIIllIlIll[0]];
        worldTypeArr[lIlIIIllIlIll[1]] = WorldType.SEASONAL;
        worldTypeArr[lIlIIIllIlIll[2]] = WorldType.TOURNAMENT_WORLD;
        worldTypeArr[lIlIIIllIlIll[3]] = WorldType.DEADMAN;
        worldTypeArr[lIlIIIllIlIll[4]] = WorldType.NOSAVE_MODE;
        this.Y = Arrays.asList(worldTypeArr);
        this.U = configManager;
        this.V = client;
        this.W = gson;
        this.X = new C0006g();
        this.Z = new ArrayList();
    }

    private static String lIlllIIIIlIllII(String llllllllllllllIlllIIIlIIIlIllIII, String llllllllllllllIlllIIIlIIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIllIlIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIIIlIllIIl) {
            llllllllllllllIlllIIIlIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    public void q() {
        if (lIlllIIIIllIIIl(RuneScapeProfileType.getCurrent(this.V).equals(this.ab) ? 1 : 0)) {
            if (lIlllIIIIllIIlI(this.aa)) {
                s();
            }
            r();
        }
    }

    private void r() {
        this.U.unsetConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[1]], t());
        this.aa = this.U.getRSProfileKey();
        this.ab = RuneScapeProfileType.getCurrent(this.V);
        try {
            this.X.a((int[]) this.W.fromJson(this.U.getRSProfileConfiguration(lIlIIIllIlIlI[lIlIIIllIlIll[2]], lIlIIIllIlIlI[lIlIIIllIlIll[3]]), int[].class));
            "".length();
            if (0 != 0) {
                return;
            }
        } catch (JsonSyntaxException e) {
            this.X.a(new int[lIlIIIllIlIll[1]]);
            s();
        }
        this.Z = this.X.v();
    }
}
