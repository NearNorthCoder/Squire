/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.a;

/* TASK: Completing Minigame -> CompletingminigameTask */
@TaskDesc(name="Completing Minigame")
public class e
extends Task {
    private static /* synthetic */ int[] lIIllIIlIIlII;
    private static final /* synthetic */ WorldPoint v;
    private static final /* synthetic */ int w;
    private final /* synthetic */ SquireSorceressGardenConfig x;
    private static /* synthetic */ String[] lIIllIIlIIIll;

    private static boolean lIlIlllllIIlIlI(int n) {
        return n != 0;
    }

    private void B() {
        Movement.walkTo((WorldPoint)v);
        0;
    }

    @Inject
    public e(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.x = squireSorceressGardenConfig;
    }

    private static boolean lIlIlllllIIlllI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private void C() {
        void var1_2;
        e var23;
        if (e.lIlIlllllIIlIlI(this.x.pickHerbs() ? 1 : 0)) {
            void var8;
            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.lIlIlllllIIlIlI(tileObject.getName().equals(lIIllIIlIIIll[lIIllIIlIIlII[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIlIIlII[1]];
                    stringArray[e.lIIllIIlIIlII[0]] = lIIllIIlIIIll[lIIllIIlIIlII[5]];
                    if (e.lIlIlllllIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIllIIlIIlII[1];
                        0;
                        if (((0x19 ^ 0x5C) & ~(0x62 ^ 0x27)) >= -1) return n != 0;
                        return false;
                    }
                }
                n = lIIllIIlIIlII[0];
                return n != 0;
            });
            if (e.lIlIlllllIIllll(tileObject2)) {
                return;
            }
            var8.interact(lIIllIIlIIIll[lIIllIIlIIlII[0]]);
            return;
        }
        TileObject var8 = var23.A();
        if (e.lIlIlllllIIllll(var8)) {
            return;
        }
        var1_2.interact(lIIllIIlIIIll[lIIllIIlIIlII[1]]);
    }

    private static boolean lIlIlllllIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIlllllIIllII(Object object) {
        return object != null;
    }

    private void y() {
        if (!e.lIlIlllllIIlIll(Movement.isRunEnabled() ? 1 : 0) || e.lIlIlllllIIllIl(Movement.getRunEnergy(), lIIllIIlIIlII[2])) {
            return;
        }
        Movement.toggleRun();
    }

    private static String lIlIlllllIIIlll(String var17, String var1) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var20 = var1.toCharArray();
        int var13 = lIIllIIlIIlII[0];
        char[] var12 = var17.toCharArray();
        int var7 = var12.length;
        int var4 = lIIllIIlIIlII[0];
        while (e.lIlIlllllIIllIl(var4, var7)) {
            char var21 = var12[var4];
            var5.append((char)(var21 ^ var20[var13 % var20.length]));
            0;
            ++var13;
            ++var4;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static String lIlIlllllIIIllI(String var15, String var14) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIlII[9]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIllIIlIIlII[4], var16);
            return new String(var2.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllllIIIlIl(String var3, String var22) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIllIIlIIlII[4], var18);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private boolean z() {
        boolean bl;
        if (!e.lIlIlllllIIlIll(Inventory.isFull() ? 1 : 0) || !e.lIlIlllllIIlIll(Bank.isOpen() ? 1 : 0) || !e.lIlIlllllIIlIlI(Movement.shouldWalk() ? 1 : 0) || e.lIlIlllllIIlllI((Object)this.x.botActivity(), (Object)a.MINIGAME)) {
            bl = lIIllIIlIIlII[1];
            0;
            if (((0x66 ^ 0x73) & ~(0xE ^ 0x1B)) != 0) {
                return false;
            }
        } else {
            bl = lIIllIIlIIlII[0];
        }
        return bl;
    }

    static {
        e.lIlIlllllIIlIIl();
        e.lIlIlllllIIlIII();
        w = lIIllIIlIIlII[3];
        v = new WorldPoint(lIIllIIlIIlII[6], lIIllIIlIIlII[7], lIIllIIlIIlII[0]);
    }

    private static boolean lIlIlllllIIllIl(int n, int n2) {
        return n < n2;
    }

    private static void lIlIlllllIIlIIl() {
        lIIllIIlIIlII = new int[10];
        e.lIIllIIlIIlII[0] = (0x9F ^ 0xBE ^ (0x78 ^ 0x51)) & (0xD4 ^ 0x9C ^ (0x61 ^ 0x21) ^ -1);
        e.lIIllIIlIIlII[1] = 1;
        e.lIIllIIlIIlII[2] = 113 + 129 - 123 + 11 ^ 40 + 11 - -15 + 89;
        e.lIIllIIlIIlII[3] = -(0xFFFFBDB1 & 0x4F7F) & (0xFFFFFFFF & 0x3FBF);
        e.lIIllIIlIIlII[4] = 2;
        e.lIIllIIlIIlII[5] = 3;
        e.lIIllIIlIIlII[6] = -(0xFFFFD21D & 0x3DF6) & (0xFFFFBBFF & 0x5F77);
        e.lIIllIIlIIlII[7] = -(0xFFFFBF0F & 0x6AFB) & (0xFFFFBF7B & Short.MAX_VALUE);
        e.lIIllIIlIIlII[8] = 0x26 ^ 0x78 ^ (0x39 ^ 0x63);
        e.lIIllIIlIIlII[9] = 0xCB ^ 0xC1 ^ 2;
    }

    private static boolean lIlIlllllIIlIll(int n) {
        return n == 0;
    }

    private TileObject A() {
        int[] nArray = new int[lIIllIIlIIlII[1]];
        nArray[e.lIIllIIlIIlII[0]] = lIIllIIlIIlII[3];
        return TileObjects.getNearest((int[])nArray);
    }

    private boolean a(TileObject tileObject) {
        return Reachable.isInteractable((Locatable)tileObject);
    }

    private static void lIlIlllllIIlIII() {
        lIIllIIlIIIll = new String[lIIllIIlIIlII[8]];
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[0]] = e."Pick";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[1]] = e."Pick-Fruit";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[4]] = e."Herbs";
        e.lIIllIIlIIIll[e.lIIllIIlIIlII[5]] = e."Pick";
    }

    public boolean run() {
        e var6;
        if (e.lIlIlllllIIlIlI(this.z() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        var6.y();
        TileObject var19 = var6.A();
        if (e.lIlIlllllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIIlIIlII[0];
        }
        if (!e.lIlIlllllIIllII(var19) || e.lIlIlllllIIlIll(var6.a(var19) ? 1 : 0)) {
            return Movement.walkTo((WorldPoint)v);
        }
        this.C();
        return lIIllIIlIIlII[1];
    }
}

