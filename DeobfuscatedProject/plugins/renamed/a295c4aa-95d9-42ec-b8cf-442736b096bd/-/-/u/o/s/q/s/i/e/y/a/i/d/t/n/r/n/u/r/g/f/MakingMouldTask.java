/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.FEnum;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Making mould -> MakingmouldTask */
@TaskDesc(name="Making mould", priority=10)
public class MakingMouldTask
extends j_Unknown {
    private static /* synthetic */ String[] llIlIllIlIII;
    private static /* synthetic */ int[] llIlIllIlIIl;

    private static boolean lIIIIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lIIIIIlllIlllll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIlllIllIll() {
        llIlIllIlIII = new String[llIlIllIlIIl[8]];
        u.llIlIllIlIII[u.llIlIllIlIIl[0]] = u."No mould jig found";
        u.llIlIllIlIII[u.llIlIllIlIIl[1]] = u."Interacting with mould jig";
        u.llIlIllIlIII[u.llIlIllIlIIl[3]] = u."Setup";
        u.llIlIllIlIII[u.llIlIllIlIIl[4]] = u."Selecting FORTE mould";
        u.llIlIllIlIII[u.llIlIllIlIIl[5]] = u."Selecting BLADE mould";
        u.llIlIllIlIII[u.llIlIllIlIIl[6]] = u."Selecting TIP mould";
    }

    private static void lIIIIIlllIlllII() {
        llIlIllIlIIl = new int[10];
        u.llIlIllIlIIl[0] = (0x5A ^ 3) & ~(0xD0 ^ 0x89);
        u.llIlIllIlIIl[1] = 1;
        u.llIlIllIlIIl[2] = 0xFFFFEEFB & 0xBFED;
        u.llIlIllIlIIl[3] = 2;
        u.llIlIllIlIIl[4] = 3;
        u.llIlIllIlIIl[5] = 149 + 66 - 97 + 46 ^ 143 + 151 - 230 + 96;
        u.llIlIllIlIIl[6] = 0x3E ^ 0x2C ^ (0x26 ^ 0x31);
        u.llIlIllIlIIl[7] = -(0xFFFFBA95 & 0x7D6B) & (0xFFFFBFDF & 0x7AEE);
        u.llIlIllIlIIl[8] = 0xA8 ^ 0xAE;
        u.llIlIllIlIIl[9] = 0x5C ^ 0x54;
    }

    private boolean u() {
        Widget widget = Widgets.get((int)llIlIllIlIIl[7], (int)llIlIllIlIIl[3]);
        return Widgets.isVisible((Widget)widget);
    }

    static {
        u.lIIIIIlllIlllII();
        u.lIIIIIlllIllIll();
    }

    private static String lIIIIIlllIllIIl(String var3, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIlIllIlIIl[9]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llIlIllIlIIl[3], var6);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public u(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    @Override
    public boolean M() {
        u var2;
        if (u.lIIIIIlllIlllIl(this.T.g() ? 1 : 0)) {
            return llIlIllIlIIl[0];
        }
        int[] nArray = new int[llIlIllIlIIl[1]];
        nArray[u.llIlIllIlIIl[0]] = llIlIllIlIIl[2];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (u.lIIIIIlllIllllI(var4)) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[0]]);
            return llIlIllIlIIl[0];
        }
        if (u.lIIIIIlllIlllll(var2.u() ? 1 : 0)) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[1]]);
            var4.interact(llIlIllIlIII[llIlIllIlIIl[3]]);
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.FORTE.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[4]]);
            if (u.lIIIIIlllIlllll(f.FORTE.B() ? 1 : 0)) {
                f.FORTE.C();
                return llIlIllIlIIl[1];
            }
            f.FORTE.D();
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.BLADE.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[5]]);
            if (u.lIIIIIlllIlllll(f.BLADE.B() ? 1 : 0)) {
                f.BLADE.C();
                return llIlIllIlIIl[1];
            }
            f.BLADE.D();
            return llIlIllIlIIl[1];
        }
        if (u.lIIIIIlllIlllll(Vars.getBit((int)f.TIP.E()))) {
            Log.info((String)llIlIllIlIII[llIlIllIlIIl[6]]);
            if (u.lIIIIIlllIlllll(f.TIP.B() ? 1 : 0)) {
                f.TIP.C();
                return llIlIllIlIIl[1];
            }
            f.TIP.D();
            return llIlIllIlIIl[1];
        }
        return llIlIllIlIIl[0];
    }

    private static boolean lIIIIIlllIlllIl(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIlllIllIlI(String var10, String var1) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIlIllIlIIl[3], var7);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}

