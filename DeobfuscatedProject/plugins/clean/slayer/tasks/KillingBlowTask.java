/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.NPCManager
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Killing Blow", blocking=true)
public class KillingBlowTask
extends Task {
    
    private final  SquireSkipperPlugin H;
    
    private final  NPCManager I;

    private static boolean lIlllIlIIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        l var1;
        if (l.lIlllIlIIIIllll(Players.getLocal().getInteracting())) {
            return lIlIIlIIIlIll[0];
        }
        b var2 = var1.H.b();
        if (l.lIlllIlIIIlIIII((Object)var2, (Object)b.LIZARDS)) {
            return lIlIIlIIIlIll[0];
        }
        List var3 = NPCs.getAll(nPC -> {
            int n2;
            if (l.lIlllIlIIIlIllI(nPC.getInteracting(), Players.getLocal())) {
                String[] stringArray = new String[lIlIIlIIIlIll[1]];
                stringArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIlI[lIlIIlIIIlIll[0]];
                if (l.lIlllIlIIIlIIlI(nPC.hasAction(stringArray) ? 1 : 0) && l.lIlllIlIIIlIlII(nPC.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIlIIIlIll[4])) {
                    n2 = lIlIIlIIIlIll[1];

                    if (((0xB0 ^ 0x98 ^ (0x82 ^ 0x8A)) & (87 + 52 - 124 + 146 ^ 66 + 40 - 93 + 116 ^ -1)) == 0) return n2 != 0;
                    return ((0x1D ^ 0x31 ^ (0x34 ^ 0x31)) & (91 + 2 - 64 + 99 ^ 13 + 168 - 113 + 101 ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIIlIll[0];
            return n2 != 0;
        });
        int[] nArray = new int[lIlIIlIIIlIll[1]];
        nArray[l.lIlIIlIIIlIll[0]] = lIlIIlIIIlIll[2];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (l.lIlllIlIIIlIIIl(var3.isEmpty() ? 1 : 0)) {
            Iterator var5 = var3.iterator();
            while (l.lIlllIlIIIlIIlI(var5.hasNext() ? 1 : 0)) {
                NPC var6 = (NPC)var5.next();
                int var7 = var1.b(var6);
                if (l.lIlllIlIIIlIIll(var7, lIlIIlIIIlIll[3]) && l.lIlllIlIIIlIlII(var7, lIlIIlIIIlIll[1])) {
                    System.out.println(var7);
                    NPC var8 = (NPC)var3.get(lIlIIlIIIlIll[0]);
                    if (l.lIlllIlIIIlIlIl(var4) && l.lIlllIlIIIlIllI(Players.getLocal().getInteracting(), var8)) {
                        var4.useOn((Actor)var8);
                        var1.sleep(lIlIIlIIIlIll[4]);
                        return lIlIIlIIIlIll[1];
                    }
                }

                if (1 == 1) continue;
                return ((0x44 ^ 0x32 ^ (0xB4 ^ 0x97)) & (0x85 ^ 0xAA ^ (0x5E ^ 0x24) ^ -1)) != 0;
            }
        }
        return lIlIIlIIIlIll[0];
    }

    static {
        l.lIlllIlIIIIlllI();
        l.lIlllIlIIIIllIl();
    }

    private static boolean lIlllIlIIIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIlIIIlIlll(int n2) {
        return n2 >= 0;
    }

    private static void lIlllIlIIIIllIl() {
        lIlIIlIIIlIlI = new String[lIlIIlIIIlIll[1]];
        l.lIlIIlIIIlIlI[l.lIlIIlIIIlIll[0]] = "Attack";
    }

    private static boolean lIlllIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIIIlIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlllIlIIIllIII(int n2) {
        return n2 <= 0;
    }

    /*
     * WARNING - void declaration
     */
    private int b(NPC nPC) {
        void var2_2;
        void var3_3;
        void var4_4;
        l var9;
        void var10;
        if (!l.lIlllIlIIIlIlIl(nPC) || l.lIlllIlIIIIllll(nPC.getName())) {
            return lIlIIlIIIlIll[3];
        }
        int var11 = var10.getHealthScale();
        int var12 = var10.getHealthRatio();
        Integer var13 = var9.I.getHealth(var10.getId());
        if (!l.lIlllIlIIIlIlll(var12) || l.lIlllIlIIIllIII(var11)) {
            return lIlIIlIIIlIll[3];
        }
        return (int)((float)(var4_4.intValue() * var3_3 / var2_2) + 0.5f);
    }

    private static boolean lIlllIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIIIlIllI(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public KillingBlowTask(SquireSkipperPlugin squireSkipperPlugin, NPCManager nPCManager) {
        this.H = squireSkipperPlugin;
        this.I = nPCManager;
    }

    private static boolean lIlllIlIIIlIlIl(Object object) {
        return object != null;
    }
}

