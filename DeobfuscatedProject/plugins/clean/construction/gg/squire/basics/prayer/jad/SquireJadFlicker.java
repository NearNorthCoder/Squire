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
    private  int fs;
    
    private  Prayer fr;
    private final  Map<Integer, Prayer> fq;
    private static final  Logger fp;

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

            if (-1 > 1) {
                return;
            }
        } else if (!SquireJadFlicker.llllIIIllI((int)llIIllIIIIllIlI, lIIIlIllI[5]) || SquireJadFlicker.llllIIIlll((int)llIIllIIIIllIlI, lIIIlIllI[6])) {
            llIIllIIIIlllII.fq.put(Static.getClient().getTickCount() + lIIIlIllI[4], Prayer.PROTECT_FROM_MISSILES);

        }
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC nPC;
        if (SquireJadFlicker.llllIIIlIl(animationChanged.getActor() instanceof NPC) && SquireJadFlicker.llllIIIIll((nPC = (NPC)animationChanged.getActor()).getName()) && SquireJadFlicker.llllIIIlIl(nPC.getName().toLowerCase().contains(lIIIlIlII[lIIIlIllI[0]]) ? 1 : 0)) {
            this.k(nPC);
        }
    }

    private static void lllIlllIll() {
        lIIIlIlII = new String[lIIIlIllI[1]];
        SquireJadFlicker.lIIIlIlII[SquireJadFlicker.lIIIlIllI[0]] = "jad";
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

