package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.thieving.overlay.PlunderInfoBox;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.a;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.d;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.e;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.f;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.g;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.h;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.i;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.j;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.l;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.m;
import u.l.n.q.r.p.p000.u.r.d.i.e.e.s.n;
@PluginDescriptor(name = "Squire Pyramid Plunder", enabledByDefault = false)
/* loaded from: squire-plunder-0.1.0.jar:gg/squire/thieving/SquirePlunder.class */
public class SquirePlunder extends SquirePlugin {
    @Inject
    private /* synthetic */ PlunderInfoBox b;
    private static /* synthetic */ String[] llllllIlIlII;
    @Inject
    private /* synthetic */ SquirePlunderConfig a;
    private static /* synthetic */ int[] llllllIlIlIl;
    @Inject
    private /* synthetic */ a c;
    private /* synthetic */ InventorySetup f;
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ OverlayManager e;

    protected void onStop() {
        this.d.unregister(this.c);
        this.e.remove(this.b);
        "".length();
    }

    private static void lIIlIlIIIllIIlI() {
        llllllIlIlII = new String[llllllIlIlIl[2]];
        llllllIlIlII[llllllIlIlIl[1]] = lIIlIlIIIllIIIl("FwMTBQciHUYYFyYdEg4H", "Gofkc");
    }

    static {
        lIIlIlIIIllIIll();
        lIIlIlIIIllIIlI();
    }

    @Provides
    SquirePlunderConfig a(ConfigManager configManager) {
        return (SquirePlunderConfig) configManager.getConfig(SquirePlunderConfig.class);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllllIlIlIl[0]];
        clsArr[llllllIlIlIl[1]] = e.class;
        clsArr[llllllIlIlIl[2]] = d.class;
        clsArr[llllllIlIlIl[3]] = n.class;
        clsArr[llllllIlIlIl[4]] = m.class;
        clsArr[llllllIlIlIl[5]] = f.class;
        clsArr[llllllIlIlIl[6]] = h.class;
        clsArr[llllllIlIlIl[7]] = j.class;
        clsArr[llllllIlIlIl[8]] = i.class;
        clsArr[llllllIlIlIl[9]] = l.class;
        clsArr[llllllIlIlIl[10]] = g.class;
        return clsArr;
    }

    private static String lIIlIlIIIllIIIl(String lllllllllllllllIIlIIlllIIIIIlIlI, String lllllllllllllllIIlIIlllIIIIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlllIIIIIIlll = lllllllllllllllIIlIIlllIIIIIlIIl.toCharArray();
        int lllllllllllllllIIlIIlllIIIIIIllI = llllllIlIlIl[1];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIlIIllIlllllllll = charArray.length;
        int i = llllllIlIlIl[1];
        while (lIIlIlIIIllIlIl(i, lllllllllllllllIIlIIllIlllllllll)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlIIlllIIIIIIlll[lllllllllllllllIIlIIlllIIIIIIllI % lllllllllllllllIIlIIlllIIIIIIlll.length]));
            "".length();
            lllllllllllllllIIlIIlllIIIIIIllI++;
            i++;
            "".length();
            if ((((((76 + 89) - 119) + 114) ^ (((13 + 19) - (-145)) + 5)) & (((((39 + 91) - 28) + 48) ^ (((119 + 5) - 6) + 10)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a();
    }

    private static void lIIlIlIIIllIIll() {
        llllllIlIlIl = new int[11];
        llllllIlIlIl[0] = (142 ^ 149) ^ (126 ^ 111);
        llllllIlIlIl[1] = ((43 ^ 100) ^ (10 ^ 88)) & (((211 ^ 149) ^ (210 ^ 137)) ^ (-" ".length()));
        llllllIlIlIl[2] = " ".length();
        llllllIlIlIl[3] = "  ".length();
        llllllIlIlIl[4] = "   ".length();
        llllllIlIlIl[5] = 71 ^ 67;
        llllllIlIlIl[6] = 151 ^ 146;
        llllllIlIlIl[7] = 192 ^ 198;
        llllllIlIlIl[8] = (((99 + 106) - 191) + 165) ^ (((105 + 121) - 171) + 125);
        llllllIlIlIl[9] = 88 ^ 80;
        llllllIlIlIl[10] = (((96 + 144) - 120) + 83) ^ (((29 + 7) - (-30)) + 128);
    }

    private static boolean lIIlIlIIIllIlIl(int i, int i2) {
        return i < i2;
    }

    public InventorySetup b() {
        return this.f;
    }

    protected void onStart() {
        this.d.register(this.c);
        this.e.add(this.b);
        "".length();
        System.out.println(llllllIlIlII[llllllIlIlIl[1]]);
        a();
    }

    private void a() {
        this.f = new InventorySetup();
        if (lIIlIlIIIllIlII(this.a.foodAmount())) {
            this.f.add(this.a.foodID(), this.a.foodAmount());
            "".length();
        }
        if (lIIlIlIIIllIlII(this.a.antiAmount())) {
            this.f.add(item -> {
                return item.getName().startsWith(this.a.antiPoison());
            }, this.a.antiAmount());
            "".length();
        }
    }

    private static boolean lIIlIlIIIllIlII(int i) {
        return i != 0;
    }
}
