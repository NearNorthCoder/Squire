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

    private static String llllIIIIIIlIIl(String var16, String var38) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var38.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllllllIlIl[3], var27);
            return new String(var3.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var40) {
            var40.printStackTrace();
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

    private static String llllIIIIIIIlll(String var32, String var6) {
        try {
            SecretKeySpec var35 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIllllllIlIl[9]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllllllIlIl[3], var35);
            return new String(var8.doFinal(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static H a(String string) {
        String var42;
        if (b.llllIIIIIlIIII(string.contains(lIllllllIIll[lIllllllIlIl[0]]) ? 1 : 0)) {
            return null;
        }
        Matcher var44 = s.matcher(var42);
        if (!b.llllIIIIIlIIII(var44.matches() ? 1 : 0) || !b.llllIIIIIlIIII((var44 = t.matcher(var42)).find() ? 1 : 0) || !b.llllIIIIIlIIII((var44 = u.matcher(var42)).matches() ? 1 : 0) || b.llllIIIIIlIIIl((var44 = v.matcher(var42)).matches() ? 1 : 0)) {
            String var47;
            String var7 = var47 = var44.group(lIllllllIIll[lIllllllIlIl[1]]);
            int var15 = lIllllllIlIl[2];
            switch (var7.hashCode()) {
                case 111384492: {
                    if (!b.llllIIIIIlIIIl(var7.equals(lIllllllIIll[lIllllllIlIl[3]]) ? 1 : 0)) break;
                    var15 = lIllllllIlIl[0];
                    0;
                    if (-1 <= 0) break;
                    return null;
                }
                case 109801339: {
                    if (!b.llllIIIIIlIIIl(var7.equals(lIllllllIIll[lIllllllIlIl[4]]) ? 1 : 0)) break;
                    var15 = lIllllllIlIl[1];
                }
            }
            switch (var15) {
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

    private static String llllIIIIIIlIII(String var2, String var22) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var17 = var22.toCharArray();
        int var46 = lIllllllIlIl[0];
        char[] var25 = var2.toCharArray();
        int var49 = var25.length;
        int var18 = lIllllllIlIl[0];
        while (b.llllIIIIIlIlII(var18, var49)) {
            char var23 = var25[var18];
            var10.append((char)(var23 ^ var17[var46 % var17.length]));
            0;
            ++var46;
            ++var18;
            0;
            if (((0x30 ^ 0x7B) & ~(0xF1 ^ 0xBA)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
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
        GameObject var33;
        void var14;
        b var34;
        void var31;
        LocalPoint localPoint = LocalPoint.fromWorld((Client)this.y, (WorldPoint)d2.g());
        if (b.llllIIIIIlIIlI(localPoint)) {
            return lIllllllIlIl[0];
        }
        int var29 = var31.h().aO();
        Tile var24 = var34.y.getScene().getTiles()[var34.y.getPlane()][var14.getSceneX()][var14.getSceneY()];
        GameObject var36 = null;
        WorldPoint var21 = var24.getGameObjects();
        int var4 = ((GameObject[])var21).length;
        int var11 = lIllllllIlIl[0];
        while (b.llllIIIIIlIlII(var11, var4)) {
            var33 = var21[var11];
            if (b.llllIIIIIlIlIl(var33) && b.llllIIIIIlIIll(var34.y.getObjectDefinition(var33.getId()).getVarbitId(), var29)) {
                var36 = var33;
                0;
                if (null == null) break;
                return ((0x6F ^ 0x57 ^ (0x16 ^ 0x35)) & (0x59 ^ 0x65 ^ (0xE5 ^ 0xC2) ^ -1)) != 0;
            }
            ++var11;
            0;
            if (((0x23 ^ 1) & ~(0x84 ^ 0xA6)) < 1) continue;
            return false;
        }
        if (b.llllIIIIIlIIII(B ? 1 : 0) && b.llllIIIIIlIIlI(var36)) {
            throw new AssertionError();
        }
        var21 = var34.y.getLocalPlayer().getWorldLocation();
        var4 = var21.getX();
        var11 = var21.getY();
        var33 = var31.g();
        int var30 = var33.getX();
        int var20 = var33.getY();
        int var12 = var30 + var36.sizeX() - lIllllllIlIl[1];
        int var13 = var20 + var36.sizeY() - lIllllllIlIl[1];
        if (b.llllIIIIIlIllI(var4, var30 - lIllllllIlIl[1]) && b.llllIIIIIlIlll(var4, var12 + lIllllllIlIl[1]) && b.llllIIIIIlIllI(var11, var20 - lIllllllIlIl[1]) && b.llllIIIIIlIlll(var11, var13 + lIllllllIlIl[1])) {
            n2 = lIllllllIlIl[1];
            0;
            if (3 == 0) {
                return false;
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
        void var45;
        b var48;
        if (b.llllIIIIIlIIII(this.b(menuActionProcessed) ? 1 : 0)) {
            return;
        }
        ObjectComposition var1 = var48.y.getObjectDefinition(var45.getIdentifier());
        WorldPoint var43 = WorldPoint.fromScene((Client)var48.y, (int)var45.getParam0(), (int)var45.getParam1(), (int)var48.y.getPlane());
        N var28 = var48.z.d(var43).stream().flatMap(q2 -> Arrays.stream(q2.ae())).filter(n2 -> {
            boolean bl;
            if (b.llllIIIIIlIIll(n2.aO(), var1.getVarbitId())) {
                bl = lIllllllIlIl[1];
                0;
                if ((4 ^ 0) == ((0x57 ^ 3) & ~(0x26 ^ 0x72))) {
                    return false;
                }
            } else {
                bl = lIllllllIlIl[0];
            }
            return bl;
        }).findFirst().orElse(null);
        if (b.llllIIIIIlIIlI(var28)) {
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
            void var37;
            void var5;
            b var39;
            var39.A.setRSProfileConfiguration(lIllllllIIll[lIllllllIlIl[7]], b.a((N)var5), (Object)var37);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(MenuActionProcessed menuActionProcessed) {
        switch (c.C[menuActionProcessed.getOpcode().ordinal()]) {
            case 1: {
                boolean bl;
                b var19;
                Widget var41 = var19.y.getSelectedWidget();
                if (b.llllIIIIIlIIII(B ? 1 : 0) && b.llllIIIIIlIIlI(var41)) {
                    throw new AssertionError();
                }
                if (!b.llllIIIIIlIIII(w.contains((Object)var41.getItemId()) ? 1 : 0) || b.llllIIIIIlIIll(var41.getId(), WidgetInfo.SPELL_LUNAR_FERTILE_SOIL.getPackedId())) {
                    bl = lIllllllIlIl[1];
                    0;
                    if (((0x55 ^ 0x16) & ~(0xC8 ^ 0x8B)) == 1) {
                        return false;
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
                void var26;
                return lIllllllIIll[lIllllllIlIl[10]].equals(var26.getOption());
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

