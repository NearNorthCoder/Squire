/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableSet
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.ObjectComposition
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.MenuActionProcessed
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.c;
import -.m.e.a.u.s.r.r.q.i.r.e.f.d;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuActionProcessed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class b {
    private static final /* synthetic */ Pattern u;
    @VisibleForTesting
    final /* synthetic */ Map<N, d> x;
    private static final /* synthetic */ Logger q;
    private final /* synthetic */ Client y;
    private static final /* synthetic */ ImmutableSet<Integer> w;
    private static /* synthetic */ int[] lIllllllIlIl;
    private static final /* synthetic */ Pattern t;
    private static final /* synthetic */ Duration r;
    private final /* synthetic */ ConfigManager A;
    private static final /* synthetic */ Pattern v;
    private final /* synthetic */ r z;
    private static /* synthetic */ String[] lIllllllIIll;
    static final /* synthetic */ boolean B;
    private static final /* synthetic */ Pattern s;

    private static boolean llllIIIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public H b(N n2) {
        return (H)((Object)this.A.getRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[8]], b.a(n2), H.class));
    }

    private static String llllIIIIIIlIIl(String lllllllllllllllIlIlIllllIIlIIIII, String lllllllllllllllIlIlIllllIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllllIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIllllIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIllllIIlIIIlI.init(lIllllllIlIl[3], lllllllllllllllIlIlIllllIIlIIIll);
            return new String(lllllllllllllllIlIlIllllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllllIIlIIIIl) {
            lllllllllllllllIlIlIllllIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        block2: {
            int n2;
            block1: {
                block0: {
                    b.llllIIIIIIllll();
                    b.llllIIIIIIlIlI();
                    if (!b.llllIIIIIlIIII(b.class.desiredAssertionStatus() ? 1 : 0)) break block0;
                    n2 = lIllllllIlIl[1];
                    0;
                    if (((0x8D ^ 0xAD ^ (0x92 ^ 0x9A)) & (0x73 ^ 8 ^ (0xEA ^ 0xB9) ^ -1)) <= (0x28 ^ 0x4E ^ (0x67 ^ 5))) break block1;
                    break block2;
                }
                n2 = lIllllllIlIl[0];
            }
            B = n2;
            q = LoggerFactory.getLogger(b.class);
            r = Duration.ofSeconds(30L);
            s = Pattern.compile(lIllllllIIll[lIllllllIlIl[11]]);
            t = Pattern.compile(lIllllllIIll[lIllllllIlIl[12]]);
            u = Pattern.compile(lIllllllIIll[lIllllllIlIl[13]]);
            v = Pattern.compile(lIllllllIIll[lIllllllIlIl[14]]);
            w = ImmutableSet.of((Object)lIllllllIlIl[15], (Object)lIllllllIlIl[16], (Object)lIllllllIlIl[17], (Object)lIllllllIlIl[18]);
        }
    }

    @Inject
    public b(Client client, r r2, ConfigManager configManager) {
        this.x = new HashMap<N, d>();
        this.y = client;
        this.z = r2;
        this.A = configManager;
    }

    private static void llllIIIIIIllll() {
        lIllllllIlIl = new int[20];
        b.lIllllllIlIl[0] = (0x47 ^ 0x67 ^ (0x5E ^ 0x58)) & (0x4B ^ 0x6A ^ (0xA ^ 0xD) ^ -1);
        b.lIllllllIlIl[1] = 1;
        b.lIllllllIlIl[2] = -1;
        b.lIllllllIlIl[3] = 2;
        b.lIllllllIlIl[4] = 3;
        b.lIllllllIlIl[5] = 0x9C ^ 0xC4 ^ (0x2D ^ 0x71);
        b.lIllllllIlIl[6] = 0x74 ^ 0x71;
        b.lIllllllIlIl[7] = 0xC5 ^ 0xC3;
        b.lIllllllIlIl[8] = 0xAD ^ 0xAA;
        b.lIllllllIlIl[9] = 0x28 ^ 0x5B ^ (0x3F ^ 0x44);
        b.lIllllllIlIl[10] = 0x52 ^ 0x55 ^ (0xCC ^ 0xC2);
        b.lIllllllIlIl[11] = 54 + 19 - -8 + 122 ^ 131 + 131 - 204 + 135;
        b.lIllllllIlIl[12] = 0x16 ^ 0x1D;
        b.lIllllllIlIl[13] = 106 + 140 - 176 + 87 ^ 120 + 127 - 244 + 142;
        b.lIllllllIlIl[14] = 0x16 ^ 0x1B;
        b.lIllllllIlIl[15] = -(0xFFFFD479 & 0x6BEF) & (0xFFFFDFFA & 0x77FD);
        b.lIllllllIlIl[16] = -(0xFFFFA26F & 0x7D96) & (0xFFFFF7B7 & 0x3FDF);
        b.lIllllllIlIl[17] = 0xFFFFF7EB & 0x5BFF;
        b.lIllllllIlIl[18] = 0xFFFFDFFF & 0x79D5;
        b.lIllllllIlIl[19] = 9 ^ 0x15 ^ (0xBD ^ 0xAF);
    }

    private static String llllIIIIIIIlll(String lllllllllllllllIlIlIllllIlIIIlIl, String lllllllllllllllIlIlIllllIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllllIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllllllIlIl[9]), "DES");
            Cipher lllllllllllllllIlIlIllllIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllllIlIIIlll.init(lIllllllIlIl[3], lllllllllllllllIlIlIllllIlIIlIII);
            return new String(lllllllllllllllIlIlIllllIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllllIlIIIllI) {
            lllllllllllllllIlIlIllllIlIIIllI.printStackTrace();
            return null;
        }
    }

    static H a(String string) {
        String lllllllllllllllIlIlIlllllIIIllIl;
        if (b.llllIIIIIlIIII(string.contains(lIllllllIIll[lIllllllIlIl[0]]) ? 1 : 0)) {
            return null;
        }
        Matcher lllllllllllllllIlIlIlllllIIIllII = s.matcher(lllllllllllllllIlIlIlllllIIIllIl);
        if (!b.llllIIIIIlIIII(lllllllllllllllIlIlIlllllIIIllII.matches() ? 1 : 0) || !b.llllIIIIIlIIII((lllllllllllllllIlIlIlllllIIIllII = t.matcher(lllllllllllllllIlIlIlllllIIIllIl)).find() ? 1 : 0) || !b.llllIIIIIlIIII((lllllllllllllllIlIlIlllllIIIllII = u.matcher(lllllllllllllllIlIlIlllllIIIllIl)).matches() ? 1 : 0) || b.llllIIIIIlIIIl((lllllllllllllllIlIlIlllllIIIllII = v.matcher(lllllllllllllllIlIlIlllllIIIllIl)).matches() ? 1 : 0)) {
            String lllllllllllllllIlIlIlllllIIIlIll;
            String lllllllllllllllIlIlIlllllIIIlIlI = lllllllllllllllIlIlIlllllIIIlIll = lllllllllllllllIlIlIlllllIIIllII.group(lIllllllIIll[lIllllllIlIl[1]]);
            int lllllllllllllllIlIlIlllllIIIlIIl = lIllllllIlIl[2];
            switch (lllllllllllllllIlIlIlllllIIIlIlI.hashCode()) {
                case 111384492: {
                    if (!b.llllIIIIIlIIIl(lllllllllllllllIlIlIlllllIIIlIlI.equals(lIllllllIIll[lIllllllIlIl[3]]) ? 1 : 0)) break;
                    lllllllllllllllIlIlIlllllIIIlIIl = lIllllllIlIl[0];
                    0;
                    if (-1 <= 0) break;
                    return null;
                }
                case 109801339: {
                    if (!b.llllIIIIIlIIIl(lllllllllllllllIlIlIlllllIIIlIlI.equals(lIllllllIIll[lIllllllIlIl[4]]) ? 1 : 0)) break;
                    lllllllllllllllIlIlIlllllIIIlIIl = lIllllllIlIl[1];
                }
            }
            switch (lllllllllllllllIlIlIlllllIIIlIIl) {
                case 0: {
                    return H.ULTRACOMPOST;
                }
                case 1: {
                    return H.SUPERCOMPOST;
                }
            }
            return H.COMPOST;
        }
        return null;
    }

    private static String llllIIIIIIlIII(String lllllllllllllllIlIlIllllIIllIlIl, String lllllllllllllllIlIlIllllIIlIllll) {
        lllllllllllllllIlIlIllllIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIllllIIllIIll = new StringBuilder();
        char[] lllllllllllllllIlIlIllllIIllIIlI = lllllllllllllllIlIlIllllIIlIllll.toCharArray();
        int lllllllllllllllIlIlIllllIIllIIIl = lIllllllIlIl[0];
        char[] lllllllllllllllIlIlIllllIIlIlIll = lllllllllllllllIlIlIllllIIllIlIl.toCharArray();
        int lllllllllllllllIlIlIllllIIlIlIlI = lllllllllllllllIlIlIllllIIlIlIll.length;
        int lllllllllllllllIlIlIllllIIlIlIIl = lIllllllIlIl[0];
        while (b.llllIIIIIlIlII(lllllllllllllllIlIlIllllIIlIlIIl, lllllllllllllllIlIlIllllIIlIlIlI)) {
            char lllllllllllllllIlIlIllllIIllIllI = lllllllllllllllIlIlIllllIIlIlIll[lllllllllllllllIlIlIllllIIlIlIIl];
            lllllllllllllllIlIlIllllIIllIIll.append((char)(lllllllllllllllIlIlIllllIIllIllI ^ lllllllllllllllIlIlIllllIIllIIlI[lllllllllllllllIlIlIllllIIllIIIl % lllllllllllllllIlIlIllllIIllIIlI.length]));
            0;
            ++lllllllllllllllIlIlIllllIIllIIIl;
            ++lllllllllllllllIlIlIllllIIlIlIIl;
            0;
            if (((0x30 ^ 0x7B) & ~(0xF1 ^ 0xBA)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIllllIIllIIll);
    }

    private static boolean llllIIIIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIIIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(d d2) {
        int n2;
        GameObject lllllllllllllllIlIlIllllIlIlIlIl;
        void lllllllllllllllIlIlIllllIlIlllII;
        b lllllllllllllllIlIlIllllIlIllllI;
        void lllllllllllllllIlIlIllllIlIlllIl;
        LocalPoint localPoint = LocalPoint.fromWorld((Client)this.y, (WorldPoint)d2.g());
        if (b.llllIIIIIlIIlI(localPoint)) {
            return lIllllllIlIl[0];
        }
        int lllllllllllllllIlIlIllllIlIllIll = lllllllllllllllIlIlIllllIlIlllIl.h().aO();
        Tile lllllllllllllllIlIlIllllIlIllIlI = lllllllllllllllIlIlIllllIlIllllI.y.getScene().getTiles()[lllllllllllllllIlIlIllllIlIllllI.y.getPlane()][lllllllllllllllIlIlIllllIlIlllII.getSceneX()][lllllllllllllllIlIlIllllIlIlllII.getSceneY()];
        GameObject lllllllllllllllIlIlIllllIlIllIIl = null;
        WorldPoint lllllllllllllllIlIlIllllIlIllIII = lllllllllllllllIlIlIllllIlIllIlI.getGameObjects();
        int lllllllllllllllIlIlIllllIlIlIlll = ((GameObject[])lllllllllllllllIlIlIllllIlIllIII).length;
        int lllllllllllllllIlIlIllllIlIlIllI = lIllllllIlIl[0];
        while (b.llllIIIIIlIlII(lllllllllllllllIlIlIllllIlIlIllI, lllllllllllllllIlIlIllllIlIlIlll)) {
            lllllllllllllllIlIlIllllIlIlIlIl = lllllllllllllllIlIlIllllIlIllIII[lllllllllllllllIlIlIllllIlIlIllI];
            if (b.llllIIIIIlIlIl(lllllllllllllllIlIlIllllIlIlIlIl) && b.llllIIIIIlIIll(lllllllllllllllIlIlIllllIlIllllI.y.getObjectDefinition(lllllllllllllllIlIlIllllIlIlIlIl.getId()).getVarbitId(), lllllllllllllllIlIlIllllIlIllIll)) {
                lllllllllllllllIlIlIllllIlIllIIl = lllllllllllllllIlIlIllllIlIlIlIl;
                0;
                if (null == null) break;
                return ((0x6F ^ 0x57 ^ (0x16 ^ 0x35)) & (0x59 ^ 0x65 ^ (0xE5 ^ 0xC2) ^ -1)) != 0;
            }
            ++lllllllllllllllIlIlIllllIlIlIllI;
            0;
            if (((0x23 ^ 1) & ~(0x84 ^ 0xA6)) < 1) continue;
            return ((0x6E ^ 0x7A) & ~(0x74 ^ 0x60)) != 0;
        }
        if (b.llllIIIIIlIIII(B ? 1 : 0) && b.llllIIIIIlIIlI(lllllllllllllllIlIlIllllIlIllIIl)) {
            throw new AssertionError();
        }
        lllllllllllllllIlIlIllllIlIllIII = lllllllllllllllIlIlIllllIlIllllI.y.getLocalPlayer().getWorldLocation();
        lllllllllllllllIlIlIllllIlIlIlll = lllllllllllllllIlIlIllllIlIllIII.getX();
        lllllllllllllllIlIlIllllIlIlIllI = lllllllllllllllIlIlIllllIlIllIII.getY();
        lllllllllllllllIlIlIllllIlIlIlIl = lllllllllllllllIlIlIllllIlIlllIl.g();
        int lllllllllllllllIlIlIllllIlIlIlII = lllllllllllllllIlIlIllllIlIlIlIl.getX();
        int lllllllllllllllIlIlIllllIlIlIIll = lllllllllllllllIlIlIllllIlIlIlIl.getY();
        int lllllllllllllllIlIlIllllIlIlIIlI = lllllllllllllllIlIlIllllIlIlIlII + lllllllllllllllIlIlIllllIlIllIIl.sizeX() - lIllllllIlIl[1];
        int lllllllllllllllIlIlIllllIlIlIIIl = lllllllllllllllIlIlIllllIlIlIIll + lllllllllllllllIlIlIllllIlIllIIl.sizeY() - lIllllllIlIl[1];
        if (b.llllIIIIIlIllI(lllllllllllllllIlIlIllllIlIlIlll, lllllllllllllllIlIlIllllIlIlIlII - lIllllllIlIl[1]) && b.llllIIIIIlIlll(lllllllllllllllIlIlIllllIlIlIlll, lllllllllllllllIlIlIllllIlIlIIlI + lIllllllIlIl[1]) && b.llllIIIIIlIllI(lllllllllllllllIlIlIllllIlIlIllI, lllllllllllllllIlIlIllllIlIlIIll - lIllllllIlIl[1]) && b.llllIIIIIlIlll(lllllllllllllllIlIlIllllIlIlIllI, lllllllllllllllIlIlIllllIlIlIIIl + lIllllllIlIl[1])) {
            n2 = lIllllllIlIl[1];
            0;
            if (3 == 0) {
                return ((0x98 ^ 0x86) & ~(0xB1 ^ 0xAF)) != 0;
            }
        } else {
            n2 = lIllllllIlIl[0];
        }
        return n2 != 0;
    }

    private static String a(N n2) {
        return n2.aJ() + ".compost";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        void var3_3;
        void var4_4;
        void lllllllllllllllIlIlIllllIllllIll;
        b lllllllllllllllIlIlIllllIlllllII;
        if (b.llllIIIIIlIIII(this.b(menuActionProcessed) ? 1 : 0)) {
            return;
        }
        ObjectComposition lllllllllllllllIlIlIllllIllllIlI = lllllllllllllllIlIlIllllIlllllII.y.getObjectDefinition(lllllllllllllllIlIlIllllIllllIll.getIdentifier());
        WorldPoint lllllllllllllllIlIlIllllIllllIIl = WorldPoint.fromScene((Client)lllllllllllllllIlIlIllllIlllllII.y, (int)lllllllllllllllIlIlIllllIllllIll.getParam0(), (int)lllllllllllllllIlIlIllllIllllIll.getParam1(), (int)lllllllllllllllIlIlIllllIlllllII.y.getPlane());
        N lllllllllllllllIlIlIllllIllllIII = lllllllllllllllIlIlIllllIlllllII.z.d(lllllllllllllllIlIlIllllIllllIIl).stream().flatMap(q2 -> Arrays.stream(q2.ae())).filter(n2 -> {
            boolean bl;
            if (b.llllIIIIIlIIll(n2.aO(), lllllllllllllllIlIlIllllIllllIlI.getVarbitId())) {
                bl = lIllllllIlIl[1];
                0;
                if ((4 ^ 0) == ((0x57 ^ 3) & ~(0x26 ^ 0x72))) {
                    return ((0xAE ^ 0x8E) & ~(0x27 ^ 7)) != 0;
                }
            } else {
                bl = lIllllllIlIl[0];
            }
            return bl;
        }).findFirst().orElse(null);
        if (b.llllIIIIIlIIlI(lllllllllllllllIlIlIllllIllllIII)) {
            return;
        }
        q.debug(lIllllllIIll[lIllllllIlIl[9]], (Object)var4_4);
        d d2 = new d(Instant.now().plus(r), (WorldPoint)var3_3, (N)var4_4);
        this.x.put((N)var4_4, d2);
        0;
    }

    private static boolean llllIIIIIlIIlI(Object object) {
        return object == null;
    }

    private void e() {
        this.x.values().removeIf(d2 -> Instant.now().isAfter(d2.f()));
        0;
    }

    private static boolean llllIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void a(N n2, H h2) {
        q.debug(lIllllllIIll[lIllllllIlIl[5]], (Object)h2, (Object)n2);
        if (b.llllIIIIIlIIlI((Object)h2)) {
            this.A.unsetRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[6]], b.a(n2));
            0;
            if ((166 + 161 - 201 + 42 ^ 21 + 143 - 64 + 72) < 0) {
                return;
            }
        } else {
            void lllllllllllllllIlIlIlllllIIIIIll;
            void lllllllllllllllIlIlIlllllIIIIlII;
            b lllllllllllllllIlIlIlllllIIIIlIl;
            lllllllllllllllIlIlIlllllIIIIlIl.A.setRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[7]], b.a((N)lllllllllllllllIlIlIlllllIIIIlII), (Object)lllllllllllllllIlIlIlllllIIIIIll);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(MenuActionProcessed menuActionProcessed) {
        switch (c.C[menuActionProcessed.getOpcode().ordinal()]) {
            case 1: {
                boolean bl;
                b lllllllllllllllIlIlIllllIlllIIll;
                Widget lllllllllllllllIlIlIllllIlllIIIl = lllllllllllllllIlIlIllllIlllIIll.y.getSelectedWidget();
                if (b.llllIIIIIlIIII(B ? 1 : 0) && b.llllIIIIIlIIlI(lllllllllllllllIlIlIllllIlllIIIl)) {
                    throw new AssertionError();
                }
                if (!b.llllIIIIIlIIII(w.contains((Object)lllllllllllllllIlIlIllllIlllIIIl.getItemId()) ? 1 : 0) || b.llllIIIIIlIIll(lllllllllllllllIlIlIllllIlllIIIl.getId(), WidgetInfo.SPELL_LUNAR_FERTILE_SOIL.getPackedId())) {
                    bl = lIllllllIlIl[1];
                    0;
                    if (((0x55 ^ 0x16) & ~(0xC8 ^ 0x8B)) == 1) {
                        return ((0x26 ^ 0x61) & ~(0x69 ^ 0x2E)) != 0;
                    }
                } else {
                    bl = lIllllllIlIl[0];
                }
                return bl;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                void lllllllllllllllIlIlIllllIlllIIlI;
                return lIllllllIIll[lIllllllIlIl[10]].equals(lllllllllllllllIlIlIllllIlllIIlI.getOption());
            }
        }
        return lIllllllIlIl[0];
    }

    private static boolean llllIIIIIlIlIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        switch (c.D[gameStateChanged.getGameState().ordinal()]) {
            case 1: 
            case 2: {
                return;
            }
        }
        this.x.clear();
    }

    private static boolean llllIIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llllIIIIIIlIlI() {
        lIllllllIIll = new String[lIllllllIlIl[19]];
        b.lIllllllIIll[b.lIllllllIlIl[0]] = b."compost";
        b.lIllllllIIll[b.lIllllllIlIl[1]] = b."compostType";
        b.lIllllllIIll[b.lIllllllIlIl[3]] = b."ultra";
        b.lIllllllIIll[b.lIllllllIlIl[4]] = b."super";
        b.lIllllllIIll[b.lIllllllIlIl[5]] = b."Storing compost state [{}] for patch [{}]";
        b.lIllllllIIll[b.lIllllllIlIl[6]] = b."timetracking";
        b.lIllllllIIll[b.lIllllllIlIl[7]] = b."timetracking";
        b.lIllllllIIll[b.lIllllllIlIl[8]] = b."timetracking";
        b.lIllllllIIll[b.lIllllllIlIl[9]] = b."Storing pending compost action for patch [{}]";
        b.lIllllllIIll[b.lIllllllIlIl[10]] = b."Inspect";
        b.lIllllllIIll[b.lIllllllIlIl[11]] = b."You treat the .+ with (?<compostType>ultra|super|)compost\\.";
        b.lIllllllIIll[b.lIllllllIlIl[12]] = b."^The .+ has been treated with (?<compostType>ultra|super|)compost";
        b.lIllllllIIll[b.lIllllllIlIl[13]] = b."This .+ has already been (treated|fertilised) with (?<compostType>ultra|super|)compost(?: - the spell can't make it any more fertile)?\\.";
        b.lIllllllIIll[b.lIllllllIlIl[14]] = b."This is an? .+\\. The soil has been treated with (?<compostType>ultra|super|)compost\\..*";
    }
}

