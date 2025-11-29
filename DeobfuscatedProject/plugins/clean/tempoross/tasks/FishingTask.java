/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Fishing", priority=7, blocking=true)
public class FishingTask
extends TemporossTaskBase {

    private static void lIllIIIlIlIllll() {
        lIIllIllIllIl = new String[lIIllIllIlllI[2]];
        j.lIIllIllIllIl[j.lIIllIllIlllI[1]] = "Shadow danger in fishin!";
        j.lIIllIllIllIl[j.lIIllIllIlllI[0]] = "Harpoon";
    }

    private static boolean lIllIIIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ak() {
        int n2;
        if (j.lIllIIIlIllIIIl(this.ar.L() ? 1 : 0) && j.lIllIIIlIllIIlI(this.au.f(), this.as.numberOfFish())) {
            n2 = lIIllIllIlllI[0];

            }
        } else {
            n2 = lIIllIllIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIlIllIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected FishingTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        j.lIllIIIlIllIIII();
        j.lIllIIIlIlIllll();
    }

    private static boolean lIllIIIlIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIlIllIIll(Object object) {
        return object == null;
    }

    public boolean b(c c2) {
        if (j.lIllIIIlIllIlII(this.au.a(c2.ag()) ? 1 : 0)) {
            return this.au.e(c2.ag());
        }
        this.au.b(c2.ag());

        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var5_5;
        void var1;
        j var2;
        Player player = Players.getLocal();
        if (j.lIllIIIlIllIIll(player)) {
            return lIIllIllIlllI[1];
        }
        int var3 = var2.au.a();
        c var4 = var2.ar.N();
        if (j.lIllIIIlIllIIlI(var3, lIIllIllIlllI[2])) {
            return lIIllIllIlllI[1];
        }
        int[] nArray = new int[lIIllIllIlllI[0]];
        nArray[j.lIIllIllIlllI[1]] = lIIllIllIlllI[3];
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if (j.lIllIIIlIllIlII(var5 instanceof GameObject) && j.lIllIIIlIllIlII(((GameObject)var5).getWorldArea().contains(var1.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllIl[lIIllIllIlllI[1]]);
        }
        NPC var6 = null;
        if (j.lIllIIIlIllIIlI(var2.au.f(), var2.as.numberOfFish() - lIIllIllIlllI[4])) {
            var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlIl(lIIllIllIlllI[5], nPC.getId()) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(var4.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];

                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(var6)) {
            var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlII(Set.of(Integer.valueOf(lIIllIllIlllI[6]), Integer.valueOf(lIIllIllIlllI[7]), Integer.valueOf(lIIllIllIlllI[5])).contains(nPC.getId()) ? 1 : 0) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(var4.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];

                    if (-1 > 3) {
                        return ((153 + 42 - 192 + 162 ^ 138 + 34 - 64 + 34) & (0x4A ^ 9 ^ (0x16 ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(var6)) {
            return var2.b(var4);
        }
        if (j.lIllIIIlIllIlII(var2.au.a((Locatable)var6) ? 1 : 0) && j.lIllIIIlIllIlII(var2.au.c(var1.getWorldLocation()) ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        if (j.lIllIIIlIllIlII(var1.getInteracting() instanceof NPC) && j.lIllIIIlIllIlII(var2.au.c(var1.getWorldLocation()) ? 1 : 0) && (!j.lIllIIIlIllIlIl(var6.getId(), lIIllIllIlllI[5]) || j.lIllIIIlIllIlIl(var1.getInteracting().getId(), lIIllIllIlllI[5])) && j.lIllIIIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        var5_5.interact(lIIllIllIllIl[lIIllIllIlllI[0]]);
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

