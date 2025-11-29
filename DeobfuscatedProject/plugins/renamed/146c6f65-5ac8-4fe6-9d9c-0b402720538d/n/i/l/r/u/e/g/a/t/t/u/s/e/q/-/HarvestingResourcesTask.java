/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Harvesting resources -> HarvestingresourcesTask */
@TaskDesc(name="Harvesting resources", priority=2, blocking=true)
public class HarvestingResourcesTask
extends n_Unknown {
    private static /* synthetic */ int[] llIIlllllIIl;
    private static /* synthetic */ String[] llIIllllIIlI;
    private final /* synthetic */ String[] bW;
    private final /* synthetic */ b bV;

    static {
        L.lIIIIIIIIlIIIII();
        L.lIIIIIIIIIlllll();
    }

    private static void lIIIIIIIIlIIIII() {
        llIIlllllIIl = new int[9];
        L.llIIlllllIIl[0] = 0x80 ^ 0xA5 ^ (0x9D ^ 0xBC);
        L.llIIlllllIIl[1] = 2 & (2 ^ -1);
        L.llIIlllllIIl[2] = 1;
        L.llIIlllllIIl[3] = 2;
        L.llIIlllllIIl[4] = 3;
        L.llIIlllllIIl[5] = 0xB9 ^ 0xAD;
        L.llIIlllllIIl[6] = 0x98 ^ 0x9D;
        L.llIIlllllIIl[7] = 0x30 ^ 0x36;
        L.llIIlllllIIl[8] = 0x77 ^ 0x7F;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        L var14;
        Player player = Players.getLocal();
        if (L.lIIIIIIIIlIIIIl(player)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIIlI(var14.ba.M(), llIIlllllIIl[5])) {
            return llIIlllllIIl[1];
        }
        Item var20 = var14.bC();
        if (L.lIIIIIIIIlIIIll(var20)) {
            var20.interact(llIIllllIIlI[llIIlllllIIl[0]]);
            return llIIlllllIIl[2];
        }
        if (L.lIIIIIIIIlIIlII(var14.ba.R() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(var14.bV.p() ? 1 : 0)) {
            return llIIlllllIIl[2];
        }
        Player var6 = Players.getLocal();
        GameObject var18 = var14.ba.U();
        if (L.lIIIIIIIIlIIIll(var18)) {
            void var21;
            if (L.lIIIIIIIIlIIIll(var6.getInteracting())) {
                var14.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            h var1 = var14.ba.V();
            if (L.lIIIIIIIIlIIIIl(var1)) {
                return llIIlllllIIl[1];
            }
            l var15 = var1.d(var18.getWorldLocation());
            if (L.lIIIIIIIIlIIIIl(var15)) {
                return llIIlllllIIl[1];
            }
            if (L.lIIIIIIIIlIIlIl(var15.e(var21.getWorldLocation()) ? 1 : 0)) {
                return var14.ba.a(var15, var21.getWorldLocation());
            }
            if (L.lIIIIIIIIlIIlII(var18.hasAction(var14.bW) ? 1 : 0)) {
                var18.interact(var14.bW);
                var14.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            Object[] objectArray = new Object[llIIlllllIIl[3]];
            objectArray[L.llIIlllllIIl[1]] = var18.getName();
            objectArray[L.llIIlllllIIl[2]] = var18.getActions();
            Log.info((String)llIIllllIIlI[llIIlllllIIl[6]], (Object[])objectArray);
            return llIIlllllIIl[1];
        }
        return llIIlllllIIl[1];
    }

    private static String lIIIIIIIIIIllII(String var3, String var28) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), llIIlllllIIl[8]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIIlllllIIl[3], var8);
            return new String(var22.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIIlIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public L(c c2, b b2) {
        d[] dArray = new d[llIIlllllIIl[0]];
        dArray[L.llIIlllllIIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[L.llIIlllllIIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[L.llIIlllllIIl[3]] = d.EXTRA_FOOD_EXPLORE;
        dArray[L.llIIlllllIIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        String[] stringArray = new String[llIIlllllIIl[0]];
        stringArray[L.llIIlllllIIl[1]] = llIIllllIIlI[llIIlllllIIl[1]];
        stringArray[L.llIIlllllIIl[2]] = llIIllllIIlI[llIIlllllIIl[2]];
        stringArray[L.llIIlllllIIl[3]] = llIIllllIIlI[llIIlllllIIl[3]];
        stringArray[L.llIIlllllIIl[4]] = llIIllllIIlI[llIIlllllIIl[4]];
        this.bW = stringArray;
        this.bV = b2;
    }

    private static boolean lIIIIIIIIlIlIII(int n2) {
        return n2 <= 0;
    }

    private static String lIIIIIIIIIIlIll(String var25, String var23) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIlllllIIl[3], var26);
            return new String(var9.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIIIlllll() {
        llIIllllIIlI = new String[llIIlllllIIl[7]];
        L.llIIllllIIlI[L.llIIlllllIIl[1]] = L."Chop";
        L.llIIllllIIlI[L.llIIlllllIIl[2]] = L."Mine";
        L.llIIllllIIlI[L.llIIlllllIIl[3]] = L."Fish";
        L.llIIllllIIlI[L.llIIlllllIIl[4]] = L."Pick";
        L.llIIllllIIlI[L.llIIlllllIIl[0]] = L."Drop";
        L.llIIllllIIlI[L.llIIlllllIIl[6]] = L."No action found for target: {}, available actions: {}";
    }

    private static boolean lIIIIIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static String lIIIIIIIIIllllI(String var13, String var11) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var5 = var11.toCharArray();
        int var2 = llIIlllllIIl[1];
        char[] var29 = var13.toCharArray();
        int var10 = var29.length;
        int var16 = llIIlllllIIl[1];
        while (L.lIIIIIIIIlIlIIl(var16, var10)) {
            char var24 = var29[var16];
            var19.append((char)(var24 ^ var5[var2 % var5.length]));
            0;
            ++var2;
            ++var16;
            0;
            if (-(0x5C ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean lIIIIIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean a(Item item, i i2) {
        return i2.ay().contains(item.getId());
    }

    private static boolean lIIIIIIIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private Item bC() {
        return Inventory.getFirst(item -> {
            boolean bl;
            void var12;
            Optional<i> lllllllllllllllIlIIIllllllIlIIlI2;
            L var17;
            if (L.lIIIIIIIIlIIlII(i.FISH.ay().contains(item.getId()) ? 1 : 0)) {
                if (!L.lIIIIIIIIlIIllI((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || L.lIIIIIIIIlIIlll(Inventory.getFreeSlots())) {
                    return llIIlllllIIl[1];
                }
                int lllllllllllllllIlIIIllllllIlIIlI2 = var17.ba.E().getOrDefault((Object)i.FISH, llIIlllllIIl[1]);
                if (L.lIIIIIIIIlIIllI((Object)var17.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && L.lIIIIIIIIlIIlll(lllllllllllllllIlIIIllllllIlIIlI2)) {
                    return llIIlllllIIl[1];
                }
            }
            if (L.lIIIIIIIIlIIlII((lllllllllllllllIlIIIllllllIlIIlI2 = Arrays.stream(i.values()).filter(arg_0 -> L.a((Item)var12, arg_0)).findFirst()).isEmpty() ? 1 : 0)) {
                return llIIlllllIIl[1];
            }
            int var4 = var17.ba.E().getOrDefault((Object)lllllllllllllllIlIIIllllllIlIIlI2.get(), llIIlllllIIl[1]);
            if (L.lIIIIIIIIlIlIII(var4)) {
                bl = llIIlllllIIl[2];
                0;
                if (((0xAC ^ 0xA9) & ~(2 ^ 7)) != 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl = llIIlllllIIl[1];
            }
            return bl;
        });
    }
}

