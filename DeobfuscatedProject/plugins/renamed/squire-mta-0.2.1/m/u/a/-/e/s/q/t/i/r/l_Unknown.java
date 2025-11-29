/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Player
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 *  net.runelite.client.ui.overlay.infobox.InfoBoxManager
 *  net.runelite.client.util.AsyncBufferedImage
 */
package m.u.a.-.e.s.q.t.i.r;

import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.CEnum;
import m.u.a.-.e.s.q.t.i.r.k_Unknown;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.AsyncBufferedImage;

@Singleton
public class l_Unknown
extends b {
    private static final /* synthetic */ int S;
    private static /* synthetic */ String[] lllIlIlIlIlI;
    private final /* synthetic */ SquireMTA U;
    static final /* synthetic */ int R;
    private final /* synthetic */ Client T;
    private static /* synthetic */ int[] lllIlIlIlIll;
    private /* synthetic */ int Y;
    private final /* synthetic */ InfoBoxManager W;
    private final /* synthetic */ List<String> X;
    private final /* synthetic */ ItemManager V;
    private /* synthetic */ k Z;

    @Subscribe
    public void a(GameTick gameTick) {
        if (l.lIIIllIIIIlIlII(this.c() ? 1 : 0) && l.lIIIllIIIIlIIlI((Object)this.Z)) {
            this.W.removeIf(infoBox -> infoBox instanceof k);
            this.Z = null;
        }
    }

    private static boolean lIIIllIIIIlIlII(int n2) {
        return n2 == 0;
    }

    @Inject
    private l(MagicArenaConfig magicArenaConfig, Client client, SquireMTA squireMTA, ItemManager itemManager, InfoBoxManager infoBoxManager) {
        super(magicArenaConfig);
        String[] stringArray = new String[lllIlIlIlIll[0]];
        stringArray[l.lllIlIlIlIll[1]] = lllIlIlIlIlI[lllIlIlIlIll[1]];
        stringArray[l.lllIlIlIlIll[2]] = lllIlIlIlIlI[lllIlIlIlIll[2]];
        this.X = Arrays.asList(stringArray);
        this.T = client;
        this.U = squireMTA;
        this.V = itemManager;
        this.W = infoBoxManager;
    }

    private int a(int n2) {
        switch (n2) {
            case 6904: {
                return lllIlIlIlIll[2];
            }
            case 6905: {
                return lllIlIlIlIll[0];
            }
            case 6906: {
                return lllIlIlIlIll[5];
            }
            case 6907: {
                return lllIlIlIlIll[6];
            }
        }
        return lllIlIlIlIll[1];
    }

    private static void lIIIllIIIIlIIIl() {
        lllIlIlIlIll = new int[8];
        l.lllIlIlIlIll[0] = 2;
        l.lllIlIlIlIll[1] = (0x58 ^ 0x47) & ~(0x37 ^ 0x28);
        l.lllIlIlIlIll[2] = 1;
        l.lllIlIlIlIll[3] = 0xFFFFB5F6 & 0x7E9F;
        l.lllIlIlIlIll[4] = -(0xFFFFEF47 & 0x74BF) & (0xFFFFFEFE & Short.MAX_VALUE);
        l.lllIlIlIlIll[5] = 3;
        l.lllIlIlIlIll[6] = 0x78 ^ 0x7C;
        l.lllIlIlIlIll[7] = 0x7A ^ 0x6A;
    }

    private static boolean lIIIllIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    protected int a(Item[] itemArray) {
        void var7;
        int n2 = lllIlIlIlIll[1];
        if (l.lIIIllIIIIlIllI(itemArray)) {
            void var23;
            return (int)var23;
        }
        void var2 = var7;
        int var6 = ((void)var2).length;
        int var17 = lllIlIlIlIll[1];
        while (l.lIIIllIIIIlIlll(var17, var6)) {
            l var24;
            void var9 = var2[var17];
            var23 += var24.a(var9.getId());
            ++var17;
            0;
            if ((0x56 ^ 0x52) == (0x29 ^ 0x2D)) continue;
            return (0x12 ^ 0x58) & ~(0xF3 ^ 0xB9);
        }
        return n2;
    }

    public List<String> o() {
        return this.X;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        l var13;
        void var3;
        if (l.lIIIllIIIIlIlII(this.c() ? 1 : 0)) {
            return;
        }
        ItemContainer var15 = var3.getItemContainer();
        if (l.lIIIllIIIIlIlIl(var15, var13.T.getItemContainer(InventoryID.INVENTORY))) {
            var13.Y = var13.a(var15.getItems());
            if (l.lIIIllIIIIlIllI((Object)var13.Z)) {
                AsyncBufferedImage var1 = var13.V.getImage(lllIlIlIlIll[4]);
                var13.Z = new k((BufferedImage)var1, (Plugin)var13.U);
                var13.W.addInfoBox((InfoBox)var13.Z);
            }
            var13.Z.setCount(var13.Y);
        }
    }

    private static String lIIIllIIIIIllIl(String var21, String var8) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var4 = var8.toCharArray();
        int var18 = lllIlIlIlIll[1];
        char[] var5 = var21.toCharArray();
        int var20 = var5.length;
        int var12 = lllIlIlIlIll[1];
        while (l.lIIIllIIIIlIlll(var12, var20)) {
            char var22 = var5[var12];
            var11.append((char)(var22 ^ var4[var18 % var4.length]));
            0;
            ++var18;
            ++var12;
            0;
            if (2 > ((0x22 ^ 0x28) & ~(0x66 ^ 0x6C))) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    @Override
    public c d() {
        return c.GRAVEYARD;
    }

    private static boolean lIIIllIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        l.lIIIllIIIIlIIIl();
        l.lIIIllIIIIlIIII();
        S = lllIlIlIlIll[3];
        R = lllIlIlIlIll[7];
    }

    private static boolean lIIIllIIIIlIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean c() {
        int n2;
        Player player = this.T.getLocalPlayer();
        if (l.lIIIllIIIIlIIlI(player) && l.lIIIllIIIIlIIll(player.getWorldLocation().getRegionID(), lllIlIlIlIll[3]) && l.lIIIllIIIIlIIll(player.getWorldLocation().getPlane(), lllIlIlIlIll[2])) {
            n2 = lllIlIlIlIll[2];
            0;
            if ((0x73 ^ 0x77) == 0) {
                return false;
            }
        } else {
            n2 = lllIlIlIlIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIllIIIIlIIlI(Object object) {
        return object != null;
    }

    private static String lIIIllIIIIIlllI(String var14, String var25) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lllIlIlIlIll[0], var10);
            return new String(var16.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    public int B() {
        return this.Y;
    }

    private static void lIIIllIIIIlIIII() {
        lllIlIlIlIlI = new String[lllIlIlIlIll[0]];
        l.lllIlIlIlIlI[l.lllIlIlIlIll[1]] = l."Mud battlestaff";
        l.lllIlIlIlIlI[l.lllIlIlIlIll[2]] = l."Mystic mud staff";
    }
}

