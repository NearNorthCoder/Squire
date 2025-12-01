package gg.squire.plugins.agility;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.b;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.d;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.e;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.f;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.g;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.h;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.i;
import y.l.q.i.p000.g.u.s.r.e.t.a.i.i.j;
@PluginDescriptor(name = "Squire Agility", description = "Completes agility courses.", enabledByDefault = false, tags = {"agility", "course", "marks of grace"})
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:gg/squire/plugins/agility/SquireAgilityPlugin.class */
public class SquireAgilityPlugin extends SquirePlugin {
    private /* synthetic */ b f;
    private static /* synthetic */ String[] lIllIIIIIll;
    private static /* synthetic */ int[] lIllIIIIlII;
    @Inject
    private /* synthetic */ OverlayManager d;
    private /* synthetic */ int g = lIllIIIIlII[0];
    @Inject
    private /* synthetic */ AgilityOverlay e;

    private static boolean lIIlIlIIllIlII(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlIIllIIIl() {
        lIllIIIIIll = new String[lIllIIIIlII[2]];
        lIllIIIIIll[lIllIIIIlII[0]] = lIIlIlIIllIIII("CykabBkIPQQ4", "gHjLz");
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIIIIlII[1]];
        clsArr[lIllIIIIlII[0]] = d.class;
        clsArr[lIllIIIIlII[2]] = h.class;
        clsArr[lIllIIIIlII[3]] = j.class;
        clsArr[lIllIIIIlII[4]] = e.class;
        clsArr[lIllIIIIlII[5]] = f.class;
        clsArr[lIllIIIIlII[6]] = i.class;
        clsArr[lIllIIIIlII[7]] = g.class;
        return clsArr;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIlIIllIIll(chatMessage.getMessage().contains(lIllIIIIIll[lIllIIIIlII[0]]) ? 1 : 0)) {
            this.g += lIllIIIIlII[2];
        }
    }

    private static void lIIlIlIIllIIlI() {
        lIllIIIIlII = new int[8];
        lIllIIIIlII[0] = (229 ^ 170) & ((103 ^ 40) ^ (-1)) & (((113 ^ 109) & ((92 ^ 64) ^ (-1))) ^ (-1));
        lIllIIIIlII[1] = 177 ^ 182;
        lIllIIIIlII[2] = " ".length();
        lIllIIIIlII[3] = "  ".length();
        lIllIIIIlII[4] = "   ".length();
        lIllIIIIlII[5] = (((61 + 51) - 19) + 98) ^ (((118 + 138) - 141) + 72);
        lIllIIIIlII[6] = 151 ^ 146;
        lIllIIIIlII[7] = 165 ^ 163;
    }

    static {
        lIIlIlIIllIIlI();
        lIIlIlIIllIIIl();
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    private static boolean lIIlIlIIllIIll(int i) {
        return i != 0;
    }

    @Provides
    public AgilityConfig a(ConfigManager configManager) {
        return (AgilityConfig) configManager.getConfig(AgilityConfig.class);
    }

    public b a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    protected void onStop() {
        this.d.remove(this.e);
        "".length();
        a((b) null);
        this.g = lIllIIIIlII[0];
    }

    protected void onStart() {
        this.d.add(this.e);
        "".length();
        a((b) null);
        this.g = lIllIIIIlII[0];
    }

    private static String lIIlIlIIllIIII(String llllllllllllllllIlIlIlIlllIIllII, String llllllllllllllllIlIlIlIlllIIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIlllIIlIlI = new StringBuilder();
        char[] llllllllllllllllIlIlIlIlllIIlIIl = llllllllllllllllIlIlIlIlllIIlIll.toCharArray();
        int llllllllllllllllIlIlIlIlllIIlIII = lIllIIIIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIlII[0];
        while (lIIlIlIIllIlII(i, length)) {
            llllllllllllllllIlIlIlIlllIIlIlI.append((char) (charArray[i] ^ llllllllllllllllIlIlIlIlllIIlIIl[llllllllllllllllIlIlIlIlllIIlIII % llllllllllllllllIlIlIlIlllIIlIIl.length]));
            "".length();
            llllllllllllllllIlIlIlIlllIIlIII++;
            i++;
            "".length();
            if (((((97 + 98) - 188) + 183) ^ (((62 + 144) - 25) + 5)) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIlIlllIIlIlI);
    }
}
