/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Scouting for a raid -> ScoutingforaraidTask */
@TaskDesc(name="Scouting for a raid", priority=20000, blocking=true)
public class V
extends U {
    private /* synthetic */ int cs;
    private static /* synthetic */ String[] lIlIIlIIIlII;
    private static /* synthetic */ int[] lIlIIlIIIlIl;

    private static String llIllIIIIIlIll(String var9, String var2) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlIl[6]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIlIIlIIIlIl[3], var11);
            return new String(var3.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    private static void llIllIIIIIllII() {
        lIlIIlIIIlII = new String[lIlIIlIIIlIl[2]];
        V.lIlIIlIIIlII[V.lIlIIlIIIlIl[0]] = V."Yes, reload the raid.";
        V.lIlIIlIIIlII[V.lIlIIlIIIlIl[1]] = V."Yes, reload the raid";
        V.lIlIIlIIIlII[V.lIlIIlIIIlIl[3]] = V."Reload";
        V.lIlIIlIIIlII[V.lIlIIlIIIlIl[4]] = V."Steps";
        V.lIlIIlIIIlII[V.lIlIIlIIIlIl[5]] = V."Reload";
    }

    private static boolean llIllIIIIlIIII(Object object) {
        return object == null;
    }

    private static String llIllIIIIIlIlI(String var4, String var12) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlIIlIIIlIl[3], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Inject
    protected V(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.cs = lIlIIlIIIlIl[0];
    }

    private static boolean llIllIIIIIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        V var1;
        if (V.llIllIIIIIlllI(this.cs)) {
            this.cs -= lIlIIlIIIlIl[1];
            return lIlIIlIIIlIl[1];
        }
        if (V.llIllIIIIIllll(var1.ck() ? 1 : 0)) {
            return lIlIIlIIIlIl[0];
        }
        if (V.llIllIIIIIllll(Dialog.isViewingOptions() ? 1 : 0) && V.llIllIIIIIllll(Dialog.hasOption((String)lIlIIlIIIlII[lIlIIlIIIlIl[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIlIIIlIl[1]];
            stringArray[V.lIlIIlIIIlIl[0]] = lIlIIlIIIlII[lIlIIlIIIlIl[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            var1.cs = lIlIIlIIIlIl[2];
            return lIlIIlIIIlIl[1];
        }
        TileObject var8 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (V.llIllIIIIIllll(tileObject.getName().equals(lIlIIlIIIlII[lIlIIlIIIlIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIlIl[1]];
                stringArray[V.lIlIIlIIIlIl[0]] = lIlIIlIIIlII[lIlIIlIIIlIl[5]];
                if (V.llIllIIIIIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIlIl[1];
                    0;
                    if (3 >= 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIlIl[0];
            return n2 != 0;
        });
        if (V.llIllIIIIlIIII(var8)) {
            return lIlIIlIIIlIl[0];
        }
        var1_1.interact(lIlIIlIIIlII[lIlIIlIIIlIl[3]]);
        this.cs = lIlIIlIIIlIl[3];
        return lIlIIlIIIlIl[1];
    }

    static {
        V.llIllIIIIIllIl();
        V.llIllIIIIIllII();
    }

    private static boolean llIllIIIIIlllI(int n2) {
        return n2 > 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIlIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        if (V.llIllIIIIlIIIl(u.bf() ? 1 : 0)) {
            bl2 = lIlIIlIIIlIl[1];
            0;
            if (3 <= 1) {
                return ((0xE6 ^ 0x89 ^ (0x6F ^ 0x24)) & (28 + 2 - -85 + 14 ^ 107 + 91 - 109 + 76 ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIlIIIlIl[0];
        }
        return bl2;
    }

    private static void llIllIIIIIllIl() {
        lIlIIlIIIlIl = new int[7];
        V.lIlIIlIIIlIl[0] = (0x7D ^ 0x20) & ~(0xF6 ^ 0xAB);
        V.lIlIIlIIIlIl[1] = 1;
        V.lIlIIlIIIlIl[2] = 0x51 ^ 0x37 ^ (0x4E ^ 0x2D);
        V.lIlIIlIIIlIl[3] = 2;
        V.lIlIIlIIIlIl[4] = 3;
        V.lIlIIlIIIlIl[5] = 0xC7 ^ 0xC3;
        V.lIlIIlIIIlIl[6] = 0x3F ^ 0x42 ^ (0xCA ^ 0xBF);
    }
}

