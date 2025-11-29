/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Hitsplat
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.thieving.tasks.GameEnum;

@TaskDesc(name="Cancelling attacking bandit/thug", priority=8, blocking=true, register=true)
public class CancellingAttackingBanditthugTask
extends Task {
    private  boolean M;
    
    private final  SquireThievingConfig L;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var4;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!m.var5(hitsplat.getAmount(), var2[3]) || m.var6(hitsplat.getAmount(), var2[4])) {
            return;
        }
        if (m.var7(var4.getActor() instanceof NPC)) {
            return;
        }
        Player var8 = (Player)var4.getActor();
        if (m.var3(var8, Players.getLocal())) {
            return;
        }
        this.M = var2[1];
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private static void var9() {
        var2 = new int[6];
        m.var2[0] = (0x55 ^ 0x5E) & ~(0x28 ^ 0x23);
        m.var2[1] = 1;
        m.var2[2] = 2;
        m.var2[3] = 0x18 ^ 0x1C;
        m.var2[4] = 0xAA ^ 0xAF;
        m.var2[5] = 3;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    private static void var18() {
        var1 = new String[var2[3]];
        m.var1[m.var2[0]] = "Pickpocket";
        m.var1[m.var2[1]] = "during combat";
        m.var1[m.var2[2]] = "after combat";
        m.var1[m.var2[5]] = "Attack";
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    static {
        m.var9();
        m.var18();
    }

    private static boolean var5(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        m var20;
        if (m.var3((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return var2[0];
        }
        if (m.var10(var20.M)) {
            return var2[0];
        }
        Player var21 = Players.getLocal();
        NPC var22 = NPCs.getNearest(nPC -> {
            int n2;
            if (m.var23(nPC.getInteracting(), var21) && m.var7(nPC.hasAction(var1[var2[5]]::equals) ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (-1 != -1) {
                    return ((93 + 5 - 12 + 71 ^ 92 + 104 - 69 + 1) & (0xC9 ^ 0xB7 ^ (0x4E ^ 0x2D) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (m.var19(var22)) {
            var20.M = var2[0];
            return var2[1];
        }
        var2_2.interact(var1[var2[0]]);
        return var2[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void var24;
        if (m.var3((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return;
        }
        if (m.var3(var24.getType(), ChatMessageType.GAMEMESSAGE) && m.var3(var24.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var25 = var24.getMessage();
        if (!m.var10(var25.contains(var1[var2[1]]) ? 1 : 0) || m.var7(var25.contains(var1[var2[2]]) ? 1 : 0)) {
            var26.M = var2[1];
        }
    }

    private static boolean var23(Object object, Object object2) {
        return object == object2;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (m.var17(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (-(0x9B ^ 0x9E) < 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    @Inject
    public CancellingAttackingBanditthugTask(SquireThievingConfig squireThievingConfig) {
        this.L = squireThievingConfig;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }
}

