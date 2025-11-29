package gg.squire.whisperer;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.whisperer.config.SquireWhispererConfig;
import gg.squire.whisperer.overlay.WhispererInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.A;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.B;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.C;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.C0000a;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.C0003d;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.D;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.E;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.g;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.j;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.k;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.l;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.m;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.n;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.o;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.p;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.q;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.r;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.s;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.t;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.v;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.x;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.y;
import r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.z;
@SquireUtil
@PluginDescriptor(name = "Squire Whisperer", enabledByDefault = false)
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:gg/squire/whisperer/SquireWhisperer.class */
public class SquireWhisperer extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ EventBus e;
    @Inject
    private /* synthetic */ WhispererInfoBox c;
    private static /* synthetic */ int[] lIlIllIllIIII;
    private static /* synthetic */ String[] lIlIllIlIllII;
    @Inject
    private /* synthetic */ C0000a f;
    private /* synthetic */ int a;
    @Inject
    private /* synthetic */ C0003d d;
    private /* synthetic */ boolean g = lIlIllIllIIII[0];

    private static boolean llIIIIIlIlllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    protected void onStart() {
        this.b.add(this.c);
        "".length();
        this.d.e();
        this.f.a(lIlIllIllIIII[0]);
        this.g = lIlIllIllIIII[0];
        this.e.register(this.d);
    }

    static {
        llIIIIIlIlllIIl();
        llIIIIIlIllIlIl();
    }

    protected void onStop() {
        this.b.remove(this.c);
        "".length();
        this.e.unregister(this.d);
    }

    public int a() {
        return this.a;
    }

    private static String llIIIIIlIllIlII(String llllllllllllllIllIlIIIlIllIIIIlI, String llllllllllllllIllIlIIIlIllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIII[9]), "DES");
            Cipher llllllllllllllIllIlIIIlIllIIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIllIIIllI.init(lIlIllIllIIII[3], llllllllllllllIllIlIIIlIllIIIlll);
            return new String(llllllllllllllIllIlIIIlIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIllIIIlIl) {
            llllllllllllllIllIlIIIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    @Provides
    SquireWhispererConfig a(ConfigManager configManager) {
        return (SquireWhispererConfig) configManager.getConfig(SquireWhispererConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIIIlIlllIlI(chatMessage.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[0]]) ? 1 : 0)) {
            this.a += lIlIllIllIIII[2];
        }
        if (llIIIIIlIlllIlI(chatMessage.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[2]]) ? 1 : 0)) {
            this.g = lIlIllIllIIII[2];
            Log.info(lIlIllIlIllII[lIlIllIllIIII[3]]);
            forceStop();
        }
    }

    private static void llIIIIIlIlllIIl() {
        lIlIllIllIIII = new int[22];
        lIlIllIllIIII[0] = (101 ^ 55) & ((193 ^ 147) ^ (-1));
        lIlIllIllIIII[1] = 66 ^ 87;
        lIlIllIllIIII[2] = " ".length();
        lIlIllIllIIII[3] = "  ".length();
        lIlIllIllIIII[4] = "   ".length();
        lIlIllIllIIII[5] = 16 ^ 20;
        lIlIllIllIIII[6] = 107 ^ 110;
        lIlIllIllIIII[7] = 59 ^ 61;
        lIlIllIllIIII[8] = 140 ^ 139;
        lIlIllIllIIII[9] = 164 ^ 172;
        lIlIllIllIIII[10] = (((15 + 135) - 116) + 113) ^ (((11 + 149) - 69) + 63);
        lIlIllIllIIII[11] = 58 ^ 48;
        lIlIllIllIIII[12] = 9 ^ 2;
        lIlIllIllIIII[13] = (((110 + 18) - 28) + 50) ^ (((131 + 110) - 162) + 75);
        lIlIllIllIIII[14] = 161 ^ 172;
        lIlIllIllIIII[15] = 96 ^ 110;
        lIlIllIllIIII[16] = 4 ^ 11;
        lIlIllIllIIII[17] = (((56 + 119) - 75) + 60) ^ (((45 + 69) - 54) + 116);
        lIlIllIllIIII[18] = 61 ^ 44;
        lIlIllIllIIII[19] = (((68 + 37) - 24) + 48) ^ (((67 + 43) - 68) + 105);
        lIlIllIllIIII[20] = "  ".length() ^ (130 ^ 147);
        lIlIllIllIIII[21] = 10 ^ 30;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIllIllIIII[1]];
        clsArr[lIlIllIllIIII[0]] = m.class;
        clsArr[lIlIllIllIIII[2]] = k.class;
        clsArr[lIlIllIllIIII[3]] = g.class;
        clsArr[lIlIllIllIIII[4]] = l.class;
        clsArr[lIlIllIllIIII[5]] = y.class;
        clsArr[lIlIllIllIIII[6]] = o.class;
        clsArr[lIlIllIllIIII[7]] = p.class;
        clsArr[lIlIllIllIIII[8]] = q.class;
        clsArr[lIlIllIllIIII[9]] = n.class;
        clsArr[lIlIllIllIIII[10]] = r.class;
        clsArr[lIlIllIllIIII[11]] = A.class;
        clsArr[lIlIllIllIIII[12]] = z.class;
        clsArr[lIlIllIllIIII[13]] = x.class;
        clsArr[lIlIllIllIIII[14]] = s.class;
        clsArr[lIlIllIllIIII[15]] = v.class;
        clsArr[lIlIllIllIIII[16]] = B.class;
        clsArr[lIlIllIllIIII[17]] = t.class;
        clsArr[lIlIllIllIIII[18]] = j.class;
        clsArr[lIlIllIllIIII[19]] = C.class;
        clsArr[lIlIllIllIIII[20]] = D.class;
        clsArr[lIlIllIllIIII[21]] = E.class;
        return clsArr;
    }

    private static void llIIIIIlIllIlIl() {
        lIlIllIlIllII = new String[lIlIllIllIIII[4]];
        lIlIllIlIllII[lIlIllIllIIII[0]] = llIIIIIlIllIIll("rr2t3tbLmivJ30qY+qa1lSMbjeRbdxKh", "zTQEF");
        lIlIllIlIllII[lIlIllIllIIII[2]] = llIIIIIlIllIlII("HeRcIOiPbDCSPnlmb0DWVqbWHMI/QQST", "RMkJx");
        lIlIllIlIllII[lIlIllIllIIII[3]] = llIIIIIlIllIlII("ZS/xxq4fc5j8qH6k1oX89PvrFtDKGFebpwmC2V8b5OCDKilYmuSyJxGCFx67HusmgWOmlDB93OUcCtvNpkISXw==", "sfOpo");
    }

    private static String llIIIIIlIllIIll(String llllllllllllllIllIlIIIlIlIllIlll, String llllllllllllllIllIlIIIlIlIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIlIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIlIlllIIl.init(lIlIllIllIIII[3], secretKeySpec);
            return new String(llllllllllllllIllIlIIIlIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlIlIlllIII) {
            llllllllllllllIllIlIIIlIlIlllIII.printStackTrace();
            return null;
        }
    }
}
