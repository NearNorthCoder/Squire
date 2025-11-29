/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.util.Text
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.game.ItemManager
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.B;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.am;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import com.google.inject.Singleton;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.game.ItemManager;

@Singleton
public class e {
    private static /* synthetic */ String[] llIIIlIlIIll;
    @Inject
    private /* synthetic */ SquireFarmer P;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ String L;
    private /* synthetic */ B M;
    private /* synthetic */ n N;
    private static final /* synthetic */ String K;
    @Inject
    private /* synthetic */ ItemManager O;
    private /* synthetic */ au R;
    private static /* synthetic */ int[] llIIIlIlIlII;
    @Inject
    private /* synthetic */ f Q;
    private static final /* synthetic */ Pattern J;
    @Inject
    private /* synthetic */ ConfigManager i;
    @Inject
    private /* synthetic */ SquireFarmerConfig h;
    @Inject
    private /* synthetic */ r z;
    @Inject
    private /* synthetic */ Client j;
    private /* synthetic */ long S;
    private static final /* synthetic */ int H;

    private static boolean llllIlIIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        e.llllIlIIlIllII();
        e.llllIlIIlIlIll();
        K = llIIIlIlIIll[llIIIlIlIlII[9]];
        H = llIIIlIlIlII[3];
        L = llIIIlIlIIll[llIIIlIlIlII[10]];
        I = llIIIlIlIlII[2];
        J = Pattern.compile(llIIIlIlIIll[llIIIlIlIlII[11]]);
    }

    public au r() {
        return this.R;
    }

    /*
     * WARNING - void declaration
     */
    private void m() {
        void var5_5;
        Matcher lllllllllllllllIlIlIlIIIIIIIlIlI;
        e lllllllllllllllIlIlIlIIIIIIIllIl;
        Widget widget = this.j.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
        if (!e.llllIlIIlIllIl(widget) || e.llllIlIIllIIlI(widget.getModelId(), llIIIlIlIlII[3])) {
            return;
        }
        String lllllllllllllllIlIlIlIIIIIIIlIll = Text.removeTags((String)lllllllllllllllIlIlIlIIIIIIIllIl.j.getWidget(WidgetInfo.DIALOG_NPC_TEXT).getText());
        if (e.llllIlIIlIlllI(lllllllllllllllIlIlIlIIIIIIIlIll.equals(llIIIlIlIIll[llIIIlIlIlII[1]]) ? 1 : 0)) {
            lllllllllllllllIlIlIlIIIIIIIllIl.a((au)null);
        }
        if (e.llllIlIIllIIll((lllllllllllllllIlIlIlIIIIIIIlIlI = J.matcher(lllllllllllllllIlIlIlIIIIIIIlIll)).find() ? 1 : 0)) {
            return;
        }
        String lllllllllllllllIlIlIlIIIIIIIlIIl = lllllllllllllllIlIlIlIIIIIIIlIlI.group(llIIIlIlIlII[0]);
        au lllllllllllllllIlIlIlIIIIIIIlIII = au.d(lllllllllllllllIlIlIlIIIIIIIlIIl);
        if (e.llllIlIIllIlII((Object)lllllllllllllllIlIlIlIIIIIIIlIII)) {
            return;
        }
        au lllllllllllllllIlIlIlIIIIIIIIlll = lllllllllllllllIlIlIlIIIIIIIllIl.R;
        if (e.llllIlIIllIIII((Object)lllllllllllllllIlIlIlIIIIIIIlIII, (Object)lllllllllllllllIlIlIlIIIIIIIIlll)) {
            return;
        }
        this.a((au)var5_5);
    }

    public boolean i() {
        boolean bl;
        if (e.llllIlIIlIllIl((Object)this.R)) {
            bl = llIIIlIlIlII[0];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0xE5 ^ 0xC7) & ~(0 ^ 0x22)) != 0;
            }
        } else {
            bl = llIIIlIlIlII[1];
        }
        return bl;
    }

    private void b(@Nullable au au2) {
        if (e.llllIlIIlIllIl((Object)au2)) {
            this.i.setRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[5]], llIIIlIlIIll[llIIIlIlIlII[6]], (Object)String.valueOf(au2.au()));
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        } else {
            e lllllllllllllllIlIlIIllllllIIllI;
            lllllllllllllllIlIlIIllllllIIllI.i.unsetRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[7]], llIIIlIlIIll[llIIIlIlIlII[8]]);
        }
    }

    private static boolean llllIlIIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static int llllIlIIllIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llllIlIIllIIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(N n2) {
        int n3;
        e lllllllllllllllIlIlIlIIIIIIlllIl;
        void lllllllllllllllIlIlIlIIIIIIllIll;
        am am2 = this.Q.j(n2);
        if (e.llllIlIIlIllIl((Object)this.R) && e.llllIlIIlIllll(n2.aM().X(), llIIIlIlIlII[2]) && e.llllIlIIllIIII((Object)this.R.bh(), (Object)n2.aL()) && e.llllIlIIlIllIl(am2) && (e.llllIlIIllIIII((Object)this.M, (Object)B.EMPTY) && (!e.llllIlIIlIllIl((Object)am2.aY()) || !e.llllIlIIllIIIl((Object)am2.aY(), (Object)au.WEEDS)) || e.llllIlIIlIlllI(lllllllllllllllIlIlIlIIIIIIllIll.aY().equals((Object)lllllllllllllllIlIlIlIIIIIIlllIl.R) ? 1 : 0))) {
            n3 = llIIIlIlIlII[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xD9 ^ 0xAD ^ (5 ^ 0x5B)) & (157 + 58 - 138 + 83 ^ 68 + 27 - 62 + 105 ^ -" ".length())) != 0;
            }
        } else {
            n3 = llIIIlIlIlII[1];
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     */
    private void n() {
        if (e.llllIlIIllIlII((Object)this.R)) {
            this.M = B.UNKNOWN;
            return;
        }
        lllllllllllllllIlIlIIllllllllIII = lllllllllllllllIlIlIIllllllllIIl.R.bh();
        lllllllllllllllIlIlIIlllllllIlll = e.llIIIlIlIlII[1];
        lllllllllllllllIlIlIIlllllllIllI = e.llIIIlIlIlII[1];
        lllllllllllllllIlIlIIlllllllIlIl = e.llIIIlIlIlII[1];
        lllllllllllllllIlIlIIllllllllIIl.S = 0x7FFFFFFFFFFFFFFFL;
        lllllllllllllllIlIlIIllllllllIIl.N = null;
        lllllllllllllllIlIlIIlllllllIlII = lllllllllllllllIlIlIIllllllllIIl.z.ag().ae();
        lllllllllllllllIlIlIIlllllllIIll = lllllllllllllllIlIlIIlllllllIlII.length;
        lllllllllllllllIlIlIIlllllllIIlI = e.llIIIlIlIlII[1];
        while (e.llllIlIIllIllI(lllllllllllllllIlIlIIlllllllIIlI, lllllllllllllllIlIlIIlllllllIIll)) {
            block22: {
                block27: {
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        lllllllllllllllIlIlIIlllllllIIIl = lllllllllllllllIlIlIIlllllllIlII[lllllllllllllllIlIlIIlllllllIIlI];
                                        if (!e.llllIlIIllIIIl((Object)lllllllllllllllIlIlIIlllllllIIIl.aL(), (Object)lllllllllllllllIlIlIIllllllllIII)) break block21;
                                        "".length();
                                        if (-" ".length() > "  ".length()) {
                                            return;
                                        }
                                        break block22;
                                    }
                                    lllllllllllllllIlIlIIlllllllIIII = lllllllllllllllIlIlIIllllllllIIl.Q.j(lllllllllllllllIlIlIIlllllllIIIl);
                                    if (!e.llllIlIIllIlII(lllllllllllllllIlIlIIlllllllIIII)) break block23;
                                    "".length();
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                    break block22;
                                }
                                lllllllllllllllIlIlIIllllllIllll = lllllllllllllllIlIlIIlllllllIIII.aY();
                                lllllllllllllllIlIlIIllllllIlllI = lllllllllllllllIlIlIIlllllllIIII.aZ();
                                if (!e.llllIlIIllIIll(e.llllIlIIllIlIl(lllllllllllllllIlIlIIllllllllIIl.S, 0x7FFFFFFFFFFFFFFFL))) break block24;
                                if (e.llllIlIIlIllIl((Object)lllllllllllllllIlIlIIllllllIllll) && !e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllIllll, (Object)au.WEEDS)) break block25;
                                if (e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIllI) && e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIlIl)) {
                                    lllllllllllllllIlIlIIllllllllIIl.M = B.EMPTY;
                                }
                                lllllllllllllllIlIlIIlllllllIlll = e.llIIIlIlIlII[0];
                                "".length();
                                if (" ".length() < 0) {
                                    return;
                                }
                                break block22;
                            }
                            if (!e.llllIlIIlIlllI((int)lllllllllllllllIlIlIIllllllllIIl.R.bh().aX()) || !e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllIlllI, (Object)n.HARVESTABLE) || !e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIlll) || !e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIllI) || !e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIlIl)) break block24;
                            lllllllllllllllIlIlIIllllllllIIl.M = B.OCCUPIED;
                            "".length();
                            if (((124 ^ 26 ^ (88 ^ 55)) & ((78 ^ 96) & ~(116 ^ 90) ^ (66 ^ 75) ^ -" ".length())) > "  ".length()) {
                                return;
                            }
                            break block22;
                        }
                        if (!e.llllIlIIllIIIl((Object)lllllllllllllllIlIlIIllllllIllll, (Object)lllllllllllllllIlIlIIllllllllIIl.R) || !e.llllIlIIllIIIl((Object)lllllllllllllllIlIlIIllllllIllll, (Object)au.ANYHERB)) break block26;
                        if (e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIlll) && e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIllI) && e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIlIl) && e.llllIlIIllIIll(e.llllIlIIllIlIl(lllllllllllllllIlIlIIllllllllIIl.S, 0x7FFFFFFFFFFFFFFFL))) {
                            lllllllllllllllIlIlIIllllllllIIl.M = B.OCCUPIED;
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        break block22;
                    }
                    if (!e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllIlllI, (Object)n.DEAD)) break block27;
                    if (!e.llllIlIIllIIll(lllllllllllllllIlIlIIlllllllIllI)) break block22;
                    if (e.llllIlIIlIlllI(e.llllIlIIllIlIl(lllllllllllllllIlIlIIllllllllIIl.S, 0x7FFFFFFFFFFFFFFFL))) {
                        "".length();
                        if (((102 ^ 14 ^ (111 ^ 27)) & (129 ^ 184 ^ (58 ^ 31) ^ -" ".length())) < -" ".length()) {
                            return;
                        } else {
                            ** GOTO lbl68
                        }
                    }
                    break block27;
lbl68:
                    // 2 sources

                    break block22;
                }
                if (e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllIlllI, (Object)n.DISEASED) && e.llllIlIIlIlllI(e.llllIlIIllIlIl(lllllllllllllllIlIlIIllllllllIIl.S, 0x7FFFFFFFFFFFFFFFL))) {
                    "".length();
                    if ((111 + 172 - 188 + 92 ^ 179 + 75 - 108 + 45) == 0) {
                        return;
                    }
                } else {
                    lllllllllllllllIlIlIIllllllllIIl.N = lllllllllllllllIlIlIIllllllIlllI;
                    if (e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllllIIl.N, (Object)n.DISEASED)) {
                        lllllllllllllllIlIlIIlllllllIllI = e.llIIIlIlIlII[0];
                        lllllllllllllllIlIlIIllllllllIIl.M = B.IN_PROGRESS;
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                    } else if (e.llllIlIIllIIII((Object)lllllllllllllllIlIlIIllllllllIIl.N, (Object)n.DEAD)) {
                        lllllllllllllllIlIlIIlllllllIlIl = e.llIIIlIlIlII[0];
                        lllllllllllllllIlIlIIllllllllIIl.M = B.IN_PROGRESS;
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                    } else {
                        lllllllllllllllIlIlIIllllllIllIl = Math.min(lllllllllllllllIlIlIIlllllllIIII.ba(), lllllllllllllllIlIlIIllllllllIIl.S);
                        if (e.llllIlIIllIlll(e.llllIlIIllIlIl(lllllllllllllllIlIlIIllllllIllIl, Instant.now().getEpochSecond()))) {
                            lllllllllllllllIlIlIIllllllllIIl.M = B.COMPLETED;
                            lllllllllllllllIlIlIIllllllllIIl.S = 0L;
                            "".length();
                            if ("   ".length() <= (17 ^ 22 ^ "   ".length())) break;
                            return;
                        }
                        lllllllllllllllIlIlIIllllllllIIl.M = B.IN_PROGRESS;
                        lllllllllllllllIlIlIIllllllllIIl.S = lllllllllllllllIlIlIIllllllIllIl;
                    }
                }
            }
            ++lllllllllllllllIlIlIIlllllllIIlI;
            "".length();
            if (" ".length() >= 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        boolean bl;
        e lllllllllllllllIlIlIlIIIIIIlIlll;
        void lllllllllllllllIlIlIlIIIIIIlIlIl;
        B b2 = this.M;
        this.n();
        if (e.llllIlIIlIllll(worldPoint.getRegionID(), llIIIlIlIlII[2])) {
            this.m();
        }
        if (e.llllIlIIllIIIl(lllllllllllllllIlIlIlIIIIIIlIlIl, (Object)lllllllllllllllIlIlIlIIIIIIlIlll.M)) {
            bl = llIIIlIlIlII[0];
            "".length();
            if (null != null) {
                return ((0x21 ^ 0x76) & ~(0x91 ^ 0xC6)) != 0;
            }
        } else {
            bl = llIIIlIlIlII[1];
        }
        return bl;
    }

    public e() {
        this.M = B.UNKNOWN;
        this.R = null;
    }

    private static boolean llllIlIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIllIlII(Object object) {
        return object == null;
    }

    private static boolean llllIlIIllIlll(int n2) {
        return n2 <= 0;
    }

    private static String llllIlIIlIlIII(String lllllllllllllllIlIlIIlllllIllIlI, String lllllllllllllllIlIlIIlllllIlIlII) {
        lllllllllllllllIlIlIIlllllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlllllIllIII = new StringBuilder();
        char[] lllllllllllllllIlIlIIlllllIlIlll = lllllllllllllllIlIlIIlllllIlIlII.toCharArray();
        int lllllllllllllllIlIlIIlllllIlIllI = llIIIlIlIlII[1];
        char[] lllllllllllllllIlIlIIlllllIlIIII = lllllllllllllllIlIlIIlllllIllIlI.toCharArray();
        int lllllllllllllllIlIlIIlllllIIllll = lllllllllllllllIlIlIIlllllIlIIII.length;
        int lllllllllllllllIlIlIIlllllIIlllI = llIIIlIlIlII[1];
        while (e.llllIlIIllIllI(lllllllllllllllIlIlIIlllllIIlllI, lllllllllllllllIlIlIIlllllIIllll)) {
            char lllllllllllllllIlIlIIlllllIllIll = lllllllllllllllIlIlIIlllllIlIIII[lllllllllllllllIlIlIIlllllIIlllI];
            lllllllllllllllIlIlIIlllllIllIII.append((char)(lllllllllllllllIlIlIIlllllIllIll ^ lllllllllllllllIlIlIIlllllIlIlll[lllllllllllllllIlIlIIlllllIlIllI % lllllllllllllllIlIlIIlllllIlIlll.length]));
            "".length();
            ++lllllllllllllllIlIlIIlllllIlIllI;
            ++lllllllllllllllIlIlIIlllllIIlllI;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlllllIllIII);
    }

    public n q() {
        return this.N;
    }

    public long s() {
        return this.S;
    }

    public void a(@Nullable au au2) {
        this.R = au2;
        this.b(au2);
        this.n();
    }

    private static String llllIlIIlIlIlI(String lllllllllllllllIlIlIIllllIlllIII, String lllllllllllllllIlIlIIllllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIllllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIllllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIllllIlllIlI.init(llIIIlIlIlII[4], lllllllllllllllIlIlIIllllIlllIll);
            return new String(lllllllllllllllIlIlIIllllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIllllIlllIIl) {
            lllllllllllllllIlIlIIllllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIlIllII() {
        llIIIlIlIlII = new int[13];
        e.llIIIlIlIlII[0] = " ".length();
        e.llIIIlIlIlII[1] = (0x1E ^ 0x52) & ~(0 ^ 0x4C);
        e.llIIIlIlIlII[2] = -(0xFFFFF0DF & 0x4FE1) & (0xFFFFD3FE & 0x7FFB);
        e.llIIIlIlIlII[3] = 0xFFFFAFFC & 0x71B7;
        e.llIIIlIlIlII[4] = "  ".length();
        e.llIIIlIlIlII[5] = "   ".length();
        e.llIIIlIlIlII[6] = 136 + 196 - 184 + 51 ^ 194 + 174 - 184 + 11;
        e.llIIIlIlIlII[7] = 0x67 ^ 0x2C ^ (0x57 ^ 0x19);
        e.llIIIlIlIlII[8] = 0x44 ^ 0x42;
        e.llIIIlIlIlII[9] = 158 + 47 - 76 + 57 ^ 172 + 9 - 22 + 30;
        e.llIIIlIlIlII[10] = 0x64 ^ 0x1A ^ (0x2B ^ 0x5D);
        e.llIIIlIlIlII[11] = 0xAD ^ 0xA4;
        e.llIIIlIlIlII[12] = 0xA3 ^ 0xB0 ^ (0xB ^ 0x12);
    }

    @Nullable
    private au o() {
        try {
            e lllllllllllllllIlIlIIllllllIlIlI;
            return au.g(Integer.parseInt(lllllllllllllllIlIlIIllllllIlIlI.i.getRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[0]], llIIIlIlIIll[llIIIlIlIlII[4]])));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static String llllIlIIlIlIIl(String lllllllllllllllIlIlIIlllllIIIIll, String lllllllllllllllIlIlIIlllllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlllllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlllllIIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIlIlIlII[10]), "DES");
            Cipher lllllllllllllllIlIlIIlllllIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlllllIIIlll.init(llIIIlIlIlII[4], lllllllllllllllIlIlIIlllllIIlIII);
            return new String(lllllllllllllllIlIlIIlllllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlllllIIIllI) {
            lllllllllllllllIlIlIIlllllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIIllIIll(int n2) {
        return n2 == 0;
    }

    @Nullable
    public String k() {
        String string;
        if (e.llllIlIIlIlllI(this.i() ? 1 : 0)) {
            string = this.R.k();
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        } else {
            string = null;
        }
        return string;
    }

    private static boolean llllIlIIllIIIl(Object object, Object object2) {
        return object != object2;
    }

    public void l() {
        this.R = this.o();
        this.n();
    }

    private static boolean llllIlIIlIllIl(Object object) {
        return object != null;
    }

    private static void llllIlIIlIlIll() {
        llIIIlIlIIll = new String[llIIIlIlIlII[12]];
        e.llIIIlIlIIll[e.llIIIlIlIlII[1]] = e.llllIlIIlIlIII("MQ0zcS0EQiQzYR8DKCIoBgVmN2EaBzE3MwxCMj4kBkxmHiQaB2YvLh1CITlv", "hbFVA");
        e.llIIIlIlIIll[e.llIIIlIlIlII[0]] = e.llllIlIIlIlIII("ADMwPQUWJCQmGhYw", "sBETw");
        e.llIIIlIlIIll[e.llIIIlIlIlII[4]] = e.llllIlIIlIlIIl("TULnFO7GKtpoiET0kIRy2A==", "nGAvg");
        e.llIIIlIlIIll[e.llIIIlIlIlII[5]] = e.llllIlIIlIlIII("FyciLBEBMDY3DgEk", "dVWEc");
        e.llIIIlIlIIll[e.llIIIlIlIlII[6]] = e.llllIlIIlIlIIl("9mziwG8oQDZ4lSygVwn25w==", "wbdcs");
        e.llIIIlIlIIll[e.llIIIlIlIlII[7]] = e.llllIlIIlIlIlI("iVPINu8u3/kh74IdWwJqQA==", "kHEeP");
        e.llIIIlIlIIll[e.llIIIlIlIlII[8]] = e.llllIlIIlIlIII("FCkYAyQWJQI=", "wFvwV");
        e.llIIIlIlIIll[e.llIIIlIlIlII[9]] = e.llllIlIIlIlIlI("L4b8hP96gG34Kt+wpg7/AnyJR69iRCARWQW35DQPwmtCqXwro3/D7BIvmFNCpJFw", "sVLDx");
        e.llIIIlIlIIll[e.llIIIlIlIlII[10]] = e.llllIlIIlIlIlI("JdF32vZz5oPzSfoFzs5sYQ==", "iwcFE");
        e.llIIIlIlIIll[e.llIIIlIlIlII[11]] = e.llllIlIIlIlIII("enNTHx9yIgwtHnI1Bj1aJiNJLwg9OxUYFjctGi1aMSMcJB5yNQY9WjU+Bj9TcmRWcgk9IQw0Gy4tB2FaehcIZQATYTNoJ3llQXdAcioGOlonPzV3Bg5iQA==", "RLiHz");
    }

    @Nullable
    public A j() {
        A a2;
        if (e.llllIlIIlIlllI(this.i() ? 1 : 0)) {
            a2 = this.R.bh().aU();
            "".length();
            if (((0xE ^ 0x48 ^ (0x46 ^ 0x54)) & (0x8F ^ 0xB9 ^ (0xE6 ^ 0x84) ^ -" ".length())) != 0) {
                return null;
            }
        } else {
            a2 = null;
        }
        return a2;
    }

    public B p() {
        return this.M;
    }

    private static boolean llllIlIIlIlllI(int n2) {
        return n2 != 0;
    }
}

