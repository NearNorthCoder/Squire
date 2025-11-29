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
        Matcher var4;
        e var19;
        Widget widget = this.j.getWidget(WidgetInfo.DIALOG_NPC_HEAD_MODEL);
        if (!e.llllIlIIlIllIl(widget) || e.llllIlIIllIIlI(widget.getModelId(), llIIIlIlIlII[3])) {
            return;
        }
        String var43 = Text.removeTags((String)var19.j.getWidget(WidgetInfo.DIALOG_NPC_TEXT).getText());
        if (e.llllIlIIlIlllI(var43.equals(llIIIlIlIIll[llIIIlIlIlII[1]]) ? 1 : 0)) {
            var19.a((au)null);
        }
        if (e.llllIlIIllIIll((var4 = J.matcher(var43)).find() ? 1 : 0)) {
            return;
        }
        String var21 = var4.group(llIIIlIlIlII[0]);
        au var35 = au.d(var21);
        if (e.llllIlIIllIlII((Object)var35)) {
            return;
        }
        au var15 = var19.R;
        if (e.llllIlIIllIIII((Object)var35, (Object)var15)) {
            return;
        }
        this.a((au)var5_5);
    }

    public boolean i() {
        boolean bl;
        if (e.llllIlIIlIllIl((Object)this.R)) {
            bl = llIIIlIlIlII[0];
            0;
            if (1 < -1) {
                return false;
            }
        } else {
            bl = llIIIlIlIlII[1];
        }
        return bl;
    }

    private void b(@Nullable au au2) {
        if (e.llllIlIIlIllIl((Object)au2)) {
            this.i.setRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[5]], llIIIlIlIIll[llIIIlIlIlII[6]], (Object)String.valueOf(au2.au()));
            0;
            if (2 > 2) {
                return;
            }
        } else {
            e var22;
            var22.i.unsetRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[7]], llIIIlIlIIll[llIIIlIlIlII[8]]);
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
        e var26;
        void var1;
        am am2 = this.Q.j(n2);
        if (e.llllIlIIlIllIl((Object)this.R) && e.llllIlIIlIllll(n2.aM().X(), llIIIlIlIlII[2]) && e.llllIlIIllIIII((Object)this.R.bh(), (Object)n2.aL()) && e.llllIlIIlIllIl(am2) && (e.llllIlIIllIIII((Object)this.M, (Object)B.EMPTY) && (!e.llllIlIIlIllIl((Object)am2.aY()) || !e.llllIlIIllIIIl((Object)am2.aY(), (Object)au.WEEDS)) || e.llllIlIIlIlllI(var1.aY().equals((Object)var26.R) ? 1 : 0))) {
            n3 = llIIIlIlIlII[0];
            0;
            if (-2 >= 0) {
                return ((0xD9 ^ 0xAD ^ (5 ^ 0x5B)) & (157 + 58 - 138 + 83 ^ 68 + 27 - 62 + 105 ^ -1)) != 0;
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
        var38 = var16.R.bh();
        var5 = e.llIIIlIlIlII[1];
        var31 = e.llIIIlIlIlII[1];
        var23 = e.llIIIlIlIlII[1];
        var16.S = 0x7FFFFFFFFFFFFFFFL;
        var16.N = null;
        var24 = var16.z.ag().ae();
        var11 = var24.length;
        var7 = e.llIIIlIlIlII[1];
        while (e.llllIlIIllIllI(var7, var11)) {
            block22: {
                block27: {
                    block26: {
                        block24: {
                            block25: {
                                block23: {
                                    block21: {
                                        var12 = var24[var7];
                                        if (!e.llllIlIIllIIIl((Object)var12.aL(), (Object)var38)) break block21;
                                        0;
                                        if (-1 > 2) {
                                            return;
                                        }
                                        break block22;
                                    }
                                    var33 = var16.Q.j(var12);
                                    if (!e.llllIlIIllIlII(var33)) break block23;
                                    0;
                                    if (2 == 0) {
                                        return;
                                    }
                                    break block22;
                                }
                                var27 = var33.aY();
                                var42 = var33.aZ();
                                if (!e.llllIlIIllIIll(e.llllIlIIllIlIl(var16.S, 0x7FFFFFFFFFFFFFFFL))) break block24;
                                if (e.llllIlIIlIllIl((Object)var27) && !e.llllIlIIllIIII((Object)var27, (Object)au.WEEDS)) break block25;
                                if (e.llllIlIIllIIll(var31) && e.llllIlIIllIIll(var23)) {
                                    var16.M = B.EMPTY;
                                }
                                var5 = e.llIIIlIlIlII[0];
                                0;
                                if (1 < 0) {
                                    return;
                                }
                                break block22;
                            }
                            if (!e.llllIlIIlIlllI((int)var16.R.bh().aX()) || !e.llllIlIIllIIII((Object)var42, (Object)n.HARVESTABLE) || !e.llllIlIIllIIll(var5) || !e.llllIlIIllIIll(var31) || !e.llllIlIIllIIll(var23)) break block24;
                            var16.M = B.OCCUPIED;
                            0;
                            if (((124 ^ 26 ^ (88 ^ 55)) & ((78 ^ 96) & ~(116 ^ 90) ^ (66 ^ 75) ^ -1)) > 2) {
                                return;
                            }
                            break block22;
                        }
                        if (!e.llllIlIIllIIIl((Object)var27, (Object)var16.R) || !e.llllIlIIllIIIl((Object)var27, (Object)au.ANYHERB)) break block26;
                        if (e.llllIlIIllIIll(var5) && e.llllIlIIllIIll(var31) && e.llllIlIIllIIll(var23) && e.llllIlIIllIIll(e.llllIlIIllIlIl(var16.S, 0x7FFFFFFFFFFFFFFFL))) {
                            var16.M = B.OCCUPIED;
                            0;
                            
                            }
                        }
                        break block22;
                    }
                    if (!e.llllIlIIllIIII((Object)var42, (Object)n.DEAD)) break block27;
                    if (!e.llllIlIIllIIll(var31)) break block22;
                    if (e.llllIlIIlIlllI(e.llllIlIIllIlIl(var16.S, 0x7FFFFFFFFFFFFFFFL))) {
                        0;
                        if (((102 ^ 14 ^ (111 ^ 27)) & (129 ^ 184 ^ (58 ^ 31) ^ -1)) < -1) {
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
                if (e.llllIlIIllIIII((Object)var42, (Object)n.DISEASED) && e.llllIlIIlIlllI(e.llllIlIIllIlIl(var16.S, 0x7FFFFFFFFFFFFFFFL))) {
                    0;
                    if ((111 + 172 - 188 + 92 ^ 179 + 75 - 108 + 45) == 0) {
                        return;
                    }
                } else {
                    var16.N = var42;
                    if (e.llllIlIIllIIII((Object)var16.N, (Object)n.DISEASED)) {
                        var31 = e.llIIIlIlIlII[0];
                        var16.M = B.IN_PROGRESS;
                        0;
                        if (1 <= -1) {
                            return;
                        }
                    } else if (e.llllIlIIllIIII((Object)var16.N, (Object)n.DEAD)) {
                        var23 = e.llIIIlIlIlII[0];
                        var16.M = B.IN_PROGRESS;
                        0;
                        if (-3 > 0) {
                            return;
                        }
                    } else {
                        var30 = Math.min(var33.ba(), var16.S);
                        if (e.llllIlIIllIlll(e.llllIlIIllIlIl(var30, Instant.now().getEpochSecond()))) {
                            var16.M = B.COMPLETED;
                            var16.S = 0L;
                            0;
                            if (3 <= (17 ^ 22 ^ 3)) break;
                            return;
                        }
                        var16.M = B.IN_PROGRESS;
                        var16.S = var30;
                    }
                }
            }
            ++var7;
            0;
            if (1 >= 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        boolean bl;
        e var2;
        void var28;
        B b2 = this.M;
        this.n();
        if (e.llllIlIIlIllll(worldPoint.getRegionID(), llIIIlIlIlII[2])) {
            this.m();
        }
        if (e.llllIlIIllIIIl(var28, (Object)var2.M)) {
            bl = llIIIlIlIlII[0];
            0;
            
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

    private static String llllIlIIlIlIII(String var13, String var44) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var10 = var44.toCharArray();
        int var3 = llIIIlIlIlII[1];
        char[] var20 = var13.toCharArray();
        int var25 = var20.length;
        int var9 = llIIIlIlIlII[1];
        while (e.llllIlIIllIllI(var9, var25)) {
            char var37 = var20[var9];
            var36.append((char)(var37 ^ var10[var3 % var10.length]));
            0;
            ++var3;
            ++var9;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var36);
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

    private static String llllIlIIlIlIlI(String var34, String var8) {
        try {
            SecretKeySpec var39 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIIIlIlIlII[4], var39);
            return new String(var14.doFinal(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIlIllII() {
        llIIIlIlIlII = new int[13];
        e.llIIIlIlIlII[0] = 1;
        e.llIIIlIlIlII[1] = (0x1E ^ 0x52) & ~(0 ^ 0x4C);
        e.llIIIlIlIlII[2] = -(0xFFFFF0DF & 0x4FE1) & (0xFFFFD3FE & 0x7FFB);
        e.llIIIlIlIlII[3] = 0xFFFFAFFC & 0x71B7;
        e.llIIIlIlIlII[4] = 2;
        e.llIIIlIlIlII[5] = 3;
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
            e var17;
            return au.g(Integer.parseInt(var17.i.getRSProfileConfiguration(llIIIlIlIIll[llIIIlIlIlII[0]], llIIIlIlIIll[llIIIlIlIlII[4]])));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    private static String llllIlIIlIlIIl(String var41, String var32) {
        try {
            SecretKeySpec var29 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), llIIIlIlIlII[10]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llIIIlIlIlII[4], var29);
            return new String(var18.doFinal(Base64.getDecoder().decode(var41.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
            0;
            if (3 == 1) {
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
        e.llIIIlIlIIll[e.llIIIlIlIlII[1]] = e."You'll be wanting a reward then. Here you go.";
        e.llIIIlIlIIll[e.llIIIlIlIlII[0]] = e."squirefarmer";
        e.llIIIlIlIIll[e.llIIIlIlIlII[4]] = e."contract";
        e.llIIIlIlIIll[e.llIIIlIlIlII[5]] = e."squirefarmer";
        e.llIIIlIlIIll[e.llIIIlIlIlII[6]] = e."contract";
        e.llIIIlIlIIll[e.llIIIlIlIlII[7]] = e."squirefarmer";
        e.llIIIlIlIIll[e.llIIIlIlIlII[8]] = e."contract";
        e.llIIIlIlIIll[e.llIIIlIlIlII[9]] = e."You'll be wanting a reward then. Here you go.";
        e.llIIIlIlIIll[e.llIIIlIlIlII[10]] = e."contract";
        e.llIIIlIlIIll[e.llIIIlIlIlII[11]] = e."(?:We need you to grow|Please could you grow) (?:some|a|an) ([a-zA-Z ]+)(?: for us\\?|\\.)";
    }

    @Nullable
    public A j() {
        A a2;
        if (e.llllIlIIlIlllI(this.i() ? 1 : 0)) {
            a2 = this.R.bh().aU();
            0;
            if (((0xE ^ 0x48 ^ (0x46 ^ 0x54)) & (0x8F ^ 0xB9 ^ (0xE6 ^ 0x84) ^ -1)) != 0) {
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

