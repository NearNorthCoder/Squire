/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.NPCs;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Handling fires", priority=20, blocking=true)
public class HandlingFiresTask
extends TemporossTaskBase {

    static {
        i.lIllIIlIIlllllI();
        i.lIllIIlIIlllIIl();
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIll = new String[lIIlllIIIllIl[5]];
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[2]] = "dousing fire to get to proper fire!";
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[0]] = "Douse";
    }

    private static boolean lIllIIlIlIIIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ak() {
        int n2;
        if (i.lIllIIlIIllllll(this.ar.E(), lIIlllIIIllIl[0]) && i.lIllIIlIIllllll(this.au.b(), lIIlllIIIllIl[1]) && i.lIllIIlIlIIIIII(this.ar.I() ? 1 : 0)) {
            n2 = lIIlllIIIllIl[0];

            }
        } else {
            n2 = lIIlllIIIllIl[2];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        i var1;
        void var2;
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), nPC -> {
            int n2;
            if (i.lIllIIlIlIIIIlI(nPC.getId(), lIIlllIIIllIl[4])) {
                String[] stringArray = new String[lIIlllIIIllIl[0]];
                stringArray[i.lIIlllIIIllIl[2]] = lIIlllIIIlIll[lIIlllIIIllIl[0]];
                if (i.lIllIIlIlIIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIllIl[0];

                    if (((81 + 40 - 115 + 213 ^ 22 + 115 - 80 + 87) & (0x75 ^ 0x3B ^ (0x84 ^ 0x81) ^ -1)) >= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllIIIllIl[2];
            return n2 != 0;
        });
        if (i.lIllIIlIlIIIIIl(nPC2)) {
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIIllllll(var2.distanceTo(var1.ar.N().ag()), lIIlllIIIllIl[3])) {
            var1.ar.a(lIIlllIIIllIl[2]);
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIlIIIIII(var1.au.a((Locatable)var2) ? 1 : 0)) {
            System.out.println(lIIlllIIIlIll[lIIlllIIIllIl[2]]);
            var1.au.b((SceneEntity)var2);

            return lIIlllIIIllIl[0];
        }
        this.au.b(nPC2);

        return lIIlllIIIllIl[0];
    }

    @Inject
    protected HandlingFiresTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIIlIIllllll(int n2, int n3) {
        return n2 > n3;
    }
}

