/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Warden Prayers", register=true)
public class HandlingWardenPrayersTask
extends ToaTaskBase {
    
    private  Prayer ba;

    @Override
    public boolean C() {
        int[] nArray = new int[lIIlllllllllI[1]];
        nArray[G.lIIlllllllllI[2]] = lIIlllllllllI[3];
        nArray[G.lIIlllllllllI[4]] = lIIlllllllllI[5];
        nArray[G.lIIlllllllllI[6]] = lIIlllllllllI[7];
        nArray[G.lIIlllllllllI[8]] = lIIlllllllllI[9];
        nArray[G.lIIlllllllllI[10]] = lIIlllllllllI[11];
        nArray[G.lIIlllllllllI[12]] = lIIlllllllllI[13];
        return this.aS.a(nArray);
    }

    @Override
    public List<Prayer> E() {
        if (G.lIllIlIllIIllIl(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickWarden();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var1;
        Actor actor = animationChanged.getActor();
        if (G.lIllIlIllIIlllI(actor instanceof Player)) {
            return;
        }
        if (G.lIllIlIllIIllll(var1.getAnimation(), lIIlllllllllI[14])) {
            var2.ba = Prayer.PROTECT_FROM_MISSILES;

            }
        } else if (G.lIllIlIllIIllll(var1.getAnimation(), lIIlllllllllI[15])) {
            var2.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if (G.lIllIlIllIlIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var4 = var3.getMessage();
        if (G.lIllIlIllIIlllI(var4.contains(lIIllllllllIl[lIIlllllllllI[2]]) ? 1 : 0)) {
            var5.ba = Prayer.PROTECT_FROM_MELEE;

            if (1 < 0) {
                return;
            }
        } else if (G.lIllIlIllIIlllI(var4.contains(lIIllllllllIl[lIIlllllllllI[4]]) ? 1 : 0)) {
            var5.ba = Prayer.PROTECT_FROM_MAGIC;

            if (2 < ((0x5B ^ 0x6B) & ~(0x2F ^ 0x1F))) {
                return;
            }
        } else if (G.lIllIlIllIIlllI(var4.contains(lIIllllllllIl[lIIlllllllllI[6]]) ? 1 : 0)) {
            var5.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean lIllIlIllIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIllIIlIll() {
        lIIllllllllIl = new String[lIIlllllllllI[8]];
        G.lIIllllllllIl[G.lIIlllllllllI[2]] = "scimitar";
        G.lIIllllllllIl[G.lIIlllllllllI[4]] = "skull";
        G.lIIllllllllIl[G.lIIlllllllllI[6]] = "arrow";
    }

    private static boolean lIllIlIllIlIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIllIlIllIIlllI(int n2) {
        return n2 != 0;
    }

    static {
        G.lIllIlIllIIllII();
        G.lIllIlIllIIlIll();
    }

    @Override
    public int F() {
        return lIIlllllllllI[0];
    }

    @Inject
    public HandlingWardenPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }
}

