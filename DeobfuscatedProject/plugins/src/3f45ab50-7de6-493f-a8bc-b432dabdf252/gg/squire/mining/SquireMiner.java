/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.overlay.MiningInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.A;
import m.e.i.q.u.r.-.n.s.e.r.i.B;
import m.e.i.q.u.r.-.n.s.e.r.i.D;
import m.e.i.q.u.r.-.n.s.e.r.i.E;
import m.e.i.q.u.r.-.n.s.e.r.i.F;
import m.e.i.q.u.r.-.n.s.e.r.i.G;
import m.e.i.q.u.r.-.n.s.e.r.i.H;
import m.e.i.q.u.r.-.n.s.e.r.i.I;
import m.e.i.q.u.r.-.n.s.e.r.i.J;
import m.e.i.q.u.r.-.n.s.e.r.i.K;
import m.e.i.q.u.r.-.n.s.e.r.i.L;
import m.e.i.q.u.r.-.n.s.e.r.i.M;
import m.e.i.q.u.r.-.n.s.e.r.i.N;
import m.e.i.q.u.r.-.n.s.e.r.i.O;
import m.e.i.q.u.r.-.n.s.e.r.i.P;
import m.e.i.q.u.r.-.n.s.e.r.i.Q;
import m.e.i.q.u.r.-.n.s.e.r.i.R;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import m.e.i.q.u.r.-.n.s.e.r.i.U;
import m.e.i.q.u.r.-.n.s.e.r.i.j;
import m.e.i.q.u.r.-.n.s.e.r.i.k;
import m.e.i.q.u.r.-.n.s.e.r.i.l;
import m.e.i.q.u.r.-.n.s.e.r.i.m;
import m.e.i.q.u.r.-.n.s.e.r.i.n;
import m.e.i.q.u.r.-.n.s.e.r.i.o;
import m.e.i.q.u.r.-.n.s.e.r.i.p;
import m.e.i.q.u.r.-.n.s.e.r.i.q;
import m.e.i.q.u.r.-.n.s.e.r.i.r;
import m.e.i.q.u.r.-.n.s.e.r.i.s;
import m.e.i.q.u.r.-.n.s.e.r.i.u;
import m.e.i.q.u.r.-.n.s.e.r.i.v;
import m.e.i.q.u.r.-.n.s.e.r.i.w;
import m.e.i.q.u.r.-.n.s.e.r.i.x;
import m.e.i.q.u.r.-.n.s.e.r.i.y;
import m.e.i.q.u.r.-.n.s.e.r.i.z;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Miner", enabledByDefault=false, description="Mining done easy.")
public class SquireMiner
extends SquirePlugin {
    private final /* synthetic */ int[] a;
    private final /* synthetic */ int[] b;
    private /* synthetic */ Instant i;
    private static /* synthetic */ String[] llllllIlllll;
    @Inject
    private /* synthetic */ OverlayManager g;
    @Inject
    private /* synthetic */ EventBus c;
    private /* synthetic */ int j;
    private static /* synthetic */ int[] lllllllIIlII;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    @Inject
    private /* synthetic */ T d;
    @Inject
    private /* synthetic */ U e;
    @Inject
    private /* synthetic */ MiningInfoBox h;

    @Provides
    SquireMinerConfig a(ConfigManager configManager) {
        return (SquireMinerConfig)configManager.getConfig(SquireMinerConfig.class);
    }

    private static void lIIlIlIlIIIlIlI() {
        llllllIlllll = new String[lllllllIIlII[21]];
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[1]] = SquireMiner.lIIlIlIIlllIllI("HhsnKg==", "ZiHZl");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[3]] = SquireMiner.lIIlIlIIlllIlll("VI4D010Z5bU=", "MWpCV");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[5]] = SquireMiner.lIIlIlIIlllIlll("v7YiRzZKvjk=", "oUkLr");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[7]] = SquireMiner.lIIlIlIIlllIlll("4aayH3c/D5E=", "amMEO");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[0]] = SquireMiner.lIIlIlIIlllIllI("KzcmFBkjYjQJBj8=", "ZBGfk");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[14]] = SquireMiner.lIIlIlIIllllIII("ziD2KmYrARMgc9SZ1y+QJQ==", "DKzwm");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[15]] = SquireMiner.lIIlIlIIllllIII("EGcfArhBYxSCOXyooXDZBQ==", "VyETl");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[16]] = SquireMiner.lIIlIlIIlllIlll("bOiWX5PJak+U1rKRLcRWRA==", "RRzOE");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[17]] = SquireMiner.lIIlIlIIllllIII("79Z7PdUBhME=", "XCQQQ");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[18]] = SquireMiner.lIIlIlIIllllIII("HcVmBoWzNio=", "spjQM");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[19]] = SquireMiner.lIIlIlIIllllIII("5CFwY/b2LIM=", "tGXHg");
        SquireMiner.llllllIlllll[SquireMiner.lllllllIIlII[20]] = SquireMiner.lIIlIlIIlllIlll("E4xrXFpzmJk=", "xkInX");
    }

    public int b() {
        return this.j;
    }

    protected void onStop() {
        this.g.remove((Overlay)this.h);
        "".length();
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
    }

    public SquireMiner() {
        int[] nArray = new int[lllllllIIlII[0]];
        nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[2];
        nArray[SquireMiner.lllllllIIlII[3]] = lllllllIIlII[4];
        nArray[SquireMiner.lllllllIIlII[5]] = lllllllIIlII[6];
        nArray[SquireMiner.lllllllIIlII[7]] = lllllllIIlII[8];
        this.a = nArray;
        int[] nArray2 = new int[lllllllIIlII[0]];
        nArray2[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[9];
        nArray2[SquireMiner.lllllllIIlII[3]] = lllllllIIlII[10];
        nArray2[SquireMiner.lllllllIIlII[5]] = lllllllIIlII[11];
        nArray2[SquireMiner.lllllllIIlII[7]] = lllllllIIlII[12];
        this.b = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIlIIIlIlIIllIIII;
        String string = chatMessage.getMessage();
        if (SquireMiner.lIIlIlIlIIIllII(string.contains(llllllIlllll[lllllllIIlII[0]]) ? 1 : 0)) {
            this.j += lllllllIIlII[3];
        }
        if (SquireMiner.lIIlIlIlIIIllII(lllllllllllllllIIlIIIlIlIIllIIII.contains(llllllIlllll[lllllllIIlII[14]]) ? 1 : 0)) {
            lllllllllllllllIIlIIIlIlIIllIIlI.j += lllllllIIlII[5];
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllllllIIlII[13]];
        classArray[SquireMiner.lllllllIIlII[1]] = I.class;
        classArray[SquireMiner.lllllllIIlII[3]] = J.class;
        classArray[SquireMiner.lllllllIIlII[5]] = k.class;
        classArray[SquireMiner.lllllllIIlII[7]] = F.class;
        classArray[SquireMiner.lllllllIIlII[0]] = B.class;
        classArray[SquireMiner.lllllllIIlII[14]] = E.class;
        classArray[SquireMiner.lllllllIIlII[15]] = z.class;
        classArray[SquireMiner.lllllllIIlII[16]] = H.class;
        classArray[SquireMiner.lllllllIIlII[17]] = G.class;
        classArray[SquireMiner.lllllllIIlII[18]] = D.class;
        classArray[SquireMiner.lllllllIIlII[19]] = A.class;
        classArray[SquireMiner.lllllllIIlII[20]] = s.class;
        classArray[SquireMiner.lllllllIIlII[21]] = j.class;
        classArray[SquireMiner.lllllllIIlII[22]] = x.class;
        classArray[SquireMiner.lllllllIIlII[23]] = u.class;
        classArray[SquireMiner.lllllllIIlII[24]] = w.class;
        classArray[SquireMiner.lllllllIIlII[25]] = p.class;
        classArray[SquireMiner.lllllllIIlII[26]] = o.class;
        classArray[SquireMiner.lllllllIIlII[27]] = n.class;
        classArray[SquireMiner.lllllllIIlII[28]] = O.class;
        classArray[SquireMiner.lllllllIIlII[29]] = P.class;
        classArray[SquireMiner.lllllllIIlII[30]] = R.class;
        classArray[SquireMiner.lllllllIIlII[31]] = Q.class;
        classArray[SquireMiner.lllllllIIlII[32]] = v.class;
        classArray[SquireMiner.lllllllIIlII[33]] = L.class;
        classArray[SquireMiner.lllllllIIlII[34]] = K.class;
        classArray[SquireMiner.lllllllIIlII[35]] = N.class;
        classArray[SquireMiner.lllllllIIlII[36]] = M.class;
        classArray[SquireMiner.lllllllIIlII[37]] = y.class;
        classArray[SquireMiner.lllllllIIlII[38]] = r.class;
        classArray[SquireMiner.lllllllIIlII[39]] = q.class;
        classArray[SquireMiner.lllllllIIlII[40]] = l.class;
        classArray[SquireMiner.lllllllIIlII[41]] = m.class;
        return classArray;
    }

    private static String lIIlIlIIlllIlll(String lllllllllllllllIIlIIIlIlIIIllIIl, String lllllllllllllllIIlIIIlIlIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIlIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIlIIIlllIl.init(lllllllIIlII[5], lllllllllllllllIIlIIIlIlIIIllllI);
            return new String(lllllllllllllllIIlIIIlIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIlIIIlllII) {
            lllllllllllllllIIlIIIlIlIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIllII(int n2) {
        return n2 != 0;
    }

    public Instant getStarted() {
        return this.i;
    }

    private static void lIIlIlIlIIIlIll() {
        lllllllIIlII = new int[46];
        SquireMiner.lllllllIIlII[0] = 0x42 ^ 0x4E ^ (0x3C ^ 0x34);
        SquireMiner.lllllllIIlII[1] = (0x37 ^ 0x6B) & ~(0xD0 ^ 0x8C);
        SquireMiner.lllllllIIlII[2] = 169 + 104 - 176 + 120 + (12 + 93 - 79 + 197) - (0xFFFFE7FE & 0x1933) + (0x2E ^ 0x5D);
        SquireMiner.lllllllIIlII[3] = " ".length();
        SquireMiner.lllllllIIlII[4] = 170 + 64 - 210 + 227;
        SquireMiner.lllllllIIlII[5] = "  ".length();
        SquireMiner.lllllllIIlII[6] = 231 + 149 - 324 + 197;
        SquireMiner.lllllllIIlII[7] = "   ".length();
        SquireMiner.lllllllIIlII[8] = (0xA ^ 0x32) + (0xEA ^ 0x89) - (22 + 91 - -8 + 20) + (136 + 88 - 147 + 164);
        SquireMiner.lllllllIIlII[9] = 41 + 98 - 83 + 143;
        SquireMiner.lllllllIIlII[10] = 87 + 20 - 82 + 131 + (0xFF ^ 0x89) - (0x2A ^ 0x4E) + (0xAB ^ 0xB0);
        SquireMiner.lllllllIIlII[11] = 74 + 29 - 67 + 106 + (0xD4 ^ 0x9B) - (94 + 70 - 27 + 28) + (29 + 133 - 146 + 131);
        SquireMiner.lllllllIIlII[12] = 98 + 179 - 213 + 141;
        SquireMiner.lllllllIIlII[13] = 0x5A ^ 0x54 ^ (0x52 ^ 0x7D);
        SquireMiner.lllllllIIlII[14] = 0x9D ^ 0x98;
        SquireMiner.lllllllIIlII[15] = 0xCE ^ 0xBD ^ (0xC ^ 0x79);
        SquireMiner.lllllllIIlII[16] = 108 + 57 - 77 + 44 ^ 113 + 90 - 132 + 60;
        SquireMiner.lllllllIIlII[17] = 0x91 ^ 0x99;
        SquireMiner.lllllllIIlII[18] = 0x52 ^ 0x5B;
        SquireMiner.lllllllIIlII[19] = 0x2B ^ 0x21;
        SquireMiner.lllllllIIlII[20] = 0xB ^ 0;
        SquireMiner.lllllllIIlII[21] = 0x16 ^ 0x28 ^ (0x2D ^ 0x1F);
        SquireMiner.lllllllIIlII[22] = 0x25 ^ 0x18 ^ (0x4E ^ 0x7E);
        SquireMiner.lllllllIIlII[23] = 128 + 86 - 78 + 18 ^ 119 + 18 - 116 + 127;
        SquireMiner.lllllllIIlII[24] = 0x47 ^ 0x48;
        SquireMiner.lllllllIIlII[25] = 0x54 ^ 0x7A ^ (0x20 ^ 0x1E);
        SquireMiner.lllllllIIlII[26] = 0x5D ^ 0x4C;
        SquireMiner.lllllllIIlII[27] = 6 ^ 0xA ^ (0x52 ^ 0x4C);
        SquireMiner.lllllllIIlII[28] = 0x39 ^ 0x2A;
        SquireMiner.lllllllIIlII[29] = 0x23 ^ 0x1F ^ (0x4C ^ 0x64);
        SquireMiner.lllllllIIlII[30] = 0xB5 ^ 0xA0;
        SquireMiner.lllllllIIlII[31] = "   ".length() ^ (0x29 ^ 0x3C);
        SquireMiner.lllllllIIlII[32] = 142 + 57 - 25 + 14 ^ 17 + 157 - 47 + 44;
        SquireMiner.lllllllIIlII[33] = 0x62 ^ 0x7A;
        SquireMiner.lllllllIIlII[34] = 49 + 19 - 67 + 174 ^ 13 + 28 - 24 + 165;
        SquireMiner.lllllllIIlII[35] = 0x5F ^ 0x45;
        SquireMiner.lllllllIIlII[36] = 0x58 ^ 0x43;
        SquireMiner.lllllllIIlII[37] = 0x25 ^ 0x39;
        SquireMiner.lllllllIIlII[38] = 0x7B ^ 0x66;
        SquireMiner.lllllllIIlII[39] = 0xD9 ^ 0xC7;
        SquireMiner.lllllllIIlII[40] = 0xF0 ^ 0xA7 ^ (0xF ^ 0x47);
        SquireMiner.lllllllIIlII[41] = 0x7E ^ 0x5E;
        SquireMiner.lllllllIIlII[42] = -(0xFFFFE9EF & 0x5635) & (0xFFFFCFB7 & 0x77FF);
        SquireMiner.lllllllIIlII[43] = -(0xFFFFE6CF & 0x7979) & (0xFFFFEFFE & 0x73FB);
        SquireMiner.lllllllIIlII[44] = 0xFFFFFDFF & 0x1ABD;
        SquireMiner.lllllllIIlII[45] = 0xFFFFDDBF & 0x3AFC;
    }

    private static String lIIlIlIIllllIII(String lllllllllllllllIIlIIIlIlIIlIlIII, String lllllllllllllllIIlIIIlIlIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lllllllIIlII[17]), "DES");
            Cipher lllllllllllllllIIlIIIlIlIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIlIIlIlIlI.init(lllllllIIlII[5], lllllllllllllllIIlIIIlIlIIlIlIll);
            return new String(lllllllllllllllIIlIIIlIlIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIlIIlIlIIl) {
            lllllllllllllllIIlIIIlIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIIIllIl(int n2) {
        return n2 == 0;
    }

    protected void onStart() {
        this.i = Instant.now();
        this.g.add((Overlay)this.h);
        "".length();
        this.d.A();
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.j = lllllllIIlII[1];
    }

    static {
        SquireMiner.lIIlIlIlIIIlIll();
        SquireMiner.lIIlIlIlIIIlIlI();
    }

    public void a() {
        SquireMiner lllllllllllllllIIlIIIlIlIIllIllI;
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[20]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[19]])).interact(llllllIlllll[lllllllIIlII[1]]);
        }
        if (SquireMiner.lIIlIlIlIIIllIl(Inventory.contains((int[])lllllllllllllllIIlIIIlIlIIllIllI.a) ? 1 : 0) && SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])lllllllllllllllIIlIIIlIlIIllIllI.b) ? 1 : 0)) {
            Inventory.getFirst((int[])lllllllllllllllIIlIIIlIlIIllIllI.b).interact(llllllIlllll[lllllllIIlII[3]]);
        }
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[18]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[17]])).interact(llllllIlllll[lllllllIIlII[5]]);
        }
        if (SquireMiner.lIIlIlIlIIIllIl(lllllllllllllllIIlIIIlIlIIllIllI.f.deposit() ? 1 : 0) && SquireMiner.lIIlIlIlIIIllII(Inventory.contains(item -> item.getName().contains(llllllIlllll[lllllllIIlII[16]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(llllllIlllll[lllllllIIlII[15]])).interact(llllllIlllll[lllllllIIlII[7]]);
        }
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])lllllllllllllllIIlIIIlIlIIllIllI.a) ? 1 : 0)) {
            int[] nArray = new int[lllllllIIlII[3]];
            nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[42];
            Inventory.getFirst((int[])lllllllllllllllIIlIIIlIlIIllIllI.a).useOn(Inventory.getFirst((int[])nArray));
        }
        int[] nArray = new int[lllllllIIlII[3]];
        nArray[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
        if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lllllllIIlII[3]];
            nArray2[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[44];
            if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllllllIIlII[3]];
                nArray3[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
                int[] nArray4 = new int[lllllllIIlII[3]];
                nArray4[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[44];
                Inventory.getFirst((int[])nArray3).useOn(Inventory.getFirst((int[])nArray4));
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            } else {
                int[] nArray5 = new int[lllllllIIlII[3]];
                nArray5[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[45];
                if (SquireMiner.lIIlIlIlIIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lllllllIIlII[3]];
                    nArray6[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[43];
                    int[] nArray7 = new int[lllllllIIlII[3]];
                    nArray7[SquireMiner.lllllllIIlII[1]] = lllllllIIlII[45];
                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                }
            }
        }
    }

    private static String lIIlIlIIlllIllI(String lllllllllllllllIIlIIIlIlIIIIlIll, String lllllllllllllllIIlIIIlIlIIIIlIlI) {
        lllllllllllllllIIlIIIlIlIIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIlIIIIlIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIIlIlIIIIlIII = lllllllllllllllIIlIIIlIlIIIIlIlI.toCharArray();
        int lllllllllllllllIIlIIIlIlIIIIIlll = lllllllIIlII[1];
        char[] lllllllllllllllIIlIIIlIlIIIIIIIl = lllllllllllllllIIlIIIlIlIIIIlIll.toCharArray();
        int lllllllllllllllIIlIIIlIlIIIIIIII = lllllllllllllllIIlIIIlIlIIIIIIIl.length;
        int lllllllllllllllIIlIIIlIIllllllll = lllllllIIlII[1];
        while (SquireMiner.lIIlIlIlIIIlllI(lllllllllllllllIIlIIIlIIllllllll, lllllllllllllllIIlIIIlIlIIIIIIII)) {
            char lllllllllllllllIIlIIIlIlIIIIllII = lllllllllllllllIIlIIIlIlIIIIIIIl[lllllllllllllllIIlIIIlIIllllllll];
            lllllllllllllllIIlIIIlIlIIIIlIIl.append((char)(lllllllllllllllIIlIIIlIlIIIIllII ^ lllllllllllllllIIlIIIlIlIIIIlIII[lllllllllllllllIIlIIIlIlIIIIIlll % lllllllllllllllIIlIIIlIlIIIIlIII.length]));
            "".length();
            ++lllllllllllllllIIlIIIlIlIIIIIlll;
            ++lllllllllllllllIIlIIIlIIllllllll;
            "".length();
            if (" ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIlIlIIIIlIIl);
    }
}

