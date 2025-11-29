/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum95;

@TaskDesc(name="Using sun keris special", priority=1500)
public class UsingSunKerisSpecialTask
extends AutotoaTaskBase {
    @Inject
    protected  TOAConfig d;
    private final  C cT;

    private final  SquireAutoTOA cS;

    private static void lIIlllIIIlllll() {
        llIIIIIIlIl = new String[llIIIIIlIII[7]];
        an.llIIIIIIlIl[an.llIIIIIlIII[0]] = "Obelisk";
    }

    private static boolean lIIlllIIlIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        an.lIIlllIIlIIlII();
        an.lIIlllIIIlllll();
    }

    private static boolean lIIlllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected UsingSunKerisSpecialTask(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cS = squireAutoTOA;
        this.cT = c2;
    }

    private static boolean lIIlllIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        an var1;
        NPC nPC = this.cS.b();
        if (an.lIIlllIIlIIlIl(nPC) && an.lIIlllIIlIIllI(nPC.getName().contains(llIIIIIIlIl[llIIIIIlIII[0]]) ? 1 : 0) && an.lIIlllIIlIIllI(this.d.dehydration() ? 1 : 0)) {
            return llIIIIIlIII[0];
        }
        if (an.lIIlllIIlIIllI(var1.aq() ? 1 : 0) && an.lIIlllIIlIIlll(var1.be() ? 1 : 0)) {
            if (an.lIIlllIIlIlIII(var1.aX(), llIIIIIlIII[1]) && an.lIIlllIIlIlIIl(Combat.getSpecEnergy(), llIIIIIlIII[2]) && an.lIIlllIIlIlIlI(Combat.getCurrentHealth(), llIIIIIlIII[3])) {
                return llIIIIIlIII[0];
            }
            if (an.lIIlllIIlIlIll(var1.aX(), llIIIIIlIII[4])) {
                return llIIIIIlIII[0];
            }
            if (an.lIIlllIIlIllII(var1.aX(), llIIIIIlIII[4]) && an.lIIlllIIlIIllI(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
                return llIIIIIlIII[0];
            }
            var1.cS.a(llIIIIIlIII[5]);
        }
        if (an.lIIlllIIlIIllI(var1.be() ? 1 : 0)) {
            var1.cS.a(llIIIIIlIII[6]);
        }
        if (an.lIIlllIIlIlIlI(Combat.getCurrentHealth(), var1.cS.f())) {
            var1.cS.c();
            return llIIIIIlIII[0];
        }
        return this.ba();
    }
}

