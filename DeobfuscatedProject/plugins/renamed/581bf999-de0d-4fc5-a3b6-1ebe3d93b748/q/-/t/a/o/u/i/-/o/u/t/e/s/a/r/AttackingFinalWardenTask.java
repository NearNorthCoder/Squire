/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bM_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.y_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

@Singleton
/* TASK: Attacking final warden -> AttackingfinalwardenTask */
@TaskDesc(name="Attacking final warden", priority=40)
public class AttackingFinalWardenTask
extends bM_Unknown {
    private final /* synthetic */ C gL;
    private static /* synthetic */ String[] llIllIIllll;
    private static /* synthetic */ int[] llIllIlIIII;
    private /* synthetic */ boolean gM;
    private final /* synthetic */ y gK;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        int n2;
        boolean bl2;
        void var14;
        bL var1;
        int[] nArray = new int[llIllIlIIII[1]];
        nArray[bL.llIllIlIIII[0]] = llIllIlIIII[2];
        nArray[bL.llIllIlIIII[3]] = llIllIlIIII[4];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (bL.lIlIlIIllIIlII(nPC)) {
            return llIllIlIIII[0];
        }
        if (bL.lIlIlIIllIIlIl(var1.cq() ? 1 : 0)) {
            if (bL.lIlIlIIllIIllI(var1.gM ? 1 : 0)) {
                var1.gM = llIllIlIIII[3];
                var1.gK.h(llIllIlIIII[0]);
            }
            if (bL.lIlIlIIllIIllI(var1.gL.as() ? 1 : 0)) {
                return llIllIlIIII[0];
            }
        }
        int n3 = var14.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());
        if (!bL.lIlIlIIllIIlIl(var1.cq() ? 1 : 0) || bL.lIlIlIIllIIlIl(n3)) {
            bl2 = llIllIlIIII[3];
            0;
            if (1 == 0) {
                return ((0x7D ^ 0x6C ^ (0x47 ^ 0x12)) & (4 ^ 0x1C ^ (8 ^ 0x54) ^ -1)) != 0;
            }
        } else {
            bl2 = llIllIlIIII[0];
        }
        boolean var13 = bl2;
        var1.a((NPC)var14, var13);
        0;
        var14.interact(llIllIIllll[llIllIlIIII[0]]);
        Item var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bL.lIlIlIIllIIlIl(var1.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[3];
            0;
            if (((0xB2 ^ 0xA2) & ~(0x8B ^ 0x9B)) == 2) {
                return false;
            }
        } else if (bL.lIlIlIIllIIlll(var3) && bL.lIlIlIIllIIlIl(var1.Q(var3) ? 1 : 0)) {
            n2 = llIllIlIIII[5];
            0;
            if (-2 >= 0) {
                return ((0xDA ^ 0xAE ^ (0xD9 ^ 0xA7)) & (0x70 ^ 0x13 ^ (8 ^ 0x61) ^ -1)) != 0;
            }
        } else {
            n2 = llIllIlIIII[6];
        }
        var1.sleep(n2);
        return llIllIlIIII[3];
    }

    private static void lIlIlIIllIIIlI() {
        llIllIIllll = new String[llIllIlIIII[5]];
        bL.llIllIIllll[bL.llIllIlIIII[0]] = bL."Attack";
        bL.llIllIIllll[bL.llIllIlIIII[3]] = bL."shadow";
        bL.llIllIIllll[bL.llIllIlIIII[1]] = bL."twisted bow";
        bL.llIllIIllll[bL.llIllIlIIII[6]] = bL."fang";
    }

    private static String lIlIlIIllIIIII(String var5, String var6) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIllIlIIII[8]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIllIlIIII[1], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIllIIlII(Object object) {
        return object == null;
    }

    static {
        bL.lIlIlIIllIIIll();
        bL.lIlIlIIllIIIlI();
    }

    private static boolean lIlIlIIllIIllI(int n2) {
        return n2 == 0;
    }

    private boolean Q(Item item) {
        int n2;
        String string = item.getName().toLowerCase();
        if (!bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[3]]) ? 1 : 0) || !bL.lIlIlIIllIIllI(string.contains(llIllIIllll[llIllIlIIII[1]]) ? 1 : 0) || bL.lIlIlIIllIIlIl(string.contains(llIllIIllll[llIllIlIIII[6]]) ? 1 : 0)) {
            n2 = llIllIlIIII[3];
            0;
            if (-1 >= 2) {
                return ((0x28 ^ 0x42 ^ (0x1E ^ 0x29)) & (0x65 ^ 0x25 ^ (0x70 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = llIllIlIIII[0];
        }
        return n2 != 0;
    }

    private static void lIlIlIIllIIIll() {
        llIllIlIIII = new int[9];
        bL.llIllIlIIII[0] = (0x3B ^ 0x27 ^ (0xAA ^ 0x83)) & (0xB3 ^ 0x92 ^ (0x14 ^ 0) ^ -1);
        bL.llIllIlIIII[1] = 2;
        bL.llIllIlIIII[2] = 0xFFFFBFFB & 0x6DF5;
        bL.llIllIlIIII[3] = 1;
        bL.llIllIlIIII[4] = 0xFFFFBFFF & 0x6DF2;
        bL.llIllIlIIII[5] = 0x5C ^ 0x58;
        bL.llIllIlIIII[6] = 3;
        bL.llIllIlIIII[7] = 0x95 ^ 0xA7;
        bL.llIllIlIIII[8] = 0x8E ^ 0xAE ^ (0x8F ^ 0xA7);
    }

    private static boolean lIlIlIIllIIlll(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.gM = llIllIlIIII[0];
    }

    private static String lIlIlIIllIIIIl(String var12, String var4) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIllIlIIII[1], var11);
            return new String(var7.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bL(Client client, z z2, TOAConfig tOAConfig, y y2, C c2) {
        super(client, z2, tOAConfig);
        this.gM = llIllIlIIII[0];
        this.gK = y2;
        this.gL = c2;
    }

    @Override
    public int bt() {
        int n2;
        if (bL.lIlIlIIllIIlIl(this.cq() ? 1 : 0)) {
            n2 = llIllIlIIII[7];
            0;
            
            }
        } else {
            n2 = llIllIlIIII[3];
        }
        return n2;
    }
}

