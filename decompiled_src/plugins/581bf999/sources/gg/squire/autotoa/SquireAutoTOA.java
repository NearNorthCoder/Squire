package gg.squire.autotoa;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0001aa;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0002ab;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0003ac;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0004ad;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0005ae;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0006af;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0007ag;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0008ah;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0009ai;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0010aj;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0011ak;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0012al;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0013am;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0014an;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0018ar;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0019as;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0020at;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0021au;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0022av;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0023aw;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0024ax;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0025ay;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0028ba;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0029bb;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0030bc;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0031bd;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0032be;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0033bf;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0034bg;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0037bj;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0038bk;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0039bl;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0041bn;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0042bo;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0043bp;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0044bq;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0045br;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0047bt;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0048bu;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0049bv;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0050bw;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0051bx;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0053bz;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0060i;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0061j;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0064m;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0067p;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.C0076y;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.D;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.M;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.N;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.O;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.P;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.Q;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.R;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.T;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.U;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.Y;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aA;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aB;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aD;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aE;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aF;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aG;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aH;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aJ;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aK;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aL;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aM;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aN;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aO;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aP;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aQ;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aR;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aU;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aX;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aY;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aZ;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bA;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bB;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bC;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bD;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bE;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bF;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bH;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bI;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bJ;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bK;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bL;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bN;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bO;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bP;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bR;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bS;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bT;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bU;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bV;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bW;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bZ;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cb;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cc;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cd;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ce;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cf;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cg;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ch;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ci;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cj;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cl;
import q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.cm;
@PluginDescriptor(name = "Squire Auto TOA", description = "Different helpers/automation for TOA", enabledByDefault = false)
@SquireUtil
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:gg/squire/autotoa/SquireAutoTOA.class */
public class SquireAutoTOA extends SquirePlugin {
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

    /* renamed from: q  reason: collision with root package name */
    private /* synthetic */ O f1q;
    @Inject
    private /* synthetic */ OverlayManager k;
    private static /* synthetic */ String[] llIIIllIllI;
    @Inject
    private /* synthetic */ T s;
    @Inject
    private /* synthetic */ ConfigManager c;
    private static final /* synthetic */ Set<Integer> a;
    @Inject
    private /* synthetic */ M m;
    @Inject
    private /* synthetic */ P o;
    @Inject
    private /* synthetic */ C0064m f;
    @Inject
    private /* synthetic */ TOAConfig d;
    @Inject
    private /* synthetic */ C0060i i;
    private static /* synthetic */ int[] llIIIllIlll;
    @Inject
    private /* synthetic */ C0061j h;
    @Inject
    private /* synthetic */ EventBus j;
    @Inject
    private /* synthetic */ C0067p g;
    @Inject
    private /* synthetic */ C0076y e;
    @Inject
    private /* synthetic */ R n;
    private /* synthetic */ boolean u = llIIIllIlll[0];
    private /* synthetic */ boolean v = llIIIllIlll[0];
    private /* synthetic */ int w = llIIIllIlll[1];
    private /* synthetic */ boolean x = llIIIllIlll[0];
    private /* synthetic */ int y = llIIIllIlll[0];
    private /* synthetic */ int z = llIIIllIlll[0];
    private /* synthetic */ int A = llIIIllIlll[0];
    private /* synthetic */ int B = llIIIllIlll[0];

    public NPC b() {
        int[] iArr = new int[llIIIllIlll[3]];
        iArr[llIIIllIlll[0]] = a();
        return NPCs.getNearest(iArr);
    }

    public void a(boolean z) {
        this.u = z;
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (lIIllllllllIII(a.contains(Integer.valueOf(soundEffectPlayed.getSoundId())) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    public void c(boolean z) {
        this.x = z;
    }

    public void b(int i) {
        this.y = i;
    }

    public int h() {
        return this.y;
    }

    public boolean a(int... iArr) {
        return a(npc -> {
            int length = iArr.length;
            int i = llIIIllIlll[0];
            while (lIIllllllllIll(i, length)) {
                int llllllllllllllllIlIIIIlIIIIlIIll = iArr[i];
                if (lIIlllllllllII(llllllllllllllllIlIIIIlIIIIlIIll, npc.getId())) {
                    return llIIIllIlll[3];
                }
                i++;
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((((66 + 133) - 196) + 139) ^ (((1 + 62) - (-90)) + 40)) & (((137 ^ 185) ^ (((6 + 69) - (-34)) + 18)) ^ (-" ".length()));
                }
            }
            return llIIIllIlll[0];
        });
    }

    private static boolean lIIllllllllIlI(int i) {
        return i == 0;
    }

    public int i() {
        return this.z;
    }

    public void a(int i) {
        this.w = i;
    }

    private static String lIIlllllIIlIlI(String llllllllllllllllIlIIIIIllllIIIlI, String llllllllllllllllIlIIIIIllllIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIllllIIIll.getBytes(StandardCharsets.UTF_8)), llIIIllIlll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIllllIIlIl) {
            llllllllllllllllIlIIIIIllllIIlIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIllllllllIII(chatMessage.getMessage().startsWith(llIIIllIllI[llIIIllIlll[0]]) ? 1 : 0)) {
            this.z += llIIIllIlll[3];
            this.B = llIIIllIlll[0];
        }
        if (lIIllllllllIII(chatMessage.getMessage().contains(llIIIllIllI[llIIIllIlll[3]]) ? 1 : 0)) {
            this.A += llIIIllIlll[3];
            this.B = llIIIllIlll[0];
        }
        if (lIIllllllllIII(chatMessage.getMessage().contains(llIIIllIllI[llIIIllIlll[4]]) ? 1 : 0)) {
            this.B += llIIIllIlll[3];
        }
    }

    public int a() {
        return Vars.getVarp(llIIIllIlll[98]);
    }

    private static boolean lIIlllllllllII(int i, int i2) {
        return i == i2;
    }

    private static void lIIlllllIIlIll() {
        llIIIllIllI = new String[llIIIllIlll[6]];
        llIIIllIllI[llIIIllIlll[0]] = lIIlllllIIlIII("ddmadRdPEgbM4oUgrLbHe7bLpLZ4489StCtKNkFh1ec=", "fhKOA");
        llIIIllIllI[llIIIllIlll[3]] = lIIlllllIIlIII("alr6kMfPrl+SB/6acWoSEdznZNJR4eUg", "GnoNW");
        llIIIllIllI[llIIIllIlll[4]] = lIIlllllIIlIIl("IyE3dS8bOCd1IxMrJg==", "zNBUG");
        llIIIllIllI[llIIIllIlll[5]] = lIIlllllIIlIlI("6iesftHNy8g=", "KqNyF");
    }

    private static boolean lIIllllllllIII(int i) {
        return i != 0;
    }

    private static boolean lIIllllllllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a(Predicate<NPC> predicate) {
        NPC b2 = b();
        if (lIIllllllllIIl(b2) && lIIllllllllIII(predicate.and(npc -> {
            if (lIIllllllllIlI(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIIllIlll[3];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIllIlll[0];
        }).test(b2) ? 1 : 0)) {
            ?? r0 = llIIIllIlll[3];
            "".length();
            return (-"   ".length()) > 0 ? ((((50 + 45) - (-4)) + 29) ^ (((81 + 80) - 21) + 57)) & (((42 ^ 119) ^ (60 ^ 36)) ^ (-" ".length())) : r0;
        }
        return llIIIllIlll[0];
    }

    public int f() {
        return this.w;
    }

    private static String lIIlllllIIlIIl(String llllllllllllllllIlIIIIlIIIIIIllI, String llllllllllllllllIlIIIIlIIIIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIlIIIIIIlII = new StringBuilder();
        char[] llllllllllllllllIlIIIIlIIIIIIIll = llllllllllllllllIlIIIIlIIIIIIlIl.toCharArray();
        int llllllllllllllllIlIIIIlIIIIIIIlI = llIIIllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIlll[0];
        while (lIIllllllllIll(i, length)) {
            char llllllllllllllllIlIIIIlIIIIIIlll = charArray[i];
            llllllllllllllllIlIIIIlIIIIIIlII.append((char) (llllllllllllllllIlIIIIlIIIIIIlll ^ llllllllllllllllIlIIIIlIIIIIIIll[llllllllllllllllIlIIIIlIIIIIIIlI % llllllllllllllllIlIIIIlIIIIIIIll.length]));
            "".length();
            llllllllllllllllIlIIIIlIIIIIIIlI++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIIIlIIIIIIlII);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIIllIlll[2]];
        clsArr[llIIIllIlll[0]] = cf.class;
        clsArr[llIIIllIlll[3]] = ce.class;
        clsArr[llIIIllIlll[4]] = ch.class;
        clsArr[llIIIllIlll[5]] = ci.class;
        clsArr[llIIIllIlll[6]] = cj.class;
        clsArr[llIIIllIlll[7]] = cl.class;
        clsArr[llIIIllIlll[8]] = C0014an.class;
        clsArr[llIIIllIlll[9]] = aU.class;
        clsArr[llIIIllIlll[10]] = aQ.class;
        clsArr[llIIIllIlll[11]] = aX.class;
        clsArr[llIIIllIlll[12]] = aR.class;
        clsArr[llIIIllIlll[13]] = aJ.class;
        clsArr[llIIIllIlll[14]] = aP.class;
        clsArr[llIIIllIlll[15]] = aO.class;
        clsArr[llIIIllIlll[16]] = aL.class;
        clsArr[llIIIllIlll[17]] = aM.class;
        clsArr[llIIIllIlll[18]] = aN.class;
        clsArr[llIIIllIlll[19]] = aH.class;
        clsArr[llIIIllIlll[20]] = aK.class;
        clsArr[llIIIllIlll[21]] = bZ.class;
        clsArr[llIIIllIlll[22]] = bN.class;
        clsArr[llIIIllIlll[23]] = bP.class;
        clsArr[llIIIllIlll[24]] = bS.class;
        clsArr[llIIIllIlll[25]] = bT.class;
        clsArr[llIIIllIlll[26]] = bU.class;
        clsArr[llIIIllIlll[27]] = bW.class;
        clsArr[llIIIllIlll[28]] = bR.class;
        clsArr[llIIIllIlll[29]] = bO.class;
        clsArr[llIIIllIlll[30]] = bV.class;
        clsArr[llIIIllIlll[31]] = C0042bo.class;
        clsArr[llIIIllIlll[32]] = C0044bq.class;
        clsArr[llIIIllIlll[33]] = C0045br.class;
        clsArr[llIIIllIlll[34]] = C0041bn.class;
        clsArr[llIIIllIlll[35]] = C0043bp.class;
        clsArr[llIIIllIlll[36]] = C0048bu.class;
        clsArr[llIIIllIlll[37]] = C0047bt.class;
        clsArr[llIIIllIlll[38]] = C0033bf.class;
        clsArr[llIIIllIlll[39]] = aZ.class;
        clsArr[llIIIllIlll[40]] = C0037bj.class;
        clsArr[llIIIllIlll[41]] = C0030bc.class;
        clsArr[llIIIllIlll[42]] = C0039bl.class;
        clsArr[llIIIllIlll[43]] = C0031bd.class;
        clsArr[llIIIllIlll[44]] = C0028ba.class;
        clsArr[llIIIllIlll[45]] = C0029bb.class;
        clsArr[llIIIllIlll[46]] = C0038bk.class;
        clsArr[llIIIllIlll[47]] = C0032be.class;
        clsArr[llIIIllIlll[48]] = C0034bg.class;
        clsArr[llIIIllIlll[49]] = aB.class;
        clsArr[llIIIllIlll[50]] = aA.class;
        clsArr[llIIIllIlll[51]] = C0019as.class;
        clsArr[llIIIllIlll[1]] = C0018ar.class;
        clsArr[llIIIllIlll[52]] = C0020at.class;
        clsArr[llIIIllIlll[53]] = C0022av.class;
        clsArr[llIIIllIlll[54]] = C0023aw.class;
        clsArr[llIIIllIlll[55]] = C0025ay.class;
        clsArr[llIIIllIlll[56]] = C0021au.class;
        clsArr[llIIIllIlll[57]] = C0024ax.class;
        clsArr[llIIIllIlll[58]] = U.class;
        clsArr[llIIIllIlll[59]] = cb.class;
        clsArr[llIIIllIlll[60]] = cd.class;
        clsArr[llIIIllIlll[61]] = Y.class;
        clsArr[llIIIllIlll[62]] = C0001aa.class;
        clsArr[llIIIllIlll[63]] = C0011ak.class;
        clsArr[llIIIllIlll[64]] = C0013am.class;
        clsArr[llIIIllIlll[65]] = C0006af.class;
        clsArr[llIIIllIlll[66]] = C0005ae.class;
        clsArr[llIIIllIlll[67]] = C0008ah.class;
        clsArr[llIIIllIlll[68]] = C0002ab.class;
        clsArr[llIIIllIlll[69]] = C0004ad.class;
        clsArr[llIIIllIlll[70]] = C0010aj.class;
        clsArr[llIIIllIlll[71]] = C0012al.class;
        clsArr[llIIIllIlll[72]] = C0007ag.class;
        clsArr[llIIIllIlll[73]] = C0003ac.class;
        clsArr[llIIIllIlll[74]] = C0051bx.class;
        clsArr[llIIIllIlll[75]] = C0050bw.class;
        clsArr[llIIIllIlll[76]] = C0049bv.class;
        clsArr[llIIIllIlll[77]] = aD.class;
        clsArr[llIIIllIlll[78]] = C0053bz.class;
        clsArr[llIIIllIlll[79]] = bA.class;
        clsArr[llIIIllIlll[80]] = bF.class;
        clsArr[llIIIllIlll[81]] = bB.class;
        clsArr[llIIIllIlll[82]] = aE.class;
        clsArr[llIIIllIlll[83]] = bC.class;
        clsArr[llIIIllIlll[84]] = bD.class;
        clsArr[llIIIllIlll[85]] = bE.class;
        clsArr[llIIIllIlll[86]] = bH.class;
        clsArr[llIIIllIlll[87]] = bK.class;
        clsArr[llIIIllIlll[88]] = bL.class;
        clsArr[llIIIllIlll[89]] = aF.class;
        clsArr[llIIIllIlll[90]] = aG.class;
        clsArr[llIIIllIlll[91]] = bJ.class;
        clsArr[llIIIllIlll[92]] = bI.class;
        clsArr[llIIIllIlll[93]] = aY.class;
        clsArr[llIIIllIlll[94]] = cg.class;
        clsArr[llIIIllIlll[95]] = cc.class;
        clsArr[llIIIllIlll[96]] = C0009ai.class;
        clsArr[llIIIllIlll[97]] = cm.class;
        return clsArr;
    }

    private static String lIIlllllIIlIII(String llllllllllllllllIlIIIIIlllllIIIl, String llllllllllllllllIlIIIIIlllllIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIlllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIlllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIlll[4], llllllllllllllllIlIIIIIlllllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIIlllllIIlI) {
            llllllllllllllllIlIIIIIlllllIIlI.printStackTrace();
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
        llIIIllIlll[0] = ((((124 + 19) - (-26)) + 20) ^ (((121 + 132) - 144) + 32)) & (((5 ^ 84) ^ (116 ^ 21)) ^ (-" ".length()));
        llIIIllIlll[1] = (((161 + 9) - 107) + 116) ^ (((30 + 37) - (-34)) + 28);
        llIIIllIlll[2] = (168 ^ 181) ^ (83 ^ 47);
        llIIIllIlll[3] = " ".length();
        llIIIllIlll[4] = "  ".length();
        llIIIllIlll[5] = "   ".length();
        llIIIllIlll[6] = 97 ^ 101;
        llIIIllIlll[7] = 60 ^ 57;
        llIIIllIlll[8] = (241 ^ 174) ^ (68 ^ 29);
        llIIIllIlll[9] = (69 ^ 53) ^ (113 ^ 6);
        llIIIllIlll[10] = 56 ^ 48;
        llIIIllIlll[11] = 122 ^ 115;
        llIIIllIlll[12] = 40 ^ 34;
        llIIIllIlll[13] = 180 ^ 191;
        llIIIllIlll[14] = 165 ^ 169;
        llIIIllIlll[15] = 56 ^ 53;
        llIIIllIlll[16] = 129 ^ 143;
        llIIIllIlll[17] = (((109 + 46) - 135) + 118) ^ (((13 + 62) - (-1)) + 57);
        llIIIllIlll[18] = (((154 + 56) - 96) + 69) ^ (((74 + 110) - 81) + 64);
        llIIIllIlll[19] = (((138 + 117) - 251) + 148) ^ (((68 + 55) - 65) + 79);
        llIIIllIlll[20] = (((20 + 23) - (-10)) + 136) ^ (((98 + 143) - 160) + 94);
        llIIIllIlll[21] = "   ".length() ^ (145 ^ 129);
        llIIIllIlll[22] = (167 ^ 176) ^ "   ".length();
        llIIIllIlll[23] = (124 ^ 1) ^ (45 ^ 69);
        llIIIllIlll[24] = 123 ^ 109;
        llIIIllIlll[25] = (130 ^ 150) ^ "   ".length();
        llIIIllIlll[26] = 28 ^ 4;
        llIIIllIlll[27] = 152 ^ 129;
        llIIIllIlll[28] = 21 ^ 15;
        llIIIllIlll[29] = 191 ^ 164;
        llIIIllIlll[30] = 55 ^ 43;
        llIIIllIlll[31] = (118 ^ 14) ^ (223 ^ 186);
        llIIIllIlll[32] = 79 ^ 81;
        llIIIllIlll[33] = 175 ^ 176;
        llIIIllIlll[34] = 24 ^ 56;
        llIIIllIlll[35] = 65 ^ 96;
        llIIIllIlll[36] = (0 ^ 29) ^ (186 ^ 133);
        llIIIllIlll[37] = (1 ^ 33) ^ "   ".length();
        llIIIllIlll[38] = (((11 + 136) - 93) + 136) ^ (((145 + 65) - 122) + 66);
        llIIIllIlll[39] = 191 ^ 154;
        llIIIllIlll[40] = 171 ^ 141;
        llIIIllIlll[41] = (38 ^ 54) ^ (61 ^ 10);
        llIIIllIlll[42] = 47 ^ 7;
        llIIIllIlll[43] = 143 ^ 166;
        llIIIllIlll[44] = 188 ^ 150;
        llIIIllIlll[45] = 157 ^ 182;
        llIIIllIlll[46] = (((33 + 82) - 19) + 89) ^ (((134 + 90) - 93) + 18);
        llIIIllIlll[47] = (127 ^ 112) ^ (159 ^ 189);
        llIIIllIlll[48] = 104 ^ 70;
        llIIIllIlll[49] = 149 ^ 186;
        llIIIllIlll[50] = (((109 + 102) - 120) + 42) ^ (((116 + 168) - 122) + 19);
        llIIIllIlll[51] = 136 ^ 185;
        llIIIllIlll[52] = 127 ^ 76;
        llIIIllIlll[53] = (58 ^ 47) ^ (71 ^ 102);
        llIIIllIlll[54] = 117 ^ 64;
        llIIIllIlll[55] = (((102 + 98) - 105) + 147) ^ (((21 + 150) - (-12)) + 13);
        llIIIllIlll[56] = 98 ^ 85;
        llIIIllIlll[57] = 52 ^ 12;
        llIIIllIlll[58] = 178 ^ 139;
        llIIIllIlll[59] = 30 ^ 36;
        llIIIllIlll[60] = 73 ^ 114;
        llIIIllIlll[61] = 185 ^ 133;
        llIIIllIlll[62] = (207 ^ 156) ^ (212 ^ 186);
        llIIIllIlll[63] = (201 ^ 180) ^ (37 ^ 102);
        llIIIllIlll[64] = 146 ^ 173;
        llIIIllIlll[65] = 247 ^ 183;
        llIIIllIlll[66] = (((24 + 16) - (-31)) + 64) ^ (((15 + 117) - 62) + 128);
        llIIIllIlll[67] = (((229 + 46) - 204) + 166) ^ (((16 + 141) - 70) + 88);
        llIIIllIlll[68] = (46 ^ 71) ^ (103 ^ 77);
        llIIIllIlll[69] = 251 ^ 191;
        llIIIllIlll[70] = (40 ^ 50) ^ (90 ^ 5);
        llIIIllIlll[71] = (104 ^ 108) ^ (93 ^ 31);
        llIIIllIlll[72] = 223 ^ 152;
        llIIIllIlll[73] = (40 ^ 9) ^ (81 ^ 56);
        llIIIllIlll[74] = (76 ^ 37) ^ (225 ^ 193);
        llIIIllIlll[75] = (68 ^ 54) ^ (41 ^ 17);
        llIIIllIlll[76] = (238 ^ 153) ^ (182 ^ 138);
        llIIIllIlll[77] = (((88 + 194) - 149) + 100) ^ (((157 + 3) - 5) + 10);
        llIIIllIlll[78] = (68 ^ 48) ^ (176 ^ 137);
        llIIIllIlll[79] = (((86 + 9) - (-38)) + 4) ^ (((37 + 117) - 127) + 172);
        llIIIllIlll[80] = 103 ^ 40;
        llIIIllIlll[81] = 98 ^ 50;
        llIIIllIlll[82] = 50 ^ 99;
        llIIIllIlll[83] = (56 ^ 51) ^ (5 ^ 92);
        llIIIllIlll[84] = (((76 + 141) - 48) + 32) ^ (((31 + 121) - 69) + 71);
        llIIIllIlll[85] = (75 ^ 120) ^ (167 ^ 192);
        llIIIllIlll[86] = 202 ^ 159;
        llIIIllIlll[87] = (203 ^ 174) ^ (6 ^ 53);
        llIIIllIlll[88] = 44 ^ 123;
        llIIIllIlll[89] = (45 ^ 6) ^ (252 ^ 143);
        llIIIllIlll[90] = (229 ^ 134) ^ (46 ^ 20);
        llIIIllIlll[91] = 243 ^ 169;
        llIIIllIlll[92] = (92 ^ 47) ^ (21 ^ 61);
        llIIIllIlll[93] = (((148 + 185) - 154) + 31) ^ (((30 + 35) - (-26)) + 51);
        llIIIllIlll[94] = (235 ^ 182) ^ ((149 ^ 134) & ((78 ^ 93) ^ (-1)));
        llIIIllIlll[95] = 127 ^ 33;
        llIIIllIlll[96] = (80 ^ 124) ^ (69 ^ 54);
        llIIIllIlll[97] = (104 ^ 99) ^ (56 ^ 83);
        llIIIllIlll[98] = (-4173) & 5855;
        llIIIllIlll[99] = (-(169 ^ 184)) & (-898) & 15293;
        llIIIllIlll[100] = (-((-21073) & 30333)) & (-16465) & 28414;
        llIIIllIlll[101] = (-((-17026) & 29695)) & (-1027) & 16383;
        llIIIllIlll[102] = (-16391) & 19054;
        llIIIllIlll[103] = (-((-20481) & 30083)) & (-1) & 12287;
        llIIIllIlll[104] = (-24850) & 27519;
        llIIIllIlll[105] = (-((-27197) & 32701)) & (-8193) & 16380;
        llIIIllIlll[106] = (-((-13953) & 30419)) & (-13325) & 32479;
        llIIIllIlll[107] = (-((-1257) & 13802)) & (-16409) & 31615;
        llIIIllIlll[108] = (-12553) & 15231;
        llIIIllIlll[109] = (-((-529) & 25233)) & (-5129) & 32510;
        llIIIllIlll[110] = (-((-26402) & 30499)) & (-8193) & 14271;
        llIIIllIlll[111] = (-((-19271) & 27607)) & (-16389) & 27390;
        llIIIllIlll[112] = (-((-901) & 14230)) & (-16385) & 32381;
        llIIIllIlll[113] = (-5249) & 7935;
        llIIIllIlll[114] = (-((-2637) & 31597)) & (-69) & 31719;
        llIIIllIlll[115] = (-25877) & 28543;
        llIIIllIlll[116] = (-12301) & 14975;
        llIIIllIlll[117] = (-((-21677) & 30127)) & (-16393) & 27519;
        llIIIllIlll[118] = (-17547) & 20222;
        llIIIllIlll[119] = (-((-11985) & 32469)) & (-1411) & 24559;
        llIIIllIlll[120] = (-((-10853) & 15991)) & (-16641) & 24447;
        llIIIllIlll[121] = (-1281) & 3962;
        llIIIllIlll[122] = (-((-1097) & 21581)) & (-1282) & 24445;
        llIIIllIlll[123] = (-16386) & 19071;
        llIIIllIlll[124] = (-28933) & 32758;
        llIIIllIlll[125] = (-20745) & 24569;
        llIIIllIlll[126] = (-((-2827) & 28443)) & (-4105) & 32383;
        llIIIllIlll[127] = (-17) & 26235;
        llIIIllIlll[128] = (-((-19703) & 20223)) & (-129) & 26623;
        llIIIllIlll[129] = (-((-25221) & 29607)) & (-1025) & 32687;
        llIIIllIlll[130] = (-4175) & 30159;
        llIIIllIlll[131] = (-((-25145) & 30527)) & (-10) & 32623;
        llIIIllIlll[132] = (-((-2073) & 6427)) & (-1057) & 32639;
        llIIIllIlll[133] = (-(151 ^ 182)) & (-5381) & 32638;
    }

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig) configManager.getConfig(TOAConfig.class);
    }

    private static boolean lIIllllllllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public void c() {
        a(llIIIllIlll[32]);
        c(llIIIllIlll[0]);
    }

    static {
        lIIlllllllIlll();
        lIIlllllIIlIll();
        Integer valueOf = Integer.valueOf(llIIIllIlll[100]);
        Integer valueOf2 = Integer.valueOf(llIIIllIlll[101]);
        Integer valueOf3 = Integer.valueOf(llIIIllIlll[102]);
        Integer valueOf4 = Integer.valueOf(llIIIllIlll[103]);
        Integer valueOf5 = Integer.valueOf(llIIIllIlll[104]);
        Integer valueOf6 = Integer.valueOf(llIIIllIlll[105]);
        Integer[] numArr = new Integer[llIIIllIlll[23]];
        numArr[llIIIllIlll[0]] = Integer.valueOf(llIIIllIlll[106]);
        numArr[llIIIllIlll[3]] = Integer.valueOf(llIIIllIlll[107]);
        numArr[llIIIllIlll[4]] = Integer.valueOf(llIIIllIlll[108]);
        numArr[llIIIllIlll[5]] = Integer.valueOf(llIIIllIlll[109]);
        numArr[llIIIllIlll[6]] = Integer.valueOf(llIIIllIlll[110]);
        numArr[llIIIllIlll[7]] = Integer.valueOf(llIIIllIlll[111]);
        numArr[llIIIllIlll[8]] = Integer.valueOf(llIIIllIlll[112]);
        numArr[llIIIllIlll[9]] = Integer.valueOf(llIIIllIlll[113]);
        numArr[llIIIllIlll[10]] = Integer.valueOf(llIIIllIlll[114]);
        numArr[llIIIllIlll[11]] = Integer.valueOf(llIIIllIlll[115]);
        numArr[llIIIllIlll[12]] = Integer.valueOf(llIIIllIlll[116]);
        numArr[llIIIllIlll[13]] = Integer.valueOf(llIIIllIlll[117]);
        numArr[llIIIllIlll[14]] = Integer.valueOf(llIIIllIlll[118]);
        numArr[llIIIllIlll[15]] = Integer.valueOf(llIIIllIlll[119]);
        numArr[llIIIllIlll[16]] = Integer.valueOf(llIIIllIlll[120]);
        numArr[llIIIllIlll[17]] = Integer.valueOf(llIIIllIlll[121]);
        numArr[llIIIllIlll[18]] = Integer.valueOf(llIIIllIlll[122]);
        numArr[llIIIllIlll[19]] = Integer.valueOf(llIIIllIlll[123]);
        numArr[llIIIllIlll[20]] = Integer.valueOf(llIIIllIlll[124]);
        numArr[llIIIllIlll[21]] = Integer.valueOf(llIIIllIlll[125]);
        numArr[llIIIllIlll[22]] = Integer.valueOf(llIIIllIlll[126]);
        a = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
        Integer valueOf7 = Integer.valueOf(llIIIllIlll[127]);
        Integer valueOf8 = Integer.valueOf(llIIIllIlll[128]);
        Integer valueOf9 = Integer.valueOf(llIIIllIlll[129]);
        Integer valueOf10 = Integer.valueOf(llIIIllIlll[130]);
        Integer valueOf11 = Integer.valueOf(llIIIllIlll[131]);
        Integer valueOf12 = Integer.valueOf(llIIIllIlll[132]);
        Integer[] numArr2 = new Integer[llIIIllIlll[3]];
        numArr2[llIIIllIlll[0]] = Integer.valueOf(llIIIllIlll[133]);
        b = ImmutableSet.of(valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, numArr2);
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

    public void b(boolean z) {
        this.v = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    protected void onStart() {
        try {
            this.v = llIIIllIlll[0];
            this.u = llIIIllIlll[0];
            this.x = llIIIllIlll[0];
            this.z = llIIIllIlll[0];
            this.B = llIIIllIlll[0];
            this.A = llIIIllIlll[0];
            this.f.w();
            this.i.w();
            this.g.w();
            this.j.register(this.f);
            this.j.register(this.g);
            this.j.register(this.h);
            this.j.register(this.i);
            this.j.register(this.t);
            this.j.register(this.e);
            this.k.add(this.l);
            "".length();
            this.k.add(this.m);
            "".length();
            this.k.add(this.n);
            "".length();
            this.k.add(this.o);
            "".length();
            this.k.add(this.p);
            "".length();
            this.k.add(this.f1q);
            "".length();
            this.k.add(this.r);
            "".length();
            this.k.add(this.s);
            "".length();
            "".length();
            if ((-" ".length()) >= 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (lIIllllllllIlI(lootReceived.getName().contains(llIIIllIllI[llIIIllIlll[5]]) ? 1 : 0)) {
            return;
        }
        int varbitValue = Static.getClient().getVarbitValue(llIIIllIlll[99]);
        Collection items = lootReceived.getItems();
        D.a((ItemStack) items.stream().filter(itemStack -> {
            return b.contains(Integer.valueOf(itemStack.getId()));
        }).findFirst().orElse(null), items, String.valueOf(varbitValue), this.d.anonymize());
    }

    protected void onStop() {
        this.j.unregister(this.f);
        this.j.unregister(this.g);
        this.j.unregister(this.h);
        this.j.unregister(this.i);
        this.j.unregister(this.t);
        this.j.unregister(this.e);
        this.k.remove(this.l);
        "".length();
        this.k.remove(this.m);
        "".length();
        this.k.remove(this.n);
        "".length();
        this.k.remove(this.o);
        "".length();
        this.k.remove(this.p);
        "".length();
        this.k.remove(this.f1q);
        "".length();
        this.k.remove(this.r);
        "".length();
        this.k.remove(this.s);
        "".length();
    }
}
