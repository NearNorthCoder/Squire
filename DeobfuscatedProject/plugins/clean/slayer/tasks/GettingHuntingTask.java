/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.slayer.tasks.GameEnum7;

@TaskDesc(name="Getting Hunting Task", priority=10, register=true, blocking=true)
public class GettingHuntingTask
extends Task {
    private final  SquireSkipperPlugin E;
    private final  SquireSkipperConfig D;

        return String.valueOf(var1);
    }

    private static boolean lIlllIlIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public GettingHuntingTask(SquireSkipperConfig squireSkipperConfig, SquireSkipperPlugin squireSkipperPlugin) {
        this.D = squireSkipperConfig;
        this.E = squireSkipperPlugin;
    }

    private static boolean lIlllIlIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIlllIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean GettingHuntingTask(String string) {
        String string2 = this.D.huntTaskName();
        if (j.lIlllIlIlllIIlI(string2.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[4]]) ? 1 : 0)) {
            void var2;
            String[] stringArray;
            String[] stringArray2 = stringArray = string2.split(lIlIIlIlIIIII[lIlIIlIlIIIIl[2]]);
            int n2 = stringArray2.length;
            int var3 = lIlIIlIlIIIIl[0];
            while (j.lIlllIlIlllIIll(var3, (int)var2)) {
                void var4;
                void var5;
                void var6 = var5[var3];
                if (j.lIlllIlIlllIIlI(var4.toLowerCase().contains(var6.trim().toLowerCase()) ? 1 : 0)) {
                    return lIlIIlIlIIIIl[1];
                }
                ++var3;

                if (-2 <= 0) continue;
                return ((0xF0 ^ 0x83 ^ (0x60 ^ 0x73)) & (159 + 134 - 154 + 27 ^ 13 + 131 - 10 + 64 ^ -1)) != 0;
            }
        }
        return string.toLowerCase().contains(string2.trim().toLowerCase());
    }

    private static boolean lIlllIlIlllIlII(Object object) {
        return object == null;
    }

    static {
        j.lIlllIlIllIllll();
        j.lIlllIlIllIlllI();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        j var7;
        void var8;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.GAMEMESSAGE) && j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        String var9 = Text.removeTags((String)var8.getMessage());
        Log.info((String)("Actual message: " + var9));
        if (j.lIlllIlIlllIIlI(var9.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[5]]) ? 1 : 0)) {
            var7.E.a(lIlIIlIlIIIIl[1]);
            var7.E.b(lIlIIlIlIIIIl[1]);
        }
        if (j.lIlllIlIlllIIlI(var7.GettingHuntingTask(var9) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[6]]);
            var7.E.forceStop();
        }
    }

    private static void lIlllIlIllIlllI() {
        lIlIIlIlIIIII = new String[lIlIIlIlIIIIl[8]];
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[0]] = "Stopping, found the hunted task!";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[1]] = "Cant find hunting master";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[3]] = "Assignment";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[4]] = ",";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[2]] = ",";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[5]] = "Contact a Slayer Master to decide";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[6]] = "Stopping, found the hunted task!";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[7]] = "Assignment";
    }

    private static boolean lIlllIlIlllIlIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j var10;
        if (j.lIlllIlIlllIIII(this.D.huntTask() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIIl((Object)var10.E.b()) && j.lIlllIlIlllIIlI(var10.GettingHuntingTask(var10.E.b().m()) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[0]]);
            var10.E.forceStop();
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(var10.E.d() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIII(var10.E.c() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        a var11 = var10.D.taskMaster();
        if (j.lIlllIlIlllIIll(var11.k().distanceTo((Locatable)Players.getLocal()), lIlIIlIlIIIIl[2])) {
            NPC var12 = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[lIlIIlIlIIIIl[1]];
                stringArray[j.lIlIIlIlIIIIl[0]] = lIlIIlIlIIIII[lIlIIlIlIIIIl[7]];
                return nPC.hasAction(stringArray);
            });
            if (j.lIlllIlIlllIlII(var12)) {
                Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[1]]);
                return lIlIIlIlIIIIl[0];
            }
            var12.interact(lIlIIlIlIIIII[lIlIIlIlIIIIl[3]]);
            var10.sleep(lIlIIlIlIIIIl[3]);
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var11.k());

        }
        return lIlIIlIlIIIIl[1];
    }

    private static boolean lIlllIlIlllIIIl(Object object) {
        return object != null;
    }
}

