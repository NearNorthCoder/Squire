/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Vars
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.game.Vars;

@TaskDesc(name="Raking the current patch", priority=10)
public class bb
extends aX {
    private static /* synthetic */ String[] llIIIIlIIIll;
    private static /* synthetic */ int[] llIIIIlIIlII;

    private static boolean llllIIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public bb(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, au.WEEDS);
    }

    private static boolean llllIIlIIIllIl(int n2) {
        return n2 != 0;
    }

    private static String llllIIlIIIlIlI(String lllllllllllllllIlIlIllIIIllIIIIl, String lllllllllllllllIlIlIllIIIllIIIII) {
        lllllllllllllllIlIlIllIIIllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIllIIIlIlllll = new StringBuilder();
        char[] lllllllllllllllIlIlIllIIIlIllllI = lllllllllllllllIlIlIllIIIllIIIII.toCharArray();
        int lllllllllllllllIlIlIllIIIlIlllIl = llIIIIlIIlII[1];
        char[] lllllllllllllllIlIlIllIIIlIlIlll = lllllllllllllllIlIlIllIIIllIIIIl.toCharArray();
        int lllllllllllllllIlIlIllIIIlIlIllI = lllllllllllllllIlIlIllIIIlIlIlll.length;
        int lllllllllllllllIlIlIllIIIlIlIlIl = llIIIIlIIlII[1];
        while (bb.llllIIlIIIlllI(lllllllllllllllIlIlIllIIIlIlIlIl, lllllllllllllllIlIlIllIIIlIlIllI)) {
            char lllllllllllllllIlIlIllIIIllIIIlI = lllllllllllllllIlIlIllIIIlIlIlll[lllllllllllllllIlIlIllIIIlIlIlIl];
            lllllllllllllllIlIlIllIIIlIlllll.append((char)(lllllllllllllllIlIlIllIIIllIIIlI ^ lllllllllllllllIlIlIllIIIlIllllI[lllllllllllllllIlIlIllIIIlIlllIl % lllllllllllllllIlIlIllIIIlIllllI.length]));
            0;
            ++lllllllllllllllIlIlIllIIIlIlllIl;
            ++lllllllllllllllIlIlIllIIIlIlIlIl;
            0;
            if (((0x94 ^ 0xAE ^ 42 + 57 - 33 + 61) & (0xB0 ^ 0x89 ^ (0xC1 ^ 0xBD) ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIllIIIlIlllll);
    }

    static {
        bb.llllIIlIIIllII();
        bb.llllIIlIIIlIll();
    }

    @Override
    public boolean J(N n2) {
        if (bb.llllIIlIIIllIl(Vars.getBit((int)llIIIIlIIlII[0]))) {
            return llIIIIlIIlII[1];
        }
        this.sleep(llIIIIlIIlII[2]);
        return this.a(n2, tileObject -> tileObject.interact(llIIIIlIIIll[llIIIIlIIlII[1]]::equals));
    }

    private static void llllIIlIIIllII() {
        llIIIIlIIlII = new int[4];
        bb.llIIIIlIIlII[0] = 0xFFFFFDF5 & 0x17BF;
        bb.llIIIIlIIlII[1] = (129 + 125 - 190 + 87 ^ 112 + 55 - 151 + 140) & (0x49 ^ 0x57 ^ (0xB2 ^ 0xA7) ^ -1);
        bb.llIIIIlIIlII[2] = 0x42 ^ 0x46;
        bb.llIIIIlIIlII[3] = 1;
    }

    private static void llllIIlIIIlIll() {
        llIIIIlIIIll = new String[llIIIIlIIlII[3]];
        bb.llIIIIlIIIll[bb.llIIIIlIIlII[1]] = bb."Rake";
    }
}

