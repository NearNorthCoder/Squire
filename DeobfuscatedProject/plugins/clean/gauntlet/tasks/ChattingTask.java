/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.input.Keyboard
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.input.Keyboard;

@TaskDesc(name="Chatting", priority=50, blocking=true, register=true)
public class ChattingTask
extends GauntletTaskBase {
    
    private  String ch;
    private  boolean cj;
    
    private  int ci;

    private static boolean llllllIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean llllllIIIlllII(int n2) {
        return n2 != 0;
    }

    static {
        X.llllllIIIllIlI();
        X.llllllIIIllIIl();
    }

    @Inject
    public ChattingTask(c c2) {
        d[] dArray = new d[llIIlIllllll[0]];
        dArray[X.llIIlIllllll[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.ch = null;
        this.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
        this.cj = llIIlIllllll[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        X var2;
        String var3;
        int var4;
        int n2;
        void var5;
        if (!X.llllllIIIlllII(this.ba.h().enableChatting() ? 1 : 0) || X.llllllIIIlllII(this.ba.A() ? 1 : 0)) {
            return;
        }
        if (X.llllllIIIlllll(var5.getType(), ChatMessageType.GAMEMESSAGE) && X.llllllIIIlllll(var5.getType(), ChatMessageType.SPAM) && X.llllllIIIlllll(var5.getType(), ChatMessageType.CONSOLE) && X.llllllIIIlllll(var5.getType(), ChatMessageType.ENGINE)) {
            n2 = llIIlIllllll[0];

            }
        } else {
            n2 = var4 = llIIlIllllll[1];
        }
        if (X.llllllIIIlllII((var3 = var5.getMessage().toLowerCase()).contains(llIIlIlllIlI[llIIlIllllll[1]]) ? 1 : 0)) {
            var2.cj = llIIlIllllll[1];
            return;
        }
        String[] var6 = var2.ba.h().messagesAfterLoot().split(llIIlIlllIlI[llIIlIllllll[0]]);
        if (X.llllllIIIlllII(var4) && X.llllllIIIlllII(var3.contains(Players.getLocal().getName().toLowerCase()) ? 1 : 0)) {
            String[] var7 = var6;
            int var8 = var7.length;
            int var9 = llIIlIllllll[1];
            while (X.llllllIIlIIIII(var9, var8)) {
                String var10 = var7[var9];
                String[] var11 = var10.split(llIIlIlllIlI[llIIlIllllll[2]]);
                if (X.llllllIIIllIll(var3.contains(var11[llIIlIllllll[1]].toLowerCase()) ? 1 : 0)) {

                    if (1 == ((0x75 ^ 0x21) & ~(0x44 ^ 0x10))) {
                        return;
                    }
                } else {
                    String[] var12 = var11[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[4]]);
                    int var13 = Rand.nextInt((int)llIIlIllllll[1], (int)(var12.length - llIIlIllllll[0]));
                    var2.ch = var12[var13];
                    var2.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);

                    if (3 >= 0) break;
                    return;
                }
                ++var9;

                if (2 > -1) continue;
                return;
            }
            return;
        }
        var6 = var2.ba.h().messagesAfterChat().split(llIIlIlllIlI[llIIlIllllll[5]]);
        if (X.llllllIIIlllII(var4)) {
            String[] var7 = var6;
            int var8 = var7.length;
            int var9 = llIIlIllllll[1];
            while (X.llllllIIlIIIII(var9, var8)) {
                String var10 = var7[var9];
                String[] var11 = var10.split(llIIlIlllIlI[llIIlIllllll[6]]);
                if (X.llllllIIIllIll(var3.contains(var11[llIIlIllllll[1]].strip().toLowerCase()) ? 1 : 0)) {

                } else {
                    int n3;
                    String[] var12 = var11[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[3]]);
                    if (X.llllllIIlIIIIl(var12.length, llIIlIllllll[0])) {
                        n3 = llIIlIllllll[1];

                    } else {
                        n3 = Rand.nextInt((int)llIIlIllllll[1], (int)var12.length);
                    }
                    int var13 = n3;
                    var2.ch = var12[var13];
                    var2.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
                    return;
                }
                ++var9;

                if ((0x16 ^ 0 ^ (0x56 ^ 0x44)) >= 1) continue;
                return;
            }
        }
    }

    private static boolean llllllIIIlllIl(Object object) {
        return object == null;
    }

    private static boolean llllllIIIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIIIllllI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean be() {
        X var14;
        if (X.llllllIIIllIll(this.ba.h().enableChatting() ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllII(var14.cj ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllIl(var14.ch)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIllllI(var14.ci)) {
            var14.ci -= llIIlIllllll[0];
            return llIIlIllllll[0];
        }
        Keyboard.type((String)this.ch, (boolean)llIIlIllllll[0]);
        this.ch = null;
        this.cj = llIIlIllllll[0];
        return llIIlIllllll[0];
    }

    @Override
    public boolean bf() {
        return llIIlIllllll[0];
    }

    private static void llllllIIIllIIl() {
        llIIlIlllIlI = new String[llIIlIllllll[7]];
        X.llIIlIlllIlI[X.llIIlIllllll[1]] = "you enter the gauntlet";
        X.llIIlIlllIlI[X.llIIlIllllll[0]] = ",";
        X.llIIlIlllIlI[X.llIIlIllllll[2]] = ":";
        X.llIIlIlllIlI[X.llIIlIllllll[4]] = ";";
        X.llIIlIlllIlI[X.llIIlIllllll[5]] = ",";
        X.llIIlIlllIlI[X.llIIlIllllll[6]] = ":";
        X.llIIlIlllIlI[X.llIIlIllllll[3]] = ";";
    }

    private static boolean llllllIIIlllll(Object object, Object object2) {
        return object != object2;
    }
}

