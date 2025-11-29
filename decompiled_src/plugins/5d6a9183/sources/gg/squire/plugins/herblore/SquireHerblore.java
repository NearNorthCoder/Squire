package gg.squire.plugins.herblore;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.herblore.overlay.HerbloreInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.a;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.f;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.h;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.i;
@PluginDescriptor(name = "Squire Herblore", enabledByDefault = false, description = "Does Herblore stuff")
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:gg/squire/plugins/herblore/SquireHerblore.class */
public class SquireHerblore extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ HerbloreConfig b;
    private final /* synthetic */ Class<?>[] a;
    private static /* synthetic */ String[] lllIlIIIllll;
    private static /* synthetic */ int[] lllIlIIlIIII;
    @Inject
    private /* synthetic */ HerbloreInfoBox c;

    private static void lIIIlIlllIllIIl() {
        lllIlIIlIIII = new int[5];
        lllIlIIlIIII[0] = "   ".length();
        lllIlIIlIIII[1] = (105 ^ 123) & ((5 ^ 23) ^ (-1));
        lllIlIIlIIII[2] = " ".length();
        lllIlIIlIIII[3] = "  ".length();
        lllIlIIlIIII[4] = (87 ^ 11) ^ (102 ^ 50);
    }

    public SquireHerblore() {
        Class<?>[] clsArr = new Class[lllIlIIlIIII[0]];
        clsArr[lllIlIIlIIII[1]] = h.class;
        clsArr[lllIlIIlIIII[2]] = f.class;
        clsArr[lllIlIIlIIII[3]] = i.class;
        this.a = clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a() {
        if (!lIIIlIlllIllIlI(this.b.method(), c.ALL_STAGES) || lIIIlIlllIllIll(this.b.method(), c.ALL_STAGES_ALL_HERBS)) {
            ?? r0 = lllIlIIlIIII[2];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((((31 + 26) - (-19)) + 54) ^ (((171 + 133) - 134) + 26)) & (((49 ^ 40) ^ (125 ^ 34)) ^ (-" ".length())) : r0;
        }
        return lllIlIIlIIII[1];
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    private static String lIIIlIlllIlIlll(String lllllllllllllllIIllIIlIIIIIIlIll, String lllllllllllllllIIllIIlIIIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlIIlIIII[4]), "DES");
            Cipher lllllllllllllllIIllIIlIIIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIIIIIIllIl.init(lllIlIIlIIII[3], lllllllllllllllIIllIIlIIIIIIlllI);
            return new String(lllllllllllllllIIllIIlIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIIIIIllII) {
            lllllllllllllllIIllIIlIIIIIIllII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        getEventBus().post(new a(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.remove(this.c);
        "".length();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (lIIIlIlllIlllII(configChanged.getGroup().equals(lllIlIIIllll[lllIlIIlIIII[1]]) ? 1 : 0)) {
            return;
        }
        getEventBus().post(new a(this.b.method(), this.b.herb(), this.b.potion()));
    }

    protected void onStart() {
        getEventBus().post(new a(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.add(this.c);
        "".length();
    }

    private static void lIIIlIlllIllIII() {
        lllIlIIIllll = new String[lllIlIIlIIII[2]];
        lllIlIIIllll[lllIlIIlIIII[1]] = lIIIlIlllIlIlll("i/8VMChBBeqpkVwi7nrxYA==", "nfOXK");
    }

    private static boolean lIIIlIlllIlllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean z;
        if (lIIIlIlllIllIll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            ?? r1 = lllIlIIlIIII[2];
            "".length();
            z = r1;
            if ((((((153 + 123) - 230) + 165) ^ (((102 + 61) - 162) + 146)) & (((((157 + 85) - 92) + 100) ^ (((116 + 36) - 75) + 109)) ^ (-" ".length()))) != 0) {
                return;
            }
        } else {
            z = lllIlIIlIIII[1];
        }
        setPaused(z);
    }

    static {
        lIIIlIlllIllIIl();
        lIIIlIlllIllIII();
    }

    private static boolean lIIIlIlllIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Provides
    HerbloreConfig a(ConfigManager configManager) {
        return (HerbloreConfig) configManager.getConfig(HerbloreConfig.class);
    }

    private static boolean lIIIlIlllIllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }
}
