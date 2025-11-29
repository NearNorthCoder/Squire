/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.widgets.Widgets
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.util.Log;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.widgets.Widgets;

public abstract class w<T extends b>
extends Task {
    protected final /* synthetic */ SquireMTA aC;
    private static /* synthetic */ int[] lllIlIlIIllI;
    private static /* synthetic */ String[] lllIlIlIIlIl;
    protected final /* synthetic */ T aB;

    static {
        w.lIIIllIIIIIIIlI();
        w.lIIIllIIIIIIIIl();
    }

    private static String lIIIlIlllllllll(String lllllllllllllllIIllIllIIlIIlllII, String lllllllllllllllIIllIllIIlIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIIllI[6]), "DES");
            Cipher lllllllllllllllIIllIllIIlIIllllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIIlIIllllI.init(lllIlIlIIllI[2], lllllllllllllllIIllIllIIlIIlllll);
            return new String(lllllllllllllllIIllIllIIlIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIlIIlllIl) {
            lllllllllllllllIIllIllIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIIllIIIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIllIIIIIIIII(String lllllllllllllllIIllIllIIIllllIlI, String lllllllllllllllIIllIllIIIllllllI) {
        lllllllllllllllIIllIllIIIllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIIlllllIl = new StringBuilder();
        char[] lllllllllllllllIIllIllIIIlllllII = lllllllllllllllIIllIllIIIllllllI.toCharArray();
        int lllllllllllllllIIllIllIIIllllIll = lllIlIlIIllI[0];
        char[] lllllllllllllllIIllIllIIIlllIlIl = lllllllllllllllIIllIllIIIllllIlI.toCharArray();
        int lllllllllllllllIIllIllIIIlllIlII = lllllllllllllllIIllIllIIIlllIlIl.length;
        int lllllllllllllllIIllIllIIIlllIIll = lllIlIlIIllI[0];
        while (w.lIIIllIIIIIlIIl(lllllllllllllllIIllIllIIIlllIIll, lllllllllllllllIIllIllIIIlllIlII)) {
            char lllllllllllllllIIllIllIIlIIIIIII = lllllllllllllllIIllIllIIIlllIlIl[lllllllllllllllIIllIllIIIlllIIll];
            lllllllllllllllIIllIllIIIlllllIl.append((char)(lllllllllllllllIIllIllIIlIIIIIII ^ lllllllllllllllIIllIllIIIlllllII[lllllllllllllllIIllIllIIIllllIll % lllllllllllllllIIllIllIIIlllllII.length]));
            0;
            ++lllllllllllllllIIllIllIIIllllIll;
            ++lllllllllllllllIIllIllIIIlllIIll;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIIIlllllIl);
    }

    protected void P() {
    }

    private static void lIIIllIIIIIIIlI() {
        lllIlIlIIllI = new int[7];
        w.lllIlIlIIllI[0] = (42 + 171 - 180 + 184 ^ 122 + 118 - 126 + 30) & (45 + 181 - 14 + 7 ^ 70 + 58 - 35 + 53 ^ -1);
        w.lllIlIlIIllI[1] = 1;
        w.lllIlIlIIllI[2] = 2;
        w.lllIlIlIIllI[3] = 3;
        w.lllIlIlIIllI[4] = 41 + 100 - 2 + 37 ^ 31 + 81 - 48 + 116;
        w.lllIlIlIIllI[5] = 0xF0 ^ 0x87 ^ (0x3B ^ 0x49);
        w.lllIlIlIIllI[6] = 0x1C ^ 0x14;
    }

    public boolean run() {
        w lllllllllllllllIIllIllIIlIllIIlI;
        if (w.lIIIllIIIIIIIll(((b)this.aB).c() ? 1 : 0)) {
            return this.O();
        }
        c lllllllllllllllIIllIllIIlIllIIIl = ((b)lllllllllllllllIIllIllIIlIllIIlI.aB).d();
        Widget lllllllllllllllIIllIllIIlIllIIII = Widgets.get((int)lllllllllllllllIIllIllIIlIllIIIl.f(), (int)lllllllllllllllIIllIllIIlIllIIIl.h());
        if (w.lIIIllIIIIIIlII(lllllllllllllllIIllIllIIlIllIIII)) {
            return lllIlIlIIllI[0];
        }
        int lllllllllllllllIIllIllIIlIlIllll = Integer.parseInt(lllllllllllllllIIllIllIIlIllIIII.getText().replaceAll(lllIlIlIIlIl[lllIlIlIIllI[0]], lllIlIlIIlIl[lllIlIlIIllI[1]]));
        int lllllllllllllllIIllIllIIlIlIlllI = lllllllllllllllIIllIllIIlIllIIlI.aC.d(lllllllllllllllIIllIllIIlIllIIIl);
        lllllllllllllllIIllIllIIlIllIIlI.aC.a(lllllllllllllllIIllIllIIlIllIIIl, lllllllllllllllIIllIllIIlIlIllll);
        if (w.lIIIllIIIIIIlIl(lllllllllllllllIIllIllIIlIlIllll, lllllllllllllllIIllIllIIlIlIlllI)) {
            Log.info((String)lllIlIlIIlIl[lllIlIlIIllI[2]]);
            lllllllllllllllIIllIllIIlIllIIlI.Q();
            return lllIlIlIIllI[1];
        }
        Item lllllllllllllllIIllIllIIlIlIllIl = Inventory.getFirst(lllllllllllllllIIllIllIIlIllIIlI::a);
        Spell lllllllllllllllIIllIllIIlIlIllII = lllllllllllllllIIllIllIIlIllIIlI.L();
        if (w.lIIIllIIIIIIIll(lllllllllllllllIIllIllIIlIlIllII.canCast() ? 1 : 0)) {
            if (w.lIIIllIIIIIIllI(lllllllllllllllIIllIllIIlIlIllIl)) {
                lllllllllllllllIIllIllIIlIlIllIl.interact(lllIlIlIIlIl[lllIlIlIIllI[3]]);
                return lllIlIlIIllI[1];
            }
            lllllllllllllllIIllIllIIlIllIIlI.Q();
            return lllIlIlIIllI[1];
        }
        return this.M();
    }

    private static boolean lIIIllIIIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIllIIIIIIIIl() {
        lllIlIlIIlIl = new String[lllIlIlIIllI[5]];
        w.lllIlIlIIlIl[w.lllIlIlIIllI[0]] = w.",";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[1]] = w."";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[2]] = w."Exiting because we should";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[3]] = w."Wield";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[4]] = w."Exit Teleport";
    }

    private static boolean lIIIllIIIIIIllI(Object object) {
        return object != null;
    }

    protected void Q() {
        this.aC.a(((b)this.aB).d());
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = lllIlIlIIlIl[lllIlIlIIllI[4]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(tileObject)) {
            return;
        }
        tileObject.interact(lllIlIlIIllI[0]);
    }

    private static boolean lIIIllIIIIIIIll(int n2) {
        return n2 == 0;
    }

    public abstract boolean a(Item var1);

    public abstract Spell L();

    private static String lIIIlIllllllllI(String lllllllllllllllIIllIllIIlIIIllIl, String lllllllllllllllIIllIllIIlIIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIIlIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIIlIIlIIIl.init(lllIlIlIIllI[2], lllllllllllllllIIllIllIIlIIlIIlI);
            return new String(lllllllllllllllIIllIllIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIlIIlIIII) {
            lllllllllllllllIIllIllIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean O() {
        void var1_1;
        w lllllllllllllllIIllIllIIlIlIlIIl;
        if (!w.lIIIllIIIIIIlll(this.aC.c(((b)this.aB).d()), this.aC.d(((b)this.aB).d())) || w.lIIIllIIIIIlIII(this.aC.b(((b)this.aB).d()) ? 1 : 0)) {
            return lllIlIlIIllI[0];
        }
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = ((b)lllllllllllllllIIllIllIIlIlIlIIl.aB).d().g();
        TileObject lllllllllllllllIIllIllIIlIlIlIII = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(lllllllllllllllIIllIllIIlIlIlIII)) {
            return lllIlIlIIllI[0];
        }
        var1_1.interact(lllIlIlIIllI[0]);
        return lllIlIlIIllI[1];
    }

    @Inject
    public w(T t2, SquireMTA squireMTA) {
        this.aB = t2;
        this.aC = squireMTA;
    }

    private static boolean lIIIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    public abstract boolean M();
}

