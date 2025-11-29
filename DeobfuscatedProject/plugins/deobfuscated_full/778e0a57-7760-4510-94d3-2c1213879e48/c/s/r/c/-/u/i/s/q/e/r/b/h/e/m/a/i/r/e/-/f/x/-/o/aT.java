/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/* TASK: Finishing floor -> FinishingfloorTask */
@TaskDesc(name="Finishing floor", priority=10000, blocking=true)
public class aT
extends U {
    private static /* synthetic */ String[] lIlIIIlIIIll;
    private /* synthetic */ n ak;
    private static /* synthetic */ int[] lIlIIIlIIlII;

    private static boolean llIlIlIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIlllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aT var13;
        if (aT.llIlIlIlllIIlI(u.bf() ? 1 : 0)) {
            return lIlIIIlIIlII[1];
        }
        var13.ak = var13.co.L();
        if (aT.llIlIlIlllIlII((Object)var13.ak.bw, (Object)N.END)) {
            bl2 = lIlIIIlIIlII[0];
            0;
            if ((0x6B ^ 0x2B ^ (0xCB ^ 0x8F)) < -1) {
                return ((178 + 162 - 254 + 123 ^ 6 + 115 - 9 + 81) & (0xFB ^ 0x9A ^ (0xED ^ 0x9C) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIlIIlII[1];
        }
        return bl2;
    }

    private static boolean llIlIlIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIlllIIll(Object object) {
        return object == null;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    protected boolean dX() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[5]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x81 ^ 0xB2 ^ (0x9D ^ 0x8E)) & (0xCD ^ 0x81 ^ (0xE6 ^ 0x8A) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(tileObject2)) {
            return lIlIIIlIIlII[1];
        }
        if (aT.llIlIlIlllIlIl(Movement.getRunEnergy(), lIlIIIlIIlII[2])) {
            return lIlIIIlIIlII[1];
        }
        tileObject2.interact(lIlIIIlIIIll[lIlIIIlIIlII[3]]);
        return lIlIIIlIIlII[0];
    }

    private static boolean llIlIlIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIlIllIlllI() {
        lIlIIIlIIIll = new String[lIlIIIlIIlII[10]];
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[1]] = aT."Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[0]] = aT."Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[3]] = aT."Touch";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[4]] = aT."Energy well";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[5]] = aT."Touch";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[6]] = aT."Passage";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[7]] = aT."Enter";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[8]] = aT."Hole";
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[9]] = aT."Enter";
    }

    static {
        aT.llIlIlIllIllll();
        aT.llIlIlIllIlllI();
    }

    private static String llIlIlIllIllII(String var1, String var19) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIIlIIlII[3], var5);
            return new String(var8.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIllIllIl(String var6, String var11) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIlII[9]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIIIlIIlII[3], var20);
            return new String(var17.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIllIllll() {
        lIlIIIlIIlII = new int[11];
        aT.lIlIIIlIIlII[0] = 1;
        aT.lIlIIIlIIlII[1] = (0x19 ^ 0x2E ^ (0x91 ^ 0x83)) & (72 + 118 - 120 + 69 ^ 54 + 116 - 115 + 119 ^ -1);
        aT.lIlIIIlIIlII[2] = 0xEF ^ 0x81 ^ (0x6B ^ 0x39);
        aT.lIlIIIlIIlII[3] = 2;
        aT.lIlIIIlIIlII[4] = 3;
        aT.lIlIIIlIIlII[5] = 0x4A ^ 0x18 ^ (0xD8 ^ 0x8E);
        aT.lIlIIIlIIlII[6] = 0x61 ^ 0x64;
        aT.lIlIIIlIIlII[7] = 59 + 147 - 190 + 182 ^ 129 + 53 - 79 + 89;
        aT.lIlIIIlIIlII[8] = 0x5A ^ 0x5D;
        aT.lIlIIIlIIlII[9] = 64 + 15 - -11 + 54 ^ 72 + 123 - 72 + 29;
        aT.lIlIIIlIIlII[10] = 0xCB ^ 0xC2;
    }

    private static boolean llIlIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected aT(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aT lllllllllllllllIlllIIIIllIIlIlIl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().contains(lIlIIIlIIIll[lIlIIIlIIlII[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[9]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIII(tileObject2) && aT.llIlIlIlllIIIl(Reachable.isInteractable((Locatable)tileObject2) ? 1 : 0)) {
            void var21;
            if (aT.llIlIlIlllIIIl(this.dX() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            if (aT.llIlIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            var21.interact(lIlIIIlIIIll[lIlIIIlIIlII[1]]);
            return lIlIIIlIIlII[0];
        }
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[7]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    0;
                    if (2 > 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(var9)) {
            return lIlIIIlIIlII[1];
        }
        var2_2.interact(lIlIIIlIIIll[lIlIIIlIIlII[0]]);
        return lIlIIIlIIlII[0];
    }

    private static String llIlIlIllIlIll(String var12, String var10) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var14 = var10.toCharArray();
        int var15 = lIlIIIlIIlII[1];
        char[] var3 = var12.toCharArray();
        int var7 = var3.length;
        int var4 = lIlIIIlIIlII[1];
        while (aT.llIlIlIlllIllI(var4, var7)) {
            char var2 = var3[var4];
            var16.append((char)(var2 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var4;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean llIlIlIlllIIII(Object object) {
        return object != null;
    }
}

