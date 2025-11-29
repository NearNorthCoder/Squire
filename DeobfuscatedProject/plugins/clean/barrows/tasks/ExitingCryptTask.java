/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Exiting crypt", priority=150, blocking=true)
public class ExitingCryptTask
extends Task {

    private final  SquireBarrows W;

    private static boolean lIllIlIlllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIlllIllI(int n2) {
        return n2 != 0;
    }

    static {
        p.lIllIlIlllIIII();
        p.lIllIlIllIllll();
    }

    private static boolean lIllIlIlllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIllll() {
        llllIlIlIll = new String[llllIlIllII[3]];
        p.llllIlIlIll[p.llllIlIllII[0]] = "Staircase";
        p.llllIlIlIll[p.llllIlIllII[2]] = "Climb-up";
    }

    @Inject
    public ExitingCryptTask(SquireBarrows squireBarrows) {
        this.W = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        p var1;
        if (p.lIllIlIlllIIIl(this.W.h() ? 1 : 0)) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(var1.W.a(var1.W.s()) ? 1 : 0) && p.lIllIlIlllIIlI((Object)var1.W.r())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIIIl(var1.W.a(var1.W.s()) ? 1 : 0) && p.lIllIlIlllIIll((Object)var1.W.r(), (Object)var1.W.s())) {
            return llllIlIllII[0];
        }
        if (p.lIllIlIlllIlII((Object)var1.W.r(), (Object)var1.W.s())) {
            int var2 = llllIlIllII[0];
            d[] var3 = d.values();
            int var4 = var3.length;
            int var5 = llllIlIllII[0];
            while (p.lIllIlIlllIlIl(var5, var4)) {
                d var6 = var3[var5];
                if (p.lIllIlIlllIllI(var1.W.a(var6) ? 1 : 0)) {
                    ++var2;
                }
                ++var5;

                return false;
            }
            if (p.lIllIlIlllIlll(var2, llllIlIllII[1])) {
                return llllIlIllII[0];
            }
        }
        String[] stringArray = new String[llllIlIllII[2]];
        stringArray[p.llllIlIllII[0]] = llllIlIlIll[llllIlIllII[0]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (p.lIllIlIlllIIlI(var2)) {
            return llllIlIllII[0];
        }
        var1_2.interact(llllIlIlIll[llllIlIllII[2]]);
        return llllIlIllII[2];
    }

    private static boolean lIllIlIlllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var7);
    }

    private static boolean lIllIlIlllIIlI(Object object) {
        return object == null;
    }
}

