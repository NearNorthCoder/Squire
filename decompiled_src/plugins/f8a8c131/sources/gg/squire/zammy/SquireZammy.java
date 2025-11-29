package gg.squire.zammy;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zammy.overlay.ZammyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.p000.q.s.y.u.A;
import m.e.a.i.z.m.r.p000.q.s.y.u.B;
import m.e.a.i.z.m.r.p000.q.s.y.u.C;
import m.e.a.i.z.m.r.p000.q.s.y.u.D;
import m.e.a.i.z.m.r.p000.q.s.y.u.E;
import m.e.a.i.z.m.r.p000.q.s.y.u.k;
import m.e.a.i.z.m.r.p000.q.s.y.u.l;
import m.e.a.i.z.m.r.p000.q.s.y.u.n;
import m.e.a.i.z.m.r.p000.q.s.y.u.o;
import m.e.a.i.z.m.r.p000.q.s.y.u.p;
import m.e.a.i.z.m.r.p000.q.s.y.u.q;
import m.e.a.i.z.m.r.p000.q.s.y.u.r;
import m.e.a.i.z.m.r.p000.q.s.y.u.s;
import m.e.a.i.z.m.r.p000.q.s.y.u.t;
import m.e.a.i.z.m.r.p000.q.s.y.u.u;
import m.e.a.i.z.m.r.p000.q.s.y.u.v;
import m.e.a.i.z.m.r.p000.q.s.y.u.w;
import m.e.a.i.z.m.r.p000.q.s.y.u.x;
import m.e.a.i.z.m.r.p000.q.s.y.u.y;
import m.e.a.i.z.m.r.p000.q.s.y.u.z;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
@PluginDescriptor(name = "Squire Zammy", enabledByDefault = false)
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:gg/squire/zammy/SquireZammy.class */
public class SquireZammy extends SquirePlugin {
    @Inject
    private /* synthetic */ l d;
    @Inject
    private /* synthetic */ k e;
    private static /* synthetic */ int[] lIllIIIllIIII;
    @Inject
    private /* synthetic */ EventBus c;
    @Inject
    private /* synthetic */ ZammyInfoBox b;
    private static /* synthetic */ String[] lIllIIIlIlllI;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ ConfigManager f;

    private static boolean llIIIlIlIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlIlIIIlIII(String llllllllllllllIllIIlIllIllllIIIl, String llllllllllllllIllIIlIllIllllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllIllllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllIllllIIll.init(lIllIIIllIIII[3], secretKeySpec);
            return new String(llllllllllllllIllIIlIllIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIllllIIlI) {
            llllllllllllllIllIIlIllIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIIlIIIl(int i) {
        return i == 0;
    }

    private static String llIIIlIlIIIIlll(String llllllllllllllIllIIlIllIlllIIIIl, String llllllllllllllIllIIlIllIlllIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlIllIllIllllI = llllllllllllllIllIIlIllIlllIIIII.toCharArray();
        int llllllllllllllIllIIlIllIllIlllIl = lIllIIIllIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIllIIII[1];
        while (llIIIlIlIIlIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIlIllIllIllllI[llllllllllllllIllIIlIllIllIlllIl % llllllllllllllIllIIlIllIllIllllI.length]));
            "".length();
            llllllllllllllIllIIlIllIllIlllIl++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Provides
    SquireZammyConfig a(ConfigManager configManager) {
        return (SquireZammyConfig) configManager.getConfig(SquireZammyConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (llIIIlIlIIlIIIl(configButtonClicked.getGroup().equals(lIllIIIlIlllI[lIllIIIllIIII[1]]) ? 1 : 0)) {
            return;
        }
        this.f.setConfiguration(configButtonClicked.getGroup(), configButtonClicked.getKey().replace(lIllIIIlIlllI[lIllIIIllIIII[2]], lIllIIIlIlllI[lIllIIIllIIII[3]]), (String) Equipment.getAll().stream().map(item -> {
            return item.getId() + ",";
        }).collect(Collectors.joining()));
    }

    protected void onStop() {
        this.c.unregister(this.d);
        this.c.unregister(this.e);
        this.a.remove(this.b);
        "".length();
    }

    protected void onStart() {
        this.c.register(this.d);
        this.c.register(this.e);
        this.a.add(this.b);
        "".length();
    }

    static {
        llIIIlIlIIlIIII();
        llIIIlIlIIIlIIl();
    }

    private static void llIIIlIlIIIlIIl() {
        lIllIIIlIlllI = new String[lIllIIIllIIII[4]];
        lIllIIIlIlllI[lIllIIIllIIII[1]] = llIIIlIlIIIIlll("FT0eEwgDNgoXFx8=", "fLkzz");
        lIllIIIlIlllI[lIllIIIllIIII[2]] = llIIIlIlIIIIlll("QxoiCQ8=", "myMyv");
        lIllIIIlIlllI[lIllIIIllIIII[3]] = llIIIlIlIIIlIII("0+MPLRmxb1Y=", "Hksjk");
    }

    private static void llIIIlIlIIlIIII() {
        lIllIIIllIIII = new int[19];
        lIllIIIllIIII[0] = (((89 + 108) - 79) + 57) ^ (((50 + 169) - 182) + 152);
        lIllIIIllIIII[1] = (149 ^ 170) & ((53 ^ 10) ^ (-1));
        lIllIIIllIIII[2] = " ".length();
        lIllIIIllIIII[3] = "  ".length();
        lIllIIIllIIII[4] = "   ".length();
        lIllIIIllIIII[5] = 70 ^ 66;
        lIllIIIllIIII[6] = (27 ^ 83) ^ (71 ^ 10);
        lIllIIIllIIII[7] = 37 ^ 35;
        lIllIIIllIIII[8] = 151 ^ 144;
        lIllIIIllIIII[9] = (247 ^ 175) ^ (243 ^ 163);
        lIllIIIllIIII[10] = 173 ^ 164;
        lIllIIIllIIII[11] = 106 ^ 96;
        lIllIIIllIIII[12] = (201 ^ 161) ^ (93 ^ 62);
        lIllIIIllIIII[13] = 2 ^ 14;
        lIllIIIllIIII[14] = 57 ^ 52;
        lIllIIIllIIII[15] = (49 ^ 91) ^ (226 ^ 134);
        lIllIIIllIIII[16] = (127 ^ 86) ^ (16 ^ 54);
        lIllIIIllIIII[17] = (((54 + 25) - (-68)) + 22) ^ (((111 + 128) - 228) + 174);
        lIllIIIllIIII[18] = (((36 + 98) - 72) + 107) ^ (((183 + 176) - 213) + 38);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIIIllIIII[0]];
        clsArr[lIllIIIllIIII[1]] = B.class;
        clsArr[lIllIIIllIIII[2]] = o.class;
        clsArr[lIllIIIllIIII[3]] = u.class;
        clsArr[lIllIIIllIIII[4]] = s.class;
        clsArr[lIllIIIllIIII[5]] = q.class;
        clsArr[lIllIIIllIIII[6]] = v.class;
        clsArr[lIllIIIllIIII[7]] = D.class;
        clsArr[lIllIIIllIIII[8]] = C.class;
        clsArr[lIllIIIllIIII[9]] = n.class;
        clsArr[lIllIIIllIIII[10]] = r.class;
        clsArr[lIllIIIllIIII[11]] = A.class;
        clsArr[lIllIIIllIIII[12]] = E.class;
        clsArr[lIllIIIllIIII[13]] = p.class;
        clsArr[lIllIIIllIIII[14]] = x.class;
        clsArr[lIllIIIllIIII[15]] = w.class;
        clsArr[lIllIIIllIIII[16]] = y.class;
        clsArr[lIllIIIllIIII[17]] = z.class;
        clsArr[lIllIIIllIIII[18]] = t.class;
        return clsArr;
    }
}
