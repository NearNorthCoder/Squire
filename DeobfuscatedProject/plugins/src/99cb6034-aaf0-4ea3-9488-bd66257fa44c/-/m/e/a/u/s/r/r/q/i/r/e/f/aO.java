/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling compost bin", priority=30, blocking=true)
public class aO
extends aN {
    private final /* synthetic */ h cx;
    private static /* synthetic */ String[] llIIIIIIllll;
    private /* synthetic */ boolean cy;
    private static /* synthetic */ int[] llIIIIIlIIII;

    private static boolean llllIIIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIlIlIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public aO(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cx = h2;
    }

    private static boolean llllIIIlIllIII(Object object) {
        return object == null;
    }

    private static void llllIIIlIlIIlI() {
        llIIIIIIllll = new String[llIIIIIlIIII[2]];
        aO.llIIIIIIllll[aO.llIIIIIlIIII[0]] = aO.llllIIIlIlIIIl("VgmEhSy178c=", "wgXtT");
        aO.llIIIIIIllll[aO.llIIIIIlIIII[1]] = aO.llllIIIlIlIIIl("TG1smjibj6k=", "zxOlp");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void var2_2;
        aO lllllllllllllllIlIlIllIllIlIIlII;
        String[] stringArray = new String[llIIIIIlIIII[1]];
        stringArray[aO.llIIIIIlIIII[0]] = llIIIIIIllll[llIIIIIlIIII[0]];
        if (aO.llllIIIlIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
            tileObject.interact(llIIIIIIllll[llIIIIIlIIII[1]]);
            return llIIIIIlIIII[1];
        }
        Item lllllllllllllllIlIlIllIllIlIIIlI = lllllllllllllllIlIlIllIllIlIIlII.bu();
        if (aO.llllIIIlIlIllI(Inventory.isFull() ? 1 : 0) && aO.llllIIIlIlIlll(lllllllllllllllIlIlIllIllIlIIIlI)) {
            lllllllllllllllIlIlIllIllIlIIlII.cy = llIIIIIlIIII[1];
            "".length();
            if (null != null) {
                return ((0x80 ^ 0xC3 ^ (0xE7 ^ 0x8C)) & (0xBA ^ 0x97 ^ (0xB6 ^ 0xB3) ^ -" ".length())) != 0;
            }
        } else if (aO.llllIIIlIllIII(lllllllllllllllIlIlIllIllIlIIIlI)) {
            lllllllllllllllIlIlIllIllIlIIlII.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        if (aO.llllIIIlIllIIl(lllllllllllllllIlIlIllIllIlIIlII.cy ? 1 : 0)) {
            return llIIIIIlIIII[0];
        }
        Item lllllllllllllllIlIlIllIllIlIIIIl = Inventory.getFirst(item2 -> {
            int n2;
            if (aO.llllIIIlIlIllI(L.bq.contains(item2.getId()) ? 1 : 0) && aO.llllIIIlIllIlI(item2.getId(), lllllllllllllllIlIlIllIllIlIIIlI.getId())) {
                n2 = llIIIIIlIIII[1];
                "".length();
                if ((0x6A ^ 0x6E) < 0) {
                    return ((0x28 ^ 0x6A) & ~(0x6B ^ 0x29)) != 0;
                }
            } else {
                n2 = llIIIIIlIIII[0];
            }
            return n2 != 0;
        });
        if (aO.llllIIIlIlIlll(lllllllllllllllIlIlIllIllIlIIIIl)) {
            lllllllllllllllIlIlIllIllIlIIlII.cx.c(lllllllllllllllIlIlIllIllIlIIIIl);
            return llIIIIIlIIII[1];
        }
        if (!aO.llllIIIlIllIIl(Players.getLocal().isMoving() ? 1 : 0) || aO.llllIIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIIIIlIIII[1];
        }
        var2_2.useOn(tileObject);
        return llIIIIIlIIII[1];
    }

    @Override
    public boolean I(N n2) {
        if (!aO.llllIIIlIlIlII((Object)n2.aI().aZ(), (Object)n.GROWING) || aO.llllIIIlIlIlIl((Object)n2.aI().aZ(), (Object)n.HARVESTABLE)) {
            lllllllllllllllIlIlIllIllIlIlIlI.cy = llIIIIIlIIII[0];
            return llIIIIIlIIII[0];
        }
        return llIIIIIlIIII[1];
    }

    private static boolean llllIIIlIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIIIlIlIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIIIlIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aO.llllIIIlIlIIll();
        aO.llllIIIlIlIIlI();
    }

    private static void llllIIIlIlIIll() {
        llIIIIIlIIII = new int[4];
        aO.llIIIIIlIIII[0] = (0xC5 ^ 0x85) & ~(0x66 ^ 0x26);
        aO.llIIIIIlIIII[1] = " ".length();
        aO.llIIIIIlIIII[2] = "  ".length();
        aO.llIIIIIlIIII[3] = 57 + 20 - 31 + 100 ^ 92 + 110 - 77 + 29;
    }

    private static boolean llllIIIlIlIlll(Object object) {
        return object != null;
    }

    private static String llllIIIlIlIIIl(String lllllllllllllllIlIlIllIllIIlIlIl, String lllllllllllllllIlIlIllIllIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIllIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIIIIlIIII[3]), "DES");
            Cipher lllllllllllllllIlIlIllIllIIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIllIIlIlll.init(llIIIIIlIIII[2], lllllllllllllllIlIlIllIllIIllIII);
            return new String(lllllllllllllllIlIlIllIllIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIllIIlIllI) {
            lllllllllllllllIlIlIllIllIIlIllI.printStackTrace();
            return null;
        }
    }
}

