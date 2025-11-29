/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.SoundEffectPlayed
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.autotoa.TOAConfig;
import gg.squire.autotoa.overlay.debug.DebugOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.D;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.M;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.N;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.O;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.P;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Q;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.R;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.T;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.U;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Y;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aA;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aB;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aD;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aE;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aF;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aG;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aH;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aJ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aK;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aL;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aM;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aN;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aO;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aP;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aQ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aR;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aU;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aZ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aa;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ab;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ac;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ad;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ae;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.af;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ag;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ah;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ai;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aj;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ak;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.al;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.am;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.an;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ar;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.as;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.at;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.au;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.av;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aw;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ax;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ay;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bA;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bB;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bC;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bD;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bE;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bF;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bH;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bJ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bK;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bL;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bN;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bO;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bP;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bR;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bS;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bT;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bU;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bV;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bW;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bZ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ba;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bb;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bc;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bd;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.be;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bf;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bg;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bj;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bk;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bl;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bn;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bo;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bp;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bq;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.br;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bt;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bu;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bv;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bw;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bx;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bz;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cb;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cc;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cd;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ce;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cf;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cg;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ch;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ci;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cj;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cl;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.i;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.j;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.y;

@PluginDescriptor(name="Squire Auto TOA", description="Different helpers/automation for TOA", enabledByDefault=false)
@SquireUtil
public class SquireAutoTOA
extends SquirePlugin {
    @Inject
    private /* synthetic */ N p;
    private static final /* synthetic */ Set<Integer> b;
    @Inject
    private /* synthetic */ C t;
    @Inject
    private /* synthetic */ DebugOverlay r;
    @Inject
    private /* synthetic */ Q l;
    @Inject
    private /* synthetic */ O q;
    private /* synthetic */ boolean x;
    @Inject
    private /* synthetic */ OverlayManager k;
    private static /* synthetic */ String[] llIIIllIllI;
    @Inject
    private /* synthetic */ T s;
    private /* synthetic */ boolean u;
    private /* synthetic */ int w;
    private /* synthetic */ int z;
    @Inject
    private /* synthetic */ ConfigManager c;
    private /* synthetic */ int A;
    private static final /* synthetic */ Set<Integer> a;
    @Inject
    private /* synthetic */ M m;
    @Inject
    private /* synthetic */ P o;
    @Inject
    private /* synthetic */ m f;
    @Inject
    private /* synthetic */ TOAConfig d;
    private /* synthetic */ boolean v;
    @Inject
    private /* synthetic */ i i;
    private static /* synthetic */ int[] llIIIllIlll;
    @Inject
    private /* synthetic */ j h;
    private /* synthetic */ int y;
    @Inject
    private /* synthetic */ EventBus j;
    private /* synthetic */ int B;
    @Inject
    private /* synthetic */ p g;
    @Inject
    private /* synthetic */ y e;
    @Inject
    private /* synthetic */ R n;

    public NPC b() {
        int[] nArray = new int[llIIIllIlll[3]];
        nArray[SquireAutoTOA.llIIIllIlll[0]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    public SquireAutoTOA() {
        this.u = llIIIllIlll[0];
        this.v = llIIIllIlll[0];
        this.w = llIIIllIlll[1];
        this.x = llIIIllIlll[0];
        this.y = llIIIllIlll[0];
        this.z = llIIIllIlll[0];
        this.A = llIIIllIlll[0];
        this.B = llIIIllIlll[0];
    }

    public void a(boolean bl2) {
        this.u = bl2;
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireAutoTOA.lIIllllllllIII(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    public void c(boolean bl2) {
        this.x = bl2;
    }

    public void b(int n2) {
        this.y = n2;
    }

    public int h() {
        return this.y;
    }

    public boolean a(int ... nArray) {
        return this.a((NPC nPC) -> {
            void var4;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int var11 = llIIIllIlll[0];
            while (SquireAutoTOA.lIIllllllllIll(var11, (int)var4)) {
                void var21;
                void var27;
                void var1 = var27[var11];
                if (SquireAutoTOA.lIIlllllllllII((int)var1, var21.getId())) {
                    return llIIIllIlll[3];
                }
                ++var11;
                0;
                if (3 > 1) continue;
                return false;
            }
            return llIIIllIlll[0];
        });
    }

    private static boolean lIIllllllllIlI(int n2) {
        return n2 == 0;
    }

    public int i() {
        return this.z;
    }

    public void a(int n2) {
        this.w = n2;
    }

    private static String lIIlllllIIlIlI(String var9, String var23) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), llIIIllIlll[10]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(llIIIllIlll[4], var19);
            return new String(var24.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var26;
        if (SquireAutoTOA.lIIllllllllIII(chatMessage.getMessage().startsWith(llIIIllIllI[llIIIllIlll[0]]) ? 1 : 0)) {
            this.z += llIIIllIlll[3];
            this.B = llIIIllIlll[0];
        }
        if (SquireAutoTOA.lIIllllllllIII(var26.getMessage().contains(llIIIllIllI[llIIIllIlll[3]]) ? 1 : 0)) {
            var15.A += llIIIllIlll[3];
            var15.B = llIIIllIlll[0];
        }
        if (SquireAutoTOA.lIIllllllllIII(var26.getMessage().contains(llIIIllIllI[llIIIllIlll[4]]) ? 1 : 0)) {
            var15.B += llIIIllIlll[3];
        }
    }

    public int a() {
        return Vars.getVarp((int)llIIIllIlll[98]);
    }

    private static boolean lIIlllllllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlllllIIlIll() {
        llIIIllIllI = new String[llIIIllIlll[6]];
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[0]] = SquireAutoTOA."Your completed Tombs of Amascut";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[3]] = SquireAutoTOA."You failed to survive";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[4]] = SquireAutoTOA."You have died";
        SquireAutoTOA.llIIIllIllI[SquireAutoTOA.llIIIllIlll[5]] = SquireAutoTOA."Amascut";
    }

    private static boolean lIIllllllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllllllIIl(Object object) {
        return object != null;
    }

    public boolean a(Predicate<NPC> predicate) {
        int n2;
        NPC nPC2 = this.b();
        if (SquireAutoTOA.lIIllllllllIIl(nPC2) && SquireAutoTOA.lIIllllllllIII(predicate.and(nPC -> {
            boolean bl2;
            if (SquireAutoTOA.lIIllllllllIlI(nPC.isDead() ? 1 : 0)) {
                bl2 = llIIIllIlll[3];
                0;
                if (-1 >= 0) {
                    return false;
                }
            } else {
                bl2 = llIIIllIlll[0];
            }
            return bl2;
        }).test(nPC2) ? 1 : 0)) {
            n2 = llIIIllIlll[3];
            0;
            if (-3 > 0) {
                return ((50 + 45 - -4 + 29 ^ 81 + 80 - 21 + 57) & (0x2A ^ 0x77 ^ (0x3C ^ 0x24) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIllIlll[0];
        }
        return n2 != 0;
    }

    public int f() {
        return this.w;
    }

    private static String lIIlllllIIlIIl(String var5, String var20) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var18 = var20.toCharArray();
        int var14 = llIIIllIlll[0];
        char[] var2 = var5.toCharArray();
        int var7 = var2.length;
        int var8 = llIIIllIlll[0];
        while (SquireAutoTOA.lIIllllllllIll(var8, var7)) {
            char var13 = var2[var8];
            var12.append((char)(var13 ^ var18[var14 % var18.length]));
            0;
            ++var14;
            ++var8;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIIllIlll[2]];
        classArray[SquireAutoTOA.llIIIllIlll[0]] = cf.class;
        classArray[SquireAutoTOA.llIIIllIlll[3]] = ce.class;
        classArray[SquireAutoTOA.llIIIllIlll[4]] = ch.class;
        classArray[SquireAutoTOA.llIIIllIlll[5]] = ci.class;
        classArray[SquireAutoTOA.llIIIllIlll[6]] = cj.class;
        classArray[SquireAutoTOA.llIIIllIlll[7]] = cl.class;
        classArray[SquireAutoTOA.llIIIllIlll[8]] = an.class;
        classArray[SquireAutoTOA.llIIIllIlll[9]] = aU.class;
        classArray[SquireAutoTOA.llIIIllIlll[10]] = aQ.class;
        classArray[SquireAutoTOA.llIIIllIlll[11]] = aX.class;
        classArray[SquireAutoTOA.llIIIllIlll[12]] = aR.class;
        classArray[SquireAutoTOA.llIIIllIlll[13]] = aJ.class;
        classArray[SquireAutoTOA.llIIIllIlll[14]] = aP.class;
        classArray[SquireAutoTOA.llIIIllIlll[15]] = aO.class;
        classArray[SquireAutoTOA.llIIIllIlll[16]] = aL.class;
        classArray[SquireAutoTOA.llIIIllIlll[17]] = aM.class;
        classArray[SquireAutoTOA.llIIIllIlll[18]] = aN.class;
        classArray[SquireAutoTOA.llIIIllIlll[19]] = aH.class;
        classArray[SquireAutoTOA.llIIIllIlll[20]] = aK.class;
        classArray[SquireAutoTOA.llIIIllIlll[21]] = bZ.class;
        classArray[SquireAutoTOA.llIIIllIlll[22]] = bN.class;
        classArray[SquireAutoTOA.llIIIllIlll[23]] = bP.class;
        classArray[SquireAutoTOA.llIIIllIlll[24]] = bS.class;
        classArray[SquireAutoTOA.llIIIllIlll[25]] = bT.class;
        classArray[SquireAutoTOA.llIIIllIlll[26]] = bU.class;
        classArray[SquireAutoTOA.llIIIllIlll[27]] = bW.class;
        classArray[SquireAutoTOA.llIIIllIlll[28]] = bR.class;
        classArray[SquireAutoTOA.llIIIllIlll[29]] = bO.class;
        classArray[SquireAutoTOA.llIIIllIlll[30]] = bV.class;
        classArray[SquireAutoTOA.llIIIllIlll[31]] = bo.class;
        classArray[SquireAutoTOA.llIIIllIlll[32]] = bq.class;
        classArray[SquireAutoTOA.llIIIllIlll[33]] = br.class;
        classArray[SquireAutoTOA.llIIIllIlll[34]] = bn.class;
        classArray[SquireAutoTOA.llIIIllIlll[35]] = bp.class;
        classArray[SquireAutoTOA.llIIIllIlll[36]] = bu.class;
        classArray[SquireAutoTOA.llIIIllIlll[37]] = bt.class;
        classArray[SquireAutoTOA.llIIIllIlll[38]] = bf.class;
        classArray[SquireAutoTOA.llIIIllIlll[39]] = aZ.class;
        classArray[SquireAutoTOA.llIIIllIlll[40]] = bj.class;
        classArray[SquireAutoTOA.llIIIllIlll[41]] = bc.class;
        classArray[SquireAutoTOA.llIIIllIlll[42]] = bl.class;
        classArray[SquireAutoTOA.llIIIllIlll[43]] = bd.class;
        classArray[SquireAutoTOA.llIIIllIlll[44]] = ba.class;
        classArray[SquireAutoTOA.llIIIllIlll[45]] = bb.class;
        classArray[SquireAutoTOA.llIIIllIlll[46]] = bk.class;
        classArray[SquireAutoTOA.llIIIllIlll[47]] = be.class;
        classArray[SquireAutoTOA.llIIIllIlll[48]] = bg.class;
        classArray[SquireAutoTOA.llIIIllIlll[49]] = aB.class;
        classArray[SquireAutoTOA.llIIIllIlll[50]] = aA.class;
        classArray[SquireAutoTOA.llIIIllIlll[51]] = as.class;
        classArray[SquireAutoTOA.llIIIllIlll[1]] = ar.class;
        classArray[SquireAutoTOA.llIIIllIlll[52]] = at.class;
        classArray[SquireAutoTOA.llIIIllIlll[53]] = av.class;
        classArray[SquireAutoTOA.llIIIllIlll[54]] = aw.class;
        classArray[SquireAutoTOA.llIIIllIlll[55]] = ay.class;
        classArray[SquireAutoTOA.llIIIllIlll[56]] = au.class;
        classArray[SquireAutoTOA.llIIIllIlll[57]] = ax.class;
        classArray[SquireAutoTOA.llIIIllIlll[58]] = U.class;
        classArray[SquireAutoTOA.llIIIllIlll[59]] = cb.class;
        classArray[SquireAutoTOA.llIIIllIlll[60]] = cd.class;
        classArray[SquireAutoTOA.llIIIllIlll[61]] = Y.class;
        classArray[SquireAutoTOA.llIIIllIlll[62]] = aa.class;
        classArray[SquireAutoTOA.llIIIllIlll[63]] = ak.class;
        classArray[SquireAutoTOA.llIIIllIlll[64]] = am.class;
        classArray[SquireAutoTOA.llIIIllIlll[65]] = af.class;
        classArray[SquireAutoTOA.llIIIllIlll[66]] = ae.class;
        classArray[SquireAutoTOA.llIIIllIlll[67]] = ah.class;
        classArray[SquireAutoTOA.llIIIllIlll[68]] = ab.class;
        classArray[SquireAutoTOA.llIIIllIlll[69]] = ad.class;
        classArray[SquireAutoTOA.llIIIllIlll[70]] = aj.class;
        classArray[SquireAutoTOA.llIIIllIlll[71]] = al.class;
        classArray[SquireAutoTOA.llIIIllIlll[72]] = ag.class;
        classArray[SquireAutoTOA.llIIIllIlll[73]] = ac.class;
        classArray[SquireAutoTOA.llIIIllIlll[74]] = bx.class;
        classArray[SquireAutoTOA.llIIIllIlll[75]] = bw.class;
        classArray[SquireAutoTOA.llIIIllIlll[76]] = bv.class;
        classArray[SquireAutoTOA.llIIIllIlll[77]] = aD.class;
        classArray[SquireAutoTOA.llIIIllIlll[78]] = bz.class;
        classArray[SquireAutoTOA.llIIIllIlll[79]] = bA.class;
        classArray[SquireAutoTOA.llIIIllIlll[80]] = bF.class;
        classArray[SquireAutoTOA.llIIIllIlll[81]] = bB.class;
        classArray[SquireAutoTOA.llIIIllIlll[82]] = aE.class;
        classArray[SquireAutoTOA.llIIIllIlll[83]] = bC.class;
        classArray[SquireAutoTOA.llIIIllIlll[84]] = bD.class;
        classArray[SquireAutoTOA.llIIIllIlll[85]] = bE.class;
        classArray[SquireAutoTOA.llIIIllIlll[86]] = bH.class;
        classArray[SquireAutoTOA.llIIIllIlll[87]] = bK.class;
        classArray[SquireAutoTOA.llIIIllIlll[88]] = bL.class;
        classArray[SquireAutoTOA.llIIIllIlll[89]] = aF.class;
        classArray[SquireAutoTOA.llIIIllIlll[90]] = aG.class;
        classArray[SquireAutoTOA.llIIIllIlll[91]] = bJ.class;
        classArray[SquireAutoTOA.llIIIllIlll[92]] = bI.class;
        classArray[SquireAutoTOA.llIIIllIlll[93]] = aY.class;
        classArray[SquireAutoTOA.llIIIllIlll[94]] = cg.class;
        classArray[SquireAutoTOA.llIIIllIlll[95]] = cc.class;
        classArray[SquireAutoTOA.llIIIllIlll[96]] = ai.class;
        classArray[SquireAutoTOA.llIIIllIlll[97]] = cm.class;
        return classArray;
    }

    private static String lIIlllllIIlIII(String var22, String var16) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var28 = Cipher.getInstance("Blowfish");
            var28.init(llIIIllIlll[4], var10);
            return new String(var28.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public boolean g() {
        return this.x;
    }

    public boolean d() {
        return this.u;
    }

    private static void lIIlllllllIlll() {
        llIIIllIlll = new int[134];
        SquireAutoTOA.llIIIllIlll[0] = (124 + 19 - -26 + 20 ^ 121 + 132 - 144 + 32) & (5 ^ 0x54 ^ (0x74 ^ 0x15) ^ -1);
        SquireAutoTOA.llIIIllIlll[1] = 161 + 9 - 107 + 116 ^ 30 + 37 - -34 + 28;
        SquireAutoTOA.llIIIllIlll[2] = 0xA8 ^ 0xB5 ^ (0x53 ^ 0x2F);
        SquireAutoTOA.llIIIllIlll[3] = 1;
        SquireAutoTOA.llIIIllIlll[4] = 2;
        SquireAutoTOA.llIIIllIlll[5] = 3;
        SquireAutoTOA.llIIIllIlll[6] = 0x61 ^ 0x65;
        SquireAutoTOA.llIIIllIlll[7] = 0x3C ^ 0x39;
        SquireAutoTOA.llIIIllIlll[8] = 0xF1 ^ 0xAE ^ (0x44 ^ 0x1D);
        SquireAutoTOA.llIIIllIlll[9] = 0x45 ^ 0x35 ^ (0x71 ^ 6);
        SquireAutoTOA.llIIIllIlll[10] = 0x38 ^ 0x30;
        SquireAutoTOA.llIIIllIlll[11] = 0x7A ^ 0x73;
        SquireAutoTOA.llIIIllIlll[12] = 0x28 ^ 0x22;
        SquireAutoTOA.llIIIllIlll[13] = 0xB4 ^ 0xBF;
        SquireAutoTOA.llIIIllIlll[14] = 0xA5 ^ 0xA9;
        SquireAutoTOA.llIIIllIlll[15] = 0x38 ^ 0x35;
        SquireAutoTOA.llIIIllIlll[16] = 0x81 ^ 0x8F;
        SquireAutoTOA.llIIIllIlll[17] = 109 + 46 - 135 + 118 ^ 13 + 62 - -1 + 57;
        SquireAutoTOA.llIIIllIlll[18] = 154 + 56 - 96 + 69 ^ 74 + 110 - 81 + 64;
        SquireAutoTOA.llIIIllIlll[19] = 138 + 117 - 251 + 148 ^ 68 + 55 - 65 + 79;
        SquireAutoTOA.llIIIllIlll[20] = 20 + 23 - -10 + 136 ^ 98 + 143 - 160 + 94;
        SquireAutoTOA.llIIIllIlll[21] = 3 ^ (0x91 ^ 0x81);
        SquireAutoTOA.llIIIllIlll[22] = 0xA7 ^ 0xB0 ^ 3;
        SquireAutoTOA.llIIIllIlll[23] = 0x7C ^ 1 ^ (0x2D ^ 0x45);
        SquireAutoTOA.llIIIllIlll[24] = 0x7B ^ 0x6D;
        SquireAutoTOA.llIIIllIlll[25] = 0x82 ^ 0x96 ^ 3;
        SquireAutoTOA.llIIIllIlll[26] = 0x1C ^ 4;
        SquireAutoTOA.llIIIllIlll[27] = 0x98 ^ 0x81;
        SquireAutoTOA.llIIIllIlll[28] = 0x15 ^ 0xF;
        SquireAutoTOA.llIIIllIlll[29] = 0xBF ^ 0xA4;
        SquireAutoTOA.llIIIllIlll[30] = 0x37 ^ 0x2B;
        SquireAutoTOA.llIIIllIlll[31] = 0x76 ^ 0xE ^ (0xDF ^ 0xBA);
        SquireAutoTOA.llIIIllIlll[32] = 0x4F ^ 0x51;
        SquireAutoTOA.llIIIllIlll[33] = 0xAF ^ 0xB0;
        SquireAutoTOA.llIIIllIlll[34] = 0x18 ^ 0x38;
        SquireAutoTOA.llIIIllIlll[35] = 0x41 ^ 0x60;
        SquireAutoTOA.llIIIllIlll[36] = 0 ^ 0x1D ^ (0xBA ^ 0x85);
        SquireAutoTOA.llIIIllIlll[37] = 1 ^ 0x21 ^ 3;
        SquireAutoTOA.llIIIllIlll[38] = 11 + 136 - 93 + 136 ^ 145 + 65 - 122 + 66;
        SquireAutoTOA.llIIIllIlll[39] = 0xBF ^ 0x9A;
        SquireAutoTOA.llIIIllIlll[40] = 0xAB ^ 0x8D;
        SquireAutoTOA.llIIIllIlll[41] = 0x26 ^ 0x36 ^ (0x3D ^ 0xA);
        SquireAutoTOA.llIIIllIlll[42] = 0x2F ^ 7;
        SquireAutoTOA.llIIIllIlll[43] = 0x8F ^ 0xA6;
        SquireAutoTOA.llIIIllIlll[44] = 0xBC ^ 0x96;
        SquireAutoTOA.llIIIllIlll[45] = 0x9D ^ 0xB6;
        SquireAutoTOA.llIIIllIlll[46] = 33 + 82 - 19 + 89 ^ 134 + 90 - 93 + 18;
        SquireAutoTOA.llIIIllIlll[47] = 0x7F ^ 0x70 ^ (0x9F ^ 0xBD);
        SquireAutoTOA.llIIIllIlll[48] = 0x68 ^ 0x46;
        SquireAutoTOA.llIIIllIlll[49] = 0x95 ^ 0xBA;
        SquireAutoTOA.llIIIllIlll[50] = 109 + 102 - 120 + 42 ^ 116 + 168 - 122 + 19;
        SquireAutoTOA.llIIIllIlll[51] = 0x88 ^ 0xB9;
        SquireAutoTOA.llIIIllIlll[52] = 0x7F ^ 0x4C;
        SquireAutoTOA.llIIIllIlll[53] = 0x3A ^ 0x2F ^ (0x47 ^ 0x66);
        SquireAutoTOA.llIIIllIlll[54] = 0x75 ^ 0x40;
        SquireAutoTOA.llIIIllIlll[55] = 102 + 98 - 105 + 147 ^ 21 + 150 - -12 + 13;
        SquireAutoTOA.llIIIllIlll[56] = 0x62 ^ 0x55;
        SquireAutoTOA.llIIIllIlll[57] = 0x34 ^ 0xC;
        SquireAutoTOA.llIIIllIlll[58] = 0xB2 ^ 0x8B;
        SquireAutoTOA.llIIIllIlll[59] = 0x1E ^ 0x24;
        SquireAutoTOA.llIIIllIlll[60] = 0x49 ^ 0x72;
        SquireAutoTOA.llIIIllIlll[61] = 0xB9 ^ 0x85;
        SquireAutoTOA.llIIIllIlll[62] = 0xCF ^ 0x9C ^ (0xD4 ^ 0xBA);
        SquireAutoTOA.llIIIllIlll[63] = 0xC9 ^ 0xB4 ^ (0x25 ^ 0x66);
        SquireAutoTOA.llIIIllIlll[64] = 0x92 ^ 0xAD;
        SquireAutoTOA.llIIIllIlll[65] = 0xF7 ^ 0xB7;
        SquireAutoTOA.llIIIllIlll[66] = 24 + 16 - -31 + 64 ^ 15 + 117 - 62 + 128;
        SquireAutoTOA.llIIIllIlll[67] = 229 + 46 - 204 + 166 ^ 16 + 141 - 70 + 88;
        SquireAutoTOA.llIIIllIlll[68] = 0x2E ^ 0x47 ^ (0x67 ^ 0x4D);
        SquireAutoTOA.llIIIllIlll[69] = 0xFB ^ 0xBF;
        SquireAutoTOA.llIIIllIlll[70] = 0x28 ^ 0x32 ^ (0x5A ^ 5);
        SquireAutoTOA.llIIIllIlll[71] = 0x68 ^ 0x6C ^ (0x5D ^ 0x1F);
        SquireAutoTOA.llIIIllIlll[72] = 0xDF ^ 0x98;
        SquireAutoTOA.llIIIllIlll[73] = 0x28 ^ 9 ^ (0x51 ^ 0x38);
        SquireAutoTOA.llIIIllIlll[74] = 0x4C ^ 0x25 ^ (0xE1 ^ 0xC1);
        SquireAutoTOA.llIIIllIlll[75] = 0x44 ^ 0x36 ^ (0x29 ^ 0x11);
        SquireAutoTOA.llIIIllIlll[76] = 0xEE ^ 0x99 ^ (0xB6 ^ 0x8A);
        SquireAutoTOA.llIIIllIlll[77] = 88 + 194 - 149 + 100 ^ 157 + 3 - 5 + 10;
        SquireAutoTOA.llIIIllIlll[78] = 0x44 ^ 0x30 ^ (0xB0 ^ 0x89);
        SquireAutoTOA.llIIIllIlll[79] = 86 + 9 - -38 + 4 ^ 37 + 117 - 127 + 172;
        SquireAutoTOA.llIIIllIlll[80] = 0x67 ^ 0x28;
        SquireAutoTOA.llIIIllIlll[81] = 0x62 ^ 0x32;
        SquireAutoTOA.llIIIllIlll[82] = 0x32 ^ 0x63;
        SquireAutoTOA.llIIIllIlll[83] = 0x38 ^ 0x33 ^ (5 ^ 0x5C);
        SquireAutoTOA.llIIIllIlll[84] = 76 + 141 - 48 + 32 ^ 31 + 121 - 69 + 71;
        SquireAutoTOA.llIIIllIlll[85] = 0x4B ^ 0x78 ^ (0xA7 ^ 0xC0);
        SquireAutoTOA.llIIIllIlll[86] = 0xCA ^ 0x9F;
        SquireAutoTOA.llIIIllIlll[87] = 0xCB ^ 0xAE ^ (6 ^ 0x35);
        SquireAutoTOA.llIIIllIlll[88] = 0x2C ^ 0x7B;
        SquireAutoTOA.llIIIllIlll[89] = 0x2D ^ 6 ^ (0xFC ^ 0x8F);
        SquireAutoTOA.llIIIllIlll[90] = 0xE5 ^ 0x86 ^ (0x2E ^ 0x14);
        SquireAutoTOA.llIIIllIlll[91] = 0xF3 ^ 0xA9;
        SquireAutoTOA.llIIIllIlll[92] = 0x5C ^ 0x2F ^ (0x15 ^ 0x3D);
        SquireAutoTOA.llIIIllIlll[93] = 148 + 185 - 154 + 31 ^ 30 + 35 - -26 + 51;
        SquireAutoTOA.llIIIllIlll[94] = 0xEB ^ 0xB6 ^ (0x95 ^ 0x86) & ~(0x4E ^ 0x5D);
        SquireAutoTOA.llIIIllIlll[95] = 0x7F ^ 0x21;
        SquireAutoTOA.llIIIllIlll[96] = 0x50 ^ 0x7C ^ (0x45 ^ 0x36);
        SquireAutoTOA.llIIIllIlll[97] = 0x68 ^ 0x63 ^ (0x38 ^ 0x53);
        SquireAutoTOA.llIIIllIlll[98] = 0xFFFFEFB3 & 0x16DF;
        SquireAutoTOA.llIIIllIlll[99] = -(0xA9 ^ 0xB8) & (0xFFFFFC7E & 0x3BBD);
        SquireAutoTOA.llIIIllIlll[100] = -(0xFFFFADAF & 0x767D) & (0xFFFFBFAF & 0x6EFE);
        SquireAutoTOA.llIIIllIlll[101] = -(0xFFFFBD7E & 0x73FF) & (0xFFFFFBFD & 0x3FFF);
        SquireAutoTOA.llIIIllIlll[102] = 0xFFFFBFF9 & 0x4A6E;
        SquireAutoTOA.llIIIllIlll[103] = -(0xFFFFAFFF & 0x7583) & (0xFFFFFFFF & 0x2FFF);
        SquireAutoTOA.llIIIllIlll[104] = 0xFFFF9EEE & 0x6B7F;
        SquireAutoTOA.llIIIllIlll[105] = -(0xFFFF95C3 & 0x7FBD) & (0xFFFFDFFF & 0x3FFC);
        SquireAutoTOA.llIIIllIlll[106] = -(0xFFFFC97F & 0x76D3) & (0xFFFFCBF3 & 0x7EDF);
        SquireAutoTOA.llIIIllIlll[107] = -(0xFFFFFB17 & 0x35EA) & (0xFFFFBFE7 & 0x7B7F);
        SquireAutoTOA.llIIIllIlll[108] = 0xFFFFCEF7 & 0x3B7F;
        SquireAutoTOA.llIIIllIlll[109] = -(0xFFFFFDEF & 0x6291) & (0xFFFFEBF7 & 0x7EFE);
        SquireAutoTOA.llIIIllIlll[110] = -(0xFFFF98DE & 0x7723) & (0xFFFFDFFF & 0x37BF);
        SquireAutoTOA.llIIIllIlll[111] = -(0xFFFFB4B9 & 0x6BD7) & (0xFFFFBFFB & 0x6AFE);
        SquireAutoTOA.llIIIllIlll[112] = -(0xFFFFFC7B & 0x3796) & (0xFFFFBFFF & 0x7E7D);
        SquireAutoTOA.llIIIllIlll[113] = 0xFFFFEB7F & 0x1EFF;
        SquireAutoTOA.llIIIllIlll[114] = -(0xFFFFF5B3 & 0x7B6D) & (0xFFFFFFBB & 0x7BE7);
        SquireAutoTOA.llIIIllIlll[115] = 0xFFFF9AEB & 0x6F7F;
        SquireAutoTOA.llIIIllIlll[116] = 0xFFFFCFF3 & 0x3A7F;
        SquireAutoTOA.llIIIllIlll[117] = -(0xFFFFAB53 & 0x75AF) & (0xFFFFBFF7 & 0x6B7F);
        SquireAutoTOA.llIIIllIlll[118] = 0xFFFFBB75 & 0x4EFE;
        SquireAutoTOA.llIIIllIlll[119] = -(0xFFFFD12F & 0x7ED5) & (0xFFFFFA7D & 0x5FEF);
        SquireAutoTOA.llIIIllIlll[120] = -(0xFFFFD59B & 0x3E77) & (0xFFFFBEFF & 0x5F7F);
        SquireAutoTOA.llIIIllIlll[121] = 0xFFFFFAFF & 0xF7A;
        SquireAutoTOA.llIIIllIlll[122] = -(0xFFFFFBB7 & 0x544D) & (0xFFFFFAFE & 0x5F7D);
        SquireAutoTOA.llIIIllIlll[123] = 0xFFFFBFFE & 0x4A7F;
        SquireAutoTOA.llIIIllIlll[124] = 0xFFFF8EFB & 0x7FF6;
        SquireAutoTOA.llIIIllIlll[125] = 0xFFFFAEF7 & 0x5FF9;
        SquireAutoTOA.llIIIllIlll[126] = -(0xFFFFF4F5 & 0x6F1B) & (0xFFFFEFF7 & 0x7E7F);
        SquireAutoTOA.llIIIllIlll[127] = 0xFFFFFFEF & 0x667B;
        SquireAutoTOA.llIIIllIlll[128] = -(0xFFFFB309 & 0x4EFF) & (0xFFFFFF7F & 0x67FF);
        SquireAutoTOA.llIIIllIlll[129] = -(0xFFFF9D7B & 0x73A7) & (0xFFFFFBFF & 0x7FAF);
        SquireAutoTOA.llIIIllIlll[130] = 0xFFFFEFB1 & 0x75CF;
        SquireAutoTOA.llIIIllIlll[131] = -(0xFFFF9DC7 & 0x773F) & (0xFFFFFFF6 & 0x7F6F);
        SquireAutoTOA.llIIIllIlll[132] = -(0xFFFFF7E7 & 0x191B) & (0xFFFFFBDF & 0x7F7F);
        SquireAutoTOA.llIIIllIlll[133] = -(0x97 ^ 0xB6) & (0xFFFFEAFB & 0x7F7E);
    }

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig)configManager.getConfig(TOAConfig.class);
    }

    private static boolean lIIllllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    public void c() {
        this.a(llIIIllIlll[32]);
        this.c(llIIIllIlll[0]);
    }

    static {
        SquireAutoTOA.lIIlllllllIlll();
        SquireAutoTOA.lIIlllllIIlIll();
        Object[] objectArray = new Integer[llIIIllIlll[23]];
        objectArray[SquireAutoTOA.llIIIllIlll[0]] = llIIIllIlll[106];
        objectArray[SquireAutoTOA.llIIIllIlll[3]] = llIIIllIlll[107];
        objectArray[SquireAutoTOA.llIIIllIlll[4]] = llIIIllIlll[108];
        objectArray[SquireAutoTOA.llIIIllIlll[5]] = llIIIllIlll[109];
        objectArray[SquireAutoTOA.llIIIllIlll[6]] = llIIIllIlll[110];
        objectArray[SquireAutoTOA.llIIIllIlll[7]] = llIIIllIlll[111];
        objectArray[SquireAutoTOA.llIIIllIlll[8]] = llIIIllIlll[112];
        objectArray[SquireAutoTOA.llIIIllIlll[9]] = llIIIllIlll[113];
        objectArray[SquireAutoTOA.llIIIllIlll[10]] = llIIIllIlll[114];
        objectArray[SquireAutoTOA.llIIIllIlll[11]] = llIIIllIlll[115];
        objectArray[SquireAutoTOA.llIIIllIlll[12]] = llIIIllIlll[116];
        objectArray[SquireAutoTOA.llIIIllIlll[13]] = llIIIllIlll[117];
        objectArray[SquireAutoTOA.llIIIllIlll[14]] = llIIIllIlll[118];
        objectArray[SquireAutoTOA.llIIIllIlll[15]] = llIIIllIlll[119];
        objectArray[SquireAutoTOA.llIIIllIlll[16]] = llIIIllIlll[120];
        objectArray[SquireAutoTOA.llIIIllIlll[17]] = llIIIllIlll[121];
        objectArray[SquireAutoTOA.llIIIllIlll[18]] = llIIIllIlll[122];
        objectArray[SquireAutoTOA.llIIIllIlll[19]] = llIIIllIlll[123];
        objectArray[SquireAutoTOA.llIIIllIlll[20]] = llIIIllIlll[124];
        objectArray[SquireAutoTOA.llIIIllIlll[21]] = llIIIllIlll[125];
        objectArray[SquireAutoTOA.llIIIllIlll[22]] = llIIIllIlll[126];
        a = ImmutableSet.of((Object)llIIIllIlll[100], (Object)llIIIllIlll[101], (Object)llIIIllIlll[102], (Object)llIIIllIlll[103], (Object)llIIIllIlll[104], (Object)llIIIllIlll[105], (Object[])objectArray);
        Object[] objectArray2 = new Integer[llIIIllIlll[3]];
        objectArray2[SquireAutoTOA.llIIIllIlll[0]] = llIIIllIlll[133];
        b = ImmutableSet.of((Object)llIIIllIlll[127], (Object)llIIIllIlll[128], (Object)llIIIllIlll[129], (Object)llIIIllIlll[130], (Object)llIIIllIlll[131], (Object)llIIIllIlll[132], (Object[])objectArray2);
    }

    public int k() {
        return this.B;
    }

    public int j() {
        return this.A;
    }

    public boolean e() {
        return this.v;
    }

    public void b(boolean bl2) {
        this.v = bl2;
    }

    protected void onStart() {
        try {
            SquireAutoTOA var25;
            var25.v = llIIIllIlll[0];
            var25.u = llIIIllIlll[0];
            var25.x = llIIIllIlll[0];
            var25.z = llIIIllIlll[0];
            var25.B = llIIIllIlll[0];
            var25.A = llIIIllIlll[0];
            var25.f.w();
            var25.i.w();
            var25.g.w();
            var25.j.register((Object)var25.f);
            var25.j.register((Object)var25.g);
            var25.j.register((Object)var25.h);
            var25.j.register((Object)var25.i);
            var25.j.register((Object)var25.t);
            var25.j.register((Object)var25.e);
            var25.k.add((Overlay)var25.l);
            0;
            var25.k.add((Overlay)var25.m);
            0;
            var25.k.add((Overlay)var25.n);
            0;
            var25.k.add((Overlay)var25.o);
            0;
            var25.k.add((Overlay)var25.p);
            0;
            var25.k.add((Overlay)var25.q);
            0;
            var25.k.add((Overlay)var25.r);
            0;
            var25.k.add((Overlay)var25.s);
            0;
            0;
        }
        catch (Exception var17) {
            var17.printStackTrace();
        }
        if (-1 >= 0) {
            return;
        }
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireAutoTOA.lIIllllllllIlI(lootReceived.getName().contains(llIIIllIllI[llIIIllIlll[5]]) ? 1 : 0)) {
            return;
        }
        int n2 = Static.getClient().getVarbitValue(llIIIllIlll[99]);
        Collection collection = lootReceived.getItems();
        ItemStack itemStack2 = collection.stream().filter(itemStack -> b.contains(itemStack.getId())).findFirst().orElse(null);
        D.a(itemStack2, collection, String.valueOf(n2), this.d.anonymize());
    }

    protected void onStop() {
        this.j.unregister((Object)this.f);
        this.j.unregister((Object)this.g);
        this.j.unregister((Object)this.h);
        this.j.unregister((Object)this.i);
        this.j.unregister((Object)this.t);
        this.j.unregister((Object)this.e);
        this.k.remove((Overlay)this.l);
        0;
        this.k.remove((Overlay)this.m);
        0;
        this.k.remove((Overlay)this.n);
        0;
        this.k.remove((Overlay)this.o);
        0;
        this.k.remove((Overlay)this.p);
        0;
        this.k.remove((Overlay)this.q);
        0;
        this.k.remove((Overlay)this.r);
        0;
        this.k.remove((Overlay)this.s);
        0;
    }
}

