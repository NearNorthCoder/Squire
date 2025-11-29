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
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Mining bone shards -> MiningboneshardsTask */
@TaskDesc(name="Mining bone shards", priority=5)
public class MiningBoneShardsTask
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
        l.lllllllIIIII[l.lllllllIIIIl[0]] = l."Calcified deposit";
        l.lllllllIIIII[l.lllllllIIIIl[2]] = l."Mine";
        l.lllllllIIIII[l.lllllllIIIIl[3]] = l."Calcified rocks";
        l.lllllllIIIII[l.lllllllIIIIl[1]] = l."Mine";
    }

    private static void lIIlIlIIlllllII() {
        lllllllIIIIl = new int[6];
        l.lllllllIIIIl[0] = (0x44 ^ 0x79) & ~(0xF9 ^ 0xC4);
        l.lllllllIIIIl[1] = 3;
        l.lllllllIIIIl[2] = 1;
        l.lllllllIIIIl[3] = 2;
        l.lllllllIIIIl[4] = 0x73 ^ 0x77;
        l.lllllllIIIIl[5] = 0x7B ^ 0x73;
    }

    private static String lIIlIlIIllllIlI(String var1, String var4) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllllllIIIIl[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllllllIIIIl[3], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIllllIIl(String var12, String var11) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllllllIIIIl[3], var7);
            return new String(var3.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
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
        TileObject var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.lIIlIlIIlllllll(lllllllIIIII[lllllllIIIIl[3]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIIl[2]];
                stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[1]];
                if (l.lIIlIlIIlllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllllIIIIl[2];
                    0;
                    if ((0x59 ^ 0x33 ^ (0x65 ^ 0xB)) >= 0) return n2 != 0;
                    return ((0x91 ^ 0xC2 ^ (0x60 ^ 0x26)) & (18 + 125 - 31 + 51 ^ 158 + 116 - 221 + 129 ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIIl[0];
            return n2 != 0;
        });
        if (l.lIIlIlIIllllllI(var10)) {
            return lllllllIIIIl[0];
        }
        if (l.lIIlIlIIlllllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            l var5;
            var5.sleep(lllllllIIIIl[1]);
            return lllllllIIIIl[2];
        }
        if (l.lIIlIlIIlllllll(Inventory.isFull() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIIIIl[2]];
            stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[0]];
            Inventory.dropAll((String[])stringArray);
            0;
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

