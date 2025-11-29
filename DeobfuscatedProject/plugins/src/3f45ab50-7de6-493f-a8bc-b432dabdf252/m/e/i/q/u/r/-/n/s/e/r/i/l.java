/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining bone shards", priority=5)
public class l
extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] lllllllIIIII;
    private static /* synthetic */ int[] lllllllIIIIl;

    private static boolean lIIlIlIIlllllIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIIII = new String[lllllllIIIIl[4]];
        l.lllllllIIIII[l.lllllllIIIIl[0]] = l.lIIlIlIIllllIIl("jUEk0u99nlXgyR8Qya/o5kNdfYGAUlWb", "zAKNp");
        l.lllllllIIIII[l.lllllllIIIIl[2]] = l.lIIlIlIIllllIIl("8YMp+3mmODk=", "hxnXC");
        l.lllllllIIIII[l.lllllllIIIIl[3]] = l.lIIlIlIIllllIIl("ZTQIxyBdpI4Ac0PSmFT3qg==", "XjWFw");
        l.lllllllIIIII[l.lllllllIIIIl[1]] = l.lIIlIlIIllllIlI("bbSS7w306qQ=", "HZvVt");
    }

    private static void lIIlIlIIlllllII() {
        lllllllIIIIl = new int[6];
        l.lllllllIIIIl[0] = (0x44 ^ 0x79) & ~(0xF9 ^ 0xC4);
        l.lllllllIIIIl[1] = "   ".length();
        l.lllllllIIIIl[2] = " ".length();
        l.lllllllIIIIl[3] = "  ".length();
        l.lllllllIIIIl[4] = 0x73 ^ 0x77;
        l.lllllllIIIIl[5] = 0x7B ^ 0x73;
    }

    private static String lIIlIlIIllllIlI(String lllllllllllllllIIlIIIlIllIIIlIlI, String lllllllllllllllIIlIIIlIllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), lllllllIIIIl[5]), "DES");
            Cipher lllllllllllllllIIlIIIlIllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIllIIIlllI.init(lllllllIIIIl[3], lllllllllllllllIIlIIIlIllIIIllll);
            return new String(lllllllllllllllIIlIIIlIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIllIIIllIl) {
            lllllllllllllllIIlIIIlIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIllllIIl(String lllllllllllllllIIlIIIlIllIIllIIl, String lllllllllllllllIIlIIIlIllIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIllIIllIll.init(lllllllIIIIl[3], lllllllllllllllIIlIIIlIllIIlllII);
            return new String(lllllllllllllllIIlIIIlIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIllIIllIlI) {
            lllllllllllllllIIlIIIlIllIIllIlI.printStackTrace();
            return null;
        }
    }

    static {
        l.lIIlIlIIlllllII();
        l.lIIlIlIIllllIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.lIIlIlIIlllllIl((Object)this.f.activity(), (Object)a.BONE_SHARDS)) {
            return lllllllIIIIl[0];
        }
        TileObject lllllllllllllllIIlIIIlIllIlIIIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.lIIlIlIIlllllll(lllllllIIIII[lllllllIIIIl[3]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIIl[2]];
                stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[1]];
                if (l.lIIlIlIIlllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllllIIIIl[2];
                    "".length();
                    if ((0x59 ^ 0x33 ^ (0x65 ^ 0xB)) >= 0) return n2 != 0;
                    return ((0x91 ^ 0xC2 ^ (0x60 ^ 0x26)) & (18 + 125 - 31 + 51 ^ 158 + 116 - 221 + 129 ^ -" ".length())) != 0;
                }
            }
            n2 = lllllllIIIIl[0];
            return n2 != 0;
        });
        if (l.lIIlIlIIllllllI(lllllllllllllllIIlIIIlIllIlIIIll)) {
            return lllllllIIIIl[0];
        }
        if (l.lIIlIlIIlllllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            l lllllllllllllllIIlIIIlIllIlIIlII;
            lllllllllllllllIIlIIIlIllIlIIlII.sleep(lllllllIIIIl[1]);
            return lllllllIIIIl[2];
        }
        if (l.lIIlIlIIlllllll(Inventory.isFull() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIIIIl[2]];
            stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[0]];
            Inventory.dropAll((String[])stringArray);
            "".length();
            return lllllllIIIIl[2];
        }
        var1_1.interact(lllllllIIIII[lllllllIIIIl[2]]);
        return lllllllIIIIl[2];
    }

    private static boolean lIIlIlIIllllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlllllll(int n2) {
        return n2 != 0;
    }
}

