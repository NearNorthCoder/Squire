/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
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
@PluginDescriptor(name="Squire Jad Flicker", description="Automatically switches & flicks prayer at Jad", enabledByDefault=false)
public class SquireJadFlicker
extends SquirePlugin {
    private /* synthetic */ int fs;
    private static /* synthetic */ int[] lIIIlIllI;
    private /* synthetic */ Prayer fr;
    private final /* synthetic */ Map<Integer, Prayer> fq;
    private static final /* synthetic */ Logger fp;
    private static /* synthetic */ String[] lIIIlIlII;

    protected void onStart() {
    }

    private static boolean llllIIIIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private void k(NPC nPC) {
        void llIIllIIIIllIlI;
        SquireJadFlicker llIIllIIIIlllII;
        int n2 = nPC.getAnimation();
        if (!SquireJadFlicker.llllIIIllI(n2, lIIIlIllI[2]) || SquireJadFlicker.llllIIIlll(n2, lIIIlIllI[3])) {
            llIIllIIIIlllII.fq.put(Static.getClient().getTickCount() + lIIIlIllI[4], Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        } else if (!SquireJadFlicker.llllIIIllI((int)llIIllIIIIllIlI, lIIIlIllI[5]) || SquireJadFlicker.llllIIIlll((int)llIIllIIIIllIlI, lIIIlIllI[6])) {
            llIIllIIIIlllII.fq.put(Static.getClient().getTickCount() + lIIIlIllI[4], Prayer.PROTECT_FROM_MISSILES);
            "".length();
        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC nPC;
        if (SquireJadFlicker.llllIIIlIl(animationChanged.getActor() instanceof NPC) && SquireJadFlicker.llllIIIIll((nPC = (NPC)animationChanged.getActor()).getName()) && SquireJadFlicker.llllIIIlIl(nPC.getName().toLowerCase().contains(lIIIlIlII[lIIIlIllI[0]]) ? 1 : 0)) {
            this.k(nPC);
        }
    }

    private static void llllIIIIIl() {
        lIIIlIllI = new int[7];
        SquireJadFlicker.lIIIlIllI[0] = (0x48 ^ 0x67) & ~(0x52 ^ 0x7D) & ~((0x18 ^ 0x4B) & ~(0x12 ^ 0x41));
        SquireJadFlicker.lIIIlIllI[1] = " ".length();
        SquireJadFlicker.lIIIlIllI[2] = 0xFFFF9FE8 & 0x6A77;
        SquireJadFlicker.lIIIlIllI[3] = 0xFFFF9DFE & 0x7FA9;
        SquireJadFlicker.lIIIlIllI[4] = "  ".length();
        SquireJadFlicker.lIIIlIllI[5] = -(0xFFFFDC47 & 0x73BA) & (0xFFFFDF7D & 0x7ADF);
        SquireJadFlicker.lIIIlIllI[6] = -(0xFFFFEBF3 & 0x765F) & (0xFFFFFFFF & 0x7FFB);
    }

    private static void lllIlllIll() {
        lIIIlIlII = new String[lIIIlIllI[1]];
        SquireJadFlicker.lIIIlIlII[SquireJadFlicker.lIIIlIllI[0]] = SquireJadFlicker.lllIlllIIl("+t5q1jwlehw=", "KErhI");
    }

    static {
        SquireJadFlicker.llllIIIIIl();
        SquireJadFlicker.lllIlllIll();
        fp = LoggerFactory.getLogger(SquireJadFlicker.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireJadFlicker llIIllIIIlIllIl;
        int n2 = this.fs;
        this.fs = n2 - lIIIlIllI[1];
        if (SquireJadFlicker.llllIIIIlI(n2)) {
            return;
        }
        Prayer llIIllIIIlIlIlI = llIIllIIIlIllIl.fq.get(Static.getClient().getTickCount());
        if (SquireJadFlicker.llllIIIIll(llIIllIIIlIlIlI)) {
            llIIllIIIlIllIl.fr = llIIllIIIlIlIlI;
        }
        if (SquireJadFlicker.llllIIIlII(Prayers.isEnabled((Prayer)llIIllIIIlIllIl.fr) ? 1 : 0)) {
            Prayers.toggle((Prayer)llIIllIIIlIllIl.fr);
        }
    }

    private static boolean llllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIIIlII(int n2) {
        return n2 == 0;
    }

    private static String lllIlllIIl(String llIIllIIIIIllII, String llIIllIIIIIlllI) {
        try {
            SecretKeySpec llIIllIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIIIIlIIll = Cipher.getInstance("Blowfish");
            llIIllIIIIlIIll.init(lIIIlIllI[4], llIIllIIIIlIlII);
            return new String(llIIllIIIIlIIll.doFinal(Base64.getDecoder().decode(llIIllIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIIIIlIIIl) {
            llIIllIIIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIll(Object object) {
        return object != null;
    }

    private static boolean llllIIIlIl(int n2) {
        return n2 != 0;
    }

    protected Class<?>[] tasks() {
        return new Class[lIIIlIllI[0]];
    }

    public SquireJadFlicker() {
        this.fq = new HashMap<Integer, Prayer>();
        this.fr = Prayer.PROTECT_FROM_MAGIC;
        this.fs = lIIIlIllI[0];
    }

    protected void onStop() {
    }
}

