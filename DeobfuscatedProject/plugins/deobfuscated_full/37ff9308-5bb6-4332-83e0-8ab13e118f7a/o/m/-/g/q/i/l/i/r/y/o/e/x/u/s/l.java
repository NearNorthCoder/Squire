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
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

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
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

/* TASK: Retort task -> RetorttaskTask */
@TaskDesc(name="Retort task")
public class l
extends Task {
    private static /* synthetic */ int[] llllllllIllI;
    final /* synthetic */ int U = 5672;
    private final /* synthetic */ SquireMixologyConfig V;
    private static /* synthetic */ String[] llllllllIlIl;

    private static boolean lIIlIlIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIllIllllI(int n2) {
        return n2 > 0;
    }

    private static String lIIlIlIllIlIlIl(String var3, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llllllllIllI[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllllllIllI[6], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIlllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        l var4;
        if (l.lIIlIlIllIllIII(s.e() ? 1 : 0)) {
            return llllllllIllI[1];
        }
        int[] nArray = new int[llllllllIllI[2]];
        nArray[l.llllllllIllI[1]] = llllllllIllI[3];
        TileObject var7 = TileObjects.getNearest((int[])nArray);
        if (l.lIIlIlIllIllIII(var4.a(var7) ? 1 : 0)) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIIl((Object)var4.V.pluginMode(), (Object)d.MINIGAME)) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIIl((Object)var4.V.potionStrategy(), (Object)f.MULTI_ORDER) && l.lIIlIlIllIllIlI(SquireMixology.r, llllllllIllI[0])) {
            return llllllllIllI[1];
        }
        if (l.lIIlIlIllIllIll((Object)var4.V.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (l.lIIlIlIllIllIII(var4.a(var7) ? 1 : 0)) {
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
        l.llllllllIlIl[l.llllllllIllI[1]] = l."Retorting";
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
    public l(SquireMixologyConfig squireMixologyConfig) {
        this.U = llllllllIllI[0];
        this.V = squireMixologyConfig;
    }

    private static void lIIlIlIllIlIlll() {
        llllllllIllI = new int[7];
        l.llllllllIllI[0] = -(0xFFFFDF1D & 0x68F6) & (0xFFFFDEBB & 0x7F7F);
        l.llllllllIllI[1] = (0xE1 ^ 0xBE) & ~(0xD ^ 0x52);
        l.llllllllIllI[2] = 1;
        l.llllllllIllI[3] = 0xFFFFFADF & 0xDD7D;
        l.llllllllIllI[4] = 0xFFFFEDBF & 0x3E7F;
        l.llllllllIllI[5] = 0xB8 ^ 0xB0;
        l.llllllllIllI[6] = 2;
    }

    private boolean a(TileObject tileObject) {
        int n2;
        if (l.lIIlIlIllIlllII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llllllllIllI[2])) {
            n2 = llllllllIllI[2];
            0;
            if (2 < ((0x2A ^ 6 ^ (0x3D ^ 0x20)) & (0x19 ^ 0x36 ^ (0x22 ^ 0x3C) ^ -1))) {
                return ((0xA8 ^ 0x83 ^ (0x6C ^ 3)) & (0x1E ^ 0x14 ^ (0xC1 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            n2 = llllllllIllI[1];
        }
        int var6 = n2;
        int n3 = Players.getLocal().isAnimating();
        if (l.lIIlIlIllIlllIl(var6) && l.lIIlIlIllIlllIl(n3)) {
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

