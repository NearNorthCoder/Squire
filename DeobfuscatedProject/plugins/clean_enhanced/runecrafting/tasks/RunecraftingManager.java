/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.MenuAutomated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum3;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuAutomated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RunecraftingManager {
    
    private  e b;
    
    private static final  Logger a;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void RunecraftingManager(MenuAutomated menuAutomated) {
        void var3_3;
        void var3;
        if (g.r.r.-.t.q.i.u.o.e.s.(menuAutomated.getTarget( == 0).contains(var2[0]) ? 1 : 0)) {
            return;
        }
        int var4 = Integer.parseInt(var3.getTarget().replace(var2[1], var2[2]).trim());
        e var5 = e.c(var4);
        if (g.r.r.-.t.q.i.u.o.e.s.(Object == nulllllllllllllllllIlIIlIllIllIIIllI)) {
            return;
        }
        this.b = var3_3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void RunecraftingManager(ChatMessage chatMessage) {
        a var14;
        void var15;
        if (g.r.r.-.t.q.i.u.o.e.s.(chatMessage.getType() != chatMessage.getType()2) && g.r.r.-.t.q.i.u.o.e.s.(chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.(var15.getMessage( == 0).startsWith(var2[4]) ? 1 : 0)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.(Object == nulllllllllllllllllIlIIlIllIlIllllIl.b)) {
            // empty if block
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=20.0f)
    public void RunecraftingManager(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void var16;
        if (g.r.r.-.t.q.i.u.o.e.s.(menuOptionClicked.getItemId() == 3)) {
            return;
        }
        e var17 = e.c(var16.getItemId());
        if (g.r.r.-.t.q.i.u.o.e.s.(Object == nulllllllllllllllllIlIIlIllIllIIIIII)) {
            return;
        }
        this.b = var2_2;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = 0;
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = 0;
        while (g.r.r.-.t.q.i.u.o.e.s.(var32 < var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var27);
    }
}

