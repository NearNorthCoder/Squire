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
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.unethicalite.api.entities.NPCs;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Warden Prayers", register=true, priority=0x7FFFFFFF)
public class HandlingWardenPrayersTask
extends AutotoaTaskBase {
    private  Prayer dE;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (aE.lIlIlIIIllIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var2 = var1.getMessage();
        if (aE.lIlIlIIIllIIIl(var2.contains(llIlIllllll[llIllIIIIll[2]]) ? 1 : 0)) {
            var3.dE = Prayer.PROTECT_FROM_MELEE;

            if ((0xE6 ^ 0xA4 ^ (0xD4 ^ 0x92)) <= 2) {
                return;
            }
        } else if (aE.lIlIlIIIllIIIl(var2.contains(llIlIllllll[llIllIIIIll[4]]) ? 1 : 0)) {
            var3.dE = Prayer.PROTECT_FROM_MAGIC;

            if (-1 > ((0x8C ^ 0xB6) & ~(0x36 ^ 0xC))) {
                return;
            }
        } else if (aE.lIlIlIIIllIIIl(var2.contains(llIlIllllll[llIllIIIIll[1]]) ? 1 : 0)) {
            var3.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int aO() {
        return llIllIIIIll[0];
    }

    @Inject
    public HandlingWardenPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static boolean lIlIlIIIllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIIlIllll(Object object) {
        return object == null;
    }

    private static void lIlIlIIIlIllIl() {
        llIlIllllll = new String[llIllIIIIll[10]];
        aE.llIlIllllll[aE.llIllIIIIll[2]] = "scimitar";
        aE.llIlIllllll[aE.llIllIIIIll[4]] = "skull";
        aE.llIlIllllll[aE.llIllIIIIll[1]] = "arrow";
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIlIlIIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[llIllIIIIll[1]];
        nArray[aE.llIllIIIIll[2]] = llIllIIIIll[3];
        nArray[aE.llIllIIIIll[4]] = llIllIIIIll[5];
        if (aE.lIlIlIIIllIIII(NPCs.getNearest((int[])nArray))) {
            return llIllIIIIll[4];
        }
        int[] nArray2 = new int[llIllIIIIll[6]];
        nArray2[aE.llIllIIIIll[2]] = llIllIIIIll[7];
        nArray2[aE.llIllIIIIll[4]] = llIllIIIIll[8];
        nArray2[aE.llIllIIIIll[1]] = llIllIIIIll[9];
        nArray2[aE.llIllIIIIll[10]] = llIllIIIIll[11];
        nArray2[aE.llIllIIIIll[12]] = llIllIIIIll[13];
        nArray2[aE.llIllIIIIll[14]] = llIllIIIIll[15];
        return this.cm.a(nArray2);
    }

    private static boolean lIlIlIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var4;
        Actor actor = animationChanged.getActor();
        if (aE.lIlIlIIIllIIIl(actor instanceof Player)) {
            return;
        }
        if (aE.lIlIlIIIllIIlI(var4.getAnimation(), llIllIIIIll[16])) {
            var5.dE = Prayer.PROTECT_FROM_MISSILES;

            }
        } else if (aE.lIlIlIIIllIIlI(var4.getAnimation(), llIllIIIIll[17])) {
            var5.dE = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    static {
        aE.lIlIlIIIlIlllI();
        aE.lIlIlIIIlIllIl();
    }

    @Override
    public List<Prayer> aN() {
        if (aE.lIlIlIIIlIllll(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }
}

