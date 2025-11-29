package gg.squire.basics.prayer.jad;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SquireUtil
@PluginDescriptor(name = "Squire Jad Flicker", description = "Automatically switches & flicks prayer at Jad", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/prayer/jad/SquireJadFlicker.class */
public class SquireJadFlicker extends SquirePlugin {
    private static /* synthetic */ int[] lIIIlIllI;
    private static final /* synthetic */ Logger fp;
    private static /* synthetic */ String[] lIIIlIlII;
    private final /* synthetic */ Map<Integer, Prayer> fq = new HashMap();
    private /* synthetic */ Prayer fr = Prayer.PROTECT_FROM_MAGIC;
    private /* synthetic */ int fs = lIIIlIllI[0];

    protected void onStart() {
    }

    private static boolean llllIIIIlI(int i2) {
        return i2 > 0;
    }

    private void k(NPC npc) {
        int llIIllIIIIllIlI = npc.getAnimation();
        if (!llllIIIllI(llIIllIIIIllIlI, lIIIlIllI[2]) || llllIIIlll(llIIllIIIIllIlI, lIIIlIllI[3])) {
            this.fq.put(Integer.valueOf(Static.getClient().getTickCount() + lIIIlIllI[4]), Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if ((-" ".length()) > " ".length()) {
            }
        } else if (!llllIIIllI(llIIllIIIIllIlI, lIIIlIllI[5]) || llllIIIlll(llIIllIIIIllIlI, lIIIlIllI[6])) {
            this.fq.put(Integer.valueOf(Static.getClient().getTickCount() + lIIIlIllI[4]), Prayer.PROTECT_FROM_MISSILES);
            "".length();
        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (llllIIIlIl(animationChanged.getActor() instanceof NPC ? 1 : 0)) {
            NPC npc = (NPC) animationChanged.getActor();
            if (llllIIIIll(npc.getName()) && llllIIIlIl(npc.getName().toLowerCase().contains(lIIIlIlII[lIIIlIllI[0]]) ? 1 : 0)) {
                k(npc);
            }
        }
    }

    private static void llllIIIIIl() {
        lIIIlIllI = new int[7];
        lIIIlIllI[0] = (72 ^ 103) & ((82 ^ 125) ^ (-1)) & (((24 ^ 75) & ((18 ^ 65) ^ (-1))) ^ (-1));
        lIIIlIllI[1] = " ".length();
        lIIIlIllI[2] = (-24600) & 27255;
        lIIIlIllI[3] = (-25090) & 32681;
        lIIIlIllI[4] = "  ".length();
        lIIIlIllI[5] = (-((-9145) & 29626)) & (-8323) & 31455;
        lIIIlIllI[6] = (-((-5133) & 30303)) & (-1) & 32763;
    }

    private static void lllIlllIll() {
        lIIIlIlII = new String[lIIIlIllI[1]];
        lIIIlIlII[lIIIlIllI[0]] = lllIlllIIl("+t5q1jwlehw=", "KErhI");
    }

    static {
        llllIIIIIl();
        lllIlllIll();
        fp = LoggerFactory.getLogger(SquireJadFlicker.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int i2 = this.fs;
        this.fs = i2 - lIIIlIllI[1];
        if (llllIIIIlI(i2)) {
            return;
        }
        Prayer prayer = this.fq.get(Integer.valueOf(Static.getClient().getTickCount()));
        if (llllIIIIll(prayer)) {
            this.fr = prayer;
        }
        if (llllIIIlII(Prayers.isEnabled(this.fr) ? 1 : 0)) {
            Prayers.toggle(this.fr);
        }
    }

    private static boolean llllIIIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llllIIIllI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean llllIIIlII(int i2) {
        return i2 == 0;
    }

    private static String lllIlllIIl(String llIIllIIIIIllll, String llIIllIIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIIIIlIIIl) {
            llIIllIIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIll(Object obj) {
        return obj != null;
    }

    private static boolean llllIIIlIl(int i2) {
        return i2 != 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIIIlIllI[0]];
    }

    protected void onStop() {
    }
}
