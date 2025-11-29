/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;

/* TASK: Clearing dead crop -> ClearingdeadcropTask */
@TaskDesc(name="Clearing dead crop", priority=5, blocking=true)
public class aW
extends aX {
    private static /* synthetic */ int[] llIIIIIIlIlI;
    private static /* synthetic */ String[] llIIIIIIlIIl;

    @Override
    public boolean J(N n2) {
        this.sleep(llIIIIIIlIlI[3]);
        return this.a(n2, tileObject -> tileObject.interact(llIIIIIIlIIl[llIIIIIIlIlI[2]]::equals));
    }

    private static boolean llllIIIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIIIlIIIIIl() {
        llIIIIIIlIIl = new String[llIIIIIIlIlI[1]];
        aW.llIIIIIIlIIl[aW.llIIIIIIlIlI[2]] = aW."Clear";
    }

    @Override
    public boolean bv() {
        if (aW.llllIIIlIIIIll(super.bv() ? 1 : 0)) {
            this.sleep(llIIIIIIlIlI[0]);
            return llIIIIIIlIlI[1];
        }
        return llIIIIIIlIlI[2];
    }

    static {
        aW.llllIIIlIIIIlI();
        aW.llllIIIlIIIIIl();
    }

    @Inject
    public aW(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            boolean bl;
            if (aW.llllIIIlIIIlII((Object)an2.aZ(), (Object)n.DEAD)) {
                bl = llIIIIIIlIlI[1];
                0;
                if (2 < -1) {
                    return false;
                }
            } else {
                bl = llIIIIIIlIlI[2];
            }
            return bl;
        });
    }

    private static void llllIIIlIIIIlI() {
        llIIIIIIlIlI = new int[4];
        aW.llIIIIIIlIlI[0] = 8 ^ 0x2C ^ (0xB0 ^ 0x90);
        aW.llIIIIIIlIlI[1] = 1;
        aW.llIIIIIIlIlI[2] = (0xA8 ^ 0x9A) & ~(0x7E ^ 0x4C);
        aW.llIIIIIIlIlI[3] = 3;
    }

    private static boolean llllIIIlIIIIll(int n2) {
        return n2 != 0;
    }

    private static String llllIIIlIIIIII(String var9, String var6) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var6.toCharArray();
        int var1 = llIIIIIIlIlI[2];
        char[] var4 = var9.toCharArray();
        int var7 = var4.length;
        int var8 = llIIIIIIlIlI[2];
        while (aW.llllIIIlIIIlIl(var8, var7)) {
            char var5 = var4[var8];
            var3.append((char)(var5 ^ var2[var1 % var2.length]));
            0;
            ++var1;
            ++var8;
            0;
            if (-1 <= ((0x61 ^ 0x73) & ~(0x43 ^ 0x51))) continue;
            return null;
        }
        return String.valueOf(var3);
    }
}

