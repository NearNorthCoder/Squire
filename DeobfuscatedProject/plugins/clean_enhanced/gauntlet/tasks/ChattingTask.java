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
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Inject
    public ChattingTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.OUTSIDE;
        super(c2, dArray);
        this.ch = null;
        this.ci = Rand.nextInt((int)2, (int)3);
        this.cj = 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        X var25;
        String var26;
        int var27;
        int n2;
        void var28;
        if (!(this.ba.h( != 0).enableChatting() ? 1 : 0) || (this.ba.A( != 0) ? 1 : 0)) {
            return;
        }
        if ((var28.getType() != var28.getType()2) && (var28.getType() != var28.getType()2) && (var28.getType() != var28.getType()2) && (var28.getType() != var28.getType()2)) {
            n2 = 0;
            0;
            if null != null {
                return;
            }
        } else {
            n2 = var27 = 1;
        }
        if (((var26 = var28.getMessage( != 0).toLowerCase()).contains(var1[1]) ? 1 : 0)) {
            var25.cj = 1;
            return;
        }
        String[] var29 = var25.ba.h().messagesAfterLoot().split(var1[0]);
        if (var27 && (var26.contains(Players.getLocal( != 0).getName().toLowerCase()) ? 1 : 0)) {
            String[] var30 = var29;
            int var31 = var30.length;
            int var32 = 1;
            while (var32 < var31) {
                String var33 = var30[var32];
                String[] var34 = var33.split(var1[2]);
                if ((var26.contains(var34[1].toLowerCase( == 0)) ? 1 : 0)) {
                    0;
                    if (1 == ((0x75 ^ 0x21) & ~(0x44 ^ 0x10))) {
                        return;
                    }
                } else {
                    String[] var35 = var34[0].split(var1[4]);
                    int var36 = Rand.nextInt((int)1, (int)(var35.length - 0));
                    var25.ch = var35[var36];
                    var25.ci = Rand.nextInt((int)2, (int)3);
                    0;
                    if (3 >= 0) break;
                    return;
                }
                ++var32;
                0;
                if (2 > -1) continue;
                return;
            }
            return;
        }
        var29 = var25.ba.h().messagesAfterChat().split(var1[5]);
        if var27 {
            String[] var30 = var29;
            int var31 = var30.length;
            int var32 = 1;
            while (var32 < var31) {
                String var33 = var30[var32];
                String[] var34 = var33.split(var1[6]);
                if ((var26.contains(var34[1].strip( == 0).toLowerCase()) ? 1 : 0)) {
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                } else {
                    int n3;
                    String[] var35 = var34[0].split(var1[3]);
                    if (var35.length == 0) {
                        n3 = 1;
                        0;
                        if (-3 >= 0) {
                            return;
                        }
                    } else {
                        n3 = Rand.nextInt((int)1, (int)var35.length);
                    }
                    int var36 = n3;
                    var25.ch = var35[var36];
                    var25.ci = Rand.nextInt((int)2, (int)3);
                    return;
                }
                ++var32;
                0;
                if ((0x16 ^ 0 ^ (0x56 ^ 0x44)) >= 1) continue;
                return;
            }
        }
    }

    @Override
    public boolean be() {
        X var37;
        if ((this.ba.h( == 0).enableChatting() ? 1 : 0)) {
            return 1;
        }
        if (var37.cj != 0) {
            return 1;
        }
        if (var37.ch == null) {
            return 1;
        }
        if (var37.ci > 0) {
            var37.ci -= 0;
            return 0;
        }
        Keyboard.type((String)this.ch, (boolean)0);
        this.ch = null;
        this.cj = 0;
        return 0;
    }

    @Override
    public boolean bf() {
        return 0;
    }

}

