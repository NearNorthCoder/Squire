/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.GameEnum16;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Retort task")
public class RetortTask
extends Task {
    
    final  int U = 5672;
    private final  SquireMixologyConfig V;

    private static boolean lIIlIlIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIllIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlIllIlllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        l var1;
        if (l.lIIlIlIllIllIII(s.e() ? 1 : 0)) {
            return llllllllIllI[1];
        }
        int[] nArray = new int[llllllllIllI[2]];
        nArray[l.llllllllIllI[1]] = llllllllIllI[3];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (l.lIIlIlIllIllIII(var1.a(var2) ? 1 : 0)) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIIl((Object)var1.V.pluginMode(), (Object)d.MINIGAME)) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIIl((Object)var1.V.potionStrategy(), (Object)f.MULTI_ORDER) && l.lIIlIlIllIllIlI(SquireMixology.r, llllllllIllI[0])) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIll((Object)var1.V.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (l.lIIlIlIllIllIII(var1.a(var2) ? 1 : 0)) {
                return llllllllIllI[1];
            }
            s.j();
            if (l.lIIlIlIllIllIlI(SquireMixology.x, llllllllIllI[0])) {
                return llllllllIllI[1];
            }
        }
        SquireMixology.g = llllllllIlIl[llllllllIllI[1]];
        int[] nArray2 = new int[llllllllIllI[2]];
        nArray2[l.llllllllIllI[1]] = llllllllIllI[3];
        TileObjects.getNearest((int[])nArray2).interact(llllllllIllI[1]);
        return llllllllIllI[1];
    }

    private static void lIIlIlIllIlIllI() {
        llllllllIlIl = new String[llllllllIllI[2]];
        l.llllllllIlIl[l.llllllllIllI[1]] = "Retorting";
    }

    private static boolean lIIlIlIllIllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIllIllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIllIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public RetortTask(SquireMixologyConfig squireMixologyConfig) {
        this.U = llllllllIllI[0];
        this.V = squireMixologyConfig;
    }

    private boolean a(TileObject tileObject) {
        int n2;
        if (l.lIIlIlIllIlllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllllllIllI[2])) {
            n2 = llllllllIllI[2];

            if (2 < ((0x2A ^ 6 ^ (0x3D ^ 0x20)) & (0x19 ^ 0x36 ^ (0x22 ^ 0x3C) ^ -1))) {
                return ((0xA8 ^ 0x83 ^ (0x6C ^ 3)) & (0x1E ^ 0x14 ^ (0xC1 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllIllI[1];
        }
        int var3 = n2;
        int n3 = Players.getLocal().isAnimating();
        if (l.lIIlIlIllIlllIl(var3) && l.lIIlIlIllIlllIl(n3)) {
            return llllllllIllI[2];
        }
        if (l.lIIlIlIllIllllI(Vars.getBit((int)llllllllIllI[4]))) {
            return llllllllIllI[2];
        }
        if (l.lIIlIlIllIllIII(s.g() ? 1 : 0)) {
            return llllllllIllI[1];
        }
        return llllllllIllI[2];
    }

    static {
        l.lIIlIlIllIlIlll();
        l.lIIlIlIllIlIllI();
    }
}

